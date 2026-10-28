package p027b3;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p018ui.platform.AndroidComposeView;
import at.C1956b;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p026b2.RunnableC2296b;
import p088dc.AbstractC11894a;
import p164g2.AbstractC15235g;
import p164g2.C15232d;
import p164g2.C15240l;
import p181h2.C16618c;
import p208i2.AbstractC17918w0;
import p249jc.AbstractC21598x;
import p447r2.C30860a;
import p477s2.AbstractC32069a;
import p477s2.AbstractC32070b;
import p477s2.AbstractC32072d;
import p477s2.AbstractC32073e;
import p477s2.C32071c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2421p extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9476w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AndroidComposeView f9477x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2421p(AndroidComposeView androidComposeView, int i13) {
        super(1);
        this.f9476w = i13;
        this.f9477x = androidComposeView;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C15232d c15232dM43297a;
        int i13 = this.f9476w;
        boolean zRequestFocusFromTouch = false;
        AndroidComposeView androidComposeView = this.f9477x;
        switch (i13) {
            case 0:
                int i14 = ((C30860a) obj).f127256a;
                if (i14 == 1) {
                    zRequestFocusFromTouch = androidComposeView.isInTouchMode();
                } else if (i14 == 2) {
                    zRequestFocusFromTouch = androidComposeView.isInTouchMode() ? androidComposeView.requestFocusFromTouch() : true;
                }
                return Boolean.valueOf(zRequestFocusFromTouch);
            case 1:
                KeyEvent keyEventM99691b = ((C32071c) obj).m99691b();
                long jM99714D = AbstractC32073e.m99714D(keyEventM99691b);
                int i15 = AbstractC32070b.f133018r;
                if (AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99681s())) {
                    c15232dM43297a = C15232d.m43297a(2);
                } else if (AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99680r())) {
                    c15232dM43297a = C15232d.m43297a(1);
                } else if (AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99688z())) {
                    c15232dM43297a = C15232d.m43297a(AbstractC32073e.m99723O(keyEventM99691b) ? 2 : 1);
                } else if (AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99676n())) {
                    c15232dM43297a = C15232d.m43297a(4);
                } else if (AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99675m())) {
                    c15232dM43297a = C15232d.m43297a(3);
                } else if (AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99677o()) || AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99684v())) {
                    c15232dM43297a = C15232d.m43297a(5);
                } else if (AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99674l()) || AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99683u())) {
                    c15232dM43297a = C15232d.m43297a(6);
                } else if (AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99673k()) || AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99678p()) || AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99682t())) {
                    c15232dM43297a = C15232d.m43297a(7);
                } else {
                    c15232dM43297a = (AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99671i()) || AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99679q())) ? C15232d.m43297a(8) : null;
                }
                if (c15232dM43297a == null || !AbstractC32072d.m99701j(AbstractC32073e.m99720L(keyEventM99691b), 2)) {
                    return Boolean.FALSE;
                }
                Integer numM60705u0 = AbstractC21598x.m60705u0(c15232dM43297a.m43300d());
                C16618c embeddedViewFocusRect = androidComposeView.getEmbeddedViewFocusRect();
                Boolean boolM43344g = ((C15240l) androidComposeView.getFocusOwner()).m43344g(c15232dM43297a.m43300d(), embeddedViewFocusRect, new C2451v(c15232dM43297a, 1));
                if (boolM43344g != null ? boolM43344g.booleanValue() : true) {
                    return Boolean.TRUE;
                }
                if (!AbstractC15235g.m43332v(c15232dM43297a.m43300d())) {
                    return Boolean.FALSE;
                }
                if (numM60705u0 != null) {
                    int iIntValue = numM60705u0.intValue();
                    C1956b c1956b = C2364d2.f9330f;
                    C2364d2 c2364d2M31933A = AbstractC11894a.m31933A();
                    View viewM7289b = androidComposeView;
                    while (true) {
                        if (viewM7289b != null) {
                            View rootView = androidComposeView.getRootView();
                            AbstractC22676k.m65748h(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                            viewM7289b = c2364d2M31933A.m7289b(iIntValue, viewM7289b, (ViewGroup) rootView);
                            if (viewM7289b != null) {
                                if (!viewM7289b.equals(androidComposeView)) {
                                    ViewParent parent = viewM7289b.getParent();
                                    while (true) {
                                        if (parent != null) {
                                            if (parent != androidComposeView) {
                                                parent = parent.getParent();
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            viewM7289b = null;
                        }
                    }
                    if (AbstractC22676k.m65745e(viewM7289b, androidComposeView)) {
                        viewM7289b = null;
                    }
                    if (viewM7289b != null) {
                        Rect rectM51502D = embeddedViewFocusRect != null ? AbstractC17918w0.m51502D(embeddedViewFocusRect) : null;
                        if (rectM51502D == null) {
                            throw new IllegalStateException("Invalid rect");
                        }
                        View rootView2 = androidComposeView.getRootView();
                        AbstractC22676k.m65748h(rootView2, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) rootView2;
                        viewGroup.offsetDescendantRectToMyCoords(androidComposeView, rectM51502D);
                        viewGroup.offsetRectIntoDescendantCoords(viewM7289b, rectM51502D);
                        if (AbstractC21598x.m60693o0(viewM7289b, numM60705u0, rectM51502D)) {
                            return Boolean.TRUE;
                        }
                    }
                }
                if (!((C15240l) androidComposeView.getFocusOwner()).m43341d(c15232dM43297a.m43300d(), false, false)) {
                    return Boolean.TRUE;
                }
                Boolean boolM43344g2 = ((C15240l) androidComposeView.getFocusOwner()).m43344g(c15232dM43297a.m43300d(), null, new C2451v(c15232dM43297a, 0));
                return Boolean.valueOf(boolM43344g2 != null ? boolM43344g2.booleanValue() : true);
            default:
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj;
                Handler handler = androidComposeView.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC4339a.invoke();
                } else {
                    Handler handler2 = androidComposeView.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC2296b(interfaceC4339a, 1));
                    }
                }
                return C23454a0.f92919a;
        }
    }
}
