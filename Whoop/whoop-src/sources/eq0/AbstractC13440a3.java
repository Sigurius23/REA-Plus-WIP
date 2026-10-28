package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.a3 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13440a3 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final TextView f47120a;

    public AbstractC13440a3(Object obj, View view, int i13, TextView textView) {
        super(view, i13, obj);
        this.f47120a = textView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13440a3 m38171c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38172d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13440a3 m38172d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13440a3) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165536p0, viewGroup, z4, obj);
    }
}
