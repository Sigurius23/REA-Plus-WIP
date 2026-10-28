package p263jw;

import at.C1961e;
import b30.C2570m;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.util.IntegerOverflowException;
import gw.C16253d;
import gw.C16255f;
import gw.C16260k;
import ih0.AbstractC18489d0;
import io.sentry.internal.debugmeta.C20378c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import mw.C25972a;
import p031b9.AbstractC2875y;
import p200hs.C17598j;
import p470rv.AbstractC31834n;
import p474s.AbstractC32004s;
import p477s2.AbstractC32069a;
import p550vd.AbstractC35903f;
import p628xw.AbstractC38676f;
import p628xw.C38672b;
import p628xw.C38675e;
import se.AbstractC32411b;

/* JADX INFO: renamed from: jw.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC21976b {

    /* JADX INFO: renamed from: a */
    public static final Set f85108a;

    /* JADX INFO: renamed from: b */
    public static final Map f85109b;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C16255f c16255f = C16255f.f61802z;
        linkedHashSet.add(c16255f);
        C16255f c16255f2 = C16255f.f61794E;
        linkedHashSet.add(c16255f2);
        C16255f c16255f3 = C16255f.f61795F;
        linkedHashSet.add(c16255f3);
        C16255f c16255f4 = C16255f.f61798I;
        linkedHashSet.add(c16255f4);
        C16255f c16255f5 = C16255f.f61799J;
        linkedHashSet.add(c16255f5);
        C16255f c16255f6 = C16255f.f61800K;
        linkedHashSet.add(c16255f6);
        C16255f c16255f7 = C16255f.f61796G;
        linkedHashSet.add(c16255f7);
        C16255f c16255f8 = C16255f.f61797H;
        linkedHashSet.add(c16255f8);
        C16255f c16255f9 = C16255f.f61801L;
        linkedHashSet.add(c16255f9);
        f85108a = Collections.unmodifiableSet(linkedHashSet);
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(c16255f4);
        hashSet2.add(c16255f5);
        hashSet3.add(c16255f6);
        hashSet3.add(c16255f);
        hashSet3.add(c16255f7);
        hashSet3.add(c16255f9);
        hashSet4.add(c16255f2);
        hashSet5.add(c16255f3);
        hashSet5.add(c16255f8);
        map.put(128, Collections.unmodifiableSet(hashSet));
        map.put(192, Collections.unmodifiableSet(hashSet2));
        map.put(256, Collections.unmodifiableSet(hashSet3));
        map.put(384, Collections.unmodifiableSet(hashSet4));
        map.put(512, Collections.unmodifiableSet(hashSet5));
        f85109b = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: a */
    public static void m62748a(SecretKey secretKey, C16255f c16255f) throws KeyLengthException {
        int i13;
        try {
            byte[] encoded = secretKey.getEncoded();
            if (encoded == null) {
                i13 = 0;
            } else {
                long length = ((long) encoded.length) * 8;
                i13 = (int) length;
                if (i13 != length) {
                    throw new IntegerOverflowException();
                }
            }
            if (i13 == 0 || c16255f.f61803y == i13) {
                return;
            }
            StringBuilder sb4 = new StringBuilder("The Content Encryption Key (CEK) length for ");
            sb4.append(c16255f);
            sb4.append(" must be ");
            throw new KeyLengthException(AbstractC18489d0.m53371l(sb4, c16255f.f61803y, " bits"));
        } catch (IntegerOverflowException e5) {
            throw new KeyLengthException("The Content Encryption Key (CEK) is too long: " + e5.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x029c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0208  */
    /* JADX WARN: Code duplicated, block: B:82:0x0247  */
    /* JADX WARN: Code duplicated, block: B:99:0x0294  */
    /* JADX INFO: renamed from: b */
    public static byte[] m62749b(C16260k c16260k, byte[] bArr, C38672b c38672b, C38672b c38672b2, C38672b c38672b3, SecretKey secretKey, C25972a c25972a) throws JOSEException {
        SecretKeySpec secretKeySpec;
        SecretKeySpec secretKeySpec2;
        int i13;
        SecretKeySpec secretKeySpec3;
        long length;
        long j7;
        byte[] bArrArray;
        byte[] bArrDoFinal;
        if (bArr == null) {
            return m62749b(c16260k, c16260k.m46075a().f166476w.getBytes(StandardCharsets.US_ASCII), c38672b, c38672b2, c38672b3, secretKey, c25972a);
        }
        C16255f c16255f = c16260k.f61830O;
        m62748a(secretKey, c16255f);
        if (c16255f.equals(C16255f.f61802z) || c16255f.equals(C16255f.f61794E) || c16255f.equals(C16255f.f61795F)) {
            byte[] bArrM124047a = c38672b.m124047a();
            byte[] bArrM124047a2 = c38672b2.m124047a();
            byte[] bArrM124047a3 = c38672b3.m124047a();
            Provider provider = (Provider) c25972a.f93280x;
            byte[] encoded = secretKey.getEncoded();
            int i14 = 32;
            if (encoded.length == 32) {
                i13 = 16;
                secretKeySpec = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
                secretKeySpec3 = new SecretKeySpec(encoded, 16, 16, "AES");
            } else {
                if (encoded.length == 48) {
                    i13 = 24;
                    secretKeySpec = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
                    secretKeySpec3 = new SecretKeySpec(encoded, 24, 24, "AES");
                } else {
                    if (encoded.length != 64) {
                        throw new KeyLengthException("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
                    }
                    secretKeySpec = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
                    secretKeySpec2 = new SecretKeySpec(encoded, 32, 32, "AES");
                }
                length = ((long) bArr.length) * 8;
                j7 = (int) length;
                if (j7 == length) {
                    throw new IntegerOverflowException();
                }
                bArrArray = ByteBuffer.allocate(8).putLong(j7).array();
                if (AbstractC35903f.m114013h(Arrays.copyOf(AbstractC21979e.m62751a(secretKeySpec.getAlgorithm(), secretKeySpec, ByteBuffer.allocate(bArr.length + bArrM124047a.length + bArrM124047a2.length + bArrArray.length).put(bArr).put(bArrM124047a).put(bArrM124047a2).put(bArrArray).array(), provider), i14), bArrM124047a3)) {
                    throw new JOSEException("MAC check failed");
                }
                try {
                    bArrDoFinal = AbstractC21979e.m62752b(secretKeySpec2, false, bArrM124047a, provider).doFinal(bArrM124047a2);
                } catch (Exception e5) {
                    throw new JOSEException(e5.getMessage(), e5);
                }
            }
            int i15 = i13;
            secretKeySpec2 = secretKeySpec3;
            i14 = i15;
            length = ((long) bArr.length) * 8;
            j7 = (int) length;
            if (j7 == length) {
                throw new IntegerOverflowException();
            }
            bArrArray = ByteBuffer.allocate(8).putLong(j7).array();
            if (AbstractC35903f.m114013h(Arrays.copyOf(AbstractC21979e.m62751a(secretKeySpec.getAlgorithm(), secretKeySpec, ByteBuffer.allocate(bArr.length + bArrM124047a.length + bArrM124047a2.length + bArrArray.length).put(bArr).put(bArrM124047a).put(bArrM124047a2).put(bArrArray).array(), provider), i14), bArrM124047a3)) {
                throw new JOSEException("MAC check failed");
            }
            bArrDoFinal = AbstractC21979e.m62752b(secretKeySpec2, false, bArrM124047a, provider).doFinal(bArrM124047a2);
        } else if (c16255f.equals(C16255f.f61798I) || c16255f.equals(C16255f.f61799J) || c16255f.equals(C16255f.f61800K)) {
            byte[] bArrM124047a4 = c38672b.m124047a();
            byte[] bArrM124047a5 = c38672b2.m124047a();
            byte[] bArrM124047a6 = c38672b3.m124047a();
            Provider provider2 = (Provider) c25972a.f93280x;
            SecretKey c38675e = secretKey.getAlgorithm().equals("AES") ? secretKey : new C38675e(secretKey);
            try {
                Cipher cipher = provider2 != null ? Cipher.getInstance("AES/GCM/NoPadding", provider2) : Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, c38675e, new GCMParameterSpec(128, bArrM124047a4));
                cipher.updateAAD(bArr);
                try {
                    bArrDoFinal = cipher.doFinal(AbstractC31834n.m98899h(bArrM124047a5, bArrM124047a6));
                } catch (BadPaddingException | IllegalBlockSizeException e13) {
                    throw new JOSEException("AES/GCM/NoPadding decryption failed: " + e13.getMessage(), e13);
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e14) {
                throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e14.getMessage(), e14);
            }
        } else {
            if (c16255f.equals(C16255f.f61796G) || c16255f.equals(C16255f.f61797H)) {
                Map map = c16260k.f61778E;
                AbstractC21979e.m62756f(secretKey, c16255f, map.get("epu") instanceof String ? new C38672b((String) map.get("epu")).m124047a() : null, map.get("epv") instanceof String ? new C38672b((String) map.get("epv")).m124047a() : null);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(c16260k.m46075a().f166476w);
                sb4.append(".");
                throw null;
            }
            if (!c16255f.equals(C16255f.f61801L)) {
                throw new JOSEException(AbstractC21979e.m62761k(c16255f, f85108a));
            }
            try {
                try {
                    bArrDoFinal = new C1961e(2, secretKey.getEncoded(), new byte[0]).mo5980b(AbstractC31834n.m98899h(c38672b.m124047a(), c38672b2.m124047a(), c38672b3.m124047a()), bArr);
                } catch (GeneralSecurityException e15) {
                    throw new JOSEException("XChaCha20Poly1305 decryption failed: " + e15.getMessage(), e15);
                }
            } catch (GeneralSecurityException e16) {
                throw new JOSEException("Invalid XChaCha20Poly1305 key: " + e16.getMessage(), e16);
            }
        }
        C16253d c16253d = c16260k.f61832Q;
        if (c16253d == null) {
            return bArrDoFinal;
        }
        if (c16253d.equals(C16253d.f61791x)) {
            try {
                return AbstractC32004s.m99539h(bArrDoFinal);
            } catch (Exception e17) {
                throw new JOSEException(AbstractC2875y.m8298k(e17, new StringBuilder("Couldn't decompress plain text: ")), e17);
            }
        }
        throw new JOSEException("Unsupported compression algorithm: " + c16253d);
    }

    /* JADX INFO: renamed from: c */
    public static C2570m m62750c(C16260k c16260k, byte[] bArr, byte[] bArr2, SecretKey secretKey, C38672b c38672b, C25972a c25972a) throws Throwable {
        Deflater deflater;
        byte[] byteArray;
        C38672b c38672b2;
        SecretKeySpec secretKeySpec;
        SecretKeySpec secretKeySpec2;
        C20378c c20378c;
        byte[] bArrM98903l;
        int i13;
        if (bArr2 == null) {
            return m62750c(c16260k, bArr, c16260k.m46075a().f166476w.getBytes(StandardCharsets.US_ASCII), secretKey, c38672b, c25972a);
        }
        SecretKey c38675e = secretKey;
        C16255f c16255f = c16260k.f61830O;
        m62748a(c38675e, c16255f);
        C16253d c16253d = c16260k.f61832Q;
        DeflaterOutputStream deflaterOutputStream = null;
        deflaterOutputStream = null;
        if (c16253d == null) {
            byteArray = bArr;
        } else {
            if (!c16253d.equals(C16253d.f61791x)) {
                throw new JOSEException("Unsupported compression algorithm: " + c16253d);
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    deflater = new Deflater(8, true);
                    try {
                        DeflaterOutputStream deflaterOutputStream2 = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                        try {
                            deflaterOutputStream2.write(bArr);
                            deflaterOutputStream2.close();
                            deflater.end();
                            byteArray = byteArrayOutputStream.toByteArray();
                        } catch (Throwable th3) {
                            th = th3;
                            deflaterOutputStream = deflaterOutputStream2;
                            if (deflaterOutputStream != null) {
                                deflaterOutputStream.close();
                            }
                            if (deflater != null) {
                                deflater.end();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    deflater = null;
                }
            } catch (Exception e5) {
                throw new JOSEException(AbstractC2875y.m8298k(e5, new StringBuilder("Couldn't compress plain text: ")), e5);
            }
        }
        int i14 = 24;
        int i15 = 0;
        if (c16255f.equals(C16255f.f61802z) || c16255f.equals(C16255f.f61794E) || c16255f.equals(C16255f.f61795F)) {
            c38672b2 = c38672b;
            byte[] bArr3 = new byte[16];
            new SecureRandom().nextBytes(bArr3);
            Provider provider = (Provider) c25972a.f93280x;
            byte[] encoded = c38675e.getEncoded();
            if (encoded.length == 32) {
                secretKeySpec = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
                secretKeySpec2 = new SecretKeySpec(encoded, 16, 16, "AES");
                i14 = 16;
            } else if (encoded.length == 48) {
                secretKeySpec = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
                secretKeySpec2 = new SecretKeySpec(encoded, 24, 24, "AES");
            } else {
                if (encoded.length != 64) {
                    throw new KeyLengthException("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
                }
                secretKeySpec = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
                i14 = 32;
                secretKeySpec2 = new SecretKeySpec(encoded, 32, 32, "AES");
            }
            try {
                byte[] bArrDoFinal = AbstractC21979e.m62752b(secretKeySpec2, true, bArr3, provider).doFinal(byteArray);
                long length = ((long) bArr2.length) * 8;
                long j7 = (int) length;
                if (j7 != length) {
                    throw new IntegerOverflowException();
                }
                byte[] bArrArray = ByteBuffer.allocate(8).putLong(j7).array();
                c20378c = new C20378c(bArrDoFinal, Arrays.copyOf(AbstractC21979e.m62751a(secretKeySpec.getAlgorithm(), secretKeySpec, ByteBuffer.allocate(bArr2.length + 16 + bArrDoFinal.length + bArrArray.length).put(bArr2).put(bArr3).put(bArrDoFinal).put(bArrArray).array(), provider), i14));
                bArrM98903l = bArr3;
            } catch (Exception e13) {
                throw new JOSEException(e13.getMessage(), e13);
            }
        } else if (c16255f.equals(C16255f.f61798I) || c16255f.equals(C16255f.f61799J) || c16255f.equals(C16255f.f61800K)) {
            c38672b2 = c38672b;
            byte[] bArr4 = new byte[12];
            new SecureRandom().nextBytes(bArr4);
            Provider provider2 = (Provider) c25972a.f93280x;
            if (!c38675e.getAlgorithm().equals("AES")) {
                c38675e = new C38675e(c38675e);
            }
            try {
                Cipher cipher = provider2 != null ? Cipher.getInstance("AES/GCM/NoPadding", provider2) : Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, c38675e, new GCMParameterSpec(128, bArr4));
                cipher.updateAAD(bArr2);
                try {
                    byte[] bArrDoFinal2 = cipher.doFinal(byteArray);
                    int length2 = bArrDoFinal2.length - 16;
                    byte[] bArrM98903l2 = AbstractC31834n.m98903l(bArrDoFinal2, 0, length2);
                    byte[] bArrM98903l3 = AbstractC31834n.m98903l(bArrDoFinal2, length2, 16);
                    AlgorithmParameters parameters = cipher.getParameters();
                    if (parameters == null) {
                        throw new JOSEException("AES GCM ciphers are expected to make use of algorithm parameters");
                    }
                    try {
                        GCMParameterSpec gCMParameterSpec = (GCMParameterSpec) parameters.getParameterSpec(GCMParameterSpec.class);
                        byte[] iv3 = gCMParameterSpec.getIV();
                        int tLen = gCMParameterSpec.getTLen();
                        if (iv3 == null) {
                            i13 = 0;
                        } else {
                            long length3 = ((long) iv3.length) * 8;
                            i13 = (int) length3;
                            if (i13 != length3) {
                                throw new IntegerOverflowException();
                            }
                        }
                        if (i13 != 96) {
                            if (iv3 != null) {
                                long length4 = ((long) iv3.length) * 8;
                                i15 = (int) length4;
                                if (i15 != length4) {
                                    throw new IntegerOverflowException();
                                }
                            }
                            throw new JOSEException(String.format("IV length of %d bits is required, got %d", 96, Integer.valueOf(i15)));
                        }
                        if (tLen != 128) {
                            throw new JOSEException(String.format("Authentication tag length of %d bits is required, got %d", 128, Integer.valueOf(tLen)));
                        }
                        C20378c c20378c2 = new C20378c(bArrM98903l2, bArrM98903l3);
                        bArrM98903l = iv3;
                        c20378c = c20378c2;
                    } catch (InvalidParameterSpecException e14) {
                        throw new JOSEException(e14.getMessage(), e14);
                    }
                } catch (BadPaddingException | IllegalBlockSizeException e15) {
                    throw new JOSEException("Couldn't encrypt with AES/GCM/NoPadding: " + e15.getMessage(), e15);
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e16) {
                throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e16.getMessage(), e16);
            }
        } else if (c16255f.equals(C16255f.f61796G) || c16255f.equals(C16255f.f61797H)) {
            byte[] bArr5 = new byte[16];
            new SecureRandom().nextBytes(bArr5);
            Provider provider3 = (Provider) c25972a.f93280x;
            Map map = c16260k.f61778E;
            byte[] bArrM124047a = map.get("epu") instanceof String ? new C38672b((String) map.get("epu")).m124047a() : null;
            byte[] bArrM124047a2 = map.get("epv") instanceof String ? new C38672b((String) map.get("epv")).m124047a() : null;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream2.write(AbstractC21979e.f85112a);
                byte[] encoded2 = c38675e.getEncoded();
                byteArrayOutputStream2.write(encoded2);
                int length5 = encoded2.length * 8;
                byteArrayOutputStream2.write(AbstractC32069a.m99659A(length5 / 2));
                byteArrayOutputStream2.write(c16255f.f61776w.getBytes(AbstractC38676f.f166480a));
                byte[] bArr6 = AbstractC21979e.f85113b;
                if (bArrM124047a != null) {
                    byteArrayOutputStream2.write(AbstractC32069a.m99659A(bArrM124047a.length));
                    byteArrayOutputStream2.write(bArrM124047a);
                } else {
                    byteArrayOutputStream2.write(bArr6);
                }
                if (bArrM124047a2 != null) {
                    byteArrayOutputStream2.write(AbstractC32069a.m99659A(bArrM124047a2.length));
                    byteArrayOutputStream2.write(bArrM124047a2);
                } else {
                    byteArrayOutputStream2.write(bArr6);
                }
                byteArrayOutputStream2.write(AbstractC21979e.f85114c);
                try {
                    byte[] bArrDigest = MessageDigest.getInstance("SHA-" + length5).digest(byteArrayOutputStream2.toByteArray());
                    int length6 = bArrDigest.length / 2;
                    byte[] bArr7 = new byte[length6];
                    System.arraycopy(bArrDigest, 0, bArr7, 0, length6);
                    try {
                        byte[] bArrDoFinal3 = AbstractC21979e.m62752b(new SecretKeySpec(bArr7, "AES"), true, bArr5, provider3).doFinal(byteArray);
                        SecretKeySpec secretKeySpecM62756f = AbstractC21979e.m62756f(c38675e, c16255f, bArrM124047a, bArrM124047a2);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(c16260k.m46075a());
                        sb4.append(".");
                        c38672b2 = c38672b;
                        sb4.append(c38672b2);
                        sb4.append(".");
                        sb4.append(C38672b.m124049c(bArr5));
                        sb4.append(".");
                        sb4.append(C38672b.m124049c(bArrDoFinal3));
                        c20378c = new C20378c(bArrDoFinal3, AbstractC21979e.m62751a(secretKeySpecM62756f.getAlgorithm(), secretKeySpecM62756f, sb4.toString().getBytes(AbstractC38676f.f166480a), provider3));
                        bArrM98903l = bArr5;
                    } catch (Exception e17) {
                        throw new JOSEException(e17.getMessage(), e17);
                    }
                } catch (NoSuchAlgorithmException e18) {
                    throw new JOSEException(e18.getMessage(), e18);
                }
            } catch (IOException e19) {
                throw new JOSEException(e19.getMessage(), e19);
            }
        } else {
            if (!c16255f.equals(C16255f.f61801L)) {
                throw new JOSEException(AbstractC21979e.m62761k(c16255f, f85108a));
            }
            try {
                C17598j c17598j = new C17598j(c38675e.getEncoded(), 1);
                try {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteArray.length + 40);
                    byte[] bArrM101079W = AbstractC32411b.m101079W(24);
                    byteBufferAllocate.put(bArrM101079W);
                    c17598j.m7259l(byteBufferAllocate, bArrM101079W, byteArray, bArr2);
                    byte[] bArrArray2 = byteBufferAllocate.array();
                    int length7 = bArrArray2.length;
                    bArrM98903l = AbstractC31834n.m98903l(bArrArray2, 0, 24);
                    c20378c = new C20378c(AbstractC31834n.m98903l(bArrArray2, 24, length7 - 40), AbstractC31834n.m98903l(bArrArray2, length7 - 16, 16));
                    c38672b2 = c38672b;
                } catch (GeneralSecurityException e22) {
                    throw new JOSEException("Couldn't encrypt with XChaCha20Poly1305: " + e22.getMessage(), e22);
                }
            } catch (GeneralSecurityException e24) {
                throw new JOSEException("Invalid XChaCha20Poly1305 key: " + e24.getMessage(), e24);
            }
        }
        return new C2570m(c16260k, c38672b2, C38672b.m124049c(bArrM98903l), C38672b.m124049c((byte[]) c20378c.f76422x), C38672b.m124049c((byte[]) c20378c.f76423y), 5);
    }
}
