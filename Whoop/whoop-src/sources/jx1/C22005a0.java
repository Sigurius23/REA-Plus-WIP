package jx1;

import androidx.core.app.NotificationCompat;
import bx1.InterfaceC3687a;
import dx1.InterfaceC12427a;
import ex1.InterfaceC13727a;
import fx1.InterfaceC14845a;
import lx1.InterfaceC24790a;
import lx1.InterfaceC24791b;
import lx1.InterfaceC24792c;
import lx1.InterfaceC24793d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jx1.a0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Ljx1/a0;", "", "<init>", "()V", "Llx1/d;", NotificationCompat.CATEGORY_EVENT, "Lex1/a;", "c", "(Llx1/d;)Lex1/a;", "Llx1/c;", "Lfx1/a;", "d", "(Llx1/c;)Lfx1/a;", "Llx1/b;", "Ldx1/a;", "b", "(Llx1/b;)Ldx1/a;", "Llx1/a;", "Lbx1/a;", "a", "(Llx1/a;)Lbx1/a;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22005a0 {
    /* JADX INFO: renamed from: a */
    public final InterfaceC3687a m62886a(InterfaceC24790a event) {
        AbstractC22676k.m65750j(event, "event");
        if (!(event instanceof InterfaceC24790a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC24790a.a aVar = (InterfaceC24790a.a) event;
        return new InterfaceC3687a.a(aVar.getPath(), aVar.m72657c(), aVar.getCard());
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC12427a m62887b(InterfaceC24791b event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC24791b.a) {
            return InterfaceC12427a.a.f42329a;
        }
        if (event.equals(InterfaceC24791b.b.f97027a)) {
            return InterfaceC12427a.b.f42330a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC13727a m62888c(InterfaceC24793d event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC24793d.b) {
            return InterfaceC13727a.b.f48741a;
        }
        if (event instanceof InterfaceC24793d.a) {
            InterfaceC24793d.a aVar = (InterfaceC24793d.a) event;
            return new InterfaceC13727a.a(aVar.getPath(), aVar.m72666b());
        }
        if (event.equals(InterfaceC24793d.c.f97042a)) {
            return InterfaceC13727a.c.f48742a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC14845a m62889d(InterfaceC24792c event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC24792c.c) {
            return new InterfaceC14845a.c(((InterfaceC24792c.c) event).m72661a());
        }
        if (event.equals(InterfaceC24792c.e.f97034a)) {
            return InterfaceC14845a.e.f55342a;
        }
        if (event instanceof InterfaceC24792c.g) {
            return new InterfaceC14845a.g(((InterfaceC24792c.g) event).getSelectedPaymentOptionIndex());
        }
        if (event instanceof InterfaceC24792c.f) {
            InterfaceC24792c.f fVar = (InterfaceC24792c.f) event;
            return new InterfaceC14845a.f(fVar.getCard(), fVar.getValidCard());
        }
        if (event instanceof InterfaceC24792c.a) {
            InterfaceC24792c.a aVar = (InterfaceC24792c.a) event;
            return new InterfaceC14845a.a(aVar.getPath(), aVar.m72660c(), aVar.getCard());
        }
        if (event instanceof InterfaceC24792c.d) {
            return InterfaceC14845a.d.f55341a;
        }
        if (event instanceof InterfaceC24792c.b) {
            return InterfaceC14845a.b.f55339a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
