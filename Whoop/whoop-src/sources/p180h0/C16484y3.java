package p180h0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.y3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16484y3 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f63349E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C16489z3 f63350F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63351w = 1;

    /* JADX INFO: renamed from: x */
    public C22669g0 f63352x;

    /* JADX INFO: renamed from: y */
    public C22669g0 f63353y;

    /* JADX INFO: renamed from: z */
    public int f63354z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16484y3(C16489z3 c16489z3, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f63350F = c16489z3;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f63351w) {
            case 0:
                C16484y3 c16484y3 = new C16484y3(this.f63353y, this.f63350F, interfaceC30057d);
                c16484y3.f63349E = obj;
                return c16484y3;
            default:
                C16484y3 c16484y4 = new C16484y3(this.f63350F, interfaceC30057d);
                c16484y4.f63349E = obj;
                return c16484y4;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f63351w) {
            case 0:
                return ((C16484y3) create((C16381e0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C16484y3) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0089 -> B:15:0x0039). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00ed -> B:51:0x00ee). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p180h0.C16484y3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16484y3(C22669g0 c22669g0, C16489z3 c16489z3, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f63353y = c22669g0;
        this.f63350F = c16489z3;
    }
}
