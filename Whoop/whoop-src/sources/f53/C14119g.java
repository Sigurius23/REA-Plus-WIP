package f53;

import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import x43.AbstractC37979k;

/* JADX INFO: renamed from: f53.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C14119g extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C14119g f50735x;

    /* JADX INFO: renamed from: y */
    public static final C14119g f50736y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50737w;

    static {
        int i13 = 1;
        f50735x = new C14119g(i13, 0);
        f50736y = new C14119g(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14119g(int i13, int i14) {
        super(i13);
        this.f50737w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f50737w) {
            case 0:
                AbstractC37979k listener = (AbstractC37979k) obj;
                AbstractC22676k.m65750j(listener, "listener");
                listener.mo40219d();
                return C23454a0.f92919a;
            default:
                return (String) obj;
        }
    }
}
