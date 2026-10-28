package p031b9;

import android.media.AudioManager;
import live.hms.video.audio.manager.AudioManagerCompat;
import live.hms.video.audio.manager.HMSAudioManagerApi31;
import p516u8.C34586d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: b9.c */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2820c implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11041a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f11042b;

    public /* synthetic */ C2820c(Object obj, int i13) {
        this.f11041a = i13;
        this.f11042b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i13) {
        C34586d c34586d;
        switch (this.f11041a) {
            case 0:
                C2826e c2826e = (C2826e) this.f11042b;
                c2826e.getClass();
                if (i13 == -3 || i13 == -2) {
                    if (i13 != -2 && ((c34586d = c2826e.f11074d) == null || c34586d.f145643a != 1)) {
                        c2826e.m8053c(4);
                    } else {
                        c2826e.m8052b(0);
                        c2826e.m8053c(3);
                    }
                } else if (i13 == -1) {
                    c2826e.m8052b(-1);
                    c2826e.m8051a();
                    c2826e.m8053c(1);
                } else if (i13 == 1) {
                    c2826e.m8053c(2);
                    c2826e.m8052b(1);
                } else {
                    AbstractC38963t7.m124388r(i13, "Unknown focus change type: ", "AudioFocusManager");
                }
                break;
            case 1:
                ((AudioManagerCompat) this.f11042b).lambda$new$0(i13);
                break;
            default:
                HMSAudioManagerApi31.createAudioFocusChangeListener$lambda$5((HMSAudioManagerApi31) this.f11042b, i13);
                break;
        }
    }
}
