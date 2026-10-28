package com.whoop.payments.stripebottomsheettile.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.HeaderModel;
import com.whoop.design.models.items.HeaderModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import cu2.C11132l;
import ih0.AbstractC18489d0;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
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
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBQ\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&JJ\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010&¨\u0006>"}, m65681d2 = {"Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/HeaderModel;", "header", "Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;", "paymentMethodTile", "", "", "acceptedPaymentMethods", "Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;", "paymentSheetMetadata", "", "defaultPaymentMethodOnFile", "<init>", "(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/util/List;Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/HeaderModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/util/List;Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_release", "(Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/HeaderModel;", "component2", "()Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;", "component5", "()Z", "copy", "(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/util/List;Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;Z)Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/HeaderModel;", "getHeader", "Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;", "getPaymentMethodTile", "Ljava/util/List;", "getAcceptedPaymentMethods", "Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;", "getPaymentSheetMetadata", "Z", "getDefaultPaymentMethodOnFile", "Companion", "$serializer", "a", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StripeBottomSheetTileModel implements DesignSystemModel {
    private final List<String> acceptedPaymentMethods;
    private final boolean defaultPaymentMethodOnFile;
    private final HeaderModel header;
    private final PaymentMethodMenuTileModel paymentMethodTile;
    private final PaymentSheetMetadata paymentSheetMetadata;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C11132l(13)), null, null};

    /* JADX INFO: renamed from: com.whoop.payments.stripebottomsheettile.model.StripeBottomSheetTileModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;", "serializer", "()Lwc3/c;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StripeBottomSheetTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StripeBottomSheetTileModel(int i13, HeaderModel headerModel, PaymentMethodMenuTileModel paymentMethodMenuTileModel, List list, PaymentSheetMetadata paymentSheetMetadata, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, StripeBottomSheetTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.header = headerModel;
        this.paymentMethodTile = paymentMethodMenuTileModel;
        this.acceptedPaymentMethods = list;
        this.paymentSheetMetadata = paymentSheetMetadata;
        this.defaultPaymentMethodOnFile = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StripeBottomSheetTileModel copy$default(StripeBottomSheetTileModel stripeBottomSheetTileModel, HeaderModel headerModel, PaymentMethodMenuTileModel paymentMethodMenuTileModel, List list, PaymentSheetMetadata paymentSheetMetadata, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            headerModel = stripeBottomSheetTileModel.header;
        }
        if ((i13 & 2) != 0) {
            paymentMethodMenuTileModel = stripeBottomSheetTileModel.paymentMethodTile;
        }
        if ((i13 & 4) != 0) {
            list = stripeBottomSheetTileModel.acceptedPaymentMethods;
        }
        if ((i13 & 8) != 0) {
            paymentSheetMetadata = stripeBottomSheetTileModel.paymentSheetMetadata;
        }
        if ((i13 & 16) != 0) {
            z4 = stripeBottomSheetTileModel.defaultPaymentMethodOnFile;
        }
        boolean z13 = z4;
        List list2 = list;
        return stripeBottomSheetTileModel.copy(headerModel, paymentMethodMenuTileModel, list2, paymentSheetMetadata, z13);
    }

    public static final /* synthetic */ void write$Self$payments_release(StripeBottomSheetTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, HeaderModel$$serializer.INSTANCE, self.header);
        output.encodeSerializableElement(serialDesc, 1, PaymentMethodMenuTileModel$$serializer.INSTANCE, self.paymentMethodTile);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.acceptedPaymentMethods);
        output.encodeSerializableElement(serialDesc, 3, PaymentSheetMetadata$$serializer.INSTANCE, self.paymentSheetMetadata);
        output.encodeBooleanElement(serialDesc, 4, self.defaultPaymentMethodOnFile);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HeaderModel getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentMethodMenuTileModel getPaymentMethodTile() {
        return this.paymentMethodTile;
    }

    public final List<String> component3() {
        return this.acceptedPaymentMethods;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PaymentSheetMetadata getPaymentSheetMetadata() {
        return this.paymentSheetMetadata;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDefaultPaymentMethodOnFile() {
        return this.defaultPaymentMethodOnFile;
    }

    public final StripeBottomSheetTileModel copy(HeaderModel header, PaymentMethodMenuTileModel paymentMethodTile, List<String> acceptedPaymentMethods, PaymentSheetMetadata paymentSheetMetadata, boolean defaultPaymentMethodOnFile) {
        AbstractC22676k.m65750j(paymentMethodTile, "paymentMethodTile");
        AbstractC22676k.m65750j(acceptedPaymentMethods, "acceptedPaymentMethods");
        AbstractC22676k.m65750j(paymentSheetMetadata, "paymentSheetMetadata");
        return new StripeBottomSheetTileModel(header, paymentMethodTile, acceptedPaymentMethods, paymentSheetMetadata, defaultPaymentMethodOnFile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StripeBottomSheetTileModel)) {
            return false;
        }
        StripeBottomSheetTileModel stripeBottomSheetTileModel = (StripeBottomSheetTileModel) other;
        return AbstractC22676k.m65745e(this.header, stripeBottomSheetTileModel.header) && AbstractC22676k.m65745e(this.paymentMethodTile, stripeBottomSheetTileModel.paymentMethodTile) && AbstractC22676k.m65745e(this.acceptedPaymentMethods, stripeBottomSheetTileModel.acceptedPaymentMethods) && AbstractC22676k.m65745e(this.paymentSheetMetadata, stripeBottomSheetTileModel.paymentSheetMetadata) && this.defaultPaymentMethodOnFile == stripeBottomSheetTileModel.defaultPaymentMethodOnFile;
    }

    public final List<String> getAcceptedPaymentMethods() {
        return this.acceptedPaymentMethods;
    }

    public final boolean getDefaultPaymentMethodOnFile() {
        return this.defaultPaymentMethodOnFile;
    }

    public final HeaderModel getHeader() {
        return this.header;
    }

    public final PaymentMethodMenuTileModel getPaymentMethodTile() {
        return this.paymentMethodTile;
    }

    public final PaymentSheetMetadata getPaymentSheetMetadata() {
        return this.paymentSheetMetadata;
    }

    public int hashCode() {
        HeaderModel headerModel = this.header;
        return Boolean.hashCode(this.defaultPaymentMethodOnFile) + ((this.paymentSheetMetadata.hashCode() + AbstractC11895b.m31983b((this.paymentMethodTile.hashCode() + ((headerModel == null ? 0 : headerModel.hashCode()) * 31)) * 31, 31, this.acceptedPaymentMethods)) * 31);
    }

    public String toString() {
        HeaderModel headerModel = this.header;
        PaymentMethodMenuTileModel paymentMethodMenuTileModel = this.paymentMethodTile;
        List<String> list = this.acceptedPaymentMethods;
        PaymentSheetMetadata paymentSheetMetadata = this.paymentSheetMetadata;
        boolean z4 = this.defaultPaymentMethodOnFile;
        StringBuilder sb4 = new StringBuilder("StripeBottomSheetTileModel(header=");
        sb4.append(headerModel);
        sb4.append(", paymentMethodTile=");
        sb4.append(paymentMethodMenuTileModel);
        sb4.append(", acceptedPaymentMethods=");
        sb4.append(list);
        sb4.append(", paymentSheetMetadata=");
        sb4.append(paymentSheetMetadata);
        sb4.append(", defaultPaymentMethodOnFile=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public StripeBottomSheetTileModel(HeaderModel headerModel, PaymentMethodMenuTileModel paymentMethodTile, List<String> acceptedPaymentMethods, PaymentSheetMetadata paymentSheetMetadata, boolean z4) {
        AbstractC22676k.m65750j(paymentMethodTile, "paymentMethodTile");
        AbstractC22676k.m65750j(acceptedPaymentMethods, "acceptedPaymentMethods");
        AbstractC22676k.m65750j(paymentSheetMetadata, "paymentSheetMetadata");
        this.header = headerModel;
        this.paymentMethodTile = paymentMethodTile;
        this.acceptedPaymentMethods = acceptedPaymentMethods;
        this.paymentSheetMetadata = paymentSheetMetadata;
        this.defaultPaymentMethodOnFile = z4;
    }
}
