package io.seon.androidsdk.service;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.seon.androidsdk.service.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20681m0 {

    /* JADX INFO: renamed from: a */
    public String[] f77376a;

    /* JADX INFO: renamed from: b */
    public String[] f77377b;

    /* JADX INFO: renamed from: c */
    public HashMap f77378c;

    /* JADX INFO: renamed from: d */
    public String[] f77379d;

    /* JADX INFO: renamed from: e */
    public HashMap f77380e;

    /* JADX INFO: renamed from: f */
    public String[] f77381f;

    /* JADX INFO: renamed from: g */
    public String[] f77382g;

    /* JADX INFO: renamed from: h */
    public String[] f77383h;

    /* JADX INFO: renamed from: i */
    public String[] f77384i;

    /* JADX INFO: renamed from: j */
    public String[] f77385j;

    /* JADX INFO: renamed from: k */
    public String[] f77386k;

    /* JADX INFO: renamed from: l */
    public String[] f77387l;

    /* JADX INFO: renamed from: m */
    public String[] f77388m;

    /* JADX INFO: renamed from: n */
    public String[] f77389n;

    /* JADX INFO: renamed from: o */
    public String[] f77390o;

    /* JADX INFO: renamed from: p */
    public String[] f77391p;

    /* JADX INFO: renamed from: q */
    public String[] f77392q;

    /* JADX INFO: renamed from: r */
    public String[] f77393r;

    /* JADX INFO: renamed from: s */
    public String[] f77394s;

    /* JADX INFO: renamed from: t */
    public String[] f77395t;

    /* JADX INFO: renamed from: u */
    public String[] f77396u;

    /* JADX INFO: renamed from: v */
    public String[] f77397v;

    /* JADX INFO: renamed from: w */
    public String[] f77398w;

    /* JADX INFO: renamed from: x */
    public String[] f77399x;

    /* JADX INFO: renamed from: y */
    public String[] f77400y;

    /* JADX INFO: renamed from: a */
    public static Object m56841a(Object obj) throws JSONException {
        if (obj instanceof HashMap) {
            JSONObject jSONObject = new JSONObject();
            HashMap map = (HashMap) obj;
            for (Object obj2 : map.keySet()) {
                jSONObject.put(obj2.toString(), m56841a(map.get(obj2)));
            }
            return jSONObject;
        }
        if (!(obj instanceof Iterable)) {
            return obj;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            jSONArray.put(m56841a(it.next()));
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m56842b(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        if (objArr == null) {
            jSONArray.put(JSONObject.NULL);
            return jSONArray;
        }
        for (Object obj : objArr) {
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("processNames", m56842b(this.f77377b));
            jSONObject.put("qemuDrivers", m56842b(this.f77379d));
            jSONObject.put("propertiesWithSeekValues", m56841a(this.f77380e));
            jSONObject.put("packageNames", m56842b(this.f77381f));
            jSONObject.put("ipValues", m56842b(this.f77382g));
            jSONObject.put("ssidValues", m56842b(this.f77383h));
            jSONObject.put("buildFingerprintFilters", m56842b(this.f77384i));
            jSONObject.put("buildModelFilters", m56842b(this.f77385j));
            jSONObject.put("buildDeviceFilters", m56842b(this.f77386k));
            jSONObject.put("buildManufacturerFilters", m56842b(this.f77387l));
            jSONObject.put("buildDisplayFilters", m56842b(this.f77388m));
            jSONObject.put("buildHardwareFilters", m56842b(this.f77389n));
            jSONObject.put("buildProductFilters", m56842b(this.f77390o));
            jSONObject.put("buildBoardFilters", m56842b(this.f77391p));
            jSONObject.put("buildBootloaderFilters", m56842b(this.f77392q));
            jSONObject.put("buildHostFilters", m56842b(this.f77393r));
            jSONObject.put("buildRadioFilters", m56842b(this.f77394s));
            jSONObject.put("buildBrandFilters", m56842b(this.f77395t));
            jSONObject.put("buildFlavorFilters", m56842b(this.f77396u));
            jSONObject.put("cpuTypes", m56842b(this.f77397v));
            jSONObject.put("kernelArchitectures", m56842b(this.f77398w));
            jSONObject.put("kernelVersions", m56842b(this.f77399x));
            jSONObject.put("minPropertiesThreshold", 3);
            jSONObject.put("checkTelephony", false);
            jSONObject.put("checkPackageNames", true);
            jSONObject.put("sensorNames", this.f77400y);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject.toString();
    }
}
