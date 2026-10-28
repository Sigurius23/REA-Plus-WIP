package o52;

import com.whoop.hrZones.network.ZoneID;
import dq1.C12288a;
import k52.AbstractC22206b;
import k52.AbstractC22210f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: o52.o */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Ldq1/a;", "currentZone", "Lo52/c;", "b", "(Ldq1/a;)Lo52/c;", "realtime-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27569o {

    /* JADX INFO: renamed from: o52.o$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f111001a;

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
            f111001a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C27545c m83260b(C12288a c12288a) {
        ZoneID zoneIDM34204c = c12288a != null ? c12288a.getZoneID() : null;
        switch (zoneIDM34204c == null ? -1 : a.f111001a[zoneIDM34204c.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return new C27545c(AbstractC22210f.f86501n1, AbstractC22206b.f86254m);
            case 2:
                return new C27545c(AbstractC22210f.f86504o1, AbstractC22206b.f86255n);
            case 3:
                return new C27545c(AbstractC22210f.f86507p1, AbstractC22206b.f86256o);
            case 4:
                return new C27545c(AbstractC22210f.f86510q1, AbstractC22206b.f86257p);
            case 5:
                return new C27545c(AbstractC22210f.f86513r1, AbstractC22206b.f86258q);
            case 6:
                return new C27545c(AbstractC22210f.f86516s1, AbstractC22206b.f86259r);
        }
    }
}
