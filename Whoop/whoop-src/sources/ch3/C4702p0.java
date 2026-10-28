package ch3;

import xg3.AbstractC38292s;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: ch3.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4702p0 extends AbstractC38292s {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f19251E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AbstractC38292s f19252F;

    public /* synthetic */ C4702p0(AbstractC38292s abstractC38292s, int i13) {
        this.f19251E = i13;
        this.f19252F = abstractC38292s;
    }

    @Override // xg3.AbstractC38292s
    /* JADX INFO: renamed from: d */
    public void mo14748d() {
        switch (this.f19251E) {
            case 2:
                m122689e(Long.MAX_VALUE);
                break;
            default:
                super.mo14748d();
                break;
        }
    }

    @Override // xg3.AbstractC38292s
    /* JADX INFO: renamed from: f */
    public void mo14765f(InterfaceC38282i interfaceC38282i) {
        switch (this.f19251E) {
            case 0:
                ((C4704q0) this.f19252F).f19259H.m33225c(interfaceC38282i);
                break;
            default:
                super.mo14765f(interfaceC38282i);
                break;
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        switch (this.f19251E) {
            case 0:
                ((C4704q0) this.f19252F).f19258G.onCompleted();
                return;
            case 1:
                C4700o0 c4700o0 = (C4700o0) this.f19252F;
                try {
                    c4700o0.onCompleted();
                    return;
                } finally {
                    c4700o0.mo14750b();
                }
            default:
                ((C4702p0) this.f19252F).onCompleted();
                return;
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        switch (this.f19251E) {
            case 0:
                ((C4704q0) this.f19252F).f19258G.onError(th3);
                return;
            case 1:
                C4700o0 c4700o0 = (C4700o0) this.f19252F;
                try {
                    c4700o0.onError(th3);
                    return;
                } finally {
                    c4700o0.mo14750b();
                }
            default:
                ((C4702p0) this.f19252F).onError(th3);
                return;
        }
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public void onNext(Object obj) throws Throwable {
        switch (this.f19251E) {
            case 0:
                ((C4704q0) this.f19252F).f19258G.onNext(obj);
                break;
            case 1:
                ((C4700o0) this.f19252F).onNext(obj);
                break;
            default:
                super.onNext(obj);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4702p0(C4700o0 c4700o0, C4700o0 c4700o1) {
        super(c4700o0, false);
        this.f19251E = 1;
        this.f19252F = c4700o1;
    }
}
