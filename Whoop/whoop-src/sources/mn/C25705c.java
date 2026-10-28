package mn;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.whoop.service.network.model.UserSessionDto;
import in.InterfaceC18714b;
import java.util.List;
import java.util.Map;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p465rm.C31548l0;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: mn.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C25705c implements InterfaceC18714b {
    public static final Parcelable.Creator<C25705c> CREATOR = new C25704b(0);

    /* JADX INFO: renamed from: E */
    public final boolean f101213E;

    /* JADX INFO: renamed from: F */
    public final int f101214F;

    /* JADX INFO: renamed from: w */
    public final int f101215w;

    /* JADX INFO: renamed from: x */
    public final String f101216x;

    /* JADX INFO: renamed from: y */
    public final String f101217y;

    /* JADX INFO: renamed from: z */
    public final String f101218z;

    public C25705c(int i13, int i14, String str, String str2, String str3, boolean z4) {
        AbstractC24543a.m71569e(i14 == -1 || i14 > 0);
        this.f101215w = i13;
        this.f101216x = str;
        this.f101217y = str2;
        this.f101218z = str3;
        this.f101213E = z4;
        this.f101214F = i14;
    }

    /* JADX INFO: renamed from: b */
    public static C25705c m75699b(Map map) {
        boolean z4;
        int i13;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i14;
        List list = (List) map.get("icy-br");
        boolean z13 = true;
        int i15 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i14 = Integer.parseInt(str4) * 1000;
                if (i14 > 0) {
                    z4 = true;
                } else {
                    try {
                        String strValueOf = String.valueOf(str4);
                        Log.w("IcyHeaders", strValueOf.length() != 0 ? "Invalid bitrate: ".concat(strValueOf) : new String("Invalid bitrate: "));
                        z4 = false;
                        i14 = -1;
                    } catch (NumberFormatException unused) {
                        String strValueOf2 = String.valueOf(str4);
                        Log.w("IcyHeaders", strValueOf2.length() != 0 ? "Invalid bitrate header: ".concat(strValueOf2) : new String("Invalid bitrate header: "));
                        z4 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i14 = -1;
            }
            i13 = i14;
        } else {
            z4 = false;
            i13 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z4 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z4 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z4 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
            z4 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i16 = Integer.parseInt(str5);
                if (i16 > 0) {
                    i15 = i16;
                } else {
                    try {
                        String strValueOf3 = String.valueOf(str5);
                        Log.w("IcyHeaders", strValueOf3.length() != 0 ? "Invalid metadata interval: ".concat(strValueOf3) : new String("Invalid metadata interval: "));
                        z13 = z4;
                    } catch (NumberFormatException unused3) {
                        i15 = i16;
                        String strValueOf4 = String.valueOf(str5);
                        Log.w("IcyHeaders", strValueOf4.length() != 0 ? "Invalid metadata interval: ".concat(strValueOf4) : new String("Invalid metadata interval: "));
                    }
                }
                z4 = z13;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z4) {
            return new C25705c(i13, i15, str, str2, str3, zEquals);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C25705c.class == obj.getClass()) {
            C25705c c25705c = (C25705c) obj;
            if (this.f101215w == c25705c.f101215w && AbstractC24567y.m71670a(this.f101216x, c25705c.f101216x) && AbstractC24567y.m71670a(this.f101217y, c25705c.f101217y) && AbstractC24567y.m71670a(this.f101218z, c25705c.f101218z) && this.f101213E == c25705c.f101213E && this.f101214F == c25705c.f101214F) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = (527 + this.f101215w) * 31;
        String str = this.f101216x;
        int iHashCode = (i13 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f101217y;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f101218z;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f101213E ? 1 : 0)) * 31) + this.f101214F;
    }

    public final String toString() {
        String str = this.f101217y;
        int iM91832b = AbstractC30007c.m91832b(80, str);
        String str2 = this.f101216x;
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(iM91832b, str2));
        sb4.append("IcyHeaders: name=\"");
        sb4.append(str);
        sb4.append("\", genre=\"");
        sb4.append(str2);
        sb4.append("\", bitrate=");
        sb4.append(this.f101215w);
        sb4.append(", metadataInterval=");
        sb4.append(this.f101214F);
        return sb4.toString();
    }

    @Override // in.InterfaceC18714b
    /* JADX INFO: renamed from: w */
    public final void mo54416w(C31548l0 c31548l0) {
        String str = this.f101217y;
        if (str != null) {
            c31548l0.f130217E = str;
        }
        String str2 = this.f101216x;
        if (str2 != null) {
            c31548l0.f130215C = str2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f101215w);
        parcel.writeString(this.f101216x);
        parcel.writeString(this.f101217y);
        parcel.writeString(this.f101218z);
        int i14 = AbstractC24567y.f95875a;
        parcel.writeInt(this.f101213E ? 1 : 0);
        parcel.writeInt(this.f101214F);
    }

    public C25705c(Parcel parcel) {
        this.f101215w = parcel.readInt();
        this.f101216x = parcel.readString();
        this.f101217y = parcel.readString();
        this.f101218z = parcel.readString();
        int i13 = AbstractC24567y.f95875a;
        this.f101213E = parcel.readInt() != 0;
        this.f101214F = parcel.readInt();
    }
}
