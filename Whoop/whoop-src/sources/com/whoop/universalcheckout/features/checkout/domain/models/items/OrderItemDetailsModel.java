package com.whoop.universalcheckout.features.checkout.domain.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no2.C26995a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
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
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rBq\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJj\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b6\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b7\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b8\u0010\u001d¨\u0006;"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderItemDetailsModel;", "", "", "title", "subtitle", "image", "", "stackedImages", "price", "strikethroughPrice", "quantity", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderItemDetailsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderItemDetailsModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getImage", "Ljava/util/List;", "getStackedImages", "getPrice", "getStrikethroughPrice", "getQuantity", "getStyle", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OrderItemDetailsModel {
    private final String image;
    private final String price;
    private final String quantity;
    private final List<String> stackedImages;
    private final String strikethroughPrice;
    private final String style;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C26995a(4)), null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderItemDetailsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderItemDetailsModel;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OrderItemDetailsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OrderItemDetailsModel(int i13, String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, OrderItemDetailsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.image = str3;
        this.stackedImages = list;
        this.price = str4;
        this.strikethroughPrice = str5;
        this.quantity = str6;
        this.style = str7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderItemDetailsModel copy$default(OrderItemDetailsModel orderItemDetailsModel, String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = orderItemDetailsModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = orderItemDetailsModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = orderItemDetailsModel.image;
        }
        if ((i13 & 8) != 0) {
            list = orderItemDetailsModel.stackedImages;
        }
        if ((i13 & 16) != 0) {
            str4 = orderItemDetailsModel.price;
        }
        if ((i13 & 32) != 0) {
            str5 = orderItemDetailsModel.strikethroughPrice;
        }
        if ((i13 & 64) != 0) {
            str6 = orderItemDetailsModel.quantity;
        }
        if ((i13 & 128) != 0) {
            str7 = orderItemDetailsModel.style;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return orderItemDetailsModel.copy(str, str2, str3, list, str10, str11, str8, str9);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(OrderItemDetailsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        output.encodeStringElement(serialDesc, 2, self.image);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.stackedImages);
        output.encodeStringElement(serialDesc, 4, self.price);
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.strikethroughPrice);
        output.encodeStringElement(serialDesc, 6, self.quantity);
        output.encodeStringElement(serialDesc, 7, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final List<String> component4() {
        return this.stackedImages;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStrikethroughPrice() {
        return this.strikethroughPrice;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final OrderItemDetailsModel copy(String title, String subtitle, String image, List<String> stackedImages, String price, String strikethroughPrice, String quantity, String style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(quantity, "quantity");
        AbstractC22676k.m65750j(style, "style");
        return new OrderItemDetailsModel(title, subtitle, image, stackedImages, price, strikethroughPrice, quantity, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderItemDetailsModel)) {
            return false;
        }
        OrderItemDetailsModel orderItemDetailsModel = (OrderItemDetailsModel) other;
        return AbstractC22676k.m65745e(this.title, orderItemDetailsModel.title) && AbstractC22676k.m65745e(this.subtitle, orderItemDetailsModel.subtitle) && AbstractC22676k.m65745e(this.image, orderItemDetailsModel.image) && AbstractC22676k.m65745e(this.stackedImages, orderItemDetailsModel.stackedImages) && AbstractC22676k.m65745e(this.price, orderItemDetailsModel.price) && AbstractC22676k.m65745e(this.strikethroughPrice, orderItemDetailsModel.strikethroughPrice) && AbstractC22676k.m65745e(this.quantity, orderItemDetailsModel.quantity) && AbstractC22676k.m65745e(this.style, orderItemDetailsModel.style);
    }

    public final String getImage() {
        return this.image;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final List<String> getStackedImages() {
        return this.stackedImages;
    }

    public final String getStrikethroughPrice() {
        return this.strikethroughPrice;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.image);
        List<String> list = this.stackedImages;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (list == null ? 0 : list.hashCode())) * 31, 31, this.price);
        String str = this.strikethroughPrice;
        return this.style.hashCode() + AbstractC11266d.m30450d((iM30450d2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.quantity);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.image;
        List<String> list = this.stackedImages;
        String str4 = this.price;
        String str5 = this.strikethroughPrice;
        String str6 = this.quantity;
        String str7 = this.style;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("OrderItemDetailsModel(title=", str, ", subtitle=", str2, ", image=");
        AbstractC36095b.m114694v(str3, ", stackedImages=", ", price=", sbM32001t, list);
        AbstractC11266d.m30444B(sbM32001t, str4, ", strikethroughPrice=", str5, ", quantity=");
        return AbstractC11266d.m30464r(sbM32001t, str6, ", style=", str7, ")");
    }

    public OrderItemDetailsModel(String title, String subtitle, String image, List<String> list, String price, String str, String quantity, String style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(quantity, "quantity");
        AbstractC22676k.m65750j(style, "style");
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
        this.stackedImages = list;
        this.price = price;
        this.strikethroughPrice = str;
        this.quantity = quantity;
        this.style = style;
    }
}
