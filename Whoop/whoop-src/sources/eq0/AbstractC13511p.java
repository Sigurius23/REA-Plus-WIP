package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.google.android.material.imageview.ShapeableImageView;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.p */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13511p extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ShapeableImageView f47518a;

    /* JADX INFO: renamed from: b */
    public final ShapeableImageView f47519b;

    /* JADX INFO: renamed from: c */
    public final ShapeableImageView f47520c;

    /* JADX INFO: renamed from: d */
    public final ShapeableImageView f47521d;

    /* JADX INFO: renamed from: e */
    public final ShapeableImageView f47522e;

    /* JADX INFO: renamed from: f */
    public final TextView f47523f;

    public AbstractC13511p(Object obj, View view, int i13, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, ShapeableImageView shapeableImageView4, ShapeableImageView shapeableImageView5, TextView textView) {
        super(view, i13, obj);
        this.f47518a = shapeableImageView;
        this.f47519b = shapeableImageView2;
        this.f47520c = shapeableImageView3;
        this.f47521d = shapeableImageView4;
        this.f47522e = shapeableImageView5;
        this.f47523f = textView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13511p m38229c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38230d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13511p m38230d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13511p) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165527l, viewGroup, z4, obj);
    }
}
