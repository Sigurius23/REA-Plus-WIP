package p715kotlin.time;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y82.EnumC39339b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\n\u0010\u0002\u001a\u00020\u0003H¦\u0080\u0004J\f\u0010\u0004\u001a\u0004\u0018\u00010\u0003H¦\u0080\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m65681d2 = {"Lkotlin/time/InstantParseResult;", "", "toInstant", "Lkotlin/time/Instant;", "toInstantOrNull", EnumC39339b.RESULT_SUCCESS, "Failure", "Lkotlin/time/InstantParseResult$Failure;", "Lkotlin/time/InstantParseResult$Success;", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
interface InstantParseResult {

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\bF\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\f\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0080\u0004R\u0015\u0010\u0002\u001a\u00020\u0003X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u00020\u0005X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m65681d2 = {"Lkotlin/time/InstantParseResult$Failure;", "Lkotlin/time/InstantParseResult;", "error", "", "input", "", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "getError", "()Ljava/lang/String;", "getInput", "()Ljava/lang/CharSequence;", "toInstant", "Lkotlin/time/Instant;", "toInstantOrNull", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Failure implements InstantParseResult {
        private final String error;
        private final CharSequence input;

        public Failure(String error, CharSequence input) {
            AbstractC22676k.m65750j(error, "error");
            AbstractC22676k.m65750j(input, "input");
            this.error = error;
            this.input = input;
        }

        public final String getError() {
            return this.error;
        }

        public final CharSequence getInput() {
            return this.input;
        }

        @Override // p715kotlin.time.InstantParseResult
        public Instant toInstant() {
            throw new InstantFormatException(this.error + " when parsing an Instant from \"" + InstantKt.truncateForErrorMessage(this.input, 64) + '\"');
        }

        @Override // p715kotlin.time.InstantParseResult
        public Instant toInstantOrNull() {
            return null;
        }
    }

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\bF\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\f\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0080\u0004R\u0015\u0010\u0002\u001a\u00020\u0003X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u00020\u0005X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m65681d2 = {"Lkotlin/time/InstantParseResult$Success;", "Lkotlin/time/InstantParseResult;", "epochSeconds", "", "nanosecondsOfSecond", "", "<init>", "(JI)V", "getEpochSeconds", "()J", "getNanosecondsOfSecond", "()I", "toInstant", "Lkotlin/time/Instant;", "toInstantOrNull", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Success implements InstantParseResult {
        private final long epochSeconds;
        private final int nanosecondsOfSecond;

        public Success(long j7, int i13) {
            this.epochSeconds = j7;
            this.nanosecondsOfSecond = i13;
        }

        public final long getEpochSeconds() {
            return this.epochSeconds;
        }

        public final int getNanosecondsOfSecond() {
            return this.nanosecondsOfSecond;
        }

        @Override // p715kotlin.time.InstantParseResult
        public Instant toInstant() {
            long j7 = this.epochSeconds;
            Instant.Companion companion = Instant.INSTANCE;
            if (j7 < companion.getMIN$kotlin_stdlib().getEpochSeconds() || this.epochSeconds > companion.getMAX$kotlin_stdlib().getEpochSeconds()) {
                throw new InstantFormatException(AbstractC2875y.m8302o(new StringBuilder("The parsed date is outside the range representable by Instant (Unix epoch second "), this.epochSeconds, ')'));
            }
            return companion.fromEpochSeconds(this.epochSeconds, this.nanosecondsOfSecond);
        }

        @Override // p715kotlin.time.InstantParseResult
        public Instant toInstantOrNull() {
            long j7 = this.epochSeconds;
            Instant.Companion companion = Instant.INSTANCE;
            if (j7 < companion.getMIN$kotlin_stdlib().getEpochSeconds() || this.epochSeconds > companion.getMAX$kotlin_stdlib().getEpochSeconds()) {
                return null;
            }
            return companion.fromEpochSeconds(this.epochSeconds, this.nanosecondsOfSecond);
        }
    }

    Instant toInstant();

    Instant toInstantOrNull();
}
