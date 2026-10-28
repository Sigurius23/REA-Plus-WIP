package com.whoop.weeklyplan.customizeplan.domain.api;

import com.whoop.design.models.modal.C8527a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import wc3.C37142g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0004\u0012\u0013\u0014\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;Lzc3/c;Lyc3/g;)V", "Companion", "ConfirmMetricTarget", "ConfirmBehaviorTarget", "ConfirmActivityTarget", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public abstract class ConfirmTarget {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C8527a(20));

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
            return (InterfaceC37138c) ConfirmTarget.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC37138c serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006'"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;", "", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ActivityTarget;", "activityGoals", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getActivityGoals", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class ConfirmActivityTarget extends ConfirmTarget {
        private final List<ActivityTarget> activityGoals;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C8527a(21))};

        /* JADX INFO: loaded from: classes11.dex */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return ConfirmTarget$ConfirmActivityTarget$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ConfirmActivityTarget(int i13, List list, SerializationConstructorMarker serializationConstructorMarker) {
            super(i13, serializationConstructorMarker);
            if (1 != (i13 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 1, ConfirmTarget$ConfirmActivityTarget$$serializer.INSTANCE.getDescriptor());
            }
            this.activityGoals = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ActivityTarget$$serializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ConfirmActivityTarget copy$default(ConfirmActivityTarget confirmActivityTarget, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = confirmActivityTarget.activityGoals;
            }
            return confirmActivityTarget.copy(list);
        }

        public static final /* synthetic */ void write$Self$weekly_plan_release(ConfirmActivityTarget self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            ConfirmTarget.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.activityGoals);
        }

        public final List<ActivityTarget> component1() {
            return this.activityGoals;
        }

        public final ConfirmActivityTarget copy(List<ActivityTarget> activityGoals) {
            AbstractC22676k.m65750j(activityGoals, "activityGoals");
            return new ConfirmActivityTarget(activityGoals);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfirmActivityTarget) && AbstractC22676k.m65745e(this.activityGoals, ((ConfirmActivityTarget) other).activityGoals);
        }

        public final List<ActivityTarget> getActivityGoals() {
            return this.activityGoals;
        }

        public int hashCode() {
            return this.activityGoals.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("ConfirmActivityTarget(activityGoals=", ")", this.activityGoals);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmActivityTarget(List<ActivityTarget> activityGoals) {
            super(null);
            AbstractC22676k.m65750j(activityGoals, "activityGoals");
            this.activityGoals = activityGoals;
        }
    }

    @Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006'"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;", "", "Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;", "behaviorGoals", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBehaviorGoals", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class ConfirmBehaviorTarget extends ConfirmTarget {
        private final List<BehaviorTarget> behaviorGoals;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C8527a(22))};

        /* JADX INFO: loaded from: classes11.dex */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return ConfirmTarget$ConfirmBehaviorTarget$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ConfirmBehaviorTarget(int i13, List list, SerializationConstructorMarker serializationConstructorMarker) {
            super(i13, serializationConstructorMarker);
            if (1 != (i13 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 1, ConfirmTarget$ConfirmBehaviorTarget$$serializer.INSTANCE.getDescriptor());
            }
            this.behaviorGoals = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
            return new ArrayListSerializer(BehaviorTarget$$serializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ConfirmBehaviorTarget copy$default(ConfirmBehaviorTarget confirmBehaviorTarget, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = confirmBehaviorTarget.behaviorGoals;
            }
            return confirmBehaviorTarget.copy(list);
        }

        public static final /* synthetic */ void write$Self$weekly_plan_release(ConfirmBehaviorTarget self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            ConfirmTarget.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.behaviorGoals);
        }

        public final List<BehaviorTarget> component1() {
            return this.behaviorGoals;
        }

        public final ConfirmBehaviorTarget copy(List<BehaviorTarget> behaviorGoals) {
            AbstractC22676k.m65750j(behaviorGoals, "behaviorGoals");
            return new ConfirmBehaviorTarget(behaviorGoals);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfirmBehaviorTarget) && AbstractC22676k.m65745e(this.behaviorGoals, ((ConfirmBehaviorTarget) other).behaviorGoals);
        }

        public final List<BehaviorTarget> getBehaviorGoals() {
            return this.behaviorGoals;
        }

        public int hashCode() {
            return this.behaviorGoals.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("ConfirmBehaviorTarget(behaviorGoals=", ")", this.behaviorGoals);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmBehaviorTarget(List<BehaviorTarget> behaviorGoals) {
            super(null);
            AbstractC22676k.m65750j(behaviorGoals, "behaviorGoals");
            this.behaviorGoals = behaviorGoals;
        }
    }

    public /* synthetic */ ConfirmTarget(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _init_$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37142g("com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget", c22673i0.getOrCreateKotlinClass(ConfirmTarget.class), new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(ConfirmActivityTarget.class), c22673i0.getOrCreateKotlinClass(ConfirmBehaviorTarget.class), c22673i0.getOrCreateKotlinClass(ConfirmMetricTarget.class)}, new InterfaceC37138c[]{ConfirmTarget$ConfirmActivityTarget$$serializer.INSTANCE, ConfirmTarget$ConfirmBehaviorTarget$$serializer.INSTANCE, ConfirmTarget$ConfirmMetricTarget$$serializer.INSTANCE}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(ConfirmTarget self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
    }

    private ConfirmTarget() {
    }

    public /* synthetic */ ConfirmTarget(int i13, SerializationConstructorMarker serializationConstructorMarker) {
    }

    @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;", "", "target", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "type", "", "migrateSmartAlarm", "<init>", "(DLcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDLcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "component3", "()Z", "copy", "(DLcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Z)Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "D", "getTarget", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "getType", "Z", "getMigrateSmartAlarm", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class ConfirmMetricTarget extends ConfirmTarget {
        public static final int $stable = 0;
        private final boolean migrateSmartAlarm;
        private final double target;
        private final TargetGoalType type;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C8527a(23)), null};

        /* JADX INFO: loaded from: classes11.dex */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return ConfirmTarget$ConfirmMetricTarget$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmMetricTarget(double d3, TargetGoalType type, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(type, "type");
            this.target = d3;
            this.type = type;
            this.migrateSmartAlarm = z4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
            return TargetGoalType.INSTANCE.serializer();
        }

        public static /* synthetic */ ConfirmMetricTarget copy$default(ConfirmMetricTarget confirmMetricTarget, double d3, TargetGoalType targetGoalType, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                d3 = confirmMetricTarget.target;
            }
            if ((i13 & 2) != 0) {
                targetGoalType = confirmMetricTarget.type;
            }
            if ((i13 & 4) != 0) {
                z4 = confirmMetricTarget.migrateSmartAlarm;
            }
            return confirmMetricTarget.copy(d3, targetGoalType, z4);
        }

        public static final /* synthetic */ void write$Self$weekly_plan_release(ConfirmMetricTarget self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            ConfirmTarget.write$Self(self, output, serialDesc);
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

        public final ConfirmMetricTarget copy(double target, TargetGoalType type, boolean migrateSmartAlarm) {
            AbstractC22676k.m65750j(type, "type");
            return new ConfirmMetricTarget(target, type, migrateSmartAlarm);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfirmMetricTarget)) {
                return false;
            }
            ConfirmMetricTarget confirmMetricTarget = (ConfirmMetricTarget) other;
            return Double.compare(this.target, confirmMetricTarget.target) == 0 && this.type == confirmMetricTarget.type && this.migrateSmartAlarm == confirmMetricTarget.migrateSmartAlarm;
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
            return "ConfirmMetricTarget(target=" + this.target + ", type=" + this.type + ", migrateSmartAlarm=" + this.migrateSmartAlarm + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ConfirmMetricTarget(int i13, double d3, TargetGoalType targetGoalType, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
            super(i13, serializationConstructorMarker);
            if (3 != (i13 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 3, ConfirmTarget$ConfirmMetricTarget$$serializer.INSTANCE.getDescriptor());
            }
            this.target = d3;
            this.type = targetGoalType;
            if ((i13 & 4) == 0) {
                this.migrateSmartAlarm = false;
            } else {
                this.migrateSmartAlarm = z4;
            }
        }

        public /* synthetic */ ConfirmMetricTarget(double d3, TargetGoalType targetGoalType, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(d3, targetGoalType, (i13 & 4) != 0 ? false : z4);
        }
    }
}
