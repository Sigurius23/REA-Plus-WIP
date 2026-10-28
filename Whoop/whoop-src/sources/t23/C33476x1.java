package t23;

import android.content.Context;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC2994c0;
import e33.C12638j0;
import hc3.C17171d;
import java.util.UUID;
import l83.C23470p;
import n53.AbstractC26312c;
import ng3.C26701n;
import org.webrtc.AudioSource;
import org.webrtc.AudioTrack;
import org.webrtc.EglBase;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;
import p320m5.C25067k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q33.C29954b;

/* JADX INFO: renamed from: t23.x1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33476x1 {

    /* JADX INFO: renamed from: a */
    public final Context f139753a;

    /* JADX INFO: renamed from: b */
    public final C33368c0 f139754b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2994c0 f139755c;

    /* JADX INFO: renamed from: d */
    public final EglBase.Context f139756d;

    /* JADX INFO: renamed from: e */
    public final C33381e1 f139757e;

    /* JADX INFO: renamed from: f */
    public final C33358a2 f139758f;

    /* JADX INFO: renamed from: g */
    public final C33398h3 f139759g;

    /* JADX INFO: renamed from: h */
    public final C33388f3 f139760h;

    /* JADX INFO: renamed from: i */
    public final C23470p f139761i;

    /* JADX INFO: renamed from: j */
    public final C29954b f139762j;

    /* JADX INFO: renamed from: k */
    public final C29954b f139763k;

    /* JADX INFO: renamed from: l */
    public VideoSource f139764l;

    /* JADX INFO: renamed from: m */
    public VideoSource f139765m;

    /* JADX INFO: renamed from: n */
    public VideoTrack f139766n;

    /* JADX INFO: renamed from: o */
    public VideoTrack f139767o;

    /* JADX INFO: renamed from: p */
    public final Object f139768p;

    /* JADX INFO: renamed from: q */
    public boolean f139769q;

    /* JADX INFO: renamed from: r */
    public AudioSource f139770r;

    /* JADX INFO: renamed from: s */
    public AudioTrack f139771s;

    public C33476x1(Context context, C33368c0 c33368c0, C17171d scope, EglBase.Context context2, int i13, C33414l c33414l) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(scope, "scope");
        this.f139753a = context;
        this.f139754b = c33368c0;
        this.f139755c = scope;
        this.f139756d = context2;
        this.f139757e = new C33381e1(this, context2, new C26701n(20));
        C33358a2 c33358a2 = new C33358a2(this, c33414l);
        this.f139758f = c33358a2;
        this.f139759g = new C33398h3(this, c33358a2, c33414l);
        this.f139760h = new C33388f3(this, context2);
        this.f139761i = AbstractC1772c1.m5382S(this, "Media:MediaManagerImpl");
        this.f139762j = new C29954b(new C33456t1(this), new C33461u1(this));
        this.f139763k = new C29954b(C33466v1.f139738w, new C33471w1(this));
        this.f139768p = new Object();
    }

    /* JADX INFO: renamed from: a */
    public final void m105872a() {
        synchronized (this.f139768p) {
            try {
                AudioTrack audioTrack = this.f139771s;
                if (audioTrack != null) {
                    audioTrack.dispose();
                }
                AudioSource audioSource = this.f139770r;
                if (audioSource != null) {
                    audioSource.dispose();
                }
                VideoTrack videoTrack = this.f139766n;
                if (videoTrack != null) {
                    videoTrack.dispose();
                }
                VideoSource videoSource = this.f139764l;
                if (videoSource != null) {
                    videoSource.dispose();
                }
                VideoTrack videoTrack2 = this.f139767o;
                if (videoTrack2 != null) {
                    videoTrack2.dispose();
                }
                VideoSource videoSource2 = this.f139765m;
                if (videoSource2 != null) {
                    videoSource2.dispose();
                }
                this.f139771s = null;
                this.f139770r = null;
                this.f139766n = null;
                this.f139764l = null;
                this.f139767o = null;
                this.f139765m = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final AudioSource m105873b() {
        AudioSource audioSource;
        synchronized (this.f139768p) {
            try {
                if (this.f139770r == null) {
                    C12638j0 c12638j0M105819j = this.f139754b.m105819j();
                    AudioSource audioSourceCreateAudioSource = c12638j0M105819j.m35393b().createAudioSource(AbstractC26312c.m78067a(new C25067k(this, 6)));
                    AbstractC22676k.m65749i(audioSourceCreateAudioSource, "createAudioSource(...)");
                    this.f139770r = audioSourceCreateAudioSource;
                }
                audioSource = this.f139770r;
                AbstractC22676k.m65747g(audioSource);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return audioSource;
    }

    /* JADX INFO: renamed from: c */
    public final VideoSource m105874c() {
        VideoSource videoSource;
        synchronized (this.f139768p) {
            try {
                if (this.f139764l == null) {
                    C12638j0 c12638j0M105819j = this.f139754b.m105819j();
                    C29954b filterVideoProcessor = this.f139762j;
                    AbstractC22676k.m65750j(filterVideoProcessor, "filterVideoProcessor");
                    VideoSource videoSourceCreateVideoSource = c12638j0M105819j.m35393b().createVideoSource(false);
                    videoSourceCreateVideoSource.setVideoProcessor(filterVideoProcessor);
                    this.f139764l = videoSourceCreateVideoSource;
                }
                videoSource = this.f139764l;
                AbstractC22676k.m65747g(videoSource);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return videoSource;
    }

    /* JADX INFO: renamed from: d */
    public final void m105875d(Function1 function1) {
        synchronized (this.f139768p) {
            if (this.f139769q) {
                C2345k c2345k = (C2345k) this.f139761i.getValue();
                InterfaceC2339e interfaceC2339e = c2345k.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, c2345k.f9273a)) {
                    c2345k.f9274b.log(enumC2341g, c2345k.f9273a, "[runOnAudioTrackIfAvailable] MediaManager already cleaned up; skipping audio track operation", null);
                }
                return;
            }
            if (this.f139771s == null) {
                C12638j0 c12638j0M105819j = this.f139754b.m105819j();
                AudioSource audioSourceM105873b = m105873b();
                String string = UUID.randomUUID().toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                AudioTrack audioTrackCreateAudioTrack = c12638j0M105819j.m35393b().createAudioTrack(string, audioSourceM105873b);
                AbstractC22676k.m65749i(audioTrackCreateAudioTrack, "createAudioTrack(...)");
                this.f139771s = audioTrackCreateAudioTrack;
            }
            AudioTrack audioTrack = this.f139771s;
            AbstractC22676k.m65747g(audioTrack);
            function1.invoke(audioTrack);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m105876e(Function1 function1) {
        synchronized (this.f139768p) {
            if (this.f139769q) {
                C2345k c2345k = (C2345k) this.f139761i.getValue();
                InterfaceC2339e interfaceC2339e = c2345k.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, c2345k.f9273a)) {
                    c2345k.f9274b.log(enumC2341g, c2345k.f9273a, "[runOnVideoTrackIfAvailable] MediaManager already cleaned up; skipping video track operation", null);
                }
                return;
            }
            if (this.f139766n == null) {
                C12638j0 c12638j0M105819j = this.f139754b.m105819j();
                VideoSource videoSourceM105874c = m105874c();
                String string = UUID.randomUUID().toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                this.f139766n = c12638j0M105819j.m35396e(string, videoSourceM105874c);
            }
            VideoTrack videoTrack = this.f139766n;
            AbstractC22676k.m65747g(videoTrack);
            function1.invoke(videoTrack);
        }
    }
}
