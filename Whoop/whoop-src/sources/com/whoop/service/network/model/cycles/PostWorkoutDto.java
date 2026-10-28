package com.whoop.service.network.model.cycles;

import ih0.AbstractC18489d0;

/* JADX INFO: loaded from: classes10.dex */
public class PostWorkoutDto {
    Period during;
    boolean gpsEnabled;
    public String source;
    int sportId;
    String timezoneOffset;

    public static class PostWorkoutDtoBuilder {
        private Period during;
        private boolean gpsEnabled;
        private String source;
        private int sportId;
        private String timezoneOffset;

        public PostWorkoutDto build() {
            return new PostWorkoutDto(this.during, this.timezoneOffset, this.sportId, this.source, this.gpsEnabled);
        }

        public PostWorkoutDtoBuilder during(Period period) {
            this.during = period;
            return this;
        }

        public PostWorkoutDtoBuilder gpsEnabled(boolean z4) {
            this.gpsEnabled = z4;
            return this;
        }

        public PostWorkoutDtoBuilder source(String str) {
            this.source = str;
            return this;
        }

        public PostWorkoutDtoBuilder sportId(int i13) {
            this.sportId = i13;
            return this;
        }

        public PostWorkoutDtoBuilder timezoneOffset(String str) {
            this.timezoneOffset = str;
            return this;
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PostWorkoutDto.PostWorkoutDtoBuilder(during=");
            sb4.append(this.during);
            sb4.append(", timezoneOffset=");
            sb4.append(this.timezoneOffset);
            sb4.append(", sportId=");
            sb4.append(this.sportId);
            sb4.append(", source=");
            sb4.append(this.source);
            sb4.append(this.sportId);
            sb4.append(", gpsEnabled=");
            return AbstractC18489d0.m53372m(sb4, this.gpsEnabled, ")");
        }
    }

    public PostWorkoutDto(Period period, String str, int i13, String str2, boolean z4) {
        this.during = period;
        this.timezoneOffset = str;
        this.sportId = i13;
        this.source = str2;
        this.gpsEnabled = z4;
    }

    public static PostWorkoutDtoBuilder builder() {
        return new PostWorkoutDtoBuilder();
    }
}
