package p276ka;

import p000.AbstractC11266d;
import p460rg.AbstractC31375j;
import p516u8.C34630z;
import p516u8.InterfaceC34583b0;
import p550vd.AbstractC35903f;

/* JADX INFO: renamed from: ka.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C22307a implements InterfaceC34583b0 {

    /* JADX INFO: renamed from: a */
    public final String f87030a;

    /* JADX INFO: renamed from: b */
    public final String f87031b;

    public C22307a(String str, String str2) {
        this.f87030a = AbstractC31375j.m96500p(str);
        this.f87031b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p516u8.InterfaceC34583b0
    /* JADX INFO: renamed from: a */
    public final void mo40837a(C34630z c34630z) {
        String str = this.f87030a;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 9;
                }
                break;
        }
        String str2 = this.f87031b;
        switch (b) {
            case 0:
                Integer numM114003W = AbstractC35903f.m114003W(str2);
                if (numM114003W != null) {
                    c34630z.f145886i = numM114003W;
                }
                break;
            case 1:
                Integer numM114003W2 = AbstractC35903f.m114003W(str2);
                if (numM114003W2 != null) {
                    c34630z.f145899v = numM114003W2;
                }
                break;
            case 2:
                Integer numM114003W3 = AbstractC35903f.m114003W(str2);
                if (numM114003W3 != null) {
                    c34630z.f145885h = numM114003W3;
                }
                break;
            case 3:
                c34630z.f145880c = str2;
                break;
            case 4:
                c34630z.f145900w = str2;
                break;
            case 5:
                c34630z.f145878a = str2;
                break;
            case 6:
                c34630z.f145882e = str2;
                break;
            case 7:
                Integer numM114003W4 = AbstractC35903f.m114003W(str2);
                if (numM114003W4 != null) {
                    c34630z.f145898u = numM114003W4;
                }
                break;
            case 8:
                c34630z.f145881d = str2;
                break;
            case 9:
                c34630z.f145879b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22307a.class == obj.getClass()) {
            C22307a c22307a = (C22307a) obj;
            if (this.f87030a.equals(c22307a.f87030a) && this.f87031b.equals(c22307a.f87031b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f87031b.hashCode() + AbstractC11266d.m30450d(527, 31, this.f87030a);
    }

    public final String toString() {
        return "VC: " + this.f87030a + "=" + this.f87031b;
    }
}
