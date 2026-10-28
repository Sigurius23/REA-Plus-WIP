package l53;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v21 l53.a[], still in use, count: 1, list:
  (r0v21 l53.a[]) from 0x0107: INVOKE (r0v21 l53.a[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l53.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC23360a {
    /* JADX INFO: Fake field, exist only in values array */
    CREATE("create"),
    /* JADX INFO: Fake field, exist only in values array */
    JOIN_REQUEST("joinRequest"),
    /* JADX INFO: Fake field, exist only in values array */
    ON_ICE_CANDIDATE("onicecandidate"),
    /* JADX INFO: Fake field, exist only in values array */
    ON_TRACK("ontrack"),
    /* JADX INFO: Fake field, exist only in values array */
    ON_SIGNALING_STATE_CHANGE("onsignalingstatechange"),
    /* JADX INFO: Fake field, exist only in values array */
    ON_ICE_CONNECTION_STATE_CHANGE("oniceconnectionstatechange"),
    /* JADX INFO: Fake field, exist only in values array */
    ON_ICE_GATHERING_STATE_CHANGE("onicegatheringstatechange"),
    /* JADX INFO: Fake field, exist only in values array */
    ON_CONNECTION_STATE_CHANGE("onconnectionstatechange"),
    /* JADX INFO: Fake field, exist only in values array */
    ON_NEGOTIATION_NEEDED("onnegotiationneeded"),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DATA_CHANNEL("ondatachannel"),
    /* JADX INFO: Fake field, exist only in values array */
    CLOSE("close"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_OFFER("createOffer"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_ANSWER("createAnswer"),
    /* JADX INFO: Fake field, exist only in values array */
    SET_LOCAL_DESCRIPTION("setLocalDescription"),
    /* JADX INFO: Fake field, exist only in values array */
    SET_REMOTE_DESCRIPTION("setRemoteDescription"),
    /* JADX INFO: Fake field, exist only in values array */
    ADD_ICE_CANDIDATE("addIceCandidate"),
    /* JADX INFO: Fake field, exist only in values array */
    CHANGE_PUBLISH_QUALITY("changePublishQuality"),
    /* JADX INFO: Fake field, exist only in values array */
    CHANGE_PUBLISH_OPTIONS("changePublishOptions"),
    /* JADX INFO: Fake field, exist only in values array */
    GO_AWAY("goAway"),
    /* JADX INFO: Fake field, exist only in values array */
    SFU_ERROR("error"),
    /* JADX INFO: Fake field, exist only in values array */
    CALL_ENDED("callEnded");


    /* JADX INFO: renamed from: w */
    public final String f92602w;

    static {
        AbstractC15751g.m44468u(enumC23360aArr);
    }

    public EnumC23360a(String str) {
        super(str, i);
        this.f92602w = str;
    }

    public static EnumC23360a valueOf(String str) {
        return (EnumC23360a) Enum.valueOf(EnumC23360a.class, str);
    }

    public static EnumC23360a[] values() {
        return (EnumC23360a[]) f92601x.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f92602w;
    }
}
