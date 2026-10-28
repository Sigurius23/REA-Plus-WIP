package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.p069ui.ThrobberView;
import com.whoop.p069ui.pills.StrokedPillButton;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.b2 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13444b2 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f47134a;

    /* JADX INFO: renamed from: b */
    public final StrokedPillButton f47135b;

    /* JADX INFO: renamed from: c */
    public final StrokedPillButton f47136c;

    /* JADX INFO: renamed from: d */
    public final RelativeLayout f47137d;

    /* JADX INFO: renamed from: e */
    public final LinearLayout f47138e;

    /* JADX INFO: renamed from: f */
    public final TextView f47139f;

    /* JADX INFO: renamed from: g */
    public final AbstractC13529s2 f47140g;

    /* JADX INFO: renamed from: h */
    public final RecyclerView f47141h;

    /* JADX INFO: renamed from: i */
    public final ImageView f47142i;

    /* JADX INFO: renamed from: j */
    public final ThrobberView f47143j;

    public AbstractC13444b2(Object obj, View view, int i13, CoordinatorLayout coordinatorLayout, StrokedPillButton strokedPillButton, StrokedPillButton strokedPillButton2, RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView, AbstractC13529s2 abstractC13529s2, RecyclerView recyclerView, ImageView imageView, ThrobberView throbberView) {
        super(view, i13, obj);
        this.f47134a = coordinatorLayout;
        this.f47135b = strokedPillButton;
        this.f47136c = strokedPillButton2;
        this.f47137d = relativeLayout;
        this.f47138e = linearLayout;
        this.f47139f = textView;
        this.f47140g = abstractC13529s2;
        this.f47141h = recyclerView;
        this.f47142i = imageView;
        this.f47143j = throbberView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13444b2 m38173c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38174d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13444b2 m38174d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13444b2) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165501W, viewGroup, z4, obj);
    }
}
