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
public final class HeartRateTimestamp implements HeartRateTimestampIF {
    private final double heartRate;
    private final long time;

    public static final class Builder {
        private static final long INIT_BIT_HEART_RATE = 2;
        private static final long INIT_BIT_TIME = 1;
        private double heartRate;
        private long initBits;
        private long time;

        private void checkRequiredAttributes() {
            if (this.initBits != 0) {
                throw new InvalidImmutableStateException(formatRequiredAttributesMessage());
            }
        }

        private String formatRequiredAttributesMessage() {
            ArrayList arrayList = new ArrayList();
            if (!timeIsSet()) {
                arrayList.add("time");
            }
            if (!heartRateIsSet()) {
                arrayList.add("heartRate");
            }
            return "Cannot build HeartRateTimestamp, some of required attributes are not set " + arrayList;
        }

        private boolean heartRateIsSet() {
            return (this.initBits & INIT_BIT_HEART_RATE) == 0;
        }

        private boolean timeIsSet() {
            return (this.initBits & 1) == 0;
        }

        public HeartRateTimestamp build() {
            checkRequiredAttributes();
            return new HeartRateTimestamp(this.time, this.heartRate);
        }

        public final Builder from(BaseHeartRateTimestamp baseHeartRateTimestamp) {
            Objects.requireNonNull(baseHeartRateTimestamp, "instance");
            from((Object) baseHeartRateTimestamp);
            return this;
        }

        public final Builder setHeartRate(double d3) {
            this.heartRate = d3;
            this.initBits &= -3;
            return this;
        }

        public final Builder setTime(long j7) {
            this.time = j7;
            this.initBits &= -2;
            return this;
        }

        private Builder() {
            this.initBits = 3L;
        }

        public final Builder from(HeartRateTimestampIF heartRateTimestampIF) {
            Objects.requireNonNull(heartRateTimestampIF, "instance");
            from((Object) heartRateTimestampIF);
            return this;
        }

        private void from(Object obj) {
            if (obj instanceof BaseHeartRateTimestamp) {
                BaseHeartRateTimestamp baseHeartRateTimestamp = (BaseHeartRateTimestamp) obj;
                setHeartRate(baseHeartRateTimestamp.getHeartRate());
                setTime(baseHeartRateTimestamp.getTime());
            }
        }
    }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
    @Deprecated
    public static final class Json implements HeartRateTimestampIF {
        double heartRate;
        boolean heartRateIsSet;
        long time;
        boolean timeIsSet;

        @Override // com.whoop.analytics.strain.model.BaseHeartRateTimestamp
        public double getHeartRate() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.BaseHeartRateTimestamp
        public long getTime() {
            throw new UnsupportedOperationException();
        }

        @JsonProperty("heart_rate")
        public void setHeartRate(double d3) {
            this.heartRate = d3;
            this.heartRateIsSet = true;
        }

        @JsonProperty
        public void setTime(long j7) {
            this.time = j7;
            this.timeIsSet = true;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HeartRateTimestamp copyOf(HeartRateTimestampIF heartRateTimestampIF) {
        return heartRateTimestampIF instanceof HeartRateTimestamp ? (HeartRateTimestamp) heartRateTimestampIF : builder().from(heartRateTimestampIF).build();
    }

    private boolean equalTo(HeartRateTimestamp heartRateTimestamp) {
        return this.time == heartRateTimestamp.time && Double.doubleToLongBits(this.heartRate) == Double.doubleToLongBits(heartRateTimestamp.heartRate);
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    @Deprecated
    public static HeartRateTimestamp fromJson(Json json) {
        Builder builder = builder();
        if (json.timeIsSet) {
            builder.setTime(json.time);
        }
        if (json.heartRateIsSet) {
            builder.setHeartRate(json.heartRate);
        }
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HeartRateTimestamp) && equalTo((HeartRateTimestamp) obj);
    }

    @Override // com.whoop.analytics.strain.model.BaseHeartRateTimestamp
    @JsonProperty("heart_rate")
    public double getHeartRate() {
        return this.heartRate;
    }

    @Override // com.whoop.analytics.strain.model.BaseHeartRateTimestamp
    @JsonProperty
    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.time) + 177573;
        return Double.hashCode(this.heartRate) + (iHashCode << 5) + iHashCode;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HeartRateTimestamp{time=");
        sb4.append(this.time);
        sb4.append(", heartRate=");
        return AbstractC30007c.m91836f(this.heartRate, "}", sb4);
    }

    public final HeartRateTimestamp withHeartRate(double d3) {
        return Double.doubleToLongBits(this.heartRate) == Double.doubleToLongBits(d3) ? this : new HeartRateTimestamp(this.time, d3);
    }

    public final HeartRateTimestamp withTime(long j7) {
        return this.time == j7 ? this : new HeartRateTimestamp(j7, this.heartRate);
    }

    private HeartRateTimestamp(long j7, double d3) {
        this.time = j7;
        this.heartRate = d3;
    }
}
