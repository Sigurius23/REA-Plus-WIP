package p263jw;

import com.nimbusds.jose.JOSEException;
import gw.C16255f;
import gw.C16258i;
import gw.C16262m;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Collection;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import kw.C22847a;
import p031b9.AbstractC2875y;
import p350nw.AbstractC27182c;
import p350nw.C27180a;
import p470rv.AbstractC31834n;
import p477s2.AbstractC32069a;
import p628xw.AbstractC38676f;

/* JADX INFO: renamed from: jw.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC21979e {

    /* JADX INFO: renamed from: a */
    public static final byte[] f85112a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final byte[] f85113b = {0, 0, 0, 0};

    /* JADX INFO: renamed from: c */
    public static final byte[] f85114c = {69, 110, 99, 114, 121, 112, 116, 105, 111, 110};

    /* JADX INFO: renamed from: d */
    public static final byte[] f85115d = {73, 110, 116, 101, 103, 114, 105, 116, 121};

    /* JADX INFO: renamed from: a */
    public static byte[] m62751a(String str, SecretKey secretKey, byte[] bArr, Provider provider) throws JOSEException {
        try {
            Mac mac = provider != null ? Mac.getInstance(str, provider) : Mac.getInstance(str);
            mac.init(secretKey);
            mac.update(bArr);
            return mac.doFinal();
        } catch (InvalidKeyException e5) {
            throw new JOSEException("Invalid HMAC key: " + e5.getMessage(), e5);
        } catch (NoSuchAlgorithmException e13) {
            throw new JOSEException("Unsupported HMAC algorithm: " + e13.getMessage(), e13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Cipher m62752b(SecretKeySpec secretKeySpec, boolean z4, byte[] bArr, Provider provider) throws JOSEException {
        try {
            Cipher cipher = provider == null ? Cipher.getInstance("AES/CBC/PKCS5Padding") : Cipher.getInstance("AES/CBC/PKCS5Padding", provider);
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(secretKeySpec.getEncoded(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            if (z4) {
                cipher.init(1, secretKeySpec2, ivParameterSpec);
                return cipher;
            }
            cipher.init(2, secretKeySpec2, ivParameterSpec);
            return cipher;
        } catch (Exception e5) {
            throw new JOSEException(e5.getMessage(), e5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static SecretKeySpec m62753c(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws JOSEException {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
            try {
                keyAgreement.init(eCPrivateKey);
                keyAgreement.doPhase(eCPublicKey, true);
                return new SecretKeySpec(keyAgreement.generateSecret(), "AES");
            } catch (InvalidKeyException e5) {
                throw new JOSEException("Invalid key for ECDH key agreement: " + e5.getMessage(), e5);
            }
        } catch (NoSuchAlgorithmException e13) {
            throw new JOSEException("Couldn't get an ECDH key agreement instance: " + e13.getMessage(), e13);
        }
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m62754d(RSAPublicKey rSAPublicKey, SecretKey secretKey, int i13, C22847a c22847a, Provider provider) throws JOSEException {
        MGF1ParameterSpec mGF1ParameterSpec;
        String str;
        String str2;
        if (256 == i13) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
            str = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
            str2 = "SHA-256";
        } else if (384 == i13) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
            str = "RSA/ECB/OAEPWithSHA-384AndMGF1Padding";
            str2 = "SHA-384";
        } else {
            if (512 != i13) {
                throw new JOSEException(AbstractC2875y.m8295h(i13, "Unsupported SHA-2 bit size: "));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
            str = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding";
            str2 = "SHA-512";
        }
        try {
            AlgorithmParameters algorithmParameters = provider == null ? AlgorithmParameters.getInstance("OAEP") : AlgorithmParameters.getInstance("OAEP", provider);
            algorithmParameters.init(new OAEPParameterSpec(str2, "MGF1", mGF1ParameterSpec, PSource.PSpecified.DEFAULT));
            Cipher cipher = provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            cipher.init(c22847a.f90078a, rSAPublicKey, algorithmParameters);
            return c22847a == C22847a.f90076c ? cipher.wrap(secretKey) : cipher.doFinal(secretKey.getEncoded());
        } catch (InvalidKeyException e5) {
            throw new JOSEException(AbstractC2875y.m8296i(i13, "Encryption failed due to invalid RSA key for SHA-", ": The RSA key may be too short, use a longer key"), e5);
        } catch (Exception e13) {
            throw new JOSEException(e13.getMessage(), e13);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m62755e(byte[] bArr, C16262m c16262m) throws JOSEException {
        for (byte b : bArr) {
            if (b != 0) {
                Set setM81761a = C27180a.m81761a(c16262m);
                if (setM81761a == null || setM81761a.size() > 1) {
                    throw new JOSEException("Unsupported JWS algorithm: " + c16262m);
                }
                C27180a c27180a = (C27180a) setM81761a.iterator().next();
                ECParameterSpec eCParameterSpecM81769a = AbstractC27182c.m81769a(c27180a);
                if (eCParameterSpecM81769a == null) {
                    throw new JOSEException("Unsupported curve: " + c27180a);
                }
                int iM62757g = m62757g(c16262m);
                if (m62757g(c16262m) != bArr.length) {
                    throw new JOSEException("Illegal signature length");
                }
                int i13 = iM62757g / 2;
                BigInteger bigInteger = new BigInteger(1, AbstractC31834n.m98903l(bArr, 0, i13));
                BigInteger bigInteger2 = new BigInteger(1, AbstractC31834n.m98903l(bArr, i13, i13));
                BigInteger bigInteger3 = BigInteger.ZERO;
                if (bigInteger2.equals(bigInteger3) || bigInteger.equals(bigInteger3)) {
                    throw new JOSEException("S and R must not be 0");
                }
                BigInteger order = eCParameterSpecM81769a.getOrder();
                if (order.compareTo(bigInteger) < 1 || order.compareTo(bigInteger2) < 1) {
                    throw new JOSEException("S and R must not exceed N");
                }
                if (bigInteger.mod(order).equals(bigInteger3) || bigInteger2.mod(order).equals(bigInteger3)) {
                    throw new JOSEException("R or S mod N != 0 check failed");
                }
                return;
            }
        }
        throw new JOSEException("Blank signature");
    }

    /* JADX INFO: renamed from: f */
    public static SecretKeySpec m62756f(SecretKey secretKey, C16255f c16255f, byte[] bArr, byte[] bArr2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f85112a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(AbstractC32069a.m99659A(length));
            byteArrayOutputStream.write(c16255f.f61776w.getBytes(AbstractC38676f.f166480a));
            byte[] bArr3 = f85113b;
            if (bArr != null) {
                byteArrayOutputStream.write(AbstractC32069a.m99659A(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(bArr3);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(AbstractC32069a.m99659A(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(bArr3);
            }
            byteArrayOutputStream.write(f85115d);
            try {
                return new SecretKeySpec(MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray()), AbstractC2875y.m8295h(length, "HMACSHA"));
            } catch (NoSuchAlgorithmException e5) {
                throw new JOSEException(e5.getMessage(), e5);
            }
        } catch (IOException e13) {
            throw new JOSEException(e13.getMessage(), e13);
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m62757g(C16262m c16262m) throws JOSEException {
        if (c16262m.equals(C16262m.f61853I) || c16262m.equals(C16262m.f61854J)) {
            return 64;
        }
        if (c16262m.equals(C16262m.f61855K)) {
            return 96;
        }
        if (c16262m.equals(C16262m.f61856L)) {
            return 132;
        }
        throw new JOSEException(m62763m(c16262m, AbstractC21978d.f85111d));
    }

    /* JADX INFO: renamed from: h */
    public static Signature m62758h(String str, Provider provider, PSSParameterSpec pSSParameterSpec) throws JOSEException {
        try {
            Signature signature = provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str);
            if (pSSParameterSpec == null) {
                return signature;
            }
            try {
                signature.setParameter(pSSParameterSpec);
                return signature;
            } catch (InvalidAlgorithmParameterException e5) {
                throw new JOSEException("Invalid RSASSA-PSS salt length parameter: " + e5.getMessage(), e5);
            }
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m62759i(Collection collection) {
        StringBuilder sb4 = new StringBuilder();
        Object[] array = collection.toArray();
        for (int i13 = 0; i13 < array.length; i13++) {
            if (i13 != 0) {
                if (i13 < array.length - 1) {
                    sb4.append(", ");
                } else if (i13 == array.length - 1) {
                    sb4.append(" or ");
                }
            }
            sb4.append(array[i13].toString());
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m62760j(byte[] bArr) throws Exception {
        byte[] bArr2;
        try {
            int length = bArr.length / 2;
            int i13 = length;
            while (i13 > 0 && bArr[length - i13] == 0) {
                i13--;
            }
            int i14 = length - i13;
            int i15 = bArr[i14] < 0 ? i13 + 1 : i13;
            int i16 = length;
            while (i16 > 0 && bArr[(length * 2) - i16] == 0) {
                i16--;
            }
            int i17 = (length * 2) - i16;
            int i18 = bArr[i17] < 0 ? i16 + 1 : i16;
            int i19 = i15 + 4 + i18;
            if (i19 > 255) {
                throw new JOSEException("Invalid ECDSA signature format");
            }
            int i24 = 1;
            if (i19 < 128) {
                bArr2 = new byte[i15 + 6 + i18];
            } else {
                bArr2 = new byte[i15 + 7 + i18];
                bArr2[1] = -127;
                i24 = 2;
            }
            bArr2[0] = 48;
            bArr2[i24] = (byte) i19;
            bArr2[i24 + 1] = 2;
            bArr2[i24 + 2] = (byte) i15;
            int i25 = i24 + 3 + i15;
            System.arraycopy(bArr, i14, bArr2, i25 - i13, i13);
            bArr2[i25] = 2;
            bArr2[i25 + 1] = (byte) i18;
            System.arraycopy(bArr, i17, bArr2, ((i25 + 2) + i18) - i16, i16);
            return bArr2;
        } catch (Exception e5) {
            if (e5 instanceof JOSEException) {
                throw e5;
            }
            throw new JOSEException(e5.getMessage(), e5);
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m62761k(C16255f c16255f, Collection collection) {
        return "Unsupported JWE encryption method " + c16255f + ", must be " + m62759i(collection);
    }

    /* JADX INFO: renamed from: l */
    public static String m62762l(C16258i c16258i, Collection collection) {
        return "Unsupported JWE algorithm " + c16258i + ", must be " + m62759i(collection);
    }

    /* JADX INFO: renamed from: m */
    public static String m62763m(C16262m c16262m, Collection collection) {
        return "Unsupported JWS algorithm " + c16262m + ", must be " + m62759i(collection);
    }
}
