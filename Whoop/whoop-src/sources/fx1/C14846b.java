package fx1;

import java.util.Map;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fx1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lfx1/b;", "", "", "", "payload", "Lfx1/c;", "screenState", "<init>", "(Ljava/util/Map;Lfx1/c;)V", "a", "(Ljava/util/Map;Lfx1/c;)Lfx1/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "b", "Lfx1/c;", "d", "()Lfx1/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14846b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<String, String> payload;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14847c screenState;

    public C14846b(Map<String, String> payload, InterfaceC14847c screenState) {
        AbstractC22676k.m65750j(payload, "payload");
        AbstractC22676k.m65750j(screenState, "screenState");
        this.payload = payload;
        this.screenState = screenState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C14846b m42727b(C14846b c14846b, Map map, InterfaceC14847c interfaceC14847c, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = c14846b.payload;
        }
        if ((i13 & 2) != 0) {
            interfaceC14847c = c14846b.screenState;
        }
        return c14846b.m42728a(map, interfaceC14847c);
    }

    /* JADX INFO: renamed from: a */
    public final C14846b m42728a(Map<String, String> payload, InterfaceC14847c screenState) {
        AbstractC22676k.m65750j(payload, "payload");
        AbstractC22676k.m65750j(screenState, "screenState");
        return new C14846b(payload, screenState);
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, String> m42729c() {
        return this.payload;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC14847c getScreenState() {
        return this.screenState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14846b)) {
            return false;
        }
        C14846b c14846b = (C14846b) other;
        return AbstractC22676k.m65745e(this.payload, c14846b.payload) && AbstractC22676k.m65745e(this.screenState, c14846b.screenState);
    }

    public int hashCode() {
        return this.screenState.hashCode() + (this.payload.hashCode() * 31);
    }

    public String toString() {
        return "MembershipAdjustmentCheckoutDomainResult(payload=" + this.payload + ", screenState=" + this.screenState + ")";
    }

    public /* synthetic */ C14846b(Map map, InterfaceC14847c interfaceC14847c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25272z.f99163w : map, (i13 & 2) != 0 ? InterfaceC14847c.c.f55353a : interfaceC14847c);
    }
}
