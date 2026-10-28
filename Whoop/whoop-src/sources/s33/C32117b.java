package s33;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import mc3.C25437c;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: s33.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C32117b extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C32118c f133136E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133137w;

    /* JADX INFO: renamed from: x */
    public C25437c f133138x;

    /* JADX INFO: renamed from: y */
    public C32118c f133139y;

    /* JADX INFO: renamed from: z */
    public int f133140z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32117b(C32118c c32118c, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f133137w = i13;
        this.f133136E = c32118c;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f133137w) {
            case 0:
                return new C32117b(this.f133136E, interfaceC30057d, 0);
            default:
                return new C32117b(this.f133136E, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f133137w) {
            case 0:
                break;
        }
        return ((C32117b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:22:0x0058, B:24:0x0060), top: B:63:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8 A[Catch: all -> 0x00eb, TRY_LEAVE, TryCatch #1 {all -> 0x00eb, blocks: (B:50:0x00ca, B:52:0x00d8), top: B:65:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0057 -> B:63:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s33.C32117b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
