package p161g;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: g.u */
/* JADX INFO: loaded from: classes.dex */
public final class C14918u extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55600w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14923z f55601x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14918u(C14923z c14923z, int i13) {
        super(1);
        this.f55600w = i13;
        this.f55601x = c14923z;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 java.lang.Object, still in use, count: 2, list:
          (r2v5 java.lang.Object) from 0x0063: PHI (r2 I:??) = (r2v2 java.lang.Object), (r2v5 java.lang.Object) binds: [B:24:0x0062, B:37:0x0063] A[DONT_GENERATE, DONT_INLINE]
          (r2v5 java.lang.Object) from 0x0059: CHECK_CAST (g.t) (r2v5 java.lang.Object)
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
    @Override // p715kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f55600w
            switch(r0) {
                case 0: goto L3b;
                default: goto L5;
            }
        L5:
            g.a r5 = (p161g.C14894a) r5
            java.lang.String r0 = "backEvent"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r5, r0)
            g.z r0 = r4.f55601x
            g.t r1 = r0.f55616c
            if (r1 != 0) goto L33
            m83.m r0 = r0.f55615b
            int r1 = r0.mo74007a()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L1c:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.previous()
            r2 = r1
            g.t r2 = (p161g.AbstractC14917t) r2
            boolean r2 = r2.m43010g()
            if (r2 == 0) goto L1c
            goto L31
        L30:
            r1 = 0
        L31:
            g.t r1 = (p161g.AbstractC14917t) r1
        L33:
            if (r1 == 0) goto L38
            r1.mo4074e(r5)
        L38:
            l83.a0 r5 = l83.C23454a0.f92919a
            return r5
        L3b:
            g.a r5 = (p161g.C14894a) r5
            java.lang.String r0 = "backEvent"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r5, r0)
            g.z r0 = r4.f55601x
            m83.m r1 = r0.f55615b
            int r2 = r1.mo74007a()
            java.util.ListIterator r1 = r1.listIterator(r2)
        L4e:
            boolean r2 = r1.hasPrevious()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r1.previous()
            r3 = r2
            g.t r3 = (p161g.AbstractC14917t) r3
            boolean r3 = r3.m43010g()
            if (r3 == 0) goto L4e
            goto L63
        L62:
            r2 = 0
        L63:
            g.t r2 = (p161g.AbstractC14917t) r2
            g.t r1 = r0.f55616c
            if (r1 == 0) goto L6c
            r0.m43017c()
        L6c:
            r0.f55616c = r2
            if (r2 == 0) goto L73
            r2.mo4075f(r5)
        L73:
            l83.a0 r5 = l83.C23454a0.f92919a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p161g.C14918u.invoke(java.lang.Object):java.lang.Object");
    }
}
