package ca2;

import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.ChatClient;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ca2.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lca2/i;", "Lca2/h;", "<init>", "()V", "", "headerTimestampMillis", "Ll83/a0;", "a", "(J)V", "b", "Lec3/p1;", "Lec3/p1;", "latestRawDataTimestamp", "latestProcessedDataTimestamp", "", "c", "()Z", "isRawDataInBacklog", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4369i implements InterfaceC4368h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13075p1 latestRawDataTimestamp = AbstractC13091v.m36593c(0L);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13075p1 latestProcessedDataTimestamp = AbstractC13091v.m36593c(0L);

    @Override // ca2.InterfaceC4368h
    /* JADX INFO: renamed from: a */
    public void mo13759a(long headerTimestampMillis) {
        InterfaceC13075p1 interfaceC13075p1 = this.latestRawDataTimestamp;
        Long lValueOf = Long.valueOf(headerTimestampMillis);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, lValueOf);
    }

    @Override // ca2.InterfaceC4368h
    /* JADX INFO: renamed from: b */
    public void mo13760b(long headerTimestampMillis) {
        InterfaceC13075p1 interfaceC13075p1 = this.latestProcessedDataTimestamp;
        Long lValueOf = Long.valueOf(headerTimestampMillis);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, lValueOf);
    }

    @Override // ca2.InterfaceC4368h
    /* JADX INFO: renamed from: c */
    public boolean mo13761c() {
        return ((Number) ((C13045h2) this.latestProcessedDataTimestamp).getValue()).longValue() != 0 && Math.abs(((Number) ((C13045h2) this.latestRawDataTimestamp).getValue()).longValue() - ((Number) ((C13045h2) this.latestProcessedDataTimestamp).getValue()).longValue()) < ChatClient.RESOLVE_DEPENDENCY_TIMEOUT;
    }
}
