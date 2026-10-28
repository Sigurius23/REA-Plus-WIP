package ba;

import androidx.media3.common.ParserException;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.io.EOFException;
import java.io.InterruptedIOException;
import jh3.AbstractC21702c;
import na.C26498k;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p016an.C1052c;
import p016an.C1053d;
import p216ia.C18288a;
import p499t9.C33638k;
import p499t9.C33650s;
import p499t9.C33651t;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34585c0;
import p516u8.C34608o;
import p607x8.AbstractC38046a;
import p607x8.C38059n;
import p690zr.C41060w0;
import qa.InterfaceC30105j;

/* JADX INFO: renamed from: ba.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C2893a implements InterfaceC33644n {

    /* JADX INFO: renamed from: b */
    public InterfaceC33648q f11582b;

    /* JADX INFO: renamed from: c */
    public int f11583c;

    /* JADX INFO: renamed from: d */
    public int f11584d;

    /* JADX INFO: renamed from: e */
    public int f11585e;

    /* JADX INFO: renamed from: g */
    public C18288a f11587g;

    /* JADX INFO: renamed from: h */
    public InterfaceC33646o f11588h;

    /* JADX INFO: renamed from: i */
    public C1053d f11589i;

    /* JADX INFO: renamed from: j */
    public C26498k f11590j;

    /* JADX INFO: renamed from: a */
    public final C38059n f11581a = new C38059n(6);

    /* JADX INFO: renamed from: f */
    public long f11586f = -1;

    /* JADX INFO: renamed from: a */
    public final void m8455a() {
        InterfaceC33648q interfaceC33648q = this.f11582b;
        interfaceC33648q.getClass();
        interfaceC33648q.mo3098l();
        this.f11582b.mo3109v(new C33651t(-9223372036854775807L));
        this.f11583c = 6;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        if (j7 == 0) {
            this.f11583c = 0;
            this.f11590j = null;
        } else if (this.f11583c == 5) {
            C26498k c26498k = this.f11590j;
            c26498k.getClass();
            c26498k.mo1540b(j7, j13);
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        this.f11582b = interfaceC33648q;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) throws EOFException, InterruptedIOException {
        C33638k c33638k = (C33638k) interfaceC33646o;
        C38059n c38059n = this.f11581a;
        c38059n.m121843C(2);
        c33638k.mo3092c(c38059n.f163017a, 0, 2, false);
        if (c38059n.m121873z() == 65496) {
            c38059n.m121843C(2);
            c33638k.mo3092c(c38059n.f163017a, 0, 2, false);
            int iM121873z = c38059n.m121873z();
            this.f11584d = iM121873z;
            if (iM121873z == 65504) {
                c38059n.m121843C(2);
                c33638k.mo3092c(c38059n.f163017a, 0, 2, false);
                c33638k.mo3078C(c38059n.m121873z() - 2, false);
                c38059n.m121843C(2);
                c33638k.mo3092c(c38059n.f163017a, 0, 2, false);
                this.f11584d = c38059n.m121873z();
            }
            if (this.f11584d == 65505) {
                c33638k.mo3078C(2, false);
                c38059n.m121843C(6);
                c33638k.mo3092c(c38059n.f163017a, 0, 6, false);
                if (c38059n.m121869v() == 1165519206 && c38059n.m121873z() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) throws ParserException {
        String strM121862o;
        C1052c c1052cM8457a;
        C41060w0 c41060w0;
        int i13;
        C18288a c18288a;
        long j7;
        int i14 = this.f11583c;
        C38059n c38059n = this.f11581a;
        if (i14 == 0) {
            c38059n.m121843C(2);
            interfaceC33646o.readFully(c38059n.f163017a, 0, 2);
            int iM121873z = c38059n.m121873z();
            this.f11584d = iM121873z;
            if (iM121873z == 65498) {
                if (this.f11586f != -1) {
                    this.f11583c = 4;
                    return 0;
                }
                m8455a();
                return 0;
            }
            if ((iM121873z < 65488 || iM121873z > 65497) && iM121873z != 65281) {
                this.f11583c = 1;
            }
            return 0;
        }
        if (i14 == 1) {
            c38059n.m121843C(2);
            interfaceC33646o.readFully(c38059n.f163017a, 0, 2);
            this.f11585e = c38059n.m121873z() - 2;
            this.f11583c = 2;
            return 0;
        }
        if (i14 != 2) {
            if (i14 != 4) {
                if (i14 != 5) {
                    if (i14 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f11589i == null || interfaceC33646o != this.f11588h) {
                    this.f11588h = interfaceC33646o;
                    this.f11589i = new C1053d(interfaceC33646o, this.f11586f);
                }
                C26498k c26498k = this.f11590j;
                c26498k.getClass();
                int iMo1543i = c26498k.mo1543i(this.f11589i, c33650s);
                if (iMo1543i == 1) {
                    c33650s.f140436a += this.f11586f;
                }
                return iMo1543i;
            }
            long position = interfaceC33646o.getPosition();
            long j13 = this.f11586f;
            if (position != j13) {
                c33650s.f140436a = j13;
                return 1;
            }
            if (!interfaceC33646o.mo3092c(c38059n.f163017a, 0, 1, true)) {
                m8455a();
                return 0;
            }
            interfaceC33646o.mo3093e();
            if (this.f11590j == null) {
                this.f11590j = new C26498k(InterfaceC30105j.f122843p, 8);
            }
            C1053d c1053d = new C1053d(interfaceC33646o, this.f11586f);
            this.f11589i = c1053d;
            if (!this.f11590j.mo1542h(c1053d)) {
                m8455a();
                return 0;
            }
            C26498k c26498k2 = this.f11590j;
            long j14 = this.f11586f;
            InterfaceC33648q interfaceC33648q = this.f11582b;
            interfaceC33648q.getClass();
            c26498k2.mo1541g(new C1053d(j14, interfaceC33648q, 5));
            C18288a c18288a2 = this.f11587g;
            c18288a2.getClass();
            InterfaceC33648q interfaceC33648q2 = this.f11582b;
            interfaceC33648q2.getClass();
            InterfaceC33639k0 interfaceC33639k0Mo3101o = interfaceC33648q2.mo3101o(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, 4);
            C34608o c34608o = new C34608o();
            c34608o.f145740l = AbstractC34587d0.m109382o("image/jpeg");
            c34608o.f145739k = new C34585c0(c18288a2);
            AbstractC21702c.m61152w(c34608o, interfaceC33639k0Mo3101o);
            this.f11583c = 5;
            return 0;
        }
        if (this.f11584d == 65505) {
            C38059n c38059n2 = new C38059n(this.f11585e);
            interfaceC33646o.readFully(c38059n2.f163017a, 0, this.f11585e);
            if (this.f11587g == null && "http://ns.adobe.com/xap/1.0/".equals(c38059n2.m121862o()) && (strM121862o = c38059n2.m121862o()) != null) {
                long length = interfaceC33646o.getLength();
                if (length == -1) {
                    c18288a = null;
                } else {
                    try {
                        c1052cM8457a = AbstractC2896d.m8457a(strM121862o);
                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                        AbstractC38046a.m121826u("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        c1052cM8457a = null;
                    }
                    if (c1052cM8457a != null && (i13 = (c41060w0 = c1052cM8457a.f4096b).f177069z) >= 2) {
                        int i15 = i13 - 1;
                        long j15 = -1;
                        long j16 = -1;
                        long j17 = -1;
                        long j18 = -1;
                        boolean z4 = false;
                        while (i15 >= 0) {
                            C2894b c2894b = (C2894b) c41060w0.get(i15);
                            boolean zEquals = MimeType.MIME_TYPE_VIDEO_MP4.equals(c2894b.f11591a) | z4;
                            if (i15 == 0) {
                                length -= c2894b.f11593c;
                                j7 = 0;
                            } else {
                                j7 = length - c2894b.f11592b;
                            }
                            long j19 = j7;
                            long j24 = length;
                            length = j19;
                            if (zEquals && length != j24) {
                                j18 = j24 - length;
                                j17 = length;
                                zEquals = false;
                            }
                            if (i15 == 0) {
                                j15 = length;
                                j16 = j24;
                            }
                            i15--;
                            z4 = zEquals;
                        }
                        if (j17 == -1 || j18 == -1 || j15 == -1 || j16 == -1) {
                            c18288a = null;
                        } else {
                            c18288a = new C18288a(j15, j16, c1052cM8457a.f4095a, j17, j18);
                        }
                    } else {
                        c18288a = null;
                    }
                }
                this.f11587g = c18288a;
                if (c18288a != null) {
                    this.f11586f = c18288a.f71152d;
                }
            }
        } else {
            interfaceC33646o.mo3100n(this.f11585e);
        }
        this.f11583c = 0;
        return 0;
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
        C26498k c26498k = this.f11590j;
        if (c26498k != null) {
            c26498k.getClass();
        }
    }
}
