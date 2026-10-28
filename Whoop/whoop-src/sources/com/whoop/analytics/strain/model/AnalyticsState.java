package com.whoop.analytics.strain.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: classes7.dex */
@SuppressFBWarnings
public final class AnalyticsState implements AnalyticsStateIF {
    private final Long lastUsed;
    private final List<Float> leftOverAccelX;
    private final List<Integer> leftOverHrc;
    private final List<List<Long>> leftOvers;
    private final List<List<Long>> modHrs;

    public static final class Builder {
        private Long lastUsed;
        private List<Float> leftOverAccelX;
        private List<Integer> leftOverHrc;
        private List<List<Long>> leftOvers;
        private List<List<Long>> modHrs;

        public final Builder addAllLeftOvers(Iterable<? extends List<Long>> iterable) {
            for (List<Long> list : iterable) {
                List<List<Long>> list2 = this.leftOvers;
                Objects.requireNonNull(list, "leftOvers element");
                list2.add(list);
            }
            return this;
        }

        public final Builder addAllModHrs(Iterable<? extends List<Long>> iterable) {
            for (List<Long> list : iterable) {
                List<List<Long>> list2 = this.modHrs;
                Objects.requireNonNull(list, "modHrs element");
                list2.add(list);
            }
            return this;
        }

        public final Builder addLeftOvers(List<Long> list) {
            List<List<Long>> list2 = this.leftOvers;
            Objects.requireNonNull(list, "leftOvers element");
            list2.add(list);
            return this;
        }

        public final Builder addModHrs(List<Long> list) {
            List<List<Long>> list2 = this.modHrs;
            Objects.requireNonNull(list, "modHrs element");
            list2.add(list);
            return this;
        }

        public AnalyticsState build() {
            return new AnalyticsState(this.lastUsed, AnalyticsState.createUnmodifiableList(true, this.leftOvers), AnalyticsState.createUnmodifiableList(true, this.modHrs), this.leftOverHrc, this.leftOverAccelX);
        }

        public final Builder from(AnalyticsStateIF analyticsStateIF) {
            Objects.requireNonNull(analyticsStateIF, "instance");
            Optional<Long> lastUsed = analyticsStateIF.getLastUsed();
            if (lastUsed.isPresent()) {
                setLastUsed(lastUsed);
            }
            addAllLeftOvers(analyticsStateIF.getLeftOvers());
            addAllModHrs(analyticsStateIF.getModHrs());
            Optional<List<Integer>> leftOverHrc = analyticsStateIF.getLeftOverHrc();
            if (leftOverHrc.isPresent()) {
                setLeftOverHrc(leftOverHrc);
            }
            Optional<List<Float>> leftOverAccelX = analyticsStateIF.getLeftOverAccelX();
            if (leftOverAccelX.isPresent()) {
                setLeftOverAccelX(leftOverAccelX);
            }
            return this;
        }

        public final Builder setLastUsed(Long l7) {
            this.lastUsed = l7;
            return this;
        }

        public final Builder setLeftOverAccelX(List<Float> list) {
            this.leftOverAccelX = list;
            return this;
        }

        public final Builder setLeftOverHrc(List<Integer> list) {
            this.leftOverHrc = list;
            return this;
        }

        public final Builder setLeftOvers(Iterable<? extends List<Long>> iterable) {
            this.leftOvers.clear();
            return addAllLeftOvers(iterable);
        }

        public final Builder setModHrs(Iterable<? extends List<Long>> iterable) {
            this.modHrs.clear();
            return addAllModHrs(iterable);
        }

        private Builder() {
            this.leftOvers = new ArrayList();
            this.modHrs = new ArrayList();
        }

        @SafeVarargs
        public final Builder addLeftOvers(List<Long>... listArr) {
            for (List<Long> list : listArr) {
                List<List<Long>> list2 = this.leftOvers;
                Objects.requireNonNull(list, "leftOvers element");
                list2.add(list);
            }
            return this;
        }

        @SafeVarargs
        public final Builder addModHrs(List<Long>... listArr) {
            for (List<Long> list : listArr) {
                List<List<Long>> list2 = this.modHrs;
                Objects.requireNonNull(list, "modHrs element");
                list2.add(list);
            }
            return this;
        }

        public final Builder setLastUsed(Optional<Long> optional) {
            this.lastUsed = optional.orElse(null);
            return this;
        }

        public final Builder setLeftOverAccelX(Optional<? extends List<Float>> optional) {
            this.leftOverAccelX = optional.orElse(null);
            return this;
        }

        public final Builder setLeftOverHrc(Optional<? extends List<Integer>> optional) {
            this.leftOverHrc = optional.orElse(null);
            return this;
        }
    }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
    @Deprecated
    public static final class Json implements AnalyticsStateIF {
        Optional<Long> lastUsed = Optional.empty();
        Optional<List<Float>> leftOverAccelX;
        Optional<List<Integer>> leftOverHrc;
        List<List<Long>> leftOvers;
        List<List<Long>> modHrs;

        public Json() {
            List<List<Long>> list = Collections.EMPTY_LIST;
            this.leftOvers = list;
            this.modHrs = list;
            this.leftOverHrc = Optional.empty();
            this.leftOverAccelX = Optional.empty();
        }

        @Override // com.whoop.analytics.strain.model.AnalyticsStateIF
        public Optional<Long> getLastUsed() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.AnalyticsStateIF
        public Optional<List<Float>> getLeftOverAccelX() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.AnalyticsStateIF
        public Optional<List<Integer>> getLeftOverHrc() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.AnalyticsStateIF
        public List<List<Long>> getLeftOvers() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.AnalyticsStateIF
        public List<List<Long>> getModHrs() {
            throw new UnsupportedOperationException();
        }

        @JsonProperty("lastUsed")
        public void setLastUsed(Optional<Long> optional) {
            this.lastUsed = optional;
        }

        @JsonProperty("leftOverAccelX")
        public void setLeftOverAccelX(Optional<List<Float>> optional) {
            this.leftOverAccelX = optional;
        }

        @JsonProperty("leftOverHrc")
        public void setLeftOverHrc(Optional<List<Integer>> optional) {
            this.leftOverHrc = optional;
        }

        @JsonProperty("leftOvers")
        public void setLeftOvers(List<List<Long>> list) {
            this.leftOvers = list;
        }

        @JsonProperty("modHrs")
        public void setModHrs(List<List<Long>> list) {
            this.modHrs = list;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnalyticsState copyOf(AnalyticsStateIF analyticsStateIF) {
        return analyticsStateIF instanceof AnalyticsState ? (AnalyticsState) analyticsStateIF : builder().from(analyticsStateIF).build();
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

    private boolean equalTo(AnalyticsState analyticsState) {
        return Objects.equals(this.lastUsed, analyticsState.lastUsed) && this.leftOvers.equals(analyticsState.leftOvers) && this.modHrs.equals(analyticsState.modHrs) && Objects.equals(this.leftOverHrc, analyticsState.leftOverHrc) && Objects.equals(this.leftOverAccelX, analyticsState.leftOverAccelX);
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    @Deprecated
    public static AnalyticsState fromJson(Json json) {
        Builder builder = builder();
        Optional<Long> optional = json.lastUsed;
        if (optional != null) {
            builder.setLastUsed(optional);
        }
        List<List<Long>> list = json.leftOvers;
        if (list != null) {
            builder.addAllLeftOvers(list);
        }
        List<List<Long>> list2 = json.modHrs;
        if (list2 != null) {
            builder.addAllModHrs(list2);
        }
        Optional<List<Integer>> optional2 = json.leftOverHrc;
        if (optional2 != null) {
            builder.setLeftOverHrc(optional2);
        }
        Optional<List<Float>> optional3 = json.leftOverAccelX;
        if (optional3 != null) {
            builder.setLeftOverAccelX(optional3);
        }
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnalyticsState) && equalTo((AnalyticsState) obj);
    }

    @Override // com.whoop.analytics.strain.model.AnalyticsStateIF
    @JsonProperty("lastUsed")
    public Optional<Long> getLastUsed() {
        return Optional.ofNullable(this.lastUsed);
    }

    @Override // com.whoop.analytics.strain.model.AnalyticsStateIF
    @JsonProperty("leftOverAccelX")
    public Optional<List<Float>> getLeftOverAccelX() {
        return Optional.ofNullable(this.leftOverAccelX);
    }

    @Override // com.whoop.analytics.strain.model.AnalyticsStateIF
    @JsonProperty("leftOverHrc")
    public Optional<List<Integer>> getLeftOverHrc() {
        return Optional.ofNullable(this.leftOverHrc);
    }

    @Override // com.whoop.analytics.strain.model.AnalyticsStateIF
    @JsonProperty("leftOvers")
    public List<List<Long>> getLeftOvers() {
        return this.leftOvers;
    }

    @Override // com.whoop.analytics.strain.model.AnalyticsStateIF
    @JsonProperty("modHrs")
    public List<List<Long>> getModHrs() {
        return this.modHrs;
    }

    public int hashCode() {
        int iHashCode = Objects.hashCode(this.lastUsed) + 177573;
        int iHashCode2 = this.leftOvers.hashCode() + (iHashCode << 5) + iHashCode;
        int iHashCode3 = this.modHrs.hashCode() + (iHashCode2 << 5) + iHashCode2;
        int iHashCode4 = Objects.hashCode(this.leftOverHrc) + (iHashCode3 << 5) + iHashCode3;
        return Objects.hashCode(this.leftOverAccelX) + (iHashCode4 << 5) + iHashCode4;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("AnalyticsState{");
        if (this.lastUsed != null) {
            sb4.append("lastUsed=");
            sb4.append(this.lastUsed);
        }
        if (sb4.length() > 15) {
            sb4.append(", ");
        }
        sb4.append("leftOvers=");
        sb4.append(this.leftOvers);
        sb4.append(", ");
        sb4.append("modHrs=");
        sb4.append(this.modHrs);
        if (this.leftOverHrc != null) {
            sb4.append(", ");
            sb4.append("leftOverHrc=");
            sb4.append(this.leftOverHrc);
        }
        if (this.leftOverAccelX != null) {
            sb4.append(", ");
            sb4.append("leftOverAccelX=");
            sb4.append(this.leftOverAccelX);
        }
        sb4.append("}");
        return sb4.toString();
    }

    public final AnalyticsState withLastUsed(Long l7) {
        return Objects.equals(this.lastUsed, l7) ? this : new AnalyticsState(l7, this.leftOvers, this.modHrs, this.leftOverHrc, this.leftOverAccelX);
    }

    public final AnalyticsState withLeftOverAccelX(List<Float> list) {
        return this.leftOverAccelX == list ? this : new AnalyticsState(this.lastUsed, this.leftOvers, this.modHrs, this.leftOverHrc, list);
    }

    public final AnalyticsState withLeftOverHrc(List<Integer> list) {
        return this.leftOverHrc == list ? this : new AnalyticsState(this.lastUsed, this.leftOvers, this.modHrs, list, this.leftOverAccelX);
    }

    @SafeVarargs
    public final AnalyticsState withLeftOvers(List<Long>... listArr) {
        return new AnalyticsState(this.lastUsed, createUnmodifiableList(false, createSafeList(Arrays.asList(listArr), true, false)), this.modHrs, this.leftOverHrc, this.leftOverAccelX);
    }

    @SafeVarargs
    public final AnalyticsState withModHrs(List<Long>... listArr) {
        return new AnalyticsState(this.lastUsed, this.leftOvers, createUnmodifiableList(false, createSafeList(Arrays.asList(listArr), true, false)), this.leftOverHrc, this.leftOverAccelX);
    }

    private AnalyticsState(Long l7, List<List<Long>> list, List<List<Long>> list2, List<Integer> list3, List<Float> list4) {
        this.lastUsed = l7;
        this.leftOvers = list;
        this.modHrs = list2;
        this.leftOverHrc = list3;
        this.leftOverAccelX = list4;
    }

    public final AnalyticsState withLastUsed(Optional<Long> optional) {
        Long lOrElse = optional.orElse(null);
        return Objects.equals(this.lastUsed, lOrElse) ? this : new AnalyticsState(lOrElse, this.leftOvers, this.modHrs, this.leftOverHrc, this.leftOverAccelX);
    }

    public final AnalyticsState withLeftOverAccelX(Optional<? extends List<Float>> optional) {
        List<Float> listOrElse = optional.orElse(null);
        return this.leftOverAccelX == listOrElse ? this : new AnalyticsState(this.lastUsed, this.leftOvers, this.modHrs, this.leftOverHrc, listOrElse);
    }

    public final AnalyticsState withLeftOverHrc(Optional<? extends List<Integer>> optional) {
        List<Integer> listOrElse = optional.orElse(null);
        return this.leftOverHrc == listOrElse ? this : new AnalyticsState(this.lastUsed, this.leftOvers, this.modHrs, listOrElse, this.leftOverAccelX);
    }

    public final AnalyticsState withLeftOvers(Iterable<? extends List<Long>> iterable) {
        if (this.leftOvers == iterable) {
            return this;
        }
        return new AnalyticsState(this.lastUsed, createUnmodifiableList(false, createSafeList(iterable, true, false)), this.modHrs, this.leftOverHrc, this.leftOverAccelX);
    }

    public final AnalyticsState withModHrs(Iterable<? extends List<Long>> iterable) {
        if (this.modHrs == iterable) {
            return this;
        }
        return new AnalyticsState(this.lastUsed, this.leftOvers, createUnmodifiableList(false, createSafeList(iterable, true, false)), this.leftOverHrc, this.leftOverAccelX);
    }
}
