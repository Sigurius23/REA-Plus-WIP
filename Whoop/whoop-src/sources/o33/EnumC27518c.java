package o33;

import androidx.core.app.NotificationCompat;
import ge3.AbstractC15751g;
import ng3.C26701n;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 o33.c[], still in use, count: 1, list:
  (r0v4 o33.c[]) from 0x00ad: INVOKE (r0v4 o33.c[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: o33.c */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC27518c {
    /* JADX INFO: Fake field, exist only in values array */
    CERTIFICATE("certificate"),
    /* JADX INFO: Fake field, exist only in values array */
    CODEC("codec"),
    /* JADX INFO: Fake field, exist only in values array */
    CANDIDATE_PAIR("candidate-pair"),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE_CANDIDATE("remote-candidate"),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_CANDIDATE("local-candidate"),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE_INBOUND_RTP("remote-inbound-rtp"),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE_OUTBOUND_RTP("remote-outbound-rtp"),
    /* JADX INFO: Fake field, exist only in values array */
    INBOUND_RTP("inbound-rtp"),
    /* JADX INFO: Fake field, exist only in values array */
    OUTBOUND_RTP("outbound-rtp"),
    /* JADX INFO: Fake field, exist only in values array */
    TRACK("track"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_SOURCE("media-source"),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM("stream"),
    /* JADX INFO: Fake field, exist only in values array */
    PEER_CONNECTION("peer-connection"),
    /* JADX INFO: Fake field, exist only in values array */
    TRANSPORT(NotificationCompat.CATEGORY_TRANSPORT),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: x */
    public static final C26701n f110806x;

    /* JADX INFO: renamed from: w */
    public final String f110809w;

    static {
        AbstractC15751g.m44468u(enumC27518cArr);
        f110806x = new C26701n(8);
    }

    public EnumC27518c(String str) {
        super(str, i);
        this.f110809w = str;
    }

    public static EnumC27518c valueOf(String str) {
        return (EnumC27518c) Enum.valueOf(EnumC27518c.class, str);
    }

    public static EnumC27518c[] values() {
        return (EnumC27518c[]) f110808z.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f110809w;
    }
}
