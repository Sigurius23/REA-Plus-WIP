package ec3;

import c93.InterfaceC4351m;
import java.util.List;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ec3.m2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13065m2 implements InterfaceC13087t1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC13087t1 f45149w;

    /* JADX INFO: renamed from: x */
    public final AbstractC32275i f45150x;

    /* JADX WARN: Multi-variable type inference failed */
    public C13065m2(InterfaceC13087t1 interfaceC13087t1, InterfaceC4351m interfaceC4351m) {
        this.f45149w = interfaceC13087t1;
        this.f45150x = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [c93.m, s83.i] */
    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        C13061l2 c13061l2;
        if (interfaceC30057d instanceof C13061l2) {
            c13061l2 = (C13061l2) interfaceC30057d;
            int i13 = c13061l2.f45139y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13061l2.f45139y = i13 - Integer.MIN_VALUE;
            } else {
                c13061l2 = new C13061l2(this, interfaceC30057d);
            }
        } else {
            c13061l2 = new C13061l2(this, interfaceC30057d);
        }
        Object obj = c13061l2.f45137w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13061l2.f45139y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C13057k2 c13057k2 = new C13057k2(interfaceC13062m, this.f45150x);
            c13061l2.f45139y = 1;
            if (this.f45149w.collect(c13057k2, c13061l2) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // ec3.InterfaceC13087t1
    public final List getReplayCache() {
        return this.f45149w.getReplayCache();
    }
}
