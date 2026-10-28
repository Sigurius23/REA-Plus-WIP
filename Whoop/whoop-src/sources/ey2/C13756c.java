package ey2;

import fy2.InterfaceC14880b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ey2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Ley2/c;", "", "Lfy2/b;", "viewState", "Lfy2/b$b;", "lastLoadedState", "<init>", "(Lfy2/b;Lfy2/b$b;)V", "a", "(Lfy2/b;Lfy2/b$b;)Ley2/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfy2/b;", "c", "()Lfy2/b;", "setViewState", "(Lfy2/b;)V", "b", "Lfy2/b$b;", "getLastLoadedState", "()Lfy2/b$b;", "setLastLoadedState", "(Lfy2/b$b;)V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13756c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private InterfaceC14880b viewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private InterfaceC14880b.b lastLoadedState;

    public C13756c(InterfaceC14880b viewState, InterfaceC14880b.b bVar) {
        AbstractC22676k.m65750j(viewState, "viewState");
        this.viewState = viewState;
        this.lastLoadedState = bVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C13756c m39102b(C13756c c13756c, InterfaceC14880b interfaceC14880b, InterfaceC14880b.b bVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC14880b = c13756c.viewState;
        }
        if ((i13 & 2) != 0) {
            bVar = c13756c.lastLoadedState;
        }
        return c13756c.m39103a(interfaceC14880b, bVar);
    }

    /* JADX INFO: renamed from: a */
    public final C13756c m39103a(InterfaceC14880b viewState, InterfaceC14880b.b lastLoadedState) {
        AbstractC22676k.m65750j(viewState, "viewState");
        return new C13756c(viewState, lastLoadedState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC14880b getViewState() {
        return this.viewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13756c)) {
            return false;
        }
        C13756c c13756c = (C13756c) other;
        return AbstractC22676k.m65745e(this.viewState, c13756c.viewState) && AbstractC22676k.m65745e(this.lastLoadedState, c13756c.lastLoadedState);
    }

    public int hashCode() {
        int iHashCode = this.viewState.hashCode() * 31;
        InterfaceC14880b.b bVar = this.lastLoadedState;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "ViewStateAccumulator(viewState=" + this.viewState + ", lastLoadedState=" + this.lastLoadedState + ")";
    }

    public /* synthetic */ C13756c(InterfaceC14880b interfaceC14880b, InterfaceC14880b.b bVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC14880b, (i13 & 2) != 0 ? null : bVar);
    }
}
