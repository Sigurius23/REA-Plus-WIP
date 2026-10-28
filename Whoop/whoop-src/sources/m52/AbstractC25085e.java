package m52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.p069ui.views.LiveHeartRateView;
import com.whoop.p069ui.views.RealTimeHeartGraph;
import com.whoop.realtime.presentation.views.RealTimeCell;
import k52.AbstractC22209e;

/* JADX INFO: renamed from: m52.e */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC25085e extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f98306a;

    /* JADX INFO: renamed from: b */
    public final View f98307b;

    /* JADX INFO: renamed from: c */
    public final View f98308c;

    /* JADX INFO: renamed from: d */
    public final RealTimeCell f98309d;

    /* JADX INFO: renamed from: e */
    public final RealTimeCell f98310e;

    /* JADX INFO: renamed from: f */
    public final RealTimeHeartGraph f98311f;

    /* JADX INFO: renamed from: g */
    public final LiveHeartRateView f98312g;

    /* JADX INFO: renamed from: h */
    public final RealTimeCell f98313h;

    /* JADX INFO: renamed from: i */
    public final ImageView f98314i;

    public AbstractC25085e(Object obj, View view, int i13, LinearLayout linearLayout, View view2, View view3, RealTimeCell realTimeCell, RealTimeCell realTimeCell2, RealTimeHeartGraph realTimeHeartGraph, LiveHeartRateView liveHeartRateView, RealTimeCell realTimeCell3, ImageView imageView) {
        super(view, i13, obj);
        this.f98306a = linearLayout;
        this.f98307b = view2;
        this.f98308c = view3;
        this.f98309d = realTimeCell;
        this.f98310e = realTimeCell2;
        this.f98311f = realTimeHeartGraph;
        this.f98312g = liveHeartRateView;
        this.f98313h = realTimeCell3;
        this.f98314i = imageView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC25085e m73582c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m73583d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC25085e m73583d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC25085e) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC22209e.f86392d, viewGroup, z4, obj);
    }
}
