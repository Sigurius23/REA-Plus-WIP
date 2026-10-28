package or2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.time.Instant;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: or2.h1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lor2/h1;", "", "", "defaultVersionName", "", "defaultVersionCode", "<init>", "(Ljava/lang/String;I)V", "Landroid/content/Context;", "context", "Landroid/content/pm/PackageInfo;", "c", "(Landroid/content/Context;)Landroid/content/pm/PackageInfo;", "Ljava/time/Instant;", "b", "(Landroid/content/Context;)Ljava/time/Instant;", "a", "(Landroid/content/Context;)I", "Ljava/lang/String;", "I", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28167h1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String defaultVersionName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int defaultVersionCode;

    public C28167h1(String defaultVersionName, int i13) {
        AbstractC22676k.m65750j(defaultVersionName, "defaultVersionName");
        this.defaultVersionName = defaultVersionName;
        this.defaultVersionCode = i13;
    }

    /* JADX INFO: renamed from: a */
    public final int m85268a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        try {
            return (int) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
        } catch (PackageManager.NameNotFoundException unused) {
            return this.defaultVersionCode;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Instant m85269b(Context context) {
        AbstractC22676k.m65750j(context, "context");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(m85270c(context).lastUpdateTime);
        AbstractC22676k.m65749i(instantOfEpochMilli, "ofEpochMilli(...)");
        return instantOfEpochMilli;
    }

    /* JADX INFO: renamed from: c */
    public final PackageInfo m85270c(Context context) {
        AbstractC22676k.m65750j(context, "context");
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            AbstractC22676k.m65747g(packageInfo);
            return packageInfo;
        } catch (PackageManager.NameNotFoundException unused) {
            PackageInfo packageInfo2 = new PackageInfo();
            packageInfo2.packageName = packageName;
            packageInfo2.versionName = this.defaultVersionName;
            packageInfo2.versionCode = this.defaultVersionCode;
            return packageInfo2;
        }
    }
}
