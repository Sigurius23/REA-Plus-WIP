package com.whoop.nativestore.home.domain.model;

import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import rx0.C31901f;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KLB\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u0093\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0019J\u0094\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b=\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b>\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b?\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bA\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\bB\u0010\u0019R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010$R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bG\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\bH\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\bI\u0010\u0019¨\u0006M"}, m65681d2 = {"Lcom/whoop/nativestore/home/domain/model/ShopProductModel;", "", "", "productId", "imageUrl", "title", "price", "salePrice", "Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;", "tagType", "tagText", "Lcom/whoop/navigation/e;", "destination", "", "index", "analyticsValue", "color", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;", "component7", "component8", "()Lcom/whoop/navigation/e;", "component9", "()Ljava/lang/Integer;", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/nativestore/home/domain/model/ShopProductModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/home/domain/model/ShopProductModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getProductId", "getImageUrl", "getTitle", "getPrice", "getSalePrice", "Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;", "getTagType", "getTagText", "Lcom/whoop/navigation/e;", "getDestination", "Ljava/lang/Integer;", "getIndex", "getAnalyticsValue", "getColor", "getCategory", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShopProductModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String analyticsValue;
    private final String category;
    private final String color;
    private final C9598e destination;
    private final String imageUrl;
    private final Integer index;
    private final String price;
    private final String productId;
    private final String salePrice;
    private final String tagText;
    private final ShopProductTagType tagType;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    /* JADX INFO: renamed from: com.whoop.nativestore.home.domain.model.ShopProductModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/home/domain/model/ShopProductModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/home/domain/model/ShopProductModel;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShopProductModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C31901f(15)), null, AbstractC30060g.m92087G(enumC23463i, new C31901f(16)), null, null, null, null};
    }

    public /* synthetic */ ShopProductModel(int i13, String str, String str2, String str3, String str4, String str5, ShopProductTagType shopProductTagType, String str6, C9598e c9598e, Integer num, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (655 != (i13 & 655)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 655, ShopProductModel$$serializer.INSTANCE.getDescriptor());
        }
        this.productId = str;
        this.imageUrl = str2;
        this.title = str3;
        this.price = str4;
        if ((i13 & 16) == 0) {
            this.salePrice = null;
        } else {
            this.salePrice = str5;
        }
        if ((i13 & 32) == 0) {
            this.tagType = null;
        } else {
            this.tagType = shopProductTagType;
        }
        if ((i13 & 64) == 0) {
            this.tagText = null;
        } else {
            this.tagText = str6;
        }
        this.destination = c9598e;
        if ((i13 & 256) == 0) {
            this.index = null;
        } else {
            this.index = num;
        }
        this.analyticsValue = str7;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.color = null;
        } else {
            this.color = str8;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.category = null;
        } else {
            this.category = str9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return ShopProductTagType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ShopProductModel copy$default(ShopProductModel shopProductModel, String str, String str2, String str3, String str4, String str5, ShopProductTagType shopProductTagType, String str6, C9598e c9598e, Integer num, String str7, String str8, String str9, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shopProductModel.productId;
        }
        if ((i13 & 2) != 0) {
            str2 = shopProductModel.imageUrl;
        }
        if ((i13 & 4) != 0) {
            str3 = shopProductModel.title;
        }
        if ((i13 & 8) != 0) {
            str4 = shopProductModel.price;
        }
        if ((i13 & 16) != 0) {
            str5 = shopProductModel.salePrice;
        }
        if ((i13 & 32) != 0) {
            shopProductTagType = shopProductModel.tagType;
        }
        if ((i13 & 64) != 0) {
            str6 = shopProductModel.tagText;
        }
        if ((i13 & 128) != 0) {
            c9598e = shopProductModel.destination;
        }
        if ((i13 & 256) != 0) {
            num = shopProductModel.index;
        }
        if ((i13 & 512) != 0) {
            str7 = shopProductModel.analyticsValue;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str8 = shopProductModel.color;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str9 = shopProductModel.category;
        }
        String str10 = str8;
        String str11 = str9;
        Integer num2 = num;
        String str12 = str7;
        String str13 = str6;
        C9598e c9598e2 = c9598e;
        String str14 = str5;
        ShopProductTagType shopProductTagType2 = shopProductTagType;
        return shopProductModel.copy(str, str2, str3, str4, str14, shopProductTagType2, str13, c9598e2, num2, str12, str10, str11);
    }

    public static final /* synthetic */ void write$Self$native_store_release(ShopProductModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.productId);
        output.encodeStringElement(serialDesc, 1, self.imageUrl);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeStringElement(serialDesc, 3, self.price);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.salePrice != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.salePrice);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.tagType != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.tagType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.tagText != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.tagText);
        }
        output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.destination);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.index != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, IntSerializer.INSTANCE, self.index);
        }
        output.encodeStringElement(serialDesc, 9, self.analyticsValue);
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.color != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.color);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 11) && self.category == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.category);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSalePrice() {
        return this.salePrice;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ShopProductTagType getTagType() {
        return this.tagType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTagText() {
        return this.tagText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getIndex() {
        return this.index;
    }

    public final ShopProductModel copy(String productId, String imageUrl, String title, String price, String salePrice, ShopProductTagType tagType, String tagText, C9598e destination, Integer index, String analyticsValue, String color, String category) {
        AbstractC22676k.m65750j(productId, "productId");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(analyticsValue, "analyticsValue");
        return new ShopProductModel(productId, imageUrl, title, price, salePrice, tagType, tagText, destination, index, analyticsValue, color, category);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopProductModel)) {
            return false;
        }
        ShopProductModel shopProductModel = (ShopProductModel) other;
        return AbstractC22676k.m65745e(this.productId, shopProductModel.productId) && AbstractC22676k.m65745e(this.imageUrl, shopProductModel.imageUrl) && AbstractC22676k.m65745e(this.title, shopProductModel.title) && AbstractC22676k.m65745e(this.price, shopProductModel.price) && AbstractC22676k.m65745e(this.salePrice, shopProductModel.salePrice) && this.tagType == shopProductModel.tagType && AbstractC22676k.m65745e(this.tagText, shopProductModel.tagText) && AbstractC22676k.m65745e(this.destination, shopProductModel.destination) && AbstractC22676k.m65745e(this.index, shopProductModel.index) && AbstractC22676k.m65745e(this.analyticsValue, shopProductModel.analyticsValue) && AbstractC22676k.m65745e(this.color, shopProductModel.color) && AbstractC22676k.m65745e(this.category, shopProductModel.category);
    }

    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getColor() {
        return this.color;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getSalePrice() {
        return this.salePrice;
    }

    public final String getTagText() {
        return this.tagText;
    }

    public final ShopProductTagType getTagType() {
        return this.tagType;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.productId.hashCode() * 31, 31, this.imageUrl), 31, this.title), 31, this.price);
        String str = this.salePrice;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        ShopProductTagType shopProductTagType = this.tagType;
        int iHashCode2 = (iHashCode + (shopProductTagType == null ? 0 : shopProductTagType.hashCode())) * 31;
        String str2 = this.tagText;
        int iM114673a = AbstractC36095b.m114673a(this.destination, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.index;
        int iM30450d2 = AbstractC11266d.m30450d((iM114673a + (num == null ? 0 : num.hashCode())) * 31, 31, this.analyticsValue);
        String str3 = this.color;
        int iHashCode3 = (iM30450d2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.category;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.productId;
        String str2 = this.imageUrl;
        String str3 = this.title;
        String str4 = this.price;
        String str5 = this.salePrice;
        ShopProductTagType shopProductTagType = this.tagType;
        String str6 = this.tagText;
        C9598e c9598e = this.destination;
        Integer num = this.index;
        String str7 = this.analyticsValue;
        String str8 = this.color;
        String str9 = this.category;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShopProductModel(productId=", str, ", imageUrl=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", price=", str4, ", salePrice=");
        sbM32001t.append(str5);
        sbM32001t.append(", tagType=");
        sbM32001t.append(shopProductTagType);
        sbM32001t.append(", tagText=");
        AbstractC30007c.m91827B(sbM32001t, str6, ", destination=", c9598e, ", index=");
        AbstractC13673n.m38577x(num, ", analyticsValue=", str7, ", color=", sbM32001t);
        return AbstractC11266d.m30464r(sbM32001t, str8, ", category=", str9, ")");
    }

    public ShopProductModel(String productId, String imageUrl, String title, String price, String str, ShopProductTagType shopProductTagType, String str2, C9598e destination, Integer num, String analyticsValue, String str3, String str4) {
        AbstractC22676k.m65750j(productId, "productId");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(analyticsValue, "analyticsValue");
        this.productId = productId;
        this.imageUrl = imageUrl;
        this.title = title;
        this.price = price;
        this.salePrice = str;
        this.tagType = shopProductTagType;
        this.tagText = str2;
        this.destination = destination;
        this.index = num;
        this.analyticsValue = analyticsValue;
        this.color = str3;
        this.category = str4;
    }

    public /* synthetic */ ShopProductModel(String str, String str2, String str3, String str4, String str5, ShopProductTagType shopProductTagType, String str6, C9598e c9598e, Integer num, String str7, String str8, String str9, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : shopProductTagType, (i13 & 64) != 0 ? null : str6, c9598e, (i13 & 256) != 0 ? null : num, str7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str8, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str9);
    }
}
