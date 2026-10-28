package com.whoop.activation.domain.models.steps;

import c13.AbstractC3855a;
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
import r70.C31050b;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0002BAB_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B{\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!Jx\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u0010\u0010%\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b6\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b8\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b9\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b:\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b;\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b<\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010\u001fR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010!¨\u0006C"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel;", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "subtitle", "imageUrl", "animatedImageUrl", "navigationBarText", "mobileScreenName", "analyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "progressCircle", "", "footerButtons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/design/models/ProgressButtonModel;", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getSubtitle", "getImageUrl", "getAnimatedImageUrl", "getNavigationBarText", "getMobileScreenName", "getAnalyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressCircle", "Ljava/util/List;", "getFooterButtons", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WelcomeTransitionStepModel implements ActivationFlowStepModel, DesignSystemModel {
    private final String analyticsName;
    private final String animatedImageUrl;
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
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31050b(19))};

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WelcomeTransitionStepModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WelcomeTransitionStepModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, ProgressButtonModel progressButtonModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, WelcomeTransitionStepModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.imageUrl = str3;
        this.animatedImageUrl = str4;
        this.navigationBarText = str5;
        this.mobileScreenName = str6;
        this.analyticsName = str7;
        this.progressCircle = progressButtonModel;
        if ((i13 & 256) == 0) {
            this.footerButtons = C25271y.f99162w;
        } else {
            this.footerButtons = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WelcomeTransitionStepModel copy$default(WelcomeTransitionStepModel welcomeTransitionStepModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, ProgressButtonModel progressButtonModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = welcomeTransitionStepModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = welcomeTransitionStepModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = welcomeTransitionStepModel.imageUrl;
        }
        if ((i13 & 8) != 0) {
            str4 = welcomeTransitionStepModel.animatedImageUrl;
        }
        if ((i13 & 16) != 0) {
            str5 = welcomeTransitionStepModel.navigationBarText;
        }
        if ((i13 & 32) != 0) {
            str6 = welcomeTransitionStepModel.mobileScreenName;
        }
        if ((i13 & 64) != 0) {
            str7 = welcomeTransitionStepModel.analyticsName;
        }
        if ((i13 & 128) != 0) {
            progressButtonModel = welcomeTransitionStepModel.progressCircle;
        }
        if ((i13 & 256) != 0) {
            list = welcomeTransitionStepModel.footerButtons;
        }
        ProgressButtonModel progressButtonModel2 = progressButtonModel;
        List list2 = list;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return welcomeTransitionStepModel.copy(str, str2, str11, str4, str10, str8, str9, progressButtonModel2, list2);
    }

    public static final /* synthetic */ void write$Self$activation_release(WelcomeTransitionStepModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.subtitle);
        output.encodeStringElement(serialDesc, 2, self.imageUrl);
        output.encodeStringElement(serialDesc, 3, self.animatedImageUrl);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.getNavigationBarText());
        output.encodeStringElement(serialDesc, 5, self.getMobileScreenName());
        output.encodeStringElement(serialDesc, 6, self.getAnalyticsName());
        output.encodeNullableSerializableElement(serialDesc, 7, ProgressButtonModel$$serializer.INSTANCE, self.getProgressCircle());
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && AbstractC22676k.m65745e(self.getFooterButtons(), C25271y.f99162w)) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.getFooterButtons());
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
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAnimatedImageUrl() {
        return this.animatedImageUrl;
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

    public final WelcomeTransitionStepModel copy(String title, String subtitle, String imageUrl, String animatedImageUrl, String navigationBarText, String mobileScreenName, String analyticsName, ProgressButtonModel progressCircle, List<? extends DesignSystemModel> footerButtons) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(animatedImageUrl, "animatedImageUrl");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new WelcomeTransitionStepModel(title, subtitle, imageUrl, animatedImageUrl, navigationBarText, mobileScreenName, analyticsName, progressCircle, footerButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WelcomeTransitionStepModel)) {
            return false;
        }
        WelcomeTransitionStepModel welcomeTransitionStepModel = (WelcomeTransitionStepModel) other;
        return AbstractC22676k.m65745e(this.title, welcomeTransitionStepModel.title) && AbstractC22676k.m65745e(this.subtitle, welcomeTransitionStepModel.subtitle) && AbstractC22676k.m65745e(this.imageUrl, welcomeTransitionStepModel.imageUrl) && AbstractC22676k.m65745e(this.animatedImageUrl, welcomeTransitionStepModel.animatedImageUrl) && AbstractC22676k.m65745e(this.navigationBarText, welcomeTransitionStepModel.navigationBarText) && AbstractC22676k.m65745e(this.mobileScreenName, welcomeTransitionStepModel.mobileScreenName) && AbstractC22676k.m65745e(this.analyticsName, welcomeTransitionStepModel.analyticsName) && AbstractC22676k.m65745e(this.progressCircle, welcomeTransitionStepModel.progressCircle) && AbstractC22676k.m65745e(this.footerButtons, welcomeTransitionStepModel.footerButtons);
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getAnimatedImageUrl() {
        return this.animatedImageUrl;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public /* bridge */ FooterAlignment getFooterAlignment() {
        return super.getFooterAlignment();
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
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.imageUrl), 31, this.animatedImageUrl);
        String str2 = this.navigationBarText;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.mobileScreenName), 31, this.analyticsName);
        ProgressButtonModel progressButtonModel = this.progressCircle;
        int iHashCode2 = (iM30450d2 + (progressButtonModel == null ? 0 : progressButtonModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.footerButtons;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.imageUrl;
        String str4 = this.animatedImageUrl;
        String str5 = this.navigationBarText;
        String str6 = this.mobileScreenName;
        String str7 = this.analyticsName;
        ProgressButtonModel progressButtonModel = this.progressCircle;
        List<DesignSystemModel> list = this.footerButtons;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WelcomeTransitionStepModel(title=", str, ", subtitle=", str2, ", imageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", animatedImageUrl=", str4, ", navigationBarText=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", mobileScreenName=", str6, ", analyticsName=");
        sbM32001t.append(str7);
        sbM32001t.append(", progressCircle=");
        sbM32001t.append(progressButtonModel);
        sbM32001t.append(", footerButtons=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WelcomeTransitionStepModel(String title, String str, String imageUrl, String animatedImageUrl, String str2, String mobileScreenName, String analyticsName, ProgressButtonModel progressButtonModel, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(animatedImageUrl, "animatedImageUrl");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.title = title;
        this.subtitle = str;
        this.imageUrl = imageUrl;
        this.animatedImageUrl = animatedImageUrl;
        this.navigationBarText = str2;
        this.mobileScreenName = mobileScreenName;
        this.analyticsName = analyticsName;
        this.progressCircle = progressButtonModel;
        this.footerButtons = list;
    }

    public /* synthetic */ WelcomeTransitionStepModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, ProgressButtonModel progressButtonModel, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, progressButtonModel, (i13 & 256) != 0 ? C25271y.f99162w : list);
    }
}
