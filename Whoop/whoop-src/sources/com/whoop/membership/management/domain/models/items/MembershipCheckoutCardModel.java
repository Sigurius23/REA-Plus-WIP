package com.whoop.membership.management.domain.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hb1.C17089l;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0002]\\B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019B·\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0012\u00100\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010 J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010 Jº\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010 J\u0010\u00107\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b<\u0010=J'\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010G\u001a\u0004\bI\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bJ\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bK\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bL\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010M\u001a\u0004\bN\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bO\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bP\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\bR\u0010*R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\bT\u0010,R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010U\u001a\u0004\bV\u0010.R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bW\u0010 R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010X\u001a\u0004\bY\u00101R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010G\u001a\u0004\bZ\u0010 R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010G\u001a\u0004\b[\u0010 ¨\u0006^"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "subtitle", "expandedSubtitle", "price", "expandedPrice", "", "Lcom/whoop/membership/management/domain/models/items/CheckoutCardSummaryItemModel;", "summaryItems", "expandTitle", "expandText", "Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;", "paymentOptions", "Lcom/whoop/membership/management/domain/models/items/CtaModel;", "primaryCta", "Lcom/whoop/membership/management/domain/models/items/CtaWithNullableDestinationModel;", "secondaryCta", "footerText", "Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;", "confirmModal", "style", "checkoutType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;Lcom/whoop/membership/management/domain/models/items/CtaWithNullableDestinationModel;Ljava/lang/String;Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;Lcom/whoop/membership/management/domain/models/items/CtaWithNullableDestinationModel;Ljava/lang/String;Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "()Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;", "component10", "()Lcom/whoop/membership/management/domain/models/items/CtaModel;", "component11", "()Lcom/whoop/membership/management/domain/models/items/CtaWithNullableDestinationModel;", "component12", "component13", "()Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;Lcom/whoop/membership/management/domain/models/items/CtaWithNullableDestinationModel;Ljava/lang/String;Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getSubtitle", "getExpandedSubtitle", "getPrice", "getExpandedPrice", "Ljava/util/List;", "getSummaryItems", "getExpandTitle", "getExpandText", "Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;", "getPaymentOptions", "Lcom/whoop/membership/management/domain/models/items/CtaModel;", "getPrimaryCta", "Lcom/whoop/membership/management/domain/models/items/CtaWithNullableDestinationModel;", "getSecondaryCta", "getFooterText", "Lcom/whoop/membership/management/domain/models/items/ConfirmModalModel;", "getConfirmModal", "getStyle", "getCheckoutType", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MembershipCheckoutCardModel implements DesignSystemModel {
    private final String checkoutType;
    private final ConfirmModalModel confirmModal;
    private final String expandText;
    private final String expandTitle;
    private final String expandedPrice;
    private final String expandedSubtitle;
    private final String footerText;
    private final CheckoutPaymentOptionsModel paymentOptions;
    private final String price;
    private final CtaModel primaryCta;
    private final CtaWithNullableDestinationModel secondaryCta;
    private final String style;
    private final String subtitle;
    private final List<CheckoutCardSummaryItemModel> summaryItems;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C17089l(19)), null, null, null, null, null, null, null, null, null};

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MembershipCheckoutCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MembershipCheckoutCardModel(int i13, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, CheckoutPaymentOptionsModel checkoutPaymentOptionsModel, CtaModel ctaModel, CtaWithNullableDestinationModel ctaWithNullableDestinationModel, String str8, ConfirmModalModel confirmModalModel, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (32767 != (i13 & 32767)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 32767, MembershipCheckoutCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.expandedSubtitle = str3;
        this.price = str4;
        this.expandedPrice = str5;
        this.summaryItems = list;
        this.expandTitle = str6;
        this.expandText = str7;
        this.paymentOptions = checkoutPaymentOptionsModel;
        this.primaryCta = ctaModel;
        this.secondaryCta = ctaWithNullableDestinationModel;
        this.footerText = str8;
        this.confirmModal = confirmModalModel;
        this.style = str9;
        this.checkoutType = str10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CheckoutCardSummaryItemModel$$serializer.INSTANCE);
    }

    public static final /* synthetic */ void write$Self$membership_release(MembershipCheckoutCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.expandedSubtitle);
        output.encodeStringElement(serialDesc, 3, self.price);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.expandedPrice);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.summaryItems);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.expandTitle);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.expandText);
        output.encodeNullableSerializableElement(serialDesc, 8, CheckoutPaymentOptionsModel$$serializer.INSTANCE, self.paymentOptions);
        output.encodeSerializableElement(serialDesc, 9, CtaModel$$serializer.INSTANCE, self.primaryCta);
        output.encodeNullableSerializableElement(serialDesc, 10, CtaWithNullableDestinationModel$$serializer.INSTANCE, self.secondaryCta);
        output.encodeStringElement(serialDesc, 11, self.footerText);
        output.encodeNullableSerializableElement(serialDesc, 12, ConfirmModalModel$$serializer.INSTANCE, self.confirmModal);
        output.encodeStringElement(serialDesc, 13, self.style);
        output.encodeStringElement(serialDesc, 14, self.checkoutType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final CtaModel getPrimaryCta() {
        return this.primaryCta;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final CtaWithNullableDestinationModel getSecondaryCta() {
        return this.secondaryCta;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ConfirmModalModel getConfirmModal() {
        return this.confirmModal;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCheckoutType() {
        return this.checkoutType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExpandedSubtitle() {
        return this.expandedSubtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExpandedPrice() {
        return this.expandedPrice;
    }

    public final List<CheckoutCardSummaryItemModel> component6() {
        return this.summaryItems;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getExpandTitle() {
        return this.expandTitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getExpandText() {
        return this.expandText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final CheckoutPaymentOptionsModel getPaymentOptions() {
        return this.paymentOptions;
    }

    public final MembershipCheckoutCardModel copy(String title, String subtitle, String expandedSubtitle, String price, String expandedPrice, List<CheckoutCardSummaryItemModel> summaryItems, String expandTitle, String expandText, CheckoutPaymentOptionsModel paymentOptions, CtaModel primaryCta, CtaWithNullableDestinationModel secondaryCta, String footerText, ConfirmModalModel confirmModal, String style, String checkoutType) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(summaryItems, "summaryItems");
        AbstractC22676k.m65750j(primaryCta, "primaryCta");
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(checkoutType, "checkoutType");
        return new MembershipCheckoutCardModel(title, subtitle, expandedSubtitle, price, expandedPrice, summaryItems, expandTitle, expandText, paymentOptions, primaryCta, secondaryCta, footerText, confirmModal, style, checkoutType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembershipCheckoutCardModel)) {
            return false;
        }
        MembershipCheckoutCardModel membershipCheckoutCardModel = (MembershipCheckoutCardModel) other;
        return AbstractC22676k.m65745e(this.title, membershipCheckoutCardModel.title) && AbstractC22676k.m65745e(this.subtitle, membershipCheckoutCardModel.subtitle) && AbstractC22676k.m65745e(this.expandedSubtitle, membershipCheckoutCardModel.expandedSubtitle) && AbstractC22676k.m65745e(this.price, membershipCheckoutCardModel.price) && AbstractC22676k.m65745e(this.expandedPrice, membershipCheckoutCardModel.expandedPrice) && AbstractC22676k.m65745e(this.summaryItems, membershipCheckoutCardModel.summaryItems) && AbstractC22676k.m65745e(this.expandTitle, membershipCheckoutCardModel.expandTitle) && AbstractC22676k.m65745e(this.expandText, membershipCheckoutCardModel.expandText) && AbstractC22676k.m65745e(this.paymentOptions, membershipCheckoutCardModel.paymentOptions) && AbstractC22676k.m65745e(this.primaryCta, membershipCheckoutCardModel.primaryCta) && AbstractC22676k.m65745e(this.secondaryCta, membershipCheckoutCardModel.secondaryCta) && AbstractC22676k.m65745e(this.footerText, membershipCheckoutCardModel.footerText) && AbstractC22676k.m65745e(this.confirmModal, membershipCheckoutCardModel.confirmModal) && AbstractC22676k.m65745e(this.style, membershipCheckoutCardModel.style) && AbstractC22676k.m65745e(this.checkoutType, membershipCheckoutCardModel.checkoutType);
    }

    public final String getCheckoutType() {
        return this.checkoutType;
    }

    public final ConfirmModalModel getConfirmModal() {
        return this.confirmModal;
    }

    public final String getExpandText() {
        return this.expandText;
    }

    public final String getExpandTitle() {
        return this.expandTitle;
    }

    public final String getExpandedPrice() {
        return this.expandedPrice;
    }

    public final String getExpandedSubtitle() {
        return this.expandedSubtitle;
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final CheckoutPaymentOptionsModel getPaymentOptions() {
        return this.paymentOptions;
    }

    public final String getPrice() {
        return this.price;
    }

    public final CtaModel getPrimaryCta() {
        return this.primaryCta;
    }

    public final CtaWithNullableDestinationModel getSecondaryCta() {
        return this.secondaryCta;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<CheckoutCardSummaryItemModel> getSummaryItems() {
        return this.summaryItems;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle);
        String str = this.expandedSubtitle;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.price);
        String str2 = this.expandedPrice;
        int iM31983b = AbstractC11895b.m31983b((iM30450d2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.summaryItems);
        String str3 = this.expandTitle;
        int iHashCode = (iM31983b + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expandText;
        int iHashCode2 = (iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
        CheckoutPaymentOptionsModel checkoutPaymentOptionsModel = this.paymentOptions;
        int iHashCode3 = (this.primaryCta.hashCode() + ((iHashCode2 + (checkoutPaymentOptionsModel == null ? 0 : checkoutPaymentOptionsModel.hashCode())) * 31)) * 31;
        CtaWithNullableDestinationModel ctaWithNullableDestinationModel = this.secondaryCta;
        int iM30450d3 = AbstractC11266d.m30450d((iHashCode3 + (ctaWithNullableDestinationModel == null ? 0 : ctaWithNullableDestinationModel.hashCode())) * 31, 31, this.footerText);
        ConfirmModalModel confirmModalModel = this.confirmModal;
        return this.checkoutType.hashCode() + AbstractC11266d.m30450d((iM30450d3 + (confirmModalModel != null ? confirmModalModel.hashCode() : 0)) * 31, 31, this.style);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.expandedSubtitle;
        String str4 = this.price;
        String str5 = this.expandedPrice;
        List<CheckoutCardSummaryItemModel> list = this.summaryItems;
        String str6 = this.expandTitle;
        String str7 = this.expandText;
        CheckoutPaymentOptionsModel checkoutPaymentOptionsModel = this.paymentOptions;
        CtaModel ctaModel = this.primaryCta;
        CtaWithNullableDestinationModel ctaWithNullableDestinationModel = this.secondaryCta;
        String str8 = this.footerText;
        ConfirmModalModel confirmModalModel = this.confirmModal;
        String str9 = this.style;
        String str10 = this.checkoutType;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MembershipCheckoutCardModel(title=", str, ", subtitle=", str2, ", expandedSubtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", price=", str4, ", expandedPrice=");
        AbstractC36095b.m114694v(str5, ", summaryItems=", ", expandTitle=", sbM32001t, list);
        AbstractC11266d.m30444B(sbM32001t, str6, ", expandText=", str7, ", paymentOptions=");
        sbM32001t.append(checkoutPaymentOptionsModel);
        sbM32001t.append(", primaryCta=");
        sbM32001t.append(ctaModel);
        sbM32001t.append(", secondaryCta=");
        sbM32001t.append(ctaWithNullableDestinationModel);
        sbM32001t.append(", footerText=");
        sbM32001t.append(str8);
        sbM32001t.append(", confirmModal=");
        sbM32001t.append(confirmModalModel);
        sbM32001t.append(", style=");
        sbM32001t.append(str9);
        sbM32001t.append(", checkoutType=");
        return AbstractC25012a.m73376i(str10, ")", sbM32001t);
    }

    public MembershipCheckoutCardModel(String title, String subtitle, String str, String price, String str2, List<CheckoutCardSummaryItemModel> summaryItems, String str3, String str4, CheckoutPaymentOptionsModel checkoutPaymentOptionsModel, CtaModel primaryCta, CtaWithNullableDestinationModel ctaWithNullableDestinationModel, String footerText, ConfirmModalModel confirmModalModel, String style, String checkoutType) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(summaryItems, "summaryItems");
        AbstractC22676k.m65750j(primaryCta, "primaryCta");
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(checkoutType, "checkoutType");
        this.title = title;
        this.subtitle = subtitle;
        this.expandedSubtitle = str;
        this.price = price;
        this.expandedPrice = str2;
        this.summaryItems = summaryItems;
        this.expandTitle = str3;
        this.expandText = str4;
        this.paymentOptions = checkoutPaymentOptionsModel;
        this.primaryCta = primaryCta;
        this.secondaryCta = ctaWithNullableDestinationModel;
        this.footerText = footerText;
        this.confirmModal = confirmModalModel;
        this.style = style;
        this.checkoutType = checkoutType;
    }
}
