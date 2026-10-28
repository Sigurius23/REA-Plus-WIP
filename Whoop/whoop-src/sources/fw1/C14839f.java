package fw1;

import c13.AbstractC3855a;
import com.whoop.membership.extensions.domain.models.CheckoutPayload;
import com.whoop.membership.extensions.domain.models.OrderOption;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import com.whoop.membership.extensions.domain.models.StepPrefetchContent;
import com.whoop.payments.domain.models.Card;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fw1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014Jv\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u0004\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b+\u00104R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u00100\u001a\u0004\b2\u0010\u0018R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b)\u00105\u001a\u0004\b/\u00106¨\u00067"}, m65681d2 = {"Lfw1/f;", "Lfw1/c;", "", "isLoading", "isError", "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "stepPrefetchContent", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "placeOrderResponse", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "payloadV2", "", "promoCode", "Lcom/whoop/payments/domain/models/Card;", "card", "path", "", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "orderOptions", "<init>", "(ZZLcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/lang/String;Ljava/util/List;)V", "c", "(ZZLcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/lang/String;Ljava/util/List;)Lfw1/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "k", "()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "d", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "i", "()Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "e", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "f", "Ljava/lang/String;", "j", "g", "Lcom/whoop/payments/domain/models/Card;", "()Lcom/whoop/payments/domain/models/Card;", "Ljava/util/List;", "()Ljava/util/List;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14839f implements InterfaceC14836c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final StepPrefetchContent stepPrefetchContent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ProgressContent placeOrderResponse;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final CheckoutPayload payloadV2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String promoCode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Card card;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final List<OrderOption> orderOptions;

    public C14839f(boolean z4, boolean z13, StepPrefetchContent stepPrefetchContent, ProgressContent progressContent, CheckoutPayload payloadV2, String str, Card card, String path, List<OrderOption> orderOptions) {
        AbstractC22676k.m65750j(payloadV2, "payloadV2");
        AbstractC22676k.m65750j(card, "card");
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(orderOptions, "orderOptions");
        this.isLoading = z4;
        this.isError = z13;
        this.stepPrefetchContent = stepPrefetchContent;
        this.placeOrderResponse = progressContent;
        this.payloadV2 = payloadV2;
        this.promoCode = str;
        this.card = card;
        this.path = path;
        this.orderOptions = orderOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C14839f m42697d(C14839f c14839f, boolean z4, boolean z13, StepPrefetchContent stepPrefetchContent, ProgressContent progressContent, CheckoutPayload checkoutPayload, String str, Card card, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c14839f.isLoading;
        }
        if ((i13 & 2) != 0) {
            z13 = c14839f.isError;
        }
        if ((i13 & 4) != 0) {
            stepPrefetchContent = c14839f.stepPrefetchContent;
        }
        if ((i13 & 8) != 0) {
            progressContent = c14839f.placeOrderResponse;
        }
        if ((i13 & 16) != 0) {
            checkoutPayload = c14839f.payloadV2;
        }
        if ((i13 & 32) != 0) {
            str = c14839f.promoCode;
        }
        if ((i13 & 64) != 0) {
            card = c14839f.card;
        }
        if ((i13 & 128) != 0) {
            str2 = c14839f.path;
        }
        if ((i13 & 256) != 0) {
            list = c14839f.orderOptions;
        }
        String str3 = str2;
        List list2 = list;
        String str4 = str;
        Card card2 = card;
        CheckoutPayload checkoutPayload2 = checkoutPayload;
        StepPrefetchContent stepPrefetchContent2 = stepPrefetchContent;
        return c14839f.m42698c(z4, z13, stepPrefetchContent2, progressContent, checkoutPayload2, str4, card2, str3, list2);
    }

    @Override // fw1.InterfaceC14836c
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getIsLoading() {
        return this.isLoading;
    }

    @Override // fw1.InterfaceC14836c
    /* JADX INFO: renamed from: b */
    public /* bridge */ boolean mo42630b() {
        return super.mo42630b();
    }

    /* JADX INFO: renamed from: c */
    public final C14839f m42698c(boolean isLoading, boolean isError, StepPrefetchContent stepPrefetchContent, ProgressContent placeOrderResponse, CheckoutPayload payloadV2, String promoCode, Card card, String path, List<OrderOption> orderOptions) {
        AbstractC22676k.m65750j(payloadV2, "payloadV2");
        AbstractC22676k.m65750j(card, "card");
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(orderOptions, "orderOptions");
        return new C14839f(isLoading, isError, stepPrefetchContent, placeOrderResponse, payloadV2, promoCode, card, path, orderOptions);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Card getCard() {
        return this.card;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14839f)) {
            return false;
        }
        C14839f c14839f = (C14839f) other;
        return this.isLoading == c14839f.isLoading && this.isError == c14839f.isError && AbstractC22676k.m65745e(this.stepPrefetchContent, c14839f.stepPrefetchContent) && AbstractC22676k.m65745e(this.placeOrderResponse, c14839f.placeOrderResponse) && AbstractC22676k.m65745e(this.payloadV2, c14839f.payloadV2) && AbstractC22676k.m65745e(this.promoCode, c14839f.promoCode) && AbstractC22676k.m65745e(this.card, c14839f.card) && AbstractC22676k.m65745e(this.path, c14839f.path) && AbstractC22676k.m65745e(this.orderOptions, c14839f.orderOptions);
    }

    /* JADX INFO: renamed from: f */
    public final List<OrderOption> m42700f() {
        return this.orderOptions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final CheckoutPayload getPayloadV2() {
        return this.payloadV2;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        StepPrefetchContent stepPrefetchContent = this.stepPrefetchContent;
        int iHashCode = (iM8289b + (stepPrefetchContent == null ? 0 : stepPrefetchContent.hashCode())) * 31;
        ProgressContent progressContent = this.placeOrderResponse;
        int iHashCode2 = (this.payloadV2.hashCode() + ((iHashCode + (progressContent == null ? 0 : progressContent.hashCode())) * 31)) * 31;
        String str = this.promoCode;
        return this.orderOptions.hashCode() + AbstractC11266d.m30450d((this.card.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.path);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final ProgressContent getPlaceOrderResponse() {
        return this.placeOrderResponse;
    }

    @Override // fw1.InterfaceC14836c
    /* JADX INFO: renamed from: isError, reason: from getter */
    public boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPromoCode() {
        return this.promoCode;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final StepPrefetchContent getStepPrefetchContent() {
        return this.stepPrefetchContent;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        StepPrefetchContent stepPrefetchContent = this.stepPrefetchContent;
        ProgressContent progressContent = this.placeOrderResponse;
        CheckoutPayload checkoutPayload = this.payloadV2;
        String str = this.promoCode;
        Card card = this.card;
        String str2 = this.path;
        List<OrderOption> list = this.orderOptions;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ExtensionsV2PostCheckoutDomainResult(isLoading=", ", isError=", ", stepPrefetchContent=", z4, z13);
        sbM32002u.append(stepPrefetchContent);
        sbM32002u.append(", placeOrderResponse=");
        sbM32002u.append(progressContent);
        sbM32002u.append(", payloadV2=");
        sbM32002u.append(checkoutPayload);
        sbM32002u.append(", promoCode=");
        sbM32002u.append(str);
        sbM32002u.append(", card=");
        sbM32002u.append(card);
        sbM32002u.append(", path=");
        sbM32002u.append(str2);
        sbM32002u.append(", orderOptions=");
        return AbstractC3855a.m11829m(sbM32002u, list, ")");
    }

    public /* synthetic */ C14839f(boolean z4, boolean z13, StepPrefetchContent stepPrefetchContent, ProgressContent progressContent, CheckoutPayload checkoutPayload, String str, Card card, String str2, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : stepPrefetchContent, (i13 & 8) != 0 ? null : progressContent, checkoutPayload, (i13 & 32) != 0 ? null : str, (i13 & 64) != 0 ? new Card((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : card, str2, (i13 & 256) != 0 ? C25271y.f99162w : list);
    }
}
