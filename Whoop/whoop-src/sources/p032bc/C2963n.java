package p032bc;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.AbstractC1314k2;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.RunnableC1319m;
import com.whoop.android.R;
import java.util.ArrayList;
import p009a8.RunnableC0533c;
import p012ab.C0682h0;
import p029b5.C2725d;

/* JADX INFO: renamed from: bc.n */
/* JADX INFO: loaded from: classes5.dex */
public class C2963n extends AbstractC1314k2 {
    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: a */
    public final void mo4090a(View view, Object obj) {
        ((AbstractC2974w) obj).mo8591b(view);
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: b */
    public final void mo4091b(Object obj, ArrayList arrayList) {
        AbstractC2974w abstractC2974w = (AbstractC2974w) obj;
        if (abstractC2974w == null) {
            return;
        }
        int i13 = 0;
        if (abstractC2974w instanceof C2942c0) {
            C2942c0 c2942c0 = (C2942c0) abstractC2974w;
            int size = c2942c0.f11829e0.size();
            while (i13 < size) {
                mo4091b(c2942c0.m8589Q(i13), arrayList);
                i13++;
            }
            return;
        }
        if (AbstractC1314k2.m4113k(abstractC2974w.f11911E) && AbstractC1314k2.m4113k(abstractC2974w.f11912F)) {
            int size2 = arrayList.size();
            while (i13 < size2) {
                abstractC2974w.mo8591b((View) arrayList.get(i13));
                i13++;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: c */
    public final void mo4114c(Object obj) {
        C2971t c2971t = (C2971t) obj;
        c2971t.m8641g();
        c2971t.f11898d.m43708a(c2971t.f11901g.f11930X + 1);
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: d */
    public final void mo4115d(Object obj, RunnableC0533c runnableC0533c) {
        C2971t c2971t = (C2971t) obj;
        c2971t.f11900f = runnableC0533c;
        c2971t.m8641g();
        c2971t.f11898d.m43708a(0.0f);
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: e */
    public final void mo4092e(ViewGroup viewGroup, Object obj) {
        AbstractC2938a0.m8568a(viewGroup, (AbstractC2974w) obj);
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: g */
    public final boolean mo4093g(Object obj) {
        return obj instanceof AbstractC2974w;
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: h */
    public final Object mo4094h(Object obj) {
        if (obj != null) {
            return ((AbstractC2974w) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: i */
    public final Object mo4116i(ViewGroup viewGroup, Object obj) {
        AbstractC2974w abstractC2974w = (AbstractC2974w) obj;
        ArrayList arrayList = AbstractC2938a0.f11825c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!abstractC2974w.mo8599v()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        AbstractC2974w abstractC2974wClone = abstractC2974w.clone();
        C2942c0 c2942c0 = new C2942c0();
        c2942c0.m8588P(abstractC2974wClone);
        AbstractC2938a0.m8570c(viewGroup, c2942c0);
        viewGroup.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC2977z viewTreeObserverOnPreDrawListenerC2977z = new ViewTreeObserverOnPreDrawListenerC2977z();
        viewTreeObserverOnPreDrawListenerC2977z.f11939w = c2942c0;
        viewTreeObserverOnPreDrawListenerC2977z.f11940x = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC2977z);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2977z);
        viewGroup.invalidate();
        C2971t c2971t = new C2971t(c2942c0);
        c2942c0.f11931Y = c2971t;
        c2942c0.m8646a(c2971t);
        return c2942c0.f11931Y;
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: l */
    public final boolean mo4095l() {
        return true;
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: m */
    public final boolean mo4096m(Object obj) {
        boolean zMo8599v = ((AbstractC2974w) obj).mo8599v();
        if (!zMo8599v) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zMo8599v;
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: n */
    public final Object mo4097n(Object obj, Object obj2, Object obj3) {
        AbstractC2974w abstractC2974w = (AbstractC2974w) obj;
        AbstractC2974w abstractC2974w2 = (AbstractC2974w) obj2;
        AbstractC2974w abstractC2974w3 = (AbstractC2974w) obj3;
        if (abstractC2974w != null && abstractC2974w2 != null) {
            C2942c0 c2942c0 = new C2942c0();
            c2942c0.m8588P(abstractC2974w);
            c2942c0.m8588P(abstractC2974w2);
            c2942c0.f11830f0 = false;
            abstractC2974w = c2942c0;
        } else if (abstractC2974w == null) {
            abstractC2974w = abstractC2974w2 != null ? abstractC2974w2 : null;
        }
        if (abstractC2974w3 == null) {
            return abstractC2974w;
        }
        C2942c0 c2942c1 = new C2942c0();
        if (abstractC2974w != null) {
            c2942c1.m8588P(abstractC2974w);
        }
        c2942c1.m8588P(abstractC2974w3);
        return c2942c1;
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: o */
    public final Object mo4098o(Object obj, Object obj2) {
        C2942c0 c2942c0 = new C2942c0();
        if (obj != null) {
            c2942c0.m8588P((AbstractC2974w) obj);
        }
        c2942c0.m8588P((AbstractC2974w) obj2);
        return c2942c0;
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: p */
    public final void mo4099p(Object obj, View view, ArrayList arrayList) {
        ((AbstractC2974w) obj).m8646a(new C2957k(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: q */
    public final void mo4100q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((AbstractC2974w) obj).m8646a(new C2959l(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: r */
    public final void mo4117r(Object obj, float f13) {
        C2971t c2971t = (C2971t) obj;
        boolean z4 = c2971t.f11896b;
        if (z4) {
            C2942c0 c2942c0 = c2971t.f11901g;
            long j7 = c2942c0.f11930X;
            long j13 = (long) (f13 * j7);
            if (j13 == 0) {
                j13 = 1;
            }
            if (j13 == j7) {
                j13 = j7 - 1;
            }
            if (c2971t.f11898d != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j14 = c2971t.f11895a;
            if (j13 == j14 || !z4) {
                return;
            }
            if (!c2971t.f11897c) {
                if (j13 == 0 && j14 > 0) {
                    j13 = -1;
                } else if (j13 == j7 && j14 < j7) {
                    j13 = j7 + 1;
                }
                if (j13 != j14) {
                    c2942c0.mo8580G(j13, j14);
                    c2971t.f11895a = j13;
                }
            }
            C0682h0 c0682h0 = c2971t.f11899e;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i13 = (c0682h0.f2432x + 1) % 20;
            c0682h0.f2432x = i13;
            ((long[]) c0682h0.f2433y)[i13] = jCurrentAnimationTimeMillis;
            ((float[]) c0682h0.f2434z)[i13] = j13;
        }
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: s */
    public final void mo4101s(View view, Object obj) {
        if (view != null) {
            AbstractC1314k2.m4112j(view, new Rect());
            ((AbstractC2974w) obj).mo8582I(new C2955j());
        }
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: t */
    public final void mo4102t(Object obj, Rect rect) {
        ((AbstractC2974w) obj).mo8582I(new C2955j());
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: u */
    public final void mo4103u(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, Object obj, C2725d c2725d, Runnable runnable) {
        mo4118v(obj, c2725d, null, runnable);
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: v */
    public final void mo4118v(Object obj, C2725d c2725d, RunnableC1319m runnableC1319m, Runnable runnable) {
        AbstractC2974w abstractC2974w = (AbstractC2974w) obj;
        C2953i c2953i = new C2953i(runnableC1319m, abstractC2974w, runnable);
        synchronized (c2725d) {
            while (c2725d.f10734x) {
                try {
                    try {
                        c2725d.wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (((C2953i) c2725d.f10735y) != c2953i) {
                c2725d.f10735y = c2953i;
                if (c2725d.f10733w) {
                    Runnable runnable2 = (Runnable) c2953i.f11859x;
                    AbstractC2974w abstractC2974w2 = (AbstractC2974w) c2953i.f11861z;
                    Runnable runnable3 = (Runnable) c2953i.f11860y;
                    if (runnable2 == null) {
                        abstractC2974w2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        abstractC2974w.m8646a(new C2961m(runnable));
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: w */
    public final void mo4104w(Object obj, View view, ArrayList arrayList) {
        C2942c0 c2942c0 = (C2942c0) obj;
        ArrayList arrayList2 = c2942c0.f11912F;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC1314k2.m4111f((View) arrayList.get(i13), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo4091b(c2942c0, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: x */
    public final void mo4105x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C2942c0 c2942c0 = (C2942c0) obj;
        if (c2942c0 != null) {
            ArrayList arrayList3 = c2942c0.f11912F;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            m8635z(c2942c0, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: y */
    public final Object mo4106y(Object obj) {
        if (obj == null) {
            return null;
        }
        C2942c0 c2942c0 = new C2942c0();
        c2942c0.m8588P((AbstractC2974w) obj);
        return c2942c0;
    }

    /* JADX INFO: renamed from: z */
    public final void m8635z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC2974w abstractC2974w = (AbstractC2974w) obj;
        int i13 = 0;
        if (abstractC2974w instanceof C2942c0) {
            C2942c0 c2942c0 = (C2942c0) abstractC2974w;
            int size = c2942c0.f11829e0.size();
            while (i13 < size) {
                m8635z(c2942c0.m8589Q(i13), arrayList, arrayList2);
                i13++;
            }
            return;
        }
        if (AbstractC1314k2.m4113k(abstractC2974w.f11911E)) {
            ArrayList arrayList3 = abstractC2974w.f11912F;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i13 < size2) {
                    abstractC2974w.mo8591b((View) arrayList2.get(i13));
                    i13++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    abstractC2974w.mo8577D((View) arrayList.get(size3));
                }
            }
        }
    }
}
