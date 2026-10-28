package com.whoop.weightlifting.data.domain;

import ad3.AbstractC0757c;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import lu2.C24754d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import rr2.InterfaceC31766c;
import tr2.InterfaceC34116n;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u001a¨\u0006)"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;", "", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "lastSavedActiveWorkout", "<init>", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;Lzc3/c;Lyc3/g;)V", "write$Self", "Llu2/d;", "jsonFormat", "", "serialize", "(Llu2/d;)Ljava/lang/String;", "component1", "()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "copy", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "getLastSavedActiveWorkout", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WorkoutSessionState {
    private final ActiveWorkout lastSavedActiveWorkout;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$Companion;", "", "<init>", "()V", "", "serializedState", "Llu2/d;", "jsonFormat", "Ltr2/n;", "logger", "Lrr2/c;", "crashReporter", "Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;", "deserialize", "(Ljava/lang/String;Llu2/d;Ltr2/n;Lrr2/c;)Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;", "Lwc3/c;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ WorkoutSessionState deserialize$default(Companion companion, String str, C24754d c24754d, InterfaceC34116n interfaceC34116n, InterfaceC31766c interfaceC31766c, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                interfaceC34116n = null;
            }
            if ((i13 & 8) != 0) {
                interfaceC31766c = null;
            }
            return companion.deserialize(str, c24754d, interfaceC34116n, interfaceC31766c);
        }

        public final WorkoutSessionState deserialize(String serializedState, C24754d jsonFormat, InterfaceC34116n logger, InterfaceC31766c crashReporter) {
            AbstractC22676k.m65750j(serializedState, "serializedState");
            AbstractC22676k.m65750j(jsonFormat, "jsonFormat");
            try {
                AbstractC0757c json = jsonFormat.getJson();
                json.getClass();
                return (WorkoutSessionState) json.m1831b(WorkoutSessionState.INSTANCE.serializer(), serializedState);
            } catch (Exception e5) {
                if (logger != null) {
                    logger.mo85230v("Error deserializing WorkoutSessionState (via kotlinx.serialization)", e5, new AbstractC30556a.a[0]);
                }
                if (crashReporter == null) {
                    return null;
                }
                crashReporter.mo98631p(e5);
                return null;
            }
        }

        public final InterfaceC37138c serializer() {
            return WorkoutSessionState$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WorkoutSessionState(int i13, ActiveWorkout activeWorkout, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, WorkoutSessionState$$serializer.INSTANCE.getDescriptor());
        }
        this.lastSavedActiveWorkout = activeWorkout;
    }

    public static /* synthetic */ WorkoutSessionState copy$default(WorkoutSessionState workoutSessionState, ActiveWorkout activeWorkout, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            activeWorkout = workoutSessionState.lastSavedActiveWorkout;
        }
        return workoutSessionState.copy(activeWorkout);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ActiveWorkout getLastSavedActiveWorkout() {
        return this.lastSavedActiveWorkout;
    }

    public final WorkoutSessionState copy(ActiveWorkout lastSavedActiveWorkout) {
        return new WorkoutSessionState(lastSavedActiveWorkout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WorkoutSessionState) && AbstractC22676k.m65745e(this.lastSavedActiveWorkout, ((WorkoutSessionState) other).lastSavedActiveWorkout);
    }

    public final ActiveWorkout getLastSavedActiveWorkout() {
        return this.lastSavedActiveWorkout;
    }

    public int hashCode() {
        ActiveWorkout activeWorkout = this.lastSavedActiveWorkout;
        if (activeWorkout == null) {
            return 0;
        }
        return activeWorkout.hashCode();
    }

    public final String serialize(C24754d jsonFormat) {
        AbstractC22676k.m65750j(jsonFormat, "jsonFormat");
        AbstractC0757c json = jsonFormat.getJson();
        json.getClass();
        return json.m1833d(INSTANCE.serializer(), this);
    }

    public String toString() {
        return "WorkoutSessionState(lastSavedActiveWorkout=" + this.lastSavedActiveWorkout + ")";
    }

    public WorkoutSessionState(ActiveWorkout activeWorkout) {
        this.lastSavedActiveWorkout = activeWorkout;
    }
}
