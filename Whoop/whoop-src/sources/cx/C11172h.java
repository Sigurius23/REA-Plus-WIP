package cx;

import android.os.Build;
import android.os.Environment;
import ax.InterfaceC2116a;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: cx.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C11172h extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C11174j f35760w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11172h(C11174j c11174j) {
        super(0);
        this.f35760w = c11174j;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = Build.VERSION.SDK_INT;
        C11174j c11174j = this.f35760w;
        if (i13 < 30) {
            InterfaceC11166b interfaceC11166b = c11174j.f35773y;
            if (interfaceC11166b == null) {
                AbstractC22676k.m65757q("task");
                throw null;
            }
            ((AbstractC11165a) interfaceC11166b).m30273a();
        } else if (Environment.isExternalStorageManager()) {
            InterfaceC11166b interfaceC11166b2 = c11174j.f35773y;
            if (interfaceC11166b2 == null) {
                AbstractC22676k.m65757q("task");
                throw null;
            }
            ((AbstractC11165a) interfaceC11166b2).m30273a();
        } else {
            C11175k c11175k = c11174j.f35772x;
            if (c11175k == null) {
                AbstractC22676k.m65757q("pb");
                throw null;
            }
            InterfaceC2116a interfaceC2116a = c11175k.f35787m;
            if (interfaceC2116a != null) {
                InterfaceC11166b interfaceC11166b3 = c11174j.f35773y;
                if (interfaceC11166b3 == null) {
                    AbstractC22676k.m65757q("task");
                    throw null;
                }
                interfaceC2116a.mo6682a(((AbstractC11165a) interfaceC11166b3).f35751c, AbstractC37056f.m118958J("android.permission.MANAGE_EXTERNAL_STORAGE"));
            }
        }
        return C23454a0.f92919a;
    }
}
