package p345nn;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import java.util.ArrayList;
import mn.C25704b;
import p000.AbstractC11266d;
import p309lo.AbstractC24567y;
import p465rm.C31548l0;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: nn.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C26862m extends AbstractC26858i {
    public static final Parcelable.Creator<C26862m> CREATOR = new C25704b(14);

    /* JADX INFO: renamed from: x */
    public final String f107188x;

    /* JADX INFO: renamed from: y */
    public final String f107189y;

    public C26862m(String str, String str2, String str3) {
        super(str);
        this.f107188x = str2;
        this.f107189y = str3;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m80181b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C26862m.class == obj.getClass()) {
            C26862m c26862m = (C26862m) obj;
            if (AbstractC24567y.m71670a(this.f107177w, c26862m.f107177w) && AbstractC24567y.m71670a(this.f107188x, c26862m.f107188x) && AbstractC24567y.m71670a(this.f107189y, c26862m.f107189y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(527, 31, this.f107177w);
        String str = this.f107188x;
        int iHashCode = (iM30450d + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f107189y;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p345nn.AbstractC26858i
    public final String toString() {
        String str = this.f107177w;
        int iM91832b = AbstractC30007c.m91832b(22, str);
        String str2 = this.f107188x;
        int iM91832b2 = AbstractC30007c.m91832b(iM91832b, str2);
        String str3 = this.f107189y;
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(iM91832b2, str3));
        sb4.append(str);
        sb4.append(": description=");
        sb4.append(str2);
        sb4.append(": value=");
        sb4.append(str3);
        return sb4.toString();
    }

    @Override // in.InterfaceC18714b
    /* JADX INFO: renamed from: w */
    public final void mo54416w(C31548l0 c31548l0) {
        byte b;
        String str = this.f107177w;
        str.getClass();
        switch (str) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TDAT":
                b = 12;
                break;
            case "TDRC":
                b = 13;
                break;
            case "TDRL":
                b = 14;
                break;
            case "TEXT":
                b = 15;
                break;
            case "TIT2":
                b = 16;
                break;
            case "TPE1":
                b = 17;
                break;
            case "TPE2":
                b = 18;
                break;
            case "TPE3":
                b = 19;
                break;
            case "TRCK":
                b = 20;
                break;
            case "TYER":
                b = 21;
                break;
            default:
                b = -1;
                break;
        }
        String str2 = this.f107189y;
        try {
            switch (b) {
                case 0:
                case 10:
                    c31548l0.f130221c = str2;
                    break;
                case 1:
                case 11:
                    c31548l0.f130243y = str2;
                    break;
                case 2:
                case 12:
                    int i13 = Integer.parseInt(str2.substring(2, 4));
                    int i14 = Integer.parseInt(str2.substring(0, 2));
                    c31548l0.f130237s = Integer.valueOf(i13);
                    c31548l0.f130238t = Integer.valueOf(i14);
                    break;
                case 3:
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    c31548l0.f130220b = str2;
                    break;
                case 4:
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    c31548l0.f130222d = str2;
                    break;
                case 5:
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    c31548l0.f130244z = str2;
                    break;
                case 6:
                case 20:
                    int i15 = AbstractC24567y.f95875a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i16 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    c31548l0.f130232n = Integer.valueOf(i16);
                    c31548l0.f130233o = numValueOf;
                    break;
                case 7:
                case 16:
                    c31548l0.f130219a = str2;
                    break;
                case 8:
                case 15:
                    c31548l0.f130242x = str2;
                    break;
                case 9:
                case 21:
                    c31548l0.f130236r = Integer.valueOf(Integer.parseInt(str2));
                    break;
                case 13:
                    ArrayList arrayListM80181b = m80181b(str2);
                    int size = arrayListM80181b.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c31548l0.f130238t = (Integer) arrayListM80181b.get(2);
                            }
                        }
                        c31548l0.f130237s = (Integer) arrayListM80181b.get(1);
                    }
                    c31548l0.f130236r = (Integer) arrayListM80181b.get(0);
                    break;
                case 14:
                    ArrayList arrayListM80181b2 = m80181b(str2);
                    int size2 = arrayListM80181b2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c31548l0.f130241w = (Integer) arrayListM80181b2.get(2);
                            }
                        }
                        c31548l0.f130240v = (Integer) arrayListM80181b2.get(1);
                    }
                    c31548l0.f130239u = (Integer) arrayListM80181b2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f107177w);
        parcel.writeString(this.f107188x);
        parcel.writeString(this.f107189y);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C26862m(Parcel parcel) {
        String string = parcel.readString();
        int i13 = AbstractC24567y.f95875a;
        super(string);
        this.f107188x = parcel.readString();
        this.f107189y = parcel.readString();
    }
}
