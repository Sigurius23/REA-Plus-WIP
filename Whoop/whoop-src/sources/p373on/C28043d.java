package p373on;

import android.os.Parcel;
import android.os.Parcelable;
import in.InterfaceC18714b;
import java.util.ArrayList;
import mn.C25704b;
import p309lo.AbstractC24543a;

/* JADX INFO: renamed from: on.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C28043d implements InterfaceC18714b {
    public static final Parcelable.Creator<C28043d> CREATOR = new C25704b(25);

    /* JADX INFO: renamed from: w */
    public final ArrayList f113180w;

    public C28043d(ArrayList arrayList) {
        this.f113180w = arrayList;
        boolean z4 = false;
        if (!arrayList.isEmpty()) {
            long j7 = ((C28042c) arrayList.get(0)).f113178x;
            for (int i13 = 1; i13 < arrayList.size(); i13++) {
                if (((C28042c) arrayList.get(i13)).f113177w < j7) {
                    z4 = true;
                    break;
                }
                j7 = ((C28042c) arrayList.get(i13)).f113178x;
            }
        }
        AbstractC24543a.m71569e(!z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C28043d.class != obj.getClass()) {
            return false;
        }
        return this.f113180w.equals(((C28043d) obj).f113180w);
    }

    public final int hashCode() {
        return this.f113180w.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f113180w);
        StringBuilder sb4 = new StringBuilder(strValueOf.length() + 21);
        sb4.append("SlowMotion: segments=");
        sb4.append(strValueOf);
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeList(this.f113180w);
    }
}
