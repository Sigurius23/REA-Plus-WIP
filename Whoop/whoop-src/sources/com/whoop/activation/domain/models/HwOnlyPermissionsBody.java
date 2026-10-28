package com.whoop.activation.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001b¨\u0006+"}, m65681d2 = {"Lcom/whoop/activation/domain/models/HwOnlyPermissionsBody;", "", "", "consentsAccepted", "marketingOptIn", "", "stripeToken", "<init>", "(ZZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/HwOnlyPermissionsBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "copy", "(ZZLjava/lang/String;)Lcom/whoop/activation/domain/models/HwOnlyPermissionsBody;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getConsentsAccepted", "getMarketingOptIn", "Ljava/lang/String;", "getStripeToken", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HwOnlyPermissionsBody {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean consentsAccepted;
    private final boolean marketingOptIn;
    private final String stripeToken;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/HwOnlyPermissionsBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/HwOnlyPermissionsBody;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HwOnlyPermissionsBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HwOnlyPermissionsBody(int i13, boolean z4, boolean z13, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, HwOnlyPermissionsBody$$serializer.INSTANCE.getDescriptor());
        }
        this.consentsAccepted = z4;
        this.marketingOptIn = z13;
        this.stripeToken = str;
    }

    public static /* synthetic */ HwOnlyPermissionsBody copy$default(HwOnlyPermissionsBody hwOnlyPermissionsBody, boolean z4, boolean z13, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = hwOnlyPermissionsBody.consentsAccepted;
        }
        if ((i13 & 2) != 0) {
            z13 = hwOnlyPermissionsBody.marketingOptIn;
        }
        if ((i13 & 4) != 0) {
            str = hwOnlyPermissionsBody.stripeToken;
        }
        return hwOnlyPermissionsBody.copy(z4, z13, str);
    }

    public static final /* synthetic */ void write$Self$activation_release(HwOnlyPermissionsBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.consentsAccepted);
        output.encodeBooleanElement(serialDesc, 1, self.marketingOptIn);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.stripeToken);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getConsentsAccepted() {
        return this.consentsAccepted;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getMarketingOptIn() {
        return this.marketingOptIn;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStripeToken() {
        return this.stripeToken;
    }

    public final HwOnlyPermissionsBody copy(boolean consentsAccepted, boolean marketingOptIn, String stripeToken) {
        return new HwOnlyPermissionsBody(consentsAccepted, marketingOptIn, stripeToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HwOnlyPermissionsBody)) {
            return false;
        }
        HwOnlyPermissionsBody hwOnlyPermissionsBody = (HwOnlyPermissionsBody) other;
        return this.consentsAccepted == hwOnlyPermissionsBody.consentsAccepted && this.marketingOptIn == hwOnlyPermissionsBody.marketingOptIn && AbstractC22676k.m65745e(this.stripeToken, hwOnlyPermissionsBody.stripeToken);
    }

    public final boolean getConsentsAccepted() {
        return this.consentsAccepted;
    }

    public final boolean getMarketingOptIn() {
        return this.marketingOptIn;
    }

    public final String getStripeToken() {
        return this.stripeToken;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.consentsAccepted) * 31, 31, this.marketingOptIn);
        String str = this.stripeToken;
        return iM8289b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.stripeToken, ")", AbstractC11895b.m32002u("HwOnlyPermissionsBody(consentsAccepted=", ", marketingOptIn=", ", stripeToken=", this.consentsAccepted, this.marketingOptIn));
    }

    public HwOnlyPermissionsBody(boolean z4, boolean z13, String str) {
        this.consentsAccepted = z4;
        this.marketingOptIn = z13;
        this.stripeToken = str;
    }
}
