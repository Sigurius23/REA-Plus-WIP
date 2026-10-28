package xa3;

import l83.C23454a0;
import lb3.AbstractC23811y;
import o93.AbstractC27741m;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: xa3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C38146g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f163315w;

    /* JADX INFO: renamed from: x */
    public static final C38146g f163312x = new C38146g(0);

    /* JADX INFO: renamed from: y */
    public static final C38146g f163313y = new C38146g(1);

    /* JADX INFO: renamed from: z */
    public static final C38146g f163314z = new C38146g(2);

    /* JADX INFO: renamed from: E */
    public static final C38146g f163311E = new C38146g(3);

    public /* synthetic */ C38146g(int i13) {
        this.f163315w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f163315w) {
            case 0:
                AbstractC23811y it = (AbstractC23811y) obj;
                C38148i c38148i = C38148i.f163318c;
                AbstractC22676k.m65750j(it, "it");
                return it;
            case 1:
                C38148i c38148i2 = C38148i.f163318c;
                return "";
            case 2:
                InterfaceC38150k withOptions = (InterfaceC38150k) obj;
                C38148i c38148i3 = C38148i.f163318c;
                AbstractC22676k.m65750j(withOptions, "$this$withOptions");
                withOptions.mo122210l(AbstractC12350b.m34556E(withOptions.mo122201f(), AbstractC37056f.m118959K(AbstractC27741m.f111865p, AbstractC27741m.f111866q)));
                return C23454a0.f92919a;
            default:
                String it3 = (String) obj;
                AbstractC22676k.m65750j(it3, "it");
                return it3;
        }
    }
}
