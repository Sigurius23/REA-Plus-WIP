package kn;

import android.os.Parcel;
import android.os.Parcelable;
import in.InterfaceC18714b;
import java.util.Arrays;
import p031b9.AbstractC2875y;
import p266jz.C22060h;
import p309lo.AbstractC24567y;
import p465rm.C31518b0;
import p465rm.C31521c0;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: kn.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C22597a implements InterfaceC18714b {
    public static final Parcelable.Creator<C22597a> CREATOR;

    /* JADX INFO: renamed from: G */
    public static final C31521c0 f88919G;

    /* JADX INFO: renamed from: H */
    public static final C31521c0 f88920H;

    /* JADX INFO: renamed from: E */
    public final byte[] f88921E;

    /* JADX INFO: renamed from: F */
    public int f88922F;

    /* JADX INFO: renamed from: w */
    public final String f88923w;

    /* JADX INFO: renamed from: x */
    public final String f88924x;

    /* JADX INFO: renamed from: y */
    public final long f88925y;

    /* JADX INFO: renamed from: z */
    public final long f88926z;

    static {
        C31518b0 c31518b0 = new C31518b0();
        c31518b0.f130047k = "application/id3";
        f88919G = new C31521c0(c31518b0);
        C31518b0 c31518b1 = new C31518b0();
        c31518b1.f130047k = "application/x-scte35";
        f88920H = new C31521c0(c31518b1);
        CREATOR = new C22060h(6);
    }

    public C22597a(String str, String str2, long j7, long j13, byte[] bArr) {
        this.f88923w = str;
        this.f88924x = str2;
        this.f88925y = j7;
        this.f88926z = j13;
        this.f88921E = bArr;
    }

    @Override // in.InterfaceC18714b
    /* JADX INFO: renamed from: d */
    public final C31521c0 mo54414d() {
        String str = this.f88923w;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f88920H;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f88919G;
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22597a.class == obj.getClass()) {
            C22597a c22597a = (C22597a) obj;
            if (this.f88925y == c22597a.f88925y && this.f88926z == c22597a.f88926z && AbstractC24567y.m71670a(this.f88923w, c22597a.f88923w) && AbstractC24567y.m71670a(this.f88924x, c22597a.f88924x) && Arrays.equals(this.f88921E, c22597a.f88921E)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f88922F == 0) {
            String str = this.f88923w;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f88924x;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j7 = this.f88925y;
            int i13 = (iHashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j13 = this.f88926z;
            this.f88922F = Arrays.hashCode(this.f88921E) + ((i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31);
        }
        return this.f88922F;
    }

    @Override // in.InterfaceC18714b
    /* JADX INFO: renamed from: j */
    public final byte[] mo54415j() {
        if (mo54414d() != null) {
            return this.f88921E;
        }
        return null;
    }

    public final String toString() {
        String str = this.f88923w;
        int iM91832b = AbstractC30007c.m91832b(79, str);
        String str2 = this.f88924x;
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(iM91832b, str2));
        sb4.append("EMSG: scheme=");
        sb4.append(str);
        sb4.append(", id=");
        sb4.append(this.f88926z);
        AbstractC2875y.m8285A(sb4, ", durationMs=", this.f88925y, ", value=");
        sb4.append(str2);
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f88923w);
        parcel.writeString(this.f88924x);
        parcel.writeLong(this.f88925y);
        parcel.writeLong(this.f88926z);
        parcel.writeByteArray(this.f88921E);
    }

    public C22597a(Parcel parcel) {
        String string = parcel.readString();
        int i13 = AbstractC24567y.f95875a;
        this.f88923w = string;
        this.f88924x = parcel.readString();
        this.f88925y = parcel.readLong();
        this.f88926z = parcel.readLong();
        this.f88921E = parcel.createByteArray();
    }
}
