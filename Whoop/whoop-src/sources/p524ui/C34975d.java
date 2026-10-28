package p524ui;

import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import l83.C23454a0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ui.d */
/* JADX INFO: loaded from: classes.dex */
public final class C34975d extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f147967E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C34981i f147968F;

    /* JADX INFO: renamed from: w */
    public int f147969w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f147970x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC3027k1 f147971y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f147972z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34975d(int i13, InterfaceC3027k1 interfaceC3027k1, int i14, int i15, C34981i c34981i, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f147970x = i13;
        this.f147971y = interfaceC3027k1;
        this.f147972z = i14;
        this.f147967E = i15;
        this.f147968F = c34981i;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C34975d(this.f147970x, this.f147971y, this.f147972z, this.f147967E, this.f147968F, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C34975d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:20:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r5.f147969w
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            p505ts.AbstractC34132o.m107864I(r6)
            goto L5d
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            p505ts.AbstractC34132o.m107864I(r6)
        L18:
            int[] r6 = p524ui.AbstractC34973c.f147960a
            int r1 = r5.f147970x
            int r1 = p108e4.AbstractC12682p.m35485e(r1)
            r6 = r6[r1]
            int r1 = r5.f147972z
            if (r6 != r2) goto L31
            bc3.k1 r6 = r5.f147971y
            boolean r6 = r6.isActive()
            if (r6 == 0) goto L2f
            goto L31
        L2f:
            int r1 = r5.f147967E
        L31:
            r5.f147969w = r2
            ui.i r6 = r5.f147968F
            r6.getClass()
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r3) goto L48
            ui.f r3 = new ui.f
            r4 = 0
            r3.<init>(r6, r1, r4)
            java.lang.Object r6 = p077d0.AbstractC11348f.m30576x(r3, r5)
            goto L5a
        L48:
            ui.f r3 = new ui.f
            r4 = 1
            r3.<init>(r6, r1, r4)
            q83.j r6 = r5.getContext()
            p1.w0 r6 = p390p1.AbstractC28683x.m87268v(r6)
            java.lang.Object r6 = r6.mo7286k(r3, r5)
        L5a:
            if (r6 != r0) goto L5d
            return r0
        L5d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L18
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p524ui.C34975d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
