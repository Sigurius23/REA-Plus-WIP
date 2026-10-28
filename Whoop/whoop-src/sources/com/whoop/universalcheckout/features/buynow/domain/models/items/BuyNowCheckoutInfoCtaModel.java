package com.whoop.universalcheckout.features.buynow.domain.models.items;

import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import u91.C34656a;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoCtaModel;", "", "", "textDisplay", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoCtaModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoCtaModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTextDisplay", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BuyNowCheckoutInfoCtaModel {
    private final C9598e destination;
    private final String textDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C34656a(28))};

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.domain.models.items.BuyNowCheckoutInfoCtaModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoCtaModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoCtaModel;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BuyNowCheckoutInfoCtaModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuyNowCheckoutInfoCtaModel() {
        this((String) null, (C9598e) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ BuyNowCheckoutInfoCtaModel copy$default(BuyNowCheckoutInfoCtaModel buyNowCheckoutInfoCtaModel, String str, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = buyNowCheckoutInfoCtaModel.textDisplay;
        }
        if ((i13 & 2) != 0) {
            c9598e = buyNowCheckoutInfoCtaModel.destination;
        }
        return buyNowCheckoutInfoCtaModel.copy(str, c9598e);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(BuyNowCheckoutInfoCtaModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.textDisplay, "")) {
            output.encodeStringElement(serialDesc, 0, self.textDisplay);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTextDisplay() {
        return this.textDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final BuyNowCheckoutInfoCtaModel copy(String textDisplay, C9598e destination) {
        AbstractC22676k.m65750j(textDisplay, "textDisplay");
        return new BuyNowCheckoutInfoCtaModel(textDisplay, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyNowCheckoutInfoCtaModel)) {
            return false;
        }
        BuyNowCheckoutInfoCtaModel buyNowCheckoutInfoCtaModel = (BuyNowCheckoutInfoCtaModel) other;
        return AbstractC22676k.m65745e(this.textDisplay, buyNowCheckoutInfoCtaModel.textDisplay) && AbstractC22676k.m65745e(this.destination, buyNowCheckoutInfoCtaModel.destination);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getTextDisplay() {
        return this.textDisplay;
    }

    public int hashCode() {
        int iHashCode = this.textDisplay.hashCode() * 31;
        C9598e c9598e = this.destination;
        return iHashCode + (c9598e == null ? 0 : c9598e.hashCode());
    }

    public String toString() {
        return AbstractC26725a.m79502f("BuyNowCheckoutInfoCtaModel(textDisplay=", this.textDisplay, ", destination=", this.destination, ")");
    }

    public /* synthetic */ BuyNowCheckoutInfoCtaModel(int i13, String str, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        this.textDisplay = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
    }

    public BuyNowCheckoutInfoCtaModel(String textDisplay, C9598e c9598e) {
        AbstractC22676k.m65750j(textDisplay, "textDisplay");
        this.textDisplay = textDisplay;
        this.destination = c9598e;
    }

    public /* synthetic */ BuyNowCheckoutInfoCtaModel(String str, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : c9598e);
    }
}
