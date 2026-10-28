package com.whoop.strengthworkout.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ<\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b.\u0010\u001b¨\u00061"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;", "", "", "workoutTemplateKey", "", "name", "userId", "updatedAt", "<init>", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$strength_workout_release", "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Long;", "component4", "copy", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getWorkoutTemplateKey", "Ljava/lang/String;", "getName", "Ljava/lang/Long;", "getUserId", "getUpdatedAt", "Companion", "$serializer", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StrengthWorkoutTemplateOverview {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String name;
    private final String updatedAt;
    private final Long userId;
    private final long workoutTemplateKey;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;", "serializer", "()Lwc3/c;", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StrengthWorkoutTemplateOverview$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StrengthWorkoutTemplateOverview(int i13, long j7, String str, Long l7, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, StrengthWorkoutTemplateOverview$$serializer.INSTANCE.getDescriptor());
        }
        this.workoutTemplateKey = j7;
        this.name = str;
        this.userId = l7;
        this.updatedAt = str2;
    }

    public static /* synthetic */ StrengthWorkoutTemplateOverview copy$default(StrengthWorkoutTemplateOverview strengthWorkoutTemplateOverview, long j7, String str, Long l7, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = strengthWorkoutTemplateOverview.workoutTemplateKey;
        }
        long j13 = j7;
        if ((i13 & 2) != 0) {
            str = strengthWorkoutTemplateOverview.name;
        }
        String str3 = str;
        if ((i13 & 4) != 0) {
            l7 = strengthWorkoutTemplateOverview.userId;
        }
        Long l12 = l7;
        if ((i13 & 8) != 0) {
            str2 = strengthWorkoutTemplateOverview.updatedAt;
        }
        return strengthWorkoutTemplateOverview.copy(j13, str3, l12, str2);
    }

    public static final /* synthetic */ void write$Self$strength_workout_release(StrengthWorkoutTemplateOverview self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.workoutTemplateKey);
        output.encodeStringElement(serialDesc, 1, self.name);
        output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.userId);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.updatedAt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getWorkoutTemplateKey() {
        return this.workoutTemplateKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final StrengthWorkoutTemplateOverview copy(long workoutTemplateKey, String name, Long userId, String updatedAt) {
        AbstractC22676k.m65750j(name, "name");
        return new StrengthWorkoutTemplateOverview(workoutTemplateKey, name, userId, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrengthWorkoutTemplateOverview)) {
            return false;
        }
        StrengthWorkoutTemplateOverview strengthWorkoutTemplateOverview = (StrengthWorkoutTemplateOverview) other;
        return this.workoutTemplateKey == strengthWorkoutTemplateOverview.workoutTemplateKey && AbstractC22676k.m65745e(this.name, strengthWorkoutTemplateOverview.name) && AbstractC22676k.m65745e(this.userId, strengthWorkoutTemplateOverview.userId) && AbstractC22676k.m65745e(this.updatedAt, strengthWorkoutTemplateOverview.updatedAt);
    }

    public final String getName() {
        return this.name;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final long getWorkoutTemplateKey() {
        return this.workoutTemplateKey;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Long.hashCode(this.workoutTemplateKey) * 31, 31, this.name);
        Long l7 = this.userId;
        int iHashCode = (iM30450d + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str = this.updatedAt;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        long j7 = this.workoutTemplateKey;
        String str = this.name;
        Long l7 = this.userId;
        String str2 = this.updatedAt;
        StringBuilder sbM114685m = AbstractC36095b.m114685m("StrengthWorkoutTemplateOverview(workoutTemplateKey=", ", name=", j7, str);
        sbM114685m.append(", userId=");
        sbM114685m.append(l7);
        sbM114685m.append(", updatedAt=");
        sbM114685m.append(str2);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }

    public StrengthWorkoutTemplateOverview(long j7, String name, Long l7, String str) {
        AbstractC22676k.m65750j(name, "name");
        this.workoutTemplateKey = j7;
        this.name = name;
        this.userId = l7;
        this.updatedAt = str;
    }
}
