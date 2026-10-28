package com.whoop.nativestore.home.domain.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import rx0.C31901f;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ^\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b8\u0010\u001c¨\u0006<"}, m65681d2 = {"Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "subCopy", "ctaText", "backgroundMedia", "Lcom/whoop/navigation/e;", "destination", "", "index", "analyticsValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/navigation/e;", "component6", "()Ljava/lang/Integer;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;)Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubCopy", "getCtaText", "getBackgroundMedia", "Lcom/whoop/navigation/e;", "getDestination", "Ljava/lang/Integer;", "getIndex", "getAnalyticsValue", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShopBannerModel implements DesignSystemModel {
    private final String analyticsValue;
    private final String backgroundMedia;
    private final String ctaText;
    private final C9598e destination;
    private final Integer index;
    private final String subCopy;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31901f(11)), null, null};

    /* JADX INFO: renamed from: com.whoop.nativestore.home.domain.model.ShopBannerModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/home/domain/model/ShopBannerModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShopBannerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShopBannerModel(int i13, String str, String str2, String str3, String str4, C9598e c9598e, Integer num, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, ShopBannerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        if ((i13 & 2) == 0) {
            this.subCopy = "";
        } else {
            this.subCopy = str2;
        }
        if ((i13 & 4) == 0) {
            this.ctaText = "";
        } else {
            this.ctaText = str3;
        }
        if ((i13 & 8) == 0) {
            this.backgroundMedia = null;
        } else {
            this.backgroundMedia = str4;
        }
        if ((i13 & 16) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & 32) == 0) {
            this.index = null;
        } else {
            this.index = num;
        }
        if ((i13 & 64) == 0) {
            this.analyticsValue = null;
        } else {
            this.analyticsValue = str5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ShopBannerModel copy$default(ShopBannerModel shopBannerModel, String str, String str2, String str3, String str4, C9598e c9598e, Integer num, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shopBannerModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = shopBannerModel.subCopy;
        }
        if ((i13 & 4) != 0) {
            str3 = shopBannerModel.ctaText;
        }
        if ((i13 & 8) != 0) {
            str4 = shopBannerModel.backgroundMedia;
        }
        if ((i13 & 16) != 0) {
            c9598e = shopBannerModel.destination;
        }
        if ((i13 & 32) != 0) {
            num = shopBannerModel.index;
        }
        if ((i13 & 64) != 0) {
            str5 = shopBannerModel.analyticsValue;
        }
        Integer num2 = num;
        String str6 = str5;
        C9598e c9598e2 = c9598e;
        String str7 = str3;
        return shopBannerModel.copy(str, str2, str7, str4, c9598e2, num2, str6);
    }

    public static final /* synthetic */ void write$Self$native_store_release(ShopBannerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.subCopy, "")) {
            output.encodeStringElement(serialDesc, 1, self.subCopy);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.ctaText, "")) {
            output.encodeStringElement(serialDesc, 2, self.ctaText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.backgroundMedia != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.backgroundMedia);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.destination);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.index != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, IntSerializer.INSTANCE, self.index);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.analyticsValue == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.analyticsValue);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubCopy() {
        return this.subCopy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBackgroundMedia() {
        return this.backgroundMedia;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    public final ShopBannerModel copy(String title, String subCopy, String ctaText, String backgroundMedia, C9598e destination, Integer index, String analyticsValue) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subCopy, "subCopy");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        return new ShopBannerModel(title, subCopy, ctaText, backgroundMedia, destination, index, analyticsValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopBannerModel)) {
            return false;
        }
        ShopBannerModel shopBannerModel = (ShopBannerModel) other;
        return AbstractC22676k.m65745e(this.title, shopBannerModel.title) && AbstractC22676k.m65745e(this.subCopy, shopBannerModel.subCopy) && AbstractC22676k.m65745e(this.ctaText, shopBannerModel.ctaText) && AbstractC22676k.m65745e(this.backgroundMedia, shopBannerModel.backgroundMedia) && AbstractC22676k.m65745e(this.destination, shopBannerModel.destination) && AbstractC22676k.m65745e(this.index, shopBannerModel.index) && AbstractC22676k.m65745e(this.analyticsValue, shopBannerModel.analyticsValue);
    }

    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    public final String getBackgroundMedia() {
        return this.backgroundMedia;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final String getSubCopy() {
        return this.subCopy;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subCopy), 31, this.ctaText);
        String str = this.backgroundMedia;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        Integer num = this.index;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.analyticsValue;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subCopy;
        String str3 = this.ctaText;
        String str4 = this.backgroundMedia;
        C9598e c9598e = this.destination;
        Integer num = this.index;
        String str5 = this.analyticsValue;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShopBannerModel(title=", str, ", subCopy=", str2, ", ctaText=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", backgroundMedia=", str4, ", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", index=");
        sbM32001t.append(num);
        sbM32001t.append(", analyticsValue=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public ShopBannerModel(String title, String subCopy, String ctaText, String str, C9598e c9598e, Integer num, String str2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subCopy, "subCopy");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        this.title = title;
        this.subCopy = subCopy;
        this.ctaText = ctaText;
        this.backgroundMedia = str;
        this.destination = c9598e;
        this.index = num;
        this.analyticsValue = str2;
    }

    public /* synthetic */ ShopBannerModel(String str, String str2, String str3, String str4, C9598e c9598e, Integer num, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : c9598e, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? null : str5);
    }
}
