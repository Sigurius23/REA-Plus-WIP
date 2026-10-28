package p028b4;

import a20.C0167g;
import a61.C0468a;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.node.C1134a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.FragmentContainerView;
import b01.C2185f;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.C21061j;
import p000.C24827m;
import p000.C29656q;
import p003a1.C0103b;
import p005a3.AbstractC0201g;
import p005a3.C0230n0;
import p026b2.AbstractC2316v;
import p164g2.AbstractC15235g;
import p164g2.C15240l;
import p164g2.C15252x;
import p164g2.InterfaceC15239k;
import p181h2.C16618c;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: b4.n */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2703n {

    /* JADX INFO: renamed from: a */
    public static final C2702m f10646a = new C2702m();

    /* JADX INFO: renamed from: a */
    public static final void m7582a(Function3 function3, Modifier modifier, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1985291610);
        int i14 = (c28655q.m87157i(function3) ? 4 : 2) | i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        int i15 = i14 | (c28655q.m87157i(function1) ? 256 : 128);
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            m7583b(function3, modifier, null, function1, c28655q, (i15 & 14) | 384 | (i15 & 112) | ((i15 << 6) & 57344));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(function3, modifier, function1, i13, 7);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m7583b(Function3 function3, Modifier modifier, Function1 function1, Function1 function2, Composer composer, int i13) {
        int i14;
        Function1 function4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(509101952);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(function3) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(null) ? 256 : 128;
        }
        int i15 = i14 | 3072;
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(function2) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C2185f(26);
                c28655q.m87172p0(objM87133R);
            }
            function4 = (Function1) objM87133R;
            View view = (View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f);
            boolean zM87153g = c28655q.m87153g(view);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                try {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4130F = AbstractC1329o1.m4130F(view);
                    if (abstractComponentCallbacksC1320m0M4130F == null) {
                        throw new IllegalStateException("View " + view + " does not have a Fragment set");
                    }
                    objM87133R2 = abstractComponentCallbacksC1320m0M4130F;
                } catch (IllegalStateException unused) {
                    objM87133R2 = null;
                }
                c28655q.m87172p0(objM87133R2);
            }
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) objM87133R2;
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            boolean zM87157i = ((i15 & 14) == 4) | c28655q.m87157i(abstractComponentCallbacksC1320m0);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C0167g(28, abstractComponentCallbacksC1320m0, function3);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function5 = (Function1) objM87133R3;
            c28655q.m87150e0(1128086696);
            c28655q.m87173q(false);
            boolean zM87157i2 = ((i15 & 7168) == 2048) | c28655q.m87157i(abstractComponentCallbacksC1320m0) | c28655q.m87157i(context);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i2 || objM87133R4 == c28676v0) {
                objM87133R4 = new C29656q(function4, (Object) abstractComponentCallbacksC1320m0, (Object) context, 9);
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function6 = (Function1) objM87133R4;
            boolean z4 = (57344 & i15) == 16384;
            Object objM87133R5 = c28655q.m87133R();
            if (z4 || objM87133R5 == c28676v0) {
                objM87133R5 = new C0468a(function2, 5);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC1137a.m3602b(function5, modifier, null, function6, (Function1) objM87133R5, c28655q, i15 & 112, 0);
        } else {
            c28655q.m87138X();
            function4 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24827m(function3, modifier, function4, function2, i13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m7584c(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final Rect m7585d(InterfaceC15239k interfaceC15239k, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        C15252x c15252xM43318h = AbstractC15235g.m43318h(((C15240l) interfaceC15239k).f57241c);
        C16618c c16618cM43321k = c15252xM43318h != null ? AbstractC15235g.m43321k(c15252xM43318h) : null;
        if (c16618cM43321k == null) {
            return null;
        }
        int i13 = (int) c16618cM43321k.f63939a;
        int i14 = iArr[0];
        int i15 = iArr2[0];
        int i16 = (int) c16618cM43321k.f63940b;
        int i17 = iArr[1];
        int i18 = iArr2[1];
        return new Rect((i13 + i14) - i15, (i16 + i17) - i18, (((int) c16618cM43321k.f63941c) + i14) - i15, (((int) c16618cM43321k.f63942d) + i17) - i18);
    }

    /* JADX INFO: renamed from: e */
    public static final View m7586e(AbstractC2316v abstractC2316v) {
        AbstractC2701l abstractC2701l = AbstractC0201g.m516p(abstractC2316v.f9142w).f766N;
        View interopView = abstractC2701l != null ? abstractC2701l.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    /* JADX INFO: renamed from: f */
    public static final void m7587f(View view, C0230n0 c0230n0) {
        long jMo3523Z = ((C1134a) c0230n0.f783e0.f740d).mo3523Z(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jMo3523Z >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jMo3523Z & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: renamed from: g */
    public static final float m7588g(int i13) {
        return i13 * (-1);
    }

    /* JADX INFO: renamed from: h */
    public static final float m7589h(float f13) {
        return f13 * (-1.0f);
    }

    /* JADX INFO: renamed from: i */
    public static final int m7590i(int i13) {
        return i13 == 0 ? 1 : 2;
    }

    /* JADX INFO: renamed from: j */
    public static final void m7591j(ViewGroup viewGroup, C0103b c0103b) {
        if (viewGroup instanceof FragmentContainerView) {
            c0103b.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            if (childAt instanceof ViewGroup) {
                m7591j((ViewGroup) childAt, c0103b);
            }
        }
    }
}
