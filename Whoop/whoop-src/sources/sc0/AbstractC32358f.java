package sc0;

import a81.InterfaceC0569t;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qc0.InterfaceC30214a;

/* JADX INFO: renamed from: sc0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"La81/t;", "Lqc0/a;", "a", "(La81/t;)Lqc0/a;", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32358f {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC30214a m100741a(InterfaceC0569t interfaceC0569t) {
        AbstractC22676k.m65750j(interfaceC0569t, "<this>");
        if (interfaceC0569t instanceof InterfaceC0569t.a) {
            return InterfaceC30214a.c.f123675a;
        }
        if (interfaceC0569t instanceof InterfaceC0569t.f) {
            return new InterfaceC30214a.h(((InterfaceC0569t.f) interfaceC0569t).getModal());
        }
        if (interfaceC0569t instanceof InterfaceC0569t.d) {
            return new InterfaceC30214a.g(((InterfaceC0569t.d) interfaceC0569t).getAction());
        }
        if (interfaceC0569t instanceof InterfaceC0569t.c) {
            return new InterfaceC30214a.a(((InterfaceC0569t.c) interfaceC0569t).getDestination());
        }
        if (interfaceC0569t instanceof InterfaceC0569t.b) {
            InterfaceC0569t.b bVar = (InterfaceC0569t.b) interfaceC0569t;
            return new InterfaceC30214a.e(bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), bVar.getElement());
        }
        if (interfaceC0569t instanceof InterfaceC0569t.e) {
            return InterfaceC30214a.c.f123675a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
