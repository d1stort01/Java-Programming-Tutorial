class TicketPool {
    private int nextRow = 1;
    private char nextCol = 'A';
    private static final char[] COLS = {'A','B','C','D','E','F'};

    public synchronized String sell() {
        if (nextRow > 100) {
            return null;
        }
        String seat = nextRow + String.valueOf(nextCol);
        int idx = nextCol - 'A';
        if (idx == COLS.length - 1) {
            nextRow++;
            nextCol = 'A';
        } else {
            nextCol = COLS[idx + 1];
        }
        return seat;
    }
}

class WindowTask implements Runnable {
    private final TicketPool pool;
    private final int winId;

    public WindowTask(TicketPool pool, int winId) {
        this.pool = pool;
        this.winId = winId;
    }

    @Override
    public void run() {
        while (true) {
            String seat;
            synchronized (pool) {
                seat = pool.sell();
                try { Thread.sleep(10); } catch (InterruptedException ignore) {}
            }
            if (seat == null) {
                break;
            }
            System.out.println("窗口" + winId + "售出" + seat + "号票");
        }
    }
}

public class SellTicket {
    public static void main(String[] args) throws InterruptedException {
        TicketPool pool = new TicketPool();
        Thread w1 = new Thread(new WindowTask(pool, 1), "W1");
        Thread w2 = new Thread(new WindowTask(pool, 2), "W2");
        Thread w3 = new Thread(new WindowTask(pool, 3), "W3");

        w1.start();
        w2.start();
        w3.start();

        System.out.println("所有票已售完！");
    }
}