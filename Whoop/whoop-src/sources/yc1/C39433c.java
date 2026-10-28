package yc1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.p018ui.platform.ComposeView;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import xc1.AbstractC38188b;
import xc1.AbstractC38189c;

/* JADX INFO: renamed from: yc1.c */
/* JADX INFO: loaded from: classes8.dex */
public final class C39433c implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final CardView f169669a;

    /* JADX INFO: renamed from: b */
    public final ComposeView f169670b;

    /* JADX INFO: renamed from: c */
    public final TextView f169671c;

    private C39433c(CardView cardView, ComposeView composeView, TextView textView) {
        this.f169669a = cardView;
        this.f169670b = composeView;
        this.f169671c = textView;
    }

    /* JADX INFO: renamed from: a */
    public static C39433c m125948a(View view) {
        int i13 = AbstractC38188b.f163510e;
        ComposeView composeView = (ComposeView) AbstractC34235f.m108203J(view, i13);
        if (composeView != null) {
            i13 = AbstractC38188b.f163514i;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                return new C39433c((CardView) view, composeView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: c */
    public static C39433c m125949c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC38189c.f163517c, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m125948a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f169669a;
    }
}
