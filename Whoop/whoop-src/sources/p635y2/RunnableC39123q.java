package p635y2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.p018ui.layout.AbstractC1133c;
import androidx.datastore.preferences.protobuf.AbstractC1230l;
import io.sentry.internal.debugmeta.C20378c;
import java.util.List;
import java.util.WeakHashMap;
import p002a0.C0023g0;
import p002a0.C0047q0;
import p002a0.C0057v0;
import p002a0.C0059w0;
import p184h5.AbstractC16863c1;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16866d1;
import p184h5.C16876h;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.InterfaceC28601c1;
import p543v4.C35643b;
import p668z1.AbstractC39963l;
import p668z1.C39967p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y2.q */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC39123q extends AbstractC1230l implements Runnable, InterfaceC16915u, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: E */
    public int f168259E;

    /* JADX INFO: renamed from: F */
    public C16905q1 f168260F;

    /* JADX INFO: renamed from: G */
    public final C0057v0 f168261G;

    /* JADX INFO: renamed from: H */
    public final C28621h1 f168262H;

    /* JADX INFO: renamed from: I */
    public final C0047q0 f168263I;

    /* JADX INFO: renamed from: J */
    public final C39967p f168264J;

    /* JADX INFO: renamed from: z */
    public boolean f168265z;

    public RunnableC39123q() {
        super(1);
        C0057v0 c0057v0 = new C0057v0(9);
        InterfaceC39078b2.f168134a.getClass();
        c0057v0.m135m(C39074a2.f168120b, new C39086d2("caption bar"));
        c0057v0.m135m(C39074a2.f168121c, new C39086d2("display cutout"));
        c0057v0.m135m(C39074a2.f168122d, new C39086d2("ime"));
        c0057v0.m135m(C39074a2.f168123e, new C39086d2("mandatory system gestures"));
        c0057v0.m135m(C39074a2.f168124f, new C39086d2("navigation bars"));
        c0057v0.m135m(C39074a2.f168125g, new C39086d2("status bars"));
        c0057v0.m135m(C39074a2.f168126h, new C39086d2("system gestures"));
        c0057v0.m135m(C39074a2.f168127i, new C39086d2("tappable element"));
        c0057v0.m135m(C39074a2.f168128j, new C39086d2("waterfall"));
        this.f168261G = c0057v0;
        this.f168262H = new C28621h1(0);
        this.f168263I = new C0047q0(4);
        this.f168264J = new C39967p();
    }

    /* JADX INFO: renamed from: K */
    public final void m124654K(C16905q1 c16905q1) {
        char c3;
        char c7;
        char c14;
        char c15;
        long j7;
        boolean z4;
        boolean z13;
        boolean z14;
        long j13;
        boolean z15;
        boolean z16;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long[] jArr4;
        int[] iArr4;
        int i13;
        C0023g0 c0023g0 = AbstractC1133c.f4850a;
        int[] iArr5 = c0023g0.f149b;
        Object[] objArr = c0023g0.f150c;
        long[] jArr5 = c0023g0.f148a;
        int length = jArr5.length - 2;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            z13 = false;
            z14 = false;
            c3 = 7;
            c7 = 16;
            c14 = ' ';
            while (true) {
                long j14 = jArr5[i15];
                c15 = '0';
                j7 = -9187201950435737472L;
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j14 & 255) < 128) {
                            int i18 = (i15 << 3) + i17;
                            int i19 = iArr5[i18];
                            InterfaceC39078b2 interfaceC39078b2 = (InterfaceC39078b2) objArr[i18];
                            i13 = i14;
                            C35643b c35643bMo47530g = c16905q1.f64864a.mo47530g(i19);
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            long j15 = (((long) c35643bMo47530g.f151450b) << 32) | (((long) c35643bMo47530g.f151449a) << 48) | (((long) c35643bMo47530g.f151451c) << 16) | ((long) c35643bMo47530g.f151452d);
                            Object objM129g = this.f168261G.m129g(interfaceC39078b2);
                            AbstractC22676k.m65747g(objM129g);
                            C39086d2 c39086d2 = (C39086d2) objM129g;
                            if (!AbstractC39125q1.m124661g(j15, c39086d2.f168151h)) {
                                c39086d2.f168151h = j15;
                                z13 = true;
                                if (!AbstractC39125q1.m124661g(j15, 0L)) {
                                    z14 = true;
                                }
                            }
                        } else {
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            i13 = i14;
                        }
                        j14 >>= i13;
                        i17++;
                        i14 = i13;
                        iArr5 = iArr4;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z4 = true;
                    if (i16 != i14) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z4 = true;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                iArr5 = iArr3;
                jArr5 = jArr3;
                i14 = 8;
            }
        } else {
            c3 = 7;
            c7 = 16;
            c14 = ' ';
            c15 = '0';
            j7 = -9187201950435737472L;
            z4 = true;
            z13 = false;
            z14 = false;
        }
        C0023g0 c0023g1 = AbstractC1133c.f4852c;
        int[] iArr6 = c0023g1.f149b;
        Object[] objArr2 = c0023g1.f150c;
        long[] jArr6 = c0023g1.f148a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i24 = 0;
            while (true) {
                long j16 = jArr6[i24];
                if ((((~j16) << c3) & j16 & j7) != j7) {
                    int i25 = 8 - ((~(i24 - length2)) >>> 31);
                    int i26 = 0;
                    while (i26 < i25) {
                        if ((j16 & 255) < 128) {
                            int i27 = (i24 << 3) + i26;
                            int i28 = iArr6[i27];
                            Object objM129g2 = this.f168261G.m129g((InterfaceC39078b2) objArr2[i27]);
                            AbstractC22676k.m65747g(objM129g2);
                            C39086d2 c39086d3 = (C39086d2) objM129g2;
                            if (i28 != 8) {
                                C35643b c35643bMo47531h = c16905q1.f64864a.mo47531h(i28);
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                long j17 = (((long) c35643bMo47531h.f151450b) << c14) | (((long) c35643bMo47531h.f151449a) << c15) | (((long) c35643bMo47531h.f151451c) << c7) | ((long) c35643bMo47531h.f151452d);
                                if (!AbstractC39125q1.m124661g(c39086d3.f168152i, j17)) {
                                    c39086d3.f168152i = j17;
                                    z13 = z4;
                                    if (!AbstractC39125q1.m124661g(j17, 0L)) {
                                        z14 = z13;
                                    }
                                }
                            } else {
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                            }
                            c39086d3.f168144a.setValue(Boolean.valueOf(c16905q1.f64864a.mo47535q(i28)));
                        } else {
                            jArr2 = jArr6;
                            iArr2 = iArr6;
                        }
                        j16 >>= 8;
                        i26++;
                        jArr6 = jArr2;
                        iArr6 = iArr2;
                    }
                    jArr = jArr6;
                    iArr = iArr6;
                    if (i25 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    iArr = iArr6;
                }
                if (i24 == length2) {
                    break;
                }
                i24++;
                jArr6 = jArr;
                iArr6 = iArr;
            }
        }
        C16876h c16876hMo47550f = c16905q1.f64864a.mo47550f();
        if (c16876hMo47550f == null) {
            j13 = 0;
        } else {
            C35643b c35643bM47505a = c16876hMo47550f.m47505a();
            j13 = (((long) c35643bM47505a.f151449a) << c15) | (((long) c35643bM47505a.f151450b) << c14) | (((long) c35643bM47505a.f151451c) << c7) | ((long) c35643bM47505a.f151452d);
        }
        C0057v0 c0057v0 = this.f168261G;
        InterfaceC39078b2.f168134a.getClass();
        Object objM129g3 = c0057v0.m129g(C39074a2.f168128j);
        AbstractC22676k.m65747g(objM129g3);
        C39086d2 c39086d4 = (C39086d2) objM129g3;
        if (!AbstractC39125q1.m124661g(c39086d4.f168151h, j13)) {
            c39086d4.f168151h = j13;
            c39086d4.f168152i = j13;
            z13 = z4;
            if (!AbstractC39125q1.m124661g(j13, 0L)) {
                z14 = z13;
            }
        }
        long safeInsetTop = c16876hMo47550f == null ? 0L : (((long) c16876hMo47550f.f64821a.getSafeInsetTop()) << c14) | (((long) c16876hMo47550f.f64821a.getSafeInsetLeft()) << c15) | (((long) c16876hMo47550f.f64821a.getSafeInsetRight()) << c7) | ((long) c16876hMo47550f.f64821a.getSafeInsetBottom());
        Object objM129g4 = this.f168261G.m129g(C39074a2.f168121c);
        AbstractC22676k.m65747g(objM129g4);
        C39086d2 c39086d5 = (C39086d2) objM129g4;
        if (!AbstractC39125q1.m124661g(safeInsetTop, c39086d5.f168151h)) {
            c39086d5.f168151h = safeInsetTop;
            c39086d5.f168152i = safeInsetTop;
            z13 = z4;
            if (!AbstractC39125q1.m124661g(safeInsetTop, 0L)) {
                z14 = z13;
            }
        }
        if (c16876hMo47550f == null) {
            C0047q0 c0047q0 = this.f168263I;
            if (c0047q0.f137b > 0) {
                c0047q0.m100c();
                this.f168264J.clear();
                z13 = z4;
            }
        } else {
            List<Rect> boundingRects = c16876hMo47550f.f64821a.getBoundingRects();
            int size = boundingRects.size();
            C0047q0 c0047q1 = this.f168263I;
            if (size < c0047q1.f137b) {
                c0047q1.m108k(boundingRects.size(), this.f168263I.f137b);
                this.f168264J.m128186y0(boundingRects.size(), this.f168264J.size());
                z13 = z4;
            } else {
                int size2 = boundingRects.size() - this.f168263I.f137b;
                int i29 = 0;
                while (i29 < size2) {
                    C0047q0 c0047q2 = this.f168263I;
                    c0047q2.m98a(AbstractC28683x.m87272z(boundingRects.get(c0047q2.f137b)));
                    this.f168264J.add(new C39120p("display cutout rect " + this.f168263I.f137b));
                    i29++;
                    z13 = z4;
                }
            }
            List<Rect> list = boundingRects;
            int size3 = list.size();
            for (int i34 = 0; i34 < size3; i34++) {
                Rect rect = boundingRects.get(i34);
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f168263I.m102e(i34);
                if (!AbstractC22676k.m65745e(interfaceC28601c1.getValue(), rect)) {
                    interfaceC28601c1.setValue(rect);
                    z13 = z4;
                }
            }
            if (!list.isEmpty()) {
                z14 = z4;
            }
        }
        if ((z14 || this.f168262H.m87024x() != 0) && z13) {
            C28621h1 c28621h1 = this.f168262H;
            c28621h1.m87025y(c28621h1.m87024x() + 1);
            synchronized (AbstractC39963l.f172462c) {
                C0059w0 c0059w0 = AbstractC39963l.f172469j.f172413h;
                z15 = (c0059w0 == null || c0059w0.m143h() != (z16 = z4)) ? false : z16;
            }
            if (z15) {
                AbstractC39963l.m128161a();
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: g */
    public final void mo3872g(C16866d1 c16866d1) {
        boolean z4 = false;
        this.f168265z = false;
        int iMo47490c = c16866d1.f64800a.mo47490c();
        this.f168259E &= ~iMo47490c;
        this.f168260F = null;
        InterfaceC39078b2 interfaceC39078b2 = (InterfaceC39078b2) AbstractC1133c.f4852c.m121b(iMo47490c);
        if (interfaceC39078b2 != null) {
            Object objM129g = this.f168261G.m129g(interfaceC39078b2);
            AbstractC22676k.m65747g(objM129g);
            C39086d2 c39086d2 = (C39086d2) objM129g;
            c39086d2.f168146c.m87023y(0.0f);
            c39086d2.f168148e.m87023y(1.0f);
            c39086d2.f168147d.m87033y(0L);
            c39086d2.f168146c.m87023y(0.0f);
            c39086d2.f168145b.setValue(Boolean.FALSE);
            c39086d2.f168153j = -1L;
            c39086d2.f168154k = -1L;
            C28621h1 c28621h1 = this.f168262H;
            c28621h1.m87025y(c28621h1.m87024x() + 1);
            synchronized (AbstractC39963l.f172462c) {
                C0059w0 c0059w0 = AbstractC39963l.f172469j.f172413h;
                if (c0059w0 != null && c0059w0.m143h()) {
                    z4 = true;
                }
            }
            if (z4) {
                AbstractC39963l.m128161a();
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: h */
    public final void mo3873h() {
        this.f168265z = true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: i */
    public final C16905q1 mo3874i(C16905q1 c16905q1, List list) {
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            C16866d1 c16866d1 = (C16866d1) list.get(i13);
            InterfaceC39078b2 interfaceC39078b2 = (InterfaceC39078b2) AbstractC1133c.f4852c.m121b(c16866d1.f64800a.mo47490c());
            if (interfaceC39078b2 != null) {
                Object objM129g = this.f168261G.m129g(interfaceC39078b2);
                AbstractC22676k.m65747g(objM129g);
                C39086d2 c39086d2 = (C39086d2) objM129g;
                if (((Boolean) c39086d2.f168145b.getValue()).booleanValue()) {
                    AbstractC16863c1 abstractC16863c1 = c16866d1.f64800a;
                    c39086d2.f168146c.m87023y(abstractC16863c1.mo47489b());
                    c39086d2.f168148e.m87023y(0.0f);
                    c39086d2.f168147d.m87033y(abstractC16863c1.mo47488a());
                }
            }
        }
        m124654K(c16905q1);
        return c16905q1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: j */
    public final C20378c mo3875j(C16866d1 c16866d1, C20378c c20378c) {
        C16905q1 c16905q1 = this.f168260F;
        boolean z4 = false;
        this.f168265z = false;
        this.f168260F = null;
        if (c16866d1.f64800a.mo47488a() > 0 && c16905q1 != null) {
            int iMo47490c = c16866d1.f64800a.mo47490c();
            this.f168259E |= iMo47490c;
            InterfaceC39078b2 interfaceC39078b2 = (InterfaceC39078b2) AbstractC1133c.f4852c.m121b(iMo47490c);
            if (interfaceC39078b2 != null) {
                Object objM129g = this.f168261G.m129g(interfaceC39078b2);
                AbstractC22676k.m65747g(objM129g);
                C39086d2 c39086d2 = (C39086d2) objM129g;
                C35643b c35643bMo47530g = c16905q1.f64864a.mo47530g(iMo47490c);
                long j7 = (((long) c35643bMo47530g.f151449a) << 48) | (((long) c35643bMo47530g.f151450b) << 32) | (((long) c35643bMo47530g.f151451c) << 16) | ((long) c35643bMo47530g.f151452d);
                long j13 = c39086d2.f168151h;
                if (!AbstractC39125q1.m124661g(j7, j13)) {
                    c39086d2.f168153j = j13;
                    c39086d2.f168154k = j7;
                    c39086d2.f168145b.setValue(Boolean.TRUE);
                    AbstractC16863c1 abstractC16863c1 = c16866d1.f64800a;
                    c39086d2.f168146c.m87023y(abstractC16863c1.mo47489b());
                    c39086d2.f168148e.m87023y(0.0f);
                    c39086d2.f168147d.m87033y(abstractC16863c1.mo47488a());
                    C28621h1 c28621h1 = this.f168262H;
                    c28621h1.m87025y(c28621h1.m87024x() + 1);
                    synchronized (AbstractC39963l.f172462c) {
                        C0059w0 c0059w0 = AbstractC39963l.f172469j.f172413h;
                        if (c0059w0 != null && c0059w0.m143h()) {
                            z4 = true;
                        }
                    }
                    if (z4) {
                        AbstractC39963l.m128161a();
                        return c20378c;
                    }
                }
            }
        }
        return c20378c;
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public final C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        if (this.f168265z) {
            this.f168260F = c16905q1;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return c16905q1;
            }
        } else if (this.f168259E == 0) {
            m124654K(c16905q1);
        }
        return c16905q1;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(view, this);
        AbstractC16901p0.m47586q(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(view, null);
        AbstractC16901p0.m47586q(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f168265z) {
            this.f168259E = 0;
            this.f168265z = false;
            C16905q1 c16905q1 = this.f168260F;
            if (c16905q1 != null) {
                m124654K(c16905q1);
                this.f168260F = null;
            }
        }
    }
}
