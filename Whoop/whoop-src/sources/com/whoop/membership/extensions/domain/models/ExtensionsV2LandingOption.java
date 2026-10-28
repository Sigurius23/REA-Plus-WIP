package com.whoop.membership.extensions.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import gw1.C16268a;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONBs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0094\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u0010\u0010,\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010:\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010:\u0012\u0004\bA\u0010?\u001a\u0004\b@\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\bD\u0010\u001aR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010:\u0012\u0004\bF\u0010?\u001a\u0004\bE\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\bG\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\bH\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bJ\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\bL\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\bM\u0010\u001a¨\u0006P"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;", "", "", "title", "price", "strikethroughPrice", "priceSubtitle", "", "selected", "trackingLabel", "ctaTitle", "secondaryCtaTitle", "disclaimer", "Lcom/whoop/navigation/e;", "checkout", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "tag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "component7", "component8", "component9", "component10", "()Lcom/whoop/navigation/e;", "component11", "()Lcom/whoop/whoopaction/domain/models/Action;", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getPrice", "getStrikethroughPrice", "getStrikethroughPrice$annotations", "()V", "getPriceSubtitle", "getPriceSubtitle$annotations", "Z", "getSelected", "getTrackingLabel", "getCtaTitle", "getCtaTitle$annotations", "getSecondaryCtaTitle", "getDisclaimer", "Lcom/whoop/navigation/e;", "getCheckout", "Lcom/whoop/whoopaction/domain/models/Action;", "getAction", "getTag", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExtensionsV2LandingOption {
    private static final InterfaceC23462h[] $childSerializers;
    private final Action action;
    private final C9598e checkout;

    @SerializedName("cta_title")
    private final String ctaTitle;
    private final String disclaimer;
    private final String price;

    @SerializedName("price_subtitle")
    private final String priceSubtitle;

    @SerializedName("secondary_cta_title")
    private final String secondaryCtaTitle;
    private final boolean selected;

    @SerializedName("strikethrough_price")
    private final String strikethroughPrice;
    private final String tag;
    private final String title;
    private final String trackingLabel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExtensionsV2LandingOption$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C16268a(1)), AbstractC30060g.m92087G(enumC23463i, new C16268a(2)), null};
    }

    public /* synthetic */ ExtensionsV2LandingOption(int i13, String str, String str2, String str3, String str4, boolean z4, String str5, String str6, String str7, String str8, C9598e c9598e, Action action, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i13 & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4095, ExtensionsV2LandingOption$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.price = str2;
        this.strikethroughPrice = str3;
        this.priceSubtitle = str4;
        this.selected = z4;
        this.trackingLabel = str5;
        this.ctaTitle = str6;
        this.secondaryCtaTitle = str7;
        this.disclaimer = str8;
        this.checkout = c9598e;
        this.action = action;
        this.tag = str9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ExtensionsV2LandingOption copy$default(ExtensionsV2LandingOption extensionsV2LandingOption, String str, String str2, String str3, String str4, boolean z4, String str5, String str6, String str7, String str8, C9598e c9598e, Action action, String str9, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = extensionsV2LandingOption.title;
        }
        if ((i13 & 2) != 0) {
            str2 = extensionsV2LandingOption.price;
        }
        if ((i13 & 4) != 0) {
            str3 = extensionsV2LandingOption.strikethroughPrice;
        }
        if ((i13 & 8) != 0) {
            str4 = extensionsV2LandingOption.priceSubtitle;
        }
        if ((i13 & 16) != 0) {
            z4 = extensionsV2LandingOption.selected;
        }
        if ((i13 & 32) != 0) {
            str5 = extensionsV2LandingOption.trackingLabel;
        }
        if ((i13 & 64) != 0) {
            str6 = extensionsV2LandingOption.ctaTitle;
        }
        if ((i13 & 128) != 0) {
            str7 = extensionsV2LandingOption.secondaryCtaTitle;
        }
        if ((i13 & 256) != 0) {
            str8 = extensionsV2LandingOption.disclaimer;
        }
        if ((i13 & 512) != 0) {
            c9598e = extensionsV2LandingOption.checkout;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            action = extensionsV2LandingOption.action;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str9 = extensionsV2LandingOption.tag;
        }
        Action action2 = action;
        String str10 = str9;
        String str11 = str8;
        C9598e c9598e2 = c9598e;
        String str12 = str6;
        String str13 = str7;
        boolean z13 = z4;
        String str14 = str5;
        return extensionsV2LandingOption.copy(str, str2, str3, str4, z13, str14, str12, str13, str11, c9598e2, action2, str10);
    }

    @InterfaceC37143h("cta_title")
    public static /* synthetic */ void getCtaTitle$annotations() {
    }

    @InterfaceC37143h("price_subtitle")
    public static /* synthetic */ void getPriceSubtitle$annotations() {
    }

    @InterfaceC37143h("strikethrough_price")
    public static /* synthetic */ void getStrikethroughPrice$annotations() {
    }

    public static final /* synthetic */ void write$Self$membership_release(ExtensionsV2LandingOption self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.price);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.strikethroughPrice);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.priceSubtitle);
        output.encodeBooleanElement(serialDesc, 4, self.selected);
        output.encodeStringElement(serialDesc, 5, self.trackingLabel);
        output.encodeStringElement(serialDesc, 6, self.ctaTitle);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.secondaryCtaTitle);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.disclaimer);
        output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.checkout);
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.action);
        output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.tag);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final C9598e getCheckout() {
        return this.checkout;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStrikethroughPrice() {
        return this.strikethroughPrice;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPriceSubtitle() {
        return this.priceSubtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTrackingLabel() {
        return this.trackingLabel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSecondaryCtaTitle() {
        return this.secondaryCtaTitle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final ExtensionsV2LandingOption copy(String title, String price, String strikethroughPrice, String priceSubtitle, boolean selected, String trackingLabel, String ctaTitle, String secondaryCtaTitle, String disclaimer, C9598e checkout, Action action, String tag) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(trackingLabel, "trackingLabel");
        AbstractC22676k.m65750j(ctaTitle, "ctaTitle");
        AbstractC22676k.m65750j(checkout, "checkout");
        return new ExtensionsV2LandingOption(title, price, strikethroughPrice, priceSubtitle, selected, trackingLabel, ctaTitle, secondaryCtaTitle, disclaimer, checkout, action, tag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtensionsV2LandingOption)) {
            return false;
        }
        ExtensionsV2LandingOption extensionsV2LandingOption = (ExtensionsV2LandingOption) other;
        return AbstractC22676k.m65745e(this.title, extensionsV2LandingOption.title) && AbstractC22676k.m65745e(this.price, extensionsV2LandingOption.price) && AbstractC22676k.m65745e(this.strikethroughPrice, extensionsV2LandingOption.strikethroughPrice) && AbstractC22676k.m65745e(this.priceSubtitle, extensionsV2LandingOption.priceSubtitle) && this.selected == extensionsV2LandingOption.selected && AbstractC22676k.m65745e(this.trackingLabel, extensionsV2LandingOption.trackingLabel) && AbstractC22676k.m65745e(this.ctaTitle, extensionsV2LandingOption.ctaTitle) && AbstractC22676k.m65745e(this.secondaryCtaTitle, extensionsV2LandingOption.secondaryCtaTitle) && AbstractC22676k.m65745e(this.disclaimer, extensionsV2LandingOption.disclaimer) && AbstractC22676k.m65745e(this.checkout, extensionsV2LandingOption.checkout) && AbstractC22676k.m65745e(this.action, extensionsV2LandingOption.action) && AbstractC22676k.m65745e(this.tag, extensionsV2LandingOption.tag);
    }

    public final Action getAction() {
        return this.action;
    }

    public final C9598e getCheckout() {
        return this.checkout;
    }

    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getPriceSubtitle() {
        return this.priceSubtitle;
    }

    public final String getSecondaryCtaTitle() {
        return this.secondaryCtaTitle;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getStrikethroughPrice() {
        return this.strikethroughPrice;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackingLabel() {
        return this.trackingLabel;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.price);
        String str = this.strikethroughPrice;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.priceSubtitle;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.selected), 31, this.trackingLabel), 31, this.ctaTitle);
        String str3 = this.secondaryCtaTitle;
        int iHashCode2 = (iM30450d2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.disclaimer;
        int iM114673a = AbstractC36095b.m114673a(this.checkout, (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        Action action = this.action;
        int iHashCode3 = (iM114673a + (action == null ? 0 : action.hashCode())) * 31;
        String str5 = this.tag;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.price;
        String str3 = this.strikethroughPrice;
        String str4 = this.priceSubtitle;
        boolean z4 = this.selected;
        String str5 = this.trackingLabel;
        String str6 = this.ctaTitle;
        String str7 = this.secondaryCtaTitle;
        String str8 = this.disclaimer;
        C9598e c9598e = this.checkout;
        Action action = this.action;
        String str9 = this.tag;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExtensionsV2LandingOption(title=", str, ", price=", str2, ", strikethroughPrice=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", priceSubtitle=", str4, ", selected=");
        AbstractC38963t7.m124391u(sbM32001t, z4, ", trackingLabel=", str5, ", ctaTitle=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", secondaryCtaTitle=", str7, ", disclaimer=");
        AbstractC30007c.m91827B(sbM32001t, str8, ", checkout=", c9598e, ", action=");
        sbM32001t.append(action);
        sbM32001t.append(", tag=");
        sbM32001t.append(str9);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ExtensionsV2LandingOption(String title, String price, String str, String str2, boolean z4, String trackingLabel, String ctaTitle, String str3, String str4, C9598e checkout, Action action, String str5) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(trackingLabel, "trackingLabel");
        AbstractC22676k.m65750j(ctaTitle, "ctaTitle");
        AbstractC22676k.m65750j(checkout, "checkout");
        this.title = title;
        this.price = price;
        this.strikethroughPrice = str;
        this.priceSubtitle = str2;
        this.selected = z4;
        this.trackingLabel = trackingLabel;
        this.ctaTitle = ctaTitle;
        this.secondaryCtaTitle = str3;
        this.disclaimer = str4;
        this.checkout = checkout;
        this.action = action;
        this.tag = str5;
    }
}
