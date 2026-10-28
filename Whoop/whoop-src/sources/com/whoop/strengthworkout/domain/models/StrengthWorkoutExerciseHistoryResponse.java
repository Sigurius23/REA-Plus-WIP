package com.whoop.strengthworkout.domain.models;

import bf2.C3201a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006*"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseHistoryResponse;", "", "", "exerciseId", "", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutHistorySet;", "recentSets", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$strength_workout_release", "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseHistoryResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseHistoryResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExerciseId", "Ljava/util/List;", "getRecentSets", "Companion", "$serializer", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StrengthWorkoutExerciseHistoryResponse {
    private final String exerciseId;
    private final List<StrengthWorkoutHistorySet> recentSets;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C3201a(9))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseHistoryResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseHistoryResponse;", "serializer", "()Lwc3/c;", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StrengthWorkoutExerciseHistoryResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StrengthWorkoutExerciseHistoryResponse(int i13, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, StrengthWorkoutExerciseHistoryResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.exerciseId = str;
        if ((i13 & 2) == 0) {
            this.recentSets = C25271y.f99162w;
        } else {
            this.recentSets = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StrengthWorkoutHistorySet$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrengthWorkoutExerciseHistoryResponse copy$default(StrengthWorkoutExerciseHistoryResponse strengthWorkoutExerciseHistoryResponse, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = strengthWorkoutExerciseHistoryResponse.exerciseId;
        }
        if ((i13 & 2) != 0) {
            list = strengthWorkoutExerciseHistoryResponse.recentSets;
        }
        return strengthWorkoutExerciseHistoryResponse.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$strength_workout_release(StrengthWorkoutExerciseHistoryResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.exerciseId);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.recentSets, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.recentSets);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExerciseId() {
        return this.exerciseId;
    }

    public final List<StrengthWorkoutHistorySet> component2() {
        return this.recentSets;
    }

    public final StrengthWorkoutExerciseHistoryResponse copy(String exerciseId, List<StrengthWorkoutHistorySet> recentSets) {
        AbstractC22676k.m65750j(recentSets, "recentSets");
        return new StrengthWorkoutExerciseHistoryResponse(exerciseId, recentSets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrengthWorkoutExerciseHistoryResponse)) {
            return false;
        }
        StrengthWorkoutExerciseHistoryResponse strengthWorkoutExerciseHistoryResponse = (StrengthWorkoutExerciseHistoryResponse) other;
        return AbstractC22676k.m65745e(this.exerciseId, strengthWorkoutExerciseHistoryResponse.exerciseId) && AbstractC22676k.m65745e(this.recentSets, strengthWorkoutExerciseHistoryResponse.recentSets);
    }

    public final String getExerciseId() {
        return this.exerciseId;
    }

    public final List<StrengthWorkoutHistorySet> getRecentSets() {
        return this.recentSets;
    }

    public int hashCode() {
        String str = this.exerciseId;
        return this.recentSets.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return AbstractC36095b.m114679g("StrengthWorkoutExerciseHistoryResponse(exerciseId=", this.exerciseId, ", recentSets=", ")", this.recentSets);
    }

    public StrengthWorkoutExerciseHistoryResponse(String str, List<StrengthWorkoutHistorySet> recentSets) {
        AbstractC22676k.m65750j(recentSets, "recentSets");
        this.exerciseId = str;
        this.recentSets = recentSets;
    }

    public /* synthetic */ StrengthWorkoutExerciseHistoryResponse(String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25271y.f99162w : list);
    }
}
