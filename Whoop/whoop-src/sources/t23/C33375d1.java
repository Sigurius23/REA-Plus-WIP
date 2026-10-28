package t23;

import java.util.Comparator;
import org.webrtc.CameraEnumerationAndroid;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: t23.d1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33375d1 implements Comparator {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139330w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f139331x;

    public C33375d1(int i13, int i14) {
        this.f139330w = i13;
        this.f139331x = i14;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        CameraEnumerationAndroid.CaptureFormat captureFormat = (CameraEnumerationAndroid.CaptureFormat) obj;
        int i13 = captureFormat.height;
        int i14 = this.f139330w;
        int iAbs = Math.abs(i13 - i14);
        int i15 = captureFormat.width;
        int i16 = this.f139331x;
        CameraEnumerationAndroid.CaptureFormat captureFormat2 = (CameraEnumerationAndroid.CaptureFormat) obj2;
        return AbstractC30060g.m92127q(Integer.valueOf(Math.abs(i15 - i16) + iAbs), Integer.valueOf(Math.abs(captureFormat2.width - i16) + Math.abs(captureFormat2.height - i14)));
    }
}
