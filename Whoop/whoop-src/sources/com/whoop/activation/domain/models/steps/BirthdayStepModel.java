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
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import qv1.C30654e;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0002HGBe\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0080\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b(\u0010\u001bJ\u0010\u0010)\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b=\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b>\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b?\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b@\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\bA\u0010\u001bR\u001a\u0010\f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\bB\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010#R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010%¨\u0006I"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "", "subtitle", "imageUrl", "ageLimit", "maxAgeLimit", "navigationBarText", "mobileScreenName", "analyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "progressCircle", "", "footerButtons", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/whoop/design/models/ProgressButtonModel;", "component10", "()Ljava/util/List;", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitle", "Ljava/lang/String;", "getSubtitle", "getImageUrl", "getAgeLimit", "getMaxAgeLimit", "getNavigationBarText", "getMobileScreenName", "getAnalyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressCircle", "Ljava/util/List;", "getFooterButtons", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BirthdayStepModel implements ActivationFlowStepModel, DesignSystemModel {
    private final String ageLimit;
    private final String analyticsName;
    private final List<DesignSystemModel> footerButtons;
    private final String imageUrl;
    private final String maxAgeLimit;
    private final String mobileScreenName;
    private final String navigationBarText;
    private final ProgressButtonModel progressCircle;
    private final String subtitle;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C30654e(21))};

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/BirthdayStepModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BirthdayStepModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BirthdayStepModel(int i13, TextResource textResource, String str, String str2, String str3, String str4, String str5, String str6, String str7, ProgressButtonModel progressButtonModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, BirthdayStepModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.subtitle = str;
        this.imageUrl = str2;
        this.ageLimit = str3;
        this.maxAgeLimit = str4;
        this.navigationBarText = str5;
        this.mobileScreenName = str6;
        this.analyticsName = str7;
        this.progressCircle = progressButtonModel;
        if ((i13 & 512) == 0) {
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
    public static /* synthetic */ BirthdayStepModel copy$default(BirthdayStepModel birthdayStepModel, TextResource textResource, String str, String str2, String str3, String str4, String str5, String str6, String str7, ProgressButtonModel progressButtonModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = birthdayStepModel.title;
        }
        if ((i13 & 2) != 0) {
            str = birthdayStepModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str2 = birthdayStepModel.imageUrl;
        }
        if ((i13 & 8) != 0) {
            str3 = birthdayStepModel.ageLimit;
        }
        if ((i13 & 16) != 0) {
            str4 = birthdayStepModel.maxAgeLimit;
        }
        if ((i13 & 32) != 0) {
            str5 = birthdayStepModel.navigationBarText;
        }
        if ((i13 & 64) != 0) {
            str6 = birthdayStepModel.mobileScreenName;
        }
        if ((i13 & 128) != 0) {
            str7 = birthdayStepModel.analyticsName;
        }
        if ((i13 & 256) != 0) {
            progressButtonModel = birthdayStepModel.progressCircle;
        }
        if ((i13 & 512) != 0) {
            list = birthdayStepModel.footerButtons;
        }
        ProgressButtonModel progressButtonModel2 = progressButtonModel;
        List list2 = list;
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return birthdayStepModel.copy(textResource, str, str2, str3, str10, str11, str8, str9, progressButtonModel2, list2);
    }

    public static final /* synthetic */ void write$Self$activation_release(BirthdayStepModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        output.encodeStringElement(serialDesc, 2, self.imageUrl);
        output.encodeStringElement(serialDesc, 3, self.ageLimit);
        output.encodeStringElement(serialDesc, 4, self.maxAgeLimit);
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.getNavigationBarText());
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAgeLimit() {
        return this.ageLimit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMaxAgeLimit() {
        return this.maxAgeLimit;
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

    public final BirthdayStepModel copy(TextResource title, String subtitle, String imageUrl, String ageLimit, String maxAgeLimit, String navigationBarText, String mobileScreenName, String analyticsName, ProgressButtonModel progressCircle, List<? extends DesignSystemModel> footerButtons) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(ageLimit, "ageLimit");
        AbstractC22676k.m65750j(maxAgeLimit, "maxAgeLimit");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new BirthdayStepModel(title, subtitle, imageUrl, ageLimit, maxAgeLimit, navigationBarText, mobileScreenName, analyticsName, progressCircle, footerButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BirthdayStepModel)) {
            return false;
        }
        BirthdayStepModel birthdayStepModel = (BirthdayStepModel) other;
        return AbstractC22676k.m65745e(this.title, birthdayStepModel.title) && AbstractC22676k.m65745e(this.subtitle, birthdayStepModel.subtitle) && AbstractC22676k.m65745e(this.imageUrl, birthdayStepModel.imageUrl) && AbstractC22676k.m65745e(this.ageLimit, birthdayStepModel.ageLimit) && AbstractC22676k.m65745e(this.maxAgeLimit, birthdayStepModel.maxAgeLimit) && AbstractC22676k.m65745e(this.navigationBarText, birthdayStepModel.navigationBarText) && AbstractC22676k.m65745e(this.mobileScreenName, birthdayStepModel.mobileScreenName) && AbstractC22676k.m65745e(this.analyticsName, birthdayStepModel.analyticsName) && AbstractC22676k.m65745e(this.progressCircle, birthdayStepModel.progressCircle) && AbstractC22676k.m65745e(this.footerButtons, birthdayStepModel.footerButtons);
    }

    public final String getAgeLimit() {
        return this.ageLimit;
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

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMaxAgeLimit() {
        return this.maxAgeLimit;
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

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.imageUrl), 31, this.ageLimit), 31, this.maxAgeLimit);
        String str = this.navigationBarText;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.mobileScreenName), 31, this.analyticsName);
        ProgressButtonModel progressButtonModel = this.progressCircle;
        int iHashCode = (iM30450d2 + (progressButtonModel == null ? 0 : progressButtonModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.footerButtons;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.subtitle;
        String str2 = this.imageUrl;
        String str3 = this.ageLimit;
        String str4 = this.maxAgeLimit;
        String str5 = this.navigationBarText;
        String str6 = this.mobileScreenName;
        String str7 = this.analyticsName;
        ProgressButtonModel progressButtonModel = this.progressCircle;
        List<DesignSystemModel> list = this.footerButtons;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("BirthdayStepModel(title=", textResource, ", subtitle=", str, ", imageUrl=");
        AbstractC11266d.m30444B(sbM91845o, str2, ", ageLimit=", str3, ", maxAgeLimit=");
        AbstractC11266d.m30444B(sbM91845o, str4, ", navigationBarText=", str5, ", mobileScreenName=");
        AbstractC11266d.m30444B(sbM91845o, str6, ", analyticsName=", str7, ", progressCircle=");
        sbM91845o.append(progressButtonModel);
        sbM91845o.append(", footerButtons=");
        sbM91845o.append(list);
        sbM91845o.append(")");
        return sbM91845o.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BirthdayStepModel(TextResource title, String subtitle, String imageUrl, String ageLimit, String maxAgeLimit, String str, String mobileScreenName, String analyticsName, ProgressButtonModel progressButtonModel, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(ageLimit, "ageLimit");
        AbstractC22676k.m65750j(maxAgeLimit, "maxAgeLimit");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.title = title;
        this.subtitle = subtitle;
        this.imageUrl = imageUrl;
        this.ageLimit = ageLimit;
        this.maxAgeLimit = maxAgeLimit;
        this.navigationBarText = str;
        this.mobileScreenName = mobileScreenName;
        this.analyticsName = analyticsName;
        this.progressCircle = progressButtonModel;
        this.footerButtons = list;
    }

    public /* synthetic */ BirthdayStepModel(TextResource textResource, String str, String str2, String str3, String str4, String str5, String str6, String str7, ProgressButtonModel progressButtonModel, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, str, str2, str3, str4, str5, str6, str7, progressButtonModel, (i13 & 512) != 0 ? C25271y.f99162w : list);
    }
}
