package com.whoop.design.models.items.amoeba;

import com.mapbox.common.HttpHeaders;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00061"}, m65681d2 = {"Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;", "", "", HttpHeaders.AGE, "paceOfAging", "yearsDifference", "yearsDifferenceAnimationScore", "paceOfAgingAnimationScore", "<init>", "(DDDDD)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDDDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "component3", "component4", "component5", "copy", "(DDDDD)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getAge", "getPaceOfAging", "getYearsDifference", "getYearsDifferenceAnimationScore", "getPaceOfAgingAnimationScore", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WhoopAgeAmoebaStyleValues {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final double age;
    private final double paceOfAging;
    private final double paceOfAgingAnimationScore;
    private final double yearsDifference;
    private final double yearsDifferenceAnimationScore;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WhoopAgeAmoebaStyleValues$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WhoopAgeAmoebaStyleValues(double d3, double d14, double d15, double d16, double d17) {
        this.age = d3;
        this.paceOfAging = d14;
        this.yearsDifference = d15;
        this.yearsDifferenceAnimationScore = d16;
        this.paceOfAgingAnimationScore = d17;
    }

    public static /* synthetic */ WhoopAgeAmoebaStyleValues copy$default(WhoopAgeAmoebaStyleValues whoopAgeAmoebaStyleValues, double d3, double d14, double d15, double d16, double d17, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = whoopAgeAmoebaStyleValues.age;
        }
        double d18 = d3;
        if ((i13 & 2) != 0) {
            d14 = whoopAgeAmoebaStyleValues.paceOfAging;
        }
        return whoopAgeAmoebaStyleValues.copy(d18, d14, (i13 & 4) != 0 ? whoopAgeAmoebaStyleValues.yearsDifference : d15, (i13 & 8) != 0 ? whoopAgeAmoebaStyleValues.yearsDifferenceAnimationScore : d16, (i13 & 16) != 0 ? whoopAgeAmoebaStyleValues.paceOfAgingAnimationScore : d17);
    }

    public static final /* synthetic */ void write$Self$design_models_release(WhoopAgeAmoebaStyleValues self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.age);
        output.encodeDoubleElement(serialDesc, 1, self.paceOfAging);
        output.encodeDoubleElement(serialDesc, 2, self.yearsDifference);
        output.encodeDoubleElement(serialDesc, 3, self.yearsDifferenceAnimationScore);
        output.encodeDoubleElement(serialDesc, 4, self.paceOfAgingAnimationScore);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getPaceOfAging() {
        return this.paceOfAging;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getYearsDifference() {
        return this.yearsDifference;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getYearsDifferenceAnimationScore() {
        return this.yearsDifferenceAnimationScore;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getPaceOfAgingAnimationScore() {
        return this.paceOfAgingAnimationScore;
    }

    public final WhoopAgeAmoebaStyleValues copy(double age, double paceOfAging, double yearsDifference, double yearsDifferenceAnimationScore, double paceOfAgingAnimationScore) {
        return new WhoopAgeAmoebaStyleValues(age, paceOfAging, yearsDifference, yearsDifferenceAnimationScore, paceOfAgingAnimationScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopAgeAmoebaStyleValues)) {
            return false;
        }
        WhoopAgeAmoebaStyleValues whoopAgeAmoebaStyleValues = (WhoopAgeAmoebaStyleValues) other;
        return Double.compare(this.age, whoopAgeAmoebaStyleValues.age) == 0 && Double.compare(this.paceOfAging, whoopAgeAmoebaStyleValues.paceOfAging) == 0 && Double.compare(this.yearsDifference, whoopAgeAmoebaStyleValues.yearsDifference) == 0 && Double.compare(this.yearsDifferenceAnimationScore, whoopAgeAmoebaStyleValues.yearsDifferenceAnimationScore) == 0 && Double.compare(this.paceOfAgingAnimationScore, whoopAgeAmoebaStyleValues.paceOfAgingAnimationScore) == 0;
    }

    public final double getAge() {
        return this.age;
    }

    public final double getPaceOfAging() {
        return this.paceOfAging;
    }

    public final double getPaceOfAgingAnimationScore() {
        return this.paceOfAgingAnimationScore;
    }

    public final double getYearsDifference() {
        return this.yearsDifference;
    }

    public final double getYearsDifferenceAnimationScore() {
        return this.yearsDifferenceAnimationScore;
    }

    public int hashCode() {
        return Double.hashCode(this.paceOfAgingAnimationScore) + AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(Double.hashCode(this.age) * 31, 31, this.paceOfAging), 31, this.yearsDifference), 31, this.yearsDifferenceAnimationScore);
    }

    public String toString() {
        double d3 = this.age;
        double d14 = this.paceOfAging;
        double d15 = this.yearsDifference;
        double d16 = this.yearsDifferenceAnimationScore;
        double d17 = this.paceOfAgingAnimationScore;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("WhoopAgeAmoebaStyleValues(age=", d3, ", paceOfAging=");
        sbM8306s.append(d14);
        AbstractC31061c.m95622B(sbM8306s, ", yearsDifference=", d15, ", yearsDifferenceAnimationScore=");
        sbM8306s.append(d16);
        sbM8306s.append(", paceOfAgingAnimationScore=");
        sbM8306s.append(d17);
        sbM8306s.append(")");
        return sbM8306s.toString();
    }

    public /* synthetic */ WhoopAgeAmoebaStyleValues(int i13, double d3, double d14, double d15, double d16, double d17, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, WhoopAgeAmoebaStyleValues$$serializer.INSTANCE.getDescriptor());
        }
        this.age = d3;
        this.paceOfAging = d14;
        this.yearsDifference = d15;
        this.yearsDifferenceAnimationScore = d16;
        this.paceOfAgingAnimationScore = d17;
    }
}
