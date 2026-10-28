package com.whoop.universalcheckout.features.checkout.domain.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no2.C26995a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006-"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutDetailModel;", "details", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutTotalModel;", "total", "<init>", "(Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutTotalModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutTotalModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutTotalModel;", "copy", "(Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutTotalModel;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDetails", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutTotalModel;", "getTotal", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CheckoutInfoModel implements DesignSystemModel {
    private final List<CheckoutDetailModel> details;
    private final CheckoutTotalModel total;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C26995a(1)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CheckoutInfoModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CheckoutInfoModel(int i13, List list, CheckoutTotalModel checkoutTotalModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, CheckoutInfoModel$$serializer.INSTANCE.getDescriptor());
        }
        this.details = list;
        this.total = checkoutTotalModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CheckoutDetailModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckoutInfoModel copy$default(CheckoutInfoModel checkoutInfoModel, List list, CheckoutTotalModel checkoutTotalModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = checkoutInfoModel.details;
        }
        if ((i13 & 2) != 0) {
            checkoutTotalModel = checkoutInfoModel.total;
        }
        return checkoutInfoModel.copy(list, checkoutTotalModel);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(CheckoutInfoModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.details);
        output.encodeNullableSerializableElement(serialDesc, 1, CheckoutTotalModel$$serializer.INSTANCE, self.total);
    }

    public final List<CheckoutDetailModel> component1() {
        return this.details;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CheckoutTotalModel getTotal() {
        return this.total;
    }

    public final CheckoutInfoModel copy(List<CheckoutDetailModel> details, CheckoutTotalModel total) {
        AbstractC22676k.m65750j(details, "details");
        return new CheckoutInfoModel(details, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutInfoModel)) {
            return false;
        }
        CheckoutInfoModel checkoutInfoModel = (CheckoutInfoModel) other;
        return AbstractC22676k.m65745e(this.details, checkoutInfoModel.details) && AbstractC22676k.m65745e(this.total, checkoutInfoModel.total);
    }

    public final List<CheckoutDetailModel> getDetails() {
        return this.details;
    }

    public final CheckoutTotalModel getTotal() {
        return this.total;
    }

    public int hashCode() {
        int iHashCode = this.details.hashCode() * 31;
        CheckoutTotalModel checkoutTotalModel = this.total;
        return iHashCode + (checkoutTotalModel == null ? 0 : checkoutTotalModel.hashCode());
    }

    public String toString() {
        return "CheckoutInfoModel(details=" + this.details + ", total=" + this.total + ")";
    }

    public CheckoutInfoModel(List<CheckoutDetailModel> details, CheckoutTotalModel checkoutTotalModel) {
        AbstractC22676k.m65750j(details, "details");
        this.details = details;
        this.total = checkoutTotalModel;
    }
}
