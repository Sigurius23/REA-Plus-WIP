package p668z1;

import c93.InterfaceC4351m;
import l83.C23454a0;
import q83.InterfaceC30057d;
import s83.AbstractC32274h;
import xb3.C38175j;

/* JADX INFO: renamed from: z1.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C39960i extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public int f172448E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f172449F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C39961j f172450G;

    /* JADX INFO: renamed from: x */
    public long[] f172451x;

    /* JADX INFO: renamed from: y */
    public int f172452y;

    /* JADX INFO: renamed from: z */
    public int f172453z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39960i(C39961j c39961j, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f172450G = c39961j;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C39960i c39960i = new C39960i(this.f172450G, interfaceC30057d);
        c39960i.f172449F = obj;
        return c39960i;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C39960i) create((C38175j) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:26:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c5 -> B:37:0x00c6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x009c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p668z1.C39960i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
