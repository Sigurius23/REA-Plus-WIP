package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.AbstractActivityC1340r0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import q30.C29934u0;
import ro.C31617b;
import ro.C31624i;

/* JADX INFO: loaded from: classes6.dex */
@KeepName
public class SignInHubActivity extends AbstractActivityC1340r0 {

    /* JADX INFO: renamed from: F */
    public static boolean f20471F = false;

    /* JADX INFO: renamed from: E */
    public Intent f20472E;

    /* JADX INFO: renamed from: w */
    public boolean f20473w = false;

    /* JADX INFO: renamed from: x */
    public SignInConfiguration f20474x;

    /* JADX INFO: renamed from: y */
    public boolean f20475y;

    /* JADX INFO: renamed from: z */
    public int f20476z;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m15586n(int i13) {
        Status status = new Status(i13, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f20471F = false;
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, android.app.Activity
    public final void onActivityResult(int i13, int i14, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f20473w) {
            return;
        }
        setResult(0);
        if (i13 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f20467x) != null) {
                C31624i c31624iM97695G = C31624i.m97695G(this);
                GoogleSignInOptions googleSignInOptions = this.f20474x.f20470x;
                synchronized (c31624iM97695G) {
                    ((C31617b) c31624iM97695G.f130665x).m97682c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f20475y = true;
                this.f20476z = i14;
                this.f20472E = intent;
                getSupportLoaderManager().mo83608b(0, new C29934u0(this, 11));
                f20471F = false;
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m15586n(intExtra);
                return;
            }
        }
        m15586n(8);
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            m15586n(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            m15586n(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f20474x = signInConfiguration;
        if (bundle != null) {
            boolean z4 = bundle.getBoolean("signingInGoogleApiClients");
            this.f20475y = z4;
            if (z4) {
                this.f20476z = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 == null) {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                } else {
                    this.f20472E = intent2;
                    getSupportLoaderManager().mo83608b(0, new C29934u0(this, 11));
                    f20471F = false;
                    return;
                }
            }
            return;
        }
        if (f20471F) {
            setResult(0);
            m15586n(12502);
            return;
        }
        f20471F = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f20474x);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f20473w = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m15586n(17);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f20471F = false;
    }

    @Override // p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f20475y);
        if (this.f20475y) {
            bundle.putInt("signInResultCode", this.f20476z);
            bundle.putParcelable("signInResultData", this.f20472E);
        }
    }
}
