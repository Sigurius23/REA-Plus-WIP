package gb;

import java.util.Iterator;
import java.util.List;
import p114eb.AbstractC12964i1;
import p114eb.C12977n0;
import p114eb.C12982q;
import p114eb.C12997x0;
import p114eb.InterfaceC12961h1;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: gb.i */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12961h1("composable")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lgb/i;", "Leb/i1;", "Lgb/h;", "<init>", "()V", "navigation-compose_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class C15648i extends AbstractC12964i1 {

    /* JADX INFO: renamed from: c */
    public final C28633k1 f58731c = AbstractC28683x.m87272z(Boolean.FALSE);

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: a */
    public final C12977n0 mo36423a() {
        return new C15647h(this, AbstractC15637c.f58687a);
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: d */
    public final void mo36436d(List list, C12997x0 c12997x0) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m36435b().m36499i((C12982q) it.next());
        }
        this.f58731c.setValue(Boolean.FALSE);
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: i */
    public final void mo36441i(C12982q c12982q, boolean z4) {
        m36435b().m36496f(c12982q, z4);
        this.f58731c.setValue(Boolean.TRUE);
    }
}
