package p598wy;

import e93.AbstractC12889b;
import i93.C18283i;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import l83.C23467m;
import m83.AbstractC25243e0;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25271y;
import org.json.JSONArray;
import org.json.JSONObject;
import p442qy.C30767f;
import p474s.AbstractC32004s;
import p505ts.AbstractC34132o;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;
import uo1.C35141b;
import xb3.AbstractC38176k;
import xb3.C38184s;

/* JADX INFO: renamed from: wy.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C37688a implements InterfaceC37689b {
    /* JADX INFO: renamed from: a */
    public static List m121113a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C25271y.f99162w;
        }
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
        Iterator it = c18284jM36278i0.iterator();
        while (((C18283i) it).f71138y) {
            arrayList.add(jSONArray.getString(((AbstractC25243e0) it).nextInt()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static C30767f m121114b(JSONObject jSONObject) {
        Object objM107888l;
        Map mapM73994c0;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("error");
            String strM99551t = AbstractC32004s.m99551t("charge", jSONObject2);
            String strM99551t2 = AbstractC32004s.m99551t("code", jSONObject2);
            String strM99551t3 = AbstractC32004s.m99551t("decline_code", jSONObject2);
            String strM99551t4 = AbstractC32004s.m99551t("message", jSONObject2);
            String strM99551t5 = AbstractC32004s.m99551t("param", jSONObject2);
            String strM99551t6 = AbstractC32004s.m99551t("type", jSONObject2);
            String strM99551t7 = AbstractC32004s.m99551t("doc_url", jSONObject2);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("extra_fields");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                AbstractC22676k.m65749i(itKeys, "keys(...)");
                C38184s c38184sM122272A = AbstractC38176k.m122272A(AbstractC38176k.m122278n(itKeys), new C35141b(jSONObjectOptJSONObject, 22));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = c38184sM122272A.f163498a.iterator();
                while (it.hasNext()) {
                    C23465k c23465k = (C23465k) c38184sM122272A.f163499b.invoke(it.next());
                    linkedHashMap.put(c23465k.f92937w, c23465k.f92938x);
                }
                mapM73994c0 = AbstractC25247g0.m73994c0(linkedHashMap);
            } else {
                mapM73994c0 = null;
            }
            objM107888l = new C30767f(strM99551t6, strM99551t4, strM99551t2, strM99551t5, strM99551t3, strM99551t, strM99551t7, mapM73994c0);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Object c30767f = new C30767f(null, "An improperly formatted error response was found.", null, null, null, null, null, null);
        if (objM107888l instanceof C23467m) {
            objM107888l = c30767f;
        }
        return (C30767f) objM107888l;
    }

    @Override // p598wy.InterfaceC37689b
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ InterfaceC36562b mo8011m(JSONObject jSONObject) {
        return m121114b(jSONObject);
    }
}
