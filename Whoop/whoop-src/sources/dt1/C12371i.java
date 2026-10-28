package dt1;

import com.whoop.labrador.feature.details.domain.model.LabradorDetailsDomainHolder;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dt1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Ldt1/i;", "", "Ldt1/g;", "state", "Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;", "domainHolder", "Ldt1/b$j;", "lastUpdate", "<init>", "(Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;)V", "a", "(Ldt1/g;Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Ldt1/b$j;)Ldt1/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ldt1/g;", "d", "()Ldt1/g;", "b", "Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;", "c", "()Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;", "Ldt1/b$j;", "getLastUpdate", "()Ldt1/b$j;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C12371i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC12369g state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LabradorDetailsDomainHolder domainHolder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC12364b.j lastUpdate;

    public C12371i(InterfaceC12369g state, LabradorDetailsDomainHolder domainHolder, InterfaceC12364b.j jVar) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(domainHolder, "domainHolder");
        this.state = state;
        this.domainHolder = domainHolder;
        this.lastUpdate = jVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12371i m34698b(C12371i c12371i, InterfaceC12369g interfaceC12369g, LabradorDetailsDomainHolder labradorDetailsDomainHolder, InterfaceC12364b.j jVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC12369g = c12371i.state;
        }
        if ((i13 & 2) != 0) {
            labradorDetailsDomainHolder = c12371i.domainHolder;
        }
        if ((i13 & 4) != 0) {
            jVar = c12371i.lastUpdate;
        }
        return c12371i.m34699a(interfaceC12369g, labradorDetailsDomainHolder, jVar);
    }

    /* JADX INFO: renamed from: a */
    public final C12371i m34699a(InterfaceC12369g state, LabradorDetailsDomainHolder domainHolder, InterfaceC12364b.j lastUpdate) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(domainHolder, "domainHolder");
        return new C12371i(state, domainHolder, lastUpdate);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LabradorDetailsDomainHolder getDomainHolder() {
        return this.domainHolder;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC12369g getState() {
        return this.state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12371i)) {
            return false;
        }
        C12371i c12371i = (C12371i) other;
        return AbstractC22676k.m65745e(this.state, c12371i.state) && AbstractC22676k.m65745e(this.domainHolder, c12371i.domainHolder) && AbstractC22676k.m65745e(this.lastUpdate, c12371i.lastUpdate);
    }

    public int hashCode() {
        int iHashCode = (this.domainHolder.hashCode() + (this.state.hashCode() * 31)) * 31;
        InterfaceC12364b.j jVar = this.lastUpdate;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public String toString() {
        return "LabradorDetailsInternalState(state=" + this.state + ", domainHolder=" + this.domainHolder + ", lastUpdate=" + this.lastUpdate + ")";
    }

    public /* synthetic */ C12371i(InterfaceC12369g interfaceC12369g, LabradorDetailsDomainHolder labradorDetailsDomainHolder, InterfaceC12364b.j jVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC12369g, labradorDetailsDomainHolder, (i13 & 4) != 0 ? null : jVar);
    }
}
