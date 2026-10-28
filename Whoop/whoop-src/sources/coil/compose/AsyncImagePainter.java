package coil.compose;

import a11.C0129g;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import androidx.room.C1849z1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3004e2;
import bh.C3247j;
import bh.InterfaceC3242e;
import ch.AbstractC4585f;
import ch.AbstractC4590k;
import ch.C4584e;
import com.google.accompanist.drawablepainter.DrawablePainter;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import hc3.AbstractC17182o;
import hc3.C17171d;
import kc3.C22365e;
import mh.AbstractC25543k;
import mh.C25540h;
import mh.C25542j;
import mh.C25547o;
import p181h2.C16620e;
import p208i2.AbstractC17921y;
import p208i2.C17885g;
import p270k2.InterfaceC22131e;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28633k1;
import p390p1.InterfaceC28691z1;
import p425qh.AbstractC30356b;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p635y2.InterfaceC39105k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import ph.C29228b;
import ph.InterfaceC29232f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m65681d2 = {"Lcoil/compose/AsyncImagePainter;", "Ln2/a;", "Lp1/z1;", "ch/f", "coil-compose-base_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class AsyncImagePainter extends AbstractC26165a implements InterfaceC28691z1 {

    /* JADX INFO: renamed from: T */
    public static final C0129g f20210T = new C0129g(23);

    /* JADX INFO: renamed from: E */
    public C17171d f20211E;

    /* JADX INFO: renamed from: F */
    public final C13045h2 f20212F = AbstractC13091v.m36593c(new C16620e(0));

    /* JADX INFO: renamed from: G */
    public final C28633k1 f20213G = AbstractC28683x.m87272z(null);

    /* JADX INFO: renamed from: H */
    public final C28617g1 f20214H = new C28617g1(1.0f);

    /* JADX INFO: renamed from: I */
    public final C28633k1 f20215I = AbstractC28683x.m87272z(null);

    /* JADX INFO: renamed from: J */
    public AbstractC4585f f20216J;

    /* JADX INFO: renamed from: K */
    public AbstractC26165a f20217K;

    /* JADX INFO: renamed from: L */
    public Function1 f20218L;

    /* JADX INFO: renamed from: M */
    public Function1 f20219M;

    /* JADX INFO: renamed from: N */
    public InterfaceC39105k f20220N;

    /* JADX INFO: renamed from: O */
    public int f20221O;

    /* JADX INFO: renamed from: P */
    public boolean f20222P;

    /* JADX INFO: renamed from: Q */
    public final C28633k1 f20223Q;

    /* JADX INFO: renamed from: R */
    public final C28633k1 f20224R;

    /* JADX INFO: renamed from: S */
    public final C28633k1 f20225S;

    public AsyncImagePainter(C25542j c25542j, InterfaceC3242e interfaceC3242e) {
        C4584e c4584e = C4584e.f18465a;
        this.f20216J = c4584e;
        this.f20218L = f20210T;
        this.f20220N = C39102j.f168200b;
        this.f20221O = 1;
        this.f20223Q = AbstractC28683x.m87272z(c4584e);
        this.f20224R = AbstractC28683x.m87272z(c25542j);
        this.f20225S = AbstractC28683x.m87272z(interfaceC3242e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: a */
    public final void mo15502a() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.f20211E == null) {
                C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
                C22365e c22365e = AbstractC3050q0.f12077a;
                C17171d c17171dM8708b = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(c3004e2M8710d, AbstractC17182o.f65999a.mo8825s()));
                this.f20211E = c17171dM8708b;
                AbstractC26165a abstractC26165a = this.f20217K;
                Object[] objArr = 0;
                InterfaceC28691z1 interfaceC28691z1 = abstractC26165a instanceof InterfaceC28691z1 ? (InterfaceC28691z1) abstractC26165a : null;
                if (interfaceC28691z1 != null) {
                    interfaceC28691z1.mo15502a();
                }
                if (this.f20222P) {
                    C25540h c25540hM75122a = C25542j.m75122a((C25542j) this.f20224R.getValue());
                    c25540hM75122a.f100078b = ((C3247j) ((InterfaceC3242e) this.f20225S.getValue())).f12727b;
                    c25540hM75122a.f100101y = null;
                    C25542j c25542jM75117a = c25540hM75122a.m75117a();
                    Integer num = c25542jM75117a.f100103B;
                    c25542jM75117a.f100107F.getClass();
                    Drawable drawableM92826b = AbstractC30356b.m92826b(c25542jM75117a, num);
                    m15506k(new AsyncImagePainter$State$Loading(drawableM92826b != null ? m15505j(drawableM92826b) : null));
                } else {
                    AbstractC3006f0.m8732z(c17171dM8708b, null, null, new C1849z1(this, objArr == true ? 1 : 0, 1), 3);
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: b */
    public final void mo3489b(float f13) {
        this.f20214H.m87023y(f13);
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: c */
    public final void mo15503c() {
        C17171d c17171d = this.f20211E;
        if (c17171d != null) {
            AbstractC3006f0.m8714h(c17171d, null);
        }
        this.f20211E = null;
        Object obj = this.f20217K;
        InterfaceC28691z1 interfaceC28691z1 = obj instanceof InterfaceC28691z1 ? (InterfaceC28691z1) obj : null;
        if (interfaceC28691z1 != null) {
            interfaceC28691z1.mo15503c();
        }
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: d */
    public final void mo15504d() {
        C17171d c17171d = this.f20211E;
        if (c17171d != null) {
            AbstractC3006f0.m8714h(c17171d, null);
        }
        this.f20211E = null;
        Object obj = this.f20217K;
        InterfaceC28691z1 interfaceC28691z1 = obj instanceof InterfaceC28691z1 ? (InterfaceC28691z1) obj : null;
        if (interfaceC28691z1 != null) {
            interfaceC28691z1.mo15504d();
        }
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: e */
    public final void mo3490e(AbstractC17921y abstractC17921y) {
        this.f20215I.setValue(abstractC17921y);
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: h */
    public final long getF4822H() {
        AbstractC26165a abstractC26165a = (AbstractC26165a) this.f20213G.getValue();
        if (abstractC26165a != null) {
            return abstractC26165a.getF4822H();
        }
        return 9205357640488583168L;
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: i */
    public final void mo3492i(InterfaceC22131e interfaceC22131e) {
        C16620e c16620e = new C16620e(interfaceC22131e.mo731d());
        C13045h2 c13045h2 = this.f20212F;
        c13045h2.getClass();
        c13045h2.m36571k(null, c16620e);
        AbstractC26165a abstractC26165a = (AbstractC26165a) this.f20213G.getValue();
        if (abstractC26165a != null) {
            abstractC26165a.m77712g(interfaceC22131e, interfaceC22131e.mo731d(), this.f20214H.m87022x(), (AbstractC17921y) this.f20215I.getValue());
        }
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC26165a m15505j(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? AbstractC34132o.m107877a(new C17885g(((BitmapDrawable) drawable).getBitmap()), this.f20221O) : new DrawablePainter(drawable.mutate());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public final void m15506k(AbstractC4585f abstractC4585f) {
        AbstractC25543k abstractC25543k;
        AbstractC26165a painter;
        Function1 function1;
        Object painter2;
        InterfaceC28691z1 interfaceC28691z1;
        InterfaceC28691z1 interfaceC28691z2;
        AbstractC4585f abstractC4585f2 = this.f20216J;
        AbstractC4585f abstractC4585f3 = (AbstractC4585f) this.f20218L.invoke(abstractC4585f);
        this.f20216J = abstractC4585f3;
        this.f20223Q.setValue(abstractC4585f3);
        if (!(abstractC4585f3 instanceof AsyncImagePainter$State$Success)) {
            if (abstractC4585f3 instanceof AsyncImagePainter$State$Error) {
                abstractC25543k = ((AsyncImagePainter$State$Error) abstractC4585f3).f20226a;
            } else {
                painter = null;
            }
            if (painter == null) {
                painter = abstractC4585f3.getPainter();
            }
            this.f20217K = painter;
            this.f20213G.setValue(painter);
            if (this.f20211E != null && abstractC4585f2.getPainter() != abstractC4585f3.getPainter()) {
                painter2 = abstractC4585f2.getPainter();
                if (painter2 instanceof InterfaceC28691z1) {
                    interfaceC28691z1 = (InterfaceC28691z1) painter2;
                } else {
                    interfaceC28691z1 = null;
                }
                if (interfaceC28691z1 != null) {
                    interfaceC28691z1.mo15504d();
                }
                Object painter3 = abstractC4585f3.getPainter();
                interfaceC28691z2 = painter3 instanceof InterfaceC28691z1 ? (InterfaceC28691z1) painter3 : null;
                if (interfaceC28691z2 != null) {
                    interfaceC28691z2.mo15502a();
                }
            }
            function1 = this.f20219M;
            if (function1 != null) {
                function1.invoke(abstractC4585f3);
            }
        }
        abstractC25543k = ((AsyncImagePainter$State$Success) abstractC4585f3).f20227a;
        InterfaceC29232f interfaceC29232fMo88737a = abstractC25543k.mo75115b().f100117j.mo88737a(AbstractC4590k.f18472a, abstractC25543k);
        if (interfaceC29232fMo88737a instanceof C29228b) {
            painter = new CrossfadePainter(abstractC4585f2 instanceof AsyncImagePainter$State$Loading ? abstractC4585f2.getPainter() : null, abstractC4585f3.getPainter(), this.f20220N, ((C29228b) interfaceC29232fMo88737a).f118302c, ((abstractC25543k instanceof C25547o) && ((C25547o) abstractC25543k).f100158g) ? false : true);
        } else {
            painter = null;
        }
        if (painter == null) {
            painter = abstractC4585f3.getPainter();
        }
        this.f20217K = painter;
        this.f20213G.setValue(painter);
        if (this.f20211E != null) {
            painter2 = abstractC4585f2.getPainter();
            if (painter2 instanceof InterfaceC28691z1) {
                interfaceC28691z1 = (InterfaceC28691z1) painter2;
            } else {
                interfaceC28691z1 = null;
            }
            if (interfaceC28691z1 != null) {
                interfaceC28691z1.mo15504d();
            }
            Object painter4 = abstractC4585f3.getPainter();
            if (painter4 instanceof InterfaceC28691z1) {
            }
            if (interfaceC28691z2 != null) {
                interfaceC28691z2.mo15502a();
            }
        }
        function1 = this.f20219M;
        if (function1 != null) {
            function1.invoke(abstractC4585f3);
        }
    }
}
