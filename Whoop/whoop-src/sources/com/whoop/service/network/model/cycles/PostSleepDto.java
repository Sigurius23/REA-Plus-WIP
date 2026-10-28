package com.whoop.service.network.model.cycles;

/* JADX INFO: loaded from: classes10.dex */
public class PostSleepDto {
    Period during;
    boolean isNap;
    String timezoneOffset;

    public static class PostSleepDtoBuilder {
        private Period during;
        private boolean isNap;
        private String timezoneOffset;

        public PostSleepDto build() {
            return new PostSleepDto(this.during, this.timezoneOffset, this.isNap);
        }

        public PostSleepDtoBuilder during(Period period) {
            this.during = period;
            return this;
        }

        public PostSleepDtoBuilder isNap(boolean z4) {
            this.isNap = z4;
            return this;
        }

        public PostSleepDtoBuilder timezoneOffset(String str) {
            this.timezoneOffset = str;
            return this;
        }
    }

    public PostSleepDto(Period period, String str, boolean z4) {
        this.during = period;
        this.timezoneOffset = str;
        this.isNap = z4;
    }

    public static PostSleepDtoBuilder builder() {
        return new PostSleepDtoBuilder();
    }
}
