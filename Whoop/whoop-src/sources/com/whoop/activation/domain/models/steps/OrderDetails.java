package com.whoop.activation.domain.models.steps;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
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
import r70.C31049a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010 JL\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b2\u0010 R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b3\u0010 ¨\u00066"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/OrderDetails;", "", "", "title", "", "Lcom/whoop/activation/domain/models/steps/LineItem;", "lineItems", "Lcom/whoop/activation/domain/models/steps/OrderItem;", "discount", "tax", "total", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/OrderItem;Lcom/whoop/activation/domain/models/steps/OrderItem;Lcom/whoop/activation/domain/models/steps/OrderItem;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/OrderItem;Lcom/whoop/activation/domain/models/steps/OrderItem;Lcom/whoop/activation/domain/models/steps/OrderItem;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/OrderDetails;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/activation/domain/models/steps/OrderItem;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/OrderItem;Lcom/whoop/activation/domain/models/steps/OrderItem;Lcom/whoop/activation/domain/models/steps/OrderItem;)Lcom/whoop/activation/domain/models/steps/OrderDetails;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getLineItems", "Lcom/whoop/activation/domain/models/steps/OrderItem;", "getDiscount", "getTax", "getTotal", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OrderDetails {
    private final OrderItem discount;
    private final List<LineItem> lineItems;
    private final OrderItem tax;
    private final String title;
    private final OrderItem total;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31049a(23)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/OrderDetails$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/OrderDetails;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OrderDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OrderDetails(int i13, String str, List list, OrderItem orderItem, OrderItem orderItem2, OrderItem orderItem3, SerializationConstructorMarker serializationConstructorMarker) {
        if (19 != (i13 & 19)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 19, OrderDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.lineItems = list;
        if ((i13 & 4) == 0) {
            this.discount = null;
        } else {
            this.discount = orderItem;
        }
        if ((i13 & 8) == 0) {
            this.tax = null;
        } else {
            this.tax = orderItem2;
        }
        this.total = orderItem3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(LineItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderDetails copy$default(OrderDetails orderDetails, String str, List list, OrderItem orderItem, OrderItem orderItem2, OrderItem orderItem3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = orderDetails.title;
        }
        if ((i13 & 2) != 0) {
            list = orderDetails.lineItems;
        }
        if ((i13 & 4) != 0) {
            orderItem = orderDetails.discount;
        }
        if ((i13 & 8) != 0) {
            orderItem2 = orderDetails.tax;
        }
        if ((i13 & 16) != 0) {
            orderItem3 = orderDetails.total;
        }
        OrderItem orderItem4 = orderItem3;
        OrderItem orderItem5 = orderItem;
        return orderDetails.copy(str, list, orderItem5, orderItem2, orderItem4);
    }

    public static final /* synthetic */ void write$Self$activation_release(OrderDetails self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.lineItems);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.discount != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, OrderItem$$serializer.INSTANCE, self.discount);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.tax != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, OrderItem$$serializer.INSTANCE, self.tax);
        }
        output.encodeSerializableElement(serialDesc, 4, OrderItem$$serializer.INSTANCE, self.total);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<LineItem> component2() {
        return this.lineItems;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrderItem getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OrderItem getTax() {
        return this.tax;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrderItem getTotal() {
        return this.total;
    }

    public final OrderDetails copy(String title, List<LineItem> lineItems, OrderItem discount, OrderItem tax, OrderItem total) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(lineItems, "lineItems");
        AbstractC22676k.m65750j(total, "total");
        return new OrderDetails(title, lineItems, discount, tax, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetails)) {
            return false;
        }
        OrderDetails orderDetails = (OrderDetails) other;
        return AbstractC22676k.m65745e(this.title, orderDetails.title) && AbstractC22676k.m65745e(this.lineItems, orderDetails.lineItems) && AbstractC22676k.m65745e(this.discount, orderDetails.discount) && AbstractC22676k.m65745e(this.tax, orderDetails.tax) && AbstractC22676k.m65745e(this.total, orderDetails.total);
    }

    public final OrderItem getDiscount() {
        return this.discount;
    }

    public final List<LineItem> getLineItems() {
        return this.lineItems;
    }

    public final OrderItem getTax() {
        return this.tax;
    }

    public final String getTitle() {
        return this.title;
    }

    public final OrderItem getTotal() {
        return this.total;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.lineItems);
        OrderItem orderItem = this.discount;
        int iHashCode = (iM31983b + (orderItem == null ? 0 : orderItem.hashCode())) * 31;
        OrderItem orderItem2 = this.tax;
        return this.total.hashCode() + ((iHashCode + (orderItem2 != null ? orderItem2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        List<LineItem> list = this.lineItems;
        OrderItem orderItem = this.discount;
        OrderItem orderItem2 = this.tax;
        OrderItem orderItem3 = this.total;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("OrderDetails(title=", str, ", lineItems=", ", discount=", list);
        sbM94766o.append(orderItem);
        sbM94766o.append(", tax=");
        sbM94766o.append(orderItem2);
        sbM94766o.append(", total=");
        sbM94766o.append(orderItem3);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public OrderDetails(String title, List<LineItem> lineItems, OrderItem orderItem, OrderItem orderItem2, OrderItem total) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(lineItems, "lineItems");
        AbstractC22676k.m65750j(total, "total");
        this.title = title;
        this.lineItems = lineItems;
        this.discount = orderItem;
        this.tax = orderItem2;
        this.total = total;
    }

    public /* synthetic */ OrderDetails(String str, List list, OrderItem orderItem, OrderItem orderItem2, OrderItem orderItem3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i13 & 4) != 0 ? null : orderItem, (i13 & 8) != 0 ? null : orderItem2, orderItem3);
    }
}
