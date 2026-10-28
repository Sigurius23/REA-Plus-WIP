package i51;

import android.graphics.Color;
import e93.AbstractC12889b;
import in2.C18731c;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: i51.t */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"", "json", "", "highlight", "c", "(Ljava/lang/String;[I)Ljava/lang/String;", "Lorg/json/JSONObject;", "gradientNode", "Ll83/a0;", "b", "(Lorg/json/JSONObject;[I)V", "hex", "", "a", "(Ljava/lang/String;)Ljava/lang/Integer;", "stops", "count", "e", "([II)[I", "Ltr2/n;", "Ltr2/n;", "logger", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18123t {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f70398a = InterfaceC34116n.INSTANCE.m107848a("LottieGradientUtil");

    /* JADX INFO: renamed from: a */
    public static final Integer m52042a(String hex) {
        AbstractC22676k.m65750j(hex, "hex");
        try {
            return Integer.valueOf(Color.parseColor(AbstractC39421y.m125930O(hex, "#", false) ? hex : "#".concat(hex)));
        } catch (IllegalArgumentException e5) {
            f70398a.mo85230v("Invalid hex color: ".concat(hex), e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m52043b(JSONObject gradientNode, int[] highlight) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        AbstractC22676k.m65750j(gradientNode, "gradientNode");
        AbstractC22676k.m65750j(highlight, "highlight");
        JSONObject jSONObjectOptJSONObject2 = gradientNode.optJSONObject("g");
        if (jSONObjectOptJSONObject2 == null) {
            return;
        }
        int iOptInt = jSONObjectOptJSONObject2.optInt("p", 0);
        if (iOptInt > 0 && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("k")) != null && jSONObjectOptJSONObject.optInt("a", 0) == 0 && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("k")) != null && jSONArrayOptJSONArray.length() >= iOptInt * 4) {
            int[] iArrM52046e = m52046e(highlight, iOptInt);
            for (int i13 = 0; i13 < iOptInt; i13++) {
                int i14 = iArrM52046e[i13];
                int i15 = i13 * 4;
                jSONArrayOptJSONArray.put(i15 + 1, ((double) Color.red(i14)) / 255.0d);
                jSONArrayOptJSONArray.put(i15 + 2, ((double) Color.green(i14)) / 255.0d);
                jSONArrayOptJSONArray.put(i15 + 3, ((double) Color.blue(i14)) / 255.0d);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m52044c(String json, int[] highlight) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(highlight, "highlight");
        try {
            JSONObject jSONObject = new JSONObject(json);
            m52045d(highlight, jSONObject);
            String string = jSONObject.toString();
            AbstractC22676k.m65747g(string);
            return string;
        } catch (JSONException e5) {
            f70398a.mo85230v("Failed to recolor Lottie gradients", e5, new AbstractC30556a.a[0]);
            return json;
        }
    }

    /* JADX INFO: renamed from: d */
    private static final void m52045d(int[] iArr, Object obj) throws JSONException {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            String strOptString = jSONObject.optString("ty");
            if (AbstractC22676k.m65745e(strOptString, "gf") || AbstractC22676k.m65745e(strOptString, "gs")) {
                m52043b(jSONObject, iArr);
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                m52045d(iArr, jSONObject.get(itKeys.next()));
            }
            return;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i13 = 0; i13 < length; i13++) {
                m52045d(iArr, jSONArray.get(i13));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final int[] m52046e(int[] stops, int i13) {
        AbstractC22676k.m65750j(stops, "stops");
        if (i13 <= 0) {
            return new int[0];
        }
        if (stops.length == 0) {
            return new int[i13];
        }
        if (stops.length == 1 || i13 == 1) {
            int[] iArr = new int[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                iArr[i14] = stops[0];
            }
            return iArr;
        }
        int[] iArr2 = new int[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            float length = (i15 / (i13 - 1)) * (stops.length - 1);
            double d3 = length;
            int iM36284n = AbstractC12889b.m36284n((int) Math.floor(d3), 0, stops.length - 1);
            iArr2[i15] = C18731c.m54471a(stops[iM36284n], stops[AbstractC12889b.m36284n((int) Math.ceil(d3), 0, stops.length - 1)], length - iM36284n);
        }
        return iArr2;
    }
}
