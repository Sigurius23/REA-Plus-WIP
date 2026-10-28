package com.stripe.android.financialconnections.lite.repository.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002,-B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u0017¨\u0006."}, m65681d2 = {"Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;", "", "", "cancelUrl", "hostedAuthUrl", "successUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$financial_connections_lite_release", "(Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCancelUrl", "getCancelUrl$annotations", "()V", "getHostedAuthUrl", "getHostedAuthUrl$annotations", "getSuccessUrl", "getSuccessUrl$annotations", "Companion", "$serializer", "com/stripe/android/financialconnections/lite/repository/model/a", "financial-connections-lite_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FinancialConnectionsSessionManifest {
    public static final C5599a Companion = new C5599a();
    private final String cancelUrl;
    private final String hostedAuthUrl;
    private final String successUrl;

    public FinancialConnectionsSessionManifest() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ FinancialConnectionsSessionManifest copy$default(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = financialConnectionsSessionManifest.cancelUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = financialConnectionsSessionManifest.hostedAuthUrl;
        }
        if ((i13 & 4) != 0) {
            str3 = financialConnectionsSessionManifest.successUrl;
        }
        return financialConnectionsSessionManifest.copy(str, str2, str3);
    }

    @InterfaceC37143h("cancel_url")
    public static /* synthetic */ void getCancelUrl$annotations() {
    }

    @InterfaceC37143h("hosted_auth_url")
    public static /* synthetic */ void getHostedAuthUrl$annotations() {
    }

    @InterfaceC37143h("success_url")
    public static /* synthetic */ void getSuccessUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$financial_connections_lite_release(FinancialConnectionsSessionManifest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.cancelUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.cancelUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.hostedAuthUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.hostedAuthUrl);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.successUrl == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.successUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCancelUrl() {
        return this.cancelUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHostedAuthUrl() {
        return this.hostedAuthUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSuccessUrl() {
        return this.successUrl;
    }

    public final FinancialConnectionsSessionManifest copy(String cancelUrl, String hostedAuthUrl, String successUrl) {
        return new FinancialConnectionsSessionManifest(cancelUrl, hostedAuthUrl, successUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsSessionManifest)) {
            return false;
        }
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) other;
        return AbstractC22676k.m65745e(this.cancelUrl, financialConnectionsSessionManifest.cancelUrl) && AbstractC22676k.m65745e(this.hostedAuthUrl, financialConnectionsSessionManifest.hostedAuthUrl) && AbstractC22676k.m65745e(this.successUrl, financialConnectionsSessionManifest.successUrl);
    }

    public final String getCancelUrl() {
        return this.cancelUrl;
    }

    public final String getHostedAuthUrl() {
        return this.hostedAuthUrl;
    }

    public final String getSuccessUrl() {
        return this.successUrl;
    }

    public int hashCode() {
        String str = this.cancelUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hostedAuthUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.successUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.successUrl, ")", AbstractC11895b.m32001t("FinancialConnectionsSessionManifest(cancelUrl=", this.cancelUrl, ", hostedAuthUrl=", this.hostedAuthUrl, ", successUrl="));
    }

    public /* synthetic */ FinancialConnectionsSessionManifest(int i13, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.cancelUrl = null;
        } else {
            this.cancelUrl = str;
        }
        if ((i13 & 2) == 0) {
            this.hostedAuthUrl = null;
        } else {
            this.hostedAuthUrl = str2;
        }
        if ((i13 & 4) == 0) {
            this.successUrl = null;
        } else {
            this.successUrl = str3;
        }
    }

    public FinancialConnectionsSessionManifest(String str, String str2, String str3) {
        this.cancelUrl = str;
        this.hostedAuthUrl = str2;
        this.successUrl = str3;
    }

    public /* synthetic */ FinancialConnectionsSessionManifest(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
    }
}
