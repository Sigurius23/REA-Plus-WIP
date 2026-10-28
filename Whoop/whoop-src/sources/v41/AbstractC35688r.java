package v41;

import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import x83.AbstractC38093j;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: v41.r */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007¨\u0006\t"}, m65681d2 = {"", "json", "", "Landroid/graphics/Typeface;", "a", "(Ljava/lang/String;)Ljava/util/Map;", "Ltr2/n;", "Ltr2/n;", "logger", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35688r {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f151819a = InterfaceC34116n.INSTANCE.m107848a("LottieJsonCache");

    /* JADX INFO: renamed from: a */
    public static final Map<String, Typeface> m113121a(String json) {
        JSONArray jSONArrayOptJSONArray;
        int iM125888g0;
        AbstractC22676k.m65750j(json, "json");
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(json).optJSONObject("fonts");
            if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("list")) == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int length = jSONArrayOptJSONArray.length();
            for (int i13 = 0; i13 < length; i13++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i13);
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString = jSONObjectOptJSONObject2.optString("fFamily");
                    AbstractC22676k.m65747g(strOptString);
                    if (strOptString.length() <= 0) {
                        strOptString = null;
                    }
                    if (strOptString != null) {
                        String strOptString2 = jSONObjectOptJSONObject2.optString("fPath");
                        AbstractC22676k.m65747g(strOptString2);
                        if (strOptString2.length() <= 0) {
                            strOptString2 = null;
                        }
                        if (strOptString2 != null && ((AbstractC39421y.m125930O(strOptString2, "data:font/", false) || AbstractC39421y.m125930O(strOptString2, "data:application/font", false)) && (iM125888g0 = AbstractC39414r.m125888g0(strOptString2, "base64,", 0, false, 6)) >= 0)) {
                            String strSubstring = strOptString2.substring(iM125888g0 + 7);
                            AbstractC22676k.m65749i(strSubstring, "substring(...)");
                            try {
                                try {
                                    byte[] bArrDecode = Base64.decode(strSubstring, 0);
                                    File fileCreateTempFile = File.createTempFile("lottie_font_", ".ttf");
                                    try {
                                        AbstractC22676k.m65747g(fileCreateTempFile);
                                        AbstractC22676k.m65747g(bArrDecode);
                                        AbstractC38093j.m122042p(fileCreateTempFile, bArrDecode);
                                        Typeface typefaceBuild = new Typeface.Builder(fileCreateTempFile).build();
                                        if (typefaceBuild != null) {
                                            linkedHashMap.put(strOptString, typefaceBuild);
                                        }
                                        fileCreateTempFile.delete();
                                    } catch (Throwable th3) {
                                        fileCreateTempFile.delete();
                                        throw th3;
                                    }
                                } catch (IOException e5) {
                                    f151819a.mo85230v("Failed to write temp font file for '" + strOptString + "', skipping", e5, new AbstractC30556a.a[0]);
                                }
                            } catch (IllegalArgumentException e13) {
                                f151819a.mo85230v("Malformed base64 font data for '" + strOptString + "', skipping", e13, new AbstractC30556a.a[0]);
                            }
                        }
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                return null;
            }
            return linkedHashMap;
        } catch (JSONException unused) {
            return null;
        }
    }
}
