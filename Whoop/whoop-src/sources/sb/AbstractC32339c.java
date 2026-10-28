package sb;

import android.security.keystore.KeyGenParameterSpec;

/* JADX INFO: renamed from: sb.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32339c {

    /* JADX INFO: renamed from: a */
    public static final Object f133847a;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
        f133847a = new Object();
    }
}
