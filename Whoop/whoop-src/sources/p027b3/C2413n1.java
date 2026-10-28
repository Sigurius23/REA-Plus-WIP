package p027b3;

import android.view.ViewGroup;
import androidx.compose.p018ui.node.NodeCoordinator;
import l83.C23454a0;
import p005a3.C0271z0;
import p026b2.AbstractC2316v;
import p135f3.InterfaceC14037a;
import p181h2.C16618c;
import p208i2.AbstractC17918w0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b3.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2413n1 extends AbstractC2316v implements InterfaceC14037a {

    /* JADX INFO: renamed from: O */
    public ViewGroup f9467O;

    @Override // p135f3.InterfaceC14037a
    /* JADX INFO: renamed from: o0 */
    public final Object mo7407o0(NodeCoordinator nodeCoordinator, C0271z0 c0271z0, AbstractC32269c abstractC32269c) {
        long jMo3523Z = nodeCoordinator.mo3523Z(0L);
        C16618c c16618c = (C16618c) c0271z0.invoke();
        C16618c c16618cM47206l = c16618c != null ? c16618c.m47206l(jMo3523Z) : null;
        if (c16618cM47206l != null) {
            this.f9467O.requestRectangleOnScreen(AbstractC17918w0.m51502D(c16618cM47206l), false);
        }
        return C23454a0.f92919a;
    }
}
