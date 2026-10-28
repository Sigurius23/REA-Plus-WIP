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
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t42.C33538a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0002JIB}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0094\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b<\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b=\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b>\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b?\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\bD\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bE\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bF\u0010\u001aR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\bG\u0010\u001aR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\bH\u0010\u001a¨\u0006K"}, m65681d2 = {"Lcom/whoop/design/models/cards/TextAndImageCardModel;", "Lcom/whoop/design/models/NotificationCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "appNotificationType", "title", "body", "imageUrl", "", "showHighlight", "Lh01/a;", "cardType", "backgroundStyle", "endIcon", "titleIconUrl", "androidFeatureFlagName", "templateName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Z", "component7", "()Lh01/a;", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/cards/TextAndImageCardModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/TextAndImageCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getAppNotificationType", "getTitle", "getBody", "getImageUrl", "Z", "getShowHighlight", "Lh01/a;", "getCardType", "getBackgroundStyle", "getEndIcon", "getTitleIconUrl", "getAndroidFeatureFlagName", "getTemplateName", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TextAndImageCardModel implements NotificationCardModel, DesignSystemModel {
    public static final int $stable = 0;
    private final String androidFeatureFlagName;
    private final String appNotificationType;
    private final String backgroundStyle;
    private final String body;
    private final EnumC16533a cardType;
    private final String endIcon;
    private final String id;
    private final String imageUrl;
    private final boolean showHighlight;
    private final String templateName;
    private final String title;
    private final String titleIconUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33538a(28)), null, null, null, null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/TextAndImageCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/TextAndImageCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TextAndImageCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextAndImageCardModel(int i13, String str, String str2, String str3, String str4, String str5, boolean z4, EnumC16533a enumC16533a, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (191 != (i13 & 191)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 191, TextAndImageCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.appNotificationType = str2;
        this.title = str3;
        this.body = str4;
        this.imageUrl = str5;
        this.showHighlight = z4;
        if ((i13 & 64) == 0) {
            this.cardType = EnumC16533a.DEFAULT;
        } else {
            this.cardType = enumC16533a;
        }
        this.backgroundStyle = str6;
        if ((i13 & 256) == 0) {
            this.endIcon = null;
        } else {
            this.endIcon = str7;
        }
        if ((i13 & 512) == 0) {
            this.titleIconUrl = null;
        } else {
            this.titleIconUrl = str8;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.androidFeatureFlagName = null;
        } else {
            this.androidFeatureFlagName = str9;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.templateName = null;
        } else {
            this.templateName = str10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.molecule.card.notification.HomeNotificationCardStyle", EnumC16533a.values());
    }

    public static /* synthetic */ TextAndImageCardModel copy$default(TextAndImageCardModel textAndImageCardModel, String str, String str2, String str3, String str4, String str5, boolean z4, EnumC16533a enumC16533a, String str6, String str7, String str8, String str9, String str10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = textAndImageCardModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = textAndImageCardModel.appNotificationType;
        }
        if ((i13 & 4) != 0) {
            str3 = textAndImageCardModel.title;
        }
        if ((i13 & 8) != 0) {
            str4 = textAndImageCardModel.body;
        }
        if ((i13 & 16) != 0) {
            str5 = textAndImageCardModel.imageUrl;
        }
        if ((i13 & 32) != 0) {
            z4 = textAndImageCardModel.showHighlight;
        }
        if ((i13 & 64) != 0) {
            enumC16533a = textAndImageCardModel.cardType;
        }
        if ((i13 & 128) != 0) {
            str6 = textAndImageCardModel.backgroundStyle;
        }
        if ((i13 & 256) != 0) {
            str7 = textAndImageCardModel.endIcon;
        }
        if ((i13 & 512) != 0) {
            str8 = textAndImageCardModel.titleIconUrl;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str9 = textAndImageCardModel.androidFeatureFlagName;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str10 = textAndImageCardModel.templateName;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        EnumC16533a enumC16533a2 = enumC16533a;
        String str15 = str6;
        String str16 = str5;
        boolean z13 = z4;
        return textAndImageCardModel.copy(str, str2, str3, str4, str16, z13, enumC16533a2, str15, str13, str14, str11, str12);
    }

    public static final /* synthetic */ void write$Self$design_models_release(TextAndImageCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.getId());
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.getAppNotificationType());
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeStringElement(serialDesc, 3, self.body);
        output.encodeStringElement(serialDesc, 4, self.imageUrl);
        output.encodeBooleanElement(serialDesc, 5, self.showHighlight);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.cardType != EnumC16533a.DEFAULT) {
            output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.cardType);
        }
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.backgroundStyle);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.endIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.endIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.titleIconUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.titleIconUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.getAndroidFeatureFlagName() != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.getAndroidFeatureFlagName());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 11) && self.getTemplateName() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.getTemplateName());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTitleIconUrl() {
        return this.titleIconUrl;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAndroidFeatureFlagName() {
        return this.androidFeatureFlagName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
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
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShowHighlight() {
        return this.showHighlight;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final EnumC16533a getCardType() {
        return this.cardType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    public final TextAndImageCardModel copy(String id4, String appNotificationType, String title, String body, String imageUrl, boolean showHighlight, EnumC16533a cardType, String backgroundStyle, String endIcon, String titleIconUrl, String androidFeatureFlagName, String templateName) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(cardType, "cardType");
        return new TextAndImageCardModel(id4, appNotificationType, title, body, imageUrl, showHighlight, cardType, backgroundStyle, endIcon, titleIconUrl, androidFeatureFlagName, templateName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAndImageCardModel)) {
            return false;
        }
        TextAndImageCardModel textAndImageCardModel = (TextAndImageCardModel) other;
        return AbstractC22676k.m65745e(this.id, textAndImageCardModel.id) && AbstractC22676k.m65745e(this.appNotificationType, textAndImageCardModel.appNotificationType) && AbstractC22676k.m65745e(this.title, textAndImageCardModel.title) && AbstractC22676k.m65745e(this.body, textAndImageCardModel.body) && AbstractC22676k.m65745e(this.imageUrl, textAndImageCardModel.imageUrl) && this.showHighlight == textAndImageCardModel.showHighlight && this.cardType == textAndImageCardModel.cardType && AbstractC22676k.m65745e(this.backgroundStyle, textAndImageCardModel.backgroundStyle) && AbstractC22676k.m65745e(this.endIcon, textAndImageCardModel.endIcon) && AbstractC22676k.m65745e(this.titleIconUrl, textAndImageCardModel.titleIconUrl) && AbstractC22676k.m65745e(this.androidFeatureFlagName, textAndImageCardModel.androidFeatureFlagName) && AbstractC22676k.m65745e(this.templateName, textAndImageCardModel.templateName);
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

    public final String getEndIcon() {
        return this.endIcon;
    }

    @Override // com.whoop.design.models.NotificationCardModel
    public String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
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
        int iHashCode2 = (this.cardType.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title), 31, this.body), 31, this.imageUrl), 31, this.showHighlight)) * 31;
        String str2 = this.backgroundStyle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.endIcon;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.titleIconUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.androidFeatureFlagName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.templateName;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.appNotificationType;
        String str3 = this.title;
        String str4 = this.body;
        String str5 = this.imageUrl;
        boolean z4 = this.showHighlight;
        EnumC16533a enumC16533a = this.cardType;
        String str6 = this.backgroundStyle;
        String str7 = this.endIcon;
        String str8 = this.titleIconUrl;
        String str9 = this.androidFeatureFlagName;
        String str10 = this.templateName;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TextAndImageCardModel(id=", str, ", appNotificationType=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", body=", str4, ", imageUrl=");
        AbstractC38963t7.m124390t(sbM32001t, str5, ", showHighlight=", z4, ", cardType=");
        sbM32001t.append(enumC16533a);
        sbM32001t.append(", backgroundStyle=");
        sbM32001t.append(str6);
        sbM32001t.append(", endIcon=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", titleIconUrl=", str8, ", androidFeatureFlagName=");
        return AbstractC11266d.m30464r(sbM32001t, str9, ", templateName=", str10, ")");
    }

    public TextAndImageCardModel(String id4, String str, String title, String body, String imageUrl, boolean z4, EnumC16533a cardType, String str2, String str3, String str4, String str5, String str6) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(cardType, "cardType");
        this.id = id4;
        this.appNotificationType = str;
        this.title = title;
        this.body = body;
        this.imageUrl = imageUrl;
        this.showHighlight = z4;
        this.cardType = cardType;
        this.backgroundStyle = str2;
        this.endIcon = str3;
        this.titleIconUrl = str4;
        this.androidFeatureFlagName = str5;
        this.templateName = str6;
    }

    public /* synthetic */ TextAndImageCardModel(String str, String str2, String str3, String str4, String str5, boolean z4, EnumC16533a enumC16533a, String str6, String str7, String str8, String str9, String str10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, z4, (i13 & 64) != 0 ? EnumC16533a.DEFAULT : enumC16533a, str6, (i13 & 256) != 0 ? null : str7, (i13 & 512) != 0 ? null : str8, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str9, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str10);
    }
}
