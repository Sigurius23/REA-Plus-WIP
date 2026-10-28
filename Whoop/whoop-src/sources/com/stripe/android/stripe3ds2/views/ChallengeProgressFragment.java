package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.whoop.android.R;
import n30.C26212c;
import n30.C26215f;
import ng3.C26701n;
import p479s4.AbstractC32122c;
import p507tx.AbstractC34235f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29926q0;
import t30.EnumC33499a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeProgressFragment;", "Landroidx/fragment/app/m0;", "3ds2sdk_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class ChallengeProgressFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w */
    public final String f22438w;

    /* JADX INFO: renamed from: x */
    public final C29926q0 f22439x;

    /* JADX INFO: renamed from: y */
    public final Integer f22440y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeProgressFragment(String directoryServerName, C29926q0 sdkTransactionId, Integer num) {
        super(R.layout.stripe_progress_view_layout);
        AbstractC22676k.m65750j(directoryServerName, "directoryServerName");
        AbstractC22676k.m65750j(sdkTransactionId, "sdkTransactionId");
        this.f22438w = directoryServerName;
        this.f22439x = sdkTransactionId;
        this.f22440y = num;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, bundle);
        int i13 = R.id.brand_logo;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, R.id.brand_logo);
        if (imageView != null) {
            i13 = R.id.progress_bar;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) AbstractC34235f.m108203J(view, R.id.progress_bar);
            if (circularProgressIndicator != null) {
                Context contextRequireContext = requireContext();
                AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
                C26212c c26212c = new C26212c(contextRequireContext, new C26215f(this.f22439x), null, null, 252);
                EnumC33499a.f139847E.getClass();
                EnumC33499a enumC33499aM79406n = C26701n.m79406n(this.f22438w, c26212c);
                AbstractActivityC1340r0 activity = getActivity();
                imageView.setImageDrawable(activity != null ? AbstractC32122c.getDrawable(activity, enumC33499aM79406n.f139852x) : null);
                Integer num = enumC33499aM79406n.f139853y;
                imageView.setContentDescription(num != null ? getString(num.intValue()) : null);
                if (enumC33499aM79406n.f139854z) {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.width = -2;
                    layoutParams.height = -2;
                    imageView.setLayoutParams(layoutParams);
                }
                imageView.setVisibility(0);
                Integer num2 = this.f22440y;
                if (num2 != null) {
                    circularProgressIndicator.setIndicatorColor(num2.intValue());
                    return;
                }
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }
}
