package com.whoop.labrador.feature.eligibility.domain.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0017¨\u0006*"}, m65681d2 = {"Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;", "", "", "twentyTwoOrOlder", "locatedInUS", "deleted", "<init>", "(ZZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$labrador_release", "(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "component3", "copy", "(ZZZ)Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getTwentyTwoOrOlder", "getLocatedInUS", "getDeleted", "Companion", "$serializer", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LabradorEligibilityRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("deleted")
    private final boolean deleted;

    @SerializedName("located_in_us")
    private final boolean locatedInUS;

    @SerializedName("twenty_two_or_older")
    private final boolean twentyTwoOrOlder;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;", "serializer", "()Lwc3/c;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LabradorEligibilityRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LabradorEligibilityRequest(int i13, boolean z4, boolean z13, boolean z14, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, LabradorEligibilityRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.twentyTwoOrOlder = z4;
        this.locatedInUS = z13;
        this.deleted = z14;
    }

    public static /* synthetic */ LabradorEligibilityRequest copy$default(LabradorEligibilityRequest labradorEligibilityRequest, boolean z4, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = labradorEligibilityRequest.twentyTwoOrOlder;
        }
        if ((i13 & 2) != 0) {
            z13 = labradorEligibilityRequest.locatedInUS;
        }
        if ((i13 & 4) != 0) {
            z14 = labradorEligibilityRequest.deleted;
        }
        return labradorEligibilityRequest.copy(z4, z13, z14);
    }

    public static final /* synthetic */ void write$Self$labrador_release(LabradorEligibilityRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.twentyTwoOrOlder);
        output.encodeBooleanElement(serialDesc, 1, self.locatedInUS);
        output.encodeBooleanElement(serialDesc, 2, self.deleted);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getTwentyTwoOrOlder() {
        return this.twentyTwoOrOlder;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getLocatedInUS() {
        return this.locatedInUS;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    public final LabradorEligibilityRequest copy(boolean twentyTwoOrOlder, boolean locatedInUS, boolean deleted) {
        return new LabradorEligibilityRequest(twentyTwoOrOlder, locatedInUS, deleted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabradorEligibilityRequest)) {
            return false;
        }
        LabradorEligibilityRequest labradorEligibilityRequest = (LabradorEligibilityRequest) other;
        return this.twentyTwoOrOlder == labradorEligibilityRequest.twentyTwoOrOlder && this.locatedInUS == labradorEligibilityRequest.locatedInUS && this.deleted == labradorEligibilityRequest.deleted;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final boolean getLocatedInUS() {
        return this.locatedInUS;
    }

    public final boolean getTwentyTwoOrOlder() {
        return this.twentyTwoOrOlder;
    }

    public int hashCode() {
        return Boolean.hashCode(this.deleted) + AbstractC2875y.m8289b(Boolean.hashCode(this.twentyTwoOrOlder) * 31, 31, this.locatedInUS);
    }

    public String toString() {
        boolean z4 = this.twentyTwoOrOlder;
        boolean z13 = this.locatedInUS;
        return AbstractC18489d0.m53372m(AbstractC11895b.m32002u("LabradorEligibilityRequest(twentyTwoOrOlder=", ", locatedInUS=", ", deleted=", z4, z13), this.deleted, ")");
    }

    public LabradorEligibilityRequest(boolean z4, boolean z13, boolean z14) {
        this.twentyTwoOrOlder = z4;
        this.locatedInUS = z13;
        this.deleted = z14;
    }
}
