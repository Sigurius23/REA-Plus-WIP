package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.p069ui.WhoopNewToolbar;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.h1 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13473h1 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC13454d2 f47327a;

    /* JADX INFO: renamed from: b */
    public final WhoopNewToolbar f47328b;

    public AbstractC13473h1(Object obj, View view, int i13, AbstractC13454d2 abstractC13454d2, WhoopNewToolbar whoopNewToolbar) {
        super(view, i13, obj);
        this.f47327a = abstractC13454d2;
        this.f47328b = whoopNewToolbar;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13473h1 m38197c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38198d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13473h1 m38198d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13473h1) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165490L, viewGroup, z4, obj);
    }
}
