package p076d;

import c13.AbstractC3855a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p001a.C0002v;
import ro.C31624i;

/* JADX INFO: renamed from: d.g */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC11285g extends AbstractC11272b1 implements InterfaceC11293j {

    /* JADX INFO: renamed from: b */
    public static final C11276d f36205b = new C11276d(0, AbstractC11285g.class);

    /* JADX INFO: renamed from: c */
    public static final char[] f36206c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public final byte[] f36207a;

    public AbstractC11285g(byte[] bArr) {
        this.f36207a = bArr;
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC11285g m30493l(byte[] bArr) {
        int length = bArr.length;
        if (length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i13 = bArr[0] & 255;
        if (i13 > 0) {
            if (i13 > 7 || length < 2) {
                throw new IllegalArgumentException("invalid pad bits detected");
            }
            byte b = bArr[length - 1];
            if (b != ((byte) ((255 << i13) & b))) {
                return new C11304o0(bArr, 0);
            }
        }
        return new C11304o0(bArr, 1);
    }

    @Override // p076d.InterfaceC11293j
    /* JADX INFO: renamed from: a */
    public final InputStream mo30494a() {
        byte[] bArr = this.f36207a;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // p076d.InterfaceC11282f
    /* JADX INFO: renamed from: b */
    public final AbstractC11272b1 mo30486b() {
        return this;
    }

    @Override // p076d.InterfaceC11293j
    /* JADX INFO: renamed from: e */
    public final int mo30495e() {
        return this.f36207a[0] & 255;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        if (!(abstractC11272b1 instanceof AbstractC11285g)) {
            return false;
        }
        byte[] bArr = ((AbstractC11285g) abstractC11272b1).f36207a;
        byte[] bArr2 = this.f36207a;
        int length = bArr2.length;
        if (bArr.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i13 = length - 1;
        for (int i14 = 0; i14 < i13; i14++) {
            if (bArr2[i14] != bArr[i14]) {
                return false;
            }
        }
        int i15 = 255 << (bArr2[0] & 255);
        return ((byte) (bArr2[i13] & i15)) == ((byte) (bArr[i13] & i15));
    }

    @Override // p076d.AbstractC11272b1
    public final int hashCode() {
        byte[] bArr = this.f36207a;
        if (bArr.length < 2) {
            return 1;
        }
        int i13 = bArr[0] & 255;
        int length = bArr.length;
        int i14 = length - 1;
        byte b = (byte) ((255 << i13) & bArr[i14]);
        while (true) {
            i14--;
            if (i14 < 0) {
                return (length * 257) ^ b;
            }
            length = (length * 257) ^ bArr[i14];
        }
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: j */
    public AbstractC11272b1 mo30476j() {
        return new C11304o0(this.f36207a, 1);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: k */
    public AbstractC11272b1 mo30477k() {
        return new C11304o0(this.f36207a, 0);
    }

    public final String toString() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mo30480f(new C31624i(byteArrayOutputStream, 19), true);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            StringBuffer stringBuffer = new StringBuffer((byteArray.length * 2) + 1);
            stringBuffer.append('#');
            for (int i13 = 0; i13 != byteArray.length; i13++) {
                byte b = byteArray[i13];
                char[] cArr = f36206c;
                stringBuffer.append(cArr[(b >>> 4) & 15]);
                stringBuffer.append(cArr[b & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e5) {
            throw new C0002v(e5, AbstractC3855a.m11824h(e5, new StringBuilder("Internal error encoding BitString: ")));
        }
    }

    public AbstractC11285g(byte[] bArr, int i13) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i13 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i13 > 7 || i13 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = (byte) i13;
        this.f36207a = bArr2;
    }
}
