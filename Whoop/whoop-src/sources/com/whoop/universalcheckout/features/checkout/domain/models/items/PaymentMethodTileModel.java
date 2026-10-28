package com.whoop.universalcheckout.features.checkout.domain.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.HeaderModel;
import com.whoop.design.models.items.HeaderModel$$serializer;
import com.whoop.design.models.items.MenuItemModel;
import com.whoop.design.models.items.MenuItemModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no2.C26995a;
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
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J@\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\"¨\u00068"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/HeaderModel;", "header", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;", "paymentMethodTile", "Lcom/whoop/design/models/items/MenuItemModel;", "truemedPaymentMenuItem", "", "", "acceptedPaymentMethods", "<init>", "(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;Lcom/whoop/design/models/items/MenuItemModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/HeaderModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;Lcom/whoop/design/models/items/MenuItemModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/HeaderModel;", "component2", "()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;", "component3", "()Lcom/whoop/design/models/items/MenuItemModel;", "component4", "()Ljava/util/List;", "copy", "(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;Lcom/whoop/design/models/items/MenuItemModel;Ljava/util/List;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/HeaderModel;", "getHeader", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;", "getPaymentMethodTile", "Lcom/whoop/design/models/items/MenuItemModel;", "getTruemedPaymentMenuItem", "Ljava/util/List;", "getAcceptedPaymentMethods", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PaymentMethodTileModel implements DesignSystemModel {
    private final List<String> acceptedPaymentMethods;
    private final HeaderModel header;
    private final PaymentMethodMenuTileModel paymentMethodTile;
    private final MenuItemModel truemedPaymentMenuItem;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C26995a(7))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PaymentMethodTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PaymentMethodTileModel(int i13, HeaderModel headerModel, PaymentMethodMenuTileModel paymentMethodMenuTileModel, MenuItemModel menuItemModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, PaymentMethodTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.header = headerModel;
        this.paymentMethodTile = paymentMethodMenuTileModel;
        this.truemedPaymentMenuItem = menuItemModel;
        this.acceptedPaymentMethods = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodTileModel copy$default(PaymentMethodTileModel paymentMethodTileModel, HeaderModel headerModel, PaymentMethodMenuTileModel paymentMethodMenuTileModel, MenuItemModel menuItemModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            headerModel = paymentMethodTileModel.header;
        }
        if ((i13 & 2) != 0) {
            paymentMethodMenuTileModel = paymentMethodTileModel.paymentMethodTile;
        }
        if ((i13 & 4) != 0) {
            menuItemModel = paymentMethodTileModel.truemedPaymentMenuItem;
        }
        if ((i13 & 8) != 0) {
            list = paymentMethodTileModel.acceptedPaymentMethods;
        }
        return paymentMethodTileModel.copy(headerModel, paymentMethodMenuTileModel, menuItemModel, list);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(PaymentMethodTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, HeaderModel$$serializer.INSTANCE, self.header);
        output.encodeSerializableElement(serialDesc, 1, PaymentMethodMenuTileModel$$serializer.INSTANCE, self.paymentMethodTile);
        output.encodeNullableSerializableElement(serialDesc, 2, MenuItemModel$$serializer.INSTANCE, self.truemedPaymentMenuItem);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.acceptedPaymentMethods);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HeaderModel getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentMethodMenuTileModel getPaymentMethodTile() {
        return this.paymentMethodTile;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MenuItemModel getTruemedPaymentMenuItem() {
        return this.truemedPaymentMenuItem;
    }

    public final List<String> component4() {
        return this.acceptedPaymentMethods;
    }

    public final PaymentMethodTileModel copy(HeaderModel header, PaymentMethodMenuTileModel paymentMethodTile, MenuItemModel truemedPaymentMenuItem, List<String> acceptedPaymentMethods) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(paymentMethodTile, "paymentMethodTile");
        AbstractC22676k.m65750j(acceptedPaymentMethods, "acceptedPaymentMethods");
        return new PaymentMethodTileModel(header, paymentMethodTile, truemedPaymentMenuItem, acceptedPaymentMethods);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodTileModel)) {
            return false;
        }
        PaymentMethodTileModel paymentMethodTileModel = (PaymentMethodTileModel) other;
        return AbstractC22676k.m65745e(this.header, paymentMethodTileModel.header) && AbstractC22676k.m65745e(this.paymentMethodTile, paymentMethodTileModel.paymentMethodTile) && AbstractC22676k.m65745e(this.truemedPaymentMenuItem, paymentMethodTileModel.truemedPaymentMenuItem) && AbstractC22676k.m65745e(this.acceptedPaymentMethods, paymentMethodTileModel.acceptedPaymentMethods);
    }

    public final List<String> getAcceptedPaymentMethods() {
        return this.acceptedPaymentMethods;
    }

    public final HeaderModel getHeader() {
        return this.header;
    }

    public final PaymentMethodMenuTileModel getPaymentMethodTile() {
        return this.paymentMethodTile;
    }

    public final MenuItemModel getTruemedPaymentMenuItem() {
        return this.truemedPaymentMenuItem;
    }

    public int hashCode() {
        int iHashCode = (this.paymentMethodTile.hashCode() + (this.header.hashCode() * 31)) * 31;
        MenuItemModel menuItemModel = this.truemedPaymentMenuItem;
        return this.acceptedPaymentMethods.hashCode() + ((iHashCode + (menuItemModel == null ? 0 : menuItemModel.hashCode())) * 31);
    }

    public String toString() {
        return "PaymentMethodTileModel(header=" + this.header + ", paymentMethodTile=" + this.paymentMethodTile + ", truemedPaymentMenuItem=" + this.truemedPaymentMenuItem + ", acceptedPaymentMethods=" + this.acceptedPaymentMethods + ")";
    }

    public PaymentMethodTileModel(HeaderModel header, PaymentMethodMenuTileModel paymentMethodTile, MenuItemModel menuItemModel, List<String> acceptedPaymentMethods) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(paymentMethodTile, "paymentMethodTile");
        AbstractC22676k.m65750j(acceptedPaymentMethods, "acceptedPaymentMethods");
        this.header = header;
        this.paymentMethodTile = paymentMethodTile;
        this.truemedPaymentMenuItem = menuItemModel;
        this.acceptedPaymentMethods = acceptedPaymentMethods;
    }
}
