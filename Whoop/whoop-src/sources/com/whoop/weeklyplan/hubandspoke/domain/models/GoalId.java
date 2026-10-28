package com.whoop.weeklyplan.hubandspoke.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001d¨\u0006."}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/models/GoalId;", "", "", "target", "", "type", "", "migrateSmartAlarm", "<init>", "(DLjava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDLjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hubandspoke/domain/models/GoalId;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(DLjava/lang/String;Z)Lcom/whoop/weeklyplan/hubandspoke/domain/models/GoalId;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "D", "getTarget", "Ljava/lang/String;", "getType", "Z", "getMigrateSmartAlarm", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GoalId {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean migrateSmartAlarm;
    private final double target;
    private final String type;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/models/GoalId$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hubandspoke/domain/models/GoalId;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GoalId$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public GoalId(double d3, String type, boolean z4) {
        AbstractC22676k.m65750j(type, "type");
        this.target = d3;
        this.type = type;
        this.migrateSmartAlarm = z4;
    }

    public static /* synthetic */ GoalId copy$default(GoalId goalId, double d3, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = goalId.target;
        }
        if ((i13 & 2) != 0) {
            str = goalId.type;
        }
        if ((i13 & 4) != 0) {
            z4 = goalId.migrateSmartAlarm;
        }
        return goalId.copy(d3, str, z4);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(GoalId self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.target);
        output.encodeStringElement(serialDesc, 1, self.type);
        output.encodeBooleanElement(serialDesc, 2, self.migrateSmartAlarm);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getMigrateSmartAlarm() {
        return this.migrateSmartAlarm;
    }

    public final GoalId copy(double target, String type, boolean migrateSmartAlarm) {
        AbstractC22676k.m65750j(type, "type");
        return new GoalId(target, type, migrateSmartAlarm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoalId)) {
            return false;
        }
        GoalId goalId = (GoalId) other;
        return Double.compare(this.target, goalId.target) == 0 && AbstractC22676k.m65745e(this.type, goalId.type) && this.migrateSmartAlarm == goalId.migrateSmartAlarm;
    }

    public final boolean getMigrateSmartAlarm() {
        return this.migrateSmartAlarm;
    }

    public final double getTarget() {
        return this.target;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.migrateSmartAlarm) + AbstractC11266d.m30450d(Double.hashCode(this.target) * 31, 31, this.type);
    }

    public String toString() {
        return "GoalId(target=" + this.target + ", type=" + this.type + ", migrateSmartAlarm=" + this.migrateSmartAlarm + ")";
    }

    public /* synthetic */ GoalId(int i13, double d3, String str, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, GoalId$$serializer.INSTANCE.getDescriptor());
        }
        this.target = d3;
        this.type = str;
        this.migrateSmartAlarm = z4;
    }
}
