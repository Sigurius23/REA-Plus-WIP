package io.seon.androidsdk.service;

import android.content.Context;
import android.os.PowerManager;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;
import java.util.zip.CRC32;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p037bu.C3632c;
import p076d.AbstractC11290h1;
import p076d.C11286g0;
import p076d.C11297l;
import p614xg.AbstractC38267a;

/* JADX INFO: renamed from: io.seon.androidsdk.service.k */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20676k {

    /* JADX INFO: renamed from: a */
    public static int f77352a;

    /* JADX INFO: renamed from: b */
    public static final String[] f77353b = {"android_id", "app_guid", "gsf_id", "is_emulator", "is_rooted", "media_drm_id"};

    /* JADX INFO: renamed from: a */
    public static float m56827a(Context context) {
        C3632c c3632c = C20650b0.f77232n;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return 255.0f;
        }
        for (Method method : powerManager.getClass().getDeclaredMethods()) {
            if (method.getName().equals("getMaximumScreenBrightnessSetting")) {
                method.setAccessible(true);
                try {
                    return ((Integer) method.invoke(powerManager, null)).intValue();
                } catch (Exception e5) {
                    c3632c.m11163L(3, e5);
                }
            }
        }
        for (Field field : powerManager.getClass().getDeclaredFields()) {
            if (field.getName().equals("BRIGHTNESS_ON")) {
                field.setAccessible(true);
                try {
                    return field.getFloat(powerManager);
                } catch (IllegalAccessException e13) {
                    c3632c.m11163L(3, e13);
                }
            }
        }
        return 255.0f;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC11290h1 m56828b(byte[] bArr) throws IOException {
        C11286g0 c11286g0 = new C11286g0(bArr);
        try {
            C11286g0 c11286g1 = new C11286g0(((C11297l) c11286g0.m30502i()).f36277a);
            try {
                AbstractC11290h1 abstractC11290h1 = (AbstractC11290h1) c11286g1.m30502i();
                c11286g1.close();
                c11286g0.close();
                return abstractC11290h1;
            } catch (Throwable th3) {
                try {
                    c11286g1.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                c11286g0.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    /* JADX INFO: renamed from: c */
    public static AttestationGenerator$RootCertIssuer m56829c(List list) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        String str;
        X509Certificate x509Certificate = (X509Certificate) AbstractC11266d.m30455i(1, list);
        int size = list.size() - 1;
        while (size >= 0) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(size);
            x509Certificate2.checkValidity();
            x509Certificate2.verify(x509Certificate.getPublicKey());
            size--;
            x509Certificate = x509Certificate2;
        }
        byte[] bArrM122606a = AbstractC38267a.m122606a("MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEAr7bHgiuxpwHsK7Qui8xUFmOr75gvMsd/dTEDDJdSSxtf6An7xyqpRR90PL2abxM1dEqlXnf2tqw1Ne4Xwl5jlRfdnJLmN0pTy/4lj4/7tv0Sk3iiKkypnEUtR6WfMgH0QZfKHM1+di+y9TFRtv6y//0rb+T+W8a9nsNL/ggjnar86461qO0rOs2cXjp3kOG1FEJ5MVmFmBGtnrKpa73XpXyTqRxB/M0n1n/W9nGqC4FSYa04T6N5RIZGBN2z2MT5IKGbFlbC8UrW0DxW7AYImQQcHtGl/m00QLVWutHQoVJYnFPlXTcHYvASLu+RhhsbDmxMgJJ0mcDpvsC4PjvB+TxywElgS70vE0XmLD+OJtvsBslHZvPBKCOdT0MS+tgSOIfga+z1Z1g7+DVagf7quvmag8jfPioyKvxnK/EgsTUVi2ghzq8wm27ud/mIM7AY2qEORR8Go3TVB4HzWQgpZrt3i5MIlCaY504LzSRiigHCzAPlHws+W0rB5N+er5/2pJKnfBSDiCiFAVtCLOZ7gLiMm0jhO2B6tUXHI/+MRPjy02i59lINMRRev56GKtcd9qO/0kUJWdZTdA2XoS82ixPvZtXQpUpuL12ab+9EaDK8Z4RHJYYfCT3Q5vNAXaiWQ+8PTWm2QgBR/bkwSWc+NpUFgNPN9PvQi8WEg5UmAGMCAwEAAQ==");
        byte[] bArrM122606a2 = AbstractC38267a.m122606a("MHYwEAYHKoZIzj0CAQYFK4EEACIDYgAEI9ojcU7fPlsFCjxy6IRqzgeOoK0b+YsV9FPQywiyw8EQRTkJ9u3qwfnI4DGoSLlBqClTXJfgfCcZvs60FikNMHnu4fkRzObfgDkU2KNXezT9/RQ+XvNslxPHrHCowhGr");
        byte[] bArrM122606a3 = AbstractC38267a.m122606a("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE7l1ex+HA220Dpn7mthvsTWpdamguD/9/SQ59dx9EIm29sa/6FsvHrcV30lacqrewLVQBXT5DKyqO107sSHVBpA==");
        byte[] bArrM122606a4 = AbstractC38267a.m122606a("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEgyDuy2d0i9oygI9czIibKoJiU0RDEvCfxItNTQAjbynZ6bC1ygeeiX/Ymn9XY3jYR5iu2IGjkr8ZtRJ3wrhZ5A==");
        byte[] encoded = ((X509Certificate) AbstractC11266d.m30455i(1, list)).getPublicKey().getEncoded();
        if (Arrays.equals(bArrM122606a, encoded) || Arrays.equals(bArrM122606a2, encoded)) {
            return AttestationGenerator$RootCertIssuer.GOOGLE_HW;
        }
        if (Arrays.equals(bArrM122606a3, encoded)) {
            return AttestationGenerator$RootCertIssuer.AOSP_SW;
        }
        if (Arrays.equals(bArrM122606a4, encoded)) {
            return AttestationGenerator$RootCertIssuer.HUAWEI_HW;
        }
        try {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Pub key hash: ");
            try {
                byte[] bArrM122607b = AbstractC38267a.m122607b(((X509Certificate) list.get(list.size() - 1)).getPublicKey().getEncoded());
                Charset charset = StandardCharsets.UTF_8;
                str = String.format("%064x", new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(new String(bArrM122607b, charset).getBytes(charset))));
            } catch (Exception unused) {
                str = "";
            }
            sb4.append(str);
            AbstractC20684o.m56853f("unknown-key", new Exception(sb4.toString()));
        } catch (Exception unused2) {
        }
        return AttestationGenerator$RootCertIssuer.UNKNOWN;
    }

    /* JADX INFO: renamed from: d */
    public static C20657d1 m56830d() {
        AttestationGenerator$RootCertIssuer attestationGenerator$RootCertIssuerM56829c;
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            X509Certificate[] x509CertificateArrM56832f = m56832f();
            ArrayList arrayList2 = new ArrayList();
            try {
                attestationGenerator$RootCertIssuerM56829c = m56829c(Arrays.asList(x509CertificateArrM56832f));
            } catch (Exception e5) {
                AttestationGenerator$RootCertIssuer attestationGenerator$RootCertIssuer = AttestationGenerator$RootCertIssuer.INVALID_CHAIN;
                arrayList2.add("CERT_ERR: " + e5.getClass() + " - " + e5.getMessage());
                attestationGenerator$RootCertIssuerM56829c = attestationGenerator$RootCertIssuer;
            }
            boolean z4 = false;
            C20657d1 c20657d1 = null;
            C11297l c11297l = null;
            for (int length = x509CertificateArrM56832f.length - 1; length >= 0; length--) {
                X509Certificate x509Certificate = x509CertificateArrM56832f[length];
                arrayList.add(x509Certificate.getSerialNumber().toString(16));
                if (!z4) {
                    byte[] extensionValue = x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.17");
                    if (extensionValue != null) {
                        c20657d1 = new C20657d1(m56828b(extensionValue), attestationGenerator$RootCertIssuerM56829c, c11297l);
                        c20657d1.f77280k.addAll(arrayList2);
                        z4 = true;
                    } else {
                        byte[] extensionValue2 = x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.30");
                        if (extensionValue2 != null) {
                            try {
                                C11286g0 c11286g0 = new C11286g0(extensionValue2);
                                try {
                                    C11297l c11297l2 = (C11297l) c11286g0.m30502i();
                                    c11286g0.close();
                                    c11297l = c11297l2;
                                } catch (Throwable th3) {
                                    try {
                                        c11286g0.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            } catch (Exception unused) {
                                c11297l = null;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (c20657d1 == null) {
                return new C20657d1("EXTENSION_NOT_FOUND");
            }
            c20657d1.f77278i = arrayList;
            try {
                byte[] bArrM122607b = AbstractC38267a.m122607b(x509CertificateArrM56832f[x509CertificateArrM56832f.length - 1].getPublicKey().getEncoded());
                Charset charset = StandardCharsets.UTF_8;
                str = String.format("%064x", new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(new String(bArrM122607b, charset).getBytes(charset))));
            } catch (Exception unused2) {
                str = "";
            }
            c20657d1.f77279j = str;
            return c20657d1;
        } catch (Exception e13) {
            return new C20657d1("ERR: " + e13.getClass() + " - " + e13.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m56831e(JSONObject jSONObject) {
        try {
            StringBuilder sb4 = new StringBuilder();
            String[] strArr = f77353b;
            for (int i13 = 0; i13 < 6; i13++) {
                String str = strArr[i13];
                sb4.append(jSONObject.has(str) ? jSONObject.getString(str) : "null");
            }
            CRC32 crc32 = new CRC32();
            crc32.update(sb4.toString().getBytes(StandardCharsets.UTF_8));
            return Long.toString(crc32.getValue());
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static X509Certificate[] m56832f() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        Date date = new Date();
        Date date2 = new Date(date.getTime() + 1000000);
        KeyGenParameterSpec.Builder attestationChallenge = new KeyGenParameterSpec.Builder("cert0", 4).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setKeyValidityStart(date).setKeyValidityForOriginationEnd(date2).setKeyValidityForConsumptionEnd(new Date(date.getTime() + 999000000)).setAttestationChallenge(UUID.randomUUID().toString().getBytes());
        attestationChallenge.setDigests("NONE", "SHA-256");
        keyPairGenerator.initialize(attestationChallenge.build());
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            try {
                executorServiceNewSingleThreadExecutor.shutdownNow();
                Certificate[] certificateChain = keyStore.getCertificateChain("cert0");
                int length = certificateChain.length;
                X509Certificate[] x509CertificateArr = new X509Certificate[length];
                for (int i13 = 0; i13 < length; i13++) {
                    x509CertificateArr[i13] = (X509Certificate) certificateChain[i13];
                }
                return x509CertificateArr;
            } catch (TimeoutException unused) {
                throw new TimeoutException("KEYGEN_TIMED_OUT");
            }
        } catch (Throwable th3) {
            executorServiceNewSingleThreadExecutor.shutdownNow();
            throw th3;
        }
    }
}
