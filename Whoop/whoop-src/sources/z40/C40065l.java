package z40;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Process;
import b50.C2734b;
import b50.C2735c;
import c33.C3939f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kr.C22786e;
import l83.C23470p;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p031b9.C2814a;
import p043c4.C3974q;
import p108e4.AbstractC12682p;
import p508ty.C34249c;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import se.AbstractC32410a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: z40.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C40065l {

    /* JADX INFO: renamed from: o */
    public static final C23470p f172879o = AbstractC30060g.m92088H(C40061h.f172876w);

    /* JADX INFO: renamed from: a */
    public final C22786e f172880a;

    /* JADX INFO: renamed from: b */
    public final C40059f f172881b;

    /* JADX INFO: renamed from: c */
    public final C2814a f172882c;

    /* JADX INFO: renamed from: d */
    public C3974q f172883d;

    /* JADX INFO: renamed from: e */
    public AbstractC40058e f172884e;

    /* JADX INFO: renamed from: f */
    public AbstractC40058e f172885f;

    /* JADX INFO: renamed from: g */
    public boolean f172886g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f172887h;

    /* JADX INFO: renamed from: i */
    public final C2735c f172888i;

    /* JADX INFO: renamed from: j */
    public final List f172889j;

    /* JADX INFO: renamed from: k */
    public int f172890k;

    /* JADX INFO: renamed from: l */
    public final C40064k f172891l;

    /* JADX INFO: renamed from: m */
    public final C40064k f172892m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f172893n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.util.ArrayList] */
    public C40065l(Context context, C3939f audioFocusChangeListener, ArrayList arrayList) {
        ?? M128405a;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(audioFocusChangeListener, "audioFocusChangeListener");
        Context applicationContext = context.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "context.applicationContext");
        C22786e c22786e = new C22786e(4);
        Object systemService = applicationContext.getSystemService("audio");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
        }
        C40059f c40059f = new C40059f(applicationContext, c22786e, (AudioManager) systemService, audioFocusChangeListener);
        C2814a c2814a = new C2814a(applicationContext, c22786e);
        int i13 = C2735c.f10752K;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        C2735c c2735c = null;
        C2735c c2735c2 = defaultAdapter != null ? new C2735c(applicationContext, c22786e, defaultAdapter, c40059f) : null;
        this.f172880a = new C22786e(4);
        ArrayList arrayList2 = new ArrayList();
        this.f172887h = arrayList2;
        this.f172890k = 3;
        this.f172891l = new C40064k(this);
        this.f172892m = new C40064k(this);
        this.f172893n = arrayList2;
        this.f172880a = c22786e;
        this.f172881b = c40059f;
        this.f172882c = c2814a;
        Map mapM101002J = AbstractC32410a.m101002J(new C34249c(arrayList, 29));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM101002J.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 1) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (arrayList.isEmpty() || arrayList.equals(C40062i.m128405a())) {
            M128405a = C40062i.m128405a();
        } else {
            M128405a = AbstractC25265s.m74097F1(C40062i.m128405a());
            M128405a.removeAll(arrayList);
            int i14 = 0;
            for (Object obj : arrayList) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                M128405a.add(i14, (Class) obj);
                i14 = i15;
            }
        }
        this.f172889j = M128405a;
        if (applicationContext.getApplicationInfo().targetSdkVersion <= 30 || Build.VERSION.SDK_INT <= 30 ? applicationContext.checkPermission("android.permission.BLUETOOTH", Process.myPid(), Process.myUid()) == 0 : applicationContext.checkPermission("android.permission.BLUETOOTH_CONNECT", Process.myPid(), Process.myUid()) == 0) {
            c2735c = c2735c2;
        }
        this.f172888i = c2735c;
        Iterable iterable = (Iterable) M128405a;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Class) it.next()).getSimpleName());
        }
        String message = "Preferred device list = " + arrayList3;
        AbstractC22676k.m65750j(message, "message");
    }

    /* JADX INFO: renamed from: a */
    public final void m128407a() {
        int iM35485e = AbstractC12682p.m35485e(this.f172890k);
        if (iM35485e != 0) {
            if (iM35485e != 1) {
                if (iM35485e == 2) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                AbstractC40058e abstractC40058e = this.f172884e;
                if (abstractC40058e != null) {
                    m128408b(abstractC40058e);
                    return;
                }
                return;
            }
        }
        this.f172890k = 2;
        C40059f c40059f = this.f172881b;
        AudioManager audioManager = c40059f.f172868c;
        AudioManager audioManager2 = c40059f.f172868c;
        c40059f.f172870e = audioManager.getMode();
        c40059f.f172871f = audioManager.isMicrophoneMute();
        c40059f.f172872g = audioManager.isSpeakerphoneOn();
        audioManager2.setMicrophoneMute(false);
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(c40059f.f172869d).build();
        AbstractC22676k.m65749i(audioFocusRequestBuild, "Builder(AudioManager.AUD…ner)\n            .build()");
        c40059f.f172873h = audioFocusRequestBuild;
        audioManager2.requestAudioFocus(audioFocusRequestBuild);
        audioManager2.setMode(3);
        AbstractC40058e abstractC40058e2 = this.f172884e;
        if (abstractC40058e2 != null) {
            m128408b(abstractC40058e2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m128408b(AbstractC40058e abstractC40058e) {
        boolean z4 = abstractC40058e instanceof C40054a;
        C2735c c2735c = this.f172888i;
        C40059f c40059f = this.f172881b;
        if (!z4) {
            if (abstractC40058e instanceof C40055b ? true : abstractC40058e instanceof C40057d) {
                c40059f.m128404a(false);
                if (c2735c != null) {
                    c2735c.m7704a();
                    return;
                }
                return;
            }
            if (abstractC40058e instanceof C40056c) {
                c40059f.m128404a(true);
                if (c2735c != null) {
                    c2735c.m7704a();
                    return;
                }
                return;
            }
            return;
        }
        c40059f.m128404a(false);
        if (c2735c != null) {
            if (AbstractC22676k.m65745e(c2735c.f10756H, C2734b.f10750e) || AbstractC22676k.m65745e(c2735c.f10756H, C2734b.f10749d)) {
                c2735c.f10757I.m7260m();
                return;
            }
            C22786e c22786e = c2735c.f10760x;
            String message = "Cannot activate when in the " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(c2735c.f10756H.getClass()).getSimpleName() + " state";
            c22786e.getClass();
            AbstractC22676k.m65750j(message, "message");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m128409c() {
        this.f172890k = 3;
        C2735c c2735c = this.f172888i;
        if (c2735c != null) {
            c2735c.f10762z = null;
            c2735c.f10761y.closeProfileProxy(1, c2735c.f10754F);
            if (c2735c.f10755G) {
                c2735c.f10759w.unregisterReceiver(c2735c);
                c2735c.f10755G = false;
            }
        }
        C2814a c2814a = this.f172882c;
        c2814a.f11012d = null;
        ((Context) c2814a.f11010b).unregisterReceiver(c2814a);
        this.f172883d = null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX INFO: renamed from: d */
    public final void m128410d(String str) {
        C2735c c2735c;
        AbstractC40058e c40054a;
        int i13;
        boolean zContains;
        C3974q c3974q;
        Object next;
        ArrayList arrayList = this.f172887h;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((AbstractC40058e) it.next());
        }
        C40060g c40060g = new C40060g(arrayList2, this.f172884e);
        arrayList.clear();
        Iterator it3 = this.f172889j.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            c2735c = this.f172888i;
            c40054a = null;
            i13 = 0;
            if (!zHasNext) {
                break;
            }
            Class cls = (Class) it3.next();
            if (AbstractC22676k.m65745e(cls, C40054a.class)) {
                if (c2735c != null) {
                    if (!AbstractC22676k.m65745e(c2735c.f10756H, C2734b.f10751f)) {
                        String strM7705b = str == null ? c2735c.m7705b() : str;
                        c40054a = strM7705b != null ? new C40054a(strM7705b) : new C40054a("Bluetooth");
                    }
                    if (c40054a != null) {
                        arrayList.add(c40054a);
                    }
                }
            } else if (!AbstractC22676k.m65745e(cls, C40057d.class)) {
                boolean zM65745e = AbstractC22676k.m65745e(cls, C40055b.class);
                C40059f c40059f = this.f172881b;
                if (zM65745e) {
                    if (c40059f.f172866a.getPackageManager().hasSystemFeature("android.hardware.telephony") && !this.f172886g) {
                        arrayList.add(new C40055b());
                    }
                } else if (AbstractC22676k.m65745e(cls, C40056c.class)) {
                    C22786e c22786e = c40059f.f172867b;
                    if (c40059f.f172866a.getPackageManager().hasSystemFeature("android.hardware.audio.output")) {
                        AudioDeviceInfo[] devices = c40059f.f172868c.getDevices(2);
                        AbstractC22676k.m65749i(devices, "devices");
                        int length = devices.length;
                        while (i13 < length) {
                            if (devices[i13].getType() != 2) {
                                i13++;
                            }
                        }
                    }
                    arrayList.add(new C40056c());
                    break;
                }
            } else if (this.f172886g) {
                arrayList.add(new C40057d());
            }
        }
        String message = "Available AudioDevice list updated: " + this.f172893n;
        this.f172880a.getClass();
        AbstractC22676k.m65750j(message, "message");
        AbstractC40058e abstractC40058e = this.f172885f;
        if (abstractC40058e == null) {
            zContains = false;
        } else if (abstractC40058e instanceof C40054a) {
            Iterator it4 = arrayList.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!(((AbstractC40058e) next) instanceof C40054a));
            AbstractC40058e abstractC40058e2 = (AbstractC40058e) next;
            if (abstractC40058e2 != null) {
                this.f172885f = abstractC40058e2;
                zContains = true;
            } else {
                zContains = false;
            }
        } else {
            zContains = arrayList.contains(abstractC40058e);
        }
        if (!zContains) {
            this.f172885f = null;
        }
        String message2 = "Current user selected AudioDevice = " + this.f172885f;
        AbstractC22676k.m65750j(message2, "message");
        AbstractC40058e abstractC40058e3 = this.f172885f;
        if (abstractC40058e3 != null) {
            c40054a = abstractC40058e3;
        } else if (arrayList.size() > 0) {
            Object obj = arrayList.get(0);
            AbstractC22676k.m65749i(obj, "mutableAudioDevices[0]");
            c40054a = (AbstractC40058e) obj;
            if (c40054a instanceof C40054a) {
                if (c2735c != null && AbstractC22676k.m65745e(c2735c.f10756H, C2734b.f10749d)) {
                    i13 = 1;
                }
                if (i13 != 0) {
                    c40054a = (AbstractC40058e) arrayList.get(1);
                }
            }
        }
        this.f172884e = c40054a;
        if (this.f172890k == 2) {
            m128407a();
        }
        if (new C40060g(arrayList, this.f172884e).equals(c40060g) || (c3974q = this.f172883d) == null) {
            return;
        }
        c3974q.invoke(arrayList, this.f172884e);
    }
}
