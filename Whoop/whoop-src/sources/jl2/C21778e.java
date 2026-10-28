package jl2;

import al2.AbstractC0988d;
import c41.C4092p2;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.training.data.network.response.hrsettings.ZoneRow;
import gz0.EnumC16313m0;
import hl2.InterfaceC17406a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.EnumC33227v1;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: jl2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J3\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0002¢\u0006\u0004\b$\u0010%J?\u0010*\u001a\u0004\u0018\u00010#2\u0006\u0010'\u001a\u00020&2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010(2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b*\u0010+¨\u0006,"}, m65681d2 = {"Ljl2/e;", "", "<init>", "()V", "Ljl2/a;", "id", "Lsz0/v1;", "type", "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;", "recommendedZoneRow", "Lcom/whoop/design/util/TextResource;", "b", "(Ljl2/a;Lsz0/v1;Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;)Lcom/whoop/design/util/TextResource;", "", "min", "max", "c", "(Ljl2/a;II)Lcom/whoop/design/util/TextResource;", "g", "(Ljl2/a;)I", "f", "e", "", "zoneId", "maxHr", "rhr", "Ll83/k;", "d", "(Ljava/lang/String;II)Ll83/k;", "Lgz0/m0;", "icon", "description", "Ly81/e;", "backgroundColor", "contentColor", "Lc41/p2;", "a", "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;)Lc41/p2;", "Lhl2/a;", "currentBottomSheetDomainState", "", "defaultZoneRows", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lhl2/a;Ljava/util/List;Ljl2/a;I)Lc41/p2;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21778e {

    /* JADX INFO: renamed from: jl2.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f83893a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f83894b;

        static {
            int[] iArr = new int[EnumC33227v1.values().length];
            try {
                iArr[EnumC33227v1.MANUAL_ZONE_MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC33227v1.MANUAL_ZONE_MAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f83893a = iArr;
            int[] iArr2 = new int[EnumC21774a.values().length];
            try {
                iArr2[EnumC21774a.ZONE_5.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC21774a.ZONE_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC21774a.ZONE_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC21774a.ZONE_2.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC21774a.ZONE_1.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f83894b = iArr2;
        }
    }

    /* JADX INFO: renamed from: jl2.e$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f83895w = new b();

        /* JADX INFO: renamed from: a */
        public final long m61608a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m61608a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: jl2.e$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f83896w = new c();

        /* JADX INFO: renamed from: a */
        public final long m61609a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m61609a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: jl2.e$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f83897w = new d();

        /* JADX INFO: renamed from: a */
        public final long m61610a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m61610a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: jl2.e$e */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f83898w = new e();

        /* JADX INFO: renamed from: a */
        public final long m61611a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m61611a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: jl2.e$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f83899w = new f();

        /* JADX INFO: renamed from: a */
        public final long m61612a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m61612a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: jl2.e$g */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f83900w = new g();

        /* JADX INFO: renamed from: a */
        public final long m61613a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m61613a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    private final C4092p2 m61599a(EnumC16313m0 icon, TextResource description, InterfaceC39332e backgroundColor, InterfaceC39332e contentColor) {
        return new C4092p2(icon, 0.0f, null, null, description, null, backgroundColor, null, contentColor, null, null, null, null, false, null, null, null, null, null, null, 1048238, null);
    }

    /* JADX INFO: renamed from: b */
    private final TextResource m61600b(EnumC21774a id4, EnumC33227v1 type, ZoneRow recommendedZoneRow) {
        int i13 = a.f83893a[type.ordinal()];
        if (i13 == 1) {
            return new TextResource.C8688b(m61605g(id4), new TextResource.AbstractC8690d.b(Integer.valueOf(recommendedZoneRow.getMin())));
        }
        if (i13 == 2) {
            return new TextResource.C8688b(m61604f(id4), new TextResource.AbstractC8690d.b(Integer.valueOf(recommendedZoneRow.getMax())));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    private final TextResource m61601c(EnumC21774a id4, int min, int max) {
        return new TextResource.C8688b(m61603e(id4), new TextResource.AbstractC8690d.b(Integer.valueOf(min)), new TextResource.AbstractC8690d.b(Integer.valueOf(max)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    private final C23465k m61602d(String zoneId, int maxHr, int rhr) {
        switch (zoneId.hashCode()) {
            case -1642992546:
                if (zoneId.equals("ZONE_1")) {
                    double d3 = maxHr;
                    return new C23465k(Integer.valueOf(Math.max(rhr, (int) (0.5d * d3))), Integer.valueOf((int) (d3 * 0.75d)));
                }
                break;
            case -1642992545:
                if (zoneId.equals("ZONE_2")) {
                    double d14 = maxHr;
                    return new C23465k(Integer.valueOf(Math.max(rhr, (int) (0.55d * d14))), Integer.valueOf((int) (d14 * 0.85d)));
                }
                break;
            case -1642992544:
                if (zoneId.equals("ZONE_3")) {
                    double d15 = maxHr;
                    return new C23465k(Integer.valueOf(Math.max(rhr, (int) (0.65d * d15))), Integer.valueOf((int) (d15 * 0.9d)));
                }
                break;
            case -1642992543:
                if (zoneId.equals("ZONE_4")) {
                    double d16 = maxHr;
                    return new C23465k(Integer.valueOf(Math.max(rhr, (int) (0.75d * d16))), Integer.valueOf((int) (d16 * 0.95d)));
                }
                break;
            case -1642992542:
                if (zoneId.equals("ZONE_5")) {
                    return new C23465k(Integer.valueOf(Math.max(rhr, (int) (((double) maxHr) * 0.85d))), Integer.valueOf(maxHr));
                }
                break;
        }
        return new C23465k(0, Integer.valueOf(maxHr));
    }

    /* JADX INFO: renamed from: e */
    private final int m61603e(EnumC21774a id4) {
        int i13 = a.f83894b[id4.ordinal()];
        if (i13 == 1) {
            return AbstractC0988d.f3651F;
        }
        if (i13 == 2) {
            return AbstractC0988d.f3648C;
        }
        if (i13 == 3) {
            return AbstractC0988d.f3708z;
        }
        if (i13 == 4) {
            return AbstractC0988d.f3705w;
        }
        if (i13 == 5) {
            return AbstractC0988d.f3702t;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    private final int m61604f(EnumC21774a id4) {
        int i13 = a.f83894b[id4.ordinal()];
        if (i13 == 1) {
            return AbstractC0988d.f3649D;
        }
        if (i13 == 2) {
            return AbstractC0988d.f3646A;
        }
        if (i13 == 3) {
            return AbstractC0988d.f3706x;
        }
        if (i13 == 4) {
            return AbstractC0988d.f3703u;
        }
        if (i13 == 5) {
            return AbstractC0988d.f3700r;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    private final int m61605g(EnumC21774a id4) {
        int i13 = a.f83894b[id4.ordinal()];
        if (i13 == 1) {
            return AbstractC0988d.f3650E;
        }
        if (i13 == 2) {
            return AbstractC0988d.f3647B;
        }
        if (i13 == 3) {
            return AbstractC0988d.f3707y;
        }
        if (i13 == 4) {
            return AbstractC0988d.f3704v;
        }
        if (i13 == 5) {
            return AbstractC0988d.f3701s;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C4092p2 m61606i(C21778e c21778e, InterfaceC17406a interfaceC17406a, List list, EnumC21774a enumC21774a, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            list = null;
        }
        if ((i14 & 4) != 0) {
            enumC21774a = null;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return c21778e.m61607h(interfaceC17406a, list, enumC21774a, i13);
    }

    /* JADX INFO: renamed from: h */
    public final C4092p2 m61607h(InterfaceC17406a currentBottomSheetDomainState, List<ZoneRow> defaultZoneRows, EnumC21774a zoneId, int rhr) {
        Object next;
        Object next2;
        AbstractC22676k.m65750j(currentBottomSheetDomainState, "currentBottomSheetDomainState");
        if (currentBottomSheetDomainState instanceof InterfaceC17406a.a) {
            return m61599a(EnumC16313m0.TINY_INFORMATION, AbstractC8693b.m21277k(AbstractC0988d.f3694l), p745y81.Function1.m125323a(b.f83895w), p745y81.Function1.m125323a(c.f83896w));
        }
        if (!(currentBottomSheetDomainState instanceof InterfaceC17406a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        List<ZoneRow> list = defaultZoneRows;
        if (list == null || list.isEmpty() || zoneId == null) {
            return null;
        }
        List<ZoneRow> list2 = defaultZoneRows;
        Iterator<T> it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((ZoneRow) next).getId(), ((InterfaceC17406a.b) currentBottomSheetDomainState).getId()));
        ZoneRow zoneRow = (ZoneRow) next;
        Iterator<T> it3 = list2.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!AbstractC22676k.m65745e(((ZoneRow) next2).getId(), "ZONE_5"));
        ZoneRow zoneRow2 = (ZoneRow) next2;
        InterfaceC17406a.b bVar = (InterfaceC17406a.b) currentBottomSheetDomainState;
        C23465k c23465kM61602d = m61602d(bVar.getId(), zoneRow2 != null ? zoneRow2.getMax() : 220, rhr);
        int value = bVar.getValue();
        Object obj = c23465kM61602d.f92937w;
        Object obj2 = c23465kM61602d.f92938x;
        if (value < ((Number) obj).intValue() || bVar.getValue() > ((Number) obj2).intValue()) {
            return m61599a(EnumC16313m0.TINY_ATTENTION_ORANGE, m61601c(zoneId, ((Number) c23465kM61602d.f92937w).intValue(), ((Number) obj2).intValue()), p745y81.Function1.m125323a(d.f83897w), p745y81.Function1.m125323a(e.f83898w));
        }
        if (zoneRow != null) {
            return m61599a(EnumC16313m0.TINY_INFORMATION, m61600b(zoneId, bVar.getType(), zoneRow), p745y81.Function1.m125323a(f.f83899w), p745y81.Function1.m125323a(g.f83900w));
        }
        return null;
    }
}
