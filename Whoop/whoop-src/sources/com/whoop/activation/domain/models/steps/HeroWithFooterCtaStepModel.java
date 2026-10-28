package com.whoop.activation.domain.models.steps;

import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.FooterAlignment;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
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
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r70.C31049a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0002EDB]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B{\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#Jv\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u0010\u0010'\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b8\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b9\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b:\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b;\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b<\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b=\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010\u001fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010#¨\u0006F"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/HeroWithFooterCtaStepModel;", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "imageUrl", "title", "subtitle", "navigationBarText", "mobileScreenName", "analyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "progressCircle", "", "footerButtons", "Lcom/whoop/activation/domain/models/FooterAlignment;", "footerAlignment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/activation/domain/models/FooterAlignment;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/activation/domain/models/FooterAlignment;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/design/models/ProgressButtonModel;", "component8", "()Ljava/util/List;", "component9", "()Lcom/whoop/activation/domain/models/FooterAlignment;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/activation/domain/models/FooterAlignment;)Lcom/whoop/activation/domain/models/steps/HeroWithFooterCtaStepModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/HeroWithFooterCtaStepModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getImageUrl", "getTitle", "getSubtitle", "getNavigationBarText", "getMobileScreenName", "getAnalyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressCircle", "Ljava/util/List;", "getFooterButtons", "Lcom/whoop/activation/domain/models/FooterAlignment;", "getFooterAlignment", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HeroWithFooterCtaStepModel implements ActivationFlowStepModel, DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String analyticsName;
    private final FooterAlignment footerAlignment;
    private final List<DesignSystemModel> footerButtons;
    private final String imageUrl;
    private final String mobileScreenName;
    private final String navigationBarText;
    private final ProgressButtonModel progressCircle;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/HeroWithFooterCtaStepModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/HeroWithFooterCtaStepModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HeroWithFooterCtaStepModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C31049a(16)), AbstractC30060g.m92087G(enumC23463i, new C31049a(17))};
    }

    public /* synthetic */ HeroWithFooterCtaStepModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, ProgressButtonModel progressButtonModel, List list, FooterAlignment footerAlignment, SerializationConstructorMarker serializationConstructorMarker) {
        if (383 != (i13 & 383)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 383, HeroWithFooterCtaStepModel$$serializer.INSTANCE.getDescriptor());
        }
        this.imageUrl = str;
        this.title = str2;
        this.subtitle = str3;
        this.navigationBarText = str4;
        this.mobileScreenName = str5;
        this.analyticsName = str6;
        this.progressCircle = progressButtonModel;
        if ((i13 & 128) == 0) {
            this.footerButtons = C25271y.f99162w;
        } else {
            this.footerButtons = list;
        }
        this.footerAlignment = footerAlignment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return FooterAlignment.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeroWithFooterCtaStepModel copy$default(HeroWithFooterCtaStepModel heroWithFooterCtaStepModel, String str, String str2, String str3, String str4, String str5, String str6, ProgressButtonModel progressButtonModel, List list, FooterAlignment footerAlignment, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = heroWithFooterCtaStepModel.imageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = heroWithFooterCtaStepModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = heroWithFooterCtaStepModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            str4 = heroWithFooterCtaStepModel.navigationBarText;
        }
        if ((i13 & 16) != 0) {
            str5 = heroWithFooterCtaStepModel.mobileScreenName;
        }
        if ((i13 & 32) != 0) {
            str6 = heroWithFooterCtaStepModel.analyticsName;
        }
        if ((i13 & 64) != 0) {
            progressButtonModel = heroWithFooterCtaStepModel.progressCircle;
        }
        if ((i13 & 128) != 0) {
            list = heroWithFooterCtaStepModel.footerButtons;
        }
        if ((i13 & 256) != 0) {
            footerAlignment = heroWithFooterCtaStepModel.footerAlignment;
        }
        List list2 = list;
        FooterAlignment footerAlignment2 = footerAlignment;
        String str7 = str6;
        ProgressButtonModel progressButtonModel2 = progressButtonModel;
        String str8 = str5;
        String str9 = str3;
        return heroWithFooterCtaStepModel.copy(str, str2, str9, str4, str8, str7, progressButtonModel2, list2, footerAlignment2);
    }

    public static final /* synthetic */ void write$Self$activation_release(HeroWithFooterCtaStepModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.imageUrl);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.getNavigationBarText());
        output.encodeStringElement(serialDesc, 4, self.getMobileScreenName());
        output.encodeStringElement(serialDesc, 5, self.getAnalyticsName());
        output.encodeNullableSerializableElement(serialDesc, 6, ProgressButtonModel$$serializer.INSTANCE, self.getProgressCircle());
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !AbstractC22676k.m65745e(self.getFooterButtons(), C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.getFooterButtons());
        }
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.getFooterAlignment());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
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
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMobileScreenName() {
        return this.mobileScreenName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ProgressButtonModel getProgressCircle() {
        return this.progressCircle;
    }

    public final List<DesignSystemModel> component8() {
        return this.footerButtons;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final FooterAlignment getFooterAlignment() {
        return this.footerAlignment;
    }

    public final HeroWithFooterCtaStepModel copy(String imageUrl, String title, String subtitle, String navigationBarText, String mobileScreenName, String analyticsName, ProgressButtonModel progressCircle, List<? extends DesignSystemModel> footerButtons, FooterAlignment footerAlignment) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(footerButtons, "footerButtons");
        return new HeroWithFooterCtaStepModel(imageUrl, title, subtitle, navigationBarText, mobileScreenName, analyticsName, progressCircle, footerButtons, footerAlignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeroWithFooterCtaStepModel)) {
            return false;
        }
        HeroWithFooterCtaStepModel heroWithFooterCtaStepModel = (HeroWithFooterCtaStepModel) other;
        return AbstractC22676k.m65745e(this.imageUrl, heroWithFooterCtaStepModel.imageUrl) && AbstractC22676k.m65745e(this.title, heroWithFooterCtaStepModel.title) && AbstractC22676k.m65745e(this.subtitle, heroWithFooterCtaStepModel.subtitle) && AbstractC22676k.m65745e(this.navigationBarText, heroWithFooterCtaStepModel.navigationBarText) && AbstractC22676k.m65745e(this.mobileScreenName, heroWithFooterCtaStepModel.mobileScreenName) && AbstractC22676k.m65745e(this.analyticsName, heroWithFooterCtaStepModel.analyticsName) && AbstractC22676k.m65745e(this.progressCircle, heroWithFooterCtaStepModel.progressCircle) && AbstractC22676k.m65745e(this.footerButtons, heroWithFooterCtaStepModel.footerButtons) && this.footerAlignment == heroWithFooterCtaStepModel.footerAlignment;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getAnalyticsName() {
        return this.analyticsName;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public FooterAlignment getFooterAlignment() {
        return this.footerAlignment;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public List<DesignSystemModel> getFooterButtons() {
        return this.footerButtons;
    }

    public final String getImageUrl() {
        return this.imageUrl;
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

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.imageUrl.hashCode() * 31, 31, this.title), 31, this.subtitle);
        String str = this.navigationBarText;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.mobileScreenName), 31, this.analyticsName);
        ProgressButtonModel progressButtonModel = this.progressCircle;
        int iM31983b = AbstractC11895b.m31983b((iM30450d2 + (progressButtonModel == null ? 0 : progressButtonModel.hashCode())) * 31, 31, this.footerButtons);
        FooterAlignment footerAlignment = this.footerAlignment;
        return iM31983b + (footerAlignment != null ? footerAlignment.hashCode() : 0);
    }

    public String toString() {
        String str = this.imageUrl;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.navigationBarText;
        String str5 = this.mobileScreenName;
        String str6 = this.analyticsName;
        ProgressButtonModel progressButtonModel = this.progressCircle;
        List<DesignSystemModel> list = this.footerButtons;
        FooterAlignment footerAlignment = this.footerAlignment;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HeroWithFooterCtaStepModel(imageUrl=", str, ", title=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", navigationBarText=", str4, ", mobileScreenName=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", analyticsName=", str6, ", progressCircle=");
        sbM32001t.append(progressButtonModel);
        sbM32001t.append(", footerButtons=");
        sbM32001t.append(list);
        sbM32001t.append(", footerAlignment=");
        sbM32001t.append(footerAlignment);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeroWithFooterCtaStepModel(String imageUrl, String title, String subtitle, String str, String mobileScreenName, String analyticsName, ProgressButtonModel progressButtonModel, List<? extends DesignSystemModel> footerButtons, FooterAlignment footerAlignment) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(footerButtons, "footerButtons");
        this.imageUrl = imageUrl;
        this.title = title;
        this.subtitle = subtitle;
        this.navigationBarText = str;
        this.mobileScreenName = mobileScreenName;
        this.analyticsName = analyticsName;
        this.progressCircle = progressButtonModel;
        this.footerButtons = footerButtons;
        this.footerAlignment = footerAlignment;
    }

    public /* synthetic */ HeroWithFooterCtaStepModel(String str, String str2, String str3, String str4, String str5, String str6, ProgressButtonModel progressButtonModel, List list, FooterAlignment footerAlignment, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, progressButtonModel, (i13 & 128) != 0 ? C25271y.f99162w : list, footerAlignment);
    }
}
