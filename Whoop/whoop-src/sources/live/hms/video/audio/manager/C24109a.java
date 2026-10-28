package live.hms.video.audio.manager;

import android.media.AudioDeviceInfo;
import java.util.function.Predicate;

/* JADX INFO: renamed from: live.hms.video.audio.manager.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C24109a implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95195a;

    public /* synthetic */ C24109a(int i13) {
        this.f95195a = i13;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        switch (this.f95195a) {
            case 0:
                return AudioManagerCompat.lambda$getConnectedBluetoothDevice$2(audioDeviceInfo);
            default:
                return AudioManagerCompat.lambda$isBluetoothHeadsetAvailable$1(audioDeviceInfo);
        }
    }
}
