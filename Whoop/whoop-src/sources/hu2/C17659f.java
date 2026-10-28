package hu2;

import android.os.Parcel;
import android.os.Parcelable;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hu2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\b¨\u0006\u001d"}, m65681d2 = {"Lhu2/f;", "Lhu2/m;", "", "groupIndex", "exerciseIndex", "<init>", "(II)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "f", "x", "b", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17659f implements InterfaceC17666m {
    public static final Parcelable.Creator<C17659f> CREATOR = new a();

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int groupIndex;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int exerciseIndex;

    /* JADX INFO: renamed from: hu2.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Parcelable.Creator<C17659f> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C17659f createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new C17659f(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C17659f[] newArray(int i13) {
            return new C17659f[i13];
        }
    }

    public C17659f(int i13, int i14) {
        this.groupIndex = i13;
        this.exerciseIndex = i14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getExerciseIndex() {
        return this.exerciseIndex;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17659f)) {
            return false;
        }
        C17659f c17659f = (C17659f) other;
        return this.groupIndex == c17659f.groupIndex && this.exerciseIndex == c17659f.exerciseIndex;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.exerciseIndex) + (Integer.hashCode(this.groupIndex) * 31);
    }

    public String toString() {
        return AbstractC25012a.m73372e(this.groupIndex, this.exerciseIndex, "DeleteExerciseConfirmationClicked(groupIndex=", ", exerciseIndex=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.groupIndex);
        dest.writeInt(this.exerciseIndex);
    }
}
