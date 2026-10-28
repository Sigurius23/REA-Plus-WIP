package p179h;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.lifecycle.AbstractC1613o1;
import p161g.AbstractActivityC14909l;
import p505ts.AbstractC34132o;
import p602x1.C37816b;

/* JADX INFO: renamed from: h.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16348f {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.LayoutParams f62864a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX INFO: renamed from: a */
    public static void m46559a(AbstractActivityC14909l abstractActivityC14909l, C37816b c37816b) {
        View childAt = ((ViewGroup) abstractActivityC14909l.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(c37816b);
            return;
        }
        ComposeView composeView2 = new ComposeView(abstractActivityC14909l, null, 6);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(c37816b);
        View decorView = abstractActivityC14909l.getWindow().getDecorView();
        if (AbstractC1613o1.m5017g(decorView) == null) {
            AbstractC1613o1.m5024n(decorView, abstractActivityC14909l);
        }
        if (AbstractC1613o1.m5018h(decorView) == null) {
            AbstractC1613o1.m5025o(decorView, abstractActivityC14909l);
        }
        if (AbstractC34132o.m107891t(decorView) == null) {
            AbstractC34132o.m107862G(decorView, abstractActivityC14909l);
        }
        abstractActivityC14909l.setContentView(composeView2, f62864a);
    }
}
