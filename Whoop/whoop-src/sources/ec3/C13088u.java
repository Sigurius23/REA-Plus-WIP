package ec3;

import bc3.InterfaceC2994c0;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ec3.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C13088u extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f45217E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC13058l f45218F;

    /* JADX INFO: renamed from: w */
    public long f45219w;

    /* JADX INFO: renamed from: x */
    public int f45220x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f45221y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f45222z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13088u(InterfaceC13058l interfaceC13058l, long j7, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f45217E = j7;
        this.f45218F = interfaceC13058l;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j7 = this.f45217E;
        C13088u c13088u = new C13088u(this.f45218F, j7, (InterfaceC30057d) obj3);
        c13088u.f45221y = (InterfaceC2994c0) obj;
        c13088u.f45222z = (InterfaceC13062m) obj2;
        return c13088u.invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00af  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00c3  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec3.C13088u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
