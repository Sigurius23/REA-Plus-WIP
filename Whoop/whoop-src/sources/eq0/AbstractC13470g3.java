package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.google.android.material.imageview.ShapeableImageView;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.g3 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13470g3 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final TextView f47318a;

    /* JADX INFO: renamed from: b */
    public final ImageView f47319b;

    /* JADX INFO: renamed from: c */
    public final ShapeableImageView f47320c;

    public AbstractC13470g3(Object obj, View view, int i13, TextView textView, ImageView imageView, ShapeableImageView shapeableImageView) {
        super(view, i13, obj);
        this.f47318a = textView;
        this.f47319b = imageView;
        this.f47320c = shapeableImageView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13470g3 m38193c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38194d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13470g3 m38194d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13470g3) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165542s0, viewGroup, z4, obj);
    }
}
