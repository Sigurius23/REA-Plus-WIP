package ii0;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.ConnectStrapNetworkErrorView;
import com.whoop.p069ui.views.ConnectingAnimationView;
import eq0.C13464f2;
import hi0.AbstractC17308f;

/* JADX INFO: renamed from: ii0.c */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC18537c extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final FrameLayout f72218a;

    /* JADX INFO: renamed from: b */
    public final ImageView f72219b;

    /* JADX INFO: renamed from: c */
    public final ImageView f72220c;

    /* JADX INFO: renamed from: d */
    public final TextView f72221d;

    /* JADX INFO: renamed from: e */
    public final C13464f2 f72222e;

    /* JADX INFO: renamed from: f */
    public final Button f72223f;

    /* JADX INFO: renamed from: g */
    public final LinearLayout f72224g;

    /* JADX INFO: renamed from: h */
    public final FrameLayout f72225h;

    /* JADX INFO: renamed from: i */
    public final TextView f72226i;

    /* JADX INFO: renamed from: j */
    public final LinearLayout f72227j;

    /* JADX INFO: renamed from: k */
    public final TextView f72228k;

    /* JADX INFO: renamed from: l */
    public final ConnectingAnimationView f72229l;

    /* JADX INFO: renamed from: m */
    public final FrameLayout f72230m;

    /* JADX INFO: renamed from: n */
    public final ViewFlipper f72231n;

    /* JADX INFO: renamed from: o */
    public final ConnectStrapNetworkErrorView f72232o;

    /* JADX INFO: renamed from: p */
    public final RelativeLayout f72233p;

    /* JADX INFO: renamed from: q */
    public final ImageView f72234q;

    public AbstractC18537c(Object obj, View view, int i13, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, TextView textView, C13464f2 c13464f2, Button button, LinearLayout linearLayout, FrameLayout frameLayout2, TextView textView2, LinearLayout linearLayout2, TextView textView3, ConnectingAnimationView connectingAnimationView, FrameLayout frameLayout3, ViewFlipper viewFlipper, ConnectStrapNetworkErrorView connectStrapNetworkErrorView, RelativeLayout relativeLayout, ImageView imageView3) {
        super(view, i13, obj);
        this.f72218a = frameLayout;
        this.f72219b = imageView;
        this.f72220c = imageView2;
        this.f72221d = textView;
        this.f72222e = c13464f2;
        this.f72223f = button;
        this.f72224g = linearLayout;
        this.f72225h = frameLayout2;
        this.f72226i = textView2;
        this.f72227j = linearLayout2;
        this.f72228k = textView3;
        this.f72229l = connectingAnimationView;
        this.f72230m = frameLayout3;
        this.f72231n = viewFlipper;
        this.f72232o = connectStrapNetworkErrorView;
        this.f72233p = relativeLayout;
        this.f72234q = imageView3;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC18537c m53755c(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m53756d(layoutInflater, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC18537c m53756d(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC18537c) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC17308f.f66880b, null, false, obj);
    }
}
