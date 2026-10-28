package p114eb;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C1625s1;
import androidx.lifecycle.EnumC1635w;
import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import p249jc.AbstractC21598x;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eb.p */
/* JADX INFO: loaded from: classes.dex */
public final class C12980p extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44832w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12982q f44833x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12980p(C12982q c12982q, int i13) {
        super(0);
        this.f44832w = i13;
        this.f44833x = c12982q;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f44832w) {
            case 0:
                C12982q c12982q = this.f44833x;
                Context context = c12982q.f44843w;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new C1625s1(applicationContext instanceof Application ? (Application) applicationContext : null, c12982q, c12982q.m36479a());
            default:
                C12982q c12982q2 = this.f44833x;
                if (!c12982q2.f44839J) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (c12982q2.f44837H.f6250d == EnumC1635w.f6325w) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                C41113q c41113q = new C41113q(c12982q2.getViewModelStore(), new C12976n(c12982q2), c12982q2.getDefaultViewModelCreationExtras());
                InterfaceC21461d modelClass = AbstractC21598x.m60666V(C12978o.class);
                AbstractC22676k.m65750j(modelClass, "modelClass");
                String qualifiedName = modelClass.getQualifiedName();
                if (qualifiedName != null) {
                    return ((C12978o) c41113q.m133475w("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), modelClass)).m36472g();
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
    }
}
