package uw1;

import androidx.core.app.NotificationCompat;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import pw1.InterfaceC29585a;
import qw1.InterfaceC30688b;
import ww1.InterfaceC37658d;
import ww1.InterfaceC37661g;

/* JADX INFO: renamed from: uw1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Luw1/b;", "", "<init>", "()V", "Lww1/d;", NotificationCompat.CATEGORY_EVENT, "Lpw1/a;", "a", "(Lww1/d;)Lpw1/a;", "Lww1/g;", "Lqw1/b;", "b", "(Lww1/g;)Lqw1/b;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35309b {
    /* JADX INFO: renamed from: a */
    public final InterfaceC29585a m112105a(InterfaceC37658d event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC37658d.b) {
            return InterfaceC29585a.b.f120748a;
        }
        if (event instanceof InterfaceC37658d.d) {
            InterfaceC37658d.d dVar = (InterfaceC37658d.d) event;
            return new InterfaceC29585a.c(dVar.getUserId(), dVar.getFamilyPlanId());
        }
        if (event.equals(InterfaceC37658d.a.f161392a)) {
            return InterfaceC29585a.a.f120747a;
        }
        if (!(event instanceof InterfaceC37658d.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC37658d.c cVar = (InterfaceC37658d.c) event;
        return new InterfaceC29585a.d(cVar.getUserId(), cVar.getFamilyPlanId());
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC30688b m112106b(InterfaceC37661g event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC37661g.c) {
            return new InterfaceC30688b.c(((InterfaceC37661g.c) event).getIsNewMember());
        }
        if (event instanceof InterfaceC37661g.b) {
            return new InterfaceC30688b.b(((InterfaceC37661g.b) event).getEmailText());
        }
        if (event instanceof InterfaceC37661g.d) {
            return new InterfaceC30688b.d(((InterfaceC37661g.d) event).getEmailText());
        }
        if (event.equals(InterfaceC37661g.a.f161404a)) {
            return InterfaceC30688b.a.f126256a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
