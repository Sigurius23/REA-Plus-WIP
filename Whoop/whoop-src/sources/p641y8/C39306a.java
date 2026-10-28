package p641y8;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Arrays;
import p000.AbstractC11266d;
import p087db.C11856j0;
import p516u8.InterfaceC34583b0;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import r80.AbstractC31061c;
import rs.AbstractC31780b;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: y8.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C39306a implements InterfaceC34583b0 {

    /* JADX INFO: renamed from: a */
    public final String f169105a;

    /* JADX INFO: renamed from: b */
    public final byte[] f169106b;

    /* JADX INFO: renamed from: c */
    public final int f169107c;

    /* JADX INFO: renamed from: d */
    public final int f169108d;

    public C39306a(String str, byte[] bArr, int i13, int i14) {
        byte b;
        str.getClass();
        boolean z4 = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i14 == 23 && bArr.length == 4) {
                    z4 = true;
                }
                AbstractC35849g.m113802d(z4);
                break;
            case "auxiliary.tracks.interleaved":
                if (i14 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z4 = true;
                }
                AbstractC35849g.m113802d(z4);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i14 == 78 && bArr.length == 8) {
                    z4 = true;
                }
                AbstractC35849g.m113802d(z4);
                break;
            case "auxiliary.tracks.map":
                AbstractC35849g.m113802d(i14 == 0);
                break;
        }
        this.f169105a = str;
        this.f169106b = bArr;
        this.f169107c = i13;
        this.f169108d = i14;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m125271b() {
        AbstractC35849g.m113806h("Metadata is not an auxiliary tracks map", this.f169105a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f169106b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < b; i13++) {
            arrayList.add(Integer.valueOf(bArr[i13 + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C39306a.class == obj.getClass()) {
            C39306a c39306a = (C39306a) obj;
            if (this.f169105a.equals(c39306a.f169105a) && Arrays.equals(this.f169106b, c39306a.f169106b) && this.f169107c == c39306a.f169107c && this.f169108d == c39306a.f169108d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f169106b) + AbstractC11266d.m30450d(527, 31, this.f169105a)) * 31) + this.f169107c) * 31) + this.f169108d;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f1 A[LOOP:0: B:40:0x00ee->B:42:0x00f1, LOOP_END] */
    public final String toString() {
        String string;
        StringBuilder sb4;
        String str = this.f169105a;
        byte[] bArr = this.f169106b;
        int i13 = this.f169108d;
        if (i13 != 0) {
            if (i13 == 1) {
                string = AbstractC38065t.m121921n(bArr);
            } else if (i13 == 23) {
                boolean z4 = bArr.length >= 4;
                int length = bArr.length;
                if (!z4) {
                    throw new IllegalArgumentException(AbstractC31780b.m98690k("array too small: %s < %s", Integer.valueOf(length), 4));
                }
                string = String.valueOf(Float.intBitsToFloat((bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)));
            } else if (i13 == 67) {
                boolean z13 = bArr.length >= 4;
                int length2 = bArr.length;
                if (!z13) {
                    throw new IllegalArgumentException(AbstractC31780b.m98690k("array too small: %s < %s", Integer.valueOf(length2), 4));
                }
                string = String.valueOf((bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255));
            } else if (i13 == 75) {
                string = String.valueOf(Byte.toUnsignedInt(bArr[0]));
            } else if (i13 != 78) {
                int i14 = AbstractC38065t.f163031a;
                sb4 = new StringBuilder(bArr.length * 2);
                for (int i15 = 0; i15 < bArr.length; i15++) {
                    sb4.append(Character.forDigit((bArr[i15] >> 4) & 15, 16));
                    sb4.append(Character.forDigit(bArr[i15] & 15, 16));
                }
                string = sb4.toString();
            } else {
                string = String.valueOf(new C38059n(bArr).m121872y());
            }
        } else if (str.equals("auxiliary.tracks.map")) {
            ArrayList arrayListM125271b = m125271b();
            StringBuilder sbM53374o = AbstractC18489d0.m53374o("track types = ");
            new C11856j0(String.valueOf(DateTimeRange.lowerUpperDelimiter), 15).m31819c(sbM53374o, arrayListM125271b.iterator());
            string = sbM53374o.toString();
        } else {
            int i16 = AbstractC38065t.f163031a;
            sb4 = new StringBuilder(bArr.length * 2);
            while (i15 < bArr.length) {
                sb4.append(Character.forDigit((bArr[i15] >> 4) & 15, 16));
                sb4.append(Character.forDigit(bArr[i15] & 15, 16));
            }
            string = sb4.toString();
        }
        return AbstractC31061c.m95640p("mdta: key=", str, ", value=", string);
    }
}
