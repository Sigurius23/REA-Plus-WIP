package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.whoop.p069ui.ThrobberView;
import com.whoop.p069ui.pills.StrokedPillButton;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.d1 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13453d1 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC13479i2 f47196a;

    /* JADX INFO: renamed from: b */
    public final StrokedPillButton f47197b;

    /* JADX INFO: renamed from: c */
    public final StrokedPillButton f47198c;

    /* JADX INFO: renamed from: d */
    public final ThrobberView f47199d;

    /* JADX INFO: renamed from: e */
    public final FragmentContainerView f47200e;

    /* JADX INFO: renamed from: f */
    public final TextView f47201f;

    /* JADX INFO: renamed from: g */
    public final ImageView f47202g;

    /* JADX INFO: renamed from: h */
    public final ViewPager2 f47203h;

    /* JADX INFO: renamed from: i */
    public final TabLayout f47204i;

    public AbstractC13453d1(Object obj, View view, int i13, AbstractC13479i2 abstractC13479i2, StrokedPillButton strokedPillButton, StrokedPillButton strokedPillButton2, ThrobberView throbberView, FragmentContainerView fragmentContainerView, TextView textView, ImageView imageView, ViewPager2 viewPager2, TabLayout tabLayout) {
        super(view, i13, obj);
        this.f47196a = abstractC13479i2;
        this.f47197b = strokedPillButton;
        this.f47198c = strokedPillButton2;
        this.f47199d = throbberView;
        this.f47200e = fragmentContainerView;
        this.f47201f = textView;
        this.f47202g = imageView;
        this.f47203h = viewPager2;
        this.f47204i = tabLayout;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13453d1 m38180c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38181d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13453d1 m38181d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13453d1) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165488J, viewGroup, z4, obj);
    }
}
