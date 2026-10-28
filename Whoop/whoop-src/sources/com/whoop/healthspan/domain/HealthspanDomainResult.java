package com.whoop.healthspan.domain;

import com.whoop.healthspan.domain.models.HealthspanResponse;
import com.whoop.healthspan.domain.models.HealthspanResponse$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import java.util.Map;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25272z;
import p031b9.AbstractC2875y;
import p133f1.C13998z1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import y82.EnumC39339b;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/healthspan/domain/HealthspanDomainResult;", "", "<init>", "()V", "c", "a", "OnboardingStepCompleted", "b", EnumC39339b.RESULT_SUCCESS, "Lcom/whoop/healthspan/domain/HealthspanDomainResult$a;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult$b;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult$c;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class HealthspanDomainResult {
    public static final int $stable = 0;

    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0017J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0019¨\u0006-"}, m65681d2 = {"Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult;", "", "step", "", "hasClosedCalibration", "hasClosedInfoCallout", "<init>", "(IZZ)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$healthspan_release", "(Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Z", "component3", "copy", "(IZZ)Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getStep", "Z", "getHasClosedCalibration", "getHasClosedInfoCallout", "Companion", "$serializer", "a", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class OnboardingStepCompleted extends HealthspanDomainResult {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean hasClosedCalibration;
        private final boolean hasClosedInfoCallout;
        private final int step;

        /* JADX INFO: renamed from: com.whoop.healthspan.domain.HealthspanDomainResult$OnboardingStepCompleted$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;", "serializer", "()Lwc3/c;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return HealthspanDomainResult$OnboardingStepCompleted$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OnboardingStepCompleted(int i13, int i14, boolean z4, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (1 != (i13 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 1, HealthspanDomainResult$OnboardingStepCompleted$$serializer.INSTANCE.getDescriptor());
            }
            this.step = i14;
            if ((i13 & 2) == 0) {
                this.hasClosedCalibration = false;
            } else {
                this.hasClosedCalibration = z4;
            }
            if ((i13 & 4) == 0) {
                this.hasClosedInfoCallout = false;
            } else {
                this.hasClosedInfoCallout = z13;
            }
        }

        public static /* synthetic */ OnboardingStepCompleted copy$default(OnboardingStepCompleted onboardingStepCompleted, int i13, boolean z4, boolean z13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = onboardingStepCompleted.step;
            }
            if ((i14 & 2) != 0) {
                z4 = onboardingStepCompleted.hasClosedCalibration;
            }
            if ((i14 & 4) != 0) {
                z13 = onboardingStepCompleted.hasClosedInfoCallout;
            }
            return onboardingStepCompleted.copy(i13, z4, z13);
        }

        public static final /* synthetic */ void write$Self$healthspan_release(OnboardingStepCompleted self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            output.encodeIntElement(serialDesc, 0, self.step);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.hasClosedCalibration) {
                output.encodeBooleanElement(serialDesc, 1, self.hasClosedCalibration);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.hasClosedInfoCallout) {
                output.encodeBooleanElement(serialDesc, 2, self.hasClosedInfoCallout);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getStep() {
            return this.step;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getHasClosedCalibration() {
            return this.hasClosedCalibration;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getHasClosedInfoCallout() {
            return this.hasClosedInfoCallout;
        }

        public final OnboardingStepCompleted copy(int step, boolean hasClosedCalibration, boolean hasClosedInfoCallout) {
            return new OnboardingStepCompleted(step, hasClosedCalibration, hasClosedInfoCallout);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnboardingStepCompleted)) {
                return false;
            }
            OnboardingStepCompleted onboardingStepCompleted = (OnboardingStepCompleted) other;
            return this.step == onboardingStepCompleted.step && this.hasClosedCalibration == onboardingStepCompleted.hasClosedCalibration && this.hasClosedInfoCallout == onboardingStepCompleted.hasClosedInfoCallout;
        }

        public final boolean getHasClosedCalibration() {
            return this.hasClosedCalibration;
        }

        public final boolean getHasClosedInfoCallout() {
            return this.hasClosedInfoCallout;
        }

        public final int getStep() {
            return this.step;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasClosedInfoCallout) + AbstractC2875y.m8289b(Integer.hashCode(this.step) * 31, 31, this.hasClosedCalibration);
        }

        public String toString() {
            int i13 = this.step;
            boolean z4 = this.hasClosedCalibration;
            boolean z13 = this.hasClosedInfoCallout;
            StringBuilder sb4 = new StringBuilder("OnboardingStepCompleted(step=");
            sb4.append(i13);
            sb4.append(", hasClosedCalibration=");
            sb4.append(z4);
            sb4.append(", hasClosedInfoCallout=");
            return AbstractC18489d0.m53372m(sb4, z13, ")");
        }

        public OnboardingStepCompleted(int i13, boolean z4, boolean z13) {
            super(null);
            this.step = i13;
            this.hasClosedCalibration = z4;
            this.hasClosedInfoCallout = z13;
        }

        public /* synthetic */ OnboardingStepCompleted(int i13, boolean z4, boolean z13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, (i14 & 2) != 0 ? false : z4, (i14 & 4) != 0 ? false : z13);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.HealthspanDomainResult$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/healthspan/domain/HealthspanDomainResult$a;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult;", "<init>", "()V", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8799a extends HealthspanDomainResult {

        /* JADX INFO: renamed from: a */
        public static final C8799a f26238a = new C8799a();

        private C8799a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.HealthspanDomainResult$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/healthspan/domain/HealthspanDomainResult$b;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult;", "<init>", "()V", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8800b extends HealthspanDomainResult {

        /* JADX INFO: renamed from: a */
        public static final C8800b f26239a = new C8800b();

        private C8800b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.HealthspanDomainResult$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/healthspan/domain/HealthspanDomainResult$c;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult;", "<init>", "()V", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8801c extends HealthspanDomainResult {

        /* JADX INFO: renamed from: a */
        public static final C8801c f26240a = new C8801c();

        private C8801c() {
            super(null);
        }
    }

    public /* synthetic */ HealthspanDomainResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HealthspanDomainResult() {
    }

    @Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0003¢\u0006\u0004\b$\u0010%JZ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b\u0007\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010%¨\u0006<"}, m65681d2 = {"Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult;", "Lcom/whoop/healthspan/domain/models/HealthspanResponse;", "response", "", "hasClosedCalibration", "hasClosedInfoCallout", "isFromDateChange", "", "previousPaceOfAgingValueIndex", "", "", "drawerExpandedStates", "<init>", "(Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$healthspan_release", "(Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/healthspan/domain/models/HealthspanResponse;", "component2", "()Z", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "()Ljava/util/Map;", "copy", "(Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZZZLjava/lang/Integer;Ljava/util/Map;)Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/healthspan/domain/models/HealthspanResponse;", "getResponse", "Z", "getHasClosedCalibration", "getHasClosedInfoCallout", "Ljava/lang/Integer;", "getPreviousPaceOfAgingValueIndex", "Ljava/util/Map;", "getDrawerExpandedStates", "Companion", "$serializer", "a", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Success extends HealthspanDomainResult {
        private final Map<String, Boolean> drawerExpandedStates;
        private final boolean hasClosedCalibration;
        private final boolean hasClosedInfoCallout;
        private final boolean isFromDateChange;
        private final Integer previousPaceOfAgingValueIndex;
        private final HealthspanResponse response;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C13998z1(22))};

        /* JADX INFO: renamed from: com.whoop.healthspan.domain.HealthspanDomainResult$Success$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;", "serializer", "()Lwc3/c;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return HealthspanDomainResult$Success$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Success(int i13, HealthspanResponse healthspanResponse, boolean z4, boolean z13, boolean z14, Integer num, Map map, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (3 != (i13 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 3, HealthspanDomainResult$Success$$serializer.INSTANCE.getDescriptor());
            }
            this.response = healthspanResponse;
            this.hasClosedCalibration = z4;
            if ((i13 & 4) == 0) {
                this.hasClosedInfoCallout = false;
            } else {
                this.hasClosedInfoCallout = z13;
            }
            if ((i13 & 8) == 0) {
                this.isFromDateChange = false;
            } else {
                this.isFromDateChange = z14;
            }
            if ((i13 & 16) == 0) {
                this.previousPaceOfAgingValueIndex = null;
            } else {
                this.previousPaceOfAgingValueIndex = num;
            }
            if ((i13 & 32) == 0) {
                this.drawerExpandedStates = C25272z.f99163w;
            } else {
                this.drawerExpandedStates = map;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BooleanSerializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, HealthspanResponse healthspanResponse, boolean z4, boolean z13, boolean z14, Integer num, Map map, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                healthspanResponse = success.response;
            }
            if ((i13 & 2) != 0) {
                z4 = success.hasClosedCalibration;
            }
            if ((i13 & 4) != 0) {
                z13 = success.hasClosedInfoCallout;
            }
            if ((i13 & 8) != 0) {
                z14 = success.isFromDateChange;
            }
            if ((i13 & 16) != 0) {
                num = success.previousPaceOfAgingValueIndex;
            }
            if ((i13 & 32) != 0) {
                map = success.drawerExpandedStates;
            }
            Integer num2 = num;
            Map map2 = map;
            return success.copy(healthspanResponse, z4, z13, z14, num2, map2);
        }

        public static final /* synthetic */ void write$Self$healthspan_release(Success self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, HealthspanResponse$$serializer.INSTANCE, self.response);
            output.encodeBooleanElement(serialDesc, 1, self.hasClosedCalibration);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.hasClosedInfoCallout) {
                output.encodeBooleanElement(serialDesc, 2, self.hasClosedInfoCallout);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.isFromDateChange) {
                output.encodeBooleanElement(serialDesc, 3, self.isFromDateChange);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.previousPaceOfAgingValueIndex != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.previousPaceOfAgingValueIndex);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 5) && AbstractC22676k.m65745e(self.drawerExpandedStates, C25272z.f99163w)) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.drawerExpandedStates);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HealthspanResponse getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getHasClosedCalibration() {
            return this.hasClosedCalibration;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getHasClosedInfoCallout() {
            return this.hasClosedInfoCallout;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsFromDateChange() {
            return this.isFromDateChange;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Integer getPreviousPaceOfAgingValueIndex() {
            return this.previousPaceOfAgingValueIndex;
        }

        public final Map<String, Boolean> component6() {
            return this.drawerExpandedStates;
        }

        public final Success copy(HealthspanResponse response, boolean hasClosedCalibration, boolean hasClosedInfoCallout, boolean isFromDateChange, Integer previousPaceOfAgingValueIndex, Map<String, Boolean> drawerExpandedStates) {
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(drawerExpandedStates, "drawerExpandedStates");
            return new Success(response, hasClosedCalibration, hasClosedInfoCallout, isFromDateChange, previousPaceOfAgingValueIndex, drawerExpandedStates);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return AbstractC22676k.m65745e(this.response, success.response) && this.hasClosedCalibration == success.hasClosedCalibration && this.hasClosedInfoCallout == success.hasClosedInfoCallout && this.isFromDateChange == success.isFromDateChange && AbstractC22676k.m65745e(this.previousPaceOfAgingValueIndex, success.previousPaceOfAgingValueIndex) && AbstractC22676k.m65745e(this.drawerExpandedStates, success.drawerExpandedStates);
        }

        public final Map<String, Boolean> getDrawerExpandedStates() {
            return this.drawerExpandedStates;
        }

        public final boolean getHasClosedCalibration() {
            return this.hasClosedCalibration;
        }

        public final boolean getHasClosedInfoCallout() {
            return this.hasClosedInfoCallout;
        }

        public final Integer getPreviousPaceOfAgingValueIndex() {
            return this.previousPaceOfAgingValueIndex;
        }

        public final HealthspanResponse getResponse() {
            return this.response;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.response.hashCode() * 31, 31, this.hasClosedCalibration), 31, this.hasClosedInfoCallout), 31, this.isFromDateChange);
            Integer num = this.previousPaceOfAgingValueIndex;
            return this.drawerExpandedStates.hashCode() + ((iM8289b + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final boolean isFromDateChange() {
            return this.isFromDateChange;
        }

        public String toString() {
            HealthspanResponse healthspanResponse = this.response;
            boolean z4 = this.hasClosedCalibration;
            boolean z13 = this.hasClosedInfoCallout;
            boolean z14 = this.isFromDateChange;
            Integer num = this.previousPaceOfAgingValueIndex;
            Map<String, Boolean> map = this.drawerExpandedStates;
            StringBuilder sb4 = new StringBuilder("Success(response=");
            sb4.append(healthspanResponse);
            sb4.append(", hasClosedCalibration=");
            sb4.append(z4);
            sb4.append(", hasClosedInfoCallout=");
            AbstractC38963t7.m124392v(sb4, z13, ", isFromDateChange=", z14, ", previousPaceOfAgingValueIndex=");
            sb4.append(num);
            sb4.append(", drawerExpandedStates=");
            sb4.append(map);
            sb4.append(")");
            return sb4.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(HealthspanResponse response, boolean z4, boolean z13, boolean z14, Integer num, Map<String, Boolean> drawerExpandedStates) {
            super(null);
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(drawerExpandedStates, "drawerExpandedStates");
            this.response = response;
            this.hasClosedCalibration = z4;
            this.hasClosedInfoCallout = z13;
            this.isFromDateChange = z14;
            this.previousPaceOfAgingValueIndex = num;
            this.drawerExpandedStates = drawerExpandedStates;
        }

        public /* synthetic */ Success(HealthspanResponse healthspanResponse, boolean z4, boolean z13, boolean z14, Integer num, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(healthspanResponse, z4, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? C25272z.f99163w : map);
        }
    }
}
