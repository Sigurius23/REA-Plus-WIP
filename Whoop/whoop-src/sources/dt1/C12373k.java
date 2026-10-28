package dt1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qk1.C30443a;

/* JADX INFO: renamed from: dt1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Ldt1/k;", "", "Ldt1/g;", "state", "Lqk1/a;", "response", "Ldt1/c$h;", "lastUpdate", "<init>", "(Ldt1/g;Lqk1/a;Ldt1/c$h;)V", "a", "(Ldt1/g;Lqk1/a;Ldt1/c$h;)Ldt1/k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ldt1/g;", "c", "()Ldt1/g;", "b", "Lqk1/a;", "getResponse", "()Lqk1/a;", "Ldt1/c$h;", "getLastUpdate", "()Ldt1/c$h;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C12373k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC12369g state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30443a response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC12365c.h lastUpdate;

    public C12373k(InterfaceC12369g state, C30443a response, InterfaceC12365c.h hVar) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(response, "response");
        this.state = state;
        this.response = response;
        this.lastUpdate = hVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12373k m34709b(C12373k c12373k, InterfaceC12369g interfaceC12369g, C30443a c30443a, InterfaceC12365c.h hVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC12369g = c12373k.state;
        }
        if ((i13 & 2) != 0) {
            c30443a = c12373k.response;
        }
        if ((i13 & 4) != 0) {
            hVar = c12373k.lastUpdate;
        }
        return c12373k.m34710a(interfaceC12369g, c30443a, hVar);
    }

    /* JADX INFO: renamed from: a */
    public final C12373k m34710a(InterfaceC12369g state, C30443a response, InterfaceC12365c.h lastUpdate) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(response, "response");
        return new C12373k(state, response, lastUpdate);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC12369g getState() {
        return this.state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12373k)) {
            return false;
        }
        C12373k c12373k = (C12373k) other;
        return AbstractC22676k.m65745e(this.state, c12373k.state) && AbstractC22676k.m65745e(this.response, c12373k.response) && AbstractC22676k.m65745e(this.lastUpdate, c12373k.lastUpdate);
    }

    public int hashCode() {
        int iHashCode = (this.response.hashCode() + (this.state.hashCode() * 31)) * 31;
        InterfaceC12365c.h hVar = this.lastUpdate;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    public String toString() {
        return "LabradorDetailsLocalInternalState(state=" + this.state + ", response=" + this.response + ", lastUpdate=" + this.lastUpdate + ")";
    }

    public /* synthetic */ C12373k(InterfaceC12369g interfaceC12369g, C30443a c30443a, InterfaceC12365c.h hVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC12369g, c30443a, (i13 & 4) != 0 ? null : hVar);
    }
}
