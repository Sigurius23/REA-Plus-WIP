package ii0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.whoop.p069ui.WhoopNewToolbar;
import hi0.AbstractC17308f;

/* JADX INFO: renamed from: ii0.u */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC18565u extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC18542e0 f72513a;

    /* JADX INFO: renamed from: b */
    public final ComposeView f72514b;

    /* JADX INFO: renamed from: c */
    public final TextView f72515c;

    /* JADX INFO: renamed from: d */
    public final TextView f72516d;

    /* JADX INFO: renamed from: e */
    public final ViewPager2 f72517e;

    /* JADX INFO: renamed from: f */
    public final TabLayout f72518f;

    /* JADX INFO: renamed from: g */
    public final ImageView f72519g;

    /* JADX INFO: renamed from: h */
    public final TextView f72520h;

    /* JADX INFO: renamed from: i */
    public final ImageView f72521i;

    /* JADX INFO: renamed from: j */
    public final TextView f72522j;

    /* JADX INFO: renamed from: k */
    public final ConstraintLayout f72523k;

    /* JADX INFO: renamed from: l */
    public final WhoopNewToolbar f72524l;

    public AbstractC18565u(Object obj, View view, int i13, AbstractC18542e0 abstractC18542e0, ComposeView composeView, TextView textView, TextView textView2, ViewPager2 viewPager2, TabLayout tabLayout, ImageView imageView, TextView textView3, ImageView imageView2, TextView textView4, ConstraintLayout constraintLayout, WhoopNewToolbar whoopNewToolbar) {
        super(view, i13, obj);
        this.f72513a = abstractC18542e0;
        this.f72514b = composeView;
        this.f72515c = textView;
        this.f72516d = textView2;
        this.f72517e = viewPager2;
        this.f72518f = tabLayout;
        this.f72519g = imageView;
        this.f72520h = textView3;
        this.f72521i = imageView2;
        this.f72522j = textView4;
        this.f72523k = constraintLayout;
        this.f72524l = whoopNewToolbar;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC18565u m53777c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m53778d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC18565u m53778d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC18565u) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC17308f.f66890l, viewGroup, z4, obj);
    }
}
