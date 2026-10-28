package a00;

import android.content.Context;
import c20.C3875c;
import c20.C3881i;
import c20.C3886n;
import p30.C28789a;
import p442qy.C30765d;
import p599wz.C37718g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import v00.C35459c0;
import v03.C35518e;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: a00.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C0076k implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f240w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f241x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f242y;

    /* JADX INFO: renamed from: z */
    public final C35518e f243z;

    public C0076k(InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, C35518e c35518e) {
        this.f240w = 1;
        this.f241x = interfaceC35521h;
        this.f242y = interfaceC35521h2;
        this.f243z = c35518e;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f240w) {
            case 0:
                return new C0074i((C37718g0) this.f241x.get(), (C35459c0) this.f243z.f151137w, (C30765d) this.f242y.get());
            case 1:
                return new C3881i((C3886n) this.f241x.get(), (C3875c) this.f242y.get(), (Context) this.f243z.f151137w);
            default:
                Context context = (Context) this.f243z.f151137w;
                boolean zBooleanValue = ((Boolean) this.f241x.get()).booleanValue();
                InterfaceC30063j workContext = (InterfaceC30063j) this.f242y.get();
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(workContext, "workContext");
                return new C28789a(context, zBooleanValue, workContext);
        }
    }

    public C0076k(C35518e c35518e, C35518e c35518e2, InterfaceC35521h interfaceC35521h, int i13) {
        this.f240w = i13;
        switch (i13) {
            case 2:
                this.f243z = c35518e;
                this.f241x = c35518e2;
                this.f242y = interfaceC35521h;
                break;
            default:
                this.f241x = c35518e;
                this.f243z = c35518e2;
                this.f242y = interfaceC35521h;
                break;
        }
    }
}
