package androidx.room;

import c93.InterfaceC4351m;
import l83.C23454a0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: androidx.room.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1842x0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f7209E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f7210F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ String[] f7211G;

    /* JADX INFO: renamed from: w */
    public String[] f7212w;

    /* JADX INFO: renamed from: x */
    public int f7213x;

    /* JADX INFO: renamed from: y */
    public int f7214y;

    /* JADX INFO: renamed from: z */
    public int f7215z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1842x0(boolean z4, String[] strArr, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f7210F = z4;
        this.f7211G = strArr;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C1842x0 c1842x0 = new C1842x0(this.f7210F, this.f7211G, interfaceC30057d);
        c1842x0.f7209E = obj;
        return c1842x0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C1842x0) create((InterfaceC1837v1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (p505ts.AbstractC34132o.m107890r(r1, "PRAGMA defer_foreign_keys = TRUE", r9) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (p505ts.AbstractC34132o.m107890r(r6, r10, r9) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0065 -> B:20:0x0068). Please report as a decompilation issue!!! */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r9.f7215z
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            int r1 = r9.f7214y
            int r4 = r9.f7213x
            java.lang.String[] r5 = r9.f7212w
            java.lang.Object r6 = r9.f7209E
            androidx.room.v1 r6 = (androidx.room.InterfaceC1837v1) r6
            p505ts.AbstractC34132o.m107864I(r10)
            goto L68
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            java.lang.Object r1 = r9.f7209E
            androidx.room.v1 r1 = (androidx.room.InterfaceC1837v1) r1
            p505ts.AbstractC34132o.m107864I(r10)
            goto L43
        L2a:
            p505ts.AbstractC34132o.m107864I(r10)
            java.lang.Object r10 = r9.f7209E
            r1 = r10
            androidx.room.v1 r1 = (androidx.room.InterfaceC1837v1) r1
            boolean r10 = r9.f7210F
            if (r10 == 0) goto L43
            r9.f7209E = r1
            r9.f7215z = r3
            java.lang.String r10 = "PRAGMA defer_foreign_keys = TRUE"
            java.lang.Object r10 = p505ts.AbstractC34132o.m107890r(r1, r10, r9)
            if (r10 != r0) goto L43
            goto L67
        L43:
            java.lang.String[] r10 = r9.f7211G
            int r4 = r10.length
            r5 = 0
            r6 = r1
            r1 = r4
            r4 = r5
            r5 = r10
        L4b:
            if (r4 >= r1) goto L6a
            r10 = r5[r4]
            java.lang.String r7 = "DELETE FROM `"
            r8 = 96
            java.lang.String r10 = r80.AbstractC31061c.m95633i(r8, r7, r10)
            r9.f7209E = r6
            r9.f7212w = r5
            r9.f7213x = r4
            r9.f7214y = r1
            r9.f7215z = r2
            java.lang.Object r10 = p505ts.AbstractC34132o.m107890r(r6, r10, r9)
            if (r10 != r0) goto L68
        L67:
            return r0
        L68:
            int r4 = r4 + r3
            goto L4b
        L6a:
            l83.a0 r10 = l83.C23454a0.f92919a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C1842x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
