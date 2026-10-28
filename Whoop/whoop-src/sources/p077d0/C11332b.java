package p077d0;

import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22659b0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: d0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C11332b extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f36302E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C11390p1 f36303F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ long f36304G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Function1 f36305H;

    /* JADX INFO: renamed from: w */
    public C11376m f36306w;

    /* JADX INFO: renamed from: x */
    public C22659b0 f36307x;

    /* JADX INFO: renamed from: y */
    public int f36308y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C11344e f36309z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11332b(C11344e c11344e, Object obj, C11390p1 c11390p1, long j7, Function1 function1, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f36309z = c11344e;
        this.f36302E = obj;
        this.f36303F = c11390p1;
        this.f36304G = j7;
        this.f36305H = function1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C11332b(this.f36309z, this.f36302E, this.f36303F, this.f36304G, this.f36305H, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C11332b) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        C11376m c11376m;
        C22659b0 c22659b0;
        C11390p1 c11390p1 = this.f36303F;
        C11344e c11344e = this.f36309z;
        C11376m c11376m2 = c11344e.f36343c;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f36308y;
        try {
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                c11376m2.f36472y = (AbstractC11395r) c11344e.f36341a.f36396a.invoke(this.f36302E);
                c11344e.f36345e.setValue(c11390p1.f36522c);
                c11344e.f36344d.setValue(Boolean.TRUE);
                C11376m c11376m3 = new C11376m(c11376m2.f36470w, c11376m2.f36471x.getValue(), AbstractC11348f.m30564l(c11376m2.f36472y), c11376m2.f36473z, Long.MIN_VALUE, c11376m2.f36469F);
                C22659b0 c22659b1 = new C22659b0();
                long j7 = this.f36304G;
                C11328a c11328a = new C11328a(c11344e, c11376m3, this.f36305H, c22659b1, 0);
                this.f36306w = c11376m3;
                this.f36307x = c22659b1;
                this.f36308y = 1;
                if (AbstractC11348f.m30556d(c11376m3, c11390p1, j7, c11328a, this) == enumC31071a) {
                    return enumC31071a;
                }
                c11376m = c11376m3;
                c22659b0 = c22659b1;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c22659b0 = this.f36307x;
                c11376m = this.f36306w;
                AbstractC34132o.m107864I(obj);
            }
            EnumC11360i enumC11360i = c22659b0.f89329w ? EnumC11360i.f36414w : EnumC11360i.f36415x;
            C11344e.m30546b(c11344e);
            return new C11364j(c11376m, enumC11360i);
        } catch (CancellationException e5) {
            C11344e.m30546b(c11344e);
            throw e5;
        }
    }
}
