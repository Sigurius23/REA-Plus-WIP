package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.p069ui.ThrobberView;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.x1 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13552x1 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f47746a;

    /* JADX INFO: renamed from: b */
    public final AbstractC13539u2 f47747b;

    /* JADX INFO: renamed from: c */
    public final RelativeLayout f47748c;

    /* JADX INFO: renamed from: d */
    public final LinearLayout f47749d;

    /* JADX INFO: renamed from: e */
    public final TextView f47750e;

    /* JADX INFO: renamed from: f */
    public final LinearLayout f47751f;

    /* JADX INFO: renamed from: g */
    public final TextView f47752g;

    /* JADX INFO: renamed from: h */
    public final AbstractC13519q2 f47753h;

    /* JADX INFO: renamed from: i */
    public final RecyclerView f47754i;

    /* JADX INFO: renamed from: j */
    public final ThrobberView f47755j;

    /* JADX INFO: renamed from: k */
    public final LinearLayout f47756k;

    /* JADX INFO: renamed from: l */
    public final Space f47757l;

    public AbstractC13552x1(Object obj, View view, int i13, CoordinatorLayout coordinatorLayout, AbstractC13539u2 abstractC13539u2, RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2, AbstractC13519q2 abstractC13519q2, RecyclerView recyclerView, ThrobberView throbberView, LinearLayout linearLayout3, Space space) {
        super(view, i13, obj);
        this.f47746a = coordinatorLayout;
        this.f47747b = abstractC13539u2;
        this.f47748c = relativeLayout;
        this.f47749d = linearLayout;
        this.f47750e = textView;
        this.f47751f = linearLayout2;
        this.f47752g = textView2;
        this.f47753h = abstractC13519q2;
        this.f47754i = recyclerView;
        this.f47755j = throbberView;
        this.f47756k = linearLayout3;
        this.f47757l = space;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13552x1 m38265c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38266d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13552x1 m38266d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13552x1) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165499U, viewGroup, z4, obj);
    }
}
