package wb3;

import j93.InterfaceC21461d;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wb3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C37055e implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C37055e f158544x = new C37055e(0);

    /* JADX INFO: renamed from: y */
    public static final C37055e f158545y = new C37055e(1);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158546w;

    public /* synthetic */ C37055e(int i13) {
        this.f158546w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class<?> declaringClass;
        InterfaceC21461d it = (InterfaceC21461d) obj;
        switch (this.f158546w) {
            case 0:
                AbstractC22676k.m65750j(it, "it");
                if (!it.isInner() || (declaringClass = AbstractC21598x.m60663S(it).getDeclaringClass()) == null) {
                    return null;
                }
                return AbstractC21598x.m60666V(declaringClass);
            default:
                AbstractC22676k.m65750j(it, "it");
                return it.getTypeParameters();
        }
    }
}
