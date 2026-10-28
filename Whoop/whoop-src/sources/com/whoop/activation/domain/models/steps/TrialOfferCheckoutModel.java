package com.whoop.activation.domain.models.steps;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r70.C31050b;
import r80.AbstractC31061c;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0002[ZB\u008b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u00ad\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0010\u0010(\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b+\u0010$J\u0010\u0010,\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b,\u0010$J\u0012\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b-\u0010$J\u0010\u0010.\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b.\u0010$J\u0010\u0010/\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b/\u0010$J\u0012\u00100\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b2\u00103J®\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b6\u0010$J\u0010\u00107\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020\r2\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b;\u0010<J'\u0010E\u001a\u00020B2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bC\u0010DR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010F\u001a\u0004\bG\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010H\u001a\u0004\bI\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010J\u001a\u0004\bK\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010L\u001a\u0004\bM\u0010&R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\bN\u0010$R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bO\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010P\u001a\u0004\b\u000e\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010J\u001a\u0004\bQ\u0010$R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bR\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bS\u0010$R\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bT\u0010$R\u001a\u0010\u0013\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\bU\u0010$R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010V\u001a\u0004\bW\u00101R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010X\u001a\u0004\bY\u00103¨\u0006\\"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/activation/domain/models/steps/OrderDetails;", "orderDetails", "Lcom/whoop/activation/domain/models/steps/PaymentOptions;", "paymentMethod", "", "joinCtaTitle", "Lcom/whoop/design/util/TextResource;", "securityFooter", "disclaimerFooterMarkdown", "payload", "", "isTrialMember", "promoCode", "membershipTier", "navigationBarText", "mobileScreenName", "analyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "progressCircle", "", "footerButtons", "<init>", "(Lcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/activation/domain/models/steps/OrderDetails;", "component2", "()Lcom/whoop/activation/domain/models/steps/PaymentOptions;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/design/util/TextResource;", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "component11", "component12", "component13", "()Lcom/whoop/design/models/ProgressButtonModel;", "component14", "()Ljava/util/List;", "copy", "(Lcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/activation/domain/models/steps/OrderDetails;", "getOrderDetails", "Lcom/whoop/activation/domain/models/steps/PaymentOptions;", "getPaymentMethod", "Ljava/lang/String;", "getJoinCtaTitle", "Lcom/whoop/design/util/TextResource;", "getSecurityFooter", "getDisclaimerFooterMarkdown", "getPayload", "Ljava/lang/Boolean;", "getPromoCode", "getMembershipTier", "getNavigationBarText", "getMobileScreenName", "getAnalyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressCircle", "Ljava/util/List;", "getFooterButtons", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrialOfferCheckoutModel implements ActivationFlowStepModel, DesignSystemModel {
    private final String analyticsName;
    private final String disclaimerFooterMarkdown;
    private final List<DesignSystemModel> footerButtons;
    private final Boolean isTrialMember;
    private final String joinCtaTitle;
    private final String membershipTier;
    private final String mobileScreenName;
    private final String navigationBarText;
    private final OrderDetails orderDetails;
    private final String payload;
    private final PaymentOptions paymentMethod;
    private final ProgressButtonModel progressCircle;
    private final String promoCode;
    private final TextResource securityFooter;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31050b(9))};

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrialOfferCheckoutModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TrialOfferCheckoutModel(int i13, OrderDetails orderDetails, PaymentOptions paymentOptions, String str, TextResource textResource, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, ProgressButtonModel progressButtonModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (8191 != (i13 & 8191)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 8191, TrialOfferCheckoutModel$$serializer.INSTANCE.getDescriptor());
        }
        this.orderDetails = orderDetails;
        this.paymentMethod = paymentOptions;
        this.joinCtaTitle = str;
        this.securityFooter = textResource;
        this.disclaimerFooterMarkdown = str2;
        this.payload = str3;
        this.isTrialMember = bool;
        this.promoCode = str4;
        this.membershipTier = str5;
        this.navigationBarText = str6;
        this.mobileScreenName = str7;
        this.analyticsName = str8;
        this.progressCircle = progressButtonModel;
        this.footerButtons = (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? C25271y.f99162w : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    public static final /* synthetic */ void write$Self$activation_release(TrialOfferCheckoutModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, OrderDetails$$serializer.INSTANCE, self.orderDetails);
        output.encodeSerializableElement(serialDesc, 1, PaymentOptions$$serializer.INSTANCE, self.paymentMethod);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.joinCtaTitle);
        output.encodeSerializableElement(serialDesc, 3, C25452a.f99689a, self.securityFooter);
        output.encodeStringElement(serialDesc, 4, self.disclaimerFooterMarkdown);
        output.encodeStringElement(serialDesc, 5, self.payload);
        output.encodeNullableSerializableElement(serialDesc, 6, BooleanSerializer.INSTANCE, self.isTrialMember);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.promoCode);
        output.encodeStringElement(serialDesc, 8, self.membershipTier);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.getNavigationBarText());
        output.encodeStringElement(serialDesc, 10, self.getMobileScreenName());
        output.encodeStringElement(serialDesc, 11, self.getAnalyticsName());
        output.encodeNullableSerializableElement(serialDesc, 12, ProgressButtonModel$$serializer.INSTANCE, self.getProgressCircle());
        if (!output.shouldEncodeElementDefault(serialDesc, 13) && AbstractC22676k.m65745e(self.getFooterButtons(), C25271y.f99162w)) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.getFooterButtons());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrderDetails getOrderDetails() {
        return this.orderDetails;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMobileScreenName() {
        return this.mobileScreenName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ProgressButtonModel getProgressCircle() {
        return this.progressCircle;
    }

    public final List<DesignSystemModel> component14() {
        return this.footerButtons;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentOptions getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getJoinCtaTitle() {
        return this.joinCtaTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getSecurityFooter() {
        return this.securityFooter;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDisclaimerFooterMarkdown() {
        return this.disclaimerFooterMarkdown;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsTrialMember() {
        return this.isTrialMember;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPromoCode() {
        return this.promoCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMembershipTier() {
        return this.membershipTier;
    }

    public final TrialOfferCheckoutModel copy(OrderDetails orderDetails, PaymentOptions paymentMethod, String joinCtaTitle, TextResource securityFooter, String disclaimerFooterMarkdown, String payload, Boolean isTrialMember, String promoCode, String membershipTier, String navigationBarText, String mobileScreenName, String analyticsName, ProgressButtonModel progressCircle, List<? extends DesignSystemModel> footerButtons) {
        AbstractC22676k.m65750j(orderDetails, "orderDetails");
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        AbstractC22676k.m65750j(securityFooter, "securityFooter");
        AbstractC22676k.m65750j(disclaimerFooterMarkdown, "disclaimerFooterMarkdown");
        AbstractC22676k.m65750j(payload, "payload");
        AbstractC22676k.m65750j(membershipTier, "membershipTier");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new TrialOfferCheckoutModel(orderDetails, paymentMethod, joinCtaTitle, securityFooter, disclaimerFooterMarkdown, payload, isTrialMember, promoCode, membershipTier, navigationBarText, mobileScreenName, analyticsName, progressCircle, footerButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrialOfferCheckoutModel)) {
            return false;
        }
        TrialOfferCheckoutModel trialOfferCheckoutModel = (TrialOfferCheckoutModel) other;
        return AbstractC22676k.m65745e(this.orderDetails, trialOfferCheckoutModel.orderDetails) && AbstractC22676k.m65745e(this.paymentMethod, trialOfferCheckoutModel.paymentMethod) && AbstractC22676k.m65745e(this.joinCtaTitle, trialOfferCheckoutModel.joinCtaTitle) && AbstractC22676k.m65745e(this.securityFooter, trialOfferCheckoutModel.securityFooter) && AbstractC22676k.m65745e(this.disclaimerFooterMarkdown, trialOfferCheckoutModel.disclaimerFooterMarkdown) && AbstractC22676k.m65745e(this.payload, trialOfferCheckoutModel.payload) && AbstractC22676k.m65745e(this.isTrialMember, trialOfferCheckoutModel.isTrialMember) && AbstractC22676k.m65745e(this.promoCode, trialOfferCheckoutModel.promoCode) && AbstractC22676k.m65745e(this.membershipTier, trialOfferCheckoutModel.membershipTier) && AbstractC22676k.m65745e(this.navigationBarText, trialOfferCheckoutModel.navigationBarText) && AbstractC22676k.m65745e(this.mobileScreenName, trialOfferCheckoutModel.mobileScreenName) && AbstractC22676k.m65745e(this.analyticsName, trialOfferCheckoutModel.analyticsName) && AbstractC22676k.m65745e(this.progressCircle, trialOfferCheckoutModel.progressCircle) && AbstractC22676k.m65745e(this.footerButtons, trialOfferCheckoutModel.footerButtons);
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getDisclaimerFooterMarkdown() {
        return this.disclaimerFooterMarkdown;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public /* bridge */ FooterAlignment getFooterAlignment() {
        return super.getFooterAlignment();
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public List<DesignSystemModel> getFooterButtons() {
        return this.footerButtons;
    }

    public final String getJoinCtaTitle() {
        return this.joinCtaTitle;
    }

    public final String getMembershipTier() {
        return this.membershipTier;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getMobileScreenName() {
        return this.mobileScreenName;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getNavigationBarText() {
        return this.navigationBarText;
    }

    public final OrderDetails getOrderDetails() {
        return this.orderDetails;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final PaymentOptions getPaymentMethod() {
        return this.paymentMethod;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public ProgressButtonModel getProgressCircle() {
        return this.progressCircle;
    }

    public final String getPromoCode() {
        return this.promoCode;
    }

    public final TextResource getSecurityFooter() {
        return this.securityFooter;
    }

    public int hashCode() {
        int iHashCode = (this.paymentMethod.hashCode() + (this.orderDetails.hashCode() * 31)) * 31;
        String str = this.joinCtaTitle;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC31061c.m95625a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.securityFooter, 31), 31, this.disclaimerFooterMarkdown), 31, this.payload);
        Boolean bool = this.isTrialMember;
        int iHashCode2 = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.promoCode;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.membershipTier);
        String str3 = this.navigationBarText;
        int iM30450d3 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.mobileScreenName), 31, this.analyticsName);
        ProgressButtonModel progressButtonModel = this.progressCircle;
        int iHashCode3 = (iM30450d3 + (progressButtonModel == null ? 0 : progressButtonModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.footerButtons;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final Boolean isTrialMember() {
        return this.isTrialMember;
    }

    public String toString() {
        OrderDetails orderDetails = this.orderDetails;
        PaymentOptions paymentOptions = this.paymentMethod;
        String str = this.joinCtaTitle;
        TextResource textResource = this.securityFooter;
        String str2 = this.disclaimerFooterMarkdown;
        String str3 = this.payload;
        Boolean bool = this.isTrialMember;
        String str4 = this.promoCode;
        String str5 = this.membershipTier;
        String str6 = this.navigationBarText;
        String str7 = this.mobileScreenName;
        String str8 = this.analyticsName;
        ProgressButtonModel progressButtonModel = this.progressCircle;
        List<DesignSystemModel> list = this.footerButtons;
        StringBuilder sb4 = new StringBuilder("TrialOfferCheckoutModel(orderDetails=");
        sb4.append(orderDetails);
        sb4.append(", paymentMethod=");
        sb4.append(paymentOptions);
        sb4.append(", joinCtaTitle=");
        AbstractC30007c.m91826A(sb4, str, ", securityFooter=", textResource, ", disclaimerFooterMarkdown=");
        AbstractC11266d.m30444B(sb4, str2, ", payload=", str3, ", isTrialMember=");
        AbstractC13673n.m38576w(bool, ", promoCode=", str4, ", membershipTier=", sb4);
        AbstractC11266d.m30444B(sb4, str5, ", navigationBarText=", str6, ", mobileScreenName=");
        AbstractC11266d.m30444B(sb4, str7, ", analyticsName=", str8, ", progressCircle=");
        sb4.append(progressButtonModel);
        sb4.append(", footerButtons=");
        sb4.append(list);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrialOfferCheckoutModel(OrderDetails orderDetails, PaymentOptions paymentMethod, String str, TextResource securityFooter, String disclaimerFooterMarkdown, String payload, Boolean bool, String str2, String membershipTier, String str3, String mobileScreenName, String analyticsName, ProgressButtonModel progressButtonModel, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(orderDetails, "orderDetails");
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        AbstractC22676k.m65750j(securityFooter, "securityFooter");
        AbstractC22676k.m65750j(disclaimerFooterMarkdown, "disclaimerFooterMarkdown");
        AbstractC22676k.m65750j(payload, "payload");
        AbstractC22676k.m65750j(membershipTier, "membershipTier");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.orderDetails = orderDetails;
        this.paymentMethod = paymentMethod;
        this.joinCtaTitle = str;
        this.securityFooter = securityFooter;
        this.disclaimerFooterMarkdown = disclaimerFooterMarkdown;
        this.payload = payload;
        this.isTrialMember = bool;
        this.promoCode = str2;
        this.membershipTier = membershipTier;
        this.navigationBarText = str3;
        this.mobileScreenName = mobileScreenName;
        this.analyticsName = analyticsName;
        this.progressCircle = progressButtonModel;
        this.footerButtons = list;
    }

    public /* synthetic */ TrialOfferCheckoutModel(OrderDetails orderDetails, PaymentOptions paymentOptions, String str, TextResource textResource, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, ProgressButtonModel progressButtonModel, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(orderDetails, paymentOptions, str, textResource, str2, str3, bool, str4, str5, str6, str7, str8, progressButtonModel, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? C25271y.f99162w : list);
    }
}
