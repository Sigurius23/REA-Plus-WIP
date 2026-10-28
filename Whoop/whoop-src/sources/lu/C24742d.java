package lu;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: lu.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C24742d extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f96755w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Closeable f96756x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24742d(Closeable closeable, int i13, int i14) {
        super(i13);
        this.f96755w = i14;
        this.f96756x = closeable;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        switch (this.f96755w) {
            case 0:
                int i13 = ((ByteArrayOutputStream) this).count;
                if (i13 > 0 && ((ByteArrayOutputStream) this).buf[i13 - 1] == 13) {
                    i13--;
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i13, ((C24743e) this.f96756x).f96761y.name());
                } catch (UnsupportedEncodingException e5) {
                    throw new AssertionError(e5);
                }
            default:
                int i14 = ((ByteArrayOutputStream) this).count;
                if (i14 > 0 && ((ByteArrayOutputStream) this).buf[i14 - 1] == 13) {
                    i14--;
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i14, ((C24743e) this.f96756x).f96761y.name());
                } catch (UnsupportedEncodingException e13) {
                    throw new AssertionError(e13);
                }
        }
    }
}
