package fw1;

import com.whoop.membership.extensions.domain.models.CheckoutPayload;
import com.whoop.membership.extensions.domain.models.NativeOrderResponse;
import com.whoop.membership.extensions.domain.models.OrderOption;
import com.whoop.membership.extensions.domain.models.StepPrefetchContent;
import com.whoop.payments.domain.models.Card;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fw1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0090\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b\u0004\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b,\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b'\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b:\u0010&\u001a\u0004\b5\u0010\u001a¨\u0006<"}, m65681d2 = {"Lfw1/a;", "Lfw1/c;", "", "isLoading", "isError", "", "payload", "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "stepPrefetchContent", "Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;", "nativeOrderResponse", "", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "overrideOrderOptions", "Lcom/whoop/payments/domain/models/Card;", "card", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "payloadV2", "", "payloadReactivation", "path", "<init>", "(ZZLjava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;Ljava/util/List;Lcom/whoop/payments/domain/models/Card;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/util/Map;Ljava/lang/String;)V", "c", "(ZZLjava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;Ljava/util/List;Lcom/whoop/payments/domain/models/Card;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/util/Map;Ljava/lang/String;)Lfw1/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "i", "d", "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "l", "()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "e", "Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;", "f", "()Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;", "Ljava/util/List;", "g", "()Ljava/util/List;", "Lcom/whoop/payments/domain/models/Card;", "()Lcom/whoop/payments/domain/models/Card;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "k", "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "Ljava/util/Map;", "j", "()Ljava/util/Map;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14834a implements InterfaceC14836c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String payload;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final StepPrefetchContent stepPrefetchContent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final NativeOrderResponse nativeOrderResponse;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<OrderOption> overrideOrderOptions;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Card card;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final CheckoutPayload payloadV2;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Map<String, String> payloadReactivation;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String path;

    public C14834a(boolean z4, boolean z13, String payload, StepPrefetchContent stepPrefetchContent, NativeOrderResponse nativeOrderResponse, List<OrderOption> overrideOrderOptions, Card card, CheckoutPayload checkoutPayload, Map<String, String> map, String str) {
        AbstractC22676k.m65750j(payload, "payload");
        AbstractC22676k.m65750j(overrideOrderOptions, "overrideOrderOptions");
        AbstractC22676k.m65750j(card, "card");
        this.isLoading = z4;
        this.isError = z13;
        this.payload = payload;
        this.stepPrefetchContent = stepPrefetchContent;
        this.nativeOrderResponse = nativeOrderResponse;
        this.overrideOrderOptions = overrideOrderOptions;
        this.card = card;
        this.payloadV2 = checkoutPayload;
        this.payloadReactivation = map;
        this.path = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C14834a m42628d(C14834a c14834a, boolean z4, boolean z13, String str, StepPrefetchContent stepPrefetchContent, NativeOrderResponse nativeOrderResponse, List list, Card card, CheckoutPayload checkoutPayload, Map map, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c14834a.isLoading;
        }
        if ((i13 & 2) != 0) {
            z13 = c14834a.isError;
        }
        if ((i13 & 4) != 0) {
            str = c14834a.payload;
        }
        if ((i13 & 8) != 0) {
            stepPrefetchContent = c14834a.stepPrefetchContent;
        }
        if ((i13 & 16) != 0) {
            nativeOrderResponse = c14834a.nativeOrderResponse;
        }
        if ((i13 & 32) != 0) {
            list = c14834a.overrideOrderOptions;
        }
        if ((i13 & 64) != 0) {
            card = c14834a.card;
        }
        if ((i13 & 128) != 0) {
            checkoutPayload = c14834a.payloadV2;
        }
        if ((i13 & 256) != 0) {
            map = c14834a.payloadReactivation;
        }
        if ((i13 & 512) != 0) {
            str2 = c14834a.path;
        }
        Map map2 = map;
        String str3 = str2;
        Card card2 = card;
        CheckoutPayload checkoutPayload2 = checkoutPayload;
        NativeOrderResponse nativeOrderResponse2 = nativeOrderResponse;
        List list2 = list;
        return c14834a.m42631c(z4, z13, str, stepPrefetchContent, nativeOrderResponse2, list2, card2, checkoutPayload2, map2, str3);
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
    public final C14834a m42631c(boolean isLoading, boolean isError, String payload, StepPrefetchContent stepPrefetchContent, NativeOrderResponse nativeOrderResponse, List<OrderOption> overrideOrderOptions, Card card, CheckoutPayload payloadV2, Map<String, String> payloadReactivation, String path) {
        AbstractC22676k.m65750j(payload, "payload");
        AbstractC22676k.m65750j(overrideOrderOptions, "overrideOrderOptions");
        AbstractC22676k.m65750j(card, "card");
        return new C14834a(isLoading, isError, payload, stepPrefetchContent, nativeOrderResponse, overrideOrderOptions, card, payloadV2, payloadReactivation, path);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Card getCard() {
        return this.card;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14834a)) {
            return false;
        }
        C14834a c14834a = (C14834a) other;
        return this.isLoading == c14834a.isLoading && this.isError == c14834a.isError && AbstractC22676k.m65745e(this.payload, c14834a.payload) && AbstractC22676k.m65745e(this.stepPrefetchContent, c14834a.stepPrefetchContent) && AbstractC22676k.m65745e(this.nativeOrderResponse, c14834a.nativeOrderResponse) && AbstractC22676k.m65745e(this.overrideOrderOptions, c14834a.overrideOrderOptions) && AbstractC22676k.m65745e(this.card, c14834a.card) && AbstractC22676k.m65745e(this.payloadV2, c14834a.payloadV2) && AbstractC22676k.m65745e(this.payloadReactivation, c14834a.payloadReactivation) && AbstractC22676k.m65745e(this.path, c14834a.path);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final NativeOrderResponse getNativeOrderResponse() {
        return this.nativeOrderResponse;
    }

    /* JADX INFO: renamed from: g */
    public final List<OrderOption> m42634g() {
        return this.overrideOrderOptions;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError), 31, this.payload);
        StepPrefetchContent stepPrefetchContent = this.stepPrefetchContent;
        int iHashCode = (iM30450d + (stepPrefetchContent == null ? 0 : stepPrefetchContent.hashCode())) * 31;
        NativeOrderResponse nativeOrderResponse = this.nativeOrderResponse;
        int iHashCode2 = (this.card.hashCode() + AbstractC11895b.m31983b((iHashCode + (nativeOrderResponse == null ? 0 : nativeOrderResponse.hashCode())) * 31, 31, this.overrideOrderOptions)) * 31;
        CheckoutPayload checkoutPayload = this.payloadV2;
        int iHashCode3 = (iHashCode2 + (checkoutPayload == null ? 0 : checkoutPayload.hashCode())) * 31;
        Map<String, String> map = this.payloadReactivation;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.path;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    @Override // fw1.InterfaceC14836c
    /* JADX INFO: renamed from: isError, reason: from getter */
    public boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: j */
    public final Map<String, String> m42637j() {
        return this.payloadReactivation;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final CheckoutPayload getPayloadV2() {
        return this.payloadV2;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final StepPrefetchContent getStepPrefetchContent() {
        return this.stepPrefetchContent;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        String str = this.payload;
        StepPrefetchContent stepPrefetchContent = this.stepPrefetchContent;
        NativeOrderResponse nativeOrderResponse = this.nativeOrderResponse;
        List<OrderOption> list = this.overrideOrderOptions;
        Card card = this.card;
        CheckoutPayload checkoutPayload = this.payloadV2;
        Map<String, String> map = this.payloadReactivation;
        String str2 = this.path;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ExtensionsCheckoutDomainResult(isLoading=", ", isError=", ", payload=", z4, z13);
        sbM32002u.append(str);
        sbM32002u.append(", stepPrefetchContent=");
        sbM32002u.append(stepPrefetchContent);
        sbM32002u.append(", nativeOrderResponse=");
        sbM32002u.append(nativeOrderResponse);
        sbM32002u.append(", overrideOrderOptions=");
        sbM32002u.append(list);
        sbM32002u.append(", card=");
        sbM32002u.append(card);
        sbM32002u.append(", payloadV2=");
        sbM32002u.append(checkoutPayload);
        sbM32002u.append(", payloadReactivation=");
        sbM32002u.append(map);
        sbM32002u.append(", path=");
        sbM32002u.append(str2);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C14834a(boolean z4, boolean z13, String str, StepPrefetchContent stepPrefetchContent, NativeOrderResponse nativeOrderResponse, List list, Card card, CheckoutPayload checkoutPayload, Map map, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) == 0 ? z13 : false, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? null : stepPrefetchContent, (i13 & 16) != 0 ? null : nativeOrderResponse, (i13 & 32) != 0 ? C25271y.f99162w : list, (i13 & 64) != 0 ? new Card((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : card, (i13 & 128) != 0 ? null : checkoutPayload, (i13 & 256) != 0 ? null : map, (i13 & 512) != 0 ? null : str2);
    }
}
