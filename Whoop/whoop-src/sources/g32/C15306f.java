package g32;

import h20.EnumC16738t2;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g32.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u001d\u0010\"¨\u0006#"}, m65681d2 = {"Lg32/f;", "", "", "currency", "Lh20/t2;", "setupFutureUse", "paymentMethodConfigurationId", "onBehalfOf", "", "requireCvcRecollection", "", "paymentMethodTypes", "<init>", "(Ljava/lang/String;Lh20/t2;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lh20/t2;", "f", "()Lh20/t2;", "c", "d", "e", "Z", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15306f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String currency;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16738t2 setupFutureUse;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String paymentMethodConfigurationId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String onBehalfOf;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean requireCvcRecollection;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<String> paymentMethodTypes;

    public C15306f(String currency, EnumC16738t2 setupFutureUse, String str, String str2, boolean z4, List<String> paymentMethodTypes) {
        AbstractC22676k.m65750j(currency, "currency");
        AbstractC22676k.m65750j(setupFutureUse, "setupFutureUse");
        AbstractC22676k.m65750j(paymentMethodTypes, "paymentMethodTypes");
        this.currency = currency;
        this.setupFutureUse = setupFutureUse;
        this.paymentMethodConfigurationId = str;
        this.onBehalfOf = str2;
        this.requireCvcRecollection = z4;
        this.paymentMethodTypes = paymentMethodTypes;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOnBehalfOf() {
        return this.onBehalfOf;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPaymentMethodConfigurationId() {
        return this.paymentMethodConfigurationId;
    }

    /* JADX INFO: renamed from: d */
    public final List<String> m43449d() {
        return this.paymentMethodTypes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getRequireCvcRecollection() {
        return this.requireCvcRecollection;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15306f)) {
            return false;
        }
        C15306f c15306f = (C15306f) other;
        return AbstractC22676k.m65745e(this.currency, c15306f.currency) && this.setupFutureUse == c15306f.setupFutureUse && AbstractC22676k.m65745e(this.paymentMethodConfigurationId, c15306f.paymentMethodConfigurationId) && AbstractC22676k.m65745e(this.onBehalfOf, c15306f.onBehalfOf) && this.requireCvcRecollection == c15306f.requireCvcRecollection && AbstractC22676k.m65745e(this.paymentMethodTypes, c15306f.paymentMethodTypes);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC16738t2 getSetupFutureUse() {
        return this.setupFutureUse;
    }

    public int hashCode() {
        int iHashCode = (this.setupFutureUse.hashCode() + (this.currency.hashCode() * 31)) * 31;
        String str = this.paymentMethodConfigurationId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.onBehalfOf;
        return this.paymentMethodTypes.hashCode() + AbstractC2875y.m8289b((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.requireCvcRecollection);
    }

    public String toString() {
        String str = this.currency;
        EnumC16738t2 enumC16738t2 = this.setupFutureUse;
        String str2 = this.paymentMethodConfigurationId;
        String str3 = this.onBehalfOf;
        boolean z4 = this.requireCvcRecollection;
        List<String> list = this.paymentMethodTypes;
        StringBuilder sb4 = new StringBuilder("PaymentSheetIntentConfiguration(currency=");
        sb4.append(str);
        sb4.append(", setupFutureUse=");
        sb4.append(enumC16738t2);
        sb4.append(", paymentMethodConfigurationId=");
        AbstractC11266d.m30444B(sb4, str2, ", onBehalfOf=", str3, ", requireCvcRecollection=");
        sb4.append(z4);
        sb4.append(", paymentMethodTypes=");
        sb4.append(list);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C15306f(String str, EnumC16738t2 enumC16738t2, String str2, String str3, boolean z4, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? EnumC16738t2.f64292x : enumC16738t2, str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? C25271y.f99162w : list);
    }
}
