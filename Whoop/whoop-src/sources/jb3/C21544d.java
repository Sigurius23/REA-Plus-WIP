package jb3;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: jb3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C21544d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82620w;

    /* JADX INFO: renamed from: x */
    public final C21548h f82621x;

    public /* synthetic */ C21544d(C21548h c21548h, int i13) {
        this.f82620w = i13;
        this.f82621x = c21548h;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fe  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 java.lang.Object, still in use, count: 2, list:
          (r2v5 java.lang.Object) from 0x01f0: PHI (r2 I:??) = (r2v2 java.lang.Object), (r2v5 java.lang.Object) binds: [B:69:0x01ef, B:87:0x01f0] A[DONT_GENERATE, DONT_INLINE]
          (r2v5 java.lang.Object) from 0x01de: CHECK_CAST (qa3.o) (r2v5 java.lang.Object)
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
    @Override // c93.InterfaceC4339a
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jb3.C21544d.invoke():java.lang.Object");
    }
}
