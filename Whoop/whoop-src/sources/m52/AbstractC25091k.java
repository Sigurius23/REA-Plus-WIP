package m52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import k52.AbstractC22209e;

/* JADX INFO: renamed from: m52.k */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC25091k extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f98337a;

    /* JADX INFO: renamed from: b */
    public final TabLayout f98338b;

    /* JADX INFO: renamed from: c */
    public final ViewPager2 f98339c;

    public AbstractC25091k(Object obj, View view, int i13, LinearLayout linearLayout, TabLayout tabLayout, ViewPager2 viewPager2) {
        super(view, i13, obj);
        this.f98337a = linearLayout;
        this.f98338b = tabLayout;
        this.f98339c = viewPager2;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC25091k m73588c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m73589d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC25091k m73589d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC25091k) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC22209e.f86395g, viewGroup, z4, obj);
    }
}
