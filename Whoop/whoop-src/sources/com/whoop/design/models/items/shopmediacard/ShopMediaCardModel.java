package com.whoop.design.models.items.shopmediacard;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.design.models.ContentType;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import cu2.C11132l;
import gz0.EnumC16313m0;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import s31.EnumC32107d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bu\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&Jv\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b>\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b?\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b@\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010$R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010&¨\u0006K"}, m65681d2 = {"Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "description", "Lcom/whoop/design/models/ContentType;", "contentType", "contentUrl", "ctaText", "Lgz0/m0;", "ctaIcon", "Lcom/whoop/navigation/models/GenericInteraction;", "ctaInteraction", "Lcom/whoop/design/models/items/TagModel;", "tag", "Ls31/d;", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TagModel;Ls31/d;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TagModel;Ls31/d;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/ContentType;", "component4", "component5", "component6", "()Lgz0/m0;", "component7", "()Lcom/whoop/navigation/models/GenericInteraction;", "component8", "()Lcom/whoop/design/models/items/TagModel;", "component9", "()Ls31/d;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TagModel;Ls31/d;)Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/whoop/design/models/ContentType;", "getContentType", "getContentUrl", "getCtaText", "Lgz0/m0;", "getCtaIcon", "Lcom/whoop/navigation/models/GenericInteraction;", "getCtaInteraction", "Lcom/whoop/design/models/items/TagModel;", "getTag", "Ls31/d;", "getSize", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShopMediaCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final ContentType contentType;
    private final String contentUrl;
    private final EnumC16313m0 ctaIcon;
    private final GenericInteraction ctaInteraction;
    private final String ctaText;
    private final String description;
    private final EnumC32107d size;
    private final TagModel tag;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShopMediaCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C11132l(27)), null, null, AbstractC30060g.m92087G(enumC23463i, new C11132l(28)), null, null, AbstractC30060g.m92087G(enumC23463i, new C11132l(29))};
    }

    public /* synthetic */ ShopMediaCardModel(int i13, String str, String str2, ContentType contentType, String str3, String str4, EnumC16313m0 enumC16313m0, GenericInteraction genericInteraction, TagModel tagModel, EnumC32107d enumC32107d, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, ShopMediaCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.description = str2;
        this.contentType = contentType;
        this.contentUrl = str3;
        this.ctaText = str4;
        this.ctaIcon = enumC16313m0;
        this.ctaInteraction = genericInteraction;
        this.tag = tagModel;
        this.size = enumC32107d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return ContentType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.molecule.shopmediacard.ShopMediaCardSize", EnumC32107d.values());
    }

    public static /* synthetic */ ShopMediaCardModel copy$default(ShopMediaCardModel shopMediaCardModel, String str, String str2, ContentType contentType, String str3, String str4, EnumC16313m0 enumC16313m0, GenericInteraction genericInteraction, TagModel tagModel, EnumC32107d enumC32107d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shopMediaCardModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = shopMediaCardModel.description;
        }
        if ((i13 & 4) != 0) {
            contentType = shopMediaCardModel.contentType;
        }
        if ((i13 & 8) != 0) {
            str3 = shopMediaCardModel.contentUrl;
        }
        if ((i13 & 16) != 0) {
            str4 = shopMediaCardModel.ctaText;
        }
        if ((i13 & 32) != 0) {
            enumC16313m0 = shopMediaCardModel.ctaIcon;
        }
        if ((i13 & 64) != 0) {
            genericInteraction = shopMediaCardModel.ctaInteraction;
        }
        if ((i13 & 128) != 0) {
            tagModel = shopMediaCardModel.tag;
        }
        if ((i13 & 256) != 0) {
            enumC32107d = shopMediaCardModel.size;
        }
        TagModel tagModel2 = tagModel;
        EnumC32107d enumC32107d2 = enumC32107d;
        EnumC16313m0 enumC16313m1 = enumC16313m0;
        GenericInteraction genericInteraction2 = genericInteraction;
        String str5 = str4;
        ContentType contentType2 = contentType;
        return shopMediaCardModel.copy(str, str2, contentType2, str3, str5, enumC16313m1, genericInteraction2, tagModel2, enumC32107d2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ShopMediaCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.description);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.contentType);
        output.encodeStringElement(serialDesc, 3, self.contentUrl);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.ctaText);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.ctaIcon);
        output.encodeNullableSerializableElement(serialDesc, 6, GenericInteraction$$serializer.INSTANCE, self.ctaInteraction);
        output.encodeNullableSerializableElement(serialDesc, 7, TagModel$$serializer.INSTANCE, self.tag);
        output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.size);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ContentType getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContentUrl() {
        return this.contentUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EnumC16313m0 getCtaIcon() {
        return this.ctaIcon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GenericInteraction getCtaInteraction() {
        return this.ctaInteraction;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TagModel getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final EnumC32107d getSize() {
        return this.size;
    }

    public final ShopMediaCardModel copy(String title, String description, ContentType contentType, String contentUrl, String ctaText, EnumC16313m0 ctaIcon, GenericInteraction ctaInteraction, TagModel tag, EnumC32107d size) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(contentUrl, "contentUrl");
        AbstractC22676k.m65750j(size, "size");
        return new ShopMediaCardModel(title, description, contentType, contentUrl, ctaText, ctaIcon, ctaInteraction, tag, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopMediaCardModel)) {
            return false;
        }
        ShopMediaCardModel shopMediaCardModel = (ShopMediaCardModel) other;
        return AbstractC22676k.m65745e(this.title, shopMediaCardModel.title) && AbstractC22676k.m65745e(this.description, shopMediaCardModel.description) && this.contentType == shopMediaCardModel.contentType && AbstractC22676k.m65745e(this.contentUrl, shopMediaCardModel.contentUrl) && AbstractC22676k.m65745e(this.ctaText, shopMediaCardModel.ctaText) && this.ctaIcon == shopMediaCardModel.ctaIcon && AbstractC22676k.m65745e(this.ctaInteraction, shopMediaCardModel.ctaInteraction) && AbstractC22676k.m65745e(this.tag, shopMediaCardModel.tag) && this.size == shopMediaCardModel.size;
    }

    public final ContentType getContentType() {
        return this.contentType;
    }

    public final String getContentUrl() {
        return this.contentUrl;
    }

    public final EnumC16313m0 getCtaIcon() {
        return this.ctaIcon;
    }

    public final GenericInteraction getCtaInteraction() {
        return this.ctaInteraction;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final EnumC32107d getSize() {
        return this.size;
    }

    public final TagModel getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ContentType contentType = this.contentType;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (contentType == null ? 0 : contentType.hashCode())) * 31, 31, this.contentUrl);
        String str2 = this.ctaText;
        int iHashCode3 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.ctaIcon;
        int iHashCode4 = (iHashCode3 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        GenericInteraction genericInteraction = this.ctaInteraction;
        int iHashCode5 = (iHashCode4 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        TagModel tagModel = this.tag;
        return this.size.hashCode() + ((iHashCode5 + (tagModel != null ? tagModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        ContentType contentType = this.contentType;
        String str3 = this.contentUrl;
        String str4 = this.ctaText;
        EnumC16313m0 enumC16313m0 = this.ctaIcon;
        GenericInteraction genericInteraction = this.ctaInteraction;
        TagModel tagModel = this.tag;
        EnumC32107d enumC32107d = this.size;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShopMediaCardModel(title=", str, ", description=", str2, ", contentType=");
        sbM32001t.append(contentType);
        sbM32001t.append(", contentUrl=");
        sbM32001t.append(str3);
        sbM32001t.append(", ctaText=");
        sbM32001t.append(str4);
        sbM32001t.append(", ctaIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", ctaInteraction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(", tag=");
        sbM32001t.append(tagModel);
        sbM32001t.append(", size=");
        sbM32001t.append(enumC32107d);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ShopMediaCardModel(String title, String str, ContentType contentType, String contentUrl, String str2, EnumC16313m0 enumC16313m0, GenericInteraction genericInteraction, TagModel tagModel, EnumC32107d size) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(contentUrl, "contentUrl");
        AbstractC22676k.m65750j(size, "size");
        this.title = title;
        this.description = str;
        this.contentType = contentType;
        this.contentUrl = contentUrl;
        this.ctaText = str2;
        this.ctaIcon = enumC16313m0;
        this.ctaInteraction = genericInteraction;
        this.tag = tagModel;
        this.size = size;
    }
}
