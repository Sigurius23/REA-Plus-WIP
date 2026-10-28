package com.whoop.membership.management.domain.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import hb1.C17089l;
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
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IHBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u008a\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b<\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b=\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b@\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\bA\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\bB\u0010\u0019R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bE\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010&¨\u0006J"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "price", "strikethroughPrice", "priceSubtitle", "", "selected", "trackingLabel", "radioGroup", "disclaimer", "Lcom/whoop/navigation/e;", "destination", "tag", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "component7", "component8", "component9", "()Lcom/whoop/navigation/e;", "component10", "component11", "()Lcom/whoop/whoopaction/domain/models/Action;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;)Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getPrice", "getStrikethroughPrice", "getPriceSubtitle", "Z", "getSelected", "getTrackingLabel", "getRadioGroup", "getDisclaimer", "Lcom/whoop/navigation/e;", "getDestination", "getTag", "Lcom/whoop/whoopaction/domain/models/Action;", "getAction", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MembershipCheckoutRadioOptionModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final Action action;
    private final C9598e destination;
    private final String disclaimer;
    private final String price;
    private final String priceSubtitle;
    private final String radioGroup;
    private final boolean selected;
    private final String strikethroughPrice;
    private final String tag;
    private final String title;
    private final String trackingLabel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MembershipCheckoutRadioOptionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C17089l(20)), null, AbstractC30060g.m92087G(enumC23463i, new C17089l(21))};
    }

    public /* synthetic */ MembershipCheckoutRadioOptionModel(int i13, String str, String str2, String str3, String str4, boolean z4, String str5, String str6, String str7, C9598e c9598e, String str8, Action action, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, MembershipCheckoutRadioOptionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.price = str2;
        this.strikethroughPrice = str3;
        this.priceSubtitle = str4;
        this.selected = z4;
        this.trackingLabel = str5;
        this.radioGroup = str6;
        this.disclaimer = str7;
        this.destination = c9598e;
        this.tag = str8;
        this.action = action;
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

    public static /* synthetic */ MembershipCheckoutRadioOptionModel copy$default(MembershipCheckoutRadioOptionModel membershipCheckoutRadioOptionModel, String str, String str2, String str3, String str4, boolean z4, String str5, String str6, String str7, C9598e c9598e, String str8, Action action, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = membershipCheckoutRadioOptionModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = membershipCheckoutRadioOptionModel.price;
        }
        if ((i13 & 4) != 0) {
            str3 = membershipCheckoutRadioOptionModel.strikethroughPrice;
        }
        if ((i13 & 8) != 0) {
            str4 = membershipCheckoutRadioOptionModel.priceSubtitle;
        }
        if ((i13 & 16) != 0) {
            z4 = membershipCheckoutRadioOptionModel.selected;
        }
        if ((i13 & 32) != 0) {
            str5 = membershipCheckoutRadioOptionModel.trackingLabel;
        }
        if ((i13 & 64) != 0) {
            str6 = membershipCheckoutRadioOptionModel.radioGroup;
        }
        if ((i13 & 128) != 0) {
            str7 = membershipCheckoutRadioOptionModel.disclaimer;
        }
        if ((i13 & 256) != 0) {
            c9598e = membershipCheckoutRadioOptionModel.destination;
        }
        if ((i13 & 512) != 0) {
            str8 = membershipCheckoutRadioOptionModel.tag;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            action = membershipCheckoutRadioOptionModel.action;
        }
        String str9 = str8;
        Action action2 = action;
        String str10 = str7;
        C9598e c9598e2 = c9598e;
        String str11 = str5;
        String str12 = str6;
        boolean z13 = z4;
        String str13 = str3;
        return membershipCheckoutRadioOptionModel.copy(str, str2, str13, str4, z13, str11, str12, str10, c9598e2, str9, action2);
    }

    public static final /* synthetic */ void write$Self$membership_release(MembershipCheckoutRadioOptionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.price);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.strikethroughPrice);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.priceSubtitle);
        output.encodeBooleanElement(serialDesc, 4, self.selected);
        output.encodeStringElement(serialDesc, 5, self.trackingLabel);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.radioGroup);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.disclaimer);
        output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.tag);
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.action);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Action getAction() {
        return this.action;
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
    public final String getRadioGroup() {
        return this.radioGroup;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final MembershipCheckoutRadioOptionModel copy(String title, String price, String strikethroughPrice, String priceSubtitle, boolean selected, String trackingLabel, String radioGroup, String disclaimer, C9598e destination, String tag, Action action) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(trackingLabel, "trackingLabel");
        AbstractC22676k.m65750j(destination, "destination");
        return new MembershipCheckoutRadioOptionModel(title, price, strikethroughPrice, priceSubtitle, selected, trackingLabel, radioGroup, disclaimer, destination, tag, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembershipCheckoutRadioOptionModel)) {
            return false;
        }
        MembershipCheckoutRadioOptionModel membershipCheckoutRadioOptionModel = (MembershipCheckoutRadioOptionModel) other;
        return AbstractC22676k.m65745e(this.title, membershipCheckoutRadioOptionModel.title) && AbstractC22676k.m65745e(this.price, membershipCheckoutRadioOptionModel.price) && AbstractC22676k.m65745e(this.strikethroughPrice, membershipCheckoutRadioOptionModel.strikethroughPrice) && AbstractC22676k.m65745e(this.priceSubtitle, membershipCheckoutRadioOptionModel.priceSubtitle) && this.selected == membershipCheckoutRadioOptionModel.selected && AbstractC22676k.m65745e(this.trackingLabel, membershipCheckoutRadioOptionModel.trackingLabel) && AbstractC22676k.m65745e(this.radioGroup, membershipCheckoutRadioOptionModel.radioGroup) && AbstractC22676k.m65745e(this.disclaimer, membershipCheckoutRadioOptionModel.disclaimer) && AbstractC22676k.m65745e(this.destination, membershipCheckoutRadioOptionModel.destination) && AbstractC22676k.m65745e(this.tag, membershipCheckoutRadioOptionModel.tag) && AbstractC22676k.m65745e(this.action, membershipCheckoutRadioOptionModel.action);
    }

    public final Action getAction() {
        return this.action;
    }

    public final C9598e getDestination() {
        return this.destination;
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

    public final String getRadioGroup() {
        return this.radioGroup;
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
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC2875y.m8289b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.selected), 31, this.trackingLabel);
        String str3 = this.radioGroup;
        int iHashCode2 = (iM30450d2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.disclaimer;
        int iM114673a = AbstractC36095b.m114673a(this.destination, (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.tag;
        int iHashCode3 = (iM114673a + (str5 == null ? 0 : str5.hashCode())) * 31;
        Action action = this.action;
        return iHashCode3 + (action != null ? action.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.price;
        String str3 = this.strikethroughPrice;
        String str4 = this.priceSubtitle;
        boolean z4 = this.selected;
        String str5 = this.trackingLabel;
        String str6 = this.radioGroup;
        String str7 = this.disclaimer;
        C9598e c9598e = this.destination;
        String str8 = this.tag;
        Action action = this.action;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MembershipCheckoutRadioOptionModel(title=", str, ", price=", str2, ", strikethroughPrice=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", priceSubtitle=", str4, ", selected=");
        AbstractC38963t7.m124391u(sbM32001t, z4, ", trackingLabel=", str5, ", radioGroup=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", disclaimer=", str7, ", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", tag=");
        sbM32001t.append(str8);
        sbM32001t.append(", action=");
        sbM32001t.append(action);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public MembershipCheckoutRadioOptionModel(String title, String price, String str, String str2, boolean z4, String trackingLabel, String str3, String str4, C9598e destination, String str5, Action action) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(trackingLabel, "trackingLabel");
        AbstractC22676k.m65750j(destination, "destination");
        this.title = title;
        this.price = price;
        this.strikethroughPrice = str;
        this.priceSubtitle = str2;
        this.selected = z4;
        this.trackingLabel = trackingLabel;
        this.radioGroup = str3;
        this.disclaimer = str4;
        this.destination = destination;
        this.tag = str5;
        this.action = action;
    }
}
