package com.whoop.design.models.cards;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t42.C33538a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0002SRBC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0089\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u000e\u0010\u0018J#\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'JX\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b<\u0010\u001eR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010!R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010?\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010'R0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KRE\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`L¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\t0O8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010G\u001a\u0004\bP\u0010I\"\u0004\bQ\u0010K¨\u0006T"}, m65681d2 = {"Lcom/whoop/design/models/cards/ProductTestCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "imageUrl", "", "items", "Lcom/whoop/design/models/cards/TrailingIconModel;", "trailingIcon", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/cards/TrailingIconModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;)V", "", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/cards/TrailingIconModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/cards/ProductTestCardModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/design/models/cards/TrailingIconModel;", "component5", "()Lcom/whoop/navigation/e;", "component6", "()Lcom/whoop/design/models/modal/AnyModal;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/cards/TrailingIconModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/design/models/cards/ProductTestCardModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/ProductTestCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getImageUrl", "Ljava/util/List;", "getItems", "Lcom/whoop/design/models/cards/TrailingIconModel;", "getTrailingIcon", "getTrailingIcon$annotations", "()V", "Lcom/whoop/navigation/e;", "getDestination", "Lcom/whoop/design/models/modal/AnyModal;", "getModal", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProductTestCardModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final C9598e destination;
    private final String id;
    private final String imageUrl;
    private final List<DesignSystemModel> items;
    private final AnyModal modal;
    private final TrailingIconModel trailingIcon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/ProductTestCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/ProductTestCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProductTestCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C33538a(24)), null, AbstractC30060g.m92087G(enumC23463i, new C33538a(25)), AbstractC30060g.m92087G(enumC23463i, new C33538a(26)), AbstractC30060g.m92087G(enumC23463i, new C33538a(27)), null};
    }

    public /* synthetic */ ProductTestCardModel(int i13, String str, String str2, List list, TrailingIconModel trailingIconModel, C9598e c9598e, AnyModal anyModal, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ProductTestCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.imageUrl = str2;
        this.items = list;
        this.trailingIcon = trailingIconModel;
        this.destination = c9598e;
        this.modal = anyModal;
        if ((i13 & 64) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 128) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AnyModal.class), AbstractC38195a.m122336d(AnyModal.INSTANCE.serializer()), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductTestCardModel copy$default(ProductTestCardModel productTestCardModel, String str, String str2, List list, TrailingIconModel trailingIconModel, C9598e c9598e, AnyModal anyModal, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = productTestCardModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = productTestCardModel.imageUrl;
        }
        if ((i13 & 4) != 0) {
            list = productTestCardModel.items;
        }
        if ((i13 & 8) != 0) {
            trailingIconModel = productTestCardModel.trailingIcon;
        }
        if ((i13 & 16) != 0) {
            c9598e = productTestCardModel.destination;
        }
        if ((i13 & 32) != 0) {
            anyModal = productTestCardModel.modal;
        }
        C9598e c9598e2 = c9598e;
        AnyModal anyModal2 = anyModal;
        return productTestCardModel.copy(str, str2, list, trailingIconModel, c9598e2, anyModal2);
    }

    @InterfaceC37143h("trailing_icon")
    public static /* synthetic */ void getTrailingIcon$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(ProductTestCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
        output.encodeSerializableElement(serialDesc, 3, TrailingIconModel$$serializer.INSTANCE, self.trailingIcon);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.modal);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TrailingIconModel getTrailingIcon() {
        return this.trailingIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    public final ProductTestCardModel copy(String id4, String imageUrl, List<? extends DesignSystemModel> items, TrailingIconModel trailingIcon, C9598e destination, AnyModal modal) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(trailingIcon, "trailingIcon");
        return new ProductTestCardModel(id4, imageUrl, items, trailingIcon, destination, modal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductTestCardModel)) {
            return false;
        }
        ProductTestCardModel productTestCardModel = (ProductTestCardModel) other;
        return AbstractC22676k.m65745e(this.id, productTestCardModel.id) && AbstractC22676k.m65745e(this.imageUrl, productTestCardModel.imageUrl) && AbstractC22676k.m65745e(this.items, productTestCardModel.items) && AbstractC22676k.m65745e(this.trailingIcon, productTestCardModel.trailingIcon) && AbstractC22676k.m65745e(this.destination, productTestCardModel.destination) && AbstractC22676k.m65745e(this.modal, productTestCardModel.modal);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final AnyModal getModal() {
        return this.modal;
    }

    public final TrailingIconModel getTrailingIcon() {
        return this.trailingIcon;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.imageUrl);
        List<DesignSystemModel> list = this.items;
        int iHashCode = (this.trailingIcon.hashCode() + ((iM30450d + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        C9598e c9598e = this.destination;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        AnyModal anyModal = this.modal;
        return iHashCode2 + (anyModal != null ? anyModal.hashCode() : 0);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setAggregateBindings(Map<String, AggregateBinding> map) {
        this.aggregateBindings = map;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setBindings(Map<String, String> map) {
        this.bindings = map;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.imageUrl;
        List<DesignSystemModel> list = this.items;
        TrailingIconModel trailingIconModel = this.trailingIcon;
        C9598e c9598e = this.destination;
        AnyModal anyModal = this.modal;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ProductTestCardModel(id=", str, ", imageUrl=", str2, ", items=");
        sbM32001t.append(list);
        sbM32001t.append(", trailingIcon=");
        sbM32001t.append(trailingIconModel);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", modal=");
        sbM32001t.append(anyModal);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductTestCardModel(String id4, String imageUrl, List<? extends DesignSystemModel> list, TrailingIconModel trailingIcon, C9598e c9598e, AnyModal anyModal) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(trailingIcon, "trailingIcon");
        this.id = id4;
        this.imageUrl = imageUrl;
        this.items = list;
        this.trailingIcon = trailingIcon;
        this.destination = c9598e;
        this.modal = anyModal;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        if (r0.equals("CARET_RIGHT") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e4, code lost:
    
        if (r0.equals("CARET_FORWARD") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e7, code lost:
    
        if (r13 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e9, code lost:
    
        r2 = "CHECKMARK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00eb, code lost:
    
        r2 = "CARET_FORWARD";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f1, code lost:
    
        if (r0.equals("ADD") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f8, code lost:
    
        if (r0.equals("CHECKMARK") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fb, code lost:
    
        if (r13 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fe, code lost:
    
        r13 = r4.getDeselectAction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0102, code lost:
    
        if (r13 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0104, code lost:
    
        r13 = new com.whoop.whoopaction.domain.models.StateClearAction(r5, r11, 2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011f, code lost:
    
        return copy$default(r3, null, null, null, com.whoop.design.models.cards.TrailingIconModel.copy$default(r4, r2, null, null, r13, null, 22, null), null, null, 55, null);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.whoop.design.models.WithGeneratedBindings
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.whoop.design.models.cards.ProductTestCardModel bind(java.util.Map<java.lang.String, ? extends java.lang.Object> r13) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.design.models.cards.ProductTestCardModel.bind(java.util.Map):com.whoop.design.models.cards.ProductTestCardModel");
    }
}
