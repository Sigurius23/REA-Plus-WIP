package sz;

import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.C1778e;
import androidx.room.C1841x;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bm.C3383g;
import c93.InterfaceC4351m;
import com.google.android.gms.tasks.Task;
import com.stripe.android.attestation.AttestationActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncherActivity;
import ec3.AbstractC13091v;
import ec3.C13078q1;
import ec3.C13081r1;
import ec3.C13096w1;
import ec3.InterfaceC13037f2;
import l83.C23454a0;
import l83.C23468n;
import n53.C26318e;
import o23.C27486p;
import p000.C34292u;
import p002a0.C0047q0;
import p031b9.AbstractC2875y;
import p078d1.C11453f;
import p085d9.C11799p;
import p147ff.InterfaceC14422a;
import p238j0.C21084j;
import p505ts.AbstractC34132o;
import p508ty.C34247a;
import p510u0.C34357t0;
import p512u2.C34462h0;
import p550vd.AbstractC35903f;
import p579wc.C37124w;
import p581we.C37177b;
import p597wx.C37681j;
import p605x6.C38011p;
import p645yc.C39425d;
import p645yc.C39426e;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29906g0;
import q83.InterfaceC30057d;
import r51.C30936d;
import r83.EnumC31071a;
import s40.C32139c0;
import s83.AbstractC32275i;
import t10.C33284d;
import t10.C33285e;
import t20.C33342w;
import t30.C33505g;
import w20.C36711b0;
import w20.C36723m;
import w20.C36734x;
import x30.C37893h0;
import x30.C37917p0;

/* JADX INFO: renamed from: sz.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C33151q extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138251w;

    /* JADX INFO: renamed from: x */
    public int f138252x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f138253y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33151q(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f138251w = i13;
        this.f138253y = obj;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f138251w) {
            case 0:
                return new C33151q((GooglePayLauncherActivity) this.f138253y, interfaceC30057d, 0);
            case 1:
                return new C33151q((C33161z) this.f138253y, interfaceC30057d, 1);
            case 2:
                return new C33151q((C33284d) this.f138253y, interfaceC30057d, 2);
            case 3:
                return new C33151q((C33285e) this.f138253y, interfaceC30057d, 3);
            case 4:
                return new C33151q((C33342w) this.f138253y, interfaceC30057d, 4);
            case 5:
                return new C33151q((C33505g) this.f138253y, interfaceC30057d, 5);
            case 6:
                return new C33151q((C34247a) this.f138253y, interfaceC30057d, 6);
            case 7:
                return new C33151q((C11453f) this.f138253y, interfaceC30057d, 7);
            case 8:
                return new C33151q((C34357t0) this.f138253y, interfaceC30057d, 8);
            case 9:
                return new C33151q((C34462h0) this.f138253y, interfaceC30057d, 9);
            case 10:
                return new C33151q((C36734x) this.f138253y, interfaceC30057d, 10);
            case 11:
                return new C33151q((C36711b0) this.f138253y, interfaceC30057d, 11);
            case 12:
                return new C33151q((C37124w) this.f138253y, interfaceC30057d, 12);
            case 13:
                return new C33151q((C37177b) this.f138253y, interfaceC30057d, 13);
            case 14:
                return new C33151q((AttestationActivity) this.f138253y, interfaceC30057d, 14);
            case 15:
                return new C33151q((C37681j) this.f138253y, interfaceC30057d, 15);
            case 16:
                return new C33151q((C37917p0) this.f138253y, interfaceC30057d, 16);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C33151q((C38011p) this.f138253y, interfaceC30057d, 17);
            default:
                return new C33151q((C39426e) this.f138253y, interfaceC30057d, 18);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f138251w) {
            case 0:
                ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 1:
                return ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 4:
                ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 5:
                return ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 7:
                return ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 8:
                return ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 9:
                return ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 10:
                return ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 11:
                ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 12:
                return ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 13:
                return ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 14:
                return ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 15:
                return ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 16:
                return ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C33151q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM105020g;
        int i13 = this.f138251w;
        int i14 = 3;
        InterfaceC30057d interfaceC30057d = null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f138253y;
        switch (i13) {
            case 0:
                GooglePayLauncherActivity googlePayLauncherActivity = (GooglePayLauncherActivity) obj2;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i15 = this.f138252x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    int i16 = GooglePayLauncherActivity.f22184z;
                    C13078q1 c13078q1 = googlePayLauncherActivity.m16842p().f138287L;
                    C34292u c34292u = new C34292u(googlePayLauncherActivity, 23);
                    this.f138252x = 1;
                    if (c13078q1.f45191w.collect(c34292u, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
            case 1:
                C33161z c33161z = (C33161z) obj2;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i17 = this.f138252x;
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj);
                    if (AbstractC22676k.m65745e(c33161z.f138283H.m5001b("has_launched"), Boolean.TRUE)) {
                        return c23454a0;
                    }
                    this.f138252x = 1;
                    objM105020g = C33161z.m105020g(c33161z, this);
                    if (objM105020g != enumC31071a2) {
                    }
                    return enumC31071a2;
                }
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                objM105020g = ((C23468n) obj).f92940w;
                Throwable thM68037a = C23468n.m68037a(objM105020g);
                if (thM68037a != null) {
                    c33161z.f138286K.mo36564a(new C33145n(thM68037a));
                    return c23454a0;
                }
                C13096w1 c13096w1 = c33161z.f138288M;
                this.f138252x = 2;
                if (c13096w1.emit((Task) objM105020g, this) != enumC31071a2) {
                    return c23454a0;
                }
                return enumC31071a2;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i18 = this.f138252x;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C33284d c33284d = (C33284d) obj2;
                C13081r1 c13081r1 = c33284d.f138812b.f42923k;
                C27486p c27486p = new C27486p(c33284d, interfaceC30057d, 7);
                this.f138252x = 1;
                return AbstractC13091v.m36604n(c13081r1, c27486p, this) == enumC31071a3 ? enumC31071a3 : c23454a0;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i19 = this.f138252x;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C33285e c33285e = (C33285e) obj2;
                C13081r1 c13081r2 = c33285e.f138820b.f132973b;
                C27486p c27486p2 = new C27486p(c33285e, interfaceC30057d, 8);
                this.f138252x = 1;
                return AbstractC13091v.m36604n(c13081r2, c27486p2, this) == enumC31071a4 ? enumC31071a4 : c23454a0;
            case 4:
                C33342w c33342w = (C33342w) obj2;
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i24 = this.f138252x;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C26318e c26318e = c33342w.f139118S.mo43554j().f57766c.f57908i;
                C34292u c34292u2 = new C34292u(c33342w, 25);
                this.f138252x = 1;
                c26318e.collect(c34292u2, this);
                return enumC31071a5;
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i25 = this.f138252x;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C29906g0 c29906g0 = ((C33505g) obj2).f139878x;
                this.f138252x = 1;
                return c29906g0.m91516a(this) == enumC31071a6 ? enumC31071a6 : c23454a0;
            case 6:
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                int i26 = this.f138252x;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C34247a c34247a = (C34247a) obj2;
                this.f138252x = 1;
                return AbstractC3006f0.m8705K(c34247a.f143652e, new C32139c0(c34247a, interfaceC30057d, 12), this) == enumC31071a7 ? enumC31071a7 : c23454a0;
            case 7:
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                int i27 = this.f138252x;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C11453f c11453f = (C11453f) obj2;
                this.f138252x = 1;
                c11453f.getClass();
                Object objM8719m = AbstractC3006f0.m8719m(new C1778e(c11453f, interfaceC30057d, i14), this);
                if (objM8719m != enumC31071a8) {
                    objM8719m = c23454a0;
                }
                return objM8719m == enumC31071a8 ? enumC31071a8 : c23454a0;
            case 8:
                EnumC31071a enumC31071a9 = EnumC31071a.f128113w;
                int i28 = this.f138252x;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C34357t0 c34357t0 = (C34357t0) obj2;
                this.f138252x = 1;
                c34357t0.getClass();
                ((C21084j) c34357t0.f144352a).f79947a.collect(new C1841x(17, new C0047q0(), c34357t0), this);
                return enumC31071a9;
            case 9:
                C34462h0 c34462h0 = (C34462h0) obj2;
                EnumC31071a enumC31071a10 = EnumC31071a.f128113w;
                int i29 = this.f138252x;
                if (i29 == 0) {
                    AbstractC34132o.m107864I(obj);
                    PointerInputEventHandler pointerInputEventHandler = c34462h0.f144782R;
                    this.f138252x = 2;
                    return pointerInputEventHandler.invoke(c34462h0, this) == enumC31071a10 ? enumC31071a10 : c23454a0;
                }
                if (i29 != 1 && i29 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            case 10:
                EnumC31071a enumC31071a11 = EnumC31071a.f128113w;
                int i34 = this.f138252x;
                if (i34 != 0) {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C13096w1 c13096w2 = ((C36734x) obj2).f157234x;
                this.f138252x = 1;
                return c13096w2.emit(C36723m.f157212w, this) == enumC31071a11 ? enumC31071a11 : c23454a0;
            case 11:
                EnumC31071a enumC31071a12 = EnumC31071a.f128113w;
                int i35 = this.f138252x;
                if (i35 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C36711b0 c36711b0 = (C36711b0) obj2;
                    InterfaceC13037f2 interfaceC13037f2 = c36711b0.f157191a;
                    C34292u c34292u3 = new C34292u(c36711b0, 26);
                    this.f138252x = 1;
                    if (interfaceC13037f2.collect(c34292u3, this) == enumC31071a12) {
                        return enumC31071a12;
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
            case 12:
                EnumC31071a enumC31071a13 = EnumC31071a.f128113w;
                int i36 = this.f138252x;
                if (i36 != 0) {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                String str = ((C37124w) obj2).f158822x;
                this.f138252x = 1;
                Object objM115319p = C39425d.f169608b.m115319p(new C30936d(str, 10), this);
                return objM115319p == enumC31071a13 ? enumC31071a13 : objM115319p;
            case 13:
                EnumC31071a enumC31071a14 = EnumC31071a.f128113w;
                int i37 = this.f138252x;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C11799p c11799p = ((C37177b) obj2).f158972y;
                this.f138252x = 1;
                Object objM31617a = c11799p.m31617a(this);
                return objM31617a == enumC31071a14 ? enumC31071a14 : objM31617a;
            case 14:
                AttestationActivity attestationActivity = (AttestationActivity) obj2;
                EnumC31071a enumC31071a15 = EnumC31071a.f128113w;
                int i38 = this.f138252x;
                if (i38 != 0) {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C13096w1 c13096w3 = ((C37681j) attestationActivity.f22140x.getValue()).f161440E;
                C34292u c34292u4 = new C34292u(attestationActivity, 28);
                this.f138252x = 1;
                c13096w3.getClass();
                C13096w1.m36617k(c13096w3, c34292u4, this);
                return enumC31071a15;
            case 15:
                EnumC31071a enumC31071a16 = EnumC31071a.f128113w;
                int i39 = this.f138252x;
                if (i39 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f138252x = 1;
                    return C37681j.m121101g((C37681j) obj2, this) == enumC31071a16 ? enumC31071a16 : c23454a0;
                }
                if (i39 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            case 16:
                EnumC31071a enumC31071a17 = EnumC31071a.f128113w;
                int i44 = this.f138252x;
                if (i44 != 0) {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C37917p0 c37917p0 = (C37917p0) obj2;
                C3383g c3383g = c37917p0.f162351f.f177743n;
                C37893h0 c37893h0 = new C37893h0(c37917p0, 0);
                this.f138252x = 1;
                return c3383g.collect(c37893h0, this) == enumC31071a17 ? enumC31071a17 : c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                EnumC31071a enumC31071a18 = EnumC31071a.f128113w;
                int i45 = this.f138252x;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                this.f138252x = 1;
                ((C38011p) obj2).invoke(this);
                return c23454a0 == enumC31071a18 ? enumC31071a18 : c23454a0;
            default:
                EnumC31071a enumC31071a19 = EnumC31071a.f128113w;
                int i46 = this.f138252x;
                if (i46 != 0) {
                    if (i46 == 1) {
                        AbstractC34132o.m107864I(obj);
                    } else {
                        if (i46 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    return (String) obj;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC14422a interfaceC14422a = ((C39426e) obj2).f169613e;
                if (interfaceC14422a != null) {
                    this.f138252x = 1;
                    obj = interfaceC14422a.mo41126b(this);
                    if (obj == enumC31071a19) {
                        return enumC31071a19;
                    }
                }
                this.f138252x = 2;
                obj = AbstractC35903f.m113992J(null, null, this, 3);
                if (obj == enumC31071a19) {
                    return enumC31071a19;
                }
                return (String) obj;
                String str2 = (String) obj;
                if (str2 != null) {
                    return str2;
                }
                this.f138252x = 2;
                obj = AbstractC35903f.m113992J(null, null, this, 3);
                if (obj == enumC31071a19) {
                    return enumC31071a19;
                }
                return (String) obj;
        }
    }
}
