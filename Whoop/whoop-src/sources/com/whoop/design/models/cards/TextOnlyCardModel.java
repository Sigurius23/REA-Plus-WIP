package com.whoop.design.models.cards;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.NotificationCardModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import h01.EnumC16533a;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import s52.C32223d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0002MLB\u0089\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014B\u009b\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b(\u0010\u001bJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b)\u0010\u001bJ¢\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u0010\u0010-\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b=\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b>\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b?\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b@\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\bA\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\bB\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bG\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bH\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bI\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bJ\u0010\u001bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\bK\u0010\u001b¨\u0006N"}, m65681d2 = {"Lcom/whoop/design/models/cards/TextOnlyCardModel;", "Lcom/whoop/design/models/NotificationCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "appNotificationType", "title", "body", "ctaText", "cta", "", "showHighlight", "Lh01/a;", "cardType", "backgroundStyle", "endIcon", "titleIconUrl", "androidFeatureFlagName", "templateName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Z", "component8", "()Lh01/a;", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/cards/TextOnlyCardModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/TextOnlyCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getAppNotificationType", "getTitle", "getBody", "getCtaText", "getCta", "Z", "getShowHighlight", "Lh01/a;", "getCardType", "getBackgroundStyle", "getEndIcon", "getTitleIconUrl", "getAndroidFeatureFlagName", "getTemplateName", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TextOnlyCardModel implements NotificationCardModel, DesignSystemModel {
    public static final int $stable = 0;
    private final String androidFeatureFlagName;
    private final String appNotificationType;
    private final String backgroundStyle;
    private final String body;
    private final EnumC16533a cardType;
    private final String cta;
    private final String ctaText;
    private final String endIcon;
    private final String id;
    private final boolean showHighlight;
    private final String templateName;
    private final String title;
    private final String titleIconUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32223d(21)), null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/TextOnlyCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/TextOnlyCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TextOnlyCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextOnlyCardModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, boolean z4, EnumC16533a enumC16533a, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if (383 != (i13 & 383)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 383, TextOnlyCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.appNotificationType = str2;
        this.title = str3;
        this.body = str4;
        this.ctaText = str5;
        this.cta = str6;
        this.showHighlight = z4;
        if ((i13 & 128) == 0) {
            this.cardType = EnumC16533a.DEFAULT;
        } else {
            this.cardType = enumC16533a;
        }
        this.backgroundStyle = str7;
        if ((i13 & 512) == 0) {
            this.endIcon = null;
        } else {
            this.endIcon = str8;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.titleIconUrl = null;
        } else {
            this.titleIconUrl = str9;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.androidFeatureFlagName = null;
        } else {
            this.androidFeatureFlagName = str10;
        }
        if ((i13 & 4096) == 0) {
            this.templateName = null;
        } else {
            this.templateName = str11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.molecule.card.notification.HomeNotificationCardStyle", EnumC16533a.values());
    }

    public static /* synthetic */ TextOnlyCardModel copy$default(TextOnlyCardModel textOnlyCardModel, String str, String str2, String str3, String str4, String str5, String str6, boolean z4, EnumC16533a enumC16533a, String str7, String str8, String str9, String str10, String str11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = textOnlyCardModel.id;
        }
        return textOnlyCardModel.copy(str, (i13 & 2) != 0 ? textOnlyCardModel.appNotificationType : str2, (i13 & 4) != 0 ? textOnlyCardModel.title : str3, (i13 & 8) != 0 ? textOnlyCardModel.body : str4, (i13 & 16) != 0 ? textOnlyCardModel.ctaText : str5, (i13 & 32) != 0 ? textOnlyCardModel.cta : str6, (i13 & 64) != 0 ? textOnlyCardModel.showHighlight : z4, (i13 & 128) != 0 ? textOnlyCardModel.cardType : enumC16533a, (i13 & 256) != 0 ? textOnlyCardModel.backgroundStyle : str7, (i13 & 512) != 0 ? textOnlyCardModel.endIcon : str8, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? textOnlyCardModel.titleIconUrl : str9, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? textOnlyCardModel.androidFeatureFlagName : str10, (i13 & 4096) != 0 ? textOnlyCardModel.templateName : str11);
    }

    public static final /* synthetic */ void write$Self$design_models_release(TextOnlyCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.getId());
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.getAppNotificationType());
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeStringElement(serialDesc, 3, self.body);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.ctaText);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.cta);
        output.encodeBooleanElement(serialDesc, 6, self.showHighlight);
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.cardType != EnumC16533a.DEFAULT) {
            output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.cardType);
        }
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.backgroundStyle);
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.endIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.endIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.titleIconUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.titleIconUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.getAndroidFeatureFlagName() != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.getAndroidFeatureFlagName());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 12) && self.getTemplateName() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 12, stringSerializer, self.getTemplateName());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTitleIconUrl() {
        return this.titleIconUrl;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAndroidFeatureFlagName() {
        return this.androidFeatureFlagName;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTemplateName() {
        return this.templateName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppNotificationType() {
        return this.appNotificationType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowHighlight() {
        return this.showHighlight;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final EnumC16533a getCardType() {
        return this.cardType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    public final TextOnlyCardModel copy(String id4, String appNotificationType, String title, String body, String ctaText, String cta, boolean showHighlight, EnumC16533a cardType, String backgroundStyle, String endIcon, String titleIconUrl, String androidFeatureFlagName, String templateName) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(cardType, "cardType");
        return new TextOnlyCardModel(id4, appNotificationType, title, body, ctaText, cta, showHighlight, cardType, backgroundStyle, endIcon, titleIconUrl, androidFeatureFlagName, templateName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextOnlyCardModel)) {
            return false;
        }
        TextOnlyCardModel textOnlyCardModel = (TextOnlyCardModel) other;
        return AbstractC22676k.m65745e(this.id, textOnlyCardModel.id) && AbstractC22676k.m65745e(this.appNotificationType, textOnlyCardModel.appNotificationType) && AbstractC22676k.m65745e(this.title, textOnlyCardModel.title) && AbstractC22676k.m65745e(this.body, textOnlyCardModel.body) && AbstractC22676k.m65745e(this.ctaText, textOnlyCardModel.ctaText) && AbstractC22676k.m65745e(this.cta, textOnlyCardModel.cta) && this.showHighlight == textOnlyCardModel.showHighlight && this.cardType == textOnlyCardModel.cardType && AbstractC22676k.m65745e(this.backgroundStyle, textOnlyCardModel.backgroundStyle) && AbstractC22676k.m65745e(this.endIcon, textOnlyCardModel.endIcon) && AbstractC22676k.m65745e(this.titleIconUrl, textOnlyCardModel.titleIconUrl) && AbstractC22676k.m65745e(this.androidFeatureFlagName, textOnlyCardModel.androidFeatureFlagName) && AbstractC22676k.m65745e(this.templateName, textOnlyCardModel.templateName);
    }

    @Override // com.whoop.design.models.NotificationCardModel
    public String getAndroidFeatureFlagName() {
        return this.androidFeatureFlagName;
    }

    @Override // com.whoop.design.models.NotificationCardModel
    public String getAppNotificationType() {
        return this.appNotificationType;
    }

    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    public final String getBody() {
        return this.body;
    }

    public final EnumC16533a getCardType() {
        return this.cardType;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    @Override // com.whoop.design.models.NotificationCardModel
    public String getId() {
        return this.id;
    }

    public final boolean getShowHighlight() {
        return this.showHighlight;
    }

    @Override // com.whoop.design.models.NotificationCardModel
    public String getTemplateName() {
        return this.templateName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleIconUrl() {
        return this.titleIconUrl;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.appNotificationType;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title), 31, this.body);
        String str2 = this.ctaText;
        int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cta;
        int iHashCode3 = (this.cardType.hashCode() + AbstractC2875y.m8289b((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.showHighlight)) * 31;
        String str4 = this.backgroundStyle;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.endIcon;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.titleIconUrl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.androidFeatureFlagName;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.templateName;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.appNotificationType;
        String str3 = this.title;
        String str4 = this.body;
        String str5 = this.ctaText;
        String str6 = this.cta;
        boolean z4 = this.showHighlight;
        EnumC16533a enumC16533a = this.cardType;
        String str7 = this.backgroundStyle;
        String str8 = this.endIcon;
        String str9 = this.titleIconUrl;
        String str10 = this.androidFeatureFlagName;
        String str11 = this.templateName;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TextOnlyCardModel(id=", str, ", appNotificationType=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", body=", str4, ", ctaText=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", cta=", str6, ", showHighlight=");
        sbM32001t.append(z4);
        sbM32001t.append(", cardType=");
        sbM32001t.append(enumC16533a);
        sbM32001t.append(", backgroundStyle=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", endIcon=", str8, ", titleIconUrl=");
        AbstractC11266d.m30444B(sbM32001t, str9, ", androidFeatureFlagName=", str10, ", templateName=");
        return AbstractC25012a.m73376i(str11, ")", sbM32001t);
    }

    public TextOnlyCardModel(String id4, String str, String title, String body, String str2, String str3, boolean z4, EnumC16533a cardType, String str4, String str5, String str6, String str7, String str8) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(cardType, "cardType");
        this.id = id4;
        this.appNotificationType = str;
        this.title = title;
        this.body = body;
        this.ctaText = str2;
        this.cta = str3;
        this.showHighlight = z4;
        this.cardType = cardType;
        this.backgroundStyle = str4;
        this.endIcon = str5;
        this.titleIconUrl = str6;
        this.androidFeatureFlagName = str7;
        this.templateName = str8;
    }

    public /* synthetic */ TextOnlyCardModel(String str, String str2, String str3, String str4, String str5, String str6, boolean z4, EnumC16533a enumC16533a, String str7, String str8, String str9, String str10, String str11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, z4, (i13 & 128) != 0 ? EnumC16533a.DEFAULT : enumC16533a, str7, (i13 & 512) != 0 ? null : str8, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str9, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str10, (i13 & 4096) != 0 ? null : str11);
    }
}
