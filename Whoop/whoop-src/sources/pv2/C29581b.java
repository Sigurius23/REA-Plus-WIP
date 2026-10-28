package pv2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.hrZones.network.ZoneID;
import cu2.AbstractC11128h;
import dq1.C12288a;
import e93.AbstractC12889b;
import fz0.C14889d;
import fz0.EnumC14890e;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23471q;
import m83.AbstractC25267u;
import or2.AbstractC28145a1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: pv2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lpv2/b;", "", "<init>", "()V", "Ldq1/a;", "zone", "", "currentHeartRate", "Lfz0/d;", "b", "(Ldq1/a;Ljava/lang/Integer;)Lfz0/d;", "", "c", "(Ljava/lang/Integer;Ldq1/a;)F", "a", "(Ldq1/a;I)F", "", "hrZones", "Lpv2/a;", "d", "(Ljava/util/List;Ljava/lang/Integer;)Lpv2/a;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29581b {

    /* JADX INFO: renamed from: pv2.b$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f120740a;

        static {
            int[] iArr = new int[ZoneID.values().length];
            try {
                iArr[ZoneID.ZONE_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ZoneID.ZONE_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ZoneID.ZONE_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ZoneID.ZONE_3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ZoneID.ZONE_4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ZoneID.ZONE_5.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f120740a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    private final float m90689a(C12288a c12288a, int i13) {
        if (i13 < c12288a.getMin()) {
            return 0.0f;
        }
        return AbstractC12889b.m36283m(AbstractC28145a1.m85170f((i13 - c12288a.getMin()) / (c12288a.getMax() - c12288a.getMin()), 0.01f), 0.0f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b2  */
    /* JADX INFO: renamed from: b */
    private final C14889d m90690b(C12288a zone, Integer currentHeartRate) {
        C23471q c23471q;
        boolean z4;
        ZoneID zoneID = zone.getZoneID();
        int[] iArr = a.f120740a;
        switch (iArr[zoneID.ordinal()]) {
            case 1:
                c23471q = new C23471q(EnumC14890e.Left, Integer.valueOf(AbstractC11128h.f35422R0), EnumC39333f.BRAND_WHITE);
                break;
            case 2:
                c23471q = new C23471q(EnumC14890e.Middle, Integer.valueOf(AbstractC11128h.f35425S0), EnumC39333f.STRAIN_ZONE_1);
                break;
            case 3:
                c23471q = new C23471q(EnumC14890e.Middle, Integer.valueOf(AbstractC11128h.f35428T0), EnumC39333f.STRAIN_ZONE_2);
                break;
            case 4:
                c23471q = new C23471q(EnumC14890e.Middle, Integer.valueOf(AbstractC11128h.f35431U0), EnumC39333f.STRAIN_ZONE_3);
                break;
            case 5:
                c23471q = new C23471q(EnumC14890e.Middle, Integer.valueOf(AbstractC11128h.f35434V0), EnumC39333f.STRAIN_ZONE_4);
                break;
            case 6:
                c23471q = new C23471q(EnumC14890e.Right, Integer.valueOf(AbstractC11128h.f35437W0), EnumC39333f.STRAIN_ZONE_5);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        EnumC14890e enumC14890e = (EnumC14890e) c23471q.f92947w;
        int iIntValue = ((Number) c23471q.f92948x).intValue();
        EnumC39333f enumC39333f = (EnumC39333f) c23471q.f92949y;
        int i13 = iArr[zone.getZoneID().ordinal()];
        if (i13 == 1) {
            if (currentHeartRate != null && currentHeartRate.intValue() > 0) {
                int min = zone.getMin();
                int max = zone.getMax();
                int iIntValue2 = currentHeartRate.intValue();
                if (min <= iIntValue2 && iIntValue2 <= max) {
                    z4 = true;
                }
            }
            z4 = false;
        } else if (i13 != 6) {
            C18284j c18284j = new C18284j(zone.getMin(), zone.getMax(), 1);
            if (currentHeartRate == null || !c18284j.m52655e(currentHeartRate.intValue())) {
                z4 = false;
            } else {
                z4 = true;
            }
        } else if (currentHeartRate == null || currentHeartRate.intValue() < zone.getMin()) {
            z4 = false;
        } else {
            z4 = true;
        }
        return new C14889d(enumC14890e, AbstractC8693b.m21277k(iIntValue), enumC39333f, z4, currentHeartRate != null ? m90689a(zone, currentHeartRate.intValue()) : 0.0f, ((float) 1.5d) * 4, m90691c(currentHeartRate, zone), null);
    }

    /* JADX INFO: renamed from: c */
    private final float m90691c(Integer currentHeartRate, C12288a zone) {
        if (currentHeartRate == null) {
            return 0.2f;
        }
        if (zone.getZoneID() != ZoneID.ZONE_0) {
            if (zone.getZoneID() == ZoneID.ZONE_5) {
                return currentHeartRate.intValue() >= zone.getMin() ? 1.0f : 0.2f;
            }
            int min = zone.getMin();
            int max = zone.getMax();
            int iIntValue = currentHeartRate.intValue();
            return (min > iIntValue || iIntValue > max) ? 0.2f : 1.0f;
        }
        if (currentHeartRate.intValue() > 0) {
            int min2 = zone.getMin();
            int max2 = zone.getMax();
            int iIntValue2 = currentHeartRate.intValue();
            if (min2 <= iIntValue2 && iIntValue2 <= max2) {
                return 1.0f;
            }
        }
        return 0.2f;
    }

    /* JADX INFO: renamed from: d */
    public final C29580a m90692d(List<C12288a> hrZones, Integer currentHeartRate) {
        AbstractC22676k.m65750j(hrZones, "hrZones");
        List<C12288a> list = hrZones;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m90690b((C12288a) it.next(), currentHeartRate));
        }
        return new C29580a(arrayList);
    }
}
