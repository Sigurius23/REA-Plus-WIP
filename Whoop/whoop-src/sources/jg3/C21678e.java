package jg3;

import com.mapbox.common.HttpHeaders;
import com.mapbox.maps.MapboxMap;
import com.squareup.wire.AbstractC5583n;
import g73.C15556d;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kg3.AbstractC22463b;
import kg3.C22466e;
import ng3.AbstractC26703p;
import ng3.C26706s;
import ng3.EnumC26688a;
import ng3.EnumC26689b;
import ng3.InterfaceC26697j;
import ng3.InterfaceC26698k;
import ng3.InterfaceC26700m;
import ng3.InterfaceC26704q;
import ng3.InterfaceC26705r;
import org.joda.time.DateTimeConstants;
import org.threeten.p379bp.DateTimeException;
import p715kotlin.time.DurationKt;

/* JADX INFO: renamed from: jg3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C21678e extends AbstractC22463b implements Serializable {

    /* JADX INFO: renamed from: H */
    public static final C21678e f83243H = m61018t0(C21677d.f83237I, C21679f.f83248J);

    /* JADX INFO: renamed from: I */
    public static final C21678e f83244I = m61018t0(C21677d.f83238J, C21679f.f83249K);

    /* JADX INFO: renamed from: J */
    public static final C15556d f83245J = new C15556d(14);

    /* JADX INFO: renamed from: F */
    public final C21677d f83246F;

    /* JADX INFO: renamed from: G */
    public final C21679f f83247G;

    public C21678e(C21677d c21677d, C21679f c21679f) {
        this.f83246F = c21677d;
        this.f83247G = c21679f;
    }

    /* JADX INFO: renamed from: r0 */
    public static C21678e m61017r0(InterfaceC26698k interfaceC26698k) {
        if (interfaceC26698k instanceof C21678e) {
            return (C21678e) interfaceC26698k;
        }
        if (interfaceC26698k instanceof C21691r) {
            return ((C21691r) interfaceC26698k).f83287F;
        }
        try {
            return new C21678e(C21677d.m61002q0(interfaceC26698k), C21679f.m61030q0(interfaceC26698k));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + interfaceC26698k + ", type " + interfaceC26698k.getClass().getName());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: renamed from: t0 */
    public static C21678e m61018t0(C21677d c21677d, C21679f c21679f) {
        AbstractC5583n.m16762V(c21677d, HttpHeaders.DATE);
        AbstractC5583n.m16762V(c21679f, "time");
        return new C21678e(c21677d, c21679f);
    }

    /* JADX INFO: renamed from: u0 */
    public static C21678e m61019u0(long j7, int i13, C21689p c21689p) {
        AbstractC5583n.m16762V(c21689p, MapboxMap.QFE_OFFSET);
        long j13 = j7 + ((long) c21689p.f83282x);
        long jM16742A = AbstractC5583n.m16742A(j13, 86400L);
        int iM16743B = AbstractC5583n.m16743B(DateTimeConstants.SECONDS_PER_DAY, j13);
        C21677d c21677dM61004u0 = C21677d.m61004u0(jM16742A);
        long j14 = iM16743B;
        C21679f c21679f = C21679f.f83248J;
        EnumC26688a.SECOND_OF_DAY.m79394f(j14);
        EnumC26688a.NANO_OF_SECOND.m79394f(i13);
        int i14 = (int) (j14 / 3600);
        long j15 = j14 - ((long) (i14 * DateTimeConstants.SECONDS_PER_HOUR));
        int i15 = (int) (j15 / 60);
        return new C21678e(c21677dM61004u0, C21679f.m61029p0(i14, i15, (int) (j15 - ((long) (i15 * 60))), i13));
    }

    private Object writeReplace() {
        return new C21685l(this, (byte) 4);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: a */
    public final boolean mo60986a(InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return interfaceC26700m != null && interfaceC26700m.mo79390b(this);
        }
        EnumC26688a enumC26688a = (EnumC26688a) interfaceC26700m;
        return enumC26688a.isDateBased() || enumC26688a.m79395g();
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: d */
    public final C26706s mo14017d(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return ((EnumC26688a) interfaceC26700m).m79395g() ? this.f83247G.mo14017d(interfaceC26700m) : this.f83246F.mo14017d(interfaceC26700m);
        }
        return interfaceC26700m.mo79389a(this);
    }

    @Override // ng3.InterfaceC26699l
    /* JADX INFO: renamed from: e */
    public final InterfaceC26697j mo13612e(InterfaceC26697j interfaceC26697j) {
        return interfaceC26697j.mo60993b(this.f83246F.toEpochDay(), EnumC26688a.EPOCH_DAY).mo60993b(this.f83247G.m61036C0(), EnumC26688a.NANO_OF_DAY);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21678e) {
            C21678e c21678e = (C21678e) obj;
            if (this.f83246F.equals(c21678e.f83246F) && this.f83247G.equals(c21678e.f83247G)) {
                return true;
            }
        }
        return false;
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: f */
    public final int mo14018f(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return ((EnumC26688a) interfaceC26700m).m79395g() ? this.f83247G.mo14018f(interfaceC26700m) : this.f83246F.mo14018f(interfaceC26700m);
        }
        return super.mo14018f(interfaceC26700m);
    }

    @Override // kg3.AbstractC22463b, p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public final Object mo14019g(InterfaceC26704q interfaceC26704q) {
        return interfaceC26704q == AbstractC26703p.f106199f ? this.f83246F : super.mo14019g(interfaceC26704q);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: h */
    public final long mo60987h(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return ((EnumC26688a) interfaceC26700m).m79395g() ? this.f83247G.mo60987h(interfaceC26700m) : this.f83246F.mo60987h(interfaceC26700m);
        }
        return interfaceC26700m.mo79393e(this);
    }

    public final int hashCode() {
        return this.f83246F.hashCode() ^ this.f83247G.hashCode();
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: i */
    public final InterfaceC26697j mo60995i(long j7, InterfaceC26705r interfaceC26705r) {
        return j7 == Long.MIN_VALUE ? mo60994c(Long.MAX_VALUE, interfaceC26705r).mo60994c(1L, interfaceC26705r) : mo60994c(-j7, interfaceC26705r);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: j */
    public final InterfaceC26697j mo60996j(C21677d c21677d) {
        return m61027z0(c21677d, this.f83247G);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC22463b abstractC22463b) {
        int iM16791q;
        if (abstractC22463b instanceof C21678e) {
            return m61021q0((C21678e) abstractC22463b);
        }
        C21678e c21678e = (C21678e) abstractC22463b;
        C21677d c21677d = c21678e.f83246F;
        C21677d c21677d2 = this.f83246F;
        if (c21677d != null) {
            iM16791q = c21677d2.m61010o0(c21677d);
        } else {
            iM16791q = AbstractC5583n.m16791q(c21677d2.toEpochDay(), c21677d.toEpochDay());
            if (iM16791q == 0) {
                C22466e c22466e = C22466e.f88015w;
                iM16791q = 0;
            }
        }
        if (iM16791q != 0) {
            return iM16791q;
        }
        int iM61041o0 = this.f83247G.compareTo(c21678e.f83247G);
        if (iM61041o0 != 0) {
            return iM61041o0;
        }
        c21677d2.getClass();
        C22466e c22466e2 = C22466e.f88015w;
        abstractC22463b.getClass();
        ((C21678e) abstractC22463b).f83246F.getClass();
        return 0;
    }

    /* JADX INFO: renamed from: q0 */
    public final int m61021q0(C21678e c21678e) {
        int iM61010o0 = this.f83246F.m61010o0(c21678e.f83246F);
        return iM61010o0 == 0 ? this.f83247G.compareTo(c21678e.f83247G) : iM61010o0;
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m61022s0(C21678e c21678e) {
        if (c21678e != null) {
            return m61021q0(c21678e) < 0;
        }
        long epochDay = this.f83246F.toEpochDay();
        long epochDay2 = c21678e.f83246F.toEpochDay();
        if (epochDay >= epochDay2) {
            return epochDay == epochDay2 && this.f83247G.m61036C0() < c21678e.f83247G.m61036C0();
        }
        return true;
    }

    public final String toString() {
        return this.f83246F.toString() + 'T' + this.f83247G.toString();
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public final C21678e mo60994c(long j7, InterfaceC26705r interfaceC26705r) {
        if (!(interfaceC26705r instanceof EnumC26689b)) {
            return (C21678e) interfaceC26705r.mo79396a(this, j7);
        }
        int iOrdinal = ((EnumC26689b) interfaceC26705r).ordinal();
        C21679f c21679f = this.f83247G;
        C21677d c21677d = this.f83246F;
        switch (iOrdinal) {
            case 0:
                return m61025x0(this.f83246F, 0L, 0L, 0L, j7);
            case 1:
                C21678e c21678eM61027z0 = m61027z0(c21677d.m61014x0(j7 / 86400000000L), c21679f);
                return c21678eM61027z0.m61025x0(c21678eM61027z0.f83246F, 0L, 0L, 0L, (j7 % 86400000000L) * 1000);
            case 2:
                C21678e c21678eM61027z1 = m61027z0(c21677d.m61014x0(j7 / DurationKt.MILLIS_IN_DAY), c21679f);
                return c21678eM61027z1.m61025x0(c21678eM61027z1.f83246F, 0L, 0L, 0L, (j7 % DurationKt.MILLIS_IN_DAY) * 1000000);
            case 3:
                return m61024w0(j7);
            case 4:
                return m61025x0(this.f83246F, 0L, j7, 0L, 0L);
            case 5:
                return m61025x0(this.f83246F, j7, 0L, 0L, 0L);
            case 6:
                C21678e c21678eM61027z2 = m61027z0(c21677d.m61014x0(j7 / 256), c21679f);
                return c21678eM61027z2.m61025x0(c21678eM61027z2.f83246F, (j7 % 256) * 12, 0L, 0L, 0L);
            default:
                return m61027z0(c21677d.mo60994c(j7, interfaceC26705r), c21679f);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final C21678e m61024w0(long j7) {
        return m61025x0(this.f83246F, 0L, 0L, j7, 0L);
    }

    /* JADX INFO: renamed from: x0 */
    public final C21678e m61025x0(C21677d c21677d, long j7, long j13, long j14, long j15) {
        long j16 = j7 | j13 | j14 | j15;
        C21679f c21679fM61033u0 = this.f83247G;
        if (j16 == 0) {
            return m61027z0(c21677d, c21679fM61033u0);
        }
        long j17 = j7 / 24;
        long j18 = j17 + (j13 / 1440) + (j14 / 86400) + (j15 / 86400000000000L);
        long j19 = 1;
        long j24 = ((j7 % 24) * 3600000000000L) + ((j13 % 1440) * 60000000000L) + ((j14 % 86400) * 1000000000) + (j15 % 86400000000000L);
        long jM61036C0 = c21679fM61033u0.m61036C0();
        long j25 = (j24 * j19) + jM61036C0;
        long jM16742A = AbstractC5583n.m16742A(j25, 86400000000000L) + (j18 * j19);
        long j26 = ((j25 % 86400000000000L) + 86400000000000L) % 86400000000000L;
        if (j26 != jM61036C0) {
            c21679fM61033u0 = C21679f.m61033u0(j26);
        }
        return m61027z0(c21677d.m61014x0(jM16742A), c21679fM61033u0);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public final C21678e mo60993b(long j7, InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return (C21678e) interfaceC26700m.mo79391c(this, j7);
        }
        boolean zM79395g = ((EnumC26688a) interfaceC26700m).m79395g();
        C21679f c21679f = this.f83247G;
        C21677d c21677d = this.f83246F;
        return zM79395g ? m61027z0(c21677d, c21679f.mo60993b(j7, interfaceC26700m)) : m61027z0(c21677d.mo60993b(j7, interfaceC26700m), c21679f);
    }

    /* JADX INFO: renamed from: z0 */
    public final C21678e m61027z0(C21677d c21677d, C21679f c21679f) {
        return (this.f83246F == c21677d && this.f83247G == c21679f) ? this : new C21678e(c21677d, c21679f);
    }
}
