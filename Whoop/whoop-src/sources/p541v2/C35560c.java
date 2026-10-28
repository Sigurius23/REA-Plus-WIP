package p541v2;

import p465rm.C31543j1;
import p479s4.AbstractC32128i;
import p603x2.AbstractC37831a;
import p636y3.C39185q;

/* JADX INFO: renamed from: v2.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C35560c {

    /* JADX INFO: renamed from: a */
    public final C31543j1 f151283a;

    /* JADX INFO: renamed from: b */
    public final C31543j1 f151284b;

    /* JADX INFO: renamed from: c */
    public long f151285c;

    public C35560c() {
        EnumC35559b enumC35559b = EnumC35559b.f151280w;
        this.f151283a = new C31543j1();
        this.f151284b = new C31543j1();
    }

    /* JADX INFO: renamed from: a */
    public final long m112769a(long j7) {
        if (C39185q.m124813d(j7) <= 0.0f || C39185q.m124814e(j7) <= 0.0f) {
            AbstractC37831a.m121374b("maximumVelocity should be a positive value. You specified=" + ((Object) C39185q.m124818i(j7)));
        }
        return AbstractC32128i.m100047a(this.f151283a.m97146b(C39185q.m124813d(j7)), this.f151284b.m97146b(C39185q.m124814e(j7)));
    }
}
