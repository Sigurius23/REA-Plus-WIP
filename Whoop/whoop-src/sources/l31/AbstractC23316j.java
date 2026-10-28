package l31;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fz0.C14889d;
import fz0.EnumC14890e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import n71.C26423d;
import n71.C26424e;
import n71.InterfaceC26425f;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l31.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\r\"\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004\"\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\u0004\"\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0003\u001a\u0004\b\n\u0010\u0004\"\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\f\u0010\u0004\"\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u0003\u001a\u0004\b\u000e\u0010\u0004\"\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0003\u001a\u0004\b\u0010\u0010\u0004\"\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u0012\u0010\u0004\"\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0006\u0010\u0004\"\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0015\u0010\u0004\"\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0003\u001a\u0004\b\t\u0010\u0004\"\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00008\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u001b\u0010\u0004\"\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001e\u0010\u0004\"\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b \u0010\u0003\u001a\u0004\b!\u0010\u0004\"\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b#\u0010\u0003\u001a\u0004\b$\u0010\u0004¨\u0006&"}, m65681d2 = {"", "Lfz0/d;", "a", "Ljava/util/List;", "()Ljava/util/List;", "activeHrZoneSample", "b", "d", "inActiveHrZoneSample", "c", "e", "zone1Sample", "f", "zone2Sample", "g", "zone3Sample", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "zone4Sample", "i", "zone5Sample", "heartRateZoneDisconnectedSampleList", "getHeartRateZoneSample123_158", "heartRateZoneSample123_158", "j", "heartRateZoneSample68_100", "Ln71/d;", "k", "getHeartRateMonitorSample", "heartRateMonitorSample", "l", "getHeartRateZoneSample184_194", "heartRateZoneSample184_194", "m", "getHeartRateZoneSample129_196", "heartRateZoneSample129_196", "n", "getHeartRateZoneSample83_220", "heartRateZoneSample83_220", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23316j {

    /* JADX INFO: renamed from: a */
    private static final List<C14889d> f92419a;

    /* JADX INFO: renamed from: b */
    private static final List<C14889d> f92420b;

    /* JADX INFO: renamed from: c */
    private static final List<C14889d> f92421c;

    /* JADX INFO: renamed from: d */
    private static final List<C14889d> f92422d;

    /* JADX INFO: renamed from: e */
    private static final List<C14889d> f92423e;

    /* JADX INFO: renamed from: f */
    private static final List<C14889d> f92424f;

    /* JADX INFO: renamed from: g */
    private static final List<C14889d> f92425g;

    /* JADX INFO: renamed from: h */
    private static final List<C14889d> f92426h;

    /* JADX INFO: renamed from: i */
    private static final List<C14889d> f92427i;

    /* JADX INFO: renamed from: j */
    private static final List<C14889d> f92428j;

    /* JADX INFO: renamed from: k */
    private static final List<C26423d> f92429k;

    /* JADX INFO: renamed from: l */
    private static final List<C14889d> f92430l;

    /* JADX INFO: renamed from: m */
    private static final List<C14889d> f92431m;

    /* JADX INFO: renamed from: n */
    private static final List<C14889d> f92432n;

    static {
        EnumC14890e enumC14890e = EnumC14890e.Left;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("40-50%");
        EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
        C14889d c14889d = new C14889d(enumC14890e, textResourceM21278l, enumC39333f, false, 0.0f, 0.0f, 0.2f, 48, null);
        EnumC14890e enumC14890e2 = EnumC14890e.Middle;
        C14889d c14889d2 = new C14889d(enumC14890e2, AbstractC8693b.m21278l("60-70%"), enumC39333f, false, 0.0f, 0.0f, 0.2f, 48, null);
        EnumC14890e enumC14890e3 = EnumC14890e.Right;
        f92419a = AbstractC37056f.m118959K(c14889d, c14889d2, new C14889d(enumC14890e3, AbstractC8693b.m21278l("90-100%"), enumC39333f, false, 0.0f, 0.0f, 0.2f, 48, null));
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("40-50%");
        EnumC39333f enumC39333f2 = EnumC39333f.WHITE_20;
        f92420b = AbstractC37056f.m118959K(new C14889d(enumC14890e, textResourceM21278l2, enumC39333f2, false, 0.0f, 0.0f, 0.2f, 48, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("60-70%"), enumC39333f2, false, 0.0f, 0.0f, 0.2f, 48, null), new C14889d(enumC14890e3, AbstractC8693b.m21278l("90-100%"), enumC39333f2, false, 0.0f, 0.0f, 0.2f, 48, null));
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("40-50%");
        EnumC39333f enumC39333f3 = EnumC39333f.STRAIN_ZONE_1;
        f92421c = AbstractC37056f.m118959K(new C14889d(enumC14890e, textResourceM21278l3, enumC39333f3, false, 0.0f, 0.0f, 0.2f, 48, null), new C14889d(enumC14890e3, AbstractC8693b.m21278l("90-100%"), enumC39333f3, false, 0.0f, 0.0f, 0.2f, 48, null));
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("40-50%");
        EnumC39333f enumC39333f4 = EnumC39333f.STRAIN_ZONE_2;
        f92422d = AbstractC37056f.m118959K(new C14889d(enumC14890e, textResourceM21278l4, enumC39333f4, false, 0.0f, 0.0f, 0.2f, 48, null), new C14889d(enumC14890e3, AbstractC8693b.m21278l("90-100%"), enumC39333f4, false, 0.0f, 0.0f, 0.2f, 48, null));
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l("40-50%");
        EnumC39333f enumC39333f5 = EnumC39333f.STRAIN_ZONE_3;
        f92423e = AbstractC37056f.m118959K(new C14889d(enumC14890e, textResourceM21278l5, enumC39333f5, false, 0.0f, 0.0f, 0.2f, 48, null), new C14889d(enumC14890e3, AbstractC8693b.m21278l("90-100%"), enumC39333f5, false, 0.0f, 0.0f, 0.2f, 48, null));
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l("40-50%");
        EnumC39333f enumC39333f6 = EnumC39333f.STRAIN_ZONE_4;
        f92424f = AbstractC37056f.m118959K(new C14889d(enumC14890e, textResourceM21278l6, enumC39333f6, false, 0.0f, 0.0f, 0.2f, 48, null), new C14889d(enumC14890e3, AbstractC8693b.m21278l("90-100%"), enumC39333f6, false, 0.0f, 0.0f, 0.2f, 48, null));
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l("40-50%");
        EnumC39333f enumC39333f7 = EnumC39333f.STRAIN_ZONE_5;
        f92425g = AbstractC37056f.m118959K(new C14889d(enumC14890e, textResourceM21278l7, enumC39333f7, false, 0.0f, 0.0f, 0.2f, 48, null), new C14889d(enumC14890e3, AbstractC8693b.m21278l("90-100%"), enumC39333f7, false, 0.0f, 0.0f, 0.2f, 48, null));
        float f13 = 4;
        float f14 = 2 * f13;
        List<C14889d> listM118959K = AbstractC37056f.m118959K(new C14889d(enumC14890e, AbstractC8693b.m21278l("Zone 0"), EnumC39333f.WHITE_70, false, 0.0f, f14, 0.2f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 1"), enumC39333f3, false, 0.0f, f14, 0.2f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 2"), enumC39333f4, false, 0.3f, f14, 0.2f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 3"), enumC39333f5, false, 0.0f, f14, 0.2f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 4"), enumC39333f6, false, 0.2f, f14, 0.2f, null), new C14889d(enumC14890e3, AbstractC8693b.m21278l("Zone 5"), enumC39333f7, false, 0.0f, f14, 0.2f, null));
        f92426h = listM118959K;
        List<C14889d> listM118959K2 = AbstractC37056f.m118959K(new C14889d(enumC14890e, AbstractC8693b.m21278l("Zone 0"), enumC39333f, false, 0.0f, f14, 1.0f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 1"), enumC39333f3, false, 0.0f, f14, 1.0f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 2"), enumC39333f4, false, 0.3f, f14, 1.0f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 3"), enumC39333f5, true, 0.84f, f14, 1.0f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 4"), enumC39333f6, false, 0.2f, f14, 0.2f, null), new C14889d(enumC14890e3, AbstractC8693b.m21278l("Zone 5"), enumC39333f7, false, 0.0f, f14, 0.2f, null));
        f92427i = listM118959K2;
        List<C14889d> listM118959K3 = AbstractC37056f.m118959K(new C14889d(enumC14890e, AbstractC8693b.m21278l("Zone 0"), enumC39333f, false, 0.0f, f14, 1.0f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 1"), enumC39333f3, false, 0.0f, f14, 1.0f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 2"), enumC39333f4, true, 0.84f, f14, 1.0f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 3"), enumC39333f5, false, 0.0f, f14, 0.2f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 4"), enumC39333f6, false, 0.2f, f14, 0.2f, null), new C14889d(enumC14890e3, AbstractC8693b.m21278l("Zone 5"), enumC39333f7, false, 0.0f, f14, 0.2f, null));
        f92428j = listM118959K3;
        float f15 = ((float) 1.5d) * f13;
        float f16 = 1;
        f92429k = AbstractC37056f.m118959K(new C26423d(new InterfaceC26425f.a(123, 158, listM118959K2), new C26424e(AbstractC8693b.m21278l("STAT TITLE"), false, 2, null), f15, f16, null), new C26423d(new InterfaceC26425f.a(68, 100, listM118959K3), null, f15, f16, 2, null), new C26423d(new InterfaceC26425f.a(68, 100, listM118959K3), new C26424e(null, false, 1, null), 0.0f, 0.0f, 12, null), new C26423d(new InterfaceC26425f.b(listM118959K), new C26424e(null, false, 3, null), 0.0f, 0.0f, 12, null), new C26423d(new InterfaceC26425f.b(listM118959K), null, 0.0f, 0.0f, 14, null), new C26423d(new InterfaceC26425f.b(listM118959K), new C26424e(AbstractC8693b.m21278l("NO DATA"), false), 0.0f, 0.0f, 12, null));
        f92430l = AbstractC37056f.m118959K(new C14889d(enumC14890e, AbstractC8693b.m21278l("Zone 0"), enumC39333f, false, 0.0f, f14, 1.0f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 1"), enumC39333f3, false, 0.0f, f14, 1.0f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 2"), enumC39333f4, false, 0.0f, f14, 1.0f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 3"), enumC39333f5, false, 0.0f, f14, 1.0f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 4"), enumC39333f6, false, 0.0f, f14, 1.0f, null), new C14889d(enumC14890e3, AbstractC8693b.m21278l("Zone 5"), enumC39333f7, true, 0.48f, f14, 1.0f, null));
        f92431m = AbstractC37056f.m118959K(new C14889d(enumC14890e, AbstractC8693b.m21278l("Zone 0"), enumC39333f, false, 0.0f, f14, 1.0f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 1"), enumC39333f3, false, 0.0f, f14, 1.0f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 2"), enumC39333f4, true, 0.58f, f14, 1.0f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 3"), enumC39333f5, false, 0.0f, f14, 0.2f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 4"), enumC39333f6, false, 0.0f, f14, 0.2f, null), new C14889d(enumC14890e3, AbstractC8693b.m21278l("Zone 5"), enumC39333f7, false, 0.0f, f14, 0.2f, null));
        f92432n = AbstractC37056f.m118959K(new C14889d(enumC14890e, AbstractC8693b.m21278l("Zone 0"), enumC39333f, true, 0.76f, f14, 1.0f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 1"), enumC39333f3, false, 0.0f, f14, 0.2f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 2"), enumC39333f4, false, 0.0f, f14, 0.2f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 3"), enumC39333f5, false, 0.0f, f14, 0.2f, null), new C14889d(enumC14890e2, AbstractC8693b.m21278l("Zone 4"), enumC39333f6, false, 0.0f, f14, 0.2f, null), new C14889d(enumC14890e3, AbstractC8693b.m21278l("Zone 5"), enumC39333f7, false, 0.0f, f14, 0.2f, null));
    }

    /* JADX INFO: renamed from: a */
    public static final List<C14889d> m67494a() {
        return f92419a;
    }

    /* JADX INFO: renamed from: b */
    public static final List<C14889d> m67495b() {
        return f92426h;
    }

    /* JADX INFO: renamed from: c */
    public static final List<C14889d> m67496c() {
        return f92428j;
    }

    /* JADX INFO: renamed from: d */
    public static final List<C14889d> m67497d() {
        return f92420b;
    }

    /* JADX INFO: renamed from: e */
    public static final List<C14889d> m67498e() {
        return f92421c;
    }

    /* JADX INFO: renamed from: f */
    public static final List<C14889d> m67499f() {
        return f92422d;
    }

    /* JADX INFO: renamed from: g */
    public static final List<C14889d> m67500g() {
        return f92423e;
    }

    /* JADX INFO: renamed from: h */
    public static final List<C14889d> m67501h() {
        return f92424f;
    }

    /* JADX INFO: renamed from: i */
    public static final List<C14889d> m67502i() {
        return f92425g;
    }
}
