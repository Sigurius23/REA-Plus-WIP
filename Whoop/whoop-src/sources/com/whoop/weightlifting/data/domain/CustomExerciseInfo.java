package com.whoop.weightlifting.data.domain;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006,"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;", "Landroid/os/Parcelable;", "Lcom/whoop/weightlifting/data/domain/LinkedExercise;", "linkedExercise", "<init>", "(Lcom/whoop/weightlifting/data/domain/LinkedExercise;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/weightlifting/data/domain/LinkedExercise;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;Lzc3/c;Lyc3/g;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/whoop/weightlifting/data/domain/LinkedExercise;", "copy", "(Lcom/whoop/weightlifting/data/domain/LinkedExercise;)Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/weightlifting/data/domain/LinkedExercise;", "getLinkedExercise", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CustomExerciseInfo implements Parcelable {
    public static final int $stable = 0;
    private final LinkedExercise linkedExercise;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CustomExerciseInfo> CREATOR = new Creator();

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CustomExerciseInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<CustomExerciseInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomExerciseInfo createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new CustomExerciseInfo(parcel.readInt() == 0 ? null : LinkedExercise.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomExerciseInfo[] newArray(int i13) {
            return new CustomExerciseInfo[i13];
        }
    }

    public /* synthetic */ CustomExerciseInfo(int i13, LinkedExercise linkedExercise, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, CustomExerciseInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.linkedExercise = linkedExercise;
    }

    public static /* synthetic */ CustomExerciseInfo copy$default(CustomExerciseInfo customExerciseInfo, LinkedExercise linkedExercise, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            linkedExercise = customExerciseInfo.linkedExercise;
        }
        return customExerciseInfo.copy(linkedExercise);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LinkedExercise getLinkedExercise() {
        return this.linkedExercise;
    }

    public final CustomExerciseInfo copy(LinkedExercise linkedExercise) {
        return new CustomExerciseInfo(linkedExercise);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CustomExerciseInfo) && AbstractC22676k.m65745e(this.linkedExercise, ((CustomExerciseInfo) other).linkedExercise);
    }

    public final LinkedExercise getLinkedExercise() {
        return this.linkedExercise;
    }

    public int hashCode() {
        LinkedExercise linkedExercise = this.linkedExercise;
        if (linkedExercise == null) {
            return 0;
        }
        return linkedExercise.hashCode();
    }

    public String toString() {
        return "CustomExerciseInfo(linkedExercise=" + this.linkedExercise + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        LinkedExercise linkedExercise = this.linkedExercise;
        if (linkedExercise == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            linkedExercise.writeToParcel(dest, flags);
        }
    }

    public CustomExerciseInfo(LinkedExercise linkedExercise) {
        this.linkedExercise = linkedExercise;
    }
}
