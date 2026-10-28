package p133f1;

import ai.C0904j;
import android.content.Context;
import android.os.Handler;
import android.os.Parcelable;
import android.view.MotionEvent;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.common.movement.C5454a;
import com.nimbusds.jose.shaded.gson.JsonIOException;
import dc3.C11923h;
import dc3.EnumC11916a;
import e93.AbstractC12889b;
import i93.C18283i;
import i93.C18284j;
import ih0.AbstractC18489d0;
import io.sentry.C20339g2;
import io.sentry.C20517r2;
import io.sentry.EnumC20436n5;
import io.sentry.android.core.C20166w0;
import io.sentry.android.core.C20168x0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.vendor.gson.stream.C20611a;
import io.sentry.vendor.gson.stream.EnumC20612b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import lb3.InterfaceC23796q0;
import m83.AbstractC25243e0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import mb3.InterfaceC25386c;
import mm.C25680d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002a0.C0062y;
import p026b2.C2319y;
import p031b9.AbstractC2875y;
import p031b9.C2817b;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p161g.C14894a;
import p164g2.C15247s;
import p179h.C16353k;
import p294l3.C23283u0;
import p412q3.C29891y;
import p440qw.AbstractC30672g;
import p440qw.C30679n;
import p440qw.InterfaceC30680o;
import p465rm.RunnableC31514a;
import p465rm.SurfaceHolderCallbackC31565r;
import p474s.AbstractC32004s;
import p510u0.C34354s0;
import p510u0.EnumC34318g0;
import p512u2.AbstractC34471q;
import p512u2.C34474t;
import p563vw.C36540a;
import p565vy.InterfaceC36562b;
import p598wy.C37688a;
import p598wy.InterfaceC37689b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import pl.C29342e;
import pl.InterfaceC29339b;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qa.C30097b;
import r93.InterfaceC31108b;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import s30.AbstractC32100b;
import so.C32800q;
import tl.AbstractC33913l;
import tw.AbstractC34214c;
import u10.C34418f;
import xg3.AbstractC38292s;
import xg3.InterfaceC38282i;
import y00.C38776a2;
import y00.C38785b1;
import y00.C38795c1;
import y00.C38797c3;
import y00.C38805d1;
import y00.C38825f1;
import y00.C38835g1;
import y00.C38855i1;
import y00.C38865j1;
import y00.C38903n1;
import y00.C38912o1;
import y00.C38915o4;
import y00.C38921p1;
import y00.C38939r1;
import y00.C38957t1;
import y00.C38966u1;
import y00.C38983w0;
import y00.C38984w1;
import y00.C39001y0;
import y00.C39002y1;
import y00.EnumC38885l1;
import y00.EnumC38894m1;
import y00.EnumC38922p2;
import y00.EnumC38930q1;
import y00.EnumC38941r3;
import y00.EnumC38948s1;
import y00.InterfaceC38786b2;
import y00.InterfaceC38802c8;
import y00.InterfaceC38845h1;
import y00.InterfaceC38875k1;
import y00.InterfaceC39010z0;
import ya3.C39361d;
import yb3.AbstractC39414r;
import yo0.C39681c;
import z00.C39932a;
import z00.C39938g;

/* JADX INFO: renamed from: f1.p1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13968p1 implements InterfaceC13948j, InterfaceC38282i, InterfaceC25386c, InterfaceC37689b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49806w;

    /* JADX INFO: renamed from: x */
    public boolean f49807x;

    /* JADX INFO: renamed from: y */
    public Object f49808y;

    /* JADX INFO: renamed from: z */
    public Object f49809z;

    public /* synthetic */ C13968p1(int i13, Object obj, Object obj2) {
        this.f49806w = i13;
        this.f49808y = obj;
        this.f49809z = obj2;
    }

    /* JADX INFO: renamed from: e */
    public static String m39746e(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* JADX INFO: renamed from: w */
    public static void m39747w(BufferedInputStream bufferedInputStream, long j7) throws IOException {
        while (j7 > 0) {
            long jSkip = bufferedInputStream.skip(j7);
            if (jSkip != 0) {
                j7 -= jSkip;
            } else {
                if (bufferedInputStream.read() == -1) {
                    throw new EOFException("Unexpected end of stream while skipping bytes");
                }
                j7--;
            }
        }
    }

    @Override // mb3.InterfaceC25386c
    /* JADX INFO: renamed from: a */
    public boolean mo39748a(InterfaceC23796q0 c3, InterfaceC23796q0 c7) {
        boolean z4 = this.f49807x;
        InterfaceC31108b interfaceC31108b = (InterfaceC31108b) this.f49808y;
        InterfaceC31108b interfaceC31108b2 = (InterfaceC31108b) this.f49809z;
        AbstractC22676k.m65750j(c3, "c1");
        AbstractC22676k.m65750j(c7, "c2");
        if (c3.equals(c7)) {
            return true;
        }
        InterfaceC31126h interfaceC31126hMo1784d = c3.mo1784d();
        InterfaceC31126h interfaceC31126hMo1784d2 = c7.mo1784d();
        if (!(interfaceC31126hMo1784d instanceof InterfaceC31165x0) || !(interfaceC31126hMo1784d2 instanceof InterfaceC31165x0)) {
            return false;
        }
        C34418f c34418f = new C34418f(6, interfaceC31108b, interfaceC31108b2);
        return C39361d.f169412a.m125518b((InterfaceC31165x0) interfaceC31126hMo1784d, (InterfaceC31165x0) interfaceC31126hMo1784d2, z4, c34418f);
    }

    @Override // p133f1.InterfaceC13948j
    /* JADX INFO: renamed from: b */
    public boolean mo2196b(long j7, C13984v c13984v, int i13) {
        C34354s0 c34354s0;
        C13977s1 c13977s1 = (C13977s1) this.f49809z;
        if (!c13977s1.m39780j() || c13977s1.m39783m().f122125a.f92135x.length() == 0 || (c34354s0 = c13977s1.f49848d) == null || c34354s0.m108662d() == null) {
            return false;
        }
        C15247s c15247s = c13977s1.f49856l;
        if (c15247s != null) {
            C15247s.m43350c(c15247s);
        }
        c13977s1.f49859o = j7;
        c13977s1.f49864t = -1;
        c13977s1.m39778h(true);
        long jM39765x = m39765x(c13977s1.m39783m(), c13977s1.f49859o, true, c13984v);
        if (i13 >= 2) {
            this.f49807x = true;
            this.f49808y = new C23283u0(jM39765x);
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m39749c(long j7) {
        Object obj;
        List list = (List) ((C32800q) this.f49809z).f136504w;
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (AbstractC34471q.m108943a(((C34474t) obj).f144833a, j7)) {
                break;
            }
            i13++;
        }
        C34474t c34474t = (C34474t) obj;
        if (c34474t != null) {
            return c34474t.f144840h;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m39750d() {
        ((C11923h) this.f49808y).m32207h(new CancellationException("onBack cancelled"), true);
        ((C2996c2) this.f49809z).cancel((CancellationException) null);
    }

    /* JADX INFO: renamed from: f */
    public boolean m39751f(InterfaceC29339b interfaceC29339b) {
        boolean z4 = true;
        if (interfaceC29339b == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f49808y).remove(interfaceC29339b);
        if (!((ArrayList) this.f49809z).remove(interfaceC29339b) && !zRemove) {
            z4 = false;
        }
        if (z4) {
            ((C29342e) interfaceC29339b).m89333c();
        }
        return z4;
    }

    @Override // p133f1.InterfaceC13948j
    /* JADX INFO: renamed from: g */
    public void mo2201g() {
        if (this.f49807x) {
            C13977s1.m39771a((C13977s1) this.f49809z, (C23283u0) this.f49808y);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m39752h() {
        ((C11923h) this.f49808y).mo32217r(null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:5:0x0011, B:6:0x001d, B:8:0x0025, B:21:0x0058, B:13:0x0038, B:15:0x0040, B:18:0x0047, B:20:0x004f, B:24:0x005f, B:27:0x0069), top: B:50:0x0011, outer: #4 }] */
    /* JADX INFO: renamed from: i */
    public C20168x0 m39753i(BufferedInputStream bufferedInputStream, int i13, File file) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f49808y;
        C20168x0 c20168x0 = null;
        try {
            C20166w0 c20166w0 = new C20166w0(bufferedInputStream, i13);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(c20166w0, StandardCharsets.UTF_8);
                try {
                    C20339g2 c20339g2 = new C20339g2(inputStreamReader);
                    C20611a c20611a = c20339g2.f76355w;
                    c20339g2.beginObject();
                    String strMo56509w0 = null;
                    Date dateMo56498U = null;
                    while (c20611a.peek() == EnumC20612b.NAME) {
                        String strNextName = c20611a.nextName();
                        int iHashCode = strNextName.hashCode();
                        if (iHashCode != 55126294) {
                            if (iHashCode == 1874684019 && strNextName.equals("platform")) {
                                strMo56509w0 = c20339g2.mo56509w0();
                            } else {
                                c20339g2.skipValue();
                            }
                        } else if (strNextName.equals("timestamp")) {
                            dateMo56498U = c20339g2.mo56498U(sentryAndroidOptions.getLogger());
                        } else {
                            c20339g2.skipValue();
                        }
                        if (strMo56509w0 != null && dateMo56498U != null) {
                            break;
                        }
                    }
                    if ("native".equals(strMo56509w0) && dateMo56498U != null) {
                        c20168x0 = new C20168x0(file, dateMo56498U.getTime());
                    }
                    inputStreamReader.close();
                    c20166w0.close();
                    return c20168x0;
                } catch (Throwable th3) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                try {
                    c20166w0.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (Throwable th7) {
            sentryAndroidOptions.getLogger().mo16058i(EnumC20436n5.DEBUG, th7, "Error parsing event JSON from: %s", file.getName());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0105  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0121  */
    /* JADX WARN: Code duplicated, block: B:64:0x0129  */
    /* JADX WARN: Code duplicated, block: B:65:0x0130  */
    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX INFO: renamed from: j */
    public InterfaceC30680o m39754j(C36540a c36540a, boolean z4) {
        InterfaceC30680o interfaceC30680o;
        String str;
        InterfaceC30680o c5454a;
        final Type type = c36540a.f156460b;
        Class cls = c36540a.f156459a;
        HashMap map = (HashMap) this.f49808y;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        if (map.get(cls) != null) {
            throw new ClassCastException();
        }
        final int i13 = 0;
        final int i14 = 1;
        C30097b c30097b = null;
        if (EnumSet.class.isAssignableFrom(cls)) {
            interfaceC30680o = new InterfaceC30680o() { // from class: qw.a
                @Override // p440qw.InterfaceC30680o
                public final Object construct() {
                    switch (i13) {
                        case 0:
                            Type type2 = type;
                            if (!(type2 instanceof ParameterizedType)) {
                                throw new JsonIOException("Invalid EnumSet type: " + type2.toString());
                            }
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return EnumSet.noneOf((Class) type3);
                            }
                            throw new JsonIOException("Invalid EnumSet type: " + type2.toString());
                        default:
                            Type type4 = type;
                            if (!(type4 instanceof ParameterizedType)) {
                                throw new JsonIOException("Invalid EnumMap type: " + type4.toString());
                            }
                            Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                            if (type5 instanceof Class) {
                                return new EnumMap((Class) type5);
                            }
                            throw new JsonIOException("Invalid EnumMap type: " + type4.toString());
                    }
                }
            };
        } else {
            interfaceC30680o = cls == EnumMap.class ? new InterfaceC30680o() { // from class: qw.a
                @Override // p440qw.InterfaceC30680o
                public final Object construct() {
                    switch (i14) {
                        case 0:
                            Type type2 = type;
                            if (!(type2 instanceof ParameterizedType)) {
                                throw new JsonIOException("Invalid EnumSet type: " + type2.toString());
                            }
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return EnumSet.noneOf((Class) type3);
                            }
                            throw new JsonIOException("Invalid EnumSet type: " + type2.toString());
                        default:
                            Type type4 = type;
                            if (!(type4 instanceof ParameterizedType)) {
                                throw new JsonIOException("Invalid EnumMap type: " + type4.toString());
                            }
                            Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                            if (type5 instanceof Class) {
                                return new EnumMap((Class) type5);
                            }
                            throw new JsonIOException("Invalid EnumMap type: " + type4.toString());
                    }
                }
            } : null;
        }
        if (interfaceC30680o != null) {
            return interfaceC30680o;
        }
        AbstractC30672g.m94270f((ArrayList) this.f49809z);
        int i15 = 2;
        if (Modifier.isAbstract(cls.getModifiers())) {
            c5454a = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                AbstractC32100b abstractC32100b = AbstractC34214c.f143522a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e5) {
                    str = "Failed making constructor '" + AbstractC34214c.m108137b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e5.getMessage() + AbstractC34214c.m108140e(e5);
                }
                c5454a = str != null ? new C5454a(str, i15) : new C25680d(declaredConstructor, 26);
            } catch (NoSuchMethodException unused) {
                c5454a = null;
            }
        }
        if (c5454a != null) {
            return c5454a;
        }
        int i16 = 4;
        int i17 = 3;
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(ArrayList.class)) {
                c30097b = new C30097b(7);
            } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                c30097b = new C30097b(8);
            } else if (cls.isAssignableFrom(TreeSet.class)) {
                c30097b = new C30097b(9);
            } else if (cls.isAssignableFrom(ArrayDeque.class)) {
                c30097b = new C30097b(i15);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(C30679n.class)) {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    if (actualTypeArguments.length == 0 || AbstractC30672g.m94272h(actualTypeArguments[0]) != String.class) {
                        if (cls.isAssignableFrom(LinkedHashMap.class)) {
                            c30097b = new C30097b(i17);
                        } else if (cls.isAssignableFrom(TreeMap.class)) {
                            c30097b = new C30097b(i16);
                        } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                            c30097b = new C30097b(5);
                        } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                            c30097b = new C30097b(6);
                        }
                    }
                }
                c30097b = new C30097b(i14);
            } else if (cls.isAssignableFrom(LinkedHashMap.class)) {
                c30097b = new C30097b(i17);
            } else if (cls.isAssignableFrom(TreeMap.class)) {
                c30097b = new C30097b(i16);
            } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                c30097b = new C30097b(5);
            } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                c30097b = new C30097b(6);
            }
        }
        if (c30097b != null) {
            return c30097b;
        }
        String strM39746e = m39746e(cls);
        if (strM39746e != null) {
            return new C5454a(strM39746e, i17);
        }
        if (!z4) {
            return new C5454a("Unable to create instance of " + cls + "; Register an InstanceCreator or a TypeAdapter for this type.", i16);
        }
        if (this.f49807x) {
            return new C25680d(cls, 25);
        }
        String strM8299l = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            strM8299l = AbstractC2875y.m8299l(strM8299l, " Or adjust your R8 configuration to keep the no-args constructor of the class.");
        }
        return new C5454a(strM8299l, i14);
    }

    /* JADX INFO: renamed from: k */
    public C0062y m39755k() {
        return (C0062y) this.f49808y;
    }

    /* JADX INFO: renamed from: l */
    public MotionEvent m39756l() {
        return (MotionEvent) ((C32800q) this.f49809z).f136505x;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0383  */
    /* JADX WARN: Code duplicated, block: B:158:0x0388  */
    /* JADX WARN: Code duplicated, block: B:161:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:163:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:166:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:168:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:170:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:171:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:173:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:175:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:177:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:179:0x0405  */
    /* JADX WARN: Code duplicated, block: B:182:0x0419  */
    /* JADX WARN: Code duplicated, block: B:184:0x042c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0440  */
    /* JADX WARN: Code duplicated, block: B:190:0x0456  */
    /* JADX WARN: Code duplicated, block: B:197:0x046f  */
    /* JADX WARN: Code duplicated, block: B:202:0x047e  */
    /* JADX WARN: Code duplicated, block: B:204:0x0488  */
    /* JADX WARN: Code duplicated, block: B:208:0x0495  */
    /* JADX WARN: Code duplicated, block: B:211:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:214:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:216:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:217:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:220:0x04de  */
    /* JADX WARN: Code duplicated, block: B:222:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:225:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:230:0x0500  */
    /* JADX WARN: Code duplicated, block: B:231:0x0504  */
    /* JADX WARN: Code duplicated, block: B:233:0x0511  */
    /* JADX WARN: Code duplicated, block: B:235:0x0518  */
    /* JADX WARN: Code duplicated, block: B:237:0x051e  */
    /* JADX WARN: Code duplicated, block: B:242:0x054e  */
    /* JADX WARN: Code duplicated, block: B:244:0x0556  */
    /* JADX WARN: Code duplicated, block: B:245:0x0559  */
    /* JADX WARN: Code duplicated, block: B:247:0x0570  */
    /* JADX WARN: Code duplicated, block: B:250:0x0580  */
    /* JADX WARN: Code duplicated, block: B:252:0x0583  */
    /* JADX WARN: Code duplicated, block: B:255:0x058e  */
    /* JADX WARN: Code duplicated, block: B:257:0x0592  */
    /* JADX WARN: Code duplicated, block: B:260:0x059d  */
    /* JADX WARN: Code duplicated, block: B:262:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:265:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:267:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:270:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:272:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:275:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:277:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:280:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:282:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:285:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:287:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:290:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:292:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:295:0x0606  */
    /* JADX WARN: Code duplicated, block: B:297:0x060a  */
    /* JADX WARN: Code duplicated, block: B:307:0x0635  */
    /* JADX WARN: Code duplicated, block: B:309:0x0639  */
    /* JADX WARN: Code duplicated, block: B:312:0x064b  */
    /* JADX WARN: Code duplicated, block: B:316:0x0664  */
    /* JADX WARN: Code duplicated, block: B:318:0x0668  */
    /* JADX WARN: Code duplicated, block: B:319:0x066f  */
    /* JADX WARN: Code duplicated, block: B:322:0x0690  */
    /* JADX WARN: Code duplicated, block: B:324:0x0694  */
    /* JADX WARN: Code duplicated, block: B:327:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:329:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:341:0x0476 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x0659 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x0645 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x0521 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x01f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r16v5, types: [y00.r1] */
    /* JADX WARN: Type inference failed for: r17v0, types: [y00.p1] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r20v1, types: [y00.b1] */
    /* JADX WARN: Type inference failed for: r24v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6, types: [y00.c3] */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [y00.o1] */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2, types: [y00.p2] */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v5, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v33, types: [z00.g] */
    /* JADX WARN: Type inference failed for: r4v43, types: [z00.a] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r9v32, types: [b9.b] */
    /* JADX WARN: Type inference failed for: r9v33, types: [b9.b] */
    @Override // p598wy.InterfaceC37689b
    /* JADX INFO: renamed from: m */
    public InterfaceC36562b mo8011m(JSONObject jSONObject) throws JSONException {
        C38903n1 c38903n1;
        List list;
        C25272z c25272z;
        List list2;
        Map mapM74001j0;
        String str;
        String str2;
        ?? arrayList;
        String str3;
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        Object next;
        InterfaceC38875k1 c38865j1;
        C38903n1 c38903n2;
        JSONObject jSONObjectOptJSONObject2;
        ?? c38912o1;
        ?? r10;
        InterfaceC36562b c38921p1;
        JSONObject jSONObjectOptJSONObject3;
        ?? OptJSONArray;
        InterfaceC4339a interfaceC4339a;
        boolean z4;
        InterfaceC38786b2 interfaceC38786b2;
        JSONObject jSONObjectOptJSONObject4;
        ?? r14;
        InterfaceC39010z0 interfaceC39010z0;
        String str4;
        InterfaceC38802c8 interfaceC38802c8M8020x;
        InterfaceC38802c8 interfaceC38802c8;
        InterfaceC38802c8 interfaceC38802c8M128100a;
        JSONObject jSONObjectOptJSONObject5;
        String str5;
        InterfaceC36562b c38939r1;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject6;
        ArrayList arrayList2;
        JSONArray jSONArrayOptJSONArray2;
        int length;
        int i13;
        String strOptString2;
        InterfaceC36562b c38785b1;
        String strOptString3;
        String strOptString4;
        String strM99551t;
        JSONObject jSONObjectOptJSONObject7;
        ?? r25;
        String strOptString5;
        String strOptString6;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        ?? r33;
        Map mapM74001j1;
        ?? OptJSONArray2;
        Object objM31995n;
        LinkedHashMap linkedHashMap;
        Iterator<String> itKeys;
        String next2;
        Object obj;
        String strOptString7;
        Object next3;
        InterfaceC36562b c38797c3;
        ArrayList arrayList3;
        Iterator it;
        JSONObject jSONObjectOptJSONObject8;
        String strM99551t2;
        Parcelable c38795c1;
        String strM99551t3;
        String strM99551t4;
        String strM99551t5;
        JSONObject jSONObjectOptJSONObject9;
        Map mapM74001j2;
        Iterator<String> itKeys2;
        String next4;
        Iterator it3;
        Object next5;
        EnumC38930q1 enumC38930q1;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        Object next6;
        JSONObject jSONObjectOptJSONObject10 = jSONObject.optJSONObject("payment_method_preference");
        JSONObject jSONObjectM99546o = AbstractC32004s.m99546o(jSONObjectOptJSONObject10 != null ? AbstractC32004s.m99544m(jSONObjectOptJSONObject10) : null);
        String strM99551t6 = AbstractC32004s.m99551t("object", jSONObjectM99546o);
        if (jSONObjectM99546o == null || !"payment_method_preference".equals(strM99551t6)) {
            return null;
        }
        String str6 = "country_code";
        String strOptString8 = jSONObjectM99546o.optString("country_code");
        String str7 = "unactivated_payment_method_types";
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("unactivated_payment_method_types");
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("payment_method_specs");
        String string = jSONArrayOptJSONArray4 != null ? jSONArrayOptJSONArray4.toString() : null;
        JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("external_payment_method_data");
        String string2 = jSONArrayOptJSONArray5 != null ? jSONArrayOptJSONArray5.toString() : null;
        JSONArray jSONArrayOptJSONArray6 = jSONObjectM99546o.optJSONArray("ordered_payment_method_types");
        JSONArray jSONArrayOptJSONArray7 = jSONObject.optJSONArray("ordered_payment_method_types_and_wallets");
        C25271y c25271y = C25271y.f99162w;
        if (jSONArrayOptJSONArray7 != null) {
            C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray7.length());
            c38903n1 = null;
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
            Iterator it4 = c18284jM36278i0.iterator();
            while (((C18283i) it4).f71138y) {
                arrayList4.add(jSONArrayOptJSONArray7.getString(((AbstractC25243e0) it4).nextInt()));
            }
            list = arrayList4;
        } else {
            c38903n1 = null;
            list = c25271y;
        }
        JSONObject jSONObjectOptJSONObject11 = jSONObject.optJSONObject("flags");
        C25272z c25272z2 = C25272z.f99163w;
        String str8 = "keys(...)";
        if (jSONObjectOptJSONObject11 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            c25272z = c25272z2;
            Iterator<String> itKeys3 = jSONObjectOptJSONObject11.keys();
            AbstractC22676k.m65749i(itKeys3, "keys(...)");
            while (itKeys3.hasNext()) {
                Iterator<String> it5 = itKeys3;
                String next7 = itKeys3.next();
                C25271y c25271y2 = c25271y;
                Object obj2 = jSONObjectOptJSONObject11.get(next7);
                Iterator it6 = EnumC38948s1.f167650K.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        jSONObject3 = jSONObjectOptJSONObject11;
                        next6 = c38903n1;
                        break;
                    }
                    next6 = it6.next();
                    jSONObject3 = jSONObjectOptJSONObject11;
                    if (((EnumC38948s1) next6).f167654w.equals(next7)) {
                        break;
                    }
                    jSONObjectOptJSONObject11 = jSONObject3;
                }
                EnumC38948s1 enumC38948s1 = (EnumC38948s1) next6;
                if (enumC38948s1 != null && (obj2 instanceof Boolean)) {
                    linkedHashMap2.put(enumC38948s1, obj2);
                }
                c25271y = c25271y2;
                itKeys3 = it5;
                jSONObjectOptJSONObject11 = jSONObject3;
            }
            list2 = c25271y;
            mapM74001j0 = AbstractC25247g0.m74001j0(linkedHashMap2);
        } else {
            c25272z = c25272z2;
            list2 = c25271y;
            mapM74001j0 = c25272z;
        }
        String strOptString9 = jSONObject.optString("session_id");
        String strOptString10 = jSONObject.optString("config_id");
        JSONObject jSONObjectOptJSONObject12 = jSONObject.optJSONObject("customer");
        String str9 = string;
        Map map = mapM74001j0;
        boolean zM65745e = AbstractC22676k.m65745e(mapM74001j0.get(EnumC38948s1.ELEMENTS_ENABLE_LINK_SPM), Boolean.TRUE);
        String str10 = "optJSONObject(...)";
        if (jSONObjectOptJSONObject12 != null) {
            if (zM65745e) {
                JSONArray jSONArrayOptJSONArray8 = jSONObjectOptJSONObject12.optJSONArray("payment_methods_with_link_details");
                str = string2;
                if (jSONArrayOptJSONArray8 != null) {
                    C18284j c18284jM36278i1 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray8.length());
                    arrayList = new ArrayList();
                    Iterator it7 = c18284jM36278i1.iterator();
                    while (((C18283i) it7).f71138y) {
                        int iNextInt = ((AbstractC25243e0) it7).nextInt();
                        String str11 = str8;
                        C39932a c39932a = C39932a.f172377G;
                        JSONObject jSONObjectOptJSONObject13 = jSONArrayOptJSONArray8.optJSONObject(iNextInt);
                        AbstractC22676k.m65749i(jSONObjectOptJSONObject13, "optJSONObject(...)");
                        C38915o4 c38915o4M128096d = c39932a.m128096d(jSONObjectOptJSONObject13);
                        if (c38915o4M128096d != null) {
                            arrayList.add(c38915o4M128096d);
                        }
                        str8 = str11;
                    }
                } else {
                    arrayList = list2;
                }
                str2 = str8;
            } else {
                str = string2;
                list = list;
                str2 = "keys(...)";
                JSONArray jSONArrayOptJSONArray9 = jSONObjectOptJSONObject12.optJSONArray("payment_methods");
                if (jSONArrayOptJSONArray9 != null) {
                    C18284j c18284jM36278i2 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray9.length());
                    arrayList = new ArrayList();
                    Iterator it8 = c18284jM36278i2.iterator();
                    while (((C18283i) it8).f71138y) {
                        int iNextInt2 = ((AbstractC25243e0) it8).nextInt();
                        Iterator it9 = it8;
                        String str12 = strOptString9;
                        C39932a c39932a2 = new C39932a(29);
                        JSONObject jSONObjectOptJSONObject14 = jSONArrayOptJSONArray9.optJSONObject(iNextInt2);
                        AbstractC22676k.m65749i(jSONObjectOptJSONObject14, "optJSONObject(...)");
                        arrayList.add(c39932a2.m128096d(jSONObjectOptJSONObject14));
                        it8 = it9;
                        strOptString9 = str12;
                    }
                } else {
                    arrayList = list2;
                }
            }
            str3 = strOptString9;
            JSONObject jSONObjectOptJSONObject15 = jSONObjectOptJSONObject12.optJSONObject("customer_session");
            if (jSONObjectOptJSONObject15 == null || (strOptString = jSONObjectOptJSONObject15.optString("id")) == null) {
                str6 = "country_code";
                strOptString8 = strOptString8;
                str7 = "unactivated_payment_method_types";
                jSONArrayOptJSONArray3 = jSONArrayOptJSONArray3;
                jSONArrayOptJSONArray6 = jSONArrayOptJSONArray6;
                str10 = "optJSONObject(...)";
                c38912o1 = c38903n1;
            } else {
                boolean zOptBoolean = jSONObjectOptJSONObject15.optBoolean("livemode");
                String strOptString11 = jSONObjectOptJSONObject15.optString("api_key");
                if (strOptString11 == null) {
                    str6 = "country_code";
                    strOptString8 = strOptString8;
                    str7 = "unactivated_payment_method_types";
                    jSONArrayOptJSONArray3 = jSONArrayOptJSONArray3;
                    jSONArrayOptJSONArray6 = jSONArrayOptJSONArray6;
                    str10 = "optJSONObject(...)";
                    c38912o1 = c38903n1;
                } else {
                    int iOptInt = jSONObjectOptJSONObject15.optInt("api_key_expiry");
                    String strOptString12 = jSONObjectOptJSONObject15.optString("customer");
                    if (strOptString12 == null) {
                        str6 = "country_code";
                        strOptString8 = strOptString8;
                        str7 = "unactivated_payment_method_types";
                        jSONArrayOptJSONArray3 = jSONArrayOptJSONArray3;
                        jSONArrayOptJSONArray6 = jSONArrayOptJSONArray6;
                        str10 = "optJSONObject(...)";
                    } else {
                        JSONObject jSONObjectOptJSONObject16 = jSONObjectOptJSONObject15.optJSONObject("components");
                        if (jSONObjectOptJSONObject16 == null) {
                            strOptString8 = strOptString8;
                            str7 = "unactivated_payment_method_types";
                            jSONArrayOptJSONArray3 = jSONArrayOptJSONArray3;
                            jSONArrayOptJSONArray6 = jSONArrayOptJSONArray6;
                            c38903n2 = c38903n1;
                        } else {
                            JSONObject jSONObjectOptJSONObject17 = jSONObjectOptJSONObject16.optJSONObject("mobile_payment_element");
                            C38855i1 c38855i1 = C38855i1.f167268w;
                            if (jSONObjectOptJSONObject17 == null || !jSONObjectOptJSONObject17.optBoolean("enabled") || (jSONObjectOptJSONObject = jSONObjectOptJSONObject17.optJSONObject("features")) == null) {
                                c38865j1 = c38855i1;
                            } else {
                                String strOptString13 = jSONObjectOptJSONObject.optString("payment_method_save");
                                String strOptString14 = jSONObjectOptJSONObject.optString("payment_method_remove");
                                String strM99551t7 = AbstractC32004s.m99551t("payment_method_remove_last", jSONObjectOptJSONObject);
                                EnumC38894m1 enumC38894m1 = strM99551t7 == null ? EnumC38894m1.f167438y : strM99551t7.equals("enabled") ? EnumC38894m1.f167436w : EnumC38894m1.f167437x;
                                String strOptString15 = jSONObjectOptJSONObject.optString("payment_method_set_as_default");
                                String strOptString16 = jSONObjectOptJSONObject.optString("payment_method_save_allow_redisplay_override");
                                Iterator it10 = EnumC38941r3.f167632F.iterator();
                                while (true) {
                                    if (!it10.hasNext()) {
                                        next = c38903n1;
                                        break;
                                    }
                                    next = it10.next();
                                    Iterator it11 = it10;
                                    if (((EnumC38941r3) next).f167636w.equals(strOptString16)) {
                                        break;
                                    }
                                    it10 = it11;
                                }
                                EnumC38941r3 enumC38941r3 = (EnumC38941r3) next;
                                c38865j1 = new C38865j1(AbstractC22676k.m65745e(strOptString13, "enabled"), AbstractC22676k.m65745e(strOptString14, "enabled") ? EnumC38885l1.f167365w : AbstractC22676k.m65745e(strOptString14, "partial") ? EnumC38885l1.f167366x : EnumC38885l1.f167367y, enumC38894m1, enumC38941r3, AbstractC22676k.m65745e(strOptString15, "enabled"));
                            }
                            JSONObject jSONObjectOptJSONObject18 = jSONObjectOptJSONObject16.optJSONObject("customer_sheet");
                            InterfaceC38845h1 c38835g1 = C38825f1.f167082w;
                            if (jSONObjectOptJSONObject18 != null && jSONObjectOptJSONObject18.optBoolean("enabled") && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject18.optJSONObject("features")) != null) {
                                String strOptString17 = jSONObjectOptJSONObject2.optString("payment_method_remove");
                                String strM99551t8 = AbstractC32004s.m99551t("payment_method_remove_last", jSONObjectOptJSONObject2);
                                EnumC38894m1 enumC38894m2 = strM99551t8 == null ? EnumC38894m1.f167438y : strM99551t8.equals("enabled") ? EnumC38894m1.f167436w : EnumC38894m1.f167437x;
                                String strOptString18 = jSONObjectOptJSONObject2.optString("payment_method_sync_default");
                                c38835g1 = new C38835g1(AbstractC22676k.m65745e(strOptString17, "enabled") ? EnumC38885l1.f167365w : AbstractC22676k.m65745e(strOptString17, "partial") ? EnumC38885l1.f167366x : EnumC38885l1.f167367y, enumC38894m2, AbstractC22676k.m65745e(strOptString18, "enabled"));
                            }
                            c38903n2 = new C38903n1(c38865j1, c38835g1);
                        }
                        if (c38903n2 != null) {
                            c38912o1 = new C38912o1(strOptString, zOptBoolean, strOptString11, iOptInt, strOptString12, c38903n2);
                        }
                    }
                    c38912o1 = c38903n1;
                }
            }
            if (c38912o1 != 0) {
                String strOptString19 = jSONObjectOptJSONObject12.optString("default_payment_method");
                AbstractC22676k.m65747g(strOptString19);
                if (AbstractC39414r.m125890i0(strOptString19)) {
                    r10 = strOptString19;
                    r10 = c38903n1;
                }
                r10 = strOptString19;
                c38921p1 = new C38921p1(arrayList, r10, c38912o1);
            }
            jSONObjectOptJSONObject3 = jSONObject.optJSONObject("link_settings");
            if (jSONObjectOptJSONObject3 != null) {
                OptJSONArray = jSONObjectOptJSONObject3.optJSONArray("link_funding_sources");
            } else {
                OptJSONArray = c38903n1;
            }
            AbstractC22676k.m65747g(strOptString8);
            interfaceC4339a = (InterfaceC4339a) this.f49809z;
            z4 = this.f49807x;
            interfaceC38786b2 = (InterfaceC38786b2) this.f49808y;
            jSONObjectOptJSONObject4 = jSONObjectM99546o.optJSONObject(interfaceC38786b2.getType());
            r14 = jSONObjectOptJSONObject4;
            if (jSONObjectOptJSONObject4 == null) {
                jSONObject2 = new JSONObject();
            }
            if (jSONArrayOptJSONArray6 != null) {
                r14 = jSONObject2;
                r14.put("payment_method_types", jSONArrayOptJSONArray6);
            }
            r14 = jSONObject2;
            r14.put(str7, jSONArrayOptJSONArray3);
            r14.put("link_funding_sources", OptJSONArray);
            r14.put(str6, strOptString8);
            if (interfaceC38786b2 instanceof C39002y1) {
                if (interfaceC38786b2 instanceof C38776a2) {
                    interfaceC38802c8M128100a = new C39938g(1).m128100a(r14);
                } else {
                    if (interfaceC38786b2 instanceof C38984w1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC39010z0 = ((C38984w1) interfaceC38786b2).f167813x.f166898w;
                    if (interfaceC39010z0 instanceof C38983w0) {
                        str4 = str3;
                        interfaceC38802c8M8020x = new C2817b(str4, (C38983w0) interfaceC39010z0, z4, interfaceC4339a).m8019w(r14);
                    } else {
                        str4 = str3;
                        if (interfaceC39010z0 instanceof C39001y0) {
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC38802c8M8020x = new C2817b(str4, (C39001y0) interfaceC39010z0, z4, interfaceC4339a).m8020x(r14);
                    }
                    interfaceC38802c8 = interfaceC38802c8M8020x;
                }
                jSONObjectOptJSONObject5 = jSONObject.optJSONObject("experiments_data");
                if (jSONObjectOptJSONObject5 != null) {
                    String strOptString20 = jSONObjectOptJSONObject5.optString("arb_id");
                    AbstractC22676k.m65749i(strOptString20, "optString(...)");
                    jSONObjectOptJSONObject9 = jSONObjectOptJSONObject5.optJSONObject("experiment_assignments");
                    if (jSONObjectOptJSONObject9 != null) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        itKeys2 = jSONObjectOptJSONObject9.keys();
                        str5 = str2;
                        AbstractC22676k.m65749i(itKeys2, str5);
                        while (itKeys2.hasNext()) {
                            next4 = itKeys2.next();
                            Object obj3 = jSONObjectOptJSONObject9.get(next4);
                            it3 = EnumC38930q1.f167594I.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next5 = c38903n1;
                                    break;
                                }
                                next5 = it3.next();
                            } while (!((EnumC38930q1) next5).f167598w.equals(next4));
                            enumC38930q1 = (EnumC38930q1) next5;
                            if (enumC38930q1 == null && (obj3 instanceof String)) {
                                linkedHashMap3.put(enumC38930q1, obj3);
                            }
                        }
                        mapM74001j2 = AbstractC25247g0.m74001j0(linkedHashMap3);
                    } else {
                        str5 = str2;
                        mapM74001j2 = c25272z;
                    }
                    c38939r1 = new C38939r1(strOptString20, mapM74001j2);
                } else {
                    str5 = str2;
                    c38939r1 = c38903n1;
                }
                jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_payment_method_data");
                if (jSONArrayOptJSONArray != null) {
                    C18284j c18284jM36278i3 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray.length());
                    arrayList3 = new ArrayList();
                    it = c18284jM36278i3.iterator();
                    while (((C18283i) it).f71138y) {
                        jSONObjectOptJSONObject8 = jSONArrayOptJSONArray.optJSONObject(((AbstractC25243e0) it).nextInt());
                        String str13 = str10;
                        AbstractC22676k.m65749i(jSONObjectOptJSONObject8, str13);
                        strM99551t2 = AbstractC32004s.m99551t("type", jSONObjectOptJSONObject8);
                        if (strM99551t2 != null) {
                            strM99551t3 = AbstractC32004s.m99551t("error", jSONObjectOptJSONObject8);
                            if (strM99551t3 != null) {
                                c38795c1 = new C38805d1(strM99551t2, strM99551t3);
                            } else {
                                strM99551t4 = AbstractC32004s.m99551t("display_name", jSONObjectOptJSONObject8);
                                if (strM99551t4 == null && (strM99551t5 = AbstractC32004s.m99551t("logo_url", jSONObjectOptJSONObject8)) != null) {
                                    c38795c1 = new C38795c1(strM99551t2, strM99551t4, strM99551t5);
                                } else {
                                    c38795c1 = null;
                                }
                            }
                        } else {
                            c38795c1 = null;
                        }
                        if (c38795c1 != null) {
                            arrayList3.add(c38795c1);
                        }
                        str10 = str13;
                    }
                    list2 = arrayList3;
                }
                jSONObjectOptJSONObject6 = jSONObject.optJSONObject("card_brand_choice");
                if (jSONObjectOptJSONObject6 == null) {
                    c38785b1 = c38903n1;
                } else {
                    arrayList2 = new ArrayList();
                    jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("preferred_networks");
                    if (jSONArrayOptJSONArray2 != null) {
                        length = jSONArrayOptJSONArray2.length();
                        for (i13 = 0; i13 < length; i13++) {
                            strOptString2 = jSONArrayOptJSONArray2.optString(i13);
                            if (strOptString2 != null) {
                                arrayList2.add(strOptString2);
                            }
                        }
                    }
                    c38785b1 = new C38785b1(jSONObjectOptJSONObject6.optBoolean("eligible", false), AbstractC25265s.m74093D1(arrayList2));
                }
                strOptString3 = jSONObject.optString("google_pay_preference");
                strOptString4 = jSONObject.optString("merchant_country");
                strM99551t = AbstractC32004s.m99551t("merchant_logo_url", jSONObject);
                jSONObjectOptJSONObject7 = jSONObject.optJSONObject("passive_captcha");
                if (jSONObjectOptJSONObject7 != null) {
                    if (jSONObjectOptJSONObject7.has("site_key")) {
                        String string3 = jSONObjectOptJSONObject7.getString("site_key");
                        AbstractC22676k.m65749i(string3, "getString(...)");
                        c38797c3 = new C38797c3(string3, AbstractC32004s.m99551t("rqdata", jSONObjectOptJSONObject7));
                    } else {
                        c38797c3 = c38903n1;
                    }
                    r25 = c38797c3;
                } else {
                    r25 = c38903n1;
                }
                strOptString5 = jSONObject.optString("account_id");
                strOptString6 = jSONObject.optString("merchant_id");
                if (interfaceC38802c8 != null) {
                    return c38903n1;
                }
                if (jSONObjectOptJSONObject3 == null && jSONObjectOptJSONObject3.optBoolean("link_mobile_disable_signup")) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (jSONObjectOptJSONObject3 == null && jSONObjectOptJSONObject3.optBoolean("link_passthrough_mode_enabled")) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (jSONObjectOptJSONObject3 == null && jSONObjectOptJSONObject3.optBoolean("link_mobile_use_attestation_endpoints")) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (jSONObjectOptJSONObject3 == null && jSONObjectOptJSONObject3.optBoolean("link_mobile_disable_rux_in_flow_controller")) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (jSONObjectOptJSONObject3 == null && jSONObjectOptJSONObject3.optBoolean("link_mobile_suppress_2fa_modal")) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (jSONObjectOptJSONObject3 == null && jSONObjectOptJSONObject3.optBoolean("link_enable_displayable_default_values_in_ece")) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (jSONObjectOptJSONObject3 == null && jSONObjectOptJSONObject3.optBoolean("link_mobile_skip_wallet_in_flow_controller")) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (jSONObjectOptJSONObject3 == null && jSONObjectOptJSONObject3.optBoolean("link_sign_up_opt_in_feature_enabled")) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (jSONObjectOptJSONObject3 == null && jSONObjectOptJSONObject3.optBoolean("link_sign_up_opt_in_initial_value")) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (jSONObjectOptJSONObject3 != null || (strOptString7 = jSONObjectOptJSONObject3.optString("link_mode")) == null) {
                    r33 = c38903n1;
                } else {
                    Iterator it12 = EnumC38922p2.f167548z.iterator();
                    do {
                        if (!it12.hasNext()) {
                            next3 = c38903n1;
                            break;
                        }
                        next3 = it12.next();
                    } while (!((EnumC38922p2) next3).f167549w.equals(strOptString7));
                    r33 = (EnumC38922p2) next3;
                }
                if (jSONObjectOptJSONObject3 != null) {
                    linkedHashMap = new LinkedHashMap();
                    itKeys = jSONObjectOptJSONObject3.keys();
                    AbstractC22676k.m65749i(itKeys, str5);
                    while (itKeys.hasNext()) {
                        next2 = itKeys.next();
                        obj = jSONObjectOptJSONObject3.get(next2);
                        if (obj instanceof Boolean) {
                            linkedHashMap.put(next2, obj);
                        }
                    }
                    mapM74001j1 = AbstractC25247g0.m74001j0(linkedHashMap);
                } else {
                    mapM74001j1 = c25272z;
                }
                if (jSONObjectOptJSONObject3 != null) {
                    OptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("link_supported_payment_methods_onboarding_enabled");
                } else {
                    OptJSONArray2 = c38903n1;
                }
                C38957t1 c38957t1 = new C38957t1(C37688a.m121113a(OptJSONArray), z14, r33, mapM74001j1, z13, null, z15, z17, z16, z18, z19, z24, z25, C37688a.m121113a(OptJSONArray2));
                boolean z26 = !AbstractC22676k.m65745e(strOptString3, "disabled");
                AbstractC22676k.m65747g(str4);
                objM31995n = c38903n1;
                if (!AbstractC39414r.m125890i0(str4)) {
                    objM31995n = str4;
                }
                if (objM31995n == null) {
                    objM31995n = AbstractC11895b.m31995n("toString(...)");
                }
                return new C38966u1(c38957t1, str9, str, interfaceC38802c8, list, map, c38939r1, c38921p1, strOptString4, strM99551t, c38785b1, z26, null, list2, objM31995n, r25, strOptString10, strOptString5, strOptString6);
            }
            interfaceC38802c8M128100a = new C39932a(28).m128095c(r14);
            interfaceC38802c8 = interfaceC38802c8M128100a;
            str4 = str3;
            jSONObjectOptJSONObject5 = jSONObject.optJSONObject("experiments_data");
            if (jSONObjectOptJSONObject5 != null) {
                String strOptString21 = jSONObjectOptJSONObject5.optString("arb_id");
                AbstractC22676k.m65749i(strOptString21, "optString(...)");
                jSONObjectOptJSONObject9 = jSONObjectOptJSONObject5.optJSONObject("experiment_assignments");
                if (jSONObjectOptJSONObject9 != null) {
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    itKeys2 = jSONObjectOptJSONObject9.keys();
                    str5 = str2;
                    AbstractC22676k.m65749i(itKeys2, str5);
                    while (itKeys2.hasNext()) {
                        next4 = itKeys2.next();
                        Object obj4 = jSONObjectOptJSONObject9.get(next4);
                        it3 = EnumC38930q1.f167594I.iterator();
                        do {
                            if (it3.hasNext()) {
                                next5 = c38903n1;
                                break;
                            }
                            next5 = it3.next();
                        } while (!((EnumC38930q1) next5).f167598w.equals(next4));
                        enumC38930q1 = (EnumC38930q1) next5;
                        if (enumC38930q1 == null) {
                        }
                    }
                    mapM74001j2 = AbstractC25247g0.m74001j0(linkedHashMap4);
                } else {
                    str5 = str2;
                    mapM74001j2 = c25272z;
                }
                c38939r1 = new C38939r1(strOptString21, mapM74001j2);
            } else {
                str5 = str2;
                c38939r1 = c38903n1;
            }
            jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_payment_method_data");
            if (jSONArrayOptJSONArray != null) {
                C18284j c18284jM36278i4 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray.length());
                arrayList3 = new ArrayList();
                it = c18284jM36278i4.iterator();
                while (((C18283i) it).f71138y) {
                    jSONObjectOptJSONObject8 = jSONArrayOptJSONArray.optJSONObject(((AbstractC25243e0) it).nextInt());
                    String str14 = str10;
                    AbstractC22676k.m65749i(jSONObjectOptJSONObject8, str14);
                    strM99551t2 = AbstractC32004s.m99551t("type", jSONObjectOptJSONObject8);
                    if (strM99551t2 != null) {
                        strM99551t3 = AbstractC32004s.m99551t("error", jSONObjectOptJSONObject8);
                        if (strM99551t3 != null) {
                            c38795c1 = new C38805d1(strM99551t2, strM99551t3);
                        } else {
                            strM99551t4 = AbstractC32004s.m99551t("display_name", jSONObjectOptJSONObject8);
                            if (strM99551t4 == null) {
                                c38795c1 = null;
                            } else {
                                c38795c1 = new C38795c1(strM99551t2, strM99551t4, strM99551t5);
                            }
                        }
                    } else {
                        c38795c1 = null;
                    }
                    if (c38795c1 != null) {
                        arrayList3.add(c38795c1);
                    }
                    str10 = str14;
                }
                list2 = arrayList3;
            }
            jSONObjectOptJSONObject6 = jSONObject.optJSONObject("card_brand_choice");
            if (jSONObjectOptJSONObject6 == null) {
                c38785b1 = c38903n1;
            } else {
                arrayList2 = new ArrayList();
                jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("preferred_networks");
                if (jSONArrayOptJSONArray2 != null) {
                    length = jSONArrayOptJSONArray2.length();
                    while (i13 < length) {
                        strOptString2 = jSONArrayOptJSONArray2.optString(i13);
                        if (strOptString2 != null) {
                            arrayList2.add(strOptString2);
                        }
                    }
                }
                c38785b1 = new C38785b1(jSONObjectOptJSONObject6.optBoolean("eligible", false), AbstractC25265s.m74093D1(arrayList2));
            }
            strOptString3 = jSONObject.optString("google_pay_preference");
            strOptString4 = jSONObject.optString("merchant_country");
            strM99551t = AbstractC32004s.m99551t("merchant_logo_url", jSONObject);
            jSONObjectOptJSONObject7 = jSONObject.optJSONObject("passive_captcha");
            if (jSONObjectOptJSONObject7 != null) {
                if (jSONObjectOptJSONObject7.has("site_key")) {
                    c38797c3 = c38903n1;
                } else {
                    String string4 = jSONObjectOptJSONObject7.getString("site_key");
                    AbstractC22676k.m65749i(string4, "getString(...)");
                    c38797c3 = new C38797c3(string4, AbstractC32004s.m99551t("rqdata", jSONObjectOptJSONObject7));
                }
                r25 = c38797c3;
            } else {
                r25 = c38903n1;
            }
            strOptString5 = jSONObject.optString("account_id");
            strOptString6 = jSONObject.optString("merchant_id");
            if (interfaceC38802c8 != null) {
                return c38903n1;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z17 = false;
            } else {
                z17 = false;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z18 = false;
            } else {
                z18 = false;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z19 = false;
            } else {
                z19 = false;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z24 = false;
            } else {
                z24 = false;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z25 = false;
            } else {
                z25 = false;
            }
            if (jSONObjectOptJSONObject3 != null) {
                r33 = c38903n1;
            } else {
                r33 = c38903n1;
            }
            if (jSONObjectOptJSONObject3 != null) {
                linkedHashMap = new LinkedHashMap();
                itKeys = jSONObjectOptJSONObject3.keys();
                AbstractC22676k.m65749i(itKeys, str5);
                while (itKeys.hasNext()) {
                    next2 = itKeys.next();
                    obj = jSONObjectOptJSONObject3.get(next2);
                    if (obj instanceof Boolean) {
                        linkedHashMap.put(next2, obj);
                    }
                }
                mapM74001j1 = AbstractC25247g0.m74001j0(linkedHashMap);
            } else {
                mapM74001j1 = c25272z;
            }
            if (jSONObjectOptJSONObject3 != null) {
                OptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("link_supported_payment_methods_onboarding_enabled");
            } else {
                OptJSONArray2 = c38903n1;
            }
            C38957t1 c38957t2 = new C38957t1(C37688a.m121113a(OptJSONArray), z14, r33, mapM74001j1, z13, null, z15, z17, z16, z18, z19, z24, z25, C37688a.m121113a(OptJSONArray2));
            boolean z27 = !AbstractC22676k.m65745e(strOptString3, "disabled");
            AbstractC22676k.m65747g(str4);
            objM31995n = c38903n1;
            if (!AbstractC39414r.m125890i0(str4)) {
                objM31995n = str4;
            }
            if (objM31995n == null) {
                objM31995n = AbstractC11895b.m31995n("toString(...)");
            }
            return new C38966u1(c38957t2, str9, str, interfaceC38802c8, list, map, c38939r1, c38921p1, strOptString4, strM99551t, c38785b1, z27, null, list2, objM31995n, r25, strOptString10, strOptString5, strOptString6);
        }
        str6 = "country_code";
        strOptString8 = strOptString8;
        str7 = "unactivated_payment_method_types";
        jSONArrayOptJSONArray3 = jSONArrayOptJSONArray3;
        jSONArrayOptJSONArray6 = jSONArrayOptJSONArray6;
        str3 = strOptString9;
        str10 = "optJSONObject(...)";
        str = string2;
        list = list;
        str2 = "keys(...)";
        c38921p1 = c38903n1;
        jSONObjectOptJSONObject3 = jSONObject.optJSONObject("link_settings");
        if (jSONObjectOptJSONObject3 != null) {
            OptJSONArray = jSONObjectOptJSONObject3.optJSONArray("link_funding_sources");
        } else {
            OptJSONArray = c38903n1;
        }
        AbstractC22676k.m65747g(strOptString8);
        interfaceC4339a = (InterfaceC4339a) this.f49809z;
        z4 = this.f49807x;
        interfaceC38786b2 = (InterfaceC38786b2) this.f49808y;
        jSONObjectOptJSONObject4 = jSONObjectM99546o.optJSONObject(interfaceC38786b2.getType());
        r14 = jSONObjectOptJSONObject4;
        if (jSONObjectOptJSONObject4 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONArrayOptJSONArray6 != null) {
            r14 = jSONObject2;
            r14.put("payment_method_types", jSONArrayOptJSONArray6);
        }
        r14 = jSONObject2;
        r14.put(str7, jSONArrayOptJSONArray3);
        r14.put("link_funding_sources", OptJSONArray);
        r14.put(str6, strOptString8);
        if (interfaceC38786b2 instanceof C39002y1) {
            if (interfaceC38786b2 instanceof C38776a2) {
                interfaceC38802c8M128100a = new C39938g(1).m128100a(r14);
            } else {
                if (interfaceC38786b2 instanceof C38984w1) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC39010z0 = ((C38984w1) interfaceC38786b2).f167813x.f166898w;
                if (interfaceC39010z0 instanceof C38983w0) {
                    str4 = str3;
                    interfaceC38802c8M8020x = new C2817b(str4, (C38983w0) interfaceC39010z0, z4, interfaceC4339a).m8019w(r14);
                } else {
                    str4 = str3;
                    if (interfaceC39010z0 instanceof C39001y0) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC38802c8M8020x = new C2817b(str4, (C39001y0) interfaceC39010z0, z4, interfaceC4339a).m8020x(r14);
                }
                interfaceC38802c8 = interfaceC38802c8M8020x;
            }
            jSONObjectOptJSONObject5 = jSONObject.optJSONObject("experiments_data");
            if (jSONObjectOptJSONObject5 != null) {
                String strOptString22 = jSONObjectOptJSONObject5.optString("arb_id");
                AbstractC22676k.m65749i(strOptString22, "optString(...)");
                jSONObjectOptJSONObject9 = jSONObjectOptJSONObject5.optJSONObject("experiment_assignments");
                if (jSONObjectOptJSONObject9 != null) {
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    itKeys2 = jSONObjectOptJSONObject9.keys();
                    str5 = str2;
                    AbstractC22676k.m65749i(itKeys2, str5);
                    while (itKeys2.hasNext()) {
                        next4 = itKeys2.next();
                        Object obj5 = jSONObjectOptJSONObject9.get(next4);
                        it3 = EnumC38930q1.f167594I.iterator();
                        do {
                            if (it3.hasNext()) {
                                next5 = c38903n1;
                                break;
                            }
                            next5 = it3.next();
                        } while (!((EnumC38930q1) next5).f167598w.equals(next4));
                        enumC38930q1 = (EnumC38930q1) next5;
                        if (enumC38930q1 == null) {
                        }
                    }
                    mapM74001j2 = AbstractC25247g0.m74001j0(linkedHashMap5);
                } else {
                    str5 = str2;
                    mapM74001j2 = c25272z;
                }
                c38939r1 = new C38939r1(strOptString22, mapM74001j2);
            } else {
                str5 = str2;
                c38939r1 = c38903n1;
            }
            jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_payment_method_data");
            if (jSONArrayOptJSONArray != null) {
                C18284j c18284jM36278i5 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray.length());
                arrayList3 = new ArrayList();
                it = c18284jM36278i5.iterator();
                while (((C18283i) it).f71138y) {
                    jSONObjectOptJSONObject8 = jSONArrayOptJSONArray.optJSONObject(((AbstractC25243e0) it).nextInt());
                    String str15 = str10;
                    AbstractC22676k.m65749i(jSONObjectOptJSONObject8, str15);
                    strM99551t2 = AbstractC32004s.m99551t("type", jSONObjectOptJSONObject8);
                    if (strM99551t2 != null) {
                        strM99551t3 = AbstractC32004s.m99551t("error", jSONObjectOptJSONObject8);
                        if (strM99551t3 != null) {
                            c38795c1 = new C38805d1(strM99551t2, strM99551t3);
                        } else {
                            strM99551t4 = AbstractC32004s.m99551t("display_name", jSONObjectOptJSONObject8);
                            if (strM99551t4 == null) {
                                c38795c1 = null;
                            } else {
                                c38795c1 = new C38795c1(strM99551t2, strM99551t4, strM99551t5);
                            }
                        }
                    } else {
                        c38795c1 = null;
                    }
                    if (c38795c1 != null) {
                        arrayList3.add(c38795c1);
                    }
                    str10 = str15;
                }
                list2 = arrayList3;
            }
            jSONObjectOptJSONObject6 = jSONObject.optJSONObject("card_brand_choice");
            if (jSONObjectOptJSONObject6 == null) {
                c38785b1 = c38903n1;
            } else {
                arrayList2 = new ArrayList();
                jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("preferred_networks");
                if (jSONArrayOptJSONArray2 != null) {
                    length = jSONArrayOptJSONArray2.length();
                    while (i13 < length) {
                        strOptString2 = jSONArrayOptJSONArray2.optString(i13);
                        if (strOptString2 != null) {
                            arrayList2.add(strOptString2);
                        }
                    }
                }
                c38785b1 = new C38785b1(jSONObjectOptJSONObject6.optBoolean("eligible", false), AbstractC25265s.m74093D1(arrayList2));
            }
            strOptString3 = jSONObject.optString("google_pay_preference");
            strOptString4 = jSONObject.optString("merchant_country");
            strM99551t = AbstractC32004s.m99551t("merchant_logo_url", jSONObject);
            jSONObjectOptJSONObject7 = jSONObject.optJSONObject("passive_captcha");
            if (jSONObjectOptJSONObject7 != null) {
                if (jSONObjectOptJSONObject7.has("site_key")) {
                    c38797c3 = c38903n1;
                } else {
                    String string5 = jSONObjectOptJSONObject7.getString("site_key");
                    AbstractC22676k.m65749i(string5, "getString(...)");
                    c38797c3 = new C38797c3(string5, AbstractC32004s.m99551t("rqdata", jSONObjectOptJSONObject7));
                }
                r25 = c38797c3;
            } else {
                r25 = c38903n1;
            }
            strOptString5 = jSONObject.optString("account_id");
            strOptString6 = jSONObject.optString("merchant_id");
            if (interfaceC38802c8 != null) {
                return c38903n1;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z17 = false;
            } else {
                z17 = false;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z18 = false;
            } else {
                z18 = false;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z19 = false;
            } else {
                z19 = false;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z24 = false;
            } else {
                z24 = false;
            }
            if (jSONObjectOptJSONObject3 == null) {
                z25 = false;
            } else {
                z25 = false;
            }
            if (jSONObjectOptJSONObject3 != null) {
                r33 = c38903n1;
            } else {
                r33 = c38903n1;
            }
            if (jSONObjectOptJSONObject3 != null) {
                linkedHashMap = new LinkedHashMap();
                itKeys = jSONObjectOptJSONObject3.keys();
                AbstractC22676k.m65749i(itKeys, str5);
                while (itKeys.hasNext()) {
                    next2 = itKeys.next();
                    obj = jSONObjectOptJSONObject3.get(next2);
                    if (obj instanceof Boolean) {
                        linkedHashMap.put(next2, obj);
                    }
                }
                mapM74001j1 = AbstractC25247g0.m74001j0(linkedHashMap);
            } else {
                mapM74001j1 = c25272z;
            }
            if (jSONObjectOptJSONObject3 != null) {
                OptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("link_supported_payment_methods_onboarding_enabled");
            } else {
                OptJSONArray2 = c38903n1;
            }
            C38957t1 c38957t3 = new C38957t1(C37688a.m121113a(OptJSONArray), z14, r33, mapM74001j1, z13, null, z15, z17, z16, z18, z19, z24, z25, C37688a.m121113a(OptJSONArray2));
            boolean z28 = !AbstractC22676k.m65745e(strOptString3, "disabled");
            AbstractC22676k.m65747g(str4);
            objM31995n = c38903n1;
            if (!AbstractC39414r.m125890i0(str4)) {
                objM31995n = str4;
            }
            if (objM31995n == null) {
                objM31995n = AbstractC11895b.m31995n("toString(...)");
            }
            return new C38966u1(c38957t3, str9, str, interfaceC38802c8, list, map, c38939r1, c38921p1, strOptString4, strM99551t, c38785b1, z28, null, list2, objM31995n, r25, strOptString10, strOptString5, strOptString6);
        }
        interfaceC38802c8M128100a = new C39932a(28).m128095c(r14);
        interfaceC38802c8 = interfaceC38802c8M128100a;
        str4 = str3;
        jSONObjectOptJSONObject5 = jSONObject.optJSONObject("experiments_data");
        if (jSONObjectOptJSONObject5 != null) {
            String strOptString23 = jSONObjectOptJSONObject5.optString("arb_id");
            AbstractC22676k.m65749i(strOptString23, "optString(...)");
            jSONObjectOptJSONObject9 = jSONObjectOptJSONObject5.optJSONObject("experiment_assignments");
            if (jSONObjectOptJSONObject9 != null) {
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                itKeys2 = jSONObjectOptJSONObject9.keys();
                str5 = str2;
                AbstractC22676k.m65749i(itKeys2, str5);
                while (itKeys2.hasNext()) {
                    next4 = itKeys2.next();
                    Object obj6 = jSONObjectOptJSONObject9.get(next4);
                    it3 = EnumC38930q1.f167594I.iterator();
                    do {
                        if (it3.hasNext()) {
                            next5 = c38903n1;
                            break;
                        }
                        next5 = it3.next();
                    } while (!((EnumC38930q1) next5).f167598w.equals(next4));
                    enumC38930q1 = (EnumC38930q1) next5;
                    if (enumC38930q1 == null) {
                    }
                }
                mapM74001j2 = AbstractC25247g0.m74001j0(linkedHashMap6);
            } else {
                str5 = str2;
                mapM74001j2 = c25272z;
            }
            c38939r1 = new C38939r1(strOptString23, mapM74001j2);
        } else {
            str5 = str2;
            c38939r1 = c38903n1;
        }
        jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_payment_method_data");
        if (jSONArrayOptJSONArray != null) {
            C18284j c18284jM36278i6 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray.length());
            arrayList3 = new ArrayList();
            it = c18284jM36278i6.iterator();
            while (((C18283i) it).f71138y) {
                jSONObjectOptJSONObject8 = jSONArrayOptJSONArray.optJSONObject(((AbstractC25243e0) it).nextInt());
                String str16 = str10;
                AbstractC22676k.m65749i(jSONObjectOptJSONObject8, str16);
                strM99551t2 = AbstractC32004s.m99551t("type", jSONObjectOptJSONObject8);
                if (strM99551t2 != null) {
                    strM99551t3 = AbstractC32004s.m99551t("error", jSONObjectOptJSONObject8);
                    if (strM99551t3 != null) {
                        c38795c1 = new C38805d1(strM99551t2, strM99551t3);
                    } else {
                        strM99551t4 = AbstractC32004s.m99551t("display_name", jSONObjectOptJSONObject8);
                        if (strM99551t4 == null) {
                            c38795c1 = null;
                        } else {
                            c38795c1 = new C38795c1(strM99551t2, strM99551t4, strM99551t5);
                        }
                    }
                } else {
                    c38795c1 = null;
                }
                if (c38795c1 != null) {
                    arrayList3.add(c38795c1);
                }
                str10 = str16;
            }
            list2 = arrayList3;
        }
        jSONObjectOptJSONObject6 = jSONObject.optJSONObject("card_brand_choice");
        if (jSONObjectOptJSONObject6 == null) {
            c38785b1 = c38903n1;
        } else {
            arrayList2 = new ArrayList();
            jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("preferred_networks");
            if (jSONArrayOptJSONArray2 != null) {
                length = jSONArrayOptJSONArray2.length();
                while (i13 < length) {
                    strOptString2 = jSONArrayOptJSONArray2.optString(i13);
                    if (strOptString2 != null) {
                        arrayList2.add(strOptString2);
                    }
                }
            }
            c38785b1 = new C38785b1(jSONObjectOptJSONObject6.optBoolean("eligible", false), AbstractC25265s.m74093D1(arrayList2));
        }
        strOptString3 = jSONObject.optString("google_pay_preference");
        strOptString4 = jSONObject.optString("merchant_country");
        strM99551t = AbstractC32004s.m99551t("merchant_logo_url", jSONObject);
        jSONObjectOptJSONObject7 = jSONObject.optJSONObject("passive_captcha");
        if (jSONObjectOptJSONObject7 != null) {
            if (jSONObjectOptJSONObject7.has("site_key")) {
                c38797c3 = c38903n1;
            } else {
                String string6 = jSONObjectOptJSONObject7.getString("site_key");
                AbstractC22676k.m65749i(string6, "getString(...)");
                c38797c3 = new C38797c3(string6, AbstractC32004s.m99551t("rqdata", jSONObjectOptJSONObject7));
            }
            r25 = c38797c3;
        } else {
            r25 = c38903n1;
        }
        strOptString5 = jSONObject.optString("account_id");
        strOptString6 = jSONObject.optString("merchant_id");
        if (interfaceC38802c8 != null) {
            return c38903n1;
        }
        if (jSONObjectOptJSONObject3 == null) {
            z13 = false;
        } else {
            z13 = false;
        }
        if (jSONObjectOptJSONObject3 == null) {
            z14 = false;
        } else {
            z14 = false;
        }
        if (jSONObjectOptJSONObject3 == null) {
            z15 = false;
        } else {
            z15 = false;
        }
        if (jSONObjectOptJSONObject3 == null) {
            z16 = false;
        } else {
            z16 = false;
        }
        if (jSONObjectOptJSONObject3 == null) {
            z17 = false;
        } else {
            z17 = false;
        }
        if (jSONObjectOptJSONObject3 == null) {
            z18 = false;
        } else {
            z18 = false;
        }
        if (jSONObjectOptJSONObject3 == null) {
            z19 = false;
        } else {
            z19 = false;
        }
        if (jSONObjectOptJSONObject3 == null) {
            z24 = false;
        } else {
            z24 = false;
        }
        if (jSONObjectOptJSONObject3 == null) {
            z25 = false;
        } else {
            z25 = false;
        }
        if (jSONObjectOptJSONObject3 != null) {
            r33 = c38903n1;
        } else {
            r33 = c38903n1;
        }
        if (jSONObjectOptJSONObject3 != null) {
            linkedHashMap = new LinkedHashMap();
            itKeys = jSONObjectOptJSONObject3.keys();
            AbstractC22676k.m65749i(itKeys, str5);
            while (itKeys.hasNext()) {
                next2 = itKeys.next();
                obj = jSONObjectOptJSONObject3.get(next2);
                if (obj instanceof Boolean) {
                    linkedHashMap.put(next2, obj);
                }
            }
            mapM74001j1 = AbstractC25247g0.m74001j0(linkedHashMap);
        } else {
            mapM74001j1 = c25272z;
        }
        if (jSONObjectOptJSONObject3 != null) {
            OptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("link_supported_payment_methods_onboarding_enabled");
        } else {
            OptJSONArray2 = c38903n1;
        }
        C38957t1 c38957t4 = new C38957t1(C37688a.m121113a(OptJSONArray), z14, r33, mapM74001j1, z13, null, z15, z17, z16, z18, z19, z24, z25, C37688a.m121113a(OptJSONArray2));
        boolean z29 = !AbstractC22676k.m65745e(strOptString3, "disabled");
        AbstractC22676k.m65747g(str4);
        objM31995n = c38903n1;
        if (!AbstractC39414r.m125890i0(str4)) {
            objM31995n = str4;
        }
        if (objM31995n == null) {
            objM31995n = AbstractC11895b.m31995n("toString(...)");
        }
        return new C38966u1(c38957t4, str9, str, interfaceC38802c8, list, map, c38939r1, c38921p1, strOptString4, strM99551t, c38785b1, z29, null, list2, objM31995n, r25, strOptString10, strOptString5, strOptString6);
    }

    @Override // p133f1.InterfaceC13948j
    /* JADX INFO: renamed from: n */
    public boolean mo2206n(long j7, C13984v c13984v) {
        C34354s0 c34354s0;
        C13977s1 c13977s1 = (C13977s1) this.f49809z;
        if (!c13977s1.m39780j() || c13977s1.m39783m().f122125a.f92135x.length() == 0 || (c34354s0 = c13977s1.f49848d) == null || c34354s0.m108662d() == null) {
            return false;
        }
        m39765x(c13977s1.m39783m(), j7, false, c13984v);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public boolean m39757o() {
        return this.f49807x;
    }

    /* JADX INFO: renamed from: p */
    public boolean m39758p() {
        return this.f49807x;
    }

    /* JADX INFO: renamed from: q */
    public Properties m39759q() {
        C20517r2 c20517r2 = (C20517r2) this.f49809z;
        String str = (String) this.f49808y;
        try {
            File file = new File(str.trim());
            if (!file.isFile() || !file.canRead()) {
                if (file.isFile()) {
                    if (!file.canRead()) {
                        c20517r2.mo16066m(EnumC20436n5.ERROR, "Failed to load Sentry configuration since it is not readable: %s", str);
                    }
                } else if (this.f49807x) {
                    c20517r2.mo16066m(EnumC20436n5.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", str);
                    return null;
                }
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th3) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            c20517r2.mo16058i(EnumC20436n5.ERROR, th5, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:4:0x0011, B:5:0x001d, B:7:0x0025, B:20:0x0054, B:12:0x0038, B:14:0x0040, B:17:0x0047, B:19:0x004f, B:24:0x005d), top: B:40:0x0011, outer: #2 }] */
    /* JADX INFO: renamed from: r */
    public C0904j m39760r(String str) {
        try {
            Charset charset = StandardCharsets.UTF_8;
            InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(str.getBytes(charset)), charset);
            try {
                C20339g2 c20339g2 = new C20339g2(inputStreamReader);
                C20611a c20611a = c20339g2.f76355w;
                c20339g2.beginObject();
                int iNextInt = -1;
                String strMo56509w0 = null;
                while (c20611a.peek() == EnumC20612b.NAME) {
                    String strNextName = c20611a.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != -1106363674) {
                        if (iHashCode == 3575610 && strNextName.equals("type")) {
                            strMo56509w0 = c20339g2.mo56509w0();
                        } else {
                            c20339g2.skipValue();
                        }
                    } else if (strNextName.equals("length")) {
                        iNextInt = c20339g2.nextInt();
                    } else {
                        c20339g2.skipValue();
                    }
                    if (strMo56509w0 != null && iNextInt >= 0) {
                        break;
                    }
                }
                if (iNextInt < 0) {
                    inputStreamReader.close();
                    return null;
                }
                C0904j c0904j = new C0904j(strMo56509w0, iNextInt);
                inputStreamReader.close();
                return c0904j;
            } catch (Throwable th3) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            ((SentryAndroidOptions) this.f49808y).getLogger().mo16058i(EnumC20436n5.DEBUG, th5, "Error parsing item header", new Object[0]);
            return null;
        }
        ((SentryAndroidOptions) this.f49808y).getLogger().mo16058i(EnumC20436n5.DEBUG, th5, "Error parsing item header", new Object[0]);
        return null;
    }

    @Override // xg3.InterfaceC38282i
    public void request(long j7) {
        if (this.f49807x) {
            return;
        }
        if (j7 < 0) {
            throw new IllegalStateException(AbstractC11895b.m31994m(j7, "n >= required but it was "));
        }
        if (j7 == 0) {
            return;
        }
        this.f49807x = true;
        AbstractC38292s abstractC38292s = (AbstractC38292s) this.f49808y;
        if (abstractC38292s.mo14749a()) {
            return;
        }
        Object obj = this.f49809z;
        try {
            abstractC38292s.onNext(obj);
            if (abstractC38292s.mo14749a()) {
                return;
            }
            abstractC38292s.onCompleted();
        } catch (Throwable th3) {
            AbstractC12350b.m34575X(th3, abstractC38292s, obj);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m39761s() {
        boolean z4;
        Iterator it = AbstractC33913l.m107269d((Set) this.f49808y).iterator();
        while (it.hasNext()) {
            C29342e c29342e = (C29342e) ((InterfaceC29339b) it.next());
            if (!c29342e.m89335e()) {
                synchronized (c29342e.f118881c) {
                    z4 = c29342e.f118904z == 6;
                }
                if (!z4) {
                    c29342e.m89333c();
                    if (this.f49807x) {
                        ((ArrayList) this.f49809z).add(c29342e);
                    } else {
                        c29342e.m89331a();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m39762t(C14894a c14894a) {
        ((C11923h) this.f49808y).mo32218s(c14894a);
    }

    public String toString() {
        switch (this.f49806w) {
            case 6:
                StringBuilder sb4 = new StringBuilder();
                sb4.append(super.toString());
                sb4.append("{numRequests=");
                sb4.append(((Set) this.f49808y).size());
                sb4.append(", isPaused=");
                return AbstractC18489d0.m53372m(sb4, this.f49807x, "}");
            case 7:
                return ((HashMap) this.f49808y).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m39763u() {
        RunnableC31514a runnableC31514a = (RunnableC31514a) this.f49809z;
        Context context = (Context) this.f49808y;
        if (this.f49807x) {
            context.unregisterReceiver(runnableC31514a);
            this.f49807x = false;
        }
    }

    /* JADX INFO: renamed from: v */
    public void m39764v() {
        this.f49807x = false;
    }

    /* JADX INFO: renamed from: x */
    public long m39765x(C29891y c29891y, long j7, boolean z4, C13984v c13984v) {
        C13977s1 c13977s1 = (C13977s1) this.f49809z;
        long jM39773c = C13977s1.m39773c(c13977s1, c29891y, j7, z4, false, c13984v, false);
        if (!C23283u0.m67355a(jM39773c, (C23283u0) this.f49808y)) {
            this.f49807x = false;
        }
        c13977s1.m39786p(C23283u0.m67357c(jM39773c) ? EnumC34318g0.f144088y : EnumC34318g0.f144087x);
        return jM39773c;
    }

    public C13968p1(InterfaceC31108b interfaceC31108b, InterfaceC31108b interfaceC31108b2, boolean z4) {
        this.f49806w = 11;
        this.f49807x = z4;
        this.f49808y = interfaceC31108b;
        this.f49809z = interfaceC31108b2;
    }

    public C13968p1(String str, Set autocompleteCountries) {
        boolean z4 = true;
        this.f49806w = 1;
        try {
            Class.forName("com.google.android.libraries.places.api.Places");
        } catch (Exception unused) {
            z4 = false;
        }
        AbstractC22676k.m65750j(autocompleteCountries, "autocompleteCountries");
        this.f49808y = str;
        this.f49809z = autocompleteCountries;
        this.f49807x = z4;
    }

    public C13968p1(int i13) {
        this.f49806w = i13;
        switch (i13) {
            case 10:
                break;
            default:
                this.f49808y = Collections.newSetFromMap(new WeakHashMap());
                this.f49809z = new ArrayList();
                break;
        }
    }

    public C13968p1(InterfaceC38786b2 params, boolean z4) {
        this.f49806w = 12;
        C39681c c39681c = new C39681c(17);
        AbstractC22676k.m65750j(params, "params");
        this.f49808y = params;
        this.f49807x = z4;
        this.f49809z = c39681c;
    }

    public C13968p1(String str, C20517r2 c20517r2, boolean z4) {
        this.f49806w = 5;
        this.f49808y = str;
        this.f49809z = c20517r2;
        this.f49807x = z4;
    }

    public C13968p1(Context context, Handler handler, SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r) {
        this.f49806w = 8;
        this.f49808y = context.getApplicationContext();
        this.f49809z = new RunnableC31514a(this, handler, surfaceHolderCallbackC31565r);
    }

    public C13968p1(SentryAndroidOptions sentryAndroidOptions) {
        this.f49806w = 4;
        this.f49809z = new ArrayList();
        this.f49807x = false;
        this.f49808y = sentryAndroidOptions;
    }

    public C13968p1(HashMap map, boolean z4, ArrayList arrayList) {
        this.f49806w = 7;
        this.f49808y = map;
        this.f49807x = z4;
        this.f49809z = arrayList;
    }

    public C13968p1(InterfaceC2994c0 interfaceC2994c0, boolean z4, InterfaceC4351m interfaceC4351m, C16353k c16353k) {
        this.f49806w = 3;
        this.f49807x = z4;
        this.f49808y = AbstractC30060g.m92111d(-2, 4, EnumC11916a.f38982w);
        this.f49809z = AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C2319y(c16353k, interfaceC4351m, this, (InterfaceC30057d) null), 3);
    }

    public C13968p1(C13977s1 c13977s1) {
        this.f49806w = 0;
        this.f49809z = c13977s1;
        this.f49807x = true;
    }
}
