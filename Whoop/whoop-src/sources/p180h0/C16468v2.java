package p180h0;

import androidx.compose.foundation.gestures.AbstractC1097b;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p181h2.C16617b;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.v2 */
/* JADX INFO: loaded from: classes.dex */
public final class C16468v2 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public int f63270w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ long f63271x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16473w2 f63272y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16468v2(C16473w2 c16473w2, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f63272y = c16473w2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C16468v2 c16468v2 = new C16468v2(this.f63272y, interfaceC30057d);
        c16468v2.f63271x = ((C16617b) obj).f63937a;
        return c16468v2;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        long j7 = ((C16617b) obj).f63937a;
        C16468v2 c16468v2 = new C16468v2(this.f63272y, (InterfaceC30057d) obj2);
        c16468v2.f63271x = j7;
        return c16468v2.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f63270w;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        long j7 = this.f63271x;
        C16372c3 c16372c3 = this.f63272y.f63298e0;
        this.f63270w = 1;
        Object objM3373a = AbstractC1097b.m3373a(c16372c3, j7, this);
        return objM3373a == enumC31071a ? enumC31071a : objM3373a;
    }
}
