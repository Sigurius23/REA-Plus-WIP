package m52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.p069ui.views.ColoredImageView;
import k52.AbstractC22209e;

/* JADX INFO: renamed from: m52.u */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC25101u extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ColoredImageView f98383a;

    /* JADX INFO: renamed from: b */
    public final TextView f98384b;

    /* JADX INFO: renamed from: c */
    public final TextView f98385c;

    public AbstractC25101u(Object obj, View view, int i13, ColoredImageView coloredImageView, TextView textView, TextView textView2) {
        super(view, i13, obj);
        this.f98383a = coloredImageView;
        this.f98384b = textView;
        this.f98385c = textView2;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC25101u m73594c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m73595d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC25101u m73595d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC25101u) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC22209e.f86401m, viewGroup, z4, obj);
    }
}
