package kg3;

import com.mapbox.maps.MapboxMap;
import com.squareup.wire.AbstractC5583n;
import jg3.C21677d;
import jg3.C21678e;
import jg3.C21689p;
import mg3.AbstractC25532a;
import ng3.AbstractC26703p;
import ng3.EnumC26689b;
import ng3.InterfaceC26699l;
import ng3.InterfaceC26704q;

/* JADX INFO: renamed from: kg3.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC22463b extends AbstractC25532a implements InterfaceC26699l, Comparable {
    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public Object mo14019g(InterfaceC26704q interfaceC26704q) {
        if (interfaceC26704q == AbstractC26703p.f106195b) {
            ((C21678e) this).f83246F.getClass();
            return C22466e.f88015w;
        }
        if (interfaceC26704q == AbstractC26703p.f106196c) {
            return EnumC26689b.NANOS;
        }
        if (interfaceC26704q == AbstractC26703p.f106199f) {
            return C21677d.m61004u0(((C21678e) this).f83246F.toEpochDay());
        }
        if (interfaceC26704q == AbstractC26703p.f106200g) {
            return ((C21678e) this).f83247G;
        }
        if (interfaceC26704q == AbstractC26703p.f106197d || interfaceC26704q == AbstractC26703p.f106194a || interfaceC26704q == AbstractC26703p.f106198e) {
            return null;
        }
        return super.mo14019g(interfaceC26704q);
    }

    /* JADX INFO: renamed from: o0 */
    public final long m64905o0(C21689p c21689p) {
        AbstractC5583n.m16762V(c21689p, MapboxMap.QFE_OFFSET);
        C21678e c21678e = (C21678e) this;
        return ((c21678e.f83246F.toEpochDay() * 86400) + ((long) c21678e.f83247G.m61037D0())) - ((long) c21689p.f83282x);
    }
}
