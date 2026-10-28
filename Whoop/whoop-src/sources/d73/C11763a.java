package d73;

import a73.C0526a;
import b73.C2789a;
import java.util.Collections;
import p012ab.C0684i0;
import p171g9.C15594k;
import te3.C33754a;
import te3.C33755b;
import z63.AbstractC40129a;

/* JADX INFO: renamed from: d73.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11763a extends AbstractC40129a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38086a;

    public /* synthetic */ C11763a(int i13) {
        this.f38086a = i13;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:1: B:14:0x0033->B:30:?, LOOP_END, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v13 z63.a, still in use, count: 2, list:
          (r2v13 z63.a) from 0x0021: INVOKE (r2v13 z63.a) VIRTUAL call: java.lang.Object.getClass():java.lang.Class A[MD:():java.lang.Class<?> (c), WRAPPED]
          (r2v13 z63.a) from 0x002d: PHI (r2 I:??) = (r2v1 z63.a), (r2v13 z63.a) binds: [B:11:0x002c, B:26:0x002d] A[DONT_GENERATE, DONT_INLINE]
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
    @Override // z63.AbstractC40129a
    /* JADX INFO: renamed from: b */
    public void mo31500b(z63.C40132d r7) {
        /*
            r6 = this;
            int r0 = r6.f38086a
            switch(r0) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r0 = r7.f173183w
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r7.f173184x
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            r3 = 0
            java.lang.Class<a73.b> r4 = a73.C0527b.class
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            z63.a r2 = (z63.AbstractC40129a) r2
            java.lang.Class r5 = r2.getClass()
            boolean r5 = r4.isAssignableFrom(r5)
            if (r5 == 0) goto L12
            goto L2d
        L2c:
            r2 = r3
        L2d:
            if (r2 != 0) goto L71
            java.util.Iterator r1 = r0.iterator()
        L33:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r1.next()
            z63.a r2 = (z63.AbstractC40129a) r2
            java.lang.Class r5 = r2.getClass()
            boolean r5 = r4.isAssignableFrom(r5)
            if (r5 == 0) goto L33
            r3 = r2
        L4a:
            if (r3 == 0) goto L51
            r7.m128676a(r3)
            r2 = r3
            goto L71
        L51:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested plugin is not added: "
            r1.<init>(r2)
            java.lang.String r2 = r4.getName()
            r1.append(r2)
            java.lang.String r2 = ", plugins: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        L71:
            a73.b r2 = (a73.C0527b) r2
            i73.a r7 = new i73.a
            r7.<init>()
            java.util.ArrayList r0 = r2.f1822a
            r0.add(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d73.C11763a.mo31500b(z63.d):void");
    }

    @Override // z63.AbstractC40129a
    /* JADX INFO: renamed from: c */
    public void mo31501c(C0684i0 c0684i0) {
        switch (this.f38086a) {
            case 0:
                c0684i0.m1728s(Collections.singleton(new C33755b(0)));
                break;
        }
    }

    @Override // z63.AbstractC40129a
    /* JADX INFO: renamed from: d */
    public void mo1293d(C15594k c15594k) {
        switch (this.f38086a) {
            case 0:
                c15594k.m43894b(C33754a.class, new C2789a(9));
                break;
        }
    }

    @Override // z63.AbstractC40129a
    /* JADX INFO: renamed from: e */
    public void mo1294e(C15594k c15594k) {
        switch (this.f38086a) {
            case 0:
                c15594k.m43893a(C33754a.class, new C0526a(15));
                break;
        }
    }
}
