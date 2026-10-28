package ch3;

import java.util.ArrayList;
import p098dt.AbstractC12350b;
import xg3.AbstractC38283j;
import xg3.AbstractC38292s;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: ch3.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C4717x extends AbstractC38292s {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f19295E;

    /* JADX INFO: renamed from: F */
    public boolean f19296F;

    /* JADX INFO: renamed from: G */
    public Object f19297G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC38293t f19298H;

    /* JADX INFO: renamed from: I */
    public Object f19299I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4717x(C4678d0 c4678d0, AbstractC38292s abstractC38292s, AbstractC38292s abstractC38292s2) {
        super(abstractC38292s, true);
        this.f19295E = 1;
        this.f19299I = c4678d0;
        this.f19298H = abstractC38292s2;
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() throws Throwable {
        switch (this.f19295E) {
            case 0:
                try {
                    ((AbstractC38283j) this.f19298H).mo14750b();
                    synchronized (this) {
                        try {
                            if (!this.f19296F) {
                                this.f19296F = true;
                                ArrayList arrayList = (ArrayList) this.f19299I;
                                this.f19299I = null;
                                ((C4700o0) this.f19297G).onNext(arrayList);
                                ((C4700o0) this.f19297G).onCompleted();
                                mo14750b();
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                } catch (Throwable th4) {
                    AbstractC12350b.m34574W(th4, (C4700o0) this.f19297G);
                    return;
                }
            default:
                ((AbstractC38292s) this.f19298H).onCompleted();
                return;
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) throws Throwable {
        switch (this.f19295E) {
            case 0:
                synchronized (this) {
                    try {
                        if (this.f19296F) {
                            return;
                        }
                        this.f19296F = true;
                        this.f19299I = null;
                        ((C4700o0) this.f19297G).onError(th3);
                        mo14750b();
                        return;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            default:
                ((AbstractC38292s) this.f19298H).onError(th3);
                return;
        }
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) throws Throwable {
        ArrayList arrayList;
        switch (this.f19295E) {
            case 0:
                synchronized (this) {
                    try {
                        if (this.f19296F) {
                            return;
                        }
                        ((ArrayList) this.f19299I).add(obj);
                        if (((ArrayList) this.f19299I).size() == Integer.MAX_VALUE) {
                            arrayList = (ArrayList) this.f19299I;
                            this.f19299I = new ArrayList();
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            ((C4700o0) this.f19297G).onNext(arrayList);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            default:
                C4678d0 c4678d0 = (C4678d0) this.f19299I;
                AbstractC38292s abstractC38292s = (AbstractC38292s) this.f19298H;
                Object obj2 = this.f19297G;
                this.f19297G = obj;
                if (!this.f19296F) {
                    this.f19296F = true;
                    abstractC38292s.onNext(obj);
                    return;
                }
                try {
                    if (((Boolean) ((C4678d0) c4678d0.f19140x).mo9474c(obj2, obj)).booleanValue()) {
                        m122689e(1L);
                        return;
                    } else {
                        abstractC38292s.onNext(obj);
                        return;
                    }
                } catch (Throwable th4) {
                    AbstractC12350b.m34575X(th4, abstractC38292s, obj);
                    return;
                }
        }
    }

    public C4717x(C4670a0 c4670a0, C4700o0 c4700o0, AbstractC38283j abstractC38283j) {
        this.f19295E = 0;
        this.f19297G = c4700o0;
        this.f19298H = abstractC38283j;
        this.f19299I = new ArrayList();
    }
}
