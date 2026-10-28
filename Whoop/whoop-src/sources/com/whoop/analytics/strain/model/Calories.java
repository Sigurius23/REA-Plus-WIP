package com.whoop.analytics.strain.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hubspot.immutables.validation.InvalidImmutableStateException;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Objects;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes7.dex */
@SuppressFBWarnings
public final class Calories implements CaloriesIF {
    private final double totalKilocalories;
    private final double totalKilojoules;

    public static final class Builder {
        private static final long INIT_BIT_TOTAL_KILOCALORIES = 1;
        private static final long INIT_BIT_TOTAL_KILOJOULES = 2;
        private long initBits;
        private double totalKilocalories;
        private double totalKilojoules;

        private void checkRequiredAttributes() {
            if (this.initBits != 0) {
                throw new InvalidImmutableStateException(formatRequiredAttributesMessage());
            }
        }

        private String formatRequiredAttributesMessage() {
            ArrayList arrayList = new ArrayList();
            if (!totalKilocaloriesIsSet()) {
                arrayList.add("totalKilocalories");
            }
            if (!totalKilojoulesIsSet()) {
                arrayList.add("totalKilojoules");
            }
            return "Cannot build Calories, some of required attributes are not set " + arrayList;
        }

        private boolean totalKilocaloriesIsSet() {
            return (this.initBits & 1) == 0;
        }

        private boolean totalKilojoulesIsSet() {
            return (this.initBits & INIT_BIT_TOTAL_KILOJOULES) == 0;
        }

        public Calories build() {
            checkRequiredAttributes();
            return new Calories(this.totalKilocalories, this.totalKilojoules);
        }

        public final Builder from(CaloriesIF caloriesIF) {
            Objects.requireNonNull(caloriesIF, "instance");
            setTotalKilocalories(caloriesIF.getTotalKilocalories());
            setTotalKilojoules(caloriesIF.getTotalKilojoules());
            return this;
        }

        public final Builder setTotalKilocalories(double d3) {
            this.totalKilocalories = d3;
            this.initBits &= -2;
            return this;
        }

        public final Builder setTotalKilojoules(double d3) {
            this.totalKilojoules = d3;
            this.initBits &= -3;
            return this;
        }

        private Builder() {
            this.initBits = 3L;
        }
    }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
    @Deprecated
    public static final class Json implements CaloriesIF {
        double totalKilocalories;
        boolean totalKilocaloriesIsSet;
        double totalKilojoules;
        boolean totalKilojoulesIsSet;

        @Override // com.whoop.analytics.strain.model.CaloriesIF
        public double getTotalKilocalories() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.CaloriesIF
        public double getTotalKilojoules() {
            throw new UnsupportedOperationException();
        }

        @JsonProperty
        public void setTotalKilocalories(double d3) {
            this.totalKilocalories = d3;
            this.totalKilocaloriesIsSet = true;
        }

        @JsonProperty
        public void setTotalKilojoules(double d3) {
            this.totalKilojoules = d3;
            this.totalKilojoulesIsSet = true;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Calories copyOf(CaloriesIF caloriesIF) {
        return caloriesIF instanceof Calories ? (Calories) caloriesIF : builder().from(caloriesIF).build();
    }

    private boolean equalTo(Calories calories) {
        return Double.doubleToLongBits(this.totalKilocalories) == Double.doubleToLongBits(calories.totalKilocalories) && Double.doubleToLongBits(this.totalKilojoules) == Double.doubleToLongBits(calories.totalKilojoules);
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    @Deprecated
    public static Calories fromJson(Json json) {
        Builder builder = builder();
        if (json.totalKilocaloriesIsSet) {
            builder.setTotalKilocalories(json.totalKilocalories);
        }
        if (json.totalKilojoulesIsSet) {
            builder.setTotalKilojoules(json.totalKilojoules);
        }
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Calories) && equalTo((Calories) obj);
    }

    @Override // com.whoop.analytics.strain.model.CaloriesIF
    @JsonProperty
    public double getTotalKilocalories() {
        return this.totalKilocalories;
    }

    @Override // com.whoop.analytics.strain.model.CaloriesIF
    @JsonProperty
    public double getTotalKilojoules() {
        return this.totalKilojoules;
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.totalKilocalories) + 177573;
        return Double.hashCode(this.totalKilojoules) + (iHashCode << 5) + iHashCode;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("Calories{totalKilocalories=");
        sb4.append(this.totalKilocalories);
        sb4.append(", totalKilojoules=");
        return AbstractC30007c.m91836f(this.totalKilojoules, "}", sb4);
    }

    public final Calories withTotalKilocalories(double d3) {
        return Double.doubleToLongBits(this.totalKilocalories) == Double.doubleToLongBits(d3) ? this : new Calories(d3, this.totalKilojoules);
    }

    public final Calories withTotalKilojoules(double d3) {
        return Double.doubleToLongBits(this.totalKilojoules) == Double.doubleToLongBits(d3) ? this : new Calories(this.totalKilocalories, d3);
    }

    private Calories(double d3, double d14) {
        this.totalKilocalories = d3;
        this.totalKilojoules = d14;
    }
}
