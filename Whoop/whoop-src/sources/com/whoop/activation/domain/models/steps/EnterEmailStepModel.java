package com.whoop.activation.domain.models.steps;

import c13.AbstractC3855a;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.EmailDialogInfo;
import com.whoop.activation.domain.models.EmailDialogInfo$$serializer;
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
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
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
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0002ONB{\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015B\u0095\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0094\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b-\u0010\u001eJ\u0010\u0010.\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b?\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010 R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bD\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bG\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bH\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bI\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bJ\u0010\u001eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010)R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bM\u0010 ¨\u0006P"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "", "subtitle", "", "Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;", "textEntries", "imageUrl", "Lcom/whoop/activation/domain/models/EmailDialogInfo;", "dialogInfo", "marketingOptInText", "navigationBarText", "mobileScreenName", "analyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "progressCircle", "footerButtons", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/activation/domain/models/EmailDialogInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/activation/domain/models/EmailDialogInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/whoop/activation/domain/models/EmailDialogInfo;", "component6", "component7", "component8", "component9", "component10", "()Lcom/whoop/design/models/ProgressButtonModel;", "component11", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/activation/domain/models/EmailDialogInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitle", "Ljava/lang/String;", "getSubtitle", "Ljava/util/List;", "getTextEntries", "getImageUrl", "Lcom/whoop/activation/domain/models/EmailDialogInfo;", "getDialogInfo", "getMarketingOptInText", "getNavigationBarText", "getMobileScreenName", "getAnalyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressCircle", "getFooterButtons", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EnterEmailStepModel implements ActivationFlowStepModel, DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String analyticsName;
    private final EmailDialogInfo dialogInfo;
    private final List<DesignSystemModel> footerButtons;
    private final String imageUrl;
    private final String marketingOptInText;
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
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EnterEmailStepModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C31049a(3)), null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C31049a(4))};
    }

    public /* synthetic */ EnterEmailStepModel(int i13, TextResource textResource, String str, List list, String str2, EmailDialogInfo emailDialogInfo, String str3, String str4, String str5, String str6, ProgressButtonModel progressButtonModel, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (975 != (i13 & 975)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 975, EnterEmailStepModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.subtitle = str;
        this.textEntries = list;
        this.imageUrl = str2;
        if ((i13 & 16) == 0) {
            this.dialogInfo = null;
        } else {
            this.dialogInfo = emailDialogInfo;
        }
        if ((i13 & 32) == 0) {
            this.marketingOptInText = null;
        } else {
            this.marketingOptInText = str3;
        }
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
        return new ArrayListSerializer(ActivationFlowTextEntry$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnterEmailStepModel copy$default(EnterEmailStepModel enterEmailStepModel, TextResource textResource, String str, List list, String str2, EmailDialogInfo emailDialogInfo, String str3, String str4, String str5, String str6, ProgressButtonModel progressButtonModel, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = enterEmailStepModel.title;
        }
        if ((i13 & 2) != 0) {
            str = enterEmailStepModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            list = enterEmailStepModel.textEntries;
        }
        if ((i13 & 8) != 0) {
            str2 = enterEmailStepModel.imageUrl;
        }
        if ((i13 & 16) != 0) {
            emailDialogInfo = enterEmailStepModel.dialogInfo;
        }
        if ((i13 & 32) != 0) {
            str3 = enterEmailStepModel.marketingOptInText;
        }
        if ((i13 & 64) != 0) {
            str4 = enterEmailStepModel.navigationBarText;
        }
        if ((i13 & 128) != 0) {
            str5 = enterEmailStepModel.mobileScreenName;
        }
        if ((i13 & 256) != 0) {
            str6 = enterEmailStepModel.analyticsName;
        }
        if ((i13 & 512) != 0) {
            progressButtonModel = enterEmailStepModel.progressCircle;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            list2 = enterEmailStepModel.footerButtons;
        }
        ProgressButtonModel progressButtonModel2 = progressButtonModel;
        List list3 = list2;
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        EmailDialogInfo emailDialogInfo2 = emailDialogInfo;
        List list4 = list;
        return enterEmailStepModel.copy(textResource, str, list4, str2, emailDialogInfo2, str9, str10, str7, str8, progressButtonModel2, list3);
    }

    public static final /* synthetic */ void write$Self$activation_release(EnterEmailStepModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.textEntries);
        output.encodeStringElement(serialDesc, 3, self.imageUrl);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.dialogInfo != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, EmailDialogInfo$$serializer.INSTANCE, self.dialogInfo);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.marketingOptInText != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.marketingOptInText);
        }
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.getNavigationBarText());
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

    public final List<ActivationFlowTextEntry> component3() {
        return this.textEntries;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EmailDialogInfo getDialogInfo() {
        return this.dialogInfo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMarketingOptInText() {
        return this.marketingOptInText;
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

    public final EnterEmailStepModel copy(TextResource title, String subtitle, List<ActivationFlowTextEntry> textEntries, String imageUrl, EmailDialogInfo dialogInfo, String marketingOptInText, String navigationBarText, String mobileScreenName, String analyticsName, ProgressButtonModel progressCircle, List<? extends DesignSystemModel> footerButtons) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(textEntries, "textEntries");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new EnterEmailStepModel(title, subtitle, textEntries, imageUrl, dialogInfo, marketingOptInText, navigationBarText, mobileScreenName, analyticsName, progressCircle, footerButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnterEmailStepModel)) {
            return false;
        }
        EnterEmailStepModel enterEmailStepModel = (EnterEmailStepModel) other;
        return AbstractC22676k.m65745e(this.title, enterEmailStepModel.title) && AbstractC22676k.m65745e(this.subtitle, enterEmailStepModel.subtitle) && AbstractC22676k.m65745e(this.textEntries, enterEmailStepModel.textEntries) && AbstractC22676k.m65745e(this.imageUrl, enterEmailStepModel.imageUrl) && AbstractC22676k.m65745e(this.dialogInfo, enterEmailStepModel.dialogInfo) && AbstractC22676k.m65745e(this.marketingOptInText, enterEmailStepModel.marketingOptInText) && AbstractC22676k.m65745e(this.navigationBarText, enterEmailStepModel.navigationBarText) && AbstractC22676k.m65745e(this.mobileScreenName, enterEmailStepModel.mobileScreenName) && AbstractC22676k.m65745e(this.analyticsName, enterEmailStepModel.analyticsName) && AbstractC22676k.m65745e(this.progressCircle, enterEmailStepModel.progressCircle) && AbstractC22676k.m65745e(this.footerButtons, enterEmailStepModel.footerButtons);
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getAnalyticsName() {
        return this.analyticsName;
    }

    public final EmailDialogInfo getDialogInfo() {
        return this.dialogInfo;
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

    public final String getMarketingOptInText() {
        return this.marketingOptInText;
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
        int iM30450d = AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.textEntries), 31, this.imageUrl);
        EmailDialogInfo emailDialogInfo = this.dialogInfo;
        int iHashCode = (iM30450d + (emailDialogInfo == null ? 0 : emailDialogInfo.hashCode())) * 31;
        String str = this.marketingOptInText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.navigationBarText;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.mobileScreenName), 31, this.analyticsName);
        ProgressButtonModel progressButtonModel = this.progressCircle;
        int iHashCode3 = (iM30450d2 + (progressButtonModel == null ? 0 : progressButtonModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.footerButtons;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.subtitle;
        List<ActivationFlowTextEntry> list = this.textEntries;
        String str2 = this.imageUrl;
        EmailDialogInfo emailDialogInfo = this.dialogInfo;
        String str3 = this.marketingOptInText;
        String str4 = this.navigationBarText;
        String str5 = this.mobileScreenName;
        String str6 = this.analyticsName;
        ProgressButtonModel progressButtonModel = this.progressCircle;
        List<DesignSystemModel> list2 = this.footerButtons;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("EnterEmailStepModel(title=", textResource, ", subtitle=", str, ", textEntries=");
        AbstractC17176i.m48511m(", imageUrl=", str2, ", dialogInfo=", sbM91845o, list);
        sbM91845o.append(emailDialogInfo);
        sbM91845o.append(", marketingOptInText=");
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
    public EnterEmailStepModel(TextResource title, String subtitle, List<ActivationFlowTextEntry> textEntries, String imageUrl, EmailDialogInfo emailDialogInfo, String str, String str2, String mobileScreenName, String analyticsName, ProgressButtonModel progressButtonModel, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(textEntries, "textEntries");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.title = title;
        this.subtitle = subtitle;
        this.textEntries = textEntries;
        this.imageUrl = imageUrl;
        this.dialogInfo = emailDialogInfo;
        this.marketingOptInText = str;
        this.navigationBarText = str2;
        this.mobileScreenName = mobileScreenName;
        this.analyticsName = analyticsName;
        this.progressCircle = progressButtonModel;
        this.footerButtons = list;
    }

    public /* synthetic */ EnterEmailStepModel(TextResource textResource, String str, List list, String str2, EmailDialogInfo emailDialogInfo, String str3, String str4, String str5, String str6, ProgressButtonModel progressButtonModel, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, str, list, str2, (i13 & 16) != 0 ? null : emailDialogInfo, (i13 & 32) != 0 ? null : str3, str4, str5, str6, progressButtonModel, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C25271y.f99162w : list2);
    }
}
