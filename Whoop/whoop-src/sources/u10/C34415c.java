package u10;

import c93.InterfaceC4351m;
import h20.C16776z4;
import java.io.Serializable;
import l83.C23454a0;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q20.C29838w;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s10.C32064f;
import s83.AbstractC32275i;
import y00.C38915o4;

/* JADX INFO: renamed from: u10.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C34415c extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144637w;

    /* JADX INFO: renamed from: x */
    public int f144638x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f144639y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C34416d f144640z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C34415c(C34416d c34416d, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f144637w = i13;
        this.f144640z = c34416d;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f144637w) {
            case 0:
                C34415c c34415c = new C34415c(this.f144640z, interfaceC30057d, 0);
                c34415c.f144639y = obj;
                return c34415c;
            default:
                C34415c c34415c2 = new C34415c(this.f144640z, interfaceC30057d, 1);
                c34415c2.f144639y = obj;
                return c34415c2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C38915o4 c38915o4 = (C38915o4) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f144637w) {
            case 0:
                break;
        }
        return ((C34415c) create(c38915o4, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        C38915o4 c38915o4;
        C38915o4 c38915o5;
        Object objM47283d;
        switch (this.f144637w) {
            case 0:
                C34416d c34416d = this.f144640z;
                C32064f c32064f = c34416d.f144644d;
                Serializable serializable = EnumC31071a.f128113w;
                int i13 = this.f144638x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C38915o4 c38915o6 = (C38915o4) this.f144639y;
                    C16776z4 c16776z4 = (C16776z4) c34416d.f144641a.get();
                    this.f144639y = c38915o6;
                    this.f144638x = 1;
                    Serializable serializableM47281b = c16776z4.m47281b(c38915o6, this);
                    if (serializableM47281b != serializable) {
                        c38915o4 = c38915o6;
                        obj = serializableM47281b;
                    }
                    return serializable;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c38915o4 = (C38915o4) this.f144639y;
                AbstractC34132o.m107864I(obj);
                serializable = (Throwable) obj;
                if (serializable == null) {
                    AbstractC29840y abstractC29840y = (AbstractC29840y) c32064f.f132973b.f45200w.getValue();
                    String str = c38915o4.f167527w;
                    C29838w c29838w = abstractC29840y instanceof C29838w ? (C29838w) abstractC29840y : null;
                    if (AbstractC22676k.m65745e(str, (c29838w == null || (c38915o5 = c29838w.f121955x) == null) ? null : c38915o5.f167527w)) {
                        c32064f.m99630a(null);
                    }
                }
                return serializable;
            default:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f144638x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C38915o4 c38915o7 = (C38915o4) this.f144639y;
                    C16776z4 c16776z5 = (C16776z4) this.f144640z.f144641a.get();
                    this.f144638x = 1;
                    objM47283d = c16776z5.m47283d(c38915o7, this);
                    if (objM47283d == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM47283d = ((C23468n) obj).f92940w;
                }
                return new C23468n(objM47283d);
        }
    }
}
