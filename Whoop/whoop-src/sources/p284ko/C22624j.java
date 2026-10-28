package p284ko;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.net.URLDecoder;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p658yr.AbstractC39717d;

/* JADX INFO: renamed from: ko.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C22624j extends AbstractC22616f {

    /* JADX INFO: renamed from: E */
    public C22630n f88999E;

    /* JADX INFO: renamed from: F */
    public byte[] f89000F;

    /* JADX INFO: renamed from: G */
    public int f89001G;

    /* JADX INFO: renamed from: H */
    public int f89002H;

    @Override // p284ko.InterfaceC22628l
    public final void close() {
        if (this.f89000F != null) {
            this.f89000F = null;
            m65558b();
        }
        this.f88999E = null;
    }

    @Override // p284ko.InterfaceC22628l
    public final Uri getUri() {
        C22630n c22630n = this.f88999E;
        if (c22630n != null) {
            return c22630n.f89019a;
        }
        return null;
    }

    @Override // p284ko.InterfaceC22622i, p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        int i15 = this.f89002H;
        if (i15 == 0) {
            return -1;
        }
        int iMin = Math.min(i14, i15);
        byte[] bArr2 = this.f89000F;
        int i16 = AbstractC24567y.f95875a;
        System.arraycopy(bArr2, this.f89001G, bArr, i13, iMin);
        this.f89001G += iMin;
        this.f89002H -= iMin;
        m65557a(iMin);
        return iMin;
    }

    @Override // p284ko.InterfaceC22628l
    /* JADX INFO: renamed from: z */
    public final long mo65551z(C22630n c22630n) throws DataSourceException, ParserException {
        m65559d();
        this.f88999E = c22630n;
        Uri uri = c22630n.f89019a;
        long j7 = c22630n.f89024f;
        String scheme = uri.getScheme();
        boolean zEquals = "data".equals(scheme);
        String strValueOf = String.valueOf(scheme);
        AbstractC24543a.m71570f(zEquals, strValueOf.length() != 0 ? "Unsupported scheme: ".concat(strValueOf) : new String("Unsupported scheme: "));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i13 = AbstractC24567y.f95875a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            String strValueOf2 = String.valueOf(uri);
            StringBuilder sb4 = new StringBuilder(strValueOf2.length() + 23);
            sb4.append("Unexpected URI format: ");
            sb4.append(strValueOf2);
            throw new ParserException(sb4.toString(), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f89000F = Base64.decode(str, 0);
            } catch (IllegalArgumentException e5) {
                String strValueOf3 = String.valueOf(str);
                throw new ParserException(strValueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(strValueOf3) : new String("Error while parsing Base64 encoded string: "), e5, true, 0);
            }
        } else {
            this.f89000F = URLDecoder.decode(str, AbstractC39717d.f170956a.name()).getBytes(AbstractC39717d.f170958c);
        }
        long j13 = c22630n.f89023e;
        byte[] bArr = this.f89000F;
        if (j13 > bArr.length) {
            this.f89000F = null;
            throw new DataSourceException(2008);
        }
        int i14 = (int) j13;
        this.f89001G = i14;
        int length = bArr.length - i14;
        this.f89002H = length;
        if (j7 != -1) {
            this.f89002H = (int) Math.min(length, j7);
        }
        m65560h(c22630n);
        return j7 != -1 ? j7 : this.f89002H;
    }
}
