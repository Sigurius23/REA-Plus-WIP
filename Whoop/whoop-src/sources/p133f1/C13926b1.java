package p133f1;

import as1.C1949j;
import d30.C11544k;
import dw1.C12413a;
import ej1.C13242h;
import ev2.C13693b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import m83.AbstractC25269w;
import p002a0.AbstractC0058w;
import p002a0.C0035k0;
import p268k0.AbstractC22086a;
import p389p0.C28539n0;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p635y2.InterfaceC39147y;
import p705ea2.C12915l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f1.b1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13926b1 implements InterfaceC13922a1 {

    /* JADX INFO: renamed from: l */
    public static final C28539n0 f49645l = new C28539n0(10, new C12413a(14), new C13693b(25));

    /* JADX INFO: renamed from: a */
    public boolean f49646a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f49647b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final C0035k0 f49648c;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f49649d;

    /* JADX INFO: renamed from: e */
    public C13928c0 f49650e;

    /* JADX INFO: renamed from: f */
    public C1949j f49651f;

    /* JADX INFO: renamed from: g */
    public C11544k f49652g;

    /* JADX INFO: renamed from: h */
    public C13931d0 f49653h;

    /* JADX INFO: renamed from: i */
    public C13928c0 f49654i;

    /* JADX INFO: renamed from: j */
    public C13928c0 f49655j;

    /* JADX INFO: renamed from: k */
    public final C28633k1 f49656k;

    public C13926b1(long j7) {
        C0035k0 c0035k0 = AbstractC0058w.f176a;
        this.f49648c = new C0035k0();
        this.f49649d = new AtomicLong(j7);
        C0035k0 c0035k1 = AbstractC0058w.f176a;
        AbstractC22676k.m65748h(c0035k1, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.f49656k = AbstractC28683x.m87272z(c0035k1);
    }

    /* JADX INFO: renamed from: a */
    public final C0035k0 m39690a() {
        return (C0035k0) this.f49656k.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final long m39691b() {
        AtomicLong atomicLong = this.f49649d;
        long andIncrement = atomicLong.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = atomicLong.getAndIncrement();
        }
        return andIncrement;
    }

    /* JADX INFO: renamed from: c */
    public final void m39692c(long j7) {
        C13928c0 c13928c0 = this.f49654i;
        if (c13928c0 != null) {
            c13928c0.invoke(Long.valueOf(j7));
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m39693d(InterfaceC39147y interfaceC39147y, long j7, long j13, C13984v c13984v, boolean z4) {
        C11544k c11544k = this.f49652g;
        if (c11544k == null) {
            return true;
        }
        C13988w0 c13988w0 = (C13988w0) c11544k.f37227x;
        long jM39797b = c13988w0.m39797b(interfaceC39147y, j7);
        long jM39797b2 = c13988w0.m39797b(interfaceC39147y, j13);
        c13988w0.m39807l(z4);
        return c13988w0.m39810o(jM39797b, jM39797b2, false, c13984v);
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m39694e(InterfaceC39147y interfaceC39147y) {
        boolean z4 = this.f49646a;
        ArrayList arrayList = this.f49647b;
        if (!z4) {
            AbstractC25269w.m74166l0(arrayList, new C12915l(new C13242h(interfaceC39147y, 12), 1));
            this.f49646a = true;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final C13954l m39695f(C13954l c13954l) {
        long j7 = c13954l.f49741a;
        if (j7 == 0) {
            AbstractC22086a.m63158a("The selectable contains an invalid id: " + j7);
        }
        C0035k0 c0035k0 = this.f49648c;
        if (c0035k0.m78b(j7)) {
            AbstractC22086a.m63158a("Another selectable with the id: " + c13954l + ".selectableId has already subscribed.");
        }
        c0035k0.m84h(j7, c13954l);
        this.f49647b.add(c13954l);
        this.f49646a = false;
        return c13954l;
    }

    /* JADX INFO: renamed from: g */
    public final void m39696g(C13954l c13954l) {
        long j7 = c13954l.f49741a;
        C0035k0 c0035k0 = this.f49648c;
        if (c0035k0.m78b(j7)) {
            this.f49647b.remove(c13954l);
            long j13 = c13954l.f49741a;
            c0035k0.m83g(j13);
            C13928c0 c13928c0 = this.f49655j;
            if (c13928c0 != null) {
                c13928c0.invoke(Long.valueOf(j13));
            }
        }
    }
}
