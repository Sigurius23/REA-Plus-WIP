package p033bk;

import android.util.Log;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import hg3.AbstractC17269i;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import m83.C25271y;
import org.json.JSONException;
import org.json.JSONObject;
import p003a1.C0106e;
import p108e4.AbstractC12682p;
import p173gj.C15903d;
import p173gj.C15906g;
import p223ik.EnumC18597a;
import p223ik.InterfaceC18598b;
import p255jk.C21743a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: bk.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C3346n {

    /* JADX INFO: renamed from: a */
    public final C15903d f12995a;

    /* JADX INFO: renamed from: b */
    public final C3337e f12996b;

    public C3346n(C15903d c15903d) {
        String lowerCase;
        this.f12995a = c15903d;
        LinkedHashMap linkedHashMap = AbstractC3338f.f12956a;
        C15906g c15906g = c15903d.f60128a;
        String str = c15906g.f60156e;
        if (str != null) {
            Locale locale = Locale.getDefault();
            AbstractC22676k.m65749i(locale, "getDefault()");
            lowerCase = str.toLowerCase(locale);
            AbstractC22676k.m65749i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        } else {
            lowerCase = null;
        }
        String strConcat = (lowerCase == null || lowerCase.length() == 0 || lowerCase.equals("$default_instance")) ? "com.amplitude.api" : "com.amplitude.api_".concat(lowerCase);
        LinkedHashMap linkedHashMap2 = AbstractC3338f.f12956a;
        C3337e c3337e = (C3337e) linkedHashMap2.get(strConcat);
        if (c3337e == null) {
            c3337e = new C3337e(c15906g.f60153b, strConcat, c15906g.f60158g.m11156E(c15903d));
            linkedHashMap2.put(strConcat, c3337e);
        }
        this.f12996b = c3337e;
    }

    /* JADX INFO: renamed from: a */
    public static long m9650a(JSONObject jSONObject) throws JSONException {
        long j7 = jSONObject.getLong("$rowId");
        jSONObject.put(AnalyticsRequestV2.PARAM_EVENT_ID, j7);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("library");
        if (jSONObjectOptJSONObject != null) {
            jSONObject.put("library", jSONObjectOptJSONObject.getString("name") + '/' + jSONObjectOptJSONObject.getString("version"));
        }
        Object objOpt = jSONObject.opt("timestamp");
        if (objOpt != null) {
            jSONObject.put("time", objOpt);
        }
        Object objOpt2 = jSONObject.opt("uuid");
        if (objOpt2 != null) {
            jSONObject.put("insert_id", objOpt2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("api_properties");
        if (jSONObjectOptJSONObject2 != null) {
            Object objOpt3 = jSONObjectOptJSONObject2.opt("androidADID");
            if (objOpt3 != null) {
                jSONObject.put("adid", objOpt3);
            }
            Object objOpt4 = jSONObjectOptJSONObject2.opt("android_app_set_id");
            if (objOpt4 != null) {
                jSONObject.put("android_app_set_id", objOpt4);
            }
            Object objOpt5 = jSONObjectOptJSONObject2.opt("productId");
            if (objOpt5 != null) {
                jSONObject.put("productId", objOpt5);
            }
            Object objOpt6 = jSONObjectOptJSONObject2.opt("quantity");
            if (objOpt6 != null) {
                jSONObject.put("quantity", objOpt6);
            }
            Object objOpt7 = jSONObjectOptJSONObject2.opt("price");
            if (objOpt7 != null) {
                jSONObject.put("price", objOpt7);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("location");
            if (jSONObjectOptJSONObject3 != null) {
                Object objOpt8 = jSONObjectOptJSONObject3.opt("lat");
                if (objOpt8 != null) {
                    jSONObject.put("location_lat", objOpt8);
                }
                Object objOpt9 = jSONObjectOptJSONObject3.opt("lng");
                if (objOpt9 != null) {
                    jSONObject.put("location_lng", objOpt9);
                }
            }
        }
        Object objOpt10 = jSONObject.opt("$productId");
        if (objOpt10 != null) {
            jSONObject.put("productId", objOpt10);
        }
        Object objOpt11 = jSONObject.opt("$quantity");
        if (objOpt11 != null) {
            jSONObject.put("quantity", objOpt11);
        }
        Object objOpt12 = jSONObject.opt("$price");
        if (objOpt12 != null) {
            jSONObject.put("price", objOpt12);
        }
        Object objOpt13 = jSONObject.opt("$revenueType");
        if (objOpt13 != null) {
            jSONObject.put("revenueType", objOpt13);
        }
        return j7;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00de  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f7 A[PHI: r6
      0x00f7: PHI (r6v5 bk.n) = (r6v3 bk.n), (r6v6 bk.n) binds: [B:49:0x00dc, B:57:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115 A[PHI: r2
      0x0115: PHI (r2v19 bk.n) = (r2v17 bk.n), (r2v21 bk.n) binds: [B:63:0x0112, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f3, code lost:
    
        if (r2.m9655f(r0) == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0124, code lost:
    
        if (r12.mo33429f(r0) == r1) goto L67;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m9651b(s83.AbstractC32269c r12) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p033bk.C3346n.m9651b(s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public Object m9652c(C3339g c3339g) {
        Object objM9651b = new C3346n(this.f12995a, this.f12996b).m9651b(c3339g);
        return objM9651b == EnumC31071a.f128113w ? objM9651b : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public Object m9653d(JSONObject jSONObject, InterfaceC18598b interfaceC18598b, Function1 function1, AbstractC32269c abstractC32269c) {
        C3341i c3341i;
        long j7;
        Function1 function2;
        if (abstractC32269c instanceof C3341i) {
            c3341i = (C3341i) abstractC32269c;
            int i13 = c3341i.f12967E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3341i.f12967E = i13 - Integer.MIN_VALUE;
            } else {
                c3341i = new C3341i(this, abstractC32269c);
            }
        } else {
            c3341i = new C3341i(this, abstractC32269c);
        }
        Object obj = c3341i.f12970y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c3341i.f12967E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                long jM9650a = m9650a(jSONObject);
                C21743a c21743aM48903m0 = AbstractC17269i.m48903m0(jSONObject);
                c3341i.f12968w = (C22672i) function1;
                c3341i.f12969x = jM9650a;
                c3341i.f12967E = 1;
                if (interfaceC18598b.mo33428e(c21743aM48903m0, c3341i) == obj2) {
                    return obj2;
                }
                j7 = jM9650a;
                function2 = function1;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j7 = c3341i.f12969x;
                Function1 function3 = (Function1) c3341i.f12968w;
                AbstractC34132o.m107864I(obj);
                function2 = function3;
            }
            function2.invoke(new Long(j7));
        } catch (Exception e5) {
            String message = "event migration failed: " + e5.getMessage();
            AbstractC22676k.m65750j(message, "message");
            if (AbstractC12682p.m35482b(2, 4) <= 0) {
                Log.e("Amplitude", message);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public Object m9654e(AbstractC32269c abstractC32269c) {
        C3342j c3342j;
        AbstractList abstractListM9649x;
        C3346n c3346n;
        Iterator it;
        if (abstractC32269c instanceof C3342j) {
            c3342j = (C3342j) abstractC32269c;
            int i13 = c3342j.f12972E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3342j.f12972E = i13 - Integer.MIN_VALUE;
            } else {
                c3342j = new C3342j(this, abstractC32269c);
            }
        } else {
            c3342j = new C3342j(this, abstractC32269c);
        }
        Object obj = c3342j.f12975y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c3342j.f12972E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C3337e c3337e = this.f12996b;
                synchronized (c3337e) {
                    abstractListM9649x = c3337e.m9649x("events");
                }
                c3346n = this;
                it = abstractListM9649x.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c3342j.f12974x;
                c3346n = c3342j.f12973w;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                InterfaceC18598b interfaceC18598bM44885f = c3346n.f12995a.m44885f();
                C0106e c0106e = new C0106e(1, c3346n.f12996b, C3337e.class, "removeEvent", "removeEvent(J)V", 0, 11);
                c3342j.f12973w = c3346n;
                c3342j.f12974x = it;
                c3342j.f12972E = 1;
                if (c3346n.m9653d(jSONObject, interfaceC18598bM44885f, c0106e, c3342j) == enumC31071a) {
                    return enumC31071a;
                }
            }
        } catch (Exception e5) {
            String message = "events migration failed: " + e5.getMessage();
            AbstractC22676k.m65750j(message, "message");
            if (AbstractC12682p.m35482b(2, 4) <= 0) {
                Log.e("Amplitude", message);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public Object m9655f(AbstractC32269c abstractC32269c) {
        C3343k c3343k;
        AbstractList abstractListM9649x;
        C3346n c3346n;
        Iterator it;
        if (abstractC32269c instanceof C3343k) {
            c3343k = (C3343k) abstractC32269c;
            int i13 = c3343k.f12977E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3343k.f12977E = i13 - Integer.MIN_VALUE;
            } else {
                c3343k = new C3343k(this, abstractC32269c);
            }
        } else {
            c3343k = new C3343k(this, abstractC32269c);
        }
        Object obj = c3343k.f12980y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c3343k.f12977E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C3337e c3337e = this.f12996b;
                synchronized (c3337e) {
                    abstractListM9649x = c3337e.m9649x("identifys");
                }
                c3346n = this;
                it = abstractListM9649x.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c3343k.f12979x;
                c3346n = c3343k.f12978w;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                InterfaceC18598b interfaceC18598bM44885f = c3346n.f12995a.m44885f();
                C0106e c0106e = new C0106e(1, c3346n.f12996b, C3337e.class, "removeIdentify", "removeIdentify(J)V", 0, 12);
                c3343k.f12978w = c3346n;
                c3343k.f12979x = it;
                c3343k.f12977E = 1;
                if (c3346n.m9653d(jSONObject, interfaceC18598bM44885f, c0106e, c3343k) == enumC31071a) {
                    return enumC31071a;
                }
            }
        } catch (Exception e5) {
            String message = "identifies migration failed: " + e5.getMessage();
            AbstractC22676k.m65750j(message, "message");
            if (AbstractC12682p.m35482b(2, 4) <= 0) {
                Log.e("Amplitude", message);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: g */
    public Object m9656g(AbstractC32269c abstractC32269c) {
        C3344l c3344l;
        List listM9649x;
        Iterator it;
        C3346n c3346n;
        if (abstractC32269c instanceof C3344l) {
            c3344l = (C3344l) abstractC32269c;
            int i13 = c3344l.f12982E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3344l.f12982E = i13 - Integer.MIN_VALUE;
            } else {
                c3344l = new C3344l(this, abstractC32269c);
            }
        } else {
            c3344l = new C3344l(this, abstractC32269c);
        }
        Object obj = c3344l.f12985y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c3344l.f12982E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C3337e c3337e = this.f12996b;
                synchronized (c3337e) {
                    listM9649x = c3337e.f12955z < 4 ? C25271y.f99162w : c3337e.m9649x("identify_interceptor");
                }
                it = listM9649x.iterator();
                c3346n = this;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c3344l.f12984x;
                c3346n = c3344l.f12983w;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                InterfaceC18598b interfaceC18598bM44883d = c3346n.f12995a.m44883d();
                C0106e c0106e = new C0106e(1, c3346n.f12996b, C3337e.class, "removeInterceptedIdentify", "removeInterceptedIdentify(J)V", 0, 13);
                c3344l.f12983w = c3346n;
                c3344l.f12984x = it;
                c3344l.f12982E = 1;
                if (c3346n.m9653d(jSONObject, interfaceC18598bM44883d, c0106e, c3344l) == enumC31071a) {
                    return enumC31071a;
                }
            }
        } catch (Exception e5) {
            String message = "intercepted identifies migration failed: " + e5.getMessage();
            AbstractC22676k.m65750j(message, "message");
            if (AbstractC12682p.m35482b(2, 4) <= 0) {
                Log.e("Amplitude", message);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0104 A[DONT_INVERT, PHI: r2 r3 r6
      0x0104: PHI (r2v5 java.lang.Long) = (r2v3 java.lang.Long), (r2v3 java.lang.Long), (r2v8 java.lang.Long) binds: [B:49:0x00dd, B:50:0x00df, B:54:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r3v7 java.lang.Long) = (r3v4 java.lang.Long), (r3v4 java.lang.Long), (r3v8 java.lang.Long) binds: [B:49:0x00dd, B:50:0x00df, B:54:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r6v7 bk.n) = (r6v4 bk.n), (r6v4 bk.n), (r6v8 bk.n) binds: [B:49:0x00dd, B:50:0x00df, B:54:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x0126  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: h */
    public Object m9657h(AbstractC32269c abstractC32269c) {
        C3345m c3345m;
        Long lM125933R;
        Long lM9645i;
        Long lM9645i2;
        C3346n c3346n;
        Long l7;
        Long l12;
        Long l13;
        Long l14;
        C3346n c3346n2;
        C3346n c3346n3;
        C3337e c3337e = this.f12996b;
        C15903d c15903d = this.f12995a;
        if (abstractC32269c instanceof C3345m) {
            c3345m = (C3345m) abstractC32269c;
            int i13 = c3345m.f12990H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3345m.f12990H = i13 - Integer.MIN_VALUE;
            } else {
                c3345m = new C3345m(this, abstractC32269c);
            }
        } else {
            c3345m = new C3345m(this, abstractC32269c);
        }
        Object obj = c3345m.f12988F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c3345m.f12990H;
        C23454a0 c23454a0 = C23454a0.f92919a;
        EnumC18597a enumC18597a = EnumC18597a.LAST_EVENT_ID;
        EnumC18597a enumC18597a2 = EnumC18597a.LAST_EVENT_TIME;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    lM9645i2 = c3345m.f12987E;
                    l13 = c3345m.f12994z;
                    l12 = c3345m.f12993y;
                    l14 = c3345m.f12992x;
                    c3346n2 = c3345m.f12991w;
                    AbstractC34132o.m107864I(obj);
                } else {
                    if (i14 == 2) {
                        lM9645i2 = c3345m.f12993y;
                        l7 = c3345m.f12992x;
                        c3346n = c3345m.f12991w;
                        AbstractC34132o.m107864I(obj);
                        c3346n.f12996b.m9642T("last_event_time");
                        if (l7 == null && lM9645i2 != null) {
                            InterfaceC18598b interfaceC18598bM44885f = c3346n.f12995a.m44885f();
                            String string = lM9645i2.toString();
                            c3345m.f12991w = c3346n;
                            c3345m.f12992x = null;
                            c3345m.f12993y = null;
                            c3345m.f12994z = null;
                            c3345m.f12987E = null;
                            c3345m.f12990H = 3;
                            interfaceC18598bM44885f.mo33425b(enumC18597a, string);
                            if (c23454a0 != enumC31071a) {
                                c3346n3 = c3346n;
                            }
                            return enumC31071a;
                        }
                        return c23454a0;
                    }
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3346n3 = c3345m.f12991w;
                    AbstractC34132o.m107864I(obj);
                }
                c3346n3.f12996b.m9642T("last_event_id");
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC18598b interfaceC18598bM44885f2 = c15903d.m44885f();
            EnumC18597a enumC18597a3 = EnumC18597a.PREVIOUS_SESSION_ID;
            String strMo33426c = interfaceC18598bM44885f2.mo33426c(enumC18597a3);
            Long lM125933R2 = strMo33426c != null ? AbstractC39421y.m125933R(strMo33426c) : null;
            String strMo33426c2 = c15903d.m44885f().mo33426c(enumC18597a2);
            lM125933R = strMo33426c2 != null ? AbstractC39421y.m125933R(strMo33426c2) : null;
            String strMo33426c3 = c15903d.m44885f().mo33426c(enumC18597a);
            Long lM125933R3 = strMo33426c3 != null ? AbstractC39421y.m125933R(strMo33426c3) : null;
            Long lM9645i3 = c3337e.m9645i("previous_session_id");
            lM9645i = c3337e.m9645i("last_event_time");
            lM9645i2 = c3337e.m9645i("last_event_id");
            if (lM125933R2 != null || lM9645i3 == null) {
                c3346n = this;
                l7 = lM125933R3;
                if (lM125933R == null || lM9645i == null) {
                    if (l7 == null) {
                        InterfaceC18598b interfaceC18598bM44885f3 = c3346n.f12995a.m44885f();
                        String string2 = lM9645i2.toString();
                        c3345m.f12991w = c3346n;
                        c3345m.f12992x = null;
                        c3345m.f12993y = null;
                        c3345m.f12994z = null;
                        c3345m.f12987E = null;
                        c3345m.f12990H = 3;
                        interfaceC18598bM44885f3.mo33425b(enumC18597a, string2);
                        if (c23454a0 != enumC31071a) {
                            c3346n3 = c3346n;
                            c3346n3.f12996b.m9642T("last_event_id");
                        }
                    }
                    return c23454a0;
                }
                InterfaceC18598b interfaceC18598bM44885f4 = c3346n.f12995a.m44885f();
                String string3 = lM9645i.toString();
                c3345m.f12991w = c3346n;
                c3345m.f12992x = l7;
                c3345m.f12993y = lM9645i2;
                c3345m.f12994z = null;
                c3345m.f12987E = null;
                c3345m.f12990H = 2;
                interfaceC18598bM44885f4.mo33425b(enumC18597a2, string3);
                if (c23454a0 != enumC31071a) {
                    c3346n.f12996b.m9642T("last_event_time");
                    if (l7 == null) {
                        InterfaceC18598b interfaceC18598bM44885f5 = c3346n.f12995a.m44885f();
                        String string4 = lM9645i2.toString();
                        c3345m.f12991w = c3346n;
                        c3345m.f12992x = null;
                        c3345m.f12993y = null;
                        c3345m.f12994z = null;
                        c3345m.f12987E = null;
                        c3345m.f12990H = 3;
                        interfaceC18598bM44885f5.mo33425b(enumC18597a, string4);
                        if (c23454a0 != enumC31071a) {
                            c3346n3 = c3346n;
                            c3346n3.f12996b.m9642T("last_event_id");
                        }
                    }
                    return c23454a0;
                }
            } else {
                InterfaceC18598b interfaceC18598bM44885f6 = c15903d.m44885f();
                String string5 = lM9645i3.toString();
                c3345m.f12991w = this;
                c3345m.f12992x = lM125933R;
                c3345m.f12993y = lM125933R3;
                c3345m.f12994z = lM9645i;
                c3345m.f12987E = lM9645i2;
                c3345m.f12990H = 1;
                interfaceC18598bM44885f6.mo33425b(enumC18597a3, string5);
                if (c23454a0 != enumC31071a) {
                    l12 = lM125933R3;
                    l13 = lM9645i;
                    l14 = lM125933R;
                    c3346n2 = this;
                }
            }
            return enumC31071a;
            c3346n2.f12996b.m9642T("previous_session_id");
            Long l15 = l14;
            lM9645i = l13;
            l7 = l12;
            c3346n = c3346n2;
            lM125933R = l15;
            if (lM125933R == null) {
                if (l7 == null) {
                    InterfaceC18598b interfaceC18598bM44885f7 = c3346n.f12995a.m44885f();
                    String string6 = lM9645i2.toString();
                    c3345m.f12991w = c3346n;
                    c3345m.f12992x = null;
                    c3345m.f12993y = null;
                    c3345m.f12994z = null;
                    c3345m.f12987E = null;
                    c3345m.f12990H = 3;
                    interfaceC18598bM44885f7.mo33425b(enumC18597a, string6);
                    if (c23454a0 != enumC31071a) {
                        c3346n3 = c3346n;
                        c3346n3.f12996b.m9642T("last_event_id");
                    }
                    return enumC31071a;
                }
            } else if (l7 == null) {
                InterfaceC18598b interfaceC18598bM44885f8 = c3346n.f12995a.m44885f();
                String string7 = lM9645i2.toString();
                c3345m.f12991w = c3346n;
                c3345m.f12992x = null;
                c3345m.f12993y = null;
                c3345m.f12994z = null;
                c3345m.f12987E = null;
                c3345m.f12990H = 3;
                interfaceC18598bM44885f8.mo33425b(enumC18597a, string7);
                if (c23454a0 != enumC31071a) {
                    c3346n3 = c3346n;
                    c3346n3.f12996b.m9642T("last_event_id");
                }
                return enumC31071a;
            }
        } catch (Exception e5) {
            String message = "session data migration failed: " + e5.getMessage();
            AbstractC22676k.m65750j(message, "message");
            if (AbstractC12682p.m35482b(2, 4) <= 0) {
                Log.e("Amplitude", message);
            }
        }
        return c23454a0;
    }

    public C3346n(C15903d c15903d, C3337e databaseStorage) {
        AbstractC22676k.m65750j(databaseStorage, "databaseStorage");
        this.f12995a = c15903d;
        this.f12996b = databaseStorage;
    }
}
