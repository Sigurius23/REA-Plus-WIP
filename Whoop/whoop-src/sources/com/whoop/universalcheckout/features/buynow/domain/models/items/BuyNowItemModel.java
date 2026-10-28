package com.whoop.universalcheckout.features.buynow.domain.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import u91.C34656a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBg\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ^\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001cR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010\u001c¨\u0006:"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "subtitle", "description", "image", "", "stackedImages", "lineItemId", "analyticsLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getDescription", "getImage", "Ljava/util/List;", "getStackedImages", "getLineItemId", "getAnalyticsLabel", "Companion", "$serializer", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BuyNowItemModel implements DesignSystemModel {
    private final String analyticsLabel;
    private final String description;
    private final String image;
    private final String lineItemId;
    private final List<String> stackedImages;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C34656a(29)), null, null};

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.domain.models.items.BuyNowItemModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BuyNowItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BuyNowItemModel() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuyNowItemModel copy$default(BuyNowItemModel buyNowItemModel, String str, String str2, String str3, String str4, List list, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = buyNowItemModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = buyNowItemModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = buyNowItemModel.description;
        }
        if ((i13 & 8) != 0) {
            str4 = buyNowItemModel.image;
        }
        if ((i13 & 16) != 0) {
            list = buyNowItemModel.stackedImages;
        }
        if ((i13 & 32) != 0) {
            str5 = buyNowItemModel.lineItemId;
        }
        if ((i13 & 64) != 0) {
            str6 = buyNowItemModel.analyticsLabel;
        }
        String str7 = str5;
        String str8 = str6;
        List list2 = list;
        String str9 = str3;
        return buyNowItemModel.copy(str, str2, str9, str4, list2, str7, str8);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(BuyNowItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 0, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.subtitle, "")) {
            output.encodeStringElement(serialDesc, 1, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.description, "")) {
            output.encodeStringElement(serialDesc, 2, self.description);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.image, "")) {
            output.encodeStringElement(serialDesc, 3, self.image);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.stackedImages != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.stackedImages);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.lineItemId, "")) {
            output.encodeStringElement(serialDesc, 5, self.lineItemId);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && AbstractC22676k.m65745e(self.analyticsLabel, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 6, self.analyticsLabel);
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
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final List<String> component5() {
        return this.stackedImages;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLineItemId() {
        return this.lineItemId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAnalyticsLabel() {
        return this.analyticsLabel;
    }

    public final BuyNowItemModel copy(String title, String subtitle, String description, String image, List<String> stackedImages, String lineItemId, String analyticsLabel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(lineItemId, "lineItemId");
        AbstractC22676k.m65750j(analyticsLabel, "analyticsLabel");
        return new BuyNowItemModel(title, subtitle, description, image, stackedImages, lineItemId, analyticsLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyNowItemModel)) {
            return false;
        }
        BuyNowItemModel buyNowItemModel = (BuyNowItemModel) other;
        return AbstractC22676k.m65745e(this.title, buyNowItemModel.title) && AbstractC22676k.m65745e(this.subtitle, buyNowItemModel.subtitle) && AbstractC22676k.m65745e(this.description, buyNowItemModel.description) && AbstractC22676k.m65745e(this.image, buyNowItemModel.image) && AbstractC22676k.m65745e(this.stackedImages, buyNowItemModel.stackedImages) && AbstractC22676k.m65745e(this.lineItemId, buyNowItemModel.lineItemId) && AbstractC22676k.m65745e(this.analyticsLabel, buyNowItemModel.analyticsLabel);
    }

    public final String getAnalyticsLabel() {
        return this.analyticsLabel;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getLineItemId() {
        return this.lineItemId;
    }

    public final List<String> getStackedImages() {
        return this.stackedImages;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.description), 31, this.image);
        List<String> list = this.stackedImages;
        return this.analyticsLabel.hashCode() + AbstractC11266d.m30450d((iM30450d + (list == null ? 0 : list.hashCode())) * 31, 31, this.lineItemId);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.description;
        String str4 = this.image;
        List<String> list = this.stackedImages;
        String str5 = this.lineItemId;
        String str6 = this.analyticsLabel;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BuyNowItemModel(title=", str, ", subtitle=", str2, ", description=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", image=", str4, ", stackedImages=");
        AbstractC17176i.m48511m(", lineItemId=", str5, ", analyticsLabel=", sbM32001t, list);
        return AbstractC25012a.m73376i(str6, ")", sbM32001t);
    }

    public /* synthetic */ BuyNowItemModel(int i13, String str, String str2, String str3, String str4, List list, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i13 & 2) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str2;
        }
        if ((i13 & 4) == 0) {
            this.description = "";
        } else {
            this.description = str3;
        }
        if ((i13 & 8) == 0) {
            this.image = "";
        } else {
            this.image = str4;
        }
        if ((i13 & 16) == 0) {
            this.stackedImages = null;
        } else {
            this.stackedImages = list;
        }
        if ((i13 & 32) == 0) {
            this.lineItemId = "";
        } else {
            this.lineItemId = str5;
        }
        if ((i13 & 64) == 0) {
            this.analyticsLabel = "";
        } else {
            this.analyticsLabel = str6;
        }
    }

    public BuyNowItemModel(String title, String subtitle, String description, String image, List<String> list, String lineItemId, String analyticsLabel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(lineItemId, "lineItemId");
        AbstractC22676k.m65750j(analyticsLabel, "analyticsLabel");
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.image = image;
        this.stackedImages = list;
        this.lineItemId = lineItemId;
        this.analyticsLabel = analyticsLabel;
    }

    public /* synthetic */ BuyNowItemModel(String str, String str2, String str3, String str4, List list, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? null : list, (i13 & 32) != 0 ? "" : str5, (i13 & 64) != 0 ? "" : str6);
    }
}
