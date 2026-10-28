package p002a0;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32274h;
import xb3.C38175j;

/* JADX INFO: renamed from: a0.s0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0051s0 extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public int f153E;

    /* JADX INFO: renamed from: F */
    public int f154F;

    /* JADX INFO: renamed from: G */
    public /* synthetic */ Object f155G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C0055u0 f156H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C0053t0 f157I;

    /* JADX INFO: renamed from: x */
    public C0053t0 f158x;

    /* JADX INFO: renamed from: y */
    public C0055u0 f159y;

    /* JADX INFO: renamed from: z */
    public long[] f160z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0051s0(C0055u0 c0055u0, C0053t0 c0053t0, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f156H = c0055u0;
        this.f157I = c0053t0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C0051s0 c0051s0 = new C0051s0(this.f156H, this.f157I, interfaceC30057d);
        c0051s0.f155G = obj;
        return c0051s0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C0051s0) create((C38175j) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        C38175j c38175j;
        C0055u0 c0055u0;
        long[] jArr;
        int i13;
        C0053t0 c0053t0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = this.f154F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c38175j = (C38175j) this.f155G;
            c0055u0 = this.f156H;
            C0049r0 c0049r0 = c0055u0.f168x;
            jArr = c0049r0.f142c;
            i13 = c0049r0.f144e;
            c0053t0 = this.f157I;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = this.f153E;
            jArr = this.f160z;
            c0055u0 = this.f159y;
            c0053t0 = this.f158x;
            c38175j = (C38175j) this.f155G;
            AbstractC34132o.m107864I(obj);
        }
        if (i13 == Integer.MAX_VALUE) {
            return C23454a0.f92919a;
        }
        int i15 = (int) ((jArr[i13] >> 31) & 2147483647L);
        c0053t0.f163x = i13;
        Object obj2 = c0055u0.f168x.f141b[i13];
        this.f155G = c38175j;
        this.f158x = c0053t0;
        this.f159y = c0055u0;
        this.f160z = jArr;
        this.f153E = i15;
        this.f154F = 1;
        c38175j.m122271b(obj2, this);
        return enumC31071a;
    }
}
