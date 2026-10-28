package p692zt;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: zt.r */
/* JADX INFO: loaded from: classes.dex */
public final class C41114r {

    /* JADX INFO: renamed from: d */
    public static final long f177227d = TimeUnit.DAYS.toMillis(7);

    /* JADX INFO: renamed from: a */
    public final String f177228a;

    /* JADX INFO: renamed from: b */
    public final String f177229b;

    /* JADX INFO: renamed from: c */
    public final long f177230c;

    public C41114r(String str, String str2, long j7) {
        this.f177228a = str;
        this.f177229b = str2;
        this.f177230c = j7;
    }

    /* JADX INFO: renamed from: a */
    public static String m133478a(long j7, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j7);
            return jSONObject.toString();
        } catch (JSONException e5) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C41114r m133479b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C41114r(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C41114r(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e5) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e5);
            return null;
        }
    }
}
