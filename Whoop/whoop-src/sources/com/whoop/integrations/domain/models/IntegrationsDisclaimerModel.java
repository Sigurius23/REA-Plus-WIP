package com.whoop.integrations.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dq2.C12293a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fB{\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010\u001dJx\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b6\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010\u0016R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b<\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b=\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b>\u0010\u001d¨\u0006A"}, m65681d2 = {"Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;", "", "", "integrationId", "title", "heroImageUrl", "description", "", "Lcom/whoop/design/models/DesignSystemModel;", "designItems", "footerDisclaimer", "connectionUrlBase", "connectionButtonText", "secondaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/whoop/design/models/DesignSystemModel;", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$integrations_release", "(Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getIntegrationId", "getTitle", "getHeroImageUrl", "getDescription", "Ljava/util/List;", "getDesignItems", "Lcom/whoop/design/models/DesignSystemModel;", "getFooterDisclaimer", "getConnectionUrlBase", "getConnectionButtonText", "getSecondaryButton", "Companion", "$serializer", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class IntegrationsDisclaimerModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String connectionButtonText;
    private final String connectionUrlBase;
    private final String description;
    private final List<DesignSystemModel> designItems;
    private final DesignSystemModel footerDisclaimer;
    private final String heroImageUrl;
    private final String integrationId;
    private final DesignSystemModel secondaryButton;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;", "serializer", "()Lwc3/c;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return IntegrationsDisclaimerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C12293a(8)), AbstractC30060g.m92087G(enumC23463i, new C12293a(9)), null, null, AbstractC30060g.m92087G(enumC23463i, new C12293a(10))};
    }

    public /* synthetic */ IntegrationsDisclaimerModel(int i13, String str, String str2, String str3, String str4, List list, DesignSystemModel designSystemModel, String str5, String str6, DesignSystemModel designSystemModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, IntegrationsDisclaimerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.integrationId = str;
        this.title = str2;
        this.heroImageUrl = str3;
        this.description = str4;
        if ((i13 & 16) == 0) {
            this.designItems = C25271y.f99162w;
        } else {
            this.designItems = list;
        }
        if ((i13 & 32) == 0) {
            this.footerDisclaimer = null;
        } else {
            this.footerDisclaimer = designSystemModel;
        }
        if ((i13 & 64) == 0) {
            this.connectionUrlBase = null;
        } else {
            this.connectionUrlBase = str5;
        }
        if ((i13 & 128) == 0) {
            this.connectionButtonText = null;
        } else {
            this.connectionButtonText = str6;
        }
        if ((i13 & 256) == 0) {
            this.secondaryButton = null;
        } else {
            this.secondaryButton = designSystemModel2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntegrationsDisclaimerModel copy$default(IntegrationsDisclaimerModel integrationsDisclaimerModel, String str, String str2, String str3, String str4, List list, DesignSystemModel designSystemModel, String str5, String str6, DesignSystemModel designSystemModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = integrationsDisclaimerModel.integrationId;
        }
        if ((i13 & 2) != 0) {
            str2 = integrationsDisclaimerModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = integrationsDisclaimerModel.heroImageUrl;
        }
        if ((i13 & 8) != 0) {
            str4 = integrationsDisclaimerModel.description;
        }
        if ((i13 & 16) != 0) {
            list = integrationsDisclaimerModel.designItems;
        }
        if ((i13 & 32) != 0) {
            designSystemModel = integrationsDisclaimerModel.footerDisclaimer;
        }
        if ((i13 & 64) != 0) {
            str5 = integrationsDisclaimerModel.connectionUrlBase;
        }
        if ((i13 & 128) != 0) {
            str6 = integrationsDisclaimerModel.connectionButtonText;
        }
        if ((i13 & 256) != 0) {
            designSystemModel2 = integrationsDisclaimerModel.secondaryButton;
        }
        String str7 = str6;
        DesignSystemModel designSystemModel3 = designSystemModel2;
        DesignSystemModel designSystemModel4 = designSystemModel;
        String str8 = str5;
        List list2 = list;
        String str9 = str3;
        return integrationsDisclaimerModel.copy(str, str2, str9, str4, list2, designSystemModel4, str8, str7, designSystemModel3);
    }

    public static final /* synthetic */ void write$Self$integrations_release(IntegrationsDisclaimerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.integrationId);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.heroImageUrl);
        output.encodeStringElement(serialDesc, 3, self.description);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.designItems, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.designItems);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.footerDisclaimer != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.footerDisclaimer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.connectionUrlBase != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.connectionUrlBase);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.connectionButtonText != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.connectionButtonText);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.secondaryButton == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.secondaryButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIntegrationId() {
        return this.integrationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHeroImageUrl() {
        return this.heroImageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<DesignSystemModel> component5() {
        return this.designItems;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DesignSystemModel getFooterDisclaimer() {
        return this.footerDisclaimer;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getConnectionUrlBase() {
        return this.connectionUrlBase;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getConnectionButtonText() {
        return this.connectionButtonText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DesignSystemModel getSecondaryButton() {
        return this.secondaryButton;
    }

    public final IntegrationsDisclaimerModel copy(String integrationId, String title, String heroImageUrl, String description, List<? extends DesignSystemModel> designItems, DesignSystemModel footerDisclaimer, String connectionUrlBase, String connectionButtonText, DesignSystemModel secondaryButton) {
        AbstractC22676k.m65750j(integrationId, "integrationId");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(heroImageUrl, "heroImageUrl");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(designItems, "designItems");
        return new IntegrationsDisclaimerModel(integrationId, title, heroImageUrl, description, designItems, footerDisclaimer, connectionUrlBase, connectionButtonText, secondaryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegrationsDisclaimerModel)) {
            return false;
        }
        IntegrationsDisclaimerModel integrationsDisclaimerModel = (IntegrationsDisclaimerModel) other;
        return AbstractC22676k.m65745e(this.integrationId, integrationsDisclaimerModel.integrationId) && AbstractC22676k.m65745e(this.title, integrationsDisclaimerModel.title) && AbstractC22676k.m65745e(this.heroImageUrl, integrationsDisclaimerModel.heroImageUrl) && AbstractC22676k.m65745e(this.description, integrationsDisclaimerModel.description) && AbstractC22676k.m65745e(this.designItems, integrationsDisclaimerModel.designItems) && AbstractC22676k.m65745e(this.footerDisclaimer, integrationsDisclaimerModel.footerDisclaimer) && AbstractC22676k.m65745e(this.connectionUrlBase, integrationsDisclaimerModel.connectionUrlBase) && AbstractC22676k.m65745e(this.connectionButtonText, integrationsDisclaimerModel.connectionButtonText) && AbstractC22676k.m65745e(this.secondaryButton, integrationsDisclaimerModel.secondaryButton);
    }

    public final String getConnectionButtonText() {
        return this.connectionButtonText;
    }

    public final String getConnectionUrlBase() {
        return this.connectionUrlBase;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<DesignSystemModel> getDesignItems() {
        return this.designItems;
    }

    public final DesignSystemModel getFooterDisclaimer() {
        return this.footerDisclaimer;
    }

    public final String getHeroImageUrl() {
        return this.heroImageUrl;
    }

    public final String getIntegrationId() {
        return this.integrationId;
    }

    public final DesignSystemModel getSecondaryButton() {
        return this.secondaryButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.integrationId.hashCode() * 31, 31, this.title), 31, this.heroImageUrl), 31, this.description), 31, this.designItems);
        DesignSystemModel designSystemModel = this.footerDisclaimer;
        int iHashCode = (iM31983b + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        String str = this.connectionUrlBase;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.connectionButtonText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DesignSystemModel designSystemModel2 = this.secondaryButton;
        return iHashCode3 + (designSystemModel2 != null ? designSystemModel2.hashCode() : 0);
    }

    public String toString() {
        String str = this.integrationId;
        String str2 = this.title;
        String str3 = this.heroImageUrl;
        String str4 = this.description;
        List<DesignSystemModel> list = this.designItems;
        DesignSystemModel designSystemModel = this.footerDisclaimer;
        String str5 = this.connectionUrlBase;
        String str6 = this.connectionButtonText;
        DesignSystemModel designSystemModel2 = this.secondaryButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("IntegrationsDisclaimerModel(integrationId=", str, ", title=", str2, ", heroImageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", description=", str4, ", designItems=");
        sbM32001t.append(list);
        sbM32001t.append(", footerDisclaimer=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", connectionUrlBase=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", connectionButtonText=", str6, ", secondaryButton=");
        sbM32001t.append(designSystemModel2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntegrationsDisclaimerModel(String integrationId, String title, String heroImageUrl, String description, List<? extends DesignSystemModel> designItems, DesignSystemModel designSystemModel, String str, String str2, DesignSystemModel designSystemModel2) {
        AbstractC22676k.m65750j(integrationId, "integrationId");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(heroImageUrl, "heroImageUrl");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(designItems, "designItems");
        this.integrationId = integrationId;
        this.title = title;
        this.heroImageUrl = heroImageUrl;
        this.description = description;
        this.designItems = designItems;
        this.footerDisclaimer = designSystemModel;
        this.connectionUrlBase = str;
        this.connectionButtonText = str2;
        this.secondaryButton = designSystemModel2;
    }

    public /* synthetic */ IntegrationsDisclaimerModel(String str, String str2, String str3, String str4, List list, DesignSystemModel designSystemModel, String str5, String str6, DesignSystemModel designSystemModel2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i13 & 16) != 0 ? C25271y.f99162w : list, (i13 & 32) != 0 ? null : designSystemModel, (i13 & 64) != 0 ? null : str5, (i13 & 128) != 0 ? null : str6, (i13 & 256) != 0 ? null : designSystemModel2);
    }
}
