package com.whoop.activation.domain.models.steps;

import c13.AbstractC3855a;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.FooterAlignment;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import jh3.AbstractC21702c;
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
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0002_^B¡\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010\u001bBÃ\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010 J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0012\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b-\u0010+J\u0012\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b0\u0010+J\u0010\u00101\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b1\u0010+J\u0010\u00102\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b2\u0010+J\u0012\u00103\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u0010%JÆ\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b8\u0010+J\u0010\u00109\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b>\u0010?J'\u0010H\u001a\u00020E2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0001¢\u0006\u0004\bF\u0010GR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010I\u001a\u0004\bJ\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\bK\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010L\u001a\u0004\bM\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010L\u001a\u0004\bN\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010O\u001a\u0004\bP\u0010(R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bQ\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010R\u001a\u0004\bS\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010R\u001a\u0004\bT\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010R\u001a\u0004\bU\u0010+R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\bW\u0010/R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010R\u001a\u0004\bX\u0010+R\u001a\u0010\u0015\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010R\u001a\u0004\bY\u0010+R\u001a\u0010\u0016\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010R\u001a\u0004\bZ\u0010+R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010[\u001a\u0004\b\\\u00104R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010L\u001a\u0004\b]\u0010%¨\u0006`"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "Lcom/whoop/activation/domain/models/steps/AcceptedPaymentType;", "acceptedPaymentTypes", "Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;", "textEntries", "Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;", "errorMessages", "disclaimerText", "", "upcycleJoinTodaySubtitle", "upcycleCreditCardVariant", "analyticsValue", "Lcom/whoop/design/models/InfoCalloutTileModel;", "infoCalloutTile", "navigationBarText", "mobileScreenName", "analyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "progressCircle", "footerButtons", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;", "component6", "component7", "()Ljava/lang/String;", "component8", "component9", "component10", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "component11", "component12", "component13", "component14", "()Lcom/whoop/design/models/ProgressButtonModel;", "component15", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "Ljava/util/List;", "getAcceptedPaymentTypes", "getTextEntries", "Lcom/whoop/activation/domain/models/steps/PaymentErrorMessages;", "getErrorMessages", "getDisclaimerText", "Ljava/lang/String;", "getUpcycleJoinTodaySubtitle", "getUpcycleCreditCardVariant", "getAnalyticsValue", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getInfoCalloutTile", "getNavigationBarText", "getMobileScreenName", "getAnalyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressCircle", "getFooterButtons", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PaymentMethodStepModel implements ActivationFlowStepModel, DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<AcceptedPaymentType> acceptedPaymentTypes;
    private final String analyticsName;
    private final String analyticsValue;
    private final TextResource disclaimerText;
    private final PaymentErrorMessages errorMessages;
    private final List<DesignSystemModel> footerButtons;
    private final InfoCalloutTileModel infoCalloutTile;
    private final String mobileScreenName;
    private final String navigationBarText;
    private final ProgressButtonModel progressCircle;
    private final TextResource subtitle;
    private final List<ActivationFlowTextEntry> textEntries;
    private final TextResource title;
    private final String upcycleCreditCardVariant;
    private final String upcycleJoinTodaySubtitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PaymentMethodStepModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C31049a(24)), AbstractC30060g.m92087G(enumC23463i, new C31049a(25)), null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C31049a(26))};
    }

    public /* synthetic */ PaymentMethodStepModel(int i13, TextResource textResource, TextResource textResource2, List list, List list2, PaymentErrorMessages paymentErrorMessages, TextResource textResource3, String str, String str2, String str3, InfoCalloutTileModel infoCalloutTileModel, String str4, String str5, String str6, ProgressButtonModel progressButtonModel, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if (16383 != (i13 & 16383)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 16383, PaymentMethodStepModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.subtitle = textResource2;
        this.acceptedPaymentTypes = list;
        this.textEntries = list2;
        this.errorMessages = paymentErrorMessages;
        this.disclaimerText = textResource3;
        this.upcycleJoinTodaySubtitle = str;
        this.upcycleCreditCardVariant = str2;
        this.analyticsValue = str3;
        this.infoCalloutTile = infoCalloutTileModel;
        this.navigationBarText = str4;
        this.mobileScreenName = str5;
        this.analyticsName = str6;
        this.progressCircle = progressButtonModel;
        this.footerButtons = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0 ? C25271y.f99162w : list3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AcceptedPaymentType$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(ActivationFlowTextEntry$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    public static final /* synthetic */ void write$Self$activation_release(PaymentMethodStepModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.subtitle);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.acceptedPaymentTypes);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.textEntries);
        output.encodeSerializableElement(serialDesc, 4, PaymentErrorMessages$$serializer.INSTANCE, self.errorMessages);
        output.encodeSerializableElement(serialDesc, 5, c25452a, self.disclaimerText);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.upcycleJoinTodaySubtitle);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.upcycleCreditCardVariant);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.analyticsValue);
        output.encodeNullableSerializableElement(serialDesc, 9, InfoCalloutTileModel$$serializer.INSTANCE, self.infoCalloutTile);
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
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final InfoCalloutTileModel getInfoCalloutTile() {
        return this.infoCalloutTile;
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
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final List<AcceptedPaymentType> component3() {
        return this.acceptedPaymentTypes;
    }

    public final List<ActivationFlowTextEntry> component4() {
        return this.textEntries;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PaymentErrorMessages getErrorMessages() {
        return this.errorMessages;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TextResource getDisclaimerText() {
        return this.disclaimerText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUpcycleJoinTodaySubtitle() {
        return this.upcycleJoinTodaySubtitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUpcycleCreditCardVariant() {
        return this.upcycleCreditCardVariant;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    public final PaymentMethodStepModel copy(TextResource title, TextResource subtitle, List<AcceptedPaymentType> acceptedPaymentTypes, List<ActivationFlowTextEntry> textEntries, PaymentErrorMessages errorMessages, TextResource disclaimerText, String upcycleJoinTodaySubtitle, String upcycleCreditCardVariant, String analyticsValue, InfoCalloutTileModel infoCalloutTile, String navigationBarText, String mobileScreenName, String analyticsName, ProgressButtonModel progressCircle, List<? extends DesignSystemModel> footerButtons) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(acceptedPaymentTypes, "acceptedPaymentTypes");
        AbstractC22676k.m65750j(textEntries, "textEntries");
        AbstractC22676k.m65750j(errorMessages, "errorMessages");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new PaymentMethodStepModel(title, subtitle, acceptedPaymentTypes, textEntries, errorMessages, disclaimerText, upcycleJoinTodaySubtitle, upcycleCreditCardVariant, analyticsValue, infoCalloutTile, navigationBarText, mobileScreenName, analyticsName, progressCircle, footerButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodStepModel)) {
            return false;
        }
        PaymentMethodStepModel paymentMethodStepModel = (PaymentMethodStepModel) other;
        return AbstractC22676k.m65745e(this.title, paymentMethodStepModel.title) && AbstractC22676k.m65745e(this.subtitle, paymentMethodStepModel.subtitle) && AbstractC22676k.m65745e(this.acceptedPaymentTypes, paymentMethodStepModel.acceptedPaymentTypes) && AbstractC22676k.m65745e(this.textEntries, paymentMethodStepModel.textEntries) && AbstractC22676k.m65745e(this.errorMessages, paymentMethodStepModel.errorMessages) && AbstractC22676k.m65745e(this.disclaimerText, paymentMethodStepModel.disclaimerText) && AbstractC22676k.m65745e(this.upcycleJoinTodaySubtitle, paymentMethodStepModel.upcycleJoinTodaySubtitle) && AbstractC22676k.m65745e(this.upcycleCreditCardVariant, paymentMethodStepModel.upcycleCreditCardVariant) && AbstractC22676k.m65745e(this.analyticsValue, paymentMethodStepModel.analyticsValue) && AbstractC22676k.m65745e(this.infoCalloutTile, paymentMethodStepModel.infoCalloutTile) && AbstractC22676k.m65745e(this.navigationBarText, paymentMethodStepModel.navigationBarText) && AbstractC22676k.m65745e(this.mobileScreenName, paymentMethodStepModel.mobileScreenName) && AbstractC22676k.m65745e(this.analyticsName, paymentMethodStepModel.analyticsName) && AbstractC22676k.m65745e(this.progressCircle, paymentMethodStepModel.progressCircle) && AbstractC22676k.m65745e(this.footerButtons, paymentMethodStepModel.footerButtons);
    }

    public final List<AcceptedPaymentType> getAcceptedPaymentTypes() {
        return this.acceptedPaymentTypes;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    public final TextResource getDisclaimerText() {
        return this.disclaimerText;
    }

    public final PaymentErrorMessages getErrorMessages() {
        return this.errorMessages;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public /* bridge */ FooterAlignment getFooterAlignment() {
        return super.getFooterAlignment();
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public List<DesignSystemModel> getFooterButtons() {
        return this.footerButtons;
    }

    public final InfoCalloutTileModel getInfoCalloutTile() {
        return this.infoCalloutTile;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getMobileScreenName() {
        return this.mobileScreenName;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getNavigationBarText() {
        return this.navigationBarText;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public ProgressButtonModel getProgressCircle() {
        return this.progressCircle;
    }

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final List<ActivationFlowTextEntry> getTextEntries() {
        return this.textEntries;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final String getUpcycleCreditCardVariant() {
        return this.upcycleCreditCardVariant;
    }

    public final String getUpcycleJoinTodaySubtitle() {
        return this.upcycleJoinTodaySubtitle;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a((this.errorMessages.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), 31, this.acceptedPaymentTypes), 31, this.textEntries)) * 31, this.disclaimerText, 31);
        String str = this.upcycleJoinTodaySubtitle;
        int iHashCode = (iM95625a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.upcycleCreditCardVariant;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.analyticsValue;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InfoCalloutTileModel infoCalloutTileModel = this.infoCalloutTile;
        int iHashCode4 = (iHashCode3 + (infoCalloutTileModel == null ? 0 : infoCalloutTileModel.hashCode())) * 31;
        String str4 = this.navigationBarText;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.mobileScreenName), 31, this.analyticsName);
        ProgressButtonModel progressButtonModel = this.progressCircle;
        int iHashCode5 = (iM30450d + (progressButtonModel == null ? 0 : progressButtonModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.footerButtons;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        List<AcceptedPaymentType> list = this.acceptedPaymentTypes;
        List<ActivationFlowTextEntry> list2 = this.textEntries;
        PaymentErrorMessages paymentErrorMessages = this.errorMessages;
        TextResource textResource3 = this.disclaimerText;
        String str = this.upcycleJoinTodaySubtitle;
        String str2 = this.upcycleCreditCardVariant;
        String str3 = this.analyticsValue;
        InfoCalloutTileModel infoCalloutTileModel = this.infoCalloutTile;
        String str4 = this.navigationBarText;
        String str5 = this.mobileScreenName;
        String str6 = this.analyticsName;
        ProgressButtonModel progressButtonModel = this.progressCircle;
        List<DesignSystemModel> list3 = this.footerButtons;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("PaymentMethodStepModel(title=", textResource, ", subtitle=", textResource2, ", acceptedPaymentTypes=");
        AbstractC21702c.m61148s(sbM106658q, list, ", textEntries=", list2, ", errorMessages=");
        sbM106658q.append(paymentErrorMessages);
        sbM106658q.append(", disclaimerText=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", upcycleJoinTodaySubtitle=");
        AbstractC11266d.m30444B(sbM106658q, str, ", upcycleCreditCardVariant=", str2, ", analyticsValue=");
        sbM106658q.append(str3);
        sbM106658q.append(", infoCalloutTile=");
        sbM106658q.append(infoCalloutTileModel);
        sbM106658q.append(", navigationBarText=");
        AbstractC11266d.m30444B(sbM106658q, str4, ", mobileScreenName=", str5, ", analyticsName=");
        sbM106658q.append(str6);
        sbM106658q.append(", progressCircle=");
        sbM106658q.append(progressButtonModel);
        sbM106658q.append(", footerButtons=");
        return AbstractC3855a.m11829m(sbM106658q, list3, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodStepModel(TextResource title, TextResource subtitle, List<AcceptedPaymentType> acceptedPaymentTypes, List<ActivationFlowTextEntry> textEntries, PaymentErrorMessages errorMessages, TextResource disclaimerText, String str, String str2, String str3, InfoCalloutTileModel infoCalloutTileModel, String str4, String mobileScreenName, String analyticsName, ProgressButtonModel progressButtonModel, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(acceptedPaymentTypes, "acceptedPaymentTypes");
        AbstractC22676k.m65750j(textEntries, "textEntries");
        AbstractC22676k.m65750j(errorMessages, "errorMessages");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.title = title;
        this.subtitle = subtitle;
        this.acceptedPaymentTypes = acceptedPaymentTypes;
        this.textEntries = textEntries;
        this.errorMessages = errorMessages;
        this.disclaimerText = disclaimerText;
        this.upcycleJoinTodaySubtitle = str;
        this.upcycleCreditCardVariant = str2;
        this.analyticsValue = str3;
        this.infoCalloutTile = infoCalloutTileModel;
        this.navigationBarText = str4;
        this.mobileScreenName = mobileScreenName;
        this.analyticsName = analyticsName;
        this.progressCircle = progressButtonModel;
        this.footerButtons = list;
    }

    public /* synthetic */ PaymentMethodStepModel(TextResource textResource, TextResource textResource2, List list, List list2, PaymentErrorMessages paymentErrorMessages, TextResource textResource3, String str, String str2, String str3, InfoCalloutTileModel infoCalloutTileModel, String str4, String str5, String str6, ProgressButtonModel progressButtonModel, List list3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, list, list2, paymentErrorMessages, textResource3, str, str2, str3, infoCalloutTileModel, str4, str5, str6, progressButtonModel, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? C25271y.f99162w : list3);
    }
}
