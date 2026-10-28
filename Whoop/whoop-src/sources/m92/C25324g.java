package m92;

import android.net.Uri;
import java.util.Iterator;
import live.hms.video.media.tracks.HMSTrackSource;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m92.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lm92/g;", "", "<init>", "()V", "", "destinationJson", "Landroid/net/Uri;", "a", "(Ljava/lang/String;)Landroid/net/Uri;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25324g {

    /* JADX INFO: renamed from: a */
    public static final C25324g f99321a = new C25324g();

    private C25324g() {
    }

    /* JADX INFO: renamed from: a */
    public final Uri m74371a(String destinationJson) throws JSONException {
        AbstractC22676k.m65750j(destinationJson, "destinationJson");
        JSONObject jSONObject = new JSONObject(destinationJson);
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("app.whoop.com").appendPath(jSONObject.getString(HMSTrackSource.SCREEN));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("parameters");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            AbstractC22676k.m65749i(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (AbstractC22676k.m65745e(next, "ai_action")) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject2 != null) {
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                        AbstractC22676k.m65749i(itKeys2, "keys(...)");
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            Object objOpt = jSONObjectOptJSONObject2.opt(next2);
                            if (objOpt != null && !objOpt.equals(JSONObject.NULL)) {
                                builderAppendPath.appendQueryParameter(AbstractC11266d.m30461o("ai_action.", next2), objOpt.toString());
                            }
                        }
                    }
                } else {
                    Object objOpt2 = jSONObjectOptJSONObject.opt(next);
                    if (objOpt2 != null && !objOpt2.equals(JSONObject.NULL)) {
                        builderAppendPath.appendQueryParameter(next, objOpt2.toString());
                    }
                }
            }
        }
        Uri uriBuild = builderAppendPath.build();
        AbstractC22676k.m65749i(uriBuild, "build(...)");
        return uriBuild;
    }
}
