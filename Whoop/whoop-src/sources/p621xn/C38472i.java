package p621xn;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ao.C1864b;
import co.C4853a;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import e73.C12803b;
import fo.C14658d;
import java.util.Collections;
import java.util.List;
import p031b9.C2815a0;
import p124eo.C13369a;
import p175go.C16009a;
import p199ho.C17520a;
import p199ho.C17529j;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p465rm.AbstractC31523d;
import p465rm.C31521c0;
import p465rm.C31571u;
import p465rm.SurfaceHolderCallbackC31565r;
import p619xl.C38445a;
import p654yn.C39663c;
import p654yn.C39666f;

/* JADX INFO: renamed from: xn.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C38472i extends AbstractC31523d implements Handler.Callback {

    /* JADX INFO: renamed from: M */
    public final Handler f164761M;

    /* JADX INFO: renamed from: N */
    public final SurfaceHolderCallbackC31565r f164762N;

    /* JADX INFO: renamed from: O */
    public final C38470g f164763O;

    /* JADX INFO: renamed from: P */
    public final C38445a f164764P;

    /* JADX INFO: renamed from: Q */
    public boolean f164765Q;

    /* JADX INFO: renamed from: R */
    public boolean f164766R;

    /* JADX INFO: renamed from: S */
    public boolean f164767S;

    /* JADX INFO: renamed from: T */
    public int f164768T;

    /* JADX INFO: renamed from: U */
    public C31521c0 f164769U;

    /* JADX INFO: renamed from: V */
    public InterfaceC38469f f164770V;

    /* JADX INFO: renamed from: W */
    public C38471h f164771W;

    /* JADX INFO: renamed from: X */
    public C38466c f164772X;

    /* JADX INFO: renamed from: Y */
    public C38466c f164773Y;

    /* JADX INFO: renamed from: Z */
    public int f164774Z;

    /* JADX INFO: renamed from: a0 */
    public long f164775a0;

    public C38472i(SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r, Looper looper) {
        Handler handler;
        super(3);
        this.f164762N = surfaceHolderCallbackC31565r;
        if (looper == null) {
            handler = null;
        } else {
            int i13 = AbstractC24567y.f95875a;
            handler = new Handler(looper, this);
        }
        this.f164761M = handler;
        this.f164763O = C38470g.f164759a;
        this.f164764P = new C38445a(29, false);
        this.f164775a0 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: A */
    public final void m123264A(SubtitleDecoderException subtitleDecoderException) {
        InterfaceC38469f c17520a;
        InterfaceC38469f c1864b;
        String strValueOf = String.valueOf(this.f164769U);
        StringBuilder sb4 = new StringBuilder(strValueOf.length() + 39);
        sb4.append("Subtitle decoding failed. streamFormat=");
        sb4.append(strValueOf);
        AbstractC24543a.m71578n("TextRenderer", sb4.toString(), subtitleDecoderException);
        List list = Collections.EMPTY_LIST;
        byte b = 1;
        Handler handler = this.f164761M;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            C31571u c31571u = this.f164762N.f130359w;
            c31571u.f130380E0 = list;
            c31571u.f130395M.m31625i(27, new C2815a0(list, 1));
        }
        m123265B();
        InterfaceC38469f interfaceC38469f = this.f164770V;
        interfaceC38469f.getClass();
        interfaceC38469f.release();
        this.f164770V = null;
        this.f164768T = 0;
        this.f164767S = true;
        C31521c0 c31521c0 = this.f164769U;
        c31521c0.getClass();
        this.f164763O.getClass();
        String str = c31521c0.f130077L;
        int i13 = c31521c0.f130095d0;
        List list2 = c31521c0.f130079N;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    b = !str.equals("application/dvbsubs") ? (byte) -1 : (byte) 0;
                    break;
                case -1248334819:
                    if (!str.equals("application/pgs")) {
                        b = -1;
                    }
                    break;
                case -1026075066:
                    b = !str.equals("application/x-mp4-vtt") ? (byte) -1 : (byte) 2;
                    break;
                case -1004728940:
                    b = !str.equals("text/vtt") ? (byte) -1 : (byte) 3;
                    break;
                case 691401887:
                    b = !str.equals("application/x-quicktime-tx3g") ? (byte) -1 : (byte) 4;
                    break;
                case 822864842:
                    b = !str.equals("text/x-ssa") ? (byte) -1 : (byte) 5;
                    break;
                case 930165504:
                    b = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 6;
                    break;
                case 1201784583:
                    b = !str.equals("text/x-exoplayer-cues") ? (byte) -1 : (byte) 7;
                    break;
                case 1566015601:
                    b = !str.equals("application/cea-608") ? (byte) -1 : (byte) 8;
                    break;
                case 1566016562:
                    b = !str.equals("application/cea-708") ? (byte) -1 : (byte) 9;
                    break;
                case 1668750253:
                    b = !str.equals("application/x-subrip") ? (byte) -1 : (byte) 10;
                    break;
                case 1693976202:
                    b = !str.equals("application/ttml+xml") ? (byte) -1 : (byte) 11;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    c17520a = new C17520a(list2);
                    break;
                case 1:
                    c1864b = new C1864b();
                    this.f164770V = c1864b;
                    return;
                case 2:
                    c1864b = new C17520a();
                    this.f164770V = c1864b;
                    return;
                case 3:
                    c1864b = new C17529j();
                    this.f164770V = c1864b;
                    return;
                case 4:
                    c17520a = new C16009a(list2);
                    break;
                case 5:
                    c17520a = new C4853a(list2);
                    break;
                case 6:
                case 8:
                    c1864b = new C39663c(str, i13);
                    this.f164770V = c1864b;
                    return;
                case 7:
                    c1864b = new C12803b(6);
                    this.f164770V = c1864b;
                    return;
                case 9:
                    c17520a = new C39666f(i13, list2);
                    break;
                case 10:
                    c1864b = new C13369a();
                    this.f164770V = c1864b;
                    return;
                case 11:
                    c1864b = new C14658d();
                    this.f164770V = c1864b;
                    return;
            }
            c1864b = c17520a;
            this.f164770V = c1864b;
            return;
        }
        String strValueOf2 = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf2.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf2) : new String("Attempted to create decoder for unsupported MIME type: "));
    }

    /* JADX INFO: renamed from: B */
    public final void m123265B() {
        this.f164771W = null;
        this.f164774Z = -1;
        C38466c c38466c = this.f164772X;
        if (c38466c != null) {
            c38466c.m123260o();
            this.f164772X = null;
        }
        C38466c c38466c2 = this.f164773Y;
        if (c38466c2 != null) {
            c38466c2.m123260o();
            this.f164773Y = null;
        }
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: h */
    public final String mo54420h() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        List list = (List) message.obj;
        C31571u c31571u = this.f164762N.f130359w;
        c31571u.f130380E0 = list;
        c31571u.f130395M.m31625i(27, new C2815a0(list, 1));
        return true;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: j */
    public final boolean mo49735j() {
        return this.f164766R;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: k */
    public final boolean mo49737k() {
        return true;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: l */
    public final void mo54421l() {
        this.f164769U = null;
        this.f164775a0 = -9223372036854775807L;
        List list = Collections.EMPTY_LIST;
        Handler handler = this.f164761M;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            C31571u c31571u = this.f164762N.f130359w;
            c31571u.f130380E0 = list;
            c31571u.f130395M.m31625i(27, new C2815a0(list, 1));
        }
        m123265B();
        InterfaceC38469f interfaceC38469f = this.f164770V;
        interfaceC38469f.getClass();
        interfaceC38469f.release();
        this.f164770V = null;
        this.f164768T = 0;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: n */
    public final void mo49741n(long j7, boolean z4) {
        InterfaceC38469f c17520a;
        InterfaceC38469f c1864b;
        List list = Collections.EMPTY_LIST;
        byte b = 1;
        Handler handler = this.f164761M;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            C31571u c31571u = this.f164762N.f130359w;
            c31571u.f130380E0 = list;
            c31571u.f130395M.m31625i(27, new C2815a0(list, 1));
        }
        this.f164765Q = false;
        this.f164766R = false;
        this.f164775a0 = -9223372036854775807L;
        if (this.f164768T == 0) {
            m123265B();
            InterfaceC38469f interfaceC38469f = this.f164770V;
            interfaceC38469f.getClass();
            interfaceC38469f.flush();
            return;
        }
        m123265B();
        InterfaceC38469f interfaceC38469f2 = this.f164770V;
        interfaceC38469f2.getClass();
        interfaceC38469f2.release();
        this.f164770V = null;
        this.f164768T = 0;
        this.f164767S = true;
        C31521c0 c31521c0 = this.f164769U;
        c31521c0.getClass();
        this.f164763O.getClass();
        String str = c31521c0.f130077L;
        int i13 = c31521c0.f130095d0;
        List list2 = c31521c0.f130079N;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    b = !str.equals("application/dvbsubs") ? (byte) -1 : (byte) 0;
                    break;
                case -1248334819:
                    if (!str.equals("application/pgs")) {
                        b = -1;
                    }
                    break;
                case -1026075066:
                    b = !str.equals("application/x-mp4-vtt") ? (byte) -1 : (byte) 2;
                    break;
                case -1004728940:
                    b = !str.equals("text/vtt") ? (byte) -1 : (byte) 3;
                    break;
                case 691401887:
                    b = !str.equals("application/x-quicktime-tx3g") ? (byte) -1 : (byte) 4;
                    break;
                case 822864842:
                    b = !str.equals("text/x-ssa") ? (byte) -1 : (byte) 5;
                    break;
                case 930165504:
                    b = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 6;
                    break;
                case 1201784583:
                    b = !str.equals("text/x-exoplayer-cues") ? (byte) -1 : (byte) 7;
                    break;
                case 1566015601:
                    b = !str.equals("application/cea-608") ? (byte) -1 : (byte) 8;
                    break;
                case 1566016562:
                    b = !str.equals("application/cea-708") ? (byte) -1 : (byte) 9;
                    break;
                case 1668750253:
                    b = !str.equals("application/x-subrip") ? (byte) -1 : (byte) 10;
                    break;
                case 1693976202:
                    b = !str.equals("application/ttml+xml") ? (byte) -1 : (byte) 11;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    c17520a = new C17520a(list2);
                    break;
                case 1:
                    c1864b = new C1864b();
                    this.f164770V = c1864b;
                    return;
                case 2:
                    c1864b = new C17520a();
                    this.f164770V = c1864b;
                    return;
                case 3:
                    c1864b = new C17529j();
                    this.f164770V = c1864b;
                    return;
                case 4:
                    c17520a = new C16009a(list2);
                    break;
                case 5:
                    c17520a = new C4853a(list2);
                    break;
                case 6:
                case 8:
                    c1864b = new C39663c(str, i13);
                    this.f164770V = c1864b;
                    return;
                case 7:
                    c1864b = new C12803b(6);
                    this.f164770V = c1864b;
                    return;
                case 9:
                    c17520a = new C39666f(i13, list2);
                    break;
                case 10:
                    c1864b = new C13369a();
                    this.f164770V = c1864b;
                    return;
                case 11:
                    c1864b = new C14658d();
                    this.f164770V = c1864b;
                    return;
            }
            c1864b = c17520a;
            this.f164770V = c1864b;
            return;
        }
        String strValueOf = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: r */
    public final void mo49743r(C31521c0[] c31521c0Arr, long j7, long j13) {
        InterfaceC38469f c17520a;
        InterfaceC38469f c1864b;
        byte b = 0;
        C31521c0 c31521c0 = c31521c0Arr[0];
        this.f164769U = c31521c0;
        if (this.f164770V != null) {
            this.f164768T = 1;
            return;
        }
        this.f164767S = true;
        c31521c0.getClass();
        this.f164763O.getClass();
        String str = c31521c0.f130077L;
        int i13 = c31521c0.f130095d0;
        List list = c31521c0.f130079N;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (!str.equals("application/dvbsubs")) {
                        b = -1;
                    }
                    break;
                case -1248334819:
                    b = !str.equals("application/pgs") ? (byte) -1 : (byte) 1;
                    break;
                case -1026075066:
                    b = !str.equals("application/x-mp4-vtt") ? (byte) -1 : (byte) 2;
                    break;
                case -1004728940:
                    b = !str.equals("text/vtt") ? (byte) -1 : (byte) 3;
                    break;
                case 691401887:
                    b = !str.equals("application/x-quicktime-tx3g") ? (byte) -1 : (byte) 4;
                    break;
                case 822864842:
                    b = !str.equals("text/x-ssa") ? (byte) -1 : (byte) 5;
                    break;
                case 930165504:
                    b = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 6;
                    break;
                case 1201784583:
                    b = !str.equals("text/x-exoplayer-cues") ? (byte) -1 : (byte) 7;
                    break;
                case 1566015601:
                    b = !str.equals("application/cea-608") ? (byte) -1 : (byte) 8;
                    break;
                case 1566016562:
                    b = !str.equals("application/cea-708") ? (byte) -1 : (byte) 9;
                    break;
                case 1668750253:
                    b = !str.equals("application/x-subrip") ? (byte) -1 : (byte) 10;
                    break;
                case 1693976202:
                    b = !str.equals("application/ttml+xml") ? (byte) -1 : (byte) 11;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    c17520a = new C17520a(list);
                    c1864b = c17520a;
                    this.f164770V = c1864b;
                    return;
                case 1:
                    c1864b = new C1864b();
                    this.f164770V = c1864b;
                    return;
                case 2:
                    c1864b = new C17520a();
                    this.f164770V = c1864b;
                    return;
                case 3:
                    c1864b = new C17529j();
                    this.f164770V = c1864b;
                    return;
                case 4:
                    c17520a = new C16009a(list);
                    c1864b = c17520a;
                    this.f164770V = c1864b;
                    return;
                case 5:
                    c17520a = new C4853a(list);
                    c1864b = c17520a;
                    this.f164770V = c1864b;
                    return;
                case 6:
                case 8:
                    c1864b = new C39663c(str, i13);
                    this.f164770V = c1864b;
                    return;
                case 7:
                    c1864b = new C12803b(6);
                    this.f164770V = c1864b;
                    return;
                case 9:
                    c17520a = new C39666f(i13, list);
                    c1864b = c17520a;
                    this.f164770V = c1864b;
                    return;
                case 10:
                    c1864b = new C13369a();
                    this.f164770V = c1864b;
                    return;
                case 11:
                    c1864b = new C14658d();
                    this.f164770V = c1864b;
                    return;
            }
        }
        String strValueOf = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: t */
    public final void mo49744t(long j7, long j13) {
        boolean z4;
        InterfaceC38469f c17520a;
        InterfaceC38469f c1864b;
        C38445a c38445a = this.f164764P;
        if (this.f130108K) {
            long j14 = this.f164775a0;
            if (j14 != -9223372036854775807L && j7 >= j14) {
                m123265B();
                this.f164766R = true;
            }
        }
        if (this.f164766R) {
            return;
        }
        if (this.f164773Y == null) {
            InterfaceC38469f interfaceC38469f = this.f164770V;
            interfaceC38469f.getClass();
            interfaceC38469f.mo35859a(j7);
            try {
                InterfaceC38469f interfaceC38469f2 = this.f164770V;
                interfaceC38469f2.getClass();
                this.f164773Y = (C38466c) interfaceC38469f2.mo35860b();
            } catch (SubtitleDecoderException e5) {
                m123264A(e5);
                return;
            }
        }
        if (this.f130103F != 2) {
            return;
        }
        if (this.f164772X != null) {
            long jM123266z = m123266z();
            z4 = false;
            while (jM123266z <= j7) {
                this.f164774Z++;
                jM123266z = m123266z();
                z4 = true;
            }
        } else {
            z4 = false;
        }
        C38466c c38466c = this.f164773Y;
        if (c38466c != null) {
            if (c38466c.m1496f(4)) {
                if (!z4 && m123266z() == Long.MAX_VALUE) {
                    if (this.f164768T == 2) {
                        m123265B();
                        InterfaceC38469f interfaceC38469f3 = this.f164770V;
                        interfaceC38469f3.getClass();
                        interfaceC38469f3.release();
                        this.f164770V = null;
                        this.f164768T = 0;
                        this.f164767S = true;
                        C31521c0 c31521c0 = this.f164769U;
                        c31521c0.getClass();
                        this.f164763O.getClass();
                        String str = c31521c0.f130077L;
                        int i13 = c31521c0.f130095d0;
                        List list = c31521c0.f130079N;
                        if (str != null) {
                            switch (str) {
                                case "application/dvbsubs":
                                    c17520a = new C17520a(list);
                                    c1864b = c17520a;
                                    this.f164770V = c1864b;
                                    break;
                                case "application/pgs":
                                    c1864b = new C1864b();
                                    this.f164770V = c1864b;
                                    break;
                                case "application/x-mp4-vtt":
                                    c1864b = new C17520a();
                                    this.f164770V = c1864b;
                                    break;
                                case "text/vtt":
                                    c1864b = new C17529j();
                                    this.f164770V = c1864b;
                                    break;
                                case "application/x-quicktime-tx3g":
                                    c17520a = new C16009a(list);
                                    c1864b = c17520a;
                                    this.f164770V = c1864b;
                                    break;
                                case "text/x-ssa":
                                    c17520a = new C4853a(list);
                                    c1864b = c17520a;
                                    this.f164770V = c1864b;
                                    break;
                                case "application/x-mp4-cea-608":
                                case "application/cea-608":
                                    c1864b = new C39663c(str, i13);
                                    this.f164770V = c1864b;
                                    break;
                                case "text/x-exoplayer-cues":
                                    c1864b = new C12803b(6);
                                    this.f164770V = c1864b;
                                    break;
                                case "application/cea-708":
                                    c17520a = new C39666f(i13, list);
                                    c1864b = c17520a;
                                    this.f164770V = c1864b;
                                    break;
                                case "application/x-subrip":
                                    c1864b = new C13369a();
                                    this.f164770V = c1864b;
                                    break;
                                case "application/ttml+xml":
                                    c1864b = new C14658d();
                                    this.f164770V = c1864b;
                                    break;
                            }
                        }
                        String strValueOf = String.valueOf(str);
                        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
                    }
                    m123265B();
                    this.f164766R = true;
                }
            } else if (c38466c.f164745y <= j7) {
                C38466c c38466c2 = this.f164772X;
                if (c38466c2 != null) {
                    c38466c2.m123260o();
                }
                this.f164774Z = c38466c.mo1673b(j7);
                this.f164772X = c38466c;
                this.f164773Y = null;
                z4 = true;
            }
        }
        if (z4) {
            this.f164772X.getClass();
            List listMo1674d = this.f164772X.mo1674d(j7);
            Handler handler = this.f164761M;
            if (handler != null) {
                handler.obtainMessage(0, listMo1674d).sendToTarget();
            } else {
                C31571u c31571u = this.f164762N.f130359w;
                c31571u.f130380E0 = listMo1674d;
                c31571u.f130395M.m31625i(27, new C2815a0(listMo1674d, 1));
            }
        }
        if (this.f164768T == 2) {
            return;
        }
        while (!this.f164765Q) {
            try {
                C38471h c38471h = this.f164771W;
                if (c38471h == null) {
                    InterfaceC38469f interfaceC38469f4 = this.f164770V;
                    interfaceC38469f4.getClass();
                    c38471h = (C38471h) interfaceC38469f4.mo35861c();
                    if (c38471h == null) {
                        return;
                    } else {
                        this.f164771W = c38471h;
                    }
                }
                if (this.f164768T == 1) {
                    c38471h.f2052x = 4;
                    InterfaceC38469f interfaceC38469f5 = this.f164770V;
                    interfaceC38469f5.getClass();
                    interfaceC38469f5.mo35862d(c38471h);
                    this.f164771W = null;
                    this.f164768T = 2;
                    return;
                }
                int iM97120s = m97120s(c38445a, c38471h, 0);
                if (iM97120s == -4) {
                    if (c38471h.m1496f(4)) {
                        this.f164765Q = true;
                        this.f164767S = false;
                    } else {
                        C31521c0 c31521c1 = (C31521c0) c38445a.f164637y;
                        if (c31521c1 == null) {
                            return;
                        }
                        c38471h.f164760I = c31521c1.f130081P;
                        c38471h.m110919r();
                        this.f164767S &= !c38471h.m1496f(1);
                    }
                    if (!this.f164767S) {
                        InterfaceC38469f interfaceC38469f6 = this.f164770V;
                        interfaceC38469f6.getClass();
                        interfaceC38469f6.mo35862d(c38471h);
                        this.f164771W = null;
                    }
                } else if (iM97120s == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e13) {
                m123264A(e13);
                return;
            }
        }
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: x */
    public final int mo49746x(C31521c0 c31521c0) {
        this.f164763O.getClass();
        String str = c31521c0.f130077L;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return AbstractC31523d.m97116d(c31521c0.f130096e0 == 0 ? 4 : 2, 0, 0);
        }
        return AbstractC24555m.m71615i(c31521c0.f130077L) ? AbstractC31523d.m97116d(1, 0, 0) : AbstractC31523d.m97116d(0, 0, 0);
    }

    /* JADX INFO: renamed from: z */
    public final long m123266z() {
        if (this.f164774Z == -1) {
            return Long.MAX_VALUE;
        }
        this.f164772X.getClass();
        if (this.f164774Z >= this.f164772X.mo1676j()) {
            return Long.MAX_VALUE;
        }
        return this.f164772X.mo1675h(this.f164774Z);
    }
}
