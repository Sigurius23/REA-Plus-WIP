package w73;

import bi.AbstractC3269g;
import java.util.NoSuchElementException;
import l73.InterfaceC23413d;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;
import q73.EnumC30024c;
import t73.C33588a;

/* JADX INFO: renamed from: w73.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C36922h implements InterfaceC23413d, InterfaceC26443b {

    /* JADX INFO: renamed from: w */
    public final C33588a f157981w;

    /* JADX INFO: renamed from: x */
    public InterfaceC26443b f157982x;

    /* JADX INFO: renamed from: y */
    public long f157983y;

    /* JADX INFO: renamed from: z */
    public boolean f157984z;

    public C36922h(C33588a c33588a) {
        this.f157981w = c33588a;
    }

    @Override // l73.InterfaceC23413d
    /* JADX INFO: renamed from: b */
    public final void mo13591b(InterfaceC26443b interfaceC26443b) {
        if (EnumC30024c.m91917c(this.f157982x, interfaceC26443b)) {
            this.f157982x = interfaceC26443b;
            EnumC30024c.m91916b(this.f157981w, this);
        }
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        this.f157982x.dispose();
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f157982x.isDisposed();
    }

    @Override // l73.InterfaceC23413d
    public final void onComplete() {
        if (this.f157984z) {
            return;
        }
        this.f157984z = true;
        this.f157981w.m106087a(new NoSuchElementException());
    }

    @Override // l73.InterfaceC23413d
    public final void onError(Throwable th3) {
        if (this.f157984z) {
            AbstractC21598x.m60677d0(th3);
        } else {
            this.f157984z = true;
            this.f157981w.m106087a(th3);
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onNext(Object obj) {
        if (this.f157984z) {
            return;
        }
        long j7 = this.f157983y;
        if (j7 != 0) {
            this.f157983y = j7 + 1;
            return;
        }
        this.f157984z = true;
        this.f157982x.dispose();
        EnumC30024c enumC30024c = EnumC30024c.f122536w;
        C33588a c33588a = this.f157981w;
        c33588a.lazySet(enumC30024c);
        try {
            c33588a.f140170w.accept(obj);
        } catch (Throwable th3) {
            AbstractC3269g.m9495a0(th3);
            AbstractC21598x.m60677d0(th3);
        }
    }
}
