package e00;

import ai.C0896b;
import ai.C0899e;
import ai.C0900f;
import ai.InterfaceC0898d;
import android.content.Context;
import bc3.C3023j1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.stripe.android.model.ConsumerSessionLookup;
import fi.C14503i;
import fi.C14509o;
import fi.C14511q;
import g30.C15296g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import ki.ComponentCallbacks2C22489a;
import l83.C23454a0;
import l83.C23468n;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import p132f0.EnumC13840z0;
import p163g1.C15038i3;
import p163g1.C15049j3;
import p316m1.C24891a0;
import p316m1.C24928z;
import p461rh.C31415d;
import p461rh.C31417f;
import p461rh.C31431t;
import p461rh.InterfaceC31421j;
import p505ts.AbstractC34132o;
import p523uh.C34962h;
import p615xh.C38294a;
import p615xh.C38299f;
import p615xh.C38304k;
import p615xh.InterfaceC38301h;
import p664yy.C39857f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import sh.EnumC32482h;
import x43.AbstractC37978j;
import y00.C38880k6;
import y00.EnumC38884l0;

/* JADX INFO: renamed from: e00.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C12480c extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public Object f42604E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f42605F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f42606G;

    /* JADX INFO: renamed from: H */
    public /* synthetic */ Object f42607H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f42608I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42609w;

    /* JADX INFO: renamed from: x */
    public int f42610x;

    /* JADX INFO: renamed from: y */
    public Object f42611y;

    /* JADX INFO: renamed from: z */
    public Object f42612z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12480c(C12500w c12500w, String str, String str2, String str3, List list, String str4, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f42609w = 1;
        this.f42611y = c12500w;
        this.f42612z = str;
        this.f42604E = str2;
        this.f42605F = str3;
        this.f42608I = list;
        this.f42606G = str4;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function1, s83.i] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.jvm.functions.Function1, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f42609w) {
            case 0:
                return new C12480c((C12500w) this.f42611y, (String) this.f42612z, (String) this.f42604E, (String) this.f42605F, (String) this.f42606G, (String) this.f42607H, (EnumC38884l0) this.f42608I, interfaceC30057d, 0);
            case 1:
                C12480c c12480c = new C12480c((C12500w) this.f42611y, (String) this.f42612z, (String) this.f42604E, (String) this.f42605F, (List) this.f42608I, (String) this.f42606G, interfaceC30057d);
                c12480c.f42607H = obj;
                return c12480c;
            case 2:
                C12480c c12480c2 = new C12480c((EnumC13840z0) this.f42606G, (C15049j3) this.f42607H, (Function1) this.f42608I, interfaceC30057d);
                c12480c2.f42605F = obj;
                return c12480c2;
            case 3:
                C12480c c12480c3 = new C12480c((EnumC13840z0) this.f42606G, (C24891a0) this.f42607H, (Function1) this.f42608I, interfaceC30057d);
                c12480c3.f42605F = obj;
                return c12480c3;
            case 4:
                return new C12480c((C38299f) this.f42611y, (C22669g0) this.f42612z, (C22669g0) this.f42604E, (C14503i) this.f42605F, this.f42606G, (C22669g0) this.f42607H, (C31417f) this.f42608I, interfaceC30057d, 4);
            default:
                return new C12480c((C38299f) this.f42611y, (C14503i) this.f42612z, this.f42604E, (C14509o) this.f42605F, (C31417f) this.f42606G, (C0896b) this.f42607H, (InterfaceC38301h) this.f42608I, interfaceC30057d, 5);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f42609w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((C12480c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22, types: [int, mc3.a] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int, mc3.a] */
    /* JADX WARN: Type inference failed for: r8v11, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v19, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM43410j;
        Object objM107888l;
        Object objM43404d;
        C15038i3 c15038i3;
        InterfaceC25435a interfaceC25435a;
        ?? r10;
        C15049j3 c15049j3;
        C15049j3 c15049j4;
        C15038i3 c15038i4;
        Object objInvoke;
        InterfaceC25435a interfaceC25435a2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        C24928z c24928z;
        InterfaceC25435a interfaceC25435a3;
        ?? r14;
        C24891a0 c24891a0;
        C24891a0 c24891a1;
        C24928z c24928z2;
        Object objInvoke2;
        InterfaceC25435a interfaceC25435a4;
        AtomicReference atomicReference3;
        AtomicReference atomicReference4;
        Object objM122691b;
        boolean z4;
        InterfaceC0898d interfaceC0898d;
        switch (this.f42609w) {
            case 0:
                C12500w c12500w = (C12500w) this.f42611y;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f42610x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C15296g c15296g = c12500w.f42688e;
                    C38880k6 c38880k6 = new C38880k6((String) this.f42612z, (String) this.f42604E, (String) this.f42605F, (String) this.f42606G, (String) this.f42607H, c12500w.f42690g, null, null, c12500w.f42684a.f8870w, (EnumC38884l0) this.f42608I, null, null);
                    C39857f c39857fM35114b = c12500w.m35114b();
                    this.f42610x = 1;
                    objM43410j = c15296g.m43410j(c38880k6, c39857fM35114b, this);
                    if (objM43410j == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM43410j = ((C23468n) obj).f92940w;
                }
                return new C23468n(objM43410j);
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f42610x;
                try {
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj);
                        C12500w c12500w2 = (C12500w) this.f42611y;
                        String str = (String) this.f42612z;
                        String str2 = (String) this.f42604E;
                        String str3 = (String) this.f42605F;
                        String str4 = (String) this.f42606G;
                        C15296g c15296g2 = c12500w2.f42688e;
                        String str5 = c12500w2.f42684a.f8870w;
                        C39857f c39857fM35114b2 = c12500w2.m35114b();
                        this.f42610x = 1;
                        try {
                            objM43404d = c15296g2.m43404d(str, str2, str5, str3, false, c39857fM35114b2, str4, this);
                            if (objM43404d == enumC31071a2) {
                                return enumC31071a2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            objM107888l = AbstractC34132o.m107888l(th);
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        objM43404d = obj;
                    }
                    if (objM43404d == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    objM107888l = (ConsumerSessionLookup) objM43404d;
                    return new C23468n(objM107888l);
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
            case 2:
                C15049j3 c15049j5 = (C15049j3) this.f42607H;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                ?? r15 = this.f42610x;
                try {
                    try {
                        if (r15 == 0) {
                            AbstractC34132o.m107864I(obj);
                            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f42605F;
                            EnumC13840z0 enumC13840z0 = (EnumC13840z0) this.f42606G;
                            InterfaceC30061h interfaceC30061h = interfaceC2994c0.getCoroutineContext().get(C3023j1.f12041w);
                            AbstractC22676k.m65747g(interfaceC30061h);
                            c15038i3 = new C15038i3(enumC13840z0, (InterfaceC3027k1) interfaceC30061h);
                            AtomicReference atomicReference5 = c15049j5.f56340a;
                            while (true) {
                                C15038i3 c15038i5 = (C15038i3) atomicReference5.get();
                                if (c15038i5 != null && c15038i3.f56303a.compareTo(c15038i5.f56303a) < 0) {
                                    throw new CancellationException("Current mutation had a higher priority");
                                }
                                while (true) {
                                    if (atomicReference5.compareAndSet(c15038i5, c15038i3)) {
                                        if (c15038i5 != null) {
                                            c15038i5.f56304b.cancel((CancellationException) null);
                                        }
                                        C25437c c25437c = c15049j5.f56341b;
                                        AbstractC32275i abstractC32275i = (AbstractC32275i) this.f42608I;
                                        this.f42605F = c15038i3;
                                        this.f42611y = c25437c;
                                        this.f42612z = abstractC32275i;
                                        this.f42604E = c15049j5;
                                        this.f42610x = 1;
                                        if (c25437c.mo68211b(this) == enumC31071a3) {
                                            return enumC31071a3;
                                        }
                                        interfaceC25435a = c25437c;
                                        r10 = abstractC32275i;
                                    } else if (atomicReference5.get() != c15038i5) {
                                    }
                                }
                            }
                        } else {
                            if (r15 != 1) {
                                if (r15 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c15049j4 = (C15049j3) this.f42612z;
                                interfaceC25435a2 = (InterfaceC25435a) this.f42611y;
                                c15038i4 = (C15038i3) this.f42605F;
                                try {
                                    AbstractC34132o.m107864I(obj);
                                    objInvoke = obj;
                                    atomicReference2 = c15049j4.f56340a;
                                    while (!atomicReference2.compareAndSet(c15038i4, null) && atomicReference2.get() == c15038i4) {
                                    }
                                    interfaceC25435a2.mo68214i(null);
                                    return objInvoke;
                                } catch (Throwable th5) {
                                    th = th5;
                                    atomicReference = c15049j4.f56340a;
                                    while (!atomicReference.compareAndSet(c15038i4, null)) {
                                    }
                                    throw th;
                                }
                            }
                            c15049j5 = (C15049j3) this.f42604E;
                            Function1 function1 = (Function1) this.f42612z;
                            interfaceC25435a = (InterfaceC25435a) this.f42611y;
                            c15038i3 = (C15038i3) this.f42605F;
                            AbstractC34132o.m107864I(obj);
                            r10 = function1;
                        }
                        this.f42605F = c15038i3;
                        this.f42611y = interfaceC25435a;
                        this.f42612z = c15049j3;
                        this.f42604E = null;
                        this.f42610x = 2;
                        objInvoke = r10.invoke(this);
                        if (objInvoke == enumC31071a3) {
                            return enumC31071a3;
                        }
                        c15049j4 = c15049j3;
                        interfaceC25435a2 = interfaceC25435a;
                        c15038i4 = c15038i3;
                        atomicReference2 = c15049j4.f56340a;
                        while (!atomicReference2.compareAndSet(c15038i4, null)) {
                        }
                        interfaceC25435a2.mo68214i(null);
                        return objInvoke;
                    } catch (Throwable th6) {
                        th = th6;
                        c15049j4 = c15049j3;
                        c15038i4 = c15038i3;
                        atomicReference = c15049j4.f56340a;
                        while (!atomicReference.compareAndSet(c15038i4, null) && atomicReference.get() == c15038i4) {
                        }
                        throw th;
                    }
                    c15049j3 = c15049j5;
                } catch (Throwable th7) {
                    r15.mo68214i(null);
                    throw th7;
                }
                break;
            case 3:
                C24891a0 c24891a2 = (C24891a0) this.f42607H;
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                ?? r16 = this.f42610x;
                try {
                    try {
                        if (r16 == 0) {
                            AbstractC34132o.m107864I(obj);
                            InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) this.f42605F;
                            EnumC13840z0 enumC13840z1 = (EnumC13840z0) this.f42606G;
                            InterfaceC30061h interfaceC30061h2 = interfaceC2994c1.getCoroutineContext().get(C3023j1.f12041w);
                            AbstractC22676k.m65747g(interfaceC30061h2);
                            c24928z = new C24928z(enumC13840z1, (InterfaceC3027k1) interfaceC30061h2);
                            AtomicReference atomicReference6 = c24891a2.f97510a;
                            while (true) {
                                C24928z c24928z3 = (C24928z) atomicReference6.get();
                                if (c24928z3 != null && c24928z.f97620a.compareTo(c24928z3.f97620a) < 0) {
                                    throw new CancellationException("Current mutation had a higher priority");
                                }
                                while (true) {
                                    if (atomicReference6.compareAndSet(c24928z3, c24928z)) {
                                        if (c24928z3 != null) {
                                            c24928z3.f97621b.cancel((CancellationException) null);
                                        }
                                        C25437c c25437c2 = c24891a2.f97511b;
                                        AbstractC32275i abstractC32275i2 = (AbstractC32275i) this.f42608I;
                                        this.f42605F = c24928z;
                                        this.f42611y = c25437c2;
                                        this.f42612z = abstractC32275i2;
                                        this.f42604E = c24891a2;
                                        this.f42610x = 1;
                                        if (c25437c2.mo68211b(this) == enumC31071a4) {
                                            return enumC31071a4;
                                        }
                                        interfaceC25435a3 = c25437c2;
                                        r14 = abstractC32275i2;
                                    } else if (atomicReference6.get() != c24928z3) {
                                    }
                                }
                            }
                        } else {
                            if (r16 != 1) {
                                if (r16 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c24891a1 = (C24891a0) this.f42612z;
                                interfaceC25435a4 = (InterfaceC25435a) this.f42611y;
                                c24928z2 = (C24928z) this.f42605F;
                                try {
                                    AbstractC34132o.m107864I(obj);
                                    objInvoke2 = obj;
                                    atomicReference4 = c24891a1.f97510a;
                                    while (!atomicReference4.compareAndSet(c24928z2, null) && atomicReference4.get() == c24928z2) {
                                    }
                                    interfaceC25435a4.mo68214i(null);
                                    return objInvoke2;
                                } catch (Throwable th8) {
                                    th = th8;
                                    atomicReference3 = c24891a1.f97510a;
                                    while (!atomicReference3.compareAndSet(c24928z2, null)) {
                                    }
                                    throw th;
                                }
                            }
                            c24891a2 = (C24891a0) this.f42604E;
                            Function1 function2 = (Function1) this.f42612z;
                            interfaceC25435a3 = (InterfaceC25435a) this.f42611y;
                            c24928z = (C24928z) this.f42605F;
                            AbstractC34132o.m107864I(obj);
                            r14 = function2;
                        }
                        this.f42605F = c24928z;
                        this.f42611y = interfaceC25435a3;
                        this.f42612z = c24891a0;
                        this.f42604E = null;
                        this.f42610x = 2;
                        objInvoke2 = r14.invoke(this);
                        if (objInvoke2 == enumC31071a4) {
                            return enumC31071a4;
                        }
                        c24891a1 = c24891a0;
                        interfaceC25435a4 = interfaceC25435a3;
                        c24928z2 = c24928z;
                        atomicReference4 = c24891a1.f97510a;
                        while (!atomicReference4.compareAndSet(c24928z2, null)) {
                        }
                        interfaceC25435a4.mo68214i(null);
                        return objInvoke2;
                    } catch (Throwable th9) {
                        th = th9;
                        c24891a1 = c24891a0;
                        c24928z2 = c24928z;
                        atomicReference3 = c24891a1.f97510a;
                        while (!atomicReference3.compareAndSet(c24928z2, null) && atomicReference3.get() == c24928z2) {
                        }
                        throw th;
                    }
                    c24891a0 = c24891a2;
                } catch (Throwable th10) {
                    r16.mo68214i(null);
                    throw th10;
                }
                break;
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i15 = this.f42610x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C38299f c38299f = (C38299f) this.f42611y;
                C34962h c34962h = (C34962h) ((C22669g0) this.f42612z).f89336w;
                C31415d c31415d = (C31415d) ((C22669g0) this.f42604E).f89336w;
                C14503i c14503i = (C14503i) this.f42605F;
                Object obj2 = this.f42606G;
                C14509o c14509o = (C14509o) ((C22669g0) this.f42607H).f89336w;
                C31417f c31417f = (C31417f) this.f42608I;
                this.f42610x = 1;
                Object objM122690a = C38299f.m122690a(c38299f, c34962h, c31415d, c14503i, obj2, c14509o, c31417f, this);
                return objM122690a == enumC31071a5 ? enumC31071a5 : objM122690a;
            default:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i16 = this.f42610x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C38299f c38299f2 = (C38299f) this.f42611y;
                    C14503i c14503i2 = (C14503i) this.f42612z;
                    Object obj3 = this.f42604E;
                    C14509o c14509o2 = (C14509o) this.f42605F;
                    C31417f c31417f2 = (C31417f) this.f42606G;
                    this.f42610x = 1;
                    objM122691b = C38299f.m122691b(c38299f2, c14503i2, obj3, c14509o2, c31417f2, this);
                    if (objM122691b == enumC31071a6) {
                        return enumC31071a6;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM122691b = obj;
                }
                C38294a c38294a = (C38294a) objM122691b;
                ComponentCallbacks2C22489a componentCallbacks2C22489a = ((C38299f) this.f42611y).f164136b;
                synchronized (componentCallbacks2C22489a) {
                    try {
                        C31431t c31431t = (C31431t) componentCallbacks2C22489a.f88184w.get();
                        if (c31431t == null) {
                            componentCallbacks2C22489a.m64990a();
                        } else if (componentCallbacks2C22489a.f88185x == null) {
                            Context context = c31431t.f129319a.f129301a;
                            componentCallbacks2C22489a.f88185x = context;
                            context.registerComponentCallbacks(componentCallbacks2C22489a);
                        }
                    } catch (Throwable th11) {
                        throw th11;
                    }
                }
                C0899e c0899e = ((C38299f) this.f42611y).f164138d;
                C0896b c0896b = (C0896b) this.f42607H;
                C14503i c14503i3 = (C14503i) this.f42612z;
                if (c0896b == null || !c14503i3.f52977j.f52929x || !c38294a.f164095a.mo96729a() || (interfaceC0898d = (InterfaceC0898d) c0899e.f3286a.f129319a.f129303c.getValue()) == null) {
                    z4 = false;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("coil#is_sampled", Boolean.valueOf(c38294a.f164096b));
                    String str6 = c38294a.f164098d;
                    if (str6 != null) {
                        linkedHashMap.put("coil#disk_cache_key", str6);
                    }
                    InterfaceC31421j interfaceC31421j = c38294a.f164095a;
                    Map mapM121638W = AbstractC37978j.m121638W(linkedHashMap);
                    C0900f c0900f = (C0900f) interfaceC0898d;
                    synchronized (c0900f.f3289c) {
                        long size = interfaceC31421j.getSize();
                        if (size < 0) {
                            throw new IllegalStateException(("Image size must be non-negative: " + size).toString());
                        }
                        c0900f.f3287a.mo2229g(c0896b, interfaceC31421j, mapM121638W, size);
                    }
                    z4 = true;
                }
                InterfaceC31421j interfaceC31421j2 = c38294a.f164095a;
                C14503i c14503i4 = (C14503i) this.f42612z;
                EnumC32482h enumC32482h = c38294a.f164097c;
                C0896b c0896b2 = (C0896b) this.f42607H;
                if (!z4) {
                    c0896b2 = null;
                }
                C0896b c0896b3 = c0896b2;
                String str7 = c38294a.f164098d;
                boolean z13 = c38294a.f164096b;
                InterfaceC38301h interfaceC38301h = (InterfaceC38301h) this.f42608I;
                return new C14511q(interfaceC31421j2, c14503i4, enumC32482h, c0896b3, str7, z13, (interfaceC38301h instanceof C38304k) && ((C38304k) interfaceC38301h).f164159g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C12480c(EnumC13840z0 enumC13840z0, C15049j3 c15049j3, Function1 function1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f42609w = 2;
        this.f42606G = enumC13840z0;
        this.f42607H = c15049j3;
        this.f42608I = (AbstractC32275i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C12480c(EnumC13840z0 enumC13840z0, C24891a0 c24891a0, Function1 function1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f42609w = 3;
        this.f42606G = enumC13840z0;
        this.f42607H = c24891a0;
        this.f42608I = (AbstractC32275i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12480c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f42609w = i13;
        this.f42611y = obj;
        this.f42612z = obj2;
        this.f42604E = obj3;
        this.f42605F = obj4;
        this.f42606G = obj5;
        this.f42607H = obj6;
        this.f42608I = obj7;
    }
}
