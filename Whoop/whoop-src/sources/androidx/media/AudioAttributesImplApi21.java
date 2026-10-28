package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes5.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public AudioAttributes f6357a;

    /* JADX INFO: renamed from: b */
    public int f6358b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f6357a.equals(((AudioAttributesImplApi21) obj).f6357a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6357a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f6357a;
    }
}
