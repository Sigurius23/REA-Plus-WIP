package androidx.health.connect.client.contracts;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.health.connect.client.permission.HealthDataRequestPermissionsInternal;
import androidx.health.connect.client.permission.platform.HealthDataRequestPermissionsUpsideDownCake;
import java.util.Set;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m65681d2 = {"Landroidx/health/connect/client/contracts/HealthPermissionsRequestContract;", "Lk/b;", "", "", "connect-client_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class HealthPermissionsRequestContract extends AbstractC22081b {

    /* JADX INFO: renamed from: a */
    public final AbstractC22081b f6007a;

    public HealthPermissionsRequestContract(String str) {
        this.f6007a = Build.VERSION.SDK_INT >= 34 ? new HealthDataRequestPermissionsUpsideDownCake() : new HealthDataRequestPermissionsInternal(str);
    }

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        Set input = (Set) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentCreateIntent = this.f6007a.createIntent(context, input);
        AbstractC22676k.m65749i(intentCreateIntent, "delegate.createIntent(context, input)");
        return intentCreateIntent;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        Object result = this.f6007a.parseResult(i13, intent);
        AbstractC22676k.m65749i(result, "delegate.parseResult(resultCode, intent)");
        return (Set) result;
    }

    public HealthPermissionsRequestContract() {
        this("com.google.android.apps.healthdata");
    }
}
