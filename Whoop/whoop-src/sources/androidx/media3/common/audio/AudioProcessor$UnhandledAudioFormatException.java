package androidx.media3.common.audio;

import p547v8.C35787d;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public AudioProcessor$UnhandledAudioFormatException(C35787d c35787d) {
        this("Unhandled input format:", c35787d);
    }

    public AudioProcessor$UnhandledAudioFormatException(String str, C35787d c35787d) {
        super(str + " " + c35787d);
    }
}
