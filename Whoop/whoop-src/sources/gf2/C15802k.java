package gf2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whoop.p069ui.ThrobberView;
import com.whoop.p069ui.pills.StrokedPillButton;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import qe2.AbstractC30312e;
import qe2.AbstractC30313f;

/* JADX INFO: renamed from: gf2.k */
/* JADX INFO: loaded from: classes10.dex */
public final class C15802k implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f59618a;

    /* JADX INFO: renamed from: b */
    public final ComposeView f59619b;

    /* JADX INFO: renamed from: c */
    public final ImageView f59620c;

    /* JADX INFO: renamed from: d */
    public final ImageView f59621d;

    /* JADX INFO: renamed from: e */
    public final StrokedPillButton f59622e;

    /* JADX INFO: renamed from: f */
    public final TextView f59623f;

    /* JADX INFO: renamed from: g */
    public final ThrobberView f59624g;

    /* JADX INFO: renamed from: h */
    public final TextView f59625h;

    /* JADX INFO: renamed from: i */
    public final ConstraintLayout f59626i;

    private C15802k(ConstraintLayout constraintLayout, ComposeView composeView, ImageView imageView, ImageView imageView2, StrokedPillButton strokedPillButton, TextView textView, ThrobberView throbberView, TextView textView2, ConstraintLayout constraintLayout2) {
        this.f59618a = constraintLayout;
        this.f59619b = composeView;
        this.f59620c = imageView;
        this.f59621d = imageView2;
        this.f59622e = strokedPillButton;
        this.f59623f = textView;
        this.f59624g = throbberView;
        this.f59625h = textView2;
        this.f59626i = constraintLayout2;
    }

    /* JADX INFO: renamed from: a */
    public static C15802k m44583a(View view) {
        int i13 = AbstractC30312e.f124207y;
        ComposeView composeView = (ComposeView) AbstractC34235f.m108203J(view, i13);
        if (composeView != null) {
            i13 = AbstractC30312e.f124057A0;
            ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
            if (imageView != null) {
                i13 = AbstractC30312e.f124063C0;
                ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                if (imageView2 != null) {
                    i13 = AbstractC30312e.f124170l1;
                    StrokedPillButton strokedPillButton = (StrokedPillButton) AbstractC34235f.m108203J(view, i13);
                    if (strokedPillButton != null) {
                        i13 = AbstractC30312e.f124173m1;
                        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                        if (textView != null) {
                            i13 = AbstractC30312e.f124203w1;
                            ThrobberView throbberView = (ThrobberView) AbstractC34235f.m108203J(view, i13);
                            if (throbberView != null) {
                                i13 = AbstractC30312e.f124100O1;
                                TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                                if (textView2 != null) {
                                    i13 = AbstractC30312e.f124106Q1;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC34235f.m108203J(view, i13);
                                    if (constraintLayout != null) {
                                        return new C15802k((ConstraintLayout) view, composeView, imageView, imageView2, strokedPillButton, textView, throbberView, textView2, constraintLayout);
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
    public static C15802k m44584c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC30313f.f124222j, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m44583a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f59618a;
    }
}
