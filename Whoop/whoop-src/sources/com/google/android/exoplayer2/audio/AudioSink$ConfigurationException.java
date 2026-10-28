package com.google.android.exoplayer2.audio;

import p465rm.C31521c0;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioSink$ConfigurationException extends Exception {

    /* JADX INFO: renamed from: w */
    public final C31521c0 f20376w;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, C31521c0 c31521c0) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.f20376w = c31521c0;
    }

    public AudioSink$ConfigurationException(String str, C31521c0 c31521c0) {
        super(str);
        this.f20376w = c31521c0;
    }
}
