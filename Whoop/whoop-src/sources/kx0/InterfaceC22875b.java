package kx0;

import dt0.C12360c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kx0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lkx0/b;", "", "Ldt0/c;", "a", "()Ldt0/c;", "dataSyncEventMetaData", "b", "Lkx0/b$a;", "Lkx0/b$b;", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC22875b {

    /* JADX INFO: renamed from: kx0.b$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkx0/b$a;", "Lkx0/b;", "Ldt0/c;", "dataSyncEventMetaData", "<init>", "(Ldt0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldt0/c;", "()Ldt0/c;", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC22875b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C12360c dataSyncEventMetaData;

        public a(C12360c dataSyncEventMetaData) {
            AbstractC22676k.m65750j(dataSyncEventMetaData, "dataSyncEventMetaData");
            this.dataSyncEventMetaData = dataSyncEventMetaData;
        }

        @Override // kx0.InterfaceC22875b
        /* JADX INFO: renamed from: a, reason: from getter */
        public C12360c getDataSyncEventMetaData() {
            return this.dataSyncEventMetaData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.dataSyncEventMetaData, ((a) other).dataSyncEventMetaData);
        }

        public int hashCode() {
            return this.dataSyncEventMetaData.hashCode();
        }

        public String toString() {
            return "BypassSync(dataSyncEventMetaData=" + this.dataSyncEventMetaData + ")";
        }
    }

    /* JADX INFO: renamed from: kx0.b$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkx0/b$b;", "Lkx0/b;", "Ldt0/c;", "dataSyncEventMetaData", "<init>", "(Ldt0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldt0/c;", "()Ldt0/c;", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC22875b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C12360c dataSyncEventMetaData;

        public b(C12360c dataSyncEventMetaData) {
            AbstractC22676k.m65750j(dataSyncEventMetaData, "dataSyncEventMetaData");
            this.dataSyncEventMetaData = dataSyncEventMetaData;
        }

        @Override // kx0.InterfaceC22875b
        /* JADX INFO: renamed from: a, reason: from getter */
        public C12360c getDataSyncEventMetaData() {
            return this.dataSyncEventMetaData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.dataSyncEventMetaData, ((b) other).dataSyncEventMetaData);
        }

        public int hashCode() {
            return this.dataSyncEventMetaData.hashCode();
        }

        public String toString() {
            return "Sync(dataSyncEventMetaData=" + this.dataSyncEventMetaData + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    C12360c getDataSyncEventMetaData();
}
