package p342nj;

import l83.C23454a0;
import p181h2.C16620e;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17918w0;
import p208i2.C17891j;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: nj.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C26739d extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ long f106349w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26739d(long j7) {
        super(1);
        this.f106349w = j7;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC22131e Canvas = (InterfaceC22131e) obj;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        float f13 = 2;
        c17891jM51478a.m51462i(C16620e.m47213e(Canvas.mo731d()) / f13, C16620e.m47211c(Canvas.mo731d()));
        c17891jM51478a.m51461h(0.0f, 0.0f);
        c17891jM51478a.m51461h(C16620e.m47213e(Canvas.mo731d()), 0.0f);
        c17891jM51478a.m51459f();
        C17891j c17891jM51478a2 = AbstractC17897m.m51478a();
        c17891jM51478a2.m51462i(C16620e.m47213e(Canvas.mo731d()) / f13, C16620e.m47211c(Canvas.mo731d()));
        c17891jM51478a2.m51461h(0.0f, 0.0f);
        c17891jM51478a2.m51462i(C16620e.m47213e(Canvas.mo731d()) / f13, C16620e.m47211c(Canvas.mo731d()));
        c17891jM51478a2.m51461h(C16620e.m47213e(Canvas.mo731d()), 0.0f);
        InterfaceC22131e.m63386z(Canvas, c17891jM51478a, this.f106349w, 0.0f, null, 60);
        InterfaceC22131e.m63386z(Canvas, c17891jM51478a2, AbstractC17918w0.m51516d(226, 226, 226, 255), 0.0f, new C22135i(1.0f, 0.0f, 0, 0, null, 30), 52);
        return C23454a0.f92919a;
    }
}
