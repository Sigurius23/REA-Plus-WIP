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
public final class UserProfile implements UserProfileIF {
    private final BiologicalSex biologicalSex;
    private final long birthday;
    private final FitnessLevel fitnessLevel;
    private final double height;

    /* JADX INFO: renamed from: id */
    private final int f23470id;
    private final double maxHeartRate;
    private final double restingHeartRate;
    private final double weight;

    public static final class Builder {
        private static final long INIT_BIT_BIOLOGICAL_SEX = 4;
        private static final long INIT_BIT_BIRTHDAY = 2;
        private static final long INIT_BIT_FITNESS_LEVEL = 8;
        private static final long INIT_BIT_HEIGHT = 16;
        private static final long INIT_BIT_ID = 1;
        private static final long INIT_BIT_MAX_HEART_RATE = 128;
        private static final long INIT_BIT_RESTING_HEART_RATE = 64;
        private static final long INIT_BIT_WEIGHT = 32;
        private BiologicalSex biologicalSex;
        private long birthday;
        private FitnessLevel fitnessLevel;
        private double height;

        /* JADX INFO: renamed from: id */
        private int f23471id;
        private long initBits;
        private double maxHeartRate;
        private double restingHeartRate;
        private double weight;

        private boolean biologicalSexIsSet() {
            return (this.initBits & INIT_BIT_BIOLOGICAL_SEX) == 0;
        }

        private boolean birthdayIsSet() {
            return (this.initBits & INIT_BIT_BIRTHDAY) == 0;
        }

        private void checkRequiredAttributes() {
            if (this.initBits != 0) {
                throw new InvalidImmutableStateException(formatRequiredAttributesMessage());
            }
        }

        private boolean fitnessLevelIsSet() {
            return (this.initBits & INIT_BIT_FITNESS_LEVEL) == 0;
        }

        private String formatRequiredAttributesMessage() {
            ArrayList arrayList = new ArrayList();
            if (!idIsSet()) {
                arrayList.add("id");
            }
            if (!birthdayIsSet()) {
                arrayList.add("birthday");
            }
            if (!biologicalSexIsSet()) {
                arrayList.add("biologicalSex");
            }
            if (!fitnessLevelIsSet()) {
                arrayList.add("fitnessLevel");
            }
            if (!heightIsSet()) {
                arrayList.add("height");
            }
            if (!weightIsSet()) {
                arrayList.add("weight");
            }
            if (!restingHeartRateIsSet()) {
                arrayList.add("restingHeartRate");
            }
            if (!maxHeartRateIsSet()) {
                arrayList.add("maxHeartRate");
            }
            return "Cannot build UserProfile, some of required attributes are not set " + arrayList;
        }

        private boolean heightIsSet() {
            return (this.initBits & INIT_BIT_HEIGHT) == 0;
        }

        private boolean idIsSet() {
            return (this.initBits & 1) == 0;
        }

        private boolean maxHeartRateIsSet() {
            return (this.initBits & INIT_BIT_MAX_HEART_RATE) == 0;
        }

        private boolean restingHeartRateIsSet() {
            return (this.initBits & INIT_BIT_RESTING_HEART_RATE) == 0;
        }

        private boolean weightIsSet() {
            return (this.initBits & INIT_BIT_WEIGHT) == 0;
        }

        public UserProfile build() {
            checkRequiredAttributes();
            return new UserProfile(this.f23471id, this.birthday, this.biologicalSex, this.fitnessLevel, this.height, this.weight, this.restingHeartRate, this.maxHeartRate);
        }

        public final Builder from(UserProfileIF userProfileIF) {
            Objects.requireNonNull(userProfileIF, "instance");
            setId(userProfileIF.getId());
            setBirthday(userProfileIF.getBirthday());
            setBiologicalSex(userProfileIF.getBiologicalSex());
            setFitnessLevel(userProfileIF.getFitnessLevel());
            setHeight(userProfileIF.getHeight());
            setWeight(userProfileIF.getWeight());
            setRestingHeartRate(userProfileIF.getRestingHeartRate());
            setMaxHeartRate(userProfileIF.getMaxHeartRate());
            return this;
        }

        public final Builder setBiologicalSex(BiologicalSex biologicalSex) {
            Objects.requireNonNull(biologicalSex, "biologicalSex");
            this.biologicalSex = biologicalSex;
            this.initBits &= -5;
            return this;
        }

        public final Builder setBirthday(long j7) {
            this.birthday = j7;
            this.initBits &= -3;
            return this;
        }

        public final Builder setFitnessLevel(FitnessLevel fitnessLevel) {
            Objects.requireNonNull(fitnessLevel, "fitnessLevel");
            this.fitnessLevel = fitnessLevel;
            this.initBits &= -9;
            return this;
        }

        public final Builder setHeight(double d3) {
            this.height = d3;
            this.initBits &= -17;
            return this;
        }

        public final Builder setId(int i13) {
            this.f23471id = i13;
            this.initBits &= -2;
            return this;
        }

        public final Builder setMaxHeartRate(double d3) {
            this.maxHeartRate = d3;
            this.initBits &= -129;
            return this;
        }

        public final Builder setRestingHeartRate(double d3) {
            this.restingHeartRate = d3;
            this.initBits &= -65;
            return this;
        }

        public final Builder setWeight(double d3) {
            this.weight = d3;
            this.initBits &= -33;
            return this;
        }

        private Builder() {
            this.initBits = 255L;
        }
    }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
    @Deprecated
    public static final class Json implements UserProfileIF {
        BiologicalSex biologicalSex;
        long birthday;
        boolean birthdayIsSet;
        FitnessLevel fitnessLevel;
        double height;
        boolean heightIsSet;

        /* JADX INFO: renamed from: id */
        int f23472id;
        boolean idIsSet;
        double maxHeartRate;
        boolean maxHeartRateIsSet;
        double restingHeartRate;
        boolean restingHeartRateIsSet;
        double weight;
        boolean weightIsSet;

        @Override // com.whoop.analytics.strain.model.UserProfileIF
        public BiologicalSex getBiologicalSex() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.UserProfileIF
        public long getBirthday() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.UserProfileIF
        public FitnessLevel getFitnessLevel() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.UserProfileIF
        public double getHeight() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.UserProfileIF
        public int getId() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.UserProfileIF
        public double getMaxHeartRate() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.UserProfileIF
        public double getRestingHeartRate() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.UserProfileIF
        public double getWeight() {
            throw new UnsupportedOperationException();
        }

        @JsonProperty
        public void setBiologicalSex(BiologicalSex biologicalSex) {
            this.biologicalSex = biologicalSex;
        }

        @JsonProperty
        public void setBirthday(long j7) {
            this.birthday = j7;
            this.birthdayIsSet = true;
        }

        @JsonProperty
        public void setFitnessLevel(FitnessLevel fitnessLevel) {
            this.fitnessLevel = fitnessLevel;
        }

        @JsonProperty
        public void setHeight(double d3) {
            this.height = d3;
            this.heightIsSet = true;
        }

        @JsonProperty
        public void setId(int i13) {
            this.f23472id = i13;
            this.idIsSet = true;
        }

        @JsonProperty
        public void setMaxHeartRate(double d3) {
            this.maxHeartRate = d3;
            this.maxHeartRateIsSet = true;
        }

        @JsonProperty
        public void setRestingHeartRate(double d3) {
            this.restingHeartRate = d3;
            this.restingHeartRateIsSet = true;
        }

        @JsonProperty
        public void setWeight(double d3) {
            this.weight = d3;
            this.weightIsSet = true;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserProfile copyOf(UserProfileIF userProfileIF) {
        return userProfileIF instanceof UserProfile ? (UserProfile) userProfileIF : builder().from(userProfileIF).build();
    }

    private boolean equalTo(UserProfile userProfile) {
        return this.f23470id == userProfile.f23470id && this.birthday == userProfile.birthday && this.biologicalSex.equals(userProfile.biologicalSex) && this.fitnessLevel.equals(userProfile.fitnessLevel) && Double.doubleToLongBits(this.height) == Double.doubleToLongBits(userProfile.height) && Double.doubleToLongBits(this.weight) == Double.doubleToLongBits(userProfile.weight) && Double.doubleToLongBits(this.restingHeartRate) == Double.doubleToLongBits(userProfile.restingHeartRate) && Double.doubleToLongBits(this.maxHeartRate) == Double.doubleToLongBits(userProfile.maxHeartRate);
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    @Deprecated
    public static UserProfile fromJson(Json json) {
        Builder builder = builder();
        if (json.idIsSet) {
            builder.setId(json.f23472id);
        }
        if (json.birthdayIsSet) {
            builder.setBirthday(json.birthday);
        }
        BiologicalSex biologicalSex = json.biologicalSex;
        if (biologicalSex != null) {
            builder.setBiologicalSex(biologicalSex);
        }
        FitnessLevel fitnessLevel = json.fitnessLevel;
        if (fitnessLevel != null) {
            builder.setFitnessLevel(fitnessLevel);
        }
        if (json.heightIsSet) {
            builder.setHeight(json.height);
        }
        if (json.weightIsSet) {
            builder.setWeight(json.weight);
        }
        if (json.restingHeartRateIsSet) {
            builder.setRestingHeartRate(json.restingHeartRate);
        }
        if (json.maxHeartRateIsSet) {
            builder.setMaxHeartRate(json.maxHeartRate);
        }
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserProfile) && equalTo((UserProfile) obj);
    }

    @Override // com.whoop.analytics.strain.model.UserProfileIF
    @JsonProperty
    public BiologicalSex getBiologicalSex() {
        return this.biologicalSex;
    }

    @Override // com.whoop.analytics.strain.model.UserProfileIF
    @JsonProperty
    public long getBirthday() {
        return this.birthday;
    }

    @Override // com.whoop.analytics.strain.model.UserProfileIF
    @JsonProperty
    public FitnessLevel getFitnessLevel() {
        return this.fitnessLevel;
    }

    @Override // com.whoop.analytics.strain.model.UserProfileIF
    @JsonProperty
    public double getHeight() {
        return this.height;
    }

    @Override // com.whoop.analytics.strain.model.UserProfileIF
    @JsonProperty
    public int getId() {
        return this.f23470id;
    }

    @Override // com.whoop.analytics.strain.model.UserProfileIF
    @JsonProperty
    public double getMaxHeartRate() {
        return this.maxHeartRate;
    }

    @Override // com.whoop.analytics.strain.model.UserProfileIF
    @JsonProperty
    public double getRestingHeartRate() {
        return this.restingHeartRate;
    }

    @Override // com.whoop.analytics.strain.model.UserProfileIF
    @JsonProperty
    public double getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int i13 = this.f23470id + 177573;
        int iHashCode = Long.hashCode(this.birthday) + (i13 << 5) + i13;
        int iHashCode2 = this.biologicalSex.hashCode() + (iHashCode << 5) + iHashCode;
        int iHashCode3 = this.fitnessLevel.hashCode() + (iHashCode2 << 5) + iHashCode2;
        int iHashCode4 = Double.hashCode(this.height) + (iHashCode3 << 5) + iHashCode3;
        int iHashCode5 = Double.hashCode(this.weight) + (iHashCode4 << 5) + iHashCode4;
        int iHashCode6 = Double.hashCode(this.restingHeartRate) + (iHashCode5 << 5) + iHashCode5;
        return Double.hashCode(this.maxHeartRate) + (iHashCode6 << 5) + iHashCode6;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("UserProfile{id=");
        sb4.append(this.f23470id);
        sb4.append(", birthday=");
        sb4.append(this.birthday);
        sb4.append(", biologicalSex=");
        sb4.append(this.biologicalSex);
        sb4.append(", fitnessLevel=");
        sb4.append(this.fitnessLevel);
        sb4.append(", height=");
        sb4.append(this.height);
        sb4.append(", weight=");
        sb4.append(this.weight);
        sb4.append(", restingHeartRate=");
        sb4.append(this.restingHeartRate);
        sb4.append(", maxHeartRate=");
        return AbstractC30007c.m91836f(this.maxHeartRate, "}", sb4);
    }

    public final UserProfile withBiologicalSex(BiologicalSex biologicalSex) {
        if (this.biologicalSex == biologicalSex) {
            return this;
        }
        Objects.requireNonNull(biologicalSex, "biologicalSex");
        return new UserProfile(this.f23470id, this.birthday, biologicalSex, this.fitnessLevel, this.height, this.weight, this.restingHeartRate, this.maxHeartRate);
    }

    public final UserProfile withBirthday(long j7) {
        return this.birthday == j7 ? this : new UserProfile(this.f23470id, j7, this.biologicalSex, this.fitnessLevel, this.height, this.weight, this.restingHeartRate, this.maxHeartRate);
    }

    public final UserProfile withFitnessLevel(FitnessLevel fitnessLevel) {
        if (this.fitnessLevel == fitnessLevel) {
            return this;
        }
        Objects.requireNonNull(fitnessLevel, "fitnessLevel");
        return new UserProfile(this.f23470id, this.birthday, this.biologicalSex, fitnessLevel, this.height, this.weight, this.restingHeartRate, this.maxHeartRate);
    }

    public final UserProfile withHeight(double d3) {
        return Double.doubleToLongBits(this.height) == Double.doubleToLongBits(d3) ? this : new UserProfile(this.f23470id, this.birthday, this.biologicalSex, this.fitnessLevel, d3, this.weight, this.restingHeartRate, this.maxHeartRate);
    }

    public final UserProfile withId(int i13) {
        return this.f23470id == i13 ? this : new UserProfile(i13, this.birthday, this.biologicalSex, this.fitnessLevel, this.height, this.weight, this.restingHeartRate, this.maxHeartRate);
    }

    public final UserProfile withMaxHeartRate(double d3) {
        return Double.doubleToLongBits(this.maxHeartRate) == Double.doubleToLongBits(d3) ? this : new UserProfile(this.f23470id, this.birthday, this.biologicalSex, this.fitnessLevel, this.height, this.weight, this.restingHeartRate, d3);
    }

    public final UserProfile withRestingHeartRate(double d3) {
        return Double.doubleToLongBits(this.restingHeartRate) == Double.doubleToLongBits(d3) ? this : new UserProfile(this.f23470id, this.birthday, this.biologicalSex, this.fitnessLevel, this.height, this.weight, d3, this.maxHeartRate);
    }

    public final UserProfile withWeight(double d3) {
        return Double.doubleToLongBits(this.weight) == Double.doubleToLongBits(d3) ? this : new UserProfile(this.f23470id, this.birthday, this.biologicalSex, this.fitnessLevel, this.height, d3, this.restingHeartRate, this.maxHeartRate);
    }

    private UserProfile(int i13, long j7, BiologicalSex biologicalSex, FitnessLevel fitnessLevel, double d3, double d14, double d15, double d16) {
        this.f23470id = i13;
        this.birthday = j7;
        this.biologicalSex = biologicalSex;
        this.fitnessLevel = fitnessLevel;
        this.height = d3;
        this.weight = d14;
        this.restingHeartRate = d15;
        this.maxHeartRate = d16;
    }
}
