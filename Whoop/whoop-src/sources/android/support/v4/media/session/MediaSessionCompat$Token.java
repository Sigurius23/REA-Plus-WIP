package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p088dc.InterfaceC11898e;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new C1081o(2);

    /* JADX INFO: renamed from: x */
    public final Object f4160x;

    /* JADX INFO: renamed from: y */
    public InterfaceC1070d f4161y;

    /* JADX INFO: renamed from: w */
    public final Object f4159w = new Object();

    /* JADX INFO: renamed from: z */
    public InterfaceC11898e f4162z = null;

    public MediaSessionCompat$Token(Object obj, BinderC1077k binderC1077k) {
        this.f4160x = obj;
        this.f4161y = binderC1077k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = ((MediaSessionCompat$Token) obj).f4160x;
        Object obj3 = this.f4160x;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f4160x;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeParcelable((Parcelable) this.f4160x, i13);
    }
}
