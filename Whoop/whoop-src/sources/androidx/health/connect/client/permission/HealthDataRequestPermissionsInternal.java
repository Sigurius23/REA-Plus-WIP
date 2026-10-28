package androidx.health.connect.client.permission;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import m83.AbstractC25265s;
import m83.C25235a0;
import o63.C27617h;
import p267k.AbstractC22081b;
import p267k.C22080a;
import p274k7.C22237a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x43.AbstractC37978j;
import xb3.AbstractC38176k;
import xb3.C38184s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m65681d2 = {"Landroidx/health/connect/client/permission/HealthDataRequestPermissionsInternal;", "Lk/b;", "", "", "connect-client_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class HealthDataRequestPermissionsInternal extends AbstractC22081b {

    /* JADX INFO: renamed from: a */
    public final String f6008a;

    public HealthDataRequestPermissionsInternal() {
        this.f6008a = "com.google.android.apps.healthdata";
    }

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        Set input = (Set) obj;
        AbstractC22676k.m65750j(input, "input");
        if (input.isEmpty()) {
            throw new IllegalArgumentException("At least one permission is required!");
        }
        C38184s c38184sM122272A = AbstractC38176k.m122272A(AbstractC25265s.m74145r0(input), C22237a.f86656x);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = c38184sM122272A.iterator();
        while (true) {
            C27617h c27617h = (C27617h) it;
            if (!c27617h.hasNext()) {
                break;
            }
            arrayList.add(c27617h.next());
        }
        AbstractC37978j.m121657r("HealthConnectClient", "Requesting " + input.size() + " permissions.");
        Intent intent = new Intent("androidx.health.ACTION_REQUEST_PERMISSIONS");
        intent.putParcelableArrayListExtra("requested_permissions_string", arrayList);
        String str = this.f6008a;
        if (str.length() > 0) {
            intent.setPackage(str);
        }
        return intent;
    }

    @Override // p267k.AbstractC22081b
    public final C22080a getSynchronousResult(Context context, Object obj) {
        Set input = (Set) obj;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(input, "input");
        return null;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        ArrayList parcelableArrayListExtra;
        Set setM122277F = (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("granted_permissions_string")) == null) ? C25235a0.f99113w : AbstractC38176k.m122277F(AbstractC38176k.m122272A(AbstractC25265s.m74145r0(parcelableArrayListExtra), C22237a.f86657y));
        AbstractC37978j.m121657r("HealthConnectClient", "Granted " + setM122277F.size() + " permissions.");
        return setM122277F;
    }

    public HealthDataRequestPermissionsInternal(String str) {
        this.f6008a = str;
    }
}
