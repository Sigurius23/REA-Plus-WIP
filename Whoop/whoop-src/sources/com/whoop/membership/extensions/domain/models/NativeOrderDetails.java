package com.whoop.membership.extensions.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gw1.C16268a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019Jf\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0015J\u0010\u0010!\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J'\u0010/\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u0015R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00104\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010\u0017R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00107\u0012\u0004\b9\u00103\u001a\u0004\b8\u0010\u0019R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b;\u00103\u001a\u0004\b:\u0010\u0019R\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\b=\u00103\u001a\u0004\b<\u0010\u0019R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\b?\u00103\u001a\u0004\b>\u0010\u0019R\"\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\bA\u00103\u001a\u0004\b@\u0010\u0019¨\u0006D"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;", "", "", "title", "", "Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;", "lineItems", "Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;", "subtotal", "discount", "trialDepositRefund", "tax", "total", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;)Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/util/List;", "getLineItems", "getLineItems$annotations", "Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;", "getSubtotal", "getSubtotal$annotations", "getDiscount", "getDiscount$annotations", "getTrialDepositRefund", "getTrialDepositRefund$annotations", "getTax", "getTax$annotations", "getTotal", "getTotal$annotations", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NativeOrderDetails {

    @SerializedName("discount")
    private final NativeOrderDetailsItem discount;

    @SerializedName("line_items")
    private final List<NativeOrderLineItem> lineItems;

    @SerializedName("subtotal")
    private final NativeOrderDetailsItem subtotal;

    @SerializedName("tax")
    private final NativeOrderDetailsItem tax;

    @SerializedName("title")
    private final String title;

    @SerializedName("total")
    private final NativeOrderDetailsItem total;

    @SerializedName("trial_deposit_refund")
    private final NativeOrderDetailsItem trialDepositRefund;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C16268a(4)), null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NativeOrderDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NativeOrderDetails(int i13, String str, List list, NativeOrderDetailsItem nativeOrderDetailsItem, NativeOrderDetailsItem nativeOrderDetailsItem2, NativeOrderDetailsItem nativeOrderDetailsItem3, NativeOrderDetailsItem nativeOrderDetailsItem4, NativeOrderDetailsItem nativeOrderDetailsItem5, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, NativeOrderDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.lineItems = list;
        this.subtotal = nativeOrderDetailsItem;
        this.discount = nativeOrderDetailsItem2;
        this.trialDepositRefund = nativeOrderDetailsItem3;
        this.tax = nativeOrderDetailsItem4;
        this.total = nativeOrderDetailsItem5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(NativeOrderLineItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeOrderDetails copy$default(NativeOrderDetails nativeOrderDetails, String str, List list, NativeOrderDetailsItem nativeOrderDetailsItem, NativeOrderDetailsItem nativeOrderDetailsItem2, NativeOrderDetailsItem nativeOrderDetailsItem3, NativeOrderDetailsItem nativeOrderDetailsItem4, NativeOrderDetailsItem nativeOrderDetailsItem5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = nativeOrderDetails.title;
        }
        if ((i13 & 2) != 0) {
            list = nativeOrderDetails.lineItems;
        }
        if ((i13 & 4) != 0) {
            nativeOrderDetailsItem = nativeOrderDetails.subtotal;
        }
        if ((i13 & 8) != 0) {
            nativeOrderDetailsItem2 = nativeOrderDetails.discount;
        }
        if ((i13 & 16) != 0) {
            nativeOrderDetailsItem3 = nativeOrderDetails.trialDepositRefund;
        }
        if ((i13 & 32) != 0) {
            nativeOrderDetailsItem4 = nativeOrderDetails.tax;
        }
        if ((i13 & 64) != 0) {
            nativeOrderDetailsItem5 = nativeOrderDetails.total;
        }
        NativeOrderDetailsItem nativeOrderDetailsItem6 = nativeOrderDetailsItem4;
        NativeOrderDetailsItem nativeOrderDetailsItem7 = nativeOrderDetailsItem5;
        NativeOrderDetailsItem nativeOrderDetailsItem8 = nativeOrderDetailsItem3;
        NativeOrderDetailsItem nativeOrderDetailsItem9 = nativeOrderDetailsItem;
        return nativeOrderDetails.copy(str, list, nativeOrderDetailsItem9, nativeOrderDetailsItem2, nativeOrderDetailsItem8, nativeOrderDetailsItem6, nativeOrderDetailsItem7);
    }

    @InterfaceC37143h("discount")
    public static /* synthetic */ void getDiscount$annotations() {
    }

    @InterfaceC37143h("line_items")
    public static /* synthetic */ void getLineItems$annotations() {
    }

    @InterfaceC37143h("subtotal")
    public static /* synthetic */ void getSubtotal$annotations() {
    }

    @InterfaceC37143h("tax")
    public static /* synthetic */ void getTax$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @InterfaceC37143h("total")
    public static /* synthetic */ void getTotal$annotations() {
    }

    @InterfaceC37143h("trial_deposit_refund")
    public static /* synthetic */ void getTrialDepositRefund$annotations() {
    }

    public static final /* synthetic */ void write$Self$membership_release(NativeOrderDetails self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.lineItems);
        NativeOrderDetailsItem$$serializer nativeOrderDetailsItem$$serializer = NativeOrderDetailsItem$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, nativeOrderDetailsItem$$serializer, self.subtotal);
        output.encodeNullableSerializableElement(serialDesc, 3, nativeOrderDetailsItem$$serializer, self.discount);
        output.encodeNullableSerializableElement(serialDesc, 4, nativeOrderDetailsItem$$serializer, self.trialDepositRefund);
        output.encodeNullableSerializableElement(serialDesc, 5, nativeOrderDetailsItem$$serializer, self.tax);
        output.encodeNullableSerializableElement(serialDesc, 6, nativeOrderDetailsItem$$serializer, self.total);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<NativeOrderLineItem> component2() {
        return this.lineItems;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final NativeOrderDetailsItem getSubtotal() {
        return this.subtotal;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final NativeOrderDetailsItem getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final NativeOrderDetailsItem getTrialDepositRefund() {
        return this.trialDepositRefund;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final NativeOrderDetailsItem getTax() {
        return this.tax;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final NativeOrderDetailsItem getTotal() {
        return this.total;
    }

    public final NativeOrderDetails copy(String title, List<NativeOrderLineItem> lineItems, NativeOrderDetailsItem subtotal, NativeOrderDetailsItem discount, NativeOrderDetailsItem trialDepositRefund, NativeOrderDetailsItem tax, NativeOrderDetailsItem total) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(lineItems, "lineItems");
        return new NativeOrderDetails(title, lineItems, subtotal, discount, trialDepositRefund, tax, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeOrderDetails)) {
            return false;
        }
        NativeOrderDetails nativeOrderDetails = (NativeOrderDetails) other;
        return AbstractC22676k.m65745e(this.title, nativeOrderDetails.title) && AbstractC22676k.m65745e(this.lineItems, nativeOrderDetails.lineItems) && AbstractC22676k.m65745e(this.subtotal, nativeOrderDetails.subtotal) && AbstractC22676k.m65745e(this.discount, nativeOrderDetails.discount) && AbstractC22676k.m65745e(this.trialDepositRefund, nativeOrderDetails.trialDepositRefund) && AbstractC22676k.m65745e(this.tax, nativeOrderDetails.tax) && AbstractC22676k.m65745e(this.total, nativeOrderDetails.total);
    }

    public final NativeOrderDetailsItem getDiscount() {
        return this.discount;
    }

    public final List<NativeOrderLineItem> getLineItems() {
        return this.lineItems;
    }

    public final NativeOrderDetailsItem getSubtotal() {
        return this.subtotal;
    }

    public final NativeOrderDetailsItem getTax() {
        return this.tax;
    }

    public final String getTitle() {
        return this.title;
    }

    public final NativeOrderDetailsItem getTotal() {
        return this.total;
    }

    public final NativeOrderDetailsItem getTrialDepositRefund() {
        return this.trialDepositRefund;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.lineItems);
        NativeOrderDetailsItem nativeOrderDetailsItem = this.subtotal;
        int iHashCode = (iM31983b + (nativeOrderDetailsItem == null ? 0 : nativeOrderDetailsItem.hashCode())) * 31;
        NativeOrderDetailsItem nativeOrderDetailsItem2 = this.discount;
        int iHashCode2 = (iHashCode + (nativeOrderDetailsItem2 == null ? 0 : nativeOrderDetailsItem2.hashCode())) * 31;
        NativeOrderDetailsItem nativeOrderDetailsItem3 = this.trialDepositRefund;
        int iHashCode3 = (iHashCode2 + (nativeOrderDetailsItem3 == null ? 0 : nativeOrderDetailsItem3.hashCode())) * 31;
        NativeOrderDetailsItem nativeOrderDetailsItem4 = this.tax;
        int iHashCode4 = (iHashCode3 + (nativeOrderDetailsItem4 == null ? 0 : nativeOrderDetailsItem4.hashCode())) * 31;
        NativeOrderDetailsItem nativeOrderDetailsItem5 = this.total;
        return iHashCode4 + (nativeOrderDetailsItem5 != null ? nativeOrderDetailsItem5.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        List<NativeOrderLineItem> list = this.lineItems;
        NativeOrderDetailsItem nativeOrderDetailsItem = this.subtotal;
        NativeOrderDetailsItem nativeOrderDetailsItem2 = this.discount;
        NativeOrderDetailsItem nativeOrderDetailsItem3 = this.trialDepositRefund;
        NativeOrderDetailsItem nativeOrderDetailsItem4 = this.tax;
        NativeOrderDetailsItem nativeOrderDetailsItem5 = this.total;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("NativeOrderDetails(title=", str, ", lineItems=", ", subtotal=", list);
        sbM94766o.append(nativeOrderDetailsItem);
        sbM94766o.append(", discount=");
        sbM94766o.append(nativeOrderDetailsItem2);
        sbM94766o.append(", trialDepositRefund=");
        sbM94766o.append(nativeOrderDetailsItem3);
        sbM94766o.append(", tax=");
        sbM94766o.append(nativeOrderDetailsItem4);
        sbM94766o.append(", total=");
        sbM94766o.append(nativeOrderDetailsItem5);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public NativeOrderDetails(String title, List<NativeOrderLineItem> lineItems, NativeOrderDetailsItem nativeOrderDetailsItem, NativeOrderDetailsItem nativeOrderDetailsItem2, NativeOrderDetailsItem nativeOrderDetailsItem3, NativeOrderDetailsItem nativeOrderDetailsItem4, NativeOrderDetailsItem nativeOrderDetailsItem5) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(lineItems, "lineItems");
        this.title = title;
        this.lineItems = lineItems;
        this.subtotal = nativeOrderDetailsItem;
        this.discount = nativeOrderDetailsItem2;
        this.trialDepositRefund = nativeOrderDetailsItem3;
        this.tax = nativeOrderDetailsItem4;
        this.total = nativeOrderDetailsItem5;
    }
}
