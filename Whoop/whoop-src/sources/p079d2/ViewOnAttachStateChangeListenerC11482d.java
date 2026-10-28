package p079d2;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.RunnableC1645z0;
import androidx.room.C1833u0;
import c93.InterfaceC4351m;
import dc3.C11923h;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import p002a0.AbstractC0050s;
import p002a0.AbstractC0052t;
import p002a0.C0023g0;
import p002a0.C0057v0;
import p005a3.C0231n1;
import p006a4.AbstractC0355b;
import p026b2.C2312r;
import p027b3.AbstractC2417o0;
import p027b3.C2459w2;
import p031b9.AbstractC2875y;
import p037bu.C3632c;
import p107e3.C12600a;
import p181h2.C16618c;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18037s;
import p209i3.AbstractC18039u;
import p209i3.C18017a;
import p209i3.C18027i;
import p209i3.C18030l;
import p209i3.C18034p;
import p209i3.C18035q;
import p209i3.C18043y;
import p294l3.C23254g;
import p294l3.C23275q0;
import p294l3.C23277r0;
import p294l3.C23285v0;
import p636y3.C39183o;
import p636y3.InterfaceC39171c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: d2.d */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC11482d implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: J */
    public C0023g0 f36904J;

    /* JADX INFO: renamed from: K */
    public long f36905K;

    /* JADX INFO: renamed from: L */
    public final C0023g0 f36906L;

    /* JADX INFO: renamed from: M */
    public C2459w2 f36907M;

    /* JADX INFO: renamed from: N */
    public boolean f36908N;

    /* JADX INFO: renamed from: O */
    public final RunnableC1645z0 f36909O;

    /* JADX INFO: renamed from: w */
    public final AndroidComposeView f36910w;

    /* JADX INFO: renamed from: x */
    public final C1833u0 f36911x;

    /* JADX INFO: renamed from: y */
    public C12600a f36912y;

    /* JADX INFO: renamed from: z */
    public final ArrayList f36913z = new ArrayList();

    /* JADX INFO: renamed from: E */
    public final long f36899E = 100;

    /* JADX INFO: renamed from: F */
    public EnumC11479a f36900F = EnumC11479a.f36892w;

    /* JADX INFO: renamed from: G */
    public boolean f36901G = true;

    /* JADX INFO: renamed from: H */
    public final C11923h f36902H = AbstractC30060g.m92111d(1, 6, null);

    /* JADX INFO: renamed from: I */
    public final Handler f36903I = new Handler(Looper.getMainLooper());

    public ViewOnAttachStateChangeListenerC11482d(AndroidComposeView androidComposeView, C1833u0 c1833u0) {
        this.f36910w = androidComposeView;
        this.f36911x = c1833u0;
        C0023g0 c0023g0 = AbstractC0052t.f161a;
        AbstractC22676k.m65748h(c0023g0, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f36904J = c0023g0;
        this.f36906L = new C0023g0();
        C18034p c18034pM51794a = androidComposeView.getSemanticsOwner().m51794a();
        AbstractC22676k.m65748h(c0023g0, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f36907M = new C2459w2(c18034pM51794a, c0023g0);
        this.f36909O = new RunnableC1645z0(this, 4);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[PHI: r2
      0x0047: PHI (r2v3 dc3.c) = (r2v1 dc3.c), (r2v2 dc3.c), (r2v5 dc3.c) binds: [B:16:0x003a, B:29:0x007d, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[PHI: r2 r8
      0x0052: PHI (r2v2 dc3.c) = (r2v3 dc3.c), (r2v4 dc3.c) binds: [B:18:0x004f, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r8v3 java.lang.Object) = (r8v11 java.lang.Object), (r8v1 java.lang.Object) binds: [B:18:0x004f, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:17:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m30896a(s83.AbstractC32269c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p079d2.C11481c
            if (r0 == 0) goto L13
            r0 = r8
            d2.c r0 = (p079d2.C11481c) r0
            int r1 = r0.f36898z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36898z = r1
            goto L18
        L13:
            d2.c r0 = new d2.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f36896x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f36898z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dc3.c r2 = r0.f36895w
            p505ts.AbstractC34132o.m107864I(r8)
            goto L47
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            dc3.c r2 = r0.f36895w
            p505ts.AbstractC34132o.m107864I(r8)
            goto L52
        L3a:
            p505ts.AbstractC34132o.m107864I(r8)
            dc3.h r8 = r7.f36902H
            r8.getClass()
            dc3.c r2 = new dc3.c
            r2.<init>(r8)
        L47:
            r0.f36895w = r2
            r0.f36898z = r4
            java.lang.Object r8 = r2.m32187a(r0)
            if (r8 != r1) goto L52
            goto L7f
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L80
            r2.m32188c()
            boolean r8 = r7.m30900e()
            if (r8 == 0) goto L66
            r7.m30901f()
        L66:
            boolean r8 = r7.f36908N
            if (r8 != 0) goto L73
            r7.f36908N = r4
            android.os.Handler r8 = r7.f36903I
            androidx.lifecycle.z0 r5 = r7.f36909O
            r8.post(r5)
        L73:
            r0.f36895w = r2
            r0.f36898z = r3
            long r5 = r7.f36899E
            java.lang.Object r8 = bc3.AbstractC3034m0.m8782b(r5, r0)
            if (r8 != r1) goto L47
        L7f:
            return r1
        L80:
            l83.a0 r8 = l83.C23454a0.f92919a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p079d2.ViewOnAttachStateChangeListenerC11482d.m30896a(s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9 A[LOOP:2: B:21:0x006f->B:39:0x00c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0164 A[LOOP:4: B:45:0x00e9->B:70:0x0164, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x00d2 A[EDGE_INSN: B:90:0x00d2->B:41:0x00d2 BREAK  A[LOOP:2: B:21:0x006f->B:39:0x00c9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x016b A[EDGE_INSN: B:96:0x016b->B:71:0x016b BREAK  A[LOOP:4: B:45:0x00e9->B:70:0x0164], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m30897b(AbstractC0050s abstractC0050s) {
        int[] iArr;
        int[] iArr2;
        long j7;
        char c3;
        long j13;
        int i13;
        int i14;
        long j14;
        long j15;
        AbstractC0050s abstractC0050s2 = abstractC0050s;
        int[] iArr3 = abstractC0050s2.f149b;
        long[] jArr = abstractC0050s2.f148a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j16 = jArr[i15];
            char c7 = 7;
            long j17 = -9187201950435737472L;
            if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8;
                int i17 = 8 - ((~(i15 - length)) >>> 31);
                int i18 = 0;
                while (i18 < i17) {
                    if ((j16 & 255) < 128) {
                        int i19 = iArr3[(i15 << 3) + i18];
                        c3 = c7;
                        C2459w2 c2459w2 = (C2459w2) this.f36906L.m121b(i19);
                        C18035q c18035q = (C18035q) abstractC0050s2.m121b(i19);
                        C18034p c18034p = c18035q != null ? c18035q.f69993a : null;
                        if (c18034p == null) {
                            throw AbstractC2875y.m8310w("no value for specified key");
                        }
                        j13 = j17;
                        int i24 = c18034p.f69992g;
                        C18030l c18030l = c18034p.f69989d;
                        if (c2459w2 == null) {
                            C0057v0 c0057v0 = c18030l.f69980w;
                            Object[] objArr = c0057v0.f171b;
                            long[] jArr2 = c0057v0.f170a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i25 = i16;
                                int i26 = 0;
                                while (true) {
                                    long j18 = jArr2[i26];
                                    j7 = j16;
                                    if ((((~j18) << c3) & j18 & j13) != j13) {
                                        int i27 = 8 - ((~(i26 - length2)) >>> 31);
                                        for (int i28 = 0; i28 < i27; i28++) {
                                            if ((j18 & 255) < 128) {
                                                j15 = j18;
                                                C18043y c18043y = (C18043y) objArr[(i26 << 3) + i28];
                                                C18043y c18043y2 = AbstractC18039u.f70034a;
                                                C18043y c18043y3 = AbstractC18039u.f70019A;
                                                if (AbstractC22676k.m65745e(c18043y, c18043y3)) {
                                                    List list = (List) AbstractC18037s.m51799d(c18030l, c18043y3);
                                                    m30903j(i24, String.valueOf(list != null ? (C23254g) AbstractC25265s.m74100H0(list) : null));
                                                }
                                            } else {
                                                j15 = j18;
                                            }
                                            j18 = j15 >> i25;
                                        }
                                        if (i27 != i25) {
                                            break;
                                        }
                                        if (i26 != length2) {
                                            break;
                                        }
                                        i26++;
                                        j16 = j7;
                                        i25 = 8;
                                    } else if (i26 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i26++;
                                        j16 = j7;
                                        i25 = 8;
                                    }
                                }
                            } else {
                                j7 = j16;
                            }
                        } else {
                            iArr2 = iArr3;
                            j7 = j16;
                            C0057v0 c0057v1 = c18030l.f69980w;
                            Object[] objArr2 = c0057v1.f171b;
                            long[] jArr3 = c0057v1.f170a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i29 = 0;
                                while (true) {
                                    long j19 = jArr4[i29];
                                    long[] jArr5 = jArr4;
                                    i13 = i18;
                                    if ((((~j19) << c3) & j19 & j13) != j13) {
                                        int i34 = 8 - ((~(i29 - length3)) >>> 31);
                                        int i35 = 0;
                                        while (i35 < i34) {
                                            if ((j19 & 255) < 128) {
                                                j14 = j19;
                                                C18043y c18043y4 = (C18043y) objArr2[(i29 << 3) + i35];
                                                C18043y c18043y5 = AbstractC18039u.f70034a;
                                                C18043y c18043y6 = AbstractC18039u.f70019A;
                                                if (AbstractC22676k.m65745e(c18043y4, c18043y6)) {
                                                    List list2 = (List) AbstractC18037s.m51799d(c2459w2.f9601a, c18043y6);
                                                    C23254g c23254g = list2 != null ? (C23254g) AbstractC25265s.m74100H0(list2) : null;
                                                    List list3 = (List) AbstractC18037s.m51799d(c18030l, c18043y6);
                                                    C23254g c23254g2 = list3 != null ? (C23254g) AbstractC25265s.m74100H0(list3) : null;
                                                    if (!AbstractC22676k.m65745e(c23254g, c23254g2)) {
                                                        m30903j(i24, String.valueOf(c23254g2));
                                                    }
                                                }
                                            } else {
                                                j14 = j19;
                                            }
                                            i35++;
                                            j19 = j14 >> 8;
                                        }
                                        if (i34 != 8) {
                                            break;
                                        }
                                        if (i29 != length3) {
                                            break;
                                        }
                                        i29++;
                                        i18 = i13;
                                        jArr4 = jArr5;
                                    } else if (i29 != length3) {
                                        break;
                                        break;
                                    } else {
                                        i29++;
                                        i18 = i13;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i14 = 8;
                        }
                        i13 = i18;
                        i14 = 8;
                    } else {
                        iArr2 = iArr3;
                        j7 = j16;
                        c3 = c7;
                        j13 = j17;
                        i13 = i18;
                        i14 = i16;
                    }
                    j16 = j7 >> i14;
                    i18 = i13 + 1;
                    i16 = i14;
                    c7 = c3;
                    j17 = j13;
                    iArr3 = iArr2;
                    abstractC0050s2 = abstractC0050s;
                }
                iArr = iArr3;
                if (i17 != i16) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i15 == length) {
                return;
            }
            i15++;
            abstractC0050s2 = abstractC0050s;
            iArr3 = iArr;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m30898c(C18034p c18034p, InterfaceC4351m interfaceC4351m) {
        c18034p.getClass();
        List listM51776j = C18034p.m51776j(4, c18034p);
        int size = listM51776j.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = listM51776j.get(i14);
            if (m30899d().m120a(((C18034p) obj).f69992g)) {
                interfaceC4351m.invoke(Integer.valueOf(i13), obj);
                i13++;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0050s m30899d() {
        if (this.f36901G) {
            this.f36901G = false;
            this.f36904J = AbstractC18037s.m51797b(this.f36910w.getSemanticsOwner());
            this.f36905K = System.currentTimeMillis();
        }
        return this.f36904J;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m30900e() {
        return this.f36912y != null;
    }

    /* JADX INFO: renamed from: f */
    public final void m30901f() {
        C12600a c12600a = this.f36912y;
        if (c12600a != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f36913z;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                C11483e c11483e = (C11483e) arrayList.get(i13);
                int iOrdinal = c11483e.f36916c.ordinal();
                if (iOrdinal == 0) {
                    C3632c c3632c = c11483e.f36917d;
                    if (c3632c != null) {
                        c12600a.m35311d((ViewStructure) c3632c.f14788w);
                    }
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AutofillId autofillIdM35309b = c12600a.m35309b(c11483e.f36914a);
                    if (autofillIdM35309b != null) {
                        c12600a.m35312e(autofillIdM35309b);
                    }
                }
            }
            c12600a.m35308a();
            arrayList.clear();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m30902g(C18034p c18034p, C2459w2 c2459w2) {
        m30898c(c18034p, new C0231n1(2, c2459w2, this));
        List listM51776j = C18034p.m51776j(4, c18034p);
        int size = listM51776j.size();
        for (int i13 = 0; i13 < size; i13++) {
            C18034p c18034p2 = (C18034p) listM51776j.get(i13);
            AbstractC0050s abstractC0050sM30899d = m30899d();
            int i14 = c18034p2.f69992g;
            if (abstractC0050sM30899d.m120a(i14)) {
                C0023g0 c0023g0 = this.f36906L;
                if (c0023g0.m120a(i14)) {
                    Object objM121b = c0023g0.m121b(i14);
                    if (objM121b == null) {
                        throw AbstractC2875y.m8310w("node not present in pruned tree before this change");
                    }
                    m30902g(c18034p2, (C2459w2) objM121b);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m30903j(int i13, String str) {
        C12600a c12600a;
        if (Build.VERSION.SDK_INT >= 29 && (c12600a = this.f36912y) != null) {
            AutofillId autofillIdM35309b = c12600a.m35309b(i13);
            if (autofillIdM35309b == null) {
                throw AbstractC2875y.m8310w("Invalid content capture ID");
            }
            c12600a.m35313f(autofillIdM35309b, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0176  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX INFO: renamed from: l */
    public final void m30904l(int i13, C18034p c18034p) {
        Function1 function1;
        C3632c c3632cM35310c;
        C16618c c16618cM51777a;
        C3632c c3632c;
        String strM7424p;
        Function1 function2;
        if (m30900e()) {
            C0057v0 c0057v0 = c18034p.f69989d.f69980w;
            Object objM129g = c0057v0.m129g(AbstractC18039u.f70021C);
            if (objM129g == null) {
                objM129g = null;
            }
            Boolean bool = (Boolean) objM129g;
            if (this.f36900F == EnumC11479a.f36892w && AbstractC22676k.m65745e(bool, Boolean.TRUE)) {
                Object objM129g2 = c0057v0.m129g(AbstractC18029k.f69965l);
                if (objM129g2 == null) {
                    objM129g2 = null;
                }
                C18017a c18017a = (C18017a) objM129g2;
                if (c18017a != null && (function2 = (Function1) c18017a.f69929b) != null) {
                }
            } else if (this.f36900F == EnumC11479a.f36893x && AbstractC22676k.m65745e(bool, Boolean.FALSE)) {
                Object objM129g3 = c0057v0.m129g(AbstractC18029k.f69965l);
                if (objM129g3 == null) {
                    objM129g3 = null;
                }
                C18017a c18017a2 = (C18017a) objM129g3;
                if (c18017a2 != null && (function1 = (Function1) c18017a2.f69929b) != null) {
                }
            }
            int i14 = c18034p.f69992g;
            C12600a c12600a = this.f36912y;
            if (c12600a != null && Build.VERSION.SDK_INT >= 29) {
                AutofillId autofillId = this.f36910w.getAutofillId();
                C18034p c18034pM51787l = c18034p.m51787l();
                int i15 = c18034p.f69992g;
                if ((c18034pM51787l == null || (autofillId = c12600a.m35309b(c18034pM51787l.f69992g)) != null) && (c3632cM35310c = c12600a.m35310c(autofillId, i15)) != null) {
                    ViewStructure viewStructure = (ViewStructure) c3632cM35310c.f14788w;
                    C18030l c18030l = c18034p.f69989d;
                    C18043y c18043y = AbstractC18039u.f70028J;
                    C0057v0 c0057v1 = c18030l.f69980w;
                    if (c0057v1.m125c(c18043y)) {
                        c3632c = null;
                    } else {
                        Bundle extras = viewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.f36905K);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i13);
                        }
                        Object objM129g4 = c0057v1.m129g(AbstractC18039u.f70058y);
                        if (objM129g4 == null) {
                            objM129g4 = null;
                        }
                        String str = (String) objM129g4;
                        if (str != null) {
                            viewStructure.setId(i15, null, null, str);
                        }
                        Object objM129g5 = c0057v1.m129g(AbstractC18039u.f70046m);
                        if (objM129g5 == null) {
                            objM129g5 = null;
                        }
                        if (((Boolean) objM129g5) != null) {
                            viewStructure.setClassName("android.widget.ViewGroup");
                        }
                        Object objM129g6 = c0057v1.m129g(AbstractC18039u.f70019A);
                        if (objM129g6 == null) {
                            objM129g6 = null;
                        }
                        List list = (List) objM129g6;
                        if (list != null) {
                            viewStructure.setClassName("android.widget.TextView");
                            viewStructure.setText(AbstractC0355b.m988b(62, "\n", list, null));
                        }
                        Object objM129g7 = c0057v1.m129g(AbstractC18039u.f70023E);
                        if (objM129g7 == null) {
                            objM129g7 = null;
                        }
                        C23254g c23254g = (C23254g) objM129g7;
                        if (c23254g != null) {
                            viewStructure.setClassName("android.widget.EditText");
                            viewStructure.setText(c23254g);
                        }
                        Object objM129g8 = c0057v1.m129g(AbstractC18039u.f70034a);
                        if (objM129g8 == null) {
                            objM129g8 = null;
                        }
                        List list2 = (List) objM129g8;
                        if (list2 != null) {
                            viewStructure.setContentDescription(AbstractC0355b.m988b(62, "\n", list2, null));
                        }
                        Object objM129g9 = c0057v1.m129g(AbstractC18039u.f70057x);
                        if (objM129g9 == null) {
                            objM129g9 = null;
                        }
                        C18027i c18027i = (C18027i) objM129g9;
                        if (c18027i != null && (strM7424p = AbstractC2417o0.m7424p(c18027i.f69949a)) != null) {
                            viewStructure.setClassName(strM7424p);
                        }
                        C23277r0 c23277r0M7420l = AbstractC2417o0.m7420l(c18030l);
                        if (c23277r0M7420l != null) {
                            C23275q0 c23275q0 = c23277r0M7420l.f92227a;
                            C23285v0 c23285v0 = c23275q0.f92217b;
                            InterfaceC39171c interfaceC39171c = c23275q0.f92222g;
                            viewStructure.setTextStyle(interfaceC39171c.getFontScale() * interfaceC39171c.getDensity() * C39183o.m124805c(c23285v0.f92255a.f92192b), 0, 0, 0);
                        }
                        NodeCoordinator nodeCoordinatorM51780d = c18034p.m51780d();
                        if (nodeCoordinatorM51780d == null) {
                            c16618cM51777a = C16618c.f63938e;
                        } else {
                            NodeCoordinator nodeCoordinator = nodeCoordinatorM51780d.mo3533g1().f9141N ? nodeCoordinatorM51780d : null;
                            if (nodeCoordinator != null) {
                                c16618cM51777a = c18034p.m51777a(nodeCoordinator);
                            } else {
                                c16618cM51777a = C16618c.f63938e;
                            }
                        }
                        float f13 = c16618cM51777a.f63939a;
                        float f14 = c16618cM51777a.f63940b;
                        viewStructure.setDimens((int) f13, (int) f14, 0, 0, (int) (c16618cM51777a.f63941c - f13), (int) (c16618cM51777a.f63942d - f14));
                        c3632c = c3632cM35310c;
                    }
                } else {
                    c3632c = null;
                }
            } else {
                c3632c = null;
            }
            if (c3632c != null) {
                this.f36913z.add(new C11483e(i14, this.f36905K, EnumC11484f.f36918w, c3632c));
            }
            m30898c(c18034p, new C2312r(this, 4));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m30905n(C18034p c18034p) {
        if (m30900e()) {
            this.f36913z.add(new C11483e(c18034p.f69992g, this.f36905K, EnumC11484f.f36919x, null));
            List listM51776j = C18034p.m51776j(4, c18034p);
            int size = listM51776j.size();
            for (int i13 = 0; i13 < size; i13++) {
                m30905n((C18034p) listM51776j.get(i13));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    public final void m30906o() {
        C0023g0 c0023g0 = this.f36906L;
        c0023g0.m46c();
        AbstractC0050s abstractC0050sM30899d = m30899d();
        int[] iArr = abstractC0050sM30899d.f149b;
        Object[] objArr = abstractC0050sM30899d.f150c;
        long[] jArr = abstractC0050sM30899d.f148a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j7) < 128) {
                            int i16 = (i13 << 3) + i15;
                            c0023g0.m51h(iArr[i16], new C2459w2(((C18035q) objArr[i16]).f69993a, m30899d()));
                        }
                        j7 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 != length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        this.f36907M = new C2459w2(this.f36910w.getSemanticsOwner().m51794a(), m30899d());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC1585g0 interfaceC1585g0) {
        this.f36912y = (C12600a) this.f36911x.invoke();
        m30904l(-1, this.f36910w.getSemanticsOwner().m51794a());
        m30901f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC1585g0 interfaceC1585g0) {
        m30905n(this.f36910w.getSemanticsOwner().m51794a());
        m30901f();
        this.f36912y = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f36903I.removeCallbacks(this.f36909O);
        this.f36912y = null;
    }
}
