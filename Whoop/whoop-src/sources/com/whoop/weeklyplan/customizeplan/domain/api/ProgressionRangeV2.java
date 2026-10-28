package com.whoop.weeklyplan.customizeplan.domain.api;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0016¨\u0006+"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRangeV2;", "", "", NotificationCompat.CATEGORY_RECOMMENDATION, "baseline", "<init>", "(DD)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRangeV2;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "copy", "(DD)Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRangeV2;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getRecommendation", "getRecommendation$annotations", "()V", "getBaseline", "getBaseline$annotations", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProgressionRangeV2 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final double baseline;
    private final double recommendation;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRangeV2$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRangeV2;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProgressionRangeV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ProgressionRangeV2(double d3, double d14) {
        this.recommendation = d3;
        this.baseline = d14;
    }

    public static /* synthetic */ ProgressionRangeV2 copy$default(ProgressionRangeV2 progressionRangeV2, double d3, double d14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = progressionRangeV2.recommendation;
        }
        if ((i13 & 2) != 0) {
            d14 = progressionRangeV2.baseline;
        }
        return progressionRangeV2.copy(d3, d14);
    }

    @InterfaceC37143h("baseline_value")
    public static /* synthetic */ void getBaseline$annotations() {
    }

    @InterfaceC37143h("recommendation_value")
    public static /* synthetic */ void getRecommendation$annotations() {
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(ProgressionRangeV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.recommendation);
        output.encodeDoubleElement(serialDesc, 1, self.baseline);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getRecommendation() {
        return this.recommendation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getBaseline() {
        return this.baseline;
    }

    public final ProgressionRangeV2 copy(double recommendation, double baseline) {
        return new ProgressionRangeV2(recommendation, baseline);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressionRangeV2)) {
            return false;
        }
        ProgressionRangeV2 progressionRangeV2 = (ProgressionRangeV2) other;
        return Double.compare(this.recommendation, progressionRangeV2.recommendation) == 0 && Double.compare(this.baseline, progressionRangeV2.baseline) == 0;
    }

    public final double getBaseline() {
        return this.baseline;
    }

    public final double getRecommendation() {
        return this.recommendation;
    }

    public int hashCode() {
        return Double.hashCode(this.baseline) + (Double.hashCode(this.recommendation) * 31);
    }

    public String toString() {
        return AbstractC30007c.m91836f(this.baseline, ")", AbstractC2875y.m8306s("ProgressionRangeV2(recommendation=", this.recommendation, ", baseline="));
    }

    public /* synthetic */ ProgressionRangeV2(int i13, double d3, double d14, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ProgressionRangeV2$$serializer.INSTANCE.getDescriptor());
        }
        this.recommendation = d3;
        this.baseline = d14;
    }
}
