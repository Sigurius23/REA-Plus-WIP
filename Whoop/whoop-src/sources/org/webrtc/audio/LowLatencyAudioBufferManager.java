package org.webrtc.audio;

import android.media.AudioTrack;
import org.webrtc.Logging;

/* JADX INFO: loaded from: classes3.dex */
class LowLatencyAudioBufferManager {
    private static final String TAG = "LowLatencyAudioBufferManager";
    private int prevUnderrunCount = 0;
    private int ticksUntilNextDecrease = 10;
    private boolean keepLoweringBufferSize = true;
    private int bufferIncreaseCounter = 0;

    public void maybeAdjustBufferSize(AudioTrack audioTrack) {
        int underrunCount = audioTrack.getUnderrunCount();
        if (underrunCount > this.prevUnderrunCount) {
            if (this.bufferIncreaseCounter < 5) {
                int bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
                int playbackRate = (audioTrack.getPlaybackRate() / 100) + bufferSizeInFrames;
                Logging.m85621d(TAG, "Underrun detected! Increasing AudioTrack buffer size from " + bufferSizeInFrames + " to " + playbackRate);
                audioTrack.setBufferSizeInFrames(playbackRate);
                this.bufferIncreaseCounter = this.bufferIncreaseCounter + 1;
            }
            this.keepLoweringBufferSize = false;
            this.prevUnderrunCount = underrunCount;
            this.ticksUntilNextDecrease = 10;
            return;
        }
        if (this.keepLoweringBufferSize) {
            int i13 = this.ticksUntilNextDecrease - 1;
            this.ticksUntilNextDecrease = i13;
            if (i13 <= 0) {
                int playbackRate2 = audioTrack.getPlaybackRate() / 100;
                int bufferSizeInFrames2 = audioTrack.getBufferSizeInFrames();
                int iMax = Math.max(playbackRate2, bufferSizeInFrames2 - playbackRate2);
                if (iMax != bufferSizeInFrames2) {
                    Logging.m85621d(TAG, "Lowering AudioTrack buffer size from " + bufferSizeInFrames2 + " to " + iMax);
                    audioTrack.setBufferSizeInFrames(iMax);
                }
                this.ticksUntilNextDecrease = 10;
            }
        }
    }
}
