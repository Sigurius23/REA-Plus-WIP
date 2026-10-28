package gf2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whoop.p069ui.pills.StrokedPillButton;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import qe2.AbstractC30312e;
import qe2.AbstractC30313f;

/* JADX INFO: renamed from: gf2.e */
/* JADX INFO: loaded from: classes10.dex */
public final class C15796e implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f59554a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f59555b;

    /* JADX INFO: renamed from: c */
    public final StrokedPillButton f59556c;

    /* JADX INFO: renamed from: d */
    public final ImageView f59557d;

    /* JADX INFO: renamed from: e */
    public final TextView f59558e;

    /* JADX INFO: renamed from: f */
    public final ImageView f59559f;

    /* JADX INFO: renamed from: g */
    public final TextView f59560g;

    private C15796e(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, StrokedPillButton strokedPillButton, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2) {
        this.f59554a = constraintLayout;
        this.f59555b = constraintLayout2;
        this.f59556c = strokedPillButton;
        this.f59557d = imageView;
        this.f59558e = textView;
        this.f59559f = imageView2;
        this.f59560g = textView2;
    }

    /* JADX INFO: renamed from: a */
    public static C15796e m44563a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i13 = AbstractC30312e.f124168l;
        StrokedPillButton strokedPillButton = (StrokedPillButton) AbstractC34235f.m108203J(view, i13);
        if (strokedPillButton != null) {
            i13 = AbstractC30312e.f124198v;
            ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
            if (imageView != null) {
                i13 = AbstractC30312e.f124076G1;
                TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView != null) {
                    i13 = AbstractC30312e.f124079H1;
                    ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                    if (imageView2 != null) {
                        i13 = AbstractC30312e.f124082I1;
                        TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                        if (textView2 != null) {
                            return new C15796e(constraintLayout, constraintLayout, strokedPillButton, imageView, textView, imageView2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: c */
    public static C15796e m44564c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC30313f.f124216d, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m44563a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f59554a;
    }
}
