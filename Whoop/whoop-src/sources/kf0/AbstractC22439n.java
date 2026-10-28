package kf0;

import a81.InterfaceC0569t;
import kd0.InterfaceC22381a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import vw2.C36548c;

/* JADX INFO: renamed from: kf0.n */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"La81/t;", "Lkd0/a;", "a", "(La81/t;)Lkd0/a;", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22439n {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC22381a m64739a(InterfaceC0569t interfaceC0569t) {
        AbstractC22676k.m65750j(interfaceC0569t, "<this>");
        if (interfaceC0569t instanceof InterfaceC0569t.a) {
            return InterfaceC22381a.r.f87440a;
        }
        if (interfaceC0569t instanceof InterfaceC0569t.f) {
            return new InterfaceC22381a.j0(((InterfaceC0569t.f) interfaceC0569t).getModal());
        }
        if (interfaceC0569t instanceof InterfaceC0569t.e) {
            return new InterfaceC22381a.i0(((InterfaceC0569t.e) interfaceC0569t).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        }
        if (interfaceC0569t instanceof InterfaceC0569t.d) {
            return new InterfaceC22381a.i(new C36548c(((InterfaceC0569t.d) interfaceC0569t).getAction()));
        }
        if (interfaceC0569t instanceof InterfaceC0569t.c) {
            return new InterfaceC22381a.j(((InterfaceC0569t.c) interfaceC0569t).getDestination());
        }
        if (!(interfaceC0569t instanceof InterfaceC0569t.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC0569t.b bVar = (InterfaceC0569t.b) interfaceC0569t;
        return new InterfaceC22381a.x(bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), bVar.getElement());
    }
}
