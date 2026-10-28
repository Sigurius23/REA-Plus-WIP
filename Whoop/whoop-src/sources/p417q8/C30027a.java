package p417q8;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: renamed from: q8.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C30027a {

    /* JADX INFO: renamed from: a */
    public final IntentFilter f122542a;

    /* JADX INFO: renamed from: b */
    public final BroadcastReceiver f122543b;

    /* JADX INFO: renamed from: c */
    public boolean f122544c;

    /* JADX INFO: renamed from: d */
    public boolean f122545d;

    public C30027a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f122542a = intentFilter;
        this.f122543b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(128);
        sb4.append("Receiver{");
        sb4.append(this.f122543b);
        sb4.append(" filter=");
        sb4.append(this.f122542a);
        if (this.f122545d) {
            sb4.append(" DEAD");
        }
        sb4.append("}");
        return sb4.toString();
    }
}
