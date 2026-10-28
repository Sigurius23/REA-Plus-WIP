package d20;

import a30.C0332w0;
import android.content.Context;
import android.os.Bundle;
import b10.C2273z0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.security.KeyPair;
import java.security.PublicKey;
import l83.C23454a0;
import l83.C23468n;
import p127ev.C13668i;
import p395p6.AbstractC28916s0;
import p505ts.AbstractC34132o;
import p537ux.C35357s0;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29895b;
import q30.C29896b0;
import q30.C29910i0;
import q30.C29915l;
import q30.C29920n0;
import q30.C29926q0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import y00.C38781a7;
import y00.C38841g7;
import y00.C39016z6;

/* JADX INFO: renamed from: d20.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C11500p extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f36980E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f36981F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f36982G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36983w;

    /* JADX INFO: renamed from: x */
    public int f36984x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f36985y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f36986z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11500p(C0332w0 c0332w0, C38841g7 c38841g7, int i13, C11502r c11502r, C39857f c39857f, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f36983w = 0;
        this.f36985y = c0332w0;
        this.f36981F = c38841g7;
        this.f36986z = i13;
        this.f36980E = c11502r;
        this.f36982G = c39857f;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f36983w) {
            case 0:
                return new C11500p((C0332w0) this.f36985y, (C38841g7) this.f36981F, this.f36986z, (C11502r) this.f36980E, (C39857f) this.f36982G, interfaceC30057d);
            case 1:
                return new C11500p((C38781a7) this.f36981F, (C0332w0) this.f36985y, this.f36986z, (C11502r) this.f36980E, (String) this.f36982G, interfaceC30057d);
            case 2:
                C11500p c11500p = new C11500p((AbstractC28916s0) this.f36981F, (Context) this.f36980E, this.f36986z, (Bundle) this.f36982G, interfaceC30057d, 2);
                c11500p.f36985y = obj;
                return c11500p;
            default:
                C11500p c11500p2 = new C11500p((AbstractC28916s0) this.f36981F, (Context) this.f36980E, this.f36986z, (String) this.f36982G, interfaceC30057d, 3);
                c11500p2.f36985y = obj;
                return c11500p2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f36983w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C11500p) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8705K;
        Object obj2;
        switch (this.f36983w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f36984x;
                if (i13 != 0) {
                    if (i13 == 1) {
                        AbstractC34132o.m107864I(obj);
                        objM8705K = obj;
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        obj2 = ((C23468n) obj).f92940w;
                    }
                    return new C23468n(obj2);
                }
                AbstractC34132o.m107864I(obj);
                C0332w0 c0332w0 = (C0332w0) this.f36985y;
                this.f36984x = 1;
                C13668i c13668i = (C13668i) c0332w0.f1168x;
                String str = (String) c0332w0.f1170z;
                PublicKey publicKey = (PublicKey) c0332w0.f1169y;
                String str2 = (String) c0332w0.f1164E;
                C29926q0 c29926q0 = (C29926q0) c0332w0.f1165F;
                PublicKey publicKey2 = ((KeyPair) c0332w0.f1166G).getPublic();
                AbstractC22676k.m65749i(publicKey2, "getPublic(...)");
                objM8705K = AbstractC3006f0.m8705K((InterfaceC30063j) c13668i.f48462i, new C29896b0(c29926q0, c13668i, publicKey2, str2, str, publicKey, null), this);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
                C29895b c29895b = (C29895b) objM8705K;
                C39016z6 c39016z6 = new C39016z6(((C38841g7) this.f36981F).f167184w, c29895b.f122137y, c29895b.f122138z, c29895b.f122136x.f122226w, c29895b.f122135w, c29895b.f122133E, c29895b.f122134F, this.f36986z, null);
                C2273z0 c2273z0 = ((C11502r) this.f36980E).f37003y;
                C39857f c39857f = (C39857f) this.f36982G;
                this.f36984x = 2;
                Object objM7076V = c2273z0.m7076V(c39016z6, c39857f, this);
                if (objM7076V == enumC31071a) {
                    return enumC31071a;
                }
                obj2 = objM7076V;
                return new C23468n(obj2);
            case 1:
                C11502r c11502r = (C11502r) this.f36980E;
                Object c11490f = EnumC31071a.f128113w;
                int i14 = this.f36984x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    long j7 = C35357s0.f150613m;
                    this.f36984x = 1;
                    if (AbstractC3034m0.m8782b(j7, this) != c11490f) {
                    }
                    return c11490f;
                }
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                C38781a7 c38781a7 = (C38781a7) this.f36981F;
                C29915l c29915l = new C29915l(c38781a7.f166926w, c38781a7.f166929z, null, c38781a7.f166928y, null);
                C0332w0 c0332w1 = (C0332w0) this.f36985y;
                String clientSecret = c11502r.f37002x.f36968y.getClientSecret();
                if (clientSecret == null) {
                    clientSecret = "";
                }
                String str3 = (String) this.f36982G;
                C39857f c39857f2 = c11502r.f37000N;
                C29920n0 c29920n0 = new C29920n0(clientSecret, str3, c39857f2.f172128w, c39857f2.f172129x);
                c0332w1.getClass();
                KeyPair keyPair = (KeyPair) c0332w1.f1166G;
                int i15 = this.f36986z;
                c11490f = new C11490f(new C29910i0("3DS_LOA_SDK_STIN_020200_00960", keyPair, c29915l, i15 < 5 ? 5 : i15, c29920n0));
                return c11490f;
            case 2:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i16 = this.f36984x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f36985y;
                    AbstractC28916s0 abstractC28916s0 = (AbstractC28916s0) this.f36981F;
                    Context context = (Context) this.f36980E;
                    Bundle bundle = (Bundle) this.f36982G;
                    this.f36984x = 1;
                    if (abstractC28916s0.m87828c(interfaceC2994c0, context, this.f36986z, bundle, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i17 = this.f36984x;
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) this.f36985y;
                    AbstractC28916s0 abstractC28916s1 = (AbstractC28916s0) this.f36981F;
                    Context context2 = (Context) this.f36980E;
                    String str4 = (String) this.f36982G;
                    this.f36984x = 1;
                    if (abstractC28916s1.m87827b(interfaceC2994c1, context2, this.f36986z, str4, this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11500p(AbstractC28916s0 abstractC28916s0, Context context, int i13, Object obj, InterfaceC30057d interfaceC30057d, int i14) {
        super(2, interfaceC30057d);
        this.f36983w = i14;
        this.f36981F = abstractC28916s0;
        this.f36980E = context;
        this.f36986z = i13;
        this.f36982G = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11500p(C38781a7 c38781a7, C0332w0 c0332w0, int i13, C11502r c11502r, String str, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f36983w = 1;
        this.f36981F = c38781a7;
        this.f36985y = c0332w0;
        this.f36986z = i13;
        this.f36980E = c11502r;
        this.f36982G = str;
    }
}
