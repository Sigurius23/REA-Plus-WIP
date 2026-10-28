package p027b3;

import ad3.C0783z;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.lifecycle.RunnableC1645z0;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import com.whoop.android.R;
import dc3.C11923h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p002a0.AbstractC0044p;
import p002a0.AbstractC0048r;
import p002a0.AbstractC0050s;
import p002a0.AbstractC0052t;
import p002a0.AbstractC0054u;
import p002a0.C0006a1;
import p002a0.C0017e0;
import p002a0.C0020f0;
import p002a0.C0023g0;
import p002a0.C0024g1;
import p002a0.C0025h;
import p002a0.C0026h0;
import p002a0.C0057v0;
import p005a3.C0230n0;
import p005a3.C0271z0;
import p006a4.AbstractC0355b;
import p031b9.AbstractC2875y;
import p181h2.C16617b;
import p181h2.C16618c;
import p181h2.C16619d;
import p184h5.C16858b;
import p208i2.AbstractC17904p0;
import p208i2.C17891j;
import p208i2.C17898m0;
import p208i2.C17900n0;
import p208i2.C17902o0;
import p208i2.InterfaceC17869a1;
import p208i2.InterfaceC17910s0;
import p209i3.AbstractC18020b0;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18037s;
import p209i3.AbstractC18039u;
import p209i3.C18017a;
import p209i3.C18022d;
import p209i3.C18027i;
import p209i3.C18028j;
import p209i3.C18030l;
import p209i3.C18034p;
import p209i3.C18035q;
import p209i3.C18043y;
import p211i5.C18093f;
import p294l3.C23254g;
import p294l3.C23277r0;
import p294l3.C23283u0;
import p474s.C31983m2;
import p636y3.C39179k;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import ug.AbstractC34924m;
import v63.AbstractC35744b;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: b3.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2382h0 extends C16858b {

    /* JADX INFO: renamed from: Q */
    public static final C0020f0 f9391Q;

    /* JADX INFO: renamed from: A */
    public boolean f9392A;

    /* JADX INFO: renamed from: B */
    public C2367e0 f9393B;

    /* JADX INFO: renamed from: C */
    public C0023g0 f9394C;

    /* JADX INFO: renamed from: D */
    public final C0026h0 f9395D;

    /* JADX INFO: renamed from: E */
    public final C0017e0 f9396E;

    /* JADX INFO: renamed from: F */
    public final C0017e0 f9397F;

    /* JADX INFO: renamed from: G */
    public final String f9398G;

    /* JADX INFO: renamed from: H */
    public final String f9399H;

    /* JADX INFO: renamed from: I */
    public final C31983m2 f9400I;

    /* JADX INFO: renamed from: J */
    public final C0023g0 f9401J;

    /* JADX INFO: renamed from: K */
    public C2459w2 f9402K;

    /* JADX INFO: renamed from: L */
    public boolean f9403L;

    /* JADX INFO: renamed from: M */
    public final C0017e0 f9404M;

    /* JADX INFO: renamed from: N */
    public final RunnableC1645z0 f9405N;

    /* JADX INFO: renamed from: O */
    public final ArrayList f9406O;

    /* JADX INFO: renamed from: P */
    public final C2377g0 f9407P;

    /* JADX INFO: renamed from: d */
    public final AndroidComposeView f9408d;

    /* JADX INFO: renamed from: e */
    public int f9409e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f */
    public final C2377g0 f9410f;

    /* JADX INFO: renamed from: g */
    public final AccessibilityManager f9411g;

    /* JADX INFO: renamed from: h */
    public long f9412h;

    /* JADX INFO: renamed from: i */
    public final AccessibilityManagerAccessibilityStateChangeListenerC2347a0 f9413i;

    /* JADX INFO: renamed from: j */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC2352b0 f9414j;

    /* JADX INFO: renamed from: k */
    public List f9415k;

    /* JADX INFO: renamed from: l */
    public final Handler f9416l;

    /* JADX INFO: renamed from: m */
    public final C2362d0 f9417m;

    /* JADX INFO: renamed from: n */
    public int f9418n;

    /* JADX INFO: renamed from: o */
    public int f9419o;

    /* JADX INFO: renamed from: p */
    public C18093f f9420p;

    /* JADX INFO: renamed from: q */
    public C18093f f9421q;

    /* JADX INFO: renamed from: r */
    public boolean f9422r;

    /* JADX INFO: renamed from: s */
    public final C0023g0 f9423s;

    /* JADX INFO: renamed from: t */
    public final C0023g0 f9424t;

    /* JADX INFO: renamed from: u */
    public final C0024g1 f9425u;

    /* JADX INFO: renamed from: v */
    public final C0024g1 f9426v;

    /* JADX INFO: renamed from: w */
    public int f9427w;

    /* JADX INFO: renamed from: x */
    public Integer f9428x;

    /* JADX INFO: renamed from: y */
    public final C0025h f9429y;

    /* JADX INFO: renamed from: z */
    public final C11923h f9430z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        C0020f0 c0020f0 = AbstractC0048r.f139a;
        C0020f0 c0020f1 = new C0020f0(32);
        int i13 = c0020f1.f47b;
        if (i13 < 0) {
            AbstractC34924m.m110135Q("");
            throw null;
        }
        int i14 = i13 + 32;
        c0020f1.m27b(i14);
        int[] iArr2 = c0020f1.f46a;
        int i15 = c0020f1.f47b;
        if (i13 != i15) {
            AbstractC25260n.m74064e0(i14, i13, iArr2, iArr2, i15);
        }
        AbstractC25260n.m74069j0(i13, 0, iArr, iArr2, 12);
        c0020f1.f47b += 32;
        f9391Q = c0020f1;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [b3.a0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [b3.b0] */
    public C2382h0(AndroidComposeView androidComposeView) {
        this.f9408d = androidComposeView;
        int i13 = 0;
        this.f9410f = new C2377g0(this, i13);
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f9411g = accessibilityManager;
        this.f9412h = 100L;
        this.f9413i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: b3.a0
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z4) {
                C2382h0 c2382h0 = this.f9285a;
                c2382h0.f9415k = z4 ? c2382h0.f9411g.getEnabledAccessibilityServiceList(-1) : C25271y.f99162w;
            }
        };
        this.f9414j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: b3.b0
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z4) {
                C2382h0 c2382h0 = this.f9293a;
                c2382h0.f9415k = c2382h0.f9411g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f9415k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f9416l = new Handler(Looper.getMainLooper());
        this.f9417m = new C2362d0(this);
        this.f9418n = Integer.MIN_VALUE;
        this.f9419o = Integer.MIN_VALUE;
        this.f9423s = new C0023g0();
        this.f9424t = new C0023g0();
        this.f9425u = new C0024g1((Object) null);
        this.f9426v = new C0024g1((Object) null);
        this.f9427w = -1;
        this.f9429y = new C0025h(0);
        this.f9430z = AbstractC30060g.m92111d(1, 6, null);
        this.f9392A = true;
        C0023g0 c0023g0 = AbstractC0052t.f161a;
        AbstractC22676k.m65748h(c0023g0, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f9394C = c0023g0;
        this.f9395D = new C0026h0();
        this.f9396E = new C0017e0();
        this.f9397F = new C0017e0();
        this.f9398G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f9399H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f9400I = new C31983m2(3);
        this.f9401J = new C0023g0();
        C18034p c18034pM51794a = androidComposeView.getSemanticsOwner().m51794a();
        AbstractC22676k.m65748h(c0023g0, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f9402K = new C2459w2(c18034pM51794a, c0023g0);
        int i14 = AbstractC0044p.f130a;
        this.f9404M = new C0017e0();
        androidComposeView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2357c0(this, i13));
        this.f9405N = new RunnableC1645z0(this, 3);
        this.f9406O = new ArrayList();
        this.f9407P = new C2377g0(this, 1);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m7355E(C2382h0 c2382h0, int i13, int i14, Integer num, int i15) {
        if ((i15 & 4) != 0) {
            num = null;
        }
        c2382h0.m7367D(i13, i14, num, null);
    }

    /* JADX INFO: renamed from: L */
    public static Rect m7356L(AbstractC17904p0 abstractC17904p0) {
        if (!(abstractC17904p0 instanceof C17900n0) && !(abstractC17904p0 instanceof C17902o0)) {
            return null;
        }
        C16618c c16618cMo51481a = abstractC17904p0.mo51481a();
        return new Rect((int) c16618cMo51481a.f63939a, (int) c16618cMo51481a.f63940b, (int) c16618cMo51481a.f63941c, (int) c16618cMo51481a.f63942d);
    }

    /* JADX INFO: renamed from: M */
    public static float[] m7357M(AbstractC17904p0 abstractC17904p0) {
        if (!(abstractC17904p0 instanceof C17902o0)) {
            return null;
        }
        C16619d c16619d = ((C17902o0) abstractC17904p0).f69602a;
        long j7 = c16619d.f63950h;
        long j13 = c16619d.f63949g;
        long j14 = c16619d.f63948f;
        long j15 = c16619d.f63947e;
        return new float[]{Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j15 & 4294967295L)), Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L))};
    }

    /* JADX INFO: renamed from: N */
    public static Region m7358N(AbstractC17904p0 abstractC17904p0) {
        if (!(abstractC17904p0 instanceof C17898m0)) {
            return null;
        }
        C17898m0 c17898m0 = (C17898m0) abstractC17904p0;
        C16618c c16618cMo51481a = c17898m0.mo51481a();
        Region region = new Region(new Rect((int) c16618cMo51481a.f63939a, (int) c16618cMo51481a.f63940b, (int) c16618cMo51481a.f63941c, (int) c16618cMo51481a.f63942d));
        Region region2 = new Region();
        InterfaceC17910s0 interfaceC17910s0 = c17898m0.f69599a;
        if (!(interfaceC17910s0 instanceof C17891j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(((C17891j) interfaceC17910s0).f69587a, region);
        return region2;
    }

    /* JADX INFO: renamed from: O */
    public static CharSequence m7359O(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i13 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i13 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i13);
                AbstractC22676k.m65748h(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: u */
    public static String m7360u(C18034p c18034p) {
        C23254g c23254g;
        if (c18034p != null) {
            C18030l c18030l = c18034p.f69989d;
            C0057v0 c0057v0 = c18030l.f69980w;
            C18043y c18043y = AbstractC18039u.f70034a;
            if (c0057v0.m125c(c18043y)) {
                return AbstractC0355b.m988b(62, ",", (List) c18030l.m51770c(c18043y), null);
            }
            C18043y c18043y2 = AbstractC18039u.f70023E;
            if (c0057v0.m125c(c18043y2)) {
                Object objM129g = c0057v0.m129g(c18043y2);
                if (objM129g == null) {
                    objM129g = null;
                }
                C23254g c23254g2 = (C23254g) objM129g;
                if (c23254g2 != null) {
                    return c23254g2.f92135x;
                }
            } else {
                Object objM129g2 = c0057v0.m129g(AbstractC18039u.f70019A);
                if (objM129g2 == null) {
                    objM129g2 = null;
                }
                List list = (List) objM129g2;
                if (list != null && (c23254g = (C23254g) AbstractC25265s.m74100H0(list)) != null) {
                    return c23254g.f92135x;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m7361x(C18028j c18028j, float f13) {
        InterfaceC4339a interfaceC4339a = c18028j.f69950a;
        if (f13 >= 0.0f || ((Number) interfaceC4339a.invoke()).floatValue() <= 0.0f) {
            return f13 > 0.0f && ((Number) interfaceC4339a.invoke()).floatValue() < ((Number) c18028j.f69951b.invoke()).floatValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m7362y(C18028j c18028j) {
        InterfaceC4339a interfaceC4339a = c18028j.f69950a;
        if (((Number) interfaceC4339a.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) interfaceC4339a.invoke()).floatValue();
        ((Number) c18028j.f69951b.invoke()).floatValue();
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m7363z(C18028j c18028j) {
        InterfaceC4339a interfaceC4339a = c18028j.f69950a;
        if (((Number) interfaceC4339a.invoke()).floatValue() < ((Number) c18028j.f69951b.invoke()).floatValue()) {
            return true;
        }
        ((Number) interfaceC4339a.invoke()).floatValue();
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final int m7364A(int i13) {
        if (i13 == this.f9408d.getSemanticsOwner().m51794a().f69992g) {
            return -1;
        }
        return i13;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008b A[LOOP:1: B:15:0x004f->B:28:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008e A[EDGE_INSN: B:44:0x008e->B:29:0x008e BREAK  A[LOOP:1: B:15:0x004f->B:28:0x008b], SYNTHETIC] */
    /* JADX INFO: renamed from: B */
    public final void m7365B(C18034p c18034p, C2459w2 c2459w2) {
        int[] iArr = AbstractC0054u.f166a;
        C0026h0 c0026h0 = new C0026h0();
        List listM51776j = C18034p.m51776j(4, c18034p);
        C0230n0 c0230n0 = c18034p.f69988c;
        int size = listM51776j.size();
        for (int i13 = 0; i13 < size; i13++) {
            C18034p c18034p2 = (C18034p) listM51776j.get(i13);
            AbstractC0050s abstractC0050sM7385t = m7385t();
            int i14 = c18034p2.f69992g;
            if (abstractC0050sM7385t.m120a(i14)) {
                if (!c2459w2.f9602b.m62b(i14)) {
                    m7387w(c0230n0);
                    return;
                }
                c0026h0.m61a(i14);
            }
        }
        C0026h0 c0026h1 = c2459w2.f9602b;
        int[] iArr2 = c0026h1.f63b;
        long[] jArr = c0026h1.f62a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j7 = jArr[i15];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i15 != length) {
                        break;
                        break;
                    }
                    i15++;
                } else {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j7) < 128 && !c0026h0.m62b(iArr2[(i15 << 3) + i17])) {
                            m7387w(c0230n0);
                            return;
                        }
                        j7 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    } else if (i15 != length) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        List listM51776j2 = C18034p.m51776j(4, c18034p);
        int size2 = listM51776j2.size();
        for (int i18 = 0; i18 < size2; i18++) {
            C18034p c18034p3 = (C18034p) listM51776j2.get(i18);
            C2459w2 c2459w3 = (C2459w2) this.f9401J.m121b(c18034p3.f69992g);
            if (c2459w3 != null && m7385t().m120a(c18034p3.f69992g)) {
                m7365B(c18034p3, c2459w3);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m7366C(AccessibilityEvent accessibilityEvent) {
        if (!m7386v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f9422r = true;
        }
        try {
            return ((Boolean) this.f9410f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f9422r = false;
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m7367D(int i13, int i14, Integer num, List list) {
        if (i13 == Integer.MIN_VALUE || !m7386v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventM7380o = m7380o(i13, i14);
        if (num != null) {
            accessibilityEventM7380o.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventM7380o.setContentDescription(AbstractC0355b.m988b(62, ",", list, null));
        }
        return m7366C(accessibilityEventM7380o);
    }

    /* JADX INFO: renamed from: F */
    public final void m7368F(int i13, int i14, String str) {
        AccessibilityEvent accessibilityEventM7380o = m7380o(m7364A(i13), 32);
        accessibilityEventM7380o.setContentChangeTypes(i14);
        if (str != null) {
            accessibilityEventM7380o.getText().add(str);
        }
        m7366C(accessibilityEventM7380o);
    }

    /* JADX INFO: renamed from: G */
    public final void m7369G(int i13) {
        C2367e0 c2367e0 = this.f9393B;
        if (c2367e0 != null) {
            if (i13 != c2367e0.m7298d().f69992g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c2367e0.m7300f() <= 1000) {
                AccessibilityEvent accessibilityEventM7380o = m7380o(m7364A(c2367e0.m7298d().f69992g), ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ);
                accessibilityEventM7380o.setFromIndex(c2367e0.m7296b());
                accessibilityEventM7380o.setToIndex(c2367e0.m7299e());
                accessibilityEventM7380o.setAction(c2367e0.m7295a());
                accessibilityEventM7380o.setMovementGranularity(c2367e0.m7297c());
                accessibilityEventM7380o.getText().add(m7360u(c2367e0.m7298d()));
                m7366C(accessibilityEventM7380o);
            }
        }
        this.f9393B = null;
    }

    /* JADX WARN: Code duplicated, block: B:208:0x04be A[PHI: r44
      0x04be: PHI (r44v17 i3.l) = (r44v15 i3.l), (r44v19 i3.l) binds: [B:233:0x0508, B:206:0x04bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:232:0x0507  */
    /* JADX WARN: Code duplicated, block: B:269:0x0610  */
    /* JADX WARN: Code duplicated, block: B:46:0x0116  */
    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    /* JADX WARN: Code duplicated, block: B:50:0x012b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    /* JADX WARN: Code duplicated, block: B:57:0x0151  */
    /* JADX INFO: renamed from: H */
    public final void m7370H(AbstractC0050s abstractC0050s) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i13;
        int i14;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i15;
        int i16;
        Integer num2;
        int i17;
        C18030l c18030l;
        C18034p c18034p;
        boolean z4;
        boolean z13;
        C0057v0 c0057v0;
        C18030l c18030l2;
        C0230n0 c0230n0;
        int i18;
        C18030l c18030l3;
        long j7;
        int i19;
        int i24;
        int i25;
        boolean z14;
        C18043y c18043y;
        boolean z15;
        InterfaceC23459e interfaceC23459e;
        int i26;
        String str;
        int i27;
        int i28;
        int i29;
        Integer num3;
        AccessibilityEvent accessibilityEventM7382q;
        C0230n0 c0230n1;
        String str2;
        AbstractC0050s abstractC0050s2 = abstractC0050s;
        ArrayList arrayList3 = this.f9406O;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int[] iArr3 = abstractC0050s2.f149b;
        long[] jArr3 = abstractC0050s2.f148a;
        int i34 = 2;
        int length = jArr3.length - 2;
        int i35 = 0;
        Integer num4 = 0;
        if (length < 0) {
            return;
        }
        int i36 = 0;
        while (true) {
            long j13 = jArr3[i36];
            int i37 = i34;
            int i38 = length;
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i39 = 8;
                int i44 = 8 - ((~(i36 - i38)) >>> 31);
                long j14 = j13;
                int i45 = i35;
                while (i45 < i44) {
                    if ((j14 & 255) < 128) {
                        int i46 = iArr3[(i36 << 3) + i45];
                        C2459w2 c2459w2 = (C2459w2) this.f9401J.m121b(i46);
                        if (c2459w2 == null) {
                            i14 = i45;
                            arrayList2 = arrayList4;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i15 = i44;
                            i16 = i36;
                            num2 = num4;
                        } else {
                            C18030l c18030l4 = c2459w2.f9601a;
                            C0057v0 c0057v1 = c18030l4.f69980w;
                            C18035q c18035q = (C18035q) abstractC0050s2.m121b(i46);
                            int i47 = i39;
                            C18034p c18034p2 = c18035q != null ? c18035q.f69993a : null;
                            if (c18034p2 == null) {
                                throw AbstractC2875y.m8310w("no value for specified key");
                            }
                            C0230n0 c0230n2 = c18034p2.f69988c;
                            C18030l c18030l5 = c18034p2.f69989d;
                            iArr2 = iArr3;
                            int i48 = c18034p2.f69992g;
                            jArr2 = jArr3;
                            C0057v0 c0057v2 = c18030l5.f69980w;
                            i16 = i36;
                            Object[] objArr = c0057v2.f171b;
                            Object[] objArr2 = c0057v2.f172c;
                            long[] jArr4 = c0057v2.f170a;
                            i14 = i45;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                C0230n0 c0230n3 = c0230n2;
                                i15 = i44;
                                int i49 = 0;
                                z4 = false;
                                while (true) {
                                    long j15 = jArr4[i49];
                                    c18034p = c18034p2;
                                    int i54 = i49;
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i55 = 8 - ((~(i54 - length2)) >>> 31);
                                        int i56 = 0;
                                        while (i56 < i55) {
                                            if ((j15 & 255) < 128) {
                                                int i57 = (i54 << 3) + i56;
                                                Object obj = objArr[i57];
                                                int i58 = length2;
                                                Object obj2 = objArr2[i57];
                                                c18030l3 = c18030l4;
                                                C18043y c18043y2 = (C18043y) obj;
                                                j7 = j15;
                                                C18043y c18043y3 = AbstractC18039u.f70053t;
                                                if (AbstractC22676k.m65745e(c18043y2, c18043y3) || AbstractC22676k.m65745e(c18043y2, AbstractC18039u.f70054u)) {
                                                    C2454v2 c2454v2M7415g = AbstractC2417o0.m7415g(arrayList4, i46);
                                                    if (c2454v2M7415g != null) {
                                                        z14 = false;
                                                    } else {
                                                        c2454v2M7415g = new C2454v2(arrayList3, i46);
                                                        z14 = true;
                                                    }
                                                    arrayList3.add(c2454v2M7415g);
                                                } else {
                                                    z14 = false;
                                                }
                                                if (z14) {
                                                    c18043y = AbstractC18039u.f70037d;
                                                    if (AbstractC22676k.m65745e(c18043y2, c18043y)) {
                                                        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.String");
                                                        str2 = (String) obj2;
                                                        if (c0057v1.m125c(c18043y)) {
                                                            m7368F(i46, i47, str2);
                                                        }
                                                        num4 = num4;
                                                        c0057v1 = c0057v1;
                                                        c18030l5 = c18030l5;
                                                        arrayList4 = arrayList4;
                                                        i56 = i56;
                                                        i19 = 8;
                                                        i24 = i46;
                                                        i25 = i58;
                                                    } else if (!AbstractC22676k.m65745e(c18043y2, AbstractC18039u.f70035b) || AbstractC22676k.m65745e(c18043y2, AbstractC18039u.f70027I)) {
                                                        num4 = num4;
                                                        c0057v1 = c0057v1;
                                                        c18030l5 = c18030l5;
                                                        arrayList4 = arrayList4;
                                                        i56 = i56;
                                                        c0230n3 = c0230n3;
                                                        i24 = i46;
                                                        i25 = i58;
                                                        i19 = 8;
                                                        m7355E(this, m7364A(i24), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, 64, 8);
                                                        m7355E(this, m7364A(i24), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, num4, 8);
                                                    } else if (AbstractC22676k.m65745e(c18043y2, AbstractC18039u.f70036c)) {
                                                        i19 = 8;
                                                        m7355E(this, m7364A(i46), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, 64, 8);
                                                        m7355E(this, m7364A(i46), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, num4, 8);
                                                        i24 = i46;
                                                        i25 = i58;
                                                    } else {
                                                        C18043y c18043y4 = AbstractC18039u.f70026H;
                                                        arrayList4 = arrayList4;
                                                        if (AbstractC22676k.m65745e(c18043y2, c18043y4)) {
                                                            Object objM129g = c0057v2.m129g(AbstractC18039u.f70057x);
                                                            if (objM129g == null) {
                                                                objM129g = null;
                                                            }
                                                            C18027i c18027i = (C18027i) objM129g;
                                                            if (c18027i != null && c18027i.f69949a == 4) {
                                                                Object objM129g2 = c0057v2.m129g(c18043y4);
                                                                if (objM129g2 == null) {
                                                                    objM129g2 = null;
                                                                }
                                                                if (AbstractC22676k.m65745e(objM129g2, Boolean.TRUE)) {
                                                                    AccessibilityEvent accessibilityEventM7380o = m7380o(m7364A(i46), 4);
                                                                    C0230n0 c0230n4 = c0230n3;
                                                                    C18034p c18034p3 = new C18034p(c18034p.f69986a, true, c0230n4, c18030l5);
                                                                    Object objM129g3 = c18034p3.m51786k().f69980w.m129g(AbstractC18039u.f70034a);
                                                                    if (objM129g3 == null) {
                                                                        objM129g3 = null;
                                                                    }
                                                                    List list = (List) objM129g3;
                                                                    c0230n1 = c0230n4;
                                                                    String strM988b = list != null ? AbstractC0355b.m988b(62, ",", list, null) : null;
                                                                    Object objM129g4 = c18034p3.m51786k().f69980w.m129g(AbstractC18039u.f70019A);
                                                                    if (objM129g4 == null) {
                                                                        objM129g4 = null;
                                                                    }
                                                                    List list2 = (List) objM129g4;
                                                                    String strM988b2 = list2 != null ? AbstractC0355b.m988b(62, ",", list2, null) : null;
                                                                    if (strM988b != null) {
                                                                        accessibilityEventM7380o.setContentDescription(strM988b);
                                                                    }
                                                                    if (strM988b2 != null) {
                                                                        accessibilityEventM7380o.getText().add(strM988b2);
                                                                    }
                                                                    m7366C(accessibilityEventM7380o);
                                                                } else {
                                                                    c0230n1 = c0230n3;
                                                                    m7355E(this, m7364A(i46), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, num4, 8);
                                                                }
                                                            } else {
                                                                c0230n1 = c0230n3;
                                                                m7355E(this, m7364A(i46), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, 64, 8);
                                                                m7355E(this, m7364A(i46), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, num4, 8);
                                                            }
                                                            num4 = num4;
                                                            i24 = i46;
                                                            c0057v1 = c0057v1;
                                                            c0230n3 = c0230n1;
                                                            i25 = i58;
                                                            i19 = 8;
                                                        } else {
                                                            i56 = i56;
                                                            c0230n3 = c0230n3;
                                                            if (AbstractC22676k.m65745e(c18043y2, AbstractC18039u.f70034a)) {
                                                                int iM7364A = m7364A(i46);
                                                                AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                m7367D(iM7364A, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, 4, (List) obj2);
                                                                num4 = num4;
                                                                i24 = i46;
                                                                c0057v1 = c0057v1;
                                                                c18030l5 = c18030l5;
                                                                i25 = i58;
                                                            } else {
                                                                C18043y c18043y5 = AbstractC18039u.f70023E;
                                                                String str3 = "";
                                                                if (!AbstractC22676k.m65745e(c18043y2, c18043y5)) {
                                                                    i24 = i46;
                                                                    c0057v1 = c0057v1;
                                                                    C18043y c18043y6 = AbstractC18039u.f70024F;
                                                                    if (AbstractC22676k.m65745e(c18043y2, c18043y6)) {
                                                                        Object objM129g5 = c0057v2.m129g(c18043y5);
                                                                        if (objM129g5 == null) {
                                                                            objM129g5 = null;
                                                                        }
                                                                        C23254g c23254g = (C23254g) objM129g5;
                                                                        if (c23254g != null && (str = c23254g.f92135x) != null) {
                                                                            str3 = str;
                                                                        }
                                                                        long j16 = ((C23283u0) c18030l5.m51770c(c18043y6)).f92253a;
                                                                        num4 = num4;
                                                                        m7366C(m7382q(m7364A(i24), Integer.valueOf((int) (j16 >> 32)), Integer.valueOf((int) (j16 & 4294967295L)), Integer.valueOf(str3.length()), m7359O(str3)));
                                                                        m7369G(i48);
                                                                    } else {
                                                                        num4 = num4;
                                                                        i25 = i58;
                                                                        c0057v1 = c0057v1;
                                                                        if (AbstractC22676k.m65745e(c18043y2, c18043y3) || AbstractC22676k.m65745e(c18043y2, AbstractC18039u.f70054u)) {
                                                                            c18030l5 = c18030l5;
                                                                            m7387w(c0230n3);
                                                                            C2454v2 c2454v2M7415g2 = AbstractC2417o0.m7415g(arrayList3, i24);
                                                                            AbstractC22676k.m65747g(c2454v2M7415g2);
                                                                            Object objM129g6 = c0057v2.m129g(c18043y3);
                                                                            if (objM129g6 == null) {
                                                                                objM129g6 = null;
                                                                            }
                                                                            c2454v2M7415g2.m7438b((C18028j) objM129g6);
                                                                            Object objM129g7 = c0057v2.m129g(AbstractC18039u.f70054u);
                                                                            if (objM129g7 == null) {
                                                                                objM129g7 = null;
                                                                            }
                                                                            c2454v2M7415g2.m7439c((C18028j) objM129g7);
                                                                            if (c2454v2M7415g2.mo432U()) {
                                                                                this.f9408d.getSnapshotObserver().m457a(c2454v2M7415g2, this.f9407P, new C0271z0(3, c2454v2M7415g2, this));
                                                                            }
                                                                        } else if (AbstractC22676k.m65745e(c18043y2, AbstractC18039u.f70044k)) {
                                                                            AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                i26 = 8;
                                                                                m7366C(m7380o(m7364A(i48), 8));
                                                                            } else {
                                                                                i26 = 8;
                                                                            }
                                                                            m7355E(this, m7364A(i48), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, num4, i26);
                                                                            i19 = i26;
                                                                        } else {
                                                                            C18043y c18043y7 = AbstractC18029k.f69976w;
                                                                            if (AbstractC22676k.m65745e(c18043y2, c18043y7)) {
                                                                                List list3 = (List) c18030l5.m51770c(c18043y7);
                                                                                Object objM129g8 = c0057v1.m129g(c18043y7);
                                                                                if (objM129g8 == null) {
                                                                                    objM129g8 = null;
                                                                                }
                                                                                List list4 = (List) objM129g8;
                                                                                if (list4 != null) {
                                                                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                    int size = list3.size();
                                                                                    c18030l5 = c18030l5;
                                                                                    int i59 = 0;
                                                                                    while (i59 < size) {
                                                                                        linkedHashSet.add(((C18022d) list3.get(i59)).f69938a);
                                                                                        i59++;
                                                                                        list3 = list3;
                                                                                    }
                                                                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                    int i64 = 0;
                                                                                    for (int size2 = list4.size(); i64 < size2; size2 = size2) {
                                                                                        linkedHashSet2.add(((C18022d) list4.get(i64)).f69938a);
                                                                                        i64++;
                                                                                    }
                                                                                    if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                        z4 = false;
                                                                                    }
                                                                                } else {
                                                                                    c18030l5 = c18030l5;
                                                                                    if (!list3.isEmpty()) {
                                                                                    }
                                                                                }
                                                                                z4 = true;
                                                                            } else {
                                                                                c18030l5 = c18030l5;
                                                                                if (obj2 instanceof C18017a) {
                                                                                    C18017a c18017a = (C18017a) obj2;
                                                                                    Object objM129g9 = c0057v1.m129g(c18043y2);
                                                                                    if (objM129g9 == null) {
                                                                                        objM129g9 = null;
                                                                                    }
                                                                                    if (c18017a != objM129g9) {
                                                                                        if (objM129g9 instanceof C18017a) {
                                                                                            String str4 = c18017a.f69928a;
                                                                                            C18017a c18017a2 = (C18017a) objM129g9;
                                                                                            InterfaceC23459e interfaceC23459e2 = c18017a2.f69929b;
                                                                                            z15 = AbstractC22676k.m65745e(str4, c18017a2.f69928a) && ((interfaceC23459e = c18017a.f69929b) != null || interfaceC23459e2 == null) && (interfaceC23459e == null || interfaceC23459e2 != null);
                                                                                        }
                                                                                    }
                                                                                    if (z15) {
                                                                                        z4 = false;
                                                                                    }
                                                                                }
                                                                                z4 = true;
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (c0057v2.m125c(AbstractC18029k.f69963j)) {
                                                                    Object objM129g10 = c0057v1.m129g(c18043y5);
                                                                    if (objM129g10 == null) {
                                                                        objM129g10 = null;
                                                                    }
                                                                    C23254g c23254g2 = (C23254g) objM129g10;
                                                                    if (c23254g2 == null) {
                                                                        c23254g2 = "";
                                                                    }
                                                                    Object objM129g11 = c0057v2.m129g(c18043y5);
                                                                    if (objM129g11 == null) {
                                                                        objM129g11 = null;
                                                                    }
                                                                    CharSequence charSequence = (C23254g) objM129g11;
                                                                    if (charSequence == null) {
                                                                        charSequence = "";
                                                                    }
                                                                    CharSequence charSequenceM7359O = m7359O(charSequence);
                                                                    int length3 = c23254g2.length();
                                                                    int length4 = charSequence.length();
                                                                    Integer num5 = num4;
                                                                    int i65 = length3 > length4 ? length4 : length3;
                                                                    int i66 = 0;
                                                                    while (true) {
                                                                        i27 = i65;
                                                                        if (i66 >= i65) {
                                                                            i28 = length4;
                                                                            break;
                                                                        }
                                                                        i28 = length4;
                                                                        if (c23254g2.charAt(i66) != charSequence.charAt(i66)) {
                                                                            break;
                                                                        }
                                                                        i66++;
                                                                        i65 = i27;
                                                                        length4 = i28;
                                                                    }
                                                                    int i67 = 0;
                                                                    while (true) {
                                                                        if (i67 >= i27 - i66) {
                                                                            i29 = i67;
                                                                            break;
                                                                        }
                                                                        i29 = i67;
                                                                        if (c23254g2.charAt((length3 - 1) - i67) != charSequence.charAt((i28 - 1) - i29)) {
                                                                            break;
                                                                        } else {
                                                                            i67 = i29 + 1;
                                                                        }
                                                                    }
                                                                    int i68 = (length3 - i29) - i66;
                                                                    int i69 = (i28 - i29) - i66;
                                                                    C18043y c18043y8 = AbstractC18039u.f70028J;
                                                                    boolean zM125c = c0057v1.m125c(c18043y8);
                                                                    boolean zM125c2 = c0057v2.m125c(c18043y8);
                                                                    boolean zM125c3 = c0057v1.m125c(AbstractC18039u.f70023E);
                                                                    boolean z16 = zM125c3 && !zM125c && zM125c2;
                                                                    boolean z17 = zM125c3 && zM125c && !zM125c2;
                                                                    if (z16 || z17) {
                                                                        i24 = i46;
                                                                        num3 = num5;
                                                                        accessibilityEventM7382q = m7382q(m7364A(i46), num3, num5, Integer.valueOf(i28), charSequenceM7359O);
                                                                    } else {
                                                                        AccessibilityEvent accessibilityEventM7380o2 = m7380o(m7364A(i46), 16);
                                                                        accessibilityEventM7380o2.setFromIndex(i66);
                                                                        accessibilityEventM7380o2.setRemovedCount(i68);
                                                                        accessibilityEventM7380o2.setAddedCount(i69);
                                                                        accessibilityEventM7380o2.setBeforeText(c23254g2);
                                                                        accessibilityEventM7380o2.getText().add(charSequenceM7359O);
                                                                        accessibilityEventM7382q = accessibilityEventM7380o2;
                                                                        i24 = i46;
                                                                        num3 = num5;
                                                                    }
                                                                    accessibilityEventM7382q.setClassName("android.widget.EditText");
                                                                    m7366C(accessibilityEventM7382q);
                                                                    if (z16 || z17) {
                                                                        long j17 = ((C23283u0) c18030l5.m51770c(AbstractC18039u.f70024F)).f92253a;
                                                                        accessibilityEventM7382q.setFromIndex((int) (j17 >> 32));
                                                                        accessibilityEventM7382q.setToIndex((int) (j17 & 4294967295L));
                                                                        m7366C(accessibilityEventM7382q);
                                                                    }
                                                                    num4 = num3;
                                                                } else {
                                                                    i24 = i46;
                                                                    i19 = 8;
                                                                    m7355E(this, m7364A(i24), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, Integer.valueOf(i37), 8);
                                                                    num4 = num4;
                                                                    c18030l5 = c18030l5;
                                                                    i25 = i58;
                                                                    c0057v1 = c0057v1;
                                                                }
                                                                c18030l5 = c18030l5;
                                                                i25 = i58;
                                                                c0057v1 = c0057v1;
                                                            }
                                                            i19 = 8;
                                                        }
                                                        c18030l5 = c18030l5;
                                                    }
                                                } else {
                                                    Object objM129g12 = c0057v1.m129g(c18043y2);
                                                    if (objM129g12 == null) {
                                                        objM129g12 = null;
                                                    }
                                                    if (AbstractC22676k.m65745e(obj2, objM129g12)) {
                                                        i19 = i47;
                                                    } else {
                                                        c18043y = AbstractC18039u.f70037d;
                                                        if (AbstractC22676k.m65745e(c18043y2, c18043y)) {
                                                            AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.String");
                                                            str2 = (String) obj2;
                                                            if (c0057v1.m125c(c18043y)) {
                                                                m7368F(i46, i47, str2);
                                                            }
                                                            num4 = num4;
                                                            c0057v1 = c0057v1;
                                                            c18030l5 = c18030l5;
                                                            arrayList4 = arrayList4;
                                                            i56 = i56;
                                                            i19 = 8;
                                                            i24 = i46;
                                                            i25 = i58;
                                                        } else if (AbstractC22676k.m65745e(c18043y2, AbstractC18039u.f70035b)) {
                                                            num4 = num4;
                                                            c0057v1 = c0057v1;
                                                            c18030l5 = c18030l5;
                                                            arrayList4 = arrayList4;
                                                            i56 = i56;
                                                            c0230n3 = c0230n3;
                                                            i24 = i46;
                                                            i25 = i58;
                                                            i19 = 8;
                                                            m7355E(this, m7364A(i24), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, 64, 8);
                                                            m7355E(this, m7364A(i24), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, num4, 8);
                                                        } else {
                                                            num4 = num4;
                                                            c0057v1 = c0057v1;
                                                            c18030l5 = c18030l5;
                                                            arrayList4 = arrayList4;
                                                            i56 = i56;
                                                            c0230n3 = c0230n3;
                                                            i24 = i46;
                                                            i25 = i58;
                                                            i19 = 8;
                                                            m7355E(this, m7364A(i24), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, 64, 8);
                                                            m7355E(this, m7364A(i24), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, num4, 8);
                                                        }
                                                    }
                                                    i24 = i46;
                                                    i25 = i58;
                                                }
                                            } else {
                                                c18030l3 = c18030l4;
                                                c18030l5 = c18030l5;
                                                arrayList4 = arrayList4;
                                                j7 = j15;
                                                i56 = i56;
                                                i19 = i47;
                                                c0230n3 = c0230n3;
                                                num4 = num4;
                                                i24 = i46;
                                                c0057v1 = c0057v1;
                                                i25 = length2;
                                            }
                                            int i74 = i24;
                                            i56++;
                                            length2 = i25;
                                            i46 = i74;
                                            c0230n3 = c0230n3;
                                            i47 = i19;
                                            c18030l5 = c18030l5;
                                            arrayList4 = arrayList4;
                                            c0057v1 = c0057v1;
                                            num4 = num4;
                                            c18030l4 = c18030l3;
                                            j15 = j7 >> i19;
                                        }
                                        num2 = num4;
                                        i17 = i46;
                                        c18030l = c18030l4;
                                        c0057v0 = c0057v1;
                                        c18030l2 = c18030l5;
                                        arrayList2 = arrayList4;
                                        c0230n0 = c0230n3;
                                        i18 = length2;
                                        if (i55 != i47) {
                                            break;
                                        }
                                    } else {
                                        num2 = num4;
                                        i17 = i46;
                                        c18030l = c18030l4;
                                        c0057v0 = c0057v1;
                                        c18030l2 = c18030l5;
                                        arrayList2 = arrayList4;
                                        c0230n0 = c0230n3;
                                        i18 = length2;
                                    }
                                    if (i54 == i18) {
                                        break;
                                    }
                                    int i75 = i17;
                                    i49 = i54 + 1;
                                    length2 = i18;
                                    i46 = i75;
                                    c0057v1 = c0057v0;
                                    c0230n3 = c0230n0;
                                    num4 = num2;
                                    c18034p2 = c18034p;
                                    c18030l4 = c18030l;
                                    c18030l5 = c18030l2;
                                    arrayList4 = arrayList2;
                                    i47 = 8;
                                }
                            } else {
                                i17 = i46;
                                c18030l = c18030l4;
                                arrayList2 = arrayList4;
                                i15 = i44;
                                c18034p = c18034p2;
                                num2 = num4;
                                z4 = false;
                            }
                            if (!z4) {
                                Iterator it = c18030l.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (!c18034p.m51786k().f69980w.m125c((C18043y) ((Map.Entry) it.next()).getKey())) {
                                            z13 = true;
                                            break;
                                        }
                                    } else {
                                        z13 = false;
                                        break;
                                    }
                                }
                                z4 = z13;
                            }
                            if (z4) {
                                i39 = 8;
                                m7355E(this, m7364A(i17), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, num2, 8);
                            } else {
                                i39 = 8;
                            }
                        }
                    } else {
                        i14 = i45;
                        arrayList2 = arrayList4;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i15 = i44;
                        i16 = i36;
                        num2 = num4;
                    }
                    j14 >>= i39;
                    i45 = i14 + 1;
                    abstractC0050s2 = abstractC0050s;
                    num4 = num2;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i36 = i16;
                    i44 = i15;
                    arrayList4 = arrayList2;
                }
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                int i76 = i44;
                int i77 = i36;
                num = num4;
                if (i76 != i39) {
                    return;
                } else {
                    i13 = i77;
                }
            } else {
                num = num4;
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                i13 = i36;
            }
            if (i13 == i38) {
                return;
            }
            i36 = i13 + 1;
            abstractC0050s2 = abstractC0050s;
            num4 = num;
            i34 = i37;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList4 = arrayList;
            i35 = 0;
            length = i38;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m7371I(C0230n0 c0230n0, C0026h0 c0026h0) {
        C18030l c18030lM591I;
        if (c0230n0.m605X() && !this.f9408d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c0230n0)) {
            C0230n0 c0230n1 = null;
            if (!c0230n0.f783e0.m560j(8)) {
                c0230n0 = c0230n0.m588G();
                while (true) {
                    if (c0230n0 == null) {
                        c0230n0 = null;
                        break;
                    } else if (c0230n0.f783e0.m560j(8)) {
                        break;
                    } else {
                        c0230n0 = c0230n0.m588G();
                    }
                }
            }
            if (c0230n0 == null || (c18030lM591I = c0230n0.m591I()) == null) {
                return;
            }
            if (!c18030lM591I.f69982y) {
                for (C0230n0 c0230n0M588G = c0230n0.m588G(); c0230n0M588G != null; c0230n0M588G = c0230n0M588G.m588G()) {
                    C18030l c18030lM591I2 = c0230n0M588G.m591I();
                    if (c18030lM591I2 != null && c18030lM591I2.f69982y) {
                        c0230n1 = c0230n0M588G;
                        break;
                    }
                }
                if (c0230n1 != null) {
                    c0230n0 = c0230n1;
                }
            }
            int i13 = c0230n0.f795x;
            if (c0026h0.m61a(i13)) {
                m7355E(this, m7364A(i13), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, 1, 8);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m7372J(C0230n0 c0230n0) {
        if (c0230n0.m605X() && !this.f9408d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c0230n0)) {
            int i13 = c0230n0.f795x;
            C18028j c18028j = (C18028j) this.f9423s.m121b(i13);
            C18028j c18028j2 = (C18028j) this.f9424t.m121b(i13);
            if (c18028j == null && c18028j2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventM7380o = m7380o(i13, 4096);
            if (c18028j != null) {
                accessibilityEventM7380o.setScrollX((int) ((Number) c18028j.f69950a.invoke()).floatValue());
                accessibilityEventM7380o.setMaxScrollX((int) ((Number) c18028j.f69951b.invoke()).floatValue());
            }
            if (c18028j2 != null) {
                accessibilityEventM7380o.setScrollY((int) ((Number) c18028j2.f69950a.invoke()).floatValue());
                accessibilityEventM7380o.setMaxScrollY((int) ((Number) c18028j2.f69951b.invoke()).floatValue());
            }
            m7366C(accessibilityEventM7380o);
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m7373K(C18034p c18034p, int i13, int i14, boolean z4) {
        String strM7360u;
        C18030l c18030l = c18034p.f69989d;
        int i15 = c18034p.f69992g;
        C18043y c18043y = AbstractC18029k.f69962i;
        if (c18030l.f69980w.m125c(c18043y) && AbstractC2417o0.m7409a(c18034p)) {
            Function3 function3 = (Function3) ((C18017a) c18034p.f69989d.m51770c(c18043y)).f69929b;
            if (function3 != null) {
                return ((Boolean) function3.invoke(Integer.valueOf(i13), Integer.valueOf(i14), Boolean.valueOf(z4))).booleanValue();
            }
        } else if ((i13 != i14 || i14 != this.f9427w) && (strM7360u = m7360u(c18034p)) != null) {
            if (i13 < 0 || i13 != i14 || i14 > strM7360u.length()) {
                i13 = -1;
            }
            this.f9427w = i13;
            boolean z13 = strM7360u.length() > 0;
            m7366C(m7382q(m7364A(i15), z13 ? Integer.valueOf(this.f9427w) : null, z13 ? Integer.valueOf(this.f9427w) : null, z13 ? Integer.valueOf(strM7360u.length()) : null, strM7360u));
            m7369G(i15);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final void m7374P() {
        long j7;
        long j13;
        long j14;
        char c3;
        long[] jArr;
        long[] jArr2;
        long j15;
        int i13;
        int iNumberOfTrailingZeros;
        char c7;
        C2459w2 c2459w2;
        C0026h0 c0026h0 = new C0026h0();
        C0026h0 c0026h1 = this.f9395D;
        int[] iArr = c0026h1.f63b;
        long[] jArr3 = c0026h1.f62a;
        int length = jArr3.length - 2;
        C0023g0 c0023g0 = this.f9401J;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            j7 = 128;
            j13 = 255;
            while (true) {
                long j16 = jArr3[i15];
                char c14 = 7;
                j14 = -9187201950435737472L;
                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j16 & 255) < 128) {
                            int i18 = iArr[(i15 << 3) + i17];
                            c7 = c14;
                            C18035q c18035q = (C18035q) m7385t().m121b(i18);
                            Object obj = null;
                            C18034p c18034p = c18035q != null ? c18035q.f69993a : null;
                            if (c18034p != null) {
                                if (!c18034p.f69989d.f69980w.m125c(AbstractC18039u.f70037d)) {
                                    c0026h0.m61a(i18);
                                    c2459w2 = (C2459w2) c0023g0.m121b(i18);
                                    if (c2459w2 != null) {
                                        Object objM129g = c2459w2.f9601a.f69980w.m129g(AbstractC18039u.f70037d);
                                        obj = (String) (objM129g != null ? objM129g : null);
                                    }
                                    m7368F(i18, 32, obj);
                                }
                            } else {
                                c0026h0.m61a(i18);
                                c2459w2 = (C2459w2) c0023g0.m121b(i18);
                                if (c2459w2 != null) {
                                    Object objM129g2 = c2459w2.f9601a.f69980w.m129g(AbstractC18039u.f70037d);
                                    obj = (String) (objM129g2 != null ? objM129g2 : null);
                                }
                                m7368F(i18, 32, obj);
                            }
                        } else {
                            c7 = c14;
                        }
                        j16 >>= 8;
                        i17++;
                        c14 = c7;
                    }
                    c3 = c14;
                    if (i16 != 8) {
                        break;
                    }
                } else {
                    c3 = 7;
                }
                if (i15 == length) {
                    break;
                } else {
                    i15++;
                }
            }
        } else {
            j7 = 128;
            j13 = 255;
            j14 = -9187201950435737472L;
            c3 = 7;
        }
        int[] iArr2 = c0026h0.f63b;
        long[] jArr4 = c0026h0.f62a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i19 = 0;
            while (true) {
                long j17 = jArr4[i19];
                if ((((~j17) << c3) & j17 & j14) != j14) {
                    int i24 = 8 - ((~(i19 - length2)) >>> 31);
                    int i25 = 0;
                    while (i25 < i24) {
                        if ((j17 & j13) < j7) {
                            int i26 = iArr2[(i19 << 3) + i25];
                            int iHashCode = Integer.hashCode(i26) * (-862048943);
                            int i27 = iHashCode ^ (iHashCode << 16);
                            int i28 = i27 & 127;
                            int i29 = c0026h1.f64c;
                            int i34 = (i27 >>> 7) & i29;
                            i13 = i14;
                            int i35 = 0;
                            while (true) {
                                long[] jArr5 = c0026h1.f62a;
                                int i36 = i34 >> 3;
                                jArr2 = jArr4;
                                int i37 = (i34 & 7) << 3;
                                j15 = j17;
                                long j18 = (jArr5[i36] >>> i37) | ((jArr5[i36 + 1] << (64 - i37)) & ((-i37) >> 63));
                                int i38 = i29;
                                long j19 = (((long) i28) * 72340172838076673L) ^ j18;
                                long j24 = (j19 - 72340172838076673L) & (~j19) & j14;
                                while (j24 != 0) {
                                    iNumberOfTrailingZeros = (i34 + (Long.numberOfTrailingZeros(j24) >> 3)) & i38;
                                    int i39 = i38;
                                    if (c0026h1.f63b[iNumberOfTrailingZeros] == i26) {
                                        break;
                                    }
                                    j24 &= j24 - 1;
                                    i38 = i39;
                                }
                                int i44 = i38;
                                if ((j18 & ((~j18) << 6) & j14) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i35 += 8;
                                i34 = (i34 + i35) & i44;
                                jArr4 = jArr2;
                                i29 = i44;
                                j17 = j15;
                            }
                            int i45 = iNumberOfTrailingZeros;
                            if (i45 >= 0) {
                                c0026h1.m66f(i45);
                            }
                        } else {
                            jArr2 = jArr4;
                            j15 = j17;
                            i13 = i14;
                        }
                        j17 = j15 >> i13;
                        i25++;
                        i14 = i13;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i24 != i14) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i19 == length2) {
                    break;
                }
                i19++;
                jArr4 = jArr;
                i14 = 8;
            }
        }
        c0023g0.m46c();
        AbstractC0050s abstractC0050sM7385t = m7385t();
        int[] iArr3 = abstractC0050sM7385t.f149b;
        Object[] objArr = abstractC0050sM7385t.f150c;
        long[] jArr6 = abstractC0050sM7385t.f148a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i46 = 0;
            while (true) {
                long j25 = jArr6[i46];
                if ((((~j25) << c3) & j25 & j14) != j14) {
                    int i47 = 8 - ((~(i46 - length3)) >>> 31);
                    for (int i48 = 0; i48 < i47; i48++) {
                        if ((j25 & j13) < j7) {
                            int i49 = (i46 << 3) + i48;
                            int i54 = iArr3[i49];
                            C18034p c18034p2 = ((C18035q) objArr[i49]).f69993a;
                            C18030l c18030l = c18034p2.f69989d;
                            C18043y c18043y = AbstractC18039u.f70037d;
                            if (c18030l.f69980w.m125c(c18043y) && c0026h1.m61a(i54)) {
                                m7368F(i54, 16, (String) c18034p2.f69989d.m51770c(c18043y));
                            }
                            c0023g0.m51h(i54, new C2459w2(c18034p2, m7385t()));
                        }
                        j25 >>= 8;
                    }
                    if (i47 != 8) {
                        break;
                    }
                }
                if (i46 == length3) {
                    break;
                } else {
                    i46++;
                }
            }
        }
        this.f9402K = new C2459w2(this.f9408d.getSemanticsOwner().m51794a(), m7385t());
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: b */
    public final C0783z mo5302b(View view) {
        return this.f9417m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final void m7375j(int i13, C18093f c18093f, String str, Bundle bundle) {
        C18034p c18034p;
        Region regionM7358N;
        float[] fArrM7357M;
        Rect rectM7356L;
        C16618c c16618c;
        RectF rectF;
        C16618c c16618cM47202h;
        AccessibilityNodeInfo accessibilityNodeInfo = c18093f.f70317a;
        C18035q c18035q = (C18035q) m7385t().m121b(i13);
        if (c18035q == null || (c18034p = c18035q.f69993a) == null) {
            return;
        }
        C18030l c18030l = c18034p.f69989d;
        C0057v0 c0057v0 = c18030l.f69980w;
        String strM7360u = m7360u(c18034p);
        if (AbstractC22676k.m65745e(str, this.f9398G)) {
            int iM23d = this.f9396E.m23d(i13);
            if (iM23d != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM23d);
                return;
            }
            return;
        }
        if (AbstractC22676k.m65745e(str, this.f9399H)) {
            int iM23d2 = this.f9397F.m23d(i13);
            if (iM23d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM23d2);
                return;
            }
            return;
        }
        NodeCoordinator nodeCoordinator = null;
        if (c0057v0.m125c(AbstractC18029k.f69954a) && bundle != null && AbstractC22676k.m65745e(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i14 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i15 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i15 > 0 && i14 >= 0) {
                if (i14 < (strM7360u != null ? strM7360u.length() : Integer.MAX_VALUE)) {
                    C23277r0 c23277r0M7420l = AbstractC2417o0.m7420l(c18030l);
                    if (c23277r0M7420l == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i16 = 0;
                    while (i16 < i15) {
                        int i17 = i14 + i16;
                        if (i17 >= c23277r0M7420l.f92227a.f92216a.f92135x.length()) {
                            arrayList.add(nodeCoordinator);
                            accessibilityNodeInfo = accessibilityNodeInfo;
                            i15 = i15;
                        } else {
                            C16618c c16618cM67333b = c23277r0M7420l.m67333b(i17);
                            NodeCoordinator nodeCoordinatorM51780d = c18034p.m51780d();
                            long jMo3523Z = 0;
                            if (nodeCoordinatorM51780d != null) {
                                if (!nodeCoordinatorM51780d.mo3533g1().f9141N) {
                                    nodeCoordinatorM51780d = nodeCoordinator;
                                }
                                if (nodeCoordinatorM51780d != null) {
                                    jMo3523Z = nodeCoordinatorM51780d.mo3523Z(0L);
                                }
                            }
                            C16618c c16618cM47206l = c16618cM67333b.m47206l(jMo3523Z);
                            C16618c c16618cM51783g = c18034p.m51783g();
                            if (c16618cM47206l.m47204j(c16618cM51783g)) {
                                c16618cM47202h = c16618cM47206l.m47202h(c16618cM51783g);
                            } else {
                                c16618c = nodeCoordinator;
                            }
                            if (c16618c != 0) {
                                c16618c = c16618cM47202h;
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(c16618c.f63940b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c16618c.f63939a)) << 32);
                                AndroidComposeView androidComposeView = this.f9408d;
                                long jM3591v = androidComposeView.m3591v(jFloatToRawIntBits);
                                long jM3591v2 = androidComposeView.m3591v((((long) Float.floatToRawIntBits(c16618c.f63941c)) << 32) | (((long) Float.floatToRawIntBits(c16618c.f63942d)) & 4294967295L));
                                int i18 = (int) (jM3591v >> 32);
                                int i19 = (int) (jM3591v2 >> 32);
                                int i24 = (int) (jM3591v & 4294967295L);
                                int i25 = (int) (jM3591v2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i18), Float.intBitsToFloat(i19)), Math.min(Float.intBitsToFloat(i24), Float.intBitsToFloat(i25)), Math.max(Float.intBitsToFloat(i18), Float.intBitsToFloat(i19)), Math.max(Float.intBitsToFloat(i24), Float.intBitsToFloat(i25)));
                            } else {
                                c16618c = c16618cM47202h;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i16++;
                        i15 = i15;
                        accessibilityNodeInfo = accessibilityNodeInfo;
                        nodeCoordinator = null;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        C18043y c18043y = AbstractC18039u.f70058y;
        if (c0057v0.m125c(c18043y) && bundle != null && AbstractC22676k.m65745e(str, "androidx.compose.ui.semantics.testTag")) {
            Object objM129g = c0057v0.m129g(c18043y);
            String str2 = (String) (objM129g == null ? null : objM129g);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (AbstractC22676k.m65745e(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, c18034p.f69992g);
            return;
        }
        if (AbstractC22676k.m65745e(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objM129g2 = c0057v0.m129g(AbstractC18039u.f70033O);
            InterfaceC17869a1 interfaceC17869a1 = (InterfaceC17869a1) (objM129g2 == null ? null : objM129g2);
            if (interfaceC17869a1 != null) {
                AbstractC17904p0 abstractC17904p0M7381p = m7381p(interfaceC17869a1, c18034p);
                if (abstractC17904p0M7381p instanceof C17900n0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m7356L(abstractC17904p0M7381p));
                    return;
                } else if (abstractC17904p0M7381p instanceof C17902o0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m7356L(abstractC17904p0M7381p));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m7357M(abstractC17904p0M7381p));
                    return;
                } else {
                    if (!(abstractC17904p0M7381p instanceof C17898m0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m7358N(abstractC17904p0M7381p));
                    return;
                }
            }
            return;
        }
        if (AbstractC22676k.m65745e(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objM129g3 = c0057v0.m129g(AbstractC18039u.f70033O);
            InterfaceC17869a1 interfaceC17869a2 = (InterfaceC17869a1) (objM129g3 == null ? null : objM129g3);
            if (interfaceC17869a2 == null || (rectM7356L = m7356L(m7381p(interfaceC17869a2, c18034p))) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectM7356L);
            return;
        }
        if (AbstractC22676k.m65745e(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objM129g4 = c0057v0.m129g(AbstractC18039u.f70033O);
            InterfaceC17869a1 interfaceC17869a3 = (InterfaceC17869a1) (objM129g4 == null ? null : objM129g4);
            if (interfaceC17869a3 == null || (fArrM7357M = m7357M(m7381p(interfaceC17869a3, c18034p))) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM7357M);
            return;
        }
        if (AbstractC22676k.m65745e(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objM129g5 = c0057v0.m129g(AbstractC18039u.f70033O);
            InterfaceC17869a1 interfaceC17869a4 = (InterfaceC17869a1) (objM129g5 == null ? null : objM129g5);
            if (interfaceC17869a4 == null || (regionM7358N = m7358N(m7381p(interfaceC17869a4, c18034p))) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionM7358N);
        }
    }

    /* JADX INFO: renamed from: k */
    public final Rect m7376k(C18035q c18035q) {
        C39179k c39179k = c18035q.f69994b;
        float f13 = c39179k.f168418a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(c39179k.f168419b)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
        AndroidComposeView androidComposeView = this.f9408d;
        long jM3591v = androidComposeView.m3591v(jFloatToRawIntBits);
        long jM3591v2 = androidComposeView.m3591v((((long) Float.floatToRawIntBits(c39179k.f168420c)) << 32) | (((long) Float.floatToRawIntBits(c39179k.f168421d)) & 4294967295L));
        int i13 = (int) (jM3591v >> 32);
        int i14 = (int) (jM3591v2 >> 32);
        int i15 = (int) (jM3591v & 4294967295L);
        int i16 = (int) (jM3591v2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14))), (int) Math.floor(Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16))));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0080 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[Catch: all -> 0x0037, LOOP:0: B:33:0x0084->B:34:0x0086, LOOP_END, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb A[Catch: all -> 0x00d5, TryCatch #0 {all -> 0x00d5, blocks: (B:39:0x00b8, B:41:0x00bc, B:43:0x00cb, B:47:0x00d8), top: B:55:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
    
        if (bc3.AbstractC3034m0.m8782b(r5, r2) == r3) goto L49;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f2 -> B:50:0x00f5). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7377l(s83.AbstractC32269c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p027b3.C2382h0.m7377l(s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX INFO: renamed from: m */
    public final boolean m7378m(int i13, long j7, boolean z4) {
        C18043y c18043y;
        int i14;
        if (!AbstractC22676k.m65745e(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        AbstractC0050s abstractC0050sM7385t = m7385t();
        if (C16617b.m47187c(j7, 9205357640488583168L) || (((9223372034707292159L & j7) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z4) {
            c18043y = AbstractC18039u.f70054u;
        } else {
            if (z4) {
                throw new NoWhenBranchMatchedException();
            }
            c18043y = AbstractC18039u.f70053t;
        }
        Object[] objArr = abstractC0050sM7385t.f150c;
        long[] jArr = abstractC0050sM7385t.f148a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i15 = 0;
        boolean z13 = false;
        while (true) {
            long j13 = jArr[i15];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8;
                int i17 = 8 - ((~(i15 - length)) >>> 31);
                int i18 = 0;
                while (i18 < i17) {
                    if ((255 & j13) < 128) {
                        C18035q c18035q = (C18035q) objArr[(i15 << 3) + i18];
                        C39179k c39179k = c18035q.f69994b;
                        float f13 = c39179k.f168418a;
                        i14 = i16;
                        float f14 = c39179k.f168419b;
                        float f15 = c39179k.f168420c;
                        float f16 = c39179k.f168421d;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                        if ((fIntBitsToFloat2 < f16) & (fIntBitsToFloat >= f13) & (fIntBitsToFloat < f15) & (fIntBitsToFloat2 >= f14)) {
                            Object objM129g = c18035q.f69993a.f69989d.f69980w.m129g(c18043y);
                            if (objM129g == null) {
                                objM129g = null;
                            }
                            C18028j c18028j = (C18028j) objM129g;
                            if (c18028j != null) {
                                InterfaceC4339a interfaceC4339a = c18028j.f69950a;
                                if (i13 < 0) {
                                    if (((Number) interfaceC4339a.invoke()).floatValue() > 0.0f) {
                                        z13 = true;
                                    }
                                } else if (((Number) interfaceC4339a.invoke()).floatValue() < ((Number) c18028j.f69951b.invoke()).floatValue()) {
                                    z13 = true;
                                }
                            }
                        }
                    } else {
                        i14 = i16;
                    }
                    j13 >>= i14;
                    i18++;
                    i16 = i14;
                }
                if (i17 != i16) {
                    return z13;
                }
            }
            if (i15 == length) {
                return z13;
            }
            i15++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m7379n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m7386v()) {
                m7365B(this.f9408d.getSemanticsOwner().m51794a(), this.f9402K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                m7370H(m7385t());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    m7374P();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: o */
    public final AccessibilityEvent m7380o(int i13, int i14) {
        C18035q c18035q;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i14);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.f9408d;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i13);
        if (m7386v() && (c18035q = (C18035q) m7385t().m121b(i13)) != null) {
            C18034p c18034p = c18035q.f69993a;
            accessibilityEventObtain.setPassword(c18034p.f69989d.f69980w.m125c(AbstractC18039u.f70028J));
            Object objM129g = c18034p.f69989d.f69980w.m129g(AbstractC18039u.f70047n);
            if (objM129g == null) {
                objM129g = null;
            }
            AbstractC37926s0.m121454F(accessibilityEventObtain, AbstractC22676k.m65745e(objM129g, Boolean.TRUE));
        }
        return accessibilityEventObtain;
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC17904p0 m7381p(InterfaceC17869a1 interfaceC17869a1, C18034p c18034p) {
        NodeCoordinator nodeCoordinatorM51780d = c18034p.m51780d();
        return interfaceC17869a1.mo39171a(AbstractC35744b.m113239l(nodeCoordinatorM51780d != null ? nodeCoordinatorM51780d.f168213y : 0L), c18034p.f69988c.f777Y, this.f9408d.getDensity());
    }

    /* JADX INFO: renamed from: q */
    public final AccessibilityEvent m7382q(int i13, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventM7380o = m7380o(i13, DfuBaseService.ERROR_REMOTE_MASK);
        if (num != null) {
            accessibilityEventM7380o.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventM7380o.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventM7380o.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventM7380o.getText().add(charSequence);
        }
        return accessibilityEventM7380o;
    }

    /* JADX INFO: renamed from: r */
    public final int m7383r(C18034p c18034p) {
        C18030l c18030l = c18034p.f69989d;
        C18030l c18030l2 = c18034p.f69989d;
        C18043y c18043y = AbstractC18039u.f70034a;
        if (!c18030l.f69980w.m125c(AbstractC18039u.f70034a)) {
            C18043y c18043y2 = AbstractC18039u.f70024F;
            if (c18030l2.f69980w.m125c(c18043y2)) {
                return (int) (((C23283u0) c18030l2.m51770c(c18043y2)).f92253a & 4294967295L);
            }
        }
        return this.f9427w;
    }

    /* JADX INFO: renamed from: s */
    public final int m7384s(C18034p c18034p) {
        C18030l c18030l = c18034p.f69989d;
        C18030l c18030l2 = c18034p.f69989d;
        C18043y c18043y = AbstractC18039u.f70034a;
        if (!c18030l.f69980w.m125c(AbstractC18039u.f70034a)) {
            C18043y c18043y2 = AbstractC18039u.f70024F;
            if (c18030l2.f69980w.m125c(c18043y2)) {
                return (int) (((C23283u0) c18030l2.m51770c(c18043y2)).f92253a >> 32);
            }
        }
        return this.f9427w;
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC0050s m7385t() {
        if (this.f9392A) {
            this.f9392A = false;
            AndroidComposeView androidComposeView = this.f9408d;
            this.f9394C = AbstractC18037s.m51797b(androidComposeView.getSemanticsOwner());
            if (m7386v()) {
                C0023g0 c0023g0 = this.f9394C;
                Resources resources = androidComposeView.getContext().getResources();
                C0017e0 c0017e0 = this.f9396E;
                c0017e0.m20a();
                C0017e0 c0017e1 = this.f9397F;
                c0017e1.m20a();
                C18035q c18035q = (C18035q) c0023g0.m121b(-1);
                C18034p c18034p = c18035q != null ? c18035q.f69993a : null;
                AbstractC22676k.m65747g(c18034p);
                ArrayList arrayListM51767b = AbstractC18020b0.m51767b(c18034p, new C0006a1(c0023g0, 8), new C0006a1(resources, 9), AbstractC37056f.m118958J(c18034p));
                int iM118951C = AbstractC37056f.m118951C(arrayListM51767b);
                int i13 = 1;
                if (1 <= iM118951C) {
                    while (true) {
                        int i14 = ((C18034p) arrayListM51767b.get(i13 - 1)).f69992g;
                        int i15 = ((C18034p) arrayListM51767b.get(i13)).f69992g;
                        c0017e0.m25f(i14, i15);
                        c0017e1.m25f(i15, i14);
                        if (i13 == iM118951C) {
                            break;
                        }
                        i13++;
                    }
                }
            }
        }
        return this.f9394C;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m7386v() {
        return this.f9411g.isEnabled() && !this.f9415k.isEmpty();
    }

    /* JADX INFO: renamed from: w */
    public final void m7387w(C0230n0 c0230n0) {
        if (this.f9429y.add(c0230n0)) {
            this.f9430z.mo32218s(C23454a0.f92919a);
        }
    }
}
