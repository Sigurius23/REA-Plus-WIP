package in2;

import android.os.Parcel;
import android.os.Parcelable;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: in2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\b¨\u0006\u001f"}, m65681d2 = {"Lin2/e;", "Landroid/os/Parcelable;", "", "firstVisibleItemIndex", "firstVisibleItemOffset", "<init>", "(II)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "b", "x", "f", "y", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18733e implements Parcelable {
    public static final Parcelable.Creator<C18733e> CREATOR = new b();

    /* JADX INFO: renamed from: z */
    private static final C18733e f73604z;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int firstVisibleItemIndex;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int firstVisibleItemOffset;

    /* JADX INFO: renamed from: in2.e$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Parcelable.Creator<C18733e> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C18733e createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new C18733e(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C18733e[] newArray(int i13) {
            return new C18733e[i13];
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i13 = 0;
        f73604z = new C18733e(i13, i13, 2, defaultConstructorMarker);
    }

    public C18733e(int i13, int i14) {
        this.firstVisibleItemIndex = i13;
        this.firstVisibleItemOffset = i14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFirstVisibleItemIndex() {
        return this.firstVisibleItemIndex;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18733e)) {
            return false;
        }
        C18733e c18733e = (C18733e) other;
        return this.firstVisibleItemIndex == c18733e.firstVisibleItemIndex && this.firstVisibleItemOffset == c18733e.firstVisibleItemOffset;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getFirstVisibleItemOffset() {
        return this.firstVisibleItemOffset;
    }

    public int hashCode() {
        return Integer.hashCode(this.firstVisibleItemOffset) + (Integer.hashCode(this.firstVisibleItemIndex) * 31);
    }

    public String toString() {
        return AbstractC25012a.m73372e(this.firstVisibleItemIndex, this.firstVisibleItemOffset, "LazyListPosition(firstVisibleItemIndex=", ", firstVisibleItemOffset=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.firstVisibleItemIndex);
        dest.writeInt(this.firstVisibleItemOffset);
    }

    public /* synthetic */ C18733e(int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, (i15 & 2) != 0 ? 0 : i14);
    }
}
