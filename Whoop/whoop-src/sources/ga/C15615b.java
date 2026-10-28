package ga;

import com.whoop.service.network.model.UserSessionDto;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p516u8.C34630z;
import p516u8.InterfaceC34583b0;
import p555vl.AbstractC36095b;
import p607x8.AbstractC38046a;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ga.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C15615b implements InterfaceC34583b0 {

    /* JADX INFO: renamed from: a */
    public final int f58623a;

    /* JADX INFO: renamed from: b */
    public final String f58624b;

    /* JADX INFO: renamed from: c */
    public final String f58625c;

    /* JADX INFO: renamed from: d */
    public final String f58626d;

    /* JADX INFO: renamed from: e */
    public final boolean f58627e;

    /* JADX INFO: renamed from: f */
    public final int f58628f;

    public C15615b(int i13, int i14, String str, String str2, String str3, boolean z4) {
        AbstractC35849g.m113802d(i14 == -1 || i14 > 0);
        this.f58623a = i13;
        this.f58624b = str;
        this.f58625c = str2;
        this.f58626d = str3;
        this.f58627e = z4;
        this.f58628f = i14;
    }

    /* JADX INFO: renamed from: b */
    public static C15615b m43934b(Map map) {
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
                        AbstractC38046a.m121826u("IcyHeaders", "Invalid bitrate: " + str4);
                        z4 = false;
                        i14 = -1;
                    } catch (NumberFormatException unused) {
                        AbstractC36095b.m114693u("Invalid bitrate header: ", str4, "IcyHeaders");
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
                        AbstractC38046a.m121826u("IcyHeaders", "Invalid metadata interval: " + str5);
                        z13 = z4;
                    } catch (NumberFormatException unused3) {
                        i15 = i16;
                        AbstractC36095b.m114693u("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z4 = z13;
            } catch (NumberFormatException unused4) {
            }
        }
        int i17 = i15;
        if (z4) {
            return new C15615b(i13, i17, str, str2, str3, zEquals);
        }
        return null;
    }

    @Override // p516u8.InterfaceC34583b0
    /* JADX INFO: renamed from: a */
    public final void mo40837a(C34630z c34630z) {
        String str = this.f58625c;
        if (str != null) {
            c34630z.f145901x = str;
        }
        String str2 = this.f58624b;
        if (str2 != null) {
            c34630z.f145900w = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15615b.class == obj.getClass()) {
            C15615b c15615b = (C15615b) obj;
            if (this.f58623a == c15615b.f58623a && Objects.equals(this.f58624b, c15615b.f58624b) && Objects.equals(this.f58625c, c15615b.f58625c) && Objects.equals(this.f58626d, c15615b.f58626d) && this.f58627e == c15615b.f58627e && this.f58628f == c15615b.f58628f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = (527 + this.f58623a) * 31;
        String str = this.f58624b;
        int iHashCode = (i13 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f58625c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f58626d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f58627e ? 1 : 0)) * 31) + this.f58628f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f58625c + "\", genre=\"" + this.f58624b + "\", bitrate=" + this.f58623a + ", metadataInterval=" + this.f58628f;
    }
}
