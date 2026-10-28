package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.node.C1134a;
import hm.C17417d;
import i63.AbstractC18171j;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.replay.AbstractC20255y;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import l83.EnumC23463i;
import m83.AbstractC25265s;
import p002a0.C0057v0;
import p005a3.C0223l1;
import p005a3.C0230n0;
import p181h2.C16618c;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p208i2.InterfaceC17868a0;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18039u;
import p209i3.C18017a;
import p209i3.C18030l;
import p294l3.C23275q0;
import p294l3.C23277r0;
import p294l3.C23285v0;
import p331n2.AbstractC26165a;
import p635y2.AbstractC39125q1;
import p635y2.C39148y0;
import p635y2.InterfaceC39147y;
import p636y3.C39183o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import x43.AbstractC37978j;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20247b {

    /* JADX INFO: renamed from: a */
    public static final Object f76054a = AbstractC30060g.m92087G(EnumC23463i.f92935y, C20246a.f76053w);

    /* JADX INFO: renamed from: b */
    public static boolean f76055b;

    /* JADX INFO: renamed from: c */
    public static WeakReference f76056c;

    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX INFO: renamed from: a */
    public static boolean m56176a(C18030l c18030l, boolean z4, AbstractC18171j abstractC18171j) {
        String str;
        Object obj = null;
        if (c18030l != null) {
            Object objM129g = c18030l.f69980w.m129g(AbstractC20255y.f76076a);
            obj = (String) (objM129g != null ? objM129g : null);
        }
        if (AbstractC22676k.m65745e(obj, "unmask")) {
            abstractC18171j.mo52172e();
            return false;
        }
        if (AbstractC22676k.m65745e(obj, "mask")) {
            abstractC18171j.mo52172e();
            return true;
        }
        if (z4) {
            str = "android.widget.ImageView";
        } else if (c18030l != null) {
            C0057v0 c0057v0 = c18030l.f69980w;
            if (c0057v0.m125c(AbstractC18039u.f70019A) || c0057v0.m125c(AbstractC18029k.f69963j) || c0057v0.m125c(AbstractC18039u.f70023E)) {
                str = "android.widget.TextView";
            } else {
                str = "android.view.View";
            }
        } else {
            str = "android.view.View";
        }
        if (((CopyOnWriteArraySet) abstractC18171j.f70499c).contains(str)) {
            return false;
        }
        return ((CopyOnWriteArraySet) abstractC18171j.f70498b).contains(str);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x023d  */
    /* JADX WARN: Code duplicated, block: B:108:0x024f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0252  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:134:0x02da  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:146:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:147:0x0307  */
    /* JADX WARN: Code duplicated, block: B:149:0x032c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0346  */
    /* JADX WARN: Code duplicated, block: B:155:0x0374 A[Catch: all -> 0x0378, TRY_LEAVE, TryCatch #1 {all -> 0x0378, blocks: (B:153:0x035e, B:155:0x0374), top: B:211:0x035e }] */
    /* JADX WARN: Code duplicated, block: B:158:0x037a A[LOOP:2: B:150:0x0344->B:158:0x037a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:160:0x037f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0381  */
    /* JADX WARN: Code duplicated, block: B:164:0x038a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0398  */
    /* JADX WARN: Code duplicated, block: B:169:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:174:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:176:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:177:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:180:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:189:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:197:0x0429  */
    /* JADX WARN: Code duplicated, block: B:203:0x0442  */
    /* JADX WARN: Code duplicated, block: B:211:0x035e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x044a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f2 A[PHI: r3
      0x01f2: PHI (r3v7 boolean) = (r3v39 boolean), (r3v41 boolean) binds: [B:78:0x01f0, B:73:0x01e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x0202 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0204  */
    /* JADX WARN: Code duplicated, block: B:87:0x0206  */
    /* JADX WARN: Code duplicated, block: B:90:0x020f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0217  */
    /* JADX WARN: Code duplicated, block: B:95:0x0221  */
    /* JADX WARN: Code duplicated, block: B:98:0x0229  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [l83.h] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: b */
    public static void m56177b(C0230n0 c0230n0, AbstractC20252g abstractC20252g, boolean z4, AbstractC18171j abstractC18171j, InterfaceC20602v0 interfaceC20602v0) throws IllegalAccessException, InvocationTargetException {
        ?? r14;
        ?? r19;
        ?? r15;
        AbstractC20252g abstractC20252g2;
        ArrayList arrayList;
        Rect rect;
        int i13;
        AbstractC20252g c20248c;
        ?? r10;
        Object obj;
        C18030l c18030lM591I;
        ?? r110;
        int i14;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        ?? r111;
        List listM583D;
        int size;
        int i15;
        AbstractC26165a abstractC26165a;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        String name;
        Modifier modifier;
        Object obj2;
        boolean z25;
        ArrayList arrayList2;
        C23277r0 c23277r0;
        C17919x c17919x;
        boolean z26;
        C17919x c17919x2;
        boolean zM124803a;
        C39183o c39183o;
        long j7;
        C17417d c17417d;
        Integer numValueOf;
        C23275q0 c23275q0;
        C23285v0 c23285v0;
        C17919x c17919x3;
        C23275q0 c23275q1;
        C23285v0 c23285v1;
        Object objM129g;
        C18017a c18017a;
        Function1 function1;
        Object obj3 = f76054a;
        List listM121618A = AbstractC37978j.m121618A(c0230n0);
        if (listM121618A.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(listM121618A.size());
        int size2 = listM121618A.size();
        int i16 = 0;
        while (i16 < size2) {
            C0230n0 c0230n1 = (C0230n0) listM121618A.get(i16);
            boolean zM606Y = c0230n1.m606Y();
            C0223l1 c0223l1 = c0230n1.f783e0;
            if (zM606Y && c0230n1.m605X()) {
                if (z4) {
                    f76056c = new WeakReference(AbstractC39125q1.m124662h((C1134a) c0223l1.f740d));
                }
                C1134a c1134a = (C1134a) c0223l1.f740d;
                WeakReference weakReference = f76056c;
                InterfaceC39147y interfaceC39147yM124662h = weakReference != null ? (InterfaceC39147y) weakReference.get() : null;
                AbstractC22676k.m65750j(c1134a, "<this>");
                if (interfaceC39147yM124662h == null) {
                    interfaceC39147yM124662h = AbstractC39125q1.m124662h(c1134a);
                }
                float fMo3541n = (int) (interfaceC39147yM124662h.mo3541n() >> 32);
                float fMo3541n2 = (int) (interfaceC39147yM124662h.mo3541n() & 4294967295L);
                C16618c c16618cMo3547r = interfaceC39147yM124662h.mo3547r(c1134a, true);
                float f13 = c16618cMo3547r.f63939a;
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                if (f13 > fMo3541n) {
                    f13 = fMo3541n;
                }
                float f14 = c16618cMo3547r.f63940b;
                if (f14 < 0.0f) {
                    f14 = 0.0f;
                }
                if (f14 > fMo3541n2) {
                    f14 = fMo3541n2;
                }
                float f15 = c16618cMo3547r.f63941c;
                if (f15 < 0.0f) {
                    f15 = 0.0f;
                }
                if (f15 <= fMo3541n) {
                    fMo3541n = f15;
                }
                float f16 = c16618cMo3547r.f63942d;
                float f17 = f16 >= 0.0f ? f16 : 0.0f;
                if (f17 <= fMo3541n2) {
                    fMo3541n2 = f17;
                }
                if (f13 == fMo3541n || f14 == fMo3541n2) {
                    rect = new Rect();
                } else {
                    float f18 = fMo3541n;
                    long jMo3510E = interfaceC39147yM124662h.mo3510E((((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (((long) Float.floatToRawIntBits(f13)) << 32));
                    long jMo3510E2 = interfaceC39147yM124662h.mo3510E((((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (((long) Float.floatToRawIntBits(f18)) << 32));
                    long jMo3510E3 = interfaceC39147yM124662h.mo3510E((((long) Float.floatToRawIntBits(fMo3541n2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f18)) << 32));
                    long jMo3510E4 = interfaceC39147yM124662h.mo3510E((((long) Float.floatToRawIntBits(fMo3541n2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f13)) << 32));
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo3510E >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo3510E2 >> 32));
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo3510E4 >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo3510E3 >> 32));
                    float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
                    float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo3510E & 4294967295L));
                    float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo3510E2 & 4294967295L));
                    float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo3510E4 & 4294967295L));
                    float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo3510E3 & 4294967295L));
                    rect = new Rect((int) fMin, (int) Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), (int) fMax, (int) Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
                }
                try {
                    c18030lM591I = c0230n1.m591I();
                    obj = null;
                } catch (Throwable th3) {
                    try {
                        if (((Method) r14.getValue()) != null) {
                            Method method = (Method) r14.getValue();
                            AbstractC22676k.m65747g(method);
                            obj = null;
                            c18030lM591I = (C18030l) method.invoke(c0230n1, null);
                        } else {
                            i13 = 0;
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                if (!f76055b) {
                                    f76055b = true;
                                    interfaceC20602v0.mo16058i(EnumC20436n5.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[i13]);
                                }
                                int iM592J = c0230n1.m592J();
                                int iM641s = c0230n1.m641s();
                                float f19 = abstractC20252g.f76064c;
                                if (!AbstractC37978j.m121628K(c0230n1) || rect.height() <= 0 || rect.width() <= 0) {
                                    r10 = i13;
                                } else {
                                    r10 = 1;
                                }
                                c20248c = new C20248c(iM592J, iM641s, f19, abstractC20252g, true, r10, rect);
                                i14 = i13;
                                r110 = r14;
                                abstractC20252g2 = c20248c;
                                r15 = i14;
                                r19 = r110;
                                arrayList = arrayList3;
                                if (abstractC20252g2 != null) {
                                    arrayList.add(abstractC20252g2);
                                    m56177b(c0230n1, abstractC20252g2, r15, abstractC18171j, interfaceC20602v0);
                                }
                                i16++;
                                arrayList3 = arrayList;
                                size2 = size2;
                                r14 = r19;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        i13 = 0;
                    }
                    if (!f76055b) {
                        f76055b = true;
                        interfaceC20602v0.mo16058i(EnumC20436n5.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[i13]);
                    }
                    int iM592J2 = c0230n1.m592J();
                    int iM641s2 = c0230n1.m641s();
                    float f110 = abstractC20252g.f76064c;
                    if (AbstractC37978j.m121628K(c0230n1)) {
                        r10 = i13;
                    } else {
                        r10 = i13;
                    }
                    c20248c = new C20248c(iM592J2, iM641s2, f110, abstractC20252g, true, r10, rect);
                    i14 = i13;
                    r110 = r14;
                    abstractC20252g2 = c20248c;
                    r15 = i14;
                    r19 = r110;
                    arrayList = arrayList3;
                    if (abstractC20252g2 != null) {
                        arrayList.add(abstractC20252g2);
                        m56177b(c0230n1, abstractC20252g2, r15, abstractC18171j, interfaceC20602v0);
                    }
                    i16++;
                    arrayList3 = arrayList;
                    size2 = size2;
                    r14 = r19;
                }
                if (AbstractC37978j.m121628K(c0230n1)) {
                    z13 = false;
                } else if (c18030lM591I != null) {
                    if (c18030lM591I.f69980w.m125c(AbstractC18039u.f70048o)) {
                        z13 = false;
                    } else if (rect.height() > 0 || rect.width() <= 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                } else if (rect.height() > 0) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (c18030lM591I != null) {
                    z14 = true;
                    z15 = c18030lM591I.f69980w.m125c(AbstractC18029k.f69963j) ? z14 : false;
                    if (c18030lM591I != null) {
                        if (c18030lM591I.f69980w.m125c(AbstractC18039u.f70019A) == z14) {
                            if (z13 || !m56176a(c18030lM591I, false, abstractC18171j)) {
                                z25 = false;
                            } else {
                                z25 = true;
                            }
                            arrayList2 = new ArrayList();
                            if (c18030lM591I != null) {
                                objM129g = c18030lM591I.f69980w.m129g(AbstractC18029k.f69954a);
                                if (objM129g == null) {
                                    objM129g = obj;
                                }
                                c18017a = (C18017a) objM129g;
                                if (c18017a != null && (function1 = (Function1) c18017a.f69929b) != null) {
                                }
                            }
                            c23277r0 = (C23277r0) AbstractC25265s.m74100H0(arrayList2);
                            if (c23277r0 != null || (c23275q1 = c23277r0.f92227a) == null || (c23285v1 = c23275q1.f92217b) == null) {
                                c17919x = null;
                            } else {
                                c17919x = new C17919x(c23285v1.m67366c());
                            }
                            if (c17919x == null && c17919x.f69639a == 16) {
                                List listM583D2 = c0230n1.m583D();
                                int size3 = listM583D2.size();
                                int i17 = 0;
                                while (true) {
                                    if (i17 < size3) {
                                        Modifier modifier2 = ((C39148y0) listM583D2.get(i17)).f168301a;
                                        z26 = z15;
                                        size2 = size2;
                                        List list = listM583D2;
                                        zM124803a = false;
                                        if (AbstractC39414r.m125876U(modifier2.getClass().getName(), "Text", false)) {
                                            try {
                                                Field declaredField = modifier2.getClass().getDeclaredField("color");
                                                declaredField.setAccessible(true);
                                                Object obj4 = declaredField.get(modifier2);
                                                InterfaceC17868a0 interfaceC17868a0 = obj4 instanceof InterfaceC17868a0 ? (InterfaceC17868a0) obj4 : null;
                                                if (interfaceC17868a0 != null) {
                                                    c17919x3 = new C17919x(interfaceC17868a0.mo3457a());
                                                    break;
                                                }
                                            } catch (Throwable unused) {
                                            }
                                        } else {
                                            i17++;
                                            size2 = size2;
                                            z15 = z26;
                                            listM583D2 = list;
                                        }
                                    } else {
                                        z26 = z15;
                                        size2 = size2;
                                        zM124803a = false;
                                    }
                                    c17919x3 = null;
                                    break;
                                }
                                c17919x2 = c17919x3;
                            } else {
                                z26 = z15;
                                size2 = size2;
                                c17919x2 = c17919x;
                                zM124803a = false;
                            }
                            if (c23277r0 != null || (c23275q0 = c23277r0.f92227a) == null || (c23285v0 = c23275q0.f92217b) == null) {
                                c39183o = null;
                            } else {
                                c39183o = new C39183o(c23285v0.f92255a.f92192b);
                            }
                            j7 = C39183o.f168428c;
                            if (c39183o != null) {
                                zM124803a = C39183o.m124803a(c39183o.f168429a, j7);
                            }
                            if (c23277r0 != null || z26 || zM124803a) {
                                c17417d = null;
                            } else {
                                c17417d = new C17417d(c23277r0, 11);
                            }
                            if (c17919x2 != null) {
                                numValueOf = Integer.valueOf(AbstractC17918w0.m51506H(c17919x2.f69639a) | (-16777216));
                            } else {
                                numValueOf = null;
                            }
                            c0230n1 = c0230n1;
                            r110 = r14;
                            arrayList3 = arrayList3;
                            i14 = 0;
                            c20248c = new C20251f(c17417d, numValueOf, 0, 0, c0230n1.m592J(), c0230n1.m641s(), abstractC20252g.f76064c, abstractC20252g, z25, z13, rect);
                        } else if (z15) {
                            if (z13) {
                                z25 = false;
                            } else {
                                z25 = false;
                            }
                            arrayList2 = new ArrayList();
                            if (c18030lM591I != null) {
                                objM129g = c18030lM591I.f69980w.m129g(AbstractC18029k.f69954a);
                                if (objM129g == null) {
                                    objM129g = obj;
                                }
                                c18017a = (C18017a) objM129g;
                                if (c18017a != null) {
                                }
                            }
                            c23277r0 = (C23277r0) AbstractC25265s.m74100H0(arrayList2);
                            if (c23277r0 != null) {
                                c17919x = null;
                            } else {
                                c17919x = null;
                            }
                            if (c17919x == null) {
                                z26 = z15;
                                size2 = size2;
                                c17919x2 = c17919x;
                                zM124803a = false;
                            } else {
                                z26 = z15;
                                size2 = size2;
                                c17919x2 = c17919x;
                                zM124803a = false;
                            }
                            if (c23277r0 != null) {
                                c39183o = null;
                            } else {
                                c39183o = null;
                            }
                            j7 = C39183o.f168428c;
                            if (c39183o != null) {
                                zM124803a = C39183o.m124803a(c39183o.f168429a, j7);
                            }
                            if (c23277r0 != null) {
                                c17417d = null;
                            } else {
                                c17417d = null;
                            }
                            if (c17919x2 != null) {
                                numValueOf = Integer.valueOf(AbstractC17918w0.m51506H(c17919x2.f69639a) | (-16777216));
                            } else {
                                numValueOf = null;
                            }
                            c0230n1 = c0230n1;
                            r110 = r14;
                            arrayList3 = arrayList3;
                            i14 = 0;
                            c20248c = new C20251f(c17417d, numValueOf, 0, 0, c0230n1.m592J(), c0230n1.m641s(), abstractC20252g.f76064c, abstractC20252g, z25, z13, rect);
                        } else {
                            size2 = size2;
                            c0230n1 = c0230n1;
                            z16 = z13;
                            arrayList3 = arrayList3;
                            r111 = r14;
                            i14 = 0;
                            i14 = 0;
                            listM583D = c0230n1.m583D();
                            size = listM583D.size();
                            i15 = 0;
                            while (true) {
                                if (i15 < size) {
                                    modifier = ((C39148y0) listM583D.get(i15)).f168301a;
                                    if (AbstractC39414r.m125876U(modifier.getClass().getName(), "Painter", false)) {
                                        try {
                                            Field declaredField2 = modifier.getClass().getDeclaredField("painter");
                                            declaredField2.setAccessible(true);
                                            obj2 = declaredField2.get(modifier);
                                            if (obj2 instanceof AbstractC26165a) {
                                                abstractC26165a = (AbstractC26165a) obj2;
                                                break;
                                            }
                                        } catch (Throwable unused2) {
                                        }
                                    } else {
                                        i15++;
                                    }
                                }
                                abstractC26165a = null;
                                break;
                            }
                            if (abstractC26165a != null) {
                                if (z16 || !m56176a(c18030lM591I, true, abstractC18171j)) {
                                    z18 = false;
                                } else {
                                    z18 = true;
                                }
                                int iM592J3 = c0230n1.m592J();
                                int iM641s3 = c0230n1.m641s();
                                z19 = z18;
                                float f24 = abstractC20252g.f76064c;
                                if (z19) {
                                    name = abstractC26165a.getClass().getName();
                                    if (!AbstractC39414r.m125876U(name, "Vector", false) || AbstractC39414r.m125876U(name, "Color", false) || AbstractC39414r.m125876U(name, "Brush", false)) {
                                        z24 = false;
                                    } else {
                                        z24 = true;
                                    }
                                } else {
                                    z24 = false;
                                }
                                c20248c = new C20249d(iM592J3, iM641s3, f24, abstractC20252g, z24, z16, rect);
                                r110 = r111;
                            } else {
                                if (z16 || !m56176a(c18030lM591I, false, abstractC18171j)) {
                                    z17 = false;
                                } else {
                                    z17 = true;
                                }
                                c20248c = new C20248c(c0230n1.m592J(), c0230n1.m641s(), abstractC20252g.f76064c, abstractC20252g, z17, z16, rect);
                                r110 = r111;
                            }
                        }
                    } else if (z15) {
                        if (z13) {
                            z25 = false;
                        } else {
                            z25 = false;
                        }
                        arrayList2 = new ArrayList();
                        if (c18030lM591I != null) {
                            objM129g = c18030lM591I.f69980w.m129g(AbstractC18029k.f69954a);
                            if (objM129g == null) {
                                objM129g = obj;
                            }
                            c18017a = (C18017a) objM129g;
                            if (c18017a != null) {
                            }
                        }
                        c23277r0 = (C23277r0) AbstractC25265s.m74100H0(arrayList2);
                        if (c23277r0 != null) {
                            c17919x = null;
                        } else {
                            c17919x = null;
                        }
                        if (c17919x == null) {
                            z26 = z15;
                            size2 = size2;
                            c17919x2 = c17919x;
                            zM124803a = false;
                        } else {
                            z26 = z15;
                            size2 = size2;
                            c17919x2 = c17919x;
                            zM124803a = false;
                        }
                        if (c23277r0 != null) {
                            c39183o = null;
                        } else {
                            c39183o = null;
                        }
                        j7 = C39183o.f168428c;
                        if (c39183o != null) {
                            zM124803a = C39183o.m124803a(c39183o.f168429a, j7);
                        }
                        if (c23277r0 != null) {
                            c17417d = null;
                        } else {
                            c17417d = null;
                        }
                        if (c17919x2 != null) {
                            numValueOf = Integer.valueOf(AbstractC17918w0.m51506H(c17919x2.f69639a) | (-16777216));
                        } else {
                            numValueOf = null;
                        }
                        c0230n1 = c0230n1;
                        r110 = r14;
                        arrayList3 = arrayList3;
                        i14 = 0;
                        c20248c = new C20251f(c17417d, numValueOf, 0, 0, c0230n1.m592J(), c0230n1.m641s(), abstractC20252g.f76064c, abstractC20252g, z25, z13, rect);
                    } else {
                        size2 = size2;
                        c0230n1 = c0230n1;
                        z16 = z13;
                        arrayList3 = arrayList3;
                        r111 = r14;
                        i14 = 0;
                        i14 = 0;
                        listM583D = c0230n1.m583D();
                        size = listM583D.size();
                        i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                modifier = ((C39148y0) listM583D.get(i15)).f168301a;
                                if (AbstractC39414r.m125876U(modifier.getClass().getName(), "Painter", false)) {
                                    Field declaredField3 = modifier.getClass().getDeclaredField("painter");
                                    declaredField3.setAccessible(true);
                                    obj2 = declaredField3.get(modifier);
                                    if (obj2 instanceof AbstractC26165a) {
                                        abstractC26165a = (AbstractC26165a) obj2;
                                        break;
                                    }
                                } else {
                                    i15++;
                                }
                            }
                            abstractC26165a = null;
                            break;
                        }
                        if (abstractC26165a != null) {
                            if (z16) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            int iM592J4 = c0230n1.m592J();
                            int iM641s4 = c0230n1.m641s();
                            z19 = z18;
                            float f25 = abstractC20252g.f76064c;
                            if (z19) {
                                name = abstractC26165a.getClass().getName();
                                if (AbstractC39414r.m125876U(name, "Vector", false)) {
                                    z24 = false;
                                } else {
                                    z24 = false;
                                }
                            } else {
                                z24 = false;
                            }
                            c20248c = new C20249d(iM592J4, iM641s4, f25, abstractC20252g, z24, z16, rect);
                            r110 = r111;
                        } else {
                            if (z16) {
                                z17 = false;
                            } else {
                                z17 = false;
                            }
                            c20248c = new C20248c(c0230n1.m592J(), c0230n1.m641s(), abstractC20252g.f76064c, abstractC20252g, z17, z16, rect);
                            r110 = r111;
                        }
                    }
                    abstractC20252g2 = c20248c;
                    r15 = i14;
                    r19 = r110;
                } else {
                    z14 = true;
                }
                if (c18030lM591I != null) {
                    if (c18030lM591I.f69980w.m125c(AbstractC18039u.f70023E) == z14) {
                    }
                    if (c18030lM591I != null) {
                        if (c18030lM591I.f69980w.m125c(AbstractC18039u.f70019A) == z14) {
                            if (z13) {
                                z25 = false;
                            } else {
                                z25 = false;
                            }
                            arrayList2 = new ArrayList();
                            if (c18030lM591I != null) {
                                objM129g = c18030lM591I.f69980w.m129g(AbstractC18029k.f69954a);
                                if (objM129g == null) {
                                    objM129g = obj;
                                }
                                c18017a = (C18017a) objM129g;
                                if (c18017a != null) {
                                }
                            }
                            c23277r0 = (C23277r0) AbstractC25265s.m74100H0(arrayList2);
                            if (c23277r0 != null) {
                                c17919x = null;
                            } else {
                                c17919x = null;
                            }
                            if (c17919x == null) {
                                z26 = z15;
                                size2 = size2;
                                c17919x2 = c17919x;
                                zM124803a = false;
                            } else {
                                z26 = z15;
                                size2 = size2;
                                c17919x2 = c17919x;
                                zM124803a = false;
                            }
                            if (c23277r0 != null) {
                                c39183o = null;
                            } else {
                                c39183o = null;
                            }
                            j7 = C39183o.f168428c;
                            if (c39183o != null) {
                                zM124803a = C39183o.m124803a(c39183o.f168429a, j7);
                            }
                            if (c23277r0 != null) {
                                c17417d = null;
                            } else {
                                c17417d = null;
                            }
                            if (c17919x2 != null) {
                                numValueOf = Integer.valueOf(AbstractC17918w0.m51506H(c17919x2.f69639a) | (-16777216));
                            } else {
                                numValueOf = null;
                            }
                            c0230n1 = c0230n1;
                            r110 = r14;
                            arrayList3 = arrayList3;
                            i14 = 0;
                            c20248c = new C20251f(c17417d, numValueOf, 0, 0, c0230n1.m592J(), c0230n1.m641s(), abstractC20252g.f76064c, abstractC20252g, z25, z13, rect);
                        } else if (z15) {
                            if (z13) {
                                z25 = false;
                            } else {
                                z25 = false;
                            }
                            arrayList2 = new ArrayList();
                            if (c18030lM591I != null) {
                                objM129g = c18030lM591I.f69980w.m129g(AbstractC18029k.f69954a);
                                if (objM129g == null) {
                                    objM129g = obj;
                                }
                                c18017a = (C18017a) objM129g;
                                if (c18017a != null) {
                                }
                            }
                            c23277r0 = (C23277r0) AbstractC25265s.m74100H0(arrayList2);
                            if (c23277r0 != null) {
                                c17919x = null;
                            } else {
                                c17919x = null;
                            }
                            if (c17919x == null) {
                                z26 = z15;
                                size2 = size2;
                                c17919x2 = c17919x;
                                zM124803a = false;
                            } else {
                                z26 = z15;
                                size2 = size2;
                                c17919x2 = c17919x;
                                zM124803a = false;
                            }
                            if (c23277r0 != null) {
                                c39183o = null;
                            } else {
                                c39183o = null;
                            }
                            j7 = C39183o.f168428c;
                            if (c39183o != null) {
                                zM124803a = C39183o.m124803a(c39183o.f168429a, j7);
                            }
                            if (c23277r0 != null) {
                                c17417d = null;
                            } else {
                                c17417d = null;
                            }
                            if (c17919x2 != null) {
                                numValueOf = Integer.valueOf(AbstractC17918w0.m51506H(c17919x2.f69639a) | (-16777216));
                            } else {
                                numValueOf = null;
                            }
                            c0230n1 = c0230n1;
                            r110 = r14;
                            arrayList3 = arrayList3;
                            i14 = 0;
                            c20248c = new C20251f(c17417d, numValueOf, 0, 0, c0230n1.m592J(), c0230n1.m641s(), abstractC20252g.f76064c, abstractC20252g, z25, z13, rect);
                        } else {
                            size2 = size2;
                            c0230n1 = c0230n1;
                            z16 = z13;
                            arrayList3 = arrayList3;
                            r111 = r14;
                            i14 = 0;
                            i14 = 0;
                            listM583D = c0230n1.m583D();
                            size = listM583D.size();
                            i15 = 0;
                            while (true) {
                                if (i15 < size) {
                                    modifier = ((C39148y0) listM583D.get(i15)).f168301a;
                                    if (AbstractC39414r.m125876U(modifier.getClass().getName(), "Painter", false)) {
                                        Field declaredField4 = modifier.getClass().getDeclaredField("painter");
                                        declaredField4.setAccessible(true);
                                        obj2 = declaredField4.get(modifier);
                                        if (obj2 instanceof AbstractC26165a) {
                                            abstractC26165a = (AbstractC26165a) obj2;
                                            break;
                                        }
                                    } else {
                                        i15++;
                                    }
                                }
                                abstractC26165a = null;
                                break;
                            }
                            if (abstractC26165a != null) {
                                if (z16) {
                                    z18 = false;
                                } else {
                                    z18 = false;
                                }
                                int iM592J5 = c0230n1.m592J();
                                int iM641s5 = c0230n1.m641s();
                                z19 = z18;
                                float f26 = abstractC20252g.f76064c;
                                if (z19) {
                                    name = abstractC26165a.getClass().getName();
                                    if (AbstractC39414r.m125876U(name, "Vector", false)) {
                                        z24 = false;
                                    } else {
                                        z24 = false;
                                    }
                                } else {
                                    z24 = false;
                                }
                                c20248c = new C20249d(iM592J5, iM641s5, f26, abstractC20252g, z24, z16, rect);
                                r110 = r111;
                            } else {
                                if (z16) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                c20248c = new C20248c(c0230n1.m592J(), c0230n1.m641s(), abstractC20252g.f76064c, abstractC20252g, z17, z16, rect);
                                r110 = r111;
                            }
                        }
                    } else if (z15) {
                        if (z13) {
                            z25 = false;
                        } else {
                            z25 = false;
                        }
                        arrayList2 = new ArrayList();
                        if (c18030lM591I != null) {
                            objM129g = c18030lM591I.f69980w.m129g(AbstractC18029k.f69954a);
                            if (objM129g == null) {
                                objM129g = obj;
                            }
                            c18017a = (C18017a) objM129g;
                            if (c18017a != null) {
                            }
                        }
                        c23277r0 = (C23277r0) AbstractC25265s.m74100H0(arrayList2);
                        if (c23277r0 != null) {
                            c17919x = null;
                        } else {
                            c17919x = null;
                        }
                        if (c17919x == null) {
                            z26 = z15;
                            size2 = size2;
                            c17919x2 = c17919x;
                            zM124803a = false;
                        } else {
                            z26 = z15;
                            size2 = size2;
                            c17919x2 = c17919x;
                            zM124803a = false;
                        }
                        if (c23277r0 != null) {
                            c39183o = null;
                        } else {
                            c39183o = null;
                        }
                        j7 = C39183o.f168428c;
                        if (c39183o != null) {
                            zM124803a = C39183o.m124803a(c39183o.f168429a, j7);
                        }
                        if (c23277r0 != null) {
                            c17417d = null;
                        } else {
                            c17417d = null;
                        }
                        if (c17919x2 != null) {
                            numValueOf = Integer.valueOf(AbstractC17918w0.m51506H(c17919x2.f69639a) | (-16777216));
                        } else {
                            numValueOf = null;
                        }
                        c0230n1 = c0230n1;
                        r110 = r14;
                        arrayList3 = arrayList3;
                        i14 = 0;
                        c20248c = new C20251f(c17417d, numValueOf, 0, 0, c0230n1.m592J(), c0230n1.m641s(), abstractC20252g.f76064c, abstractC20252g, z25, z13, rect);
                    } else {
                        size2 = size2;
                        c0230n1 = c0230n1;
                        z16 = z13;
                        arrayList3 = arrayList3;
                        r111 = r14;
                        i14 = 0;
                        i14 = 0;
                        listM583D = c0230n1.m583D();
                        size = listM583D.size();
                        i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                modifier = ((C39148y0) listM583D.get(i15)).f168301a;
                                if (AbstractC39414r.m125876U(modifier.getClass().getName(), "Painter", false)) {
                                    Field declaredField5 = modifier.getClass().getDeclaredField("painter");
                                    declaredField5.setAccessible(true);
                                    obj2 = declaredField5.get(modifier);
                                    if (obj2 instanceof AbstractC26165a) {
                                        abstractC26165a = (AbstractC26165a) obj2;
                                        break;
                                    }
                                } else {
                                    i15++;
                                }
                            }
                            abstractC26165a = null;
                            break;
                        }
                        if (abstractC26165a != null) {
                            if (z16) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            int iM592J6 = c0230n1.m592J();
                            int iM641s6 = c0230n1.m641s();
                            z19 = z18;
                            float f27 = abstractC20252g.f76064c;
                            if (z19) {
                                name = abstractC26165a.getClass().getName();
                                if (AbstractC39414r.m125876U(name, "Vector", false)) {
                                    z24 = false;
                                } else {
                                    z24 = false;
                                }
                            } else {
                                z24 = false;
                            }
                            c20248c = new C20249d(iM592J6, iM641s6, f27, abstractC20252g, z24, z16, rect);
                            r110 = r111;
                        } else {
                            if (z16) {
                                z17 = false;
                            } else {
                                z17 = false;
                            }
                            c20248c = new C20248c(c0230n1.m592J(), c0230n1.m641s(), abstractC20252g.f76064c, abstractC20252g, z17, z16, rect);
                            r110 = r111;
                        }
                    }
                    abstractC20252g2 = c20248c;
                    r15 = i14;
                    r19 = r110;
                }
                if (c18030lM591I != null) {
                    if (c18030lM591I.f69980w.m125c(AbstractC18039u.f70019A) == z14) {
                        if (z13) {
                            z25 = false;
                        } else {
                            z25 = false;
                        }
                        arrayList2 = new ArrayList();
                        if (c18030lM591I != null) {
                            objM129g = c18030lM591I.f69980w.m129g(AbstractC18029k.f69954a);
                            if (objM129g == null) {
                                objM129g = obj;
                            }
                            c18017a = (C18017a) objM129g;
                            if (c18017a != null) {
                            }
                        }
                        c23277r0 = (C23277r0) AbstractC25265s.m74100H0(arrayList2);
                        if (c23277r0 != null) {
                            c17919x = null;
                        } else {
                            c17919x = null;
                        }
                        if (c17919x == null) {
                            z26 = z15;
                            size2 = size2;
                            c17919x2 = c17919x;
                            zM124803a = false;
                        } else {
                            z26 = z15;
                            size2 = size2;
                            c17919x2 = c17919x;
                            zM124803a = false;
                        }
                        if (c23277r0 != null) {
                            c39183o = null;
                        } else {
                            c39183o = null;
                        }
                        j7 = C39183o.f168428c;
                        if (c39183o != null) {
                            zM124803a = C39183o.m124803a(c39183o.f168429a, j7);
                        }
                        if (c23277r0 != null) {
                            c17417d = null;
                        } else {
                            c17417d = null;
                        }
                        if (c17919x2 != null) {
                            numValueOf = Integer.valueOf(AbstractC17918w0.m51506H(c17919x2.f69639a) | (-16777216));
                        } else {
                            numValueOf = null;
                        }
                        c0230n1 = c0230n1;
                        r110 = r14;
                        arrayList3 = arrayList3;
                        i14 = 0;
                        c20248c = new C20251f(c17417d, numValueOf, 0, 0, c0230n1.m592J(), c0230n1.m641s(), abstractC20252g.f76064c, abstractC20252g, z25, z13, rect);
                    } else if (z15) {
                        if (z13) {
                            z25 = false;
                        } else {
                            z25 = false;
                        }
                        arrayList2 = new ArrayList();
                        if (c18030lM591I != null) {
                            objM129g = c18030lM591I.f69980w.m129g(AbstractC18029k.f69954a);
                            if (objM129g == null) {
                                objM129g = obj;
                            }
                            c18017a = (C18017a) objM129g;
                            if (c18017a != null) {
                            }
                        }
                        c23277r0 = (C23277r0) AbstractC25265s.m74100H0(arrayList2);
                        if (c23277r0 != null) {
                            c17919x = null;
                        } else {
                            c17919x = null;
                        }
                        if (c17919x == null) {
                            z26 = z15;
                            size2 = size2;
                            c17919x2 = c17919x;
                            zM124803a = false;
                        } else {
                            z26 = z15;
                            size2 = size2;
                            c17919x2 = c17919x;
                            zM124803a = false;
                        }
                        if (c23277r0 != null) {
                            c39183o = null;
                        } else {
                            c39183o = null;
                        }
                        j7 = C39183o.f168428c;
                        if (c39183o != null) {
                            zM124803a = C39183o.m124803a(c39183o.f168429a, j7);
                        }
                        if (c23277r0 != null) {
                            c17417d = null;
                        } else {
                            c17417d = null;
                        }
                        if (c17919x2 != null) {
                            numValueOf = Integer.valueOf(AbstractC17918w0.m51506H(c17919x2.f69639a) | (-16777216));
                        } else {
                            numValueOf = null;
                        }
                        c0230n1 = c0230n1;
                        r110 = r14;
                        arrayList3 = arrayList3;
                        i14 = 0;
                        c20248c = new C20251f(c17417d, numValueOf, 0, 0, c0230n1.m592J(), c0230n1.m641s(), abstractC20252g.f76064c, abstractC20252g, z25, z13, rect);
                    } else {
                        size2 = size2;
                        c0230n1 = c0230n1;
                        z16 = z13;
                        arrayList3 = arrayList3;
                        r111 = r14;
                        i14 = 0;
                        i14 = 0;
                        listM583D = c0230n1.m583D();
                        size = listM583D.size();
                        i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                modifier = ((C39148y0) listM583D.get(i15)).f168301a;
                                if (AbstractC39414r.m125876U(modifier.getClass().getName(), "Painter", false)) {
                                    Field declaredField6 = modifier.getClass().getDeclaredField("painter");
                                    declaredField6.setAccessible(true);
                                    obj2 = declaredField6.get(modifier);
                                    if (obj2 instanceof AbstractC26165a) {
                                        abstractC26165a = (AbstractC26165a) obj2;
                                        break;
                                    }
                                } else {
                                    i15++;
                                }
                            }
                            abstractC26165a = null;
                            break;
                        }
                        if (abstractC26165a != null) {
                            if (z16) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            int iM592J7 = c0230n1.m592J();
                            int iM641s7 = c0230n1.m641s();
                            z19 = z18;
                            float f28 = abstractC20252g.f76064c;
                            if (z19) {
                                name = abstractC26165a.getClass().getName();
                                if (AbstractC39414r.m125876U(name, "Vector", false)) {
                                    z24 = false;
                                } else {
                                    z24 = false;
                                }
                            } else {
                                z24 = false;
                            }
                            c20248c = new C20249d(iM592J7, iM641s7, f28, abstractC20252g, z24, z16, rect);
                            r110 = r111;
                        } else {
                            if (z16) {
                                z17 = false;
                            } else {
                                z17 = false;
                            }
                            c20248c = new C20248c(c0230n1.m592J(), c0230n1.m641s(), abstractC20252g.f76064c, abstractC20252g, z17, z16, rect);
                            r110 = r111;
                        }
                    }
                } else if (z15) {
                    if (z13) {
                        z25 = false;
                    } else {
                        z25 = false;
                    }
                    arrayList2 = new ArrayList();
                    if (c18030lM591I != null) {
                        objM129g = c18030lM591I.f69980w.m129g(AbstractC18029k.f69954a);
                        if (objM129g == null) {
                            objM129g = obj;
                        }
                        c18017a = (C18017a) objM129g;
                        if (c18017a != null) {
                        }
                    }
                    c23277r0 = (C23277r0) AbstractC25265s.m74100H0(arrayList2);
                    if (c23277r0 != null) {
                        c17919x = null;
                    } else {
                        c17919x = null;
                    }
                    if (c17919x == null) {
                        z26 = z15;
                        size2 = size2;
                        c17919x2 = c17919x;
                        zM124803a = false;
                    } else {
                        z26 = z15;
                        size2 = size2;
                        c17919x2 = c17919x;
                        zM124803a = false;
                    }
                    if (c23277r0 != null) {
                        c39183o = null;
                    } else {
                        c39183o = null;
                    }
                    j7 = C39183o.f168428c;
                    if (c39183o != null) {
                        zM124803a = C39183o.m124803a(c39183o.f168429a, j7);
                    }
                    if (c23277r0 != null) {
                        c17417d = null;
                    } else {
                        c17417d = null;
                    }
                    if (c17919x2 != null) {
                        numValueOf = Integer.valueOf(AbstractC17918w0.m51506H(c17919x2.f69639a) | (-16777216));
                    } else {
                        numValueOf = null;
                    }
                    c0230n1 = c0230n1;
                    r110 = r14;
                    arrayList3 = arrayList3;
                    i14 = 0;
                    c20248c = new C20251f(c17417d, numValueOf, 0, 0, c0230n1.m592J(), c0230n1.m641s(), abstractC20252g.f76064c, abstractC20252g, z25, z13, rect);
                } else {
                    size2 = size2;
                    c0230n1 = c0230n1;
                    z16 = z13;
                    arrayList3 = arrayList3;
                    r111 = r14;
                    i14 = 0;
                    i14 = 0;
                    listM583D = c0230n1.m583D();
                    size = listM583D.size();
                    i15 = 0;
                    while (true) {
                        if (i15 < size) {
                            modifier = ((C39148y0) listM583D.get(i15)).f168301a;
                            if (AbstractC39414r.m125876U(modifier.getClass().getName(), "Painter", false)) {
                                Field declaredField7 = modifier.getClass().getDeclaredField("painter");
                                declaredField7.setAccessible(true);
                                obj2 = declaredField7.get(modifier);
                                if (obj2 instanceof AbstractC26165a) {
                                    abstractC26165a = (AbstractC26165a) obj2;
                                    break;
                                }
                            } else {
                                i15++;
                            }
                        }
                        abstractC26165a = null;
                        break;
                    }
                    if (abstractC26165a != null) {
                        if (z16) {
                            z18 = false;
                        } else {
                            z18 = false;
                        }
                        int iM592J8 = c0230n1.m592J();
                        int iM641s8 = c0230n1.m641s();
                        z19 = z18;
                        float f29 = abstractC20252g.f76064c;
                        if (z19) {
                            name = abstractC26165a.getClass().getName();
                            if (AbstractC39414r.m125876U(name, "Vector", false)) {
                                z24 = false;
                            } else {
                                z24 = false;
                            }
                        } else {
                            z24 = false;
                        }
                        c20248c = new C20249d(iM592J8, iM641s8, f29, abstractC20252g, z24, z16, rect);
                        r110 = r111;
                    } else {
                        if (z16) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        c20248c = new C20248c(c0230n1.m592J(), c0230n1.m641s(), abstractC20252g.f76064c, abstractC20252g, z17, z16, rect);
                        r110 = r111;
                    }
                }
                abstractC20252g2 = c20248c;
                r15 = i14;
                r19 = r110;
            } else {
                r14 = obj3;
                r14 = obj3;
                arrayList3 = arrayList3;
                size2 = size2;
                i16 = i16;
                c0230n1 = c0230n1;
                r19 = r14;
                r15 = 0;
                abstractC20252g2 = null;
            }
            arrayList = arrayList3;
            if (abstractC20252g2 != null) {
                arrayList.add(abstractC20252g2);
                m56177b(c0230n1, abstractC20252g2, r15, abstractC18171j, interfaceC20602v0);
            }
            i16++;
            arrayList3 = arrayList;
            size2 = size2;
            r14 = r19;
        }
        r14 = obj3;
        abstractC20252g.f76068g = arrayList3;
    }
}
