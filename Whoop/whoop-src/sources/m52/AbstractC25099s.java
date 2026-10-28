package m52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.realtime.presentation.views.RealTimeStrainRangeSegment;
import k52.AbstractC22209e;

/* JADX INFO: renamed from: m52.s */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC25099s extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final RealTimeStrainRangeSegment f98373a;

    /* JADX INFO: renamed from: b */
    public final RealTimeStrainRangeSegment f98374b;

    /* JADX INFO: renamed from: c */
    public final ImageView f98375c;

    /* JADX INFO: renamed from: d */
    public final RealTimeStrainRangeSegment f98376d;

    /* JADX INFO: renamed from: e */
    public final RealTimeStrainRangeSegment f98377e;

    /* JADX INFO: renamed from: f */
    public final RealTimeStrainRangeSegment f98378f;

    public AbstractC25099s(Object obj, View view, int i13, RealTimeStrainRangeSegment realTimeStrainRangeSegment, RealTimeStrainRangeSegment realTimeStrainRangeSegment2, ImageView imageView, RealTimeStrainRangeSegment realTimeStrainRangeSegment3, RealTimeStrainRangeSegment realTimeStrainRangeSegment4, RealTimeStrainRangeSegment realTimeStrainRangeSegment5) {
        super(view, i13, obj);
        this.f98373a = realTimeStrainRangeSegment;
        this.f98374b = realTimeStrainRangeSegment2;
        this.f98375c = imageView;
        this.f98376d = realTimeStrainRangeSegment3;
        this.f98377e = realTimeStrainRangeSegment4;
        this.f98378f = realTimeStrainRangeSegment5;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC25099s m73592c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m73593d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC25099s m73593d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC25099s) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC22209e.f86400l, viewGroup, z4, obj);
    }
}
