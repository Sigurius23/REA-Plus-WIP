package tm;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: tm.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33925c {
    /* JADX INFO: renamed from: a */
    public static void m107342a(AudioAttributes.Builder builder, int i13) {
        try {
            builder.getClass().getMethod("setSpatializationBehavior", Integer.TYPE).invoke(builder, Integer.valueOf(i13));
        } catch (Exception unused) {
        }
    }
}
