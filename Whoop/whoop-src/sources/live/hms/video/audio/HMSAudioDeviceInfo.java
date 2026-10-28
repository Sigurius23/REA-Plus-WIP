package live.hms.video.audio;

import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/audio/HMSAudioDeviceInfo;", "", "type", "Llive/hms/video/audio/HMSAudioManager$AudioDevice;", "name", "", "<init>", "(Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/lang/String;)V", "getType", "()Llive/hms/video/audio/HMSAudioManager$AudioDevice;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSAudioDeviceInfo {
    private final String name;
    private final HMSAudioManager.AudioDevice type;

    public HMSAudioDeviceInfo(HMSAudioManager.AudioDevice type, String name) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(name, "name");
        this.type = type;
        this.name = name;
    }

    public static /* synthetic */ HMSAudioDeviceInfo copy$default(HMSAudioDeviceInfo hMSAudioDeviceInfo, HMSAudioManager.AudioDevice audioDevice, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            audioDevice = hMSAudioDeviceInfo.type;
        }
        if ((i13 & 2) != 0) {
            str = hMSAudioDeviceInfo.name;
        }
        return hMSAudioDeviceInfo.copy(audioDevice, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMSAudioManager.AudioDevice getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final HMSAudioDeviceInfo copy(HMSAudioManager.AudioDevice type, String name) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(name, "name");
        return new HMSAudioDeviceInfo(type, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSAudioDeviceInfo)) {
            return false;
        }
        HMSAudioDeviceInfo hMSAudioDeviceInfo = (HMSAudioDeviceInfo) other;
        return this.type == hMSAudioDeviceInfo.type && AbstractC22676k.m65745e(this.name, hMSAudioDeviceInfo.name);
    }

    public final String getName() {
        return this.name;
    }

    public final HMSAudioManager.AudioDevice getType() {
        return this.type;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSAudioDeviceInfo(type=");
        sb4.append(this.type);
        sb4.append(", name=");
        return AbstractC25012a.m73377j(sb4, this.name, ')');
    }
}
