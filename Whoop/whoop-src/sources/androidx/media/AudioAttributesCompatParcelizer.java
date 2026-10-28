package androidx.media;

import p088dc.AbstractC11896c;
import p088dc.InterfaceC11898e;

/* JADX INFO: loaded from: classes5.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC11896c abstractC11896c) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC11898e interfaceC11898eM32015h = audioAttributesCompat.f6356a;
        if (abstractC11896c.mo32012e(1)) {
            interfaceC11898eM32015h = abstractC11896c.m32015h();
        }
        audioAttributesCompat.f6356a = (AudioAttributesImpl) interfaceC11898eM32015h;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC11896c abstractC11896c) {
        abstractC11896c.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f6356a;
        abstractC11896c.mo32016i(1);
        abstractC11896c.m32019l(audioAttributesImpl);
    }
}
