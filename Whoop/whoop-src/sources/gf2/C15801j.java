package gf2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import qe2.AbstractC30312e;
import qe2.AbstractC30313f;

/* JADX INFO: renamed from: gf2.j */
/* JADX INFO: loaded from: classes10.dex */
public final class C15801j implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f59613a;

    /* JADX INFO: renamed from: b */
    public final ImageView f59614b;

    /* JADX INFO: renamed from: c */
    public final ImageView f59615c;

    /* JADX INFO: renamed from: d */
    public final TextView f59616d;

    /* JADX INFO: renamed from: e */
    public final ImageView f59617e;

    private C15801j(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, ImageView imageView3) {
        this.f59613a = constraintLayout;
        this.f59614b = imageView;
        this.f59615c = imageView2;
        this.f59616d = textView;
        this.f59617e = imageView3;
    }

    /* JADX INFO: renamed from: a */
    public static C15801j m44580a(View view) {
        int i13 = AbstractC30312e.f124198v;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = AbstractC30312e.f124128Y;
            ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
            if (imageView2 != null) {
                i13 = AbstractC30312e.f124061B1;
                TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView != null) {
                    i13 = AbstractC30312e.f124115T1;
                    ImageView imageView3 = (ImageView) AbstractC34235f.m108203J(view, i13);
                    if (imageView3 != null) {
                        return new C15801j((ConstraintLayout) view, imageView, imageView2, textView, imageView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: c */
    public static C15801j m44581c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC30313f.f124221i, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m44580a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f59613a;
    }
}
