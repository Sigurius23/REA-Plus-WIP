package com.whoop.activation.domain.models.steps;

import c13.AbstractC3855a;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.FooterAlignment;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
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
import no.nordicsemi.android.dfu.DfuBaseService;
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
import r70.C31050b;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0002RQB\u0093\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0004\b\u0015\u0010\u0016B¯\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b,\u0010\"J²\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b/\u0010\u001fJ\u0010\u00100\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010@\u001a\u0004\bA\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bC\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bD\u0010\u001fR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bF\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bG\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bH\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bI\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bJ\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bK\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bL\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bM\u0010\u001fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\bO\u0010+R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bP\u0010\"¨\u0006S"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "", "subtitle", "imageUrl", "", "Lcom/whoop/activation/domain/models/steps/ConsentsModel;", "additionalConsents", "consents", "selectAllCtaTitle", "jumpCtaTitle", "acceptCtaTitle", "navigationBarText", "mobileScreenName", "analyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "progressCircle", "footerButtons", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Lcom/whoop/design/models/ProgressButtonModel;", "component13", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitle", "Ljava/lang/String;", "getSubtitle", "getImageUrl", "Ljava/util/List;", "getAdditionalConsents", "getConsents", "getSelectAllCtaTitle", "getJumpCtaTitle", "getAcceptCtaTitle", "getNavigationBarText", "getMobileScreenName", "getAnalyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressCircle", "getFooterButtons", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PrivacyConsentModel implements ActivationFlowStepModel, DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String acceptCtaTitle;
    private final List<ConsentsModel> additionalConsents;
    private final String analyticsName;
    private final List<ConsentsModel> consents;
    private final List<DesignSystemModel> footerButtons;
    private final String imageUrl;
    private final String jumpCtaTitle;
    private final String mobileScreenName;
    private final String navigationBarText;
    private final ProgressButtonModel progressCircle;
    private final String selectAllCtaTitle;
    private final String subtitle;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PrivacyConsentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C31050b(1)), AbstractC30060g.m92087G(enumC23463i, new C31050b(2)), null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C31050b(3))};
    }

    public /* synthetic */ PrivacyConsentModel(int i13, TextResource textResource, String str, String str2, List list, List list2, String str3, String str4, String str5, String str6, String str7, String str8, ProgressButtonModel progressButtonModel, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if (4087 != (i13 & 4087)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4087, PrivacyConsentModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.subtitle = str;
        this.imageUrl = str2;
        if ((i13 & 8) == 0) {
            this.additionalConsents = null;
        } else {
            this.additionalConsents = list;
        }
        this.consents = list2;
        this.selectAllCtaTitle = str3;
        this.jumpCtaTitle = str4;
        this.acceptCtaTitle = str5;
        this.navigationBarText = str6;
        this.mobileScreenName = str7;
        this.analyticsName = str8;
        this.progressCircle = progressButtonModel;
        this.footerButtons = (i13 & 4096) == 0 ? C25271y.f99162w : list3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ConsentsModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(ConsentsModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrivacyConsentModel copy$default(PrivacyConsentModel privacyConsentModel, TextResource textResource, String str, String str2, List list, List list2, String str3, String str4, String str5, String str6, String str7, String str8, ProgressButtonModel progressButtonModel, List list3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = privacyConsentModel.title;
        }
        return privacyConsentModel.copy(textResource, (i13 & 2) != 0 ? privacyConsentModel.subtitle : str, (i13 & 4) != 0 ? privacyConsentModel.imageUrl : str2, (i13 & 8) != 0 ? privacyConsentModel.additionalConsents : list, (i13 & 16) != 0 ? privacyConsentModel.consents : list2, (i13 & 32) != 0 ? privacyConsentModel.selectAllCtaTitle : str3, (i13 & 64) != 0 ? privacyConsentModel.jumpCtaTitle : str4, (i13 & 128) != 0 ? privacyConsentModel.acceptCtaTitle : str5, (i13 & 256) != 0 ? privacyConsentModel.navigationBarText : str6, (i13 & 512) != 0 ? privacyConsentModel.mobileScreenName : str7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? privacyConsentModel.analyticsName : str8, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? privacyConsentModel.progressCircle : progressButtonModel, (i13 & 4096) != 0 ? privacyConsentModel.footerButtons : list3);
    }

    public static final /* synthetic */ void write$Self$activation_release(PrivacyConsentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        output.encodeStringElement(serialDesc, 2, self.imageUrl);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.additionalConsents != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.additionalConsents);
        }
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.consents);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.selectAllCtaTitle);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.jumpCtaTitle);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.acceptCtaTitle);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.getNavigationBarText());
        output.encodeStringElement(serialDesc, 9, self.getMobileScreenName());
        output.encodeStringElement(serialDesc, 10, self.getAnalyticsName());
        output.encodeNullableSerializableElement(serialDesc, 11, ProgressButtonModel$$serializer.INSTANCE, self.getProgressCircle());
        if (!output.shouldEncodeElementDefault(serialDesc, 12) && AbstractC22676k.m65745e(self.getFooterButtons(), C25271y.f99162w)) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.getFooterButtons());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMobileScreenName() {
        return this.mobileScreenName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ProgressButtonModel getProgressCircle() {
        return this.progressCircle;
    }

    public final List<DesignSystemModel> component13() {
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

    public final List<ConsentsModel> component4() {
        return this.additionalConsents;
    }

    public final List<ConsentsModel> component5() {
        return this.consents;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSelectAllCtaTitle() {
        return this.selectAllCtaTitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getJumpCtaTitle() {
        return this.jumpCtaTitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAcceptCtaTitle() {
        return this.acceptCtaTitle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    public final PrivacyConsentModel copy(TextResource title, String subtitle, String imageUrl, List<ConsentsModel> additionalConsents, List<ConsentsModel> consents, String selectAllCtaTitle, String jumpCtaTitle, String acceptCtaTitle, String navigationBarText, String mobileScreenName, String analyticsName, ProgressButtonModel progressCircle, List<? extends DesignSystemModel> footerButtons) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(consents, "consents");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new PrivacyConsentModel(title, subtitle, imageUrl, additionalConsents, consents, selectAllCtaTitle, jumpCtaTitle, acceptCtaTitle, navigationBarText, mobileScreenName, analyticsName, progressCircle, footerButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacyConsentModel)) {
            return false;
        }
        PrivacyConsentModel privacyConsentModel = (PrivacyConsentModel) other;
        return AbstractC22676k.m65745e(this.title, privacyConsentModel.title) && AbstractC22676k.m65745e(this.subtitle, privacyConsentModel.subtitle) && AbstractC22676k.m65745e(this.imageUrl, privacyConsentModel.imageUrl) && AbstractC22676k.m65745e(this.additionalConsents, privacyConsentModel.additionalConsents) && AbstractC22676k.m65745e(this.consents, privacyConsentModel.consents) && AbstractC22676k.m65745e(this.selectAllCtaTitle, privacyConsentModel.selectAllCtaTitle) && AbstractC22676k.m65745e(this.jumpCtaTitle, privacyConsentModel.jumpCtaTitle) && AbstractC22676k.m65745e(this.acceptCtaTitle, privacyConsentModel.acceptCtaTitle) && AbstractC22676k.m65745e(this.navigationBarText, privacyConsentModel.navigationBarText) && AbstractC22676k.m65745e(this.mobileScreenName, privacyConsentModel.mobileScreenName) && AbstractC22676k.m65745e(this.analyticsName, privacyConsentModel.analyticsName) && AbstractC22676k.m65745e(this.progressCircle, privacyConsentModel.progressCircle) && AbstractC22676k.m65745e(this.footerButtons, privacyConsentModel.footerButtons);
    }

    public final String getAcceptCtaTitle() {
        return this.acceptCtaTitle;
    }

    public final List<ConsentsModel> getAdditionalConsents() {
        return this.additionalConsents;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getAnalyticsName() {
        return this.analyticsName;
    }

    public final List<ConsentsModel> getConsents() {
        return this.consents;
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

    public final String getJumpCtaTitle() {
        return this.jumpCtaTitle;
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

    public final String getSelectAllCtaTitle() {
        return this.selectAllCtaTitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.imageUrl);
        List<ConsentsModel> list = this.additionalConsents;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (list == null ? 0 : list.hashCode())) * 31, 31, this.consents);
        String str = this.selectAllCtaTitle;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.jumpCtaTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.acceptCtaTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.navigationBarText;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.mobileScreenName), 31, this.analyticsName);
        ProgressButtonModel progressButtonModel = this.progressCircle;
        int iHashCode4 = (iM30450d2 + (progressButtonModel == null ? 0 : progressButtonModel.hashCode())) * 31;
        List<DesignSystemModel> list2 = this.footerButtons;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.subtitle;
        String str2 = this.imageUrl;
        List<ConsentsModel> list = this.additionalConsents;
        List<ConsentsModel> list2 = this.consents;
        String str3 = this.selectAllCtaTitle;
        String str4 = this.jumpCtaTitle;
        String str5 = this.acceptCtaTitle;
        String str6 = this.navigationBarText;
        String str7 = this.mobileScreenName;
        String str8 = this.analyticsName;
        ProgressButtonModel progressButtonModel = this.progressCircle;
        List<DesignSystemModel> list3 = this.footerButtons;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("PrivacyConsentModel(title=", textResource, ", subtitle=", str, ", imageUrl=");
        AbstractC36095b.m114694v(str2, ", additionalConsents=", ", consents=", sbM91845o, list);
        AbstractC17176i.m48511m(", selectAllCtaTitle=", str3, ", jumpCtaTitle=", sbM91845o, list2);
        AbstractC11266d.m30444B(sbM91845o, str4, ", acceptCtaTitle=", str5, ", navigationBarText=");
        AbstractC11266d.m30444B(sbM91845o, str6, ", mobileScreenName=", str7, ", analyticsName=");
        sbM91845o.append(str8);
        sbM91845o.append(", progressCircle=");
        sbM91845o.append(progressButtonModel);
        sbM91845o.append(", footerButtons=");
        return AbstractC3855a.m11829m(sbM91845o, list3, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrivacyConsentModel(TextResource title, String subtitle, String imageUrl, List<ConsentsModel> list, List<ConsentsModel> consents, String str, String str2, String str3, String str4, String mobileScreenName, String analyticsName, ProgressButtonModel progressButtonModel, List<? extends DesignSystemModel> list2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(consents, "consents");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.title = title;
        this.subtitle = subtitle;
        this.imageUrl = imageUrl;
        this.additionalConsents = list;
        this.consents = consents;
        this.selectAllCtaTitle = str;
        this.jumpCtaTitle = str2;
        this.acceptCtaTitle = str3;
        this.navigationBarText = str4;
        this.mobileScreenName = mobileScreenName;
        this.analyticsName = analyticsName;
        this.progressCircle = progressButtonModel;
        this.footerButtons = list2;
    }

    public /* synthetic */ PrivacyConsentModel(TextResource textResource, String str, String str2, List list, List list2, String str3, String str4, String str5, String str6, String str7, String str8, ProgressButtonModel progressButtonModel, List list3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, str, str2, (i13 & 8) != 0 ? null : list, list2, str3, str4, str5, str6, str7, str8, progressButtonModel, (i13 & 4096) != 0 ? C25271y.f99162w : list3);
    }
}
