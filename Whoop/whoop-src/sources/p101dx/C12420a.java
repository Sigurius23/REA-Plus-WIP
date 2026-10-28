package p101dx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p218ic.C18389w;
import p364oc.AbstractC27808b;
import p364oc.AbstractC27809c;
import p364oc.AbstractC27814h;
import p364oc.C27807a;
import p715kotlin.jvm.internal.AbstractC22676k;
import xg3.AbstractC38292s;

/* JADX INFO: renamed from: dx.a */
/* JADX INFO: loaded from: classes.dex */
public final class C12420a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42240a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42241b;

    public /* synthetic */ C12420a(Object obj, int i13) {
        this.f42240a = i13;
        this.f42241b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f42240a) {
            case 0:
                ((AbstractC38292s) this.f42241b).onNext(intent);
                break;
            default:
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(intent, "intent");
                C27807a c27807a = (C27807a) this.f42241b;
                switch (c27807a.f112051g) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            C18389w.m52886d().m52888a(AbstractC27808b.f112052a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        c27807a.m36476d(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        c27807a.m36476d(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        c27807a.m36476d(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        c27807a.m36476d(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            C18389w.m52886d().m52888a(AbstractC27809c.f112053a, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int iHashCode = action2.hashCode();
                                if (iHashCode != -1980154005) {
                                    if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        c27807a.m36476d(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    c27807a.m36476d(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            C18389w.m52886d().m52888a(AbstractC27814h.f112061a, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 != -1181163412) {
                                    if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        c27807a.m36476d(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    c27807a.m36476d(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
                break;
        }
    }
}
