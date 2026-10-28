package gf;

import c93.InterfaceC4351m;
import java.util.Iterator;
import l83.C23454a0;
import q83.InterfaceC30057d;
import s83.AbstractC32274h;
import xb3.C38175j;

/* JADX INFO: renamed from: gf.p */
/* JADX INFO: loaded from: classes.dex */
public final class C15775p extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public int f59447E;

    /* JADX INFO: renamed from: F */
    public int f59448F;

    /* JADX INFO: renamed from: G */
    public int f59449G;

    /* JADX INFO: renamed from: H */
    public int f59450H;

    /* JADX INFO: renamed from: I */
    public /* synthetic */ Object f59451I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C15776q f59452J;

    /* JADX INFO: renamed from: x */
    public Iterator f59453x;

    /* JADX INFO: renamed from: y */
    public Object f59454y;

    /* JADX INFO: renamed from: z */
    public Iterator f59455z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15775p(C15776q c15776q, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f59452J = c15776q;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C15775p c15775p = new C15775p(this.f59452J, interfaceC30057d);
        c15775p.f59451I = obj;
        return c15775p;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C15775p) create((C38175j) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003f -> B:12:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f59451I
            xb3.j r0 = (xb3.C38175j) r0
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r10.f59450H
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L26
            if (r2 != r3) goto L1e
            int r2 = r10.f59449G
            int r5 = r10.f59448F
            int r6 = r10.f59447E
            java.util.Iterator r7 = r10.f59455z
            java.lang.Object r8 = r10.f59454y
            java.util.Iterator r9 = r10.f59453x
            p505ts.AbstractC34132o.m107864I(r11)
            goto L57
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            p505ts.AbstractC34132o.m107864I(r11)
            gf.q r11 = r10.f59452J
            java.util.Map r11 = r11.f59456w
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r9 = r11
            r6 = r4
        L39:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L7c
            java.lang.Object r11 = r9.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r8 = r11.getKey()
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r7 = r11.iterator()
            r2 = r4
            r5 = r2
        L57:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L39
            java.lang.Object r11 = r7.next()
            gf.j r4 = new gf.j
            r4.<init>(r8, r11)
            r10.f59451I = r0
            r10.f59453x = r9
            r10.f59454y = r8
            r10.f59455z = r7
            r10.f59447E = r6
            r10.f59448F = r5
            r10.f59449G = r2
            r10.f59450H = r3
            r0.m122271b(r4, r10)
            r83.a r11 = r83.EnumC31071a.f128113w
            return r1
        L7c:
            l83.a0 r11 = l83.C23454a0.f92919a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.C15775p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
