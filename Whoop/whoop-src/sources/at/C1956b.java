package at;

import is.C20869a;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.Cipher;
import p027b3.C2364d2;
import p200hs.C17593e;

/* JADX INFO: renamed from: at.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C1956b extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7759a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        SecureRandom secureRandom;
        switch (this.f7759a) {
            case 0:
                try {
                    return (Cipher) C1977u.f7819b.f7825a.m6025a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
            case 1:
                try {
                    return (Cipher) C1977u.f7819b.f7825a.m6025a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e13) {
                    throw new IllegalStateException(e13);
                }
            case 2:
                try {
                    return (Cipher) C1977u.f7819b.f7825a.m6025a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e14) {
                    throw new IllegalStateException(e14);
                }
            case 3:
                return new C2364d2();
            case 4:
                try {
                    try {
                        try {
                            try {
                                try {
                                    secureRandom = SecureRandom.getInstance("SHA1PRNG", "GmsCore_OpenSSL");
                                } catch (GeneralSecurityException unused) {
                                    secureRandom = SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
                                }
                            } catch (GeneralSecurityException unused2) {
                                secureRandom = SecureRandom.getInstance("SHA1PRNG", (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null));
                            }
                            break;
                        } catch (GeneralSecurityException unused3) {
                            secureRandom = SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
                            break;
                        }
                        secureRandom.nextLong();
                        return secureRandom;
                    } catch (ClassNotFoundException e15) {
                        e = e15;
                        throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                    } catch (IllegalAccessException e16) {
                        e = e16;
                        throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                    } catch (IllegalArgumentException e17) {
                        e = e17;
                        throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                    } catch (NoSuchMethodException e18) {
                        e = e18;
                        throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                    } catch (InvocationTargetException e19) {
                        e = e19;
                        throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                    }
                } catch (GeneralSecurityException unused4) {
                    secureRandom = new SecureRandom();
                }
                break;
            case 5:
                return 0L;
            case 6:
                return new Random();
            case 7:
                try {
                    Cipher cipher = (Cipher) C1977u.f7819b.f7825a.m6025a("ChaCha20-Poly1305");
                    if (C17593e.m50102c(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException unused5) {
                    return null;
                }
            case 8:
                try {
                    return (Cipher) C1977u.f7819b.f7825a.m6025a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e22) {
                    throw new IllegalStateException(e22);
                }
            case 9:
                try {
                    Cipher cipher2 = (Cipher) C1977u.f7819b.f7825a.m6025a("AES/GCM-SIV/NoPadding");
                    if (C20869a.m57650c(cipher2)) {
                        return cipher2;
                    }
                    return null;
                } catch (GeneralSecurityException e24) {
                    throw new IllegalStateException(e24);
                }
            default:
                return Boolean.FALSE;
        }
    }
}
