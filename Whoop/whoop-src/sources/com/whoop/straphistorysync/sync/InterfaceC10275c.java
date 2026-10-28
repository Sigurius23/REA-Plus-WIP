package com.whoop.straphistorysync.sync;

import oh2.C27938a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xj0.C38377q;

/* JADX INFO: renamed from: com.whoop.straphistorysync.sync.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/c;", "", "b", "c", "a", "Lcom/whoop/straphistorysync/sync/c$b;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC10275c {

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.c$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/c$a;", "", "Loh2/a;", "metadata", "Lxj0/q;", "failurePacket", "<init>", "(Loh2/a;Lxj0/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loh2/a;", "b", "()Loh2/a;", "Lxj0/q;", "()Lxj0/q;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC10275c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C27938a metadata;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C38377q failurePacket;

        public a(C27938a metadata, C38377q failurePacket) {
            AbstractC22676k.m65750j(metadata, "metadata");
            AbstractC22676k.m65750j(failurePacket, "failurePacket");
            this.metadata = metadata;
            this.failurePacket = failurePacket;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C38377q getFailurePacket() {
            return this.failurePacket;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public C27938a getMetadata() {
            return this.metadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.metadata, aVar.metadata) && AbstractC22676k.m65745e(this.failurePacket, aVar.failurePacket);
        }

        public int hashCode() {
            return this.failurePacket.hashCode() + (this.metadata.hashCode() * 31);
        }

        public String toString() {
            return "BurstState.FailedValidation(metadata=" + getMetadata() + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.c$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/c$c;", "", "Loh2/a;", "metadata", "Lxj0/q;", "successPacket", "<init>", "(Loh2/a;Lxj0/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loh2/a;", "()Loh2/a;", "b", "Lxj0/q;", "()Lxj0/q;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC10275c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C27938a metadata;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C38377q successPacket;

        public c(C27938a metadata, C38377q successPacket) {
            AbstractC22676k.m65750j(metadata, "metadata");
            AbstractC22676k.m65750j(successPacket, "successPacket");
            this.metadata = metadata;
            this.successPacket = successPacket;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public C27938a getMetadata() {
            return this.metadata;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C38377q getSuccessPacket() {
            return this.successPacket;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.metadata, cVar.metadata) && AbstractC22676k.m65745e(this.successPacket, cVar.successPacket);
        }

        public int hashCode() {
            return this.successPacket.hashCode() + (this.metadata.hashCode() * 31);
        }

        public String toString() {
            return "BurstState.Validated(metadata=" + getMetadata() + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.c$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/c$b;", "Lcom/whoop/straphistorysync/sync/c;", "Loh2/a;", "metadata", "<init>", "(Loh2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loh2/a;", "()Loh2/a;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC10275c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C27938a metadata;

        public b(C27938a metadata) {
            AbstractC22676k.m65750j(metadata, "metadata");
            this.metadata = metadata;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public C27938a getMetadata() {
            return this.metadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.metadata, ((b) other).metadata);
        }

        public int hashCode() {
            return this.metadata.hashCode();
        }

        public String toString() {
            return "BurstState.Running(metadata=" + getMetadata() + ")";
        }

        public /* synthetic */ b(C27938a c27938a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? C27938a.INSTANCE.m84311a().m84313b() : c27938a);
        }
    }
}
