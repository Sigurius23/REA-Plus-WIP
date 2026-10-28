package com.stripe.android.stripe3ds2.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.stripe.android.stripe3ds2.views.InformationZoneView;
import com.whoop.android.R;
import cr.RunnableC11076n;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p507tx.AbstractC34235f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001R \u0010\t\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R \u0010\u0014\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012R \u0010\u001b\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\b\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0004\u0012\u0004\b\u001e\u0010\b\u001a\u0004\b\u001d\u0010\u0006R \u0010#\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b \u0010\u0004\u0012\u0004\b\"\u0010\b\u001a\u0004\b!\u0010\u0006R \u0010'\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b$\u0010\u0010\u0012\u0004\b&\u0010\b\u001a\u0004\b%\u0010\u0012R \u0010+\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b(\u0010\u0017\u0012\u0004\b*\u0010\b\u001a\u0004\b)\u0010\u0019R\"\u00102\u001a\u00020,8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b-\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, m65681d2 = {"Lcom/stripe/android/stripe3ds2/views/InformationZoneView;", "Landroid/widget/FrameLayout;", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getWhyLabel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getWhyLabel$3ds2sdk_release$annotations", "()V", "whyLabel", "x", "getWhyText$3ds2sdk_release", "getWhyText$3ds2sdk_release$annotations", "whyText", "Landroid/widget/LinearLayout;", "y", "Landroid/widget/LinearLayout;", "getWhyContainer$3ds2sdk_release", "()Landroid/widget/LinearLayout;", "getWhyContainer$3ds2sdk_release$annotations", "whyContainer", "Landroidx/appcompat/widget/AppCompatImageView;", "z", "Landroidx/appcompat/widget/AppCompatImageView;", "getWhyArrow$3ds2sdk_release", "()Landroidx/appcompat/widget/AppCompatImageView;", "getWhyArrow$3ds2sdk_release$annotations", "whyArrow", "E", "getExpandLabel$3ds2sdk_release", "getExpandLabel$3ds2sdk_release$annotations", "expandLabel", "F", "getExpandText$3ds2sdk_release", "getExpandText$3ds2sdk_release$annotations", "expandText", "G", "getExpandContainer$3ds2sdk_release", "getExpandContainer$3ds2sdk_release$annotations", "expandContainer", "H", "getExpandArrow$3ds2sdk_release", "getExpandArrow$3ds2sdk_release$annotations", "expandArrow", "", "I", "getToggleColor$3ds2sdk_release", "()I", "setToggleColor$3ds2sdk_release", "(I)V", "toggleColor", "3ds2sdk_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class InformationZoneView extends FrameLayout {

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ int f22451L = 0;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final ThreeDS2TextView expandLabel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final ThreeDS2TextView expandText;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final LinearLayout expandContainer;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final AppCompatImageView expandArrow;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public int toggleColor;

    /* JADX INFO: renamed from: J */
    public int f22457J;

    /* JADX INFO: renamed from: K */
    public final int f22458K;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final ThreeDS2TextView whyLabel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public final ThreeDS2TextView whyText;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public final LinearLayout whyContainer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final AppCompatImageView whyArrow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.stripe_information_zone_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i13 = R.id.expand_arrow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC34235f.m108203J(viewInflate, R.id.expand_arrow);
        if (appCompatImageView != null) {
            i13 = R.id.expand_container;
            LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(viewInflate, R.id.expand_container);
            if (linearLayout != null) {
                i13 = R.id.expand_label;
                ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) AbstractC34235f.m108203J(viewInflate, R.id.expand_label);
                if (threeDS2TextView != null) {
                    i13 = R.id.expand_text;
                    ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) AbstractC34235f.m108203J(viewInflate, R.id.expand_text);
                    if (threeDS2TextView2 != null) {
                        i13 = R.id.why_arrow;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) AbstractC34235f.m108203J(viewInflate, R.id.why_arrow);
                        if (appCompatImageView2 != null) {
                            i13 = R.id.why_container;
                            LinearLayout linearLayout2 = (LinearLayout) AbstractC34235f.m108203J(viewInflate, R.id.why_container);
                            if (linearLayout2 != null) {
                                i13 = R.id.why_label;
                                ThreeDS2TextView threeDS2TextView3 = (ThreeDS2TextView) AbstractC34235f.m108203J(viewInflate, R.id.why_label);
                                if (threeDS2TextView3 != null) {
                                    i13 = R.id.why_text;
                                    ThreeDS2TextView threeDS2TextView4 = (ThreeDS2TextView) AbstractC34235f.m108203J(viewInflate, R.id.why_text);
                                    if (threeDS2TextView4 != null) {
                                        this.whyLabel = threeDS2TextView3;
                                        this.whyText = threeDS2TextView4;
                                        this.whyContainer = linearLayout2;
                                        this.whyArrow = appCompatImageView2;
                                        this.expandLabel = threeDS2TextView;
                                        this.expandText = threeDS2TextView2;
                                        this.expandContainer = linearLayout;
                                        this.expandArrow = appCompatImageView;
                                        this.f22458K = getResources().getInteger(android.R.integer.config_shortAnimTime);
                                        final int i14 = 0;
                                        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: t30.x

                                            /* JADX INFO: renamed from: x */
                                            public final /* synthetic */ InformationZoneView f139949x;

                                            {
                                                this.f139949x = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i14) {
                                                    case 0:
                                                        InformationZoneView informationZoneView = this.f139949x;
                                                        informationZoneView.m16880a(informationZoneView.whyArrow, informationZoneView.whyLabel, informationZoneView.whyText);
                                                        break;
                                                    default:
                                                        InformationZoneView informationZoneView2 = this.f139949x;
                                                        informationZoneView2.m16880a(informationZoneView2.expandArrow, informationZoneView2.expandLabel, informationZoneView2.expandText);
                                                        break;
                                                }
                                            }
                                        });
                                        final int i15 = 1;
                                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: t30.x

                                            /* JADX INFO: renamed from: x */
                                            public final /* synthetic */ InformationZoneView f139949x;

                                            {
                                                this.f139949x = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i15) {
                                                    case 0:
                                                        InformationZoneView informationZoneView = this.f139949x;
                                                        informationZoneView.m16880a(informationZoneView.whyArrow, informationZoneView.whyLabel, informationZoneView.whyText);
                                                        break;
                                                    default:
                                                        InformationZoneView informationZoneView2 = this.f139949x;
                                                        informationZoneView2.m16880a(informationZoneView2.expandArrow, informationZoneView2.expandLabel, informationZoneView2.expandText);
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    public static /* synthetic */ void getExpandArrow$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandContainer$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandLabel$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandText$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyArrow$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyContainer$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyLabel$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyText$3ds2sdk_release$annotations() {
    }

    /* JADX INFO: renamed from: a */
    public final void m16880a(View view, TextView textView, View view2) {
        boolean z4 = view2.getVisibility() == 8;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotation", z4 ? 180 : 0);
        long j7 = this.f22458K;
        objectAnimatorOfFloat.setDuration(j7);
        objectAnimatorOfFloat.start();
        textView.setEnabled(z4);
        view.setEnabled(z4);
        if (this.toggleColor != 0) {
            if (this.f22457J == 0) {
                this.f22457J = textView.getTextColors().getDefaultColor();
            }
            textView.setTextColor(z4 ? this.toggleColor : this.f22457J);
        }
        view2.setVisibility(z4 ? 0 : 8);
        if (z4) {
            view2.postDelayed(new RunnableC11076n(view2, 3), j7);
        }
    }

    /* JADX INFO: renamed from: getExpandArrow$3ds2sdk_release, reason: from getter */
    public final AppCompatImageView getExpandArrow() {
        return this.expandArrow;
    }

    /* JADX INFO: renamed from: getExpandContainer$3ds2sdk_release, reason: from getter */
    public final LinearLayout getExpandContainer() {
        return this.expandContainer;
    }

    /* JADX INFO: renamed from: getExpandLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getExpandLabel() {
        return this.expandLabel;
    }

    /* JADX INFO: renamed from: getExpandText$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getExpandText() {
        return this.expandText;
    }

    /* JADX INFO: renamed from: getToggleColor$3ds2sdk_release, reason: from getter */
    public final int getToggleColor() {
        return this.toggleColor;
    }

    /* JADX INFO: renamed from: getWhyArrow$3ds2sdk_release, reason: from getter */
    public final AppCompatImageView getWhyArrow() {
        return this.whyArrow;
    }

    /* JADX INFO: renamed from: getWhyContainer$3ds2sdk_release, reason: from getter */
    public final LinearLayout getWhyContainer() {
        return this.whyContainer;
    }

    /* JADX INFO: renamed from: getWhyLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getWhyLabel() {
        return this.whyLabel;
    }

    /* JADX INFO: renamed from: getWhyText$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getWhyText() {
        return this.whyText;
    }

    public final void setToggleColor$3ds2sdk_release(int i13) {
        this.toggleColor = i13;
    }
}
