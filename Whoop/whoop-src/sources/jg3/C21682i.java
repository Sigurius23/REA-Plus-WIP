package jg3;

import com.mapbox.maps.MapboxMap;
import com.squareup.wire.AbstractC5583n;
import g73.C15553a;
import hc3.AbstractC17176i;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Map;
import java.util.TimeZone;
import kg3.C22466e;
import mg3.AbstractC25532a;
import ng3.AbstractC26703p;
import ng3.C26702o;
import ng3.C26706s;
import ng3.EnumC26688a;
import ng3.EnumC26689b;
import ng3.InterfaceC26697j;
import ng3.InterfaceC26699l;
import ng3.InterfaceC26700m;
import ng3.InterfaceC26704q;
import ng3.InterfaceC26705r;
import org.threeten.p379bp.DateTimeException;
import p715kotlin.time.DurationKt;

/* JADX INFO: renamed from: jg3.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C21682i extends AbstractC25532a implements InterfaceC26699l, Comparable, Serializable {

    /* JADX INFO: renamed from: H */
    public static final C15553a f83261H;

    /* JADX INFO: renamed from: F */
    public final C21678e f83262F;

    /* JADX INFO: renamed from: G */
    public final C21689p f83263G;

    static {
        C21678e c21678e = C21678e.f83243H;
        C21689p c21689p = C21689p.f83280H;
        c21678e.getClass();
        new C21682i(c21678e, c21689p);
        C21678e c21678e2 = C21678e.f83244I;
        C21689p c21689p2 = C21689p.f83279G;
        c21678e2.getClass();
        new C21682i(c21678e2, c21689p2);
        f83261H = new C15553a(15);
    }

    public C21682i(C21678e c21678e, C21689p c21689p) {
        AbstractC5583n.m16762V(c21678e, "dateTime");
        this.f83262F = c21678e;
        AbstractC5583n.m16762V(c21689p, MapboxMap.QFE_OFFSET);
        this.f83263G = c21689p;
    }

    /* JADX INFO: renamed from: p0 */
    public static C21682i m61052p0() {
        Map map = AbstractC21688o.f83276w;
        String id4 = TimeZone.getDefault().getID();
        Map map2 = AbstractC21688o.f83276w;
        AbstractC5583n.m16762V(id4, "zoneId");
        AbstractC5583n.m16762V(map2, "aliasMap");
        String str = (String) map2.get(id4);
        if (str != null) {
            id4 = str;
        }
        AbstractC21688o abstractC21688oM61069l = AbstractC21688o.m61069l(id4);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C21676c c21676c = C21676c.f83234H;
        C21676c c21676cM60990o0 = C21676c.m60990o0(AbstractC5583n.m16743B(1000, jCurrentTimeMillis) * DurationKt.NANOS_IN_MILLIS, AbstractC5583n.m16742A(jCurrentTimeMillis, 1000L));
        return m61053q0(c21676cM60990o0, abstractC21688oM61069l.mo61071k().mo84265a(c21676cM60990o0));
    }

    /* JADX INFO: renamed from: q0 */
    public static C21682i m61053q0(C21676c c21676c, AbstractC21688o abstractC21688o) {
        AbstractC5583n.m16762V(c21676c, "instant");
        AbstractC5583n.m16762V(abstractC21688o, "zone");
        C21689p c21689pMo84265a = abstractC21688o.mo61071k().mo84265a(c21676c);
        return new C21682i(C21678e.m61019u0(c21676c.f83235F, c21676c.f83236G, c21689pMo84265a), c21689pMo84265a);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C21685l(this, (byte) 69);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: a */
    public final boolean mo60986a(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return true;
        }
        return interfaceC26700m != null && interfaceC26700m.mo79390b(this);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: b */
    public final InterfaceC26697j mo60993b(long j7, InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return (C21682i) interfaceC26700m.mo79391c(this, j7);
        }
        EnumC26688a enumC26688a = (EnumC26688a) interfaceC26700m;
        int iOrdinal = enumC26688a.ordinal();
        C21689p c21689p = this.f83263G;
        C21678e c21678e = this.f83262F;
        if (iOrdinal != 28) {
            return iOrdinal != 29 ? m61056s0(c21678e.mo60993b(j7, interfaceC26700m), c21689p) : m61056s0(c21678e, C21689p.m61076r(enumC26688a.f106174x.m79420a(j7, enumC26688a)));
        }
        return m61053q0(C21676c.m60992q0(j7, c21678e.f83247G.f83254I), c21689p);
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: d */
    public final C26706s mo14017d(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return (interfaceC26700m == EnumC26688a.INSTANT_SECONDS || interfaceC26700m == EnumC26688a.OFFSET_SECONDS) ? ((EnumC26688a) interfaceC26700m).f106174x : this.f83262F.mo14017d(interfaceC26700m);
        }
        return interfaceC26700m.mo79389a(this);
    }

    @Override // ng3.InterfaceC26699l
    /* JADX INFO: renamed from: e */
    public final InterfaceC26697j mo13612e(InterfaceC26697j interfaceC26697j) {
        EnumC26688a enumC26688a = EnumC26688a.EPOCH_DAY;
        C21678e c21678e = this.f83262F;
        return interfaceC26697j.mo60993b(c21678e.f83246F.toEpochDay(), enumC26688a).mo60993b(c21678e.f83247G.m61036C0(), EnumC26688a.NANO_OF_DAY).mo60993b(this.f83263G.f83282x, EnumC26688a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21682i) {
            C21682i c21682i = (C21682i) obj;
            if (this.f83262F.equals(c21682i.f83262F) && this.f83263G.equals(c21682i.f83263G)) {
                return true;
            }
        }
        return false;
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: f */
    public final int mo14018f(InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return super.mo14018f(interfaceC26700m);
        }
        int iOrdinal = ((EnumC26688a) interfaceC26700m).ordinal();
        if (iOrdinal != 28) {
            return iOrdinal != 29 ? this.f83262F.mo14018f(interfaceC26700m) : this.f83263G.f83282x;
        }
        throw new DateTimeException(AbstractC17176i.m48504f("Field too large for an int: ", interfaceC26700m));
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public final Object mo14019g(InterfaceC26704q interfaceC26704q) {
        if (interfaceC26704q == AbstractC26703p.f106195b) {
            return C22466e.f88015w;
        }
        if (interfaceC26704q == AbstractC26703p.f106196c) {
            return EnumC26689b.NANOS;
        }
        if (interfaceC26704q == AbstractC26703p.f106198e || interfaceC26704q == AbstractC26703p.f106197d) {
            return this.f83263G;
        }
        C26702o c26702o = AbstractC26703p.f106199f;
        C21678e c21678e = this.f83262F;
        if (interfaceC26704q == c26702o) {
            return c21678e.f83246F;
        }
        if (interfaceC26704q == AbstractC26703p.f106200g) {
            return c21678e.f83247G;
        }
        if (interfaceC26704q == AbstractC26703p.f106194a) {
            return null;
        }
        return super.mo14019g(interfaceC26704q);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: h */
    public final long mo60987h(InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return interfaceC26700m.mo79393e(this);
        }
        int iOrdinal = ((EnumC26688a) interfaceC26700m).ordinal();
        if (iOrdinal != 28) {
            return iOrdinal != 29 ? this.f83262F.mo60987h(interfaceC26700m) : this.f83263G.f83282x;
        }
        return toEpochSecond();
    }

    public final int hashCode() {
        return this.f83262F.hashCode() ^ this.f83263G.f83282x;
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: i */
    public final InterfaceC26697j mo60995i(long j7, InterfaceC26705r interfaceC26705r) {
        return j7 == Long.MIN_VALUE ? mo60994c(Long.MAX_VALUE, interfaceC26705r).mo60994c(1L, interfaceC26705r) : mo60994c(-j7, interfaceC26705r);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: j */
    public final InterfaceC26697j mo60996j(C21677d c21677d) {
        C21678e c21678e = this.f83262F;
        return m61056s0(c21678e.m61027z0(c21677d, c21678e.f83247G), this.f83263G);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C21682i c21682i) {
        C21689p c21689p = c21682i.f83263G;
        C21678e c21678e = c21682i.f83262F;
        boolean zEquals = this.f83263G.equals(c21689p);
        C21678e c21678e2 = this.f83262F;
        if (zEquals) {
            return c21678e2.compareTo(c21678e);
        }
        int iM16791q = AbstractC5583n.m16791q(toEpochSecond(), c21682i.toEpochSecond());
        if (iM16791q != 0) {
            return iM16791q;
        }
        int i13 = c21678e2.f83247G.f83254I - c21678e.f83247G.f83254I;
        return i13 == 0 ? c21678e2.compareTo(c21678e) : i13;
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public final C21682i mo60994c(long j7, InterfaceC26705r interfaceC26705r) {
        return interfaceC26705r instanceof EnumC26689b ? m61056s0(this.f83262F.mo60994c(j7, interfaceC26705r), this.f83263G) : (C21682i) interfaceC26705r.mo79396a(this, j7);
    }

    /* JADX INFO: renamed from: s0 */
    public final C21682i m61056s0(C21678e c21678e, C21689p c21689p) {
        return (this.f83262F == c21678e && this.f83263G.equals(c21689p)) ? this : new C21682i(c21678e, c21689p);
    }

    public final long toEpochSecond() {
        return this.f83262F.m64905o0(this.f83263G);
    }

    public final String toString() {
        return this.f83262F.toString() + this.f83263G.f83283y;
    }
}
