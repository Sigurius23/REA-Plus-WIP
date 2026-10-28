package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b-\u0010\u001b¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/items/Prices;", "", "", "currency", "", "amount", "proAmount", "saleAmount", "proSaleAmount", "<init>", "(Ljava/lang/String;IIII)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/Prices;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "copy", "(Ljava/lang/String;IIII)Lcom/whoop/design/models/items/Prices;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrency", "I", "getAmount", "getProAmount", "getSaleAmount", "getProSaleAmount", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Prices {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int amount;
    private final String currency;
    private final int proAmount;
    private final int proSaleAmount;
    private final int saleAmount;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/Prices$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/Prices;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return Prices$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Prices(int i13, String str, int i14, int i15, int i16, int i17, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, Prices$$serializer.INSTANCE.getDescriptor());
        }
        this.currency = str;
        this.amount = i14;
        this.proAmount = i15;
        this.saleAmount = i16;
        this.proSaleAmount = i17;
    }

    public static /* synthetic */ Prices copy$default(Prices prices, String str, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            str = prices.currency;
        }
        if ((i17 & 2) != 0) {
            i13 = prices.amount;
        }
        if ((i17 & 4) != 0) {
            i14 = prices.proAmount;
        }
        if ((i17 & 8) != 0) {
            i15 = prices.saleAmount;
        }
        if ((i17 & 16) != 0) {
            i16 = prices.proSaleAmount;
        }
        int i18 = i16;
        int i19 = i14;
        return prices.copy(str, i13, i19, i15, i18);
    }

    public static final /* synthetic */ void write$Self$design_models_release(Prices self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.currency);
        output.encodeIntElement(serialDesc, 1, self.amount);
        output.encodeIntElement(serialDesc, 2, self.proAmount);
        output.encodeIntElement(serialDesc, 3, self.saleAmount);
        output.encodeIntElement(serialDesc, 4, self.proSaleAmount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getProAmount() {
        return this.proAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSaleAmount() {
        return this.saleAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getProSaleAmount() {
        return this.proSaleAmount;
    }

    public final Prices copy(String currency, int amount, int proAmount, int saleAmount, int proSaleAmount) {
        AbstractC22676k.m65750j(currency, "currency");
        return new Prices(currency, amount, proAmount, saleAmount, proSaleAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Prices)) {
            return false;
        }
        Prices prices = (Prices) other;
        return AbstractC22676k.m65745e(this.currency, prices.currency) && this.amount == prices.amount && this.proAmount == prices.proAmount && this.saleAmount == prices.saleAmount && this.proSaleAmount == prices.proSaleAmount;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getProAmount() {
        return this.proAmount;
    }

    public final int getProSaleAmount() {
        return this.proSaleAmount;
    }

    public final int getSaleAmount() {
        return this.saleAmount;
    }

    public int hashCode() {
        return Integer.hashCode(this.proSaleAmount) + AbstractC11266d.m30448b(this.saleAmount, AbstractC11266d.m30448b(this.proAmount, AbstractC11266d.m30448b(this.amount, this.currency.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        String str = this.currency;
        int i13 = this.amount;
        int i14 = this.proAmount;
        int i15 = this.saleAmount;
        int i16 = this.proSaleAmount;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "Prices(currency=", str, ", amount=", ", proAmount=");
        AbstractC30802r.m94773v(sbM30467u, i14, ", saleAmount=", i15, ", proSaleAmount=");
        return AbstractC18489d0.m53371l(sbM30467u, i16, ")");
    }

    public Prices(String currency, int i13, int i14, int i15, int i16) {
        AbstractC22676k.m65750j(currency, "currency");
        this.currency = currency;
        this.amount = i13;
        this.proAmount = i14;
        this.saleAmount = i15;
        this.proSaleAmount = i16;
    }
}
