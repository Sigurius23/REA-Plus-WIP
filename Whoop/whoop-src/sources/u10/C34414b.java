package u10;

import k20.C22136a;
import k20.EnumC22138c;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q20.C29838w;
import s10.C32064f;
import y00.C38915o4;
import y00.EnumC38853i;

/* JADX INFO: renamed from: u10.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C34414b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144635w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34416d f144636x;

    public /* synthetic */ C34414b(C34416d c34416d, int i13) {
        this.f144635w = i13;
        this.f144636x = c34416d;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C38915o4 c38915o4;
        int i13 = this.f144635w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C34416d c34416d = this.f144636x;
        switch (i13) {
            case 0:
                EnumC38853i it = (EnumC38853i) obj;
                AbstractC22676k.m65750j(it, "it");
                C22136a c22136a = c34416d.f144645e;
                EnumC22138c[] enumC22138cArr = EnumC22138c.f85883w;
                c22136a.m63390j(it);
                break;
            default:
                C38915o4 c38915o5 = (C38915o4) obj;
                C32064f c32064f = c34416d.f144644d;
                AbstractC29840y abstractC29840y = (AbstractC29840y) c32064f.f132973b.f45200w.getValue();
                String str = c38915o5.f167527w;
                C29838w c29838w = abstractC29840y instanceof C29838w ? (C29838w) abstractC29840y : null;
                if (AbstractC22676k.m65745e(str, (c29838w == null || (c38915o4 = c29838w.f121955x) == null) ? null : c38915o4.f167527w)) {
                    c32064f.m99630a(new C29838w(c38915o5, null, null));
                }
                break;
        }
        return c23454a0;
    }
}
