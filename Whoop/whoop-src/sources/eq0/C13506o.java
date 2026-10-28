package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.o */
/* JADX INFO: loaded from: classes7.dex */
public final class C13506o implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final LinearLayout f47500a;

    /* JADX INFO: renamed from: b */
    public final TextView f47501b;

    /* JADX INFO: renamed from: c */
    public final TextView f47502c;

    private C13506o(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f47500a = linearLayout;
        this.f47501b = textView;
        this.f47502c = textView2;
    }

    /* JADX INFO: renamed from: a */
    public static C13506o m38219a(View view) {
        int i13 = AbstractC38499a0.f165050E0;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = AbstractC38499a0.f165059F0;
            TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView2 != null) {
                return new C13506o((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: c */
    public static C13506o m38220c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC38501b0.f165525k, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m38219a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f47500a;
    }
}
