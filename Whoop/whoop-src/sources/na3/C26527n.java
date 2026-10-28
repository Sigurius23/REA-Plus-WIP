package na3;

import cb3.AbstractC4393e;
import ka3.C22316h;
import l83.C23454a0;
import lb3.AbstractC23773f1;
import lb3.AbstractC23811y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q93.C30080d;
import r93.InterfaceC31111c;
import r93.InterfaceC31126h;
import r93.InterfaceC31151q0;
import u93.AbstractC34670d;
import va3.C35847e;
import va3.C35850h;
import ya3.EnumC39374q;

/* JADX INFO: renamed from: na3.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C26527n implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f105460w;

    /* JADX INFO: renamed from: x */
    public static final C26527n f105457x = new C26527n(0);

    /* JADX INFO: renamed from: y */
    public static final C26527n f105458y = new C26527n(1);

    /* JADX INFO: renamed from: z */
    public static final C26527n f105459z = new C26527n(2);

    /* JADX INFO: renamed from: E */
    public static final C26527n f105456E = new C26527n(3);

    public /* synthetic */ C26527n(int i13) {
        this.f105460w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f105460w) {
            case 0:
                InterfaceC31111c it = (InterfaceC31111c) obj;
                AbstractC22676k.m65750j(it, "it");
                InterfaceC31151q0 interfaceC31151q0Mo78667B = it.mo78667B();
                AbstractC22676k.m65747g(interfaceC31151q0Mo78667B);
                return ((AbstractC34670d) interfaceC31151q0Mo78667B).getType();
            case 1:
                InterfaceC31111c it3 = (InterfaceC31111c) obj;
                AbstractC22676k.m65750j(it3, "it");
                AbstractC23811y returnType = it3.getReturnType();
                AbstractC22676k.m65747g(returnType);
                return returnType;
            case 2:
                AbstractC23773f1 it4 = (AbstractC23773f1) obj;
                AbstractC22676k.m65750j(it4, "it");
                return Boolean.valueOf(it4 instanceof C22316h);
            case 3:
                InterfaceC31126h interfaceC31126hMo1784d = ((AbstractC23773f1) obj).mo69844i0().mo1784d();
                if (interfaceC31126hMo1784d == null) {
                    return Boolean.FALSE;
                }
                C35850h name = interfaceC31126hMo1784d.getName();
                C35847e c35847e = C30080d.f122764f;
                return Boolean.valueOf(AbstractC22676k.m65745e(name, c35847e.f152613a.m113796g()) && AbstractC22676k.m65745e(AbstractC4393e.m13805c(interfaceC31126hMo1784d), c35847e));
            default:
                C26528o function = (C26528o) obj;
                AbstractC22676k.m65750j(function, "$this$function");
                String strConcat = "java/util/".concat("Spliterator");
                C26517d c26517d = AbstractC26525l.f105449b;
                function.m78603c(strConcat, c26517d, c26517d);
                EnumC39374q enumC39374q = EnumC39374q.f169426w;
                return C23454a0.f92919a;
        }
    }
}
