package m52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import k52.AbstractC22209e;

/* JADX INFO: renamed from: m52.w */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC25103w extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ImageView f98389a;

    /* JADX INFO: renamed from: b */
    public final TextView f98390b;

    public AbstractC25103w(Object obj, View view, int i13, ImageView imageView, TextView textView) {
        super(view, i13, obj);
        this.f98389a = imageView;
        this.f98390b = textView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC25103w m73596c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m73597d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC25103w m73597d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC25103w) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC22209e.f86402n, viewGroup, z4, obj);
    }
}
