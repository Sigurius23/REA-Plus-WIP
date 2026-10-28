package d30;

import bc3.AbstractC3006f0;
import e30.AbstractC12605c;
import ec3.C13045h2;
import h20.C16687l;
import k20.C22136a;
import k20.C22139d;
import k20.C22146k;
import k20.EnumC22138c;
import l83.C23454a0;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q20.C29838w;
import q80.C30036h;
import r20.C30865c;
import r20.C30866d;
import r20.C30878p;
import r20.InterfaceC30881s;
import t20.InterfaceC33340u;
import y00.EnumC38853i;

/* JADX INFO: renamed from: d30.f */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11529f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37146w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC12605c f37147x;

    public /* synthetic */ C11529f(AbstractC12605c abstractC12605c, int i13) {
        this.f37146w = i13;
        this.f37147x = abstractC12605c;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        int i13 = this.f37146w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC12605c abstractC12605c = this.f37147x;
        switch (i13) {
            case 0:
                C16687l it = (C16687l) obj;
                AbstractC22676k.m65750j(it, "it");
                C29838w c29838w = new C29838w(it.f64178b, null, null);
                abstractC12605c.m35340z(c29838w);
                abstractC12605c.f43026x.m63399s(c29838w);
                break;
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    abstractC12605c.f43009M.m94919b();
                } else {
                    C30866d c30866d = abstractC12605c.f43009M;
                    c30866d.getClass();
                    C30036h c30036h = new C30036h(c30866d, 9);
                    if (!c30866d.f127268e.getAndSet(true)) {
                        AbstractC3006f0.m8732z(c30866d.f127264a, null, null, new C30865c(c30036h, c30866d, null), 3);
                    }
                }
                break;
            case 2:
                C16687l it3 = (C16687l) obj;
                AbstractC22676k.m65750j(it3, "it");
                abstractC12605c.f43023a0.m47285f(it3);
                break;
            case 3:
                InterfaceC30881s poppedScreen = (InterfaceC30881s) obj;
                AbstractC22676k.m65750j(poppedScreen, "poppedScreen");
                C22139d c22139d = abstractC12605c.f43021Y;
                c22139d.getClass();
                if (poppedScreen instanceof C30878p) {
                    C22136a c22136a = c22139d.f85885b;
                    c22136a.getClass();
                    C22136a.m63387i(c22136a, new C22146k(3));
                }
                break;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                abstractC12605c.f43028z.m5004e(bool, "processing");
                break;
            case 5:
                InterfaceC41211c error = (InterfaceC41211c) obj;
                AbstractC22676k.m65750j(error, "error");
                abstractC12605c.mo35337v(error);
                break;
            case 6:
                abstractC12605c.m35340z((AbstractC29840y) obj);
                break;
            case 7:
                EnumC38853i it4 = (EnumC38853i) obj;
                AbstractC22676k.m65750j(it4, "it");
                C22136a c22136a2 = abstractC12605c.f43026x;
                EnumC22138c[] enumC22138cArr = EnumC22138c.f85883w;
                c22136a2.m63390j(it4);
                break;
            case 8:
                InterfaceC33340u it5 = (InterfaceC33340u) obj;
                AbstractC22676k.m65750j(it5, "it");
                abstractC12605c.f43026x.m63400t(it5);
                break;
            default:
                Function1 it6 = (Function1) obj;
                AbstractC22676k.m65750j(it6, "it");
                C13045h2 c13045h2 = abstractC12605c.f43015S;
                do {
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, it6.invoke(value)));
                break;
        }
        return c23454a0;
    }
}
