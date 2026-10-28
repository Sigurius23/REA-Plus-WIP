package p032bc;

import android.view.ViewGroup;
import p035bp.AbstractC3511b;

/* JADX INFO: renamed from: bc.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C2943d extends AbstractC2975x {

    /* JADX INFO: renamed from: a */
    public boolean f11834a = false;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f11835b;

    public C2943d(ViewGroup viewGroup) {
        this.f11835b = viewGroup;
    }

    @Override // p032bc.AbstractC2975x, p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: a */
    public final void mo8600a() {
        AbstractC3511b.m10370J(this.f11835b, false);
    }

    @Override // p032bc.AbstractC2975x, p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: c */
    public final void mo8572c(AbstractC2974w abstractC2974w) {
        if (!this.f11834a) {
            AbstractC3511b.m10370J(this.f11835b, false);
        }
        abstractC2974w.mo8576C(this);
    }

    @Override // p032bc.AbstractC2975x, p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: d */
    public final void mo8573d(AbstractC2974w abstractC2974w) {
        AbstractC3511b.m10370J(this.f11835b, false);
        this.f11834a = true;
    }

    @Override // p032bc.AbstractC2975x, p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: e */
    public final void mo8601e() {
        AbstractC3511b.m10370J(this.f11835b, true);
    }
}
