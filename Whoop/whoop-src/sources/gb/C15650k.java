package gb;

import p114eb.C12982q;
import p114eb.C12988t;
import p390p1.InterfaceC28620h0;
import p668z1.C39967p;

/* JADX INFO: renamed from: gb.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C15650k implements InterfaceC28620h0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C15656q f58738a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C12982q f58739b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C39967p f58740c;

    public C15650k(C15656q c15656q, C12982q c12982q, C39967p c39967p) {
        this.f58738a = c15656q;
        this.f58739b = c12982q;
        this.f58740c = c39967p;
    }

    @Override // p390p1.InterfaceC28620h0
    public final void dispose() {
        C12988t c12988tM36435b = this.f58738a.m36435b();
        C12982q c12982q = this.f58739b;
        c12988tM36435b.m36492b(c12982q);
        this.f58740c.remove(c12982q);
    }
}
