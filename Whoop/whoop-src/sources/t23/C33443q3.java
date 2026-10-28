package t23;

import bc3.C3033m;
import eu.C13610f;
import f53.C14123k;
import ge3.AbstractC15751g;
import io.getstream.video.android.model.User;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import yb3.AbstractC39414r;
import zd3.C40571o;

/* JADX INFO: renamed from: t23.q3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33443q3 extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139596w;

    /* JADX INFO: renamed from: x */
    public int f139597x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33366b4 f139598y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33443q3(C33366b4 c33366b4, InterfaceC30057d interfaceC30057d, int i13) {
        super(1, interfaceC30057d);
        this.f139596w = i13;
        this.f139598y = c33366b4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        switch (this.f139596w) {
            case 0:
                return new C33443q3(this.f139598y, interfaceC30057d, 0);
            default:
                return new C33443q3(this.f139598y, interfaceC30057d, 1);
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj;
        switch (this.f139596w) {
            case 0:
                break;
        }
        return ((C33443q3) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f139596w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f139597x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C34830n0 c34830n0 = new C34830n0();
                    c34830n0.m109905f("https://hint.stream-io-video.com/");
                    c34830n0.m109904e("HEAD", null);
                    C40571o c40571oM109898b = this.f139598y.f139232E.f168479g.m109898b(new C34832o0(c34830n0));
                    this.f139597x = 1;
                    C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(this));
                    c3033m.m8774s();
                    c40571oM109898b.m131548d(new C13610f(c3033m, 8));
                    obj = c3033m.m8773r();
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C34850x0 c34850x0 = (C34850x0) obj;
                if (c34850x0.f146788Q) {
                    String strM109863a = c34850x0.f146777F.m109863a("X-Amz-Cf-Pop");
                    return strM109863a != null ? AbstractC39414r.m125866L0(3, strM109863a) : "missing-location";
                }
                throw new Error("Unexpected code " + c34850x0);
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f139597x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C33366b4 c33366b4 = this.f139598y;
                    C14123k c14123k = c33366b4.f139232E.f168482j;
                    User userM31011a = c33366b4.f139236I.m31011a();
                    this.f139597x = 1;
                    if (c14123k.m40224i(userM31011a, this) == enumC31071a2) {
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
