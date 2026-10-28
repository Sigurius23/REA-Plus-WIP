package of1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whoop.p069ui.views.ColoredImageView;
import ec.InterfaceC13008a;
import nf1.AbstractC26663d;
import nf1.AbstractC26665f;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: of1.b */
/* JADX INFO: loaded from: classes8.dex */
public final class C27896b implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f112478a;

    /* JADX INFO: renamed from: b */
    public final ImageView f112479b;

    /* JADX INFO: renamed from: c */
    public final TextView f112480c;

    /* JADX INFO: renamed from: d */
    public final ImageView f112481d;

    /* JADX INFO: renamed from: e */
    public final TextView f112482e;

    /* JADX INFO: renamed from: f */
    public final ImageView f112483f;

    /* JADX INFO: renamed from: g */
    public final TextView f112484g;

    /* JADX INFO: renamed from: h */
    public final TextView f112485h;

    /* JADX INFO: renamed from: i */
    public final LinearLayout f112486i;

    /* JADX INFO: renamed from: j */
    public final LinearLayout f112487j;

    /* JADX INFO: renamed from: k */
    public final ConstraintLayout f112488k;

    /* JADX INFO: renamed from: l */
    public final ColoredImageView f112489l;

    private C27896b(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, ImageView imageView3, TextView textView3, TextView textView4, LinearLayout linearLayout, LinearLayout linearLayout2, ConstraintLayout constraintLayout2, ColoredImageView coloredImageView) {
        this.f112478a = constraintLayout;
        this.f112479b = imageView;
        this.f112480c = textView;
        this.f112481d = imageView2;
        this.f112482e = textView2;
        this.f112483f = imageView3;
        this.f112484g = textView3;
        this.f112485h = textView4;
        this.f112486i = linearLayout;
        this.f112487j = linearLayout2;
        this.f112488k = constraintLayout2;
        this.f112489l = coloredImageView;
    }

    /* JADX INFO: renamed from: a */
    public static C27896b m84176a(View view) {
        int i13 = AbstractC26663d.f105982a;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = AbstractC26663d.f105983b;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = AbstractC26663d.f105985d;
                ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                if (imageView2 != null) {
                    i13 = AbstractC26663d.f105986e;
                    TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                    if (textView2 != null) {
                        i13 = AbstractC26663d.f105987f;
                        ImageView imageView3 = (ImageView) AbstractC34235f.m108203J(view, i13);
                        if (imageView3 != null) {
                            i13 = AbstractC26663d.f105988g;
                            TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                            if (textView3 != null) {
                                i13 = AbstractC26663d.f105989h;
                                TextView textView4 = (TextView) AbstractC34235f.m108203J(view, i13);
                                if (textView4 != null) {
                                    i13 = AbstractC26663d.f105990i;
                                    LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(view, i13);
                                    if (linearLayout != null) {
                                        i13 = AbstractC26663d.f105991j;
                                        LinearLayout linearLayout2 = (LinearLayout) AbstractC34235f.m108203J(view, i13);
                                        if (linearLayout2 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                            i13 = AbstractC26663d.f105996o;
                                            ColoredImageView coloredImageView = (ColoredImageView) AbstractC34235f.m108203J(view, i13);
                                            if (coloredImageView != null) {
                                                return new C27896b(constraintLayout, imageView, textView, imageView2, textView2, imageView3, textView3, textView4, linearLayout, linearLayout2, constraintLayout, coloredImageView);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: c */
    public static C27896b m84177c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC26665f.f106009d, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m84176a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f112478a;
    }
}
