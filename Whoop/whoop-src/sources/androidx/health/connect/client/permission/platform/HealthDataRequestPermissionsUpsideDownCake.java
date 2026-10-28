package androidx.health.connect.client.permission.platform;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p267k.AbstractC22081b;
import p267k.C22080a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Landroidx/health/connect/client/permission/platform/HealthDataRequestPermissionsUpsideDownCake;", "Lk/b;", "", "", "<init>", "()V", "connect-client_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class HealthDataRequestPermissionsUpsideDownCake extends AbstractC22081b {

    /* JADX INFO: renamed from: a */
    public final ActivityResultContracts$RequestMultiplePermissions f6009a = new ActivityResultContracts$RequestMultiplePermissions();

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        Set input = (Set) obj;
        AbstractC22676k.m65750j(input, "input");
        Set set = input;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!AbstractC39421y.m125930O((String) it.next(), "android.permission.health.", false)) {
                    throw new IllegalArgumentException("Unsupported health connect permission");
                }
            }
        }
        String[] input2 = (String[]) input.toArray(new String[0]);
        this.f6009a.getClass();
        AbstractC22676k.m65750j(input2, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input2);
        AbstractC22676k.m65749i(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final C22080a getSynchronousResult(Context context, Object obj) {
        Set input = (Set) obj;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(input, "input");
        C22080a synchronousResult = this.f6009a.getSynchronousResult(context, (String[]) input.toArray(new String[0]));
        if (synchronousResult == null) {
            return null;
        }
        Object obj2 = synchronousResult.f85638a;
        AbstractC22676k.m65749i(obj2, "result.value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) obj2).entrySet()) {
            Boolean it = (Boolean) entry.getValue();
            AbstractC22676k.m65749i(it, "it");
            if (it.booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new C22080a(linkedHashMap.keySet());
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        this.f6009a.getClass();
        Map mapM3248b = ActivityResultContracts$RequestMultiplePermissions.m3248b(i13, intent);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM3248b.entrySet()) {
            Boolean it = (Boolean) entry.getValue();
            AbstractC22676k.m65749i(it, "it");
            if (it.booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }
}
