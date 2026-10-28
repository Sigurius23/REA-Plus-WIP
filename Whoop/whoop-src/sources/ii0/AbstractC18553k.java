package ii0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.p069ui.views.AdvancedSettingsItemView;
import hi0.AbstractC17308f;

/* JADX INFO: renamed from: ii0.k */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC18553k extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ImageView f72299a;

    /* JADX INFO: renamed from: b */
    public final TextView f72300b;

    /* JADX INFO: renamed from: c */
    public final TextView f72301c;

    /* JADX INFO: renamed from: d */
    public final AdvancedSettingsItemView f72302d;

    /* JADX INFO: renamed from: e */
    public final AdvancedSettingsItemView f72303e;

    /* JADX INFO: renamed from: f */
    public final AdvancedSettingsItemView f72304f;

    /* JADX INFO: renamed from: g */
    public final AdvancedSettingsItemView f72305g;

    /* JADX INFO: renamed from: h */
    public final AdvancedSettingsItemView f72306h;

    /* JADX INFO: renamed from: i */
    public final ImageView f72307i;

    /* JADX INFO: renamed from: j */
    public final TextView f72308j;

    /* JADX INFO: renamed from: k */
    public final TextView f72309k;

    /* JADX INFO: renamed from: l */
    public final AdvancedSettingsItemView f72310l;

    /* JADX INFO: renamed from: m */
    public final AdvancedSettingsItemView f72311m;

    /* JADX INFO: renamed from: n */
    public final TextView f72312n;

    /* JADX INFO: renamed from: o */
    public final AdvancedSettingsItemView f72313o;

    /* JADX INFO: renamed from: p */
    public final AdvancedSettingsItemView f72314p;

    /* JADX INFO: renamed from: q */
    public final AdvancedSettingsItemView f72315q;

    /* JADX INFO: renamed from: r */
    public final AdvancedSettingsItemView f72316r;

    /* JADX INFO: renamed from: s */
    public final Barrier f72317s;

    /* JADX INFO: renamed from: t */
    public final ComposeView f72318t;

    public AbstractC18553k(Object obj, View view, int i13, ImageView imageView, TextView textView, TextView textView2, AdvancedSettingsItemView advancedSettingsItemView, AdvancedSettingsItemView advancedSettingsItemView2, AdvancedSettingsItemView advancedSettingsItemView3, AdvancedSettingsItemView advancedSettingsItemView4, AdvancedSettingsItemView advancedSettingsItemView5, ImageView imageView2, TextView textView3, TextView textView4, AdvancedSettingsItemView advancedSettingsItemView6, AdvancedSettingsItemView advancedSettingsItemView7, TextView textView5, AdvancedSettingsItemView advancedSettingsItemView8, AdvancedSettingsItemView advancedSettingsItemView9, AdvancedSettingsItemView advancedSettingsItemView10, AdvancedSettingsItemView advancedSettingsItemView11, Barrier barrier, ComposeView composeView) {
        super(view, i13, obj);
        this.f72299a = imageView;
        this.f72300b = textView;
        this.f72301c = textView2;
        this.f72302d = advancedSettingsItemView;
        this.f72303e = advancedSettingsItemView2;
        this.f72304f = advancedSettingsItemView3;
        this.f72305g = advancedSettingsItemView4;
        this.f72306h = advancedSettingsItemView5;
        this.f72307i = imageView2;
        this.f72308j = textView3;
        this.f72309k = textView4;
        this.f72310l = advancedSettingsItemView6;
        this.f72311m = advancedSettingsItemView7;
        this.f72312n = textView5;
        this.f72313o = advancedSettingsItemView8;
        this.f72314p = advancedSettingsItemView9;
        this.f72315q = advancedSettingsItemView10;
        this.f72316r = advancedSettingsItemView11;
        this.f72317s = barrier;
        this.f72318t = composeView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC18553k m53765c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m53766d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC18553k m53766d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC18553k) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC17308f.f66884f, viewGroup, z4, obj);
    }
}
