package sn2;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23465k;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p734sl0.C32581a1;

/* JADX INFO: renamed from: sn2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0011\u0010 \u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\f¨\u0006!"}, m65681d2 = {"Lsn2/e;", "", "Lkotlin/Function0;", "", "newIdempotencyKey", "<init>", "(Lc93/a;)V", "cartId", "g", "(Ljava/lang/String;)Ljava/lang/String;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "Ll83/a0;", "d", "()V", "c", "a", "Lc93/a;", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "idempotencyKey", "Ll83/k;", "Ll83/k;", "paymentKey", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "inFlight", "dismissed", "f", "isDismissed", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32779e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4339a newIdempotencyKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String idempotencyKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C23465k paymentKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AtomicBoolean inFlight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AtomicBoolean dismissed;

    public C32779e(InterfaceC4339a newIdempotencyKey) {
        AbstractC22676k.m65750j(newIdempotencyKey, "newIdempotencyKey");
        this.newIdempotencyKey = newIdempotencyKey;
        this.idempotencyKey = (String) newIdempotencyKey.invoke();
        this.inFlight = new AtomicBoolean(false);
        this.dismissed = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final String m102814b() {
        return AbstractC11895b.m31995n("toString(...)");
    }

    /* JADX INFO: renamed from: c */
    public final void m102815c() {
        this.dismissed.set(true);
    }

    /* JADX INFO: renamed from: d */
    public final void m102816d() {
        this.inFlight.set(false);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m102818f() {
        return this.dismissed.get();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized String m102819g(String cartId) {
        AbstractC22676k.m65750j(cartId, "cartId");
        C23465k c23465k = this.paymentKey;
        if (c23465k != null && AbstractC22676k.m65745e(c23465k.f92937w, cartId)) {
            return (String) c23465k.f92938x;
        }
        Object objInvoke = this.newIdempotencyKey.invoke();
        this.paymentKey = new C23465k(cartId, (String) objInvoke);
        return (String) objInvoke;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m102820h() {
        return !m102818f() && this.inFlight.compareAndSet(false, true);
    }

    public /* synthetic */ C32779e(InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C32581a1(19) : interfaceC4339a);
    }
}
