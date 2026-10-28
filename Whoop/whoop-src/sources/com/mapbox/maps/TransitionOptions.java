package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class TransitionOptions implements Serializable {
    private final Long delay;
    private final Long duration;
    private final Boolean enablePlacementTransitions;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private Long delay;
        private Long duration;
        private Boolean enablePlacementTransitions;

        public TransitionOptions build() {
            return new TransitionOptions(this.duration, this.delay, this.enablePlacementTransitions);
        }

        public Builder delay(Long l7) {
            this.delay = l7;
            return this;
        }

        public Builder duration(Long l7) {
            this.duration = l7;
            return this;
        }

        public Builder enablePlacementTransitions(Boolean bool) {
            this.enablePlacementTransitions = bool;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransitionOptions.class != obj.getClass()) {
            return false;
        }
        TransitionOptions transitionOptions = (TransitionOptions) obj;
        return Objects.equals(this.duration, transitionOptions.duration) && Objects.equals(this.delay, transitionOptions.delay) && Objects.equals(this.enablePlacementTransitions, transitionOptions.enablePlacementTransitions);
    }

    public Long getDelay() {
        return this.delay;
    }

    public Long getDuration() {
        return this.duration;
    }

    public Boolean getEnablePlacementTransitions() {
        return this.enablePlacementTransitions;
    }

    public int hashCode() {
        return Objects.hash(this.duration, this.delay, this.enablePlacementTransitions);
    }

    public Builder toBuilder() {
        return new Builder().duration(this.duration).delay(this.delay).enablePlacementTransitions(this.enablePlacementTransitions);
    }

    public String toString() {
        return "[duration: " + RecordUtils.fieldToString(this.duration) + ", delay: " + RecordUtils.fieldToString(this.delay) + ", enablePlacementTransitions: " + RecordUtils.fieldToString(this.enablePlacementTransitions) + "]";
    }

    private TransitionOptions(Long l7, Long l12, Boolean bool) {
        this.duration = l7;
        this.delay = l12;
        this.enablePlacementTransitions = bool;
    }
}
