package el2;

import al2.AbstractC0986b;
import al2.AbstractC0987c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whoop.p069ui.WhoopNewToolbar;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: el2.a */
/* JADX INFO: loaded from: classes10.dex */
public final class C13320a implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f46145a;

    /* JADX INFO: renamed from: b */
    public final ImageView f46146b;

    /* JADX INFO: renamed from: c */
    public final TextView f46147c;

    /* JADX INFO: renamed from: d */
    public final TextView f46148d;

    /* JADX INFO: renamed from: e */
    public final WhoopNewToolbar f46149e;

    /* JADX INFO: renamed from: f */
    public final LinearLayout f46150f;

    /* JADX INFO: renamed from: g */
    public final SwitchCompat f46151g;

    private C13320a(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, WhoopNewToolbar whoopNewToolbar, LinearLayout linearLayout, SwitchCompat switchCompat) {
        this.f46145a = constraintLayout;
        this.f46146b = imageView;
        this.f46147c = textView;
        this.f46148d = textView2;
        this.f46149e = whoopNewToolbar;
        this.f46150f = linearLayout;
        this.f46151g = switchCompat;
    }

    /* JADX INFO: renamed from: a */
    public static C13320a m37425a(View view) {
        int i13 = AbstractC0986b.f3638a;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = AbstractC0986b.f3639b;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = AbstractC0986b.f3640c;
                TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView2 != null) {
                    i13 = AbstractC0986b.f3641d;
                    WhoopNewToolbar whoopNewToolbar = (WhoopNewToolbar) AbstractC34235f.m108203J(view, i13);
                    if (whoopNewToolbar != null) {
                        i13 = AbstractC0986b.f3642e;
                        LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(view, i13);
                        if (linearLayout != null) {
                            i13 = AbstractC0986b.f3643f;
                            SwitchCompat switchCompat = (SwitchCompat) AbstractC34235f.m108203J(view, i13);
                            if (switchCompat != null) {
                                return new C13320a((ConstraintLayout) view, imageView, textView, textView2, whoopNewToolbar, linearLayout, switchCompat);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: c */
    public static C13320a m37426c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC0987c.f3645a, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m37425a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f46145a;
    }
}
