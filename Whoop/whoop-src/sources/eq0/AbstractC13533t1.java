package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.t1 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13533t1 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final TextView f47658a;

    /* JADX INFO: renamed from: b */
    public final TextView f47659b;

    /* JADX INFO: renamed from: c */
    public final ImageView f47660c;

    /* JADX INFO: renamed from: d */
    public final AbstractC13530s3 f47661d;

    /* JADX INFO: renamed from: e */
    public final AbstractC13530s3 f47662e;

    /* JADX INFO: renamed from: f */
    public final AbstractC13530s3 f47663f;

    /* JADX INFO: renamed from: g */
    public final TextView f47664g;

    public AbstractC13533t1(Object obj, View view, int i13, TextView textView, TextView textView2, ImageView imageView, AbstractC13530s3 abstractC13530s3, AbstractC13530s3 abstractC13530s4, AbstractC13530s3 abstractC13530s5, TextView textView3) {
        super(view, i13, obj);
        this.f47658a = textView;
        this.f47659b = textView2;
        this.f47660c = imageView;
        this.f47661d = abstractC13530s3;
        this.f47662e = abstractC13530s4;
        this.f47663f = abstractC13530s5;
        this.f47664g = textView3;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13533t1 m38252c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38253d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13533t1 m38253d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13533t1) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165496R, viewGroup, z4, obj);
    }
}
