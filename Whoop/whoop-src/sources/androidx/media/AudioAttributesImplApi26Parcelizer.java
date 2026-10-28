package androidx.media;

import android.media.AudioAttributes;
import p088dc.AbstractC11896c;

/* JADX INFO: loaded from: classes5.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC11896c abstractC11896c) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f6357a = (AudioAttributes) abstractC11896c.m32014g(audioAttributesImplApi26.f6357a, 1);
        audioAttributesImplApi26.f6358b = abstractC11896c.m32013f(audioAttributesImplApi26.f6358b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC11896c abstractC11896c) {
        abstractC11896c.getClass();
        abstractC11896c.m32018k(audioAttributesImplApi26.f6357a, 1);
        abstractC11896c.m32017j(audioAttributesImplApi26.f6358b, 2);
    }
}
