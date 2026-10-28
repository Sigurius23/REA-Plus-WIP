package com.whoop.universalcheckout.features.checkout.domain.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no2.C26995a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JN\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010$¨\u0006:"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "collapsedTitle", "", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderItemDetailsModel;", "items", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;", "checkoutInfo", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsSummaryModel;", "summary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsSummaryModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsSummaryModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;", "component5", "()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsSummaryModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsSummaryModel;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getCollapsedTitle", "Ljava/util/List;", "getItems", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;", "getCheckoutInfo", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsSummaryModel;", "getSummary", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OrderDetailsModel implements DesignSystemModel {
    private final CheckoutInfoModel checkoutInfo;
    private final String collapsedTitle;
    private final List<OrderItemDetailsModel> items;
    private final OrderDetailsSummaryModel summary;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C26995a(2)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OrderDetailsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OrderDetailsModel(int i13, String str, String str2, List list, CheckoutInfoModel checkoutInfoModel, OrderDetailsSummaryModel orderDetailsSummaryModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, OrderDetailsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.collapsedTitle = str2;
        this.items = list;
        this.checkoutInfo = checkoutInfoModel;
        if ((i13 & 16) == 0) {
            this.summary = null;
        } else {
            this.summary = orderDetailsSummaryModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(OrderItemDetailsModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderDetailsModel copy$default(OrderDetailsModel orderDetailsModel, String str, String str2, List list, CheckoutInfoModel checkoutInfoModel, OrderDetailsSummaryModel orderDetailsSummaryModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = orderDetailsModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = orderDetailsModel.collapsedTitle;
        }
        if ((i13 & 4) != 0) {
            list = orderDetailsModel.items;
        }
        if ((i13 & 8) != 0) {
            checkoutInfoModel = orderDetailsModel.checkoutInfo;
        }
        if ((i13 & 16) != 0) {
            orderDetailsSummaryModel = orderDetailsModel.summary;
        }
        OrderDetailsSummaryModel orderDetailsSummaryModel2 = orderDetailsSummaryModel;
        List list2 = list;
        return orderDetailsModel.copy(str, str2, list2, checkoutInfoModel, orderDetailsSummaryModel2);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(OrderDetailsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.collapsedTitle);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
        output.encodeNullableSerializableElement(serialDesc, 3, CheckoutInfoModel$$serializer.INSTANCE, self.checkoutInfo);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.summary == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, OrderDetailsSummaryModel$$serializer.INSTANCE, self.summary);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCollapsedTitle() {
        return this.collapsedTitle;
    }

    public final List<OrderItemDetailsModel> component3() {
        return this.items;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CheckoutInfoModel getCheckoutInfo() {
        return this.checkoutInfo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrderDetailsSummaryModel getSummary() {
        return this.summary;
    }

    public final OrderDetailsModel copy(String title, String collapsedTitle, List<OrderItemDetailsModel> items, CheckoutInfoModel checkoutInfo, OrderDetailsSummaryModel summary) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        return new OrderDetailsModel(title, collapsedTitle, items, checkoutInfo, summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailsModel)) {
            return false;
        }
        OrderDetailsModel orderDetailsModel = (OrderDetailsModel) other;
        return AbstractC22676k.m65745e(this.title, orderDetailsModel.title) && AbstractC22676k.m65745e(this.collapsedTitle, orderDetailsModel.collapsedTitle) && AbstractC22676k.m65745e(this.items, orderDetailsModel.items) && AbstractC22676k.m65745e(this.checkoutInfo, orderDetailsModel.checkoutInfo) && AbstractC22676k.m65745e(this.summary, orderDetailsModel.summary);
    }

    public final CheckoutInfoModel getCheckoutInfo() {
        return this.checkoutInfo;
    }

    public final String getCollapsedTitle() {
        return this.collapsedTitle;
    }

    public final List<OrderItemDetailsModel> getItems() {
        return this.items;
    }

    public final OrderDetailsSummaryModel getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.collapsedTitle;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.items);
        CheckoutInfoModel checkoutInfoModel = this.checkoutInfo;
        int iHashCode2 = (iM31983b + (checkoutInfoModel == null ? 0 : checkoutInfoModel.hashCode())) * 31;
        OrderDetailsSummaryModel orderDetailsSummaryModel = this.summary;
        return iHashCode2 + (orderDetailsSummaryModel != null ? orderDetailsSummaryModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.collapsedTitle;
        List<OrderItemDetailsModel> list = this.items;
        CheckoutInfoModel checkoutInfoModel = this.checkoutInfo;
        OrderDetailsSummaryModel orderDetailsSummaryModel = this.summary;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("OrderDetailsModel(title=", str, ", collapsedTitle=", str2, ", items=");
        sbM32001t.append(list);
        sbM32001t.append(", checkoutInfo=");
        sbM32001t.append(checkoutInfoModel);
        sbM32001t.append(", summary=");
        sbM32001t.append(orderDetailsSummaryModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public OrderDetailsModel(String title, String str, List<OrderItemDetailsModel> items, CheckoutInfoModel checkoutInfoModel, OrderDetailsSummaryModel orderDetailsSummaryModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        this.title = title;
        this.collapsedTitle = str;
        this.items = items;
        this.checkoutInfo = checkoutInfoModel;
        this.summary = orderDetailsSummaryModel;
    }

    public /* synthetic */ OrderDetailsModel(String str, String str2, List list, CheckoutInfoModel checkoutInfoModel, OrderDetailsSummaryModel orderDetailsSummaryModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, checkoutInfoModel, (i13 & 16) != 0 ? null : orderDetailsSummaryModel);
    }
}
