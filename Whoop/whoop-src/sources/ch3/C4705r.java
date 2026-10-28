package ch3;

import java.util.NoSuchElementException;
import xg3.AbstractC38291r;
import xg3.AbstractC38292s;

/* JADX INFO: renamed from: ch3.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C4705r extends AbstractC38292s {

    /* JADX INFO: renamed from: E */
    public boolean f19262E;

    /* JADX INFO: renamed from: F */
    public boolean f19263F;

    /* JADX INFO: renamed from: G */
    public Object f19264G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ AbstractC38291r f19265H;

    public C4705r(AbstractC38291r abstractC38291r) {
        this.f19265H = abstractC38291r;
    }

    @Override // xg3.AbstractC38292s
    /* JADX INFO: renamed from: d */
    public final void mo14748d() {
        m122689e(2L);
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        if (this.f19262E) {
            return;
        }
        boolean z4 = this.f19263F;
        AbstractC38291r abstractC38291r = this.f19265H;
        if (z4) {
            abstractC38291r.mo14743e(this.f19264G);
        } else {
            abstractC38291r.mo14742d(new NoSuchElementException("Observable emitted no items"));
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        this.f19265H.mo14742d(th3);
        mo14750b();
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        if (!this.f19263F) {
            this.f19263F = true;
            this.f19264G = obj;
        } else {
            this.f19262E = true;
            this.f19265H.mo14742d(new IllegalArgumentException("Observable emitted too many elements"));
            mo14750b();
        }
    }
}
