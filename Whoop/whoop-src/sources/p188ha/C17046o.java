package p188ha;

import androidx.health.platform.client.proto.C1533u;
import java.util.ArrayList;
import java.util.Objects;
import p000.AbstractC11266d;
import p516u8.C34630z;
import p550vd.AbstractC35903f;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.C41060w0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ha.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C17046o extends AbstractC17041j {

    /* JADX INFO: renamed from: b */
    public final String f65540b;

    /* JADX INFO: renamed from: c */
    public final AbstractC41023g0 f65541c;

    public C17046o(String str, String str2, C41060w0 c41060w0) {
        super(str);
        AbstractC35849g.m113802d(!c41060w0.isEmpty());
        this.f65540b = str2;
        AbstractC41023g0 abstractC41023g0M133252m = AbstractC41023g0.m133252m(c41060w0);
        this.f65541c = abstractC41023g0M133252m;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m48123b(String str) {
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

    @Override // p516u8.InterfaceC34583b0
    /* JADX INFO: renamed from: a */
    public final void mo40837a(C34630z c34630z) {
        byte b;
        switch (this.f65528a) {
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
            case "TCON":
                b = 12;
                break;
            case "TDAT":
                b = 13;
                break;
            case "TDRC":
                b = 14;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 16;
                break;
            case "TIT2":
                b = 17;
                break;
            case "TPE1":
                b = 18;
                break;
            case "TPE2":
                b = 19;
                break;
            case "TPE3":
                b = 20;
                break;
            case "TRCK":
                b = 21;
                break;
            case "TYER":
                b = 22;
                break;
            default:
                b = -1;
                break;
        }
        AbstractC41023g0 abstractC41023g0 = this.f65541c;
        try {
            switch (b) {
                case 0:
                case 10:
                    c34630z.f145880c = (CharSequence) abstractC41023g0.get(0);
                    break;
                case 1:
                case 11:
                    c34630z.f145896s = (CharSequence) abstractC41023g0.get(0);
                    break;
                case 2:
                case 13:
                    String str = (String) abstractC41023g0.get(0);
                    int i13 = Integer.parseInt(str.substring(2, 4));
                    int i14 = Integer.parseInt(str.substring(0, 2));
                    c34630z.f145890m = Integer.valueOf(i13);
                    c34630z.f145891n = Integer.valueOf(i14);
                    break;
                case 3:
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    c34630z.f145879b = (CharSequence) abstractC41023g0.get(0);
                    break;
                case 4:
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    c34630z.f145881d = (CharSequence) abstractC41023g0.get(0);
                    break;
                case 5:
                case 20:
                    c34630z.f145897t = (CharSequence) abstractC41023g0.get(0);
                    break;
                case 6:
                case 21:
                    String str2 = (String) abstractC41023g0.get(0);
                    int i15 = AbstractC38065t.f163031a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i16 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    c34630z.f145885h = Integer.valueOf(i16);
                    c34630z.f145886i = numValueOf;
                    break;
                case 7:
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    c34630z.f145878a = (CharSequence) abstractC41023g0.get(0);
                    break;
                case 8:
                case 16:
                    c34630z.f145895r = (CharSequence) abstractC41023g0.get(0);
                    break;
                case 9:
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    c34630z.f145889l = Integer.valueOf(Integer.parseInt((String) abstractC41023g0.get(0)));
                    break;
                case 12:
                    Integer numM114003W = AbstractC35903f.m114003W((String) abstractC41023g0.get(0));
                    if (numM114003W != null) {
                        String strM48122a = AbstractC17042k.m48122a(numM114003W.intValue());
                        if (strM48122a != null) {
                            c34630z.f145900w = strM48122a;
                        }
                    } else {
                        c34630z.f145900w = (CharSequence) abstractC41023g0.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListM48123b = m48123b((String) abstractC41023g0.get(0));
                    int size = arrayListM48123b.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c34630z.f145891n = (Integer) arrayListM48123b.get(2);
                            }
                        }
                        c34630z.f145890m = (Integer) arrayListM48123b.get(1);
                    }
                    c34630z.f145889l = (Integer) arrayListM48123b.get(0);
                    break;
                case 15:
                    ArrayList arrayListM48123b2 = m48123b((String) abstractC41023g0.get(0));
                    int size2 = arrayListM48123b2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c34630z.f145894q = (Integer) arrayListM48123b2.get(2);
                            }
                        }
                        c34630z.f145893p = (Integer) arrayListM48123b2.get(1);
                    }
                    c34630z.f145892o = (Integer) arrayListM48123b2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17046o.class == obj.getClass()) {
            C17046o c17046o = (C17046o) obj;
            if (Objects.equals(this.f65528a, c17046o.f65528a) && Objects.equals(this.f65540b, c17046o.f65540b) && this.f65541c.equals(c17046o.f65541c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(527, 31, this.f65528a);
        String str = this.f65540b;
        return this.f65541c.hashCode() + ((iM30450d + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p188ha.AbstractC17041j
    public final String toString() {
        return this.f65528a + ": description=" + this.f65540b + ": values=" + this.f65541c;
    }
}
