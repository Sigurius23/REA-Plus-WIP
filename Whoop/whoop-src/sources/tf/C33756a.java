package tf;

import bc3.InterfaceC2994c0;
import bf.AbstractC3187b;
import bf.EnumC3188c;
import bg.C3215j;
import c93.InterfaceC4351m;
import eg.C13157f;
import eg.C13166o;
import j93.InterfaceC21461d;
import l83.C23454a0;
import l83.C23468n;
import p091dg.C12002a;
import p368og.EnumC27905b;
import p460rg.InterfaceC31373h;
import p505ts.AbstractC34132o;
import p522uf.C34894u;
import p550vd.AbstractC35903f;
import p647yf.InterfaceC39492e;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import vg.InterfaceC35957d;

/* JADX INFO: renamed from: tf.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C33756a extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C33759d f141250E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C34894u f141251F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C22665e0 f141252G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC39492e f141253H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f141254w = 1;

    /* JADX INFO: renamed from: x */
    public int f141255x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f141256y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC31373h f141257z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33756a(InterfaceC31373h interfaceC31373h, InterfaceC30057d interfaceC30057d, C33759d c33759d, C34894u c34894u, C22665e0 c22665e0, InterfaceC39492e interfaceC39492e) {
        super(2, interfaceC30057d);
        this.f141257z = interfaceC31373h;
        this.f141250E = c33759d;
        this.f141251F = c34894u;
        this.f141252G = c22665e0;
        this.f141253H = interfaceC39492e;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f141254w) {
            case 0:
                C33756a c33756a = new C33756a(this.f141257z, interfaceC30057d, this.f141250E, this.f141251F, this.f141253H, this.f141252G);
                c33756a.f141256y = obj;
                return c33756a;
            default:
                C33756a c33756a2 = new C33756a(this.f141257z, interfaceC30057d, this.f141250E, this.f141251F, this.f141252G, this.f141253H);
                c33756a2.f141256y = obj;
                return c33756a2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f141254w) {
            case 0:
                break;
        }
        return ((C33756a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM106726b;
        Object objM106726b2;
        switch (this.f141254w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f141255x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    int i14 = this.f141252G.f89334w;
                    this.f141256y = null;
                    this.f141255x = 1;
                    objM106726b = C33759d.m106726b(this.f141250E, this.f141251F, this.f141253H, i14, this);
                    if (objM106726b == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM106726b = ((C23468n) obj).f92940w;
                }
                return new C23468n(objM106726b);
            default:
                C34894u c34894u = this.f141251F;
                C12002a c12002a = c34894u.f146958a;
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f141256y;
                Object obj2 = EnumC31071a.f128113w;
                int i15 = this.f141255x;
                C22665e0 c22665e0 = this.f141252G;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C33759d c33759d = this.f141250E;
                    Class<?> cls = c33759d.f141271a.getClass();
                    C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(cls);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(C13166o.class))) {
                        AbstractC3187b.m9170b(c12002a, EnumC3188c.RETRY_MODE_STANDARD);
                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(C13157f.class))) {
                        AbstractC3187b.m9170b(c12002a, EnumC3188c.RETRY_MODE_ADAPTIVE);
                    }
                    if (c22665e0.f89334w > 1) {
                        InterfaceC30063j coroutineContext = interfaceC2994c0.getCoroutineContext();
                        C3215j c3215j = new C3215j(c22665e0, 13);
                        EnumC27905b enumC27905b = EnumC27905b.f112507z;
                        String qualifiedName = c22673i0.getOrCreateKotlinClass(C33759d.class).getQualifiedName();
                        if (qualifiedName == null) {
                            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
                        }
                        AbstractC35903f.m113983A(coroutineContext, enumC27905b, qualifiedName, null, c3215j);
                    }
                    C34894u c34894u2 = new C34894u(c12002a, ((InterfaceC35957d) c34894u.f146959b).mo14238a());
                    int i16 = c22665e0.f89334w;
                    this.f141256y = null;
                    this.f141255x = 1;
                    objM106726b2 = C33759d.m106726b(c33759d, c34894u2, this.f141253H, i16, this);
                    if (objM106726b2 != obj2) {
                    }
                    return obj2;
                }
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM106726b2 = ((C23468n) obj).f92940w;
                obj2 = objM106726b2;
                c22665e0.f89334w++;
                AbstractC34132o.m107864I(obj2);
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33756a(InterfaceC31373h interfaceC31373h, InterfaceC30057d interfaceC30057d, C33759d c33759d, C34894u c34894u, InterfaceC39492e interfaceC39492e, C22665e0 c22665e0) {
        super(2, interfaceC30057d);
        this.f141257z = interfaceC31373h;
        this.f141250E = c33759d;
        this.f141251F = c34894u;
        this.f141253H = interfaceC39492e;
        this.f141252G = c22665e0;
    }
}
