package com.whoop.activation.domain.models.steps;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import md1.C25452a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001f¨\u00061"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/OrderItem;", "", "Lcom/whoop/design/util/TextResource;", "label", "", "highlight", "amount", "", "strikethroughAmount", "<init>", "(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/OrderItem;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Z", "component3", "component4", "()Ljava/lang/String;", "copy", "(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/activation/domain/models/steps/OrderItem;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getLabel", "Z", "getHighlight", "getAmount", "Ljava/lang/String;", "getStrikethroughAmount", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OrderItem {
    private final TextResource amount;
    private final boolean highlight;
    private final TextResource label;
    private final String strikethroughAmount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/OrderItem$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/OrderItem;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OrderItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public OrderItem() {
        this((TextResource) null, false, (TextResource) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OrderItem copy$default(OrderItem orderItem, TextResource textResource, boolean z4, TextResource textResource2, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = orderItem.label;
        }
        if ((i13 & 2) != 0) {
            z4 = orderItem.highlight;
        }
        if ((i13 & 4) != 0) {
            textResource2 = orderItem.amount;
        }
        if ((i13 & 8) != 0) {
            str = orderItem.strikethroughAmount;
        }
        return orderItem.copy(textResource, z4, textResource2, str);
    }

    public static final /* synthetic */ void write$Self$activation_release(OrderItem self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.label, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.highlight) {
            output.encodeBooleanElement(serialDesc, 1, self.highlight);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.amount, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 2, C25452a.f99689a, self.amount);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.strikethroughAmount == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.strikethroughAmount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHighlight() {
        return this.highlight;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStrikethroughAmount() {
        return this.strikethroughAmount;
    }

    public final OrderItem copy(TextResource label, boolean highlight, TextResource amount, String strikethroughAmount) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(amount, "amount");
        return new OrderItem(label, highlight, amount, strikethroughAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderItem)) {
            return false;
        }
        OrderItem orderItem = (OrderItem) other;
        return AbstractC22676k.m65745e(this.label, orderItem.label) && this.highlight == orderItem.highlight && AbstractC22676k.m65745e(this.amount, orderItem.amount) && AbstractC22676k.m65745e(this.strikethroughAmount, orderItem.strikethroughAmount);
    }

    public final TextResource getAmount() {
        return this.amount;
    }

    public final boolean getHighlight() {
        return this.highlight;
    }

    public final TextResource getLabel() {
        return this.label;
    }

    public final String getStrikethroughAmount() {
        return this.strikethroughAmount;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC2875y.m8289b(this.label.hashCode() * 31, 31, this.highlight), this.amount, 31);
        String str = this.strikethroughAmount;
        return iM95625a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        TextResource textResource = this.label;
        boolean z4 = this.highlight;
        TextResource textResource2 = this.amount;
        String str = this.strikethroughAmount;
        StringBuilder sbM91846p = AbstractC30007c.m91846p("OrderItem(label=", textResource, ", highlight=", z4, ", amount=");
        sbM91846p.append(textResource2);
        sbM91846p.append(", strikethroughAmount=");
        sbM91846p.append(str);
        sbM91846p.append(")");
        return sbM91846p.toString();
    }

    public /* synthetic */ OrderItem(int i13, TextResource textResource, boolean z4, TextResource textResource2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.label = (i13 & 1) == 0 ? AbstractC8693b.m21267a() : textResource;
        if ((i13 & 2) == 0) {
            this.highlight = false;
        } else {
            this.highlight = z4;
        }
        if ((i13 & 4) == 0) {
            this.amount = AbstractC8693b.m21267a();
        } else {
            this.amount = textResource2;
        }
        if ((i13 & 8) == 0) {
            this.strikethroughAmount = null;
        } else {
            this.strikethroughAmount = str;
        }
    }

    public OrderItem(TextResource label, boolean z4, TextResource amount, String str) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(amount, "amount");
        this.label = label;
        this.highlight = z4;
        this.amount = amount;
        this.strikethroughAmount = str;
    }

    public /* synthetic */ OrderItem(TextResource textResource, boolean z4, TextResource textResource2, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? null : str);
    }
}
