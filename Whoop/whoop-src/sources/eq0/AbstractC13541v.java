package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.google.android.material.imageview.ShapeableImageView;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.v */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13541v extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final View f47701a;

    /* JADX INFO: renamed from: b */
    public final TextView f47702b;

    /* JADX INFO: renamed from: c */
    public final ShapeableImageView f47703c;

    /* JADX INFO: renamed from: d */
    public final ConstraintLayout f47704d;

    /* JADX INFO: renamed from: e */
    public final TextView f47705e;

    public AbstractC13541v(Object obj, View view, int i13, View view2, TextView textView, ShapeableImageView shapeableImageView, ConstraintLayout constraintLayout, TextView textView2) {
        super(view, i13, obj);
        this.f47701a = view2;
        this.f47702b = textView;
        this.f47703c = shapeableImageView;
        this.f47704d = constraintLayout;
        this.f47705e = textView2;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13541v m38259c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38260d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13541v m38260d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13541v) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165533o, viewGroup, z4, obj);
    }
}
