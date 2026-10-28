package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.u3 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13540u3 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ImageView f47700a;

    public AbstractC13540u3(Object obj, View view, int i13, ImageView imageView) {
        super(view, i13, obj);
        this.f47700a = imageView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13540u3 m38257c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38258d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13540u3 m38258d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13540u3) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165483E0, viewGroup, z4, obj);
    }
}
