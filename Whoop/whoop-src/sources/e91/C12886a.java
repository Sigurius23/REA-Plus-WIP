package e91;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.p018ui.platform.ComposeView;
import ec.InterfaceC13008a;
import gy0.AbstractC16274c;
import gy0.AbstractC16275d;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: e91.a */
/* JADX INFO: loaded from: classes8.dex */
public final class C12886a implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final FrameLayout f44368a;

    /* JADX INFO: renamed from: b */
    public final ComposeView f44369b;

    private C12886a(FrameLayout frameLayout, ComposeView composeView) {
        this.f44368a = frameLayout;
        this.f44369b = composeView;
    }

    /* JADX INFO: renamed from: a */
    public static C12886a m36231a(View view) {
        int i13 = AbstractC16274c.f62205a;
        ComposeView composeView = (ComposeView) AbstractC34235f.m108203J(view, i13);
        if (composeView != null) {
            return new C12886a((FrameLayout) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: c */
    public static C12886a m36232c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC16275d.f62206a, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m36231a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f44368a;
    }
}
