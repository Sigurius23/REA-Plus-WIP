package h20;

import a33.C0351c;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c33.C3936c;
import c93.InterfaceC4351m;
import com.stripe.android.paymentsheet.PaymentOptionsActivity;
import com.stripe.android.paymentsheet.PaymentSheetActivity;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import e30.AbstractC12605c;
import ec3.InterfaceC13058l;
import gm.C15990r;
import go1.C16016a;
import gw1.C16268a;
import h40.C16845k;
import i20.C17954j1;
import i20.C17957k1;
import i20.C17982v0;
import i43.C18087b;
import j43.C21317a;
import k20.C22136a;
import k20.C22139d;
import k20.C22149n;
import l83.C23454a0;
import lb.C23557a0;
import m40.C25046w;
import mc.AbstractC25412i;
import mc.C25405b;
import mc.C25407d;
import n00.C26083k;
import p043c4.C3955e;
import p077d0.InterfaceC11372l;
import p164g2.C15247s;
import p164g2.InterfaceC15250v;
import p180h0.AbstractC16486z0;
import p182h3.ScrollCaptureCallbackC16787c;
import p218ic.C18389w;
import p238j0.InterfaceC21083i;
import p292l1.C23203x4;
import p313lz.C24812i;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p512u2.InterfaceC34476v;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import t23.C33368c0;
import t23.InterfaceC33408j3;
import w20.C36711b0;
import z30.C40039b;

/* JADX INFO: renamed from: h20.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16670i0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64110w;

    /* JADX INFO: renamed from: x */
    public int f64111x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f64112y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f64113z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16670i0(C16845k c16845k, Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f64110w = i13;
        this.f64112y = c16845k;
        this.f64113z = obj;
    }

    /* JADX INFO: renamed from: f */
    private final Object m47230f(Object obj) throws Throwable {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f64111x;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        C25046w c25046w = (C25046w) this.f64113z;
        String str = (String) this.f64112y;
        C0351c c0351c = new C0351c(c25046w, str, null, 9);
        this.f64111x = 1;
        Object objM73485e = C25046w.m73485e(c25046w, str, c0351c, this);
        return objM73485e == enumC31071a ? enumC31071a : objM73485e;
    }

    /* JADX INFO: renamed from: h */
    private final Object m47231h(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f64111x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            this.f64111x = 1;
            if (AbstractC3034m0.m8782b(1000L, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        C18389w.m52886d().m52888a(AbstractC25412i.f99516a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
        ((C11935t) ((InterfaceC11936u) this.f64112y)).mo32218s(new C25405b(7));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private final Object m47232i(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f64111x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC34476v interfaceC34476v = (InterfaceC34476v) this.f64113z;
            C3955e c3955e = new C3955e((ComposeView) this.f64112y, 5);
            this.f64111x = 1;
            if (AbstractC16486z0.m46657f(interfaceC34476v, new C16016a(22), new C16268a(27), new C16268a(27), c3955e, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private final Object m47233j(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f64111x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            this.f64111x = 1;
            if (AbstractC3034m0.m8782b(650L, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        ((C15247s) this.f64113z).m43352b();
        ((InterfaceC28601c1) this.f64112y).setValue(Boolean.TRUE);
        return C23454a0.f92919a;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f64110w) {
            case 0:
                return new C16670i0((PaymentOptionsActivity) this.f64113z, (C16845k) this.f64112y, interfaceC30057d, 0);
            case 1:
                return new C16670i0((PaymentSheetActivity) this.f64113z, (C16845k) this.f64112y, interfaceC30057d, 1);
            case 2:
                return new C16670i0((C36711b0) this.f64113z, (C16686k4) this.f64112y, interfaceC30057d, 2);
            case 3:
                return new C16670i0((AbstractC12605c) this.f64113z, (C16776z4) this.f64112y, interfaceC30057d, 3);
            case 4:
                return new C16670i0((C16776z4) this.f64113z, (String) this.f64112y, interfaceC30057d, 4);
            case 5:
                return new C16670i0((ScrollCaptureCallbackC16787c) this.f64113z, (Runnable) this.f64112y, interfaceC30057d, 5);
            case 6:
                return new C16670i0((C16845k) this.f64112y, this.f64113z, interfaceC30057d, 6);
            case 7:
                return new C16670i0((C16845k) this.f64112y, this.f64113z, interfaceC30057d, 7);
            case 8:
                return new C16670i0((C17982v0) this.f64113z, (C17957k1) this.f64112y, interfaceC30057d, 8);
            case 9:
                return new C16670i0((C17982v0) this.f64113z, (String) this.f64112y, interfaceC30057d, 9);
            case 10:
                return new C16670i0((C17982v0) this.f64113z, (C40039b) this.f64112y, interfaceC30057d, 10);
            case 11:
                return new C16670i0((C17954j1) this.f64113z, (String) this.f64112y, interfaceC30057d, 11);
            case 12:
                return new C16670i0((InterfaceC33408j3) this.f64113z, (C18087b) this.f64112y, interfaceC30057d, 12);
            case 13:
                return new C16670i0((InterfaceC21083i) this.f64113z, (InterfaceC28601c1) this.f64112y, interfaceC30057d, 13);
            case 14:
                C16670i0 c16670i0 = new C16670i0((InterfaceC4351m) this.f64112y, interfaceC30057d, 14);
                c16670i0.f64113z = obj;
                return c16670i0;
            case 15:
                return new C16670i0((C3936c) this.f64113z, (InterfaceC11372l) this.f64112y, interfaceC30057d, 15);
            case 16:
                return new C16670i0((C22136a) this.f64113z, (C22149n) this.f64112y, interfaceC30057d, 16);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C16670i0((InterfaceC13058l) this.f64113z, (C22139d) this.f64112y, interfaceC30057d, 17);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C16670i0((C33368c0) this.f64113z, (C21317a) this.f64112y, interfaceC30057d, 18);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C16670i0((C33368c0) this.f64113z, (C15990r) this.f64112y, interfaceC30057d, 19);
            case 20:
                return new C16670i0((InterfaceC4351m) this.f64113z, (C23557a0) this.f64112y, interfaceC30057d, 20);
            case 21:
                return new C16670i0((InterfaceC4351m) this.f64113z, (C22669g0) this.f64112y, interfaceC30057d, 21);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C16670i0((C24812i) this.f64113z, (Throwable) this.f64112y, interfaceC30057d, 22);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C16670i0((C24812i) this.f64113z, (String) this.f64112y, interfaceC30057d, 23);
            case 24:
                return new C16670i0((InterfaceC15250v) this.f64113z, (C23203x4) this.f64112y, interfaceC30057d, 24);
            case 25:
                return new C16670i0((C25046w) this.f64113z, (String) this.f64112y, interfaceC30057d, 25);
            case 26:
                return new C16670i0((C25407d) this.f64113z, (InterfaceC11936u) this.f64112y, interfaceC30057d, 26);
            case 27:
                C16670i0 c16670i1 = new C16670i0((ComposeView) this.f64112y, interfaceC30057d, 27);
                c16670i1.f64113z = obj;
                return c16670i1;
            case 28:
                return new C16670i0((C15247s) this.f64113z, (InterfaceC28601c1) this.f64112y, interfaceC30057d, 28);
            default:
                C16670i0 c16670i2 = new C16670i0((C26083k) this.f64112y, interfaceC30057d, 29);
                c16670i2.f64113z = obj;
                return c16670i2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f64110w) {
            case 0:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 4:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 7:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 8:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 9:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 10:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 11:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 12:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 13:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 14:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 15:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 16:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 20:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 21:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 24:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 25:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 26:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 27:
                return ((C16670i0) create((InterfaceC34476v) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 28:
                return ((C16670i0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C16670i0) create((String) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:465:0x093a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:466:0x093c  */
    /* JADX WARN: Code duplicated, block: B:596:0x0b94  */
    /* JADX WARN: Code duplicated, block: B:670:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.jvm.functions.Function1, s83.i] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v20 java.lang.Object, still in use, count: 2, list:
          (r2v20 java.lang.Object) from 0x0b5f: PHI (r2 I:??) = (r2v15 java.lang.Object), (r2v20 java.lang.Object) binds: [B:585:0x0b5d, B:667:0x0b5f] A[DONT_GENERATE, DONT_INLINE]
          (r2v20 java.lang.Object) from 0x0b52: CHECK_CAST (y00.o4) (r2v20 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h20.C16670i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16670i0(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f64110w = i13;
        this.f64113z = obj;
        this.f64112y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16670i0(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f64110w = i13;
        this.f64112y = obj;
    }
}
