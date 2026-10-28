package com.whoop.data.remote.domain.dto.sleepcoach.harvard;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0018¨\u0006/"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;", "", "", "baseline", "debt", "naps", "strain", "total", "<init>", "(IIIII)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "component5", "copy", "(IIIII)Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getBaseline", "getDebt", "getNaps", "getStrain", "getTotal", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NeedBreakdown {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("baseline")
    private final int baseline;

    @SerializedName("debt")
    private final int debt;

    @SerializedName("naps")
    private final int naps;

    @SerializedName("strain")
    private final int strain;

    @SerializedName("total")
    private final int total;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdown;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NeedBreakdown$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public NeedBreakdown(int i13, int i14, int i15, int i16, int i17) {
        this.baseline = i13;
        this.debt = i14;
        this.naps = i15;
        this.strain = i16;
        this.total = i17;
    }

    public static /* synthetic */ NeedBreakdown copy$default(NeedBreakdown needBreakdown, int i13, int i14, int i15, int i16, int i17, int i18, Object obj) {
        if ((i18 & 1) != 0) {
            i13 = needBreakdown.baseline;
        }
        if ((i18 & 2) != 0) {
            i14 = needBreakdown.debt;
        }
        if ((i18 & 4) != 0) {
            i15 = needBreakdown.naps;
        }
        if ((i18 & 8) != 0) {
            i16 = needBreakdown.strain;
        }
        if ((i18 & 16) != 0) {
            i17 = needBreakdown.total;
        }
        int i19 = i17;
        int i24 = i15;
        return needBreakdown.copy(i13, i14, i24, i16, i19);
    }

    public static final /* synthetic */ void write$Self$core_release(NeedBreakdown self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.baseline);
        output.encodeIntElement(serialDesc, 1, self.debt);
        output.encodeIntElement(serialDesc, 2, self.naps);
        output.encodeIntElement(serialDesc, 3, self.strain);
        output.encodeIntElement(serialDesc, 4, self.total);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBaseline() {
        return this.baseline;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDebt() {
        return this.debt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNaps() {
        return this.naps;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStrain() {
        return this.strain;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final NeedBreakdown copy(int baseline, int debt, int naps, int strain, int total) {
        return new NeedBreakdown(baseline, debt, naps, strain, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NeedBreakdown)) {
            return false;
        }
        NeedBreakdown needBreakdown = (NeedBreakdown) other;
        return this.baseline == needBreakdown.baseline && this.debt == needBreakdown.debt && this.naps == needBreakdown.naps && this.strain == needBreakdown.strain && this.total == needBreakdown.total;
    }

    public final int getBaseline() {
        return this.baseline;
    }

    public final int getDebt() {
        return this.debt;
    }

    public final int getNaps() {
        return this.naps;
    }

    public final int getStrain() {
        return this.strain;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return Integer.hashCode(this.total) + AbstractC11266d.m30448b(this.strain, AbstractC11266d.m30448b(this.naps, AbstractC11266d.m30448b(this.debt, Integer.hashCode(this.baseline) * 31, 31), 31), 31);
    }

    public String toString() {
        int i13 = this.baseline;
        int i14 = this.debt;
        int i15 = this.naps;
        int i16 = this.strain;
        int i17 = this.total;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "NeedBreakdown(baseline=", ", debt=", ", naps=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", strain=", i16, ", total=");
        return AbstractC18489d0.m53371l(sbM30465s, i17, ")");
    }

    public /* synthetic */ NeedBreakdown(int i13, int i14, int i15, int i16, int i17, int i18, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, NeedBreakdown$$serializer.INSTANCE.getDescriptor());
        }
        this.baseline = i14;
        this.debt = i15;
        this.naps = i16;
        this.strain = i17;
        this.total = i18;
    }
}
