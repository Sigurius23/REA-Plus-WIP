package kotlinx.datetime;

import com.mapbox.maps.MapboxMap;
import java.time.ZoneId;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pc3.C29083e;
import vc3.C35889h;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m65681d2 = {"Lkotlinx/datetime/FixedOffsetTimeZone;", "Lkotlinx/datetime/TimeZone;", "Lkotlinx/datetime/UtcOffset;", MapboxMap.QFE_OFFSET, "Ljava/time/ZoneId;", "zoneId", "<init>", "(Lkotlinx/datetime/UtcOffset;Ljava/time/ZoneId;)V", "(Lkotlinx/datetime/UtcOffset;)V", "Lkotlinx/datetime/UtcOffset;", "getOffset", "()Lkotlinx/datetime/UtcOffset;", "", "getTotalSeconds", "()I", "getTotalSeconds$annotations", "()V", "totalSeconds", "Companion", "pc3/e", "kotlinx-datetime"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i(with = C35889h.class)
public final class FixedOffsetTimeZone extends TimeZone {
    public static final C29083e Companion = new C29083e();
    private final UtcOffset offset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedOffsetTimeZone(UtcOffset offset, ZoneId zoneId) {
        super(zoneId);
        AbstractC22676k.m65750j(offset, "offset");
        AbstractC22676k.m65750j(zoneId, "zoneId");
        this.offset = offset;
    }

    @InterfaceC23457c
    public static /* synthetic */ void getTotalSeconds$annotations() {
    }

    public final UtcOffset getOffset() {
        return this.offset;
    }

    public final int getTotalSeconds() {
        return this.offset.getTotalSeconds();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FixedOffsetTimeZone(UtcOffset offset) {
        this(offset, offset.getZoneOffset());
        AbstractC22676k.m65750j(offset, "offset");
    }
}
