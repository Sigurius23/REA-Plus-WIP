package com.whoop.activation.domain.models.steps;

import androidx.core.app.NotificationCompat;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.FooterAlignment;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
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
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r70.C31049a;
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
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0002QPB\u007f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b*\u0010+J\u009e\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b.\u0010\u001fJ\u0010\u0010/\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b@\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\bA\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bC\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bD\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bE\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\bF\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bH\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bI\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bJ\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bK\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\bM\u0010)R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\bO\u0010+¨\u0006R"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "imageUrl", "lottieUrl", "lottieJson", "ctaText", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "navigationBarText", "mobileScreenName", "analyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "progressCircle", "", "footerButtons", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Lcom/whoop/navigation/e;", "component8", "component9", "component10", "component11", "()Lcom/whoop/design/models/ProgressButtonModel;", "component12", "()Ljava/util/List;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "Ljava/lang/String;", "getImageUrl", "getLottieUrl", "getLottieJson", "getCtaText", "Lcom/whoop/navigation/e;", "getNavigation", "getNavigationBarText", "getMobileScreenName", "getAnalyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressCircle", "Ljava/util/List;", "getFooterButtons", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DeviceEducationStepModel implements ActivationFlowStepModel, DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String analyticsName;
    private final TextResource ctaText;
    private final List<DesignSystemModel> footerButtons;
    private final String imageUrl;
    private final String lottieJson;
    private final String lottieUrl;
    private final String mobileScreenName;
    private final C9598e navigation;
    private final String navigationBarText;
    private final ProgressButtonModel progressCircle;
    private final TextResource subtitle;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DeviceEducationStepModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C31049a(1)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C31049a(2))};
    }

    public /* synthetic */ DeviceEducationStepModel(int i13, TextResource textResource, TextResource textResource2, String str, String str2, String str3, TextResource textResource3, C9598e c9598e, String str4, String str5, String str6, ProgressButtonModel progressButtonModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, DeviceEducationStepModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.subtitle = textResource2;
        this.imageUrl = str;
        this.lottieUrl = str2;
        this.lottieJson = str3;
        this.ctaText = textResource3;
        this.navigation = c9598e;
        this.navigationBarText = str4;
        this.mobileScreenName = str5;
        this.analyticsName = str6;
        this.progressCircle = progressButtonModel;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.footerButtons = C25271y.f99162w;
        } else {
            this.footerButtons = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceEducationStepModel copy$default(DeviceEducationStepModel deviceEducationStepModel, TextResource textResource, TextResource textResource2, String str, String str2, String str3, TextResource textResource3, C9598e c9598e, String str4, String str5, String str6, ProgressButtonModel progressButtonModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = deviceEducationStepModel.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = deviceEducationStepModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str = deviceEducationStepModel.imageUrl;
        }
        if ((i13 & 8) != 0) {
            str2 = deviceEducationStepModel.lottieUrl;
        }
        if ((i13 & 16) != 0) {
            str3 = deviceEducationStepModel.lottieJson;
        }
        if ((i13 & 32) != 0) {
            textResource3 = deviceEducationStepModel.ctaText;
        }
        if ((i13 & 64) != 0) {
            c9598e = deviceEducationStepModel.navigation;
        }
        if ((i13 & 128) != 0) {
            str4 = deviceEducationStepModel.navigationBarText;
        }
        if ((i13 & 256) != 0) {
            str5 = deviceEducationStepModel.mobileScreenName;
        }
        if ((i13 & 512) != 0) {
            str6 = deviceEducationStepModel.analyticsName;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            progressButtonModel = deviceEducationStepModel.progressCircle;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            list = deviceEducationStepModel.footerButtons;
        }
        ProgressButtonModel progressButtonModel2 = progressButtonModel;
        List list2 = list;
        String str7 = str5;
        String str8 = str6;
        C9598e c9598e2 = c9598e;
        String str9 = str4;
        String str10 = str3;
        TextResource textResource4 = textResource3;
        return deviceEducationStepModel.copy(textResource, textResource2, str, str2, str10, textResource4, c9598e2, str9, str7, str8, progressButtonModel2, list2);
    }

    public static final /* synthetic */ void write$Self$activation_release(DeviceEducationStepModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.subtitle);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.lottieUrl);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.lottieJson);
        output.encodeNullableSerializableElement(serialDesc, 5, c25452a, self.ctaText);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.navigation);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.getNavigationBarText());
        output.encodeStringElement(serialDesc, 8, self.getMobileScreenName());
        output.encodeStringElement(serialDesc, 9, self.getAnalyticsName());
        output.encodeNullableSerializableElement(serialDesc, 10, ProgressButtonModel$$serializer.INSTANCE, self.getProgressCircle());
        if (!output.shouldEncodeElementDefault(serialDesc, 11) && AbstractC22676k.m65745e(self.getFooterButtons(), C25271y.f99162w)) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.getFooterButtons());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ProgressButtonModel getProgressCircle() {
        return this.progressCircle;
    }

    public final List<DesignSystemModel> component12() {
        return this.footerButtons;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLottieUrl() {
        return this.lottieUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLottieJson() {
        return this.lottieJson;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TextResource getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMobileScreenName() {
        return this.mobileScreenName;
    }

    public final DeviceEducationStepModel copy(TextResource title, TextResource subtitle, String imageUrl, String lottieUrl, String lottieJson, TextResource ctaText, C9598e navigation, String navigationBarText, String mobileScreenName, String analyticsName, ProgressButtonModel progressCircle, List<? extends DesignSystemModel> footerButtons) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new DeviceEducationStepModel(title, subtitle, imageUrl, lottieUrl, lottieJson, ctaText, navigation, navigationBarText, mobileScreenName, analyticsName, progressCircle, footerButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceEducationStepModel)) {
            return false;
        }
        DeviceEducationStepModel deviceEducationStepModel = (DeviceEducationStepModel) other;
        return AbstractC22676k.m65745e(this.title, deviceEducationStepModel.title) && AbstractC22676k.m65745e(this.subtitle, deviceEducationStepModel.subtitle) && AbstractC22676k.m65745e(this.imageUrl, deviceEducationStepModel.imageUrl) && AbstractC22676k.m65745e(this.lottieUrl, deviceEducationStepModel.lottieUrl) && AbstractC22676k.m65745e(this.lottieJson, deviceEducationStepModel.lottieJson) && AbstractC22676k.m65745e(this.ctaText, deviceEducationStepModel.ctaText) && AbstractC22676k.m65745e(this.navigation, deviceEducationStepModel.navigation) && AbstractC22676k.m65745e(this.navigationBarText, deviceEducationStepModel.navigationBarText) && AbstractC22676k.m65745e(this.mobileScreenName, deviceEducationStepModel.mobileScreenName) && AbstractC22676k.m65745e(this.analyticsName, deviceEducationStepModel.analyticsName) && AbstractC22676k.m65745e(this.progressCircle, deviceEducationStepModel.progressCircle) && AbstractC22676k.m65745e(this.footerButtons, deviceEducationStepModel.footerButtons);
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getAnalyticsName() {
        return this.analyticsName;
    }

    public final TextResource getCtaText() {
        return this.ctaText;
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

    public final String getLottieJson() {
        return this.lottieJson;
    }

    public final String getLottieUrl() {
        return this.lottieUrl;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getMobileScreenName() {
        return this.mobileScreenName;
    }

    public final C9598e getNavigation() {
        return this.navigation;
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

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31);
        String str = this.imageUrl;
        int iHashCode = (iM95625a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lottieUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lottieJson;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TextResource textResource = this.ctaText;
        int iHashCode4 = (iHashCode3 + (textResource == null ? 0 : textResource.hashCode())) * 31;
        C9598e c9598e = this.navigation;
        int iHashCode5 = (iHashCode4 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        String str4 = this.navigationBarText;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.mobileScreenName), 31, this.analyticsName);
        ProgressButtonModel progressButtonModel = this.progressCircle;
        int iHashCode6 = (iM30450d + (progressButtonModel == null ? 0 : progressButtonModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.footerButtons;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        String str = this.imageUrl;
        String str2 = this.lottieUrl;
        String str3 = this.lottieJson;
        TextResource textResource3 = this.ctaText;
        C9598e c9598e = this.navigation;
        String str4 = this.navigationBarText;
        String str5 = this.mobileScreenName;
        String str6 = this.analyticsName;
        ProgressButtonModel progressButtonModel = this.progressCircle;
        List<DesignSystemModel> list = this.footerButtons;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("DeviceEducationStepModel(title=", textResource, ", subtitle=", textResource2, ", imageUrl=");
        AbstractC11266d.m30444B(sbM106658q, str, ", lottieUrl=", str2, ", lottieJson=");
        AbstractC30007c.m91826A(sbM106658q, str3, ", ctaText=", textResource3, ", navigation=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", navigationBarText=");
        sbM106658q.append(str4);
        sbM106658q.append(", mobileScreenName=");
        AbstractC11266d.m30444B(sbM106658q, str5, ", analyticsName=", str6, ", progressCircle=");
        sbM106658q.append(progressButtonModel);
        sbM106658q.append(", footerButtons=");
        sbM106658q.append(list);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceEducationStepModel(TextResource title, TextResource subtitle, String str, String str2, String str3, TextResource textResource, C9598e c9598e, String str4, String mobileScreenName, String analyticsName, ProgressButtonModel progressButtonModel, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.title = title;
        this.subtitle = subtitle;
        this.imageUrl = str;
        this.lottieUrl = str2;
        this.lottieJson = str3;
        this.ctaText = textResource;
        this.navigation = c9598e;
        this.navigationBarText = str4;
        this.mobileScreenName = mobileScreenName;
        this.analyticsName = analyticsName;
        this.progressCircle = progressButtonModel;
        this.footerButtons = list;
    }

    public /* synthetic */ DeviceEducationStepModel(TextResource textResource, TextResource textResource2, String str, String str2, String str3, TextResource textResource3, C9598e c9598e, String str4, String str5, String str6, ProgressButtonModel progressButtonModel, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, str, str2, str3, textResource3, c9598e, str4, str5, str6, progressButtonModel, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? C25271y.f99162w : list);
    }
}
