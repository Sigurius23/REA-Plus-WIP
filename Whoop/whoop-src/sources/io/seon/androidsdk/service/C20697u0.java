package io.seon.androidsdk.service;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import p037bu.C3632c;

/* JADX INFO: renamed from: io.seon.androidsdk.service.u0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20697u0 extends AbstractC20664g {

    /* JADX INFO: renamed from: f */
    public static final String[] f77502f = {"biometric_status", "is_keyguard_secure"};

    /* JADX INFO: renamed from: e */
    public Context f77503e;

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: a */
    public final Map mo56774a() {
        String strM56890f;
        C3632c c3632c = AbstractC20664g.f77301d;
        HashMap map = new HashMap();
        Boolean boolValueOf = null;
        try {
            strM56890f = m56890f();
        } catch (Exception e5) {
            c3632c.m11163L(3, e5);
            strM56890f = null;
        } catch (Throwable unused) {
            strM56890f = null;
        }
        map.put("biometric_status", strM56890f);
        try {
            boolValueOf = Boolean.valueOf(((KeyguardManager) this.f77503e.getSystemService("keyguard")).isKeyguardSecure());
        } catch (Exception e13) {
            c3632c.m11163L(3, e13);
        } catch (Throwable unused2) {
        }
        map.put("is_keyguard_secure", boolValueOf);
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: b */
    public final Map mo56775b() {
        return null;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: c */
    public final void mo56776c(C20663f1 c20663f1) {
        this.f77503e = c20663f1.f77299a;
        this.f77303b = c20663f1;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:2:0x0000, B:4:0x0008, B:21:0x004c, B:13:0x0029, B:14:0x002c, B:15:0x002f, B:20:0x004a, B:16:0x0032, B:18:0x0042), top: B:25:0x0000 }] */
    /* JADX INFO: renamed from: f */
    public final String m56890f() {
        try {
            SecurityProbe$BiometricSensorStatus securityProbe$BiometricSensorStatus = SecurityProbe$BiometricSensorStatus.HARDWARE_UNAVAILABLE;
            if (Build.VERSION.SDK_INT >= 30) {
                int iCanAuthenticate = C20680m.m56840b(this.f77503e.getSystemService("biometric")).canAuthenticate(255);
                if (iCanAuthenticate == 0) {
                    securityProbe$BiometricSensorStatus = SecurityProbe$BiometricSensorStatus.AVAILABLE;
                } else if (iCanAuthenticate == 15) {
                    securityProbe$BiometricSensorStatus = SecurityProbe$BiometricSensorStatus.REQUIRES_SECURITY_UPDATE;
                } else if (iCanAuthenticate == 11) {
                    securityProbe$BiometricSensorStatus = SecurityProbe$BiometricSensorStatus.NOT_ENROLLED;
                } else if (iCanAuthenticate == 12) {
                    securityProbe$BiometricSensorStatus = SecurityProbe$BiometricSensorStatus.NO_HARDWARE;
                }
            } else {
                FingerprintManager fingerprintManager = (FingerprintManager) this.f77503e.getSystemService("fingerprint");
                if (fingerprintManager.isHardwareDetected()) {
                    securityProbe$BiometricSensorStatus = SecurityProbe$BiometricSensorStatus.NOT_ENROLLED;
                    if (fingerprintManager.hasEnrolledFingerprints()) {
                        securityProbe$BiometricSensorStatus = SecurityProbe$BiometricSensorStatus.AVAILABLE;
                    }
                }
            }
            return securityProbe$BiometricSensorStatus.name();
        } catch (Exception unused) {
            return null;
        }
    }
}
