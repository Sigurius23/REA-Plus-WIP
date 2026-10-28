package p532ur;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.common.C4987d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import p087db.C11856j0;
import p088dc.AbstractC11895b;
import p559vr.AbstractC36300j;
import p559vr.C36299i;

/* JADX INFO: renamed from: ur.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C35178g {

    /* JADX INFO: renamed from: c */
    public static final C11856j0 f149290c = new C11856j0("ReviewService", 13);

    /* JADX INFO: renamed from: a */
    public final C36299i f149291a;

    /* JADX INFO: renamed from: b */
    public final String f149292b;

    public C35178g(Context context) {
        String strEncodeToString;
        this.f149292b = context.getPackageName();
        C11856j0 c11856j0 = AbstractC36300j.f155555a;
        try {
            if (!context.getPackageManager().getApplicationInfo(C4987d.GOOGLE_PLAY_STORE_PACKAGE, 0).enabled) {
                c11856j0.m31832r("Play Store package is disabled.", new Object[0]);
                return;
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(C4987d.GOOGLE_PLAY_STORE_PACKAGE, 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    c11856j0.m31832r("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        strEncodeToString = "";
                    }
                    arrayList.add(strEncodeToString);
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        }
                    }
                    this.f149291a = new C36299i(context, f149290c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage(C4987d.GOOGLE_PLAY_STORE_PACKAGE));
                    return;
                }
                StringBuilder sb4 = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb4.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb4.append((CharSequence) ", ");
                        }
                    }
                }
                c11856j0.m31832r(AbstractC11895b.m31996o("Play Store package certs are not valid. Found these sha256 certs: [", sb4.toString(), "]."), new Object[0]);
            } catch (PackageManager.NameNotFoundException unused2) {
                c11856j0.m31832r("Play Store package is not found.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            c11856j0.m31832r("Play Store package is not found.", new Object[0]);
        }
    }
}
