package com.whoop.straphistorysync.sync;

import bi2.C3295k;
import bi2.C3296l;
import bi2.EnumC3285a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.straphistorysync.sync.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000b\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/f;", "", "Lbi2/l;", "b", "()Lbi2/l;", "savedPacketCounts", "", "c", "()I", "successfulBurstCount", "Lbi2/k;", "a", "()Lbi2/k;", "gapSummary", "Lcom/whoop/straphistorysync/sync/f$a;", "Lcom/whoop/straphistorysync/sync/f$b;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC10278f {
    /* JADX INFO: renamed from: a */
    C3295k getGapSummary();

    /* JADX INFO: renamed from: b */
    C3296l getSavedPacketCounts();

    /* JADX INFO: renamed from: c */
    int getSuccessfulBurstCount();

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.f$b */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/f$b;", "Lcom/whoop/straphistorysync/sync/f;", "d", "c", "e", "a", "b", "Lcom/whoop/straphistorysync/sync/f$b$a;", "Lcom/whoop/straphistorysync/sync/f$b$b;", "Lcom/whoop/straphistorysync/sync/f$b$c;", "Lcom/whoop/straphistorysync/sync/f$b$d;", "Lcom/whoop/straphistorysync/sync/f$b$e;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface b extends InterfaceC10278f {

        /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.f$b$c */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/f$b$c;", "Lcom/whoop/straphistorysync/sync/f$b;", "Lbi2/l;", "savedPacketCounts", "", "successfulBurstCount", "Lbi2/k;", "gapSummary", "<init>", "(Lbi2/l;ILbi2/k;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbi2/l;", "b", "()Lbi2/l;", "I", "c", "Lbi2/k;", "()Lbi2/k;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C3296l savedPacketCounts;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final int successfulBurstCount;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final C3295k gapSummary;

            public c(C3296l savedPacketCounts, int i13, C3295k gapSummary) {
                AbstractC22676k.m65750j(savedPacketCounts, "savedPacketCounts");
                AbstractC22676k.m65750j(gapSummary, "gapSummary");
                this.savedPacketCounts = savedPacketCounts;
                this.successfulBurstCount = i13;
                this.gapSummary = gapSummary;
            }

            @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
            /* JADX INFO: renamed from: a, reason: from getter */
            public C3295k getGapSummary() {
                return this.gapSummary;
            }

            @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
            /* JADX INFO: renamed from: b, reason: from getter */
            public C3296l getSavedPacketCounts() {
                return this.savedPacketCounts;
            }

            @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
            /* JADX INFO: renamed from: c, reason: from getter */
            public int getSuccessfulBurstCount() {
                return this.successfulBurstCount;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof c)) {
                    return false;
                }
                c cVar = (c) other;
                return AbstractC22676k.m65745e(this.savedPacketCounts, cVar.savedPacketCounts) && this.successfulBurstCount == cVar.successfulBurstCount && AbstractC22676k.m65745e(this.gapSummary, cVar.gapSummary);
            }

            public int hashCode() {
                return this.gapSummary.hashCode() + AbstractC11266d.m30448b(this.successfulBurstCount, this.savedPacketCounts.hashCode() * 31, 31);
            }

            public String toString() {
                return "HPS.MetadataEventWhileNotSyncing(successfulBurstCount=" + getSuccessfulBurstCount() + ", counts=" + getSavedPacketCounts() + ", gaps=" + getGapSummary() + ")";
            }
        }

        /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.f$b$d */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/f$b$d;", "Lcom/whoop/straphistorysync/sync/f$b;", "Lbi2/l;", "savedPacketCounts", "", "successfulBurstCount", "Lbi2/k;", "gapSummary", "<init>", "(Lbi2/l;ILbi2/k;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbi2/l;", "b", "()Lbi2/l;", "I", "c", "Lbi2/k;", "()Lbi2/k;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C3296l savedPacketCounts;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final int successfulBurstCount;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final C3295k gapSummary;

            public d(C3296l savedPacketCounts, int i13, C3295k gapSummary) {
                AbstractC22676k.m65750j(savedPacketCounts, "savedPacketCounts");
                AbstractC22676k.m65750j(gapSummary, "gapSummary");
                this.savedPacketCounts = savedPacketCounts;
                this.successfulBurstCount = i13;
                this.gapSummary = gapSummary;
            }

            @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
            /* JADX INFO: renamed from: a, reason: from getter */
            public C3295k getGapSummary() {
                return this.gapSummary;
            }

            @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
            /* JADX INFO: renamed from: b, reason: from getter */
            public C3296l getSavedPacketCounts() {
                return this.savedPacketCounts;
            }

            @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
            /* JADX INFO: renamed from: c, reason: from getter */
            public int getSuccessfulBurstCount() {
                return this.successfulBurstCount;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof d)) {
                    return false;
                }
                d dVar = (d) other;
                return AbstractC22676k.m65745e(this.savedPacketCounts, dVar.savedPacketCounts) && this.successfulBurstCount == dVar.successfulBurstCount && AbstractC22676k.m65745e(this.gapSummary, dVar.gapSummary);
            }

            public int hashCode() {
                return this.gapSummary.hashCode() + AbstractC11266d.m30448b(this.successfulBurstCount, this.savedPacketCounts.hashCode() * 31, 31);
            }

            public String toString() {
                return "HPS.Success(successfulBurstCount=" + getSuccessfulBurstCount() + ", counts=" + getSavedPacketCounts() + ", gaps=" + getGapSummary() + ")";
            }
        }

        /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.f$b$a */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/f$b$a;", "Lcom/whoop/straphistorysync/sync/f$b;", "Lbi2/l;", "savedPacketCounts", "", "successfulBurstCount", "Lbi2/k;", "gapSummary", "<init>", "(Lbi2/l;ILbi2/k;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbi2/l;", "b", "()Lbi2/l;", "I", "c", "Lbi2/k;", "()Lbi2/k;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C3296l savedPacketCounts;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final int successfulBurstCount;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final C3295k gapSummary;

            public a(C3296l savedPacketCounts, int i13, C3295k gapSummary) {
                AbstractC22676k.m65750j(savedPacketCounts, "savedPacketCounts");
                AbstractC22676k.m65750j(gapSummary, "gapSummary");
                this.savedPacketCounts = savedPacketCounts;
                this.successfulBurstCount = i13;
                this.gapSummary = gapSummary;
            }

            @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
            /* JADX INFO: renamed from: a, reason: from getter */
            public C3295k getGapSummary() {
                return this.gapSummary;
            }

            @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
            /* JADX INFO: renamed from: b, reason: from getter */
            public C3296l getSavedPacketCounts() {
                return this.savedPacketCounts;
            }

            @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
            /* JADX INFO: renamed from: c, reason: from getter */
            public int getSuccessfulBurstCount() {
                return this.successfulBurstCount;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return AbstractC22676k.m65745e(this.savedPacketCounts, aVar.savedPacketCounts) && this.successfulBurstCount == aVar.successfulBurstCount && AbstractC22676k.m65745e(this.gapSummary, aVar.gapSummary);
            }

            public int hashCode() {
                return this.gapSummary.hashCode() + AbstractC11266d.m30448b(this.successfulBurstCount, this.savedPacketCounts.hashCode() * 31, 31);
            }

            public String toString() {
                return "HPS.Disconnected(successfulBurstCount=" + getSuccessfulBurstCount() + ", counts=" + getSavedPacketCounts() + ", gaps=" + getGapSummary() + ")";
            }

            public /* synthetic */ a(C3296l c3296l, int i13, C3295k c3295k, int i14, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i14 & 1) != 0) {
                    c3296l = new C3296l(null, 0, 0, 0, 15, null);
                }
                this(c3296l, (i14 & 2) != 0 ? 0 : i13, (i14 & 4) != 0 ? new C3295k(0, 0, 0L, 0, 15, null) : c3295k);
            }
        }

        /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.f$b$e */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/f$b$e;", "Lcom/whoop/straphistorysync/sync/f$b;", "Lbi2/l;", "savedPacketCounts", "", "successfulBurstCount", "Lbi2/k;", "gapSummary", "<init>", "(Lbi2/l;ILbi2/k;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbi2/l;", "b", "()Lbi2/l;", "I", "c", "Lbi2/k;", "()Lbi2/k;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C3296l savedPacketCounts;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final int successfulBurstCount;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final C3295k gapSummary;

            public e(C3296l savedPacketCounts, int i13, C3295k gapSummary) {
                AbstractC22676k.m65750j(savedPacketCounts, "savedPacketCounts");
                AbstractC22676k.m65750j(gapSummary, "gapSummary");
                this.savedPacketCounts = savedPacketCounts;
                this.successfulBurstCount = i13;
                this.gapSummary = gapSummary;
            }

            @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
            /* JADX INFO: renamed from: a, reason: from getter */
            public C3295k getGapSummary() {
                return this.gapSummary;
            }

            @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
            /* JADX INFO: renamed from: b, reason: from getter */
            public C3296l getSavedPacketCounts() {
                return this.savedPacketCounts;
            }

            @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
            /* JADX INFO: renamed from: c, reason: from getter */
            public int getSuccessfulBurstCount() {
                return this.successfulBurstCount;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof e)) {
                    return false;
                }
                e eVar = (e) other;
                return AbstractC22676k.m65745e(this.savedPacketCounts, eVar.savedPacketCounts) && this.successfulBurstCount == eVar.successfulBurstCount && AbstractC22676k.m65745e(this.gapSummary, eVar.gapSummary);
            }

            public int hashCode() {
                return this.gapSummary.hashCode() + AbstractC11266d.m30448b(this.successfulBurstCount, this.savedPacketCounts.hashCode() * 31, 31);
            }

            public String toString() {
                return "HPS.Timeout(successfulBurstCount=" + getSuccessfulBurstCount() + ", counts=" + getSavedPacketCounts() + ", gaps=" + getGapSummary() + ")";
            }

            public /* synthetic */ e(C3296l c3296l, int i13, C3295k c3295k, int i14, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i14 & 1) != 0) {
                    c3296l = new C3296l(null, 0, 0, 0, 15, null);
                }
                this(c3296l, (i14 & 2) != 0 ? 0 : i13, (i14 & 4) != 0 ? new C3295k(0, 0, 0L, 0, 15, null) : c3295k);
            }
        }

        /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.f$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/f$b$b;", "Lcom/whoop/straphistorysync/sync/f$b;", "Lbi2/a;", "reason", "Lbi2/l;", "savedPacketCounts", "", "successfulBurstCount", "Lbi2/k;", "gapSummary", "<init>", "(Lbi2/a;Lbi2/l;ILbi2/k;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbi2/a;", "d", "()Lbi2/a;", "b", "Lbi2/l;", "()Lbi2/l;", "c", "I", "Lbi2/k;", "()Lbi2/k;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41422b implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final EnumC3285a reason;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final C3296l savedPacketCounts;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final int successfulBurstCount;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final C3295k gapSummary;

            public C41422b(EnumC3285a reason, C3296l savedPacketCounts, int i13, C3295k gapSummary) {
                AbstractC22676k.m65750j(reason, "reason");
                AbstractC22676k.m65750j(savedPacketCounts, "savedPacketCounts");
                AbstractC22676k.m65750j(gapSummary, "gapSummary");
                this.reason = reason;
                this.savedPacketCounts = savedPacketCounts;
                this.successfulBurstCount = i13;
                this.gapSummary = gapSummary;
            }

            @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
            /* JADX INFO: renamed from: a, reason: from getter */
            public C3295k getGapSummary() {
                return this.gapSummary;
            }

            @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
            /* JADX INFO: renamed from: b, reason: from getter */
            public C3296l getSavedPacketCounts() {
                return this.savedPacketCounts;
            }

            @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
            /* JADX INFO: renamed from: c, reason: from getter */
            public int getSuccessfulBurstCount() {
                return this.successfulBurstCount;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final EnumC3285a getReason() {
                return this.reason;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C41422b)) {
                    return false;
                }
                C41422b c41422b = (C41422b) other;
                return this.reason == c41422b.reason && AbstractC22676k.m65745e(this.savedPacketCounts, c41422b.savedPacketCounts) && this.successfulBurstCount == c41422b.successfulBurstCount && AbstractC22676k.m65745e(this.gapSummary, c41422b.gapSummary);
            }

            public int hashCode() {
                return this.gapSummary.hashCode() + AbstractC11266d.m30448b(this.successfulBurstCount, (this.savedPacketCounts.hashCode() + (this.reason.hashCode() * 31)) * 31, 31);
            }

            public String toString() {
                return "HPS.Error(reason=" + this.reason + ", successfulBurstCount=" + getSuccessfulBurstCount() + ", counts=" + getSavedPacketCounts() + ", gaps=" + getGapSummary() + ")";
            }

            public /* synthetic */ C41422b(EnumC3285a enumC3285a, C3296l c3296l, int i13, C3295k c3295k, int i14, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i14 & 2) != 0) {
                    c3296l = new C3296l(null, 0, 0, 0, 15, null);
                }
                this(enumC3285a, c3296l, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? new C3295k(0, 0, 0L, 0, 15, null) : c3295k);
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.f$a */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/f$a;", "Lcom/whoop/straphistorysync/sync/f;", "Lcom/whoop/straphistorysync/sync/c;", "openBurst", "Lbi2/l;", "savedPacketCounts", "", "successfulBurstCount", "Lbi2/k;", "gapSummary", "<init>", "(Lcom/whoop/straphistorysync/sync/c;Lbi2/l;ILbi2/k;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/straphistorysync/sync/c;", "d", "()Lcom/whoop/straphistorysync/sync/c;", "b", "Lbi2/l;", "()Lbi2/l;", "c", "I", "Lbi2/k;", "()Lbi2/k;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC10278f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC10275c openBurst;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C3296l savedPacketCounts;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int successfulBurstCount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C3295k gapSummary;

        public a(InterfaceC10275c openBurst, C3296l savedPacketCounts, int i13, C3295k gapSummary) {
            AbstractC22676k.m65750j(openBurst, "openBurst");
            AbstractC22676k.m65750j(savedPacketCounts, "savedPacketCounts");
            AbstractC22676k.m65750j(gapSummary, "gapSummary");
            this.openBurst = openBurst;
            this.savedPacketCounts = savedPacketCounts;
            this.successfulBurstCount = i13;
            this.gapSummary = gapSummary;
        }

        @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
        /* JADX INFO: renamed from: a, reason: from getter */
        public C3295k getGapSummary() {
            return this.gapSummary;
        }

        @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
        /* JADX INFO: renamed from: b, reason: from getter */
        public C3296l getSavedPacketCounts() {
            return this.savedPacketCounts;
        }

        @Override // com.whoop.straphistorysync.sync.InterfaceC10278f
        /* JADX INFO: renamed from: c, reason: from getter */
        public int getSuccessfulBurstCount() {
            return this.successfulBurstCount;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC10275c getOpenBurst() {
            return this.openBurst;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.openBurst, aVar.openBurst) && AbstractC22676k.m65745e(this.savedPacketCounts, aVar.savedPacketCounts) && this.successfulBurstCount == aVar.successfulBurstCount && AbstractC22676k.m65745e(this.gapSummary, aVar.gapSummary);
        }

        public int hashCode() {
            return this.gapSummary.hashCode() + AbstractC11266d.m30448b(this.successfulBurstCount, (this.savedPacketCounts.hashCode() + (this.openBurst.hashCode() * 31)) * 31, 31);
        }

        public String toString() {
            return "HPS.Running(openBurst=" + this.openBurst + ", successfulBurstCount=" + getSuccessfulBurstCount() + ", counts=" + getSavedPacketCounts() + ", gaps=" + getGapSummary() + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ a(InterfaceC10275c interfaceC10275c, C3296l c3296l, int i13, C3295k c3295k, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? new InterfaceC10275c.b(null, 1, 0 == true ? 1 : 0) : interfaceC10275c, (i14 & 2) != 0 ? new C3296l(null, 0, 0, 0, 15, null) : c3296l, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? new C3295k(0, 0, 0L, 0, 15, null) : c3295k);
        }
    }
}
