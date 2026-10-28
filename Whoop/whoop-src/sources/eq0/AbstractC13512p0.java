package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.p0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13512p0 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final Barrier f47524a;

    /* JADX INFO: renamed from: b */
    public final ViewPager2 f47525b;

    /* JADX INFO: renamed from: c */
    public final TabLayout f47526c;

    /* JADX INFO: renamed from: d */
    public final ConstraintLayout f47527d;

    /* JADX INFO: renamed from: e */
    public final ImageView f47528e;

    /* JADX INFO: renamed from: f */
    public final ImageView f47529f;

    /* JADX INFO: renamed from: g */
    public final Spinner f47530g;

    /* JADX INFO: renamed from: h */
    public final TextView f47531h;

    public AbstractC13512p0(Object obj, View view, int i13, Barrier barrier, ViewPager2 viewPager2, TabLayout tabLayout, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, Spinner spinner, TextView textView) {
        super(view, i13, obj);
        this.f47524a = barrier;
        this.f47525b = viewPager2;
        this.f47526c = tabLayout;
        this.f47527d = constraintLayout;
        this.f47528e = imageView;
        this.f47529f = imageView2;
        this.f47530g = spinner;
        this.f47531h = textView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13512p0 m38231c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38232d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13512p0 m38232d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13512p0) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165478C, viewGroup, z4, obj);
    }
}
