package m00;

import a00.C0066a;
import a00.C0067b;
import a00.C0068c;
import a00.C0071f;
import a00.C0072g;
import a00.InterfaceC0069d;
import androidx.lifecycle.AbstractC1637w1;
import d00.C11433l;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import h00.AbstractC16517n0;
import h00.EnumC16519o0;
import h20.C16657g;
import l83.C23454a0;
import p442qy.C30765d;
import p499t9.C33623c0;
import p505ts.AbstractC34132o;
import p599wz.AbstractC37748q0;
import p599wz.C37718g0;
import p599wz.C37737m1;
import p599wz.C37757t0;
import p599wz.InterfaceC37739n0;
import p631xz.C38747x;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import y00.EnumC38828f4;

/* JADX INFO: renamed from: m00.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C24872d extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E */
    public final C30765d f97436E;

    /* JADX INFO: renamed from: F */
    public final C16657g f97437F;

    /* JADX INFO: renamed from: G */
    public final C37737m1 f97438G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC37739n0 f97439H;

    /* JADX INFO: renamed from: I */
    public final Function1 f97440I;

    /* JADX INFO: renamed from: J */
    public final C13045h2 f97441J;

    /* JADX INFO: renamed from: K */
    public final C13045h2 f97442K;

    /* JADX INFO: renamed from: w */
    public final C37718g0 f97443w;

    /* JADX INFO: renamed from: x */
    public final C11433l f97444x;

    /* JADX INFO: renamed from: y */
    public final C38747x f97445y;

    /* JADX INFO: renamed from: z */
    public final C0072g f97446z;

    public C24872d(C37718g0 configuration, C11433l c11433l, C38747x linkAccountManager, C0072g c0072g, C30765d logger, C16657g c16657g, C37737m1 dismissalCoordinator, InterfaceC37739n0 linkLaunchMode, Function1 dismissWithResult) {
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(linkAccountManager, "linkAccountManager");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(dismissalCoordinator, "dismissalCoordinator");
        AbstractC22676k.m65750j(linkLaunchMode, "linkLaunchMode");
        AbstractC22676k.m65750j(dismissWithResult, "dismissWithResult");
        this.f97443w = configuration;
        this.f97444x = c11433l;
        this.f97445y = linkAccountManager;
        this.f97446z = c0072g;
        this.f97436E = logger;
        this.f97437F = c16657g;
        this.f97438G = dismissalCoordinator;
        this.f97439H = linkLaunchMode;
        this.f97440I = dismissWithResult;
        C33623c0 c33623c0 = EnumC38828f4.f167088G;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C24869a(c16657g.m47226a("card"), c16657g.m47227b("card"), EnumC16519o0.Disabled, AbstractC16517n0.m46676e(configuration.f161636w, linkLaunchMode), false, null, null));
        this.f97441J = c13045h2M36593c;
        this.f97442K = c13045h2M36593c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: g */
    public static final Object m72902g(C24872d c24872d, AbstractC37748q0 abstractC37748q0, String str, String str2, AbstractC32269c abstractC32269c) throws Throwable {
        C24870b c24870b;
        Object value;
        c24872d.getClass();
        if (abstractC32269c instanceof C24870b) {
            c24870b = (C24870b) abstractC32269c;
            int i13 = c24870b.f97427z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c24870b.f97427z = i13 - Integer.MIN_VALUE;
            } else {
                c24870b = new C24870b(c24872d, abstractC32269c);
            }
        } else {
            c24870b = new C24870b(c24872d, abstractC32269c);
        }
        Object objM191i = c24870b.f97425x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c24870b.f97427z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM191i);
            C0072g c0072g = c24872d.f97446z;
            C37757t0 c37757t0 = new C37757t0(abstractC37748q0, str, str2);
            C11433l c11433l = c24872d.f97444x;
            c24870b.f97424w = c24872d;
            c24870b.f97427z = 1;
            objM191i = c0072g.m191i((InterfaceC37739n0) c0072g.f221E, new C0071f(c37757t0, c0072g, c11433l, null, 0), c37757t0, c24870b);
            if (objM191i == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24872d = c24870b.f97424w;
            AbstractC34132o.m107864I(objM191i);
        }
        InterfaceC0069d interfaceC0069d = (InterfaceC0069d) objM191i;
        if (!(interfaceC0069d instanceof C0066a)) {
            if (interfaceC0069d instanceof C0068c) {
                C13045h2 c13045h2 = c24872d.f97441J;
                do {
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, C24869a.m72901a((C24869a) value, null, false, null, ((C0068c) interfaceC0069d).f207a, 63)));
            } else {
                if (!(interfaceC0069d instanceof C0067b)) {
                    throw new NoWhenBranchMatchedException();
                }
                c24872d.f97440I.invoke(((C0067b) interfaceC0069d).f206a);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m72903j(C24872d c24872d, EnumC16519o0 enumC16519o0) {
        C13045h2 c13045h2 = c24872d.f97441J;
        while (true) {
            Object value = c13045h2.getValue();
            EnumC16519o0 enumC16519o1 = enumC16519o0;
            if (c13045h2.m36569i(value, C24869a.m72901a((C24869a) value, enumC16519o1, false, null, null, 123))) {
                return;
            } else {
                enumC16519o0 = enumC16519o1;
            }
        }
    }
}
