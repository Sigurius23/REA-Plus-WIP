package dt0;

import com.whoop.connectivityCore.dataSyncService.models.DeviceTriggerSource;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dt0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006$"}, m65681d2 = {"Ldt0/c;", "", "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;", "triggerSource", "", "triggerTimestamp", "resultTimestamp", "totalPacketUploadCount", "", "uploadRetryCount", "highWaterMark", "<init>", "(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;JJJIJ)V", "a", "(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;JJJIJ)Ldt0/c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;", "e", "()Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;", "b", "J", "f", "()J", "c", "getResultTimestamp", "d", "I", "getUploadRetryCount", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12360c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final DeviceTriggerSource triggerSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long triggerTimestamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long resultTimestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long totalPacketUploadCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int uploadRetryCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long highWaterMark;

    public C12360c(DeviceTriggerSource triggerSource, long j7, long j13, long j14, int i13, long j15) {
        AbstractC22676k.m65750j(triggerSource, "triggerSource");
        this.triggerSource = triggerSource;
        this.triggerTimestamp = j7;
        this.resultTimestamp = j13;
        this.totalPacketUploadCount = j14;
        this.uploadRetryCount = i13;
        this.highWaterMark = j15;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12360c m34617b(C12360c c12360c, DeviceTriggerSource deviceTriggerSource, long j7, long j13, long j14, int i13, long j15, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            deviceTriggerSource = c12360c.triggerSource;
        }
        if ((i14 & 2) != 0) {
            j7 = c12360c.triggerTimestamp;
        }
        if ((i14 & 4) != 0) {
            j13 = c12360c.resultTimestamp;
        }
        if ((i14 & 8) != 0) {
            j14 = c12360c.totalPacketUploadCount;
        }
        if ((i14 & 16) != 0) {
            i13 = c12360c.uploadRetryCount;
        }
        if ((i14 & 32) != 0) {
            j15 = c12360c.highWaterMark;
        }
        int i15 = i13;
        long j16 = j14;
        long j17 = j13;
        return c12360c.m34618a(deviceTriggerSource, j7, j17, j16, i15, j15);
    }

    /* JADX INFO: renamed from: a */
    public final C12360c m34618a(DeviceTriggerSource triggerSource, long triggerTimestamp, long resultTimestamp, long totalPacketUploadCount, int uploadRetryCount, long highWaterMark) {
        AbstractC22676k.m65750j(triggerSource, "triggerSource");
        return new C12360c(triggerSource, triggerTimestamp, resultTimestamp, totalPacketUploadCount, uploadRetryCount, highWaterMark);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getHighWaterMark() {
        return this.highWaterMark;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getTotalPacketUploadCount() {
        return this.totalPacketUploadCount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DeviceTriggerSource getTriggerSource() {
        return this.triggerSource;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12360c)) {
            return false;
        }
        C12360c c12360c = (C12360c) other;
        return this.triggerSource == c12360c.triggerSource && this.triggerTimestamp == c12360c.triggerTimestamp && this.resultTimestamp == c12360c.resultTimestamp && this.totalPacketUploadCount == c12360c.totalPacketUploadCount && this.uploadRetryCount == c12360c.uploadRetryCount && this.highWaterMark == c12360c.highWaterMark;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTriggerTimestamp() {
        return this.triggerTimestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.highWaterMark) + AbstractC11266d.m30448b(this.uploadRetryCount, AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(this.triggerSource.hashCode() * 31, this.triggerTimestamp, 31), this.resultTimestamp, 31), this.totalPacketUploadCount, 31), 31);
    }

    public String toString() {
        DeviceTriggerSource deviceTriggerSource = this.triggerSource;
        long j7 = this.triggerTimestamp;
        long j13 = this.resultTimestamp;
        long j14 = this.totalPacketUploadCount;
        int i13 = this.uploadRetryCount;
        long j15 = this.highWaterMark;
        StringBuilder sb4 = new StringBuilder("DataSyncEventMetaData(triggerSource=");
        sb4.append(deviceTriggerSource);
        sb4.append(", triggerTimestamp=");
        sb4.append(j7);
        AbstractC2875y.m8285A(sb4, ", resultTimestamp=", j13, ", totalPacketUploadCount=");
        sb4.append(j14);
        sb4.append(", uploadRetryCount=");
        sb4.append(i13);
        sb4.append(", highWaterMark=");
        sb4.append(j15);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C12360c(DeviceTriggerSource deviceTriggerSource, long j7, long j13, long j14, int i13, long j15, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? DeviceTriggerSource.NONE : deviceTriggerSource, (i14 & 2) != 0 ? -1L : j7, (i14 & 4) != 0 ? -1L : j13, (i14 & 8) != 0 ? -1L : j14, (i14 & 16) != 0 ? 0 : i13, (i14 & 32) != 0 ? -1L : j15);
    }
}
