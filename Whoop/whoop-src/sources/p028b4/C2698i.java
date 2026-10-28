package p028b4;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p077d0.C11344e;
import p180h0.C16410k;
import p512u2.C34460g0;
import q83.InterfaceC30057d;
import s23.C32091d;
import s83.AbstractC32275i;
import t23.C33366b4;
import t23.C33425n0;

/* JADX INFO: renamed from: b4.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C2698i extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10611w;

    /* JADX INFO: renamed from: x */
    public int f10612x;

    /* JADX INFO: renamed from: y */
    public long f10613y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f10614z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2698i(long j7, Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f10611w = i13;
        this.f10613y = j7;
        this.f10614z = obj;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f10611w) {
            case 0:
                return new C2698i((AbstractC2701l) this.f10614z, this.f10613y, interfaceC30057d, 0);
            case 1:
                return new C2698i((C11344e) this.f10614z, this.f10613y, interfaceC30057d, 1);
            case 2:
                return new C2698i((C16410k) this.f10614z, this.f10613y, interfaceC30057d, 2);
            case 3:
                return new C2698i(this.f10613y, (C33425n0) this.f10614z, interfaceC30057d, 3);
            case 4:
                return new C2698i((C32091d) this.f10614z, this.f10613y, interfaceC30057d, 4);
            case 5:
                return new C2698i((C33366b4) this.f10614z, interfaceC30057d);
            default:
                return new C2698i(this.f10613y, (C34460g0) this.f10614z, interfaceC30057d, 6);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f10611w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((C2698i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (bc3.AbstractC3034m0.m8782b(8, r13) == r0) goto L17;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p028b4.C2698i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2698i(Object obj, long j7, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f10611w = i13;
        this.f10614z = obj;
        this.f10613y = j7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2698i(C33366b4 c33366b4, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f10611w = 5;
        this.f10614z = c33366b4;
    }
}
