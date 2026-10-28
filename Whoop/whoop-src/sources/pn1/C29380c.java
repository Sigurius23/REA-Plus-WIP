package pn1;

import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: pn1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\f8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lpn1/c;", "", "<init>", "()V", "Ll83/a0;", "b", "(Lq83/d;)Ljava/lang/Object;", "Lec3/o1;", "Lpn1/a;", "a", "Lec3/o1;", "events", "Lec3/t1;", "Lec3/t1;", "()Lec3/t1;", "refreshEvents", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29380c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13072o1 events;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13087t1 refreshEvents;

    public C29380c() {
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.events = c13096w1M36592b;
        this.refreshEvents = AbstractC13091v.m36597g(c13096w1M36592b);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC13087t1 getRefreshEvents() {
        return this.refreshEvents;
    }

    /* JADX INFO: renamed from: b */
    public final Object m89563b(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objEmit = this.events.emit(new AbstractC29378a.c(false, null, null, 7, null), interfaceC30057d);
        return objEmit == EnumC31071a.f128113w ? objEmit : C23454a0.f92919a;
    }
}
