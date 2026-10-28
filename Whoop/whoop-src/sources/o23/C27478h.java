package o23;

import ac3.C0745a;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import l83.C23470p;
import l83.InterfaceC23459e;
import live.hms.video.factories.C24148c;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import n43.C26285a;
import p007a6.C0416e;
import p047c9.C4312c;
import p279kd.C22379f;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: o23.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C27478h implements InterfaceC27474d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f110688a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f110689b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC23459e f110690c;

    /* JADX INFO: renamed from: d */
    public final Object f110691d;

    /* JADX INFO: renamed from: e */
    public Object f110692e;

    public C27478h(InterfaceC27474d call, Function1 function1) {
        AbstractC22676k.m65750j(call, "call");
        this.f110689b = call;
        this.f110690c = function1;
        this.f110691d = new C0745a();
    }

    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // o23.InterfaceC27474d
    public final Object await(InterfaceC30057d interfaceC30057d) {
        C27483m c27483m;
        C27478h c27478h;
        AbstractC26205h abstractC26205h;
        switch (this.f110688a) {
            case 0:
                return C27473c.m82901b(new C0416e(this, null, 9), interfaceC30057d);
            default:
                if (interfaceC30057d instanceof C27483m) {
                    c27483m = (C27483m) interfaceC30057d;
                    int i13 = c27483m.f110711z;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c27483m.f110711z = i13 - Integer.MIN_VALUE;
                    } else {
                        c27483m = new C27483m(this, interfaceC30057d);
                    }
                } else {
                    c27483m = new C27483m(this, interfaceC30057d);
                }
                Object objAwait = c27483m.f110709x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c27483m.f110711z;
                if (i14 != 0) {
                    if (i14 == 1) {
                        c27478h = c27483m.f110708w;
                        AbstractC34132o.m107864I(objAwait);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(objAwait);
                    }
                    abstractC26205h = (AbstractC26205h) objAwait;
                    if (abstractC26205h != null) {
                        return abstractC26205h;
                    }
                    return new C26203f(new C26198a("The call was canceled before complete its execution."));
                }
                AbstractC34132o.m107864I(objAwait);
                InterfaceC27474d interfaceC27474d = (InterfaceC27474d) this.f110689b;
                c27483m.f110708w = this;
                c27483m.f110711z = 1;
                objAwait = interfaceC27474d.await(c27483m);
                if (objAwait == enumC31071a) {
                    return enumC31071a;
                }
                c27478h = this;
                if (((C0745a) c27478h.f110691d).m1812a()) {
                    objAwait = null;
                }
                AbstractC26205h abstractC26205h2 = (AbstractC26205h) objAwait;
                if (abstractC26205h2 == null) {
                    return new C26203f(new C26198a("The call was canceled before complete its execution."));
                }
                if (!(abstractC26205h2 instanceof C26204g)) {
                    if (abstractC26205h2 instanceof C26203f) {
                        return abstractC26205h2;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Object objInvoke = ((Function1) c27478h.f110690c).invoke(((C26204g) abstractC26205h2).f103919a);
                c27478h.f110692e = (InterfaceC27474d) objInvoke;
                if (((C0745a) c27478h.f110691d).m1812a()) {
                    objInvoke = null;
                }
                InterfaceC27474d interfaceC27474d2 = (InterfaceC27474d) objInvoke;
                if (interfaceC27474d2 != null) {
                    c27483m.f110708w = null;
                    c27483m.f110711z = 2;
                    objAwait = interfaceC27474d2.await(c27483m);
                    if (objAwait == enumC31071a) {
                        return enumC31071a;
                    }
                    abstractC26205h = (AbstractC26205h) objAwait;
                    if (abstractC26205h != null) {
                        return abstractC26205h;
                    }
                }
                return new C26203f(new C26198a("The call was canceled before complete its execution."));
        }
    }

    @Override // o23.InterfaceC27474d
    public final void cancel() {
        switch (this.f110688a) {
            case 0:
                C2345k c2345k = (C2345k) ((C23470p) this.f110691d).getValue();
                InterfaceC2339e interfaceC2339e = c2345k.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                String str = c2345k.f9273a;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345k.f9274b.log(enumC2341g, str, "[cancel] no args", null);
                }
                HashSet hashSet = (HashSet) this.f110692e;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3027k1) it.next()).cancel((CancellationException) null);
                }
                hashSet.clear();
                break;
            default:
                ((C0745a) this.f110691d).m1813b();
                ((InterfaceC27474d) this.f110689b).cancel();
                InterfaceC27474d interfaceC27474d = (InterfaceC27474d) this.f110692e;
                if (interfaceC27474d != null) {
                    interfaceC27474d.cancel();
                }
                break;
        }
    }

    @Override // o23.InterfaceC27474d
    public final void enqueue(InterfaceC27471a callback) {
        switch (this.f110688a) {
            case 0:
                AbstractC22676k.m65750j(callback, "callback");
                C2345k c2345k = (C2345k) ((C23470p) this.f110691d).getValue();
                InterfaceC2339e interfaceC2339e = c2345k.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                String str = c2345k.f9273a;
                InterfaceC30057d interfaceC30057d = null;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345k.f9274b.log(enumC2341g, str, "[enqueue] no args", null);
                }
                AbstractC3006f0.m8732z((InterfaceC2994c0) this.f110689b, null, null, new C26285a(this, callback, interfaceC30057d, 2), 3);
                break;
            default:
                ((InterfaceC27474d) this.f110689b).enqueue(new C4312c(26, this, callback));
                break;
        }
    }

    @Override // o23.InterfaceC27474d
    public final AbstractC26205h execute() {
        switch (this.f110688a) {
            case 0:
                return (AbstractC26205h) AbstractC3006f0.m8699E(C30064k.f122676w, new C22379f(this, (InterfaceC30057d) null, 19));
            default:
                return (AbstractC26205h) AbstractC3006f0.m8699E(C30064k.f122676w, new C22379f(this, (InterfaceC30057d) null, 21));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C27478h(InterfaceC2994c0 scope, InterfaceC4351m interfaceC4351m) {
        AbstractC22676k.m65750j(scope, "scope");
        this.f110689b = scope;
        this.f110690c = (AbstractC32275i) interfaceC4351m;
        this.f110691d = AbstractC1772c1.m5382S(this, "CoroutineCall");
        this.f110692e = new HashSet();
    }

    @Override // o23.InterfaceC27474d
    public final void enqueue() {
        switch (this.f110688a) {
            case 0:
                enqueue(new C24148c(20));
                break;
            default:
                enqueue(new C24148c(20));
                break;
        }
    }
}
