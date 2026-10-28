package p395p6;

import p335n6.C26396m;
import p335n6.InterfaceC26392i;
import p335n6.InterfaceC26398o;

/* JADX INFO: renamed from: p6.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C28924v implements InterfaceC26392i {

    /* JADX INFO: renamed from: a */
    public InterfaceC26398o f117035a = C26396m.f104850a;

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: a */
    public final InterfaceC26392i mo78103a() {
        C28924v c28924v = new C28924v();
        c28924v.f117035a = this.f117035a;
        return c28924v;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: b */
    public final void mo78104b(InterfaceC26398o interfaceC26398o) {
        this.f117035a = interfaceC26398o;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: c */
    public final InterfaceC26398o mo78105c() {
        return this.f117035a;
    }
}
