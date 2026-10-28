package ch3;

import a33.C0352d;
import jh3.AbstractC21700a;
import xg3.AbstractC38292s;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: ch3.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4712u0 extends AbstractC38292s {

    /* JADX INFO: renamed from: E */
    public int f19285E;

    /* JADX INFO: renamed from: F */
    public boolean f19286F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ AbstractC38292s f19287G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C4714v0 f19288H;

    public C4712u0(C4714v0 c4714v0, AbstractC38292s abstractC38292s) {
        this.f19288H = c4714v0;
        this.f19287G = abstractC38292s;
    }

    @Override // xg3.AbstractC38292s
    /* JADX INFO: renamed from: f */
    public final void mo14765f(InterfaceC38282i interfaceC38282i) {
        this.f19287G.mo14765f(new C0352d(this, interfaceC38282i));
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        if (this.f19286F) {
            return;
        }
        this.f19286F = true;
        this.f19287G.onCompleted();
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        if (this.f19286F) {
            AbstractC21700a.m61126a(th3);
            return;
        }
        this.f19286F = true;
        try {
            this.f19287G.onError(th3);
        } finally {
            mo14750b();
        }
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        if (mo14749a()) {
            return;
        }
        int i13 = this.f19285E;
        int i14 = i13 + 1;
        this.f19285E = i14;
        int i15 = this.f19288H.f19290w;
        if (i13 < i15) {
            boolean z4 = i14 == i15;
            AbstractC38292s abstractC38292s = this.f19287G;
            abstractC38292s.onNext(obj);
            if (!z4 || this.f19286F) {
                return;
            }
            this.f19286F = true;
            try {
                abstractC38292s.onCompleted();
            } finally {
                mo14750b();
            }
        }
    }
}
