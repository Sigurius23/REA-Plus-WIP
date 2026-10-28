package kg3;

import com.squareup.wire.AbstractC5583n;
import hc3.AbstractC17176i;
import jg3.C21677d;
import jg3.C21678e;
import jg3.C21691r;
import mg3.AbstractC25532a;
import ng3.AbstractC26703p;
import ng3.EnumC26688a;
import ng3.EnumC26689b;
import ng3.InterfaceC26700m;
import ng3.InterfaceC26704q;
import org.threeten.p379bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: renamed from: kg3.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC22464c extends AbstractC25532a implements Comparable {
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC22464c abstractC22464c = (AbstractC22464c) obj;
        int iM16791q = AbstractC5583n.m16791q(toEpochSecond(), abstractC22464c.toEpochSecond());
        if (iM16791q != 0) {
            return iM16791q;
        }
        C21691r c21691r = (C21691r) this;
        C21678e c21678e = c21691r.f83287F;
        int i13 = c21678e.f83247G.f83254I;
        C21691r c21691r2 = (C21691r) abstractC22464c;
        C21678e c21678e2 = c21691r2.f83287F;
        int iCompareTo = i13 - c21678e2.f83247G.f83254I;
        if (iCompareTo != 0 || (iCompareTo = c21678e.compareTo(c21678e2)) != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = c21691r.f83289H.getId().compareTo(c21691r2.f83289H.getId());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        c21678e.f83246F.getClass();
        C22466e c22466e = C22466e.f88015w;
        c21678e2.f83246F.getClass();
        return 0;
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: f */
    public int mo14018f(InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return super.mo14018f(interfaceC26700m);
        }
        int iOrdinal = ((EnumC26688a) interfaceC26700m).ordinal();
        if (iOrdinal != 28) {
            return iOrdinal != 29 ? ((C21691r) this).f83287F.mo14018f(interfaceC26700m) : ((C21691r) this).f83288G.f83282x;
        }
        throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Field too large for an int: ", interfaceC26700m));
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public Object mo14019g(InterfaceC26704q interfaceC26704q) {
        if (interfaceC26704q == AbstractC26703p.f106194a || interfaceC26704q == AbstractC26703p.f106197d) {
            return ((C21691r) this).f83289H;
        }
        if (interfaceC26704q == AbstractC26703p.f106195b) {
            ((C21691r) this).f83287F.f83246F.getClass();
            return C22466e.f88015w;
        }
        if (interfaceC26704q == AbstractC26703p.f106196c) {
            return EnumC26689b.NANOS;
        }
        if (interfaceC26704q == AbstractC26703p.f106198e) {
            return ((C21691r) this).f83288G;
        }
        if (interfaceC26704q == AbstractC26703p.f106199f) {
            return C21677d.m61004u0(((C21691r) this).f83287F.f83246F.toEpochDay());
        }
        return interfaceC26704q == AbstractC26703p.f106200g ? ((C21691r) this).f83287F.f83247G : super.mo14019g(interfaceC26704q);
    }

    public final long toEpochSecond() {
        C21691r c21691r = (C21691r) this;
        C21678e c21678e = c21691r.f83287F;
        return ((c21678e.f83246F.toEpochDay() * 86400) + ((long) c21678e.f83247G.m61037D0())) - ((long) c21691r.f83288G.f83282x);
    }
}
