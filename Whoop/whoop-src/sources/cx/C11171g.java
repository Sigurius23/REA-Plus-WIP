package cx;

import android.provider.Settings;
import androidx.core.app.NotificationManagerCompat;
import ax.InterfaceC2116a;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: cx.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C11171g extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35758w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11174j f35759x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11171g(C11174j c11174j, int i13) {
        super(0);
        this.f35758w = i13;
        this.f35759x = c11174j;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f35758w) {
            case 0:
                C11174j c11174j = this.f35759x;
                if (c11174j.requireActivity().getPackageManager().canRequestPackageInstalls()) {
                    InterfaceC11166b interfaceC11166b = c11174j.f35773y;
                    if (interfaceC11166b == null) {
                        AbstractC22676k.m65757q("task");
                        throw null;
                    }
                    ((AbstractC11165a) interfaceC11166b).m30273a();
                } else {
                    C11175k c11175k = c11174j.f35772x;
                    if (c11175k == null) {
                        AbstractC22676k.m65757q("pb");
                        throw null;
                    }
                    InterfaceC2116a interfaceC2116a = c11175k.f35787m;
                    if (interfaceC2116a != null) {
                        InterfaceC11166b interfaceC11166b2 = c11174j.f35773y;
                        if (interfaceC11166b2 == null) {
                            AbstractC22676k.m65757q("task");
                            throw null;
                        }
                        interfaceC2116a.mo6682a(((AbstractC11165a) interfaceC11166b2).f35751c, AbstractC37056f.m118958J("android.permission.REQUEST_INSTALL_PACKAGES"));
                    }
                }
                return C23454a0.f92919a;
            case 1:
                C11174j c11174j2 = this.f35759x;
                if (NotificationManagerCompat.from(c11174j2.requireContext()).areNotificationsEnabled()) {
                    InterfaceC11166b interfaceC11166b3 = c11174j2.f35773y;
                    if (interfaceC11166b3 == null) {
                        AbstractC22676k.m65757q("task");
                        throw null;
                    }
                    ((AbstractC11165a) interfaceC11166b3).m30273a();
                } else {
                    C11175k c11175k2 = c11174j2.f35772x;
                    if (c11175k2 == null) {
                        AbstractC22676k.m65757q("pb");
                        throw null;
                    }
                    InterfaceC2116a interfaceC2116a2 = c11175k2.f35787m;
                    if (interfaceC2116a2 != null) {
                        InterfaceC11166b interfaceC11166b4 = c11174j2.f35773y;
                        if (interfaceC11166b4 == null) {
                            AbstractC22676k.m65757q("task");
                            throw null;
                        }
                        interfaceC2116a2.mo6682a(((AbstractC11165a) interfaceC11166b4).f35751c, AbstractC37056f.m118958J("android.permission.POST_NOTIFICATIONS"));
                    }
                }
                return C23454a0.f92919a;
            case 2:
                C11174j c11174j3 = this.f35759x;
                if (Settings.System.canWrite(c11174j3.requireContext())) {
                    InterfaceC11166b interfaceC11166b5 = c11174j3.f35773y;
                    if (interfaceC11166b5 == null) {
                        AbstractC22676k.m65757q("task");
                        throw null;
                    }
                    ((AbstractC11165a) interfaceC11166b5).m30273a();
                } else {
                    C11175k c11175k3 = c11174j3.f35772x;
                    if (c11175k3 == null) {
                        AbstractC22676k.m65757q("pb");
                        throw null;
                    }
                    InterfaceC2116a interfaceC2116a3 = c11175k3.f35787m;
                    if (interfaceC2116a3 != null) {
                        InterfaceC11166b interfaceC11166b6 = c11174j3.f35773y;
                        if (interfaceC11166b6 == null) {
                            AbstractC22676k.m65757q("task");
                            throw null;
                        }
                        interfaceC2116a3.mo6682a(((AbstractC11165a) interfaceC11166b6).f35751c, AbstractC37056f.m118958J("android.permission.WRITE_SETTINGS"));
                    }
                }
                return C23454a0.f92919a;
            case 3:
                C11174j c11174j4 = this.f35759x;
                if (c11174j4.m30278y()) {
                    c11174j4.m30276A(new C11171g(c11174j4, 0));
                }
                return C23454a0.f92919a;
            case 4:
                C11174j c11174j5 = this.f35759x;
                if (c11174j5.m30278y()) {
                    c11174j5.m30276A(new C11172h(c11174j5));
                }
                return C23454a0.f92919a;
            case 5:
                C11174j c11174j6 = this.f35759x;
                if (c11174j6.m30278y()) {
                    c11174j6.m30276A(new C11171g(c11174j6, 1));
                }
                return C23454a0.f92919a;
            case 6:
                this.f35759x.m30279z();
                return C23454a0.f92919a;
            default:
                C11174j c11174j7 = this.f35759x;
                if (c11174j7.m30278y()) {
                    c11174j7.m30276A(new C11171g(c11174j7, 2));
                }
                return C23454a0.f92919a;
        }
    }
}
