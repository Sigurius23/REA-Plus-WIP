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

/* JADX INFO: renamed from: eq0.z0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13559z0 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final RecyclerView f47800a;

    /* JADX INFO: renamed from: b */
    public final AbstractC13469g2 f47801b;

    /* JADX INFO: renamed from: c */
    public final ThrobberView f47802c;

    /* JADX INFO: renamed from: d */
    public final ImageView f47803d;

    /* JADX INFO: renamed from: e */
    public final TextView f47804e;

    /* JADX INFO: renamed from: f */
    public final ImageView f47805f;

    public AbstractC13559z0(Object obj, View view, int i13, RecyclerView recyclerView, AbstractC13469g2 abstractC13469g2, ThrobberView throbberView, ImageView imageView, TextView textView, ImageView imageView2) {
        super(view, i13, obj);
        this.f47800a = recyclerView;
        this.f47801b = abstractC13469g2;
        this.f47802c = throbberView;
        this.f47803d = imageView;
        this.f47804e = textView;
        this.f47805f = imageView2;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13559z0 m38270c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38271d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13559z0 m38271d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13559z0) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165486H, viewGroup, z4, obj);
    }
}
