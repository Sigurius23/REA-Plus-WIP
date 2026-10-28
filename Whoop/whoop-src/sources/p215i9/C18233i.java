package p215i9;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import p097ds.EnumC12315r;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: i9.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C18233i {

    /* JADX INFO: renamed from: a */
    public final HashSet f70945a;

    /* JADX INFO: renamed from: b */
    public final C18232h f70946b;

    /* JADX INFO: renamed from: c */
    public LoudnessCodecController f70947c;

    public C18233i() {
        C18232h c18232h = C18232h.f70943w;
        this.f70945a = new HashSet();
        this.f70946b = c18232h;
    }

    /* JADX INFO: renamed from: a */
    public final void m52504a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f70947c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            AbstractC35849g.m113807i(this.f70945a.add(mediaCodec));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m52505b() {
        this.f70945a.clear();
        LoudnessCodecController loudnessCodecController = this.f70947c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m52506c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f70945a.remove(mediaCodec) || (loudnessCodecController = this.f70947c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    /* JADX INFO: renamed from: d */
    public final void m52507d(int i13) {
        LoudnessCodecController loudnessCodecController = this.f70947c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f70947c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i13, EnumC12315r.f41243w, new C18231g(this));
        this.f70947c = loudnessCodecControllerCreate;
        Iterator it = this.f70945a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
