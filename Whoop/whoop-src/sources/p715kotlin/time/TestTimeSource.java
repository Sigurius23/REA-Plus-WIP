package p715kotlin.time;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\r\u0010\bR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "<init>", "()V", "Lkotlin/time/Duration;", AttachmentExtensionsKt.EXTRA_DURATION, "Ll83/a0;", "overflow-LRDsOJo", "(J)V", "overflow", "", "read", "()J", "plusAssign-LRDsOJo", "plusAssign", "reading", "J", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        markNow();
    }

    /* JADX INFO: renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m134375overflowLRDsOJo(long duration) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + DurationUnitKt__DurationUnitKt.shortName(getUnit()) + " is advanced by " + ((Object) Duration.m134302toStringimpl(duration)) + '.');
    }

    /* JADX INFO: renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m134376plusAssignLRDsOJo(long duration) {
        long jM134301toLongimpl = Duration.m134301toLongimpl(duration, getUnit());
        if (((jM134301toLongimpl - 1) | 1) != Long.MAX_VALUE) {
            long j7 = this.reading;
            long j13 = j7 + jM134301toLongimpl;
            if ((jM134301toLongimpl ^ j7) >= 0 && (j7 ^ j13) < 0) {
                m134375overflowLRDsOJo(duration);
            }
            this.reading = j13;
            return;
        }
        long jM134265divUwyO8pc = Duration.m134265divUwyO8pc(duration, 2);
        if ((1 | (Duration.m134301toLongimpl(jM134265divUwyO8pc, getUnit()) - 1)) == Long.MAX_VALUE) {
            m134375overflowLRDsOJo(duration);
            return;
        }
        long j14 = this.reading;
        try {
            m134376plusAssignLRDsOJo(jM134265divUwyO8pc);
            m134376plusAssignLRDsOJo(Duration.m134290minusLRDsOJo(duration, jM134265divUwyO8pc));
        } catch (IllegalStateException e5) {
            this.reading = j14;
            throw e5;
        }
    }

    @Override // p715kotlin.time.AbstractLongTimeSource
    /* JADX INFO: renamed from: read, reason: from getter */
    public long getReading() {
        return this.reading;
    }
}
