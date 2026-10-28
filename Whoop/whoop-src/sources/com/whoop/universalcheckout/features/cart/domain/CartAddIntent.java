package com.whoop.universalcheckout.features.cart.domain;

import ad3.AbstractC0757c;
import ad3.C0764g;
import al0.C0974i;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import java.util.Base64;
import java.util.List;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.C28503p;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wc3.C37142g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "", "Companion", "Standalone", "Pack", "Wyw", "a", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack;", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Standalone;", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public interface CartAddIntent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f32453a;

    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack;", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "", "packSku", "", "childItemSkus", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPackSku", "Ljava/util/List;", "getChildItemSkus", "Companion", "$serializer", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37143h("pack")
    @InterfaceC37144i
    public static final /* data */ class Pack implements CartAddIntent {
        private final List<String> childItemSkus;
        private final String packSku;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C0974i(4))};

        /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.CartAddIntent$Pack$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return CartAddIntent$Pack$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Pack(int i13, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i13 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 3, CartAddIntent$Pack$$serializer.INSTANCE.getDescriptor());
            }
            this.packSku = str;
            this.childItemSkus = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Pack copy$default(Pack pack, String str, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = pack.packSku;
            }
            if ((i13 & 2) != 0) {
                list = pack.childItemSkus;
            }
            return pack.copy(str, list);
        }

        public static final /* synthetic */ void write$Self$universal_checkout_release(Pack self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.packSku);
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.childItemSkus);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPackSku() {
            return this.packSku;
        }

        public final List<String> component2() {
            return this.childItemSkus;
        }

        public final Pack copy(String packSku, List<String> childItemSkus) {
            AbstractC22676k.m65750j(packSku, "packSku");
            AbstractC22676k.m65750j(childItemSkus, "childItemSkus");
            return new Pack(packSku, childItemSkus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pack)) {
                return false;
            }
            Pack pack = (Pack) other;
            return AbstractC22676k.m65745e(this.packSku, pack.packSku) && AbstractC22676k.m65745e(this.childItemSkus, pack.childItemSkus);
        }

        public final List<String> getChildItemSkus() {
            return this.childItemSkus;
        }

        public final String getPackSku() {
            return this.packSku;
        }

        public int hashCode() {
            return this.childItemSkus.hashCode() + (this.packSku.hashCode() * 31);
        }

        public String toString() {
            return AbstractC36095b.m114679g("Pack(packSku=", this.packSku, ", childItemSkus=", ")", this.childItemSkus);
        }

        public Pack(String packSku, List<String> childItemSkus) {
            AbstractC22676k.m65750j(packSku, "packSku");
            AbstractC22676k.m65750j(childItemSkus, "childItemSkus");
            this.packSku = packSku;
            this.childItemSkus = childItemSkus;
        }
    }

    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Standalone;", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "", "sku", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Standalone;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Standalone;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSku", "Companion", "$serializer", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37143h("standalone")
    @InterfaceC37144i
    public static final /* data */ class Standalone implements CartAddIntent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String sku;

        /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.CartAddIntent$Standalone$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Standalone$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Standalone;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return CartAddIntent$Standalone$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Standalone(int i13, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i13 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 1, CartAddIntent$Standalone$$serializer.INSTANCE.getDescriptor());
            }
            this.sku = str;
        }

        public static /* synthetic */ Standalone copy$default(Standalone standalone, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = standalone.sku;
            }
            return standalone.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSku() {
            return this.sku;
        }

        public final Standalone copy(String sku) {
            AbstractC22676k.m65750j(sku, "sku");
            return new Standalone(sku);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Standalone) && AbstractC22676k.m65745e(this.sku, ((Standalone) other).sku);
        }

        public final String getSku() {
            return this.sku;
        }

        public int hashCode() {
            return this.sku.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Standalone(sku=", this.sku, ")");
        }

        public Standalone(String sku) {
            AbstractC22676k.m65750j(sku, "sku");
            this.sku = sku;
        }
    }

    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0019¨\u00061"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "", "wywSku", "bandSku", "claspSku", "hookSku", "fastLinkSku", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getWywSku", "getBandSku", "getClaspSku", "getHookSku", "getFastLinkSku", "Companion", "$serializer", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37143h("wyw")
    @InterfaceC37144i
    public static final /* data */ class Wyw implements CartAddIntent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String bandSku;
        private final String claspSku;
        private final String fastLinkSku;
        private final String hookSku;
        private final String wywSku;

        /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.CartAddIntent$Wyw$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return CartAddIntent$Wyw$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Wyw(int i13, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if (31 != (i13 & 31)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 31, CartAddIntent$Wyw$$serializer.INSTANCE.getDescriptor());
            }
            this.wywSku = str;
            this.bandSku = str2;
            this.claspSku = str3;
            this.hookSku = str4;
            this.fastLinkSku = str5;
        }

        public static /* synthetic */ Wyw copy$default(Wyw wyw, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = wyw.wywSku;
            }
            if ((i13 & 2) != 0) {
                str2 = wyw.bandSku;
            }
            if ((i13 & 4) != 0) {
                str3 = wyw.claspSku;
            }
            if ((i13 & 8) != 0) {
                str4 = wyw.hookSku;
            }
            if ((i13 & 16) != 0) {
                str5 = wyw.fastLinkSku;
            }
            String str6 = str5;
            String str7 = str3;
            return wyw.copy(str, str2, str7, str4, str6);
        }

        public static final /* synthetic */ void write$Self$universal_checkout_release(Wyw self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.wywSku);
            output.encodeStringElement(serialDesc, 1, self.bandSku);
            output.encodeStringElement(serialDesc, 2, self.claspSku);
            output.encodeStringElement(serialDesc, 3, self.hookSku);
            output.encodeStringElement(serialDesc, 4, self.fastLinkSku);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getWywSku() {
            return this.wywSku;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBandSku() {
            return this.bandSku;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getClaspSku() {
            return this.claspSku;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getHookSku() {
            return this.hookSku;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getFastLinkSku() {
            return this.fastLinkSku;
        }

        public final Wyw copy(String wywSku, String bandSku, String claspSku, String hookSku, String fastLinkSku) {
            AbstractC22676k.m65750j(wywSku, "wywSku");
            AbstractC22676k.m65750j(bandSku, "bandSku");
            AbstractC22676k.m65750j(claspSku, "claspSku");
            AbstractC22676k.m65750j(hookSku, "hookSku");
            AbstractC22676k.m65750j(fastLinkSku, "fastLinkSku");
            return new Wyw(wywSku, bandSku, claspSku, hookSku, fastLinkSku);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Wyw)) {
                return false;
            }
            Wyw wyw = (Wyw) other;
            return AbstractC22676k.m65745e(this.wywSku, wyw.wywSku) && AbstractC22676k.m65745e(this.bandSku, wyw.bandSku) && AbstractC22676k.m65745e(this.claspSku, wyw.claspSku) && AbstractC22676k.m65745e(this.hookSku, wyw.hookSku) && AbstractC22676k.m65745e(this.fastLinkSku, wyw.fastLinkSku);
        }

        public final String getBandSku() {
            return this.bandSku;
        }

        public final String getClaspSku() {
            return this.claspSku;
        }

        public final String getFastLinkSku() {
            return this.fastLinkSku;
        }

        public final String getHookSku() {
            return this.hookSku;
        }

        public final String getWywSku() {
            return this.wywSku;
        }

        public int hashCode() {
            return this.fastLinkSku.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.wywSku.hashCode() * 31, 31, this.bandSku), 31, this.claspSku), 31, this.hookSku);
        }

        public String toString() {
            String str = this.wywSku;
            String str2 = this.bandSku;
            String str3 = this.claspSku;
            String str4 = this.hookSku;
            String str5 = this.fastLinkSku;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Wyw(wywSku=", str, ", bandSku=", str2, ", claspSku=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", hookSku=", str4, ", fastLinkSku=");
            return AbstractC25012a.m73376i(str5, ")", sbM32001t);
        }

        public Wyw(String wywSku, String bandSku, String claspSku, String hookSku, String fastLinkSku) {
            AbstractC22676k.m65750j(wywSku, "wywSku");
            AbstractC22676k.m65750j(bandSku, "bandSku");
            AbstractC22676k.m65750j(claspSku, "claspSku");
            AbstractC22676k.m65750j(hookSku, "hookSku");
            AbstractC22676k.m65750j(fastLinkSku, "fastLinkSku");
            this.wywSku = wywSku;
            this.bandSku = bandSku;
            this.claspSku = claspSku;
            this.hookSku = hookSku;
            this.fastLinkSku = fastLinkSku;
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.CartAddIntent$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\n \u0015*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;", "", "<init>", "()V", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "intent", "", "d", "(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;)Ljava/lang/String;", "raw", "Ltr2/n;", "logger", "b", "(Ljava/lang/String;Ltr2/n;)Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "Lwc3/c;", "serializer", "()Lwc3/c;", "Lad3/c;", "Lad3/c;", "json", "Ljava/util/Base64$Encoder;", "kotlin.jvm.PlatformType", "c", "Ljava/util/Base64$Encoder;", "encoder", "Ljava/util/Base64$Decoder;", "Ljava/util/Base64$Decoder;", "decoder", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f32453a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final AbstractC0757c json = AbstractC34132o.m107878b(AbstractC0757c.f2762d, new C28503p(28));

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final Base64.Encoder encoder = Base64.getUrlEncoder().withoutPadding();

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final Base64.Decoder decoder = Base64.getUrlDecoder();

        private Companion() {
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ CartAddIntent m27605c(Companion companion, String str, InterfaceC34116n interfaceC34116n, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                interfaceC34116n = InterfaceC34116n.INSTANCE.m107848a("CartAddIntent");
            }
            return companion.m27607b(str, interfaceC34116n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final C23454a0 m27606e(C0764g Json) {
            AbstractC22676k.m65750j(Json, "$this$Json");
            Json.f2776c = true;
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: b */
        public final CartAddIntent m27607b(String raw, InterfaceC34116n logger) {
            AbstractC22676k.m65750j(logger, "logger");
            if (raw != null && !AbstractC39414r.m125890i0(raw)) {
                try {
                    byte[] bArrDecode = decoder.decode(raw);
                    AbstractC22676k.m65749i(bArrDecode, "decode(...)");
                    return (CartAddIntent) json.m1831b(f32453a.serializer(), new String(bArrDecode, AbstractC39397a.f169546a));
                } catch (SerializationException e5) {
                    logger.mo85230v("Failed to deserialize CartAddIntent", e5, new AbstractC30556a.a[0]);
                } catch (IllegalArgumentException e13) {
                    logger.mo85230v("Failed to base64-decode CartAddIntent", e13, new AbstractC30556a.a[0]);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public final String m27608d(CartAddIntent intent) {
            AbstractC22676k.m65750j(intent, "intent");
            String strM1833d = json.m1833d(f32453a.serializer(), intent);
            Base64.Encoder encoder2 = encoder;
            byte[] bytes = strM1833d.getBytes(AbstractC39397a.f169546a);
            AbstractC22676k.m65749i(bytes, "getBytes(...)");
            String strEncodeToString = encoder2.encodeToString(bytes);
            AbstractC22676k.m65749i(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        }

        public final InterfaceC37138c serializer() {
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            return new C37142g("com.whoop.universalcheckout.features.cart.domain.CartAddIntent", c22673i0.getOrCreateKotlinClass(CartAddIntent.class), new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(Pack.class), c22673i0.getOrCreateKotlinClass(Standalone.class), c22673i0.getOrCreateKotlinClass(Wyw.class)}, new InterfaceC37138c[]{CartAddIntent$Pack$$serializer.INSTANCE, CartAddIntent$Standalone$$serializer.INSTANCE, CartAddIntent$Wyw$$serializer.INSTANCE}, new Annotation[0]);
        }
    }
}
