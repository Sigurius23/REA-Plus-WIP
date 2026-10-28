package l32;

import androidx.core.app.NotificationCompat;
import c31.EnumC3921e;
import e32.InterfaceC12617d;
import j32.C21286a;
import j32.C21287b;
import j32.C21288c;
import j32.C21291f;
import j32.C21292g;
import j32.C21293h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l32.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"", NotificationCompat.CATEGORY_EVENT, "", "updatePath", "screenName", "Lkotlin/Function1;", "Ll83/a0;", "onViewEvent", "Lj32/i;", "sendViewEvent", "a", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "payments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23325d {
    /* JADX INFO: renamed from: a */
    public static final void m67538a(Object event, String updatePath, String screenName, Function1 onViewEvent, Function1 sendViewEvent) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(updatePath, "updatePath");
        AbstractC22676k.m65750j(screenName, "screenName");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(sendViewEvent, "sendViewEvent");
        if (event instanceof InterfaceC12617d.c) {
            InterfaceC12617d.c cVar = (InterfaceC12617d.c) event;
            onViewEvent.invoke(new C21287b(cVar.getPaymentMethodInfo(), cVar.getScreenName()));
            return;
        }
        if (event instanceof InterfaceC12617d.b) {
            onViewEvent.invoke(C21286a.f81328a);
            return;
        }
        if (event instanceof InterfaceC12617d.d) {
            onViewEvent.invoke(new C21288c(((InterfaceC12617d.d) event).getError()));
            return;
        }
        if (event instanceof InterfaceC12617d.g) {
            onViewEvent.invoke(EnumC3921e.DISABLE);
            onViewEvent.invoke(C21293h.f81338a);
        } else if (event instanceof InterfaceC12617d.e) {
            onViewEvent.invoke(EnumC3921e.DISABLE);
            onViewEvent.invoke(new C21291f(((InterfaceC12617d.e) event).getError()));
        } else if (event instanceof InterfaceC12617d.f) {
            sendViewEvent.invoke(new C21292g(updatePath, screenName));
        }
    }
}
