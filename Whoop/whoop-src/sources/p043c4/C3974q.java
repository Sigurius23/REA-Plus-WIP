package p043c4;

import android.graphics.Rect;
import androidx.compose.p018ui.Modifier;
import c93.InterfaceC4351m;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c4.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C3974q extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16193w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f16194x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f16195y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3974q(int i13, Object obj, Object obj2) {
        super(2);
        this.f16193w = i13;
        this.f16194x = obj;
        this.f16195y = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:138:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:141:0x0314  */
    /* JADX WARN: Code duplicated, block: B:144:0x0327  */
    /* JADX WARN: Code duplicated, block: B:186:0x0420  */
    /* JADX WARN: Code duplicated, block: B:88:0x0226  */
    /* JADX WARN: Code duplicated, block: B:90:0x022f  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v27 java.lang.Object, still in use, count: 2, list:
          (r6v27 java.lang.Object) from 0x02ac: PHI (r6 I:??) = (r6v23 java.lang.Object), (r6v27 java.lang.Object) binds: [B:116:0x02ab, B:234:0x02ac] A[DONT_GENERATE, DONT_INLINE]
          (r6v27 java.lang.Object) from 0x02a4: CHECK_CAST (com.amplitude.android.engagement.types.DebugStatus) (r6v27 java.lang.Object)
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
    @Override // c93.InterfaceC4351m
    public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p043c4.C3974q.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3974q(Rect rect, Modifier modifier, long j7, int i13) {
        super(2);
        this.f16193w = 6;
        this.f16194x = rect;
        this.f16195y = modifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3974q(Object obj, Object obj2, int i13, int i14) {
        super(2);
        this.f16193w = i14;
        this.f16194x = obj;
        this.f16195y = obj2;
    }
}
