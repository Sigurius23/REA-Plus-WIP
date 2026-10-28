package androidx.room;

import c93.InterfaceC4351m;
import l83.C23454a0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: androidx.room.h2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1793h2 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public int f7077E;

    /* JADX INFO: renamed from: F */
    public int f7078F;

    /* JADX INFO: renamed from: G */
    public int f7079G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ EnumC1783f0[] f7080H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C1797i2 f7081I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC1843x1 f7082J;

    /* JADX INFO: renamed from: w */
    public EnumC1783f0[] f7083w;

    /* JADX INFO: renamed from: x */
    public C1797i2 f7084x;

    /* JADX INFO: renamed from: y */
    public InterfaceC1843x1 f7085y;

    /* JADX INFO: renamed from: z */
    public int f7086z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1793h2(EnumC1783f0[] enumC1783f0Arr, C1797i2 c1797i2, InterfaceC1843x1 interfaceC1843x1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f7080H = enumC1783f0Arr;
        this.f7081I = c1797i2;
        this.f7082J = interfaceC1843x1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C1793h2(this.f7080H, this.f7081I, this.f7082J, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C1793h2) create((InterfaceC1837v1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:26:0x0076). Please report as a decompilation issue!!! */
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
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r10.f7079G
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto Lc
            if (r1 != r2) goto L1c
        Lc:
            int r1 = r10.f7078F
            int r4 = r10.f7077E
            int r5 = r10.f7086z
            androidx.room.x1 r6 = r10.f7085y
            androidx.room.i2 r7 = r10.f7084x
            androidx.room.f0[] r8 = r10.f7083w
            p505ts.AbstractC34132o.m107864I(r11)
            goto L58
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            p505ts.AbstractC34132o.m107864I(r11)
            androidx.room.f0[] r11 = r10.f7080H
            int r1 = r11.length
            r4 = 0
            androidx.room.i2 r5 = r10.f7081I
            androidx.room.x1 r6 = r10.f7082J
            r8 = r11
            r11 = r4
            r7 = r5
        L32:
            if (r4 >= r1) goto L78
            r5 = r8[r4]
            int r9 = r11 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L75
            if (r5 == r3) goto L60
            if (r5 != r2) goto L5a
            r10.f7083w = r8
            r10.f7084x = r7
            r10.f7085y = r6
            r10.f7086z = r9
            r10.f7077E = r4
            r10.f7078F = r1
            r10.f7079G = r2
            java.lang.Object r11 = androidx.room.C1797i2.m5422d(r7, r6, r11, r10)
            if (r11 != r0) goto L57
            goto L74
        L57:
            r5 = r9
        L58:
            r11 = r5
            goto L76
        L5a:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L60:
            r10.f7083w = r8
            r10.f7084x = r7
            r10.f7085y = r6
            r10.f7086z = r9
            r10.f7077E = r4
            r10.f7078F = r1
            r10.f7079G = r3
            java.lang.Object r11 = androidx.room.C1797i2.m5421c(r7, r6, r11, r10)
            if (r11 != r0) goto L57
        L74:
            return r0
        L75:
            r11 = r9
        L76:
            int r4 = r4 + r3
            goto L32
        L78:
            l83.a0 r11 = l83.C23454a0.f92919a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C1793h2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
