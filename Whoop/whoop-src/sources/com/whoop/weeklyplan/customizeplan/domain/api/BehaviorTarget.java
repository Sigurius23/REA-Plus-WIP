package com.whoop.weeklyplan.customizeplan.domain.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0017J\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006+"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;", "", "", "behaviorTrackerId", "days", "", "avoid", "<init>", "(IIZ)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "component3", "()Z", "copy", "(IIZ)Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getBehaviorTrackerId", "getDays", "Z", "getAvoid", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BehaviorTarget {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean avoid;
    private final int behaviorTrackerId;
    private final int days;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BehaviorTarget$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BehaviorTarget(int i13, int i14, int i15, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, BehaviorTarget$$serializer.INSTANCE.getDescriptor());
        }
        this.behaviorTrackerId = i14;
        this.days = i15;
        this.avoid = z4;
    }

    public static /* synthetic */ BehaviorTarget copy$default(BehaviorTarget behaviorTarget, int i13, int i14, boolean z4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = behaviorTarget.behaviorTrackerId;
        }
        if ((i15 & 2) != 0) {
            i14 = behaviorTarget.days;
        }
        if ((i15 & 4) != 0) {
            z4 = behaviorTarget.avoid;
        }
        return behaviorTarget.copy(i13, i14, z4);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(BehaviorTarget self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.behaviorTrackerId);
        output.encodeIntElement(serialDesc, 1, self.days);
        output.encodeBooleanElement(serialDesc, 2, self.avoid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBehaviorTrackerId() {
        return this.behaviorTrackerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDays() {
        return this.days;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAvoid() {
        return this.avoid;
    }

    public final BehaviorTarget copy(int behaviorTrackerId, int days, boolean avoid) {
        return new BehaviorTarget(behaviorTrackerId, days, avoid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorTarget)) {
            return false;
        }
        BehaviorTarget behaviorTarget = (BehaviorTarget) other;
        return this.behaviorTrackerId == behaviorTarget.behaviorTrackerId && this.days == behaviorTarget.days && this.avoid == behaviorTarget.avoid;
    }

    public final boolean getAvoid() {
        return this.avoid;
    }

    public final int getBehaviorTrackerId() {
        return this.behaviorTrackerId;
    }

    public final int getDays() {
        return this.days;
    }

    public int hashCode() {
        return Boolean.hashCode(this.avoid) + AbstractC11266d.m30448b(this.days, Integer.hashCode(this.behaviorTrackerId) * 31, 31);
    }

    public String toString() {
        int i13 = this.behaviorTrackerId;
        int i14 = this.days;
        return AbstractC18489d0.m53372m(AbstractC11266d.m30465s(i13, i14, "BehaviorTarget(behaviorTrackerId=", ", days=", ", avoid="), this.avoid, ")");
    }

    public BehaviorTarget(int i13, int i14, boolean z4) {
        this.behaviorTrackerId = i13;
        this.days = i14;
        this.avoid = z4;
    }
}
