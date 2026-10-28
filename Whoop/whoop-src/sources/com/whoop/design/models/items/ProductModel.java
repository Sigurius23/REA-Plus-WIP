package com.whoop.design.models.items;

import com.mapbox.maps.MapboxMap;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36962i;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006+"}, m65681d2 = {"Lcom/whoop/design/models/items/ProductModel;", "", "Lcom/whoop/design/models/items/ProductInfo;", "productInfo", "", MapboxMap.QFE_CHILDREN, "<init>", "(Lcom/whoop/design/models/items/ProductInfo;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/ProductInfo;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ProductModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/ProductInfo;", "component2", "()Ljava/util/List;", "copy", "(Lcom/whoop/design/models/items/ProductInfo;Ljava/util/List;)Lcom/whoop/design/models/items/ProductModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/ProductInfo;", "getProductInfo", "Ljava/util/List;", "getChildren", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProductModel {
    private final List<ProductModel> children;
    private final ProductInfo productInfo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36962i(2))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ProductModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ProductModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProductModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProductModel(int i13, ProductInfo productInfo, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ProductModel$$serializer.INSTANCE.getDescriptor());
        }
        this.productInfo = productInfo;
        this.children = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ProductModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductModel copy$default(ProductModel productModel, ProductInfo productInfo, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            productInfo = productModel.productInfo;
        }
        if ((i13 & 2) != 0) {
            list = productModel.children;
        }
        return productModel.copy(productInfo, list);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ProductModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, ProductInfo$$serializer.INSTANCE, self.productInfo);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.children);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProductInfo getProductInfo() {
        return this.productInfo;
    }

    public final List<ProductModel> component2() {
        return this.children;
    }

    public final ProductModel copy(ProductInfo productInfo, List<ProductModel> children) {
        AbstractC22676k.m65750j(productInfo, "productInfo");
        AbstractC22676k.m65750j(children, "children");
        return new ProductModel(productInfo, children);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductModel)) {
            return false;
        }
        ProductModel productModel = (ProductModel) other;
        return AbstractC22676k.m65745e(this.productInfo, productModel.productInfo) && AbstractC22676k.m65745e(this.children, productModel.children);
    }

    public final List<ProductModel> getChildren() {
        return this.children;
    }

    public final ProductInfo getProductInfo() {
        return this.productInfo;
    }

    public int hashCode() {
        return this.children.hashCode() + (this.productInfo.hashCode() * 31);
    }

    public String toString() {
        return "ProductModel(productInfo=" + this.productInfo + ", children=" + this.children + ")";
    }

    public ProductModel(ProductInfo productInfo, List<ProductModel> children) {
        AbstractC22676k.m65750j(productInfo, "productInfo");
        AbstractC22676k.m65750j(children, "children");
        this.productInfo = productInfo;
        this.children = children;
    }
}
