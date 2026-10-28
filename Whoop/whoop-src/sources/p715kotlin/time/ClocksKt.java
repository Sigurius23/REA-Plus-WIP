package p715kotlin.time;

import com.stripe.android.core.networking.AnalyticsRequestV2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004¢\u0006\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"asClock", "Lkotlin/time/Clock;", "Lkotlin/time/TimeSource;", AnalyticsRequestV2.HEADER_ORIGIN, "Lkotlin/time/Instant;", "fromTimeSource", "kotlin-stdlib"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ClocksKt {
    public static final Clock fromTimeSource(final TimeSource timeSource, final Instant origin) {
        AbstractC22676k.m65750j(timeSource, "<this>");
        AbstractC22676k.m65750j(origin, "origin");
        return new Clock(timeSource, origin) { // from class: kotlin.time.ClocksKt$asClock$1
            final /* synthetic */ Instant $origin;
            private final TimeMark startMark;

            {
                this.$origin = origin;
                this.startMark = timeSource.markNow();
            }

            @Override // p715kotlin.time.Clock
            public Instant now() {
                return this.$origin.m134367plusLRDsOJo(this.startMark.mo134250elapsedNowUwyO8pc());
            }
        };
    }
}
