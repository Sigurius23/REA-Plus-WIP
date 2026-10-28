package com.whoop.activation.domain.models.steps;

import androidx.core.app.FrameMetricsAggregator;
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
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r70.C31049a;
import r80.AbstractC31061c;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0002IHBm\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013B\u008b\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0012\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0088\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b)\u0010\u001cJ\u0010\u0010*\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b>\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\bA\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\bB\u0010\u001cR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\bC\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bD\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010%R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\bG\u0010\u001f¨\u0006J"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "", "subtitle", "imageUrl", "", "Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;", "textEntries", "forgotPasswordText", "navigationBarText", "mobileScreenName", "analyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "progressCircle", "footerButtons", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "component8", "component9", "()Lcom/whoop/design/models/ProgressButtonModel;", "component10", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitle", "Ljava/lang/String;", "getSubtitle", "getImageUrl", "Ljava/util/List;", "getTextEntries", "getForgotPasswordText", "getNavigationBarText", "getMobileScreenName", "getAnalyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressCircle", "getFooterButtons", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EnterYourPasswordStepModel implements ActivationFlowStepModel, DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String analyticsName;
    private final List<DesignSystemModel> footerButtons;
    private final TextResource forgotPasswordText;
    private final String imageUrl;
    private final String mobileScreenName;
    private final String navigationBarText;
    private final ProgressButtonModel progressCircle;
    private final String subtitle;
    private final List<ActivationFlowTextEntry> textEntries;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EnterYourPasswordStepModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C31049a(5)), null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C31049a(6))};
    }

    public /* synthetic */ EnterYourPasswordStepModel(int i13, TextResource textResource, String str, String str2, List list, TextResource textResource2, String str3, String str4, String str5, ProgressButtonModel progressButtonModel, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, EnterYourPasswordStepModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.subtitle = str;
        this.imageUrl = str2;
        this.textEntries = list;
        this.forgotPasswordText = textResource2;
        this.navigationBarText = str3;
        this.mobileScreenName = str4;
        this.analyticsName = str5;
        this.progressCircle = progressButtonModel;
        if ((i13 & 512) == 0) {
            this.footerButtons = C25271y.f99162w;
        } else {
            this.footerButtons = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ActivationFlowTextEntry$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnterYourPasswordStepModel copy$default(EnterYourPasswordStepModel enterYourPasswordStepModel, TextResource textResource, String str, String str2, List list, TextResource textResource2, String str3, String str4, String str5, ProgressButtonModel progressButtonModel, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = enterYourPasswordStepModel.title;
        }
        if ((i13 & 2) != 0) {
            str = enterYourPasswordStepModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str2 = enterYourPasswordStepModel.imageUrl;
        }
        if ((i13 & 8) != 0) {
            list = enterYourPasswordStepModel.textEntries;
        }
        if ((i13 & 16) != 0) {
            textResource2 = enterYourPasswordStepModel.forgotPasswordText;
        }
        if ((i13 & 32) != 0) {
            str3 = enterYourPasswordStepModel.navigationBarText;
        }
        if ((i13 & 64) != 0) {
            str4 = enterYourPasswordStepModel.mobileScreenName;
        }
        if ((i13 & 128) != 0) {
            str5 = enterYourPasswordStepModel.analyticsName;
        }
        if ((i13 & 256) != 0) {
            progressButtonModel = enterYourPasswordStepModel.progressCircle;
        }
        if ((i13 & 512) != 0) {
            list2 = enterYourPasswordStepModel.footerButtons;
        }
        ProgressButtonModel progressButtonModel2 = progressButtonModel;
        List list3 = list2;
        String str6 = str4;
        String str7 = str5;
        TextResource textResource3 = textResource2;
        String str8 = str3;
        return enterYourPasswordStepModel.copy(textResource, str, str2, list, textResource3, str8, str6, str7, progressButtonModel2, list3);
    }

    public static final /* synthetic */ void write$Self$activation_release(EnterYourPasswordStepModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.subtitle);
        output.encodeStringElement(serialDesc, 2, self.imageUrl);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.textEntries);
        output.encodeSerializableElement(serialDesc, 4, c25452a, self.forgotPasswordText);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.getNavigationBarText());
        output.encodeStringElement(serialDesc, 6, self.getMobileScreenName());
        output.encodeStringElement(serialDesc, 7, self.getAnalyticsName());
        output.encodeNullableSerializableElement(serialDesc, 8, ProgressButtonModel$$serializer.INSTANCE, self.getProgressCircle());
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && AbstractC22676k.m65745e(self.getFooterButtons(), C25271y.f99162w)) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.getFooterButtons());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public final List<DesignSystemModel> component10() {
        return this.footerButtons;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<ActivationFlowTextEntry> component4() {
        return this.textEntries;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getForgotPasswordText() {
        return this.forgotPasswordText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMobileScreenName() {
        return this.mobileScreenName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ProgressButtonModel getProgressCircle() {
        return this.progressCircle;
    }

    public final EnterYourPasswordStepModel copy(TextResource title, String subtitle, String imageUrl, List<ActivationFlowTextEntry> textEntries, TextResource forgotPasswordText, String navigationBarText, String mobileScreenName, String analyticsName, ProgressButtonModel progressCircle, List<? extends DesignSystemModel> footerButtons) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(textEntries, "textEntries");
        AbstractC22676k.m65750j(forgotPasswordText, "forgotPasswordText");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new EnterYourPasswordStepModel(title, subtitle, imageUrl, textEntries, forgotPasswordText, navigationBarText, mobileScreenName, analyticsName, progressCircle, footerButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnterYourPasswordStepModel)) {
            return false;
        }
        EnterYourPasswordStepModel enterYourPasswordStepModel = (EnterYourPasswordStepModel) other;
        return AbstractC22676k.m65745e(this.title, enterYourPasswordStepModel.title) && AbstractC22676k.m65745e(this.subtitle, enterYourPasswordStepModel.subtitle) && AbstractC22676k.m65745e(this.imageUrl, enterYourPasswordStepModel.imageUrl) && AbstractC22676k.m65745e(this.textEntries, enterYourPasswordStepModel.textEntries) && AbstractC22676k.m65745e(this.forgotPasswordText, enterYourPasswordStepModel.forgotPasswordText) && AbstractC22676k.m65745e(this.navigationBarText, enterYourPasswordStepModel.navigationBarText) && AbstractC22676k.m65745e(this.mobileScreenName, enterYourPasswordStepModel.mobileScreenName) && AbstractC22676k.m65745e(this.analyticsName, enterYourPasswordStepModel.analyticsName) && AbstractC22676k.m65745e(this.progressCircle, enterYourPasswordStepModel.progressCircle) && AbstractC22676k.m65745e(this.footerButtons, enterYourPasswordStepModel.footerButtons);
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getAnalyticsName() {
        return this.analyticsName;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public /* bridge */ FooterAlignment getFooterAlignment() {
        return super.getFooterAlignment();
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public List<DesignSystemModel> getFooterButtons() {
        return this.footerButtons;
    }

    public final TextResource getForgotPasswordText() {
        return this.forgotPasswordText;
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

    public final List<ActivationFlowTextEntry> getTextEntries() {
        return this.textEntries;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iM95625a = AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.imageUrl), 31, this.textEntries), this.forgotPasswordText, 31);
        String str2 = this.navigationBarText;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM95625a + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.mobileScreenName), 31, this.analyticsName);
        ProgressButtonModel progressButtonModel = this.progressCircle;
        int iHashCode2 = (iM30450d + (progressButtonModel == null ? 0 : progressButtonModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.footerButtons;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.subtitle;
        String str2 = this.imageUrl;
        List<ActivationFlowTextEntry> list = this.textEntries;
        TextResource textResource2 = this.forgotPasswordText;
        String str3 = this.navigationBarText;
        String str4 = this.mobileScreenName;
        String str5 = this.analyticsName;
        ProgressButtonModel progressButtonModel = this.progressCircle;
        List<DesignSystemModel> list2 = this.footerButtons;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("EnterYourPasswordStepModel(title=", textResource, ", subtitle=", str, ", imageUrl=");
        AbstractC36095b.m114694v(str2, ", textEntries=", ", forgotPasswordText=", sbM91845o, list);
        AbstractC30007c.m91856z(sbM91845o, textResource2, ", navigationBarText=", str3, ", mobileScreenName=");
        AbstractC11266d.m30444B(sbM91845o, str4, ", analyticsName=", str5, ", progressCircle=");
        sbM91845o.append(progressButtonModel);
        sbM91845o.append(", footerButtons=");
        sbM91845o.append(list2);
        sbM91845o.append(")");
        return sbM91845o.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnterYourPasswordStepModel(TextResource title, String str, String imageUrl, List<ActivationFlowTextEntry> textEntries, TextResource forgotPasswordText, String str2, String mobileScreenName, String analyticsName, ProgressButtonModel progressButtonModel, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(textEntries, "textEntries");
        AbstractC22676k.m65750j(forgotPasswordText, "forgotPasswordText");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.title = title;
        this.subtitle = str;
        this.imageUrl = imageUrl;
        this.textEntries = textEntries;
        this.forgotPasswordText = forgotPasswordText;
        this.navigationBarText = str2;
        this.mobileScreenName = mobileScreenName;
        this.analyticsName = analyticsName;
        this.progressCircle = progressButtonModel;
        this.footerButtons = list;
    }

    public /* synthetic */ EnterYourPasswordStepModel(TextResource textResource, String str, String str2, List list, TextResource textResource2, String str3, String str4, String str5, ProgressButtonModel progressButtonModel, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, str, str2, list, textResource2, str3, str4, str5, progressButtonModel, (i13 & 512) != 0 ? C25271y.f99162w : list2);
    }
}
