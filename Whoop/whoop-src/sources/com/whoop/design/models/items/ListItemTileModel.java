package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJN\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u001a¨\u00063"}, m65681d2 = {"Lcom/whoop/design/models/items/ListItemTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "tileType", "tileImageUrl", "tileTitle", "subText", "ctaUrl", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ListItemTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/ListItemTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTileType", "getTileImageUrl", "getTileTitle", "getSubText", "getCtaUrl", "getName", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ListItemTileModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String ctaUrl;
    private final String name;
    private final String subText;
    private final String tileImageUrl;
    private final String tileTitle;
    private final String tileType;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ListItemTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ListItemTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ListItemTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ListItemTileModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ListItemTileModel copy$default(ListItemTileModel listItemTileModel, String str, String str2, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = listItemTileModel.tileType;
        }
        if ((i13 & 2) != 0) {
            str2 = listItemTileModel.tileImageUrl;
        }
        if ((i13 & 4) != 0) {
            str3 = listItemTileModel.tileTitle;
        }
        if ((i13 & 8) != 0) {
            str4 = listItemTileModel.subText;
        }
        if ((i13 & 16) != 0) {
            str5 = listItemTileModel.ctaUrl;
        }
        if ((i13 & 32) != 0) {
            str6 = listItemTileModel.name;
        }
        String str7 = str5;
        String str8 = str6;
        return listItemTileModel.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ListItemTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.tileType, "")) {
            output.encodeStringElement(serialDesc, 0, self.tileType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.tileImageUrl, "")) {
            output.encodeStringElement(serialDesc, 1, self.tileImageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.tileTitle, "")) {
            output.encodeStringElement(serialDesc, 2, self.tileTitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.subText != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.subText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.ctaUrl, "")) {
            output.encodeStringElement(serialDesc, 4, self.ctaUrl);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && AbstractC22676k.m65745e(self.name, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 5, self.name);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTileType() {
        return this.tileType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTileImageUrl() {
        return this.tileImageUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTileTitle() {
        return this.tileTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubText() {
        return this.subText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final ListItemTileModel copy(String tileType, String tileImageUrl, String tileTitle, String subText, String ctaUrl, String name) {
        AbstractC22676k.m65750j(tileType, "tileType");
        AbstractC22676k.m65750j(tileImageUrl, "tileImageUrl");
        AbstractC22676k.m65750j(tileTitle, "tileTitle");
        AbstractC22676k.m65750j(ctaUrl, "ctaUrl");
        AbstractC22676k.m65750j(name, "name");
        return new ListItemTileModel(tileType, tileImageUrl, tileTitle, subText, ctaUrl, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListItemTileModel)) {
            return false;
        }
        ListItemTileModel listItemTileModel = (ListItemTileModel) other;
        return AbstractC22676k.m65745e(this.tileType, listItemTileModel.tileType) && AbstractC22676k.m65745e(this.tileImageUrl, listItemTileModel.tileImageUrl) && AbstractC22676k.m65745e(this.tileTitle, listItemTileModel.tileTitle) && AbstractC22676k.m65745e(this.subText, listItemTileModel.subText) && AbstractC22676k.m65745e(this.ctaUrl, listItemTileModel.ctaUrl) && AbstractC22676k.m65745e(this.name, listItemTileModel.name);
    }

    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSubText() {
        return this.subText;
    }

    public final String getTileImageUrl() {
        return this.tileImageUrl;
    }

    public final String getTileTitle() {
        return this.tileTitle;
    }

    public final String getTileType() {
        return this.tileType;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.tileType.hashCode() * 31, 31, this.tileImageUrl), 31, this.tileTitle);
        String str = this.subText;
        return this.name.hashCode() + AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.ctaUrl);
    }

    public String toString() {
        String str = this.tileType;
        String str2 = this.tileImageUrl;
        String str3 = this.tileTitle;
        String str4 = this.subText;
        String str5 = this.ctaUrl;
        String str6 = this.name;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ListItemTileModel(tileType=", str, ", tileImageUrl=", str2, ", tileTitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", subText=", str4, ", ctaUrl=");
        return AbstractC11266d.m30464r(sbM32001t, str5, ", name=", str6, ")");
    }

    public /* synthetic */ ListItemTileModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.tileType = "";
        } else {
            this.tileType = str;
        }
        if ((i13 & 2) == 0) {
            this.tileImageUrl = "";
        } else {
            this.tileImageUrl = str2;
        }
        if ((i13 & 4) == 0) {
            this.tileTitle = "";
        } else {
            this.tileTitle = str3;
        }
        if ((i13 & 8) == 0) {
            this.subText = null;
        } else {
            this.subText = str4;
        }
        if ((i13 & 16) == 0) {
            this.ctaUrl = "";
        } else {
            this.ctaUrl = str5;
        }
        if ((i13 & 32) == 0) {
            this.name = "";
        } else {
            this.name = str6;
        }
    }

    public ListItemTileModel(String tileType, String tileImageUrl, String tileTitle, String str, String ctaUrl, String name) {
        AbstractC22676k.m65750j(tileType, "tileType");
        AbstractC22676k.m65750j(tileImageUrl, "tileImageUrl");
        AbstractC22676k.m65750j(tileTitle, "tileTitle");
        AbstractC22676k.m65750j(ctaUrl, "ctaUrl");
        AbstractC22676k.m65750j(name, "name");
        this.tileType = tileType;
        this.tileImageUrl = tileImageUrl;
        this.tileTitle = tileTitle;
        this.subText = str;
        this.ctaUrl = ctaUrl;
        this.name = name;
    }

    public /* synthetic */ ListItemTileModel(String str, String str2, String str3, String str4, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? "" : str5, (i13 & 32) != 0 ? "" : str6);
    }
}
