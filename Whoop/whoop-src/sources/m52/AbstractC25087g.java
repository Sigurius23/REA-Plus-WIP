package m52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.C1172c0;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.realtime.presentation.views.RealTimeCell;
import k52.AbstractC22209e;

/* JADX INFO: renamed from: m52.g */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC25087g extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f98319a;

    /* JADX INFO: renamed from: b */
    public final View f98320b;

    /* JADX INFO: renamed from: c */
    public final View f98321c;

    /* JADX INFO: renamed from: d */
    public final RealTimeCell f98322d;

    /* JADX INFO: renamed from: e */
    public final RealTimeCell f98323e;

    /* JADX INFO: renamed from: f */
    public final RealTimeCell f98324f;

    /* JADX INFO: renamed from: g */
    public final C1172c0 f98325g;

    /* JADX INFO: renamed from: h */
    public final ImageView f98326h;

    public AbstractC25087g(Object obj, View view, int i13, LinearLayout linearLayout, View view2, View view3, RealTimeCell realTimeCell, RealTimeCell realTimeCell2, RealTimeCell realTimeCell3, C1172c0 c1172c0, ImageView imageView) {
        super(view, i13, obj);
        this.f98319a = linearLayout;
        this.f98320b = view2;
        this.f98321c = view3;
        this.f98322d = realTimeCell;
        this.f98323e = realTimeCell2;
        this.f98324f = realTimeCell3;
        this.f98325g = c1172c0;
        this.f98326h = imageView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC25087g m73584c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m73585d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC25087g m73585d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC25087g) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC22209e.f86393e, viewGroup, z4, obj);
    }
}
