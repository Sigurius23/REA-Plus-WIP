package or2;

import android.net.Uri;
import java.util.Map;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: or2.z */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Landroid/net/Uri$Builder;", "", "shouldAppend", "", "key", "value", "a", "(Landroid/net/Uri$Builder;ZLjava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;", "path", "", "queryParams", "Landroid/net/Uri;", "b", "(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;", "feature_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28219z {
    /* JADX INFO: renamed from: a */
    public static final Uri.Builder m85446a(Uri.Builder builder, boolean z4, String str, String str2) {
        AbstractC22676k.m65750j(builder, "<this>");
        if (z4) {
            builder.appendQueryParameter(str, str2);
        }
        return builder;
    }

    /* JADX INFO: renamed from: b */
    public static final Uri m85447b(String path, Map<String, String> queryParams) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(queryParams, "queryParams");
        Uri.Builder builderPath = new Uri.Builder().scheme("android-app").authority("com.whoop").path(path);
        for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            AbstractC22676k.m65747g(builderPath);
            m85446a(builderPath, value != null, key, value);
        }
        Uri uriBuild = builderPath.build();
        AbstractC22676k.m65749i(uriBuild, "build(...)");
        return uriBuild;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Uri m85448c(String str, Map map, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map = C25272z.f99163w;
        }
        return m85447b(str, map);
    }
}
