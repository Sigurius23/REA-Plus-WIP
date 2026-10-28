package ch3;

import gh3.EnumC15858c;
import jh3.AbstractC21700a;
import xg3.AbstractC38292s;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: ch3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C4687i extends AbstractC38292s {

    /* JADX INFO: renamed from: E */
    public final C4689j f19190E;

    /* JADX INFO: renamed from: F */
    public long f19191F;

    public C4687i(C4689j c4689j) {
        this.f19190E = c4689j;
    }

    @Override // xg3.AbstractC38292s
    /* JADX INFO: renamed from: f */
    public final void mo14765f(InterfaceC38282i interfaceC38282i) {
        this.f19190E.f19204G.m33225c(interfaceC38282i);
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        this.f19190E.m14770i(this.f19191F);
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) throws Throwable {
        C4689j c4689j = this.f19190E;
        if (!EnumC15858c.m44774a(c4689j.f19207J, th3)) {
            AbstractC21700a.m61126a(th3);
            return;
        }
        Throwable thM44776c = EnumC15858c.m44776c(c4689j.f19207J);
        if (!EnumC15858c.m44775b(thM44776c)) {
            c4689j.f19202E.onError(thM44776c);
        }
        c4689j.mo14750b();
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        this.f19191F++;
        this.f19190E.m14771j(obj);
    }
}
