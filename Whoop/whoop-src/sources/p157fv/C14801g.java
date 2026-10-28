package p157fv;

import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: fv.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C14801g extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f54928w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f54929x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f54930y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14801g(Object obj, boolean z4, int i13) {
        super(0);
        this.f54928w = i13;
        this.f54930y = obj;
        this.f54929x = z4;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v16 java.lang.Object, still in use, count: 2, list:
          (r6v16 java.lang.Object) from 0x0067: PHI (r6 I:??) = (r6v13 java.lang.Object), (r6v16 java.lang.Object) binds: [B:24:0x0066, B:64:0x0067] A[DONT_GENERATE, DONT_INLINE]
          (r6v16 java.lang.Object) from 0x005f: CHECK_CAST (c33.l) (r6v16 java.lang.Object)
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
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p157fv.C14801g.invoke():java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14801g(boolean z4, Object obj, int i13) {
        super(0);
        this.f54928w = i13;
        this.f54929x = z4;
        this.f54930y = obj;
    }
}
