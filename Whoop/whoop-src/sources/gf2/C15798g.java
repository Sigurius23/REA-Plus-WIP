package gf2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whoop.p069ui.pills.StrokedPillButton;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import qe2.AbstractC30312e;
import qe2.AbstractC30313f;

/* JADX INFO: renamed from: gf2.g */
/* JADX INFO: loaded from: classes10.dex */
public final class C15798g implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f59576a;

    /* JADX INFO: renamed from: b */
    public final TextView f59577b;

    /* JADX INFO: renamed from: c */
    public final ConstraintLayout f59578c;

    /* JADX INFO: renamed from: d */
    public final TextView f59579d;

    /* JADX INFO: renamed from: e */
    public final StrokedPillButton f59580e;

    /* JADX INFO: renamed from: f */
    public final TextView f59581f;

    private C15798g(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, StrokedPillButton strokedPillButton, TextView textView3) {
        this.f59576a = constraintLayout;
        this.f59577b = textView;
        this.f59578c = constraintLayout2;
        this.f59579d = textView2;
        this.f59580e = strokedPillButton;
        this.f59581f = textView3;
    }

    /* JADX INFO: renamed from: a */
    public static C15798g m44570a(View view) {
        int i13 = AbstractC30312e.f124147e;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i13 = AbstractC30312e.f124153g;
            TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView2 != null) {
                i13 = AbstractC30312e.f124117U0;
                StrokedPillButton strokedPillButton = (StrokedPillButton) AbstractC34235f.m108203J(view, i13);
                if (strokedPillButton != null) {
                    i13 = AbstractC30312e.f124123W0;
                    TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                    if (textView3 != null) {
                        return new C15798g(constraintLayout, textView, constraintLayout, textView2, strokedPillButton, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: c */
    public static C15798g m44571c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC30313f.f124218f, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m44570a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f59576a;
    }
}
