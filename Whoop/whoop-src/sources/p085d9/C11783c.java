package p085d9;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c33.C3946m;
import d30.C11535h;
import ec3.C13045h2;
import java.util.Objects;
import p031b9.AbstractC2875y;
import p516u8.C34586d;
import p607x8.AbstractC38065t;
import p715kotlin.jvm.internal.AbstractC22676k;
import ro.C31624i;
import t23.C33358a2;

/* JADX INFO: renamed from: d9.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C11783c extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38201a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f38202b;

    public /* synthetic */ C11783c(Object obj, int i13) {
        this.f38201a = i13;
        this.f38202b = obj;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] addedDevices) {
        switch (this.f38201a) {
            case 0:
                C11535h c11535h = (C11535h) this.f38202b;
                c11535h.m30992b(C11781b.m31593c((Context) c11535h.f37185b, (C34586d) c11535h.f37193j, (C31624i) c11535h.f37192i));
                break;
            default:
                AbstractC22676k.m65750j(addedDevices, "addedDevices");
                C33358a2 c33358a2 = (C33358a2) this.f38202b;
                C2345k c2345kM105789c = c33358a2.m105789c();
                InterfaceC2339e interfaceC2339e = c2345kM105789c.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.INFO;
                String str = c2345kM105789c.f9273a;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345kM105789c.f9274b.log(enumC2341g, str, AbstractC2875y.m8296i(addedDevices.length, "[onAudioDevicesAdded] ", " devices added"), null);
                }
                c33358a2.m105792f();
                break;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] removedDevices) {
        int i13 = this.f38201a;
        int i14 = 0;
        Object obj = this.f38202b;
        switch (i13) {
            case 0:
                C11535h c11535h = (C11535h) obj;
                C31624i c31624i = (C31624i) c11535h.f37192i;
                int i15 = AbstractC38065t.f163031a;
                int length = removedDevices.length;
                while (i14 < length) {
                    if (Objects.equals(removedDevices[i14], c31624i)) {
                        c11535h.f37192i = null;
                        c11535h.m30992b(C11781b.m31593c((Context) c11535h.f37185b, (C34586d) c11535h.f37193j, (C31624i) c11535h.f37192i));
                    } else {
                        i14++;
                    }
                    break;
                }
                c11535h.m30992b(C11781b.m31593c((Context) c11535h.f37185b, (C34586d) c11535h.f37193j, (C31624i) c11535h.f37192i));
                break;
            default:
                AbstractC22676k.m65750j(removedDevices, "removedDevices");
                C33358a2 c33358a2 = (C33358a2) obj;
                C13045h2 c13045h2 = c33358a2.f139198i;
                C2345k c2345kM105789c = c33358a2.m105789c();
                InterfaceC2339e interfaceC2339e = c2345kM105789c.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.INFO;
                String str = c2345kM105789c.f9273a;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345kM105789c.f9274b.log(enumC2341g, str, AbstractC2875y.m8296i(removedDevices.length, "[onAudioDevicesRemoved] ", " devices removed"), null);
                }
                c33358a2.m105792f();
                C3946m c3946m = (C3946m) c13045h2.getValue();
                Integer numValueOf = c3946m != null ? Integer.valueOf(c3946m.f16087a.getId()) : null;
                if (numValueOf != null) {
                    int length2 = removedDevices.length;
                    while (i14 < length2) {
                        if (removedDevices[i14].getId() == numValueOf.intValue()) {
                            C2345k c2345kM105789c2 = c33358a2.m105789c();
                            InterfaceC2339e interfaceC2339e2 = c2345kM105789c2.f9275c;
                            String str2 = c2345kM105789c2.f9273a;
                            EnumC2341g enumC2341g2 = EnumC2341g.INFO;
                            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                                c2345kM105789c2.f9274b.log(enumC2341g2, str2, "[onAudioDevicesRemoved] Selected USB device was removed, clearing selection", null);
                            }
                            C2345k c2345kM105789c3 = c33358a2.m105789c();
                            InterfaceC2339e interfaceC2339e3 = c2345kM105789c3.f9275c;
                            String str3 = c2345kM105789c3.f9273a;
                            if (interfaceC2339e3.isLoggable(enumC2341g2, str3)) {
                                c2345kM105789c3.f9274b.log(enumC2341g2, str3, "[clearUsbDeviceSelection] Clearing USB device selection", null);
                            }
                            c13045h2.m36570j(null);
                        } else {
                            i14++;
                        }
                    }
                }
                break;
        }
    }
}
