package vn;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p284ko.C22629m;
import p284ko.C22630n;
import p284ko.InterfaceC22625j0;
import p284ko.InterfaceC22628l;

/* JADX INFO: renamed from: vn.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C36170a implements InterfaceC22628l {

    /* JADX INFO: renamed from: w */
    public final InterfaceC22628l f154746w;

    /* JADX INFO: renamed from: x */
    public final byte[] f154747x;

    /* JADX INFO: renamed from: y */
    public final byte[] f154748y;

    /* JADX INFO: renamed from: z */
    public CipherInputStream f154749z;

    public C36170a(InterfaceC22628l interfaceC22628l, byte[] bArr, byte[] bArr2) {
        this.f154746w = interfaceC22628l;
        this.f154747x = bArr;
        this.f154748y = bArr2;
    }

    @Override // p284ko.InterfaceC22628l
    public final void close() {
        if (this.f154749z != null) {
            this.f154749z = null;
            this.f154746w.close();
        }
    }

    @Override // p284ko.InterfaceC22628l
    public final Map getResponseHeaders() {
        return this.f154746w.getResponseHeaders();
    }

    @Override // p284ko.InterfaceC22628l
    public final Uri getUri() {
        return this.f154746w.getUri();
    }

    @Override // p284ko.InterfaceC22622i, p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) throws IOException {
        this.f154749z.getClass();
        int i15 = this.f154749z.read(bArr, i13, i14);
        if (i15 < 0) {
            return -1;
        }
        return i15;
    }

    @Override // p284ko.InterfaceC22628l
    /* JADX INFO: renamed from: y */
    public final void mo65561y(InterfaceC22625j0 interfaceC22625j0) {
        interfaceC22625j0.getClass();
        this.f154746w.mo65561y(interfaceC22625j0);
    }

    @Override // p284ko.InterfaceC22628l
    /* JADX INFO: renamed from: z */
    public final long mo65551z(C22630n c22630n) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f154747x, "AES"), new IvParameterSpec(this.f154748y));
                C22629m c22629m = new C22629m(this.f154746w, c22630n);
                this.f154749z = new CipherInputStream(c22629m, cipher);
                c22629m.m65565b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e5) {
                throw new RuntimeException(e5);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e13) {
            throw new RuntimeException(e13);
        }
    }
}
