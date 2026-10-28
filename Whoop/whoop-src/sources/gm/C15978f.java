package gm;

import jm.C21784f;
import lt.C24719b;
import lt.InterfaceC24720c;
import lt.InterfaceC24721d;
import p127ev.AbstractC13673n;
import p381ot.C28315a;
import p381ot.InterfaceC28319e;

/* JADX INFO: renamed from: gm.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C15978f implements InterfaceC24720c {

    /* JADX INFO: renamed from: a */
    public static final C15978f f60476a = new C15978f();

    /* JADX INFO: renamed from: b */
    public static final C24719b f60477b = new C24719b("currentCacheSizeBytes", AbstractC13673n.m38569p(AbstractC13673n.m38568o(InterfaceC28319e.class, new C28315a(1))));

    /* JADX INFO: renamed from: c */
    public static final C24719b f60478c = new C24719b("maxCacheSizeBytes", AbstractC13673n.m38569p(AbstractC13673n.m38568o(InterfaceC28319e.class, new C28315a(2))));

    @Override // lt.InterfaceC24718a
    /* JADX INFO: renamed from: a */
    public final void mo41739a(Object obj, Object obj2) {
        C21784f c21784f = (C21784f) obj;
        InterfaceC24721d interfaceC24721d = (InterfaceC24721d) obj2;
        interfaceC24721d.mo72380a(f60477b, c21784f.f83921a);
        interfaceC24721d.mo72380a(f60478c, c21784f.f83922b);
    }
}
