package ii0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import hi0.AbstractC17308f;

/* JADX INFO: renamed from: ii0.y */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC18569y extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final View f72551a;

    /* JADX INFO: renamed from: b */
    public final TextView f72552b;

    /* JADX INFO: renamed from: c */
    public final ImageView f72553c;

    /* JADX INFO: renamed from: d */
    public final TextView f72554d;

    public AbstractC18569y(Object obj, View view, int i13, View view2, TextView textView, ImageView imageView, TextView textView2) {
        super(view, i13, obj);
        this.f72551a = view2;
        this.f72552b = textView;
        this.f72553c = imageView;
        this.f72554d = textView2;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC18569y m53782c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m53783d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC18569y m53783d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC18569y) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC17308f.f66895q, viewGroup, z4, obj);
    }
}
