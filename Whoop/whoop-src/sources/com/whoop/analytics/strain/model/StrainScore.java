package com.whoop.analytics.strain.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: classes7.dex */
@SuppressFBWarnings
public final class StrainScore implements StrainScoreIF {
    private final Double avgHr;
    private final Double kilojoules;
    private final Double maxHr;
    private final Double projectedStrainScore;
    private final Double scaledScore;
    private final AnalyticsState state;
    private final Double strainScore;

    public static final class Builder {
        private Double avgHr;
        private Double kilojoules;
        private Double maxHr;
        private Double projectedStrainScore;
        private Double scaledScore;
        private AnalyticsState state;
        private Double strainScore;

        public StrainScore build() {
            return new StrainScore(this.strainScore, this.scaledScore, this.kilojoules, this.avgHr, this.maxHr, this.projectedStrainScore, this.state);
        }

        public final Builder from(StrainScoreIF strainScoreIF) {
            Objects.requireNonNull(strainScoreIF, "instance");
            Optional<Double> strainScore = strainScoreIF.getStrainScore();
            if (strainScore.isPresent()) {
                setStrainScore(strainScore);
            }
            Optional<Double> scaledScore = strainScoreIF.getScaledScore();
            if (scaledScore.isPresent()) {
                setScaledScore(scaledScore);
            }
            Optional<Double> kilojoules = strainScoreIF.getKilojoules();
            if (kilojoules.isPresent()) {
                setKilojoules(kilojoules);
            }
            Optional<Double> avgHr = strainScoreIF.getAvgHr();
            if (avgHr.isPresent()) {
                setAvgHr(avgHr);
            }
            Optional<Double> maxHr = strainScoreIF.getMaxHr();
            if (maxHr.isPresent()) {
                setMaxHr(maxHr);
            }
            Optional<Double> projectedStrainScore = strainScoreIF.getProjectedStrainScore();
            if (projectedStrainScore.isPresent()) {
                setProjectedStrainScore(projectedStrainScore);
            }
            Optional<AnalyticsState> state = strainScoreIF.getState();
            if (state.isPresent()) {
                setState(state);
            }
            return this;
        }

        public final Builder setAvgHr(Double d3) {
            this.avgHr = d3;
            return this;
        }

        public final Builder setKilojoules(Double d3) {
            this.kilojoules = d3;
            return this;
        }

        public final Builder setMaxHr(Double d3) {
            this.maxHr = d3;
            return this;
        }

        public final Builder setProjectedStrainScore(Double d3) {
            this.projectedStrainScore = d3;
            return this;
        }

        public final Builder setScaledScore(Double d3) {
            this.scaledScore = d3;
            return this;
        }

        public final Builder setState(AnalyticsState analyticsState) {
            this.state = analyticsState;
            return this;
        }

        public final Builder setStrainScore(Double d3) {
            this.strainScore = d3;
            return this;
        }

        private Builder() {
        }

        public final Builder setAvgHr(Optional<Double> optional) {
            this.avgHr = optional.orElse(null);
            return this;
        }

        public final Builder setKilojoules(Optional<Double> optional) {
            this.kilojoules = optional.orElse(null);
            return this;
        }

        public final Builder setMaxHr(Optional<Double> optional) {
            this.maxHr = optional.orElse(null);
            return this;
        }

        public final Builder setProjectedStrainScore(Optional<Double> optional) {
            this.projectedStrainScore = optional.orElse(null);
            return this;
        }

        public final Builder setScaledScore(Optional<Double> optional) {
            this.scaledScore = optional.orElse(null);
            return this;
        }

        public final Builder setState(Optional<? extends AnalyticsState> optional) {
            this.state = optional.orElse(null);
            return this;
        }

        public final Builder setStrainScore(Optional<Double> optional) {
            this.strainScore = optional.orElse(null);
            return this;
        }
    }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
    @Deprecated
    public static final class Json implements StrainScoreIF {
        Optional<Double> strainScore = Optional.empty();
        Optional<Double> scaledScore = Optional.empty();
        Optional<Double> kilojoules = Optional.empty();
        Optional<Double> avgHr = Optional.empty();
        Optional<Double> maxHr = Optional.empty();
        Optional<Double> projectedStrainScore = Optional.empty();
        Optional<AnalyticsState> state = Optional.empty();

        @Override // com.whoop.analytics.strain.model.StrainScoreIF
        public Optional<Double> getAvgHr() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.StrainScoreIF
        public Optional<Double> getKilojoules() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.StrainScoreIF
        public Optional<Double> getMaxHr() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.StrainScoreIF
        public Optional<Double> getProjectedStrainScore() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.StrainScoreIF
        public Optional<Double> getScaledScore() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.StrainScoreIF
        public Optional<AnalyticsState> getState() {
            throw new UnsupportedOperationException();
        }

        @Override // com.whoop.analytics.strain.model.StrainScoreIF
        public Optional<Double> getStrainScore() {
            throw new UnsupportedOperationException();
        }

        @JsonProperty("avgHr")
        public void setAvgHr(Optional<Double> optional) {
            this.avgHr = optional;
        }

        @JsonProperty("kilojoules")
        public void setKilojoules(Optional<Double> optional) {
            this.kilojoules = optional;
        }

        @JsonProperty("maxHr")
        public void setMaxHr(Optional<Double> optional) {
            this.maxHr = optional;
        }

        @JsonProperty("projectedStrainScore")
        public void setProjectedStrainScore(Optional<Double> optional) {
            this.projectedStrainScore = optional;
        }

        @JsonProperty("scaledScore")
        public void setScaledScore(Optional<Double> optional) {
            this.scaledScore = optional;
        }

        @JsonProperty
        public void setState(Optional<AnalyticsState> optional) {
            this.state = optional;
        }

        @JsonProperty("strainScore")
        public void setStrainScore(Optional<Double> optional) {
            this.strainScore = optional;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StrainScore copyOf(StrainScoreIF strainScoreIF) {
        return strainScoreIF instanceof StrainScore ? (StrainScore) strainScoreIF : builder().from(strainScoreIF).build();
    }

    private boolean equalTo(StrainScore strainScore) {
        return Objects.equals(this.strainScore, strainScore.strainScore) && Objects.equals(this.scaledScore, strainScore.scaledScore) && Objects.equals(this.kilojoules, strainScore.kilojoules) && Objects.equals(this.avgHr, strainScore.avgHr) && Objects.equals(this.maxHr, strainScore.maxHr) && Objects.equals(this.projectedStrainScore, strainScore.projectedStrainScore) && Objects.equals(this.state, strainScore.state);
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    @Deprecated
    public static StrainScore fromJson(Json json) {
        Builder builder = builder();
        Optional<Double> optional = json.strainScore;
        if (optional != null) {
            builder.setStrainScore(optional);
        }
        Optional<Double> optional2 = json.scaledScore;
        if (optional2 != null) {
            builder.setScaledScore(optional2);
        }
        Optional<Double> optional3 = json.kilojoules;
        if (optional3 != null) {
            builder.setKilojoules(optional3);
        }
        Optional<Double> optional4 = json.avgHr;
        if (optional4 != null) {
            builder.setAvgHr(optional4);
        }
        Optional<Double> optional5 = json.maxHr;
        if (optional5 != null) {
            builder.setMaxHr(optional5);
        }
        Optional<Double> optional6 = json.projectedStrainScore;
        if (optional6 != null) {
            builder.setProjectedStrainScore(optional6);
        }
        Optional<AnalyticsState> optional7 = json.state;
        if (optional7 != null) {
            builder.setState(optional7);
        }
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StrainScore) && equalTo((StrainScore) obj);
    }

    @Override // com.whoop.analytics.strain.model.StrainScoreIF
    @JsonProperty("avgHr")
    public Optional<Double> getAvgHr() {
        return Optional.ofNullable(this.avgHr);
    }

    @Override // com.whoop.analytics.strain.model.StrainScoreIF
    @JsonProperty("kilojoules")
    public Optional<Double> getKilojoules() {
        return Optional.ofNullable(this.kilojoules);
    }

    @Override // com.whoop.analytics.strain.model.StrainScoreIF
    @JsonProperty("maxHr")
    public Optional<Double> getMaxHr() {
        return Optional.ofNullable(this.maxHr);
    }

    @Override // com.whoop.analytics.strain.model.StrainScoreIF
    @JsonProperty("projectedStrainScore")
    public Optional<Double> getProjectedStrainScore() {
        return Optional.ofNullable(this.projectedStrainScore);
    }

    @Override // com.whoop.analytics.strain.model.StrainScoreIF
    @JsonProperty("scaledScore")
    public Optional<Double> getScaledScore() {
        return Optional.ofNullable(this.scaledScore);
    }

    @Override // com.whoop.analytics.strain.model.StrainScoreIF
    @JsonProperty
    public Optional<AnalyticsState> getState() {
        return Optional.ofNullable(this.state);
    }

    @Override // com.whoop.analytics.strain.model.StrainScoreIF
    @JsonProperty("strainScore")
    public Optional<Double> getStrainScore() {
        return Optional.ofNullable(this.strainScore);
    }

    public int hashCode() {
        int iHashCode = Objects.hashCode(this.strainScore) + 177573;
        int iHashCode2 = Objects.hashCode(this.scaledScore) + (iHashCode << 5) + iHashCode;
        int iHashCode3 = Objects.hashCode(this.kilojoules) + (iHashCode2 << 5) + iHashCode2;
        int iHashCode4 = Objects.hashCode(this.avgHr) + (iHashCode3 << 5) + iHashCode3;
        int iHashCode5 = Objects.hashCode(this.maxHr) + (iHashCode4 << 5) + iHashCode4;
        int iHashCode6 = Objects.hashCode(this.projectedStrainScore) + (iHashCode5 << 5) + iHashCode5;
        return Objects.hashCode(this.state) + (iHashCode6 << 5) + iHashCode6;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("StrainScore{");
        if (this.strainScore != null) {
            sb4.append("strainScore=");
            sb4.append(this.strainScore);
        }
        if (this.scaledScore != null) {
            if (sb4.length() > 12) {
                sb4.append(", ");
            }
            sb4.append("scaledScore=");
            sb4.append(this.scaledScore);
        }
        if (this.kilojoules != null) {
            if (sb4.length() > 12) {
                sb4.append(", ");
            }
            sb4.append("kilojoules=");
            sb4.append(this.kilojoules);
        }
        if (this.avgHr != null) {
            if (sb4.length() > 12) {
                sb4.append(", ");
            }
            sb4.append("avgHr=");
            sb4.append(this.avgHr);
        }
        if (this.maxHr != null) {
            if (sb4.length() > 12) {
                sb4.append(", ");
            }
            sb4.append("maxHr=");
            sb4.append(this.maxHr);
        }
        if (this.projectedStrainScore != null) {
            if (sb4.length() > 12) {
                sb4.append(", ");
            }
            sb4.append("projectedStrainScore=");
            sb4.append(this.projectedStrainScore);
        }
        if (this.state != null) {
            if (sb4.length() > 12) {
                sb4.append(", ");
            }
            sb4.append("state=");
            sb4.append(this.state);
        }
        sb4.append("}");
        return sb4.toString();
    }

    public final StrainScore withAvgHr(Double d3) {
        return Objects.equals(this.avgHr, d3) ? this : new StrainScore(this.strainScore, this.scaledScore, this.kilojoules, d3, this.maxHr, this.projectedStrainScore, this.state);
    }

    public final StrainScore withKilojoules(Double d3) {
        return Objects.equals(this.kilojoules, d3) ? this : new StrainScore(this.strainScore, this.scaledScore, d3, this.avgHr, this.maxHr, this.projectedStrainScore, this.state);
    }

    public final StrainScore withMaxHr(Double d3) {
        return Objects.equals(this.maxHr, d3) ? this : new StrainScore(this.strainScore, this.scaledScore, this.kilojoules, this.avgHr, d3, this.projectedStrainScore, this.state);
    }

    public final StrainScore withProjectedStrainScore(Double d3) {
        return Objects.equals(this.projectedStrainScore, d3) ? this : new StrainScore(this.strainScore, this.scaledScore, this.kilojoules, this.avgHr, this.maxHr, d3, this.state);
    }

    public final StrainScore withScaledScore(Double d3) {
        return Objects.equals(this.scaledScore, d3) ? this : new StrainScore(this.strainScore, d3, this.kilojoules, this.avgHr, this.maxHr, this.projectedStrainScore, this.state);
    }

    public final StrainScore withState(AnalyticsState analyticsState) {
        return this.state == analyticsState ? this : new StrainScore(this.strainScore, this.scaledScore, this.kilojoules, this.avgHr, this.maxHr, this.projectedStrainScore, analyticsState);
    }

    public final StrainScore withStrainScore(Double d3) {
        return Objects.equals(this.strainScore, d3) ? this : new StrainScore(d3, this.scaledScore, this.kilojoules, this.avgHr, this.maxHr, this.projectedStrainScore, this.state);
    }

    private StrainScore(Double d3, Double d14, Double d15, Double d16, Double d17, Double d18, AnalyticsState analyticsState) {
        this.strainScore = d3;
        this.scaledScore = d14;
        this.kilojoules = d15;
        this.avgHr = d16;
        this.maxHr = d17;
        this.projectedStrainScore = d18;
        this.state = analyticsState;
    }

    public final StrainScore withAvgHr(Optional<Double> optional) {
        Double dOrElse = optional.orElse(null);
        return Objects.equals(this.avgHr, dOrElse) ? this : new StrainScore(this.strainScore, this.scaledScore, this.kilojoules, dOrElse, this.maxHr, this.projectedStrainScore, this.state);
    }

    public final StrainScore withKilojoules(Optional<Double> optional) {
        Double dOrElse = optional.orElse(null);
        return Objects.equals(this.kilojoules, dOrElse) ? this : new StrainScore(this.strainScore, this.scaledScore, dOrElse, this.avgHr, this.maxHr, this.projectedStrainScore, this.state);
    }

    public final StrainScore withMaxHr(Optional<Double> optional) {
        Double dOrElse = optional.orElse(null);
        return Objects.equals(this.maxHr, dOrElse) ? this : new StrainScore(this.strainScore, this.scaledScore, this.kilojoules, this.avgHr, dOrElse, this.projectedStrainScore, this.state);
    }

    public final StrainScore withProjectedStrainScore(Optional<Double> optional) {
        Double dOrElse = optional.orElse(null);
        return Objects.equals(this.projectedStrainScore, dOrElse) ? this : new StrainScore(this.strainScore, this.scaledScore, this.kilojoules, this.avgHr, this.maxHr, dOrElse, this.state);
    }

    public final StrainScore withScaledScore(Optional<Double> optional) {
        Double dOrElse = optional.orElse(null);
        return Objects.equals(this.scaledScore, dOrElse) ? this : new StrainScore(this.strainScore, dOrElse, this.kilojoules, this.avgHr, this.maxHr, this.projectedStrainScore, this.state);
    }

    public final StrainScore withState(Optional<? extends AnalyticsState> optional) {
        AnalyticsState analyticsStateOrElse = optional.orElse(null);
        return this.state == analyticsStateOrElse ? this : new StrainScore(this.strainScore, this.scaledScore, this.kilojoules, this.avgHr, this.maxHr, this.projectedStrainScore, analyticsStateOrElse);
    }

    public final StrainScore withStrainScore(Optional<Double> optional) {
        Double dOrElse = optional.orElse(null);
        return Objects.equals(this.strainScore, dOrElse) ? this : new StrainScore(dOrElse, this.scaledScore, this.kilojoules, this.avgHr, this.maxHr, this.projectedStrainScore, this.state);
    }
}
