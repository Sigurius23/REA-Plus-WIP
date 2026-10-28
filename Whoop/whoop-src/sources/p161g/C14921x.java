package p161g;

import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g.x */
/* JADX INFO: loaded from: classes.dex */
public final class C14921x implements InterfaceC1577e0, InterfaceC14896b {

    /* JADX INFO: renamed from: w */
    public final AbstractC1638x f55608w;

    /* JADX INFO: renamed from: x */
    public final AbstractC14917t f55609x;

    /* JADX INFO: renamed from: y */
    public C14922y f55610y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C14923z f55611z;

    public C14921x(C14923z c14923z, AbstractC1638x abstractC1638x, AbstractC14917t onBackPressedCallback) {
        AbstractC22676k.m65750j(onBackPressedCallback, "onBackPressedCallback");
        this.f55611z = c14923z;
        this.f55608w = abstractC1638x;
        this.f55609x = onBackPressedCallback;
        abstractC1638x.mo4986a(this);
    }

    @Override // p161g.InterfaceC14896b
    public final void cancel() {
        this.f55608w.mo4988d(this);
        this.f55609x.m43012i(this);
        C14922y c14922y = this.f55610y;
        if (c14922y != null) {
            c14922y.cancel();
        }
        this.f55610y = null;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 source, EnumC1632v event) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(event, "event");
        if (event == EnumC1632v.ON_START) {
            this.f55610y = this.f55611z.m43016b(this.f55609x);
            return;
        }
        if (event != EnumC1632v.ON_STOP) {
            if (event == EnumC1632v.ON_DESTROY) {
                cancel();
            }
        } else {
            C14922y c14922y = this.f55610y;
            if (c14922y != null) {
                c14922y.cancel();
            }
        }
    }
}
