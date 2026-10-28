package vh2;

import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import java.time.Clock;
import java.time.Instant;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import st0.C32976t;
import st0.EnumC32973q;
import st0.InterfaceC32972p;
import st0.InterfaceC32974r;

/* JADX INFO: renamed from: vh2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lvh2/b;", "Lst0/r;", "Lvh2/a;", "Ljava/time/Clock;", "clock", "<init>", "(Ljava/time/Clock;)V", "Lst0/q;", "state", "", "counterSeconds", "Ll83/a0;", "e", "(Lst0/q;Ljava/lang/Long;)V", "Lst0/p;", "lockInfo", "c", "(Lst0/p;)V", "a", "()V", "d", "Ljava/time/Clock;", "Lec3/p1;", "Lst0/t;", "b", "Lec3/p1;", "recordedStatus", "()Lst0/t;", "lockStatus", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36047b implements InterfaceC32974r, InterfaceC36046a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13075p1 recordedStatus;

    public C36047b(Clock clock) {
        AbstractC22676k.m65750j(clock, "clock");
        this.clock = clock;
        this.recordedStatus = AbstractC13091v.m36593c(null);
    }

    /* JADX INFO: renamed from: e */
    private final void m114436e(EnumC32973q state, Long counterSeconds) {
        Duration durationM134260boximpl;
        InterfaceC13075p1 interfaceC13075p1 = this.recordedStatus;
        if (counterSeconds != null) {
            Duration.Companion companion = Duration.INSTANCE;
            durationM134260boximpl = Duration.m134260boximpl(DurationKt.toDuration(counterSeconds.longValue(), DurationUnit.SECONDS));
        } else {
            durationM134260boximpl = null;
        }
        Instant instantOfEpochMilli = Instant.ofEpochMilli(this.clock.millis());
        AbstractC22676k.m65749i(instantOfEpochMilli, "ofEpochMilli(...)");
        C32976t c32976t = new C32976t(state, durationM134260boximpl, instantOfEpochMilli, null);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, c32976t);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m114437f(C36047b c36047b, EnumC32973q enumC32973q, Long l7, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            l7 = null;
        }
        c36047b.m114436e(enumC32973q, l7);
    }

    @Override // vh2.InterfaceC36046a
    /* JADX INFO: renamed from: a */
    public void mo114433a() {
        m114437f(this, EnumC32973q.UNLOCKED, null, 2, null);
    }

    @Override // st0.InterfaceC32974r
    /* JADX INFO: renamed from: b */
    public C32976t mo104080b() {
        C32976t c32976t = (C32976t) ((C13045h2) this.recordedStatus).getValue();
        Duration durationM134260boximpl = null;
        if (c32976t == null) {
            return null;
        }
        Duration certificateTimeRemaining = c32976t.getCertificateTimeRemaining();
        if (certificateTimeRemaining != null) {
            long rawValue = certificateTimeRemaining.getRawValue();
            Duration.Companion companion = Duration.INSTANCE;
            durationM134260boximpl = Duration.m134260boximpl(((Duration) AbstractC12889b.m36289s(Duration.m134260boximpl(Duration.m134290minusLRDsOJo(rawValue, DurationKt.toDuration(this.clock.millis() - c32976t.getLastUpdatedAt().toEpochMilli(), DurationUnit.MILLISECONDS))), Duration.m134260boximpl(Duration.INSTANCE.m134357getZEROUwyO8pc()), Duration.m134260boximpl(rawValue))).getRawValue());
        }
        return C32976t.m104082b(c32976t, null, durationM134260boximpl, null, 5, null);
    }

    @Override // vh2.InterfaceC36046a
    /* JADX INFO: renamed from: c */
    public void mo114434c(InterfaceC32972p lockInfo) {
        AbstractC22676k.m65750j(lockInfo, "lockInfo");
        if (lockInfo instanceof InterfaceC32972p.b) {
            InterfaceC32972p.b bVar = (InterfaceC32972p.b) lockInfo;
            m114436e(bVar.getState(), Long.valueOf(bVar.getCounterSeconds()));
        } else {
            if (!lockInfo.equals(InterfaceC32972p.a.f137300a)) {
                throw new NoWhenBranchMatchedException();
            }
            m114437f(this, null, null, 2, null);
        }
    }

    @Override // vh2.InterfaceC36046a
    /* JADX INFO: renamed from: d */
    public void mo114435d() {
        m114437f(this, EnumC32973q.LOCKED, null, 2, null);
    }
}
