package ve;

import a33.C0351c;
import gf.InterfaceC15761b;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p484s9.AbstractC32281f;
import p647yf.AbstractC39497j;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import s83.AbstractC32269c;
import ug.C34912a;
import vg.C35956c;

/* JADX INFO: renamed from: ve.b */
/* JADX INFO: loaded from: classes.dex */
public final class C35917b implements InterfaceC35918c {

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f152976F = AtomicIntegerFieldUpdater.newUpdater(C35917b.class, "E");

    /* JADX INFO: renamed from: E */
    public volatile /* synthetic */ int f152977E;

    /* JADX INFO: renamed from: w */
    public final C35922g f152978w;

    /* JADX INFO: renamed from: x */
    public final long f152979x;

    /* JADX INFO: renamed from: y */
    public final C34912a f152980y;

    /* JADX INFO: renamed from: z */
    public final C35956c f152981z;

    public C35917b(C35922g c35922g) {
        Duration.Companion companion = Duration.INSTANCE;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long duration = DurationKt.toDuration(900, durationUnit);
        long duration2 = DurationKt.toDuration(10, durationUnit);
        C34912a c34912a = C34912a.f147012a;
        this.f152978w = c35922g;
        this.f152979x = duration;
        this.f152980y = c34912a;
        this.f152981z = new C35956c(duration2, c34912a);
        this.f152977E = 0;
    }

    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    public final Object mo79294b(InterfaceC15761b interfaceC15761b, AbstractC32269c abstractC32269c) {
        if (this.f152977E == 0) {
            return this.f152981z.m114203b(new C0351c(this, interfaceC15761b, null, 12), abstractC32269c);
        }
        throw new IllegalStateException("Credentials provider is closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (f152976F.compareAndSet(this, 0, 1)) {
            this.f152981z.close();
            AbstractC39497j.m126157b(this.f152978w);
        }
    }

    public final String toString() {
        return AbstractC32281f.m100455w(this) + ": " + AbstractC32281f.m100455w(this.f152978w);
    }
}
