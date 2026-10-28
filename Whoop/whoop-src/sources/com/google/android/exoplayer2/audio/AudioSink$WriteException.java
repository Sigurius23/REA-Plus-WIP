package com.google.android.exoplayer2.audio;

import p465rm.C31521c0;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioSink$WriteException extends Exception {

    /* JADX INFO: renamed from: w */
    public final boolean f20379w;

    /* JADX INFO: renamed from: x */
    public final C31521c0 f20380x;

    public AudioSink$WriteException(int i13, C31521c0 c31521c0, boolean z4) {
        super(AbstractC31061c.m95634j(36, i13, "AudioTrack write failed: "));
        this.f20379w = z4;
        this.f20380x = c31521c0;
    }
}
