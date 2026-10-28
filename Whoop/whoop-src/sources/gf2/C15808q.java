package gf2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import qe2.AbstractC30312e;

/* JADX INFO: renamed from: gf2.q */
/* JADX INFO: loaded from: classes10.dex */
public final class C15808q implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f59660a;

    /* JADX INFO: renamed from: b */
    public final View f59661b;

    /* JADX INFO: renamed from: c */
    public final ConstraintLayout f59662c;

    /* JADX INFO: renamed from: d */
    public final TextView f59663d;

    /* JADX INFO: renamed from: e */
    public final TextView f59664e;

    /* JADX INFO: renamed from: f */
    public final ImageView f59665f;

    /* JADX INFO: renamed from: g */
    public final ImageView f59666g;

    private C15808q(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2) {
        this.f59660a = constraintLayout;
        this.f59661b = view;
        this.f59662c = constraintLayout2;
        this.f59663d = textView;
        this.f59664e = textView2;
        this.f59665f = imageView;
        this.f59666g = imageView2;
    }

    /* JADX INFO: renamed from: a */
    public static C15808q m44605a(View view) {
        int i13 = AbstractC30312e.f124154g0;
        View viewM108203J = AbstractC34235f.m108203J(view, i13);
        if (viewM108203J != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i13 = AbstractC30312e.f124157h0;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = AbstractC30312e.f124160i0;
                TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView2 != null) {
                    i13 = AbstractC30312e.f124169l0;
                    ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
                    if (imageView != null) {
                        i13 = AbstractC30312e.f124172m0;
                        ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                        if (imageView2 != null) {
                            return new C15808q(constraintLayout, viewM108203J, constraintLayout, textView, textView2, imageView, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f59660a;
    }
}
