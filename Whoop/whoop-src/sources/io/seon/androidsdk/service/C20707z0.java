package io.seon.androidsdk.service;

import a00.C0072g;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.UserManager;
import android.provider.Settings;
import android.util.Base64;
import com.whoop.service.network.model.UserState;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import m63.C25126d;
import p037bu.C3632c;

/* JADX INFO: renamed from: io.seon.androidsdk.service.z0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20707z0 extends AbstractC20664g {

    /* JADX INFO: renamed from: h */
    public static final C20691r0 f77521h = new C20691r0(4000);

    /* JADX INFO: renamed from: i */
    public static final String[] f77522i = {"first_api_level", "is_espresso_connected", "is_hiddenapi_modified", "profile_administrators", "is_app_cloned", "package_name", "package_signatures"};

    /* JADX INFO: renamed from: e */
    public Context f77523e;

    /* JADX INFO: renamed from: f */
    public SeonNT f77524f;

    /* JADX INFO: renamed from: g */
    public C20657d1 f77525g;

    /* JADX INFO: renamed from: i */
    public static void m56892i(OutputStream outputStream, byte[] bArr) {
        ByteBuffer byteBufferAllocate;
        try {
            int length = bArr.length;
            byte[] bArr2 = new byte[4];
            new Random().nextBytes(bArr2);
            byte[] bArr3 = new byte[length];
            for (int i13 = 0; i13 < length; i13++) {
                bArr3[i13] = (byte) (bArr[i13] ^ bArr2[i13 % 4]);
            }
            if (length <= 125) {
                byteBufferAllocate = ByteBuffer.allocate(length + 6);
                byteBufferAllocate.put((byte) -126);
                byteBufferAllocate.put((byte) (length | 128));
            } else if (length <= 65535) {
                byteBufferAllocate = ByteBuffer.allocate(length + 8);
                byteBufferAllocate.put((byte) -126);
                byteBufferAllocate.put((byte) -2);
                byteBufferAllocate.putShort((short) length);
            } else {
                byteBufferAllocate = ByteBuffer.allocate(length + 14);
                byteBufferAllocate.put((byte) -126);
                byteBufferAllocate.put((byte) -1);
                byteBufferAllocate.putLong(length);
            }
            byteBufferAllocate.put(bArr2);
            byteBufferAllocate.put(bArr3);
            outputStream.write(byteBufferAllocate.array());
            outputStream.flush();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: a */
    public final Map mo56774a() {
        Integer num;
        Boolean boolValueOf;
        ArrayList arrayListM56893f;
        String str;
        Object objMo56800a;
        Object objMo56800a2;
        C3632c c3632c = AbstractC20664g.f77301d;
        HashMap map = new HashMap();
        C20691r0 c20691r0 = f77521h;
        c20691r0.f77447d.lock();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (System.currentTimeMillis() - c20691r0.f77445b >= c20691r0.f77446c || c20691r0.f77445b == -1) {
                c20691r0.f77444a = AbstractC20676k.m56830d();
                c20691r0.f77445b = jCurrentTimeMillis;
            }
        } catch (Throwable unused) {
        }
        c20691r0.f77447d.unlock();
        this.f77525g = (C20657d1) c20691r0.f77444a;
        ArrayList arrayListM56894g = null;
        try {
            C20701w0 c20701w0 = new C20701w0(this, 25);
            AtomicInteger atomicInteger = AbstractC20684o.f77414a;
            try {
                objMo56800a2 = c20701w0.mo56800a();
            } catch (Throwable unused2) {
                objMo56800a2 = null;
            }
            num = (Integer) objMo56800a2;
        } catch (Exception e5) {
            c3632c.m11163L(3, e5);
            num = null;
        } catch (Throwable unused3) {
            num = null;
        }
        map.put("first_api_level", num);
        map.put("is_espresso_connected", AbstractC20664g.m56801d(new C20703x0(this, 0 == true ? 1 : 0)));
        int i13 = 1;
        try {
            try {
                try {
                    boolValueOf = Boolean.valueOf(Settings.Global.getInt(this.f77523e.getContentResolver(), "hidden_api_policy") == 1);
                } catch (Throwable unused4) {
                    boolValueOf = null;
                }
            } catch (Exception unused5) {
                boolValueOf = Boolean.FALSE;
            }
        } catch (Exception e13) {
            c3632c.m11163L(3, e13);
            boolValueOf = null;
        }
        map.put("is_hiddenapi_modified", boolValueOf);
        try {
            arrayListM56893f = m56893f();
        } catch (Exception e14) {
            c3632c.m11163L(3, e14);
            arrayListM56893f = null;
        } catch (Throwable unused6) {
            arrayListM56893f = null;
        }
        map.put("profile_administrators", arrayListM56893f);
        map.put("is_app_cloned", AbstractC20664g.m56801d(new C20703x0(this, i13)));
        try {
            C20701w0 c20701w1 = new C20701w0(this, 26);
            AtomicInteger atomicInteger2 = AbstractC20684o.f77414a;
            try {
                objMo56800a = c20701w1.mo56800a();
            } catch (Throwable unused7) {
                objMo56800a = null;
            }
            str = (String) objMo56800a;
        } catch (Exception e15) {
            c3632c.m11163L(3, e15);
            str = null;
        } catch (Throwable unused8) {
            str = null;
        }
        map.put("package_name", str);
        try {
            arrayListM56894g = m56894g();
        } catch (Exception e16) {
            c3632c.m11163L(3, e16);
        } catch (Throwable unused9) {
        }
        map.put("package_signatures", arrayListM56894g);
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: b */
    public final Map mo56775b() {
        AttestationGenerator$RootCertIssuer attestationGenerator$RootCertIssuer;
        Integer num;
        KeyDescription$SecurityLevelEnum keyDescription$SecurityLevelEnum;
        Integer num2;
        KeyDescription$SecurityLevelEnum keyDescription$SecurityLevelEnum2;
        String str;
        BigInteger bigInteger;
        ArrayList arrayList;
        ArrayList arrayList2;
        RootOfTrust$DeviceLockState rootOfTrust$DeviceLockStateM56897k;
        RootOfTrust$VerifiedBootStateEnum rootOfTrust$VerifiedBootStateEnum;
        String str2;
        String str3;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        String str4;
        Boolean bool;
        ArrayList arrayList6;
        String strM56896j;
        Boolean bool2;
        Boolean boolM56895h;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Integer numValueOf;
        Object objMo56800a;
        int iM56771d;
        Object objMo56800a2;
        Object objMo56800a3;
        Object objMo56800a4;
        Object objMo56800a5;
        Object objMo56800a6;
        Object objMo56800a7;
        Object objMo56800a8;
        Object objMo56800a9;
        Object objMo56800a10;
        Object objMo56800a11;
        Object objMo56800a12;
        Object objMo56800a13;
        Object objMo56800a14;
        Object objMo56800a15;
        Object objMo56800a16;
        Object objMo56800a17;
        Object objMo56800a18;
        Object objMo56800a19;
        Object objMo56800a20;
        Object objMo56800a21;
        Object objMo56800a22;
        Object objMo56800a23;
        Object objMo56800a24;
        Object objMo56800a25;
        Object objMo56800a26;
        Object objMo56800a27;
        C3632c c3632c = AbstractC20664g.f77301d;
        HashMap map = new HashMap();
        int i13 = 3;
        Map map2 = null;
        try {
            C20701w0 c20701w0 = new C20701w0(this, 0);
            AtomicInteger atomicInteger = AbstractC20684o.f77414a;
            try {
                objMo56800a27 = c20701w0.mo56800a();
            } catch (Throwable unused) {
                objMo56800a27 = null;
            }
            attestationGenerator$RootCertIssuer = (AttestationGenerator$RootCertIssuer) objMo56800a27;
        } catch (Exception e5) {
            c3632c.m11163L(3, e5);
            attestationGenerator$RootCertIssuer = null;
        } catch (Throwable unused2) {
            attestationGenerator$RootCertIssuer = null;
        }
        map.put("attest_cert_signature", attestationGenerator$RootCertIssuer);
        try {
            C20701w0 c20701w1 = new C20701w0(this, 11);
            AtomicInteger atomicInteger2 = AbstractC20684o.f77414a;
            try {
                objMo56800a26 = c20701w1.mo56800a();
            } catch (Throwable unused3) {
                objMo56800a26 = null;
            }
            num = (Integer) objMo56800a26;
        } catch (Exception e13) {
            c3632c.m11163L(3, e13);
            num = null;
        } catch (Throwable unused4) {
            num = null;
        }
        map.put("attest_version", num);
        try {
            C20701w0 c20701w2 = new C20701w0(this, 20);
            AtomicInteger atomicInteger3 = AbstractC20684o.f77414a;
            try {
                objMo56800a25 = c20701w2.mo56800a();
            } catch (Throwable unused5) {
                objMo56800a25 = null;
            }
            keyDescription$SecurityLevelEnum = KeyDescription$SecurityLevelEnum.get((Integer) objMo56800a25);
        } catch (Exception e14) {
            c3632c.m11163L(3, e14);
            keyDescription$SecurityLevelEnum = null;
        } catch (Throwable unused6) {
            keyDescription$SecurityLevelEnum = null;
        }
        map.put("attest_sec_level", keyDescription$SecurityLevelEnum);
        try {
            C20701w0 c20701w3 = new C20701w0(this, 7);
            AtomicInteger atomicInteger4 = AbstractC20684o.f77414a;
            try {
                objMo56800a24 = c20701w3.mo56800a();
            } catch (Throwable unused7) {
                objMo56800a24 = null;
            }
            num2 = (Integer) objMo56800a24;
        } catch (Exception e15) {
            c3632c.m11163L(3, e15);
            num2 = null;
        } catch (Throwable unused8) {
            num2 = null;
        }
        map.put("attest_km_version", num2);
        int i14 = 2;
        try {
            C20701w0 c20701w4 = new C20701w0(this, i14);
            AtomicInteger atomicInteger5 = AbstractC20684o.f77414a;
            try {
                objMo56800a23 = c20701w4.mo56800a();
            } catch (Throwable unused9) {
                objMo56800a23 = null;
            }
            keyDescription$SecurityLevelEnum2 = (KeyDescription$SecurityLevelEnum) objMo56800a23;
        } catch (Exception e16) {
            c3632c.m11163L(3, e16);
            keyDescription$SecurityLevelEnum2 = null;
        } catch (Throwable unused10) {
            keyDescription$SecurityLevelEnum2 = null;
        }
        map.put("attest_km_level", keyDescription$SecurityLevelEnum2);
        try {
            C20701w0 c20701w5 = new C20701w0(this, 19);
            AtomicInteger atomicInteger6 = AbstractC20684o.f77414a;
            try {
                objMo56800a22 = c20701w5.mo56800a();
            } catch (Throwable unused11) {
                objMo56800a22 = null;
            }
            str = (String) objMo56800a22;
        } catch (Exception e17) {
            c3632c.m11163L(3, e17);
            str = null;
        } catch (Throwable unused12) {
            str = null;
        }
        map.put("attest_challenge", str);
        int i15 = 4;
        try {
            C20701w0 c20701w6 = new C20701w0(this, i15);
            AtomicInteger atomicInteger7 = AbstractC20684o.f77414a;
            try {
                objMo56800a21 = c20701w6.mo56800a();
            } catch (Throwable unused13) {
                objMo56800a21 = null;
            }
            bigInteger = (BigInteger) objMo56800a21;
        } catch (Exception e18) {
            c3632c.m11163L(3, e18);
            bigInteger = null;
        } catch (Throwable unused14) {
            bigInteger = null;
        }
        map.put("attest_time", bigInteger);
        try {
            C20701w0 c20701w7 = new C20701w0(this, 10);
            AtomicInteger atomicInteger8 = AbstractC20684o.f77414a;
            try {
                objMo56800a20 = c20701w7.mo56800a();
            } catch (Throwable unused15) {
                objMo56800a20 = null;
            }
            arrayList = (ArrayList) objMo56800a20;
        } catch (Exception e19) {
            c3632c.m11163L(3, e19);
            arrayList = null;
        } catch (Throwable unused16) {
            arrayList = null;
        }
        map.put("attest_packages", arrayList);
        try {
            C20703x0 c20703x0 = new C20703x0(this, i15);
            AtomicInteger atomicInteger9 = AbstractC20684o.f77414a;
            try {
                objMo56800a19 = c20703x0.mo56800a();
            } catch (Throwable unused17) {
                objMo56800a19 = null;
            }
            arrayList2 = (ArrayList) objMo56800a19;
        } catch (Exception e22) {
            c3632c.m11163L(3, e22);
            arrayList2 = null;
        } catch (Throwable unused18) {
            arrayList2 = null;
        }
        map.put("attest_signatures", arrayList2);
        try {
            rootOfTrust$DeviceLockStateM56897k = m56897k();
        } catch (Exception e24) {
            c3632c.m11163L(3, e24);
            rootOfTrust$DeviceLockStateM56897k = null;
        } catch (Throwable unused19) {
            rootOfTrust$DeviceLockStateM56897k = null;
        }
        map.put("attest_is_device_unlocked", rootOfTrust$DeviceLockStateM56897k);
        try {
            C20701w0 c20701w8 = new C20701w0(this, 23);
            AtomicInteger atomicInteger10 = AbstractC20684o.f77414a;
            try {
                objMo56800a17 = c20701w8.mo56800a();
            } catch (Throwable unused20) {
                objMo56800a17 = null;
            }
            BigInteger bigInteger4 = (BigInteger) objMo56800a17;
            try {
                objMo56800a18 = new C20701w0(this, 24).mo56800a();
            } catch (Throwable unused21) {
                objMo56800a18 = null;
            }
            rootOfTrust$VerifiedBootStateEnum = bigInteger4 != null ? RootOfTrust$VerifiedBootStateEnum.get(bigInteger4) : RootOfTrust$VerifiedBootStateEnum.get((BigInteger) objMo56800a18);
        } catch (Exception e25) {
            c3632c.m11163L(3, e25);
            rootOfTrust$VerifiedBootStateEnum = null;
        } catch (Throwable unused22) {
            rootOfTrust$VerifiedBootStateEnum = null;
        }
        map.put("attest_ver_boot_state", rootOfTrust$VerifiedBootStateEnum);
        try {
            C20701w0 c20701w9 = new C20701w0(this, 5);
            AtomicInteger atomicInteger11 = AbstractC20684o.f77414a;
            try {
                objMo56800a15 = c20701w9.mo56800a();
            } catch (Throwable unused23) {
                objMo56800a15 = null;
            }
            str2 = (String) objMo56800a15;
            try {
                objMo56800a16 = new C20701w0(this, 6).mo56800a();
            } catch (Throwable unused24) {
                objMo56800a16 = null;
            }
            String str5 = (String) objMo56800a16;
            if (str2 == null) {
                str2 = str5;
            }
        } catch (Exception e26) {
            c3632c.m11163L(3, e26);
            str2 = null;
        } catch (Throwable unused25) {
            str2 = null;
        }
        map.put("attest_ver_boot_hash", str2);
        try {
            C20701w0 c20701w10 = new C20701w0(this, 14);
            AtomicInteger atomicInteger12 = AbstractC20684o.f77414a;
            try {
                objMo56800a13 = c20701w10.mo56800a();
            } catch (Throwable unused26) {
                objMo56800a13 = null;
            }
            str3 = (String) objMo56800a13;
            try {
                objMo56800a14 = new C20701w0(this, 15).mo56800a();
            } catch (Throwable unused27) {
                objMo56800a14 = null;
            }
            String str6 = (String) objMo56800a14;
            if (str3 == null) {
                str3 = str6;
            }
        } catch (Exception e27) {
            c3632c.m11163L(3, e27);
            str3 = null;
        } catch (Throwable unused28) {
            str3 = null;
        }
        map.put("attest_ver_boot_key", str3);
        try {
            C20701w0 c20701w11 = new C20701w0(this, 12);
            AtomicInteger atomicInteger13 = AbstractC20684o.f77414a;
            try {
                objMo56800a11 = c20701w11.mo56800a();
            } catch (Throwable unused29) {
                objMo56800a11 = null;
            }
            bigInteger2 = (BigInteger) objMo56800a11;
            try {
                objMo56800a12 = new C20701w0(this, 13).mo56800a();
            } catch (Throwable unused30) {
                objMo56800a12 = null;
            }
            BigInteger bigInteger5 = (BigInteger) objMo56800a12;
            if (bigInteger2 == null) {
                bigInteger2 = bigInteger5;
            }
        } catch (Exception e28) {
            c3632c.m11163L(3, e28);
            bigInteger2 = null;
        } catch (Throwable unused31) {
            bigInteger2 = null;
        }
        map.put("attest_os_version", bigInteger2);
        try {
            C20701w0 c20701w12 = new C20701w0(this, 16);
            AtomicInteger atomicInteger14 = AbstractC20684o.f77414a;
            try {
                objMo56800a9 = c20701w12.mo56800a();
            } catch (Throwable unused32) {
                objMo56800a9 = null;
            }
            bigInteger3 = (BigInteger) objMo56800a9;
            try {
                objMo56800a10 = new C20701w0(this, 17).mo56800a();
            } catch (Throwable unused33) {
                objMo56800a10 = null;
            }
            BigInteger bigInteger6 = (BigInteger) objMo56800a10;
            if (bigInteger3 == null) {
                bigInteger3 = bigInteger6;
            }
        } catch (Exception e29) {
            c3632c.m11163L(3, e29);
            bigInteger3 = null;
        } catch (Throwable unused34) {
            bigInteger3 = null;
        }
        map.put("attest_os_patch_level", bigInteger3);
        try {
            C20701w0 c20701w13 = new C20701w0(this, 21);
            AtomicInteger atomicInteger15 = AbstractC20684o.f77414a;
            try {
                objMo56800a8 = c20701w13.mo56800a();
            } catch (Throwable unused35) {
                objMo56800a8 = null;
            }
            arrayList3 = (ArrayList) objMo56800a8;
        } catch (Exception e34) {
            c3632c.m11163L(3, e34);
            arrayList3 = null;
        } catch (Throwable unused36) {
            arrayList3 = null;
        }
        map.put("attest_cert_ids", arrayList3);
        try {
            C20703x0 c20703x1 = new C20703x0(this, i14);
            AtomicInteger atomicInteger16 = AbstractC20684o.f77414a;
            try {
                objMo56800a7 = c20703x1.mo56800a();
            } catch (Throwable unused37) {
                objMo56800a7 = null;
            }
            arrayList4 = (ArrayList) objMo56800a7;
        } catch (Exception e35) {
            c3632c.m11163L(3, e35);
            arrayList4 = null;
        } catch (Throwable unused38) {
            arrayList4 = null;
        }
        map.put("attest_sw_tags", arrayList4);
        try {
            C20701w0 c20701w14 = new C20701w0(this, 9);
            AtomicInteger atomicInteger17 = AbstractC20684o.f77414a;
            try {
                objMo56800a6 = c20701w14.mo56800a();
            } catch (Throwable unused39) {
                objMo56800a6 = null;
            }
            arrayList5 = (ArrayList) objMo56800a6;
        } catch (Exception e36) {
            c3632c.m11163L(3, e36);
            arrayList5 = null;
        } catch (Throwable unused40) {
            arrayList5 = null;
        }
        map.put("attest_hw_tags", arrayList5);
        try {
            C20701w0 c20701w15 = new C20701w0(this, 18);
            AtomicInteger atomicInteger18 = AbstractC20684o.f77414a;
            try {
                objMo56800a5 = c20701w15.mo56800a();
            } catch (Throwable unused41) {
                objMo56800a5 = null;
            }
            str4 = (String) objMo56800a5;
        } catch (Exception e37) {
            c3632c.m11163L(3, e37);
            str4 = null;
        } catch (Throwable unused42) {
            str4 = null;
        }
        map.put("attest_ca_pub_hash", str4);
        try {
            C20703x0 c20703x2 = new C20703x0(this, i13);
            AtomicInteger atomicInteger19 = AbstractC20684o.f77414a;
            try {
                objMo56800a4 = c20703x2.mo56800a();
            } catch (Throwable unused43) {
                objMo56800a4 = null;
            }
            bool = (Boolean) objMo56800a4;
        } catch (Exception e38) {
            c3632c.m11163L(3, e38);
            bool = null;
        } catch (Throwable unused44) {
            bool = null;
        }
        map.put("attest_rt_error_flag", bool);
        try {
            C20701w0 c20701w16 = new C20701w0(this, 8);
            AtomicInteger atomicInteger20 = AbstractC20684o.f77414a;
            try {
                objMo56800a3 = c20701w16.mo56800a();
            } catch (Throwable unused45) {
                objMo56800a3 = null;
            }
            arrayList6 = (ArrayList) objMo56800a3;
        } catch (Exception e39) {
            c3632c.m11163L(3, e39);
            arrayList6 = null;
        } catch (Throwable unused46) {
            arrayList6 = null;
        }
        map.put("attest_logs", arrayList6);
        try {
            strM56896j = m56896j();
        } catch (Exception e44) {
            c3632c.m11163L(3, e44);
            strM56896j = null;
        } catch (Throwable unused47) {
            strM56896j = null;
        }
        map.put("attestation_capability", strM56896j);
        try {
            C20701w0 c20701w17 = new C20701w0(this, 27);
            AtomicInteger atomicInteger21 = AbstractC20684o.f77414a;
            try {
                objMo56800a2 = c20701w17.mo56800a();
            } catch (Throwable unused48) {
                objMo56800a2 = null;
            }
            bool2 = (Boolean) objMo56800a2;
        } catch (Exception e45) {
            c3632c.m11163L(3, e45);
            bool2 = null;
        } catch (Throwable unused49) {
            bool2 = null;
        }
        map.put("is_applisto_detected", bool2);
        try {
            boolM56895h = m56895h();
        } catch (Exception e46) {
            c3632c.m11163L(3, e46);
            boolM56895h = null;
        } catch (Throwable unused50) {
            boolM56895h = null;
        }
        map.put("is_packageinfo_inconsistent", boolM56895h);
        try {
            boolValueOf = Boolean.valueOf(((UserManager) this.f77523e.getSystemService(UserState.Sources.USER)).isSystemUser());
        } catch (Throwable unused51) {
            boolValueOf = null;
        }
        map.put("is_system_user", boolValueOf);
        try {
            boolValueOf2 = Build.VERSION.SDK_INT >= 30 ? Boolean.valueOf(((UserManager) this.f77523e.getSystemService(UserState.Sources.USER)).isManagedProfile()) : null;
        } catch (Throwable unused52) {
        }
        map.put("is_work_profile", boolValueOf2);
        map.put("camera_apps", AbstractC20664g.m56801d(new C20701w0(this, i13)));
        map.put("is_rooted_by_prop", AbstractC20664g.m56801d(new C20701w0(this, 1)));
        map.put("instr_class", AbstractC20664g.m56801d(new C20701w0(this, 22)));
        map.put("lvl_inf", AbstractC20664g.m56801d(new C20680m(this, 5)));
        map.put("frd_scan", AbstractC20664g.m56801d(new C20701w0(this, 29)));
        try {
            SeonNT seonNT = this.f77524f;
            seonNT.getClass();
            try {
                iM56771d = seonNT.m56771d();
            } catch (Throwable unused53) {
                iM56771d = -1;
            }
            numValueOf = Integer.valueOf(iM56771d);
        } catch (Exception e47) {
            c3632c.m11163L(3, e47);
            numValueOf = null;
        } catch (Throwable unused54) {
            numValueOf = null;
        }
        map.put("ptr_int", numValueOf);
        try {
            C20701w0 c20701w18 = new C20701w0(this, 28);
            AtomicInteger atomicInteger22 = AbstractC20684o.f77414a;
            try {
                objMo56800a = c20701w18.mo56800a();
            } catch (Throwable unused55) {
                objMo56800a = null;
            }
            map2 = (Map) objMo56800a;
        } catch (Exception e48) {
            c3632c.m11163L(3, e48);
        } catch (Throwable unused56) {
        }
        map.put("provision", map2);
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: c */
    public final void mo56776c(C20663f1 c20663f1) {
        this.f77523e = c20663f1.f77299a;
        this.f77303b = c20663f1;
        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
        try {
            this.f77524f = new SeonNT(this.f77523e);
        } catch (Throwable unused) {
        }
        try {
            this.f77523e.getSharedPreferences("seonLocalPreferences", 0);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m56893f() {
        ArrayList arrayList = new ArrayList();
        try {
            List<ComponentName> activeAdmins = ((DevicePolicyManager) this.f77523e.getSystemService("device_policy")).getActiveAdmins();
            Objects.requireNonNull(activeAdmins);
            Iterator<ComponentName> it = activeAdmins.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getPackageName());
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList m56894g() {
        ArrayList arrayList = new ArrayList();
        try {
            SigningInfo signingInfo = this.f77523e.getPackageManager().getPackageInfo(this.f77523e.getPackageName(), 134217728).signingInfo;
            Signature[] apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
            if (apkContentsSigners != null && apkContentsSigners.length > 0) {
                for (Signature signature : apkContentsSigners) {
                    byte[] byteArray = signature.toByteArray();
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(byteArray);
                    arrayList.add(Base64.encodeToString(messageDigest.digest(), 0).trim());
                }
                return arrayList;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final Boolean m56895h() {
        Object objMo56800a;
        Object objMo56800a2;
        Object objMo56800a3;
        try {
            C20701w0 c20701w0 = new C20701w0(this, 10);
            AtomicInteger atomicInteger = AbstractC20684o.f77414a;
            try {
                objMo56800a = c20701w0.mo56800a();
            } catch (Throwable unused) {
                objMo56800a = null;
            }
            ArrayList arrayList = (ArrayList) objMo56800a;
            C20703x0 c20703x0 = new C20703x0(this, 4);
            AtomicInteger atomicInteger2 = AbstractC20684o.f77414a;
            try {
                objMo56800a2 = c20703x0.mo56800a();
            } catch (Throwable unused2) {
                objMo56800a2 = null;
            }
            ArrayList arrayList2 = (ArrayList) objMo56800a2;
            C20701w0 c20701w1 = new C20701w0(this, 26);
            AtomicInteger atomicInteger3 = AbstractC20684o.f77414a;
            try {
                objMo56800a3 = c20701w1.mo56800a();
            } catch (Throwable unused3) {
                objMo56800a3 = null;
            }
            String str = (String) objMo56800a3;
            ArrayList<String> arrayListM56894g = m56894g();
            boolean z4 = (arrayList == null || arrayList.isEmpty() || arrayList.contains("UNKNOWN") || arrayList.contains("UnknownPackage")) ? false : true;
            boolean z13 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            boolean z14 = (str == null || str.isEmpty()) ? false : true;
            boolean z15 = (arrayListM56894g == null || arrayListM56894g.isEmpty()) ? false : true;
            if (!z4 || !z13 || !z14 || !z15) {
                return Boolean.FALSE;
            }
            boolean z16 = false;
            for (String str2 : arrayListM56894g) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (str2.equals((String) it.next())) {
                        z16 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf((arrayList.contains(str) && z16) ? false : true);
        } catch (Exception unused4) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final String m56896j() {
        Object objMo56800a;
        C20701w0 c20701w0 = new C20701w0(this, 25);
        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
        try {
            objMo56800a = c20701w0.mo56800a();
        } catch (Throwable unused) {
            objMo56800a = null;
        }
        Integer num = (Integer) objMo56800a;
        if (num == null || num.intValue() >= 24) {
            return (!Build.MANUFACTURER.contains("OnePlus") || num == null || num.intValue() < 24) ? "SUPPORTED" : "ONEPLUS_SUPPORTED";
        }
        return "SOFTWARE_ONLY";
    }

    /* JADX INFO: renamed from: k */
    public final RootOfTrust$DeviceLockState m56897k() {
        C0072g c0072g;
        C0072g c0072g2;
        try {
            C25126d c25126d = m56898l().f77277h;
            C25126d c25126d2 = m56898l().f77276g;
            if (c25126d != null && (c0072g2 = (C0072g) c25126d.f98485y) != null) {
                return ((Boolean) c0072g2.f225z).booleanValue() ? RootOfTrust$DeviceLockState.LOCKED_HW : RootOfTrust$DeviceLockState.UNLOCKED_HW;
            }
            if (c25126d2 != null && (c0072g = (C0072g) c25126d2.f98485y) != null) {
                return ((Boolean) c0072g.f225z).booleanValue() ? RootOfTrust$DeviceLockState.LOCKED_SW : RootOfTrust$DeviceLockState.UNLOCKED_SW;
            }
            if (m56898l().f77281l.booleanValue() && m56896j().equals("ONEPLUS_SUPPORTED")) {
                Iterator it = m56898l().f77280k.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).contains("java.security.ProviderException")) {
                        return RootOfTrust$DeviceLockState.UNLOCKED_SW;
                    }
                }
            }
            return RootOfTrust$DeviceLockState.ERROR;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: l */
    public final C20657d1 m56898l() {
        if (this.f77525g == null) {
            this.f77525g = AbstractC20676k.m56830d();
        }
        return this.f77525g;
    }
}
