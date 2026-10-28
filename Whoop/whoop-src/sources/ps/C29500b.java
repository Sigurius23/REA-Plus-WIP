package ps;

import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.cert.CertificateException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import p000.AbstractC11266d;
import p154fs.InterfaceC14723a;

/* JADX INFO: renamed from: ps.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C29500b implements InterfaceC14723a {

    /* JADX INFO: renamed from: a */
    public final SecretKey f119958a;

    public C29500b(String str) throws NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f119958a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(AbstractC11266d.m30461o("Keystore cannot load the key with ID: ", str));
        }
    }

    @Override // p154fs.InterfaceC14723a
    /* JADX INFO: renamed from: a */
    public final byte[] mo5979a(byte[] bArr, byte[] bArr2) {
        try {
            return m90132d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e5) {
            Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e5);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return m90132d(bArr, bArr2);
        }
    }

    @Override // p154fs.InterfaceC14723a
    /* JADX INFO: renamed from: b */
    public final byte[] mo5980b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        try {
            return m90131c(bArr, bArr2);
        } catch (ProviderException e5) {
            e = e5;
            Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return m90131c(bArr, bArr2);
        } catch (AEADBadTagException e13) {
            throw e13;
        } catch (GeneralSecurityException e14) {
            e = e14;
            Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e);
            Thread.sleep((int) (Math.random() * 100.0d));
            return m90131c(bArr, bArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m90131c(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.f119958a, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m90132d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.f119958a);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }
}
