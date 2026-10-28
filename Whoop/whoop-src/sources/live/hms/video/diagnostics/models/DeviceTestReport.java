package live.hms.video.diagnostics.models;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Llive/hms/video/diagnostics/models/DeviceTestReport;", "", "<init>", "()V", "audioInputReport", "Llive/hms/video/diagnostics/models/AudioInputDeviceReport;", "getAudioInputReport", "()Llive/hms/video/diagnostics/models/AudioInputDeviceReport;", "audioOutputReport", "Llive/hms/video/diagnostics/models/AudioOutputDeviceReport;", "getAudioOutputReport", "()Llive/hms/video/diagnostics/models/AudioOutputDeviceReport;", "videoInputReport", "Llive/hms/video/diagnostics/models/VideoInputDeviceReport;", "getVideoInputReport", "()Llive/hms/video/diagnostics/models/VideoInputDeviceReport;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class DeviceTestReport {
    private final AudioInputDeviceReport audioInputReport = new AudioInputDeviceReport();
    private final AudioOutputDeviceReport audioOutputReport = new AudioOutputDeviceReport();
    private final VideoInputDeviceReport videoInputReport = new VideoInputDeviceReport();

    public final AudioInputDeviceReport getAudioInputReport() {
        return this.audioInputReport;
    }

    public final AudioOutputDeviceReport getAudioOutputReport() {
        return this.audioOutputReport;
    }

    public final VideoInputDeviceReport getVideoInputReport() {
        return this.videoInputReport;
    }
}
