package ii0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import hi0.AbstractC17308f;
import io.github.florent37.shapeofview.shapes.BubbleView;

/* JADX INFO: renamed from: ii0.k0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC18554k0 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final Guideline f72319a;

    /* JADX INFO: renamed from: b */
    public final BubbleView f72320b;

    /* JADX INFO: renamed from: c */
    public final ImageView f72321c;

    /* JADX INFO: renamed from: d */
    public final TextView f72322d;

    /* JADX INFO: renamed from: e */
    public final TextView f72323e;

    /* JADX INFO: renamed from: f */
    public final ProgressBar f72324f;

    /* JADX INFO: renamed from: g */
    public final ComposeView f72325g;

    /* JADX INFO: renamed from: h */
    public final ImageView f72326h;

    /* JADX INFO: renamed from: i */
    public final FrameLayout f72327i;

    /* JADX INFO: renamed from: j */
    public final ImageView f72328j;

    /* JADX INFO: renamed from: k */
    public final TextView f72329k;

    public AbstractC18554k0(Object obj, View view, int i13, Guideline guideline, BubbleView bubbleView, ImageView imageView, TextView textView, TextView textView2, ProgressBar progressBar, ComposeView composeView, ImageView imageView2, FrameLayout frameLayout, ImageView imageView3, TextView textView3) {
        super(view, i13, obj);
        this.f72319a = guideline;
        this.f72320b = bubbleView;
        this.f72321c = imageView;
        this.f72322d = textView;
        this.f72323e = textView2;
        this.f72324f = progressBar;
        this.f72325g = composeView;
        this.f72326h = imageView2;
        this.f72327i = frameLayout;
        this.f72328j = imageView3;
        this.f72329k = textView3;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC18554k0 m53767c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m53768d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC18554k0 m53768d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC18554k0) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC17308f.f66901w, viewGroup, z4, obj);
    }
}
