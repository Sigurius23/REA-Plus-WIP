package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.l0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13492l0 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ImageView f47425a;

    /* JADX INFO: renamed from: b */
    public final TextView f47426b;

    public AbstractC13492l0(Object obj, View view, int i13, ImageView imageView, TextView textView) {
        super(view, i13, obj);
        this.f47425a = imageView;
        this.f47426b = textView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13492l0 m38208c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38209d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13492l0 m38209d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13492l0) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165474A, viewGroup, z4, obj);
    }
}
