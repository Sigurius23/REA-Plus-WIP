package z00;

import e93.AbstractC12889b;
import i93.C18283i;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23467m;
import m83.AbstractC25243e0;
import m83.C25271y;
import org.json.JSONArray;
import org.json.JSONObject;
import p505ts.AbstractC34132o;
import p565vy.InterfaceC36562b;
import p598wy.InterfaceC37689b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C39015z5;

/* JADX INFO: renamed from: z00.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C39937f implements InterfaceC37689b {

    /* JADX INFO: renamed from: w */
    public static final C39932a f172387w = new C39932a(29);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l83.m] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // p598wy.InterfaceC37689b
    /* JADX INFO: renamed from: m */
    public final InterfaceC36562b mo8011m(JSONObject jSONObject) {
        ?? M107888l;
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray.length());
            M107888l = new ArrayList();
            Iterator it = c18284jM36278i0.iterator();
            while (((C18283i) it).f71138y) {
                int iNextInt = ((AbstractC25243e0) it).nextInt();
                C39932a c39932a = f172387w;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(iNextInt);
                AbstractC22676k.m65749i(jSONObjectOptJSONObject, "optJSONObject(...)");
                M107888l.add(c39932a.m128096d(jSONObjectOptJSONObject));
            }
        } catch (Throwable th3) {
            M107888l = AbstractC34132o.m107888l(th3);
        }
        boolean z4 = M107888l instanceof C23467m;
        ?? r10 = M107888l;
        if (z4) {
            r10 = C25271y.f99162w;
        }
        return new C39015z5((List) r10);
    }
}
