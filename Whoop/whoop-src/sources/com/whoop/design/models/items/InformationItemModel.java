package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import jh3.AbstractC21702c;
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
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import w91.C36959f;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00062"}, m65681d2 = {"Lcom/whoop/design/models/items/InformationItemModel;", "", "", "title", "description", "style", "icon", "Ly81/f;", "descriptionColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/InformationItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ly81/f;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;)Lcom/whoop/design/models/items/InformationItemModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "getStyle", "getIcon", "Ly81/f;", "getDescriptionColor", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class InformationItemModel {
    public static final int $stable = 0;
    private final String description;
    private final EnumC39333f descriptionColor;
    private final String icon;
    private final String style;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36959f(18))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/InformationItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/InformationItemModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return InformationItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ InformationItemModel(int i13, String str, String str2, String str3, String str4, EnumC39333f enumC39333f, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, InformationItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.description = str2;
        this.style = str3;
        this.icon = str4;
        if ((i13 & 16) == 0) {
            this.descriptionColor = null;
        } else {
            this.descriptionColor = enumC39333f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    public static /* synthetic */ InformationItemModel copy$default(InformationItemModel informationItemModel, String str, String str2, String str3, String str4, EnumC39333f enumC39333f, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = informationItemModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = informationItemModel.description;
        }
        if ((i13 & 4) != 0) {
            str3 = informationItemModel.style;
        }
        if ((i13 & 8) != 0) {
            str4 = informationItemModel.icon;
        }
        if ((i13 & 16) != 0) {
            enumC39333f = informationItemModel.descriptionColor;
        }
        EnumC39333f enumC39333f2 = enumC39333f;
        String str5 = str3;
        return informationItemModel.copy(str, str2, str5, str4, enumC39333f2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(InformationItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.description);
        output.encodeStringElement(serialDesc, 2, self.style);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.icon);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.descriptionColor == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.descriptionColor);
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
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC39333f getDescriptionColor() {
        return this.descriptionColor;
    }

    public final InformationItemModel copy(String title, String description, String style, String icon, EnumC39333f descriptionColor) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(style, "style");
        return new InformationItemModel(title, description, style, icon, descriptionColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InformationItemModel)) {
            return false;
        }
        InformationItemModel informationItemModel = (InformationItemModel) other;
        return AbstractC22676k.m65745e(this.title, informationItemModel.title) && AbstractC22676k.m65745e(this.description, informationItemModel.description) && AbstractC22676k.m65745e(this.style, informationItemModel.style) && AbstractC22676k.m65745e(this.icon, informationItemModel.icon) && this.descriptionColor == informationItemModel.descriptionColor;
    }

    public final String getDescription() {
        return this.description;
    }

    public final EnumC39333f getDescriptionColor() {
        return this.descriptionColor;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description), 31, this.style);
        String str = this.icon;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        EnumC39333f enumC39333f = this.descriptionColor;
        return iHashCode + (enumC39333f != null ? enumC39333f.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.style;
        String str4 = this.icon;
        EnumC39333f enumC39333f = this.descriptionColor;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("InformationItemModel(title=", str, ", description=", str2, ", style=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", icon=", str4, ", descriptionColor=");
        return AbstractC21702c.m61138i(sbM32001t, enumC39333f, ")");
    }

    public InformationItemModel(String title, String description, String style, String str, EnumC39333f enumC39333f) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(style, "style");
        this.title = title;
        this.description = description;
        this.style = style;
        this.icon = str;
        this.descriptionColor = enumC39333f;
    }

    public /* synthetic */ InformationItemModel(String str, String str2, String str3, String str4, EnumC39333f enumC39333f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i13 & 16) != 0 ? null : enumC39333f);
    }
}
