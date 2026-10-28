package no.nordicsemi.android.dfu;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
class DfuProgressInfo {
    private int bytesReceived;
    private int bytesSent;
    private int currentPart;
    private int imageSizeInBytes;
    private int initialBytesSent;
    private int lastBytesSent;
    private long lastProgressTime;
    private final ProgressListener mListener;
    private int maxObjectSizeInBytes;
    private int progress;
    private long timeStart;
    private int totalParts;

    public interface ProgressListener {
        void updateProgressNotification();
    }

    public DfuProgressInfo(ProgressListener progressListener) {
        this.mListener = progressListener;
    }

    public void addBytesSent(int i13) {
        setBytesSent(this.bytesSent + i13);
    }

    public int getAvailableObjectSizeIsBytes() {
        int i13 = this.imageSizeInBytes;
        int i14 = this.bytesSent;
        int i15 = this.maxObjectSizeInBytes;
        return Math.min(i13 - i14, i15 - (i14 % i15));
    }

    public float getAverageSpeed() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j7 = this.timeStart;
        if (jElapsedRealtime - j7 != 0) {
            return (this.bytesSent - this.initialBytesSent) / (jElapsedRealtime - j7);
        }
        return 0.0f;
    }

    public int getBytesReceived() {
        return this.bytesReceived;
    }

    public int getBytesSent() {
        return this.bytesSent;
    }

    public int getCurrentPart() {
        return this.currentPart;
    }

    public int getImageSizeInBytes() {
        return this.imageSizeInBytes;
    }

    public int getProgress() {
        return this.progress;
    }

    public float getSpeed() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        float f13 = jElapsedRealtime - this.timeStart != 0 ? (this.bytesSent - this.lastBytesSent) / (jElapsedRealtime - this.lastProgressTime) : 0.0f;
        this.lastProgressTime = jElapsedRealtime;
        this.lastBytesSent = this.bytesSent;
        return f13;
    }

    public int getTotalParts() {
        return this.totalParts;
    }

    public void init(int i13, int i14, int i15) {
        this.imageSizeInBytes = i13;
        this.maxObjectSizeInBytes = Integer.MAX_VALUE;
        this.currentPart = i14;
        this.totalParts = i15;
    }

    public boolean isComplete() {
        return this.bytesSent == this.imageSizeInBytes;
    }

    public boolean isLastPart() {
        return this.currentPart == this.totalParts;
    }

    public boolean isObjectComplete() {
        return this.bytesSent % this.maxObjectSizeInBytes == 0;
    }

    public void setBytesReceived(int i13) {
        this.bytesReceived = i13;
    }

    public void setBytesSent(int i13) {
        if (this.timeStart == 0) {
            this.timeStart = SystemClock.elapsedRealtime();
            this.initialBytesSent = i13;
        }
        this.bytesSent = i13;
        this.progress = (int) ((i13 * 100.0f) / this.imageSizeInBytes);
        this.mListener.updateProgressNotification();
    }

    public void setMaxObjectSizeInBytes(int i13) {
        this.maxObjectSizeInBytes = i13;
    }

    public void setProgress(int i13) {
        this.progress = i13;
        this.mListener.updateProgressNotification();
    }

    public DfuProgressInfo setTotalPart(int i13) {
        this.totalParts = i13;
        return this;
    }
}
