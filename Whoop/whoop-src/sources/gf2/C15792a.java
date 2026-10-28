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

/* JADX INFO: renamed from: gf2.a */
/* JADX INFO: loaded from: classes10.dex */
public final class C15792a implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f59510a;

    /* JADX INFO: renamed from: b */
    public final ImageView f59511b;

    /* JADX INFO: renamed from: c */
    public final TextView f59512c;

    /* JADX INFO: renamed from: d */
    public final TextView f59513d;

    /* JADX INFO: renamed from: e */
    public final TextView f59514e;

    /* JADX INFO: renamed from: f */
    public final StrokedPillButton f59515f;

    private C15792a(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, StrokedPillButton strokedPillButton) {
        this.f59510a = constraintLayout;
        this.f59511b = imageView;
        this.f59512c = textView;
        this.f59513d = textView2;
        this.f59514e = textView3;
        this.f59515f = strokedPillButton;
    }

    /* JADX INFO: renamed from: a */
    public static C15792a m44555a(View view) {
        int i13 = AbstractC30312e.f124195u;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = AbstractC30312e.f124059B;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = AbstractC30312e.f124062C;
                TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView2 != null) {
                    i13 = AbstractC30312e.f124175n0;
                    TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                    if (textView3 != null) {
                        i13 = AbstractC30312e.f124060B0;
                        StrokedPillButton strokedPillButton = (StrokedPillButton) AbstractC34235f.m108203J(view, i13);
                        if (strokedPillButton != null) {
                            return new C15792a((ConstraintLayout) view, imageView, textView, textView2, textView3, strokedPillButton);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: c */
    public static C15792a m44556c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC30313f.f124213a, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m44555a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f59510a;
    }
}
