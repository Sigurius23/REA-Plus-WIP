package p739ui0;

import a81.InterfaceC0569t;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import ri0.InterfaceC31443b;

/* JADX INFO: renamed from: ui0.s */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"La81/t;", "Lri0/b;", "a", "(La81/t;)Lri0/b;", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35017s {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC31443b m110650a(InterfaceC0569t interfaceC0569t) {
        AbstractC22676k.m65750j(interfaceC0569t, "<this>");
        if (interfaceC0569t instanceof InterfaceC0569t.a) {
            return InterfaceC31443b.f.f129347a;
        }
        if (interfaceC0569t instanceof InterfaceC0569t.f) {
            return new InterfaceC31443b.s(((InterfaceC0569t.f) interfaceC0569t).getModal());
        }
        if (interfaceC0569t instanceof InterfaceC0569t.d) {
            return new InterfaceC31443b.p(((InterfaceC0569t.d) interfaceC0569t).getAction());
        }
        if (interfaceC0569t instanceof InterfaceC0569t.c) {
            return new InterfaceC31443b.c(((InterfaceC0569t.c) interfaceC0569t).getDestination(), false, 2, null);
        }
        if (interfaceC0569t instanceof InterfaceC0569t.b) {
            InterfaceC0569t.b bVar = (InterfaceC0569t.b) interfaceC0569t;
            return new InterfaceC31443b.j(bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), bVar.getElement());
        }
        if (interfaceC0569t instanceof InterfaceC0569t.e) {
            return new InterfaceC31443b.q(((InterfaceC0569t.e) interfaceC0569t).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        }
        throw new NoWhenBranchMatchedException();
    }
}
