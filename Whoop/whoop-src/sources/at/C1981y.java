package at;

import a53.C0403b;
import ih0.AbstractC18489d0;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p075ct.C11105a;
import p505ts.C34126i;
import p505ts.InterfaceC34130m;

/* JADX INFO: renamed from: at.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C1981y implements InterfaceC34130m {

    /* JADX INFO: renamed from: a */
    public final C0403b f7835a;

    /* JADX INFO: renamed from: b */
    public final String f7836b;

    /* JADX INFO: renamed from: c */
    public final SecretKeySpec f7837c;

    /* JADX INFO: renamed from: d */
    public final int f7838d;

    public C1981y(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        byte b = 1;
        C0403b c0403b = new C0403b(this, 1);
        this.f7835a = c0403b;
        if (!AbstractC18489d0.m53361b(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f7836b = str;
        this.f7837c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1823053428:
                b = !str.equals("HMACSHA1") ? (byte) -1 : (byte) 0;
                break;
            case 392315023:
                if (!str.equals("HMACSHA224")) {
                    b = -1;
                }
                break;
            case 392315118:
                b = !str.equals("HMACSHA256") ? (byte) -1 : (byte) 2;
                break;
            case 392316170:
                b = !str.equals("HMACSHA384") ? (byte) -1 : (byte) 3;
                break;
            case 392317873:
                b = !str.equals("HMACSHA512") ? (byte) -1 : (byte) 4;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                this.f7838d = 20;
                break;
            case 1:
                this.f7838d = 28;
                break;
            case 2:
                this.f7838d = 32;
                break;
            case 3:
                this.f7838d = 48;
                break;
            case 4:
                this.f7838d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        c0403b.get();
    }

    /* JADX INFO: renamed from: b */
    public static C1981y m6032b(C34126i c34126i) {
        return new C1981y("HMAC" + c34126i.f143059b.f143067b, new SecretKeySpec(((C11105a) c34126i.f143060c.f130665x).m30035b(), "HMAC"));
    }

    @Override // p505ts.InterfaceC34130m
    /* JADX INFO: renamed from: a */
    public final byte[] mo6031a(int i13, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (i13 > this.f7838d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        C0403b c0403b = this.f7835a;
        ((Mac) c0403b.get()).update(bArr);
        return Arrays.copyOf(((Mac) c0403b.get()).doFinal(), i13);
    }
}
