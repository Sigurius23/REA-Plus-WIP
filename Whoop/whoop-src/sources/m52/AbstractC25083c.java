package m52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.p069ui.pills.StrokedPillImageButton;
import com.whoop.realtime.presentation.views.RealTimeCell;
import com.whoop.realtime.presentation.views.RealTimeStrainDial;
import com.whoop.realtime.presentation.views.RealTimeStrainRangeView;
import de.hdodenhof.circleimageview.CircleImageView;
import k52.AbstractC22209e;

/* JADX INFO: renamed from: m52.c */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC25083c extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f98278a;

    /* JADX INFO: renamed from: b */
    public final View f98279b;

    /* JADX INFO: renamed from: c */
    public final View f98280c;

    /* JADX INFO: renamed from: d */
    public final LinearLayout f98281d;

    /* JADX INFO: renamed from: e */
    public final RealTimeCell f98282e;

    /* JADX INFO: renamed from: f */
    public final RealTimeCell f98283f;

    /* JADX INFO: renamed from: g */
    public final TextView f98284g;

    /* JADX INFO: renamed from: h */
    public final StrokedPillImageButton f98285h;

    /* JADX INFO: renamed from: i */
    public final RealTimeCell f98286i;

    /* JADX INFO: renamed from: j */
    public final RealTimeCell f98287j;

    /* JADX INFO: renamed from: k */
    public final RealTimeStrainRangeView f98288k;

    /* JADX INFO: renamed from: l */
    public final ComposeView f98289l;

    /* JADX INFO: renamed from: m */
    public final LinearLayout f98290m;

    /* JADX INFO: renamed from: n */
    public final CircleImageView f98291n;

    /* JADX INFO: renamed from: o */
    public final RealTimeStrainDial f98292o;

    /* JADX INFO: renamed from: p */
    public final LinearLayout f98293p;

    /* JADX INFO: renamed from: q */
    public final LinearLayout f98294q;

    /* JADX INFO: renamed from: r */
    public final ImageView f98295r;

    /* JADX INFO: renamed from: s */
    public final TextView f98296s;

    /* JADX INFO: renamed from: t */
    public final TextView f98297t;

    /* JADX INFO: renamed from: u */
    public final TextView f98298u;

    /* JADX INFO: renamed from: v */
    public final TextView f98299v;

    /* JADX INFO: renamed from: w */
    public final TextView f98300w;

    /* JADX INFO: renamed from: x */
    public final ImageView f98301x;

    public AbstractC25083c(Object obj, View view, int i13, LinearLayout linearLayout, View view2, View view3, LinearLayout linearLayout2, RealTimeCell realTimeCell, RealTimeCell realTimeCell2, TextView textView, StrokedPillImageButton strokedPillImageButton, RealTimeCell realTimeCell3, RealTimeCell realTimeCell4, RealTimeStrainRangeView realTimeStrainRangeView, ComposeView composeView, LinearLayout linearLayout3, CircleImageView circleImageView, RealTimeStrainDial realTimeStrainDial, LinearLayout linearLayout4, LinearLayout linearLayout5, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ImageView imageView2) {
        super(view, i13, obj);
        this.f98278a = linearLayout;
        this.f98279b = view2;
        this.f98280c = view3;
        this.f98281d = linearLayout2;
        this.f98282e = realTimeCell;
        this.f98283f = realTimeCell2;
        this.f98284g = textView;
        this.f98285h = strokedPillImageButton;
        this.f98286i = realTimeCell3;
        this.f98287j = realTimeCell4;
        this.f98288k = realTimeStrainRangeView;
        this.f98289l = composeView;
        this.f98290m = linearLayout3;
        this.f98291n = circleImageView;
        this.f98292o = realTimeStrainDial;
        this.f98293p = linearLayout4;
        this.f98294q = linearLayout5;
        this.f98295r = imageView;
        this.f98296s = textView2;
        this.f98297t = textView3;
        this.f98298u = textView4;
        this.f98299v = textView5;
        this.f98300w = textView6;
        this.f98301x = imageView2;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC25083c m73580c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m73581d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC25083c m73581d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC25083c) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC22209e.f86391c, viewGroup, z4, obj);
    }
}
