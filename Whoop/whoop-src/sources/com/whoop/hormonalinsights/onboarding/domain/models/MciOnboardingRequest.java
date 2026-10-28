package com.whoop.hormonalinsights.onboarding.domain.models;

import al0.C0974i;
import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=B]\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000fBy\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b&\u0010$J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b'\u0010$Jt\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b:\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b;\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b<\u0010$¨\u0006?"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;", "", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;", "interest", "Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;", "contraceptionType", "", "typicalCycleLength", "", "", "lastPeriodDateRange", "removedPeriodDays", "symptoms", "goals", "<init>", "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;", "component2", "()Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "copy", "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;", "getInterest", "Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;", "getContraceptionType", "Ljava/lang/Integer;", "getTypicalCycleLength", "Ljava/util/List;", "getLastPeriodDateRange", "getRemovedPeriodDays", "getSymptoms", "getGoals", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MciOnboardingRequest {
    private static final InterfaceC23462h[] $childSerializers;
    private final ContraceptionType contraceptionType;
    private final List<String> goals;
    private final MciInterest interest;
    private final List<String> lastPeriodDateRange;
    private final List<String> removedPeriodDays;
    private final List<String> symptoms;
    private final Integer typicalCycleLength;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MciOnboardingRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C0974i(13)), AbstractC30060g.m92087G(enumC23463i, new C0974i(14)), null, AbstractC30060g.m92087G(enumC23463i, new C0974i(15)), AbstractC30060g.m92087G(enumC23463i, new C0974i(16)), AbstractC30060g.m92087G(enumC23463i, new C0974i(17)), AbstractC30060g.m92087G(enumC23463i, new C0974i(18))};
    }

    public /* synthetic */ MciOnboardingRequest(int i13, MciInterest mciInterest, ContraceptionType contraceptionType, Integer num, List list, List list2, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, MciOnboardingRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.interest = mciInterest;
        this.contraceptionType = contraceptionType;
        this.typicalCycleLength = num;
        this.lastPeriodDateRange = list;
        this.removedPeriodDays = list2;
        this.symptoms = list3;
        this.goals = list4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.onboarding.domain.models.MciInterest", MciInterest.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.onboarding.domain.models.ContraceptionType", ContraceptionType.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$4() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MciOnboardingRequest copy$default(MciOnboardingRequest mciOnboardingRequest, MciInterest mciInterest, ContraceptionType contraceptionType, Integer num, List list, List list2, List list3, List list4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            mciInterest = mciOnboardingRequest.interest;
        }
        if ((i13 & 2) != 0) {
            contraceptionType = mciOnboardingRequest.contraceptionType;
        }
        if ((i13 & 4) != 0) {
            num = mciOnboardingRequest.typicalCycleLength;
        }
        if ((i13 & 8) != 0) {
            list = mciOnboardingRequest.lastPeriodDateRange;
        }
        if ((i13 & 16) != 0) {
            list2 = mciOnboardingRequest.removedPeriodDays;
        }
        if ((i13 & 32) != 0) {
            list3 = mciOnboardingRequest.symptoms;
        }
        if ((i13 & 64) != 0) {
            list4 = mciOnboardingRequest.goals;
        }
        List list5 = list3;
        List list6 = list4;
        List list7 = list2;
        Integer num2 = num;
        return mciOnboardingRequest.copy(mciInterest, contraceptionType, num2, list, list7, list5, list6);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(MciOnboardingRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.interest);
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.contraceptionType);
        output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.typicalCycleLength);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.lastPeriodDateRange);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.removedPeriodDays);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.symptoms);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.goals);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MciInterest getInterest() {
        return this.interest;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ContraceptionType getContraceptionType() {
        return this.contraceptionType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTypicalCycleLength() {
        return this.typicalCycleLength;
    }

    public final List<String> component4() {
        return this.lastPeriodDateRange;
    }

    public final List<String> component5() {
        return this.removedPeriodDays;
    }

    public final List<String> component6() {
        return this.symptoms;
    }

    public final List<String> component7() {
        return this.goals;
    }

    public final MciOnboardingRequest copy(MciInterest interest, ContraceptionType contraceptionType, Integer typicalCycleLength, List<String> lastPeriodDateRange, List<String> removedPeriodDays, List<String> symptoms, List<String> goals) {
        AbstractC22676k.m65750j(lastPeriodDateRange, "lastPeriodDateRange");
        AbstractC22676k.m65750j(removedPeriodDays, "removedPeriodDays");
        AbstractC22676k.m65750j(symptoms, "symptoms");
        AbstractC22676k.m65750j(goals, "goals");
        return new MciOnboardingRequest(interest, contraceptionType, typicalCycleLength, lastPeriodDateRange, removedPeriodDays, symptoms, goals);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MciOnboardingRequest)) {
            return false;
        }
        MciOnboardingRequest mciOnboardingRequest = (MciOnboardingRequest) other;
        return this.interest == mciOnboardingRequest.interest && this.contraceptionType == mciOnboardingRequest.contraceptionType && AbstractC22676k.m65745e(this.typicalCycleLength, mciOnboardingRequest.typicalCycleLength) && AbstractC22676k.m65745e(this.lastPeriodDateRange, mciOnboardingRequest.lastPeriodDateRange) && AbstractC22676k.m65745e(this.removedPeriodDays, mciOnboardingRequest.removedPeriodDays) && AbstractC22676k.m65745e(this.symptoms, mciOnboardingRequest.symptoms) && AbstractC22676k.m65745e(this.goals, mciOnboardingRequest.goals);
    }

    public final ContraceptionType getContraceptionType() {
        return this.contraceptionType;
    }

    public final List<String> getGoals() {
        return this.goals;
    }

    public final MciInterest getInterest() {
        return this.interest;
    }

    public final List<String> getLastPeriodDateRange() {
        return this.lastPeriodDateRange;
    }

    public final List<String> getRemovedPeriodDays() {
        return this.removedPeriodDays;
    }

    public final List<String> getSymptoms() {
        return this.symptoms;
    }

    public final Integer getTypicalCycleLength() {
        return this.typicalCycleLength;
    }

    public int hashCode() {
        MciInterest mciInterest = this.interest;
        int iHashCode = (mciInterest == null ? 0 : mciInterest.hashCode()) * 31;
        ContraceptionType contraceptionType = this.contraceptionType;
        int iHashCode2 = (iHashCode + (contraceptionType == null ? 0 : contraceptionType.hashCode())) * 31;
        Integer num = this.typicalCycleLength;
        return this.goals.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.lastPeriodDateRange), 31, this.removedPeriodDays), 31, this.symptoms);
    }

    public String toString() {
        MciInterest mciInterest = this.interest;
        ContraceptionType contraceptionType = this.contraceptionType;
        Integer num = this.typicalCycleLength;
        List<String> list = this.lastPeriodDateRange;
        List<String> list2 = this.removedPeriodDays;
        List<String> list3 = this.symptoms;
        List<String> list4 = this.goals;
        StringBuilder sb4 = new StringBuilder("MciOnboardingRequest(interest=");
        sb4.append(mciInterest);
        sb4.append(", contraceptionType=");
        sb4.append(contraceptionType);
        sb4.append(", typicalCycleLength=");
        sb4.append(num);
        sb4.append(", lastPeriodDateRange=");
        sb4.append(list);
        sb4.append(", removedPeriodDays=");
        AbstractC21702c.m61148s(sb4, list2, ", symptoms=", list3, ", goals=");
        return AbstractC3855a.m11829m(sb4, list4, ")");
    }

    public MciOnboardingRequest(MciInterest mciInterest, ContraceptionType contraceptionType, Integer num, List<String> lastPeriodDateRange, List<String> removedPeriodDays, List<String> symptoms, List<String> goals) {
        AbstractC22676k.m65750j(lastPeriodDateRange, "lastPeriodDateRange");
        AbstractC22676k.m65750j(removedPeriodDays, "removedPeriodDays");
        AbstractC22676k.m65750j(symptoms, "symptoms");
        AbstractC22676k.m65750j(goals, "goals");
        this.interest = mciInterest;
        this.contraceptionType = contraceptionType;
        this.typicalCycleLength = num;
        this.lastPeriodDateRange = lastPeriodDateRange;
        this.removedPeriodDays = removedPeriodDays;
        this.symptoms = symptoms;
        this.goals = goals;
    }
}
