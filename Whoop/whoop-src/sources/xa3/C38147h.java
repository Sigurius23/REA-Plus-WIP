package xa3;

import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.EnumC23776g1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xa3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C38147h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f163316w;

    /* JADX INFO: renamed from: x */
    public final C38148i f163317x;

    public /* synthetic */ C38147h(C38148i c38148i, int i13) {
        this.f163316w = i13;
        this.f163317x = c38148i;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f163316w) {
            case 0:
                AbstractC23804u0 it = (AbstractC23804u0) obj;
                AbstractC22676k.m65750j(it, "it");
                if (it.mo69869c()) {
                    return "*";
                }
                AbstractC23811y abstractC23811yMo69868b = it.mo69868b();
                AbstractC22676k.m65749i(abstractC23811yMo69868b, "getType(...)");
                String strM122188X = this.f163317x.m122188X(abstractC23811yMo69868b);
                if (it.mo69867a() == EnumC23776g1.INVARIANT) {
                    return strM122188X;
                }
                return it.mo69867a() + ' ' + strM122188X;
            default:
                AbstractC23811y abstractC23811y = (AbstractC23811y) obj;
                AbstractC22676k.m65747g(abstractC23811y);
                return this.f163317x.m122188X(abstractC23811y);
        }
    }
}
