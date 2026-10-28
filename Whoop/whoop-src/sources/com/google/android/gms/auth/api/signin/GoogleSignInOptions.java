package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.InterfaceC4972c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p026b2.C2298d;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import q30.C29912j0;
import ro.C31616a;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class GoogleSignInOptions extends AbstractC36219a implements InterfaceC4972c, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: K */
    public static final GoogleSignInOptions f20451K;

    /* JADX INFO: renamed from: L */
    public static final Scope f20452L;

    /* JADX INFO: renamed from: M */
    public static final Scope f20453M;

    /* JADX INFO: renamed from: N */
    public static final Scope f20454N;

    /* JADX INFO: renamed from: O */
    public static final C2298d f20455O;

    /* JADX INFO: renamed from: E */
    public final boolean f20456E;

    /* JADX INFO: renamed from: F */
    public final boolean f20457F;

    /* JADX INFO: renamed from: G */
    public final String f20458G;

    /* JADX INFO: renamed from: H */
    public final String f20459H;

    /* JADX INFO: renamed from: I */
    public final ArrayList f20460I;

    /* JADX INFO: renamed from: J */
    public final String f20461J;

    /* JADX INFO: renamed from: w */
    public final int f20462w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f20463x;

    /* JADX INFO: renamed from: y */
    public final Account f20464y;

    /* JADX INFO: renamed from: z */
    public final boolean f20465z;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, NotificationCompat.CATEGORY_EMAIL);
        Scope scope2 = new Scope(1, "openid");
        f20452L = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f20453M = scope3;
        f20454N = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f20454N)) {
            Scope scope4 = f20453M;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f20451K = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f20454N)) {
            Scope scope5 = f20453M;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new C29912j0(6);
        f20455O = new C2298d(28);
    }

    public GoogleSignInOptions(int i13, ArrayList arrayList, Account account, boolean z4, boolean z13, boolean z14, String str, String str2, HashMap map, String str3) {
        this.f20462w = i13;
        this.f20463x = arrayList;
        this.f20464y = account;
        this.f20465z = z4;
        this.f20456E = z13;
        this.f20457F = z14;
        this.f20458G = str;
        this.f20459H = str2;
        this.f20460I = new ArrayList(map.values());
        this.f20461J = str3;
    }

    /* JADX INFO: renamed from: b */
    public static GoogleSignInOptions m15584b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i13 = 0; i13 < length; i13++) {
            hashSet.add(new Scope(1, jSONArray.getString(i13)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    /* JADX INFO: renamed from: f */
    public static HashMap m15585f(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C31616a c31616a = (C31616a) it.next();
                map.put(Integer.valueOf(c31616a.f130636x), c31616a);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.f20458G;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList = googleSignInOptions.f20463x;
            String str2 = googleSignInOptions.f20458G;
            Account account = googleSignInOptions.f20464y;
            if (this.f20460I.isEmpty() && googleSignInOptions.f20460I.isEmpty()) {
                ArrayList arrayList2 = this.f20463x;
                if (arrayList2.size() == new ArrayList(arrayList).size() && arrayList2.containsAll(new ArrayList(arrayList))) {
                    Account account2 = this.f20464y;
                    if (account2 == null) {
                        if (account != null) {
                            return false;
                        }
                    } else if (!account2.equals(account)) {
                        return false;
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    return this.f20457F == googleSignInOptions.f20457F && this.f20465z == googleSignInOptions.f20465z && this.f20456E == googleSignInOptions.f20456E && TextUtils.equals(this.f20461J, googleSignInOptions.f20461J);
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f20463x;
        int size = arrayList2.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(((Scope) arrayList2.get(i13)).f20487x);
        }
        Collections.sort(arrayList);
        int iHashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.f20464y;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.f20458G;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.f20457F ? 1 : 0)) * 31) + (this.f20465z ? 1 : 0)) * 31) + (this.f20456E ? 1 : 0)) * 31;
        String str2 = this.f20461J;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f20462w);
        AbstractC36221c.m115336q(parcel, 2, new ArrayList(this.f20463x));
        AbstractC36221c.m115331l(parcel, 3, this.f20464y, i13);
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(this.f20465z ? 1 : 0);
        AbstractC36221c.m115337r(parcel, 5, 4);
        parcel.writeInt(this.f20456E ? 1 : 0);
        AbstractC36221c.m115337r(parcel, 6, 4);
        parcel.writeInt(this.f20457F ? 1 : 0);
        AbstractC36221c.m115332m(parcel, 7, this.f20458G);
        AbstractC36221c.m115332m(parcel, 8, this.f20459H);
        AbstractC36221c.m115336q(parcel, 9, this.f20460I);
        AbstractC36221c.m115332m(parcel, 10, this.f20461J);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
