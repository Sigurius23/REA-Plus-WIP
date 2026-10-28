package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.p069ui.ThrobberView;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.j1 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13483j1 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ImageView f47383a;

    /* JADX INFO: renamed from: b */
    public final AbstractC13489k2 f47384b;

    /* JADX INFO: renamed from: c */
    public final TextView f47385c;

    /* JADX INFO: renamed from: d */
    public final RecyclerView f47386d;

    /* JADX INFO: renamed from: e */
    public final ThrobberView f47387e;

    /* JADX INFO: renamed from: f */
    public final TextView f47388f;

    public AbstractC13483j1(Object obj, View view, int i13, ImageView imageView, AbstractC13489k2 abstractC13489k2, TextView textView, RecyclerView recyclerView, ThrobberView throbberView, TextView textView2) {
        super(view, i13, obj);
        this.f47383a = imageView;
        this.f47384b = abstractC13489k2;
        this.f47385c = textView;
        this.f47386d = recyclerView;
        this.f47387e = throbberView;
        this.f47388f = textView2;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13483j1 m38204c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38205d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13483j1 m38205d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13483j1) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165491M, viewGroup, z4, obj);
    }
}
