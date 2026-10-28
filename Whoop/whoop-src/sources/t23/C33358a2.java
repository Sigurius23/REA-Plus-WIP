package t23;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c33.AbstractC3945l;
import c33.C3936c;
import c33.C3937d;
import c33.C3938e;
import c33.C3941h;
import c33.C3943j;
import c33.C3944k;
import c33.C3946m;
import c93.InterfaceC4339a;
import e33.C12638j0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import j43.C21317a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23470p;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n53.C26318e;
import org.webrtc.audio.JavaAudioDeviceModule;
import p000.AbstractC11266d;
import p043c4.C3974q;
import p085d9.C11783c;
import p320m5.C25067k;
import p479s4.AbstractC32122c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import stream.video.sfu.models.AudioBitrateProfile;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;
import z40.C40054a;
import z40.C40055b;
import z40.C40056c;
import z40.C40057d;

/* JADX INFO: renamed from: t23.a2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33358a2 {

    /* JADX INFO: renamed from: a */
    public final C33476x1 f139190a;

    /* JADX INFO: renamed from: b */
    public final C33414l f139191b;

    /* JADX INFO: renamed from: d */
    public C3938e f139193d;

    /* JADX INFO: renamed from: f */
    public AudioManager f139195f;

    /* JADX INFO: renamed from: g */
    public C11783c f139196g;

    /* JADX INFO: renamed from: h */
    public final C13045h2 f139197h;

    /* JADX INFO: renamed from: i */
    public final C13045h2 f139198i;

    /* JADX INFO: renamed from: j */
    public final C13045h2 f139199j;

    /* JADX INFO: renamed from: k */
    public final C13045h2 f139200k;

    /* JADX INFO: renamed from: l */
    public final C26318e f139201l;

    /* JADX INFO: renamed from: m */
    public final C13045h2 f139202m;

    /* JADX INFO: renamed from: n */
    public AbstractC3945l f139203n;

    /* JADX INFO: renamed from: o */
    public final C13045h2 f139204o;

    /* JADX INFO: renamed from: p */
    public final C13045h2 f139205p;

    /* JADX INFO: renamed from: q */
    public final C13045h2 f139206q;

    /* JADX INFO: renamed from: r */
    public final C13045h2 f139207r;

    /* JADX INFO: renamed from: c */
    public final C23470p f139192c = AbstractC1772c1.m5382S(this, "Media:MicrophoneManager");

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f139194e = new AtomicBoolean(false);

    public C33358a2(C33476x1 c33476x1, C33414l c33414l) {
        this.f139190a = c33476x1;
        this.f139191b = c33414l;
        C25271y c25271y = C25271y.f99162w;
        this.f139197h = AbstractC13091v.m36593c(c25271y);
        this.f139198i = AbstractC13091v.m36593c(null);
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(C33436p1.f139584a);
        this.f139199j = c13045h2M36593c;
        this.f139200k = c13045h2M36593c;
        this.f139201l = AbstractC37926s0.m121484x(c13045h2M36593c, C33415l0.f139530Q);
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(null);
        this.f139202m = c13045h2M36593c2;
        this.f139204o = c13045h2M36593c2;
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c(c25271y);
        this.f139205p = c13045h2M36593c3;
        this.f139206q = c13045h2M36593c3;
        this.f139207r = AbstractC13091v.m36593c(AudioBitrateProfile.AUDIO_BITRATE_PROFILE_VOICE_STANDARD_UNSPECIFIED);
    }

    /* JADX INFO: renamed from: a */
    public static void m105787a(C33358a2 c33358a2) {
        c33358a2.getClass();
        c33358a2.m105788b(new C25067k(c33358a2, 7), false);
    }

    /* JADX INFO: renamed from: b */
    public final void m105788b(InterfaceC4339a interfaceC4339a, boolean z4) {
        synchronized (this) {
            try {
                C22669g0 c22669g0 = new C22669g0();
                c22669g0.f89336w = interfaceC4339a;
                InterfaceC30057d interfaceC30057d = null;
                if (this.f139194e.get()) {
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) c22669g0.f89336w;
                    if (interfaceC4339a2 != null) {
                        interfaceC4339a2.invoke();
                    }
                    c22669g0.f89336w = null;
                    return;
                }
                AudioManager audioManager = (AudioManager) AbstractC32122c.getSystemService(this.f139190a.f139753a, AudioManager.class);
                this.f139195f = audioManager;
                if (Build.VERSION.SDK_INT >= 29 && audioManager != null) {
                    audioManager.setAllowedCapturePolicy(1);
                }
                m105791e();
                if (((Number) this.f139191b.invoke()).intValue() == 1 || this.f139193d != null) {
                    C2345k c2345kM105789c = m105789c();
                    InterfaceC2339e interfaceC2339e = c2345kM105789c.f9275c;
                    EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                    if (interfaceC2339e.isLoggable(enumC2341g, c2345kM105789c.f9273a)) {
                        c2345kM105789c.f9274b.log(enumC2341g, c2345kM105789c.f9273a, "[MediaManager#setup] Usage is MEDIA or audioHandle is already initialized", null);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) c22669g0.f89336w;
                    if (interfaceC4339a3 != null) {
                        interfaceC4339a3.invoke();
                    }
                } else {
                    this.f139193d = new C3938e(new C3936c(this.f139190a.f139753a, AbstractC25265s.m74129g1(AbstractC37056f.m118959K(C40054a.class, C40057d.class), z4 ? AbstractC37056f.m118959K(C40056c.class, C40055b.class) : AbstractC37056f.m118959K(C40055b.class, C40056c.class)), new C3974q(9, this, c22669g0)));
                    C2345k c2345kM105789c2 = m105789c();
                    InterfaceC2339e interfaceC2339e2 = c2345kM105789c2.f9275c;
                    EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
                    if (interfaceC2339e2.isLoggable(enumC2341g2, c2345kM105789c2.f9273a)) {
                        InterfaceC2344j interfaceC2344j = c2345kM105789c2.f9274b;
                        String str = c2345kM105789c2.f9273a;
                        C3938e c3938e = this.f139193d;
                        if (c3938e == null) {
                            AbstractC22676k.m65757q("audioHandler");
                            throw null;
                        }
                        interfaceC2344j.log(enumC2341g2, str, "[setup] Calling start on instance " + c3938e, null);
                    }
                    C3938e c3938e2 = this.f139193d;
                    if (c3938e2 == null) {
                        AbstractC22676k.m65757q("audioHandler");
                        throw null;
                    }
                    InterfaceC2994c0 interfaceC2994c0M11991a = c3938e2.m11991a();
                    if (interfaceC2994c0M11991a != null) {
                        AbstractC3006f0.m8732z(interfaceC2994c0M11991a, null, null, new C3937d(c3938e2, interfaceC30057d, 0), 3);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C2345k m105789c() {
        return (C2345k) this.f139192c.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [c93.a, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: d */
    public final void m105790d(AbstractC3945l abstractC3945l) {
        C33476x1 c33476x1 = this.f139190a;
        C33398h3 c33398h3 = c33476x1.f139759g;
        C2345k c2345kM105789c = m105789c();
        InterfaceC2339e interfaceC2339e = c2345kM105789c.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345kM105789c.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM105789c.f9274b.log(enumC2341g, str, "selecting device " + abstractC3945l, null);
        }
        C21317a c21317a = new C21317a(abstractC3945l, 10);
        C3938e c3938e = this.f139193d;
        if (c3938e != null) {
            c21317a.invoke(c3938e);
        } else {
            C2345k c2345kM105789c2 = m105789c();
            InterfaceC2339e interfaceC2339e2 = c2345kM105789c2.f9275c;
            String str2 = c2345kM105789c2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                c2345kM105789c2.f9274b.log(enumC2341g2, str2, "Audio handler not initialized. Ensure calling setup(), before using the handler.", null);
            }
        }
        this.f139202m.m36570j(abstractC3945l);
        c33476x1.f139754b.f139302p.getClass();
        boolean z4 = abstractC3945l instanceof C3943j;
        if (!z4 && ((Boolean) ((AbstractC22680m) c33398h3.f139466f.f104635y).invoke()).booleanValue()) {
            C13045h2 c13045h2 = c33398h3.f139464d;
            c13045h2.getClass();
            c13045h2.m36571k(null, C33426n1.f139555a);
        }
        if (z4) {
            C13045h2 c13045h3 = c33398h3.f139464d;
            c13045h3.getClass();
            c13045h3.m36571k(null, C33431o1.f139566a);
        }
        if ((abstractC3945l instanceof C3941h) || (abstractC3945l instanceof C3944k)) {
            return;
        }
        this.f139203n = abstractC3945l;
    }

    /* JADX INFO: renamed from: e */
    public final void m105791e() {
        if (this.f139196g != null) {
            C2345k c2345kM105789c = m105789c();
            InterfaceC2339e interfaceC2339e = c2345kM105789c.f9275c;
            String str = c2345kM105789c.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM105789c.f9274b.log(enumC2341g, str, "[setupUsbDeviceDetection] Already set up", null);
                return;
            }
            return;
        }
        AudioManager audioManager = this.f139195f;
        if (audioManager == null) {
            audioManager = (AudioManager) AbstractC32122c.getSystemService(this.f139190a.f139753a, AudioManager.class);
        }
        this.f139195f = audioManager;
        if (audioManager == null) {
            C2345k c2345kM105789c2 = m105789c();
            InterfaceC2339e interfaceC2339e2 = c2345kM105789c2.f9275c;
            String str2 = c2345kM105789c2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                c2345kM105789c2.f9274b.log(enumC2341g2, str2, "[setupUsbDeviceDetection] AudioManager not available", null);
                return;
            }
            return;
        }
        C11783c c11783c = new C11783c(this, 1);
        this.f139196g = c11783c;
        audioManager.registerAudioDeviceCallback(c11783c, null);
        C2345k c2345kM105789c3 = m105789c();
        InterfaceC2339e interfaceC2339e3 = c2345kM105789c3.f9275c;
        String str3 = c2345kM105789c3.f9273a;
        EnumC2341g enumC2341g3 = EnumC2341g.INFO;
        if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
            c2345kM105789c3.f9274b.log(enumC2341g3, str3, "[setupUsbDeviceDetection] Registered AudioDeviceCallback", null);
        }
        m105792f();
    }

    /* JADX INFO: renamed from: f */
    public final void m105792f() {
        AudioManager audioManager = this.f139195f;
        if (audioManager == null) {
            return;
        }
        AudioDeviceInfo[] devices = audioManager.getDevices(1);
        AbstractC22676k.m65749i(devices, "getDevices(...)");
        ArrayList<AudioDeviceInfo> arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            List list = C3946m.f16086b;
            AbstractC22676k.m65747g(audioDeviceInfo);
            if (C3946m.f16086b.contains(Integer.valueOf(audioDeviceInfo.getType())) && audioDeviceInfo.isSource()) {
                arrayList.add(audioDeviceInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (AudioDeviceInfo audioDeviceInfo2 : arrayList) {
            AbstractC22676k.m65747g(audioDeviceInfo2);
            arrayList2.add(new C3946m(audioDeviceInfo2));
        }
        C2345k c2345kM105789c = m105789c();
        InterfaceC2339e interfaceC2339e = c2345kM105789c.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM105789c.f9273a)) {
            InterfaceC2344j interfaceC2344j = c2345kM105789c.f9274b;
            String str = c2345kM105789c.f9273a;
            int size = arrayList2.size();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((C3946m) it.next()).m11993a());
            }
            interfaceC2344j.log(enumC2341g, str, "[updateUsbDeviceList] Found " + size + " USB input devices: " + arrayList3, null);
        }
        C13045h2 c13045h2 = this.f139197h;
        c13045h2.getClass();
        c13045h2.m36571k(null, arrayList2);
        if (this.f139198i.getValue() != null || arrayList2.isEmpty()) {
            return;
        }
        C3946m c3946m = (C3946m) AbstractC25265s.m74096F0(arrayList2);
        C2345k c2345kM105789c2 = m105789c();
        InterfaceC2339e interfaceC2339e2 = c2345kM105789c2.f9275c;
        EnumC2341g enumC2341g2 = EnumC2341g.INFO;
        if (interfaceC2339e2.isLoggable(enumC2341g2, c2345kM105789c2.f9273a)) {
            c2345kM105789c2.f9274b.log(enumC2341g2, c2345kM105789c2.f9273a, "[updateUsbDeviceList] Auto-selecting USB device: ".concat(c3946m.m11993a()), null);
        }
        C2345k c2345kM105789c3 = m105789c();
        if (c2345kM105789c3.f9275c.isLoggable(enumC2341g2, c2345kM105789c3.f9273a)) {
            c2345kM105789c3.f9274b.log(enumC2341g2, c2345kM105789c3.f9273a, AbstractC11266d.m30461o("[selectUsbDevice] Selecting USB device: ", c3946m != null ? c3946m.m11993a() : null), null);
        }
        C12638j0 c12638j0M105819j = this.f139190a.f139754b.m105819j();
        AudioDeviceInfo audioDeviceInfo3 = c3946m != null ? c3946m.f16087a : null;
        try {
            JavaAudioDeviceModule javaAudioDeviceModule = c12638j0M105819j.f43166p;
            if (javaAudioDeviceModule != null) {
                javaAudioDeviceModule.setPreferredInputDevice(audioDeviceInfo3);
                C2345k c2345kM35392a = c12638j0M105819j.m35392a();
                if (c2345kM35392a.f9275c.isLoggable(enumC2341g2, c2345kM35392a.f9273a)) {
                    c2345kM35392a.f9274b.log(enumC2341g2, c2345kM35392a.f9273a, "[setPreferredAudioInputDevice] Set preferred input device: " + ((Object) (audioDeviceInfo3 != null ? audioDeviceInfo3.getProductName() : null)), null);
                }
            } else {
                c12638j0M105819j.f43167q = audioDeviceInfo3;
                c12638j0M105819j.f43168r = true;
                C2345k c2345kM35392a2 = c12638j0M105819j.m35392a();
                InterfaceC2339e interfaceC2339e3 = c2345kM35392a2.f9275c;
                EnumC2341g enumC2341g3 = EnumC2341g.WARN;
                if (interfaceC2339e3.isLoggable(enumC2341g3, c2345kM35392a2.f9273a)) {
                    c2345kM35392a2.f9274b.log(enumC2341g3, c2345kM35392a2.f9273a, "[setPreferredAudioInputDevice] ADM not yet initialized, queuing preference: " + ((Object) (audioDeviceInfo3 != null ? audioDeviceInfo3.getProductName() : null)), null);
                }
            }
            this.f139198i.m36570j(c3946m);
            C2345k c2345kM105789c4 = m105789c();
            if (c2345kM105789c4.f9275c.isLoggable(enumC2341g2, c2345kM105789c4.f9273a)) {
                c2345kM105789c4.f9274b.log(enumC2341g2, c2345kM105789c4.f9273a, AbstractC11266d.m30461o("[selectUsbDevice] Successfully selected USB device: ", c3946m != null ? c3946m.m11993a() : null), null);
            }
        } catch (Exception e5) {
            C2345k c2345kM35392a3 = c12638j0M105819j.m35392a();
            InterfaceC2339e interfaceC2339e4 = c2345kM35392a3.f9275c;
            EnumC2341g enumC2341g4 = EnumC2341g.ERROR;
            if (interfaceC2339e4.isLoggable(enumC2341g4, c2345kM35392a3.f9273a)) {
                c2345kM35392a3.f9274b.log(enumC2341g4, c2345kM35392a3.f9273a, AbstractC11266d.m30461o("[setPreferredAudioInputDevice] Failed to set preferred device: ", e5.getMessage()), null);
            }
            C2345k c2345kM105789c5 = m105789c();
            if (c2345kM105789c5.f9275c.isLoggable(enumC2341g4, c2345kM105789c5.f9273a)) {
                c2345kM105789c5.f9274b.log(enumC2341g4, c2345kM105789c5.f9273a, AbstractC11266d.m30461o("[selectUsbDevice] Failed to select USB device: ", c3946m != null ? c3946m.m11993a() : null), null);
            }
        }
    }
}
