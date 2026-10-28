package p545v6;

import p335n6.C26396m;
import p335n6.InterfaceC26392i;
import p335n6.InterfaceC26398o;

/* JADX INFO: renamed from: v6.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C35724m implements InterfaceC26392i {

    /* JADX INFO: renamed from: a */
    public InterfaceC26398o f151970a = C26396m.f104850a;

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: a */
    public final InterfaceC26392i mo78103a() {
        C35724m c35724m = new C35724m();
        c35724m.f151970a = this.f151970a;
        return c35724m;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: b */
    public final void mo78104b(InterfaceC26398o interfaceC26398o) {
        this.f151970a = interfaceC26398o;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: c */
    public final InterfaceC26398o mo78105c() {
        return this.f151970a;
    }

    public final String toString() {
        return "EmittableSpacer(modifier=" + this.f151970a + ')';
    }
}
