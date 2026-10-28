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

/* JADX INFO: renamed from: m52.i */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC25089i extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ImageView f98331a;

    /* JADX INFO: renamed from: b */
    public final TextView f98332b;

    public AbstractC25089i(Object obj, View view, int i13, ImageView imageView, TextView textView) {
        super(view, i13, obj);
        this.f98331a = imageView;
        this.f98332b = textView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC25089i m73586c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m73587d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC25089i m73587d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC25089i) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC22209e.f86394f, viewGroup, z4, obj);
    }
}
