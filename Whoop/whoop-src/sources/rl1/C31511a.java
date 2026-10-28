package rl1;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.PushNotificationFeatureFlagsKt;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: rl1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\b\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lrl1/a;", "", "", "androidOSLevel", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(ILcom/whoop/data/repositories/FeatureFlagChecker;)V", "a", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "", "", "b", "Ljava/util/List;", "newBluetoothPermissions", "c", "oldBluetoothPermissions", "d", "()Ljava/util/List;", "requiredPermissions", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31511a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<String> newBluetoothPermissions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<String> oldBluetoothPermissions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<String> requiredPermissions;

    public C31511a(int i13, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
        List<String> listM118959K = AbstractC37056f.m118959K("android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT");
        this.newBluetoothPermissions = listM118959K;
        List<String> listM118959K2 = AbstractC37056f.m118959K("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
        this.oldBluetoothPermissions = listM118959K2;
        if (i13 >= 33 && !featureFlagChecker.isFeatureEnabled(PushNotificationFeatureFlagsKt.PUSH_NOTIFICATIONS_PERMISSION_REQUEST_FIX)) {
            listM118959K = AbstractC25265s.m74128f1("android.permission.POST_NOTIFICATIONS", listM118959K);
        } else if (i13 < 31) {
            listM118959K = listM118959K2;
        }
        this.requiredPermissions = listM118959K;
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m97091a() {
        return this.requiredPermissions;
    }
}
