package p395p6;

import android.content.Context;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: p6.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28913r0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Context f117014E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int[] f117015F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f117016w;

    /* JADX INFO: renamed from: x */
    public int f117017x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f117018y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC28916s0 f117019z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28913r0(AbstractC28916s0 abstractC28916s0, Context context, int[] iArr, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f117016w = i13;
        this.f117019z = abstractC28916s0;
        this.f117014E = context;
        this.f117015F = iArr;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f117016w) {
            case 0:
                C28913r0 c28913r0 = new C28913r0(this.f117019z, this.f117014E, this.f117015F, interfaceC30057d, 0);
                c28913r0.f117018y = obj;
                return c28913r0;
            default:
                C28913r0 c28913r1 = new C28913r0(this.f117019z, this.f117014E, this.f117015F, interfaceC30057d, 1);
                c28913r1.f117018y = obj;
                return c28913r1;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f117016w) {
            case 0:
                break;
        }
        return ((C28913r0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f117016w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f117017x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f117018y;
                    this.f117017x = 1;
                    if (this.f117019z.m87826a(interfaceC2994c0, this.f117014E, this.f117015F, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f117017x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) this.f117018y;
                    this.f117017x = 1;
                    if (this.f117019z.m87829d(interfaceC2994c1, this.f117014E, this.f117015F, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
