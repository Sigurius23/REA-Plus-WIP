package wu1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whoop.p069ui.pills.StrokedPillFrameLayout;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import vu1.AbstractC36514e;
import vu1.AbstractC36516g;

/* JADX INFO: renamed from: wu1.a */
/* JADX INFO: loaded from: classes9.dex */
public final class C37644a implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f161244a;

    /* JADX INFO: renamed from: b */
    public final TextView f161245b;

    /* JADX INFO: renamed from: c */
    public final TextView f161246c;

    /* JADX INFO: renamed from: d */
    public final StrokedPillFrameLayout f161247d;

    /* JADX INFO: renamed from: e */
    public final TextView f161248e;

    /* JADX INFO: renamed from: f */
    public final StrokedPillFrameLayout f161249f;

    /* JADX INFO: renamed from: g */
    public final TextView f161250g;

    /* JADX INFO: renamed from: h */
    public final StrokedPillFrameLayout f161251h;

    /* JADX INFO: renamed from: i */
    public final TextView f161252i;

    private C37644a(ConstraintLayout constraintLayout, TextView textView, TextView textView2, StrokedPillFrameLayout strokedPillFrameLayout, TextView textView3, StrokedPillFrameLayout strokedPillFrameLayout2, TextView textView4, StrokedPillFrameLayout strokedPillFrameLayout3, TextView textView5) {
        this.f161244a = constraintLayout;
        this.f161245b = textView;
        this.f161246c = textView2;
        this.f161247d = strokedPillFrameLayout;
        this.f161248e = textView3;
        this.f161249f = strokedPillFrameLayout2;
        this.f161250g = textView4;
        this.f161251h = strokedPillFrameLayout3;
        this.f161252i = textView5;
    }

    /* JADX INFO: renamed from: a */
    public static C37644a m120973a(View view) {
        int i13 = AbstractC36514e.f156107y;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = AbstractC36514e.f156108z;
            TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView2 != null) {
                i13 = AbstractC36514e.f156077A;
                StrokedPillFrameLayout strokedPillFrameLayout = (StrokedPillFrameLayout) AbstractC34235f.m108203J(view, i13);
                if (strokedPillFrameLayout != null) {
                    i13 = AbstractC36514e.f156078B;
                    TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                    if (textView3 != null) {
                        i13 = AbstractC36514e.f156079C;
                        StrokedPillFrameLayout strokedPillFrameLayout2 = (StrokedPillFrameLayout) AbstractC34235f.m108203J(view, i13);
                        if (strokedPillFrameLayout2 != null) {
                            i13 = AbstractC36514e.f156080D;
                            TextView textView4 = (TextView) AbstractC34235f.m108203J(view, i13);
                            if (textView4 != null) {
                                i13 = AbstractC36514e.f156081E;
                                StrokedPillFrameLayout strokedPillFrameLayout3 = (StrokedPillFrameLayout) AbstractC34235f.m108203J(view, i13);
                                if (strokedPillFrameLayout3 != null) {
                                    i13 = AbstractC36514e.f156082F;
                                    TextView textView5 = (TextView) AbstractC34235f.m108203J(view, i13);
                                    if (textView5 != null) {
                                        return new C37644a((ConstraintLayout) view, textView, textView2, strokedPillFrameLayout, textView3, strokedPillFrameLayout2, textView4, strokedPillFrameLayout3, textView5);
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
    public static C37644a m120974c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC36516g.f156114d, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m120973a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f161244a;
    }
}
