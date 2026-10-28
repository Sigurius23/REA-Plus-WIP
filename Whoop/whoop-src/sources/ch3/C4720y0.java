package ch3;

import java.util.NoSuchElementException;
import jh3.AbstractC21700a;
import xg3.AbstractC38291r;
import xg3.AbstractC38292s;

/* JADX INFO: renamed from: ch3.y0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4720y0 extends AbstractC38292s {

    /* JADX INFO: renamed from: E */
    public final AbstractC38291r f19304E;

    /* JADX INFO: renamed from: F */
    public Object f19305F;

    /* JADX INFO: renamed from: G */
    public int f19306G;

    public C4720y0(AbstractC38291r abstractC38291r) {
        this.f19304E = abstractC38291r;
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        int i13 = this.f19306G;
        AbstractC38291r abstractC38291r = this.f19304E;
        if (i13 == 0) {
            abstractC38291r.mo14742d(new NoSuchElementException());
        } else if (i13 == 1) {
            this.f19306G = 2;
            Object obj = this.f19305F;
            this.f19305F = null;
            abstractC38291r.mo14743e(obj);
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        if (this.f19306G == 2) {
            AbstractC21700a.m61126a(th3);
        } else {
            this.f19305F = null;
            this.f19304E.mo14742d(th3);
        }
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        int i13 = this.f19306G;
        if (i13 == 0) {
            this.f19306G = 1;
            this.f19305F = obj;
        } else if (i13 == 1) {
            this.f19306G = 2;
            this.f19304E.mo14742d(new IndexOutOfBoundsException("The upstream produced more than one value"));
        }
    }
}
