package p674z8;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import p000.AbstractC11266d;
import p607x8.AbstractC38065t;
import r80.AbstractC31061c;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: z8.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C40168d extends AbstractC40166b {

    /* JADX INFO: renamed from: E */
    public C40171g f173338E;

    /* JADX INFO: renamed from: F */
    public byte[] f173339F;

    /* JADX INFO: renamed from: G */
    public int f173340G;

    /* JADX INFO: renamed from: H */
    public int f173341H;

    @Override // p674z8.InterfaceC40170f
    public final void close() {
        if (this.f173339F != null) {
            this.f173339F = null;
            m128884b();
        }
        this.f173338E = null;
    }

    @Override // p674z8.InterfaceC40170f
    public final Uri getUri() {
        C40171g c40171g = this.f173338E;
        if (c40171g != null) {
            return c40171g.f173343a;
        }
        return null;
    }

    @Override // p674z8.InterfaceC40170f
    public final long open(C40171g c40171g) throws ParserException, DataSourceException {
        m128885d();
        this.f173338E = c40171g;
        Uri uri = c40171g.f173343a;
        long j7 = c40171g.f173348f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC35849g.m113803e("data".equals(scheme), "Unsupported scheme: " + scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i13 = AbstractC38065t.f163031a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException(AbstractC31061c.m95637m(uriNormalizeScheme, "Unexpected URI format: "), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f173339F = Base64.decode(str, 0);
            } catch (IllegalArgumentException e5) {
                throw new ParserException(AbstractC11266d.m30461o("Error while parsing Base64 encoded string: ", str), e5, true, 0);
            }
        } else {
            this.f173339F = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j13 = c40171g.f173347e;
        byte[] bArr = this.f173339F;
        if (j13 > bArr.length) {
            this.f173339F = null;
            throw new DataSourceException(2008);
        }
        int i14 = (int) j13;
        this.f173340G = i14;
        int length = bArr.length - i14;
        this.f173341H = length;
        if (j7 != -1) {
            this.f173341H = (int) Math.min(length, j7);
        }
        m128886h(c40171g);
        return j7 != -1 ? j7 : this.f173341H;
    }

    @Override // p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        int i15 = this.f173341H;
        if (i15 == 0) {
            return -1;
        }
        int iMin = Math.min(i14, i15);
        byte[] bArr2 = this.f173339F;
        int i16 = AbstractC38065t.f163031a;
        System.arraycopy(bArr2, this.f173340G, bArr, i13, iMin);
        this.f173340G += iMin;
        this.f173341H -= iMin;
        m128883a(iMin);
        return iMin;
    }
}
