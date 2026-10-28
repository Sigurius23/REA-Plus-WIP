package c33;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import b50.C2735c;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.util.ArrayList;
import l83.C23454a0;
import p031b9.C2814a;
import p043c4.C3974q;
import p108e4.AbstractC12682p;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import z40.AbstractC40063j;
import z40.C40059f;
import z40.C40064k;
import z40.C40065l;

/* JADX INFO: renamed from: c33.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3937d extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16073w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3938e f16074x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3937d(C3938e c3938e, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f16073w = i13;
        this.f16074x = c3938e;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f16073w) {
            case 0:
                return new C3937d(this.f16074x, interfaceC30057d, 0);
            default:
                return new C3937d(this.f16074x, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f16073w) {
            case 0:
                C3937d c3937d = (C3937d) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c3937d.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                C3937d c3937d2 = (C3937d) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c3937d2.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, l83.h] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f16073w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C3938e c3938e = this.f16074x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C3936c c3936c = c3938e.f16075a;
                if (((C40065l) c3936c.f16072e) == null) {
                    C40065l c40065l = new C40065l((Context) c3936c.f16070c, (C3939f) AbstractC3940g.f16077a.getValue(), (ArrayList) c3936c.f16069b);
                    c3936c.f16072e = c40065l;
                    c3936c.f16068a = false;
                    c40065l.f172883d = (C3974q) c3936c.f16071d;
                    if (AbstractC40063j.f172877a[AbstractC12682p.m35485e(c40065l.f172890k)] != 1) {
                        c40065l.f172880a.getClass();
                    } else {
                        c40065l.f172890k = 1;
                        c40065l.m128410d(null);
                        C2735c c2735c = c40065l.f172888i;
                        if (c2735c != null) {
                            C40064k headsetListener = c40065l.f172891l;
                            AbstractC22676k.m65750j(headsetListener, "headsetListener");
                            c2735c.f10762z = headsetListener;
                            BluetoothAdapter bluetoothAdapter = c2735c.f10761y;
                            Context context = c2735c.f10759w;
                            bluetoothAdapter.getProfileProxy(context, c2735c, 1);
                            if (!c2735c.f10755G) {
                                context.registerReceiver(c2735c, new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"));
                                context.registerReceiver(c2735c, new IntentFilter("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED"));
                                context.registerReceiver(c2735c, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
                                c2735c.f10755G = true;
                            }
                        }
                        C2814a c2814a = c40065l.f172882c;
                        c2814a.getClass();
                        C40064k deviceListener = c40065l.f172892m;
                        AbstractC22676k.m65750j(deviceListener, "deviceListener");
                        c2814a.f11012d = deviceListener;
                        ((Context) c2814a.f11010b).registerReceiver(c2814a, new IntentFilter("android.intent.action.HEADSET_PLUG"));
                    }
                }
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C3936c c3936c2 = c3938e.f16075a;
                C40065l c40065l2 = (C40065l) c3936c2.f16072e;
                if (c40065l2 != null) {
                    int iM35485e = AbstractC12682p.m35485e(c40065l2.f172890k);
                    if (iM35485e == 0) {
                        c40065l2.m128409c();
                    } else if (iM35485e == 1) {
                        if (AbstractC12682p.m35485e(c40065l2.f172890k) == 1) {
                            c40065l2.f172890k = 1;
                            C2735c c2735c2 = c40065l2.f172888i;
                            if (c2735c2 != null) {
                                c2735c2.m7704a();
                            }
                            C40059f c40059f = c40065l2.f172881b;
                            AudioManager audioManager = c40059f.f172868c;
                            audioManager.setMode(c40059f.f172870e);
                            c40059f.f172868c.setMicrophoneMute(c40059f.f172871f);
                            c40059f.m128404a(c40059f.f172872g);
                            AudioFocusRequest audioFocusRequest = c40059f.f172873h;
                            if (audioFocusRequest != null) {
                                audioManager.abandonAudioFocusRequest(audioFocusRequest);
                            }
                        }
                        c40065l2.m128409c();
                    } else if (iM35485e == 2) {
                        c40065l2.f172880a.getClass();
                    }
                }
                c3936c2.f16072e = null;
                c3936c2.f16068a = false;
                break;
        }
        return c23454a0;
    }
}
