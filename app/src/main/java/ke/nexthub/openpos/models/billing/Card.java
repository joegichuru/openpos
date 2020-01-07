package ke.nexthub.openpos.models.billing;

import java.io.Serializable;

/**
 * Represents a single debit or credit card
 * @AUTHOR Joseph
 */
public class Card implements Serializable {
    private String pan;
    private String exp;
    private String cvv2;
    private String holderName;

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
}
