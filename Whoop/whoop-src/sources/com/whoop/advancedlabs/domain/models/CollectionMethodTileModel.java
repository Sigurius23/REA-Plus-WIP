package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import tb0.C33690a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB[\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JZ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010%¨\u0006;"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/CollectionMethodTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "subtitle", "Ly81/f;", "subtitleTextColor", "priceLabel", "", "enabled", "", "additionalItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ly81/f;Ljava/lang/String;ZLjava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ly81/f;Ljava/lang/String;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/CollectionMethodTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ly81/f;", "component4", "component5", "()Z", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ly81/f;Ljava/lang/String;ZLjava/util/List;)Lcom/whoop/advancedlabs/domain/models/CollectionMethodTileModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ly81/f;", "getSubtitleTextColor", "getPriceLabel", "Z", "getEnabled", "Ljava/util/List;", "getAdditionalItems", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CollectionMethodTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<DesignSystemModel> additionalItems;
    private final boolean enabled;
    private final String priceLabel;
    private final String subtitle;
    private final EnumC39333f subtitleTextColor;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/CollectionMethodTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/CollectionMethodTileModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CollectionMethodTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C33690a(0)), null, null, AbstractC30060g.m92087G(enumC23463i, new C33690a(1))};
    }

    public /* synthetic */ CollectionMethodTileModel(int i13, String str, String str2, EnumC39333f enumC39333f, String str3, boolean z4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, CollectionMethodTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.subtitleTextColor = enumC39333f;
        this.priceLabel = str3;
        this.enabled = z4;
        this.additionalItems = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollectionMethodTileModel copy$default(CollectionMethodTileModel collectionMethodTileModel, String str, String str2, EnumC39333f enumC39333f, String str3, boolean z4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = collectionMethodTileModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = collectionMethodTileModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            enumC39333f = collectionMethodTileModel.subtitleTextColor;
        }
        if ((i13 & 8) != 0) {
            str3 = collectionMethodTileModel.priceLabel;
        }
        if ((i13 & 16) != 0) {
            z4 = collectionMethodTileModel.enabled;
        }
        if ((i13 & 32) != 0) {
            list = collectionMethodTileModel.additionalItems;
        }
        boolean z13 = z4;
        List list2 = list;
        return collectionMethodTileModel.copy(str, str2, enumC39333f, str3, z13, list2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(CollectionMethodTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.subtitleTextColor);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.priceLabel);
        output.encodeBooleanElement(serialDesc, 4, self.enabled);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.additionalItems);
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
    public final EnumC39333f getSubtitleTextColor() {
        return this.subtitleTextColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPriceLabel() {
        return this.priceLabel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<DesignSystemModel> component6() {
        return this.additionalItems;
    }

    public final CollectionMethodTileModel copy(String title, String subtitle, EnumC39333f subtitleTextColor, String priceLabel, boolean enabled, List<? extends DesignSystemModel> additionalItems) {
        AbstractC22676k.m65750j(title, "title");
        return new CollectionMethodTileModel(title, subtitle, subtitleTextColor, priceLabel, enabled, additionalItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectionMethodTileModel)) {
            return false;
        }
        CollectionMethodTileModel collectionMethodTileModel = (CollectionMethodTileModel) other;
        return AbstractC22676k.m65745e(this.title, collectionMethodTileModel.title) && AbstractC22676k.m65745e(this.subtitle, collectionMethodTileModel.subtitle) && this.subtitleTextColor == collectionMethodTileModel.subtitleTextColor && AbstractC22676k.m65745e(this.priceLabel, collectionMethodTileModel.priceLabel) && this.enabled == collectionMethodTileModel.enabled && AbstractC22676k.m65745e(this.additionalItems, collectionMethodTileModel.additionalItems);
    }

    public final List<DesignSystemModel> getAdditionalItems() {
        return this.additionalItems;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getPriceLabel() {
        return this.priceLabel;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final EnumC39333f getSubtitleTextColor() {
        return this.subtitleTextColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnumC39333f enumC39333f = this.subtitleTextColor;
        int iHashCode3 = (iHashCode2 + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        String str2 = this.priceLabel;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.enabled);
        List<DesignSystemModel> list = this.additionalItems;
        return iM8289b + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        EnumC39333f enumC39333f = this.subtitleTextColor;
        String str3 = this.priceLabel;
        boolean z4 = this.enabled;
        List<DesignSystemModel> list = this.additionalItems;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CollectionMethodTileModel(title=", str, ", subtitle=", str2, ", subtitleTextColor=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(", priceLabel=");
        sbM32001t.append(str3);
        sbM32001t.append(", enabled=");
        sbM32001t.append(z4);
        sbM32001t.append(", additionalItems=");
        sbM32001t.append(list);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionMethodTileModel(String title, String str, EnumC39333f enumC39333f, String str2, boolean z4, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.subtitle = str;
        this.subtitleTextColor = enumC39333f;
        this.priceLabel = str2;
        this.enabled = z4;
        this.additionalItems = list;
    }
}
