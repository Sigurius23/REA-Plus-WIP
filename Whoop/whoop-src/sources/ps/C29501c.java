package ps;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import at.AbstractC1959c0;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import se.AbstractC32411b;

/* JADX INFO: renamed from: ps.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C29501c {

    /* JADX INFO: renamed from: a */
    public static final Object f119959a = new Object();

    /* JADX INFO: renamed from: a */
    public static boolean m90133a(String str) {
        synchronized (f119959a) {
            try {
                if (m90135d(str)) {
                    return false;
                }
                m90134b(str);
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m90134b(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strM5972b = AbstractC1959c0.m5972b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strM5972b, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m90135d(String str) {
        boolean zContainsAlias;
        String strM5972b = AbstractC1959c0.m5972b(str);
        try {
            synchronized (f119959a) {
                try {
                    try {
                        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                        keyStore.load(null);
                        zContainsAlias = keyStore.containsAlias(strM5972b);
                    } catch (IOException e5) {
                        throw new GeneralSecurityException(e5);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return zContainsAlias;
        } catch (NullPointerException unused) {
            Log.w("c", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                Thread.sleep((int) (Math.random() * 40.0d));
            } catch (InterruptedException unused2) {
            }
            synchronized (f119959a) {
                try {
                    try {
                        KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
                        keyStore2.load(null);
                        return keyStore2.containsAlias(strM5972b);
                    } catch (IOException e13) {
                        throw new GeneralSecurityException(e13);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C29500b m90136c(String str) throws GeneralSecurityException {
        C29500b c29500b;
        try {
            synchronized (f119959a) {
                try {
                    c29500b = new C29500b(AbstractC1959c0.m5972b(str));
                    byte[] bArrM101079W = AbstractC32411b.m101079W(10);
                    byte[] bArr = new byte[0];
                    if (!Arrays.equals(bArrM101079W, c29500b.mo5980b(c29500b.mo5979a(bArrM101079W, bArr), bArr))) {
                        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return c29500b;
        } catch (IOException e5) {
            throw new GeneralSecurityException(e5);
        }
    }
}
