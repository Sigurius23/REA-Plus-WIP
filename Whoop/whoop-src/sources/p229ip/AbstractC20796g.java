package p229ip;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: renamed from: ip.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC20796g {

    /* JADX INFO: renamed from: a */
    public static final SecureRandom f78087a = new SecureRandom();

    /* JADX INFO: renamed from: a */
    public static String m57331a() {
        byte[] bArr = new byte[16];
        f78087a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
