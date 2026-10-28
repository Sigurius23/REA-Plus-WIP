package ok0;

import java.time.Clock;
import kt0.C22823a;
import kt0.InterfaceC22824b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;
import xj0.AbstractC38334b;
import xj0.C38373o;
import zj0.C40727h;

/* JADX INFO: renamed from: ok0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lok0/a;", "Lkt0/b;", "<init>", "()V", "Lxj0/b;", "a", "()Lxj0/b;", "Lzj0/h;", "response", "Lkt0/a;", "c", "(Lzj0/h;)Lkt0/a;", "Ljava/time/Clock;", "clock", "b", "(Ljava/time/Clock;)Lxj0/b;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27991a implements InterfaceC22824b {
    @Override // kt0.InterfaceC22824b
    /* JADX INFO: renamed from: a */
    public AbstractC38334b mo66185a() {
        return new C38373o();
    }

    @Override // kt0.InterfaceC22824b
    /* JADX INFO: renamed from: b */
    public AbstractC38334b mo66186b(Clock clock) {
        AbstractC22676k.m65750j(clock, "clock");
        return AbstractC27993c.m84425e(clock, EnumC32978v.GEN_4);
    }

    @Override // kt0.InterfaceC22824b
    /* JADX INFO: renamed from: c */
    public C22823a mo66187c(C40727h response) {
        AbstractC22676k.m65750j(response, "response");
        return AbstractC27993c.m84426f(response);
    }
}
