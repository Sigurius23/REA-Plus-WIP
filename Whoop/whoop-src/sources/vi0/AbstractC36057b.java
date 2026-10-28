package vi0;

import a81.InterfaceC0569t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ri0.InterfaceC31443b;

/* JADX INFO: renamed from: vi0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lri0/b;", "La81/t;", "a", "(Lri0/b;)La81/t;", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36057b {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0569t m114483a(InterfaceC31443b interfaceC31443b) {
        AbstractC22676k.m65750j(interfaceC31443b, "<this>");
        if (interfaceC31443b instanceof InterfaceC31443b.j) {
            InterfaceC31443b.j jVar = (InterfaceC31443b.j) interfaceC31443b;
            return new InterfaceC0569t.b(jVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), jVar.getElement());
        }
        if (interfaceC31443b instanceof InterfaceC31443b.p) {
            return new InterfaceC0569t.d(((InterfaceC31443b.p) interfaceC31443b).getAction());
        }
        if (interfaceC31443b instanceof InterfaceC31443b.q) {
            return new InterfaceC0569t.e(((InterfaceC31443b.q) interfaceC31443b).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        }
        if (interfaceC31443b instanceof InterfaceC31443b.s) {
            return new InterfaceC0569t.f(((InterfaceC31443b.s) interfaceC31443b).getModal());
        }
        if (interfaceC31443b instanceof InterfaceC31443b.f) {
            return InterfaceC0569t.a.f2023a;
        }
        if (interfaceC31443b instanceof InterfaceC31443b.c) {
            return new InterfaceC0569t.c(((InterfaceC31443b.c) interfaceC31443b).getNavAction());
        }
        if (interfaceC31443b instanceof InterfaceC31443b.h) {
            return InterfaceC0569t.a.f2023a;
        }
        return null;
    }
}
