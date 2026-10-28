package jg3;

import com.mapbox.maps.MapboxMap;
import com.squareup.wire.AbstractC5583n;
import hc3.AbstractC17176i;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import kg3.AbstractC22464c;
import ng3.AbstractC26703p;
import ng3.C26706s;
import ng3.EnumC26688a;
import ng3.EnumC26689b;
import ng3.InterfaceC26697j;
import ng3.InterfaceC26700m;
import ng3.InterfaceC26704q;
import ng3.InterfaceC26705r;
import og3.AbstractC27929h;
import og3.C27926e;
import org.threeten.p379bp.DateTimeException;

/* JADX INFO: renamed from: jg3.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C21691r extends AbstractC22464c implements Serializable {

    /* JADX INFO: renamed from: F */
    public final C21678e f83287F;

    /* JADX INFO: renamed from: G */
    public final C21689p f83288G;

    /* JADX INFO: renamed from: H */
    public final AbstractC21688o f83289H;

    public C21691r(C21678e c21678e, AbstractC21688o abstractC21688o, C21689p c21689p) {
        this.f83287F = c21678e;
        this.f83288G = c21689p;
        this.f83289H = abstractC21688o;
    }

    /* JADX INFO: renamed from: o0 */
    public static C21691r m61081o0(long j7, int i13, AbstractC21688o abstractC21688o) {
        C21689p c21689pMo84265a = abstractC21688o.mo61071k().mo84265a(C21676c.m60992q0(j7, i13));
        return new C21691r(C21678e.m61019u0(j7, i13, c21689pMo84265a), abstractC21688o, c21689pMo84265a);
    }

    /* JADX INFO: renamed from: p0 */
    public static C21691r m61082p0(C21678e c21678e, AbstractC21688o abstractC21688o, C21689p c21689p) {
        AbstractC5583n.m16762V(c21678e, "localDateTime");
        AbstractC5583n.m16762V(abstractC21688o, "zone");
        if (abstractC21688o instanceof C21689p) {
            return new C21691r(c21678e, abstractC21688o, (C21689p) abstractC21688o);
        }
        AbstractC27929h abstractC27929hMo61071k = abstractC21688o.mo61071k();
        List listMo84267c = abstractC27929hMo61071k.mo84267c(c21678e);
        if (listMo84267c.size() == 1) {
            c21689p = (C21689p) listMo84267c.get(0);
        } else if (listMo84267c.size() == 0) {
            C27926e c27926eMo84266b = abstractC27929hMo61071k.mo84266b(c21678e);
            c21678e = c21678e.m61024w0(C21675b.m60989a(0, c27926eMo84266b.f112636y.f83282x - c27926eMo84266b.f112635x.f83282x).f83232w);
            c21689p = c27926eMo84266b.f112636y;
        } else if (c21689p == null || !listMo84267c.contains(c21689p)) {
            Object obj = listMo84267c.get(0);
            AbstractC5583n.m16762V(obj, MapboxMap.QFE_OFFSET);
            c21689p = (C21689p) obj;
        }
        return new C21691r(c21678e, abstractC21688o, c21689p);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C21685l(this, (byte) 6);
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
            return (C21691r) interfaceC26700m.mo79391c(this, j7);
        }
        EnumC26688a enumC26688a = (EnumC26688a) interfaceC26700m;
        int iOrdinal = enumC26688a.ordinal();
        AbstractC21688o abstractC21688o = this.f83289H;
        C21678e c21678e = this.f83287F;
        if (iOrdinal == 28) {
            return m61081o0(j7, c21678e.f83247G.f83254I, abstractC21688o);
        }
        C21689p c21689p = this.f83288G;
        if (iOrdinal != 29) {
            return m61082p0(c21678e.mo60993b(j7, interfaceC26700m), abstractC21688o, c21689p);
        }
        C21689p c21689pM61076r = C21689p.m61076r(enumC26688a.f106174x.m79420a(j7, enumC26688a));
        return (c21689pM61076r.equals(c21689p) || !abstractC21688o.mo61071k().mo84268d(c21678e, c21689pM61076r)) ? this : new C21691r(c21678e, abstractC21688o, c21689pM61076r);
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: d */
    public final C26706s mo14017d(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return (interfaceC26700m == EnumC26688a.INSTANT_SECONDS || interfaceC26700m == EnumC26688a.OFFSET_SECONDS) ? ((EnumC26688a) interfaceC26700m).f106174x : this.f83287F.mo14017d(interfaceC26700m);
        }
        return interfaceC26700m.mo79389a(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21691r) {
            C21691r c21691r = (C21691r) obj;
            if (this.f83287F.equals(c21691r.f83287F) && this.f83288G.equals(c21691r.f83288G) && this.f83289H.equals(c21691r.f83289H)) {
                return true;
            }
        }
        return false;
    }

    @Override // kg3.AbstractC22464c, p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: f */
    public final int mo14018f(InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return super.mo14018f(interfaceC26700m);
        }
        int iOrdinal = ((EnumC26688a) interfaceC26700m).ordinal();
        if (iOrdinal != 28) {
            return iOrdinal != 29 ? this.f83287F.mo14018f(interfaceC26700m) : this.f83288G.f83282x;
        }
        throw new DateTimeException(AbstractC17176i.m48504f("Field too large for an int: ", interfaceC26700m));
    }

    @Override // kg3.AbstractC22464c, p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public final Object mo14019g(InterfaceC26704q interfaceC26704q) {
        return interfaceC26704q == AbstractC26703p.f106199f ? this.f83287F.f83246F : super.mo14019g(interfaceC26704q);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: h */
    public final long mo60987h(InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return interfaceC26700m.mo79393e(this);
        }
        int iOrdinal = ((EnumC26688a) interfaceC26700m).ordinal();
        if (iOrdinal != 28) {
            return iOrdinal != 29 ? this.f83287F.mo60987h(interfaceC26700m) : this.f83288G.f83282x;
        }
        return toEpochSecond();
    }

    public final int hashCode() {
        return (this.f83287F.hashCode() ^ this.f83288G.f83282x) ^ Integer.rotateLeft(this.f83289H.hashCode(), 3);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: i */
    public final InterfaceC26697j mo60995i(long j7, InterfaceC26705r interfaceC26705r) {
        return j7 == Long.MIN_VALUE ? mo60994c(Long.MAX_VALUE, interfaceC26705r).mo60994c(1L, interfaceC26705r) : mo60994c(-j7, interfaceC26705r);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: j */
    public final InterfaceC26697j mo60996j(C21677d c21677d) {
        return m61082p0(C21678e.m61018t0(c21677d, this.f83287F.f83247G), this.f83289H, this.f83288G);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final C21691r mo60994c(long j7, InterfaceC26705r interfaceC26705r) {
        if (!(interfaceC26705r instanceof EnumC26689b)) {
            return (C21691r) interfaceC26705r.mo79396a(this, j7);
        }
        EnumC26689b enumC26689b = (EnumC26689b) interfaceC26705r;
        int iCompareTo = enumC26689b.compareTo(EnumC26689b.DAYS);
        C21689p c21689p = this.f83288G;
        AbstractC21688o abstractC21688o = this.f83289H;
        C21678e c21678e = this.f83287F;
        if (iCompareTo >= 0 && enumC26689b != EnumC26689b.FOREVER) {
            return m61082p0(c21678e.mo60994c(j7, interfaceC26705r), abstractC21688o, c21689p);
        }
        C21678e c21678eMo60994c = c21678e.mo60994c(j7, interfaceC26705r);
        AbstractC5583n.m16762V(c21678eMo60994c, "localDateTime");
        AbstractC5583n.m16762V(c21689p, MapboxMap.QFE_OFFSET);
        AbstractC5583n.m16762V(abstractC21688o, "zone");
        return m61081o0(c21678eMo60994c.m64905o0(c21689p), c21678eMo60994c.f83247G.f83254I, abstractC21688o);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f83287F.toString());
        C21689p c21689p = this.f83288G;
        sb4.append(c21689p.f83283y);
        String string = sb4.toString();
        AbstractC21688o abstractC21688o = this.f83289H;
        if (c21689p == abstractC21688o) {
            return string;
        }
        return string + '[' + abstractC21688o.toString() + ']';
    }
}
