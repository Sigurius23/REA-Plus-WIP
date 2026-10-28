package kx0;

import dt0.C12360c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import ts0.EnumC34140e;

/* JADX INFO: renamed from: kx0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lkx0/e;", "", "a", "b", "Lkx0/e$a;", "Lkx0/e$b;", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC22878e {

    /* JADX INFO: renamed from: kx0.e$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lkx0/e$a;", "Lkx0/e;", "Ldt0/c;", "dataSyncEventMetaData", "Lts0/e;", "syncResultReason", "<init>", "(Ldt0/c;Lts0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldt0/c;", "()Ldt0/c;", "b", "Lts0/e;", "getSyncResultReason", "()Lts0/e;", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC22878e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C12360c dataSyncEventMetaData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC34140e syncResultReason;

        public a(C12360c dataSyncEventMetaData, EnumC34140e enumC34140e) {
            AbstractC22676k.m65750j(dataSyncEventMetaData, "dataSyncEventMetaData");
            this.dataSyncEventMetaData = dataSyncEventMetaData;
            this.syncResultReason = enumC34140e;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public C12360c getDataSyncEventMetaData() {
            return this.dataSyncEventMetaData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.dataSyncEventMetaData, aVar.dataSyncEventMetaData) && this.syncResultReason == aVar.syncResultReason;
        }

        public int hashCode() {
            int iHashCode = this.dataSyncEventMetaData.hashCode() * 31;
            EnumC34140e enumC34140e = this.syncResultReason;
            return iHashCode + (enumC34140e == null ? 0 : enumC34140e.hashCode());
        }

        public String toString() {
            return "Complete(dataSyncEventMetaData=" + this.dataSyncEventMetaData + ", syncResultReason=" + this.syncResultReason + ")";
        }

        public /* synthetic */ a(C12360c c12360c, EnumC34140e enumC34140e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c12360c, (i13 & 2) != 0 ? null : enumC34140e);
        }
    }

    /* JADX INFO: renamed from: kx0.e$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lkx0/e$b;", "Lkx0/e;", "Ldt0/c;", "dataSyncEventMetaData", "Lts0/e;", "syncResultReason", "<init>", "(Ldt0/c;Lts0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldt0/c;", "getDataSyncEventMetaData", "()Ldt0/c;", "b", "Lts0/e;", "getSyncResultReason", "()Lts0/e;", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC22878e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C12360c dataSyncEventMetaData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC34140e syncResultReason;

        public b(C12360c dataSyncEventMetaData, EnumC34140e enumC34140e) {
            AbstractC22676k.m65750j(dataSyncEventMetaData, "dataSyncEventMetaData");
            this.dataSyncEventMetaData = dataSyncEventMetaData;
            this.syncResultReason = enumC34140e;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.dataSyncEventMetaData, bVar.dataSyncEventMetaData) && this.syncResultReason == bVar.syncResultReason;
        }

        public int hashCode() {
            int iHashCode = this.dataSyncEventMetaData.hashCode() * 31;
            EnumC34140e enumC34140e = this.syncResultReason;
            return iHashCode + (enumC34140e == null ? 0 : enumC34140e.hashCode());
        }

        public String toString() {
            return "Error(dataSyncEventMetaData=" + this.dataSyncEventMetaData + ", syncResultReason=" + this.syncResultReason + ")";
        }

        public /* synthetic */ b(C12360c c12360c, EnumC34140e enumC34140e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c12360c, (i13 & 2) != 0 ? null : enumC34140e);
        }
    }
}
