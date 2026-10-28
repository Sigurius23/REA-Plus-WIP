package s40;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import m83.C25272z;
import org.json.JSONObject;
import p474s.AbstractC32004s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s40.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C32144e {

    /* JADX INFO: renamed from: c */
    public static final C32141d f133186c = new C32141d("00", "Stripe Test Bank");

    /* JADX INFO: renamed from: a */
    public final ArrayList f133187a;

    /* JADX INFO: renamed from: b */
    public final boolean f133188b;

    public C32144e(Context context) {
        String next = new Scanner(context.getResources().getAssets().open("au_becs_bsb.json")).useDelimiter("\\A").next();
        AbstractC22676k.m65749i(next, "next(...)");
        Map mapM99544m = AbstractC32004s.m99544m(new JSONObject(next));
        mapM99544m = mapM99544m == null ? C25272z.f99163w : mapM99544m;
        ArrayList arrayList = new ArrayList(mapM99544m.size());
        for (Map.Entry entry : mapM99544m.entrySet()) {
            arrayList.add(new C32141d((String) entry.getKey(), String.valueOf(entry.getValue())));
        }
        this.f133187a = arrayList;
        this.f133188b = true;
    }
}
