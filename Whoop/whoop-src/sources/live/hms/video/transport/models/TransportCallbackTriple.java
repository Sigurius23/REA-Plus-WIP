package live.hms.video.transport.models;

import bc3.InterfaceC3055s;
import java.util.HashMap;
import live.hms.video.error.HMSAction;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012$\b\u0002\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001`\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JP\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052$\b\u0002\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001`\tHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0010R3\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\u0012¨\u0006#"}, m65681d2 = {"Llive/hms/video/transport/models/TransportCallbackTriple;", "", "Lbc3/s;", "", "deferred", "Llive/hms/video/error/HMSAction;", "action", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "extra", "<init>", "(Lbc3/s;Llive/hms/video/error/HMSAction;Ljava/util/HashMap;)V", "component1", "()Lbc3/s;", "component2", "()Llive/hms/video/error/HMSAction;", "component3", "()Ljava/util/HashMap;", "copy", "(Lbc3/s;Llive/hms/video/error/HMSAction;Ljava/util/HashMap;)Llive/hms/video/transport/models/TransportCallbackTriple;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lbc3/s;", "getDeferred", "Llive/hms/video/error/HMSAction;", "getAction", "Ljava/util/HashMap;", "getExtra", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class TransportCallbackTriple {
    private final HMSAction action;
    private final InterfaceC3055s deferred;
    private final HashMap<String, Object> extra;

    public TransportCallbackTriple(InterfaceC3055s deferred, HMSAction action, HashMap<String, Object> extra) {
        AbstractC22676k.m65750j(deferred, "deferred");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(extra, "extra");
        this.deferred = deferred;
        this.action = action;
        this.extra = extra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransportCallbackTriple copy$default(TransportCallbackTriple transportCallbackTriple, InterfaceC3055s interfaceC3055s, HMSAction hMSAction, HashMap map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC3055s = transportCallbackTriple.deferred;
        }
        if ((i13 & 2) != 0) {
            hMSAction = transportCallbackTriple.action;
        }
        if ((i13 & 4) != 0) {
            map = transportCallbackTriple.extra;
        }
        return transportCallbackTriple.copy(interfaceC3055s, hMSAction, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final InterfaceC3055s getDeferred() {
        return this.deferred;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSAction getAction() {
        return this.action;
    }

    public final HashMap<String, Object> component3() {
        return this.extra;
    }

    public final TransportCallbackTriple copy(InterfaceC3055s deferred, HMSAction action, HashMap<String, Object> extra) {
        AbstractC22676k.m65750j(deferred, "deferred");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(extra, "extra");
        return new TransportCallbackTriple(deferred, action, extra);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransportCallbackTriple)) {
            return false;
        }
        TransportCallbackTriple transportCallbackTriple = (TransportCallbackTriple) other;
        return AbstractC22676k.m65745e(this.deferred, transportCallbackTriple.deferred) && this.action == transportCallbackTriple.action && AbstractC22676k.m65745e(this.extra, transportCallbackTriple.extra);
    }

    public final HMSAction getAction() {
        return this.action;
    }

    public final InterfaceC3055s getDeferred() {
        return this.deferred;
    }

    public final HashMap<String, Object> getExtra() {
        return this.extra;
    }

    public int hashCode() {
        return this.extra.hashCode() + ((this.action.hashCode() + (this.deferred.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "TransportCallbackTriple(deferred=" + this.deferred + ", action=" + this.action + ", extra=" + this.extra + ')';
    }

    public /* synthetic */ TransportCallbackTriple(InterfaceC3055s interfaceC3055s, HMSAction hMSAction, HashMap map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3055s, hMSAction, (i13 & 4) != 0 ? new HashMap() : map);
    }
}
