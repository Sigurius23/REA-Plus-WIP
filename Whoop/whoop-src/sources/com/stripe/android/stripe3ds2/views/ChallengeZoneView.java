package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.whoop.android.R;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import m30.C24989e;
import m30.InterfaceC24986b;
import p507tx.AbstractC34235f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001a\u0010(\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010+\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u001a\u0010.\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010\u001eR\u001a\u00104\u001a\u00020/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0011\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010?\u001a\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010B\u001a\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R\u0014\u0010E\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, m65681d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "Landroid/widget/LinearLayout;", "", "indicatorResId", "Ll83/a0;", "setInfoTextIndicator", "(I)V", "Landroid/view/View$OnClickListener;", "listener", "setSubmitButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "setResendButtonClickListener", "", "checked", "setWhitelistChecked", "(Z)V", "Landroid/view/View;", "challengeEntryView", "setChallengeEntryView", "(Landroid/view/View;)V", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "getInfoHeader$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "infoHeader", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "x", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getInfoTextView$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "infoTextView", "y", "getInfoLabelView$3ds2sdk_release", "infoLabelView", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "z", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "getSubmitButton$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "submitButton", "E", "getResendButton$3ds2sdk_release", "resendButton", "F", "getWhitelistingLabel$3ds2sdk_release", "whitelistingLabel", "Landroid/widget/RadioGroup;", "G", "Landroid/widget/RadioGroup;", "getWhitelistRadioGroup$3ds2sdk_release", "()Landroid/widget/RadioGroup;", "whitelistRadioGroup", "Landroid/widget/FrameLayout;", "H", "Landroid/widget/FrameLayout;", "getChallengeEntryView$3ds2sdk_release", "()Landroid/widget/FrameLayout;", "Landroid/widget/RadioButton;", "I", "Landroid/widget/RadioButton;", "getWhitelistYesRadioButton$3ds2sdk_release", "()Landroid/widget/RadioButton;", "whitelistYesRadioButton", "J", "getWhitelistNoRadioButton$3ds2sdk_release", "whitelistNoRadioButton", "getWhitelistingSelection$3ds2sdk_release", "()Z", "whitelistingSelection", "3ds2sdk_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class ChallengeZoneView extends LinearLayout {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final ThreeDS2Button resendButton;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final ThreeDS2TextView whitelistingLabel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final RadioGroup whitelistRadioGroup;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final FrameLayout challengeEntryView;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final RadioButton whitelistYesRadioButton;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final RadioButton whitelistNoRadioButton;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final ThreeDS2HeaderTextView infoHeader;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public final ThreeDS2TextView infoTextView;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public final ThreeDS2TextView infoLabelView;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final ThreeDS2Button submitButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
        LayoutInflater.from(context).inflate(R.layout.stripe_challenge_zone_view, this);
        int i13 = R.id.czv_entry_view;
        FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(this, R.id.czv_entry_view);
        if (frameLayout != null) {
            i13 = R.id.czv_header;
            ThreeDS2HeaderTextView threeDS2HeaderTextView = (ThreeDS2HeaderTextView) AbstractC34235f.m108203J(this, R.id.czv_header);
            if (threeDS2HeaderTextView != null) {
                i13 = R.id.czv_info;
                ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) AbstractC34235f.m108203J(this, R.id.czv_info);
                if (threeDS2TextView != null) {
                    i13 = R.id.czv_info_label;
                    ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) AbstractC34235f.m108203J(this, R.id.czv_info_label);
                    if (threeDS2TextView2 != null) {
                        i13 = R.id.czv_resend_button;
                        ThreeDS2Button threeDS2Button = (ThreeDS2Button) AbstractC34235f.m108203J(this, R.id.czv_resend_button);
                        if (threeDS2Button != null) {
                            i13 = R.id.czv_submit_button;
                            ThreeDS2Button threeDS2Button2 = (ThreeDS2Button) AbstractC34235f.m108203J(this, R.id.czv_submit_button);
                            if (threeDS2Button2 != null) {
                                i13 = R.id.czv_whitelist_no_button;
                                RadioButton radioButton = (RadioButton) AbstractC34235f.m108203J(this, R.id.czv_whitelist_no_button);
                                if (radioButton != null) {
                                    i13 = R.id.czv_whitelist_radio_group;
                                    RadioGroup radioGroup = (RadioGroup) AbstractC34235f.m108203J(this, R.id.czv_whitelist_radio_group);
                                    if (radioGroup != null) {
                                        i13 = R.id.czv_whitelist_yes_button;
                                        RadioButton radioButton2 = (RadioButton) AbstractC34235f.m108203J(this, R.id.czv_whitelist_yes_button);
                                        if (radioButton2 != null) {
                                            i13 = R.id.czv_whitelisting_label;
                                            ThreeDS2TextView threeDS2TextView3 = (ThreeDS2TextView) AbstractC34235f.m108203J(this, R.id.czv_whitelisting_label);
                                            if (threeDS2TextView3 != null) {
                                                this.infoHeader = threeDS2HeaderTextView;
                                                this.infoTextView = threeDS2TextView;
                                                this.infoLabelView = threeDS2TextView2;
                                                this.submitButton = threeDS2Button2;
                                                this.resendButton = threeDS2Button;
                                                this.whitelistingLabel = threeDS2TextView3;
                                                this.whitelistRadioGroup = radioGroup;
                                                this.challengeEntryView = frameLayout;
                                                this.whitelistYesRadioButton = radioButton2;
                                                this.whitelistNoRadioButton = radioButton;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: a */
    public final void m16878a(String str, C24989e c24989e) {
        ThreeDS2TextView threeDS2TextView = this.infoTextView;
        if (str == null || AbstractC39414r.m125890i0(str)) {
            threeDS2TextView.setVisibility(8);
        } else {
            threeDS2TextView.mo16881d(str, c24989e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16879b(String str, InterfaceC24986b interfaceC24986b) {
        ThreeDS2Button threeDS2Button = this.submitButton;
        if (str == null || AbstractC39414r.m125890i0(str)) {
            threeDS2Button.setVisibility(8);
        } else {
            threeDS2Button.setText(str);
            threeDS2Button.setButtonCustomization(interfaceC24986b);
        }
    }

    /* JADX INFO: renamed from: getChallengeEntryView$3ds2sdk_release, reason: from getter */
    public final FrameLayout getChallengeEntryView() {
        return this.challengeEntryView;
    }

    /* JADX INFO: renamed from: getInfoHeader$3ds2sdk_release, reason: from getter */
    public final ThreeDS2HeaderTextView getInfoHeader() {
        return this.infoHeader;
    }

    /* JADX INFO: renamed from: getInfoLabelView$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getInfoLabelView() {
        return this.infoLabelView;
    }

    /* JADX INFO: renamed from: getInfoTextView$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getInfoTextView() {
        return this.infoTextView;
    }

    /* JADX INFO: renamed from: getResendButton$3ds2sdk_release, reason: from getter */
    public final ThreeDS2Button getResendButton() {
        return this.resendButton;
    }

    /* JADX INFO: renamed from: getSubmitButton$3ds2sdk_release, reason: from getter */
    public final ThreeDS2Button getSubmitButton() {
        return this.submitButton;
    }

    /* JADX INFO: renamed from: getWhitelistNoRadioButton$3ds2sdk_release, reason: from getter */
    public final RadioButton getWhitelistNoRadioButton() {
        return this.whitelistNoRadioButton;
    }

    /* JADX INFO: renamed from: getWhitelistRadioGroup$3ds2sdk_release, reason: from getter */
    public final RadioGroup getWhitelistRadioGroup() {
        return this.whitelistRadioGroup;
    }

    /* JADX INFO: renamed from: getWhitelistYesRadioButton$3ds2sdk_release, reason: from getter */
    public final RadioButton getWhitelistYesRadioButton() {
        return this.whitelistYesRadioButton;
    }

    /* JADX INFO: renamed from: getWhitelistingLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getWhitelistingLabel() {
        return this.whitelistingLabel;
    }

    public final boolean getWhitelistingSelection$3ds2sdk_release() {
        return this.whitelistRadioGroup.getCheckedRadioButtonId() == R.id.czv_whitelist_yes_button;
    }

    public final void setChallengeEntryView(View challengeEntryView) {
        AbstractC22676k.m65750j(challengeEntryView, "challengeEntryView");
        this.challengeEntryView.addView(challengeEntryView);
    }

    public final void setInfoTextIndicator(int indicatorResId) {
        this.infoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(indicatorResId, 0, 0, 0);
    }

    public final void setResendButtonClickListener(View.OnClickListener listener) {
        this.resendButton.setOnClickListener(listener);
    }

    public final void setSubmitButtonClickListener(View.OnClickListener listener) {
        this.submitButton.setOnClickListener(listener);
    }

    public final void setWhitelistChecked(boolean checked) {
        this.whitelistYesRadioButton.setChecked(checked);
        this.whitelistNoRadioButton.setChecked(!checked);
    }
}
