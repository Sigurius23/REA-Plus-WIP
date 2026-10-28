package p299l9;

import java.io.IOException;
import p171g9.C15587d;
import p607x8.InterfaceC38049d;

/* JADX INFO: renamed from: l9.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23500g0 implements InterfaceC38049d {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f93021E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C15587d f93022w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C23527t f93023x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23537y f93024y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ IOException f93025z;

    public /* synthetic */ C23500g0(C15587d c15587d, C23527t c23527t, C23537y c23537y, IOException iOException, boolean z4) {
        this.f93022w = c15587d;
        this.f93023x = c23527t;
        this.f93024y = c23537y;
        this.f93025z = iOException;
        this.f93021E = z4;
    }

    @Override // p607x8.InterfaceC38049d
    public final void accept(Object obj) {
        InterfaceC23506i0 interfaceC23506i0 = (InterfaceC23506i0) obj;
        C15587d c15587d = this.f93022w;
        interfaceC23506i0.mo8315b(c15587d.f58537a, c15587d.f58538b, this.f93023x, this.f93024y, this.f93025z, this.f93021E);
    }
}
