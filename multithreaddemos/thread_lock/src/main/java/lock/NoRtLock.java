package lock;

class NoRtLock implements SelfDefineLock {
    //	private volatile boolean locked = false;
    private boolean isLocked = false;
    public synchronized void lock(){
        while(isLocked){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isLocked = true;
    }
    public synchronized void unlock(){
        isLocked = false;
        notify();
    }
}
