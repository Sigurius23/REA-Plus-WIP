package vg0;

import ec3.AbstractC13091v;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import l83.C23454a0;
import p007a6.C0456u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import tg0.AbstractC33776a;

/* JADX INFO: renamed from: vg0.i0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\nJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010!¨\u0006)"}, m65681d2 = {"Lvg0/i0;", "", "Lvg0/h0;", "markTurnAsSeenInteractor", "Ljava/time/Clock;", "clock", "<init>", "(Lvg0/h0;Ljava/time/Clock;)V", "Ll83/a0;", "e", "()V", "", "drawerOpenedAtMs", "b", "(JLq83/d;)Ljava/lang/Object;", "a", "Ltg0/a;", "action", "c", "(Ltg0/a;)V", "", "fingerprint", "turnId", "d", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lvg0/h0;", "Ljava/time/Clock;", "Ljava/lang/Long;", "drawerOpenTimeMs", "currentTtpiaStartTimeMs", "currentTtfmtStartTimeMs", "", "f", "Z", "hasMarkedSeenForCurrentSession", "Lvg0/n0;", "g", "Lvg0/n0;", "pendingSeenState", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "isDrawerOpen", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35993i0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C35991h0 markTurnAsSeenInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Long drawerOpenTimeMs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Long currentTtpiaStartTimeMs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Long currentTtfmtStartTimeMs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean hasMarkedSeenForCurrentSession;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C36003n0 pendingSeenState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isDrawerOpen;

    public C35993i0(C35991h0 markTurnAsSeenInteractor, Clock clock) {
        AbstractC22676k.m65750j(markTurnAsSeenInteractor, "markTurnAsSeenInteractor");
        AbstractC22676k.m65750j(clock, "clock");
        this.markTurnAsSeenInteractor = markTurnAsSeenInteractor;
        this.clock = clock;
    }

    /* JADX INFO: renamed from: e */
    private final void m114309e() {
        this.drawerOpenTimeMs = null;
        this.pendingSeenState = null;
        this.hasMarkedSeenForCurrentSession = false;
        this.currentTtpiaStartTimeMs = null;
        this.currentTtfmtStartTimeMs = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m114310a() {
        this.isDrawerOpen = false;
    }

    /* JADX INFO: renamed from: b */
    public final Object m114311b(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Long l7;
        this.isDrawerOpen = true;
        this.drawerOpenTimeMs = new Long(j7);
        C36003n0 c36003n0 = this.pendingSeenState;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (c36003n0 == null) {
            return c23454a0;
        }
        this.pendingSeenState = null;
        this.hasMarkedSeenForCurrentSession = true;
        C35991h0 c35991h0 = this.markTurnAsSeenInteractor;
        String fingerprint = c36003n0.getFingerprint();
        String turnId = c36003n0.getTurnId();
        Long ttpiaStartTimeMs = c36003n0.getTtpiaStartTimeMs();
        if (ttpiaStartTimeMs != null) {
            l7 = new Long(Math.max(0L, c36003n0.getFirstTokenTimeMs() - ttpiaStartTimeMs.longValue()));
        } else {
            l7 = null;
        }
        Object objM36603m = AbstractC13091v.m36603m(c35991h0.interact(new C0456u(new C35989g0(fingerprint, turnId, 0L, l7), 1)), interfaceC30057d);
        return objM36603m == EnumC31071a.f128113w ? objM36603m : c23454a0;
    }

    /* JADX INFO: renamed from: c */
    public final void m114312c(AbstractC33776a action) {
        AbstractC22676k.m65750j(action, "action");
        if ((action instanceof AbstractC33776a.b) || (action instanceof AbstractC33776a.n)) {
            m114309e();
            long jMillis = this.clock.millis();
            this.currentTtpiaStartTimeMs = Long.valueOf(jMillis);
            this.currentTtfmtStartTimeMs = Long.valueOf(jMillis);
            return;
        }
        if (!(action instanceof AbstractC33776a.d)) {
            if (action.equals(AbstractC33776a.e.f141392a)) {
                this.pendingSeenState = null;
            }
        } else {
            this.hasMarkedSeenForCurrentSession = false;
            this.pendingSeenState = null;
            AbstractC33776a.d dVar = (AbstractC33776a.d) action;
            this.currentTtpiaStartTimeMs = Long.valueOf(dVar.getUserTimestamp());
            this.currentTtfmtStartTimeMs = Long.valueOf(dVar.getUserTimestamp());
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m114313d(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean z4 = this.hasMarkedSeenForCurrentSession;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (z4) {
            return c23454a0;
        }
        if (!this.isDrawerOpen) {
            this.pendingSeenState = new C36003n0(str, str2, this.clock.millis(), this.currentTtpiaStartTimeMs);
            return c23454a0;
        }
        long jMillis = this.clock.millis();
        Long l7 = this.currentTtfmtStartTimeMs;
        if (l7 == null) {
            l7 = this.drawerOpenTimeMs;
        }
        if (l7 != null) {
            this.hasMarkedSeenForCurrentSession = true;
            C35991h0 c35991h0 = this.markTurnAsSeenInteractor;
            long jMax = Math.max(0L, jMillis - l7.longValue());
            Long l12 = this.currentTtpiaStartTimeMs;
            Object objM36603m = AbstractC13091v.m36603m(c35991h0.interact(new C0456u(new C35989g0(str, str2, jMax, l12 != null ? new Long(Math.max(0L, jMillis - l12.longValue())) : null), 1)), interfaceC30057d);
            if (objM36603m == EnumC31071a.f128113w) {
                return objM36603m;
            }
        }
        return c23454a0;
    }
}
