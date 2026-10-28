package e93;

import a00.C0072g;
import ae3.C0803k;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.runtime.Composer;
import androidx.core.app.RemoteInput;
import bc3.AbstractC3006f0;
import bc3.C3067w;
import bg.C3213h;
import c93.InterfaceC4351m;
import com.google.crypto.tink.internal.C5101l0;
import com.iterable.iterableapi.AbstractC5375u;
import com.iterable.iterableapi.C5305b;
import com.iterable.iterableapi.C5309c;
import com.iterable.iterableapi.C5341k;
import com.iterable.iterableapi.C5347l1;
import com.iterable.iterableapi.C5363q;
import com.iterable.iterableapi.C5374t1;
import com.iterable.iterableapi.C5377u1;
import db3.C11890b;
import gb.C15647h;
import gb.C15648i;
import gb.C15649j;
import ge3.AbstractC15751g;
import gf.C15768i;
import hb3.AbstractC17104a0;
import hb3.C17136y;
import hb3.C17137z;
import hc3.C17188u;
import hg3.AbstractC17269i;
import i93.C18282h;
import i93.C18284j;
import i93.C18287m;
import i93.InterfaceC18280f;
import i93.InterfaceC18281g;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import l83.C23465k;
import live.hms.video.utils.HMSConstantsKt;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import oa3.C27765h;
import oa3.C27774q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import p000.AbstractC11266d;
import p002a0.C0030i1;
import p007a6.C0448q;
import p014aj.C0929d;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p042c2.C3872q;
import p097ds.AbstractC12313p;
import p098dt.AbstractC12350b;
import p114eb.C12953f;
import p114eb.C12954f0;
import p114eb.C12967j1;
import p114eb.C12971l;
import p114eb.C12987s0;
import p114eb.InterfaceC12961h1;
import p132f0.C13825t;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15081m5;
import p163g1.C14970c1;
import p163g1.C15071l5;
import p208i2.AbstractC17888h0;
import p208i2.AbstractC17918w0;
import p208i2.InterfaceC17869a1;
import p238j0.C21084j;
import p319m4.AbstractC25012a;
import p389p0.C28557w0;
import p390p1.C28655q;
import p392p3.C28774l;
import p392p3.C28786x;
import p482s7.AbstractC32237a;
import p513u4.AbstractC34515c;
import p521ue.C34855a;
import p530up.AbstractC35148d;
import p547v8.AbstractC35785b;
import p602x1.C37816b;
import p636y3.C39174f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.time.DurationKt;
import q83.C30064k;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;
import qa3.EnumC30142j;
import r83.EnumC31071a;
import r93.InterfaceC31155s0;
import s83.AbstractC32267a;
import sa3.C32331e;
import sa3.InterfaceC32332f;
import ug.AbstractC34924m;
import va3.AbstractC35844b;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;
import w93.C36969b;
import yb0.AbstractC39383f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: e93.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12889b {

    /* JADX INFO: renamed from: a */
    public static C0072g f44373a;

    /* JADX INFO: renamed from: b */
    public static boolean f44374b;

    /* JADX INFO: renamed from: c */
    public static Method f44375c;

    /* JADX INFO: renamed from: A */
    public static final float m36235A(float f13) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f13)) & 8589934591L) / ((long) 3))) + 709952852);
        float f14 = fIntBitsToFloat - ((fIntBitsToFloat - (f13 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f14 - ((f14 - (f13 / (f14 * f14))) * 0.33333334f);
    }

    /* JADX INFO: renamed from: B */
    public static Object m36236B(InterfaceC30061h interfaceC30061h, Object obj, InterfaceC4351m operation) {
        AbstractC22676k.m65750j(operation, "operation");
        return operation.invoke(obj, interfaceC30061h);
    }

    /* JADX INFO: renamed from: C */
    public static final Object m36237C(Object obj) {
        if (obj instanceof JSONObject) {
            return m36274g0((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            if (obj instanceof BigDecimal) {
                return Double.valueOf(((BigDecimal) obj).doubleValue());
            }
            if (AbstractC22676k.m65745e(obj, JSONObject.NULL)) {
                return null;
            }
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i13 = 0; i13 < length; i13++) {
            arrayList.add(m36237C(jSONArray.get(i13)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public static InterfaceC30061h m36238D(InterfaceC30061h interfaceC30061h, InterfaceC30062i key) {
        AbstractC22676k.m65750j(key, "key");
        if (AbstractC22676k.m65745e(interfaceC30061h.getKey(), key)) {
            return interfaceC30061h;
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public static final C35845c m36239E(InterfaceC32332f interfaceC32332f, int i13) {
        AbstractC22676k.m65750j(interfaceC32332f, "<this>");
        return AbstractC35844b.m113763d(interfaceC32332f.mo100631b(i13), interfaceC32332f.mo100630a(i13));
    }

    /* JADX INFO: renamed from: F */
    public static final C35850h m36240F(InterfaceC32332f interfaceC32332f, int i13) {
        AbstractC22676k.m65750j(interfaceC32332f, "<this>");
        return C35850h.m113813d(interfaceC32332f.getString(i13));
    }

    /* JADX INFO: renamed from: G */
    public static String m36241G(Class cls) {
        LinkedHashMap linkedHashMap = C12967j1.f44787b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            InterfaceC12961h1 interfaceC12961h1 = (InterfaceC12961h1) cls.getAnnotation(InterfaceC12961h1.class);
            strValue = interfaceC12961h1 != null ? interfaceC12961h1.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, strValue);
        }
        AbstractC22676k.m65747g(strValue);
        return strValue;
    }

    /* JADX INFO: renamed from: H */
    public static ColorStateList m36242H(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!m36246L(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i13 = typedValue.type;
        if (i13 != 2) {
            return (i13 < 28 || i13 > 31) ? AbstractC34515c.m109083c(typedArray.getResources(), typedArray.getResourceId(1, 0), theme) : ColorStateList.valueOf(typedValue.data);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
    }

    /* JADX INFO: renamed from: I */
    public static C0803k m36243I(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i13) {
        C0803k c0803kM1943b;
        if (m36246L(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i13, typedValue);
            int i14 = typedValue.type;
            if (i14 >= 28 && i14 <= 31) {
                return new C0803k((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                c0803kM1943b = C0803k.m1943b(typedArray.getResources(), typedArray.getResourceId(i13, 0), theme);
            } catch (Exception e5) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e5);
                c0803kM1943b = null;
            }
            if (c0803kM1943b != null) {
                return c0803kM1943b;
            }
        }
        return new C0803k((Shader) null, (ColorStateList) null, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: J */
    public static C36969b m36244J(AbstractC17104a0 container, boolean z4, boolean z13, Boolean bool, boolean z14, C0929d c0929d, C32331e metadataVersion) {
        C27765h c27765h;
        C36969b c36969bM83873c;
        C17136y c17136y;
        EnumC30142j enumC30142j;
        AbstractC22676k.m65750j(container, "container");
        InterfaceC31155s0 interfaceC31155s0 = (InterfaceC31155s0) container.f65707z;
        AbstractC22676k.m65750j(metadataVersion, "metadataVersion");
        EnumC30142j enumC30142j2 = EnumC30142j.INTERFACE;
        if (z4) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
            }
            if (container instanceof C17136y) {
                C17136y c17136y2 = (C17136y) container;
                if (c17136y2.f65808H == enumC30142j2) {
                    return AbstractC12313p.m34252D(c0929d, c17136y2.f65807G.m113775d(C35850h.m113814e("DefaultImpls")), metadataVersion);
                }
            }
            if (bool.booleanValue() && (container instanceof C17137z)) {
                C27765h c27765h2 = interfaceC31155s0 instanceof C27765h ? (C27765h) interfaceC31155s0 : null;
                C11890b c11890bM83872b = c27765h2 != null ? c27765h2.m83872b() : null;
                if (c11890bM83872b != null) {
                    String strM31928d = c11890bM83872b.m31928d();
                    AbstractC22676k.m65749i(strM31928d, "getInternalName(...)");
                    C35847e c35847e = new C35847e(AbstractC39421y.m125927L(strM31928d, '/', '.'));
                    return AbstractC12313p.m34252D(c0929d, new C35845c(c35847e.m113789b(), c35847e.f152613a.m113796g()), metadataVersion);
                }
            }
        }
        if (z13 && (container instanceof C17136y)) {
            C17136y c17136y3 = (C17136y) container;
            if (c17136y3.f65808H == EnumC30142j.COMPANION_OBJECT && (c17136y = c17136y3.f65806F) != null && ((enumC30142j = c17136y.f65808H) == EnumC30142j.CLASS || enumC30142j == EnumC30142j.ENUM_CLASS || (z14 && (enumC30142j == enumC30142j2 || enumC30142j == EnumC30142j.ANNOTATION_CLASS)))) {
                InterfaceC31155s0 interfaceC31155s1 = (InterfaceC31155s0) c17136y.f65707z;
                C27774q c27774q = interfaceC31155s1 instanceof C27774q ? (C27774q) interfaceC31155s1 : null;
                if (c27774q != null) {
                    return c27774q.f111971w;
                }
            } else if (container instanceof C17137z) {
                c27765h = (C27765h) interfaceC31155s0;
                c36969bM83873c = c27765h.m83873c();
                if (c36969bM83873c == null) {
                    return AbstractC12313p.m34252D(c0929d, c27765h.m83871a(), metadataVersion);
                }
                return c36969bM83873c;
            }
        } else if ((container instanceof C17137z) && (interfaceC31155s0 instanceof C27765h)) {
            c27765h = (C27765h) interfaceC31155s0;
            c36969bM83873c = c27765h.m83873c();
            if (c36969bM83873c == null) {
                return AbstractC12313p.m34252D(c0929d, c27765h.m83871a(), metadataVersion);
            }
            return c36969bM83873c;
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static void m36245K(Context context, Intent intent) {
        Bundle resultsFromIntent;
        String string;
        if (intent.getExtras() == null) {
            AbstractC12350b.m34595p("IterablePushNotificationUtil", "handlePushAction: extras == null, can't handle push action");
            return;
        }
        if (C5341k.f21742r.f21743a == null) {
            C5341k.f21742r.f21743a = context.getApplicationContext();
            AbstractC12350b.m34593n("IterableApi", "initializeForPush: Application context set for background push handling");
        }
        C5377u1 c5377u1 = new C5377u1(intent.getExtras());
        String stringExtra = intent.getStringExtra("actionIdentifier");
        JSONObject jSONObject = new JSONObject();
        C5309c c5309cM16416b = null;
        boolean z4 = true;
        if (stringExtra != null) {
            try {
                if (stringExtra.equals(HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY)) {
                    jSONObject.put("actionIdentifier", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY);
                    C5309c c5309cM16521c = c5377u1.m16521c();
                    if (c5309cM16521c == null) {
                        try {
                            Bundle extras = intent.getExtras();
                            try {
                                if (extras.containsKey("uri")) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("type", "openUrl");
                                    jSONObject2.put("data", extras.getString("uri"));
                                    c5309cM16416b = C5309c.m16416b(jSONObject2);
                                }
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        } catch (JSONException e13) {
                            e = e13;
                            c5309cM16416b = c5309cM16521c;
                            AbstractC12350b.m34596q("IterablePushNotificationUtil", "Encountered an exception while trying to handle the push action", e);
                        }
                    } else {
                        c5309cM16416b = c5309cM16521c;
                    }
                } else {
                    jSONObject.put("actionIdentifier", stringExtra);
                    C5374t1 c5374t1M16519a = c5377u1.m16519a(stringExtra);
                    c5309cM16416b = c5374t1M16519a.f21837f;
                    z4 = c5374t1M16519a.f21835d;
                    if (c5374t1M16519a.f21834c.equals("textInput") && (resultsFromIntent = RemoteInput.getResultsFromIntent(intent)) != null && (string = resultsFromIntent.getString("userInput")) != null) {
                        jSONObject.putOpt("userText", string);
                        c5309cM16416b.getClass();
                    }
                }
            } catch (JSONException e14) {
                e = e14;
            }
        }
        boolean z13 = z4;
        f44373a = new C0072g(intent, c5377u1, c5309cM16416b, jSONObject, 7);
        boolean zM36256V = C5341k.f21742r.f21743a != null ? m36256V(context) : false;
        if (!z13 || zM36256V) {
            return;
        }
        Intent intentM111192w = AbstractC35148d.m111192w(context);
        intentM111192w.putExtras(intent.getExtras());
        intentM111192w.setFlags(872415232);
        if (intentM111192w.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intentM111192w);
        }
    }

    /* JADX INFO: renamed from: L */
    public static boolean m36246L(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m36247M(PackageManager packageManager) {
        return Build.MODEL.matches("AFTN") || packageManager.hasSystemFeature("amazon.hardware.fire_tv");
    }

    /* JADX INFO: renamed from: N */
    public static final boolean m36248N(String str) {
        int length = str.length();
        if (1 <= length && length < 5) {
            for (int i13 = 0; i13 < str.length(); i13++) {
                char cCharAt = str.charAt(i13);
                if (('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < 'g') || ('A' <= cCharAt && cCharAt < 'G'))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public static final float m36249O(float f13, float f14, float f15) {
        return (f15 * f14) + ((1 - f15) * f13);
    }

    /* JADX INFO: renamed from: P */
    public static final int m36250P(float f13, int i13, int i14) {
        return i13 + ((int) Math.round(((double) (i14 - i13)) * ((double) f13)));
    }

    /* JADX INFO: renamed from: Q */
    public static InterfaceC30063j m36251Q(InterfaceC30061h interfaceC30061h, InterfaceC30062i key) {
        AbstractC22676k.m65750j(key, "key");
        return AbstractC22676k.m65745e(interfaceC30061h.getKey(), key) ? C30064k.f122676w : interfaceC30061h;
    }

    /* JADX INFO: renamed from: R */
    public static TypedArray m36252R(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: S */
    public static final C3213h m36253S(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        List listM125905x0 = AbstractC39414r.m125905x0(str, new char[]{'.'}, 0, 6);
        if (listM125905x0.size() != 4) {
            return null;
        }
        List list = listM125905x0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Integer numM125932Q = AbstractC39421y.m125932Q((String) it.next());
                int iIntValue = numM125932Q != null ? numM125932Q.intValue() : -1;
                if (iIntValue < 0 || iIntValue >= 256) {
                    return null;
                }
            }
        }
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList.add(Byte.valueOf(AbstractC32237a.m100302q((String) it3.next())));
        }
        return new C3213h(AbstractC25265s.m74162z1(arrayList));
    }

    /* JADX INFO: renamed from: T */
    public static InterfaceC30063j m36254T(InterfaceC30061h interfaceC30061h, InterfaceC30063j context) {
        AbstractC22676k.m65750j(context, "context");
        return context == C30064k.f122676w ? interfaceC30061h : (InterfaceC30063j) context.fold(interfaceC30061h, new C28557w0(24));
    }

    /* JADX INFO: renamed from: U */
    public static void m36255U(JSONObject jSONObject, Context context, String str, C5305b c5305b) throws JSONException {
        Object obj;
        int i13;
        String str2;
        jSONObject.put("brand", Build.BRAND);
        jSONObject.put("manufacturer", Build.MANUFACTURER);
        jSONObject.put("systemName", Build.DEVICE);
        jSONObject.put("systemVersion", Build.VERSION.RELEASE);
        jSONObject.put("model", Build.MODEL);
        jSONObject.put("sdkVersion", Build.VERSION.SDK_INT);
        jSONObject.put("deviceId", str);
        jSONObject.put("appPackageName", context.getPackageName());
        Object string = null;
        try {
            obj = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e5) {
            AbstractC12350b.m34596q("IterableUtilImpl", "Error while retrieving app version", e5);
            obj = null;
        }
        jSONObject.put("appVersion", obj);
        try {
            string = Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e13) {
            AbstractC12350b.m34596q("IterableUtilImpl", "Error while retrieving app version code", e13);
        }
        jSONObject.put("appBuild", string);
        jSONObject.put("iterableSdkVersion", "3.6.6");
        if (c5305b == null || (i13 = c5305b.f21637c) == 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (i13 == 1) {
            str2 = "flutter";
        } else if (i13 == 2) {
            str2 = "reactnative";
        } else {
            if (i13 != 3) {
                throw null;
            }
            str2 = "native";
        }
        jSONObject2.put("frameworkType", str2);
        String str3 = c5305b.f21636b;
        if (str3 == null) {
            str3 = "unknown";
        }
        jSONObject2.put("iterableSdkVersion", str3);
        jSONObject.put("mobileFrameworkInfo", jSONObject2);
    }

    /* JADX INFO: renamed from: V */
    public static boolean m36256V(Context context) {
        C0072g c0072g = f44373a;
        if (c0072g == null) {
            return false;
        }
        C5341k c5341k = C5341k.f21742r;
        Intent intent = (Intent) c0072g.f223x;
        c5341k.getClass();
        Bundle extras = intent.getExtras();
        if (extras != null && extras.containsKey("itbl")) {
            AbstractC35148d.m111154E(extras);
        }
        C5341k c5341k2 = C5341k.f21742r;
        C5377u1 c5377u1 = (C5377u1) c0072g.f224y;
        c5341k2.getClass();
        C5363q c5363q = new C5363q(c5377u1.m16520b(), c5377u1.m16523e(), c5377u1.m16522d());
        Context context2 = c5341k2.f21743a;
        if (context2 == null) {
            AbstractC12350b.m34595p("IterableApi", "setAttributionInfo: Iterable SDK is not initialized with a context.");
        } else {
            SharedPreferences sharedPreferences = context2.getSharedPreferences("com.iterable.iterableapi", 0);
            String string = c5363q.m16515h().toString();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("itbl_attribution_info_object", string);
            editorEdit.putLong("itbl_attribution_info_expiration", System.currentTimeMillis() + DurationKt.MILLIS_IN_DAY);
            editorEdit.apply();
        }
        final C5341k c5341k3 = C5341k.f21742r;
        final int iM16520b = ((C5377u1) c0072g.f224y).m16520b();
        final int iM16523e = ((C5377u1) c0072g.f224y).m16523e();
        final String strM16522d = ((C5377u1) c0072g.f224y).m16522d();
        final JSONObject jSONObject = (JSONObject) c0072g.f221E;
        c5341k3.getClass();
        Runnable runnable = new Runnable() { // from class: com.iterable.iterableapi.h
            @Override // java.lang.Runnable
            public final void run() {
                int i13 = iM16520b;
                int i14 = iM16523e;
                C5341k c5341k4 = c5341k3;
                String str = strM16522d;
                if (str == null) {
                    c5341k4.getClass();
                    AbstractC12350b.m34595p("IterableApi", "messageId is null");
                    return;
                }
                C5101l0 c5101l0 = c5341k4.f21752j;
                c5101l0.getClass();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = jSONObject;
                if (jSONObject3 == null) {
                    try {
                        jSONObject3 = new JSONObject();
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                        return;
                    }
                }
                c5101l0.m16027B(jSONObject2);
                jSONObject2.put("campaignId", i13);
                jSONObject2.put("templateId", i14);
                jSONObject2.put("messageId", str);
                jSONObject2.putOpt("dataFields", jSONObject3);
                c5101l0.m16055f0("events/trackPushOpen", jSONObject2);
            }
        };
        C5341k.m16481j(strM16522d);
        C5347l1 c5347l1 = AbstractC5375u.f21838a;
        runnable.run();
        boolean zM110164y = AbstractC34924m.m110164y(context, (C5309c) c0072g.f225z, 1);
        if (zM110164y) {
            f44373a = null;
        }
        return zM110164y;
    }

    /* JADX INFO: renamed from: W */
    public static int m36257W(double d3) {
        if (Double.isNaN(d3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d3 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d3 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d3);
    }

    /* JADX INFO: renamed from: X */
    public static int m36258X(float f13) {
        if (Float.isNaN(f13)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f13);
    }

    /* JADX INFO: renamed from: Y */
    public static long m36259Y(double d3) {
        if (Double.isNaN(d3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d3);
    }

    /* JADX INFO: renamed from: Z */
    public static final Object m36260Z(InterfaceC4351m interfaceC4351m) {
        Thread.interrupted();
        return AbstractC3006f0.m8699E(C30064k.f122676w, new C0448q(interfaceC4351m, null));
    }

    /* JADX INFO: renamed from: a */
    public static C34855a m36261a(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        return new C34855a(id4, C15768i.f59433w);
    }

    /* JADX INFO: renamed from: a0 */
    public static Modifier m36262a0(Modifier modifier, float f13, InterfaceC17869a1 interfaceC17869a1, boolean z4, long j7, long j13, int i13) {
        if ((i13 & 2) != 0) {
            interfaceC17869a1 = AbstractC17918w0.f69621a;
        }
        InterfaceC17869a1 interfaceC17869a2 = interfaceC17869a1;
        if ((i13 & 4) != 0) {
            z4 = Float.compare(f13, (float) 0) > 0;
        }
        boolean z13 = z4;
        if ((i13 & 8) != 0) {
            j7 = AbstractC17888h0.f69583a;
        }
        return (Float.compare(f13, (float) 0) > 0 || z13) ? modifier.mo3471e(new ShadowGraphicsLayerElement(f13, interfaceC17869a2, z13, j7, (i13 & 16) != 0 ? AbstractC17888h0.f69583a : j13)) : modifier;
    }

    /* JADX INFO: renamed from: b */
    public static final void m36263b(Modifier modifier, InterfaceC17869a1 interfaceC17869a1, long j7, C13825t c13825t, float f13, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        if ((i14 & 1) != 0) {
            modifier = C2314t.f9131w;
        }
        Modifier modifier2 = modifier;
        if ((i14 & 2) != 0) {
            interfaceC17869a1 = ((C15071l5) ((C28655q) composer).m87161k(AbstractC15081m5.m43156a())).m43153b();
        }
        InterfaceC17869a1 interfaceC17869a2 = interfaceC17869a1;
        if ((i14 & 4) != 0) {
            j7 = ((C14970c1) ((C28655q) composer).m87161k(AbstractC14981d1.f55997a)).m43093h();
        }
        long j13 = j7;
        AbstractC17269i.m48898k(modifier2, interfaceC17869a2, j13, AbstractC14981d1.m43101b(j13, composer), (i14 & 16) != 0 ? null : c13825t, (i14 & 32) != 0 ? 1 : f13, interfaceC4351m, composer, i13 & 4194302, 0);
    }

    /* JADX INFO: renamed from: b0 */
    public static final ByteBuffer m36264b0(ByteBuffer byteBuffer, int i13, int i14) {
        AbstractC22676k.m65750j(byteBuffer, "<this>");
        ByteBuffer myDuplicate$lambda$1 = byteBuffer.duplicate();
        AbstractC22676k.m65749i(myDuplicate$lambda$1, "myDuplicate$lambda$1");
        myDuplicate$lambda$1.position(i13);
        myDuplicate$lambda$1.limit(i13 + i14);
        ByteBuffer mySlice$lambda$2 = myDuplicate$lambda$1.slice();
        AbstractC22676k.m65749i(mySlice$lambda$2, "mySlice$lambda$2");
        return mySlice$lambda$2;
    }

    /* JADX INFO: renamed from: c */
    public static float m36265c(float f13) {
        return f13 <= 0.04045f ? f13 / 12.92f : (float) Math.pow((f13 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* JADX INFO: renamed from: c0 */
    public static final Object m36266c0(C17188u c17188u, boolean z4, C17188u c17188u2, InterfaceC4351m interfaceC4351m) {
        Object c3067w;
        Object objM8808M;
        try {
            if (interfaceC4351m instanceof AbstractC32267a) {
                AbstractC22681m0.m65774e(2, interfaceC4351m);
                c3067w = interfaceC4351m.invoke(c17188u2, c17188u);
            } else {
                c3067w = AbstractC15751g.m44446Z(interfaceC4351m, c17188u2, c17188u);
            }
        } catch (DispatchException e5) {
            Throwable th3 = e5.f89396w;
            c17188u.m8807L(new C3067w(th3, false));
            throw th3;
        } catch (Throwable th4) {
            c3067w = new C3067w(th4, false);
        }
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (c3067w == enumC31071a || (objM8808M = c17188u.m8808M(c3067w)) == AbstractC3006f0.f12019e) {
            return enumC31071a;
        }
        c17188u.mo8787c0();
        if (!(objM8808M instanceof C3067w)) {
            return AbstractC3006f0.m8703I(objM8808M);
        }
        if (!z4) {
            Throwable th5 = ((C3067w) objM8808M).f12104a;
            if ((th5 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th5).f89398w == c17188u) {
                if (c3067w instanceof C3067w) {
                    throw ((C3067w) c3067w).f12104a;
                }
                return c3067w;
            }
        }
        throw ((C3067w) objM8808M).f12104a;
    }

    /* JADX INFO: renamed from: d */
    public static final C28774l m36267d(C28786x... c28786xArr) {
        return new C28774l(AbstractC25260n.m74048W(c28786xArr));
    }

    /* JADX INFO: renamed from: d0 */
    public static C18282h m36268d0(int i13, C18284j c18284j) {
        AbstractC22676k.m65750j(c18284j, "<this>");
        m36275h(i13 > 0, Integer.valueOf(i13));
        int i14 = c18284j.f71133w;
        int i15 = c18284j.f71134x;
        if (c18284j.f71135y <= 0) {
            i13 = -i13;
        }
        return new C18282h(i14, i15, i13);
    }

    /* JADX INFO: renamed from: e */
    public static final C21084j m36269e() {
        return new C21084j();
    }

    /* JADX INFO: renamed from: e0 */
    public static final Object m36270e0(Object obj) {
        if (obj instanceof Map) {
            return m36272f0((Map) obj);
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(m36270e0(it.next()));
            }
            return jSONArray;
        }
        if (!(obj instanceof Object[])) {
            return obj;
        }
        JSONArray jSONArray2 = new JSONArray();
        C0030i1 c0030i1M65777h = AbstractC22681m0.m65777h((Object[]) obj);
        while (c0030i1M65777h.hasNext()) {
            jSONArray2.put(m36270e0(c0030i1M65777h.next()));
        }
        return jSONArray2;
    }

    /* JADX INFO: renamed from: f */
    public static float m36271f(float f13) {
        return f13 <= 0.0031308f ? f13 * 12.92f : (float) ((Math.pow(f13, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* JADX INFO: renamed from: f0 */
    public static final JSONObject m36272f0(Map map) throws JSONException {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null) {
                jSONObject.put(str, m36270e0(entry.getValue()));
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: g */
    public static final Bundle m36273g(C23465k... c23465kArr) {
        Bundle bundle = new Bundle(c23465kArr.length);
        for (C23465k c23465k : c23465kArr) {
            String str = (String) c23465k.f92937w;
            Object obj = c23465k.f92938x;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                AbstractC22676k.m65747g(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                AbstractC35785b.m113390M(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                AbstractC35785b.m113391N(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: g0 */
    public static final LinkedHashMap m36274g0(JSONObject jSONObject) {
        AbstractC22676k.m65750j(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC22676k.m65749i(itKeys, "this.keys()");
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            AbstractC22676k.m65749i(key, "key");
            linkedHashMap.put(key, m36237C(jSONObject.get(key)));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: h */
    public static final void m36275h(boolean z4, Number number) {
        if (z4) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    /* JADX INFO: renamed from: h0 */
    public static String m36276h0(long j7) {
        int i13 = (int) (j7 >> 32);
        int i14 = (int) (j7 & 4294967295L);
        if (Float.intBitsToFloat(i13) == Float.intBitsToFloat(i14)) {
            return "CornerRadius.circular(" + AbstractC22674j.m65711S(Float.intBitsToFloat(i13)) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC22674j.m65711S(Float.intBitsToFloat(i13)) + ", " + AbstractC22674j.m65711S(Float.intBitsToFloat(i14)) + ')';
    }

    /* JADX INFO: renamed from: i */
    public static final void m36277i(int i13, int i14) {
        if (i13 <= 0 || i14 <= 0) {
            throw new IllegalArgumentException((i13 != i14 ? AbstractC25012a.m73372e(i13, i14, "Both size ", " and step ", " must be greater than zero.") : AbstractC2875y.m8296i(i13, "size ", " must be greater than zero.")).toString());
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static C18284j m36278i0(int i13, int i14) {
        if (i14 > Integer.MIN_VALUE) {
            return new C18284j(i13, i14 - 1, 1);
        }
        C18284j c18284j = C18284j.f71140z;
        return C18284j.f71140z;
    }

    /* JADX INFO: renamed from: j */
    public static float m36279j(float f13, float f14) {
        return f13 < f14 ? f14 : f13;
    }

    /* JADX INFO: renamed from: j0 */
    public static CopyOnWriteArrayList m36280j0(CopyOnWriteArrayList copyOnWriteArrayList) {
        ArrayList arrayList = new ArrayList();
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                throw AbstractC11266d.m30454h(it);
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }

    /* JADX INFO: renamed from: k */
    public static Comparable m36281k(C39174f c39174f, C39174f c39174f2) {
        return c39174f.compareTo(c39174f2) < 0 ? c39174f2 : c39174f;
    }

    /* JADX INFO: renamed from: l */
    public static double m36282l(double d3, double d14, double d15) {
        if (d14 <= d15) {
            if (d3 < d14) {
                return d14;
            }
            return d3 > d15 ? d15 : d3;
        }
        StringBuilder sbM8306s = AbstractC2875y.m8306s("Cannot coerce value to an empty range: maximum ", d15, " is less than minimum ");
        sbM8306s.append(d14);
        sbM8306s.append('.');
        throw new IllegalArgumentException(sbM8306s.toString());
    }

    /* JADX INFO: renamed from: m */
    public static float m36283m(float f13, float f14, float f15) {
        if (f14 <= f15) {
            if (f13 < f14) {
                return f14;
            }
            return f13 > f15 ? f15 : f13;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f15 + " is less than minimum " + f14 + '.');
    }

    /* JADX INFO: renamed from: n */
    public static int m36284n(int i13, int i14, int i15) {
        if (i14 <= i15) {
            if (i13 < i14) {
                return i14;
            }
            return i13 > i15 ? i15 : i13;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i15 + " is less than minimum " + i14 + '.');
    }

    /* JADX INFO: renamed from: o */
    public static int m36285o(int i13, InterfaceC18281g range) {
        AbstractC22676k.m65750j(range, "range");
        if (range instanceof InterfaceC18280f) {
            return ((Number) m36288r(Integer.valueOf(i13), (InterfaceC18280f) range)).intValue();
        }
        if (!range.isEmpty()) {
            if (i13 < ((Number) range.getStart()).intValue()) {
                return ((Number) range.getStart()).intValue();
            }
            return i13 > ((Number) range.mo52651d()).intValue() ? ((Number) range.mo52651d()).intValue() : i13;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    /* JADX INFO: renamed from: p */
    public static long m36286p(long j7, long j13, long j14) {
        if (j13 > j14) {
            throw new IllegalArgumentException(AbstractC2875y.m8302o(AbstractC39383f.m125596b(j14, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j13, '.'));
        }
        if (j7 < j13) {
            return j13;
        }
        return j7 > j14 ? j14 : j7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static long m36287q(long j7, C18287m c18287m) {
        if (c18287m instanceof InterfaceC18280f) {
            return ((Number) m36288r(Long.valueOf(j7), (InterfaceC18280f) c18287m)).longValue();
        }
        if (!c18287m.isEmpty()) {
            if (j7 < ((Number) c18287m.getStart()).longValue()) {
                return ((Number) c18287m.getStart()).longValue();
            }
            return j7 > ((Number) c18287m.mo52651d()).longValue() ? ((Number) c18287m.mo52651d()).longValue() : j7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c18287m + '.');
    }

    /* JADX INFO: renamed from: r */
    public static Comparable m36288r(Comparable comparable, InterfaceC18280f range) {
        AbstractC22676k.m65750j(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        if (!range.mo52653a(comparable, range.getStart()) || range.mo52653a(range.getStart(), comparable)) {
            return (!range.mo52653a(range.mo52651d(), comparable) || range.mo52653a(comparable, range.mo52651d())) ? comparable : range.mo52651d();
        }
        return range.getStart();
    }

    /* JADX INFO: renamed from: s */
    public static Comparable m36289s(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        AbstractC22676k.m65750j(comparable, "<this>");
        if (comparable2 == null || comparable3 == null) {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        } else {
            if (comparable2.compareTo(comparable3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + comparable3 + " is less than minimum " + comparable2 + '.');
            }
            if (comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: t */
    public static void m36290t(C12987s0 c12987s0, String str, List list, Function1 function1, Function1 function2, Function1 function3, Function1 function4, C37816b c37816b, int i13) {
        int i14 = i13 & 2;
        C25271y<C12954f0> c25271y = C25271y.f99162w;
        if (i14 != 0) {
            list = c25271y;
        }
        if ((i13 & 8) != 0) {
            function1 = null;
        }
        if ((i13 & 16) != 0) {
            function2 = null;
        }
        if ((i13 & 32) != 0) {
            function3 = function1;
        }
        if ((i13 & 64) != 0) {
            function4 = function2;
        }
        C12967j1 c12967j1 = c12987s0.f44863f;
        c12967j1.getClass();
        C15649j c15649j = new C15649j((C15648i) c12967j1.mo36434b(m36241G(C15648i.class)), str, c37816b);
        for (C12953f c12953f : list) {
            String name = c12953f.f44731a;
            C12971l c12971l = c12953f.f44732b;
            AbstractC22676k.m65750j(name, "name");
            ((LinkedHashMap) c15649j.f44829c).put(name, c12971l);
        }
        for (C12954f0 navDeepLink : c25271y) {
            AbstractC22676k.m65750j(navDeepLink, "navDeepLink");
            ((ArrayList) c15649j.f44831e).add(navDeepLink);
        }
        c15649j.f58734h = function1;
        c15649j.f58735i = function2;
        c15649j.f58736j = function3;
        c15649j.f58737k = function4;
        c12987s0.f44865h.add(c15649j.mo36473a());
    }

    /* JADX INFO: renamed from: u */
    public static void m36291u(C12987s0 c12987s0, String str, List list, C37816b c37816b, int i13) {
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        if (i14 != 0) {
            list = c25271y;
        }
        C12967j1 c12967j1 = c12987s0.f44863f;
        c12967j1.getClass();
        C15647h c15647h = new C15647h((C15648i) c12967j1.mo36434b(m36241G(C15648i.class)), new C37816b(new C3872q(c37816b, 2), true, 484185514));
        c15647h.m36471o(str);
        for (C12953f c12953f : list) {
            String argumentName = c12953f.f44731a;
            C12971l c12971l = c12953f.f44732b;
            AbstractC22676k.m65750j(argumentName, "argumentName");
            c15647h.f44818G.put(argumentName, c12971l);
        }
        Iterator<E> it = c25271y.iterator();
        while (it.hasNext()) {
            c15647h.m36463a((C12954f0) it.next());
        }
        c12987s0.f44865h.add(c15647h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static long[] m36292v(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            jArr[i13] = iArr[i13];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: w */
    public static final void m36293w(ByteBuffer copyTo, ByteBuffer byteBuffer, int i13) {
        AbstractC22676k.m65750j(copyTo, "$this$copyTo");
        int iRemaining = byteBuffer.remaining();
        if (copyTo.hasArray() && !copyTo.isReadOnly() && byteBuffer.hasArray() && !byteBuffer.isReadOnly()) {
            int iPosition = byteBuffer.position();
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i13, byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iRemaining);
            byteBuffer.position(iPosition + iRemaining);
        } else {
            ByteBuffer byteBufferDuplicate = copyTo.duplicate();
            byteBufferDuplicate.limit(iRemaining + i13);
            byteBufferDuplicate.position(i13);
            byteBuffer.put(byteBufferDuplicate);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m36294x(Context context) {
        if (Build.VERSION.SDK_INT < 31) {
            try {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            } catch (SecurityException e5) {
                AbstractC12350b.m34579a0("IterablePushNotificationUtil", e5.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m36295y(long j7, long j13) {
        return j7 == j13;
    }

    /* JADX INFO: renamed from: z */
    public static int m36296z(float f13, int i13, int i14) {
        if (i13 == i14 || f13 <= 0.0f) {
            return i13;
        }
        if (f13 >= 1.0f) {
            return i14;
        }
        float f14 = ((i13 >> 24) & 255) / 255.0f;
        float f15 = ((i14 >> 24) & 255) / 255.0f;
        float fM36265c = m36265c(((i13 >> 16) & 255) / 255.0f);
        float fM36265c2 = m36265c(((i13 >> 8) & 255) / 255.0f);
        float fM36265c3 = m36265c((i13 & 255) / 255.0f);
        float fM36265c4 = m36265c(((i14 >> 16) & 255) / 255.0f);
        float fM36265c5 = m36265c(((i14 >> 8) & 255) / 255.0f);
        float fM36265c6 = m36265c((i14 & 255) / 255.0f);
        float fM8288a = AbstractC2875y.m8288a(f15, f14, f13, f14);
        float fM8288a2 = AbstractC2875y.m8288a(fM36265c4, fM36265c, f13, fM36265c);
        float fM8288a3 = AbstractC2875y.m8288a(fM36265c5, fM36265c2, f13, fM36265c2);
        float fM8288a4 = AbstractC2875y.m8288a(fM36265c6, fM36265c3, f13, fM36265c3);
        float fM36271f = m36271f(fM8288a2) * 255.0f;
        float fM36271f2 = m36271f(fM8288a3) * 255.0f;
        return Math.round(m36271f(fM8288a4) * 255.0f) | (Math.round(fM36271f) << 16) | (Math.round(fM8288a * 255.0f) << 24) | (Math.round(fM36271f2) << 8);
    }

    /* JADX INFO: renamed from: k0 */
    public abstract void mo3951k0(byte[] bArr, int i13, int i14);
}
