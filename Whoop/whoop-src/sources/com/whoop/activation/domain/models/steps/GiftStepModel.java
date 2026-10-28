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
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0002LKBm\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u008d\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u008a\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b+\u0010\u001dJ\u0010\u0010,\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b,\u0010 J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b<\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b=\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b@\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010 R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\bC\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bD\u0010\u001dR\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\bE\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\bF\u0010\u001dR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010&R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bJ\u0010(¨\u0006M"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/GiftStepModel;", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "imageUrl", "pickerText", "", "maximumCodesAllowed", "disclaimerText", "navigationBarText", "mobileScreenName", "analyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "progressCircle", "", "footerButtons", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()I", "component6", "component7", "component8", "component9", "component10", "()Lcom/whoop/design/models/ProgressButtonModel;", "component11", "()Ljava/util/List;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/GiftStepModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/GiftStepModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "Ljava/lang/String;", "getImageUrl", "getPickerText", "I", "getMaximumCodesAllowed", "getDisclaimerText", "getNavigationBarText", "getMobileScreenName", "getAnalyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressCircle", "Ljava/util/List;", "getFooterButtons", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GiftStepModel implements ActivationFlowStepModel, DesignSystemModel {
    private final String analyticsName;
    private final TextResource disclaimerText;
    private final List<DesignSystemModel> footerButtons;
    private final String imageUrl;
    private final int maximumCodesAllowed;
    private final String mobileScreenName;
    private final String navigationBarText;
    private final TextResource pickerText;
    private final ProgressButtonModel progressCircle;
    private final TextResource subtitle;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31049a(13))};

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/GiftStepModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/GiftStepModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GiftStepModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GiftStepModel(int i13, TextResource textResource, TextResource textResource2, String str, TextResource textResource3, int i14, TextResource textResource4, String str2, String str3, String str4, ProgressButtonModel progressButtonModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i13 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1023, GiftStepModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.subtitle = textResource2;
        this.imageUrl = str;
        this.pickerText = textResource3;
        this.maximumCodesAllowed = i14;
        this.disclaimerText = textResource4;
        this.navigationBarText = str2;
        this.mobileScreenName = str3;
        this.analyticsName = str4;
        this.progressCircle = progressButtonModel;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
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
    public static /* synthetic */ GiftStepModel copy$default(GiftStepModel giftStepModel, TextResource textResource, TextResource textResource2, String str, TextResource textResource3, int i13, TextResource textResource4, String str2, String str3, String str4, ProgressButtonModel progressButtonModel, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            textResource = giftStepModel.title;
        }
        if ((i14 & 2) != 0) {
            textResource2 = giftStepModel.subtitle;
        }
        if ((i14 & 4) != 0) {
            str = giftStepModel.imageUrl;
        }
        if ((i14 & 8) != 0) {
            textResource3 = giftStepModel.pickerText;
        }
        if ((i14 & 16) != 0) {
            i13 = giftStepModel.maximumCodesAllowed;
        }
        if ((i14 & 32) != 0) {
            textResource4 = giftStepModel.disclaimerText;
        }
        if ((i14 & 64) != 0) {
            str2 = giftStepModel.navigationBarText;
        }
        if ((i14 & 128) != 0) {
            str3 = giftStepModel.mobileScreenName;
        }
        if ((i14 & 256) != 0) {
            str4 = giftStepModel.analyticsName;
        }
        if ((i14 & 512) != 0) {
            progressButtonModel = giftStepModel.progressCircle;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            list = giftStepModel.footerButtons;
        }
        ProgressButtonModel progressButtonModel2 = progressButtonModel;
        List list2 = list;
        String str5 = str3;
        String str6 = str4;
        TextResource textResource5 = textResource4;
        String str7 = str2;
        int i15 = i13;
        String str8 = str;
        return giftStepModel.copy(textResource, textResource2, str8, textResource3, i15, textResource5, str7, str5, str6, progressButtonModel2, list2);
    }

    public static final /* synthetic */ void write$Self$activation_release(GiftStepModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.subtitle);
        output.encodeStringElement(serialDesc, 2, self.imageUrl);
        output.encodeSerializableElement(serialDesc, 3, c25452a, self.pickerText);
        output.encodeIntElement(serialDesc, 4, self.maximumCodesAllowed);
        output.encodeSerializableElement(serialDesc, 5, c25452a, self.disclaimerText);
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
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getPickerText() {
        return this.pickerText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaximumCodesAllowed() {
        return this.maximumCodesAllowed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TextResource getDisclaimerText() {
        return this.disclaimerText;
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

    public final GiftStepModel copy(TextResource title, TextResource subtitle, String imageUrl, TextResource pickerText, int maximumCodesAllowed, TextResource disclaimerText, String navigationBarText, String mobileScreenName, String analyticsName, ProgressButtonModel progressCircle, List<? extends DesignSystemModel> footerButtons) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(pickerText, "pickerText");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new GiftStepModel(title, subtitle, imageUrl, pickerText, maximumCodesAllowed, disclaimerText, navigationBarText, mobileScreenName, analyticsName, progressCircle, footerButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftStepModel)) {
            return false;
        }
        GiftStepModel giftStepModel = (GiftStepModel) other;
        return AbstractC22676k.m65745e(this.title, giftStepModel.title) && AbstractC22676k.m65745e(this.subtitle, giftStepModel.subtitle) && AbstractC22676k.m65745e(this.imageUrl, giftStepModel.imageUrl) && AbstractC22676k.m65745e(this.pickerText, giftStepModel.pickerText) && this.maximumCodesAllowed == giftStepModel.maximumCodesAllowed && AbstractC22676k.m65745e(this.disclaimerText, giftStepModel.disclaimerText) && AbstractC22676k.m65745e(this.navigationBarText, giftStepModel.navigationBarText) && AbstractC22676k.m65745e(this.mobileScreenName, giftStepModel.mobileScreenName) && AbstractC22676k.m65745e(this.analyticsName, giftStepModel.analyticsName) && AbstractC22676k.m65745e(this.progressCircle, giftStepModel.progressCircle) && AbstractC22676k.m65745e(this.footerButtons, giftStepModel.footerButtons);
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

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getMaximumCodesAllowed() {
        return this.maximumCodesAllowed;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getMobileScreenName() {
        return this.mobileScreenName;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getNavigationBarText() {
        return this.navigationBarText;
    }

    public final TextResource getPickerText() {
        return this.pickerText;
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
        int iM95625a = AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.maximumCodesAllowed, AbstractC31061c.m95625a(AbstractC11266d.m30450d(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), 31, this.imageUrl), this.pickerText, 31), 31), this.disclaimerText, 31);
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
        String str = this.imageUrl;
        TextResource textResource3 = this.pickerText;
        int i13 = this.maximumCodesAllowed;
        TextResource textResource4 = this.disclaimerText;
        String str2 = this.navigationBarText;
        String str3 = this.mobileScreenName;
        String str4 = this.analyticsName;
        ProgressButtonModel progressButtonModel = this.progressCircle;
        List<DesignSystemModel> list = this.footerButtons;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("GiftStepModel(title=", textResource, ", subtitle=", textResource2, ", imageUrl=");
        AbstractC30007c.m91826A(sbM106658q, str, ", pickerText=", textResource3, ", maximumCodesAllowed=");
        sbM106658q.append(i13);
        sbM106658q.append(", disclaimerText=");
        sbM106658q.append(textResource4);
        sbM106658q.append(", navigationBarText=");
        AbstractC11266d.m30444B(sbM106658q, str2, ", mobileScreenName=", str3, ", analyticsName=");
        sbM106658q.append(str4);
        sbM106658q.append(", progressCircle=");
        sbM106658q.append(progressButtonModel);
        sbM106658q.append(", footerButtons=");
        return AbstractC3855a.m11829m(sbM106658q, list, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GiftStepModel(TextResource title, TextResource subtitle, String imageUrl, TextResource pickerText, int i13, TextResource disclaimerText, String str, String mobileScreenName, String analyticsName, ProgressButtonModel progressButtonModel, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(pickerText, "pickerText");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.title = title;
        this.subtitle = subtitle;
        this.imageUrl = imageUrl;
        this.pickerText = pickerText;
        this.maximumCodesAllowed = i13;
        this.disclaimerText = disclaimerText;
        this.navigationBarText = str;
        this.mobileScreenName = mobileScreenName;
        this.analyticsName = analyticsName;
        this.progressCircle = progressButtonModel;
        this.footerButtons = list;
    }

    public /* synthetic */ GiftStepModel(TextResource textResource, TextResource textResource2, String str, TextResource textResource3, int i13, TextResource textResource4, String str2, String str3, String str4, ProgressButtonModel progressButtonModel, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, str, textResource3, i13, textResource4, str2, str3, str4, progressButtonModel, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C25271y.f99162w : list);
    }
}
