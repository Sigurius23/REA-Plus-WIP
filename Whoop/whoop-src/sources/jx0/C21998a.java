package jx0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jx0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b!\u0010\u0012¨\u0006\""}, m65681d2 = {"Ljx0/a;", "", "", "workerId", "triggerSource", "", "triggerTimestamp", "resultTimestamp", "", "totalPackUpload", "uploadRetryCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJII)V", "a", "(Ljava/lang/String;Ljava/lang/String;JJII)Ljx0/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "e", "c", "J", "f", "()J", "d", "I", "g", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21998a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String workerId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String triggerSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long triggerTimestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long resultTimestamp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int totalPackUpload;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int uploadRetryCount;

    public C21998a(String workerId, String triggerSource, long j7, long j13, int i13, int i14) {
        AbstractC22676k.m65750j(workerId, "workerId");
        AbstractC22676k.m65750j(triggerSource, "triggerSource");
        this.workerId = workerId;
        this.triggerSource = triggerSource;
        this.triggerTimestamp = j7;
        this.resultTimestamp = j13;
        this.totalPackUpload = i13;
        this.uploadRetryCount = i14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C21998a m62852b(C21998a c21998a, String str, String str2, long j7, long j13, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = c21998a.workerId;
        }
        if ((i15 & 2) != 0) {
            str2 = c21998a.triggerSource;
        }
        if ((i15 & 4) != 0) {
            j7 = c21998a.triggerTimestamp;
        }
        if ((i15 & 8) != 0) {
            j13 = c21998a.resultTimestamp;
        }
        if ((i15 & 16) != 0) {
            i13 = c21998a.totalPackUpload;
        }
        if ((i15 & 32) != 0) {
            i14 = c21998a.uploadRetryCount;
        }
        long j14 = j13;
        long j15 = j7;
        return c21998a.m62853a(str, str2, j15, j14, i13, i14);
    }

    /* JADX INFO: renamed from: a */
    public final C21998a m62853a(String workerId, String triggerSource, long triggerTimestamp, long resultTimestamp, int totalPackUpload, int uploadRetryCount) {
        AbstractC22676k.m65750j(workerId, "workerId");
        AbstractC22676k.m65750j(triggerSource, "triggerSource");
        return new C21998a(workerId, triggerSource, triggerTimestamp, resultTimestamp, totalPackUpload, uploadRetryCount);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getResultTimestamp() {
        return this.resultTimestamp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTotalPackUpload() {
        return this.totalPackUpload;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTriggerSource() {
        return this.triggerSource;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21998a)) {
            return false;
        }
        C21998a c21998a = (C21998a) other;
        return AbstractC22676k.m65745e(this.workerId, c21998a.workerId) && AbstractC22676k.m65745e(this.triggerSource, c21998a.triggerSource) && this.triggerTimestamp == c21998a.triggerTimestamp && this.resultTimestamp == c21998a.resultTimestamp && this.totalPackUpload == c21998a.totalPackUpload && this.uploadRetryCount == c21998a.uploadRetryCount;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTriggerTimestamp() {
        return this.triggerTimestamp;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getUploadRetryCount() {
        return this.uploadRetryCount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getWorkerId() {
        return this.workerId;
    }

    public int hashCode() {
        return Integer.hashCode(this.uploadRetryCount) + AbstractC11266d.m30448b(this.totalPackUpload, AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30450d(this.workerId.hashCode() * 31, 31, this.triggerSource), this.triggerTimestamp, 31), this.resultTimestamp, 31), 31);
    }

    public String toString() {
        String str = this.workerId;
        String str2 = this.triggerSource;
        long j7 = this.triggerTimestamp;
        long j13 = this.resultTimestamp;
        int i13 = this.totalPackUpload;
        int i14 = this.uploadRetryCount;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DataSyncWork(workerId=", str, ", triggerSource=", str2, ", triggerTimestamp=");
        sbM32001t.append(j7);
        AbstractC2875y.m8285A(sbM32001t, ", resultTimestamp=", j13, ", totalPackUpload=");
        return AbstractC26725a.m79505i(sbM32001t, i13, ", uploadRetryCount=", i14, ")");
    }
}
