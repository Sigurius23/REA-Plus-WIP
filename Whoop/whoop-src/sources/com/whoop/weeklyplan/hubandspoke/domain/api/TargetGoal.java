package com.whoop.weeklyplan.hubandspoke.domain.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kt2.C22831a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00060"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/TargetGoal;", "", "", "target", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "type", "", "migrateSmartAlarm", "<init>", "(DLcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDLcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/TargetGoal;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "component3", "()Z", "copy", "(DLcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Z)Lcom/whoop/weeklyplan/hubandspoke/domain/api/TargetGoal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "D", "getTarget", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "getType", "Z", "getMigrateSmartAlarm", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TargetGoal {
    public static final int $stable = 0;
    private final boolean migrateSmartAlarm;
    private final double target;
    private final TargetGoalType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22831a(15)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/TargetGoal$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/TargetGoal;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TargetGoal$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TargetGoal(double d3, TargetGoalType type, boolean z4) {
        AbstractC22676k.m65750j(type, "type");
        this.target = d3;
        this.type = type;
        this.migrateSmartAlarm = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return TargetGoalType.INSTANCE.serializer();
    }

    public static /* synthetic */ TargetGoal copy$default(TargetGoal targetGoal, double d3, TargetGoalType targetGoalType, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = targetGoal.target;
        }
        if ((i13 & 2) != 0) {
            targetGoalType = targetGoal.type;
        }
        if ((i13 & 4) != 0) {
            z4 = targetGoal.migrateSmartAlarm;
        }
        return targetGoal.copy(d3, targetGoalType, z4);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(TargetGoal self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeDoubleElement(serialDesc, 0, self.target);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.type);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.migrateSmartAlarm) {
            output.encodeBooleanElement(serialDesc, 2, self.migrateSmartAlarm);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TargetGoalType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getMigrateSmartAlarm() {
        return this.migrateSmartAlarm;
    }

    public final TargetGoal copy(double target, TargetGoalType type, boolean migrateSmartAlarm) {
        AbstractC22676k.m65750j(type, "type");
        return new TargetGoal(target, type, migrateSmartAlarm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TargetGoal)) {
            return false;
        }
        TargetGoal targetGoal = (TargetGoal) other;
        return Double.compare(this.target, targetGoal.target) == 0 && this.type == targetGoal.type && this.migrateSmartAlarm == targetGoal.migrateSmartAlarm;
    }

    public final boolean getMigrateSmartAlarm() {
        return this.migrateSmartAlarm;
    }

    public final double getTarget() {
        return this.target;
    }

    public final TargetGoalType getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.migrateSmartAlarm) + AbstractC36095b.m114674b(this.type, Double.hashCode(this.target) * 31, 31);
    }

    public String toString() {
        return "TargetGoal(target=" + this.target + ", type=" + this.type + ", migrateSmartAlarm=" + this.migrateSmartAlarm + ")";
    }

    public /* synthetic */ TargetGoal(int i13, double d3, TargetGoalType targetGoalType, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, TargetGoal$$serializer.INSTANCE.getDescriptor());
        }
        this.target = d3;
        this.type = targetGoalType;
        if ((i13 & 4) == 0) {
            this.migrateSmartAlarm = false;
        } else {
            this.migrateSmartAlarm = z4;
        }
    }

    public /* synthetic */ TargetGoal(double d3, TargetGoalType targetGoalType, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(d3, targetGoalType, (i13 & 4) != 0 ? false : z4);
    }
}
