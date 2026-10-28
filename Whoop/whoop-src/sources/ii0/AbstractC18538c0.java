package ii0;

import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: ii0.c0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC18538c0 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ComposeView f72235a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f72236b;

    /* JADX INFO: renamed from: c */
    public final TextView f72237c;

    /* JADX INFO: renamed from: d */
    public final ViewFlipper f72238d;

    /* JADX INFO: renamed from: e */
    public final TextView f72239e;

    /* JADX INFO: renamed from: f */
    public final Guideline f72240f;

    /* JADX INFO: renamed from: g */
    public final Guideline f72241g;

    /* JADX INFO: renamed from: h */
    public final RecyclerView f72242h;

    public AbstractC18538c0(Object obj, View view, int i13, ComposeView composeView, ConstraintLayout constraintLayout, TextView textView, ViewFlipper viewFlipper, TextView textView2, Guideline guideline, Guideline guideline2, RecyclerView recyclerView) {
        super(view, i13, obj);
        this.f72235a = composeView;
        this.f72236b = constraintLayout;
        this.f72237c = textView;
        this.f72238d = viewFlipper;
        this.f72239e = textView2;
        this.f72240f = guideline;
        this.f72241g = guideline2;
        this.f72242h = recyclerView;
    }
}
