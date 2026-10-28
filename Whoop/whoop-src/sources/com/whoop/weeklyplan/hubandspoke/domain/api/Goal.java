package com.whoop.weeklyplan.hubandspoke.domain.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006-"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;", "", "", "goalTypeId", "", "target", "", "type", "<init>", "(IDLjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIDLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()D", "component3", "()Ljava/lang/String;", "copy", "(IDLjava/lang/String;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getGoalTypeId", "D", "getTarget", "Ljava/lang/String;", "getType", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Goal {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int goalTypeId;
    private final double target;
    private final String type;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return Goal$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Goal(int i13, double d3, String type) {
        AbstractC22676k.m65750j(type, "type");
        this.goalTypeId = i13;
        this.target = d3;
        this.type = type;
    }

    public static /* synthetic */ Goal copy$default(Goal goal, int i13, double d3, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = goal.goalTypeId;
        }
        if ((i14 & 2) != 0) {
            d3 = goal.target;
        }
        if ((i14 & 4) != 0) {
            str = goal.type;
        }
        return goal.copy(i13, d3, str);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(Goal self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.goalTypeId);
        output.encodeDoubleElement(serialDesc, 1, self.target);
        output.encodeStringElement(serialDesc, 2, self.type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getGoalTypeId() {
        return this.goalTypeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final Goal copy(int goalTypeId, double target, String type) {
        AbstractC22676k.m65750j(type, "type");
        return new Goal(goalTypeId, target, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Goal)) {
            return false;
        }
        Goal goal = (Goal) other;
        return this.goalTypeId == goal.goalTypeId && Double.compare(this.target, goal.target) == 0 && AbstractC22676k.m65745e(this.type, goal.type);
    }

    public final int getGoalTypeId() {
        return this.goalTypeId;
    }

    public final double getTarget() {
        return this.target;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + AbstractC17176i.m48499a(Integer.hashCode(this.goalTypeId) * 31, 31, this.target);
    }

    public String toString() {
        int i13 = this.goalTypeId;
        double d3 = this.target;
        String str = this.type;
        StringBuilder sb4 = new StringBuilder("Goal(goalTypeId=");
        sb4.append(i13);
        sb4.append(", target=");
        sb4.append(d3);
        return AbstractC2875y.m8304q(sb4, ", type=", str, ")");
    }

    public /* synthetic */ Goal(int i13, int i14, double d3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, Goal$$serializer.INSTANCE.getDescriptor());
        }
        this.goalTypeId = i14;
        this.target = d3;
        this.type = str;
    }
}
