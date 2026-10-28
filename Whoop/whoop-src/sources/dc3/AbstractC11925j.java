package dc3;

import bc3.InterfaceC3025k;
import hc3.AbstractC17167b;
import hc3.C17191x;
import p497t7.InterfaceC33561b;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: dc3.j */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC11925j {

    /* JADX INFO: renamed from: a */
    public static final C11931p f39008a = new C11931p(-1, null, null, 0);

    /* JADX INFO: renamed from: b */
    public static final int f39009b = AbstractC17167b.m48485k(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* JADX INFO: renamed from: c */
    public static final int f39010c = AbstractC17167b.m48485k(InterfaceC33561b.INVALID_OWNERSHIP, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* JADX INFO: renamed from: d */
    public static final C17191x f39011d = new C17191x("BUFFERED", 0);

    /* JADX INFO: renamed from: e */
    public static final C17191x f39012e = new C17191x("SHOULD_BUFFER", 0);

    /* JADX INFO: renamed from: f */
    public static final C17191x f39013f = new C17191x("S_RESUMING_BY_RCV", 0);

    /* JADX INFO: renamed from: g */
    public static final C17191x f39014g = new C17191x("RESUMING_BY_EB", 0);

    /* JADX INFO: renamed from: h */
    public static final C17191x f39015h = new C17191x("POISONED", 0);

    /* JADX INFO: renamed from: i */
    public static final C17191x f39016i = new C17191x("DONE_RCV", 0);

    /* JADX INFO: renamed from: j */
    public static final C17191x f39017j = new C17191x("INTERRUPTED_SEND", 0);

    /* JADX INFO: renamed from: k */
    public static final C17191x f39018k = new C17191x("INTERRUPTED_RCV", 0);

    /* JADX INFO: renamed from: l */
    public static final C17191x f39019l = new C17191x("CHANNEL_CLOSED", 0);

    /* JADX INFO: renamed from: m */
    public static final C17191x f39020m = new C17191x("SUSPEND", 0);

    /* JADX INFO: renamed from: n */
    public static final C17191x f39021n = new C17191x("SUSPEND_NO_WAITER", 0);

    /* JADX INFO: renamed from: o */
    public static final C17191x f39022o = new C17191x("FAILED", 0);

    /* JADX INFO: renamed from: p */
    public static final C17191x f39023p = new C17191x("NO_RECEIVE_RESULT", 0);

    /* JADX INFO: renamed from: q */
    public static final C17191x f39024q = new C17191x("CLOSE_HANDLER_CLOSED", 0);

    /* JADX INFO: renamed from: r */
    public static final C17191x f39025r = new C17191x("CLOSE_HANDLER_INVOKED", 0);

    /* JADX INFO: renamed from: s */
    public static final C17191x f39026s = new C17191x("NO_CLOSE_CAUSE", 0);

    /* JADX INFO: renamed from: a */
    public static final boolean m32225a(InterfaceC3025k interfaceC3025k, Object obj, Function3 function3) {
        C17191x c17191xMo8743c = interfaceC3025k.mo8743c(obj, function3);
        if (c17191xMo8743c == null) {
            return false;
        }
        interfaceC3025k.mo8746n(c17191xMo8743c);
        return true;
    }
}
