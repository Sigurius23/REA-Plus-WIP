package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.n1 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13503n1 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC13499m2 f47489a;

    /* JADX INFO: renamed from: b */
    public final TextView f47490b;

    /* JADX INFO: renamed from: c */
    public final AbstractC13520q3 f47491c;

    public AbstractC13503n1(Object obj, View view, int i13, AbstractC13499m2 abstractC13499m2, TextView textView, AbstractC13520q3 abstractC13520q3) {
        super(view, i13, obj);
        this.f47489a = abstractC13499m2;
        this.f47490b = textView;
        this.f47491c = abstractC13520q3;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13503n1 m38217c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38218d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13503n1 m38218d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13503n1) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165493O, viewGroup, z4, obj);
    }
}
