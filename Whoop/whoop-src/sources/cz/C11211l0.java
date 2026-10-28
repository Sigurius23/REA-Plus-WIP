package cz;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29838w;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import y00.C38915o4;

/* JADX INFO: renamed from: cz.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11211l0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Boolean f35947E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35948w;

    /* JADX INFO: renamed from: x */
    public int f35949x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11215n0 f35950y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C29838w f35951z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11211l0(C11215n0 c11215n0, C29838w c29838w, Boolean bool, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f35948w = i13;
        this.f35950y = c11215n0;
        this.f35951z = c29838w;
        this.f35947E = bool;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f35948w) {
            case 0:
                return new C11211l0(this.f35950y, this.f35951z, this.f35947E, interfaceC30057d, 0);
            default:
                return new C11211l0(this.f35950y, this.f35951z, this.f35947E, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f35948w) {
            case 0:
                return ((C11211l0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            default:
                ((C11211l0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f35948w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f35949x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f35949x = 1;
                    obj = this.f35950y.f35973y.m49430e(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    AbstractC34132o.m107864I(obj);
                }
                if (obj != null) {
                    throw new ClassCastException();
                }
                C29838w c29838w = this.f35951z;
                if (c29838w != null) {
                    C38915o4 c38915o4 = c29838w.f121955x;
                    String id4 = c38915o4.f167527w;
                    if (!c38915o4.m124364f()) {
                        boolean z4 = c38915o4.f167525S;
                    }
                    AbstractC22676k.m65750j(id4, "id");
                }
                AbstractC22676k.m65745e(this.f35947E, Boolean.TRUE);
                this.f35949x = 2;
                throw null;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f35949x;
                InterfaceC30057d interfaceC30057d = null;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11215n0 c11215n0 = this.f35950y;
                    InterfaceC30063j interfaceC30063j = c11215n0.f35957F;
                    C11211l0 c11211l0 = new C11211l0(c11215n0, this.f35951z, this.f35947E, interfaceC30057d, 0);
                    this.f35949x = 1;
                    obj = AbstractC3006f0.m8705K(interfaceC30063j, c11211l0, this);
                    if (obj == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                if (obj != null) {
                    throw new ClassCastException();
                }
                AbstractC5583n.m16797x();
                throw null;
        }
    }
}
