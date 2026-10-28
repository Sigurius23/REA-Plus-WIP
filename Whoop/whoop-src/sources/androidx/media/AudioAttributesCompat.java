package androidx.media;

import android.util.SparseIntArray;
import p088dc.InterfaceC11898e;

/* JADX INFO: loaded from: classes5.dex */
public class AudioAttributesCompat implements InterfaceC11898e {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f6355b = 0;

    /* JADX INFO: renamed from: a */
    public AudioAttributesImpl f6356a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f6356a;
        if (audioAttributesImpl == null) {
            return audioAttributesCompat.f6356a == null;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f6356a);
    }

    public final int hashCode() {
        return this.f6356a.hashCode();
    }

    public final String toString() {
        return this.f6356a.toString();
    }
}
