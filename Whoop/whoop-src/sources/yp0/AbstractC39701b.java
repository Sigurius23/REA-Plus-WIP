package yp0;

import android.net.Uri;
import org.json.JSONObject;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yp0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m65681d2 = {"", "c", "()Ljava/lang/String;", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "a", "community_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39701b {
    /* JADX INFO: renamed from: a */
    public static final Uri m127034a() {
        Uri uri = Uri.parse("android-app://com.whoop/community");
        AbstractC22676k.m65749i(uri, "parse(...)");
        return uri;
    }

    /* JADX INFO: renamed from: b */
    public static final Uri m127035b() {
        Uri uri = Uri.parse("android-app://com.whoop/top-level-generic?request=" + Uri.encode(m127036c()) + "&selectedTab=COMMUNITY");
        AbstractC22676k.m65749i(uri, "parse(...)");
        return uri;
    }

    /* JADX INFO: renamed from: c */
    public static final String m127036c() {
        String string = new JSONObject().put("path", "followers-service/v1/error/medicare").put("method", "GET").toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }
}
