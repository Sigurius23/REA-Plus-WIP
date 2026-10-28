package ro;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p026b2.C2298d;
import p031b9.AbstractC2875y;
import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: ro.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C31617b {

    /* JADX INFO: renamed from: c */
    public static final ReentrantLock f130638c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public static C31617b f130639d;

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f130640a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f130641b;

    public C31617b(Context context) {
        this.f130641b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* JADX INFO: renamed from: a */
    public static C31617b m97679a(Context context) {
        AbstractC35135w.m111094f(context);
        ReentrantLock reentrantLock = f130638c;
        reentrantLock.lock();
        try {
            if (f130639d == null) {
                f130639d = new C31617b(context.getApplicationContext());
            }
            return f130639d;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: f */
    public static final String m97680f(String str, String str2) {
        return AbstractC2875y.m8304q(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    /* JADX INFO: renamed from: b */
    public final GoogleSignInAccount m97681b() {
        String strM97684e;
        String strM97684e2 = m97684e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strM97684e2) && (strM97684e = m97684e(m97680f("googleSignInAccount", strM97684e2))) != null) {
            try {
                return GoogleSignInAccount.m15583b(strM97684e);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m97682c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        AbstractC35135w.m111094f(googleSignInAccount);
        AbstractC35135w.m111094f(googleSignInOptions);
        String str = googleSignInAccount.f20442H;
        m97683d("defaultGoogleSignInAccount", str);
        String strM97680f = m97680f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f20447w;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f20448x;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f20449y;
            if (str4 != null) {
                jSONObject.put(NotificationCompat.CATEGORY_EMAIL, str4);
            }
            String str5 = googleSignInAccount.f20450z;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f20444J;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f20445K;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f20439E;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f20440F;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f20441G);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.f20443I;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C2298d.f9100x);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f20487x);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            m97683d(strM97680f, jSONObject.toString());
            String strM97680f2 = m97680f("googleSignInOptions", str);
            String str9 = googleSignInOptions.f20459H;
            String str10 = googleSignInOptions.f20458G;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList = googleSignInOptions.f20463x;
                Collections.sort(arrayList, GoogleSignInOptions.f20455O);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f20487x);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f20464y;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f20465z);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f20457F);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f20456E);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                m97683d(strM97680f2, jSONObject2.toString());
            } catch (JSONException e5) {
                throw new RuntimeException(e5);
            }
        } catch (JSONException e13) {
            throw new RuntimeException(e13);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m97683d(String str, String str2) {
        ReentrantLock reentrantLock = this.f130640a;
        reentrantLock.lock();
        try {
            this.f130641b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m97684e(String str) {
        ReentrantLock reentrantLock = this.f130640a;
        reentrantLock.lock();
        try {
            return this.f130641b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
