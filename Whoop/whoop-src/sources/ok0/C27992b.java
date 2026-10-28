package ok0;

import java.time.Clock;
import kt0.C22823a;
import kt0.InterfaceC22824b;
import lt0.EnumC24733j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;
import xj0.AbstractC38334b;
import xj0.C38375p;
import zj0.C40727h;

/* JADX INFO: renamed from: ok0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lok0/b;", "Lkt0/b;", "Lst0/v;", "deviceType", "Llt0/j;", "revision", "<init>", "(Lst0/v;Llt0/j;)V", "Lxj0/b;", "a", "()Lxj0/b;", "Lzj0/h;", "response", "Lkt0/a;", "c", "(Lzj0/h;)Lkt0/a;", "Ljava/time/Clock;", "clock", "b", "(Ljava/time/Clock;)Lxj0/b;", "Lst0/v;", "Llt0/j;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27992b implements InterfaceC22824b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC32978v deviceType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC24733j revision;

    public C27992b(EnumC32978v deviceType, EnumC24733j revision) {
        AbstractC22676k.m65750j(deviceType, "deviceType");
        AbstractC22676k.m65750j(revision, "revision");
        this.deviceType = deviceType;
        this.revision = revision;
    }

    @Override // kt0.InterfaceC22824b
    /* JADX INFO: renamed from: a */
    public AbstractC38334b mo66185a() {
        return new C38375p(this.revision, this.deviceType);
    }

    @Override // kt0.InterfaceC22824b
    /* JADX INFO: renamed from: b */
    public AbstractC38334b mo66186b(Clock clock) {
        AbstractC22676k.m65750j(clock, "clock");
        return AbstractC27993c.m84425e(clock, this.deviceType);
    }

    @Override // kt0.InterfaceC22824b
    /* JADX INFO: renamed from: c */
    public C22823a mo66187c(C40727h response) {
        AbstractC22676k.m65750j(response, "response");
        return AbstractC27993c.m84426f(response);
    }
}
