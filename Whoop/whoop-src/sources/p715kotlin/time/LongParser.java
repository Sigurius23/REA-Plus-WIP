package p715kotlin.time;

import live.hms.video.utils.HMSConstantsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JP\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, m65681d2 = {"Lkotlin/time/LongParser;", "", "", "overflowLimit", "", "allowSign", "<init>", "(JZ)V", "", "value", "", "startIndex", "Lkotlin/Function3;", "Ll83/a0;", "callback", "parse", "(Ljava/lang/String;ILkotlin/jvm/functions/Function3;)J", "J", "Z", "overflowThreshold", "lastDigitMax", "Companion", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LongParser {
    private final boolean allowSign;
    private final long lastDigitMax;
    private final long overflowLimit;
    private final long overflowThreshold;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final LongParser iso = new LongParser(DurationKt.MAX_MILLIS, true);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final LongParser f177991default = new LongParser(Long.MAX_VALUE, false);

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0004\u001a\u00020\u0005X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\b\u001a\u00020\u0005X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m65681d2 = {"Lkotlin/time/LongParser$Companion;", "", "<init>", "()V", "iso", "Lkotlin/time/LongParser;", "getIso", "()Lkotlin/time/LongParser;", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "getDefault", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LongParser getDefault() {
            return LongParser.f177991default;
        }

        public final LongParser getIso() {
            return LongParser.iso;
        }

        private Companion() {
        }
    }

    private LongParser(long j7, boolean z4) {
        this.overflowLimit = j7;
        this.allowSign = z4;
        long j13 = 10;
        this.overflowThreshold = j7 / j13;
        this.lastDigitMax = j7 % j13;
    }

    public final long parse(String value, int startIndex, Function3 callback) {
        int i13;
        char cCharAt;
        char cCharAt2;
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(callback, "callback");
        if (this.allowSign) {
            char cCharAt3 = value.charAt(startIndex);
            if (cCharAt3 == '+') {
                startIndex++;
            } else if (cCharAt3 == '-') {
                startIndex++;
                i13 = -1;
            }
            i13 = 1;
        } else {
            i13 = 1;
        }
        while (startIndex < value.length() && value.charAt(startIndex) == '0') {
            startIndex++;
        }
        long j7 = 0;
        while (startIndex < value.length() && '0' <= (cCharAt = value.charAt(startIndex)) && cCharAt < ':') {
            int i14 = cCharAt - '0';
            if (j7 > this.overflowThreshold || (j7 == this.overflowThreshold && i14 > this.lastDigitMax)) {
                while (startIndex < value.length() && '0' <= (cCharAt2 = value.charAt(startIndex)) && cCharAt2 < ':') {
                    startIndex++;
                }
                callback.invoke(Integer.valueOf(startIndex), Integer.valueOf(i13), Boolean.TRUE);
                return this.overflowLimit;
            }
            j7 = ((long) i14) + (j7 << 3) + (j7 << 1);
            startIndex++;
        }
        callback.invoke(Integer.valueOf(startIndex), Integer.valueOf(i13), Boolean.FALSE);
        return j7;
    }
}
