package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.x0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13551x0 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC13532t0 f47744a;

    /* JADX INFO: renamed from: b */
    public final RecyclerView f47745b;

    public AbstractC13551x0(Object obj, View view, int i13, AbstractC13532t0 abstractC13532t0, RecyclerView recyclerView) {
        super(view, i13, obj);
        this.f47744a = abstractC13532t0;
        this.f47745b = recyclerView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13551x0 m38263c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38264d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13551x0 m38264d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13551x0) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165485G, viewGroup, z4, obj);
    }
}
