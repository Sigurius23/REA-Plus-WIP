package com.whoop.sage.onboarding.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import h00.C16497d0;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ<\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006."}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest;", "", "", "", "questionnaireAnswers", "Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;", "manualBloodPressureReadings", "readingDate", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sage_release", "(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getQuestionnaireAnswers", "getManualBloodPressureReadings", "Ljava/lang/String;", "getReadingDate", "Companion", "$serializer", "a", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SageOnboardingRequest {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<ManualBloodPressureReadingInput> manualBloodPressureReadings;
    private final List<String> questionnaireAnswers;
    private final String readingDate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.sage.onboarding.domain.models.SageOnboardingRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest;", "serializer", "()Lwc3/c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SageOnboardingRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C16497d0(23)), AbstractC30060g.m92087G(enumC23463i, new C16497d0(24)), null};
    }

    public /* synthetic */ SageOnboardingRequest(int i13, List list, List list2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, SageOnboardingRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.questionnaireAnswers = list;
        this.manualBloodPressureReadings = list2;
        this.readingDate = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(ManualBloodPressureReadingInput$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SageOnboardingRequest copy$default(SageOnboardingRequest sageOnboardingRequest, List list, List list2, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = sageOnboardingRequest.questionnaireAnswers;
        }
        if ((i13 & 2) != 0) {
            list2 = sageOnboardingRequest.manualBloodPressureReadings;
        }
        if ((i13 & 4) != 0) {
            str = sageOnboardingRequest.readingDate;
        }
        return sageOnboardingRequest.copy(list, list2, str);
    }

    public static final /* synthetic */ void write$Self$sage_release(SageOnboardingRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.questionnaireAnswers);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.manualBloodPressureReadings);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.readingDate);
    }

    public final List<String> component1() {
        return this.questionnaireAnswers;
    }

    public final List<ManualBloodPressureReadingInput> component2() {
        return this.manualBloodPressureReadings;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReadingDate() {
        return this.readingDate;
    }

    public final SageOnboardingRequest copy(List<String> questionnaireAnswers, List<ManualBloodPressureReadingInput> manualBloodPressureReadings, String readingDate) {
        AbstractC22676k.m65750j(questionnaireAnswers, "questionnaireAnswers");
        AbstractC22676k.m65750j(manualBloodPressureReadings, "manualBloodPressureReadings");
        return new SageOnboardingRequest(questionnaireAnswers, manualBloodPressureReadings, readingDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SageOnboardingRequest)) {
            return false;
        }
        SageOnboardingRequest sageOnboardingRequest = (SageOnboardingRequest) other;
        return AbstractC22676k.m65745e(this.questionnaireAnswers, sageOnboardingRequest.questionnaireAnswers) && AbstractC22676k.m65745e(this.manualBloodPressureReadings, sageOnboardingRequest.manualBloodPressureReadings) && AbstractC22676k.m65745e(this.readingDate, sageOnboardingRequest.readingDate);
    }

    public final List<ManualBloodPressureReadingInput> getManualBloodPressureReadings() {
        return this.manualBloodPressureReadings;
    }

    public final List<String> getQuestionnaireAnswers() {
        return this.questionnaireAnswers;
    }

    public final String getReadingDate() {
        return this.readingDate;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.questionnaireAnswers.hashCode() * 31, 31, this.manualBloodPressureReadings);
        String str = this.readingDate;
        return iM31983b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.readingDate, ")", AbstractC38963t7.m124380j("SageOnboardingRequest(questionnaireAnswers=", ", manualBloodPressureReadings=", this.questionnaireAnswers, ", readingDate=", this.manualBloodPressureReadings));
    }

    public SageOnboardingRequest(List<String> questionnaireAnswers, List<ManualBloodPressureReadingInput> manualBloodPressureReadings, String str) {
        AbstractC22676k.m65750j(questionnaireAnswers, "questionnaireAnswers");
        AbstractC22676k.m65750j(manualBloodPressureReadings, "manualBloodPressureReadings");
        this.questionnaireAnswers = questionnaireAnswers;
        this.manualBloodPressureReadings = manualBloodPressureReadings;
        this.readingDate = str;
    }
}
