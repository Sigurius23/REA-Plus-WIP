package p132f0;

import android.graphics.Rect;
import androidx.compose.p018ui.node.NodeCoordinator;
import e93.AbstractC12889b;
import p005a3.InterfaceC0249s;
import p026b2.AbstractC2316v;
import p181h2.C16618c;
import p446r1.C30849c;
import p635y2.AbstractC39125q1;

/* JADX INFO: renamed from: f0.k1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13800k1 extends AbstractC2316v implements InterfaceC0249s {

    /* JADX INFO: renamed from: O */
    public Rect f49244O;

    @Override // p005a3.InterfaceC0249s
    /* JADX INFO: renamed from: I0 */
    public final void mo284I0(NodeCoordinator nodeCoordinator) {
        C16618c c16618cMo3547r = AbstractC39125q1.m124662h(nodeCoordinator).mo3547r(nodeCoordinator, true);
        Rect rect = new Rect(AbstractC12889b.m36258X(c16618cMo3547r.f63939a), AbstractC12889b.m36258X(c16618cMo3547r.f63940b), AbstractC12889b.m36258X(c16618cMo3547r.f63941c), AbstractC12889b.m36258X(c16618cMo3547r.f63942d));
        C30849c c30849cMo39155X0 = mo39155X0();
        Object obj = this.f49244O;
        if (obj != null) {
            c30849cMo39155X0.m94893k(obj);
        }
        if (!rect.isEmpty()) {
            c30849cMo39155X0.m94885b(rect);
        }
        mo39156Y0(c30849cMo39155X0);
        this.f49244O = rect;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        C30849c c30849cMo39155X0 = mo39155X0();
        Rect rect = this.f49244O;
        if (rect != null) {
            c30849cMo39155X0.m94893k(rect);
        }
        mo39156Y0(c30849cMo39155X0);
        this.f49244O = null;
    }

    /* JADX INFO: renamed from: X0 */
    public abstract C30849c mo39155X0();

    /* JADX INFO: renamed from: Y0 */
    public abstract void mo39156Y0(C30849c c30849c);
}
