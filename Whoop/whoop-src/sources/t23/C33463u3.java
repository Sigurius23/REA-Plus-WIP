package t23;

import bc3.AbstractC3006f0;
import io.getstream.android.video.generated.apis.ProductvideoApi;
import io.getstream.android.video.generated.models.JoinCallRequest;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import mg.C25527i;
import mg.InterfaceC25526h;
import ng.C26671a;
import ng.C26676f;
import ng.C26678h;
import p035bp.AbstractC3511b;
import p097ds.AbstractC12314q;
import p460rg.AbstractC31375j;
import p460rg.C31371f;
import p460rg.C31372g;
import p460rg.C31374i;
import p460rg.C31377l;
import p460rg.EnumC31369d;
import p460rg.EnumC31370e;
import p460rg.InterfaceC31373h;
import p505ts.AbstractC34132o;
import p522uf.C34894u;
import p647yf.InterfaceC39492e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import tf.C33756a;
import tf.C33759d;

/* JADX INFO: renamed from: t23.u3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33463u3 extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f139724E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f139725F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f139726G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139727w;

    /* JADX INFO: renamed from: x */
    public int f139728x;

    /* JADX INFO: renamed from: y */
    public Object f139729y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f139730z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33463u3(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC30057d interfaceC30057d, int i13) {
        super(1, interfaceC30057d);
        this.f139727w = i13;
        this.f139730z = obj;
        this.f139724E = obj2;
        this.f139725F = obj3;
        this.f139726G = obj4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        switch (this.f139727w) {
            case 0:
                return new C33463u3((C33366b4) this.f139730z, (String) this.f139724E, (String) this.f139725F, (JoinCallRequest) this.f139726G, interfaceC30057d, 0);
            default:
                return new C33463u3((C22665e0) this.f139730z, (C33759d) this.f139724E, (C34894u) this.f139725F, (InterfaceC39492e) this.f139726G, interfaceC30057d, 1);
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj;
        switch (this.f139727w) {
            case 0:
                break;
        }
        return ((C33463u3) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e9 A[Catch: all -> 0x002b, TryCatch #3 {all -> 0x002b, blocks: (B:8:0x0023, B:43:0x00e5, B:45:0x00e9, B:47:0x00f9, B:46:0x00f1), top: B:67:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f1 A[Catch: all -> 0x002b, TryCatch #3 {all -> 0x002b, blocks: (B:8:0x0023, B:43:0x00e5, B:45:0x00e9, B:47:0x00f9, B:46:0x00f1), top: B:67:0x0023 }] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProductvideoApi productvideoApiM124884a;
        Object objM105794l;
        C31371f c31371f;
        C31371f c31371f2;
        InterfaceC30063j c26678h;
        Object objM8705K;
        InterfaceC25526h interfaceC25526h;
        int i13 = this.f139727w;
        Object obj2 = this.f139726G;
        Object obj3 = this.f139725F;
        Object obj4 = this.f139724E;
        C26676f c26676f = null;
        Object obj5 = this.f139730z;
        switch (i13) {
            case 0:
                C33366b4 c33366b4 = (C33366b4) obj5;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f139728x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    productvideoApiM124884a = c33366b4.f139232E.m124884a();
                    this.f139729y = productvideoApiM124884a;
                    this.f139728x = 1;
                    objM105794l = C33366b4.m105794l(c33366b4, this);
                    if (objM105794l != enumC31071a) {
                    }
                    return enumC31071a;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                productvideoApiM124884a = (ProductvideoApi) this.f139729y;
                AbstractC34132o.m107864I(obj);
                objM105794l = obj;
                this.f139729y = null;
                this.f139728x = 2;
                Object objJoinCall = productvideoApiM124884a.joinCall((String) obj4, (String) obj3, (String) objM105794l, (JoinCallRequest) obj2, this);
                if (objJoinCall != enumC31071a) {
                    return objJoinCall;
                }
                return enumC31071a;
            default:
                C22665e0 c22665e0 = (C22665e0) obj5;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f139728x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c31371f2 = (C31371f) this.f139729y;
                    try {
                        try {
                            AbstractC34132o.m107864I(obj);
                            c31371f = c31371f2;
                            objM8705K = obj;
                            c31371f.getClass();
                            return objM8705K;
                        } catch (Exception e5) {
                            e = e5;
                            if (e instanceof CancellationException) {
                                AbstractC31375j.m96498n(c31371f2, "cancelled", Boolean.TRUE);
                            } else {
                                EnumC31370e[] enumC31370eArr = EnumC31370e.f129032w;
                                c31371f2.getClass();
                                AbstractC31375j.m96497m(c31371f2, e);
                            }
                            throw e;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c31371f2.getClass();
                        throw th;
                    }
                }
                AbstractC34132o.m107864I(obj);
                String name = "Attempt-" + c22665e0.f89334w;
                C33759d c33759d = (C33759d) obj4;
                C34894u c34894u = (C34894u) obj3;
                InterfaceC39492e interfaceC39492e = (InterfaceC39492e) obj2;
                EnumC31369d enumC31369d = EnumC31369d.f129029w;
                if (AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33759d.class).getQualifiedName() == null) {
                    throw new IllegalArgumentException("withSpan<T> cannot be used on an anonymous object");
                }
                ((C31377l) AbstractC3511b.m10394w(getContext()).mo75077d()).getClass();
                AbstractC12314q.m34346z(getContext());
                AbstractC22676k.m65750j(name, "name");
                InterfaceC31373h.f129036s.getClass();
                c31371f = C31372g.f129035b;
                try {
                    C25527i c25527i = (C25527i) getContext().get(C25527i.f99938x);
                    if (c25527i != null && (interfaceC25526h = c25527i.f99939w) != null && interfaceC25526h.mo75076b() != null) {
                        c26676f = C26671a.f106051a;
                    }
                    C30064k c30064k = C30064k.f122676w;
                    if (c26676f != null) {
                        c26678h = new C26678h(c26676f);
                    } else {
                        c26678h = (C26678h) getContext().get(C26678h.f106054x);
                        if (c26678h == null) {
                            c26678h = c30064k;
                        }
                    }
                    InterfaceC30063j interfaceC30063jPlus = new C31374i(c31371f).plus(c26678h).plus(c30064k);
                    C33756a c33756a = new C33756a(c31371f, (InterfaceC30057d) null, c33759d, c34894u, c22665e0, interfaceC39492e);
                    this.f139729y = c31371f;
                    this.f139728x = 1;
                    objM8705K = AbstractC3006f0.m8705K(interfaceC30063jPlus, c33756a, this);
                    if (objM8705K == enumC31071a2) {
                        return enumC31071a2;
                    }
                    c31371f.getClass();
                    return objM8705K;
                } catch (Exception e13) {
                    e = e13;
                    c31371f2 = c31371f;
                    if (e instanceof CancellationException) {
                        AbstractC31375j.m96498n(c31371f2, "cancelled", Boolean.TRUE);
                    } else {
                        EnumC31370e[] enumC31370eArr2 = EnumC31370e.f129032w;
                        c31371f2.getClass();
                        AbstractC31375j.m96497m(c31371f2, e);
                    }
                    throw e;
                } catch (Throwable th4) {
                    th = th4;
                    c31371f2 = c31371f;
                    c31371f2.getClass();
                    throw th;
                }
        }
    }
}
