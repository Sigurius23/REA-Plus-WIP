package p163g1;

import androidx.compose.foundation.gestures.GestureCancellationException;
import l83.C23454a0;
import p180h0.C16398h2;
import p181h2.C16617b;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.d6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14986d6 extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f56017E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC28601c1 f56018F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC28670t2 f56019G;

    /* JADX INFO: renamed from: w */
    public int f56020w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ C16398h2 f56021x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ long f56022y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f56023z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14986d6(boolean z4, float f13, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f56023z = z4;
        this.f56017E = f13;
        this.f56018F = interfaceC28601c1;
        this.f56019G = interfaceC28670t2;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j7 = ((C16617b) obj2).f63937a;
        InterfaceC28601c1 interfaceC28601c1 = this.f56018F;
        InterfaceC28670t2 interfaceC28670t2 = this.f56019G;
        C14986d6 c14986d6 = new C14986d6(this.f56023z, this.f56017E, interfaceC28601c1, interfaceC28670t2, (InterfaceC30057d) obj3);
        c14986d6.f56021x = (C16398h2) obj;
        c14986d6.f56022y = j7;
        return c14986d6.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        float fIntBitsToFloat;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f56020w;
        InterfaceC28601c1 interfaceC28601c1 = this.f56018F;
        try {
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C16398h2 c16398h2 = this.f56021x;
                long j7 = this.f56022y;
                if (this.f56023z) {
                    fIntBitsToFloat = this.f56017E - Float.intBitsToFloat((int) (j7 >> 32));
                } else {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                }
                interfaceC28601c1.setValue(new Float(fIntBitsToFloat - ((Number) this.f56019G.getValue()).floatValue()));
                this.f56020w = 1;
                if (c16398h2.m46586a(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (GestureCancellationException unused) {
            interfaceC28601c1.setValue(new Float(0.0f));
        }
        return C23454a0.f92919a;
    }
}
