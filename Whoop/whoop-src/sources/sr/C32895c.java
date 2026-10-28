package sr;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import androidx.room.ServiceConnectionC1767b0;
import com.google.android.gms.common.C4987d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import p073cq.C11040i;
import p088dc.AbstractC11895b;
import p623xr.AbstractBinderC38621q;
import p623xr.AbstractC38607c;
import p623xr.AbstractRunnableC38625u;
import p623xr.C38606b;
import p623xr.C38620p;
import p623xr.C38624t;
import p623xr.InterfaceC38622r;

/* JADX INFO: renamed from: sr.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C32895c extends AbstractRunnableC38625u {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f137097x = 1;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f137098y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f137099z;

    public C32895c(ServiceConnectionC1767b0 serviceConnectionC1767b0, IBinder iBinder) {
        this.f137098y = iBinder;
        this.f137099z = serviceConnectionC1767b0;
    }

    @Override // p623xr.AbstractRunnableC38625u
    /* JADX INFO: renamed from: b */
    public final void mo103289b() {
        int length;
        String strEncodeToString;
        InterfaceC38622r c38620p;
        int i13 = this.f137097x;
        Object obj = this.f137098y;
        Object obj2 = this.f137099z;
        int i14 = 0;
        switch (i13) {
            case 0:
                Context context = (Context) obj;
                C11040i c11040i = ((C32900h) obj2).f137116c;
                C38624t c38624t = AbstractC38607c.f166108a;
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(C4987d.GOOGLE_PLAY_STORE_PACKAGE, 64);
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo != null && applicationInfo.enabled) {
                        Signature[] signatureArr = packageInfo.signatures;
                        C38624t c38624t2 = AbstractC38607c.f166108a;
                        if (signatureArr == null || (length = signatureArr.length) == 0) {
                            Object[] objArr = new Object[0];
                            c38624t2.getClass();
                            if (Log.isLoggable("PlayCore", 5)) {
                                Log.w("PlayCore", C38624t.m123816c(c38624t2.f166133a, "Play Store package is not signed -- possibly self-built package. Could not verify.", objArr));
                            }
                        } else {
                            ArrayList arrayList = new ArrayList();
                            int i15 = 0;
                            while (true) {
                                if (i15 < length) {
                                    byte[] byteArray = signatureArr[i15].toByteArray();
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
                                            i15++;
                                        }
                                    }
                                    i14 = packageInfo.versionCode;
                                } else {
                                    StringBuilder sb4 = new StringBuilder();
                                    Iterator it = arrayList.iterator();
                                    if (it.hasNext()) {
                                        while (true) {
                                            sb4.append((CharSequence) it.next());
                                            if (it.hasNext()) {
                                                sb4.append((CharSequence) ", ");
                                            }
                                        }
                                    }
                                    String strM31996o = AbstractC11895b.m31996o("Play Store package certs are not valid. Found these sha256 certs: [", sb4.toString(), "].");
                                    Object[] objArr2 = new Object[0];
                                    c38624t2.getClass();
                                    if (Log.isLoggable("PlayCore", 5)) {
                                        Log.w("PlayCore", C38624t.m123816c(c38624t2.f166133a, strM31996o, objArr2));
                                    }
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                c11040i.m29689d(Integer.valueOf(i14));
                break;
            default:
                C38606b c38606b = (C38606b) ((ServiceConnectionC1767b0) obj2).f6963x;
                IBinder iBinder = (IBinder) obj;
                c38606b.f166102i.getClass();
                int i16 = AbstractBinderC38621q.f166132g;
                if (iBinder == null) {
                    c38620p = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                    c38620p = iInterfaceQueryLocalInterface instanceof InterfaceC38622r ? (InterfaceC38622r) iInterfaceQueryLocalInterface : new C38620p(iBinder);
                }
                c38606b.f166107n = c38620p;
                C38624t c38624t3 = c38606b.f166095b;
                c38624t3.m123818b("linkToDeath", new Object[0]);
                try {
                    ((C38620p) c38606b.f166107n).f166131f.linkToDeath(c38606b.f166104k, 0);
                } catch (RemoteException e5) {
                    c38624t3.m123817a(e5, "linkToDeath failed", new Object[0]);
                }
                c38606b.f166100g = false;
                Iterator it3 = c38606b.f166097d.iterator();
                while (it3.hasNext()) {
                    ((Runnable) it3.next()).run();
                }
                c38606b.f166097d.clear();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32895c(C32900h c32900h, C11040i c11040i, Context context) {
        super(c11040i);
        this.f137098y = context;
        this.f137099z = c32900h;
    }
}
