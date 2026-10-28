package r20;

import androidx.recyclerview.widget.AbstractC1707m0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: r20.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C30865c extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public int f127261w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f127262x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C30866d f127263y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30865c(InterfaceC4339a interfaceC4339a, C30866d c30866d, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f127262x = interfaceC4339a;
        this.f127263y = c30866d;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C30865c(this.f127262x, this.f127263y, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C30865c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f127261w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            Duration.Companion companion = Duration.INSTANCE;
            long duration = DurationKt.toDuration(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, DurationUnit.MILLISECONDS);
            this.f127261w = 1;
            if (AbstractC3034m0.m8783c(duration, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        this.f127262x.invoke();
        this.f127263y.f127268e.set(false);
        return C23454a0.f92919a;
    }
}
