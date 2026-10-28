package nc;

import ec3.AbstractC13091v;
import ec3.C13022c;
import p007a6.C0410c;
import p114eb.AbstractC12979o0;
import p218ic.C18354e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nc.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC26558b implements InterfaceC26560d {

    /* JADX INFO: renamed from: a */
    public final AbstractC12979o0 f105572a;

    public AbstractC26558b(AbstractC12979o0 tracker) {
        AbstractC22676k.m65750j(tracker, "tracker");
        this.f105572a = tracker;
    }

    @Override // nc.InterfaceC26560d
    /* JADX INFO: renamed from: a */
    public final C13022c mo74594a(C18354e constraints) {
        AbstractC22676k.m65750j(constraints, "constraints");
        return AbstractC13091v.m36600j(new C0410c(this, null, 26));
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo78687c();

    /* JADX INFO: renamed from: d */
    public abstract boolean mo78688d(Object obj);
}
