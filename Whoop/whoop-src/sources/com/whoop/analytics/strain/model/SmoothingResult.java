package com.whoop.analytics.strain.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hubspot.immutables.validation.InvalidImmutableStateException;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes7.dex */
@SuppressFBWarnings
public final class SmoothingResult implements SmoothingResultIF {
    private final int lastUsedIndex;
    private final long lastUsedTime;
    private final List<HeartRateTimestamp> smoothedHrs;

    public static final class Builder {
        private static final long INIT_BIT_LAST_USED_INDEX = 1;
        private static final long INIT_BIT_LAST_USED_TIME = 2;
        private long initBits;
        private int lastUsedIndex;
        private long lastUsedTime;
        private List<HeartRateTimestamp> smoothedHrs;

        private void checkRequiredAttributes() {
            if (this.initBits != 0) {
                throw new InvalidImmutableStateException(formatRequiredAttributesMessage());
            }
        }

        private String formatRequiredAttributesMessage() {
            ArrayList arrayList = new ArrayList();
            if (!lastUsedIndexIsSet()) {
                arrayList.add("lastUsedIndex");
            }
            if (!lastUsedTimeIsSet()) {
                arrayList.add("lastUsedTime");
            }
            return "Cannot build SmoothingResult, some of required attributes are not set " + arrayList;
        }

        private boolean lastUsedIndexIsSet() {
            return (this.initBits & 1) == 0;
        }

        private boolean lastUsedTimeIsSet() {
            return (this.initBits & INIT_BIT_LAST_USED_TIME) == 0;
        }

        public final Builder addAllSmoothedHrs(Iterable<? extends HeartRateTimestamp> iterable) {
            for (HeartRateTimestamp heartRateTimestamp : iterable) {
                List<HeartRateTimestamp> list = this.smoothedHrs;
                Objects.requireNonNull(heartRateTimestamp, "smoothedHrs element");
                list.add(heartRateTimestamp);
            }
            return this;
        }

        public final Builder addSmoothedHrs(HeartRateTimestamp heartRateTimestamp) {
            List<HeartRateTimestamp> list = this.smoothedHrs;
            Objects.requireNonNull(heartRateTimestamp, "smoothedHrs element");
            list.add(heartRateTimestamp);
            return this;
        }

        public SmoothingResult build() {
            checkRequiredAttributes();
            return new SmoothingResult(SmoothingResult.createUnmodifiableList(true, this.smoothedHrs), this.lastUsedIndex, this.lastUsedTime);
        }

        public final Builder from(SmoothingResultIF smoothingResultIF) {
            Objects.requireNonNull(smoothingResultIF, "instance");
            addAllSmoothedHrs(smoothingResultIF.getSmoothedHrs());
            setLastUsedIndex(smoothingResultIF.getLastUsedIndex());
            setLastUsedTime(smoothingResultIF.getLastUsedTime());
            return this;
        }

        public final Builder setLastUsedIndex(int i13) {
            this.lastUsedIndex = i13;
            this.initBits &= -2;
            return this;
        }

        public final Builder setLastUsedTime(long j7) {
            this.lastUsedTime = j7;
            this.initBits &= -3;
            return this;
        }

        public final Builder setSmoothedHrs(Iterable<? extends HeartRateTimestamp> iterable) {
            this.smoothedHrs.clear();
            return addAllSmoothedHrs(iterable);
        }

        private Builder() {
            this.initBits = 3L;
            this.smoothedHrs = new ArrayList();
        }

        public final Builder addSmoothedHrs(HeartRateTimestamp... heartRateTimestampArr) {
            for (HeartRateTimestamp heartRateTimestamp : heartRateTimestampArr) {
                List<HeartRateTimestamp> list = this.smoothedHrs;
                Objects.requireNonNull(heartRateTimestamp, "smoothedHrs element");
                list.add(heartRateTimestamp);
            }
            return this;
        }
    }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
    @Deprecated
    public static final class Json implements SmoothingResultIF {
        int lastUsedIndex;
        boolean lastUsedIndexIsSet;
        long lastUsedTime;
        boolean lastUsedTimeIsSet;
        List<HeartRateTimestamp> smoothedHrs = Collections.EMPTY_LIST;

        @Override // com.whoop.analytics.strain.model.SmoothingResultIF
        public int getLastUsedIndex() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.SmoothingResultIF
        public long getLastUsedTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.SmoothingResultIF
        public List<HeartRateTimestamp> getSmoothedHrs() {
            throw new UnsupportedOperationException();
        }

        @JsonProperty
        public void setLastUsedIndex(int i13) {
            this.lastUsedIndex = i13;
            this.lastUsedIndexIsSet = true;
        }

        @JsonProperty
        public void setLastUsedTime(long j7) {
            this.lastUsedTime = j7;
            this.lastUsedTimeIsSet = true;
        }

        @JsonProperty
        public void setSmoothedHrs(List<HeartRateTimestamp> list) {
            this.smoothedHrs = list;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmoothingResult copyOf(SmoothingResultIF smoothingResultIF) {
        return smoothingResultIF instanceof SmoothingResult ? (SmoothingResult) smoothingResultIF : builder().from(smoothingResultIF).build();
    }

    private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean z4, boolean z13) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (T t14 : iterable) {
            if (!z13 || t14 != null) {
                if (z4) {
                    Objects.requireNonNull(t14, "element");
                }
                arrayList.add(t14);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> List<T> createUnmodifiableList(boolean z4, List<T> list) {
        int size = list.size();
        if (size == 0) {
            return Collections.EMPTY_LIST;
        }
        if (size == 1) {
            return Collections.singletonList(list.get(0));
        }
        if (z4) {
            return Collections.unmodifiableList(new ArrayList(list));
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
    }

    private boolean equalTo(SmoothingResult smoothingResult) {
        return this.smoothedHrs.equals(smoothingResult.smoothedHrs) && this.lastUsedIndex == smoothingResult.lastUsedIndex && this.lastUsedTime == smoothingResult.lastUsedTime;
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    @Deprecated
    public static SmoothingResult fromJson(Json json) {
        Builder builder = builder();
        List<HeartRateTimestamp> list = json.smoothedHrs;
        if (list != null) {
            builder.addAllSmoothedHrs(list);
        }
        if (json.lastUsedIndexIsSet) {
            builder.setLastUsedIndex(json.lastUsedIndex);
        }
        if (json.lastUsedTimeIsSet) {
            builder.setLastUsedTime(json.lastUsedTime);
        }
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SmoothingResult) && equalTo((SmoothingResult) obj);
    }

    @Override // com.whoop.analytics.strain.model.SmoothingResultIF
    @JsonProperty
    public int getLastUsedIndex() {
        return this.lastUsedIndex;
    }

    @Override // com.whoop.analytics.strain.model.SmoothingResultIF
    @JsonProperty
    public long getLastUsedTime() {
        return this.lastUsedTime;
    }

    @Override // com.whoop.analytics.strain.model.SmoothingResultIF
    @JsonProperty
    public List<HeartRateTimestamp> getSmoothedHrs() {
        return this.smoothedHrs;
    }

    public int hashCode() {
        int iHashCode = this.smoothedHrs.hashCode() + 177573;
        int i13 = (iHashCode << 5) + this.lastUsedIndex + iHashCode;
        return Long.hashCode(this.lastUsedTime) + (i13 << 5) + i13;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("SmoothingResult{smoothedHrs=");
        sb4.append(this.smoothedHrs);
        sb4.append(", lastUsedIndex=");
        sb4.append(this.lastUsedIndex);
        sb4.append(", lastUsedTime=");
        return AbstractC11266d.m30457k(this.lastUsedTime, "}", sb4);
    }

    public final SmoothingResult withLastUsedIndex(int i13) {
        return this.lastUsedIndex == i13 ? this : new SmoothingResult(this.smoothedHrs, i13, this.lastUsedTime);
    }

    public final SmoothingResult withLastUsedTime(long j7) {
        return this.lastUsedTime == j7 ? this : new SmoothingResult(this.smoothedHrs, this.lastUsedIndex, j7);
    }

    public final SmoothingResult withSmoothedHrs(HeartRateTimestamp... heartRateTimestampArr) {
        return new SmoothingResult(createUnmodifiableList(false, createSafeList(Arrays.asList(heartRateTimestampArr), true, false)), this.lastUsedIndex, this.lastUsedTime);
    }

    private SmoothingResult(List<HeartRateTimestamp> list, int i13, long j7) {
        this.smoothedHrs = list;
        this.lastUsedIndex = i13;
        this.lastUsedTime = j7;
    }

    public final SmoothingResult withSmoothedHrs(Iterable<? extends HeartRateTimestamp> iterable) {
        return this.smoothedHrs == iterable ? this : new SmoothingResult(createUnmodifiableList(false, createSafeList(iterable, true, false)), this.lastUsedIndex, this.lastUsedTime);
    }
}
