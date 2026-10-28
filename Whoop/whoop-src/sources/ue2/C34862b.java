package ue2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qe2.AbstractC30314g;
import se2.InterfaceC32425c;
import te2.InterfaceC33753b;

/* JADX INFO: renamed from: ue2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lue2/b;", "", "<init>", "()V", "Lse2/c;", "domainState", "Lue2/a;", "a", "(Lse2/c;)Lue2/a;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34862b {
    /* JADX INFO: renamed from: a */
    public final InterfaceC34861a m109959a(InterfaceC32425c domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState.equals(InterfaceC32425c.b.f134189a)) {
            return new InterfaceC34861a.c(null, null, null, InterfaceC33753b.b.c.f141248a, false, 23, null);
        }
        if (domainState.equals(InterfaceC32425c.c.f134190a)) {
            return new InterfaceC34861a.c(null, null, null, InterfaceC33753b.b.a.f141246a, false, 23, null);
        }
        if (domainState.equals(InterfaceC32425c.e.f134192a)) {
            return new InterfaceC34861a.c(null, null, new TextResource.C8688b(AbstractC30314g.f124349s1, null, 2, null), InterfaceC33753b.a.C42384a.f141245a, false, 3, null);
        }
        if (domainState.equals(InterfaceC32425c.f.f134193a)) {
            return new InterfaceC34861a.c(new TextResource.C8688b(AbstractC30314g.f124306e0, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124243D1, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124349s1, null, 2, null), InterfaceC33753b.a.C42384a.f141245a, false);
        }
        if (domainState.equals(InterfaceC32425c.d.f134191a)) {
            return new InterfaceC34861a.b(new TextResource.C8688b(AbstractC30314g.f124256I, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124250G, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124259J, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124253H, null, 2, null));
        }
        if (domainState.equals(InterfaceC32425c.g.f134194a)) {
            return InterfaceC34861a.d.f146831a;
        }
        if (domainState.equals(InterfaceC32425c.h.f134195a)) {
            return InterfaceC34861a.e.f146832a;
        }
        if (domainState.equals(InterfaceC32425c.a.f134188a)) {
            return InterfaceC34861a.a.f146819a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
