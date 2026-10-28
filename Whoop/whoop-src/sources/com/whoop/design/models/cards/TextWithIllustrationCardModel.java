package com.whoop.design.models.cards;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.NotificationCardModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import h01.EnumC16533a;
import kd1.EnumC22400l;
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
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import s52.C32223d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0002[ZB\u009b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018B¯\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b/\u0010\u001fJ\u0012\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b0\u0010\u001fJ\u0012\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b1\u0010\u001fJ¸\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b4\u0010\u001fJ\u0010\u00105\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b9\u0010:J'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\bA\u0010BR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010D\u001a\u0004\bE\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bF\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bG\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bH\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bI\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bK\u0010%R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bL\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010M\u001a\u0004\bN\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010O\u001a\u0004\bP\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bQ\u0010\u001fR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010R\u0012\u0004\bT\u0010U\u001a\u0004\bS\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bV\u0010\u001fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010D\u001a\u0004\bW\u0010\u001fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\bX\u0010\u001fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010D\u001a\u0004\bY\u0010\u001f¨\u0006\\"}, m65681d2 = {"Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;", "Lcom/whoop/design/models/NotificationCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "appNotificationType", "title", "body", "ctaText", "Lkd1/l;", "cta", "imageUrl", "", "showHighlight", "Lh01/a;", "cardType", "backgroundStyle", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "androidFeatureFlagName", "endIcon", "titleIconUrl", "templateName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/l;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/l;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lkd1/l;", "component7", "component8", "()Z", "component9", "()Lh01/a;", "component10", "component11", "()Lcom/whoop/navigation/e;", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/l;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getAppNotificationType", "getTitle", "getBody", "getCtaText", "Lkd1/l;", "getCta", "getImageUrl", "Z", "getShowHighlight", "Lh01/a;", "getCardType", "getBackgroundStyle", "Lcom/whoop/navigation/e;", "getNavigation", "getNavigation$annotations", "()V", "getAndroidFeatureFlagName", "getEndIcon", "getTitleIconUrl", "getTemplateName", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TextWithIllustrationCardModel implements NotificationCardModel, DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String androidFeatureFlagName;
    private final String appNotificationType;
    private final String backgroundStyle;
    private final String body;
    private final EnumC16533a cardType;
    private final EnumC22400l cta;
    private final String ctaText;
    private final String endIcon;
    private final String id;
    private final String imageUrl;
    private final C9598e navigation;
    private final boolean showHighlight;
    private final String templateName;
    private final String title;
    private final String titleIconUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/TextWithIllustrationCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TextWithIllustrationCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C32223d(22)), null, null, AbstractC30060g.m92087G(enumC23463i, new C32223d(23)), null, AbstractC30060g.m92087G(enumC23463i, new C32223d(24)), null, null, null, null};
    }

    public /* synthetic */ TextWithIllustrationCardModel(int i13, String str, String str2, String str3, String str4, String str5, EnumC22400l enumC22400l, String str6, boolean z4, EnumC16533a enumC16533a, String str7, C9598e c9598e, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if (1791 != (i13 & 1791)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1791, TextWithIllustrationCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.appNotificationType = str2;
        this.title = str3;
        this.body = str4;
        this.ctaText = str5;
        this.cta = enumC22400l;
        this.imageUrl = str6;
        this.showHighlight = z4;
        if ((i13 & 256) == 0) {
            this.cardType = EnumC16533a.DEFAULT;
        } else {
            this.cardType = enumC16533a;
        }
        this.backgroundStyle = str7;
        this.navigation = c9598e;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.androidFeatureFlagName = null;
        } else {
            this.androidFeatureFlagName = str8;
        }
        if ((i13 & 4096) == 0) {
            this.endIcon = null;
        } else {
            this.endIcon = str9;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.titleIconUrl = null;
        } else {
            this.titleIconUrl = str10;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.templateName = null;
        } else {
            this.templateName = str11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.util.HomeCtaType", EnumC22400l.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.molecule.card.notification.HomeNotificationCardStyle", EnumC16533a.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ void getNavigation$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(TextWithIllustrationCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.getId());
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.getAppNotificationType());
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeStringElement(serialDesc, 3, self.body);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.ctaText);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.cta);
        output.encodeStringElement(serialDesc, 6, self.imageUrl);
        output.encodeBooleanElement(serialDesc, 7, self.showHighlight);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.cardType != EnumC16533a.DEFAULT) {
            output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.cardType);
        }
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.backgroundStyle);
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.navigation);
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.getAndroidFeatureFlagName() != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.getAndroidFeatureFlagName());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.endIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, stringSerializer, self.endIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.titleIconUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, stringSerializer, self.titleIconUrl);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 14) && self.getTemplateName() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 14, stringSerializer, self.getTemplateName());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAndroidFeatureFlagName() {
        return this.androidFeatureFlagName;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTitleIconUrl() {
        return this.titleIconUrl;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
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
    public final EnumC22400l getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShowHighlight() {
        return this.showHighlight;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final EnumC16533a getCardType() {
        return this.cardType;
    }

    public final TextWithIllustrationCardModel copy(String id4, String appNotificationType, String title, String body, String ctaText, EnumC22400l cta, String imageUrl, boolean showHighlight, EnumC16533a cardType, String backgroundStyle, C9598e navigation, String androidFeatureFlagName, String endIcon, String titleIconUrl, String templateName) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(cardType, "cardType");
        return new TextWithIllustrationCardModel(id4, appNotificationType, title, body, ctaText, cta, imageUrl, showHighlight, cardType, backgroundStyle, navigation, androidFeatureFlagName, endIcon, titleIconUrl, templateName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextWithIllustrationCardModel)) {
            return false;
        }
        TextWithIllustrationCardModel textWithIllustrationCardModel = (TextWithIllustrationCardModel) other;
        return AbstractC22676k.m65745e(this.id, textWithIllustrationCardModel.id) && AbstractC22676k.m65745e(this.appNotificationType, textWithIllustrationCardModel.appNotificationType) && AbstractC22676k.m65745e(this.title, textWithIllustrationCardModel.title) && AbstractC22676k.m65745e(this.body, textWithIllustrationCardModel.body) && AbstractC22676k.m65745e(this.ctaText, textWithIllustrationCardModel.ctaText) && this.cta == textWithIllustrationCardModel.cta && AbstractC22676k.m65745e(this.imageUrl, textWithIllustrationCardModel.imageUrl) && this.showHighlight == textWithIllustrationCardModel.showHighlight && this.cardType == textWithIllustrationCardModel.cardType && AbstractC22676k.m65745e(this.backgroundStyle, textWithIllustrationCardModel.backgroundStyle) && AbstractC22676k.m65745e(this.navigation, textWithIllustrationCardModel.navigation) && AbstractC22676k.m65745e(this.androidFeatureFlagName, textWithIllustrationCardModel.androidFeatureFlagName) && AbstractC22676k.m65745e(this.endIcon, textWithIllustrationCardModel.endIcon) && AbstractC22676k.m65745e(this.titleIconUrl, textWithIllustrationCardModel.titleIconUrl) && AbstractC22676k.m65745e(this.templateName, textWithIllustrationCardModel.templateName);
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

    public final EnumC22400l getCta() {
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

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final C9598e getNavigation() {
        return this.navigation;
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
        EnumC22400l enumC22400l = this.cta;
        int iHashCode3 = (this.cardType.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode2 + (enumC22400l == null ? 0 : enumC22400l.hashCode())) * 31, 31, this.imageUrl), 31, this.showHighlight)) * 31;
        String str3 = this.backgroundStyle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C9598e c9598e = this.navigation;
        int iHashCode5 = (iHashCode4 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        String str4 = this.androidFeatureFlagName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.endIcon;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.titleIconUrl;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.templateName;
        return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.appNotificationType;
        String str3 = this.title;
        String str4 = this.body;
        String str5 = this.ctaText;
        EnumC22400l enumC22400l = this.cta;
        String str6 = this.imageUrl;
        boolean z4 = this.showHighlight;
        EnumC16533a enumC16533a = this.cardType;
        String str7 = this.backgroundStyle;
        C9598e c9598e = this.navigation;
        String str8 = this.androidFeatureFlagName;
        String str9 = this.endIcon;
        String str10 = this.titleIconUrl;
        String str11 = this.templateName;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TextWithIllustrationCardModel(id=", str, ", appNotificationType=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", body=", str4, ", ctaText=");
        sbM32001t.append(str5);
        sbM32001t.append(", cta=");
        sbM32001t.append(enumC22400l);
        sbM32001t.append(", imageUrl=");
        AbstractC38963t7.m124390t(sbM32001t, str6, ", showHighlight=", z4, ", cardType=");
        sbM32001t.append(enumC16533a);
        sbM32001t.append(", backgroundStyle=");
        sbM32001t.append(str7);
        sbM32001t.append(", navigation=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", androidFeatureFlagName=");
        sbM32001t.append(str8);
        sbM32001t.append(", endIcon=");
        AbstractC11266d.m30444B(sbM32001t, str9, ", titleIconUrl=", str10, ", templateName=");
        return AbstractC25012a.m73376i(str11, ")", sbM32001t);
    }

    public TextWithIllustrationCardModel(String id4, String str, String title, String body, String str2, EnumC22400l enumC22400l, String imageUrl, boolean z4, EnumC16533a cardType, String str3, C9598e c9598e, String str4, String str5, String str6, String str7) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(cardType, "cardType");
        this.id = id4;
        this.appNotificationType = str;
        this.title = title;
        this.body = body;
        this.ctaText = str2;
        this.cta = enumC22400l;
        this.imageUrl = imageUrl;
        this.showHighlight = z4;
        this.cardType = cardType;
        this.backgroundStyle = str3;
        this.navigation = c9598e;
        this.androidFeatureFlagName = str4;
        this.endIcon = str5;
        this.titleIconUrl = str6;
        this.templateName = str7;
    }

    public /* synthetic */ TextWithIllustrationCardModel(String str, String str2, String str3, String str4, String str5, EnumC22400l enumC22400l, String str6, boolean z4, EnumC16533a enumC16533a, String str7, C9598e c9598e, String str8, String str9, String str10, String str11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, enumC22400l, str6, z4, (i13 & 256) != 0 ? EnumC16533a.DEFAULT : enumC16533a, str7, c9598e, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str8, (i13 & 4096) != 0 ? null : str9, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str10, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str11);
    }
}
