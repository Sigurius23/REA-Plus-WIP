package com.stripe.android.model;

import androidx.annotation.Keep;
import ge3.AbstractC15751g;
import p499t9.C33623c0;
import p715kotlin.Metadata;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 com.stripe.android.model.StripeIntent$NextActionType[], still in use, count: 1, list:
  (r0v4 com.stripe.android.model.StripeIntent$NextActionType[]) from 0x00c5: INVOKE (r0v4 com.stripe.android.model.StripeIntent$NextActionType[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m65681d2 = {"com/stripe/android/model/StripeIntent$NextActionType", "", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "", "toString", "()Ljava/lang/String;", "t9/c0", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class StripeIntent$NextActionType {
    RedirectToUrl("redirect_to_url"),
    UseStripeSdk("use_stripe_sdk"),
    DisplayOxxoDetails("oxxo_display_details"),
    /* JADX INFO: Fake field, exist only in values array */
    AlipayRedirect("alipay_handle_redirect"),
    BlikAuthorize("blik_authorize"),
    /* JADX INFO: Fake field, exist only in values array */
    WeChatPayRedirect("wechat_pay_redirect_to_android_app"),
    VerifyWithMicrodeposits("verify_with_microdeposits"),
    UpiAwaitNotification("upi_await_notification"),
    CashAppRedirect("cashapp_handle_redirect_or_display_qr_code"),
    DisplayBoletoDetails("boleto_display_details"),
    DisplayKonbiniDetails("konbini_display_details"),
    DisplayMultibancoDetails("multibanco_display_details"),
    DisplayPayNowDetails("paynow_display_qr_code"),
    DisplayPromptPayDetails("promptpay_display_qr_code"),
    SwishRedirect("swish_handle_redirect_or_display_qr_code");


    /* JADX INFO: renamed from: Q */
    public static final /* synthetic */ C33617b f22238Q;

    /* JADX INFO: renamed from: x */
    public static final C33623c0 f22239x = new C33623c0();

    /* JADX INFO: renamed from: w */
    public final String f22242w;

    static {
        f22238Q = AbstractC15751g.m44468u(new StripeIntent$NextActionType[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14});
    }

    public StripeIntent$NextActionType(String str) {
        super(str, i);
        this.f22242w = str;
    }

    public static StripeIntent$NextActionType valueOf(String str) {
        return (StripeIntent$NextActionType) Enum.valueOf(StripeIntent$NextActionType.class, str);
    }

    public static StripeIntent$NextActionType[] values() {
        return (StripeIntent$NextActionType[]) f22237P.clone();
    }

    @Override // java.lang.Enum
    @Keep
    public String toString() {
        return this.f22242w;
    }
}
