package de.vepexlegit.deathcoordinatesdebug;

public enum DeathCoordinates {
    INSTANCE;

    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
