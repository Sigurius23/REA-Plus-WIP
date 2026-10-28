package lh3;

import ch3.AbstractC4677d;
import java.util.ArrayList;
import xg3.AbstractC38292s;
import xg3.InterfaceC38281h;

/* JADX INFO: renamed from: lh3.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C24090m implements InterfaceC38281h {

    /* JADX INFO: renamed from: E */
    public boolean f95158E;

    /* JADX INFO: renamed from: w */
    public final AbstractC38292s f95159w;

    /* JADX INFO: renamed from: x */
    public boolean f95160x = true;

    /* JADX INFO: renamed from: y */
    public boolean f95161y;

    /* JADX INFO: renamed from: z */
    public ArrayList f95162z;

    public C24090m(AbstractC38292s abstractC38292s) {
        this.f95159w = abstractC38292s;
    }

    /* JADX INFO: renamed from: a */
    public final void m71003a(Object obj) {
        if (!this.f95158E) {
            synchronized (this) {
                try {
                    this.f95160x = false;
                    if (this.f95161y) {
                        if (this.f95162z == null) {
                            this.f95162z = new ArrayList();
                        }
                        this.f95162z.add(obj);
                        return;
                    }
                    this.f95158E = true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        AbstractC4677d.m14744a(this.f95159w, obj);
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        this.f95159w.onCompleted();
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        this.f95159w.onError(th3);
    }

    @Override // xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        this.f95159w.onNext(obj);
    }
}
