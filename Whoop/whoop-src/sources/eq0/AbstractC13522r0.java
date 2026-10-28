package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.p069ui.ThrobberView;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.r0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13522r0 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: A */
    public final TextView f47575A;

    /* JADX INFO: renamed from: B */
    public final TextView f47576B;

    /* JADX INFO: renamed from: C */
    public final ImageView f47577C;

    /* JADX INFO: renamed from: D */
    public final TextView f47578D;

    /* JADX INFO: renamed from: E */
    public final LinearLayout f47579E;

    /* JADX INFO: renamed from: F */
    public final RecyclerView f47580F;

    /* JADX INFO: renamed from: G */
    public final ComposeView f47581G;

    /* JADX INFO: renamed from: H */
    public final TextView f47582H;

    /* JADX INFO: renamed from: I */
    public final LinearLayout f47583I;

    /* JADX INFO: renamed from: J */
    public final TextView f47584J;

    /* JADX INFO: renamed from: K */
    public final RelativeLayout f47585K;

    /* JADX INFO: renamed from: L */
    public final RecyclerView f47586L;

    /* JADX INFO: renamed from: M */
    public final LinearLayout f47587M;

    /* JADX INFO: renamed from: N */
    public final TextView f47588N;

    /* JADX INFO: renamed from: a */
    public final ImageView f47589a;

    /* JADX INFO: renamed from: b */
    public final TextView f47590b;

    /* JADX INFO: renamed from: c */
    public final AbstractC13510o3 f47591c;

    /* JADX INFO: renamed from: d */
    public final LinearLayout f47592d;

    /* JADX INFO: renamed from: e */
    public final NestedScrollView f47593e;

    /* JADX INFO: renamed from: f */
    public final AbstractC13542v0 f47594f;

    /* JADX INFO: renamed from: g */
    public final CoordinatorLayout f47595g;

    /* JADX INFO: renamed from: h */
    public final ConstraintLayout f47596h;

    /* JADX INFO: renamed from: i */
    public final RelativeLayout f47597i;

    /* JADX INFO: renamed from: j */
    public final ConstraintLayout f47598j;

    /* JADX INFO: renamed from: k */
    public final AbstractC13558z f47599k;

    /* JADX INFO: renamed from: l */
    public final ThrobberView f47600l;

    /* JADX INFO: renamed from: m */
    public final ThrobberView f47601m;

    /* JADX INFO: renamed from: n */
    public final ConstraintLayout f47602n;

    /* JADX INFO: renamed from: o */
    public final LinearLayout f47603o;

    /* JADX INFO: renamed from: p */
    public final AbstractC13500m3 f47604p;

    /* JADX INFO: renamed from: q */
    public final TextView f47605q;

    /* JADX INFO: renamed from: r */
    public final ComposeView f47606r;

    /* JADX INFO: renamed from: s */
    public final TextView f47607s;

    /* JADX INFO: renamed from: t */
    public final LinearLayout f47608t;

    /* JADX INFO: renamed from: u */
    public final LinearLayout f47609u;

    /* JADX INFO: renamed from: v */
    public final LinearLayout f47610v;

    /* JADX INFO: renamed from: w */
    public final ComposeView f47611w;

    /* JADX INFO: renamed from: x */
    public final NestedScrollView f47612x;

    /* JADX INFO: renamed from: y */
    public final RecyclerView f47613y;

    /* JADX INFO: renamed from: z */
    public final AbstractC13549w2 f47614z;

    public AbstractC13522r0(Object obj, View view, int i13, ImageView imageView, TextView textView, AbstractC13510o3 abstractC13510o3, LinearLayout linearLayout, NestedScrollView nestedScrollView, AbstractC13542v0 abstractC13542v0, CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, RelativeLayout relativeLayout, ConstraintLayout constraintLayout2, AbstractC13558z abstractC13558z, ThrobberView throbberView, ThrobberView throbberView2, ConstraintLayout constraintLayout3, LinearLayout linearLayout2, AbstractC13500m3 abstractC13500m3, TextView textView2, ComposeView composeView, TextView textView3, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ComposeView composeView2, NestedScrollView nestedScrollView2, RecyclerView recyclerView, AbstractC13549w2 abstractC13549w2, TextView textView4, TextView textView5, ImageView imageView2, TextView textView6, LinearLayout linearLayout6, RecyclerView recyclerView2, ComposeView composeView3, TextView textView7, LinearLayout linearLayout7, TextView textView8, RelativeLayout relativeLayout2, RecyclerView recyclerView3, LinearLayout linearLayout8, TextView textView9) {
        super(view, i13, obj);
        this.f47589a = imageView;
        this.f47590b = textView;
        this.f47591c = abstractC13510o3;
        this.f47592d = linearLayout;
        this.f47593e = nestedScrollView;
        this.f47594f = abstractC13542v0;
        this.f47595g = coordinatorLayout;
        this.f47596h = constraintLayout;
        this.f47597i = relativeLayout;
        this.f47598j = constraintLayout2;
        this.f47599k = abstractC13558z;
        this.f47600l = throbberView;
        this.f47601m = throbberView2;
        this.f47602n = constraintLayout3;
        this.f47603o = linearLayout2;
        this.f47604p = abstractC13500m3;
        this.f47605q = textView2;
        this.f47606r = composeView;
        this.f47607s = textView3;
        this.f47608t = linearLayout3;
        this.f47609u = linearLayout4;
        this.f47610v = linearLayout5;
        this.f47611w = composeView2;
        this.f47612x = nestedScrollView2;
        this.f47613y = recyclerView;
        this.f47614z = abstractC13549w2;
        this.f47575A = textView4;
        this.f47576B = textView5;
        this.f47577C = imageView2;
        this.f47578D = textView6;
        this.f47579E = linearLayout6;
        this.f47580F = recyclerView2;
        this.f47581G = composeView3;
        this.f47582H = textView7;
        this.f47583I = linearLayout7;
        this.f47584J = textView8;
        this.f47585K = relativeLayout2;
        this.f47586L = recyclerView3;
        this.f47587M = linearLayout8;
        this.f47588N = textView9;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13522r0 m38241c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38242d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13522r0 m38242d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13522r0) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165480D, viewGroup, z4, obj);
    }
}
