package rj1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import androidx.profileinstaller.ProfileVerifier;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: rj1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m65681d2 = {"Lrj1/a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "packageName", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "", "b", "Ljava/util/Map;", "healthConnectCompatibleApps", "c", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31487a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final int f129732d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Map<String, String> healthConnectCompatibleApps;

    /* JADX INFO: renamed from: rj1.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lrj1/a$a;", "", "<init>", "()V", "", "intentAction", "Landroid/content/Context;", "context", "", "a", "(Ljava/lang/String;Landroid/content/Context;)Ljava/util/Map;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m96983a(String intentAction, Context context) {
            AbstractC22676k.m65750j(intentAction, "intentAction");
            AbstractC22676k.m65750j(context, "context");
            Intent intent = new Intent(intentAction);
            List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(131072L)) : context.getPackageManager().queryIntentActivities(intent, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ);
            AbstractC22676k.m65747g(listQueryIntentActivities);
            List<ResolveInfo> list = listQueryIntentActivities;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (ResolveInfo resolveInfo : list) {
                linkedHashMap.put(resolveInfo.activityInfo.packageName, context.getPackageManager().getApplicationLabel(resolveInfo.activityInfo.applicationInfo).toString());
            }
            return linkedHashMap;
        }

        private Companion() {
        }
    }

    public C31487a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
        this.healthConnectCompatibleApps = C25272z.f99163w;
    }

    /* JADX INFO: renamed from: a */
    public final String m96982a(String packageName) {
        AbstractC22676k.m65750j(packageName, "packageName");
        if (this.healthConnectCompatibleApps.containsKey(packageName)) {
            return this.healthConnectCompatibleApps.get(packageName);
        }
        Map<String, String> mapM96983a = INSTANCE.m96983a("androidx.health.ACTION_SHOW_PERMISSIONS_RATIONALE", this.context);
        this.healthConnectCompatibleApps = mapM96983a;
        return mapM96983a.get(packageName);
    }
}
