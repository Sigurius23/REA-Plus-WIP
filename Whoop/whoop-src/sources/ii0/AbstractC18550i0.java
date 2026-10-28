package ii0;

import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.p069ui.ThrobberView;
import hi0.AbstractC17308f;

/* JADX INFO: renamed from: ii0.i0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC18550i0 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ThrobberView f72290a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f72291b;

    public AbstractC18550i0(Object obj, View view, int i13, ThrobberView throbberView, ConstraintLayout constraintLayout) {
        super(view, i13, obj);
        this.f72290a = throbberView;
        this.f72291b = constraintLayout;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC18550i0 m53763c(LayoutInflater layoutInflater) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m53764d(layoutInflater, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC18550i0 m53764d(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC18550i0) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC17308f.f66900v, null, false, obj);
    }
}
