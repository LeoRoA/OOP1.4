package lists.Persons;

import lists.Transport.ValidationUtil;

import java.util.Objects;

public class Sponsor {
    public final String name;
    public final double sponsorshipAmount;
    public final boolean physical;

    public Sponsor(String name, float sponsorshipAmount, boolean physical) {
        this.name = ValidationUtil.valOrDefString(name, "noName");
        this.sponsorshipAmount = ValidationUtil.valOrDefDouble(sponsorshipAmount,10000);
        this.physical = physical;
    }

    public void toSponsorRace(){
        System.out.println(name + " проспонсировал заезад на сумму " + (sponsorshipAmount*0.2));
    }


    public String getName() {
        return name;
    }

    public double getSponsorshipAmount() {
        return sponsorshipAmount;
    }

    public boolean isPhysical() {
        return physical;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sponsor)) return false;
        Sponsor sponsor = (Sponsor) o;
        return Double.compare(sponsor.getSponsorshipAmount(), getSponsorshipAmount()) == 0 && isPhysical() == sponsor.isPhysical() && Objects.equals(getName(), sponsor.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSponsorshipAmount(), isPhysical());
    }
    public String toString() {
        return "Спонсор " + name + (physical ? " физическое лицо" : " юридическое лицо") +
                " владеет следующим спонсорским капиталом: " + sponsorshipAmount;
    }
}
