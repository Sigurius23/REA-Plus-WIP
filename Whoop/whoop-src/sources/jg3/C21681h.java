package jg3;

import com.whoop.service.network.model.UserSessionDto;
import hc3.AbstractC17176i;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kg3.AbstractC22465d;
import kg3.C22466e;
import lg3.C24053o;
import ng3.AbstractC26703p;
import ng3.C26706s;
import ng3.EnumC26688a;
import ng3.InterfaceC26697j;
import ng3.InterfaceC26699l;
import ng3.InterfaceC26700m;
import ng3.InterfaceC26704q;
import org.threeten.p379bp.DateTimeException;
import org.threeten.p379bp.temporal.UnsupportedTemporalTypeException;
import p048ce.AbstractC4482w;

/* JADX INFO: renamed from: jg3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C21681h extends AbstractC4482w implements InterfaceC26699l, Comparable, Serializable {

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ int f83258H = 0;

    /* JADX INFO: renamed from: F */
    public final int f83259F;

    /* JADX INFO: renamed from: G */
    public final int f83260G;

    static {
        C24053o c24053o = new C24053o();
        c24053o.m70955d("--");
        c24053o.m70958g(EnumC26688a.MONTH_OF_YEAR, 2);
        c24053o.m70954c('-');
        c24053o.m70958g(EnumC26688a.DAY_OF_MONTH, 2);
        c24053o.m70962k();
    }

    public C21681h(int i13, int i14) {
        this.f83259F = i13;
        this.f83260G = i14;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C21685l(this, (byte) 64);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: a */
    public final boolean mo60986a(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return interfaceC26700m == EnumC26688a.MONTH_OF_YEAR || interfaceC26700m == EnumC26688a.DAY_OF_MONTH;
        }
        return interfaceC26700m != null && interfaceC26700m.mo79390b(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C21681h c21681h = (C21681h) obj;
        int i13 = this.f83259F - c21681h.f83259F;
        return i13 == 0 ? this.f83260G - c21681h.f83260G : i13;
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: d */
    public final C26706s mo14017d(InterfaceC26700m interfaceC26700m) {
        int i13;
        if (interfaceC26700m == EnumC26688a.MONTH_OF_YEAR) {
            return interfaceC26700m.range();
        }
        if (interfaceC26700m != EnumC26688a.DAY_OF_MONTH) {
            return super.mo14017d(interfaceC26700m);
        }
        int i14 = this.f83259F;
        int iOrdinal = EnumC21680g.m61047o(i14).ordinal();
        if (iOrdinal != 1) {
            i13 = (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31;
        } else {
            i13 = 28;
        }
        return C26706s.m79419d(i13, EnumC21680g.m61047o(i14).m61051n());
    }

    @Override // ng3.InterfaceC26699l
    /* JADX INFO: renamed from: e */
    public final InterfaceC26697j mo13612e(InterfaceC26697j interfaceC26697j) {
        if (!AbstractC22465d.m64906a(interfaceC26697j).equals(C22466e.f88015w)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        InterfaceC26697j interfaceC26697jMo60993b = interfaceC26697j.mo60993b(this.f83259F, EnumC26688a.MONTH_OF_YEAR);
        EnumC26688a enumC26688a = EnumC26688a.DAY_OF_MONTH;
        return interfaceC26697jMo60993b.mo60993b(Math.min(interfaceC26697jMo60993b.mo14017d(enumC26688a).f106204z, this.f83260G), enumC26688a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21681h) {
            C21681h c21681h = (C21681h) obj;
            if (this.f83259F == c21681h.f83259F && this.f83260G == c21681h.f83260G) {
                return true;
            }
        }
        return false;
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: f */
    public final int mo14018f(InterfaceC26700m interfaceC26700m) {
        return mo14017d(interfaceC26700m).m79420a(mo60987h(interfaceC26700m), interfaceC26700m);
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public final Object mo14019g(InterfaceC26704q interfaceC26704q) {
        return interfaceC26704q == AbstractC26703p.f106195b ? C22466e.f88015w : super.mo14019g(interfaceC26704q);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: h */
    public final long mo60987h(InterfaceC26700m interfaceC26700m) {
        int i13;
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return interfaceC26700m.mo79393e(this);
        }
        int iOrdinal = ((EnumC26688a) interfaceC26700m).ordinal();
        if (iOrdinal == 18) {
            i13 = this.f83260G;
        } else {
            if (iOrdinal != 23) {
                throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
            }
            i13 = this.f83259F;
        }
        return i13;
    }

    public final int hashCode() {
        return (this.f83259F << 6) + this.f83260G;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(10);
        sb4.append("--");
        int i13 = this.f83259F;
        sb4.append(i13 < 10 ? UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE : "");
        sb4.append(i13);
        int i14 = this.f83260G;
        sb4.append(i14 < 10 ? "-0" : "-");
        sb4.append(i14);
        return sb4.toString();
    }
}
