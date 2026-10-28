package a30;

import bc3.C3022j0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import c93.InterfaceC4351m;
import h20.C16721q3;
import l83.C23454a0;
import my.C26027a;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import v00.C35459c0;

/* JADX INFO: renamed from: a30.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C0321r extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C0274a0 f1107E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C3022j0 f1108F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C3022j0 f1109G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C3022j0 f1110H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ boolean f1111I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C26027a f1112J;

    /* JADX INFO: renamed from: w */
    public C0274a0 f1113w;

    /* JADX INFO: renamed from: x */
    public InterfaceC3018i0 f1114x;

    /* JADX INFO: renamed from: y */
    public C35459c0 f1115y;

    /* JADX INFO: renamed from: z */
    public int f1116z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0321r(C0274a0 c0274a0, C3022j0 c3022j0, C3022j0 c3022j1, C3022j0 c3022j2, boolean z4, C26027a c26027a, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1107E = c0274a0;
        this.f1108F = c3022j0;
        this.f1109G = c3022j1;
        this.f1110H = c3022j2;
        this.f1111I = z4;
        this.f1112J = c26027a;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C0321r(this.f1107E, this.f1108F, this.f1109G, this.f1110H, this.f1111I, this.f1112J, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C0321r) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083 A[RETURN] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3018i0 interfaceC3018i0;
        C0274a0 c0274a0;
        C35459c0 c35459c0;
        C0274a0 c0274a1;
        InterfaceC3018i0 interfaceC3018i1;
        C16721q3 c16721q3;
        boolean z4;
        Object objM812e;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f1116z;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C0274a0 c0274a2 = this.f1107E;
            this.f1113w = c0274a2;
            interfaceC3018i0 = this.f1108F;
            this.f1114x = interfaceC3018i0;
            this.f1116z = 1;
            Object objM8817m = this.f1109G.m8817m(this);
            if (objM8817m != enumC31071a) {
                c0274a0 = c0274a2;
                obj = objM8817m;
            }
            return enumC31071a;
        }
        if (i13 == 1) {
            interfaceC3018i0 = this.f1114x;
            c0274a0 = this.f1113w;
            AbstractC34132o.m107864I(obj);
        } else {
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            C35459c0 c35459c1 = this.f1115y;
            InterfaceC3018i0 interfaceC3018i2 = this.f1114x;
            C0274a0 c0274a3 = this.f1113w;
            AbstractC34132o.m107864I(obj);
            interfaceC3018i1 = interfaceC3018i2;
            c0274a1 = c0274a3;
            c35459c0 = c35459c1;
        }
        C0273a c0273a = (C0273a) obj;
        c16721q3 = this.f1112J.f102966U;
        if (c16721q3 != null) {
            z4 = c16721q3.f64261w;
        } else {
            z4 = false;
        }
        boolean z13 = z4;
        this.f1113w = null;
        this.f1114x = null;
        this.f1115y = null;
        this.f1116z = 3;
        objM812e = C0274a0.m812e(c0274a1, interfaceC3018i1, c35459c0, c0273a, this.f1111I, z13, this);
        if (objM812e != enumC31071a) {
            return enumC31071a;
        }
        return objM812e;
        C35459c0 c35459c2 = (C35459c0) obj;
        this.f1113w = c0274a0;
        this.f1114x = interfaceC3018i0;
        this.f1115y = c35459c2;
        this.f1116z = 2;
        Object objM8817m2 = this.f1110H.m8817m(this);
        if (objM8817m2 != enumC31071a) {
            c35459c0 = c35459c2;
            obj = objM8817m2;
            c0274a1 = c0274a0;
            interfaceC3018i1 = interfaceC3018i0;
            C0273a c0273a2 = (C0273a) obj;
            c16721q3 = this.f1112J.f102966U;
            if (c16721q3 != null) {
                z4 = c16721q3.f64261w;
            } else {
                z4 = false;
            }
            boolean z14 = z4;
            this.f1113w = null;
            this.f1114x = null;
            this.f1115y = null;
            this.f1116z = 3;
            objM812e = C0274a0.m812e(c0274a1, interfaceC3018i1, c35459c0, c0273a2, this.f1111I, z14, this);
            if (objM812e != enumC31071a) {
                return objM812e;
            }
        }
        return enumC31071a;
    }
}
