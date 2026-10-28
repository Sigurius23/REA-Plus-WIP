package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.r1 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13523r1 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final EditText f47615a;

    public AbstractC13523r1(Object obj, View view, int i13, EditText editText) {
        super(view, i13, obj);
        this.f47615a = editText;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13523r1 m38243c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38244d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13523r1 m38244d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13523r1) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165495Q, viewGroup, z4, obj);
    }
}
