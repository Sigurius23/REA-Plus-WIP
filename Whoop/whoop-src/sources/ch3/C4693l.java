package ch3;

import bh3.InterfaceC3260g;
import jh3.AbstractC21700a;
import p098dt.AbstractC12350b;
import p471rx.exceptions.OnErrorThrowable;
import xg3.AbstractC38292s;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: ch3.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C4693l extends AbstractC38292s {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f19224E;

    /* JADX INFO: renamed from: F */
    public final AbstractC38292s f19225F;

    /* JADX INFO: renamed from: G */
    public final Object f19226G;

    /* JADX INFO: renamed from: H */
    public boolean f19227H;

    public /* synthetic */ C4693l(AbstractC38292s abstractC38292s, Object obj, int i13) {
        this.f19224E = i13;
        this.f19225F = abstractC38292s;
        this.f19226G = obj;
    }

    @Override // xg3.AbstractC38292s
    /* JADX INFO: renamed from: f */
    public final void mo14765f(InterfaceC38282i interfaceC38282i) {
        switch (this.f19224E) {
            case 0:
                super.mo14765f(interfaceC38282i);
                this.f19225F.mo14765f(interfaceC38282i);
                break;
            case 1:
                this.f19225F.mo14765f(interfaceC38282i);
                break;
            default:
                this.f19225F.mo14765f(interfaceC38282i);
                break;
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        switch (this.f19224E) {
            case 0:
                if (!this.f19227H) {
                    this.f19225F.onCompleted();
                    break;
                }
                break;
            case 1:
                if (!this.f19227H) {
                    this.f19225F.onCompleted();
                    break;
                }
                break;
            default:
                if (!this.f19227H) {
                    this.f19225F.onCompleted();
                    break;
                }
                break;
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        switch (this.f19224E) {
            case 0:
                if (!this.f19227H) {
                    this.f19227H = true;
                    this.f19225F.onError(th3);
                } else {
                    AbstractC21700a.m61126a(th3);
                }
                break;
            case 1:
                if (!this.f19227H) {
                    this.f19227H = true;
                    this.f19225F.onError(th3);
                } else {
                    AbstractC21700a.m61126a(th3);
                }
                break;
            default:
                if (!this.f19227H) {
                    this.f19227H = true;
                    this.f19225F.onError(th3);
                } else {
                    AbstractC21700a.m61126a(th3);
                }
                break;
        }
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        switch (this.f19224E) {
            case 0:
                try {
                    if (!((Boolean) ((InterfaceC3260g) this.f19226G).mo1678b(obj)).booleanValue()) {
                        m122689e(1L);
                    } else {
                        this.f19225F.onNext(obj);
                    }
                } catch (Throwable th3) {
                    AbstractC12350b.m34573V(th3);
                    mo14750b();
                    OnErrorThrowable.m99122a(obj, th3);
                    onError(th3);
                    return;
                }
                break;
            case 1:
                try {
                    this.f19225F.onNext(((InterfaceC3260g) this.f19226G).mo1678b(obj));
                } catch (Throwable th4) {
                    AbstractC12350b.m34573V(th4);
                    mo14750b();
                    OnErrorThrowable.m99122a(obj, th4);
                    onError(th4);
                    return;
                }
                break;
            default:
                try {
                    this.f19225F.onNext(((Class) this.f19226G).cast(obj));
                } catch (Throwable th5) {
                    AbstractC12350b.m34573V(th5);
                    mo14750b();
                    OnErrorThrowable.m99122a(obj, th5);
                    onError(th5);
                }
                break;
        }
    }

    public C4693l(AbstractC38292s abstractC38292s, InterfaceC3260g interfaceC3260g) {
        this.f19224E = 0;
        this.f19225F = abstractC38292s;
        this.f19226G = interfaceC3260g;
        m122689e(0L);
    }
}
