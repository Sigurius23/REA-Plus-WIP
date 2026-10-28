package y12;

import java.util.Set;
import m83.C25235a0;
import p098dt.AbstractC12350b;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y12.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR7\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Ly12/a;", "", "<init>", "()V", "", "turnId", "Ll83/a0;", "c", "(Ljava/lang/String;)V", "", "<set-?>", "a", "Lp1/c1;", "b", "()Ljava/util/Set;", "d", "(Ljava/util/Set;)V", "turnIds", "", "()I", "count", "onboarding-personalization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39068a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC28601c1 turnIds = AbstractC28683x.m87272z(C25235a0.f99113w);

    /* JADX INFO: renamed from: b */
    private final Set<String> m124587b() {
        return (Set) this.turnIds.getValue();
    }

    /* JADX INFO: renamed from: d */
    private final void m124588d(Set<String> set) {
        this.turnIds.setValue(set);
    }

    /* JADX INFO: renamed from: a */
    public final int m124589a() {
        return m124587b().size();
    }

    /* JADX INFO: renamed from: c */
    public final void m124590c(String turnId) {
        AbstractC22676k.m65750j(turnId, "turnId");
        m124588d(AbstractC12350b.m34555D(turnId, m124587b()));
    }
}
