package b30;

import android.view.View;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p132f0.C13798k;
import p512u2.EnumC34466l;
import p512u2.InterfaceC34449b;
import q83.InterfaceC30057d;
import s83.AbstractC32274h;
import xb3.C38175j;

/* JADX INFO: renamed from: b30.g2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2525g2 extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f9818E;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f9819x;

    /* JADX INFO: renamed from: y */
    public int f9820y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f9821z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2525g2(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f9819x = i13;
        this.f9818E = obj;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f9819x) {
            case 0:
                C2525g2 c2525g2 = new C2525g2((InterfaceC4339a) this.f9818E, interfaceC30057d, 0);
                c2525g2.f9821z = obj;
                return c2525g2;
            case 1:
                C2525g2 c2525g3 = new C2525g2((C13798k) this.f9818E, interfaceC30057d, 1);
                c2525g3.f9821z = obj;
                return c2525g3;
            case 2:
                C2525g2 c2525g4 = new C2525g2((View) this.f9818E, interfaceC30057d, 2);
                c2525g4.f9821z = obj;
                return c2525g4;
            default:
                C2525g2 c2525g5 = new C2525g2((EnumC34466l) this.f9818E, interfaceC30057d, 3);
                c2525g5.f9821z = obj;
                return c2525g5;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9819x) {
            case 0:
                return ((C2525g2) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C2525g2) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C2525g2) create((C38175j) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C2525g2) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0114  */
    /* JADX WARN: Code duplicated, block: B:62:0x0126 A[LOOP:1: B:58:0x0112->B:62:0x0126, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x012a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00e2 -> B:51:0x00e5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b30.C2525g2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
