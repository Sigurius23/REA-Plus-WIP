package p023ay;

import b30.AbstractC2590o3;
import b30.C2566l3;
import b30.C2574m3;
import b30.C2582n3;
import com.stripe.android.paymentsheet.p055ui.PrimaryButton;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p390p1.InterfaceC28601c1;
import p715kotlin.NoWhenBranchMatchedException;
import q20.AbstractC29815e0;
import q20.C29807a0;
import q20.C29809b0;
import q20.C29811c0;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ay.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C2139m implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8530w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f8531x;

    public /* synthetic */ C2139m(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f8530w = i13;
        this.f8531x = interfaceC28601c1;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        AbstractC2590o3 c2566l3;
        switch (this.f8530w) {
            case 0:
                this.f8531x.setValue(Boolean.FALSE);
                return C23454a0.f92919a;
            default:
                AbstractC29815e0 abstractC29815e0 = (AbstractC29815e0) obj;
                PrimaryButton primaryButton = (PrimaryButton) this.f8531x.getValue();
                if (primaryButton != null) {
                    if (abstractC29815e0 == null) {
                        c2566l3 = null;
                    } else if (abstractC29815e0 instanceof C29809b0) {
                        c2566l3 = C2574m3.f10009a;
                    } else if (abstractC29815e0 instanceof C29811c0) {
                        c2566l3 = C2582n3.f10042a;
                    } else {
                        if (!(abstractC29815e0 instanceof C29807a0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2566l3 = new C2566l3(((C29807a0) abstractC29815e0).f121862b);
                    }
                    primaryButton.m16869c(c2566l3);
                }
                return C23454a0.f92919a;
        }
    }
}
