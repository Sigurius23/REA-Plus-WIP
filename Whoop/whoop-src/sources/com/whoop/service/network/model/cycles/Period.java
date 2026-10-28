package com.whoop.service.network.model.cycles;

import java.io.Serializable;
import java.util.Objects;
import or2.AbstractC28184n0;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public class Period implements Serializable {
    private String lower;
    private transient DateTime lowerDateTime;
    private String upper;
    private transient DateTime upperDateTime;

    public Period() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Period period = (Period) obj;
            if (Objects.equals(getLower(), period.getLower()) && Objects.equals(getUpper(), period.getUpper())) {
                return true;
            }
        }
        return false;
    }

    public long getLength() {
        return getUpper().getMillis() - getLower().getMillis();
    }

    public DateTime getLower() {
        if (this.lowerDateTime == null) {
            this.lowerDateTime = DateTime.parse(this.lower);
        }
        return this.lowerDateTime;
    }

    public DateTime getUpper() {
        if (this.upperDateTime == null) {
            this.upperDateTime = DateTime.parse(this.upper);
        }
        return this.upperDateTime;
    }

    public DateTime getUpperNullable() {
        if (this.upperDateTime == null && this.upper == null) {
            return null;
        }
        return getUpper();
    }

    public boolean hasValidLower() {
        return this.lower != null;
    }

    public boolean hasValidUpper() {
        String str = this.upper;
        return (str == null || str.isEmpty()) ? false : true;
    }

    public int hashCode() {
        return Objects.hash(getLower(), getUpper());
    }

    public String toString() {
        return "Period{lower='" + this.lower + "', lowerDateTime=" + this.lowerDateTime + ", upper='" + this.upper + "', upperDateTime=" + this.upperDateTime + '}';
    }

    public Period(String str, String str2) {
        this.lower = str;
        this.upper = str2;
    }

    public Period(DateTime dateTime, DateTime dateTime2) {
        this.lowerDateTime = dateTime;
        this.upperDateTime = dateTime2;
        this.lower = AbstractC28184n0.m85304b(dateTime);
        this.upper = AbstractC28184n0.m85304b(dateTime2);
    }
}
