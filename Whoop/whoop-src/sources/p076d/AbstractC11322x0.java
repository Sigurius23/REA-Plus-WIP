package p076d;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import p031b9.AbstractC2875y;
import p039c.C3720d;
import p508ty.C34249c;
import p582wg.AbstractC37250c;
import p614xg.AbstractC38268b;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: d.x0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC11322x0 extends AbstractC11272b1 implements InterfaceC11269a1 {

    /* JADX INFO: renamed from: b */
    public static final C11276d f36275b = new C11276d(1, AbstractC11322x0.class);

    /* JADX INFO: renamed from: c */
    public static final byte[] f36276c = new byte[0];

    /* JADX INFO: renamed from: a */
    public final byte[] f36277a;

    public AbstractC11322x0(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f36277a = bArr;
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC11322x0 m30532l(InterfaceC11307q interfaceC11307q) {
        if (interfaceC11307q == null || (interfaceC11307q instanceof AbstractC11322x0)) {
            return (AbstractC11322x0) interfaceC11307q;
        }
        AbstractC11272b1 abstractC11272b1Mo30482d = interfaceC11307q.mo30482d();
        if (abstractC11272b1Mo30482d instanceof AbstractC11322x0) {
            return (AbstractC11322x0) abstractC11272b1Mo30482d;
        }
        throw new IllegalArgumentException("illegal object in getInstance: ".concat(interfaceC11307q.getClass().getName()));
    }

    @Override // p076d.InterfaceC11282f
    /* JADX INFO: renamed from: b */
    public final AbstractC11272b1 mo30486b() {
        return this;
    }

    @Override // p076d.InterfaceC11269a1
    /* JADX INFO: renamed from: c */
    public final InputStream mo30481c() {
        return new ByteArrayInputStream(this.f36277a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        if (abstractC11272b1 instanceof AbstractC11322x0) {
            return Arrays.equals(this.f36277a, ((AbstractC11322x0) abstractC11272b1).f36277a);
        }
        return false;
    }

    @Override // p076d.AbstractC11272b1
    public final int hashCode() {
        return AbstractC32103e.m99883e(this.f36277a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: j */
    public AbstractC11272b1 mo30476j() {
        return new C11297l(this.f36277a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: k */
    public AbstractC11272b1 mo30477k() {
        return new C11297l(this.f36277a);
    }

    public final String toString() {
        C34249c c34249c = AbstractC38268b.f164068a;
        byte[] bArr = this.f36277a;
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C34249c c34249c2 = AbstractC38268b.f164068a;
            c34249c2.getClass();
            if (length >= 0) {
                byte[] bArr2 = new byte[72];
                int i13 = 0;
                while (length > 0) {
                    int iMin = Math.min(36, length);
                    int i14 = i13 + iMin;
                    int i15 = 0;
                    while (i13 < i14) {
                        int i16 = i13 + 1;
                        byte b = bArr[i13];
                        int i17 = i15 + 1;
                        byte[] bArr3 = (byte[]) c34249c2.f143660x;
                        bArr2[i15] = bArr3[(b & 255) >>> 4];
                        i15 += 2;
                        bArr2[i17] = bArr3[b & 15];
                        i13 = i16;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i15);
                    length -= iMin;
                    i13 = i14;
                }
            }
            return "#".concat(AbstractC37250c.m119389a(byteArrayOutputStream.toByteArray()));
        } catch (Exception e5) {
            throw new C3720d(e5, AbstractC2875y.m8298k(e5, new StringBuilder("exception encoding Hex string: ")));
        }
    }
}
