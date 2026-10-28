package be;

import cf.C4528c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import pf.InterfaceC29123a;
import ug.C34912a;
import vg.C35966m;
import vg.InterfaceC35967n;

/* JADX INFO: renamed from: be.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C3150c {

    /* JADX INFO: renamed from: a */
    public final long f12331a;

    /* JADX INFO: renamed from: b */
    public final C4528c f12332b;

    /* JADX INFO: renamed from: c */
    public InterfaceC29123a f12333c;

    /* JADX INFO: renamed from: d */
    public final C34912a f12334d;

    /* JADX INFO: renamed from: e */
    public InterfaceC35967n f12335e;

    public C3150c() {
        Duration.Companion companion = Duration.INSTANCE;
        this.f12331a = DurationKt.toDuration(21600, DurationUnit.SECONDS);
        this.f12332b = C4528c.f18258d;
        this.f12334d = C34912a.f147012a;
        InterfaceC35967n.f153143a.getClass();
        this.f12335e = C35966m.f153142b;
    }

    /* JADX INFO: renamed from: a */
    public final void m9051a(InterfaceC29123a interfaceC29123a) {
        this.f12333c = interfaceC29123a;
    }

    /* JADX INFO: renamed from: b */
    public final void m9052b(InterfaceC35967n interfaceC35967n) {
        AbstractC22676k.m65750j(interfaceC35967n, "<set-?>");
        this.f12335e = interfaceC35967n;
    }
}
