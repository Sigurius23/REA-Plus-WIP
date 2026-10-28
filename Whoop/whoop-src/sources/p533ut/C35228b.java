package p533ut;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import p098dt.C12355g;
import p098dt.C12357i;

/* JADX INFO: renamed from: ut.b */
/* JADX INFO: loaded from: classes.dex */
public final class C35228b {

    /* JADX INFO: renamed from: c */
    public static final String[] f149830c = {"*", "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f149831a;

    /* JADX INFO: renamed from: b */
    public final String f149832b;

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public C35228b(C12355g c12355g) {
        c12355g.m34610a();
        this.f149831a = c12355g.f41519a.getSharedPreferences("com.google.android.gms.appid", 0);
        c12355g.m34610a();
        C12357i c12357i = c12355g.f41521c;
        String str = c12357i.f41537e;
        if (str == null) {
            c12355g.m34610a();
            str = c12357i.f41534b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.f149832b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m111611a() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f149831a) {
            String strEncodeToString = null;
            String string = this.f149831a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e5) {
                Log.w("ContentValues", "Invalid key stored " + e5);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }
}
