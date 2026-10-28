package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JR\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b4\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#¨\u00069"}, m65681d2 = {"Lcom/whoop/design/models/items/IntegrationUpsellModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "image", "title", "subtitle", "Lcom/whoop/design/models/items/IntegrationsUpsellButtonModel;", "primaryButton", "secondaryButton", "Lcom/whoop/design/models/items/CardButtonModel;", "cardButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/IntegrationsUpsellButtonModel;Lcom/whoop/design/models/items/IntegrationsUpsellButtonModel;Lcom/whoop/design/models/items/CardButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/IntegrationsUpsellButtonModel;Lcom/whoop/design/models/items/IntegrationsUpsellButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/IntegrationUpsellModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/items/IntegrationsUpsellButtonModel;", "component5", "component6", "()Lcom/whoop/design/models/items/CardButtonModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/IntegrationsUpsellButtonModel;Lcom/whoop/design/models/items/IntegrationsUpsellButtonModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/design/models/items/IntegrationUpsellModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getTitle", "getSubtitle", "Lcom/whoop/design/models/items/IntegrationsUpsellButtonModel;", "getPrimaryButton", "getSecondaryButton", "Lcom/whoop/design/models/items/CardButtonModel;", "getCardButton", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class IntegrationUpsellModel implements DesignSystemModel {
    private final CardButtonModel cardButton;
    private final String image;
    private final IntegrationsUpsellButtonModel primaryButton;
    private final IntegrationsUpsellButtonModel secondaryButton;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/IntegrationUpsellModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/IntegrationUpsellModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return IntegrationUpsellModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ IntegrationUpsellModel(int i13, String str, String str2, String str3, IntegrationsUpsellButtonModel integrationsUpsellButtonModel, IntegrationsUpsellButtonModel integrationsUpsellButtonModel2, CardButtonModel cardButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, IntegrationUpsellModel$$serializer.INSTANCE.getDescriptor());
        }
        this.image = str;
        this.title = str2;
        this.subtitle = str3;
        this.primaryButton = integrationsUpsellButtonModel;
        this.secondaryButton = integrationsUpsellButtonModel2;
        if ((i13 & 32) == 0) {
            this.cardButton = null;
        } else {
            this.cardButton = cardButtonModel;
        }
    }

    public static /* synthetic */ IntegrationUpsellModel copy$default(IntegrationUpsellModel integrationUpsellModel, String str, String str2, String str3, IntegrationsUpsellButtonModel integrationsUpsellButtonModel, IntegrationsUpsellButtonModel integrationsUpsellButtonModel2, CardButtonModel cardButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = integrationUpsellModel.image;
        }
        if ((i13 & 2) != 0) {
            str2 = integrationUpsellModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = integrationUpsellModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            integrationsUpsellButtonModel = integrationUpsellModel.primaryButton;
        }
        if ((i13 & 16) != 0) {
            integrationsUpsellButtonModel2 = integrationUpsellModel.secondaryButton;
        }
        if ((i13 & 32) != 0) {
            cardButtonModel = integrationUpsellModel.cardButton;
        }
        IntegrationsUpsellButtonModel integrationsUpsellButtonModel3 = integrationsUpsellButtonModel2;
        CardButtonModel cardButtonModel2 = cardButtonModel;
        return integrationUpsellModel.copy(str, str2, str3, integrationsUpsellButtonModel, integrationsUpsellButtonModel3, cardButtonModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(IntegrationUpsellModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.image);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        IntegrationsUpsellButtonModel$$serializer integrationsUpsellButtonModel$$serializer = IntegrationsUpsellButtonModel$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, integrationsUpsellButtonModel$$serializer, self.primaryButton);
        output.encodeNullableSerializableElement(serialDesc, 4, integrationsUpsellButtonModel$$serializer, self.secondaryButton);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.cardButton == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, CardButtonModel$$serializer.INSTANCE, self.cardButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final IntegrationsUpsellButtonModel getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final IntegrationsUpsellButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CardButtonModel getCardButton() {
        return this.cardButton;
    }

    public final IntegrationUpsellModel copy(String image, String title, String subtitle, IntegrationsUpsellButtonModel primaryButton, IntegrationsUpsellButtonModel secondaryButton, CardButtonModel cardButton) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        return new IntegrationUpsellModel(image, title, subtitle, primaryButton, secondaryButton, cardButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegrationUpsellModel)) {
            return false;
        }
        IntegrationUpsellModel integrationUpsellModel = (IntegrationUpsellModel) other;
        return AbstractC22676k.m65745e(this.image, integrationUpsellModel.image) && AbstractC22676k.m65745e(this.title, integrationUpsellModel.title) && AbstractC22676k.m65745e(this.subtitle, integrationUpsellModel.subtitle) && AbstractC22676k.m65745e(this.primaryButton, integrationUpsellModel.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, integrationUpsellModel.secondaryButton) && AbstractC22676k.m65745e(this.cardButton, integrationUpsellModel.cardButton);
    }

    public final CardButtonModel getCardButton() {
        return this.cardButton;
    }

    public final String getImage() {
        return this.image;
    }

    public final IntegrationsUpsellButtonModel getPrimaryButton() {
        return this.primaryButton;
    }

    public final IntegrationsUpsellButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.image.hashCode() * 31, 31, this.title), 31, this.subtitle);
        IntegrationsUpsellButtonModel integrationsUpsellButtonModel = this.primaryButton;
        int iHashCode = (iM30450d + (integrationsUpsellButtonModel == null ? 0 : integrationsUpsellButtonModel.hashCode())) * 31;
        IntegrationsUpsellButtonModel integrationsUpsellButtonModel2 = this.secondaryButton;
        int iHashCode2 = (iHashCode + (integrationsUpsellButtonModel2 == null ? 0 : integrationsUpsellButtonModel2.hashCode())) * 31;
        CardButtonModel cardButtonModel = this.cardButton;
        return iHashCode2 + (cardButtonModel != null ? cardButtonModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.image;
        String str2 = this.title;
        String str3 = this.subtitle;
        IntegrationsUpsellButtonModel integrationsUpsellButtonModel = this.primaryButton;
        IntegrationsUpsellButtonModel integrationsUpsellButtonModel2 = this.secondaryButton;
        CardButtonModel cardButtonModel = this.cardButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("IntegrationUpsellModel(image=", str, ", title=", str2, ", subtitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", primaryButton=");
        sbM32001t.append(integrationsUpsellButtonModel);
        sbM32001t.append(", secondaryButton=");
        sbM32001t.append(integrationsUpsellButtonModel2);
        sbM32001t.append(", cardButton=");
        sbM32001t.append(cardButtonModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public IntegrationUpsellModel(String image, String title, String subtitle, IntegrationsUpsellButtonModel integrationsUpsellButtonModel, IntegrationsUpsellButtonModel integrationsUpsellButtonModel2, CardButtonModel cardButtonModel) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.primaryButton = integrationsUpsellButtonModel;
        this.secondaryButton = integrationsUpsellButtonModel2;
        this.cardButton = cardButtonModel;
    }

    public /* synthetic */ IntegrationUpsellModel(String str, String str2, String str3, IntegrationsUpsellButtonModel integrationsUpsellButtonModel, IntegrationsUpsellButtonModel integrationsUpsellButtonModel2, CardButtonModel cardButtonModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, integrationsUpsellButtonModel, integrationsUpsellButtonModel2, (i13 & 32) != 0 ? null : cardButtonModel);
    }
}
