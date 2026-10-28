package p180h0;

import p390p1.C28617g1;
import p390p1.C28633k1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C16430o implements InterfaceC16356a {

    /* JADX INFO: renamed from: a */
    public Object f63136a;

    /* JADX INFO: renamed from: b */
    public Object f63137b;

    /* JADX INFO: renamed from: c */
    public float f63138c = Float.NaN;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C16435p f63139d;

    public C16430o(C16435p c16435p) {
        this.f63139d = c16435p;
    }

    /* JADX INFO: renamed from: b */
    public final void m46600b(float f13, float f14) {
        C16435p c16435p = this.f63139d;
        C28617g1 c28617g1 = c16435p.f63154f;
        float fM87022x = c28617g1.m87022x();
        c28617g1.m87023y(f13);
        c16435p.f63155g.m87023y(f14);
        if (Float.isNaN(fM87022x)) {
            return;
        }
        boolean z4 = f13 >= fM87022x;
        InterfaceC16397h1 interfaceC16397h1M46613c = c16435p.m46613c();
        C28633k1 c28633k1 = c16435p.f63151c;
        if (c28617g1.m87022x() == ((C16475x) interfaceC16397h1M46613c).m46650e(c28633k1.getValue())) {
            Object objM46647b = ((C16475x) c16435p.m46613c()).m46647b(c28617g1.m87022x() + (z4 ? 1.0f : -1.0f), z4);
            if (objM46647b == null) {
                objM46647b = c28633k1.getValue();
            }
            if (z4) {
                this.f63136a = c28633k1.getValue();
                this.f63137b = objM46647b;
            } else {
                this.f63136a = objM46647b;
                this.f63137b = c28633k1.getValue();
            }
        } else {
            Object objM46647b2 = ((C16475x) c16435p.m46613c()).m46647b(c28617g1.m87022x(), false);
            if (objM46647b2 == null) {
                objM46647b2 = c28633k1.getValue();
            }
            Object objM46647b3 = ((C16475x) c16435p.m46613c()).m46647b(c28617g1.m87022x(), true);
            if (objM46647b3 == null) {
                objM46647b3 = c28633k1.getValue();
            }
            this.f63136a = objM46647b2;
            this.f63137b = objM46647b3;
        }
        InterfaceC16397h1 interfaceC16397h1M46613c2 = c16435p.m46613c();
        Object obj = this.f63136a;
        AbstractC22676k.m65747g(obj);
        float fM46650e = ((C16475x) interfaceC16397h1M46613c2).m46650e(obj);
        InterfaceC16397h1 interfaceC16397h1M46613c3 = c16435p.m46613c();
        Object obj2 = this.f63137b;
        AbstractC22676k.m65747g(obj2);
        this.f63138c = Math.abs(fM46650e - ((C16475x) interfaceC16397h1M46613c3).m46650e(obj2));
        if (Math.abs(c28617g1.m87022x() - ((C16475x) c16435p.m46613c()).m46650e(c28633k1.getValue())) >= this.f63138c / 2.0f) {
            Object value = z4 ? this.f63137b : this.f63136a;
            if (value == null) {
                value = c28633k1.getValue();
            }
            c16435p.m46617g(value);
        }
    }
}
