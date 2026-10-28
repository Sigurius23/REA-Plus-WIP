package p027b3;

import android.os.Parcel;
import android.util.Base64;
import p208i2.C17919x;
import p636y3.C39183o;
import p636y3.C39184p;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: b3.b2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2354b2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9306a;

    /* JADX INFO: renamed from: b */
    public Parcel f9307b;

    public /* synthetic */ C2354b2(int i13) {
        this.f9306a = i13;
    }

    /* JADX INFO: renamed from: a */
    public long m7273a() {
        int i13 = C17919x.f69638o;
        long j7 = this.f9307b.readLong();
        long j13 = 63 & j7;
        return j13 < 16 ? j7 : (j7 & (-64)) | (j13 + 1);
    }

    /* JADX INFO: renamed from: b */
    public long m7274b() {
        long j7;
        Parcel parcel = this.f9307b;
        byte b = parcel.readByte();
        if (b == 1) {
            j7 = 4294967296L;
        } else {
            j7 = b == 2 ? 8589934592L : 0L;
        }
        return C39184p.m124808a(j7, 0L) ? C39183o.f168428c : AbstractC35745c.m113248j(parcel.readFloat(), j7);
    }

    /* JADX INFO: renamed from: c */
    public void m7275c(byte b) {
        switch (this.f9306a) {
            case 0:
                this.f9307b.writeByte(b);
                break;
            default:
                this.f9307b.writeByte(b);
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m7276d(float f13) {
        switch (this.f9306a) {
            case 0:
                this.f9307b.writeFloat(f13);
                break;
            default:
                this.f9307b.writeFloat(f13);
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m7277e(long j7) {
        switch (this.f9306a) {
            case 0:
                long jM124804b = C39183o.m124804b(j7);
                byte b = 0;
                if (!C39184p.m124808a(jM124804b, 0L)) {
                    if (C39184p.m124808a(jM124804b, 4294967296L)) {
                        b = 1;
                    } else if (C39184p.m124808a(jM124804b, 8589934592L)) {
                        b = 2;
                    }
                }
                m7275c(b);
                if (!C39184p.m124808a(C39183o.m124804b(j7), 0L)) {
                    m7276d(C39183o.m124805c(j7));
                }
                break;
            default:
                long jM124804b2 = C39183o.m124804b(j7);
                byte b6 = 0;
                if (!C39184p.m124808a(jM124804b2, 0L)) {
                    if (C39184p.m124808a(jM124804b2, 4294967296L)) {
                        b6 = 1;
                    } else if (C39184p.m124808a(jM124804b2, 8589934592L)) {
                        b6 = 2;
                    }
                }
                m7275c(b6);
                if (!C39184p.m124808a(C39183o.m124804b(j7), 0L)) {
                    m7276d(C39183o.m124805c(j7));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m7278f(long j7) {
        long j13 = 63 & j7;
        if (Long.compareUnsigned(j13, 16L) >= 0) {
            j7 = (j7 & (-64)) | (j13 - 1);
        }
        this.f9307b.writeLong(j7);
    }

    public C2354b2(String str) {
        this.f9306a = 1;
        Parcel parcelObtain = Parcel.obtain();
        this.f9307b = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }
}
