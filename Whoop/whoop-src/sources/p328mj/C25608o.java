package p328mj;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.Nudge;
import l83.C23454a0;
import p088dc.AbstractC11894a;
import p097ds.AbstractC12314q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28674u2;
import p525uj.AbstractC35033k;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: mj.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C25608o extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100459w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25609p f100460x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25608o(C25609p c25609p, int i13) {
        super(2);
        this.f100459w = i13;
        this.f100460x = c25609p;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ed  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f100459w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C25609p c25609p = this.f100460x;
                Nudge nudge = c25609p.f100462b;
                if ((iIntValue & 11) == 2) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else if (nudge.isCarousel()) {
                        C28655q c28655q2 = (C28655q) composer;
                        c28655q2.m87152f0(-1332008246);
                        AbstractC11894a.m31956e(nudge, c25609p.f100463c, c25609p.f100465e, new C25607n(c25609p, 0), c28655q2, 520);
                        c28655q2.m87173q(false);
                    } else {
                        C28655q c28655q3 = (C28655q) composer;
                        c28655q3.m87152f0(-1332007858);
                        AbstractC12314q.m34327g(nudge, c25609p.f100463c, new C25607n(c25609p, 1), c28655q3, 8);
                        c28655q3.m87173q(false);
                    }
                } else if (nudge.isCarousel()) {
                    C28655q c28655q4 = (C28655q) composer;
                    c28655q4.m87152f0(-1332008246);
                    AbstractC11894a.m31956e(nudge, c25609p.f100463c, c25609p.f100465e, new C25607n(c25609p, 0), c28655q4, 520);
                    c28655q4.m87173q(false);
                } else {
                    C28655q c28655q5 = (C28655q) composer;
                    c28655q5.m87152f0(-1332007858);
                    AbstractC12314q.m34327g(nudge, c25609p.f100463c, new C25607n(c25609p, 1), c28655q5, 8);
                    c28655q5.m87173q(false);
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    C28655q c28655q6 = (C28655q) composer2;
                    if (c28655q6.m87121F()) {
                        c28655q6.m87138X();
                    } else {
                        C25609p c25609p2 = this.f100460x;
                        AbstractC35033k.m110709a(c25609p2.f100464d, false, AbstractC37817c.m121341b(-1403443584, composer2, new C25608o(c25609p2, 0)), composer2, 384);
                    }
                } else {
                    C25609p c25609p3 = this.f100460x;
                    AbstractC35033k.m110709a(c25609p3.f100464d, false, AbstractC37817c.m121341b(-1403443584, composer2, new C25608o(c25609p3, 0)), composer2, 384);
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    C28655q c28655q7 = (C28655q) composer3;
                    if (c28655q7.m87121F()) {
                        c28655q7.m87138X();
                    } else {
                        C28674u2 c28674u2 = AbstractC25611r.f100476b;
                        C25609p c25609p4 = this.f100460x;
                        AbstractC28683x.m87247a(c28674u2.mo86977a(c25609p4), AbstractC37817c.m121341b(1272955037, composer3, new C25608o(c25609p4, 1)), composer3, 56);
                    }
                } else {
                    C28674u2 c28674u3 = AbstractC25611r.f100476b;
                    C25609p c25609p5 = this.f100460x;
                    AbstractC28683x.m87247a(c28674u3.mo86977a(c25609p5), AbstractC37817c.m121341b(1272955037, composer3, new C25608o(c25609p5, 1)), composer3, 56);
                }
                break;
            default:
                Composer composer4 = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    C28655q c28655q8 = (C28655q) composer4;
                    if (c28655q8.m87121F()) {
                        c28655q8.m87138X();
                    } else {
                        C28674u2 c28674u4 = AbstractC25611r.f100475a;
                        C25609p c25609p6 = this.f100460x;
                        AbstractC28683x.m87247a(c28674u4.mo86977a(c25609p6.f100461a), AbstractC37817c.m121341b(-1070854819, composer4, new C25608o(c25609p6, 2)), composer4, 56);
                    }
                } else {
                    C28674u2 c28674u5 = AbstractC25611r.f100475a;
                    C25609p c25609p7 = this.f100460x;
                    AbstractC28683x.m87247a(c28674u5.mo86977a(c25609p7.f100461a), AbstractC37817c.m121341b(-1070854819, composer4, new C25608o(c25609p7, 2)), composer4, 56);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
