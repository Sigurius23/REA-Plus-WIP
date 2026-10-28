package te3;

import bf3.InterfaceC3202a;
import java.util.ArrayList;
import p012ab.C0684i0;
import qe3.InterfaceC30316a;
import ue3.C34864a;
import we3.C37234a;

/* JADX INFO: renamed from: te3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C33755b implements InterfaceC3202a, InterfaceC30316a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f141249a;

    public /* synthetic */ C33755b(int i13) {
        this.f141249a = i13;
    }

    @Override // bf3.InterfaceC3202a
    /* JADX INFO: renamed from: a */
    public final void mo9250a(C0684i0 c0684i0) {
        switch (this.f141249a) {
            case 0:
                ((ArrayList) c0684i0.f2447z).add(new C34864a());
                break;
            default:
                ((ArrayList) c0684i0.f2446y).add(new C37234a(0));
                break;
        }
    }
}
