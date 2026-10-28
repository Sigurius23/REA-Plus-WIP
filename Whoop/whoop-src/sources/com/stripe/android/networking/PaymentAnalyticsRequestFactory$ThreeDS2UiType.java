package com.stripe.android.networking;

import androidx.annotation.Keep;
import ge3.AbstractC15751g;
import kr.C22786e;
import p715kotlin.Metadata;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.stripe.android.networking.PaymentAnalyticsRequestFactory$ThreeDS2UiType[], still in use, count: 1, list:
  (r0v1 com.stripe.android.networking.PaymentAnalyticsRequestFactory$ThreeDS2UiType[]) from 0x004f: INVOKE (r0v1 com.stripe.android.networking.PaymentAnalyticsRequestFactory$ThreeDS2UiType[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m65681d2 = {"com/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType", "", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "", "toString", "()Ljava/lang/String;", "kr/e", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PaymentAnalyticsRequestFactory$ThreeDS2UiType {
    None(null, "none"),
    /* JADX INFO: Fake field, exist only in values array */
    Text("01", "text"),
    /* JADX INFO: Fake field, exist only in values array */
    SingleSelect("02", "single_select"),
    /* JADX INFO: Fake field, exist only in values array */
    MultiSelect("03", "multi_select"),
    /* JADX INFO: Fake field, exist only in values array */
    Oob("04", "oob"),
    /* JADX INFO: Fake field, exist only in values array */
    Html("05", "html");


    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ C33617b f22324F;

    /* JADX INFO: renamed from: y */
    public static final C22786e f22325y = new C22786e(12);

    /* JADX INFO: renamed from: w */
    public final String f22327w;

    /* JADX INFO: renamed from: x */
    public final String f22328x;

    static {
        f22324F = AbstractC15751g.m44468u(new PaymentAnalyticsRequestFactory$ThreeDS2UiType[]{r0, new PaymentAnalyticsRequestFactory$ThreeDS2UiType("01", "text"), new PaymentAnalyticsRequestFactory$ThreeDS2UiType("02", "single_select"), new PaymentAnalyticsRequestFactory$ThreeDS2UiType("03", "multi_select"), new PaymentAnalyticsRequestFactory$ThreeDS2UiType("04", "oob"), new PaymentAnalyticsRequestFactory$ThreeDS2UiType("05", "html")});
    }

    public PaymentAnalyticsRequestFactory$ThreeDS2UiType(String str, String str2) {
        super(str, i);
        this.f22327w = str;
        this.f22328x = str2;
    }

    public static PaymentAnalyticsRequestFactory$ThreeDS2UiType valueOf(String str) {
        return (PaymentAnalyticsRequestFactory$ThreeDS2UiType) Enum.valueOf(PaymentAnalyticsRequestFactory$ThreeDS2UiType.class, str);
    }

    public static PaymentAnalyticsRequestFactory$ThreeDS2UiType[] values() {
        return (PaymentAnalyticsRequestFactory$ThreeDS2UiType[]) f22323E.clone();
    }

    @Override // java.lang.Enum
    @Keep
    public String toString() {
        return this.f22328x;
    }
}
