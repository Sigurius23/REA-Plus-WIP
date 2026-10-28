package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import q30.C29912j0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractC36219a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C29912j0(5);

    /* JADX INFO: renamed from: E */
    public final Uri f20439E;

    /* JADX INFO: renamed from: F */
    public String f20440F;

    /* JADX INFO: renamed from: G */
    public final long f20441G;

    /* JADX INFO: renamed from: H */
    public final String f20442H;

    /* JADX INFO: renamed from: I */
    public final List f20443I;

    /* JADX INFO: renamed from: J */
    public final String f20444J;

    /* JADX INFO: renamed from: K */
    public final String f20445K;

    /* JADX INFO: renamed from: L */
    public final HashSet f20446L = new HashSet();

    /* JADX INFO: renamed from: w */
    public final String f20447w;

    /* JADX INFO: renamed from: x */
    public final String f20448x;

    /* JADX INFO: renamed from: y */
    public final String f20449y;

    /* JADX INFO: renamed from: z */
    public final String f20450z;

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j7, String str6, ArrayList arrayList, String str7, String str8) {
        this.f20447w = str;
        this.f20448x = str2;
        this.f20449y = str3;
        this.f20450z = str4;
        this.f20439E = uri;
        this.f20440F = str5;
        this.f20441G = j7;
        this.f20442H = str6;
        this.f20443I = arrayList;
        this.f20444J = str7;
        this.f20445K = str8;
    }

    /* JADX INFO: renamed from: b */
    public static GoogleSignInAccount m15583b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j7 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i13 = 0; i13 < length; i13++) {
            hashSet.add(new Scope(1, jSONArray.getString(i13)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has(NotificationCompat.CATEGORY_EMAIL) ? jSONObject.optString(NotificationCompat.CATEGORY_EMAIL) : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        AbstractC35135w.m111092d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j7, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f20440F = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f20442H.equals(this.f20442H)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f20443I);
        hashSet.addAll(googleSignInAccount.f20446L);
        HashSet hashSet2 = new HashSet(this.f20443I);
        hashSet2.addAll(this.f20446L);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f20442H.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f20443I);
        hashSet.addAll(this.f20446L);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f20447w);
        AbstractC36221c.m115332m(parcel, 3, this.f20448x);
        AbstractC36221c.m115332m(parcel, 4, this.f20449y);
        AbstractC36221c.m115332m(parcel, 5, this.f20450z);
        AbstractC36221c.m115331l(parcel, 6, this.f20439E, i13);
        AbstractC36221c.m115332m(parcel, 7, this.f20440F);
        AbstractC36221c.m115337r(parcel, 8, 8);
        parcel.writeLong(this.f20441G);
        AbstractC36221c.m115332m(parcel, 9, this.f20442H);
        AbstractC36221c.m115336q(parcel, 10, this.f20443I);
        AbstractC36221c.m115332m(parcel, 11, this.f20444J);
        AbstractC36221c.m115332m(parcel, 12, this.f20445K);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
