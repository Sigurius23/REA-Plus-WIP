package p364oc;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import p101dx.C12420a;
import p114eb.AbstractC12979o0;
import p218ic.C18389w;
import sc.C32352b;

/* JADX INFO: renamed from: oc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C27807a extends AbstractC12979o0 {

    /* JADX INFO: renamed from: f */
    public final C12420a f112050f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f112051g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27807a(Context context, C32352b c32352b, int i13) {
        super(context, c32352b);
        this.f112051g = i13;
        this.f112050f = new C12420a(this, 1);
    }

    @Override // p114eb.AbstractC12979o0
    /* JADX INFO: renamed from: c */
    public final Object mo36475c() {
        switch (this.f112051g) {
            case 0:
                Intent intentRegisterReceiver = ((Context) this.f44828b).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    C18389w.m52886d().m52889b(AbstractC27808b.f112052a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case 1:
                Intent intentRegisterReceiver2 = ((Context) this.f44828b).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    C18389w.m52886d().m52889b(AbstractC27809c.f112053a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                boolean z4 = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            default:
                Intent intentRegisterReceiver3 = ((Context) this.f44828b).registerReceiver(null, m83887g());
                boolean z13 = true;
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z13 = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z13 = false;
                    }
                }
                return Boolean.valueOf(z13);
        }
    }

    @Override // p114eb.AbstractC12979o0
    /* JADX INFO: renamed from: e */
    public final void mo36477e() {
        C18389w.m52886d().m52888a(AbstractC27810d.f112054a, getClass().getSimpleName().concat(": registering receiver"));
        ((Context) this.f44828b).registerReceiver(this.f112050f, m83887g());
    }

    @Override // p114eb.AbstractC12979o0
    /* JADX INFO: renamed from: f */
    public final void mo36478f() {
        C18389w.m52886d().m52888a(AbstractC27810d.f112054a, getClass().getSimpleName().concat(": unregistering receiver"));
        ((Context) this.f44828b).unregisterReceiver(this.f112050f);
    }

    /* JADX INFO: renamed from: g */
    public final IntentFilter m83887g() {
        switch (this.f112051g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
