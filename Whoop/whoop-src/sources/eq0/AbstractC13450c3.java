package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.c3 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13450c3 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final View f47178a;

    /* JADX INFO: renamed from: b */
    public final View f47179b;

    /* JADX INFO: renamed from: c */
    public final TextView f47180c;

    public AbstractC13450c3(Object obj, View view, int i13, View view2, View view3, TextView textView) {
        super(view, i13, obj);
        this.f47178a = view2;
        this.f47179b = view3;
        this.f47180c = textView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13450c3 m38178c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38179d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13450c3 m38179d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13450c3) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165538q0, viewGroup, z4, obj);
    }
}
