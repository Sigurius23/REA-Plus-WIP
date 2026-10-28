package lg3;

import jg3.AbstractC21688o;
import jg3.C21677d;
import kg3.AbstractC22462a;
import kg3.AbstractC22465d;
import ng3.AbstractC26703p;
import ng3.C26706s;
import ng3.InterfaceC26698k;
import ng3.InterfaceC26700m;
import ng3.InterfaceC26704q;
import p048ce.AbstractC4482w;

/* JADX INFO: renamed from: lg3.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C24056r extends AbstractC4482w {

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AbstractC22462a f95073F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC26698k f95074G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ AbstractC22465d f95075H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ AbstractC21688o f95076I;

    public C24056r(C21677d c21677d, InterfaceC26698k interfaceC26698k, AbstractC22465d abstractC22465d, AbstractC21688o abstractC21688o) {
        this.f95073F = c21677d;
        this.f95074G = interfaceC26698k;
        this.f95075H = abstractC22465d;
        this.f95076I = abstractC21688o;
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: a */
    public final boolean mo60986a(InterfaceC26700m interfaceC26700m) {
        AbstractC22462a abstractC22462a = this.f95073F;
        return (abstractC22462a == null || !interfaceC26700m.isDateBased()) ? this.f95074G.mo60986a(interfaceC26700m) : abstractC22462a.mo60986a(interfaceC26700m);
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: d */
    public final C26706s mo14017d(InterfaceC26700m interfaceC26700m) {
        AbstractC22462a abstractC22462a = this.f95073F;
        return (abstractC22462a == null || !interfaceC26700m.isDateBased()) ? this.f95074G.mo14017d(interfaceC26700m) : abstractC22462a.mo14017d(interfaceC26700m);
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public final Object mo14019g(InterfaceC26704q interfaceC26704q) {
        if (interfaceC26704q == AbstractC26703p.f106195b) {
            return this.f95075H;
        }
        if (interfaceC26704q == AbstractC26703p.f106194a) {
            return this.f95076I;
        }
        return interfaceC26704q == AbstractC26703p.f106196c ? this.f95074G.mo14019g(interfaceC26704q) : interfaceC26704q.mo43799l(this);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: h */
    public final long mo60987h(InterfaceC26700m interfaceC26700m) {
        AbstractC22462a abstractC22462a = this.f95073F;
        return (abstractC22462a == null || !interfaceC26700m.isDateBased()) ? this.f95074G.mo60987h(interfaceC26700m) : ((C21677d) abstractC22462a).mo60987h(interfaceC26700m);
    }
}
