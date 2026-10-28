package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36962i;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJT\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b2\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010#R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b5\u0010\u001f¨\u00068"}, m65681d2 = {"Lcom/whoop/design/models/items/ProductItems;", "", "", "title", "", "proReward", "proExclusive", "proExcludeDiscount", "", "Lcom/whoop/design/models/items/Prices;", "prices", "new", "<init>", "(Ljava/lang/String;ZZZLjava/util/List;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZZZLjava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ProductItems;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "copy", "(Ljava/lang/String;ZZZLjava/util/List;Z)Lcom/whoop/design/models/items/ProductItems;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Z", "getProReward", "getProExclusive", "getProExcludeDiscount", "Ljava/util/List;", "getPrices", "getNew", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProductItems {
    private final boolean new;
    private final List<Prices> prices;
    private final boolean proExcludeDiscount;
    private final boolean proExclusive;
    private final boolean proReward;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36962i(1)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ProductItems$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ProductItems;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProductItems$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProductItems(int i13, String str, boolean z4, boolean z13, boolean z14, List list, boolean z15, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ProductItems$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.proReward = z4;
        this.proExclusive = z13;
        this.proExcludeDiscount = z14;
        this.prices = list;
        this.new = z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(Prices$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductItems copy$default(ProductItems productItems, String str, boolean z4, boolean z13, boolean z14, List list, boolean z15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = productItems.title;
        }
        if ((i13 & 2) != 0) {
            z4 = productItems.proReward;
        }
        if ((i13 & 4) != 0) {
            z13 = productItems.proExclusive;
        }
        if ((i13 & 8) != 0) {
            z14 = productItems.proExcludeDiscount;
        }
        if ((i13 & 16) != 0) {
            list = productItems.prices;
        }
        if ((i13 & 32) != 0) {
            z15 = productItems.new;
        }
        List list2 = list;
        boolean z16 = z15;
        return productItems.copy(str, z4, z13, z14, list2, z16);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ProductItems self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.title);
        output.encodeBooleanElement(serialDesc, 1, self.proReward);
        output.encodeBooleanElement(serialDesc, 2, self.proExclusive);
        output.encodeBooleanElement(serialDesc, 3, self.proExcludeDiscount);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.prices);
        output.encodeBooleanElement(serialDesc, 5, self.new);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getProReward() {
        return this.proReward;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getProExclusive() {
        return this.proExclusive;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getProExcludeDiscount() {
        return this.proExcludeDiscount;
    }

    public final List<Prices> component5() {
        return this.prices;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getNew() {
        return this.new;
    }

    public final ProductItems copy(String title, boolean proReward, boolean proExclusive, boolean proExcludeDiscount, List<Prices> prices, boolean z4) {
        AbstractC22676k.m65750j(prices, "prices");
        return new ProductItems(title, proReward, proExclusive, proExcludeDiscount, prices, z4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductItems)) {
            return false;
        }
        ProductItems productItems = (ProductItems) other;
        return AbstractC22676k.m65745e(this.title, productItems.title) && this.proReward == productItems.proReward && this.proExclusive == productItems.proExclusive && this.proExcludeDiscount == productItems.proExcludeDiscount && AbstractC22676k.m65745e(this.prices, productItems.prices) && this.new == productItems.new;
    }

    public final boolean getNew() {
        return this.new;
    }

    public final List<Prices> getPrices() {
        return this.prices;
    }

    public final boolean getProExcludeDiscount() {
        return this.proExcludeDiscount;
    }

    public final boolean getProExclusive() {
        return this.proExclusive;
    }

    public final boolean getProReward() {
        return this.proReward;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        return Boolean.hashCode(this.new) + AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((str == null ? 0 : str.hashCode()) * 31, 31, this.proReward), 31, this.proExclusive), 31, this.proExcludeDiscount), 31, this.prices);
    }

    public String toString() {
        String str = this.title;
        boolean z4 = this.proReward;
        boolean z13 = this.proExclusive;
        boolean z14 = this.proExcludeDiscount;
        List<Prices> list = this.prices;
        boolean z15 = this.new;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("ProductItems(title=", str, ", proReward=", ", proExclusive=", z4);
        AbstractC38963t7.m124392v(sbM73379l, z13, ", proExcludeDiscount=", z14, ", prices=");
        sbM73379l.append(list);
        sbM73379l.append(", new=");
        sbM73379l.append(z15);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }

    public ProductItems(String str, boolean z4, boolean z13, boolean z14, List<Prices> prices, boolean z15) {
        AbstractC22676k.m65750j(prices, "prices");
        this.title = str;
        this.proReward = z4;
        this.proExclusive = z13;
        this.proExcludeDiscount = z14;
        this.prices = prices;
        this.new = z15;
    }
}
