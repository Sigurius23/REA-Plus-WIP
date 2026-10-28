package lc3;

import bc3.InterfaceC3056s0;
import hc3.AbstractC17189v;
import hc3.C17191x;
import p715kotlin.jvm.functions.Function3;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: lc3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C23834d {

    /* JADX INFO: renamed from: a */
    public final Object f94270a;

    /* JADX INFO: renamed from: b */
    public final Function3 f94271b;

    /* JADX INFO: renamed from: c */
    public final Function3 f94272c;

    /* JADX INFO: renamed from: d */
    public final Object f94273d;

    /* JADX INFO: renamed from: e */
    public final AbstractC32275i f94274e;

    /* JADX INFO: renamed from: f */
    public final Function3 f94275f;

    /* JADX INFO: renamed from: g */
    public Object f94276g;

    /* JADX INFO: renamed from: h */
    public int f94277h = -1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C23836f f94278i;

    public C23834d(C23836f c23836f, Object obj, Function3 function3, Function3 function4, C17191x c17191x, AbstractC32275i abstractC32275i, Function3 function5) {
        this.f94278i = c23836f;
        this.f94270a = obj;
        this.f94271b = function3;
        this.f94272c = function4;
        this.f94273d = c17191x;
        this.f94274e = abstractC32275i;
        this.f94275f = function5;
    }

    /* JADX INFO: renamed from: a */
    public final void m70037a() {
        Object obj = this.f94276g;
        if (obj instanceof AbstractC17189v) {
            ((AbstractC17189v) obj).mo32228h(this.f94277h, this.f94278i.f94285w);
            return;
        }
        InterfaceC3056s0 interfaceC3056s0 = obj instanceof InterfaceC3056s0 ? (InterfaceC3056s0) obj : null;
        if (interfaceC3056s0 != null) {
            interfaceC3056s0.dispose();
        }
    }
}
