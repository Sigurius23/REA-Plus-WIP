package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.p069ui.ThrobberView;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.z1 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13560z1 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f47806a;

    /* JADX INFO: renamed from: b */
    public final RelativeLayout f47807b;

    /* JADX INFO: renamed from: c */
    public final LinearLayout f47808c;

    /* JADX INFO: renamed from: d */
    public final TextView f47809d;

    /* JADX INFO: renamed from: e */
    public final AbstractC13529s2 f47810e;

    /* JADX INFO: renamed from: f */
    public final RecyclerView f47811f;

    /* JADX INFO: renamed from: g */
    public final ThrobberView f47812g;

    public AbstractC13560z1(Object obj, View view, int i13, CoordinatorLayout coordinatorLayout, RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView, AbstractC13529s2 abstractC13529s2, RecyclerView recyclerView, ThrobberView throbberView) {
        super(view, i13, obj);
        this.f47806a = coordinatorLayout;
        this.f47807b = relativeLayout;
        this.f47808c = linearLayout;
        this.f47809d = textView;
        this.f47810e = abstractC13529s2;
        this.f47811f = recyclerView;
        this.f47812g = throbberView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13560z1 m38272c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38273d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13560z1 m38273d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13560z1) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165500V, viewGroup, z4, obj);
    }
}
