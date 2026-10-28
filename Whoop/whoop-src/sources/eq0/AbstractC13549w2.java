package eq0;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.AbstractC1168a0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: eq0.w2 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13549w2 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final TextView f47734a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f47735b;

    /* JADX INFO: renamed from: c */
    public final RecyclerView f47736c;

    /* JADX INFO: renamed from: d */
    public final NestedScrollView f47737d;

    /* JADX INFO: renamed from: e */
    public final LinearLayout f47738e;

    public AbstractC13549w2(Object obj, View view, int i13, TextView textView, ConstraintLayout constraintLayout, RecyclerView recyclerView, NestedScrollView nestedScrollView, LinearLayout linearLayout) {
        super(view, i13, obj);
        this.f47734a = textView;
        this.f47735b = constraintLayout;
        this.f47736c = recyclerView;
        this.f47737d = nestedScrollView;
        this.f47738e = linearLayout;
    }
}
