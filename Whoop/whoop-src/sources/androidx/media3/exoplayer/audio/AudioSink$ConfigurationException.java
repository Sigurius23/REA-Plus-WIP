package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import p516u8.C34610p;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSink$ConfigurationException extends Exception {

    /* JADX INFO: renamed from: w */
    public final C34610p f6378w;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, C34610p c34610p) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.f6378w = c34610p;
    }

    public AudioSink$ConfigurationException(String str, C34610p c34610p) {
        super(str);
        this.f6378w = c34610p;
    }
}
