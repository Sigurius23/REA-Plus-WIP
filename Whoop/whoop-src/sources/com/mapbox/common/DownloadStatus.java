package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class DownloadStatus implements Serializable {
    private long downloadId;
    private DownloadOptions downloadOptions;
    private TransferError error;
    private Expected<HttpRequestError, HttpResponseData> httpResult;
    private long receivedBytes;
    private TransferState state;
    private Long totalBytes;
    private long transferredBytes;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public DownloadStatus(long j7, TransferState transferState, TransferError transferError, Long l7, long j13, long j14, DownloadOptions downloadOptions, Expected<HttpRequestError, HttpResponseData> expected) {
        this.downloadId = j7;
        this.state = transferState;
        this.error = transferError;
        this.totalBytes = l7;
        this.receivedBytes = j13;
        this.transferredBytes = j14;
        this.downloadOptions = downloadOptions;
        this.httpResult = expected;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadStatus downloadStatus = (DownloadStatus) obj;
        return this.downloadId == downloadStatus.downloadId && Objects.equals(this.state, downloadStatus.state) && Objects.equals(this.error, downloadStatus.error) && Objects.equals(this.totalBytes, downloadStatus.totalBytes) && this.receivedBytes == downloadStatus.receivedBytes && this.transferredBytes == downloadStatus.transferredBytes && Objects.equals(this.downloadOptions, downloadStatus.downloadOptions) && Objects.equals(this.httpResult, downloadStatus.httpResult);
    }

    public long getDownloadId() {
        return this.downloadId;
    }

    public DownloadOptions getDownloadOptions() {
        return this.downloadOptions;
    }

    public TransferError getError() {
        return this.error;
    }

    public Expected<HttpRequestError, HttpResponseData> getHttpResult() {
        return this.httpResult;
    }

    public long getReceivedBytes() {
        return this.receivedBytes;
    }

    public TransferState getState() {
        return this.state;
    }

    public Long getTotalBytes() {
        return this.totalBytes;
    }

    public long getTransferredBytes() {
        return this.transferredBytes;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.downloadId), this.state, this.error, this.totalBytes, Long.valueOf(this.receivedBytes), Long.valueOf(this.transferredBytes), this.downloadOptions, this.httpResult);
    }

    public void setDownloadId(long j7) {
        this.downloadId = j7;
    }

    public void setDownloadOptions(DownloadOptions downloadOptions) {
        this.downloadOptions = downloadOptions;
    }

    public void setError(TransferError transferError) {
        this.error = transferError;
    }

    public void setHttpResult(Expected<HttpRequestError, HttpResponseData> expected) {
        this.httpResult = expected;
    }

    public void setReceivedBytes(long j7) {
        this.receivedBytes = j7;
    }

    public void setState(TransferState transferState) {
        this.state = transferState;
    }

    public void setTotalBytes(Long l7) {
        this.totalBytes = l7;
    }

    public void setTransferredBytes(long j7) {
        this.transferredBytes = j7;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[downloadId: ");
        AbstractC3855a.m11836t(this.downloadId, ", state: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.state));
        sb4.append(", error: ");
        sb4.append(RecordUtils.fieldToString(this.error));
        sb4.append(", totalBytes: ");
        sb4.append(RecordUtils.fieldToString(this.totalBytes));
        sb4.append(", receivedBytes: ");
        AbstractC3855a.m11836t(this.receivedBytes, ", transferredBytes: ", sb4);
        AbstractC3855a.m11836t(this.transferredBytes, ", downloadOptions: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.downloadOptions));
        sb4.append(", httpResult: ");
        sb4.append(RecordUtils.fieldToString(this.httpResult));
        sb4.append("]");
        return sb4.toString();
    }

    public DownloadStatus(TransferError transferError, Long l7, DownloadOptions downloadOptions, Expected<HttpRequestError, HttpResponseData> expected) {
        this.error = transferError;
        this.totalBytes = l7;
        this.downloadOptions = downloadOptions;
        this.httpResult = expected;
        this.downloadId = 0L;
        this.state = TransferState.PENDING;
        this.receivedBytes = 0L;
        this.transferredBytes = 0L;
    }
}
