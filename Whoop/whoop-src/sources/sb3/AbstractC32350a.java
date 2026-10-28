package sb3;

import android.util.Log;
import androidx.compose.runtime.Composer;
import aws.smithy.kotlin.runtime.ClientException;
import c43.EnumC4206v;
import e93.AbstractC12889b;
import g93.AbstractC15609a;
import g93.AbstractC15612d;
import i93.C18283i;
import i93.C18284j;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import m83.AbstractC25243e0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n33.C26243q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.RTCStats;
import p085d9.C11799p;
import p181h2.C16617b;
import p249jc.AbstractC21598x;
import p326mf.AbstractC25491k;
import p326mf.AbstractC25492l;
import p326mf.C25483c;
import p326mf.C25484d;
import p326mf.C25490j;
import p326mf.C25494n;
import p326mf.C25495o;
import p367of.C27892a;
import p390p1.C28655q;
import p465rm.C31543j1;
import p499t9.C33652u;
import p508ty.C34249c;
import p512u2.AbstractC34454d0;
import p512u2.C34451c;
import p512u2.C34472r;
import p541v2.C35558a;
import p541v2.C35560c;
import p551vf.C35937b;
import p581we.AbstractC37178b0;
import p581we.C37176a0;
import p581we.C37177b;
import p581we.C37187g;
import p581we.C37199o;
import p581we.C37209y;
import p581we.C37210z;
import p598wy.InterfaceC37689b;
import p603x2.AbstractC37831a;
import p647yf.C39496i;
import p647yf.InterfaceC39502o;
import p679zf.C40603d;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import q83.InterfaceC30063j;
import t23.C33460u0;
import uc3.C34768f;
import uc3.C34774l;
import uc3.C34778p;
import uc3.InterfaceC34773k;
import va3.C35847e;
import vg.C35973t;
import wb3.AbstractC37056f;
import wb3.C37062l;
import wb3.C37063m;
import wf.C37236a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: sb3.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC32350a implements InterfaceC37689b {
    /* JADX INFO: renamed from: a */
    public static final void m100694a(C35560c c35560c, C34472r c34472r, long j7) {
        boolean zM108912c = AbstractC34454d0.m108912c(c34472r);
        long j13 = c34472r.f144816b;
        if (zM108912c) {
            C31543j1 c31543j1 = c35560c.f151283a;
            C35558a[] c35558aArr = (C35558a[]) c31543j1.f130199e;
            AbstractC25260n.m74073n0(0, c35558aArr.length, null, c35558aArr);
            c31543j1.f130197c = 0;
            C31543j1 c31543j2 = c35560c.f151284b;
            C35558a[] c35558aArr2 = (C35558a[]) c31543j2.f130199e;
            AbstractC25260n.m74073n0(0, c35558aArr2.length, null, c35558aArr2);
            c31543j2.f130197c = 0;
            c35560c.f151285c = 0L;
        }
        if (!AbstractC34454d0.m108914e(c34472r)) {
            List listM108947c = c34472r.m108947c();
            int i13 = 0;
            for (int size = listM108947c.size(); i13 < size; size = size) {
                C34451c c34451c = (C34451c) listM108947c.get(i13);
                long j14 = c34451c.f144744a;
                long jM47192h = C16617b.m47192h(c34451c.f144746c, j7);
                c35560c.f151283a.m97145a(Float.intBitsToFloat((int) (jM47192h >> 32)), j14);
                c35560c.f151284b.m97145a(Float.intBitsToFloat((int) (jM47192h & 4294967295L)), j14);
                i13++;
            }
            long jM47192h2 = C16617b.m47192h(c34472r.f144826l, j7);
            c35560c.f151283a.m97145a(Float.intBitsToFloat((int) (jM47192h2 >> 32)), j13);
            c35560c.f151284b.m97145a(Float.intBitsToFloat((int) (jM47192h2 & 4294967295L)), j13);
        }
        if (AbstractC34454d0.m108914e(c34472r) && j13 - c35560c.f151285c > 40) {
            C31543j1 c31543j3 = c35560c.f151283a;
            C35558a[] c35558aArr3 = (C35558a[]) c31543j3.f130199e;
            AbstractC25260n.m74073n0(0, c35558aArr3.length, null, c35558aArr3);
            c31543j3.f130197c = 0;
            C31543j1 c31543j4 = c35560c.f151284b;
            C35558a[] c35558aArr4 = (C35558a[]) c31543j4.f130199e;
            AbstractC25260n.m74073n0(0, c35558aArr4.length, null, c35558aArr4);
            c31543j4.f130197c = 0;
            c35560c.f151285c = 0L;
        }
        c35560c.f151285c = j13;
    }

    /* JADX INFO: renamed from: b */
    public static final String m100695b(String str) {
        char cCharAt;
        AbstractC22676k.m65750j(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb4 = new StringBuilder(str.length());
        sb4.append(Character.toUpperCase(cCharAt));
        sb4.append((CharSequence) str, 1, str.length());
        return sb4.toString();
    }

    /* JADX INFO: renamed from: c */
    public static final C34774l m100696c(List list) {
        C25271y c25271y = C25271y.f99162w;
        C34774l c34774l = new C34774l(c25271y, c25271y);
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                c34774l = m100697d((C34774l) listIterator.previous(), c34774l);
            }
        }
        return m100698e(c34774l, c25271y);
    }

    /* JADX INFO: renamed from: d */
    public static final C34774l m100697d(C34774l c34774l, C34774l c34774l2) {
        List list = c34774l.f146443b;
        List list2 = c34774l.f146442a;
        if (list.isEmpty()) {
            return new C34774l(AbstractC25265s.m74129g1(list2, c34774l2.f146442a), c34774l2.f146443b);
        }
        List list3 = c34774l.f146443b;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(m100697d((C34774l) it.next(), c34774l2));
        }
        return new C34774l(list2, arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static final C34774l m100698e(C34774l c34774l, List list) {
        List listM118958J;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(list);
        ArrayList arrayListM74097F2 = null;
        for (InterfaceC34773k interfaceC34773k : c34774l.f146442a) {
            if (interfaceC34773k instanceof C34768f) {
                if (arrayListM74097F2 != null) {
                    arrayListM74097F2.addAll(((C34768f) interfaceC34773k).f146433a);
                } else {
                    arrayListM74097F2 = AbstractC25265s.m74097F1(((C34768f) interfaceC34773k).f146433a);
                }
            } else if (interfaceC34773k instanceof C34778p) {
                arrayListM74097F1.add(interfaceC34773k);
            } else {
                if (arrayListM74097F2 != null) {
                    arrayList.add(new C34768f(arrayListM74097F2));
                    arrayListM74097F2 = null;
                }
                arrayList.add(interfaceC34773k);
            }
        }
        List list2 = c34774l.f146443b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C34774l c34774lM100698e = m100698e((C34774l) it.next(), arrayListM74097F1);
            if (c34774lM100698e.f146442a.isEmpty()) {
                List listM118958J2 = c34774lM100698e.f146443b;
                if (listM118958J2.isEmpty()) {
                    listM118958J2 = AbstractC37056f.m118958J(c34774lM100698e);
                }
                listM118958J = listM118958J2;
            } else {
                listM118958J = AbstractC37056f.m118958J(c34774lM100698e);
            }
            AbstractC25265s.m74141p0(arrayList2, listM118958J);
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        List listM118958J3 = arrayList2;
        if (zIsEmpty) {
            listM118958J3 = AbstractC37056f.m118958J(new C34774l(arrayListM74097F1, C25271y.f99162w));
        }
        List list3 = listM118958J3;
        if (arrayListM74097F2 == null) {
            return new C34774l(arrayList, list3);
        }
        List<C34774l> list4 = list3;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                InterfaceC34773k interfaceC34773k2 = (InterfaceC34773k) AbstractC25265s.m74100H0(((C34774l) it3.next()).f146442a);
                if (interfaceC34773k2 != null && (interfaceC34773k2 instanceof C34768f)) {
                    ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
                    for (C34774l c34774l2 : list4) {
                        List list5 = c34774l2.f146442a;
                        List list6 = c34774l2.f146443b;
                        InterfaceC34773k interfaceC34773k3 = (InterfaceC34773k) AbstractC25265s.m74100H0(list5);
                        arrayList3.add(interfaceC34773k3 instanceof C34768f ? new C34774l(AbstractC25265s.m74129g1(AbstractC37056f.m118958J(new C34768f(AbstractC25265s.m74129g1(arrayListM74097F2, ((C34768f) interfaceC34773k3).f146433a))), AbstractC25265s.m74161z0(list5, 1)), list6) : interfaceC34773k3 == null ? new C34774l(AbstractC37056f.m118958J(new C34768f(arrayListM74097F2)), list6) : new C34774l(AbstractC25265s.m74129g1(AbstractC37056f.m118958J(new C34768f(arrayListM74097F2)), list5), list6));
                    }
                    return new C34774l(arrayList, arrayList3);
                }
            }
        }
        arrayList.add(new C34768f(arrayListM74097F2));
        return new C34774l(arrayList, list3);
    }

    /* JADX INFO: renamed from: f */
    public static final float m100699f(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f13 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            f13 += fArr[i13] * fArr2[i13];
        }
        return f13;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX INFO: renamed from: g */
    public static Method m100700g(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        ?? r14;
        boolean z4;
        int length = methodArr.length;
        boolean z13 = false;
        int i13 = 0;
        while (i13 < length) {
            method = methodArr[i13];
            if (str.equals(method.getName()) || AbstractC39421y.m125930O(method.getName(), str.concat("-"), z13)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z14 = z13;
                    ?? r15 = z14;
                    while (r14 < length2) {
                        Class<?> cls = parameterTypes[r14];
                        int i14 = r15 + 1;
                        Class<?> cls2 = clsArr2[r15];
                        if (AbstractC22676k.m65745e(AbstractC21598x.m60666V(cls), AbstractC21598x.m60666V(cls2)) || cls.isAssignableFrom(cls2)) {
                            r14 = z14;
                            r14 = z14;
                            z4 = true;
                        } else {
                            r14 = z14;
                            z4 = false;
                        }
                        arrayList.add(Boolean.valueOf(z4));
                        r15 = i14;
                        r14++;
                    }
                    r14 = z14;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (((Boolean) it.next()).booleanValue());
                    }
                    if (method != null) {
                        return method;
                    }
                    throw new NoSuchMethodException(str.concat(" not found"));
                }
                continue;
            }
            i13++;
            z13 = false;
        }
        method = null;
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    /* JADX INFO: renamed from: h */
    public static Method m100701h(Class cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                break;
            }
            Object obj = objArr[i13];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i13++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int iCeil = length2 == 0 ? 1 : (int) Math.ceil(((double) length2) / 10.0d);
                Class cls3 = Integer.TYPE;
                C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, iCeil);
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
                Iterator it = c18284jM36278i0.iterator();
                while (((C18283i) it).f71138y) {
                    ((AbstractC25243e0) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                C22677k0 c22677k0 = new C22677k0(3);
                ArrayList arrayList3 = c22677k0.f89339a;
                c22677k0.m65764e(clsArr);
                c22677k0.m65760a(Composer.class);
                c22677k0.m65764e(clsArr2);
                return m100700g(declaredMethods, str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!AbstractC22676k.m65745e(method.getName(), str)) {
                    if (!AbstractC39421y.m125930O(method.getName(), str + '-', false)) {
                    }
                }
                return method;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final C37062l m100702i(InterfaceC21461d readonlyKClass, C35847e mutableFqName) {
        AbstractC22676k.m65750j(mutableFqName, "mutableFqName");
        AbstractC22676k.m65750j(readonlyKClass, "readonlyKClass");
        return new C37062l(readonlyKClass, mutableFqName.f152613a.f152616a, new C37063m(readonlyKClass, mutableFqName), new C37063m(mutableFqName, readonlyKClass));
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m100703j(C37187g c37187g) {
        AbstractC22676k.m65750j(c37187g, "<this>");
        AbstractC37178b0 abstractC37178b0 = c37187g.f159012k;
        return (abstractC37178b0 instanceof C37209y) || (abstractC37178b0 instanceof C37210z) || (abstractC37178b0 instanceof C37176a0);
    }

    /* JADX INFO: renamed from: k */
    public static void m100704k(String str, String str2, C28655q c28655q, Object... objArr) throws Exception {
        try {
            Class<?> cls = Class.forName(str);
            Method methodM100701h = m100701h(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (methodM100701h != null) {
                methodM100701h.setAccessible(true);
                if (Modifier.isStatic(methodM100701h.getModifiers())) {
                    m100705l(methodM100701h, null, c28655q, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    m100705l(methodM100701h, cls.getConstructor(null).newInstance(null), c28655q, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e5) {
            Log.w("PreviewLogger", "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null);
            throw e5;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00eb  */
    /* JADX INFO: renamed from: l */
    public static void m100705l(Method method, Object obj, Composer composer, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        Object objValueOf;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i13 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i14 = length - 1;
                if (AbstractC22676k.m65745e(parameterTypes[length], Composer.class)) {
                    i13 = length;
                    break;
                } else if (i14 < 0) {
                    break;
                } else {
                    length = i14;
                }
            }
        }
        int i15 = i13 + 1;
        int iCeil = (i13 != 0 ? (int) Math.ceil(((double) ((obj != null ? 1 : 0) + i13)) / 10.0d) : 1) + i15;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iCeil ? (int) Math.ceil(((double) i13) / 31.0d) : 0) + iCeil != length2) {
            throw new IllegalStateException("params don't add up to total params");
        }
        Object[] objArr2 = new Object[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            if (i16 < 0 || i16 >= i13) {
                if (i16 == i13) {
                    objValueOf = composer;
                } else if (i15 <= i16 && i16 < iCeil) {
                    objValueOf = 0;
                } else {
                    if (iCeil > i16 || i16 >= length2) {
                        throw new IllegalStateException("Unexpected index");
                    }
                    objValueOf = 2097151;
                }
            } else if (i16 < 0 || i16 >= objArr.length) {
                switch (method.getParameterTypes()[i16].getName()) {
                    case "double":
                        objValueOf = Double.valueOf(0.0d);
                        break;
                    case "int":
                        objValueOf = 0;
                        break;
                    case "byte":
                        objValueOf = (byte) 0;
                        break;
                    case "char":
                        objValueOf = (char) 0;
                        break;
                    case "long":
                        objValueOf = 0L;
                        break;
                    case "boolean":
                        objValueOf = Boolean.FALSE;
                        break;
                    case "float":
                        objValueOf = Float.valueOf(0.0f);
                        break;
                    case "short":
                        objValueOf = (short) 0;
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                objValueOf = objArr[i16];
            }
            objArr2[i16] = objValueOf;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m100706n(AbstractC25492l abstractC25492l) {
        AbstractC22676k.m65750j(abstractC25492l, "<this>");
        if ((!(abstractC25492l instanceof AbstractC25491k) && !(abstractC25492l instanceof C25494n)) || abstractC25492l.mo74901a() == null) {
            return false;
        }
        if (abstractC25492l.mo74902c()) {
            return true;
        }
        Long lMo74901a = abstractC25492l.mo74901a();
        AbstractC22676k.m65747g(lMo74901a);
        return lMo74901a.longValue() > 1048576;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m100707o(int i13, String str) {
        char cCharAt = str.charAt(i13);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    /* JADX INFO: renamed from: p */
    public static final void m100708p(float[] fArr, float[] fArr2, int i13, float[] fArr3) {
        if (i13 == 0) {
            AbstractC37831a.m121373a("At least one point must be provided");
        }
        int i14 = 2 >= i13 ? i13 - 1 : 2;
        int i15 = i14 + 1;
        float[][] fArr4 = new float[i15][];
        for (int i16 = 0; i16 < i15; i16++) {
            fArr4[i16] = new float[i13];
        }
        for (int i17 = 0; i17 < i13; i17++) {
            fArr4[0][i17] = 1.0f;
            for (int i18 = 1; i18 < i15; i18++) {
                fArr4[i18][i17] = fArr4[i18 - 1][i17] * fArr[i17];
            }
        }
        float[][] fArr5 = new float[i15][];
        for (int i19 = 0; i19 < i15; i19++) {
            fArr5[i19] = new float[i13];
        }
        float[][] fArr6 = new float[i15][];
        for (int i24 = 0; i24 < i15; i24++) {
            fArr6[i24] = new float[i15];
        }
        int i25 = 0;
        while (i25 < i15) {
            float[] destination = fArr5[i25];
            float[] fArr7 = fArr4[i25];
            AbstractC22676k.m65750j(fArr7, "<this>");
            AbstractC22676k.m65750j(destination, "destination");
            System.arraycopy(fArr7, 0, destination, 0, i13);
            for (int i26 = 0; i26 < i25; i26++) {
                float[] fArr8 = fArr5[i26];
                float fM100699f = m100699f(destination, fArr8);
                for (int i27 = 0; i27 < i13; i27++) {
                    destination[i27] = destination[i27] - (fArr8[i27] * fM100699f);
                }
            }
            float fSqrt = (float) Math.sqrt(m100699f(destination, destination));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f13 = 1.0f / fSqrt;
            for (int i28 = 0; i28 < i13; i28++) {
                destination[i28] = destination[i28] * f13;
            }
            float[] fArr9 = fArr6[i25];
            int i29 = 0;
            while (i29 < i15) {
                fArr9[i29] = i29 < i25 ? 0.0f : m100699f(destination, fArr4[i29]);
                i29++;
            }
            i25++;
        }
        for (int i34 = i14; -1 < i34; i34--) {
            float fM100699f2 = m100699f(fArr5[i34], fArr2);
            float[] fArr10 = fArr6[i34];
            int i35 = i34 + 1;
            if (i35 <= i14) {
                int i36 = i14;
                while (true) {
                    fM100699f2 -= fArr10[i36] * fArr3[i36];
                    if (i36 != i35) {
                        i36--;
                    }
                }
            }
            fArr3[i34] = fM100699f2 / fArr10[i34];
        }
    }

    /* JADX INFO: renamed from: q */
    public static C35973t m100709q() {
        C35973t.f153163e.getClass();
        AbstractC15609a abstractC15609a = AbstractC15612d.f58613x;
        return new C35973t((abstractC15609a.mo43930i().nextLong() & (~C35973t.f153164f)) | C35973t.f153165g, (abstractC15609a.mo43930i().nextLong() & (~C35973t.f153166h)) | C35973t.f153167i);
    }

    /* JADX INFO: renamed from: r */
    public static final void m100710r(C35937b c35937b, C37199o signer, C37187g c37187g, byte[] previousSignature, C25484d c25484d, InterfaceC30063j coroutineContext) throws IOException {
        AbstractC25492l c25495o;
        AbstractC22676k.m65750j(signer, "signer");
        AbstractC22676k.m65750j(previousSignature, "signature");
        AbstractC22676k.m65750j(coroutineContext, "coroutineContext");
        AbstractC25492l abstractC25492l = c35937b.f153018z;
        if (abstractC25492l instanceof C25494n) {
            InterfaceC39502o interfaceC39502o = null;
            if (!(abstractC25492l instanceof C25490j)) {
                if (abstractC25492l instanceof C27892a) {
                    byte[] bArr = ((C27892a) abstractC25492l).f112471a;
                    int length = bArr.length;
                    C39496i c39496i = new C39496i(length);
                    if (length > c39496i.f169911y.f174965c) {
                        throw new IllegalArgumentException("Initial contents overflow maximum channel capacity");
                    }
                    c39496i.f169910x.write(bArr, 0, length);
                    C40603d c40603d = c39496i.f169911y;
                    c40603d.getClass();
                    C40603d.f174961f.getAndAdd(c40603d, -length);
                    C40603d.f174962g.getAndAdd(c40603d, length);
                    C39496i.f169904K.getAndAdd(c39496i, length);
                    c39496i.m126155s();
                    c39496i.mo126154r(null);
                    interfaceC39502o = c39496i;
                } else {
                    interfaceC39502o = ((C25494n) abstractC25492l).f99829b;
                }
            }
            if (interfaceC39502o == null) {
                throw new IllegalStateException("Required value was null.");
            }
            AbstractC22676k.m65750j(signer, "signer");
            AbstractC22676k.m65750j(previousSignature, "previousSignature");
            C33652u c33652u = new C33652u();
            c33652u.f140441w = interfaceC39502o;
            c33652u.f140442x = new C11799p(new C34249c(interfaceC39502o, 18), signer, c37187g, previousSignature, c25484d);
            c25495o = new C25494n(-1L, c33652u);
        } else {
            if (!(abstractC25492l instanceof AbstractC25491k)) {
                throw new ClientException("HttpBody type is not supported");
            }
            c25495o = new C25495o(-1L, new C37177b(((AbstractC25491k) abstractC25492l).mo74903d(), signer, c37187g, previousSignature, c25484d, coroutineContext));
        }
        c35937b.f153018z = c25495o;
    }

    /* JADX INFO: renamed from: s */
    public static final void m100711s(C35937b c35937b) {
        C25483c c25483c = c35937b.f153017y;
        c25483c.m386f("aws-chunked", "Content-Encoding");
        c25483c.m380N("chunked", "Transfer-Encoding");
        String strValueOf = (String) c25483c.m397v("Content-Length");
        if (strValueOf == null) {
            Long lMo74901a = c35937b.f153018z.mo74901a();
            strValueOf = lMo74901a != null ? String.valueOf(lMo74901a.longValue()) : null;
            if (strValueOf == null) {
                throw new ClientException("Expected \"Content-Length\" header or `body.contentLength` to be set for aws-chunked");
            }
        }
        c25483c.m380N(strValueOf, "X-Amz-Decoded-Content-Length");
    }

    /* JADX INFO: renamed from: t */
    public static final String m100712t(C33460u0 c33460u0, EnumC4206v enumC4206v) throws JSONException {
        Object jSONObject;
        Map<String, RTCStats> statsMap = null;
        if (enumC4206v == EnumC4206v.f17063w) {
            C26243q c26243q = c33460u0.f139718a;
            if (c26243q != null) {
                statsMap = c26243q.f104348a.getStatsMap();
            }
        } else {
            C26243q c26243q2 = c33460u0.f139719b;
            if (c26243q2 != null) {
                statsMap = c26243q2.f104348a.getStatsMap();
            }
        }
        JSONArray jSONArray = new JSONArray();
        if (statsMap != null) {
            for (Map.Entry<String, RTCStats> entry : statsMap.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("timestamp", entry.getValue().getTimestampUs());
                jSONObject2.put("id", entry.getValue().getId());
                jSONObject2.put("type", entry.getValue().getType());
                Map<String, Object> members = entry.getValue().getMembers();
                AbstractC22676k.m65749i(members, "getMembers(...)");
                for (Map.Entry<String, Object> entry2 : members.entrySet()) {
                    String key = entry2.getKey();
                    Object value = entry2.getValue();
                    try {
                        if (value instanceof Object[]) {
                            jSONObject = new JSONArray(value);
                        } else {
                            if (value instanceof Map) {
                                jSONObject = new JSONObject(value.toString());
                            }
                            jSONObject2.put(key, value);
                        }
                        value = jSONObject;
                    } catch (JSONException e5) {
                        Log.d("CallStatsReport", "sendStats. Error for " + key + " with " + value + ": " + e5.getMessage());
                        value = "";
                    }
                    jSONObject2.put(key, value);
                }
                jSONArray.put(jSONObject2);
            }
        }
        String string = jSONArray.toString(2);
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: u */
    public static final String m100713u(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        StringBuilder sb4 = new StringBuilder(str.length());
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb4.append(cCharAt);
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: v */
    public static final C37236a m100714v(C37236a c37236a, byte[] bArr) {
        AbstractC22676k.m65750j(c37236a, "<this>");
        return new C37236a(c37236a.f159235a, c37236a.f159236b, bArr != null ? new C27892a(bArr) : C25490j.f99825a);
    }

    /* JADX INFO: renamed from: w */
    public static void m100715w(long j7, int i13, char[] cArr, int i14, int i15) {
        int i16 = 64 - (i13 * 8);
        int i17 = i15 * 2;
        int i18 = 0;
        while (i18 < i17) {
            i16 -= 4;
            cArr[i14] = C35973t.f153162d[(int) ((j7 >> i16) & 15)];
            i18++;
            i14++;
        }
    }
}
