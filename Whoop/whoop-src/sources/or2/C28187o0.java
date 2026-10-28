package or2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p92.C29019h;

/* JADX INFO: renamed from: or2.o0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lor2/o0;", "", "<init>", "()V", "Lp92/h$a;", "nextGpsLocation", "a", "(Lp92/h$a;)Lp92/h$a;", "Ll83/a0;", "b", "", "F", "variance", "metersPerDegreeOfLongitude", "c", "Lp92/h$a;", "state", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28187o0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float variance = -1.0f;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float metersPerDegreeOfLongitude = 111194.93f;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C29019h.a state;

    /* JADX INFO: renamed from: a */
    public final C29019h.a m85309a(C29019h.a nextGpsLocation) {
        AbstractC22676k.m65750j(nextGpsLocation, "nextGpsLocation");
        float accuracy = nextGpsLocation.getLocation().getAccuracy();
        if (accuracy < 3.0f) {
            accuracy = 3.0f;
        }
        if (this.variance < 0.0f) {
            this.state = nextGpsLocation;
            this.variance = accuracy * accuracy;
            this.metersPerDegreeOfLongitude = ((float) Math.cos((nextGpsLocation.getLocation().getLatitude() * 3.141592653589793d) / ((double) 180))) * 111194.93f;
        } else {
            long time = nextGpsLocation.getTime();
            C29019h.a aVar = this.state;
            if (aVar == null) {
                AbstractC22676k.m65757q("state");
                throw null;
            }
            long time2 = time - aVar.getTime();
            double longitude = nextGpsLocation.getLocation().getLongitude();
            C29019h.a aVar2 = this.state;
            if (aVar2 == null) {
                AbstractC22676k.m65757q("state");
                throw null;
            }
            double dPow = Math.pow((longitude - aVar2.getLocation().getLongitude()) * ((double) this.metersPerDegreeOfLongitude), 2.0d);
            double latitude = nextGpsLocation.getLocation().getLatitude();
            C29019h.a aVar3 = this.state;
            if (aVar3 == null) {
                AbstractC22676k.m65757q("state");
                throw null;
            }
            double dSqrt = Math.sqrt(Math.pow((latitude - aVar3.getLocation().getLatitude()) * ((double) 111194.93f), 2.0d) + dPow) / ((double) (time2 / 1000.0f));
            if (time2 > 0) {
                this.variance += (float) (((time2 * dSqrt) * dSqrt) / ((double) 1000));
                C29019h.a aVar4 = this.state;
                if (aVar4 == null) {
                    AbstractC22676k.m65757q("state");
                    throw null;
                }
                this.state = C29019h.a.m88247b(aVar4, null, nextGpsLocation.getTime(), 1, null);
            }
            float f13 = this.variance;
            float f14 = f13 / ((accuracy * accuracy) + f13);
            this.variance = (1 - f14) * f13;
            C29019h.a aVar5 = this.state;
            if (aVar5 == null) {
                AbstractC22676k.m65757q("state");
                throw null;
            }
            double latitude2 = aVar5.getLocation().getLatitude();
            double d3 = f14;
            double latitude3 = nextGpsLocation.getLocation().getLatitude();
            C29019h.a aVar6 = this.state;
            if (aVar6 == null) {
                AbstractC22676k.m65757q("state");
                throw null;
            }
            double latitude4 = ((latitude3 - aVar6.getLocation().getLatitude()) * d3) + latitude2;
            C29019h.a aVar7 = this.state;
            if (aVar7 == null) {
                AbstractC22676k.m65757q("state");
                throw null;
            }
            double longitude2 = aVar7.getLocation().getLongitude();
            double longitude3 = nextGpsLocation.getLocation().getLongitude();
            C29019h.a aVar8 = this.state;
            if (aVar8 == null) {
                AbstractC22676k.m65757q("state");
                throw null;
            }
            double longitude4 = ((longitude3 - aVar8.getLocation().getLongitude()) * d3) + longitude2;
            C29019h.a aVar9 = this.state;
            if (aVar9 == null) {
                AbstractC22676k.m65757q("state");
                throw null;
            }
            aVar9.getLocation().setLatitude(latitude4);
            C29019h.a aVar10 = this.state;
            if (aVar10 == null) {
                AbstractC22676k.m65757q("state");
                throw null;
            }
            aVar10.getLocation().setLongitude(longitude4);
        }
        C29019h.a aVar11 = this.state;
        if (aVar11 != null) {
            return C29019h.a.m88247b(aVar11, null, 0L, 3, null);
        }
        AbstractC22676k.m65757q("state");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final void m85310b() {
        this.variance = -1.0f;
    }
}
