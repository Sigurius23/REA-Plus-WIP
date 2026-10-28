package com.whoop.activation.domain.models.steps;

import c13.AbstractC3855a;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.FooterAlignment;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import md1.C25452a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import qv1.C30654e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0002FEBc\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ|\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b9\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b:\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b=\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010\u001fR\u001a\u0010\f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b@\u0010\u001fR\u001a\u0010\r\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\bA\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010#R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\bD\u0010\u001c¨\u0006G"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;", "tiles", "disclaimerText", "", "navigationBarText", "mobileScreenName", "analyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "progressCircle", "footerButtons", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "component8", "()Lcom/whoop/design/models/ProgressButtonModel;", "component9", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "Ljava/util/List;", "getTiles", "getDisclaimerText", "Ljava/lang/String;", "getNavigationBarText", "getMobileScreenName", "getAnalyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressCircle", "getFooterButtons", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BillingFrequencyStepModel implements ActivationFlowStepModel, DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String analyticsName;
    private final TextResource disclaimerText;
    private final List<DesignSystemModel> footerButtons;
    private final String mobileScreenName;
    private final String navigationBarText;
    private final ProgressButtonModel progressCircle;
    private final TextResource subtitle;
    private final List<BillingFrequencyTile> tiles;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BillingFrequencyStepModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C30654e(19)), null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C30654e(20))};
    }

    public /* synthetic */ BillingFrequencyStepModel(int i13, TextResource textResource, TextResource textResource2, List list, TextResource textResource3, String str, String str2, String str3, ProgressButtonModel progressButtonModel, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, BillingFrequencyStepModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.subtitle = textResource2;
        this.tiles = list;
        this.disclaimerText = textResource3;
        this.navigationBarText = str;
        this.mobileScreenName = str2;
        this.analyticsName = str3;
        this.progressCircle = progressButtonModel;
        if ((i13 & 256) == 0) {
            this.footerButtons = C25271y.f99162w;
        } else {
            this.footerButtons = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(BillingFrequencyTile$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BillingFrequencyStepModel copy$default(BillingFrequencyStepModel billingFrequencyStepModel, TextResource textResource, TextResource textResource2, List list, TextResource textResource3, String str, String str2, String str3, ProgressButtonModel progressButtonModel, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = billingFrequencyStepModel.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = billingFrequencyStepModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            list = billingFrequencyStepModel.tiles;
        }
        if ((i13 & 8) != 0) {
            textResource3 = billingFrequencyStepModel.disclaimerText;
        }
        if ((i13 & 16) != 0) {
            str = billingFrequencyStepModel.navigationBarText;
        }
        if ((i13 & 32) != 0) {
            str2 = billingFrequencyStepModel.mobileScreenName;
        }
        if ((i13 & 64) != 0) {
            str3 = billingFrequencyStepModel.analyticsName;
        }
        if ((i13 & 128) != 0) {
            progressButtonModel = billingFrequencyStepModel.progressCircle;
        }
        if ((i13 & 256) != 0) {
            list2 = billingFrequencyStepModel.footerButtons;
        }
        ProgressButtonModel progressButtonModel2 = progressButtonModel;
        List list3 = list2;
        String str4 = str2;
        String str5 = str3;
        String str6 = str;
        List list4 = list;
        return billingFrequencyStepModel.copy(textResource, textResource2, list4, textResource3, str6, str4, str5, progressButtonModel2, list3);
    }

    public static final /* synthetic */ void write$Self$activation_release(BillingFrequencyStepModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.subtitle);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.tiles);
        output.encodeSerializableElement(serialDesc, 3, c25452a, self.disclaimerText);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.getNavigationBarText());
        output.encodeStringElement(serialDesc, 5, self.getMobileScreenName());
        output.encodeStringElement(serialDesc, 6, self.getAnalyticsName());
        output.encodeNullableSerializableElement(serialDesc, 7, ProgressButtonModel$$serializer.INSTANCE, self.getProgressCircle());
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && AbstractC22676k.m65745e(self.getFooterButtons(), C25271y.f99162w)) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.getFooterButtons());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final List<BillingFrequencyTile> component3() {
        return this.tiles;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getDisclaimerText() {
        return this.disclaimerText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMobileScreenName() {
        return this.mobileScreenName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ProgressButtonModel getProgressCircle() {
        return this.progressCircle;
    }

    public final List<DesignSystemModel> component9() {
        return this.footerButtons;
    }

    public final BillingFrequencyStepModel copy(TextResource title, TextResource subtitle, List<BillingFrequencyTile> tiles, TextResource disclaimerText, String navigationBarText, String mobileScreenName, String analyticsName, ProgressButtonModel progressCircle, List<? extends DesignSystemModel> footerButtons) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(tiles, "tiles");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new BillingFrequencyStepModel(title, subtitle, tiles, disclaimerText, navigationBarText, mobileScreenName, analyticsName, progressCircle, footerButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingFrequencyStepModel)) {
            return false;
        }
        BillingFrequencyStepModel billingFrequencyStepModel = (BillingFrequencyStepModel) other;
        return AbstractC22676k.m65745e(this.title, billingFrequencyStepModel.title) && AbstractC22676k.m65745e(this.subtitle, billingFrequencyStepModel.subtitle) && AbstractC22676k.m65745e(this.tiles, billingFrequencyStepModel.tiles) && AbstractC22676k.m65745e(this.disclaimerText, billingFrequencyStepModel.disclaimerText) && AbstractC22676k.m65745e(this.navigationBarText, billingFrequencyStepModel.navigationBarText) && AbstractC22676k.m65745e(this.mobileScreenName, billingFrequencyStepModel.mobileScreenName) && AbstractC22676k.m65745e(this.analyticsName, billingFrequencyStepModel.analyticsName) && AbstractC22676k.m65745e(this.progressCircle, billingFrequencyStepModel.progressCircle) && AbstractC22676k.m65745e(this.footerButtons, billingFrequencyStepModel.footerButtons);
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getAnalyticsName() {
        return this.analyticsName;
    }

    public final TextResource getDisclaimerText() {
        return this.disclaimerText;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public /* bridge */ FooterAlignment getFooterAlignment() {
        return super.getFooterAlignment();
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public List<DesignSystemModel> getFooterButtons() {
        return this.footerButtons;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getMobileScreenName() {
        return this.mobileScreenName;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getNavigationBarText() {
        return this.navigationBarText;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public ProgressButtonModel getProgressCircle() {
        return this.progressCircle;
    }

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final List<BillingFrequencyTile> getTiles() {
        return this.tiles;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), 31, this.tiles), this.disclaimerText, 31);
        String str = this.navigationBarText;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM95625a + (str == null ? 0 : str.hashCode())) * 31, 31, this.mobileScreenName), 31, this.analyticsName);
        ProgressButtonModel progressButtonModel = this.progressCircle;
        int iHashCode = (iM30450d + (progressButtonModel == null ? 0 : progressButtonModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.footerButtons;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        List<BillingFrequencyTile> list = this.tiles;
        TextResource textResource3 = this.disclaimerText;
        String str = this.navigationBarText;
        String str2 = this.mobileScreenName;
        String str3 = this.analyticsName;
        ProgressButtonModel progressButtonModel = this.progressCircle;
        List<DesignSystemModel> list2 = this.footerButtons;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("BillingFrequencyStepModel(title=", textResource, ", subtitle=", textResource2, ", tiles=");
        AbstractC30007c.m91852v(textResource3, ", disclaimerText=", ", navigationBarText=", sbM106658q, list);
        AbstractC11266d.m30444B(sbM106658q, str, ", mobileScreenName=", str2, ", analyticsName=");
        sbM106658q.append(str3);
        sbM106658q.append(", progressCircle=");
        sbM106658q.append(progressButtonModel);
        sbM106658q.append(", footerButtons=");
        return AbstractC3855a.m11829m(sbM106658q, list2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BillingFrequencyStepModel(TextResource title, TextResource subtitle, List<BillingFrequencyTile> tiles, TextResource disclaimerText, String str, String mobileScreenName, String analyticsName, ProgressButtonModel progressButtonModel, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(tiles, "tiles");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.title = title;
        this.subtitle = subtitle;
        this.tiles = tiles;
        this.disclaimerText = disclaimerText;
        this.navigationBarText = str;
        this.mobileScreenName = mobileScreenName;
        this.analyticsName = analyticsName;
        this.progressCircle = progressButtonModel;
        this.footerButtons = list;
    }

    public /* synthetic */ BillingFrequencyStepModel(TextResource textResource, TextResource textResource2, List list, TextResource textResource3, String str, String str2, String str3, ProgressButtonModel progressButtonModel, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, list, textResource3, str, str2, str3, progressButtonModel, (i13 & 256) != 0 ? C25271y.f99162w : list2);
    }
}
