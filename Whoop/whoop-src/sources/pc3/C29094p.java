package pc3;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZoneOffset;
import kotlinx.datetime.FixedOffsetTimeZone;
import kotlinx.datetime.IllegalTimeZoneException;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.UtcOffset;
import p715kotlin.jvm.internal.AbstractC22676k;
import vc3.C35895n;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: pc3.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C29094p {
    /* JADX INFO: renamed from: a */
    public static TimeZone m88409a(String zoneId) throws Exception {
        AbstractC22676k.m65750j(zoneId, "zoneId");
        try {
            if (zoneId.equals("z")) {
                zoneId = "Z";
            }
            ZoneId zoneIdOf = ZoneId.of(zoneId);
            AbstractC22676k.m65749i(zoneIdOf, "of(...)");
            return m88410b(zoneIdOf);
        } catch (Exception e5) {
            if (e5 instanceof DateTimeException) {
                throw new IllegalTimeZoneException(e5);
            }
            throw e5;
        }
    }

    /* JADX INFO: renamed from: b */
    public static TimeZone m88410b(ZoneId zoneId) {
        boolean zIsFixedOffset;
        if (zoneId instanceof ZoneOffset) {
            return new FixedOffsetTimeZone(new UtcOffset((ZoneOffset) zoneId));
        }
        try {
            zIsFixedOffset = zoneId.getRules().isFixedOffset();
        } catch (ArrayIndexOutOfBoundsException unused) {
            zIsFixedOffset = false;
        }
        if (!zIsFixedOffset) {
            return new TimeZone(zoneId);
        }
        ZoneId zoneIdNormalized = zoneId.normalized();
        AbstractC22676k.m65748h(zoneIdNormalized, "null cannot be cast to non-null type java.time.ZoneOffset");
        return new FixedOffsetTimeZone(new UtcOffset((ZoneOffset) zoneIdNormalized), zoneId);
    }

    public final InterfaceC37138c serializer() {
        return C35895n.f152827a;
    }
}
