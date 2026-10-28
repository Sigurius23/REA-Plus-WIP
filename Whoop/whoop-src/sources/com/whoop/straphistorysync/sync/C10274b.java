package com.whoop.straphistorysync.sync;

import bi2.C3295k;
import bi2.C3296l;
import c13.AbstractC3855a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import m83.C25272z;
import oh2.C27938a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.straphistorysync.sync.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\n\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0082\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018Jn\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b,\u0010\u001fR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b'\u00106\u001a\u0004\b7\u00108¨\u00069"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/b;", "", "Lcom/whoop/straphistorysync/sync/f;", "emittedState", "Lbi2/l;", "savedPacketCounts", "", "successfulBurstCount", "", "isSyncing", "Loh2/a;", "currentBurstMetadata", "consecutiveFailures", "", "", "", "lastSequenceByRevision", "Lbi2/k;", "sessionGapSummary", "<init>", "(Lcom/whoop/straphistorysync/sync/f;Lbi2/l;IZLoh2/a;ILjava/util/Map;Lbi2/k;)V", "Lcom/whoop/straphistorysync/sync/f$b;", "terminal", "a", "(Lcom/whoop/straphistorysync/sync/f$b;)Lcom/whoop/straphistorysync/sync/b;", "b", "(Lcom/whoop/straphistorysync/sync/f;Lbi2/l;IZLoh2/a;ILjava/util/Map;Lbi2/k;)Lcom/whoop/straphistorysync/sync/b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/straphistorysync/sync/f;", "f", "()Lcom/whoop/straphistorysync/sync/f;", "Lbi2/l;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lbi2/l;", "c", "I", "j", "d", "Z", "k", "()Z", "e", "Loh2/a;", "()Loh2/a;", "g", "Ljava/util/Map;", "()Ljava/util/Map;", "Lbi2/k;", "i", "()Lbi2/k;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C10274b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC10278f emittedState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C3296l savedPacketCounts;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int successfulBurstCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isSyncing;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27938a currentBurstMetadata;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int consecutiveFailures;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Map<Short, Long> lastSequenceByRevision;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C3295k sessionGapSummary;

    public C10274b(InterfaceC10278f emittedState, C3296l savedPacketCounts, int i13, boolean z4, C27938a c27938a, int i14, Map<Short, Long> lastSequenceByRevision, C3295k sessionGapSummary) {
        AbstractC22676k.m65750j(emittedState, "emittedState");
        AbstractC22676k.m65750j(savedPacketCounts, "savedPacketCounts");
        AbstractC22676k.m65750j(lastSequenceByRevision, "lastSequenceByRevision");
        AbstractC22676k.m65750j(sessionGapSummary, "sessionGapSummary");
        this.emittedState = emittedState;
        this.savedPacketCounts = savedPacketCounts;
        this.successfulBurstCount = i13;
        this.isSyncing = z4;
        this.currentBurstMetadata = c27938a;
        this.consecutiveFailures = i14;
        this.lastSequenceByRevision = lastSequenceByRevision;
        this.sessionGapSummary = sessionGapSummary;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C10274b m26246c(C10274b c10274b, InterfaceC10278f interfaceC10278f, C3296l c3296l, int i13, boolean z4, C27938a c27938a, int i14, Map map, C3295k c3295k, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            interfaceC10278f = c10274b.emittedState;
        }
        if ((i15 & 2) != 0) {
            c3296l = c10274b.savedPacketCounts;
        }
        if ((i15 & 4) != 0) {
            i13 = c10274b.successfulBurstCount;
        }
        if ((i15 & 8) != 0) {
            z4 = c10274b.isSyncing;
        }
        if ((i15 & 16) != 0) {
            c27938a = c10274b.currentBurstMetadata;
        }
        if ((i15 & 32) != 0) {
            i14 = c10274b.consecutiveFailures;
        }
        if ((i15 & 64) != 0) {
            map = c10274b.lastSequenceByRevision;
        }
        if ((i15 & 128) != 0) {
            c3295k = c10274b.sessionGapSummary;
        }
        Map map2 = map;
        C3295k c3295k2 = c3295k;
        C27938a c27938a2 = c27938a;
        int i16 = i14;
        return c10274b.m26248b(interfaceC10278f, c3296l, i13, z4, c27938a2, i16, map2, c3295k2);
    }

    /* JADX INFO: renamed from: a */
    public final C10274b m26247a(InterfaceC10278f.b terminal) {
        AbstractC22676k.m65750j(terminal, "terminal");
        return m26246c(this, terminal, null, 0, false, null, 0, null, null, 230, null);
    }

    /* JADX INFO: renamed from: b */
    public final C10274b m26248b(InterfaceC10278f emittedState, C3296l savedPacketCounts, int successfulBurstCount, boolean isSyncing, C27938a currentBurstMetadata, int consecutiveFailures, Map<Short, Long> lastSequenceByRevision, C3295k sessionGapSummary) {
        AbstractC22676k.m65750j(emittedState, "emittedState");
        AbstractC22676k.m65750j(savedPacketCounts, "savedPacketCounts");
        AbstractC22676k.m65750j(lastSequenceByRevision, "lastSequenceByRevision");
        AbstractC22676k.m65750j(sessionGapSummary, "sessionGapSummary");
        return new C10274b(emittedState, savedPacketCounts, successfulBurstCount, isSyncing, currentBurstMetadata, consecutiveFailures, lastSequenceByRevision, sessionGapSummary);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getConsecutiveFailures() {
        return this.consecutiveFailures;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C27938a getCurrentBurstMetadata() {
        return this.currentBurstMetadata;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C10274b)) {
            return false;
        }
        C10274b c10274b = (C10274b) other;
        return AbstractC22676k.m65745e(this.emittedState, c10274b.emittedState) && AbstractC22676k.m65745e(this.savedPacketCounts, c10274b.savedPacketCounts) && this.successfulBurstCount == c10274b.successfulBurstCount && this.isSyncing == c10274b.isSyncing && AbstractC22676k.m65745e(this.currentBurstMetadata, c10274b.currentBurstMetadata) && this.consecutiveFailures == c10274b.consecutiveFailures && AbstractC22676k.m65745e(this.lastSequenceByRevision, c10274b.lastSequenceByRevision) && AbstractC22676k.m65745e(this.sessionGapSummary, c10274b.sessionGapSummary);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC10278f getEmittedState() {
        return this.emittedState;
    }

    /* JADX INFO: renamed from: g */
    public final Map<Short, Long> m26252g() {
        return this.lastSequenceByRevision;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C3296l getSavedPacketCounts() {
        return this.savedPacketCounts;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.successfulBurstCount, (this.savedPacketCounts.hashCode() + (this.emittedState.hashCode() * 31)) * 31, 31), 31, this.isSyncing);
        C27938a c27938a = this.currentBurstMetadata;
        return this.sessionGapSummary.hashCode() + AbstractC3855a.m11821e(this.lastSequenceByRevision, AbstractC11266d.m30448b(this.consecutiveFailures, (iM8289b + (c27938a == null ? 0 : c27938a.hashCode())) * 31, 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C3295k getSessionGapSummary() {
        return this.sessionGapSummary;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getSuccessfulBurstCount() {
        return this.successfulBurstCount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsSyncing() {
        return this.isSyncing;
    }

    public String toString() {
        InterfaceC10278f interfaceC10278f = this.emittedState;
        C3296l c3296l = this.savedPacketCounts;
        int i13 = this.successfulBurstCount;
        boolean z4 = this.isSyncing;
        C27938a c27938a = this.currentBurstMetadata;
        int i14 = this.consecutiveFailures;
        Map<Short, Long> map = this.lastSequenceByRevision;
        C3295k c3295k = this.sessionGapSummary;
        StringBuilder sb4 = new StringBuilder("ProcessorState(emittedState=");
        sb4.append(interfaceC10278f);
        sb4.append(", savedPacketCounts=");
        sb4.append(c3296l);
        sb4.append(", successfulBurstCount=");
        AbstractC13673n.m38573t(i13, ", isSyncing=", ", currentBurstMetadata=", sb4, z4);
        sb4.append(c27938a);
        sb4.append(", consecutiveFailures=");
        sb4.append(i14);
        sb4.append(", lastSequenceByRevision=");
        sb4.append(map);
        sb4.append(", sessionGapSummary=");
        sb4.append(c3295k);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C10274b(InterfaceC10278f interfaceC10278f, C3296l c3296l, int i13, boolean z4, C27938a c27938a, int i14, Map map, C3295k c3295k, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? new InterfaceC10278f.a(null, null, 0, null, 15, null) : interfaceC10278f, (i15 & 2) != 0 ? new C3296l(null, 0, 0, 0, 15, null) : c3296l, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? false : z4, (i15 & 16) != 0 ? null : c27938a, (i15 & 32) == 0 ? i14 : 0, (i15 & 64) != 0 ? C25272z.f99163w : map, (i15 & 128) != 0 ? new C3295k(0, 0, 0L, 0, 15, null) : c3295k);
    }
}
