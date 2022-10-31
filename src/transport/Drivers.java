package transport;

import java.util.Objects;

public class Drivers {
    public final String FIO;
    public boolean isHaveDriveLicense;
    public int experience;

    public Drivers(String FIO, boolean isHaveDriveLicense, int experience) {
        this.FIO = ValidationUtil.valOrDefString(FIO, "noname");
        setHaveDriveLicense(isHaveDriveLicense);
        setExperience(experience);
    }

    public void setHaveDriveLicense(boolean haveDriveLicense) {
        isHaveDriveLicense = haveDriveLicense;
    }

    public void setExperience(int experience) {
        this.experience = ValidationUtil.valOrDefInt(experience, 0);
    }


    public void startRace() {

    }

    public void stopRace() {

    }

    public String getFIO() {
        return FIO;
    }

    public boolean isHaveDriveLicense() {
        return isHaveDriveLicense;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drivers)) return false;
        Drivers drivers = (Drivers) o;
        return isHaveDriveLicense() == drivers.isHaveDriveLicense() && getExperience() == drivers.getExperience() && getFIO().equals(drivers.getFIO());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFIO(), isHaveDriveLicense(), getExperience());
    }
}
