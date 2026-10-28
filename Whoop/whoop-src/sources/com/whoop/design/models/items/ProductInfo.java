package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
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
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fBg\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010&Jd\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b;\u0010&¨\u0006>"}, m65681d2 = {"Lcom/whoop/design/models/items/ProductInfo;", "", "", "handle", "title", "description", "", "Lcom/whoop/design/models/items/ProductItems;", "items", "Lcom/whoop/design/models/items/Media;", "featuredMedia", "", "discount", "proDiscount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Media;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Media;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ProductInfo;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/design/models/items/Media;", "component6", "()Ljava/lang/Integer;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Media;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/whoop/design/models/items/ProductInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHandle", "getTitle", "getDescription", "Ljava/util/List;", "getItems", "Lcom/whoop/design/models/items/Media;", "getFeaturedMedia", "Ljava/lang/Integer;", "getDiscount", "getProDiscount", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProductInfo {
    private final String description;
    private final Integer discount;
    private final Media featuredMedia;
    private final String handle;
    private final List<ProductItems> items;
    private final Integer proDiscount;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36962i(0)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ProductInfo$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ProductInfo;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProductInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProductInfo(int i13, String str, String str2, String str3, List list, Media media, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, ProductInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.handle = str;
        this.title = str2;
        this.description = str3;
        this.items = list;
        this.featuredMedia = media;
        this.discount = num;
        this.proDiscount = num2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ProductItems$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductInfo copy$default(ProductInfo productInfo, String str, String str2, String str3, List list, Media media, Integer num, Integer num2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = productInfo.handle;
        }
        if ((i13 & 2) != 0) {
            str2 = productInfo.title;
        }
        if ((i13 & 4) != 0) {
            str3 = productInfo.description;
        }
        if ((i13 & 8) != 0) {
            list = productInfo.items;
        }
        if ((i13 & 16) != 0) {
            media = productInfo.featuredMedia;
        }
        if ((i13 & 32) != 0) {
            num = productInfo.discount;
        }
        if ((i13 & 64) != 0) {
            num2 = productInfo.proDiscount;
        }
        Integer num3 = num;
        Integer num4 = num2;
        Media media2 = media;
        String str4 = str3;
        return productInfo.copy(str, str2, str4, list, media2, num3, num4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ProductInfo self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.handle);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.description);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.items);
        output.encodeNullableSerializableElement(serialDesc, 4, Media$$serializer.INSTANCE, self.featuredMedia);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 5, intSerializer, self.discount);
        output.encodeNullableSerializableElement(serialDesc, 6, intSerializer, self.proDiscount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHandle() {
        return this.handle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<ProductItems> component4() {
        return this.items;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Media getFeaturedMedia() {
        return this.featuredMedia;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getProDiscount() {
        return this.proDiscount;
    }

    public final ProductInfo copy(String handle, String title, String description, List<ProductItems> items, Media featuredMedia, Integer discount, Integer proDiscount) {
        AbstractC22676k.m65750j(handle, "handle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        return new ProductInfo(handle, title, description, items, featuredMedia, discount, proDiscount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductInfo)) {
            return false;
        }
        ProductInfo productInfo = (ProductInfo) other;
        return AbstractC22676k.m65745e(this.handle, productInfo.handle) && AbstractC22676k.m65745e(this.title, productInfo.title) && AbstractC22676k.m65745e(this.description, productInfo.description) && AbstractC22676k.m65745e(this.items, productInfo.items) && AbstractC22676k.m65745e(this.featuredMedia, productInfo.featuredMedia) && AbstractC22676k.m65745e(this.discount, productInfo.discount) && AbstractC22676k.m65745e(this.proDiscount, productInfo.proDiscount);
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getDiscount() {
        return this.discount;
    }

    public final Media getFeaturedMedia() {
        return this.featuredMedia;
    }

    public final String getHandle() {
        return this.handle;
    }

    public final List<ProductItems> getItems() {
        return this.items;
    }

    public final Integer getProDiscount() {
        return this.proDiscount;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.handle.hashCode() * 31, 31, this.title);
        String str = this.description;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.items);
        Media media = this.featuredMedia;
        int iHashCode = (iM31983b + (media == null ? 0 : media.hashCode())) * 31;
        Integer num = this.discount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.proDiscount;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.handle;
        String str2 = this.title;
        String str3 = this.description;
        List<ProductItems> list = this.items;
        Media media = this.featuredMedia;
        Integer num = this.discount;
        Integer num2 = this.proDiscount;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ProductInfo(handle=", str, ", title=", str2, ", description=");
        AbstractC36095b.m114694v(str3, ", items=", ", featuredMedia=", sbM32001t, list);
        sbM32001t.append(media);
        sbM32001t.append(", discount=");
        sbM32001t.append(num);
        sbM32001t.append(", proDiscount=");
        return AbstractC11478a.m30859k(sbM32001t, num2, ")");
    }

    public ProductInfo(String handle, String title, String str, List<ProductItems> items, Media media, Integer num, Integer num2) {
        AbstractC22676k.m65750j(handle, "handle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        this.handle = handle;
        this.title = title;
        this.description = str;
        this.items = items;
        this.featuredMedia = media;
        this.discount = num;
        this.proDiscount = num2;
    }
}
