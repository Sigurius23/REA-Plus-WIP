package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: android.support.v4.media.session.f */
/* JADX INFO: loaded from: classes5.dex */
public class C1072f {

    /* JADX INFO: renamed from: a */
    public final MediaController f4187a;

    /* JADX INFO: renamed from: b */
    public final Object f4188b = new Object();

    /* JADX INFO: renamed from: c */
    public final ArrayList f4189c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashMap f4190d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final MediaSessionCompat$Token f4191e;

    public C1072f(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        InterfaceC1070d interfaceC1070d;
        this.f4191e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f4160x);
        this.f4187a = mediaController;
        synchronized (mediaSessionCompat$Token.f4159w) {
            interfaceC1070d = mediaSessionCompat$Token.f4161y;
        }
        if (interfaceC1070d == null) {
            ResultReceiverC1066x50fd9e4a resultReceiverC1066x50fd9e4a = new ResultReceiverC1066x50fd9e4a(null);
            resultReceiverC1066x50fd9e4a.f4155w = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, resultReceiverC1066x50fd9e4a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3207a() {
        InterfaceC1070d interfaceC1070d;
        ArrayList arrayList = this.f4189c;
        MediaSessionCompat$Token mediaSessionCompat$Token = this.f4191e;
        synchronized (mediaSessionCompat$Token.f4159w) {
            interfaceC1070d = mediaSessionCompat$Token.f4161y;
        }
        if (interfaceC1070d == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            this.f4190d.put(null, new BinderC1071e());
            throw null;
        }
    }
}
