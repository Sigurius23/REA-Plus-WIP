package p361o9;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import p085d9.ExecutorC11804u;
import p516u8.C34586d;
import p516u8.C34610p;
import p547v8.AbstractC35785b;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: o9.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C27672l {

    /* JADX INFO: renamed from: a */
    public final Spatializer f111387a;

    /* JADX INFO: renamed from: b */
    public final boolean f111388b;

    /* JADX INFO: renamed from: c */
    public final Handler f111389c;

    /* JADX INFO: renamed from: d */
    public final C27671k f111390d;

    public C27672l(Context context, C27677q c27677q) {
        AudioManager audioManagerM113423r = context == null ? null : AbstractC35785b.m113423r(context);
        if (audioManagerM113423r != null) {
            context.getClass();
            if (!AbstractC38065t.m121895I(context)) {
                Spatializer spatializer = audioManagerM113423r.getSpatializer();
                this.f111387a = spatializer;
                this.f111388b = spatializer.getImmersiveAudioLevel() != 0;
                C27671k c27671k = new C27671k(c27677q);
                this.f111390d = c27671k;
                Looper looperMyLooper = Looper.myLooper();
                AbstractC35849g.m113808j(looperMyLooper);
                Handler handler = new Handler(looperMyLooper);
                this.f111389c = handler;
                spatializer.addOnSpatializerStateChangedListener(new ExecutorC11804u(handler), c27671k);
                return;
            }
        }
        this.f111387a = null;
        this.f111388b = false;
        this.f111389c = null;
        this.f111390d = null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m83664a(C34586d c34586d, C34610p c34610p) {
        String str = c34610p.f145783n;
        String str2 = c34610p.f145783n;
        int i13 = c34610p.f145759D;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i13 == 16) {
                i13 = 12;
            }
        } else if (Objects.equals(str2, "audio/iamf")) {
            if (i13 == -1) {
                i13 = 6;
            }
        } else if (Objects.equals(str2, "audio/ac4") && (i13 == 18 || i13 == 21)) {
            i13 = 24;
        }
        int iM121924q = AbstractC38065t.m121924q(i13);
        if (iM121924q == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM121924q);
        int i14 = c34610p.f145760E;
        if (i14 != -1) {
            channelMask.setSampleRate(i14);
        }
        Spatializer spatializer = this.f111387a;
        spatializer.getClass();
        return spatializer.canBeSpatialized((AudioAttributes) c34586d.m109367a().f143660x, channelMask.build());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m83665b() {
        Spatializer spatializer = this.f111387a;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m83666c() {
        Spatializer spatializer = this.f111387a;
        spatializer.getClass();
        return spatializer.isEnabled();
    }

    /* JADX INFO: renamed from: d */
    public final void m83667d() {
        C27671k c27671k;
        Handler handler;
        Spatializer spatializer = this.f111387a;
        if (spatializer == null || (c27671k = this.f111390d) == null || (handler = this.f111389c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(c27671k);
        handler.removeCallbacksAndMessages(null);
    }
}
