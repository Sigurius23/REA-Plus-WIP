package com.whoop.service.network.model;

import c13.AbstractC3855a;
import com.whoop.data.remote.domain.response.growth.TrialDetails;
import com.whoop.p069ui.AbstractC10538f;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001c¨\u0006+"}, m65681d2 = {"Lcom/whoop/service/network/model/TrialDetailsModel;", "", "", "trialCancellationEligible", "", "trialEndDate", "<init>", "(ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/service/network/model/TrialDetailsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/remote/domain/response/growth/TrialDetails;", "toTrialDetails", "()Lcom/whoop/data/remote/domain/response/growth/TrialDetails;", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/whoop/service/network/model/TrialDetailsModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getTrialCancellationEligible", "Ljava/lang/String;", "getTrialEndDate", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrialDetailsModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean trialCancellationEligible;
    private final String trialEndDate;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/service/network/model/TrialDetailsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/service/network/model/TrialDetailsModel;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrialDetailsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TrialDetailsModel(int i13, boolean z4, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, TrialDetailsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.trialCancellationEligible = z4;
        this.trialEndDate = str;
    }

    public static /* synthetic */ TrialDetailsModel copy$default(TrialDetailsModel trialDetailsModel, boolean z4, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = trialDetailsModel.trialCancellationEligible;
        }
        if ((i13 & 2) != 0) {
            str = trialDetailsModel.trialEndDate;
        }
        return trialDetailsModel.copy(z4, str);
    }

    public static final /* synthetic */ void write$Self$core_release(TrialDetailsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.trialCancellationEligible);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.trialEndDate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getTrialCancellationEligible() {
        return this.trialCancellationEligible;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTrialEndDate() {
        return this.trialEndDate;
    }

    public final TrialDetailsModel copy(boolean trialCancellationEligible, String trialEndDate) {
        return new TrialDetailsModel(trialCancellationEligible, trialEndDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrialDetailsModel)) {
            return false;
        }
        TrialDetailsModel trialDetailsModel = (TrialDetailsModel) other;
        return this.trialCancellationEligible == trialDetailsModel.trialCancellationEligible && AbstractC22676k.m65745e(this.trialEndDate, trialDetailsModel.trialEndDate);
    }

    public final boolean getTrialCancellationEligible() {
        return this.trialCancellationEligible;
    }

    public final String getTrialEndDate() {
        return this.trialEndDate;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.trialCancellationEligible) * 31;
        String str = this.trialEndDate;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC3855a.m11825i("TrialDetailsModel(trialCancellationEligible=", ", trialEndDate=", this.trialEndDate, ")", this.trialCancellationEligible);
    }

    public final TrialDetails toTrialDetails() {
        boolean z4 = this.trialCancellationEligible;
        String str = this.trialEndDate;
        return new TrialDetails(z4, str != null ? AbstractC10538f.m27189n(str) : null);
    }

    public TrialDetailsModel(boolean z4, String str) {
        this.trialCancellationEligible = z4;
        this.trialEndDate = str;
    }
}
