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
import p555vl.AbstractC36095b;
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
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0002^]B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB·\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0010\u0010.\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0012\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b/\u0010%J\u0010\u00100\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b0\u0010%J\u0010\u00101\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b1\u0010%J\u0012\u00102\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b4\u00105Jº\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b8\u0010%J\u0010\u00109\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>J'\u0010G\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010H\u001a\u0004\bI\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010J\u001a\u0004\bK\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010L\u001a\u0004\bM\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010N\u001a\u0004\bO\u0010'R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bP\u0010%R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bQ\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bR\u0010%R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\b\u000f\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bT\u0010%R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\bU\u0010%R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bV\u0010%R\u001a\u0010\u0013\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\bW\u0010%R\u001a\u0010\u0014\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010L\u001a\u0004\bX\u0010%R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010Y\u001a\u0004\bZ\u00103R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010[\u001a\u0004\b\\\u00105¨\u0006_"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/activation/domain/models/steps/OrderDetails;", "orderDetails", "Lcom/whoop/activation/domain/models/steps/PaymentOptions;", "paymentMethod", "", "joinCtaTitle", "Lcom/whoop/design/util/TextResource;", "securityFooter", "disclaimerFooterMarkdown", "payload", "upcycleCreditCardVariant", "", "isTrialMember", "promoCode", "membershipTier", "navigationBarText", "mobileScreenName", "analyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "progressCircle", "", "footerButtons", "<init>", "(Lcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/activation/domain/models/steps/OrderDetails;", "component2", "()Lcom/whoop/activation/domain/models/steps/PaymentOptions;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/design/util/TextResource;", "component5", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "component11", "component12", "component13", "component14", "()Lcom/whoop/design/models/ProgressButtonModel;", "component15", "()Ljava/util/List;", "copy", "(Lcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/activation/domain/models/steps/OrderDetails;", "getOrderDetails", "Lcom/whoop/activation/domain/models/steps/PaymentOptions;", "getPaymentMethod", "Ljava/lang/String;", "getJoinCtaTitle", "Lcom/whoop/design/util/TextResource;", "getSecurityFooter", "getDisclaimerFooterMarkdown", "getPayload", "getUpcycleCreditCardVariant", "Ljava/lang/Boolean;", "getPromoCode", "getMembershipTier", "getNavigationBarText", "getMobileScreenName", "getAnalyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressCircle", "Ljava/util/List;", "getFooterButtons", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UpcycleJoinTodayModel implements ActivationFlowStepModel, DesignSystemModel {
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
    private final String upcycleCreditCardVariant;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31050b(16))};

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UpcycleJoinTodayModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UpcycleJoinTodayModel(int i13, OrderDetails orderDetails, PaymentOptions paymentOptions, String str, TextResource textResource, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, ProgressButtonModel progressButtonModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (16383 != (i13 & 16383)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 16383, UpcycleJoinTodayModel$$serializer.INSTANCE.getDescriptor());
        }
        this.orderDetails = orderDetails;
        this.paymentMethod = paymentOptions;
        this.joinCtaTitle = str;
        this.securityFooter = textResource;
        this.disclaimerFooterMarkdown = str2;
        this.payload = str3;
        this.upcycleCreditCardVariant = str4;
        this.isTrialMember = bool;
        this.promoCode = str5;
        this.membershipTier = str6;
        this.navigationBarText = str7;
        this.mobileScreenName = str8;
        this.analyticsName = str9;
        this.progressCircle = progressButtonModel;
        this.footerButtons = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0 ? C25271y.f99162w : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    public static final /* synthetic */ void write$Self$activation_release(UpcycleJoinTodayModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, OrderDetails$$serializer.INSTANCE, self.orderDetails);
        output.encodeSerializableElement(serialDesc, 1, PaymentOptions$$serializer.INSTANCE, self.paymentMethod);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.joinCtaTitle);
        output.encodeSerializableElement(serialDesc, 3, C25452a.f99689a, self.securityFooter);
        output.encodeStringElement(serialDesc, 4, self.disclaimerFooterMarkdown);
        output.encodeStringElement(serialDesc, 5, self.payload);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.upcycleCreditCardVariant);
        output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, self.isTrialMember);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.promoCode);
        output.encodeStringElement(serialDesc, 9, self.membershipTier);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.getNavigationBarText());
        output.encodeStringElement(serialDesc, 11, self.getMobileScreenName());
        output.encodeStringElement(serialDesc, 12, self.getAnalyticsName());
        output.encodeNullableSerializableElement(serialDesc, 13, ProgressButtonModel$$serializer.INSTANCE, self.getProgressCircle());
        if (!output.shouldEncodeElementDefault(serialDesc, 14) && AbstractC22676k.m65745e(self.getFooterButtons(), C25271y.f99162w)) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 14, (InterfaceC37145j) interfaceC23462hArr[14].getValue(), self.getFooterButtons());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrderDetails getOrderDetails() {
        return this.orderDetails;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMembershipTier() {
        return this.membershipTier;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMobileScreenName() {
        return this.mobileScreenName;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ProgressButtonModel getProgressCircle() {
        return this.progressCircle;
    }

    public final List<DesignSystemModel> component15() {
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
    public final String getUpcycleCreditCardVariant() {
        return this.upcycleCreditCardVariant;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsTrialMember() {
        return this.isTrialMember;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPromoCode() {
        return this.promoCode;
    }

    public final UpcycleJoinTodayModel copy(OrderDetails orderDetails, PaymentOptions paymentMethod, String joinCtaTitle, TextResource securityFooter, String disclaimerFooterMarkdown, String payload, String upcycleCreditCardVariant, Boolean isTrialMember, String promoCode, String membershipTier, String navigationBarText, String mobileScreenName, String analyticsName, ProgressButtonModel progressCircle, List<? extends DesignSystemModel> footerButtons) {
        AbstractC22676k.m65750j(orderDetails, "orderDetails");
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        AbstractC22676k.m65750j(securityFooter, "securityFooter");
        AbstractC22676k.m65750j(disclaimerFooterMarkdown, "disclaimerFooterMarkdown");
        AbstractC22676k.m65750j(payload, "payload");
        AbstractC22676k.m65750j(membershipTier, "membershipTier");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new UpcycleJoinTodayModel(orderDetails, paymentMethod, joinCtaTitle, securityFooter, disclaimerFooterMarkdown, payload, upcycleCreditCardVariant, isTrialMember, promoCode, membershipTier, navigationBarText, mobileScreenName, analyticsName, progressCircle, footerButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpcycleJoinTodayModel)) {
            return false;
        }
        UpcycleJoinTodayModel upcycleJoinTodayModel = (UpcycleJoinTodayModel) other;
        return AbstractC22676k.m65745e(this.orderDetails, upcycleJoinTodayModel.orderDetails) && AbstractC22676k.m65745e(this.paymentMethod, upcycleJoinTodayModel.paymentMethod) && AbstractC22676k.m65745e(this.joinCtaTitle, upcycleJoinTodayModel.joinCtaTitle) && AbstractC22676k.m65745e(this.securityFooter, upcycleJoinTodayModel.securityFooter) && AbstractC22676k.m65745e(this.disclaimerFooterMarkdown, upcycleJoinTodayModel.disclaimerFooterMarkdown) && AbstractC22676k.m65745e(this.payload, upcycleJoinTodayModel.payload) && AbstractC22676k.m65745e(this.upcycleCreditCardVariant, upcycleJoinTodayModel.upcycleCreditCardVariant) && AbstractC22676k.m65745e(this.isTrialMember, upcycleJoinTodayModel.isTrialMember) && AbstractC22676k.m65745e(this.promoCode, upcycleJoinTodayModel.promoCode) && AbstractC22676k.m65745e(this.membershipTier, upcycleJoinTodayModel.membershipTier) && AbstractC22676k.m65745e(this.navigationBarText, upcycleJoinTodayModel.navigationBarText) && AbstractC22676k.m65745e(this.mobileScreenName, upcycleJoinTodayModel.mobileScreenName) && AbstractC22676k.m65745e(this.analyticsName, upcycleJoinTodayModel.analyticsName) && AbstractC22676k.m65745e(this.progressCircle, upcycleJoinTodayModel.progressCircle) && AbstractC22676k.m65745e(this.footerButtons, upcycleJoinTodayModel.footerButtons);
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

    public final String getUpcycleCreditCardVariant() {
        return this.upcycleCreditCardVariant;
    }

    public int hashCode() {
        int iHashCode = (this.paymentMethod.hashCode() + (this.orderDetails.hashCode() * 31)) * 31;
        String str = this.joinCtaTitle;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC31061c.m95625a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.securityFooter, 31), 31, this.disclaimerFooterMarkdown), 31, this.payload);
        String str2 = this.upcycleCreditCardVariant;
        int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isTrialMember;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.promoCode;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.membershipTier);
        String str4 = this.navigationBarText;
        int iM30450d3 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.mobileScreenName), 31, this.analyticsName);
        ProgressButtonModel progressButtonModel = this.progressCircle;
        int iHashCode4 = (iM30450d3 + (progressButtonModel == null ? 0 : progressButtonModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.footerButtons;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
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
        String str4 = this.upcycleCreditCardVariant;
        Boolean bool = this.isTrialMember;
        String str5 = this.promoCode;
        String str6 = this.membershipTier;
        String str7 = this.navigationBarText;
        String str8 = this.mobileScreenName;
        String str9 = this.analyticsName;
        ProgressButtonModel progressButtonModel = this.progressCircle;
        List<DesignSystemModel> list = this.footerButtons;
        StringBuilder sb4 = new StringBuilder("UpcycleJoinTodayModel(orderDetails=");
        sb4.append(orderDetails);
        sb4.append(", paymentMethod=");
        sb4.append(paymentOptions);
        sb4.append(", joinCtaTitle=");
        AbstractC30007c.m91826A(sb4, str, ", securityFooter=", textResource, ", disclaimerFooterMarkdown=");
        AbstractC11266d.m30444B(sb4, str2, ", payload=", str3, ", upcycleCreditCardVariant=");
        AbstractC36095b.m114692t(bool, str4, ", isTrialMember=", ", promoCode=", sb4);
        AbstractC11266d.m30444B(sb4, str5, ", membershipTier=", str6, ", navigationBarText=");
        AbstractC11266d.m30444B(sb4, str7, ", mobileScreenName=", str8, ", analyticsName=");
        sb4.append(str9);
        sb4.append(", progressCircle=");
        sb4.append(progressButtonModel);
        sb4.append(", footerButtons=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpcycleJoinTodayModel(OrderDetails orderDetails, PaymentOptions paymentMethod, String str, TextResource securityFooter, String disclaimerFooterMarkdown, String payload, String str2, Boolean bool, String str3, String membershipTier, String str4, String mobileScreenName, String analyticsName, ProgressButtonModel progressButtonModel, List<? extends DesignSystemModel> list) {
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
        this.upcycleCreditCardVariant = str2;
        this.isTrialMember = bool;
        this.promoCode = str3;
        this.membershipTier = membershipTier;
        this.navigationBarText = str4;
        this.mobileScreenName = mobileScreenName;
        this.analyticsName = analyticsName;
        this.progressCircle = progressButtonModel;
        this.footerButtons = list;
    }

    public /* synthetic */ UpcycleJoinTodayModel(OrderDetails orderDetails, PaymentOptions paymentOptions, String str, TextResource textResource, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, ProgressButtonModel progressButtonModel, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(orderDetails, paymentOptions, str, textResource, str2, str3, str4, bool, str5, str6, str7, str8, str9, progressButtonModel, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? C25271y.f99162w : list);
    }
}
