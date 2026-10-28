package com.stripe.android.financialconnections.lite.repository.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0015¨\u0006("}, m65681d2 = {"Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;", "", "Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;", "manifest", "<init>", "(Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$financial_connections_lite_release", "(Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;", "copy", "(Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;)Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;", "getManifest", "getManifest$annotations", "()V", "Companion", "$serializer", "com/stripe/android/financialconnections/lite/repository/model/b", "financial-connections-lite_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SynchronizeSessionResponse {
    public static final C5600b Companion = new C5600b();
    private final FinancialConnectionsSessionManifest manifest;

    public /* synthetic */ SynchronizeSessionResponse(int i13, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, SynchronizeSessionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.manifest = financialConnectionsSessionManifest;
    }

    public static /* synthetic */ SynchronizeSessionResponse copy$default(SynchronizeSessionResponse synchronizeSessionResponse, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            financialConnectionsSessionManifest = synchronizeSessionResponse.manifest;
        }
        return synchronizeSessionResponse.copy(financialConnectionsSessionManifest);
    }

    @InterfaceC37143h("manifest")
    public static /* synthetic */ void getManifest$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FinancialConnectionsSessionManifest getManifest() {
        return this.manifest;
    }

    public final SynchronizeSessionResponse copy(FinancialConnectionsSessionManifest manifest) {
        AbstractC22676k.m65750j(manifest, "manifest");
        return new SynchronizeSessionResponse(manifest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SynchronizeSessionResponse) && AbstractC22676k.m65745e(this.manifest, ((SynchronizeSessionResponse) other).manifest);
    }

    public final FinancialConnectionsSessionManifest getManifest() {
        return this.manifest;
    }

    public int hashCode() {
        return this.manifest.hashCode();
    }

    public String toString() {
        return "SynchronizeSessionResponse(manifest=" + this.manifest + ")";
    }

    public SynchronizeSessionResponse(FinancialConnectionsSessionManifest manifest) {
        AbstractC22676k.m65750j(manifest, "manifest");
        this.manifest = manifest;
    }
}
