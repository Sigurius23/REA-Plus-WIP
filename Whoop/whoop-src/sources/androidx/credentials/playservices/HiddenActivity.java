package androidx.credentials.playservices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import e10.C12554k0;
import e73.C12803b;
import gp.C16053r;
import hm.C17417d;
import mm.C25680d;
import p073cq.InterfaceC11036e;
import p152fp.C14671a;
import p229ip.AbstractC20795f;
import p229ip.C20792c;
import p249jc.C21567b;
import p394p5.C28848e;
import p402po.C29384a;
import p402po.C29385b;
import p402po.C29386c;
import p402po.C29387d;
import p402po.C29388e;
import p402po.C29390g;
import p402po.C29391h;
import p402po.C29395l;
import p402po.C29396m;
import p414q5.AbstractC29978b;
import p529uo.AbstractC35135w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import to.AbstractC33993q;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Landroidx/credentials/playservices/HiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "credentials-play-services-auth_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public class HiddenActivity extends Activity {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f5313y = 0;

    /* JADX INFO: renamed from: w */
    public ResultReceiver f5314w;

    /* JADX INFO: renamed from: x */
    public boolean f5315x;

    /* JADX INFO: renamed from: a */
    public final void m3714a(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i13);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.f5314w;
        if (resultReceiver != null) {
            resultReceiver.send(i14, bundle);
        }
        this.f5315x = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f5314w = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle != null) {
            this.f5315x = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.f5315x) {
            return;
        }
        if (stringExtra != null) {
            Task taskAddOnFailureListener = null;
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        C29388e c29388e = (C29388e) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (c29388e != null) {
                            C20792c c20792c = new C20792c(this, new C29396m());
                            new C29384a(false, null, null, true, null, null, false);
                            C29384a c29384a = c29388e.f119216x;
                            AbstractC35135w.m111094f(c29384a);
                            C29387d c29387d = c29388e.f119215w;
                            AbstractC35135w.m111094f(c29387d);
                            C29386c c29386c = c29388e.f119212F;
                            AbstractC35135w.m111094f(c29386c);
                            C29385b c29385b = c29388e.f119213G;
                            AbstractC35135w.m111094f(c29385b);
                            C29388e c29388e2 = new C29388e(c29387d, c29384a, c20792c.f78079a, c29388e.f119218z, c29388e.f119211E, c29386c, c29385b, c29388e.f119214H);
                            C12803b c12803bM107465a = AbstractC33993q.m107465a();
                            c12803bM107465a.f43825c = new C4986c[]{new C4986c("auth_api_credentials_begin_sign_in", 8L)};
                            c12803bM107465a.f43827e = new C17417d(c20792c, c29388e2, 15);
                            c12803bM107465a.f43824b = false;
                            c12803bM107465a.f43826d = 1553;
                            Task taskAddOnSuccessListener = c20792c.doRead(c12803bM107465a.m35864g()).addOnSuccessListener(new C25680d(new C28848e(this, intExtra, 0), 18));
                            final int i13 = 3;
                            taskAddOnFailureListener = taskAddOnSuccessListener.addOnFailureListener(new InterfaceC11036e(this) { // from class: p5.d

                                /* JADX INFO: renamed from: x */
                                public final /* synthetic */ HiddenActivity f116767x;

                                {
                                    this.f116767x = this;
                                }

                                @Override // p073cq.InterfaceC11036e
                                /* JADX INFO: renamed from: n */
                                public final void mo1681n(Exception e5) {
                                    String str;
                                    String str2;
                                    int i14 = i13;
                                    HiddenActivity this$0 = this.f116767x;
                                    switch (i14) {
                                        case 0:
                                            int i15 = HiddenActivity.f5313y;
                                            AbstractC22676k.m65750j(this$0, "this$0");
                                            AbstractC22676k.m65750j(e5, "e");
                                            str = ((e5 instanceof ApiException) && AbstractC29978b.f122438b.contains(Integer.valueOf(((ApiException) e5).f20483w.f20493w))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver2 = this$0.f5314w;
                                            AbstractC22676k.m65747g(resultReceiver2);
                                            this$0.m3714a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e5.getMessage());
                                            break;
                                        case 1:
                                            int i16 = HiddenActivity.f5313y;
                                            AbstractC22676k.m65750j(this$0, "this$0");
                                            AbstractC22676k.m65750j(e5, "e");
                                            str = ((e5 instanceof ApiException) && AbstractC29978b.f122438b.contains(Integer.valueOf(((ApiException) e5).f20483w.f20493w))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver3 = this$0.f5314w;
                                            AbstractC22676k.m65747g(resultReceiver3);
                                            this$0.m3714a(resultReceiver3, str, "During save password, found password failure response from one tap " + e5.getMessage());
                                            break;
                                        case 2:
                                            int i17 = HiddenActivity.f5313y;
                                            AbstractC22676k.m65750j(this$0, "this$0");
                                            AbstractC22676k.m65750j(e5, "e");
                                            str2 = ((e5 instanceof ApiException) && AbstractC29978b.f122438b.contains(Integer.valueOf(((ApiException) e5).f20483w.f20493w))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver4 = this$0.f5314w;
                                            AbstractC22676k.m65747g(resultReceiver4);
                                            this$0.m3714a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e5.getMessage());
                                            break;
                                        default:
                                            int i18 = HiddenActivity.f5313y;
                                            AbstractC22676k.m65750j(this$0, "this$0");
                                            AbstractC22676k.m65750j(e5, "e");
                                            str2 = ((e5 instanceof ApiException) && AbstractC29978b.f122438b.contains(Integer.valueOf(((ApiException) e5).f20483w.f20493w))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver5 = this$0.f5314w;
                                            AbstractC22676k.m65747g(resultReceiver5);
                                            this$0.m3714a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e5.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (taskAddOnFailureListener == null) {
                            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        C16053r c16053r = (C16053r) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra2 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (c16053r != null) {
                            C14671a c14671a = new C14671a(this, C14671a.f54176a, new C21567b(24));
                            C12803b c12803bM107465a2 = AbstractC33993q.m107465a();
                            c12803bM107465a2.f43827e = new C12554k0(c14671a, c16053r);
                            c12803bM107465a2.f43826d = 5407;
                            Task taskAddOnSuccessListener2 = c14671a.doRead(c12803bM107465a2.m35864g()).addOnSuccessListener(new C25680d(new C28848e(this, intExtra2, 2), 15));
                            final int i14 = 0;
                            taskAddOnFailureListener = taskAddOnSuccessListener2.addOnFailureListener(new InterfaceC11036e(this) { // from class: p5.d

                                /* JADX INFO: renamed from: x */
                                public final /* synthetic */ HiddenActivity f116767x;

                                {
                                    this.f116767x = this;
                                }

                                @Override // p073cq.InterfaceC11036e
                                /* JADX INFO: renamed from: n */
                                public final void mo1681n(Exception e5) {
                                    String str;
                                    String str2;
                                    int i15 = i14;
                                    HiddenActivity this$0 = this.f116767x;
                                    switch (i15) {
                                        case 0:
                                            int i16 = HiddenActivity.f5313y;
                                            AbstractC22676k.m65750j(this$0, "this$0");
                                            AbstractC22676k.m65750j(e5, "e");
                                            str = ((e5 instanceof ApiException) && AbstractC29978b.f122438b.contains(Integer.valueOf(((ApiException) e5).f20483w.f20493w))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver2 = this$0.f5314w;
                                            AbstractC22676k.m65747g(resultReceiver2);
                                            this$0.m3714a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e5.getMessage());
                                            break;
                                        case 1:
                                            int i17 = HiddenActivity.f5313y;
                                            AbstractC22676k.m65750j(this$0, "this$0");
                                            AbstractC22676k.m65750j(e5, "e");
                                            str = ((e5 instanceof ApiException) && AbstractC29978b.f122438b.contains(Integer.valueOf(((ApiException) e5).f20483w.f20493w))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver3 = this$0.f5314w;
                                            AbstractC22676k.m65747g(resultReceiver3);
                                            this$0.m3714a(resultReceiver3, str, "During save password, found password failure response from one tap " + e5.getMessage());
                                            break;
                                        case 2:
                                            int i18 = HiddenActivity.f5313y;
                                            AbstractC22676k.m65750j(this$0, "this$0");
                                            AbstractC22676k.m65750j(e5, "e");
                                            str2 = ((e5 instanceof ApiException) && AbstractC29978b.f122438b.contains(Integer.valueOf(((ApiException) e5).f20483w.f20493w))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver4 = this$0.f5314w;
                                            AbstractC22676k.m65747g(resultReceiver4);
                                            this$0.m3714a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e5.getMessage());
                                            break;
                                        default:
                                            int i19 = HiddenActivity.f5313y;
                                            AbstractC22676k.m65750j(this$0, "this$0");
                                            AbstractC22676k.m65750j(e5, "e");
                                            str2 = ((e5 instanceof ApiException) && AbstractC29978b.f122438b.contains(Integer.valueOf(((ApiException) e5).f20483w.f20493w))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver5 = this$0.f5314w;
                                            AbstractC22676k.m65747g(resultReceiver5);
                                            this$0.m3714a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e5.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (taskAddOnFailureListener == null) {
                            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        C29391h c29391h = (C29391h) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra3 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (c29391h != null) {
                            C20792c c20792c2 = new C20792c(this, new C29395l());
                            C29391h c29391h2 = new C29391h(c29391h.f119226w, c20792c2.f78079a, c29391h.f119228y);
                            C12803b c12803bM107465a3 = AbstractC33993q.m107465a();
                            c12803bM107465a3.f43825c = new C4986c[]{AbstractC20795f.f78084b};
                            c12803bM107465a3.f43827e = new C17417d(c20792c2, c29391h2, 13);
                            c12803bM107465a3.f43824b = false;
                            c12803bM107465a3.f43826d = 1536;
                            Task taskAddOnSuccessListener3 = c20792c2.doRead(c12803bM107465a3.m35864g()).addOnSuccessListener(new C25680d(new C28848e(this, intExtra3, 1), 16));
                            final int i15 = 1;
                            taskAddOnFailureListener = taskAddOnSuccessListener3.addOnFailureListener(new InterfaceC11036e(this) { // from class: p5.d

                                /* JADX INFO: renamed from: x */
                                public final /* synthetic */ HiddenActivity f116767x;

                                {
                                    this.f116767x = this;
                                }

                                @Override // p073cq.InterfaceC11036e
                                /* JADX INFO: renamed from: n */
                                public final void mo1681n(Exception e5) {
                                    String str;
                                    String str2;
                                    int i16 = i15;
                                    HiddenActivity this$0 = this.f116767x;
                                    switch (i16) {
                                        case 0:
                                            int i17 = HiddenActivity.f5313y;
                                            AbstractC22676k.m65750j(this$0, "this$0");
                                            AbstractC22676k.m65750j(e5, "e");
                                            str = ((e5 instanceof ApiException) && AbstractC29978b.f122438b.contains(Integer.valueOf(((ApiException) e5).f20483w.f20493w))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver2 = this$0.f5314w;
                                            AbstractC22676k.m65747g(resultReceiver2);
                                            this$0.m3714a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e5.getMessage());
                                            break;
                                        case 1:
                                            int i18 = HiddenActivity.f5313y;
                                            AbstractC22676k.m65750j(this$0, "this$0");
                                            AbstractC22676k.m65750j(e5, "e");
                                            str = ((e5 instanceof ApiException) && AbstractC29978b.f122438b.contains(Integer.valueOf(((ApiException) e5).f20483w.f20493w))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver3 = this$0.f5314w;
                                            AbstractC22676k.m65747g(resultReceiver3);
                                            this$0.m3714a(resultReceiver3, str, "During save password, found password failure response from one tap " + e5.getMessage());
                                            break;
                                        case 2:
                                            int i19 = HiddenActivity.f5313y;
                                            AbstractC22676k.m65750j(this$0, "this$0");
                                            AbstractC22676k.m65750j(e5, "e");
                                            str2 = ((e5 instanceof ApiException) && AbstractC29978b.f122438b.contains(Integer.valueOf(((ApiException) e5).f20483w.f20493w))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver4 = this$0.f5314w;
                                            AbstractC22676k.m65747g(resultReceiver4);
                                            this$0.m3714a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e5.getMessage());
                                            break;
                                        default:
                                            int i110 = HiddenActivity.f5313y;
                                            AbstractC22676k.m65750j(this$0, "this$0");
                                            AbstractC22676k.m65750j(e5, "e");
                                            str2 = ((e5 instanceof ApiException) && AbstractC29978b.f122438b.contains(Integer.valueOf(((ApiException) e5).f20483w.f20493w))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver5 = this$0.f5314w;
                                            AbstractC22676k.m65747g(resultReceiver5);
                                            this$0.m3714a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e5.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (taskAddOnFailureListener == null) {
                            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        C29390g c29390g = (C29390g) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra4 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (c29390g != null) {
                            C20792c c20792c3 = new C20792c(this, new C29396m());
                            String str = c29390g.f119222w;
                            AbstractC35135w.m111094f(str);
                            String str2 = c29390g.f119225z;
                            C29390g c29390g2 = new C29390g(str, c29390g.f119223x, c20792c3.f78079a, str2, c29390g.f119220E, c29390g.f119221F);
                            C12803b c12803bM107465a4 = AbstractC33993q.m107465a();
                            c12803bM107465a4.f43825c = new C4986c[]{AbstractC20795f.f78085c};
                            c12803bM107465a4.f43827e = new C17417d(c20792c3, c29390g2, 16);
                            c12803bM107465a4.f43826d = 1555;
                            Task taskAddOnSuccessListener4 = c20792c3.doRead(c12803bM107465a4.m35864g()).addOnSuccessListener(new C25680d(new C28848e(this, intExtra4, 3), 17));
                            final int i16 = 2;
                            taskAddOnFailureListener = taskAddOnSuccessListener4.addOnFailureListener(new InterfaceC11036e(this) { // from class: p5.d

                                /* JADX INFO: renamed from: x */
                                public final /* synthetic */ HiddenActivity f116767x;

                                {
                                    this.f116767x = this;
                                }

                                @Override // p073cq.InterfaceC11036e
                                /* JADX INFO: renamed from: n */
                                public final void mo1681n(Exception e5) {
                                    String str3;
                                    String str4;
                                    int i17 = i16;
                                    HiddenActivity this$0 = this.f116767x;
                                    switch (i17) {
                                        case 0:
                                            int i18 = HiddenActivity.f5313y;
                                            AbstractC22676k.m65750j(this$0, "this$0");
                                            AbstractC22676k.m65750j(e5, "e");
                                            str3 = ((e5 instanceof ApiException) && AbstractC29978b.f122438b.contains(Integer.valueOf(((ApiException) e5).f20483w.f20493w))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver2 = this$0.f5314w;
                                            AbstractC22676k.m65747g(resultReceiver2);
                                            this$0.m3714a(resultReceiver2, str3, "During create public key credential, fido registration failure: " + e5.getMessage());
                                            break;
                                        case 1:
                                            int i19 = HiddenActivity.f5313y;
                                            AbstractC22676k.m65750j(this$0, "this$0");
                                            AbstractC22676k.m65750j(e5, "e");
                                            str3 = ((e5 instanceof ApiException) && AbstractC29978b.f122438b.contains(Integer.valueOf(((ApiException) e5).f20483w.f20493w))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver3 = this$0.f5314w;
                                            AbstractC22676k.m65747g(resultReceiver3);
                                            this$0.m3714a(resultReceiver3, str3, "During save password, found password failure response from one tap " + e5.getMessage());
                                            break;
                                        case 2:
                                            int i110 = HiddenActivity.f5313y;
                                            AbstractC22676k.m65750j(this$0, "this$0");
                                            AbstractC22676k.m65750j(e5, "e");
                                            str4 = ((e5 instanceof ApiException) && AbstractC29978b.f122438b.contains(Integer.valueOf(((ApiException) e5).f20483w.f20493w))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver4 = this$0.f5314w;
                                            AbstractC22676k.m65747g(resultReceiver4);
                                            this$0.m3714a(resultReceiver4, str4, "During get sign-in intent, failure response from one tap: " + e5.getMessage());
                                            break;
                                        default:
                                            int i111 = HiddenActivity.f5313y;
                                            AbstractC22676k.m65750j(this$0, "this$0");
                                            AbstractC22676k.m65750j(e5, "e");
                                            str4 = ((e5 instanceof ApiException) && AbstractC29978b.f122438b.contains(Integer.valueOf(((ApiException) e5).f20483w.f20493w))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver5 = this$0.f5314w;
                                            AbstractC22676k.m65747g(resultReceiver5);
                                            this$0.m3714a(resultReceiver5, str4, "During begin sign in, failure response from one tap: " + e5.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (taskAddOnFailureListener == null) {
                            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        AbstractC22676k.m65750j(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f5315x);
        super.onSaveInstanceState(outState);
    }
}
