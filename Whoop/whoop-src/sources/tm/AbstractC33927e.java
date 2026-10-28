package tm;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import p550vd.AbstractC35903f;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;

/* JADX INFO: renamed from: tm.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33927e {
    /* JADX INFO: renamed from: a */
    public static int[] m107344a() {
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        for (int i13 : C33928f.f142171e) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i13).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                c41014d0M133251l.m133222a(Integer.valueOf(i13));
            }
        }
        c41014d0M133251l.m133222a(2);
        return AbstractC35903f.m113999S(c41014d0M133251l.m133239f());
    }
}
