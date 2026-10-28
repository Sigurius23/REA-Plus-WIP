package p229ip;

import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.AbstractC4988e;
import com.google.android.gms.common.C4989f;
import com.google.android.gms.common.api.AbstractC4980k;
import com.google.android.gms.common.api.C4976g;
import com.google.android.gms.common.api.C4984o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.whoop.service.network.model.UserState;
import org.json.JSONException;
import p012ab.C0682h0;
import p014aj.C0929d;
import p031b9.AbstractC2875y;
import p035bp.C3512c;
import p073cq.C11040i;
import p249jc.C21567b;
import p374oo.AbstractC28052a;
import p402po.C29389f;
import p402po.C29392i;
import p432qo.C30523a;
import p478s3.AbstractC32098d;
import p499t9.C33647p;
import p529uo.AbstractC35135w;
import ro.AbstractC31623h;
import ro.C31617b;
import ro.C31622g;
import ro.C31624i;
import ro.RunnableC31618c;
import to.C33991p;
import to.C33998s0;
import to.C34005x;

/* JADX INFO: renamed from: ip.b */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC20791b extends AbstractBinderC20797h {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f78075g;

    /* JADX INFO: renamed from: h */
    public final Object f78076h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC20791b(int i13, C11040i c11040i) {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback", 0);
        this.f78075g = i13;
        switch (i13) {
            case 1:
                this.f78076h = c11040i;
                super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 0);
                break;
            case 2:
                this.f78076h = c11040i;
                super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback", 0);
                break;
            default:
                this.f78076h = c11040i;
                break;
        }
    }

    @Override // p229ip.AbstractBinderC20797h
    /* JADX INFO: renamed from: k0 */
    public final boolean mo57325k0(int i13, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResultDoWrite;
        BasePendingResult basePendingResultDoWrite2;
        String strM97684e;
        int i14 = this.f78075g;
        Object obj = this.f78076h;
        switch (i14) {
            case 0:
                if (i13 != 1) {
                    return false;
                }
                Status status = (Status) AbstractC20798i.m57334a(parcel, Status.CREATOR);
                C29392i c29392i = (C29392i) AbstractC20798i.m57334a(parcel, C29392i.CREATOR);
                AbstractC20798i.m57335b(parcel);
                AbstractC32098d.m99850q(status, c29392i, (C11040i) obj);
                return true;
            case 1:
                if (i13 != 1) {
                    return false;
                }
                Status status2 = (Status) AbstractC20798i.m57334a(parcel, Status.CREATOR);
                C29389f c29389f = (C29389f) AbstractC20798i.m57334a(parcel, C29389f.CREATOR);
                AbstractC20798i.m57335b(parcel);
                AbstractC32098d.m99850q(status2, c29389f, (C11040i) obj);
                return true;
            case 2:
                if (i13 != 1) {
                    return false;
                }
                Status status3 = (Status) AbstractC20798i.m57334a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) AbstractC20798i.m57334a(parcel, PendingIntent.CREATOR);
                AbstractC20798i.m57335b(parcel);
                AbstractC32098d.m99850q(status3, pendingIntent, (C11040i) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i13 != 1) {
                    if (i13 != 2) {
                        return false;
                    }
                    m57326n0();
                    C31624i.m97695G(revocationBoundService).m97704H();
                    return true;
                }
                m57326n0();
                C31617b c31617bM97679a = C31617b.m97679a(revocationBoundService);
                GoogleSignInAccount googleSignInAccountM97681b = c31617bM97679a.m97681b();
                GoogleSignInOptions googleSignInOptionsM15584b = GoogleSignInOptions.f20451K;
                if (googleSignInAccountM97681b != null) {
                    String strM97684e2 = c31617bM97679a.m97684e("defaultGoogleSignInAccount");
                    if (TextUtils.isEmpty(strM97684e2) || (strM97684e = c31617bM97679a.m97684e(C31617b.m97680f("googleSignInOptions", strM97684e2))) == null) {
                        googleSignInOptionsM15584b = null;
                    } else {
                        try {
                            googleSignInOptionsM15584b = GoogleSignInOptions.m15584b(strM97684e);
                        } catch (JSONException unused) {
                            googleSignInOptionsM15584b = null;
                        }
                    }
                }
                GoogleSignInOptions googleSignInOptions = googleSignInOptionsM15584b;
                AbstractC35135w.m111094f(googleSignInOptions);
                C30523a c30523a = new C30523a((RevocationBoundService) obj, null, AbstractC28052a.f113195a, googleSignInOptions, new C4976g(new C21567b(24), Looper.getMainLooper()));
                int i15 = 6;
                if (googleSignInAccountM97681b == null) {
                    AbstractC4980k abstractC4980kAsGoogleApiClient = c30523a.asGoogleApiClient();
                    Context applicationContext = c30523a.getApplicationContext();
                    boolean z4 = c30523a.m93543d() == 3;
                    C0682h0 c0682h0 = AbstractC31623h.f130662a;
                    if (c0682h0.f2432x <= 3) {
                        Log.d((String) c0682h0.f2433y, ((String) c0682h0.f2434z).concat("Signing out"));
                    }
                    AbstractC31623h.m97693a(applicationContext);
                    if (z4) {
                        basePendingResultDoWrite = new C33991p(abstractC4980kAsGoogleApiClient);
                        basePendingResultDoWrite.m15605a0(Status.f20488E);
                    } else {
                        basePendingResultDoWrite = ((C34005x) abstractC4980kAsGoogleApiClient).f142509b.doWrite(new C31622g(abstractC4980kAsGoogleApiClient, 0));
                    }
                    basePendingResultDoWrite.m15601W(new C33998s0(basePendingResultDoWrite, new C11040i(), new C33647p(i15)));
                    return true;
                }
                AbstractC4980k abstractC4980kAsGoogleApiClient2 = c30523a.asGoogleApiClient();
                Context applicationContext2 = c30523a.getApplicationContext();
                boolean z13 = c30523a.m93543d() == 3;
                C0682h0 c0682h1 = AbstractC31623h.f130662a;
                if (c0682h1.f2432x <= 3) {
                    Log.d((String) c0682h1.f2433y, ((String) c0682h1.f2434z).concat("Revoking access"));
                }
                String strM97684e3 = C31617b.m97679a(applicationContext2).m97684e("refreshToken");
                AbstractC31623h.m97693a(applicationContext2);
                if (!z13) {
                    basePendingResultDoWrite2 = ((C34005x) abstractC4980kAsGoogleApiClient2).f142509b.doWrite(new C31622g(abstractC4980kAsGoogleApiClient2, 1));
                } else if (strM97684e3 == null) {
                    C0682h0 c0682h2 = RunnableC31618c.f130642y;
                    Status status4 = new Status(4, null, null, null);
                    AbstractC35135w.m111090b(!status4.m15593b(), "Status code must not be SUCCESS");
                    basePendingResultDoWrite2 = new C4984o(status4);
                    basePendingResultDoWrite2.m15605a0(status4);
                } else {
                    RunnableC31618c runnableC31618c = new RunnableC31618c(strM97684e3);
                    new Thread(runnableC31618c).start();
                    basePendingResultDoWrite2 = runnableC31618c.f130644x;
                }
                basePendingResultDoWrite2.m15601W(new C33998s0(basePendingResultDoWrite2, new C11040i(), new C33647p(i15)));
                return true;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m57326n0() {
        RevocationBoundService revocationBoundService = (RevocationBoundService) this.f78076h;
        int callingUid = Binder.getCallingUid();
        C0929d c0929dM10398a = C3512c.m10398a(revocationBoundService);
        c0929dM10398a.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) c0929dM10398a.f3422w).getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(callingUid, "com.google.android.gms");
            try {
                PackageInfo packageInfo = revocationBoundService.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C4989f c4989fM15614a = C4989f.m15614a(revocationBoundService);
                c4989fM15614a.getClass();
                if (packageInfo != null) {
                    if (C4989f.m15615c(packageInfo, false)) {
                        return;
                    }
                    if (C4989f.m15615c(packageInfo, true)) {
                        Context context = c4989fM15614a.f20531a;
                        try {
                            if (!AbstractC4988e.f20527c) {
                                PackageInfo packageInfo2 = ((Context) C3512c.m10398a(context).f3422w).getPackageManager().getPackageInfo("com.google.android.gms", 134217792);
                                C4989f.m15614a(context);
                                if (packageInfo2 == null || C4989f.m15615c(packageInfo2, false) || !C4989f.m15615c(packageInfo2, true)) {
                                    AbstractC4988e.f20526b = false;
                                } else {
                                    AbstractC4988e.f20526b = true;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e5) {
                            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e5);
                        } finally {
                            AbstractC4988e.f20527c = true;
                        }
                        if (AbstractC4988e.f20526b || !UserState.Sources.USER.equals(Build.TYPE)) {
                            return;
                        } else {
                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
            throw new SecurityException(AbstractC2875y.m8296i(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        } catch (SecurityException unused2) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC20791b(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 0);
        this.f78075g = 3;
        this.f78076h = revocationBoundService;
    }
}
