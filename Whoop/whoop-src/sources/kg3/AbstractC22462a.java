package kg3;

import jg3.C21677d;
import mg3.AbstractC25532a;
import ng3.AbstractC26703p;
import ng3.EnumC26689b;
import ng3.InterfaceC26699l;
import ng3.InterfaceC26700m;
import ng3.InterfaceC26704q;

/* JADX INFO: renamed from: kg3.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC22462a extends AbstractC25532a implements InterfaceC26699l, Comparable {
    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: a */
    public abstract boolean mo60986a(InterfaceC26700m interfaceC26700m);

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public Object mo14019g(InterfaceC26704q interfaceC26704q) {
        if (interfaceC26704q == AbstractC26703p.f106195b) {
            return C22466e.f88015w;
        }
        if (interfaceC26704q == AbstractC26703p.f106196c) {
            return EnumC26689b.DAYS;
        }
        if (interfaceC26704q == AbstractC26703p.f106199f) {
            return C21677d.m61004u0(toEpochDay());
        }
        if (interfaceC26704q == AbstractC26703p.f106200g || interfaceC26704q == AbstractC26703p.f106197d || interfaceC26704q == AbstractC26703p.f106194a || interfaceC26704q == AbstractC26703p.f106198e) {
            return null;
        }
        return super.mo14019g(interfaceC26704q);
    }

    public abstract long toEpochDay();
}
