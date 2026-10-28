package c33;

import android.media.AudioDeviceInfo;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c33.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C3946m {

    /* JADX INFO: renamed from: b */
    public static final List f16086b = AbstractC37056f.m118959K(11, 22, 12);

    /* JADX INFO: renamed from: a */
    public final AudioDeviceInfo f16087a;

    public C3946m(AudioDeviceInfo audioDeviceInfo) {
        this.f16087a = audioDeviceInfo;
    }

    /* JADX INFO: renamed from: a */
    public final String m11993a() {
        String string;
        CharSequence productName = this.f16087a.getProductName();
        return (productName == null || (string = productName.toString()) == null) ? "USB Microphone" : string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3946m) && AbstractC22676k.m65745e(this.f16087a, ((C3946m) obj).f16087a);
    }

    public final int hashCode() {
        return this.f16087a.hashCode();
    }

    public final String toString() {
        return "UsbAudioInputDevice(deviceInfo=" + this.f16087a + ")";
    }
}
