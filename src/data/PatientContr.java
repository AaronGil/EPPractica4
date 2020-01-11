package data;

import java.math.BigDecimal;

final public class PatientContr {
    private final BigDecimal contribution;

    public PatientContr (BigDecimal contrib){
        this.contribution = contrib;
    }

    public BigDecimal getContr() throws Exception{
        if(contribution.compareTo(BigDecimal.valueOf(0.0)) < 0 || contribution.compareTo(BigDecimal.valueOf(100.00)) > 0)
            throw new Exception("Error. Wrong contribution, the value must be between 0.00 and 100.00");

        return contribution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PatientContr contr = (PatientContr) o;
        return contribution.equals(contr.contribution);
    }

    @Override
    public int hashCode() { return contribution.hashCode(); }

    @Override
    public String toString() {
        return "Patient contribution{" + "Contribution: '" + contribution.toString() + '\'' + '}';
    }
}
