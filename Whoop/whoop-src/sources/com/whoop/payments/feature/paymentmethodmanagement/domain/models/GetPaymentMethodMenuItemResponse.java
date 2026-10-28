package com.whoop.payments.feature.paymentmethodmanagement.domain.models;

import com.whoop.design.models.items.MenuItemModel;
import com.whoop.design.models.items.MenuItemModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ut2.C35231a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ2\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006,"}, m65681d2 = {"Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/GetPaymentMethodMenuItemResponse;", "", "Lcom/whoop/design/models/items/MenuItemModel;", "menuItem", "", "", "paymentErrorStateAnalyticsProperties", "<init>", "(Lcom/whoop/design/models/items/MenuItemModel;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/MenuItemModel;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_release", "(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/GetPaymentMethodMenuItemResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/MenuItemModel;", "component2", "()Ljava/util/Map;", "copy", "(Lcom/whoop/design/models/items/MenuItemModel;Ljava/util/Map;)Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/GetPaymentMethodMenuItemResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/MenuItemModel;", "getMenuItem", "Ljava/util/Map;", "getPaymentErrorStateAnalyticsProperties", "Companion", "$serializer", "a", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GetPaymentMethodMenuItemResponse {
    private final MenuItemModel menuItem;
    private final Map<String, String> paymentErrorStateAnalyticsProperties;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35231a(22))};

    /* JADX INFO: renamed from: com.whoop.payments.feature.paymentmethodmanagement.domain.models.GetPaymentMethodMenuItemResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/GetPaymentMethodMenuItemResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/GetPaymentMethodMenuItemResponse;", "serializer", "()Lwc3/c;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GetPaymentMethodMenuItemResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GetPaymentMethodMenuItemResponse(int i13, MenuItemModel menuItemModel, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, GetPaymentMethodMenuItemResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.menuItem = menuItemModel;
        this.paymentErrorStateAnalyticsProperties = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetPaymentMethodMenuItemResponse copy$default(GetPaymentMethodMenuItemResponse getPaymentMethodMenuItemResponse, MenuItemModel menuItemModel, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            menuItemModel = getPaymentMethodMenuItemResponse.menuItem;
        }
        if ((i13 & 2) != 0) {
            map = getPaymentMethodMenuItemResponse.paymentErrorStateAnalyticsProperties;
        }
        return getPaymentMethodMenuItemResponse.copy(menuItemModel, map);
    }

    public static final /* synthetic */ void write$Self$payments_release(GetPaymentMethodMenuItemResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, MenuItemModel$$serializer.INSTANCE, self.menuItem);
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.paymentErrorStateAnalyticsProperties);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MenuItemModel getMenuItem() {
        return this.menuItem;
    }

    public final Map<String, String> component2() {
        return this.paymentErrorStateAnalyticsProperties;
    }

    public final GetPaymentMethodMenuItemResponse copy(MenuItemModel menuItem, Map<String, String> paymentErrorStateAnalyticsProperties) {
        AbstractC22676k.m65750j(menuItem, "menuItem");
        return new GetPaymentMethodMenuItemResponse(menuItem, paymentErrorStateAnalyticsProperties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPaymentMethodMenuItemResponse)) {
            return false;
        }
        GetPaymentMethodMenuItemResponse getPaymentMethodMenuItemResponse = (GetPaymentMethodMenuItemResponse) other;
        return AbstractC22676k.m65745e(this.menuItem, getPaymentMethodMenuItemResponse.menuItem) && AbstractC22676k.m65745e(this.paymentErrorStateAnalyticsProperties, getPaymentMethodMenuItemResponse.paymentErrorStateAnalyticsProperties);
    }

    public final MenuItemModel getMenuItem() {
        return this.menuItem;
    }

    public final Map<String, String> getPaymentErrorStateAnalyticsProperties() {
        return this.paymentErrorStateAnalyticsProperties;
    }

    public int hashCode() {
        int iHashCode = this.menuItem.hashCode() * 31;
        Map<String, String> map = this.paymentErrorStateAnalyticsProperties;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "GetPaymentMethodMenuItemResponse(menuItem=" + this.menuItem + ", paymentErrorStateAnalyticsProperties=" + this.paymentErrorStateAnalyticsProperties + ")";
    }

    public GetPaymentMethodMenuItemResponse(MenuItemModel menuItem, Map<String, String> map) {
        AbstractC22676k.m65750j(menuItem, "menuItem");
        this.menuItem = menuItem;
        this.paymentErrorStateAnalyticsProperties = map;
    }
}
