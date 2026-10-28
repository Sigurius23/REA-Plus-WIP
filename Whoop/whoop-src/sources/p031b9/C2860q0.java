package p031b9;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import io.getstream.chat.android.p226ui.utils.C19902a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import mm.C25680d;
import ng3.C26702o;
import p027b3.AbstractC2351b;
import p032bc.C2953i;
import p284ko.C22631o;
import p299l9.C23487c;
import p299l9.C23488c0;
import p299l9.C23501g1;
import p299l9.C23521q;
import p299l9.InterfaceC23482a0;
import p299l9.InterfaceC23540z0;
import p318m3.C24977g;
import p361o9.C27661a;
import p361o9.C27662b;
import p361o9.C27668h;
import p361o9.C27670j;
import p361o9.C27672l;
import p361o9.C27677q;
import p361o9.C27678r;
import p361o9.C27680t;
import p361o9.C27681u;
import p361o9.C27682v;
import p361o9.InterfaceC27674n;
import p361o9.InterfaceC27679s;
import p398p9.InterfaceC28980d;
import p497t7.InterfaceC33561b;
import p516u8.AbstractC34609o0;
import p516u8.C34611p0;
import p516u8.C34613q0;
import p516u8.C34621u0;
import p516u8.C34623v0;
import p550vd.AbstractC35903f;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.AbstractC41063y;
import p690zr.C41014d0;
import p690zr.C41017e0;
import p690zr.C41041n;
import p690zr.C41050r0;
import p690zr.C41052s0;
import p690zr.C41056u0;
import p690zr.C41060w0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: b9.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2860q0 {

    /* JADX INFO: renamed from: a */
    public final Object f11353a;

    /* JADX INFO: renamed from: b */
    public final Object f11354b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC23540z0[] f11355c;

    /* JADX INFO: renamed from: d */
    public boolean f11356d;

    /* JADX INFO: renamed from: e */
    public boolean f11357e;

    /* JADX INFO: renamed from: f */
    public boolean f11358f;

    /* JADX INFO: renamed from: g */
    public C2862r0 f11359g;

    /* JADX INFO: renamed from: h */
    public boolean f11360h;

    /* JADX INFO: renamed from: i */
    public final boolean[] f11361i;

    /* JADX INFO: renamed from: j */
    public final AbstractC2829f[] f11362j;

    /* JADX INFO: renamed from: k */
    public final AbstractC2351b f11363k;

    /* JADX INFO: renamed from: l */
    public final C2819b1 f11364l;

    /* JADX INFO: renamed from: m */
    public C2860q0 f11365m;

    /* JADX INFO: renamed from: n */
    public C23501g1 f11366n;

    /* JADX INFO: renamed from: o */
    public C27682v f11367o;

    /* JADX INFO: renamed from: p */
    public long f11368p;

    public C2860q0(AbstractC2829f[] abstractC2829fArr, long j7, AbstractC2351b abstractC2351b, C22631o c22631o, C2819b1 c2819b1, C2862r0 c2862r0, C27682v c27682v) {
        this.f11362j = abstractC2829fArr;
        this.f11368p = j7;
        this.f11363k = abstractC2351b;
        this.f11364l = c2819b1;
        C23488c0 c23488c0 = c2862r0.f11371a;
        this.f11354b = c23488c0.f92976a;
        this.f11359g = c2862r0;
        this.f11366n = C23501g1.f93026d;
        this.f11367o = c27682v;
        this.f11355c = new InterfaceC23540z0[abstractC2829fArr.length];
        this.f11361i = new boolean[abstractC2829fArr.length];
        long j13 = c2862r0.f11372b;
        long j14 = c2862r0.f11374d;
        boolean z4 = c2862r0.f11376f;
        c2819b1.getClass();
        Object obj = c23488c0.f92976a;
        int i13 = C2837h1.f11189k;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        C23488c0 c23488c0M68053a = c23488c0.m68053a(pair.second);
        C2816a1 c2816a1 = (C2816a1) c2819b1.f11031d.get(obj2);
        c2816a1.getClass();
        c2819b1.f11033f.add(c2816a1);
        C2878z0 c2878z0 = (C2878z0) c2819b1.f11032e.get(c2816a1);
        if (c2878z0 != null) {
            c2878z0.f11436a.m68043d(c2878z0.f11437b);
        }
        c2816a1.f11017c.add(c23488c0M68053a);
        InterfaceC23482a0 interfaceC23482a0Mo36144a = c2816a1.f11015a.mo36144a(c23488c0M68053a, c22631o, j13);
        c2819b1.f11030c.put(interfaceC23482a0Mo36144a, c2816a1);
        c2819b1.m8027e();
        this.f11353a = j14 != -9223372036854775807L ? new C23487c(interfaceC23482a0Mo36144a, !z4, 0L, j14) : interfaceC23482a0Mo36144a;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, l9.a0] */
    /* JADX INFO: renamed from: a */
    public final long m8252a(C27682v c27682v, long j7, boolean z4, boolean[] zArr) {
        AbstractC2829f[] abstractC2829fArr;
        InterfaceC23540z0[] interfaceC23540z0Arr;
        int i13 = 0;
        while (true) {
            boolean z13 = true;
            if (i13 >= c27682v.f111437a) {
                break;
            }
            if (z4 || !c27682v.m83677a(this.f11367o, i13)) {
                z13 = false;
            }
            this.f11361i[i13] = z13;
            i13++;
        }
        int i14 = 0;
        while (true) {
            abstractC2829fArr = this.f11362j;
            int length = abstractC2829fArr.length;
            interfaceC23540z0Arr = this.f11355c;
            if (i14 >= length) {
                break;
            }
            if (abstractC2829fArr[i14].f11095x == -2) {
                interfaceC23540z0Arr[i14] = null;
            }
            i14++;
        }
        m8253b();
        this.f11367o = c27682v;
        m8254c();
        long jMo36133u = this.f11353a.mo36133u(c27682v.f111439c, this.f11361i, this.f11355c, zArr, j7);
        for (int i15 = 0; i15 < abstractC2829fArr.length; i15++) {
            if (abstractC2829fArr[i15].f11095x == -2 && this.f11367o.m83678b(i15)) {
                interfaceC23540z0Arr[i15] = new C23521q();
            }
        }
        this.f11358f = false;
        for (int i16 = 0; i16 < interfaceC23540z0Arr.length; i16++) {
            if (interfaceC23540z0Arr[i16] != null) {
                AbstractC35849g.m113807i(c27682v.m83678b(i16));
                if (abstractC2829fArr[i16].f11095x != -2) {
                    this.f11358f = true;
                }
            } else {
                AbstractC35849g.m113807i(c27682v.f111439c[i16] == null);
            }
        }
        return jMo36133u;
    }

    /* JADX INFO: renamed from: b */
    public final void m8253b() {
        if (this.f11365m != null) {
            return;
        }
        int i13 = 0;
        while (true) {
            C27682v c27682v = this.f11367o;
            if (i13 >= c27682v.f111437a) {
                return;
            }
            boolean zM83678b = c27682v.m83678b(i13);
            InterfaceC27679s interfaceC27679s = this.f11367o.f111439c[i13];
            if (zM83678b && interfaceC27679s != null) {
                interfaceC27679s.mo68069a();
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8254c() {
        if (this.f11365m != null) {
            return;
        }
        int i13 = 0;
        while (true) {
            C27682v c27682v = this.f11367o;
            if (i13 >= c27682v.f111437a) {
                return;
            }
            boolean zM83678b = c27682v.m83678b(i13);
            InterfaceC27679s interfaceC27679s = this.f11367o.f111439c[i13];
            if (zM83678b && interfaceC27679s != null) {
                interfaceC27679s.mo68070b();
            }
            i13++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l9.b1] */
    /* JADX INFO: renamed from: d */
    public final long m8255d() {
        if (!this.f11357e) {
            return this.f11359g.f11372b;
        }
        long jMo36129m = this.f11358f ? this.f11353a.mo36129m() : Long.MIN_VALUE;
        return jMo36129m == Long.MIN_VALUE ? this.f11359g.f11375e : jMo36129m;
    }

    /* JADX INFO: renamed from: e */
    public final long m8256e() {
        return this.f11359g.f11372b + this.f11368p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l9.a0] */
    /* JADX INFO: renamed from: f */
    public final void m8257f(float f13, AbstractC34609o0 abstractC34609o0, boolean z4) {
        this.f11357e = true;
        this.f11366n = this.f11353a.mo36128k();
        C27682v c27682vM8261j = m8261j(f13, abstractC34609o0, z4);
        C2862r0 c2862r0 = this.f11359g;
        long jMax = c2862r0.f11372b;
        long j7 = c2862r0.f11375e;
        if (j7 != -9223372036854775807L && jMax >= j7) {
            jMax = Math.max(0L, j7 - 1);
        }
        long jM8252a = m8252a(c27682vM8261j, jMax, false, new boolean[this.f11362j.length]);
        long j13 = this.f11368p;
        C2862r0 c2862r1 = this.f11359g;
        this.f11368p = (c2862r1.f11372b - jM8252a) + j13;
        this.f11359g = c2862r1.m8264b(jM8252a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, l9.b1] */
    /* JADX INFO: renamed from: g */
    public final boolean m8258g() {
        if (this.f11357e) {
            return !this.f11358f || this.f11353a.mo36129m() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m8259h() {
        if (this.f11357e) {
            return m8258g() || m8255d() - this.f11359g.f11372b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l9.a0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public final void m8260i() {
        m8253b();
        ?? r10 = this.f11353a;
        try {
            boolean z4 = r10 instanceof C23487c;
            C2819b1 c2819b1 = this.f11364l;
            if (z4) {
                c2819b1.m8032j(((C23487c) r10).f92972w);
            } else {
                c2819b1.m8032j(r10);
            }
        } catch (RuntimeException e5) {
            AbstractC38046a.m121813h("MediaPeriodHolder", "Period release failed.", e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:195:0x041a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r10v67 */
    /* JADX WARN: Type inference failed for: r12v26, types: [o9.r] */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29, types: [o9.h] */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o9.r[]] */
    /* JADX WARN: Type inference failed for: r6v45, types: [o9.r] */
    /* JADX WARN: Type inference failed for: r6v63, types: [o9.r] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v86 */
    /* JADX INFO: renamed from: j */
    public final C27682v m8261j(float f13, AbstractC34609o0 abstractC34609o0, boolean z4) {
        final C27670j c27670j;
        final ?? r10;
        String str;
        int[] iArr;
        C23501g1[] c23501g1Arr;
        C34611p0 c34611p0;
        Point point;
        ?? r14;
        Object languageTag;
        long j7;
        boolean z13;
        C41060w0 c41060w0M133256r;
        InterfaceC27679s c27662b;
        int i13;
        long[][] jArr;
        C34611p0 c34611p1;
        Object c27678r;
        int i14;
        C34611p0 c34611p2;
        int i15;
        CaptioningManager captioningManager;
        Locale locale;
        Pair pairM83673Q;
        Display defaultDisplay;
        int[] iArr2;
        AbstractC2351b abstractC2351b = this.f11363k;
        AbstractC2829f[] abstractC2829fArr = this.f11362j;
        C23501g1 c23501g1 = this.f11366n;
        abstractC2351b.getClass();
        int i16 = 1;
        int[] iArr3 = new int[abstractC2829fArr.length + 1];
        int length = abstractC2829fArr.length + 1;
        C34611p0[][] c34611p0Arr = new C34611p0[length][];
        int[][][] iArr4 = new int[abstractC2829fArr.length + 1][][];
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = c23501g1.f93027a;
            c34611p0Arr[i17] = new C34611p0[i18];
            iArr4[i17] = new int[i18][];
        }
        int length2 = abstractC2829fArr.length;
        final int[] iArr5 = new int[length2];
        for (int i19 = 0; i19 < length2; i19++) {
            iArr5[i19] = abstractC2829fArr[i19].mo8058B();
        }
        int i24 = 0;
        while (i24 < c23501g1.f93027a) {
            C34611p0 c34611p0M68058a = c23501g1.m68058a(i24);
            int i25 = c34611p0M68058a.f145798c == 5 ? i16 : 0;
            int length3 = abstractC2829fArr.length;
            int i26 = i16;
            int i27 = 0;
            int i28 = 0;
            while (i27 < abstractC2829fArr.length) {
                AbstractC2829f abstractC2829f = abstractC2829fArr[i27];
                AbstractC2351b abstractC2351b2 = abstractC2351b;
                C23501g1 c23501g2 = c23501g1;
                int i29 = i16;
                int iMax = 0;
                for (int i34 = 0; i34 < c34611p0M68058a.f145796a; i34++) {
                    iMax = Math.max(iMax, abstractC2829f.mo8057A(c34611p0M68058a.f145799d[i34]) & 7);
                }
                int i35 = iArr3[i27] == 0 ? i29 : 0;
                if (iMax > i28 || (iMax == i28 && i25 != 0 && i26 == 0 && i35 != 0)) {
                    i28 = iMax;
                    i26 = i35;
                    length3 = i27;
                }
                i27++;
                i16 = i29;
                abstractC2351b = abstractC2351b2;
                c23501g1 = c23501g2;
            }
            AbstractC2351b abstractC2351b3 = abstractC2351b;
            C23501g1 c23501g3 = c23501g1;
            int i36 = i16;
            if (length3 == abstractC2829fArr.length) {
                iArr2 = new int[c34611p0M68058a.f145796a];
            } else {
                AbstractC2829f abstractC2829f2 = abstractC2829fArr[length3];
                int[] iArr6 = new int[c34611p0M68058a.f145796a];
                for (int i37 = 0; i37 < c34611p0M68058a.f145796a; i37++) {
                    iArr6[i37] = abstractC2829f2.mo8057A(c34611p0M68058a.f145799d[i37]);
                }
                iArr2 = iArr6;
            }
            int i38 = iArr3[length3];
            c34611p0Arr[length3][i38] = c34611p0M68058a;
            iArr4[length3][i38] = iArr2;
            iArr3[length3] = i38 + 1;
            i24++;
            i16 = i36;
            abstractC2351b = abstractC2351b3;
            c23501g1 = c23501g3;
        }
        AbstractC2351b abstractC2351b4 = abstractC2351b;
        int i39 = i16;
        C23501g1[] c23501g1Arr2 = new C23501g1[abstractC2829fArr.length];
        String[] strArr = new String[abstractC2829fArr.length];
        int[] iArr7 = new int[abstractC2829fArr.length];
        for (int i44 = 0; i44 < abstractC2829fArr.length; i44++) {
            int i45 = iArr3[i44];
            c23501g1Arr2[i44] = new C23501g1((C34611p0[]) AbstractC38065t.m121898L(i45, c34611p0Arr[i44]));
            iArr4[i44] = (int[][]) AbstractC38065t.m121898L(i45, iArr4[i44]);
            strArr[i44] = abstractC2829fArr[i44].mo8062j();
            iArr7[i44] = abstractC2829fArr[i44].f11095x;
        }
        C27681u c27681u = new C27681u(iArr7, c23501g1Arr2, iArr5, iArr4, new C23501g1((C34611p0[]) AbstractC38065t.m121898L(iArr3[abstractC2829fArr.length], c34611p0Arr[abstractC2829fArr.length])));
        final C27677q c27677q = (C27677q) abstractC2351b4;
        synchronized (c27677q.f111423d) {
            c27670j = c27677q.f111426g;
        }
        if (c27670j.f111384y && AbstractC38065t.f163031a >= 32 && c27677q.f111427h == null) {
            c27677q.f111427h = new C27672l(c27677q.f111424e, c27677q);
        }
        int i46 = c27681u.f111431a;
        Context context = c27677q.f111424e;
        ?? r15 = new C27678r[i46];
        int i47 = 0;
        while (true) {
            if (i47 >= c27681u.f111431a) {
                r10 = 0;
                break;
            }
            if (2 == iArr7[i47] && c23501g1Arr2[i47].f93027a > 0) {
                r10 = i39;
                break;
            }
            i47++;
        }
        Pair pairM83673Q2 = C27677q.m83673Q(i39, c27681u, iArr4, new InterfaceC27674n() { // from class: o9.d
            @Override // p361o9.InterfaceC27674n
            /* JADX INFO: renamed from: c */
            public final C41060w0 mo8620c(int i48, C34611p0 c34611p3, int[] iArr8) {
                C27677q c27677q2 = c27677q;
                c27677q2.getClass();
                C27670j c27670j2 = c27670j;
                C27665e c27665e = new C27665e(c27677q2, c27670j2);
                int i49 = iArr5[i48];
                C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
                for (int i54 = 0; i54 < c34611p3.f145796a; i54++) {
                    c41014d0M133251l.m133222a(new C27666f(i48, c34611p3, i54, c27670j2, iArr8[i54], r10, c27665e, i49));
                }
                return c41014d0M133251l.m133239f();
            }
        }, new C24977g(8));
        if (pairM83673Q2 != null) {
            r15[((Integer) pairM83673Q2.second).intValue()] = (C27678r) pairM83673Q2.first;
        }
        if (pairM83673Q2 == null) {
            str = null;
        } else {
            C27678r c27678r2 = (C27678r) pairM83673Q2.first;
            str = c27678r2.f111429a.f145799d[c27678r2.f111430b[0]].f145773d;
        }
        c27670j.f145846o.getClass();
        if (!c27670j.f145838g || context == null) {
            iArr = iArr7;
            c23501g1Arr = c23501g1Arr2;
            c34611p0 = null;
            point = null;
        } else {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                c34611p0 = null;
                defaultDisplay = displayManager.getDisplay(0);
            } else {
                c34611p0 = null;
                defaultDisplay = null;
            }
            if (defaultDisplay == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.getClass();
                defaultDisplay = windowManager.getDefaultDisplay();
            }
            int i48 = AbstractC38065t.f163031a;
            if (defaultDisplay.getDisplayId() == 0 && AbstractC38065t.m121895I(context)) {
                String strM121933z = i48 < 28 ? AbstractC38065t.m121933z("sys.display-size") : AbstractC38065t.m121933z("vendor.display-size");
                if (TextUtils.isEmpty(strM121933z)) {
                    iArr = iArr7;
                    c23501g1Arr = c23501g1Arr2;
                } else {
                    try {
                        iArr = iArr7;
                        c23501g1Arr = c23501g1Arr2;
                        try {
                            String[] strArrSplit = strM121933z.trim().split("x", -1);
                            if (strArrSplit.length == 2) {
                                int i49 = Integer.parseInt(strArrSplit[0]);
                                int i54 = Integer.parseInt(strArrSplit[1]);
                                if (i49 > 0 && i54 > 0) {
                                    point = new Point(i49, i54);
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } catch (NumberFormatException unused2) {
                        iArr = iArr7;
                        c23501g1Arr = c23501g1Arr2;
                    }
                    AbstractC38046a.m121812g("Util", "Invalid display size: " + strM121933z);
                }
                if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    point = new Point(3840, 2160);
                }
            } else {
                iArr = iArr7;
                c23501g1Arr = c23501g1Arr2;
            }
            Point point2 = new Point();
            if (i48 >= 23) {
                Display.Mode mode = defaultDisplay.getMode();
                point2.x = mode.getPhysicalWidth();
                point2.y = mode.getPhysicalHeight();
            } else {
                defaultDisplay.getRealSize(point2);
            }
            point = point2;
        }
        Pair pairM83673Q3 = C27677q.m83673Q(2, c27681u, iArr4, new C19902a(c27670j, str, iArr5, point), new C24977g(7));
        int i55 = 4;
        if (pairM83673Q3 == null) {
            pairM83673Q = C27677q.m83673Q(4, c27681u, iArr4, new C25680d(c27670j, 12), new C24977g(6));
        } else {
            r14 = c34611p0;
        }
        if (r14 != 0) {
            r14 = pairM83673Q;
            r15[((Integer) ((Pair) r14).second).intValue()] = (C27678r) ((Pair) r14).first;
        } else if (pairM83673Q3 != null) {
            r15[((Integer) pairM83673Q3.second).intValue()] = (C27678r) pairM83673Q3.first;
        }
        if (!c27670j.f145848q || context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = c34611p0;
        } else {
            int i56 = AbstractC38065t.f163031a;
            languageTag = locale.toLanguageTag();
        }
        int i57 = 3;
        Pair pairM83673Q4 = C27677q.m83673Q(3, c27681u, iArr4, new C2953i(c27670j, str, languageTag, 14), new C24977g(9));
        if (pairM83673Q4 != null) {
            r15[((Integer) pairM83673Q4.second).intValue()] = (C27678r) pairM83673Q4.first;
        }
        int i58 = 0;
        while (i58 < i46) {
            int i59 = iArr[i58];
            if (i59 == 2 || i59 == 1 || i59 == i57 || i59 == i55) {
                i14 = i58;
            } else {
                C23501g1 c23501g4 = c23501g1Arr[i58];
                int[][] iArr8 = iArr4[i58];
                C34611p0 c34611p3 = c34611p0;
                ?? r16 = c34611p3;
                int i64 = 0;
                int i65 = 0;
                while (i64 < c23501g4.f93027a) {
                    C34611p0 c34611p0M68058a2 = c23501g4.m68058a(i64);
                    int[] iArr9 = iArr8[i64];
                    int i66 = i58;
                    int i67 = 0;
                    ?? r17 = r16;
                    while (i67 < c34611p0M68058a2.f145796a) {
                        C23501g1 c23501g5 = c23501g4;
                        if (AbstractC2829f.m8056m(iArr9[i67], c27670j.f111385z)) {
                            c34611p2 = c34611p0M68058a2;
                            C27668h c27668h = new C27668h(c34611p0M68058a2.f145799d[i67], iArr9[i67]);
                            if (r17 != 0) {
                                i15 = i67;
                                if (AbstractC41063y.f177072a.mo133310c(c27668h.f111366x, r17.f111366x).mo133310c(c27668h.f111365w, r17.f111365w).mo133312e() > 0) {
                                }
                            } else {
                                i15 = i67;
                            }
                            r17 = c27668h;
                            c34611p3 = c34611p2;
                            i65 = i15;
                        } else {
                            c34611p2 = c34611p0M68058a2;
                            i15 = i67;
                        }
                        i67 = i15 + 1;
                        c23501g4 = c23501g5;
                        c34611p0M68058a2 = c34611p2;
                        r17 = r17;
                    }
                    i64++;
                    i58 = i66;
                    r16 = r17;
                }
                i14 = i58;
                r15[i14] = c34611p3 == null ? c34611p0 : new C27678r(0, c34611p3, new int[]{i65});
            }
            i58 = i14 + 1;
            i57 = 3;
            i55 = 4;
        }
        int i68 = c27681u.f111431a;
        C23501g1[] c23501g1Arr3 = c27681u.f111433c;
        HashMap map = new HashMap();
        for (int i69 = 0; i69 < i68; i69++) {
            C27677q.m83670L(c23501g1Arr3[i69], c27670j, map);
        }
        C27677q.m83670L(c27681u.f111436f, c27670j, map);
        for (int i74 = 0; i74 < i68; i74++) {
            C34613q0 c34613q0 = (C34613q0) map.get(Integer.valueOf(c27681u.f111432b[i74]));
            if (c34613q0 != null) {
                C34611p0 c34611p4 = c34613q0.f145803a;
                AbstractC41023g0 abstractC41023g0 = c34613q0.f145804b;
                if (abstractC41023g0.isEmpty()) {
                    c27678r = c34611p0;
                } else {
                    int iIndexOf = c23501g1Arr3[i74].f93028b.indexOf(c34611p4);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        c27678r = new C27678r(0, c34611p4, AbstractC35903f.m113999S(abstractC41023g0));
                    } else {
                        c27678r = c34611p0;
                    }
                }
                r15[i74] = c27678r;
            }
        }
        int i75 = c27681u.f111431a;
        for (int i76 = 0; i76 < i75; i76++) {
            C23501g1 c23501g6 = c27681u.f111433c[i76];
            Map map2 = (Map) c27670j.f111378B.get(i76);
            if (map2 != null && map2.containsKey(c23501g6)) {
                Map map3 = (Map) c27670j.f111378B.get(i76);
                if (map3 != null && map3.get(c23501g6) != null) {
                    throw new ClassCastException();
                }
                r15[i76] = c34611p0;
            }
        }
        for (int i77 = 0; i77 < i46; i77++) {
            int i78 = c27681u.f111432b[i77];
            if (c27670j.f111379C.get(i77) || c27670j.f145851t.contains(Integer.valueOf(i78))) {
                r15[i77] = c34611p0;
            }
        }
        C26702o c26702o = c27677q.f111425f;
        InterfaceC28980d interfaceC28980d = (InterfaceC28980d) c27677q.f9292c;
        AbstractC35849g.m113808j(interfaceC28980d);
        c26702o.getClass();
        ArrayList arrayList = new ArrayList();
        int i79 = 0;
        while (i79 < r15.length) {
            ?? r18 = r15[i79];
            if (r18 == 0 || r18.f111430b.length <= 1) {
                c34611p1 = c34611p0;
                arrayList.add(c34611p1);
            } else {
                C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
                c41014d0M133251l.m133222a(new C27661a(0L, 0L));
                arrayList.add(c41014d0M133251l);
                c34611p1 = c34611p0;
            }
            i79++;
            c34611p0 = c34611p1;
        }
        int length4 = r15.length;
        long[][] jArr2 = new long[length4][];
        int i83 = 0;
        while (true) {
            j7 = -1;
            if (i83 >= r15.length) {
                break;
            }
            ?? r19 = r15[i83];
            if (r19 == 0) {
                jArr2[i83] = new long[0];
            } else {
                int[] iArr10 = r19.f111430b;
                jArr2[i83] = new long[iArr10.length];
                for (int i84 = 0; i84 < iArr10.length; i84++) {
                    long j13 = r19.f111429a.f145799d[iArr10[i84]].f145779j;
                    long[] jArr3 = jArr2[i83];
                    if (j13 == -1) {
                        j13 = 0;
                    }
                    jArr3[i84] = j13;
                }
                Arrays.sort(jArr2[i83]);
            }
            i83++;
        }
        int[] iArr11 = new int[length4];
        long[] jArr4 = new long[length4];
        for (int i85 = 0; i85 < length4; i85++) {
            long[] jArr5 = jArr2[i85];
            jArr4[i85] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        C27662b.m83656v(arrayList, jArr4);
        AbstractC41047q.m133273c(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(C41056u0.f177063x);
        C41050r0 c41050r0 = new C41050r0();
        C41052s0 c41052s0 = new C41052s0(treeMap);
        c41052s0.f177048F = c41050r0;
        int i86 = 0;
        while (i86 < length4) {
            long[] jArr6 = jArr2[i86];
            long j14 = j7;
            if (jArr6.length <= 1) {
                i13 = length4;
                jArr = jArr2;
            } else {
                int length5 = jArr6.length;
                double[] dArr = new double[length5];
                int i87 = 0;
                while (true) {
                    long[] jArr7 = jArr2[i86];
                    i13 = length4;
                    double dLog = 0.0d;
                    if (i87 >= jArr7.length) {
                        break;
                    }
                    long[][] jArr8 = jArr2;
                    int i88 = length5;
                    long j15 = jArr7[i87];
                    if (j15 != j14) {
                        dLog = Math.log(j15);
                    }
                    dArr[i87] = dLog;
                    i87++;
                    jArr2 = jArr8;
                    length4 = i13;
                    length5 = i88;
                }
                long[][] jArr9 = jArr2;
                int i89 = length5 - 1;
                double d3 = dArr[i89] - dArr[0];
                int i94 = 0;
                while (i94 < i89) {
                    double d14 = dArr[i94];
                    i94++;
                    long[][] jArr10 = jArr9;
                    c41052s0.m133293d(Double.valueOf(d3 == 0.0d ? 1.0d : (((d14 + dArr[i94]) * 0.5d) - dArr[0]) / d3), Integer.valueOf(i86));
                    iArr11 = iArr11;
                    jArr9 = jArr10;
                }
                jArr = jArr9;
            }
            i86++;
            length4 = i13;
            j7 = j14;
            iArr11 = iArr11;
            jArr2 = jArr;
        }
        int[] iArr12 = iArr11;
        long[][] jArr11 = jArr2;
        C41041n c41041n = c41052s0.f177030x;
        if (c41041n == null) {
            c41041n = new C41041n(0, c41052s0);
            c41052s0.f177030x = c41041n;
        }
        AbstractC41023g0 abstractC41023g0M133252m = AbstractC41023g0.m133252m(c41041n);
        for (int i95 = 0; i95 < abstractC41023g0M133252m.size(); i95++) {
            int iIntValue = ((Integer) abstractC41023g0M133252m.get(i95)).intValue();
            int i96 = iArr12[iIntValue] + 1;
            iArr12[iIntValue] = i96;
            jArr4[iIntValue] = jArr11[iIntValue][i96];
            C27662b.m83656v(arrayList, jArr4);
        }
        for (int i97 = 0; i97 < r15.length; i97++) {
            if (arrayList.get(i97) != null) {
                jArr4[i97] = jArr4[i97] * 2;
            }
        }
        C27662b.m83656v(arrayList, jArr4);
        C41014d0 c41014d0M133251l2 = AbstractC41023g0.m133251l();
        for (int i98 = 0; i98 < arrayList.size(); i98++) {
            C41014d0 c41014d0 = (C41014d0) arrayList.get(i98);
            c41014d0M133251l2.m133222a(c41014d0 == null ? C41060w0.f177067E : c41014d0.m133239f());
        }
        C41060w0 c41060w0M133239f = c41014d0M133251l2.m133239f();
        InterfaceC27679s[] interfaceC27679sArr = new InterfaceC27679s[r15.length];
        for (int i99 = 0; i99 < r15.length; i99++) {
            ?? r24 = r15[i99];
            if (r24 != 0) {
                int[] iArr13 = r24.f111430b;
                if (iArr13.length != 0) {
                    if (iArr13.length == 1) {
                        c27662b = new C27680t(r24.f111429a, new int[]{iArr13[0]});
                    } else {
                        long j16 = 25000;
                        c27662b = new C27662b(r24.f111429a, iArr13, interfaceC28980d, InterfaceC33561b.INVALID_OWNERSHIP, j16, j16, (AbstractC41023g0) c41060w0M133239f.get(i99));
                    }
                    interfaceC27679sArr[i99] = c27662b;
                }
            }
        }
        C2840i1[] c2840i1Arr = new C2840i1[i46];
        for (int i100 = 0; i100 < i46; i100++) {
            c2840i1Arr[i100] = (c27670j.f111379C.get(i100) || c27670j.f145851t.contains(Integer.valueOf(c27681u.f111432b[i100])) || (c27681u.f111432b[i100] != -2 && interfaceC27679sArr[i100] == null)) ? null : C2840i1.f11218c;
        }
        c27670j.f145846o.getClass();
        Pair pairCreate = Pair.create(c2840i1Arr, interfaceC27679sArr);
        InterfaceC27679s[] interfaceC27679sArr2 = (InterfaceC27679s[]) pairCreate.second;
        List[] listArr = new List[interfaceC27679sArr2.length];
        for (int i101 = 0; i101 < interfaceC27679sArr2.length; i101++) {
            InterfaceC27679s interfaceC27679s = interfaceC27679sArr2[i101];
            if (interfaceC27679s != null) {
                c41060w0M133256r = AbstractC41023g0.m133256r(interfaceC27679s);
            } else {
                C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                c41060w0M133256r = C41060w0.f177067E;
            }
            listArr[i101] = c41060w0M133256r;
        }
        C41014d0 c41014d1 = new C41014d0(4);
        int i102 = 0;
        while (true) {
            int i103 = c27681u.f111431a;
            C23501g1[] c23501g1Arr4 = c27681u.f111433c;
            if (i102 >= i103) {
                break;
            }
            C23501g1 c23501g7 = c23501g1Arr4[i102];
            List list = listArr[i102];
            int i104 = 0;
            while (i104 < c23501g7.f93027a) {
                C34611p0 c34611p0M68058a3 = c23501g7.m68058a(i104);
                int i105 = c23501g1Arr4[i102].m68058a(i104).f145796a;
                int[] iArr14 = new int[i105];
                int i106 = 0;
                int i107 = 0;
                while (i106 < i105) {
                    List[] listArr2 = listArr;
                    if ((c27681u.f111435e[i102][i104][i106] & 7) == 4) {
                        iArr14[i107] = i106;
                        i107++;
                    }
                    i106++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr14, i107);
                C23501g1 c23501g8 = c23501g7;
                int iMin = 16;
                String str2 = null;
                int i108 = 0;
                boolean z14 = false;
                int i109 = 0;
                while (i108 < iArrCopyOf.length) {
                    String str3 = c23501g1Arr4[i102].m68058a(i104).f145799d[iArrCopyOf[i108]].f145783n;
                    int i110 = i109 + 1;
                    if (i109 == 0) {
                        str2 = str3;
                    } else {
                        z14 = (!Objects.equals(str2, str3)) | z14;
                    }
                    iMin = Math.min(iMin, c27681u.f111435e[i102][i104][i108] & 24);
                    i108++;
                    i109 = i110;
                }
                if (z14) {
                    iMin = Math.min(iMin, c27681u.f111434d[i102]);
                }
                boolean z15 = iMin != 0;
                int i111 = c34611p0M68058a3.f145796a;
                int[] iArr15 = new int[i111];
                boolean[] zArr = new boolean[i111];
                for (int i112 = 0; i112 < c34611p0M68058a3.f145796a; i112++) {
                    iArr15[i112] = c27681u.f111435e[i102][i104][i112] & 7;
                    int i113 = 0;
                    while (true) {
                        if (i113 >= list.size()) {
                            z13 = false;
                            break;
                        }
                        InterfaceC27679s interfaceC27679s2 = (InterfaceC27679s) list.get(i113);
                        if (interfaceC27679s2.mo68078j().equals(c34611p0M68058a3) && interfaceC27679s2.mo68077i(i112) != -1) {
                            z13 = true;
                            break;
                        }
                        i113++;
                    }
                    zArr[i112] = z13;
                }
                c41014d1.m133222a(new C34621u0(c34611p0M68058a3, z15, iArr15, zArr));
                i104++;
                c23501g7 = c23501g8;
                listArr = listArr3;
            }
            i102++;
        }
        C23501g1 c23501g9 = c27681u.f111436f;
        for (int i114 = 0; i114 < c23501g9.f93027a; i114++) {
            C34611p0 c34611p0M68058a4 = c23501g9.m68058a(i114);
            int[] iArr16 = new int[c34611p0M68058a4.f145796a];
            Arrays.fill(iArr16, 0);
            c41014d1.m133222a(new C34621u0(c34611p0M68058a4, false, iArr16, new boolean[c34611p0M68058a4.f145796a]));
        }
        C27682v c27682v = new C27682v((C2840i1[]) pairCreate.first, (InterfaceC27679s[]) pairCreate.second, new C34623v0(c41014d1.m133239f()), c27681u);
        for (int i115 = 0; i115 < c27682v.f111437a; i115++) {
            if (c27682v.m83678b(i115)) {
                AbstractC35849g.m113807i(c27682v.f111439c[i115] != null || this.f11362j[i115].f11095x == -2);
            } else {
                AbstractC35849g.m113807i(c27682v.f111439c[i115] == null);
            }
        }
        for (InterfaceC27679s interfaceC27679s3 : c27682v.f111439c) {
            if (interfaceC27679s3 != null) {
                interfaceC27679s3.mo68074f(f13);
                interfaceC27679s3.mo68079k(z4);
            }
        }
        return c27682v;
    }

    /* JADX INFO: renamed from: k */
    public final void m8262k() {
        Object obj = this.f11353a;
        if (obj instanceof C23487c) {
            long j7 = this.f11359g.f11374d;
            if (j7 == -9223372036854775807L) {
                j7 = Long.MIN_VALUE;
            }
            C23487c c23487c = (C23487c) obj;
            c23487c.f92969E = 0L;
            c23487c.f92970F = j7;
        }
    }
}
