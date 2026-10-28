package ii0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.p069ui.views.ColoredImageView;
import hi0.AbstractC17308f;

/* JADX INFO: renamed from: ii0.m */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC18557m extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ImageView f72338a;

    /* JADX INFO: renamed from: b */
    public final ColoredImageView f72339b;

    /* JADX INFO: renamed from: c */
    public final ConstraintLayout f72340c;

    /* JADX INFO: renamed from: d */
    public final ColoredImageView f72341d;

    /* JADX INFO: renamed from: e */
    public final ConstraintLayout f72342e;

    /* JADX INFO: renamed from: f */
    public final ColoredImageView f72343f;

    /* JADX INFO: renamed from: g */
    public final ConstraintLayout f72344g;

    /* JADX INFO: renamed from: h */
    public final ScrollView f72345h;

    /* JADX INFO: renamed from: i */
    public final ColoredImageView f72346i;

    /* JADX INFO: renamed from: j */
    public final ConstraintLayout f72347j;

    /* JADX INFO: renamed from: k */
    public final TextView f72348k;

    public AbstractC18557m(Object obj, View view, int i13, ImageView imageView, ColoredImageView coloredImageView, ConstraintLayout constraintLayout, ColoredImageView coloredImageView2, ConstraintLayout constraintLayout2, ColoredImageView coloredImageView3, ConstraintLayout constraintLayout3, ScrollView scrollView, ColoredImageView coloredImageView4, ConstraintLayout constraintLayout4, TextView textView) {
        super(view, i13, obj);
        this.f72338a = imageView;
        this.f72339b = coloredImageView;
        this.f72340c = constraintLayout;
        this.f72341d = coloredImageView2;
        this.f72342e = constraintLayout2;
        this.f72343f = coloredImageView3;
        this.f72344g = constraintLayout3;
        this.f72345h = scrollView;
        this.f72346i = coloredImageView4;
        this.f72347j = constraintLayout4;
        this.f72348k = textView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC18557m m53769c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m53770d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC18557m m53770d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC18557m) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC17308f.f66885g, viewGroup, z4, obj);
    }
}
