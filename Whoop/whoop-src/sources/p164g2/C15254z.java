package p164g2;

import l83.C23454a0;
import p005a3.AbstractC0201g;
import p028b4.C2696g;
import p077d0.C11368k;
import p180h0.InterfaceC16413k2;
import p181h2.C16618c;
import p390p1.C28633k1;
import p635y2.InterfaceC39087e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22663d0;
import v20.C35567g;
import x03.C37806c;
import x03.C37812i;

/* JADX INFO: renamed from: g2.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C15254z extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f57280E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f57281F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57282w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f57283x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f57284y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f57285z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15254z(C15252x c15252x, C15252x c15252x2, Object obj, int i13, C2696g c2696g, int i14) {
        super(1);
        this.f57282w = i14;
        this.f57283x = c15252x;
        this.f57284y = c15252x2;
        this.f57281F = obj;
        this.f57285z = i13;
        this.f57280E = c2696g;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f57282w) {
            case 0:
                InterfaceC39087e interfaceC39087e = (InterfaceC39087e) obj;
                C15252x c15252x = (C15252x) this.f57283x;
                C15252x c15252x2 = (C15252x) this.f57284y;
                if (c15252x != ((C15240l) AbstractC0201g.m517q(c15252x2).getFocusOwner()).f57246h) {
                    return Boolean.TRUE;
                }
                boolean zM43309I = AbstractC15235g.m43309I(c15252x2, (C15252x) this.f57281F, this.f57285z, (C2696g) this.f57280E);
                Boolean boolValueOf = Boolean.valueOf(zM43309I);
                if (zM43309I || !interfaceC39087e.mo86831a()) {
                    return boolValueOf;
                }
                return null;
            case 1:
                InterfaceC39087e interfaceC39087e2 = (InterfaceC39087e) obj;
                C15252x c15252x3 = (C15252x) this.f57283x;
                C15252x c15252x4 = (C15252x) this.f57284y;
                if (c15252x3 != ((C15240l) AbstractC0201g.m517q(c15252x4).getFocusOwner()).f57246h) {
                    return Boolean.TRUE;
                }
                C16618c c16618c = (C16618c) this.f57281F;
                boolean zM43308H = AbstractC15235g.m43308H(this.f57285z, (C2696g) this.f57280E, c15252x4, c16618c);
                Boolean boolValueOf2 = Boolean.valueOf(zM43308H);
                if (zM43308H || !interfaceC39087e2.mo86831a()) {
                    return boolValueOf2;
                }
                return null;
            default:
                C11368k animateTo = (C11368k) obj;
                AbstractC22676k.m65750j(animateTo, "$this$animateTo");
                C28633k1 c28633k1 = animateTo.f36440e;
                float fFloatValue = ((Number) c28633k1.getValue()).floatValue();
                C22663d0 c22663d0 = (C22663d0) this.f57283x;
                float f13 = fFloatValue - c22663d0.f89331w;
                float fMo29373a = ((InterfaceC16413k2) this.f57284y).mo29373a(f13);
                c22663d0.f89331w = ((Number) c28633k1.getValue()).floatValue();
                ((C22663d0) this.f57281F).f89331w = ((Number) animateTo.m30600b()).floatValue();
                C37812i c37812i = (C37812i) this.f57280E;
                C37806c c37806cM121322e = c37812i.f161946a.m121322e();
                if (c37806cM121322e == null) {
                    animateTo.m30599a();
                } else {
                    if (C37812i.m121324b(c37812i, animateTo, c37806cM121322e, this.f57285z, new C35567g(1, (InterfaceC16413k2) this.f57284y, InterfaceC16413k2.class, "scrollBy", "scrollBy(F)F", 0, 11)) || Math.abs(f13 - fMo29373a) > 0.5f) {
                        animateTo.m30599a();
                    }
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15254z(C22663d0 c22663d0, InterfaceC16413k2 interfaceC16413k2, C22663d0 c22663d1, C37812i c37812i, int i13) {
        super(1);
        this.f57282w = 2;
        this.f57283x = c22663d0;
        this.f57284y = interfaceC16413k2;
        this.f57281F = c22663d1;
        this.f57280E = c37812i;
        this.f57285z = i13;
    }
}
