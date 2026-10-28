package p299l9;

import p171g9.C15587d;
import p607x8.InterfaceC38049d;

/* JADX INFO: renamed from: l9.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23497f0 implements InterfaceC38049d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f93012w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15587d f93013x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23527t f93014y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C23537y f93015z;

    public /* synthetic */ C23497f0(C15587d c15587d, C23527t c23527t, C23537y c23537y, int i13) {
        this.f93012w = i13;
        this.f93013x = c15587d;
        this.f93014y = c23527t;
        this.f93015z = c23537y;
    }

    @Override // p607x8.InterfaceC38049d
    public final void accept(Object obj) {
        InterfaceC23506i0 interfaceC23506i0 = (InterfaceC23506i0) obj;
        switch (this.f93012w) {
            case 0:
                C15587d c15587d = this.f93013x;
                interfaceC23506i0.mo8314a(c15587d.f58537a, c15587d.f58538b, this.f93014y, this.f93015z);
                break;
            default:
                C15587d c15587d2 = this.f93013x;
                interfaceC23506i0.mo8316c(c15587d2.f58537a, c15587d2.f58538b, this.f93014y, this.f93015z);
                break;
        }
    }
}
