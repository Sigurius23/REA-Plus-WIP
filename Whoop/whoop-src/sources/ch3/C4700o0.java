package ch3;

import ih3.C18529b;
import xg3.AbstractC38292s;
import xg3.InterfaceC38281h;

/* JADX INFO: renamed from: ch3.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4700o0 extends AbstractC38292s {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f19247E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC38281h f19248F;

    public /* synthetic */ C4700o0(InterfaceC38281h interfaceC38281h, int i13) {
        this.f19247E = i13;
        this.f19248F = interfaceC38281h;
    }

    @Override // xg3.AbstractC38292s
    /* JADX INFO: renamed from: d */
    public void mo14748d() {
        switch (this.f19247E) {
            case 0:
                m122689e(0L);
                break;
            default:
                super.mo14748d();
                break;
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() throws Throwable {
        switch (this.f19247E) {
            case 0:
                ((C4698n0) this.f19248F).onCompleted();
                break;
            case 1:
                this.f19248F.onCompleted();
                break;
            default:
                ((C18529b) this.f19248F).onCompleted();
                break;
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) throws Throwable {
        switch (this.f19247E) {
            case 0:
                ((C4698n0) this.f19248F).onError(th3);
                break;
            case 1:
                this.f19248F.onError(th3);
                break;
            default:
                ((C18529b) this.f19248F).onError(th3);
                break;
        }
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) throws Throwable {
        switch (this.f19247E) {
            case 0:
                ((C4698n0) this.f19248F).onNext(obj);
                break;
            case 1:
                this.f19248F.onNext(obj);
                break;
            default:
                ((C18529b) this.f19248F).onNext(obj);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4700o0(AbstractC38292s abstractC38292s, boolean z4) {
        super(abstractC38292s, z4);
        this.f19247E = 2;
        this.f19248F = new C18529b(abstractC38292s);
    }
}
