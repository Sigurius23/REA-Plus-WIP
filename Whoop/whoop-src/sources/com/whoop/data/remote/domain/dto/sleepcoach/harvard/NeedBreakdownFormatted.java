package com.whoop.data.remote.domain.dto.sleepcoach.harvard;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u0006/"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;", "", "", "totalNeed", "baselineNeed", "napsNeed", "strainNeed", "debtNeed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTotalNeed", "getBaselineNeed", "getNapsNeed", "getStrainNeed", "getDebtNeed", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NeedBreakdownFormatted {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("baseline_need")
    private final String baselineNeed;

    @SerializedName("debt_need")
    private final String debtNeed;

    @SerializedName("naps_need")
    private final String napsNeed;

    @SerializedName("strain_need")
    private final String strainNeed;

    @SerializedName("total_need")
    private final String totalNeed;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/NeedBreakdownFormatted;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NeedBreakdownFormatted$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NeedBreakdownFormatted(int i13, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, NeedBreakdownFormatted$$serializer.INSTANCE.getDescriptor());
        }
        this.totalNeed = str;
        this.baselineNeed = str2;
        this.napsNeed = str3;
        this.strainNeed = str4;
        this.debtNeed = str5;
    }

    public static /* synthetic */ NeedBreakdownFormatted copy$default(NeedBreakdownFormatted needBreakdownFormatted, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = needBreakdownFormatted.totalNeed;
        }
        if ((i13 & 2) != 0) {
            str2 = needBreakdownFormatted.baselineNeed;
        }
        if ((i13 & 4) != 0) {
            str3 = needBreakdownFormatted.napsNeed;
        }
        if ((i13 & 8) != 0) {
            str4 = needBreakdownFormatted.strainNeed;
        }
        if ((i13 & 16) != 0) {
            str5 = needBreakdownFormatted.debtNeed;
        }
        String str6 = str5;
        String str7 = str3;
        return needBreakdownFormatted.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$core_release(NeedBreakdownFormatted self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.totalNeed);
        output.encodeStringElement(serialDesc, 1, self.baselineNeed);
        output.encodeStringElement(serialDesc, 2, self.napsNeed);
        output.encodeStringElement(serialDesc, 3, self.strainNeed);
        output.encodeStringElement(serialDesc, 4, self.debtNeed);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTotalNeed() {
        return this.totalNeed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBaselineNeed() {
        return this.baselineNeed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNapsNeed() {
        return this.napsNeed;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStrainNeed() {
        return this.strainNeed;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDebtNeed() {
        return this.debtNeed;
    }

    public final NeedBreakdownFormatted copy(String totalNeed, String baselineNeed, String napsNeed, String strainNeed, String debtNeed) {
        AbstractC22676k.m65750j(totalNeed, "totalNeed");
        AbstractC22676k.m65750j(baselineNeed, "baselineNeed");
        AbstractC22676k.m65750j(napsNeed, "napsNeed");
        AbstractC22676k.m65750j(strainNeed, "strainNeed");
        AbstractC22676k.m65750j(debtNeed, "debtNeed");
        return new NeedBreakdownFormatted(totalNeed, baselineNeed, napsNeed, strainNeed, debtNeed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NeedBreakdownFormatted)) {
            return false;
        }
        NeedBreakdownFormatted needBreakdownFormatted = (NeedBreakdownFormatted) other;
        return AbstractC22676k.m65745e(this.totalNeed, needBreakdownFormatted.totalNeed) && AbstractC22676k.m65745e(this.baselineNeed, needBreakdownFormatted.baselineNeed) && AbstractC22676k.m65745e(this.napsNeed, needBreakdownFormatted.napsNeed) && AbstractC22676k.m65745e(this.strainNeed, needBreakdownFormatted.strainNeed) && AbstractC22676k.m65745e(this.debtNeed, needBreakdownFormatted.debtNeed);
    }

    public final String getBaselineNeed() {
        return this.baselineNeed;
    }

    public final String getDebtNeed() {
        return this.debtNeed;
    }

    public final String getNapsNeed() {
        return this.napsNeed;
    }

    public final String getStrainNeed() {
        return this.strainNeed;
    }

    public final String getTotalNeed() {
        return this.totalNeed;
    }

    public int hashCode() {
        return this.debtNeed.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.totalNeed.hashCode() * 31, 31, this.baselineNeed), 31, this.napsNeed), 31, this.strainNeed);
    }

    public String toString() {
        String str = this.totalNeed;
        String str2 = this.baselineNeed;
        String str3 = this.napsNeed;
        String str4 = this.strainNeed;
        String str5 = this.debtNeed;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("NeedBreakdownFormatted(totalNeed=", str, ", baselineNeed=", str2, ", napsNeed=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", strainNeed=", str4, ", debtNeed=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public NeedBreakdownFormatted(String totalNeed, String baselineNeed, String napsNeed, String strainNeed, String debtNeed) {
        AbstractC22676k.m65750j(totalNeed, "totalNeed");
        AbstractC22676k.m65750j(baselineNeed, "baselineNeed");
        AbstractC22676k.m65750j(napsNeed, "napsNeed");
        AbstractC22676k.m65750j(strainNeed, "strainNeed");
        AbstractC22676k.m65750j(debtNeed, "debtNeed");
        this.totalNeed = totalNeed;
        this.baselineNeed = baselineNeed;
        this.napsNeed = napsNeed;
        this.strainNeed = strainNeed;
        this.debtNeed = debtNeed;
    }
}
