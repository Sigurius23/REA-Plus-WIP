package t23;

import a33.C0352d;
import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b30.C2570m;
import bc3.AbstractC2995c1;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.InterfaceC2994c0;
import bi.C3278p;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import j43.C21319c;
import j43.C21323g;
import j43.C21326j;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23470p;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t23.i3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33403i3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C33403i3 f139476a = new C33403i3();

    /* JADX INFO: renamed from: b */
    public static volatile InterfaceC33408j3 f139477b;

    /* JADX INFO: renamed from: c */
    public static final C13045h2 f139478c = AbstractC13091v.m36593c(f139477b);

    /* JADX INFO: renamed from: a */
    public static InterfaceC33408j3 m105852a() {
        InterfaceC33408j3 interfaceC33408j3 = f139477b;
        if (interfaceC33408j3 != null) {
            return interfaceC33408j3;
        }
        throw new IllegalStateException("StreamVideoBuilder.build() must be called before obtaining StreamVideo instance.");
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC33408j3 m105853b() {
        return f139477b;
    }

    /* JADX INFO: renamed from: c */
    public final void m105854c() throws IOException {
        InterfaceC33408j3 interfaceC33408j3;
        String str;
        synchronized (this) {
            interfaceC33408j3 = f139477b;
            if (interfaceC33408j3 != null) {
                f139477b = null;
                C13045h2 c13045h2 = f139478c;
                AbstractC22676k.m65748h(c13045h2, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<io.getstream.video.android.core.StreamVideo?>");
                c13045h2.m36570j(f139477b);
            } else {
                interfaceC33408j3 = null;
            }
        }
        if (interfaceC33408j3 == null) {
            return;
        }
        C33366b4 c33366b4 = (C33366b4) interfaceC33408j3;
        c33366b4.f139253Z.clear();
        c33366b4.f139254a0.m8i(-1);
        AbstractC3006f0.m8714h(c33366b4.f139260x, null);
        C33368c0 c33368c0 = (C33368c0) c33366b4.f139248U.f139405h.getValue();
        C3278p c3278p = c33366b4.f139238K;
        if (c33368c0 == null || (str = c33368c0.f139288b) == null) {
            str = "ALL_CALL_TYPES";
        }
        C21319c c21319cM9548b = c3278p.m9548b(str);
        if (c21319cM9548b.f81521a) {
            try {
                c33366b4.f139259w.stopService(new C21323g(0).m59852b(c33366b4.f139259w, new C21326j(null, c21319cM9548b)));
            } catch (Exception e5) {
                C2343i c2343i = C2343i.f9269a;
                InterfaceC2339e interfaceC2339e = C2343i.f9272d;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, "SafeCall")) {
                    C2343i.f9271c.log(enumC2341g, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
                }
            }
        }
        if (c33368c0 != null) {
            c33368c0.m105823p(new C33390g0(EnumC33393g3.CLIENT_CLEANUP, "client-cleanup"));
        }
        C0352d c0352d = c33366b4.f139256c0;
        ((AtomicBoolean) c0352d.f1237x).set(true);
        AbstractC3006f0.m8714h((InterfaceC2994c0) ((C23470p) c0352d.f1238y).getValue(), null);
        ((AbstractC2995c1) ((C23470p) c0352d.f1239z).getValue()).close();
        C2570m c2570m = (C2570m) c33366b4.f139246S.f140442x;
        C2996c2 c2996c2 = (C2996c2) c2570m.f9984E;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        c2570m.f9984E = null;
        C13045h2 c13045h3 = (C13045h2) c2570m.f9985F;
        c13045h3.getClass();
        c13045h3.m36571k(null, "");
    }
}
