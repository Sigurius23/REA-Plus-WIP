package com.whoop.payments.stripebottomsheettile.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ItemVisibilityStateEnum;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import cu2.C11132l;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IJBs\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0092\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b;\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b<\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b=\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b>\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b?\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b@\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\bA\u0010\u0018R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010B\u0012\u0004\bD\u0010E\u001a\u0004\bC\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010$¨\u0006K"}, m65681d2 = {"Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "paymentMethodImageUrl", "title", "subtitle", "suffixTitle", "suffixSubtitle", "leftIcon", "rightIcon", "trackingId", "style", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/items/ItemVisibilityStateEnum;", "menuItemState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Lcom/whoop/navigation/e;", "component11", "()Lcom/whoop/design/models/items/ItemVisibilityStateEnum;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;)Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_release", "(Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getPaymentMethodImageUrl", "getTitle", "getSubtitle", "getSuffixTitle", "getSuffixSubtitle", "getLeftIcon", "getRightIcon", "getTrackingId", "getStyle", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Lcom/whoop/design/models/items/ItemVisibilityStateEnum;", "getMenuItemState", "Companion", "$serializer", "a", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PaymentMethodMenuTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e destination;
    private final String leftIcon;
    private final ItemVisibilityStateEnum menuItemState;
    private final String paymentMethodImageUrl;
    private final String rightIcon;
    private final String style;
    private final String subtitle;
    private final String suffixSubtitle;
    private final String suffixTitle;
    private final String title;
    private final String trackingId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    /* JADX INFO: renamed from: com.whoop.payments.stripebottomsheettile.model.PaymentMethodMenuTileModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;", "serializer", "()Lwc3/c;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PaymentMethodMenuTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C11132l(10)), AbstractC30060g.m92087G(enumC23463i, new C11132l(11))};
    }

    public /* synthetic */ PaymentMethodMenuTileModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, C9598e c9598e, ItemVisibilityStateEnum itemVisibilityStateEnum, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, PaymentMethodMenuTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.paymentMethodImageUrl = str;
        this.title = str2;
        this.subtitle = str3;
        this.suffixTitle = str4;
        this.suffixSubtitle = str5;
        this.leftIcon = str6;
        this.rightIcon = str7;
        this.trackingId = str8;
        this.style = str9;
        this.destination = c9598e;
        this.menuItemState = itemVisibilityStateEnum;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ItemVisibilityStateEnum", ItemVisibilityStateEnum.values());
    }

    public static /* synthetic */ PaymentMethodMenuTileModel copy$default(PaymentMethodMenuTileModel paymentMethodMenuTileModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, C9598e c9598e, ItemVisibilityStateEnum itemVisibilityStateEnum, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = paymentMethodMenuTileModel.paymentMethodImageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = paymentMethodMenuTileModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = paymentMethodMenuTileModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            str4 = paymentMethodMenuTileModel.suffixTitle;
        }
        if ((i13 & 16) != 0) {
            str5 = paymentMethodMenuTileModel.suffixSubtitle;
        }
        if ((i13 & 32) != 0) {
            str6 = paymentMethodMenuTileModel.leftIcon;
        }
        if ((i13 & 64) != 0) {
            str7 = paymentMethodMenuTileModel.rightIcon;
        }
        if ((i13 & 128) != 0) {
            str8 = paymentMethodMenuTileModel.trackingId;
        }
        if ((i13 & 256) != 0) {
            str9 = paymentMethodMenuTileModel.style;
        }
        if ((i13 & 512) != 0) {
            c9598e = paymentMethodMenuTileModel.destination;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            itemVisibilityStateEnum = paymentMethodMenuTileModel.menuItemState;
        }
        C9598e c9598e2 = c9598e;
        ItemVisibilityStateEnum itemVisibilityStateEnum2 = itemVisibilityStateEnum;
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return paymentMethodMenuTileModel.copy(str, str2, str15, str4, str14, str12, str13, str10, str11, c9598e2, itemVisibilityStateEnum2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$payments_release(PaymentMethodMenuTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.paymentMethodImageUrl);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.suffixTitle);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.suffixSubtitle);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.leftIcon);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.rightIcon);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.trackingId);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.style);
        output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.menuItemState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentMethodImageUrl() {
        return this.paymentMethodImageUrl;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ItemVisibilityStateEnum getMenuItemState() {
        return this.menuItemState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSuffixTitle() {
        return this.suffixTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSuffixSubtitle() {
        return this.suffixSubtitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTrackingId() {
        return this.trackingId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final PaymentMethodMenuTileModel copy(String paymentMethodImageUrl, String title, String subtitle, String suffixTitle, String suffixSubtitle, String leftIcon, String rightIcon, String trackingId, String style, C9598e destination, ItemVisibilityStateEnum menuItemState) {
        AbstractC22676k.m65750j(title, "title");
        return new PaymentMethodMenuTileModel(paymentMethodImageUrl, title, subtitle, suffixTitle, suffixSubtitle, leftIcon, rightIcon, trackingId, style, destination, menuItemState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodMenuTileModel)) {
            return false;
        }
        PaymentMethodMenuTileModel paymentMethodMenuTileModel = (PaymentMethodMenuTileModel) other;
        return AbstractC22676k.m65745e(this.paymentMethodImageUrl, paymentMethodMenuTileModel.paymentMethodImageUrl) && AbstractC22676k.m65745e(this.title, paymentMethodMenuTileModel.title) && AbstractC22676k.m65745e(this.subtitle, paymentMethodMenuTileModel.subtitle) && AbstractC22676k.m65745e(this.suffixTitle, paymentMethodMenuTileModel.suffixTitle) && AbstractC22676k.m65745e(this.suffixSubtitle, paymentMethodMenuTileModel.suffixSubtitle) && AbstractC22676k.m65745e(this.leftIcon, paymentMethodMenuTileModel.leftIcon) && AbstractC22676k.m65745e(this.rightIcon, paymentMethodMenuTileModel.rightIcon) && AbstractC22676k.m65745e(this.trackingId, paymentMethodMenuTileModel.trackingId) && AbstractC22676k.m65745e(this.style, paymentMethodMenuTileModel.style) && AbstractC22676k.m65745e(this.destination, paymentMethodMenuTileModel.destination) && this.menuItemState == paymentMethodMenuTileModel.menuItemState;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final ItemVisibilityStateEnum getMenuItemState() {
        return this.menuItemState;
    }

    public final String getPaymentMethodImageUrl() {
        return this.paymentMethodImageUrl;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSuffixSubtitle() {
        return this.suffixSubtitle;
    }

    public final String getSuffixTitle() {
        return this.suffixTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackingId() {
        return this.trackingId;
    }

    public int hashCode() {
        String str = this.paymentMethodImageUrl;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        String str2 = this.subtitle;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.suffixTitle;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.suffixSubtitle;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.leftIcon;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rightIcon;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.trackingId;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.style;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode8 = (iHashCode7 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        ItemVisibilityStateEnum itemVisibilityStateEnum = this.menuItemState;
        return iHashCode8 + (itemVisibilityStateEnum != null ? itemVisibilityStateEnum.hashCode() : 0);
    }

    public String toString() {
        String str = this.paymentMethodImageUrl;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.suffixTitle;
        String str5 = this.suffixSubtitle;
        String str6 = this.leftIcon;
        String str7 = this.rightIcon;
        String str8 = this.trackingId;
        String str9 = this.style;
        C9598e c9598e = this.destination;
        ItemVisibilityStateEnum itemVisibilityStateEnum = this.menuItemState;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PaymentMethodMenuTileModel(paymentMethodImageUrl=", str, ", title=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", suffixTitle=", str4, ", suffixSubtitle=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", leftIcon=", str6, ", rightIcon=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", trackingId=", str8, ", style=");
        AbstractC30007c.m91827B(sbM32001t, str9, ", destination=", c9598e, ", menuItemState=");
        sbM32001t.append(itemVisibilityStateEnum);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public PaymentMethodMenuTileModel(String str, String title, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C9598e c9598e, ItemVisibilityStateEnum itemVisibilityStateEnum) {
        AbstractC22676k.m65750j(title, "title");
        this.paymentMethodImageUrl = str;
        this.title = title;
        this.subtitle = str2;
        this.suffixTitle = str3;
        this.suffixSubtitle = str4;
        this.leftIcon = str5;
        this.rightIcon = str6;
        this.trackingId = str7;
        this.style = str8;
        this.destination = c9598e;
        this.menuItemState = itemVisibilityStateEnum;
    }
}
