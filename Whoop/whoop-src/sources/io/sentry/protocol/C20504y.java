package io.sentry.protocol;

import androidx.core.app.NotificationCompat;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import ih0.AbstractC18489d0;
import io.sentry.AbstractC20576u4;
import io.sentry.C20314d7;
import io.sentry.C20323e7;
import io.sentry.C20353h7;
import io.sentry.EnumC20374i7;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p098dt.AbstractC12350b;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C20504y implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public final C20353h7 f76811E;

    /* JADX INFO: renamed from: F */
    public final String f76812F;

    /* JADX INFO: renamed from: G */
    public final String f76813G;

    /* JADX INFO: renamed from: H */
    public final EnumC20374i7 f76814H;

    /* JADX INFO: renamed from: I */
    public final String f76815I;

    /* JADX INFO: renamed from: J */
    public final Map f76816J;

    /* JADX INFO: renamed from: K */
    public Map f76817K;

    /* JADX INFO: renamed from: L */
    public final Map f76818L;

    /* JADX INFO: renamed from: M */
    public ConcurrentHashMap f76819M;

    /* JADX INFO: renamed from: w */
    public final Double f76820w;

    /* JADX INFO: renamed from: x */
    public final Double f76821x;

    /* JADX INFO: renamed from: y */
    public final C20501v f76822y;

    /* JADX INFO: renamed from: z */
    public final C20353h7 f76823z;

    public C20504y(Double d3, Double d14, C20501v c20501v, C20353h7 c20353h7, C20353h7 c20353h8, String str, String str2, EnumC20374i7 enumC20374i7, String str3, Map map, Map map2, Map map3) {
        this.f76820w = d3;
        this.f76821x = d14;
        this.f76822y = c20501v;
        this.f76823z = c20353h7;
        this.f76811E = c20353h8;
        this.f76812F = str;
        this.f76813G = str2;
        this.f76814H = enumC20374i7;
        this.f76815I = str3;
        this.f76816J = map;
        this.f76818L = map2;
        this.f76817K = map3;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.f76820w.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        c37199o.m119219Y(interfaceC20602v0, bigDecimalValueOf.setScale(6, roundingMode));
        Double d3 = this.f76821x;
        if (d3 != null) {
            c37199o.m119207K("timestamp");
            c37199o.m119219Y(interfaceC20602v0, BigDecimal.valueOf(d3.doubleValue()).setScale(6, roundingMode));
        }
        c37199o.m119207K("trace_id");
        c37199o.m119219Y(interfaceC20602v0, this.f76822y);
        c37199o.m119207K("span_id");
        c37199o.m119219Y(interfaceC20602v0, this.f76823z);
        C20353h7 c20353h7 = this.f76811E;
        if (c20353h7 != null) {
            c37199o.m119207K("parent_span_id");
            c37199o.m119219Y(interfaceC20602v0, c20353h7);
        }
        c37199o.m119207K("op");
        c37199o.m119222b0(this.f76812F);
        String str = this.f76813G;
        if (str != null) {
            c37199o.m119207K("description");
            c37199o.m119222b0(str);
        }
        EnumC20374i7 enumC20374i7 = this.f76814H;
        if (enumC20374i7 != null) {
            c37199o.m119207K(NotificationCompat.CATEGORY_STATUS);
            c37199o.m119219Y(interfaceC20602v0, enumC20374i7);
        }
        String str2 = this.f76815I;
        if (str2 != null) {
            c37199o.m119207K(AnalyticsRequestV2.HEADER_ORIGIN);
            c37199o.m119219Y(interfaceC20602v0, str2);
        }
        Map map = this.f76816J;
        if (!map.isEmpty()) {
            c37199o.m119207K("tags");
            c37199o.m119219Y(interfaceC20602v0, map);
        }
        if (this.f76817K != null) {
            c37199o.m119207K("data");
            c37199o.m119219Y(interfaceC20602v0, this.f76817K);
        }
        Map map2 = this.f76818L;
        if (!map2.isEmpty()) {
            c37199o.m119207K("measurements");
            c37199o.m119219Y(interfaceC20602v0, map2);
        }
        ConcurrentHashMap concurrentHashMap = this.f76819M;
        if (concurrentHashMap != null) {
            for (String str3 : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76819M, str3, c37199o, str3, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }

    public C20504y(C20314d7 c20314d7) {
        ConcurrentHashMap concurrentHashMap = c20314d7.f76284k;
        C20323e7 c20323e7 = c20314d7.f76276c;
        this.f76813G = c20323e7.f76311F;
        this.f76812F = c20323e7.f76310E;
        this.f76823z = c20323e7.f76322x;
        this.f76811E = c20323e7.f76323y;
        this.f76822y = c20323e7.f76321w;
        this.f76814H = c20323e7.f76312G;
        this.f76815I = c20323e7.f76314I;
        ConcurrentHashMap concurrentHashMapM34553B = AbstractC12350b.m34553B(c20323e7.f76313H);
        this.f76816J = concurrentHashMapM34553B == null ? new ConcurrentHashMap() : concurrentHashMapM34553B;
        ConcurrentHashMap concurrentHashMapM34553B2 = AbstractC12350b.m34553B(c20314d7.f76285l);
        this.f76818L = concurrentHashMapM34553B2 == null ? new ConcurrentHashMap() : concurrentHashMapM34553B2;
        AbstractC20576u4 abstractC20576u4 = c20314d7.f76275b;
        this.f76821x = abstractC20576u4 == null ? null : Double.valueOf(c20314d7.f76274a.mo56693c(abstractC20576u4) / 1.0E9d);
        this.f76820w = Double.valueOf(c20314d7.f76274a.mo56606d() / 1.0E9d);
        this.f76817K = concurrentHashMap;
        c20323e7.f76319N.mo1873r();
    }
}
