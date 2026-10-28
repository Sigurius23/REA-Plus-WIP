package a63;

import b63.C2768f;
import c93.InterfaceC4352n;
import c93.InterfaceC4354p;
import e63.C12775d;
import ec3.InterfaceC13062m;
import f63.C14156d;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r63.AbstractC30993e;
import s83.AbstractC32275i;
import v53.C35709c;

/* JADX INFO: renamed from: a63.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C0493j extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f1661E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1662w;

    /* JADX INFO: renamed from: x */
    public int f1663x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f1664y;

    /* JADX INFO: renamed from: z */
    public Object f1665z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0493j(int i13, InterfaceC30057d interfaceC30057d) {
        super(i13, interfaceC30057d);
        this.f1662w = 0;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f1662w) {
            case 0:
                C0493j c0493j = new C0493j(3, (InterfaceC30057d) obj3);
                c0493j.f1661E = (AbstractC30993e) obj;
                c0493j.f1664y = (C14156d) obj2;
                return c0493j.invokeSuspend(C23454a0.f92919a);
            case 1:
                C0493j c0493j2 = new C0493j((C0498o) this.f1661E, (InterfaceC30057d) obj3, 1);
                c0493j2.f1664y = (AbstractC30993e) obj;
                c0493j2.f1665z = obj2;
                return c0493j2.invokeSuspend(C23454a0.f92919a);
            case 2:
                C0493j c0493j3 = new C0493j((C0498o) this.f1661E, (InterfaceC30057d) obj3, 2);
                c0493j3.f1664y = (AbstractC30993e) obj;
                c0493j3.f1665z = (C14156d) obj2;
                return c0493j3.invokeSuspend(C23454a0.f92919a);
            case 3:
                C0493j c0493j4 = new C0493j((C0498o) this.f1661E, (InterfaceC30057d) obj3, 3);
                c0493j4.f1664y = (InterfaceC0492i0) obj;
                c0493j4.f1665z = (C12775d) obj2;
                return c0493j4.invokeSuspend(C23454a0.f92919a);
            case 4:
                C0493j c0493j5 = new C0493j((C2768f) this.f1665z, false, (InterfaceC30057d) obj3, 4);
                c0493j5.f1661E = (AbstractC30993e) obj;
                c0493j5.f1664y = (C14156d) obj2;
                return c0493j5.invokeSuspend(C23454a0.f92919a);
            case 5:
                C0493j c0493j6 = new C0493j(this.f1661E, (InterfaceC30057d) obj3, 5);
                c0493j6.f1665z = (InterfaceC13062m) obj;
                c0493j6.f1664y = obj2;
                return c0493j6.invokeSuspend(C23454a0.f92919a);
            case 6:
                C0493j c0493j7 = new C0493j((InterfaceC30057d) obj3, (InterfaceC4352n) this.f1664y, 6);
                c0493j7.f1665z = (InterfaceC13062m) obj;
                c0493j7.f1661E = (Object[]) obj2;
                return c0493j7.invokeSuspend(C23454a0.f92919a);
            case 7:
                C0493j c0493j8 = new C0493j((InterfaceC30057d) obj3, (InterfaceC4354p) this.f1664y, 7);
                c0493j8.f1665z = (InterfaceC13062m) obj;
                c0493j8.f1661E = (Object[]) obj2;
                return c0493j8.invokeSuspend(C23454a0.f92919a);
            case 8:
                C0493j c0493j9 = new C0493j((Function3) this.f1664y, (InterfaceC30057d) obj3);
                c0493j9.f1665z = (InterfaceC13062m) obj;
                c0493j9.f1661E = (Object[]) obj2;
                return c0493j9.invokeSuspend(C23454a0.f92919a);
            default:
                C0493j c0493j10 = new C0493j((C35709c) this.f1665z, false, (InterfaceC30057d) obj3, 9);
                c0493j10.f1661E = (AbstractC30993e) obj;
                c0493j10.f1664y = obj2;
                return c0493j10.invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0649 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 27521. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 2752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a63.C0493j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0493j(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(3, interfaceC30057d);
        this.f1662w = i13;
        this.f1661E = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0493j(Object obj, boolean z4, InterfaceC30057d interfaceC30057d, int i13) {
        super(3, interfaceC30057d);
        this.f1662w = i13;
        this.f1665z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0493j(Function3 function3, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f1662w = 8;
        this.f1664y = function3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0493j(InterfaceC30057d interfaceC30057d, InterfaceC23459e interfaceC23459e, int i13) {
        super(3, interfaceC30057d);
        this.f1662w = i13;
        this.f1664y = interfaceC23459e;
    }
}
