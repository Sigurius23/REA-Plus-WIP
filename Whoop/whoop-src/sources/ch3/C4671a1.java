package ch3;

import bh3.InterfaceC3260g;
import jh3.AbstractC21700a;
import p098dt.AbstractC12350b;
import p471rx.exceptions.OnErrorThrowable;
import xg3.AbstractC38291r;

/* JADX INFO: renamed from: ch3.a1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4671a1 extends AbstractC38291r {

    /* JADX INFO: renamed from: x */
    public final AbstractC38291r f19123x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC3260g f19124y;

    /* JADX INFO: renamed from: z */
    public boolean f19125z;

    public C4671a1(AbstractC38291r abstractC38291r, InterfaceC3260g interfaceC3260g) {
        this.f19123x = abstractC38291r;
        this.f19124y = interfaceC3260g;
    }

    @Override // xg3.AbstractC38291r
    /* JADX INFO: renamed from: d */
    public final void mo14742d(Throwable th3) {
        if (this.f19125z) {
            AbstractC21700a.m61126a(th3);
        } else {
            this.f19125z = true;
            this.f19123x.mo14742d(th3);
        }
    }

    @Override // xg3.AbstractC38291r
    /* JADX INFO: renamed from: e */
    public final void mo14743e(Object obj) {
        try {
            this.f19123x.mo14743e(this.f19124y.mo1678b(obj));
        } catch (Throwable th3) {
            AbstractC12350b.m34573V(th3);
            mo14750b();
            OnErrorThrowable.m99122a(obj, th3);
            mo14742d(th3);
        }
    }
}
