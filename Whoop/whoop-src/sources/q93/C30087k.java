package q93;

import c93.InterfaceC4339a;
import java.util.List;
import s93.AbstractC32303e;
import s93.C32305g;
import s93.C32308j;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: q93.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C30087k implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f122788w;

    /* JADX INFO: renamed from: x */
    public final C30092p f122789x;

    public /* synthetic */ C30087k(C30092p c30092p, int i13) {
        this.f122788w = i13;
        this.f122789x = c30092p;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f122788w) {
            case 0:
                List listM118958J = AbstractC37056f.m118958J(AbstractC32303e.m100551a(this.f122789x.f122798a.f146045E, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
                return listM118958J.isEmpty() ? C32305g.f133684a : new C32308j(listM118958J, 0);
            default:
                return this.f122789x.f122798a.f146045E.m83817e();
        }
    }
}
