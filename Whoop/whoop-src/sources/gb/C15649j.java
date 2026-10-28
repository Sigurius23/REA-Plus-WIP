package gb;

import p114eb.AbstractC12979o0;
import p114eb.C12977n0;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: gb.j */
/* JADX INFO: loaded from: classes.dex */
public final class C15649j extends AbstractC12979o0 {

    /* JADX INFO: renamed from: f */
    public final C15648i f58732f;

    /* JADX INFO: renamed from: g */
    public final C37816b f58733g;

    /* JADX INFO: renamed from: h */
    public Function1 f58734h;

    /* JADX INFO: renamed from: i */
    public Function1 f58735i;

    /* JADX INFO: renamed from: j */
    public Function1 f58736j;

    /* JADX INFO: renamed from: k */
    public Function1 f58737k;

    public C15649j(C15648i c15648i, String str, C37816b c37816b) {
        super(c15648i, str);
        this.f58732f = c15648i;
        this.f58733g = c37816b;
    }

    @Override // p114eb.AbstractC12979o0
    /* JADX INFO: renamed from: a */
    public final C12977n0 mo36473a() {
        C15647h c15647h = (C15647h) super.mo36473a();
        c15647h.f58727M = this.f58734h;
        c15647h.f58728N = this.f58735i;
        c15647h.f58729O = this.f58736j;
        c15647h.f58730P = this.f58737k;
        return c15647h;
    }

    @Override // p114eb.AbstractC12979o0
    /* JADX INFO: renamed from: b */
    public final C12977n0 mo36474b() {
        return new C15647h(this.f58732f, this.f58733g);
    }
}
