package e33;

import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import b30.C2570m;
import c43.EnumC4206v;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import d13.AbstractC11478a;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.video.android.core.model.IceCandidate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l53.C23372m;
import l53.EnumC23360a;
import l83.C23454a0;
import l83.C23470p;
import mc3.AbstractC25438d;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import org.webrtc.AudioTrack;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidateErrorEvent;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpTransceiver;
import org.webrtc.SessionDescription;
import org.webrtc.VideoTrack;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p33.AbstractC28824q;
import p33.C28809b;
import p505ts.AbstractC34132o;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.C30065l;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import stream.video.sfu.models.TrackType;
import x43.AbstractC37978j;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: e33.u */
/* JADX INFO: loaded from: classes3.dex */
public class C12659u implements PeerConnection.Observer {

    /* JADX INFO: renamed from: a */
    public final EnumC4206v f43261a;

    /* JADX INFO: renamed from: b */
    public final MediaConstraints f43262b;

    /* JADX INFO: renamed from: c */
    public final Function1 f43263c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4351m f43264d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4351m f43265e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4339a f43266f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC4339a f43267g;

    /* JADX INFO: renamed from: h */
    public final int f43268h;

    /* JADX INFO: renamed from: i */
    public final boolean f43269i;

    /* JADX INFO: renamed from: j */
    public final C23372m f43270j;

    /* JADX INFO: renamed from: k */
    public final String f43271k;

    /* JADX INFO: renamed from: l */
    public final C25437c f43272l;

    /* JADX INFO: renamed from: m */
    public final C25437c f43273m;

    /* JADX INFO: renamed from: n */
    public final C25437c f43274n;

    /* JADX INFO: renamed from: o */
    public SessionDescription f43275o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f43276p;

    /* JADX INFO: renamed from: q */
    public final String f43277q;

    /* JADX INFO: renamed from: r */
    public final C13045h2 f43278r;

    /* JADX INFO: renamed from: s */
    public final C13045h2 f43279s;

    /* JADX INFO: renamed from: t */
    public final C23470p f43280t;

    /* JADX INFO: renamed from: u */
    public PeerConnection f43281u;

    /* JADX INFO: renamed from: v */
    public C2570m f43282v;

    public C12659u(EnumC4206v enumC4206v, MediaConstraints mediaConstraints, C12627e c12627e, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, boolean z4, C23372m tracer, String str) {
        AbstractC22676k.m65750j(mediaConstraints, "mediaConstraints");
        AbstractC22676k.m65750j(tracer, "tracer");
        this.f43261a = enumC4206v;
        this.f43262b = mediaConstraints;
        this.f43263c = c12627e;
        this.f43264d = interfaceC4351m;
        this.f43265e = interfaceC4351m2;
        this.f43266f = interfaceC4339a;
        this.f43267g = interfaceC4339a2;
        this.f43268h = i13;
        this.f43269i = z4;
        this.f43270j = tracer;
        this.f43271k = str;
        this.f43272l = AbstractC25438d.m74669a();
        this.f43273m = AbstractC25438d.m74669a();
        this.f43274n = AbstractC25438d.m74669a();
        this.f43276p = new ArrayList();
        String strM121636U = AbstractC37978j.m121636U(enumC4206v);
        this.f43277q = strM121636U;
        this.f43278r = AbstractC13091v.m36593c(null);
        this.f43279s = AbstractC13091v.m36593c(null);
        this.f43280t = AbstractC1772c1.m5382S(this, "Call:PeerConnection:".concat(strM121636U));
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str2 = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM35417f.f9274b.log(enumC2341g, str2, "<init> #sfu; #" + strM121636U + "; mediaConstraints: " + mediaConstraints, null);
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m35411i(String str) {
        return AbstractC39421y.m125926K(AbstractC39421y.m125926K(AbstractC39421y.m125926K(str, "vp9", "VP9", false), "vp8", "VP8", false), "h264", "H264", false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m35412a(IceCandidate iceCandidate, AbstractC32269c abstractC32269c) {
        C12647o c12647o;
        org.webrtc.IceCandidate iceCandidate2;
        C12659u c12659u;
        if (abstractC32269c instanceof C12647o) {
            c12647o = (C12647o) abstractC32269c;
            int i13 = c12647o.f43203E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12647o.f43203E = i13 - Integer.MIN_VALUE;
            } else {
                c12647o = new C12647o(this, abstractC32269c);
            }
        } else {
            c12647o = new C12647o(this, abstractC32269c);
        }
        Object obj = c12647o.f43206y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12647o.f43203E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            AbstractC22676k.m65750j(iceCandidate, "<this>");
            org.webrtc.IceCandidate iceCandidate3 = new org.webrtc.IceCandidate(iceCandidate.getSdpMid$stream_video_android_core_release(), iceCandidate.getSdpMLineIndex$stream_video_android_core_release(), iceCandidate.getCandidate$stream_video_android_core_release());
            C2345k c2345kM35417f = m35417f();
            InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
            String str = c2345kM35417f.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM35417f.f9274b.log(enumC2341g, str, "[addIceCandidate] #sfu; #" + this.f43277q + "; rtcIceCandidate: " + iceCandidate3, null);
            }
            PeerConnection peerConnectionM35416e = m35416e();
            c12647o.f43204w = this;
            c12647o.f43205x = iceCandidate3;
            c12647o.f43203E = 1;
            C30065l c30065l = new C30065l(AbstractC15751g.m44424D(c12647o));
            peerConnectionM35416e.addIceCandidate(iceCandidate3, new C28809b(c30065l, 0));
            Object objM92140a = c30065l.m92140a();
            if (objM92140a == enumC31071a) {
                return enumC31071a;
            }
            obj = objM92140a;
            iceCandidate2 = iceCandidate3;
            c12659u = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iceCandidate2 = c12647o.f43205x;
            c12659u = c12647o.f43204w;
            AbstractC34132o.m107864I(obj);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
        C2345k c2345kM35417f2 = c12659u.m35417f();
        InterfaceC2339e interfaceC2339e2 = c2345kM35417f2.f9275c;
        String str2 = c2345kM35417f2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            c2345kM35417f2.f9274b.log(enumC2341g2, str2, "[addIceCandidate] #sfu; #" + c12659u.f43277q + "; completed: " + abstractC26205h, null);
        }
        C23372m c23372m = c12659u.f43270j;
        EnumC23360a[] enumC23360aArr = EnumC23360a.f92601x;
        c23372m.m67653b(iceCandidate2.toString(), "addIceCandidate");
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public final void m35413b() {
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, AbstractC31061c.m95640p("[close] #sfu; #", this.f43277q, "; no args, debugText: ", this.f43271k), null);
        }
        EnumC23360a[] enumC23360aArr = EnumC23360a.f92601x;
        this.f43270j.m67653b(null, "close");
        m35416e().close();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m35414c(MediaConstraints mediaConstraints, AbstractC32269c abstractC32269c) {
        C12649p c12649p;
        C12659u c12659u;
        if (abstractC32269c instanceof C12649p) {
            c12649p = (C12649p) abstractC32269c;
            int i13 = c12649p.f43215z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12649p.f43215z = i13 - Integer.MIN_VALUE;
            } else {
                c12649p = new C12649p(this, abstractC32269c);
            }
        } else {
            c12649p = new C12649p(this, abstractC32269c);
        }
        Object objM92140a = c12649p.f43213x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12649p.f43215z;
        int i15 = 1;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM92140a);
            C2345k c2345kM35417f = m35417f();
            InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
            String str = c2345kM35417f.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM35417f.f9274b.log(enumC2341g, str, AbstractC11895b.m31996o("[createAnswer] #sfu; #", this.f43277q, "; no args"), null);
            }
            c12649p.f43212w = this;
            c12649p.f43215z = 1;
            C30065l c30065l = new C30065l(AbstractC15751g.m44424D(c12649p));
            m35416e().createAnswer(new C28809b(c30065l, i15), mediaConstraints);
            objM92140a = c30065l.m92140a();
            if (objM92140a == enumC31071a) {
                return enumC31071a;
            }
            c12659u = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c12659u = c12649p.f43212w;
            AbstractC34132o.m107864I(objM92140a);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) objM92140a;
        C2345k c2345kM35417f2 = c12659u.m35417f();
        String str2 = c12659u.f43277q;
        InterfaceC2339e interfaceC2339e2 = c2345kM35417f2.f9275c;
        String str3 = c2345kM35417f2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str3)) {
            c2345kM35417f2.f9274b.log(enumC2341g2, str3, "[createAnswer] #sfu; #" + str2 + "; result: " + abstractC26205h, null);
        }
        if (abstractC26205h instanceof C26204g) {
            C2345k c2345kM35417f3 = c12659u.m35417f();
            InterfaceC2339e interfaceC2339e3 = c2345kM35417f3.f9275c;
            String str4 = c2345kM35417f3.f9273a;
            if (interfaceC2339e3.isLoggable(enumC2341g2, str4)) {
                c2345kM35417f3.f9274b.log(enumC2341g2, str4, AbstractC31061c.m95640p("[createAnswer] #sfu; #", str2, "; sdp: ", ((SessionDescription) ((C26204g) abstractC26205h).f103919a).description), null);
            }
            if (c12659u.f43269i) {
                C23372m c23372m = c12659u.f43270j;
                EnumC23360a[] enumC23360aArr = EnumC23360a.f92601x;
                c23372m.m67653b(((SessionDescription) ((C26204g) abstractC26205h).f103919a).description, "createAnswer");
                return objM92140a;
            }
        } else if (abstractC26205h instanceof C26203f) {
            C2345k c2345kM35417f4 = c12659u.m35417f();
            InterfaceC2339e interfaceC2339e4 = c2345kM35417f4.f9275c;
            String str5 = c2345kM35417f4.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
            if (interfaceC2339e4.isLoggable(enumC2341g3, str5)) {
                c2345kM35417f4.f9274b.log(enumC2341g3, str5, AbstractC31061c.m95640p("[createAnswer] #sfu; #", str2, "; error: ", ((C26203f) abstractC26205h).f103918a.mo77807a()), null);
            }
        }
        return objM92140a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m35415d(MediaConstraints mediaConstraints, AbstractC32269c abstractC32269c) {
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, AbstractC11895b.m31996o("[createOffer] #sfu; #", this.f43277q, "; no args"), null);
        }
        C30065l c30065l = new C30065l(AbstractC15751g.m44424D(abstractC32269c));
        m35416e().createOffer(new C28809b(c30065l, 1), mediaConstraints);
        EnumC23360a[] enumC23360aArr = EnumC23360a.f92601x;
        this.f43270j.m67653b(mediaConstraints.toString(), "createOffer");
        Object objM92140a = c30065l.m92140a();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM92140a;
    }

    /* JADX INFO: renamed from: e */
    public final PeerConnection m35416e() {
        PeerConnection peerConnection = this.f43281u;
        if (peerConnection != null) {
            return peerConnection;
        }
        AbstractC22676k.m65757q("connection");
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final C2345k m35417f() {
        return (C2345k) this.f43280t.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m35418g(IceCandidate iceCandidate, AbstractC32269c abstractC32269c) throws Throwable {
        C12651q c12651q;
        InterfaceC25435a interfaceC25435a;
        C12659u c12659u;
        InterfaceC25435a interfaceC25435a2;
        IceCandidate iceCandidate2;
        C25437c c25437c;
        C12659u c12659u2;
        Throwable th3;
        if (abstractC32269c instanceof C12651q) {
            c12651q = (C12651q) abstractC32269c;
            int i13 = c12651q.f43223G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12651q.f43223G = i13 - Integer.MIN_VALUE;
            } else {
                c12651q = new C12651q(this, abstractC32269c);
            }
        } else {
            c12651q = new C12651q(this, abstractC32269c);
        }
        Object obj = c12651q.f43221E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12651q.f43223G;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                c12651q.f43224w = this;
                c12651q.f43225x = iceCandidate;
                interfaceC25435a = this.f43273m;
                c12651q.f43226y = interfaceC25435a;
                c12651q.f43223G = 1;
                if (interfaceC25435a.mo68211b(c12651q) != enumC31071a) {
                    c12659u = this;
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    c25437c = c12651q.f43227z;
                    InterfaceC25435a interfaceC25435a3 = c12651q.f43226y;
                    iceCandidate2 = c12651q.f43225x;
                    c12659u2 = (C12659u) c12651q.f43224w;
                    try {
                        AbstractC34132o.m107864I(obj);
                        interfaceC25435a = interfaceC25435a3;
                        try {
                            c12659u2.f43276p.add(iceCandidate2);
                            c25437c.mo68214i(null);
                            return C23454a0.f92919a;
                        } finally {
                            c25437c.mo68214i(null);
                        }
                    } catch (Throwable th4) {
                        th3 = th4;
                        interfaceC25435a2 = interfaceC25435a3;
                    }
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC25435a2 = (InterfaceC25435a) c12651q.f43224w;
                    try {
                        AbstractC34132o.m107864I(obj);
                        interfaceC25435a = interfaceC25435a2;
                        return C23454a0.f92919a;
                    } catch (Throwable th5) {
                        th3 = th5;
                    }
                }
                interfaceC25435a2.mo68214i(null);
                throw th3;
            }
            InterfaceC25435a interfaceC25435a4 = c12651q.f43226y;
            IceCandidate iceCandidate3 = c12651q.f43225x;
            c12659u = (C12659u) c12651q.f43224w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a4;
            iceCandidate = iceCandidate3;
            PeerConnection peerConnectionM35416e = c12659u.m35416e();
            String str = c12659u.f43277q;
            if (peerConnectionM35416e.getRemoteDescription() == null) {
                C2345k c2345kM35417f = c12659u.m35417f();
                InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
                String str2 = c2345kM35417f.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                    c2345kM35417f.f9274b.log(enumC2341g, str2, "[handleNewIceCandidate] #ice; #sfu; #" + str + "; Remote desc is null, storing candidate: " + iceCandidate, null);
                }
                C25437c c25437c2 = c12659u.f43274n;
                c12651q.f43224w = c12659u;
                c12651q.f43225x = iceCandidate;
                c12651q.f43226y = interfaceC25435a;
                c12651q.f43227z = c25437c2;
                c12651q.f43223G = 2;
                if (c25437c2.mo68211b(c12651q) != enumC31071a) {
                    iceCandidate2 = iceCandidate;
                    c25437c = c25437c2;
                    c12659u2 = c12659u;
                    c12659u2.f43276p.add(iceCandidate2);
                    c25437c.mo68214i(null);
                    return C23454a0.f92919a;
                }
            } else {
                C2345k c2345kM35417f2 = c12659u.m35417f();
                InterfaceC2339e interfaceC2339e2 = c2345kM35417f2.f9275c;
                String str3 = c2345kM35417f2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str3)) {
                    c2345kM35417f2.f9274b.log(enumC2341g2, str3, "[handleNewIceCandidate] #ice; #sfu; #" + str + "; Remote desc is set, adding candidate: " + iceCandidate, null);
                }
                c12651q.f43224w = interfaceC25435a;
                c12651q.f43225x = null;
                c12651q.f43226y = null;
                c12651q.f43223G = 3;
                if (c12659u.m35412a(iceCandidate, c12651q) != enumC31071a) {
                    interfaceC25435a2 = interfaceC25435a;
                    interfaceC25435a = interfaceC25435a2;
                    return C23454a0.f92919a;
                }
            }
            return enumC31071a;
        } catch (Throwable th6) {
            InterfaceC25435a interfaceC25435a5 = interfaceC25435a;
            th3 = th6;
            interfaceC25435a2 = interfaceC25435a5;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m35419h(PeerConnection peerConnection) {
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[initialize] #sfu; #" + this.f43277q + "; peerConnection: " + peerConnection, null);
        }
        this.f43281u = peerConnection;
        this.f43282v = new C2570m(m35416e(), AbstractC34870c0.m110010n0(this.f43261a));
        this.f43278r.m36570j(m35416e().connectionState());
        this.f43279s.m36570j(m35416e().iceConnectionState());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008b A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:29:0x0085, B:31:0x008b, B:34:0x00a0), top: B:41:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:45:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[LOOP:0: B:29:0x0085->B:48:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m35420j(AbstractC32269c abstractC32269c) throws Throwable {
        C12653r c12653r;
        InterfaceC25435a interfaceC25435a;
        C12659u c12659u;
        InterfaceC25435a interfaceC25435a2;
        Throwable th3;
        Iterator it;
        C12659u c12659u2;
        IceCandidate iceCandidate;
        if (abstractC32269c instanceof C12653r) {
            c12653r = (C12653r) abstractC32269c;
            int i13 = c12653r.f43231F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12653r.f43231F = i13 - Integer.MIN_VALUE;
            } else {
                c12653r = new C12653r(this, abstractC32269c);
            }
        } else {
            c12653r = new C12653r(this, abstractC32269c);
        }
        Object obj = c12653r.f43235z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12653r.f43231F;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k c2345kM35417f = m35417f();
                InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
                String str = c2345kM35417f.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345kM35417f.f9274b.log(enumC2341g, str, AbstractC25012a.m73374g(this.f43276p.size(), "[processIceCandidates] #ice; #sfu; #", this.f43277q, "; count: "), null);
                }
                c12653r.f43232w = this;
                interfaceC25435a = this.f43274n;
                c12653r.f43233x = interfaceC25435a;
                c12653r.f43231F = 1;
                if (interfaceC25435a.mo68211b(c12653r) != enumC31071a) {
                    c12659u = this;
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c12653r.f43234y;
                interfaceC25435a2 = c12653r.f43233x;
                c12659u2 = c12653r.f43232w;
                try {
                    AbstractC34132o.m107864I(obj);
                    while (it.hasNext()) {
                        iceCandidate = (IceCandidate) it.next();
                        c12653r.f43232w = c12659u2;
                        c12653r.f43233x = interfaceC25435a2;
                        c12653r.f43234y = it;
                        c12653r.f43231F = 2;
                        if (c12659u2.m35412a(iceCandidate, c12653r) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                    c12659u2.f43276p.clear();
                    interfaceC25435a2.mo68214i(null);
                    return C23454a0.f92919a;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            InterfaceC25435a interfaceC25435a3 = c12653r.f43233x;
            c12659u = c12653r.f43232w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a3;
            it = c12659u.f43276p.iterator();
            c12659u2 = c12659u;
            interfaceC25435a2 = interfaceC25435a;
            while (it.hasNext()) {
                iceCandidate = (IceCandidate) it.next();
                c12653r.f43232w = c12659u2;
                c12653r.f43233x = interfaceC25435a2;
                c12653r.f43234y = it;
                c12653r.f43231F = 2;
                if (c12659u2.m35412a(iceCandidate, c12653r) == enumC31071a) {
                    return enumC31071a;
                }
            }
            c12659u2.f43276p.clear();
            interfaceC25435a2.mo68214i(null);
            return C23454a0.f92919a;
        } catch (Throwable th5) {
            interfaceC25435a2 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d6, code lost:
    
        if (r13 == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.webrtc.SessionDescription] */
    /* JADX WARN: Type inference failed for: r12v1, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v8, types: [mc3.a] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m35421k(org.webrtc.SessionDescription r12, s83.AbstractC32269c r13) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e33.C12659u.m35421k(org.webrtc.SessionDescription, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00df A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:21:0x0056, B:34:0x00cd, B:36:0x00df, B:37:0x00fc, B:39:0x010f), top: B:50:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x010f A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #0 {all -> 0x005b, blocks: (B:21:0x0056, B:34:0x00cd, B:36:0x00df, B:37:0x00fc, B:39:0x010f), top: B:50:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0123  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00df, please report this as an issue */
    /* JADX INFO: renamed from: l */
    public final Object m35422l(SessionDescription sessionDescription, AbstractC32269c abstractC32269c) throws Throwable {
        C12657t c12657t;
        C22669g0 c22669g0M32004w;
        SessionDescription sessionDescription2;
        InterfaceC25435a interfaceC25435a;
        C12659u c12659u;
        InterfaceC25435a interfaceC25435a2;
        C22669g0 c22669g0;
        InterfaceC25435a interfaceC25435a3;
        SessionDescription sessionDescription3;
        C22669g0 c22669g1;
        C2345k c2345kM35417f;
        InterfaceC2339e interfaceC2339e;
        String str;
        EnumC2341g enumC2341g;
        C22669g0 c22669g2;
        if (abstractC32269c instanceof C12657t) {
            c12657t = (C12657t) abstractC32269c;
            int i13 = c12657t.f43251H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12657t.f43251H = i13 - Integer.MIN_VALUE;
            } else {
                c12657t = new C12657t(this, abstractC32269c);
            }
        } else {
            c12657t = new C12657t(this, abstractC32269c);
        }
        Object obj = c12657t.f43249F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12657t.f43251H;
        int i15 = 2;
        try {
            if (i14 == 0) {
                c22669g0M32004w = AbstractC11895b.m32004w(obj);
                c12657t.f43252w = this;
                sessionDescription2 = sessionDescription;
                c12657t.f43253x = sessionDescription2;
                c12657t.f43254y = c22669g0M32004w;
                interfaceC25435a = this.f43273m;
                c12657t.f43255z = interfaceC25435a;
                c12657t.f43251H = 1;
                if (interfaceC25435a.mo68211b(c12657t) != enumC31071a) {
                    c12659u = this;
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    c22669g1 = c12657t.f43248E;
                    interfaceC25435a3 = c12657t.f43255z;
                    c22669g0 = c12657t.f43254y;
                    sessionDescription3 = (SessionDescription) c12657t.f43253x;
                    c12659u = (C12659u) c12657t.f43252w;
                    try {
                        AbstractC34132o.m107864I(obj);
                        c22669g1.f89336w = obj;
                        c2345kM35417f = c12659u.m35417f();
                        interfaceC2339e = c2345kM35417f.f9275c;
                        str = c2345kM35417f.f9273a;
                        enumC2341g = EnumC2341g.DEBUG;
                        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                            c2345kM35417f.f9274b.log(enumC2341g, str, "[setRemoteDescription] #ice; #sfu; #" + c12659u.f43277q + "; result: " + c22669g0.f89336w, null);
                        }
                        C23372m c23372m = c12659u.f43270j;
                        EnumC23360a[] enumC23360aArr = EnumC23360a.f92601x;
                        c23372m.m67653b(sessionDescription3.description, "setRemoteDescription");
                        if (((AbstractC26205h) c22669g0.f89336w) instanceof C26204g) {
                            c12657t.f43252w = c22669g0;
                            c12657t.f43253x = interfaceC25435a3;
                            c12657t.f43254y = null;
                            c12657t.f43255z = null;
                            c12657t.f43248E = null;
                            c12657t.f43251H = 3;
                            if (c12659u.m35420j(c12657t) != enumC31071a) {
                                interfaceC25435a2 = interfaceC25435a3;
                                c22669g2 = c22669g0;
                            }
                            return enumC31071a;
                        }
                        interfaceC25435a3.mo68214i(null);
                        return c22669g0.f89336w;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC25435a2 = interfaceC25435a3;
                        interfaceC25435a2.mo68214i(null);
                        throw th;
                    }
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) c12657t.f43253x;
                c22669g2 = (C22669g0) c12657t.f43252w;
                try {
                    AbstractC34132o.m107864I(obj);
                } catch (Throwable th4) {
                    th = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th;
                }
                interfaceC25435a3 = interfaceC25435a2;
                c22669g0 = c22669g2;
                interfaceC25435a3.mo68214i(null);
                return c22669g0.f89336w;
            }
            InterfaceC25435a interfaceC25435a4 = c12657t.f43255z;
            C22669g0 c22669g3 = c12657t.f43254y;
            SessionDescription sessionDescription4 = (SessionDescription) c12657t.f43253x;
            c12659u = (C12659u) c12657t.f43252w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a4;
            sessionDescription2 = sessionDescription4;
            c22669g0M32004w = c22669g3;
            c12657t.f43252w = c12659u;
            c12657t.f43253x = sessionDescription2;
            c12657t.f43254y = c22669g0M32004w;
            c12657t.f43255z = interfaceC25435a;
            c12657t.f43248E = c22669g0M32004w;
            c12657t.f43251H = 2;
            C30065l c30065l = new C30065l(AbstractC15751g.m44424D(c12657t));
            C28809b c28809b = new C28809b(c30065l, i15);
            PeerConnection peerConnectionM35416e = c12659u.m35416e();
            SessionDescription.Type type = sessionDescription2.type;
            String description = sessionDescription2.description;
            AbstractC22676k.m65749i(description, "description");
            peerConnectionM35416e.setRemoteDescription(c28809b, new SessionDescription(type, m35411i(description)));
            Object objM92140a = c30065l.m92140a();
            if (objM92140a != enumC31071a) {
                c22669g0 = c22669g0M32004w;
                interfaceC25435a3 = interfaceC25435a;
                sessionDescription3 = sessionDescription2;
                obj = objM92140a;
                c22669g1 = c22669g0;
                c22669g1.f89336w = obj;
                c2345kM35417f = c12659u.m35417f();
                interfaceC2339e = c2345kM35417f.f9275c;
                str = c2345kM35417f.f9273a;
                enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345kM35417f.f9274b.log(enumC2341g, str, "[setRemoteDescription] #ice; #sfu; #" + c12659u.f43277q + "; result: " + c22669g0.f89336w, null);
                }
                C23372m c23372m2 = c12659u.f43270j;
                EnumC23360a[] enumC23360aArr2 = EnumC23360a.f92601x;
                c23372m2.m67653b(sessionDescription3.description, "setRemoteDescription");
                if (((AbstractC26205h) c22669g0.f89336w) instanceof C26204g) {
                    c12657t.f43252w = c22669g0;
                    c12657t.f43253x = interfaceC25435a3;
                    c12657t.f43254y = null;
                    c12657t.f43255z = null;
                    c12657t.f43248E = null;
                    c12657t.f43251H = 3;
                    if (c12659u.m35420j(c12657t) != enumC31071a) {
                        interfaceC25435a2 = interfaceC25435a3;
                        c22669g2 = c22669g0;
                        interfaceC25435a3 = interfaceC25435a2;
                        c22669g0 = c22669g2;
                    }
                }
                interfaceC25435a3.mo68214i(null);
                return c22669g0.f89336w;
            }
            return enumC31071a;
        } catch (Throwable th5) {
            th = th5;
            interfaceC25435a2 = interfaceC25435a;
            interfaceC25435a2.mo68214i(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m35423m(TrackType type, String str, List list) {
        AbstractC22676k.m65750j(type, "type");
        try {
            if (list.isEmpty()) {
                C23372m c23372m = this.f43270j;
                EnumC23360a[] enumC23360aArr = EnumC23360a.f92601x;
                c23372m.m67653b(type + ":" + str, "ontrack");
                return;
            }
            C23372m c23372m2 = this.f43270j;
            EnumC23360a[] enumC23360aArr2 = EnumC23360a.f92601x;
            c23372m2.m67653b(type + ":" + str + " " + list, "ontrack");
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "SafeCall")) {
                C2343i.f9271c.log(enumC2341g, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            }
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddStream(MediaStream mediaStream) {
        Function1 function1;
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        String str = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[onAddStream] #sfu; #track; #" + this.f43277q + "; stream: " + mediaStream, null);
        }
        if (mediaStream == null || (function1 = this.f43263c) == null) {
            return;
        }
        function1.invoke(mediaStream);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345kM35417f.f9273a;
        boolean zIsLoggable = interfaceC2339e.isLoggable(enumC2341g, str);
        String str2 = this.f43277q;
        if (zIsLoggable) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[onAddTrack] #sfu; #track; #" + str2 + "; receiver: " + rtpReceiver + ", mediaStreams: " + mediaStreamArr, null);
        }
        if (mediaStreamArr != null) {
            for (MediaStream mediaStream : mediaStreamArr) {
                C2345k c2345kM35417f2 = m35417f();
                InterfaceC2339e interfaceC2339e2 = c2345kM35417f2.f9275c;
                String str3 = c2345kM35417f2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str3)) {
                    c2345kM35417f2.f9274b.log(enumC2341g2, str3, "[onAddTrack] #sfu; #track; #" + str2 + "; mediaStream: " + mediaStream, null);
                }
                List<AudioTrack> list = mediaStream.audioTracks;
                if (list != null) {
                    for (AudioTrack audioTrack : list) {
                        C2345k c2345kM35417f3 = m35417f();
                        InterfaceC2339e interfaceC2339e3 = c2345kM35417f3.f9275c;
                        String str4 = c2345kM35417f3.f9273a;
                        EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
                        if (interfaceC2339e3.isLoggable(enumC2341g3, str4)) {
                            InterfaceC2344j interfaceC2344j = c2345kM35417f3.f9274b;
                            AbstractC22676k.m65747g(audioTrack);
                            interfaceC2344j.log(enumC2341g3, str4, AbstractC31061c.m95640p("[onAddTrack] #sfu; #track; #", str2, "; remoteAudioTrack: ", AbstractC28824q.m87680a(audioTrack)), null);
                        }
                        audioTrack.setEnabled(true);
                    }
                }
                List<VideoTrack> list2 = mediaStream.videoTracks;
                if (list2 != null) {
                    for (VideoTrack videoTrack : list2) {
                        C2345k c2345kM35417f4 = m35417f();
                        InterfaceC2339e interfaceC2339e4 = c2345kM35417f4.f9275c;
                        String str5 = c2345kM35417f4.f9273a;
                        EnumC2341g enumC2341g4 = EnumC2341g.VERBOSE;
                        if (interfaceC2339e4.isLoggable(enumC2341g4, str5)) {
                            InterfaceC2344j interfaceC2344j2 = c2345kM35417f4.f9274b;
                            AbstractC22676k.m65747g(videoTrack);
                            interfaceC2344j2.log(enumC2341g4, str5, AbstractC31061c.m95640p("[onAddTrack] #sfu; #track; #", str2, "; remoteVideoTrack: ", AbstractC28824q.m87680a(videoTrack)), null);
                        }
                        videoTrack.setEnabled(true);
                    }
                }
                Function1 function1 = this.f43263c;
                if (function1 != null) {
                    function1.invoke(mediaStream);
                }
            }
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onConnectionChange(PeerConnection.PeerConnectionState newState) {
        AbstractC22676k.m65750j(newState, "newState");
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[onConnectionChange] #sfu; #" + this.f43277q + "; newState: " + newState, null);
        }
        C13045h2 c13045h2 = this.f43278r;
        c13045h2.getClass();
        c13045h2.m36571k(null, newState);
        EnumC23360a[] enumC23360aArr = EnumC23360a.f92601x;
        this.f43270j.m67653b(newState.name(), "onconnectionstatechange");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onDataChannel(DataChannel dataChannel) {
        EnumC23360a[] enumC23360aArr = EnumC23360a.f92601x;
        this.f43270j.m67653b(dataChannel, "ondatachannel");
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[onDataChannel] #sfu; #" + this.f43277q + "; channel: " + dataChannel, null);
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceCandidate(org.webrtc.IceCandidate iceCandidate) {
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[onIceCandidate] #sfu; #" + this.f43277q + "; candidate: " + iceCandidate, null);
        }
        if (iceCandidate == null) {
            return;
        }
        InterfaceC4351m interfaceC4351m = this.f43265e;
        if (interfaceC4351m != null) {
            String sdpMid = iceCandidate.sdpMid;
            AbstractC22676k.m65749i(sdpMid, "sdpMid");
            int i13 = iceCandidate.sdpMLineIndex;
            String sdp = iceCandidate.sdp;
            AbstractC22676k.m65749i(sdp, "sdp");
            interfaceC4351m.invoke(new IceCandidate(sdpMid, i13, sdp, ""), this.f43261a);
        }
        EnumC23360a[] enumC23360aArr = EnumC23360a.f92601x;
        this.f43270j.m67653b(iceCandidate.toString(), "onicecandidate");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceCandidateError(IceCandidateErrorEvent iceCandidateErrorEvent) {
        String strM73376i;
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = c2345kM35417f.f9274b;
            if (iceCandidateErrorEvent != null) {
                int i13 = iceCandidateErrorEvent.errorCode;
                String str2 = iceCandidateErrorEvent.errorText;
                String str3 = iceCandidateErrorEvent.address;
                int i14 = iceCandidateErrorEvent.port;
                String str4 = iceCandidateErrorEvent.url;
                StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "IceCandidateErrorEvent(errorCode=", ", ", str2, ", address=");
                AbstractC11266d.m30470x(i14, str3, ", port=", ", url=", sbM53373n);
                strM73376i = AbstractC25012a.m73376i(str4, ")", sbM53373n);
            } else {
                strM73376i = null;
            }
            interfaceC2344j.log(enumC2341g, str, AbstractC31061c.m95640p("[onIceCandidateError] #sfu; #", this.f43277q, "; event: ", strM73376i), null);
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceCandidatesRemoved(org.webrtc.IceCandidate[] iceCandidateArr) {
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[onIceCandidatesRemoved] #sfu; #" + this.f43277q + "; iceCandidates: " + iceCandidateArr, null);
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345kM35417f.f9273a;
        boolean zIsLoggable = interfaceC2339e.isLoggable(enumC2341g, str);
        C13045h2 c13045h2 = this.f43279s;
        if (zIsLoggable) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[onIceConnectionChange] #ice; #sfu; #" + this.f43277q + "; oldIceState: " + c13045h2.getValue() + ", newState: " + iceConnectionState, null);
        }
        c13045h2.m36570j(iceConnectionState);
        EnumC23360a[] enumC23360aArr = EnumC23360a.f92601x;
        this.f43270j.m67653b(iceConnectionState != null ? iceConnectionState.name() : null, "oniceconnectionstatechange");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceConnectionReceivingChange(boolean z4) {
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, AbstractC11478a.m30857i("[onIceConnectionReceivingChange] #sfu; #", this.f43277q, "; receiving: ", z4), null);
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
        EnumC23360a[] enumC23360aArr = EnumC23360a.f92601x;
        this.f43270j.m67653b(iceGatheringState != null ? iceGatheringState.name() : null, "onicegatheringstatechange");
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        String str = c2345kM35417f.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[onIceGatheringChange] #sfu; #" + this.f43277q + "; newState: " + iceGatheringState, null);
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRemoveStream(MediaStream mediaStream) {
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[onRemoveStream] #sfu; #track; #" + this.f43277q + "; stream: " + mediaStream, null);
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onRemoveTrack(RtpReceiver rtpReceiver) {
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[onRemoveTrack] #sfu; #track; #" + this.f43277q + "; receiver: " + rtpReceiver, null);
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRenegotiationNeeded() {
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        String str = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, AbstractC11895b.m31996o("[onRenegotiationNeeded] #sfu; #", this.f43277q, "; no args"), null);
        }
        EnumC23360a[] enumC23360aArr = EnumC23360a.f92601x;
        this.f43270j.m67653b(null, "onnegotiationneeded");
        InterfaceC4351m interfaceC4351m = this.f43264d;
        if (interfaceC4351m != null) {
            interfaceC4351m.invoke(this, this.f43261a);
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[onSelectedCandidatePairChanged] #sfu; #" + this.f43277q + "; event: " + candidatePairChangeEvent, null);
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onSignalingChange(PeerConnection.SignalingState signalingState) {
        EnumC23360a[] enumC23360aArr = EnumC23360a.f92601x;
        this.f43270j.m67653b(signalingState != null ? signalingState.name() : null, "onsignalingstatechange");
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        String str = c2345kM35417f.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[onSignalingChange] #sfu; #" + this.f43277q + "; newState: " + signalingState, null);
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onTrack(RtpTransceiver rtpTransceiver) {
        C2345k c2345kM35417f = m35417f();
        InterfaceC2339e interfaceC2339e = c2345kM35417f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345kM35417f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35417f.f9274b.log(enumC2341g, str, "[onTrack] #sfu; #" + this.f43277q + "; transceiver: " + rtpTransceiver, null);
        }
    }

    public final String toString() {
        return "StreamPeerConnection(type='" + this.f43277q + "', constraints=" + this.f43262b + ")";
    }
}
