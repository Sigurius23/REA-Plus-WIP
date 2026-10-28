package zd3;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC1340r0;
import com.whoop.service.network.model.UserSessionDto;
import cx.C11175k;
import ec3.C13081r1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
import p038bx.AbstractC3686a;
import p695zx.C41185g;
import p695zx.InterfaceC41184f;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: zd3.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C40580x implements InterfaceC40564h, InterfaceC41184f {

    /* JADX INFO: renamed from: w */
    public Object f174776w;

    public C40580x(C40574r c40574r) {
        this.f174776w = c40574r;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m131566n(Bundle bundle) {
        return UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE.equals(bundle.getString("gcm.n.e")) || UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE.equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    /* JADX INFO: renamed from: q */
    public static String m131567q(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // zd3.InterfaceC40564h
    /* JADX INFO: renamed from: a */
    public C40572p mo131541a() throws Throwable {
        IOException iOException = null;
        while (!((C40574r) this.f174776w).f174757l.f174718R) {
            try {
                InterfaceC40578v interfaceC40578vM131561b = ((C40574r) this.f174776w).m131561b();
                if (!interfaceC40578vM131561b.mo131523b()) {
                    C40577u c40577uMo131526g = interfaceC40578vM131561b.mo131526g();
                    if (c40577uMo131526g.f174766b == null && c40577uMo131526g.f174767c == null) {
                        c40577uMo131526g = interfaceC40578vM131561b.mo131524d();
                    }
                    InterfaceC40578v interfaceC40578v = c40577uMo131526g.f174766b;
                    Throwable th3 = c40577uMo131526g.f174767c;
                    if (th3 != null) {
                        throw th3;
                    }
                    if (interfaceC40578v != null) {
                        ((C40574r) this.f174776w).f174762q.addFirst(interfaceC40578v);
                    }
                }
                return interfaceC40578vM131561b.mo131522a();
            } catch (IOException e5) {
                if (iOException == null) {
                    iOException = e5;
                } else {
                    AbstractC29125c.m88530g(iOException, e5);
                }
                if (!((C40574r) this.f174776w).m131560a(null)) {
                    throw iOException;
                }
            }
        }
        throw new IOException("Canceled");
    }

    @Override // zd3.InterfaceC40564h
    /* JADX INFO: renamed from: b */
    public C40574r mo131542b() {
        return (C40574r) this.f174776w;
    }

    /* JADX INFO: renamed from: c */
    public boolean m131568c(String str) {
        String strM131576l = m131576l(str);
        return UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE.equals(strM131576l) || Boolean.parseBoolean(strM131576l);
    }

    @Override // p695zx.InterfaceC41184f
    /* JADX INFO: renamed from: d */
    public Object mo102860d(C41185g c41185g, InterfaceC30057d interfaceC30057d) {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Integer m131569e(String str) {
        String strM131576l = m131576l(str);
        if (TextUtils.isEmpty(strM131576l)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strM131576l));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m131567q(str) + "(" + strM131576l + ") into an int");
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public JSONArray m131570f(String str) {
        String strM131576l = m131576l(str);
        if (TextUtils.isEmpty(strM131576l)) {
            return null;
        }
        try {
            return new JSONArray(strM131576l);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + m131567q(str) + ": " + strM131576l + ", falling back to default");
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public int[] m131571g() {
        JSONArray jSONArrayM131570f = m131570f("gcm.n.light_settings");
        if (jSONArrayM131570f == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayM131570f.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayM131570f.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayM131570f.optInt(1);
            iArr[2] = jSONArrayM131570f.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e5) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayM131570f + ". " + e5.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayM131570f + ". Skipping setting LightSettings");
            return null;
        }
    }

    @Override // p695zx.InterfaceC41184f
    public C13081r1 getLoading() {
        return (C13081r1) this.f174776w;
    }

    /* JADX INFO: renamed from: h */
    public Object[] m131572h(String str) {
        JSONArray jSONArrayM131570f = m131570f(str.concat("_loc_args"));
        if (jSONArrayM131570f == null) {
            return null;
        }
        int length = jSONArrayM131570f.length();
        String[] strArr = new String[length];
        for (int i13 = 0; i13 < length; i13++) {
            strArr[i13] = jSONArrayM131570f.optString(i13);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: i */
    public String m131573i(String str) {
        return m131576l(str.concat("_loc_key"));
    }

    /* JADX INFO: renamed from: j */
    public Long m131574j() {
        String strM131576l = m131576l("gcm.n.event_time");
        if (TextUtils.isEmpty(strM131576l)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strM131576l));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m131567q("gcm.n.event_time") + "(" + strM131576l + ") into a long");
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public String m131575k(Resources resources, String str, String str2) {
        String strM131576l = m131576l(str2);
        if (!TextUtils.isEmpty(strM131576l)) {
            return strM131576l;
        }
        String strM131573i = m131573i(str2);
        if (TextUtils.isEmpty(strM131573i)) {
            return null;
        }
        int identifier = resources.getIdentifier(strM131573i, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m131567q(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrM131572h = m131572h(str2);
        if (objArrM131572h == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrM131572h);
        } catch (MissingFormatArgumentException e5) {
            Log.w("NotificationParams", "Missing format argument for " + m131567q(str2) + ": " + Arrays.toString(objArrM131572h) + " Default value will be used.", e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public String m131576l(String str) {
        Bundle bundle = (Bundle) this.f174776w;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    /* JADX INFO: renamed from: m */
    public long[] m131577m() {
        JSONArray jSONArrayM131570f = m131570f("gcm.n.vibrate_timings");
        if (jSONArrayM131570f == null) {
            return null;
        }
        try {
            if (jSONArrayM131570f.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayM131570f.length();
            long[] jArr = new long[length];
            for (int i13 = 0; i13 < length; i13++) {
                jArr[i13] = jSONArrayM131570f.optLong(i13);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayM131570f + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public Bundle m131578o() {
        Bundle bundle = (Bundle) this.f174776w;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: p */
    public C11175k m131579p(List permissions) {
        AbstractC22676k.m65750j(permissions, "permissions");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        int i13 = Build.VERSION.SDK_INT;
        AbstractActivityC1340r0 abstractActivityC1340r0 = (AbstractActivityC1340r0) this.f174776w;
        int i14 = abstractActivityC1340r0.getApplicationInfo().targetSdkVersion;
        Iterator it = permissions.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (AbstractC3686a.f15055a.contains(str)) {
                linkedHashSet2.add(str);
            } else {
                linkedHashSet.add(str);
            }
        }
        if (linkedHashSet2.contains("android.permission.ACCESS_BACKGROUND_LOCATION") && (i13 == 29 || (i13 == 30 && i14 < 30))) {
            linkedHashSet2.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
            linkedHashSet.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        if (linkedHashSet2.contains("android.permission.POST_NOTIFICATIONS") && i13 >= 33 && i14 >= 33) {
            linkedHashSet2.remove("android.permission.POST_NOTIFICATIONS");
            linkedHashSet.add("android.permission.POST_NOTIFICATIONS");
        }
        C11175k c11175k = new C11175k();
        c11175k.f35776b = -1;
        c11175k.f35779e = new LinkedHashSet();
        c11175k.f35780f = new LinkedHashSet();
        c11175k.f35781g = new LinkedHashSet();
        c11175k.f35782h = new LinkedHashSet();
        c11175k.f35783i = new LinkedHashSet();
        c11175k.f35784j = new LinkedHashSet();
        c11175k.f35785k = new LinkedHashSet();
        c11175k.f35775a = abstractActivityC1340r0;
        c11175k.f35777c = linkedHashSet;
        c11175k.f35778d = linkedHashSet2;
        return c11175k;
    }

    public C40580x(Bundle bundle) {
        if (bundle != null) {
            this.f174776w = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }
}
