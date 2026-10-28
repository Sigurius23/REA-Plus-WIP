package p235iz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.view.PaymentAuthWebView;
import com.whoop.android.R;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: iz.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C21040d implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f79773a;

    /* JADX INFO: renamed from: b */
    public final CircularProgressIndicator f79774b;

    /* JADX INFO: renamed from: c */
    public final Toolbar f79775c;

    /* JADX INFO: renamed from: d */
    public final PaymentAuthWebView f79776d;

    /* JADX INFO: renamed from: e */
    public final FrameLayout f79777e;

    public C21040d(CoordinatorLayout coordinatorLayout, CircularProgressIndicator circularProgressIndicator, Toolbar toolbar, PaymentAuthWebView paymentAuthWebView, FrameLayout frameLayout) {
        this.f79773a = coordinatorLayout;
        this.f79774b = circularProgressIndicator;
        this.f79775c = toolbar;
        this.f79776d = paymentAuthWebView;
        this.f79777e = frameLayout;
    }

    /* JADX INFO: renamed from: a */
    public static C21040d m58781a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.stripe_payment_auth_web_view_activity, (ViewGroup) null, false);
        int i13 = R.id.progress_bar;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) AbstractC34235f.m108203J(viewInflate, R.id.progress_bar);
        if (circularProgressIndicator != null) {
            i13 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) AbstractC34235f.m108203J(viewInflate, R.id.toolbar);
            if (toolbar != null) {
                i13 = R.id.web_view;
                PaymentAuthWebView paymentAuthWebView = (PaymentAuthWebView) AbstractC34235f.m108203J(viewInflate, R.id.web_view);
                if (paymentAuthWebView != null) {
                    i13 = R.id.web_view_container;
                    FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(viewInflate, R.id.web_view_container);
                    if (frameLayout != null) {
                        return new C21040d((CoordinatorLayout) viewInflate, circularProgressIndicator, toolbar, paymentAuthWebView, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.f79773a;
    }
}
