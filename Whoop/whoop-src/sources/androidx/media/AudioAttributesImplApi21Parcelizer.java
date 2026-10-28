package androidx.media;

import android.media.AudioAttributes;
import p088dc.AbstractC11896c;

/* JADX INFO: loaded from: classes5.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC11896c abstractC11896c) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f6357a = (AudioAttributes) abstractC11896c.m32014g(audioAttributesImplApi21.f6357a, 1);
        audioAttributesImplApi21.f6358b = abstractC11896c.m32013f(audioAttributesImplApi21.f6358b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC11896c abstractC11896c) {
        abstractC11896c.getClass();
        abstractC11896c.m32018k(audioAttributesImplApi21.f6357a, 1);
        abstractC11896c.m32017j(audioAttributesImplApi21.f6358b, 2);
    }
}
