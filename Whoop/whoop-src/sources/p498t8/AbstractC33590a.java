package p498t8;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.support.v4.media.session.C1072f;
import android.support.v4.media.session.C1082p;
import android.view.KeyEvent;
import ro.C31624i;

/* JADX INFO: renamed from: t8.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC33590a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f140176a = 0;

    /* JADX INFO: renamed from: a */
    public static void m106088a(C1082p c1082p, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            C31624i c31624i = c1082p.f4207b;
            if (keyEvent != null) {
                ((C1072f) c31624i.f130665x).f4187a.dispatchMediaButtonEvent(keyEvent);
            } else {
                c31624i.getClass();
                throw new IllegalArgumentException("KeyEvent may not be null");
            }
        }
    }
}
