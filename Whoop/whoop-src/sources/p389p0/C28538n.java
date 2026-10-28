package p389p0;

import ch.C4592m;
import m83.C25272z;
import p005a3.AbstractC0201g;
import p005a3.InterfaceC0186c0;
import p014aj.C0929d;
import p026b2.AbstractC2316v;
import p180h0.EnumC16377d2;
import p635y2.AbstractC39093g;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p669z2.C40006i;
import p669z2.InterfaceC40002e;
import p715kotlin.NoWhenBranchMatchedException;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: p0.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C28538n extends AbstractC2316v implements InterfaceC40002e, InterfaceC0186c0 {

    /* JADX INFO: renamed from: R */
    public static final C28534l f115457R = new C28534l();

    /* JADX INFO: renamed from: O */
    public InterfaceC28540o f115458O;

    /* JADX INFO: renamed from: P */
    public C0929d f115459P;

    /* JADX INFO: renamed from: Q */
    public EnumC16377d2 f115460Q;

    /* JADX INFO: renamed from: X0 */
    public final boolean m86832X0(C28532k c28532k, int i13) {
        if (i13 == 5 || i13 == 6) {
            if (this.f115460Q == EnumC16377d2.f62972x) {
                return false;
            }
        } else if (i13 == 3 || i13 == 4) {
            if (this.f115460Q == EnumC16377d2.f62971w) {
                return false;
            }
        } else if (i13 != 1 && i13 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (m86833Y0(i13)) {
            if (c28532k.f115446b >= this.f115458O.getItemCount() - 1) {
                return false;
            }
        } else if (c28532k.f115445a <= 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m86833Y0(int i13) {
        if (i13 == 1) {
            return false;
        }
        if (i13 == 2) {
            return true;
        }
        if (i13 == 5) {
            return false;
        }
        if (i13 == 6) {
            return true;
        }
        if (i13 == 3) {
            int iOrdinal = AbstractC0201g.m516p(this).f777Y.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i13 != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int iOrdinal2 = AbstractC0201g.m516p(this).f777Y.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(j7);
        return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C4592m(abstractC39104j1Mo448T, 7));
    }

    @Override // p669z2.InterfaceC40002e
    /* JADX INFO: renamed from: v */
    public final AbstractC35745c mo474v() {
        C40006i c40006i = new C40006i(AbstractC39093g.f168179a);
        c40006i.f172593b.setValue(this);
        return c40006i;
    }
}
