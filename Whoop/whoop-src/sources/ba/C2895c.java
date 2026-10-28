package ba;

import p016an.C1053d;
import p499t9.AbstractC33654w;
import p499t9.C33625d0;
import p499t9.C33629f0;
import p499t9.InterfaceC33627e0;

/* JADX INFO: renamed from: ba.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C2895c extends AbstractC33654w {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC33627e0 f11594b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1053d f11595c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2895c(C1053d c1053d, InterfaceC33627e0 interfaceC33627e0, InterfaceC33627e0 interfaceC33627e1) {
        super(interfaceC33627e0);
        this.f11595c = c1053d;
        this.f11594b = interfaceC33627e1;
    }

    @Override // p499t9.AbstractC33654w, p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: c */
    public final C33625d0 mo8456c(long j7) {
        C33625d0 c33625d0Mo8456c = this.f11594b.mo8456c(j7);
        C33629f0 c33629f0 = c33625d0Mo8456c.f140364a;
        long j13 = c33629f0.f140371a;
        long j14 = c33629f0.f140372b;
        long j15 = this.f11595c.f4098x;
        C33629f0 c33629f1 = new C33629f0(j13, j14 + j15);
        C33629f0 c33629f2 = c33625d0Mo8456c.f140365b;
        return new C33625d0(c33629f1, new C33629f0(c33629f2.f140371a, c33629f2.f140372b + j15));
    }
}
