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

/* JADX INFO: renamed from: eq0.i3 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13480i3 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final TextView f47354a;

    /* JADX INFO: renamed from: b */
    public final ImageView f47355b;

    /* JADX INFO: renamed from: c */
    public final TextView f47356c;

    public AbstractC13480i3(Object obj, View view, int i13, TextView textView, ImageView imageView, TextView textView2) {
        super(view, i13, obj);
        this.f47354a = textView;
        this.f47355b = imageView;
        this.f47356c = textView2;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13480i3 m38200c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38201d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13480i3 m38201d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13480i3) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165548v0, viewGroup, z4, obj);
    }
}
