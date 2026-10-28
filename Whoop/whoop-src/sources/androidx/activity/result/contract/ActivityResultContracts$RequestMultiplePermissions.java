package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25272z;
import p267k.AbstractC22081b;
import p267k.C22080a;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00040\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"androidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions", "Lk/b;", "", "", "", "", "<init>", "()V", "activity_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class ActivityResultContracts$RequestMultiplePermissions extends AbstractC22081b {
    /* JADX INFO: renamed from: b */
    public static Map m3248b(int i13, Intent intent) {
        if (i13 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i14 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i14 == 0));
                }
                return AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(AbstractC25260n.m74077r0(stringArrayExtra), arrayList));
            }
        }
        return C25272z.f99163w;
    }

    @Override // p267k.AbstractC22081b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C22080a getSynchronousResult(Context context, String[] input) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(input, "input");
        if (input.length == 0) {
            return new C22080a(C25272z.f99163w);
        }
        for (String str : input) {
            if (AbstractC32122c.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        int iM73988W = AbstractC25247g0.m73988W(input.length);
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (String str2 : input) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new C22080a(linkedHashMap);
    }

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        String[] input = (String[]) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
        AbstractC22676k.m65749i(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final /* bridge */ /* synthetic */ Object parseResult(int i13, Intent intent) {
        return m3248b(i13, intent);
    }
}
