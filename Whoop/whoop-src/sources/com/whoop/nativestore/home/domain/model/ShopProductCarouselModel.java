package com.whoop.nativestore.home.domain.model;

import com.whoop.design.models.ContentType;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import rx0.C31901f;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010\"JZ\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010\"J\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b7\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b:\u0010\"¨\u0006>"}, m65681d2 = {"Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;", "header", "", "Lcom/whoop/nativestore/home/domain/model/ShopProductModel;", "products", "", "internalName", "analyticsValue", "Lcom/whoop/design/models/ContentType;", "backgroundContentType", "backgroundContentUrl", "<init>", "(Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/whoop/design/models/ContentType;", "component6", "copy", "(Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;)Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;", "getHeader", "Ljava/util/List;", "getProducts", "Ljava/lang/String;", "getInternalName", "getAnalyticsValue", "Lcom/whoop/design/models/ContentType;", "getBackgroundContentType", "getBackgroundContentUrl", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShopProductCarouselModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String analyticsValue;
    private final ContentType backgroundContentType;
    private final String backgroundContentUrl;
    private final ShopSectionHeaderModel header;
    private final String internalName;
    private final List<ShopProductModel> products;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.nativestore.home.domain.model.ShopProductCarouselModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShopProductCarouselModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C31901f(13)), null, null, AbstractC30060g.m92087G(enumC23463i, new C31901f(14)), null};
    }

    public /* synthetic */ ShopProductCarouselModel(int i13, ShopSectionHeaderModel shopSectionHeaderModel, List list, String str, String str2, ContentType contentType, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (32 != (i13 & 32)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 32, ShopProductCarouselModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.header = null;
        } else {
            this.header = shopSectionHeaderModel;
        }
        if ((i13 & 2) == 0) {
            this.products = C25271y.f99162w;
        } else {
            this.products = list;
        }
        if ((i13 & 4) == 0) {
            this.internalName = null;
        } else {
            this.internalName = str;
        }
        if ((i13 & 8) == 0) {
            this.analyticsValue = null;
        } else {
            this.analyticsValue = str2;
        }
        if ((i13 & 16) == 0) {
            this.backgroundContentType = ContentType.IMAGE;
        } else {
            this.backgroundContentType = contentType;
        }
        this.backgroundContentUrl = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ShopProductModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return ContentType.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShopProductCarouselModel copy$default(ShopProductCarouselModel shopProductCarouselModel, ShopSectionHeaderModel shopSectionHeaderModel, List list, String str, String str2, ContentType contentType, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            shopSectionHeaderModel = shopProductCarouselModel.header;
        }
        if ((i13 & 2) != 0) {
            list = shopProductCarouselModel.products;
        }
        if ((i13 & 4) != 0) {
            str = shopProductCarouselModel.internalName;
        }
        if ((i13 & 8) != 0) {
            str2 = shopProductCarouselModel.analyticsValue;
        }
        if ((i13 & 16) != 0) {
            contentType = shopProductCarouselModel.backgroundContentType;
        }
        if ((i13 & 32) != 0) {
            str3 = shopProductCarouselModel.backgroundContentUrl;
        }
        ContentType contentType2 = contentType;
        String str4 = str3;
        return shopProductCarouselModel.copy(shopSectionHeaderModel, list, str, str2, contentType2, str4);
    }

    public static final /* synthetic */ void write$Self$native_store_release(ShopProductCarouselModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.header != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, ShopSectionHeaderModel$$serializer.INSTANCE, self.header);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.products, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.products);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.internalName != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.internalName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.analyticsValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.analyticsValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.backgroundContentType != ContentType.IMAGE) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.backgroundContentType);
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.backgroundContentUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ShopSectionHeaderModel getHeader() {
        return this.header;
    }

    public final List<ShopProductModel> component2() {
        return this.products;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInternalName() {
        return this.internalName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ContentType getBackgroundContentType() {
        return this.backgroundContentType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBackgroundContentUrl() {
        return this.backgroundContentUrl;
    }

    public final ShopProductCarouselModel copy(ShopSectionHeaderModel header, List<ShopProductModel> products, String internalName, String analyticsValue, ContentType backgroundContentType, String backgroundContentUrl) {
        AbstractC22676k.m65750j(products, "products");
        AbstractC22676k.m65750j(backgroundContentType, "backgroundContentType");
        return new ShopProductCarouselModel(header, products, internalName, analyticsValue, backgroundContentType, backgroundContentUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopProductCarouselModel)) {
            return false;
        }
        ShopProductCarouselModel shopProductCarouselModel = (ShopProductCarouselModel) other;
        return AbstractC22676k.m65745e(this.header, shopProductCarouselModel.header) && AbstractC22676k.m65745e(this.products, shopProductCarouselModel.products) && AbstractC22676k.m65745e(this.internalName, shopProductCarouselModel.internalName) && AbstractC22676k.m65745e(this.analyticsValue, shopProductCarouselModel.analyticsValue) && this.backgroundContentType == shopProductCarouselModel.backgroundContentType && AbstractC22676k.m65745e(this.backgroundContentUrl, shopProductCarouselModel.backgroundContentUrl);
    }

    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    public final ContentType getBackgroundContentType() {
        return this.backgroundContentType;
    }

    public final String getBackgroundContentUrl() {
        return this.backgroundContentUrl;
    }

    public final ShopSectionHeaderModel getHeader() {
        return this.header;
    }

    public final String getInternalName() {
        return this.internalName;
    }

    public final List<ShopProductModel> getProducts() {
        return this.products;
    }

    public int hashCode() {
        ShopSectionHeaderModel shopSectionHeaderModel = this.header;
        int iM31983b = AbstractC11895b.m31983b((shopSectionHeaderModel == null ? 0 : shopSectionHeaderModel.hashCode()) * 31, 31, this.products);
        String str = this.internalName;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.analyticsValue;
        int iHashCode2 = (this.backgroundContentType.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.backgroundContentUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        ShopSectionHeaderModel shopSectionHeaderModel = this.header;
        List<ShopProductModel> list = this.products;
        String str = this.internalName;
        String str2 = this.analyticsValue;
        ContentType contentType = this.backgroundContentType;
        String str3 = this.backgroundContentUrl;
        StringBuilder sb4 = new StringBuilder("ShopProductCarouselModel(header=");
        sb4.append(shopSectionHeaderModel);
        sb4.append(", products=");
        sb4.append(list);
        sb4.append(", internalName=");
        AbstractC11266d.m30444B(sb4, str, ", analyticsValue=", str2, ", backgroundContentType=");
        sb4.append(contentType);
        sb4.append(", backgroundContentUrl=");
        sb4.append(str3);
        sb4.append(")");
        return sb4.toString();
    }

    public ShopProductCarouselModel(ShopSectionHeaderModel shopSectionHeaderModel, List<ShopProductModel> products, String str, String str2, ContentType backgroundContentType, String str3) {
        AbstractC22676k.m65750j(products, "products");
        AbstractC22676k.m65750j(backgroundContentType, "backgroundContentType");
        this.header = shopSectionHeaderModel;
        this.products = products;
        this.internalName = str;
        this.analyticsValue = str2;
        this.backgroundContentType = backgroundContentType;
        this.backgroundContentUrl = str3;
    }

    public /* synthetic */ ShopProductCarouselModel(ShopSectionHeaderModel shopSectionHeaderModel, List list, String str, String str2, ContentType contentType, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : shopSectionHeaderModel, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? ContentType.IMAGE : contentType, str3);
    }
}
