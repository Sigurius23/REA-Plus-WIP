package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
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
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!JD\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010!¨\u00066"}, m65681d2 = {"Lcom/whoop/design/models/items/UpsellCardCalloutModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "description", "imageUrl", "tierImage", "Lcom/whoop/design/models/InfoCalloutTileModel;", "callout", "Lcom/whoop/design/models/items/CardButtonModel;", "cardButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/UpsellCardCalloutModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "component5", "()Lcom/whoop/design/models/items/CardButtonModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/design/models/items/UpsellCardCalloutModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "getImageUrl", "getTierImage", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getCallout", "Lcom/whoop/design/models/items/CardButtonModel;", "getCardButton", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UpsellCardCalloutModel implements DesignSystemModel {
    private final InfoCalloutTileModel callout;
    private final CardButtonModel cardButton;
    private final String description;
    private final String imageUrl;
    private final String tierImage;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/UpsellCardCalloutModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/UpsellCardCalloutModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UpsellCardCalloutModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UpsellCardCalloutModel(int i13, String str, String str2, String str3, InfoCalloutTileModel infoCalloutTileModel, CardButtonModel cardButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, UpsellCardCalloutModel$$serializer.INSTANCE.getDescriptor());
        }
        this.description = str;
        this.imageUrl = str2;
        this.tierImage = str3;
        this.callout = infoCalloutTileModel;
        this.cardButton = cardButtonModel;
    }

    public static /* synthetic */ UpsellCardCalloutModel copy$default(UpsellCardCalloutModel upsellCardCalloutModel, String str, String str2, String str3, InfoCalloutTileModel infoCalloutTileModel, CardButtonModel cardButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = upsellCardCalloutModel.description;
        }
        if ((i13 & 2) != 0) {
            str2 = upsellCardCalloutModel.imageUrl;
        }
        if ((i13 & 4) != 0) {
            str3 = upsellCardCalloutModel.tierImage;
        }
        if ((i13 & 8) != 0) {
            infoCalloutTileModel = upsellCardCalloutModel.callout;
        }
        if ((i13 & 16) != 0) {
            cardButtonModel = upsellCardCalloutModel.cardButton;
        }
        CardButtonModel cardButtonModel2 = cardButtonModel;
        String str4 = str3;
        return upsellCardCalloutModel.copy(str, str2, str4, infoCalloutTileModel, cardButtonModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(UpsellCardCalloutModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.description);
        output.encodeStringElement(serialDesc, 1, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.tierImage);
        output.encodeSerializableElement(serialDesc, 3, InfoCalloutTileModel$$serializer.INSTANCE, self.callout);
        output.encodeSerializableElement(serialDesc, 4, CardButtonModel$$serializer.INSTANCE, self.cardButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTierImage() {
        return this.tierImage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final InfoCalloutTileModel getCallout() {
        return this.callout;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CardButtonModel getCardButton() {
        return this.cardButton;
    }

    public final UpsellCardCalloutModel copy(String description, String imageUrl, String tierImage, InfoCalloutTileModel callout, CardButtonModel cardButton) {
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(callout, "callout");
        AbstractC22676k.m65750j(cardButton, "cardButton");
        return new UpsellCardCalloutModel(description, imageUrl, tierImage, callout, cardButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpsellCardCalloutModel)) {
            return false;
        }
        UpsellCardCalloutModel upsellCardCalloutModel = (UpsellCardCalloutModel) other;
        return AbstractC22676k.m65745e(this.description, upsellCardCalloutModel.description) && AbstractC22676k.m65745e(this.imageUrl, upsellCardCalloutModel.imageUrl) && AbstractC22676k.m65745e(this.tierImage, upsellCardCalloutModel.tierImage) && AbstractC22676k.m65745e(this.callout, upsellCardCalloutModel.callout) && AbstractC22676k.m65745e(this.cardButton, upsellCardCalloutModel.cardButton);
    }

    public final InfoCalloutTileModel getCallout() {
        return this.callout;
    }

    public final CardButtonModel getCardButton() {
        return this.cardButton;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getTierImage() {
        return this.tierImage;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.description.hashCode() * 31, 31, this.imageUrl);
        String str = this.tierImage;
        return this.cardButton.hashCode() + ((this.callout.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public String toString() {
        String str = this.description;
        String str2 = this.imageUrl;
        String str3 = this.tierImage;
        InfoCalloutTileModel infoCalloutTileModel = this.callout;
        CardButtonModel cardButtonModel = this.cardButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UpsellCardCalloutModel(description=", str, ", imageUrl=", str2, ", tierImage=");
        sbM32001t.append(str3);
        sbM32001t.append(", callout=");
        sbM32001t.append(infoCalloutTileModel);
        sbM32001t.append(", cardButton=");
        sbM32001t.append(cardButtonModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public UpsellCardCalloutModel(String description, String imageUrl, String str, InfoCalloutTileModel callout, CardButtonModel cardButton) {
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(callout, "callout");
        AbstractC22676k.m65750j(cardButton, "cardButton");
        this.description = description;
        this.imageUrl = imageUrl;
        this.tierImage = str;
        this.callout = callout;
        this.cardButton = cardButton;
    }
}
