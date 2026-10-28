package androidx.profileinstaller;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanResult;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable;
import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import md3.InterfaceC25457c;
import no.nordicsemi.android.ble.AbstractC26903k0;
import p161g.C14907j;
import p236j.C21067f;
import p236j.InterfaceC21063b;
import p267k.C22080a;
import p309lo.C24552j;
import p309lo.InterfaceC24550h;
import p607x8.C38053h;
import p607x8.InterfaceC38051f;
import p715kotlin.jvm.internal.AbstractC22676k;
import td3.AbstractC33722b;
import td3.C33723c;
import td3.C33726f;

/* JADX INFO: renamed from: androidx.profileinstaller.a */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC1650a implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6516w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f6517x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f6518y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f6519z;

    public /* synthetic */ RunnableC1650a(Object obj, int i13, Object obj2, int i14) {
        this.f6516w = i14;
        this.f6518y = obj;
        this.f6517x = i13;
        this.f6519z = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f6516w;
        Object obj = this.f6519z;
        int i14 = this.f6517x;
        Object obj2 = this.f6518y;
        switch (i13) {
            case 0:
                ((DeviceProfileWriter) obj2).lambda$result$0(i14, obj);
                break;
            case 1:
                C14907j c14907j = (C14907j) obj2;
                Object obj3 = ((C22080a) obj).f85638a;
                String str = (String) c14907j.f79930a.get(Integer.valueOf(i14));
                if (str != null) {
                    C21067f c21067f = (C21067f) c14907j.f79934e.get(str);
                    if ((c21067f != null ? c21067f.f79921a : null) == null) {
                        c14907j.f79936g.remove(str);
                        c14907j.f79935f.put(str, obj3);
                    } else {
                        InterfaceC21063b interfaceC21063b = c21067f.f79921a;
                        AbstractC22676k.m65748h(interfaceC21063b, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (c14907j.f79933d.remove(str)) {
                            interfaceC21063b.mo364a(obj3);
                        }
                    }
                    break;
                }
                break;
            case 2:
                ((C14907j) obj2).m58912a(i14, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 3:
                InterfaceC24550h interfaceC24550h = (InterfaceC24550h) obj;
                for (C24552j c24552j : (CopyOnWriteArraySet) obj2) {
                    if (!c24552j.f95823d) {
                        if (i14 != -1) {
                            c24552j.f95821b.m71592a(i14);
                        }
                        c24552j.f95822c = true;
                        interfaceC24550h.invoke(c24552j.f95820a);
                    }
                }
                break;
            case 4:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                InterfaceC25457c interfaceC25457c = ((AbstractC26903k0) obj2).f107389h;
                if (interfaceC25457c != null) {
                    try {
                        interfaceC25457c.mo9034c(bluetoothDevice, i14);
                    } catch (Throwable th3) {
                        Log.e("k0", "Exception in Fail callback", th3);
                        return;
                    }
                }
                break;
            case 5:
                ((C33723c) obj2).f141053b.m106603a(i14, ((C33726f) AbstractC33722b.m106606a()).m106610e((ScanResult) obj));
                break;
            default:
                InterfaceC38051f interfaceC38051f = (InterfaceC38051f) obj;
                for (C38053h c38053h : (CopyOnWriteArraySet) obj2) {
                    if (!c38053h.f162994d) {
                        if (i14 != -1) {
                            c38053h.f162992b.m71592a(i14);
                        }
                        c38053h.f162993c = true;
                        interfaceC38051f.mo134038invoke(c38053h.f162991a);
                    }
                }
                break;
        }
    }

    public /* synthetic */ RunnableC1650a(Object obj, Parcelable parcelable, int i13, int i14) {
        this.f6516w = i14;
        this.f6518y = obj;
        this.f6519z = parcelable;
        this.f6517x = i13;
    }
}
