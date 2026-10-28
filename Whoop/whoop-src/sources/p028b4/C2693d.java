package p028b4;

import android.view.WindowInsets;
import androidx.compose.p018ui.node.Owner;
import androidx.compose.p018ui.platform.AndroidComposeView;
import java.util.HashMap;
import l83.C23454a0;
import p005a3.C0230n0;
import p027b3.C2426q;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p635y2.InterfaceC39147y;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b4.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C2693d extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10596w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC2701l f10597x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0230n0 f10598y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2693d(AbstractC2701l abstractC2701l, C0230n0 c0230n0, int i13) {
        super(1);
        this.f10596w = i13;
        this.f10597x = abstractC2701l;
        this.f10598y = c0230n0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsM47602g;
        switch (this.f10596w) {
            case 0:
                Owner owner = (Owner) obj;
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                AbstractC2701l abstractC2701l = this.f10597x;
                if (androidComposeView != null) {
                    HashMap<AbstractC2701l, C0230n0> holderToLayoutNode = androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    C0230n0 c0230n0 = this.f10598y;
                    holderToLayoutNode.put(abstractC2701l, c0230n0);
                    androidComposeView.getAndroidViewsHandler$ui_release().addView(abstractC2701l);
                    androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(c0230n0, abstractC2701l);
                    abstractC2701l.setImportantForAccessibility(1);
                    AbstractC16901p0.m47583n(abstractC2701l, new C2426q(androidComposeView, c0230n0, androidComposeView));
                }
                if (abstractC2701l.getView().getParent() != abstractC2701l) {
                    abstractC2701l.addView(abstractC2701l.getView());
                }
                break;
            case 1:
                AbstractC2703n.m7587f(this.f10597x, this.f10598y);
                break;
            default:
                C0230n0 c0230n1 = this.f10598y;
                AbstractC2701l abstractC2701l2 = this.f10597x;
                AbstractC2703n.m7587f(abstractC2701l2, c0230n1);
                ((AndroidComposeView) abstractC2701l2.f10644y).f4943d0 = true;
                int[] iArr = abstractC2701l2.f10630N;
                int i13 = iArr[0];
                int i14 = iArr[1];
                abstractC2701l2.getView().getLocationOnScreen(iArr);
                long j7 = abstractC2701l2.f10631O;
                long jMo3541n = ((InterfaceC39147y) obj).mo3541n();
                abstractC2701l2.f10631O = jMo3541n;
                C16905q1 c16905q1 = abstractC2701l2.f10632P;
                if (c16905q1 != null && ((i13 != iArr[0] || i14 != iArr[1] || !C39180l.m124799a(j7, jMo3541n)) && (windowInsetsM47602g = abstractC2701l2.m7581m(c16905q1).m47602g()) != null)) {
                    abstractC2701l2.getView().dispatchApplyWindowInsets(windowInsetsM47602g);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
