package OOPTask;

public class Door implements Handle, Lock {

    private boolean isDoorLocked;
    private boolean isDoorClosed;

    @Override
    public void openDoor() {
        if (isDoorClosed()) {
            if (!isDoorLocked) {
                setDoorClosed(false);
                //opens the door
            }
            //door is locked
        }
        //door is already open
    }

    @Override
    public void closeDoor() {
        if (!isDoorClosed()) {
            setDoorClosed(true);
            // close door
        }
    }

    @Override
    public void lockDoor() {
        if (isDoorClosed()) {
            if (!isDoorLocked()) {
                setDoorLocked(true);
                //lock the door
            }
            //door is already locked
        }
        //door is open
    }

    @Override
    public void unlockDoor() {
        if (isDoorClosed()) {
            if (isDoorLocked()) {
                setDoorLocked(false);
                //unlock the door
            }
            //door is already unlocked
        }
        //door is already open
    }

    public boolean isDoorLocked() {
        return isDoorLocked;
    }

    public void setDoorLocked(boolean doorLocked) {
        isDoorLocked = doorLocked;
    }

    public boolean isDoorClosed() {
        return isDoorClosed;
    }

    public void setDoorClosed(boolean doorClosed) {
        isDoorClosed = doorClosed;
    }
}
