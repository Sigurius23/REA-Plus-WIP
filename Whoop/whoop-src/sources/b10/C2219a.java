package b10;

import c93.InterfaceC4339a;
import com.mapbox.maps.MapboxMapRecorder;
import com.mapbox.maps.PlaybackFinished;
import k83.InterfaceC22297a;

/* JADX INFO: renamed from: b10.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2219a implements InterfaceC22297a, PlaybackFinished {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8841w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f8842x;

    public /* synthetic */ C2219a(InterfaceC4339a interfaceC4339a, int i13) {
        this.f8841w = i13;
        this.f8842x = interfaceC4339a;
    }

    @Override // k83.InterfaceC22297a
    public Object get() {
        switch (this.f8841w) {
            case 0:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return (String) this.f8842x.invoke();
    }

    @Override // com.mapbox.maps.PlaybackFinished
    public void run() {
        MapboxMapRecorder.replay$lambda$4(this.f8842x);
    }
}
