package gh3;

import ch3.C4697n;
import e10.C12554k0;
import eh3.C13205i;
import jh3.C21705f;
import live.hms.video.factories.MediaConstraintsFactory;
import xg3.AbstractC38284k;
import xg3.C38280g;

/* JADX INFO: renamed from: gh3.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C15867l extends C38280g {

    /* JADX INFO: renamed from: y */
    public static final boolean f59972y = Boolean.valueOf(System.getProperty("rx.just.strong-mode", MediaConstraintsFactory.kValueFalse)).booleanValue();

    /* JADX INFO: renamed from: x */
    public final Object f59973x;

    public C15867l(Object obj) {
        C4697n c4697n = new C4697n(obj, 2);
        C21705f.f83334f.m61159c().getClass();
        super(c4697n);
        this.f59973x = obj;
    }

    /* JADX INFO: renamed from: X */
    public final C38280g m44778X(AbstractC38284k abstractC38284k) {
        return C38280g.m122636V(new C15865j(this.f59973x, abstractC38284k instanceof C13205i ? new C12554k0((C13205i) abstractC38284k, 23) : new C12554k0(abstractC38284k, 24), 1));
    }
}
