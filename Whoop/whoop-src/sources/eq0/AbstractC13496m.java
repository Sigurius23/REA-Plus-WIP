package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.m */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13496m extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final TextView f47456a;

    /* JADX INFO: renamed from: b */
    public final RecyclerView f47457b;

    /* JADX INFO: renamed from: c */
    public final View f47458c;

    public AbstractC13496m(Object obj, View view, int i13, TextView textView, RecyclerView recyclerView, View view2) {
        super(view, i13, obj);
        this.f47456a = textView;
        this.f47457b = recyclerView;
        this.f47458c = view2;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13496m m38212c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38213d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13496m m38213d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13496m) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165523j, viewGroup, z4, obj);
    }
}
