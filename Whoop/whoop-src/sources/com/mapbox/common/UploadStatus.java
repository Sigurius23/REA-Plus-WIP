package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class UploadStatus implements Serializable {
    private TransferError error;
    private Expected<HttpRequestError, HttpResponseData> httpResult;
    private long sentBytes;
    private TransferState state;
    private Long totalBytes;
    private long totalSentBytes;
    private long uploadId;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public UploadStatus(long j7, TransferState transferState, TransferError transferError, Long l7, long j13, long j14, Expected<HttpRequestError, HttpResponseData> expected) {
        this.uploadId = j7;
        this.state = transferState;
        this.error = transferError;
        this.totalBytes = l7;
        this.sentBytes = j13;
        this.totalSentBytes = j14;
        this.httpResult = expected;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadStatus uploadStatus = (UploadStatus) obj;
        return this.uploadId == uploadStatus.uploadId && Objects.equals(this.state, uploadStatus.state) && Objects.equals(this.error, uploadStatus.error) && Objects.equals(this.totalBytes, uploadStatus.totalBytes) && this.sentBytes == uploadStatus.sentBytes && this.totalSentBytes == uploadStatus.totalSentBytes && Objects.equals(this.httpResult, uploadStatus.httpResult);
    }

    public TransferError getError() {
        return this.error;
    }

    public Expected<HttpRequestError, HttpResponseData> getHttpResult() {
        return this.httpResult;
    }

    public long getSentBytes() {
        return this.sentBytes;
    }

    public TransferState getState() {
        return this.state;
    }

    public Long getTotalBytes() {
        return this.totalBytes;
    }

    public long getTotalSentBytes() {
        return this.totalSentBytes;
    }

    public long getUploadId() {
        return this.uploadId;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.uploadId), this.state, this.error, this.totalBytes, Long.valueOf(this.sentBytes), Long.valueOf(this.totalSentBytes), this.httpResult);
    }

    public void setError(TransferError transferError) {
        this.error = transferError;
    }

    public void setHttpResult(Expected<HttpRequestError, HttpResponseData> expected) {
        this.httpResult = expected;
    }

    public void setSentBytes(long j7) {
        this.sentBytes = j7;
    }

    public void setState(TransferState transferState) {
        this.state = transferState;
    }

    public void setTotalBytes(Long l7) {
        this.totalBytes = l7;
    }

    public void setTotalSentBytes(long j7) {
        this.totalSentBytes = j7;
    }

    public void setUploadId(long j7) {
        this.uploadId = j7;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[uploadId: ");
        AbstractC3855a.m11836t(this.uploadId, ", state: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.state));
        sb4.append(", error: ");
        sb4.append(RecordUtils.fieldToString(this.error));
        sb4.append(", totalBytes: ");
        sb4.append(RecordUtils.fieldToString(this.totalBytes));
        sb4.append(", sentBytes: ");
        AbstractC3855a.m11836t(this.sentBytes, ", totalSentBytes: ", sb4);
        AbstractC3855a.m11836t(this.totalSentBytes, ", httpResult: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.httpResult));
        sb4.append("]");
        return sb4.toString();
    }

    public UploadStatus(TransferError transferError, Long l7, Expected<HttpRequestError, HttpResponseData> expected) {
        this.error = transferError;
        this.totalBytes = l7;
        this.httpResult = expected;
        this.uploadId = 0L;
        this.state = TransferState.PENDING;
        this.sentBytes = 0L;
        this.totalSentBytes = 0L;
    }
}
