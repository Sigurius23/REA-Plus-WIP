package com.google.android.exoplayer2.audio;

import tm.C33929g;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public AudioProcessor$UnhandledAudioFormatException(C33929g c33929g) {
        String strValueOf = String.valueOf(c33929g);
        StringBuilder sb4 = new StringBuilder(strValueOf.length() + 18);
        sb4.append("Unhandled format: ");
        sb4.append(strValueOf);
        super(sb4.toString());
    }
}
