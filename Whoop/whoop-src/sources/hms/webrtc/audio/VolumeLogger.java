package hms.webrtc.audio;

import android.media.AudioManager;
import hc3.AbstractC17176i;
import hms.webrtc.Logging;
import java.util.Timer;
import java.util.TimerTask;
import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes11.dex */
class VolumeLogger {
    private static final String TAG = "VolumeLogger";
    private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    private static final int TIMER_PERIOD_IN_SECONDS = 30;
    private final AudioManager audioManager;
    private Timer timer;

    public class LogVolumeTask extends TimerTask {
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;

        public LogVolumeTask(int i13, int i14) {
            this.maxRingVolume = i13;
            this.maxVoiceCallVolume = i14;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int mode = VolumeLogger.this.audioManager.getMode();
            if (mode == 1) {
                Logging.m49570d(VolumeLogger.TAG, AbstractC25012a.m73372e(VolumeLogger.this.audioManager.getStreamVolume(2), this.maxRingVolume, "STREAM_RING stream volume: ", " (max=", ")"));
            } else if (mode == 3) {
                Logging.m49570d(VolumeLogger.TAG, AbstractC25012a.m73372e(VolumeLogger.this.audioManager.getStreamVolume(0), this.maxVoiceCallVolume, "VOICE_CALL stream volume: ", " (max=", ")"));
            }
        }
    }

    public VolumeLogger(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public void start() {
        AbstractC17176i.m48510l("start", WebRtcAudioUtils.getThreadInfo(), TAG);
        if (this.timer != null) {
            return;
        }
        Logging.m49570d(TAG, "audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        Timer timer = new Timer(THREAD_NAME);
        this.timer = timer;
        timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
    }

    public void stop() {
        AbstractC17176i.m48510l("stop", WebRtcAudioUtils.getThreadInfo(), TAG);
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }
}
