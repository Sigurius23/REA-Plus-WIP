package hu2;

import android.os.Parcel;
import android.os.Parcelable;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: hu2.l */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0013¨\u0006$"}, m65681d2 = {"Lhu2/l;", "Lhu2/m;", "", "groupIndex", "exerciseIndex", "setIndex", "", "newTimeText", "<init>", "(IIILjava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "f", "x", "b", "y", "i", "z", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17665l implements InterfaceC17666m {
    public static final Parcelable.Creator<C17665l> CREATOR = new a();

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int groupIndex;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int exerciseIndex;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int setIndex;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final String newTimeText;

    /* JADX INFO: renamed from: hu2.l$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Parcelable.Creator<C17665l> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C17665l createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new C17665l(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C17665l[] newArray(int i13) {
            return new C17665l[i13];
        }
    }

    public C17665l(int i13, int i14, int i15, String newTimeText) {
        AbstractC22676k.m65750j(newTimeText, "newTimeText");
        this.groupIndex = i13;
        this.exerciseIndex = i14;
        this.setIndex = i15;
        this.newTimeText = newTimeText;
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
        if (!(other instanceof C17665l)) {
            return false;
        }
        C17665l c17665l = (C17665l) other;
        return this.groupIndex == c17665l.groupIndex && this.exerciseIndex == c17665l.exerciseIndex && this.setIndex == c17665l.setIndex && AbstractC22676k.m65745e(this.newTimeText, c17665l.newTimeText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getGroupIndex() {
        return this.groupIndex;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getNewTimeText() {
        return this.newTimeText;
    }

    public int hashCode() {
        return this.newTimeText.hashCode() + AbstractC11266d.m30448b(this.setIndex, AbstractC11266d.m30448b(this.exerciseIndex, Integer.hashCode(this.groupIndex) * 31, 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSetIndex() {
        return this.setIndex;
    }

    public String toString() {
        return AbstractC38963t7.m124376f(this.setIndex, ", newTimeText=", this.newTimeText, ")", AbstractC11266d.m30465s(this.groupIndex, this.exerciseIndex, "TimeChanged(groupIndex=", ", exerciseIndex=", ", setIndex="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.groupIndex);
        dest.writeInt(this.exerciseIndex);
        dest.writeInt(this.setIndex);
        dest.writeString(this.newTimeText);
    }
}
