package p045c6;

import b23.C2343i;
import b23.EnumC2341g;
import c93.InterfaceC4339a;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: c6.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C4258a {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f17300a;

    public C4258a(int i13) {
        switch (i13) {
            case 1:
                this.f17300a = new AtomicBoolean(false);
                break;
            default:
                this.f17300a = new AtomicBoolean(false);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13289a(InterfaceC4339a interfaceC4339a) {
        if (this.f17300a.compareAndSet(false, true)) {
            try {
                interfaceC4339a.invoke();
            } catch (Exception e5) {
                C2343i c2343i = C2343i.f9269a;
                if (C2343i.f9272d.isLoggable(EnumC2341g.ERROR, "SafeCall")) {
                    C2343i c2343i2 = C2343i.f9269a;
                    C2343i.f9271c.log(EnumC2341g.ERROR, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
                }
            }
        }
    }
}
