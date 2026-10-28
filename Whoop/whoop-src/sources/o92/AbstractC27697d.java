package o92;

import org.json.JSONException;
import org.json.JSONObject;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o92.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a+\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"", "action", "sendingUserId", "receivingUserId", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27697d {
    /* JADX INFO: renamed from: a */
    public static final String m83721a(String action, String str, String str2) throws JSONException {
        AbstractC22676k.m65750j(action, "action");
        JSONObject jSONObjectPut = new JSONObject().put("name", "Community").put("category", "Community").put("action", action).put("source", "push_notification");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            jSONObject.put("sending_user_id", str);
        }
        if (str2 != null) {
            jSONObject.put("receiving_user_id", str2);
        }
        if (jSONObject.length() > 0) {
            jSONObjectPut.put("properties", jSONObject);
        }
        String string = new JSONObject().put("analyticEvent", jSONObjectPut).toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }
}
