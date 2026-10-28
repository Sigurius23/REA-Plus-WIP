package com.whoop.analytics.strain.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hubspot.immutables.validation.InvalidImmutableStateException;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes7.dex */
@SuppressFBWarnings
public final class State implements StateIF {
    private final AnalyticsState anaState;
    private final long prevMaxTime;
    private final Integer userId;

    public static final class Builder {
        private static final long INIT_BIT_PREV_MAX_TIME = 1;
        private AnalyticsState anaState;
        private long initBits;
        private long prevMaxTime;
        private Integer userId;

        private void checkRequiredAttributes() {
            if (this.initBits != 0) {
                throw new InvalidImmutableStateException(formatRequiredAttributesMessage());
            }
        }

        private String formatRequiredAttributesMessage() {
            ArrayList arrayList = new ArrayList();
            if (!prevMaxTimeIsSet()) {
                arrayList.add("prevMaxTime");
            }
            return "Cannot build State, some of required attributes are not set " + arrayList;
        }

        private boolean prevMaxTimeIsSet() {
            return (this.initBits & 1) == 0;
        }

        public State build() {
            checkRequiredAttributes();
            return new State(this.userId, this.anaState, this.prevMaxTime);
        }

        public final Builder from(StateIF stateIF) {
            Objects.requireNonNull(stateIF, "instance");
            Optional<Integer> userId = stateIF.getUserId();
            if (userId.isPresent()) {
                setUserId(userId);
            }
            Optional<AnalyticsState> anaState = stateIF.getAnaState();
            if (anaState.isPresent()) {
                setAnaState(anaState);
            }
            setPrevMaxTime(stateIF.getPrevMaxTime());
            return this;
        }

        public final Builder setAnaState(AnalyticsState analyticsState) {
            this.anaState = analyticsState;
            return this;
        }

        public final Builder setPrevMaxTime(long j7) {
            this.prevMaxTime = j7;
            this.initBits &= -2;
            return this;
        }

        public final Builder setUserId(Integer num) {
            this.userId = num;
            return this;
        }

        private Builder() {
            this.initBits = 1L;
        }

        public final Builder setAnaState(Optional<? extends AnalyticsState> optional) {
            this.anaState = optional.orElse(null);
            return this;
        }

        public final Builder setUserId(Optional<Integer> optional) {
            this.userId = optional.orElse(null);
            return this;
        }
    }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
    @Deprecated
    public static final class Json implements StateIF {
        long prevMaxTime;
        boolean prevMaxTimeIsSet;
        Optional<Integer> userId = Optional.empty();
        Optional<AnalyticsState> anaState = Optional.empty();

        @Override // com.whoop.analytics.strain.model.StateIF
        public Optional<AnalyticsState> getAnaState() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.StateIF
        public long getPrevMaxTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.StateIF
        public Optional<Integer> getUserId() {
            throw new UnsupportedOperationException();
        }

        @JsonProperty
        public void setAnaState(Optional<AnalyticsState> optional) {
            this.anaState = optional;
        }

        @JsonProperty
        public void setPrevMaxTime(long j7) {
            this.prevMaxTime = j7;
            this.prevMaxTimeIsSet = true;
        }

        @JsonProperty
        public void setUserId(Optional<Integer> optional) {
            this.userId = optional;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static State copyOf(StateIF stateIF) {
        return stateIF instanceof State ? (State) stateIF : builder().from(stateIF).build();
    }

    private boolean equalTo(State state) {
        return Objects.equals(this.userId, state.userId) && Objects.equals(this.anaState, state.anaState) && this.prevMaxTime == state.prevMaxTime;
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    @Deprecated
    public static State fromJson(Json json) {
        Builder builder = builder();
        Optional<Integer> optional = json.userId;
        if (optional != null) {
            builder.setUserId(optional);
        }
        Optional<AnalyticsState> optional2 = json.anaState;
        if (optional2 != null) {
            builder.setAnaState(optional2);
        }
        if (json.prevMaxTimeIsSet) {
            builder.setPrevMaxTime(json.prevMaxTime);
        }
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof State) && equalTo((State) obj);
    }

    @Override // com.whoop.analytics.strain.model.StateIF
    @JsonProperty
    public Optional<AnalyticsState> getAnaState() {
        return Optional.ofNullable(this.anaState);
    }

    @Override // com.whoop.analytics.strain.model.StateIF
    @JsonProperty
    public long getPrevMaxTime() {
        return this.prevMaxTime;
    }

    @Override // com.whoop.analytics.strain.model.StateIF
    @JsonProperty
    public Optional<Integer> getUserId() {
        return Optional.ofNullable(this.userId);
    }

    public int hashCode() {
        int iHashCode = Objects.hashCode(this.userId) + 177573;
        int iHashCode2 = Objects.hashCode(this.anaState) + (iHashCode << 5) + iHashCode;
        return Long.hashCode(this.prevMaxTime) + (iHashCode2 << 5) + iHashCode2;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("State{");
        if (this.userId != null) {
            sb4.append("userId=");
            sb4.append(this.userId);
        }
        if (this.anaState != null) {
            if (sb4.length() > 6) {
                sb4.append(", ");
            }
            sb4.append("anaState=");
            sb4.append(this.anaState);
        }
        if (sb4.length() > 6) {
            sb4.append(", ");
        }
        sb4.append("prevMaxTime=");
        return AbstractC11266d.m30457k(this.prevMaxTime, "}", sb4);
    }

    public final State withAnaState(AnalyticsState analyticsState) {
        return this.anaState == analyticsState ? this : new State(this.userId, analyticsState, this.prevMaxTime);
    }

    public final State withPrevMaxTime(long j7) {
        return this.prevMaxTime == j7 ? this : new State(this.userId, this.anaState, j7);
    }

    public final State withUserId(Integer num) {
        return Objects.equals(this.userId, num) ? this : new State(num, this.anaState, this.prevMaxTime);
    }

    private State(Integer num, AnalyticsState analyticsState, long j7) {
        this.userId = num;
        this.anaState = analyticsState;
        this.prevMaxTime = j7;
    }

    public final State withAnaState(Optional<? extends AnalyticsState> optional) {
        AnalyticsState analyticsStateOrElse = optional.orElse(null);
        return this.anaState == analyticsStateOrElse ? this : new State(this.userId, analyticsStateOrElse, this.prevMaxTime);
    }

    public final State withUserId(Optional<Integer> optional) {
        Integer numOrElse = optional.orElse(null);
        return Objects.equals(this.userId, numOrElse) ? this : new State(numOrElse, this.anaState, this.prevMaxTime);
    }
}
