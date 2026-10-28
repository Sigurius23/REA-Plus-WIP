package com.whoop.design.models.cards;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.Spacing;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
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
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBe\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'Jd\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'¨\u0006>"}, m65681d2 = {"Lcom/whoop/design/models/cards/HeroImageCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "imageUrl", "title", "subtitle", "", "items", "", "transparentBackground", "Lcom/whoop/design/models/items/Spacing;", "contentSpacing", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLcom/whoop/design/models/items/Spacing;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLcom/whoop/design/models/items/Spacing;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/HeroImageCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Z", "component7", "()Lcom/whoop/design/models/items/Spacing;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLcom/whoop/design/models/items/Spacing;)Lcom/whoop/design/models/cards/HeroImageCardModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getImageUrl", "getTitle", "getSubtitle", "Ljava/util/List;", "getItems", "Z", "getTransparentBackground", "Lcom/whoop/design/models/items/Spacing;", "getContentSpacing", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HeroImageCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final Spacing contentSpacing;
    private final String id;
    private final String imageUrl;
    private final List<DesignSystemModel> items;
    private final String subtitle;
    private final String title;
    private final boolean transparentBackground;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/HeroImageCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/HeroImageCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HeroImageCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C33538a(18)), null, AbstractC30060g.m92087G(enumC23463i, new C33538a(19))};
    }

    public /* synthetic */ HeroImageCardModel(int i13, String str, String str2, String str3, String str4, List list, boolean z4, Spacing spacing, SerializationConstructorMarker serializationConstructorMarker) {
        if (18 != (i13 & 18)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 18, HeroImageCardModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.imageUrl = str2;
        if ((i13 & 4) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i13 & 8) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str4;
        }
        this.items = list;
        if ((i13 & 32) == 0) {
            this.transparentBackground = false;
        } else {
            this.transparentBackground = z4;
        }
        if ((i13 & 64) == 0) {
            this.contentSpacing = null;
        } else {
            this.contentSpacing = spacing;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return Spacing.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeroImageCardModel copy$default(HeroImageCardModel heroImageCardModel, String str, String str2, String str3, String str4, List list, boolean z4, Spacing spacing, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = heroImageCardModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = heroImageCardModel.imageUrl;
        }
        if ((i13 & 4) != 0) {
            str3 = heroImageCardModel.title;
        }
        if ((i13 & 8) != 0) {
            str4 = heroImageCardModel.subtitle;
        }
        if ((i13 & 16) != 0) {
            list = heroImageCardModel.items;
        }
        if ((i13 & 32) != 0) {
            z4 = heroImageCardModel.transparentBackground;
        }
        if ((i13 & 64) != 0) {
            spacing = heroImageCardModel.contentSpacing;
        }
        boolean z13 = z4;
        Spacing spacing2 = spacing;
        List list2 = list;
        String str5 = str3;
        return heroImageCardModel.copy(str, str2, str5, str4, list2, z13, spacing2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(HeroImageCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        output.encodeStringElement(serialDesc, 1, self.imageUrl);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.subtitle);
        }
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.items);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.transparentBackground) {
            output.encodeBooleanElement(serialDesc, 5, self.transparentBackground);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.contentSpacing == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.contentSpacing);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<DesignSystemModel> component5() {
        return this.items;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getTransparentBackground() {
        return this.transparentBackground;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Spacing getContentSpacing() {
        return this.contentSpacing;
    }

    public final HeroImageCardModel copy(String id4, String imageUrl, String title, String subtitle, List<? extends DesignSystemModel> items, boolean transparentBackground, Spacing contentSpacing) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(items, "items");
        return new HeroImageCardModel(id4, imageUrl, title, subtitle, items, transparentBackground, contentSpacing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeroImageCardModel)) {
            return false;
        }
        HeroImageCardModel heroImageCardModel = (HeroImageCardModel) other;
        return AbstractC22676k.m65745e(this.id, heroImageCardModel.id) && AbstractC22676k.m65745e(this.imageUrl, heroImageCardModel.imageUrl) && AbstractC22676k.m65745e(this.title, heroImageCardModel.title) && AbstractC22676k.m65745e(this.subtitle, heroImageCardModel.subtitle) && AbstractC22676k.m65745e(this.items, heroImageCardModel.items) && this.transparentBackground == heroImageCardModel.transparentBackground && this.contentSpacing == heroImageCardModel.contentSpacing;
    }

    public final Spacing getContentSpacing() {
        return this.contentSpacing;
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

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getTransparentBackground() {
        return this.transparentBackground;
    }

    public int hashCode() {
        String str = this.id;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.imageUrl);
        String str2 = this.title;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.items), 31, this.transparentBackground);
        Spacing spacing = this.contentSpacing;
        return iM8289b + (spacing != null ? spacing.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.imageUrl;
        String str3 = this.title;
        String str4 = this.subtitle;
        List<DesignSystemModel> list = this.items;
        boolean z4 = this.transparentBackground;
        Spacing spacing = this.contentSpacing;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HeroImageCardModel(id=", str, ", imageUrl=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", subtitle=", str4, ", items=");
        AbstractC26725a.m79512p(", transparentBackground=", ", contentSpacing=", sbM32001t, list, z4);
        sbM32001t.append(spacing);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeroImageCardModel(String str, String imageUrl, String str2, String str3, List<? extends DesignSystemModel> items, boolean z4, Spacing spacing) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(items, "items");
        this.id = str;
        this.imageUrl = imageUrl;
        this.title = str2;
        this.subtitle = str3;
        this.items = items;
        this.transparentBackground = z4;
        this.contentSpacing = spacing;
    }

    public /* synthetic */ HeroImageCardModel(String str, String str2, String str3, String str4, List list, boolean z4, Spacing spacing, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, list, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? null : spacing);
    }
}
