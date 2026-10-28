package com.whoop.nativestore.pdp.domain.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!JL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010!¨\u00067"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/PackItemModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "packItemId", "packItemProductKey", "imageUrl", "title", "subtitle", "Lcom/whoop/nativestore/pdp/domain/model/PackItemCta;", "cta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/PackItemCta;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/PackItemCta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/pdp/domain/model/PackItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/whoop/nativestore/pdp/domain/model/PackItemCta;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/PackItemCta;)Lcom/whoop/nativestore/pdp/domain/model/PackItemModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPackItemId", "getPackItemProductKey", "getImageUrl", "getTitle", "getSubtitle", "Lcom/whoop/nativestore/pdp/domain/model/PackItemCta;", "getCta", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PackItemModel implements DesignSystemModel {
    private final PackItemCta cta;
    private final String imageUrl;
    private final String packItemId;
    private final String packItemProductKey;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.domain.model.PackItemModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/PackItemModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/pdp/domain/model/PackItemModel;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PackItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PackItemModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (PackItemCta) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PackItemModel copy$default(PackItemModel packItemModel, String str, String str2, String str3, String str4, String str5, PackItemCta packItemCta, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = packItemModel.packItemId;
        }
        if ((i13 & 2) != 0) {
            str2 = packItemModel.packItemProductKey;
        }
        if ((i13 & 4) != 0) {
            str3 = packItemModel.imageUrl;
        }
        if ((i13 & 8) != 0) {
            str4 = packItemModel.title;
        }
        if ((i13 & 16) != 0) {
            str5 = packItemModel.subtitle;
        }
        if ((i13 & 32) != 0) {
            packItemCta = packItemModel.cta;
        }
        String str6 = str5;
        PackItemCta packItemCta2 = packItemCta;
        return packItemModel.copy(str, str2, str3, str4, str6, packItemCta2);
    }

    public static final /* synthetic */ void write$Self$native_store_release(PackItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.packItemId, "")) {
            output.encodeStringElement(serialDesc, 0, self.packItemId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.packItemProductKey, "")) {
            output.encodeStringElement(serialDesc, 1, self.packItemProductKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.imageUrl, "")) {
            output.encodeStringElement(serialDesc, 2, self.imageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 3, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.subtitle, "")) {
            output.encodeStringElement(serialDesc, 4, self.subtitle);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && AbstractC22676k.m65745e(self.cta, new PackItemCta((String) null, (String) null, (C9598e) null, 7, (DefaultConstructorMarker) null))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 5, PackItemCta$$serializer.INSTANCE, self.cta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackItemId() {
        return this.packItemId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPackItemProductKey() {
        return this.packItemProductKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PackItemCta getCta() {
        return this.cta;
    }

    public final PackItemModel copy(String packItemId, String packItemProductKey, String imageUrl, String title, String subtitle, PackItemCta cta) {
        AbstractC22676k.m65750j(packItemId, "packItemId");
        AbstractC22676k.m65750j(packItemProductKey, "packItemProductKey");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(cta, "cta");
        return new PackItemModel(packItemId, packItemProductKey, imageUrl, title, subtitle, cta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PackItemModel)) {
            return false;
        }
        PackItemModel packItemModel = (PackItemModel) other;
        return AbstractC22676k.m65745e(this.packItemId, packItemModel.packItemId) && AbstractC22676k.m65745e(this.packItemProductKey, packItemModel.packItemProductKey) && AbstractC22676k.m65745e(this.imageUrl, packItemModel.imageUrl) && AbstractC22676k.m65745e(this.title, packItemModel.title) && AbstractC22676k.m65745e(this.subtitle, packItemModel.subtitle) && AbstractC22676k.m65745e(this.cta, packItemModel.cta);
    }

    public final PackItemCta getCta() {
        return this.cta;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getPackItemId() {
        return this.packItemId;
    }

    public final String getPackItemProductKey() {
        return this.packItemProductKey;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.cta.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.packItemId.hashCode() * 31, 31, this.packItemProductKey), 31, this.imageUrl), 31, this.title), 31, this.subtitle);
    }

    public String toString() {
        String str = this.packItemId;
        String str2 = this.packItemProductKey;
        String str3 = this.imageUrl;
        String str4 = this.title;
        String str5 = this.subtitle;
        PackItemCta packItemCta = this.cta;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PackItemModel(packItemId=", str, ", packItemProductKey=", str2, ", imageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", title=", str4, ", subtitle=");
        sbM32001t.append(str5);
        sbM32001t.append(", cta=");
        sbM32001t.append(packItemCta);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ PackItemModel(int i13, String str, String str2, String str3, String str4, String str5, PackItemCta packItemCta, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.packItemId = "";
        } else {
            this.packItemId = str;
        }
        if ((i13 & 2) == 0) {
            this.packItemProductKey = "";
        } else {
            this.packItemProductKey = str2;
        }
        if ((i13 & 4) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str3;
        }
        if ((i13 & 8) == 0) {
            this.title = "";
        } else {
            this.title = str4;
        }
        if ((i13 & 16) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str5;
        }
        if ((i13 & 32) == 0) {
            this.cta = new PackItemCta((String) null, (String) null, (C9598e) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.cta = packItemCta;
        }
    }

    public PackItemModel(String packItemId, String packItemProductKey, String imageUrl, String title, String subtitle, PackItemCta cta) {
        AbstractC22676k.m65750j(packItemId, "packItemId");
        AbstractC22676k.m65750j(packItemProductKey, "packItemProductKey");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(cta, "cta");
        this.packItemId = packItemId;
        this.packItemProductKey = packItemProductKey;
        this.imageUrl = imageUrl;
        this.title = title;
        this.subtitle = subtitle;
        this.cta = cta;
    }

    public /* synthetic */ PackItemModel(String str, String str2, String str3, String str4, String str5, PackItemCta packItemCta, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5, (i13 & 32) != 0 ? new PackItemCta((String) null, (String) null, (C9598e) null, 7, (DefaultConstructorMarker) null) : packItemCta);
    }
}
