package androidx.credentials.playservices;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.util.Log;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.AbstractC4980k;
import e73.C12803b;
import hm.C17417d;
import io.getstream.chat.android.p226ui.utils.C19902a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import mm.C25680d;
import p127ev.C13667h;
import p229ip.AbstractC20795f;
import p229ip.C20792c;
import p320m5.AbstractC25057a;
import p320m5.AbstractC25058b;
import p320m5.AbstractC25074r;
import p320m5.C25060d;
import p320m5.C25067k;
import p320m5.C25070n;
import p320m5.C25072p;
import p320m5.InterfaceC25063g;
import p320m5.InterfaceC25065i;
import p394p5.C28845b;
import p394p5.C28846c;
import p402po.C29384a;
import p402po.C29385b;
import p402po.C29386c;
import p402po.C29387d;
import p402po.C29388e;
import p402po.C29391h;
import p402po.C29394k;
import p402po.C29396m;
import p414q5.AbstractC29978b;
import p450r5.C30931e;
import p480s5.C32198a;
import p529uo.AbstractC35135w;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import to.AbstractC33993q;
import to.C33971f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R(\u0010%\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006/"}, m65681d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Lm5/i;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isGooglePlayServicesAvailable", "(Landroid/content/Context;)I", "Lm5/n;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Lm5/g;", "Lm5/o;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "Ll83/a0;", "onGetCredential", "(Landroid/content/Context;Lm5/n;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V", "Lm5/b;", "Lm5/c;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onCreateCredential", "(Landroid/content/Context;Lm5/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V", "", "isAvailableOnDevice", "()Z", "Lm5/a;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Lm5/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V", "Landroid/content/Context;", "Lcom/google/android/gms/common/GoogleApiAvailability;", "googleApiAvailability", "Lcom/google/android/gms/common/GoogleApiAvailability;", "getGoogleApiAvailability", "()Lcom/google/android/gms/common/GoogleApiAvailability;", "setGoogleApiAvailability", "(Lcom/google/android/gms/common/GoogleApiAvailability;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "p5/b", "credentials-play-services-auth_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class CredentialProviderPlayServicesImpl implements InterfaceC25065i {
    public static final C28845b Companion = new C28845b();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private GoogleApiAvailability googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        AbstractC22676k.m65749i(googleApiAvailability, "getInstance()");
        this.googleApiAvailability = googleApiAvailability;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context) {
        return this.googleApiAvailability.isGooglePlayServicesAvailable(context, MIN_GMS_APK_VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0(Function1 tmp0, Object obj) {
        AbstractC22676k.m65750j(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl this$0, CancellationSignal cancellationSignal, Executor executor, InterfaceC25063g callback, Exception e5) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(executor, "$executor");
        AbstractC22676k.m65750j(callback, "$callback");
        AbstractC22676k.m65750j(e5, "e");
        C28845b c28845b = Companion;
        C13667h c13667h = new C13667h(e5, executor, callback, 5);
        c28845b.getClass();
        if (C28845b.m87735a(cancellationSignal)) {
            return;
        }
        c13667h.invoke();
    }

    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // p320m5.InterfaceC25065i
    public boolean isAvailableOnDevice() {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        boolean z4 = iIsGooglePlayServicesAvailable == 0;
        if (!z4) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new C4969a(iIsGooglePlayServicesAvailable));
        }
        return z4;
    }

    public void onClearCredential(AbstractC25057a request, CancellationSignal cancellationSignal, Executor executor, InterfaceC25063g callback) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(executor, "executor");
        AbstractC22676k.m65750j(callback, "callback");
        Companion.getClass();
        if (C28845b.m87735a(cancellationSignal)) {
            return;
        }
        Context context = this.context;
        AbstractC35135w.m111094f(context);
        C20792c c20792c = new C20792c(context, new C29396m());
        c20792c.getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = AbstractC4980k.f20514a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((AbstractC4980k) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C33971f.m107427a();
        C12803b c12803bM107465a = AbstractC33993q.m107465a();
        c12803bM107465a.f43825c = new C4986c[]{AbstractC20795f.f78083a};
        c12803bM107465a.f43827e = new C17417d(c20792c, 14);
        c12803bM107465a.f43824b = false;
        c12803bM107465a.f43826d = 1554;
        c20792c.doWrite(c12803bM107465a.m35864g()).addOnSuccessListener(new C25680d(new C28846c(cancellationSignal, executor, callback), 14)).addOnFailureListener(new C19902a(this, cancellationSignal, executor, callback, 3));
    }

    @Override // p320m5.InterfaceC25065i
    public void onCreateCredential(Context context, AbstractC25058b request, CancellationSignal cancellationSignal, Executor executor, InterfaceC25063g callback) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(executor, "executor");
        AbstractC22676k.m65750j(callback, "callback");
        Companion.getClass();
        if (C28845b.m87735a(cancellationSignal)) {
            return;
        }
        if (!(request instanceof C25060d)) {
            throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
        }
        C32198a c32198a = new C32198a(context);
        C25060d c25060d = (C25060d) request;
        c32198a.f133337g = cancellationSignal;
        c32198a.f133335e = callback;
        c32198a.f133336f = executor;
        if (C28845b.m87735a(cancellationSignal)) {
            return;
        }
        C29391h c29391h = new C29391h(new C29394k(c25060d.f98193d, c25060d.f98194e), null, 0);
        Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
        intent.putExtra("REQUEST_TYPE", c29391h);
        AbstractC29978b.m91694b(c32198a.f133338h, intent, "CREATE_PASSWORD");
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            AbstractC29978b.m91693a(cancellationSignal, new C25067k(c32198a, 5));
        }
    }

    public void onGetCredential(Context context, AbstractC25074r pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, InterfaceC25063g callback) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        AbstractC22676k.m65750j(executor, "executor");
        AbstractC22676k.m65750j(callback, "callback");
    }

    public void onPrepareCredential(C25070n request, CancellationSignal cancellationSignal, Executor executor, InterfaceC25063g callback) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(executor, "executor");
        AbstractC22676k.m65750j(callback, "callback");
    }

    public final void setGoogleApiAvailability(GoogleApiAvailability googleApiAvailability) {
        AbstractC22676k.m65750j(googleApiAvailability, "<set-?>");
        this.googleApiAvailability = googleApiAvailability;
    }

    @Override // p320m5.InterfaceC25065i
    public void onGetCredential(Context context, C25070n request, CancellationSignal cancellationSignal, Executor executor, InterfaceC25063g callback) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(request, "request");
        List<C25072p> list = request.f98202a;
        AbstractC22676k.m65750j(executor, "executor");
        AbstractC22676k.m65750j(callback, "callback");
        Companion.getClass();
        if (C28845b.m87735a(cancellationSignal)) {
            return;
        }
        for (C25072p c25072p : list) {
        }
        C30931e c30931e = new C30931e(context);
        c30931e.f127635h = cancellationSignal;
        c30931e.f127633f = callback;
        c30931e.f127634g = executor;
        Companion.getClass();
        if (C28845b.m87735a(cancellationSignal)) {
            return;
        }
        C29387d c29387d = new C29387d(false);
        C29384a c29384a = new C29384a(false, null, null, true, null, null, false);
        C29386c c29386c = new C29386c(false, null, null);
        C29385b c29385b = new C29385b(false, null);
        PackageManager packageManager = context.getPackageManager();
        AbstractC22676k.m65749i(packageManager, "context.packageManager");
        int i13 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        Iterator it = list.iterator();
        C29387d c29387d2 = c29387d;
        while (it.hasNext()) {
            if (((C25072p) it.next()) instanceof C25072p) {
                c29387d2 = new C29387d(true);
            }
        }
        C29388e c29388e = new C29388e(c29387d2, c29384a, null, false, 0, c29386c, c29385b, false);
        Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
        intent.putExtra("REQUEST_TYPE", c29388e);
        AbstractC29978b.m91694b(c30931e.f127636i, intent, "BEGIN_SIGN_IN");
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            AbstractC29978b.m91693a(cancellationSignal, new C25067k(c30931e, 4));
        }
    }
}
