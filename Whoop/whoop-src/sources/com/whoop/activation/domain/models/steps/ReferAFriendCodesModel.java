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
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0002ONBu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015B\u0095\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010!J\u0092\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b-\u0010\u001eJ\u0010\u0010.\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b?\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bB\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bG\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bH\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bI\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bJ\u0010\u001eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010)R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bM\u0010!¨\u0006P"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "", "subtitle", "imageUrl", "", "Lcom/whoop/activation/domain/models/steps/RafCodeModel;", "freeTrialCodes", "Lcom/whoop/activation/domain/models/steps/RafHowItWorksModel;", "howItWorks", "referralType", "navigationBarText", "mobileScreenName", "analyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "progressCircle", "footerButtons", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/RafHowItWorksModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/RafHowItWorksModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/activation/domain/models/steps/RafHowItWorksModel;", "component6", "component7", "component8", "component9", "component10", "()Lcom/whoop/design/models/ProgressButtonModel;", "component11", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/RafHowItWorksModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitle", "Ljava/lang/String;", "getSubtitle", "getImageUrl", "Ljava/util/List;", "getFreeTrialCodes", "Lcom/whoop/activation/domain/models/steps/RafHowItWorksModel;", "getHowItWorks", "getReferralType", "getNavigationBarText", "getMobileScreenName", "getAnalyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressCircle", "getFooterButtons", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReferAFriendCodesModel implements ActivationFlowStepModel, DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String analyticsName;
    private final List<DesignSystemModel> footerButtons;
    private final List<RafCodeModel> freeTrialCodes;
    private final RafHowItWorksModel howItWorks;
    private final String imageUrl;
    private final String mobileScreenName;
    private final String navigationBarText;
    private final ProgressButtonModel progressCircle;
    private final String referralType;
    private final String subtitle;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReferAFriendCodesModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C31050b(6)), null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C31050b(7))};
    }

    public /* synthetic */ ReferAFriendCodesModel(int i13, TextResource textResource, String str, String str2, List list, RafHowItWorksModel rafHowItWorksModel, String str3, String str4, String str5, String str6, ProgressButtonModel progressButtonModel, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i13 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1023, ReferAFriendCodesModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.subtitle = str;
        this.imageUrl = str2;
        this.freeTrialCodes = list;
        this.howItWorks = rafHowItWorksModel;
        this.referralType = str3;
        this.navigationBarText = str4;
        this.mobileScreenName = str5;
        this.analyticsName = str6;
        this.progressCircle = progressButtonModel;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.footerButtons = C25271y.f99162w;
        } else {
            this.footerButtons = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(RafCodeModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReferAFriendCodesModel copy$default(ReferAFriendCodesModel referAFriendCodesModel, TextResource textResource, String str, String str2, List list, RafHowItWorksModel rafHowItWorksModel, String str3, String str4, String str5, String str6, ProgressButtonModel progressButtonModel, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = referAFriendCodesModel.title;
        }
        if ((i13 & 2) != 0) {
            str = referAFriendCodesModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str2 = referAFriendCodesModel.imageUrl;
        }
        if ((i13 & 8) != 0) {
            list = referAFriendCodesModel.freeTrialCodes;
        }
        if ((i13 & 16) != 0) {
            rafHowItWorksModel = referAFriendCodesModel.howItWorks;
        }
        if ((i13 & 32) != 0) {
            str3 = referAFriendCodesModel.referralType;
        }
        if ((i13 & 64) != 0) {
            str4 = referAFriendCodesModel.navigationBarText;
        }
        if ((i13 & 128) != 0) {
            str5 = referAFriendCodesModel.mobileScreenName;
        }
        if ((i13 & 256) != 0) {
            str6 = referAFriendCodesModel.analyticsName;
        }
        if ((i13 & 512) != 0) {
            progressButtonModel = referAFriendCodesModel.progressCircle;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            list2 = referAFriendCodesModel.footerButtons;
        }
        ProgressButtonModel progressButtonModel2 = progressButtonModel;
        List list3 = list2;
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        RafHowItWorksModel rafHowItWorksModel2 = rafHowItWorksModel;
        String str11 = str2;
        return referAFriendCodesModel.copy(textResource, str, str11, list, rafHowItWorksModel2, str9, str10, str7, str8, progressButtonModel2, list3);
    }

    public static final /* synthetic */ void write$Self$activation_release(ReferAFriendCodesModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        output.encodeStringElement(serialDesc, 2, self.imageUrl);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.freeTrialCodes);
        output.encodeSerializableElement(serialDesc, 4, RafHowItWorksModel$$serializer.INSTANCE, self.howItWorks);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.referralType);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.getNavigationBarText());
        output.encodeStringElement(serialDesc, 7, self.getMobileScreenName());
        output.encodeStringElement(serialDesc, 8, self.getAnalyticsName());
        output.encodeNullableSerializableElement(serialDesc, 9, ProgressButtonModel$$serializer.INSTANCE, self.getProgressCircle());
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && AbstractC22676k.m65745e(self.getFooterButtons(), C25271y.f99162w)) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.getFooterButtons());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ProgressButtonModel getProgressCircle() {
        return this.progressCircle;
    }

    public final List<DesignSystemModel> component11() {
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

    public final List<RafCodeModel> component4() {
        return this.freeTrialCodes;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RafHowItWorksModel getHowItWorks() {
        return this.howItWorks;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReferralType() {
        return this.referralType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMobileScreenName() {
        return this.mobileScreenName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final ReferAFriendCodesModel copy(TextResource title, String subtitle, String imageUrl, List<RafCodeModel> freeTrialCodes, RafHowItWorksModel howItWorks, String referralType, String navigationBarText, String mobileScreenName, String analyticsName, ProgressButtonModel progressCircle, List<? extends DesignSystemModel> footerButtons) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(freeTrialCodes, "freeTrialCodes");
        AbstractC22676k.m65750j(howItWorks, "howItWorks");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new ReferAFriendCodesModel(title, subtitle, imageUrl, freeTrialCodes, howItWorks, referralType, navigationBarText, mobileScreenName, analyticsName, progressCircle, footerButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferAFriendCodesModel)) {
            return false;
        }
        ReferAFriendCodesModel referAFriendCodesModel = (ReferAFriendCodesModel) other;
        return AbstractC22676k.m65745e(this.title, referAFriendCodesModel.title) && AbstractC22676k.m65745e(this.subtitle, referAFriendCodesModel.subtitle) && AbstractC22676k.m65745e(this.imageUrl, referAFriendCodesModel.imageUrl) && AbstractC22676k.m65745e(this.freeTrialCodes, referAFriendCodesModel.freeTrialCodes) && AbstractC22676k.m65745e(this.howItWorks, referAFriendCodesModel.howItWorks) && AbstractC22676k.m65745e(this.referralType, referAFriendCodesModel.referralType) && AbstractC22676k.m65745e(this.navigationBarText, referAFriendCodesModel.navigationBarText) && AbstractC22676k.m65745e(this.mobileScreenName, referAFriendCodesModel.mobileScreenName) && AbstractC22676k.m65745e(this.analyticsName, referAFriendCodesModel.analyticsName) && AbstractC22676k.m65745e(this.progressCircle, referAFriendCodesModel.progressCircle) && AbstractC22676k.m65745e(this.footerButtons, referAFriendCodesModel.footerButtons);
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

    public final List<RafCodeModel> getFreeTrialCodes() {
        return this.freeTrialCodes;
    }

    public final RafHowItWorksModel getHowItWorks() {
        return this.howItWorks;
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

    public final String getReferralType() {
        return this.referralType;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.howItWorks.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.imageUrl), 31, this.freeTrialCodes)) * 31;
        String str = this.referralType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.navigationBarText;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.mobileScreenName), 31, this.analyticsName);
        ProgressButtonModel progressButtonModel = this.progressCircle;
        int iHashCode3 = (iM30450d + (progressButtonModel == null ? 0 : progressButtonModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.footerButtons;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.subtitle;
        String str2 = this.imageUrl;
        List<RafCodeModel> list = this.freeTrialCodes;
        RafHowItWorksModel rafHowItWorksModel = this.howItWorks;
        String str3 = this.referralType;
        String str4 = this.navigationBarText;
        String str5 = this.mobileScreenName;
        String str6 = this.analyticsName;
        ProgressButtonModel progressButtonModel = this.progressCircle;
        List<DesignSystemModel> list2 = this.footerButtons;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("ReferAFriendCodesModel(title=", textResource, ", subtitle=", str, ", imageUrl=");
        AbstractC36095b.m114694v(str2, ", freeTrialCodes=", ", howItWorks=", sbM91845o, list);
        sbM91845o.append(rafHowItWorksModel);
        sbM91845o.append(", referralType=");
        sbM91845o.append(str3);
        sbM91845o.append(", navigationBarText=");
        AbstractC11266d.m30444B(sbM91845o, str4, ", mobileScreenName=", str5, ", analyticsName=");
        sbM91845o.append(str6);
        sbM91845o.append(", progressCircle=");
        sbM91845o.append(progressButtonModel);
        sbM91845o.append(", footerButtons=");
        return AbstractC3855a.m11829m(sbM91845o, list2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReferAFriendCodesModel(TextResource title, String subtitle, String imageUrl, List<RafCodeModel> freeTrialCodes, RafHowItWorksModel howItWorks, String str, String str2, String mobileScreenName, String analyticsName, ProgressButtonModel progressButtonModel, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(freeTrialCodes, "freeTrialCodes");
        AbstractC22676k.m65750j(howItWorks, "howItWorks");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.title = title;
        this.subtitle = subtitle;
        this.imageUrl = imageUrl;
        this.freeTrialCodes = freeTrialCodes;
        this.howItWorks = howItWorks;
        this.referralType = str;
        this.navigationBarText = str2;
        this.mobileScreenName = mobileScreenName;
        this.analyticsName = analyticsName;
        this.progressCircle = progressButtonModel;
        this.footerButtons = list;
    }

    public /* synthetic */ ReferAFriendCodesModel(TextResource textResource, String str, String str2, List list, RafHowItWorksModel rafHowItWorksModel, String str3, String str4, String str5, String str6, ProgressButtonModel progressButtonModel, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, str, str2, list, rafHowItWorksModel, str3, str4, str5, str6, progressButtonModel, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C25271y.f99162w : list2);
    }
}
