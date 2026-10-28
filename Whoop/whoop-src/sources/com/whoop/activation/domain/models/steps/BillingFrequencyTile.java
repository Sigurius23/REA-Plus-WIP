package com.whoop.activation.domain.models.steps;

import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;", "", "Lcom/whoop/design/util/TextResource;", "text", "subtext", "upsellText", "", "billingFrequency", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "component4", "()Ljava/lang/String;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getText", "getSubtext", "getUpsellText", "Ljava/lang/String;", "getBillingFrequency", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BillingFrequencyTile {
    private final String billingFrequency;
    private final TextResource subtext;
    private final TextResource text;
    private final TextResource upsellText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BillingFrequencyTile$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BillingFrequencyTile(int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i13 & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 11, BillingFrequencyTile$$serializer.INSTANCE.getDescriptor());
        }
        this.text = textResource;
        this.subtext = textResource2;
        if ((i13 & 4) == 0) {
            this.upsellText = null;
        } else {
            this.upsellText = textResource3;
        }
        this.billingFrequency = str;
    }

    public static /* synthetic */ BillingFrequencyTile copy$default(BillingFrequencyTile billingFrequencyTile, TextResource textResource, TextResource textResource2, TextResource textResource3, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = billingFrequencyTile.text;
        }
        if ((i13 & 2) != 0) {
            textResource2 = billingFrequencyTile.subtext;
        }
        if ((i13 & 4) != 0) {
            textResource3 = billingFrequencyTile.upsellText;
        }
        if ((i13 & 8) != 0) {
            str = billingFrequencyTile.billingFrequency;
        }
        return billingFrequencyTile.copy(textResource, textResource2, textResource3, str);
    }

    public static final /* synthetic */ void write$Self$activation_release(BillingFrequencyTile self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.text);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.subtext);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.upsellText != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, c25452a, self.upsellText);
        }
        output.encodeStringElement(serialDesc, 3, self.billingFrequency);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getSubtext() {
        return this.subtext;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getUpsellText() {
        return this.upsellText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBillingFrequency() {
        return this.billingFrequency;
    }

    public final BillingFrequencyTile copy(TextResource text, TextResource subtext, TextResource upsellText, String billingFrequency) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(subtext, "subtext");
        AbstractC22676k.m65750j(billingFrequency, "billingFrequency");
        return new BillingFrequencyTile(text, subtext, upsellText, billingFrequency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingFrequencyTile)) {
            return false;
        }
        BillingFrequencyTile billingFrequencyTile = (BillingFrequencyTile) other;
        return AbstractC22676k.m65745e(this.text, billingFrequencyTile.text) && AbstractC22676k.m65745e(this.subtext, billingFrequencyTile.subtext) && AbstractC22676k.m65745e(this.upsellText, billingFrequencyTile.upsellText) && AbstractC22676k.m65745e(this.billingFrequency, billingFrequencyTile.billingFrequency);
    }

    public final String getBillingFrequency() {
        return this.billingFrequency;
    }

    public final TextResource getSubtext() {
        return this.subtext;
    }

    public final TextResource getText() {
        return this.text;
    }

    public final TextResource getUpsellText() {
        return this.upsellText;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.text.hashCode() * 31, this.subtext, 31);
        TextResource textResource = this.upsellText;
        return this.billingFrequency.hashCode() + ((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31);
    }

    public String toString() {
        TextResource textResource = this.text;
        TextResource textResource2 = this.subtext;
        TextResource textResource3 = this.upsellText;
        String str = this.billingFrequency;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("BillingFrequencyTile(text=", textResource, ", subtext=", textResource2, ", upsellText=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", billingFrequency=");
        sbM106658q.append(str);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public BillingFrequencyTile(TextResource text, TextResource subtext, TextResource textResource, String billingFrequency) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(subtext, "subtext");
        AbstractC22676k.m65750j(billingFrequency, "billingFrequency");
        this.text = text;
        this.subtext = subtext;
        this.upsellText = textResource;
        this.billingFrequency = billingFrequency;
    }

    public /* synthetic */ BillingFrequencyTile(TextResource textResource, TextResource textResource2, TextResource textResource3, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, (i13 & 4) != 0 ? null : textResource3, str);
    }
}
