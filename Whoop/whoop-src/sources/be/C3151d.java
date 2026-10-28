package be;

import a33.C0352d;
import c93.InterfaceC4353o;
import c93.InterfaceC4354p;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import h20.C16621a;
import l83.C23454a0;
import p180h0.C16382e1;
import p180h0.C16410k;
import p180h0.InterfaceC16356a;
import p522uf.C34894u;
import p647yf.InterfaceC39492e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import u10.C34416d;
import x30.C37928t;
import y00.C38915o4;

/* JADX INFO: renamed from: be.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C3151d extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f12336E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12337w;

    /* JADX INFO: renamed from: x */
    public int f12338x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f12339y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f12340z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3151d(C16382e1 c16382e1, C16410k c16410k, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f12337w = 3;
        this.f12340z = c16382e1;
        this.f12336E = c16410k;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f12337w) {
            case 0:
                C3151d c3151d = new C3151d((String) this.f12336E, (InterfaceC30057d) obj3, 0);
                c3151d.f12339y = (C34894u) obj;
                c3151d.f12340z = (InterfaceC39492e) obj2;
                return c3151d.invokeSuspend(C23454a0.f92919a);
            case 1:
                C3151d c3151d2 = new C3151d((InterfaceC30057d) obj3, this.f12336E, 1);
                c3151d2.f12339y = (InterfaceC13062m) obj;
                c3151d2.f12340z = (Object[]) obj2;
                return c3151d2.invokeSuspend(C23454a0.f92919a);
            case 2:
                C3151d c3151d3 = new C3151d((InterfaceC30057d) obj3, (C0352d) this.f12336E, 2);
                c3151d3.f12339y = (InterfaceC13062m) obj;
                c3151d3.f12340z = (Object[]) obj2;
                return c3151d3.invokeSuspend(C23454a0.f92919a);
            case 3:
                C3151d c3151d4 = new C3151d((C16382e1) this.f12340z, (C16410k) this.f12336E, (InterfaceC30057d) obj3);
                c3151d4.f12339y = (InterfaceC16356a) obj;
                return c3151d4.invokeSuspend(C23454a0.f92919a);
            case 4:
                C3151d c3151d5 = new C3151d((InterfaceC30057d) obj3, (InterfaceC4353o) this.f12336E, 4);
                c3151d5.f12339y = (InterfaceC13062m) obj;
                c3151d5.f12340z = (Object[]) obj2;
                return c3151d5.invokeSuspend(C23454a0.f92919a);
            case 5:
                C3151d c3151d6 = new C3151d((InterfaceC30057d) obj3, (InterfaceC4354p) this.f12336E, 5);
                c3151d6.f12339y = (InterfaceC13062m) obj;
                c3151d6.f12340z = (Object[]) obj2;
                return c3151d6.invokeSuspend(C23454a0.f92919a);
            case 6:
                C3151d c3151d7 = new C3151d((InterfaceC30057d) obj3, (Function1) this.f12336E, 6);
                c3151d7.f12339y = (InterfaceC13062m) obj;
                c3151d7.f12340z = obj2;
                return c3151d7.invokeSuspend(C23454a0.f92919a);
            case 7:
                C3151d c3151d8 = new C3151d((C34416d) this.f12336E, (InterfaceC30057d) obj3, 7);
                c3151d8.f12339y = (C38915o4) obj;
                c3151d8.f12340z = (C16621a) obj2;
                return c3151d8.invokeSuspend(C23454a0.f92919a);
            case 8:
                C3151d c3151d9 = new C3151d((InterfaceC30057d) obj3, (InterfaceC13037f2) this.f12336E, 8);
                c3151d9.f12339y = (InterfaceC13062m) obj;
                c3151d9.f12340z = obj2;
                return c3151d9.invokeSuspend(C23454a0.f92919a);
            case 9:
                C3151d c3151d10 = new C3151d((InterfaceC30057d) obj3, (AbstractC22680m) this.f12336E);
                c3151d10.f12339y = (InterfaceC13062m) obj;
                c3151d10.f12340z = obj2;
                return c3151d10.invokeSuspend(C23454a0.f92919a);
            default:
                C3151d c3151d11 = new C3151d((InterfaceC30057d) obj3, (C37928t) this.f12336E, 10);
                c3151d11.f12339y = (InterfaceC13062m) obj;
                c3151d11.f12340z = (Object[]) obj2;
                return c3151d11.invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v15, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v1, types: [c93.o, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v13 g40.h1, still in use, count: 2, list:
          (r3v13 g40.h1) from 0x025e: IF  (r3v13 g40.h1) == (null g40.h1)  -> B:143:? A[HIDDEN]
          (r3v13 g40.h1) from 0x0262: PHI (r3 I:??) = (r3v10 g40.h1), (r3v13 g40.h1) binds: [B:109:0x0261, B:142:0x0262] A[DONT_GENERATE, DONT_INLINE]
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
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: be.C3151d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3151d(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(3, interfaceC30057d);
        this.f12337w = i13;
        this.f12336E = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3151d(InterfaceC30057d interfaceC30057d, Object obj, int i13) {
        super(3, interfaceC30057d);
        this.f12337w = i13;
        this.f12336E = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3151d(InterfaceC30057d interfaceC30057d, Function1 function1) {
        super(3, interfaceC30057d);
        this.f12337w = 9;
        this.f12336E = (AbstractC22680m) function1;
    }
}
