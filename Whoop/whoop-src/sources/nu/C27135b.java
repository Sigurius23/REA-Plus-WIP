package nu;

import android.os.Build;
import androidx.core.app.ActivityCompat;
import com.mapbox.common.MapboxCommonLogger;
import com.whoop.realtime.presentation.StartActivityActivity;
import java.util.ArrayList;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nu.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C27135b {

    /* JADX INFO: renamed from: a */
    public final StartActivityActivity f108536a;

    public C27135b(StartActivityActivity startActivityActivity) {
        this.f108536a = startActivityActivity;
    }

    /* JADX INFO: renamed from: a */
    public final void m81596a(StartActivityActivity startActivityActivity) {
        try {
            String[] strArr = startActivityActivity.getPackageManager().getPackageInfo(startActivityActivity.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                boolean zM74056a0 = AbstractC25260n.m74056a0(strArr, "android.permission.ACCESS_BACKGROUND_LOCATION");
                boolean zM74056a1 = AbstractC25260n.m74056a0(strArr, "android.permission.ACCESS_FINE_LOCATION");
                boolean zM74056a2 = AbstractC25260n.m74056a0(strArr, "android.permission.ACCESS_COARSE_LOCATION");
                if (!zM74056a1 && !zM74056a2) {
                    MapboxCommonLogger.INSTANCE.logW$common_release("PermissionsManager", "Location permissions are missing");
                    return;
                }
                m81597b(startActivityActivity, zM74056a1, zM74056a2, zM74056a0);
            }
        } catch (Exception e5) {
            MapboxCommonLogger mapboxCommonLogger = MapboxCommonLogger.INSTANCE;
            String message = e5.getMessage();
            AbstractC22676k.m65747g(message);
            mapboxCommonLogger.logW$common_release("PermissionsManager", message);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m81597b(StartActivityActivity startActivityActivity, boolean z4, boolean z13, boolean z14) {
        ArrayList arrayList = new ArrayList();
        if (z4) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        if (z13) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        if (Build.VERSION.SDK_INT >= 29 && z14) {
            arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        Object[] array = arrayList.toArray(new String[0]);
        AbstractC22676k.m65748h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(startActivityActivity, str)) {
                arrayList2.add(str);
            }
        }
        if (!arrayList2.isEmpty()) {
            this.f108536a.mo24000e(arrayList2);
        }
        ActivityCompat.requestPermissions(startActivityActivity, strArr, 0);
    }
}
