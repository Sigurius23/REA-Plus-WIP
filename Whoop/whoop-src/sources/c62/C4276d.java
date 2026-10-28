package c62;

import com.whoop.recoveryimpacts.domain.model.RecoveryImpactsResponse;
import jb1.C21535a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import y52.C39240e;
import y52.InterfaceC39239d;

/* JADX INFO: renamed from: c62.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\f"}, m65681d2 = {"Lc62/d;", "", "<init>", "()V", "Ly52/e;", "domainResult", "Lc62/c;", "a", "(Ly52/e;)Lc62/c;", "Ljb1/a;", "Ljb1/a;", "designItemReducer", "recovery-impacts-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4276d {

    /* JADX INFO: renamed from: b */
    public static final int f17360b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer = AbstractC4274b.m13314d();

    /* JADX INFO: renamed from: a */
    public final AbstractC4275c m13320a(C39240e domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        InterfaceC39239d result = domainResult.getResult();
        if (AbstractC22676k.m65745e(result, InterfaceC39239d.a.f168734a)) {
            return AbstractC4275c.a.f17357a;
        }
        if (AbstractC22676k.m65745e(result, InterfaceC39239d.b.f168735a)) {
            return AbstractC4275c.b.f17358a;
        }
        if (!AbstractC22676k.m65745e(result, InterfaceC39239d.c.f168736a)) {
            throw new NoWhenBranchMatchedException();
        }
        RecoveryImpactsResponse response = domainResult.getResponse();
        return response != null ? new AbstractC4275c.c(this.designItemReducer.m60541h(response.getImpactSummaryCard())) : AbstractC4275c.a.f17357a;
    }
}
