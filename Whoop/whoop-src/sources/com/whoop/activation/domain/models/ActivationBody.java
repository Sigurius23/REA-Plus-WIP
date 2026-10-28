package com.whoop.activation.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q41.C29968a;
import q83.AbstractC30060g;
import r80.EnumC31059a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJR\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b1\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\"R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b4\u0010\u001f¨\u00067"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationBody;", "", "", "stripeToken", "zipCode", "", "consentsAccepted", "marketingOptIn", "Lr80/a;", "billingFrequency", "recommendationOptIn", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLr80/a;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZZLr80/a;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/ActivationBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "()Lr80/a;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLr80/a;Z)Lcom/whoop/activation/domain/models/ActivationBody;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStripeToken", "getZipCode", "Z", "getConsentsAccepted", "getMarketingOptIn", "Lr80/a;", "getBillingFrequency", "getRecommendationOptIn", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivationBody {
    public static final int $stable = 0;
    private final EnumC31059a billingFrequency;
    private final boolean consentsAccepted;
    private final boolean marketingOptIn;
    private final boolean recommendationOptIn;
    private final String stripeToken;
    private final String zipCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C29968a(7)), null};

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/ActivationBody;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivationBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActivationBody(int i13, String str, String str2, boolean z4, boolean z13, EnumC31059a enumC31059a, boolean z14, SerializationConstructorMarker serializationConstructorMarker) {
        if (61 != (i13 & 61)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 61, ActivationBody$$serializer.INSTANCE.getDescriptor());
        }
        this.stripeToken = str;
        if ((i13 & 2) == 0) {
            this.zipCode = null;
        } else {
            this.zipCode = str2;
        }
        this.consentsAccepted = z4;
        this.marketingOptIn = z13;
        this.billingFrequency = enumC31059a;
        this.recommendationOptIn = z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.activation.view.screens.billingfrequency.BillingFrequency", EnumC31059a.values());
    }

    public static /* synthetic */ ActivationBody copy$default(ActivationBody activationBody, String str, String str2, boolean z4, boolean z13, EnumC31059a enumC31059a, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = activationBody.stripeToken;
        }
        if ((i13 & 2) != 0) {
            str2 = activationBody.zipCode;
        }
        if ((i13 & 4) != 0) {
            z4 = activationBody.consentsAccepted;
        }
        if ((i13 & 8) != 0) {
            z13 = activationBody.marketingOptIn;
        }
        if ((i13 & 16) != 0) {
            enumC31059a = activationBody.billingFrequency;
        }
        if ((i13 & 32) != 0) {
            z14 = activationBody.recommendationOptIn;
        }
        EnumC31059a enumC31059a2 = enumC31059a;
        boolean z15 = z14;
        return activationBody.copy(str, str2, z4, z13, enumC31059a2, z15);
    }

    public static final /* synthetic */ void write$Self$activation_release(ActivationBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.stripeToken);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.zipCode != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.zipCode);
        }
        output.encodeBooleanElement(serialDesc, 2, self.consentsAccepted);
        output.encodeBooleanElement(serialDesc, 3, self.marketingOptIn);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.billingFrequency);
        output.encodeBooleanElement(serialDesc, 5, self.recommendationOptIn);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStripeToken() {
        return this.stripeToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getConsentsAccepted() {
        return this.consentsAccepted;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getMarketingOptIn() {
        return this.marketingOptIn;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC31059a getBillingFrequency() {
        return this.billingFrequency;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getRecommendationOptIn() {
        return this.recommendationOptIn;
    }

    public final ActivationBody copy(String stripeToken, String zipCode, boolean consentsAccepted, boolean marketingOptIn, EnumC31059a billingFrequency, boolean recommendationOptIn) {
        return new ActivationBody(stripeToken, zipCode, consentsAccepted, marketingOptIn, billingFrequency, recommendationOptIn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivationBody)) {
            return false;
        }
        ActivationBody activationBody = (ActivationBody) other;
        return AbstractC22676k.m65745e(this.stripeToken, activationBody.stripeToken) && AbstractC22676k.m65745e(this.zipCode, activationBody.zipCode) && this.consentsAccepted == activationBody.consentsAccepted && this.marketingOptIn == activationBody.marketingOptIn && this.billingFrequency == activationBody.billingFrequency && this.recommendationOptIn == activationBody.recommendationOptIn;
    }

    public final EnumC31059a getBillingFrequency() {
        return this.billingFrequency;
    }

    public final boolean getConsentsAccepted() {
        return this.consentsAccepted;
    }

    public final boolean getMarketingOptIn() {
        return this.marketingOptIn;
    }

    public final boolean getRecommendationOptIn() {
        return this.recommendationOptIn;
    }

    public final String getStripeToken() {
        return this.stripeToken;
    }

    public final String getZipCode() {
        return this.zipCode;
    }

    public int hashCode() {
        String str = this.stripeToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.zipCode;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.consentsAccepted), 31, this.marketingOptIn);
        EnumC31059a enumC31059a = this.billingFrequency;
        return Boolean.hashCode(this.recommendationOptIn) + ((iM8289b + (enumC31059a != null ? enumC31059a.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.stripeToken;
        String str2 = this.zipCode;
        boolean z4 = this.consentsAccepted;
        boolean z13 = this.marketingOptIn;
        EnumC31059a enumC31059a = this.billingFrequency;
        boolean z14 = this.recommendationOptIn;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ActivationBody(stripeToken=", str, ", zipCode=", str2, ", consentsAccepted=");
        AbstractC38963t7.m124392v(sbM32001t, z4, ", marketingOptIn=", z13, ", billingFrequency=");
        sbM32001t.append(enumC31059a);
        sbM32001t.append(", recommendationOptIn=");
        sbM32001t.append(z14);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ActivationBody(String str, String str2, boolean z4, boolean z13, EnumC31059a enumC31059a, boolean z14) {
        this.stripeToken = str;
        this.zipCode = str2;
        this.consentsAccepted = z4;
        this.marketingOptIn = z13;
        this.billingFrequency = enumC31059a;
        this.recommendationOptIn = z14;
    }

    public /* synthetic */ ActivationBody(String str, String str2, boolean z4, boolean z13, EnumC31059a enumC31059a, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, z4, z13, enumC31059a, z14);
    }
}
