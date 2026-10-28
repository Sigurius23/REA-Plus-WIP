package ec3;

import bc3.InterfaceC2994c0;
import com.whoop.data.local.room.dao.persistent.C6493d;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22667f0;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ec3.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C13082s extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f45202E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C6493d f45203F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC13058l f45204G;

    /* JADX INFO: renamed from: w */
    public C22669g0 f45205w;

    /* JADX INFO: renamed from: x */
    public C22667f0 f45206x;

    /* JADX INFO: renamed from: y */
    public int f45207y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f45208z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13082s(C6493d c6493d, InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f45203F = c6493d;
        this.f45204G = interfaceC13058l;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C13082s c13082s = new C13082s(this.f45203F, this.f45204G, (InterfaceC30057d) obj3);
        c13082s.f45208z = (InterfaceC2994c0) obj;
        c13082s.f45202E = (InterfaceC13062m) obj2;
        return c13082s.invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0072  */
    /* JADX WARN: Code duplicated, block: B:16:0x0079  */
    /* JADX WARN: Code duplicated, block: B:18:0x008f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac A[PHI: r7 r8 r9 r10
      0x00ac: PHI (r7v2 kotlin.jvm.internal.g0) = (r7v4 kotlin.jvm.internal.g0), (r7v5 kotlin.jvm.internal.g0), (r7v5 kotlin.jvm.internal.g0) binds: [B:26:0x00a9, B:15:0x0077, B:18:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r8v2 ??) = (r8v14 ??), (r8v15 ??), (r8v16 ??) binds: [B:26:0x00a9, B:15:0x0077, B:18:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r9v4 ec3.m) = (r9v15 ec3.m), (r9v16 ec3.m), (r9v16 ec3.m) binds: [B:26:0x00a9, B:15:0x0077, B:18:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r10v2 kotlin.jvm.internal.f0) = (r10v4 kotlin.jvm.internal.f0), (r10v6 kotlin.jvm.internal.f0), (r10v6 kotlin.jvm.internal.f0) binds: [B:26:0x00a9, B:15:0x0077, B:18:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:35:0x0108  */
    /* JADX WARN: Code duplicated, block: B:36:0x010d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [dc3.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9, types: [dc3.w] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec3.C13082s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
