package androidx.media;

import p088dc.AbstractC11896c;

/* JADX INFO: loaded from: classes5.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC11896c abstractC11896c) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f6359a = abstractC11896c.m32013f(audioAttributesImplBase.f6359a, 1);
        audioAttributesImplBase.f6360b = abstractC11896c.m32013f(audioAttributesImplBase.f6360b, 2);
        audioAttributesImplBase.f6361c = abstractC11896c.m32013f(audioAttributesImplBase.f6361c, 3);
        audioAttributesImplBase.f6362d = abstractC11896c.m32013f(audioAttributesImplBase.f6362d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC11896c abstractC11896c) {
        abstractC11896c.getClass();
        abstractC11896c.m32017j(audioAttributesImplBase.f6359a, 1);
        abstractC11896c.m32017j(audioAttributesImplBase.f6360b, 2);
        abstractC11896c.m32017j(audioAttributesImplBase.f6361c, 3);
        abstractC11896c.m32017j(audioAttributesImplBase.f6362d, 4);
    }
}
