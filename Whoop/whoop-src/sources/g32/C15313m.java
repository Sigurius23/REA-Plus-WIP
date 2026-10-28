package g32;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g32.m */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m65681d2 = {"Lg32/m;", "", "", "publishableKey", "Lg32/f;", "paymentSheetIntentConfiguration", "Lg32/e;", "paymentSheetConfiguration", "screenName", "<init>", "(Ljava/lang/String;Lg32/f;Lg32/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lg32/f;", "()Lg32/f;", "Lg32/e;", "()Lg32/e;", "d", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15313m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String publishableKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C15306f paymentSheetIntentConfiguration;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C15305e paymentSheetConfiguration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String screenName;

    public C15313m(String publishableKey, C15306f paymentSheetIntentConfiguration, C15305e paymentSheetConfiguration, String screenName) {
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(paymentSheetIntentConfiguration, "paymentSheetIntentConfiguration");
        AbstractC22676k.m65750j(paymentSheetConfiguration, "paymentSheetConfiguration");
        AbstractC22676k.m65750j(screenName, "screenName");
        this.publishableKey = publishableKey;
        this.paymentSheetIntentConfiguration = paymentSheetIntentConfiguration;
        this.paymentSheetConfiguration = paymentSheetConfiguration;
        this.screenName = screenName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C15305e getPaymentSheetConfiguration() {
        return this.paymentSheetConfiguration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C15306f getPaymentSheetIntentConfiguration() {
        return this.paymentSheetIntentConfiguration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15313m)) {
            return false;
        }
        C15313m c15313m = (C15313m) other;
        return AbstractC22676k.m65745e(this.publishableKey, c15313m.publishableKey) && AbstractC22676k.m65745e(this.paymentSheetIntentConfiguration, c15313m.paymentSheetIntentConfiguration) && AbstractC22676k.m65745e(this.paymentSheetConfiguration, c15313m.paymentSheetConfiguration) && AbstractC22676k.m65745e(this.screenName, c15313m.screenName);
    }

    public int hashCode() {
        return this.screenName.hashCode() + ((this.paymentSheetConfiguration.hashCode() + ((this.paymentSheetIntentConfiguration.hashCode() + (this.publishableKey.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "StripeConfiguration(publishableKey=" + this.publishableKey + ", paymentSheetIntentConfiguration=" + this.paymentSheetIntentConfiguration + ", paymentSheetConfiguration=" + this.paymentSheetConfiguration + ", screenName=" + this.screenName + ")";
    }
}
