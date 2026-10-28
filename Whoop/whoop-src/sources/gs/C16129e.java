package gs;

import a33.C0352d;
import com.google.crypto.tink.internal.AbstractC5078a;
import com.google.crypto.tink.internal.C5097j0;
import com.google.crypto.tink.internal.C5117v;
import com.google.crypto.tink.internal.C5118w;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import p154fs.AbstractC14724b;
import p154fs.InterfaceC14723a;
import u00.C34377e;

/* JADX INFO: renamed from: gs.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C16129e implements InterfaceC14723a {

    /* JADX INFO: renamed from: a */
    public final C0352d f61260a;

    /* JADX INFO: renamed from: b */
    public final C34377e f61261b;

    /* JADX INFO: renamed from: c */
    public final C34377e f61262c;

    public C16129e(C0352d c0352d) {
        C34377e c34377e = AbstractC5078a.f21388h;
        this.f61260a = c0352d;
        if (!c0352d.m953z()) {
            this.f61261b = c34377e;
            this.f61262c = c34377e;
            return;
        }
        C5117v c5117vM16084a = C5118w.f21467b.m16084a();
        AbstractC5078a.m15936i(c0352d);
        c5117vM16084a.getClass();
        this.f61261b = c34377e;
        this.f61262c = c34377e;
    }

    @Override // p154fs.InterfaceC14723a
    /* JADX INFO: renamed from: a */
    public final byte[] mo5979a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        C34377e c34377e = this.f61261b;
        C0352d c0352d = this.f61260a;
        try {
            byte[] bArrMo5979a = ((InterfaceC14723a) ((C5097j0) c0352d.f1238y).f21429a).mo5979a(bArr, bArr2);
            int i13 = ((C5097j0) c0352d.f1238y).f21432d;
            int length = bArr.length;
            c34377e.getClass();
            return bArrMo5979a;
        } catch (GeneralSecurityException e5) {
            c34377e.getClass();
            throw e5;
        }
    }

    @Override // p154fs.InterfaceC14723a
    /* JADX INFO: renamed from: b */
    public final byte[] mo5980b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        C0352d c0352d = this.f61260a;
        C34377e c34377e = this.f61262c;
        if (length > 5) {
            Iterator it = c0352d.m949v(Arrays.copyOf(bArr, 5)).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrMo5980b = ((InterfaceC14723a) ((C5097j0) it.next()).f21429a).mo5980b(bArr, bArr2);
                    c34377e.getClass();
                    return bArrMo5980b;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        Iterator it3 = c0352d.m949v(AbstractC14724b.f54463a).iterator();
        while (it3.hasNext()) {
            try {
                byte[] bArrMo5980b2 = ((InterfaceC14723a) ((C5097j0) it3.next()).f21429a).mo5980b(bArr, bArr2);
                c34377e.getClass();
                return bArrMo5980b2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        c34377e.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
