package com.whoop.weightlifting.feature.active.activeworkout.domain;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.UUID;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import lu2.C24753c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ.\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001e¨\u00063"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "Landroid/os/Parcelable;", "Ljava/util/UUID;", "groupId", "exerciseId", "setId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lzc3/c;Lyc3/g;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/UUID;", "component2", "component3", "copy", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getGroupId", "getExerciseId", "getSetId", "Companion", "$serializer", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PositionInWorkout implements Parcelable {
    private final UUID exerciseId;
    private final UUID groupId;
    private final UUID setId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PositionInWorkout> CREATOR = new C10766b();

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.PositionInWorkout$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PositionInWorkout$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.PositionInWorkout$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10766b implements Parcelable.Creator<PositionInWorkout> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PositionInWorkout createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new PositionInWorkout((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PositionInWorkout[] newArray(int i13) {
            return new PositionInWorkout[i13];
        }
    }

    public /* synthetic */ PositionInWorkout(int i13, UUID uuid, UUID uuid2, UUID uuid3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, PositionInWorkout$$serializer.INSTANCE.getDescriptor());
        }
        this.groupId = uuid;
        this.exerciseId = uuid2;
        this.setId = uuid3;
    }

    public static /* synthetic */ PositionInWorkout copy$default(PositionInWorkout positionInWorkout, UUID uuid, UUID uuid2, UUID uuid3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            uuid = positionInWorkout.groupId;
        }
        if ((i13 & 2) != 0) {
            uuid2 = positionInWorkout.exerciseId;
        }
        if ((i13 & 4) != 0) {
            uuid3 = positionInWorkout.setId;
        }
        return positionInWorkout.copy(uuid, uuid2, uuid3);
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(PositionInWorkout self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        C24753c c24753c = C24753c.f96791a;
        output.encodeSerializableElement(serialDesc, 0, c24753c, self.groupId);
        output.encodeSerializableElement(serialDesc, 1, c24753c, self.exerciseId);
        output.encodeSerializableElement(serialDesc, 2, c24753c, self.setId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getExerciseId() {
        return this.exerciseId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UUID getSetId() {
        return this.setId;
    }

    public final PositionInWorkout copy(UUID groupId, UUID exerciseId, UUID setId) {
        AbstractC22676k.m65750j(groupId, "groupId");
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        AbstractC22676k.m65750j(setId, "setId");
        return new PositionInWorkout(groupId, exerciseId, setId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionInWorkout)) {
            return false;
        }
        PositionInWorkout positionInWorkout = (PositionInWorkout) other;
        return AbstractC22676k.m65745e(this.groupId, positionInWorkout.groupId) && AbstractC22676k.m65745e(this.exerciseId, positionInWorkout.exerciseId) && AbstractC22676k.m65745e(this.setId, positionInWorkout.setId);
    }

    public final UUID getExerciseId() {
        return this.exerciseId;
    }

    public final UUID getGroupId() {
        return this.groupId;
    }

    public final UUID getSetId() {
        return this.setId;
    }

    public int hashCode() {
        return this.setId.hashCode() + ((this.exerciseId.hashCode() + (this.groupId.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "PositionInWorkout(groupId=" + this.groupId + ", exerciseId=" + this.exerciseId + ", setId=" + this.setId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.groupId);
        dest.writeSerializable(this.exerciseId);
        dest.writeSerializable(this.setId);
    }

    public PositionInWorkout(UUID groupId, UUID exerciseId, UUID setId) {
        AbstractC22676k.m65750j(groupId, "groupId");
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        AbstractC22676k.m65750j(setId, "setId");
        this.groupId = groupId;
        this.exerciseId = exerciseId;
        this.setId = setId;
    }
}
