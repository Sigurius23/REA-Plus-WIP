package com.whoop.payments.feature.paymentmethodmanagement.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ut2.C35231a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR.\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001f¨\u00065"}, m65681d2 = {"Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;", "", "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;", "navigationBar", "", "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementSectionModel;", "sections", "", "", "analyticsProperties", "<init>", "(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;Ljava/util/List;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;Ljava/util/List;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_release", "(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;", "component2", "()Ljava/util/List;", "component3", "()Ljava/util/Map;", "copy", "(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;Ljava/util/List;Ljava/util/Map;)Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;", "getNavigationBar", "Ljava/util/List;", "getSections", "Ljava/util/Map;", "getAnalyticsProperties", "getAnalyticsProperties$annotations", "()V", "Companion", "$serializer", "a", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PaymentMethodManagementModels {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, String> analyticsProperties;
    private final PaymentMethodManagementNavigationBarModel navigationBar;
    private final List<PaymentMethodManagementSectionModel> sections;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementModels$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;", "serializer", "()Lwc3/c;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PaymentMethodManagementModels$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C35231a(23)), AbstractC30060g.m92087G(enumC23463i, new C35231a(24))};
    }

    public /* synthetic */ PaymentMethodManagementModels(int i13, PaymentMethodManagementNavigationBarModel paymentMethodManagementNavigationBarModel, List list, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, PaymentMethodManagementModels$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBar = paymentMethodManagementNavigationBarModel;
        this.sections = list;
        this.analyticsProperties = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(PaymentMethodManagementSectionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodManagementModels copy$default(PaymentMethodManagementModels paymentMethodManagementModels, PaymentMethodManagementNavigationBarModel paymentMethodManagementNavigationBarModel, List list, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            paymentMethodManagementNavigationBarModel = paymentMethodManagementModels.navigationBar;
        }
        if ((i13 & 2) != 0) {
            list = paymentMethodManagementModels.sections;
        }
        if ((i13 & 4) != 0) {
            map = paymentMethodManagementModels.analyticsProperties;
        }
        return paymentMethodManagementModels.copy(paymentMethodManagementNavigationBarModel, list, map);
    }

    @InterfaceC37143h("payment_error_state_analytics_properties")
    public static /* synthetic */ void getAnalyticsProperties$annotations() {
    }

    public static final /* synthetic */ void write$Self$payments_release(PaymentMethodManagementModels self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, PaymentMethodManagementNavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sections);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.analyticsProperties);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaymentMethodManagementNavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final List<PaymentMethodManagementSectionModel> component2() {
        return this.sections;
    }

    public final Map<String, String> component3() {
        return this.analyticsProperties;
    }

    public final PaymentMethodManagementModels copy(PaymentMethodManagementNavigationBarModel navigationBar, List<PaymentMethodManagementSectionModel> sections, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(sections, "sections");
        return new PaymentMethodManagementModels(navigationBar, sections, analyticsProperties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodManagementModels)) {
            return false;
        }
        PaymentMethodManagementModels paymentMethodManagementModels = (PaymentMethodManagementModels) other;
        return AbstractC22676k.m65745e(this.navigationBar, paymentMethodManagementModels.navigationBar) && AbstractC22676k.m65745e(this.sections, paymentMethodManagementModels.sections) && AbstractC22676k.m65745e(this.analyticsProperties, paymentMethodManagementModels.analyticsProperties);
    }

    public final Map<String, String> getAnalyticsProperties() {
        return this.analyticsProperties;
    }

    public final PaymentMethodManagementNavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final List<PaymentMethodManagementSectionModel> getSections() {
        return this.sections;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.navigationBar.hashCode() * 31, 31, this.sections);
        Map<String, String> map = this.analyticsProperties;
        return iM31983b + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        PaymentMethodManagementNavigationBarModel paymentMethodManagementNavigationBarModel = this.navigationBar;
        List<PaymentMethodManagementSectionModel> list = this.sections;
        Map<String, String> map = this.analyticsProperties;
        StringBuilder sb4 = new StringBuilder("PaymentMethodManagementModels(navigationBar=");
        sb4.append(paymentMethodManagementNavigationBarModel);
        sb4.append(", sections=");
        sb4.append(list);
        sb4.append(", analyticsProperties=");
        return AbstractC13673n.m38565l(sb4, map, ")");
    }

    public PaymentMethodManagementModels(PaymentMethodManagementNavigationBarModel navigationBar, List<PaymentMethodManagementSectionModel> sections, Map<String, String> map) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(sections, "sections");
        this.navigationBar = navigationBar;
        this.sections = sections;
        this.analyticsProperties = map;
    }
}
