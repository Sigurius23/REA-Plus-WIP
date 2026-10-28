package p215i9;

import android.media.MediaCodecInfo;
import java.util.List;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: i9.h */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18232h implements InterfaceC18242r {

    /* JADX INFO: renamed from: w */
    public static final C18232h f70943w = new C18232h();

    /* JADX INFO: renamed from: x */
    public static final C18232h f70944x = new C18232h();

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m52501c(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    @Override // p215i9.InterfaceC18242r
    /* JADX INFO: renamed from: a */
    public int mo52502a(Object obj) {
        String str = ((C18237m) obj).f70948a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (AbstractC38065t.f163031a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX INFO: renamed from: b */
    public List m52503b(String str, boolean z4, boolean z13) {
        return AbstractC18243s.m52551e(str, z4, z13);
    }
}
