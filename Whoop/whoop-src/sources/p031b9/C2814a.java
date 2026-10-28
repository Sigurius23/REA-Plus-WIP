package p031b9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.RunnableC1319m;
import kr.C22786e;
import p607x8.C38063r;
import p715kotlin.jvm.internal.AbstractC22676k;
import z40.C40064k;
import z40.C40065l;

/* JADX INFO: renamed from: b9.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C2814a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11009a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f11010b;

    /* JADX INFO: renamed from: c */
    public final Object f11011c;

    /* JADX INFO: renamed from: d */
    public Object f11012d;

    public C2814a(Context context, C22786e c22786e) {
        this.f11010b = context;
        this.f11011c = c22786e;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f11009a) {
            case 0:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    ((C38063r) this.f11011c).m121879c(new RunnableC1319m(this, 7));
                }
                break;
            default:
                C22786e c22786e = (C22786e) this.f11011c;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(intent, "intent");
                if (intent.getIntExtra("state", 0) != 1) {
                    String stringExtra = intent.getStringExtra("name");
                    String message = "Wired headset device " + (stringExtra != null ? stringExtra : "") + " disconnected";
                    c22786e.getClass();
                    AbstractC22676k.m65750j(message, "message");
                    C40064k c40064k = (C40064k) this.f11012d;
                    if (c40064k != null) {
                        C40065l c40065l = c40064k.f172878a;
                        c40065l.f172886g = false;
                        c40065l.m128410d(null);
                    }
                } else {
                    String stringExtra2 = intent.getStringExtra("name");
                    String message2 = "Wired headset device " + (stringExtra2 != null ? stringExtra2 : "") + " connected";
                    c22786e.getClass();
                    AbstractC22676k.m65750j(message2, "message");
                    C40064k c40064k2 = (C40064k) this.f11012d;
                    if (c40064k2 != null) {
                        C40065l c40065l2 = c40064k2.f172878a;
                        c40065l2.f172886g = true;
                        c40065l2.m128410d(null);
                    }
                }
                break;
        }
    }

    public C2814a(C2817b c2817b, C38063r c38063r, SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0) {
        this.f11012d = c2817b;
        this.f11011c = c38063r;
        this.f11010b = surfaceHolderCallbackC2821c0;
    }
}
