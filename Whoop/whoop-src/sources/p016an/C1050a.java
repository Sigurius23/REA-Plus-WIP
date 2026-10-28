package p016an;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import ed3.C13117a;
import in.C18715c;
import in.InterfaceC18714b;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.io.EOFException;
import java.io.InterruptedIOException;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p094dn.AbstractC12191k;
import p094dn.C12193m;
import p373on.C28041b;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p499t9.C33650s;
import p588wm.C37364f;
import p588wm.C37370l;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;
import p690zr.C41060w0;

/* JADX INFO: renamed from: an.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C1050a implements InterfaceC37367i {

    /* JADX INFO: renamed from: b */
    public InterfaceC37369k f4083b;

    /* JADX INFO: renamed from: c */
    public int f4084c;

    /* JADX INFO: renamed from: d */
    public int f4085d;

    /* JADX INFO: renamed from: e */
    public int f4086e;

    /* JADX INFO: renamed from: g */
    public C28041b f4088g;

    /* JADX INFO: renamed from: h */
    public InterfaceC37368j f4089h;

    /* JADX INFO: renamed from: i */
    public C1053d f4090i;

    /* JADX INFO: renamed from: j */
    public C12193m f4091j;

    /* JADX INFO: renamed from: a */
    public final C13117a f4082a = new C13117a(6);

    /* JADX INFO: renamed from: f */
    public long f4087f = -1;

    /* JADX INFO: renamed from: a */
    public final void m3070a() {
        m3072c(new InterfaceC18714b[0]);
        InterfaceC37369k interfaceC37369k = this.f4083b;
        interfaceC37369k.getClass();
        interfaceC37369k.mo3098l();
        this.f4083b.mo3111x(new C37370l(-9223372036854775807L));
        this.f4084c = 6;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: b */
    public final void mo3071b(long j7, long j13) {
        if (j7 == 0) {
            this.f4084c = 0;
            this.f4091j = null;
        } else if (this.f4084c == 5) {
            C12193m c12193m = this.f4091j;
            c12193m.getClass();
            c12193m.mo3071b(j7, j13);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3072c(InterfaceC18714b... interfaceC18714bArr) {
        InterfaceC37369k interfaceC37369k = this.f4083b;
        interfaceC37369k.getClass();
        InterfaceC37377s interfaceC37377sMo3102o = interfaceC37369k.mo3102o(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, 4);
        C31518b0 c31518b0 = new C31518b0();
        c31518b0.f130046j = "image/jpeg";
        c31518b0.f130045i = new C18715c(interfaceC18714bArr);
        interfaceC37377sMo3102o.mo102730a(new C31521c0(c31518b0));
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: g */
    public final boolean mo3073g(InterfaceC37368j interfaceC37368j) throws EOFException, InterruptedIOException {
        C37364f c37364f = (C37364f) interfaceC37368j;
        C13117a c13117a = this.f4082a;
        c13117a.m36686H(2);
        c37364f.mo3092c(c13117a.f45381a, 0, 2, false);
        if (c13117a.m36682D() == 65496) {
            c13117a.m36686H(2);
            c37364f.mo3092c(c13117a.f45381a, 0, 2, false);
            int iM36682D = c13117a.m36682D();
            this.f4085d = iM36682D;
            if (iM36682D == 65504) {
                c13117a.m36686H(2);
                c37364f.mo3092c(c13117a.f45381a, 0, 2, false);
                c37364f.m119648a(c13117a.m36682D() - 2, false);
                c13117a.m36686H(2);
                c37364f.mo3092c(c13117a.f45381a, 0, 2, false);
                this.f4085d = c13117a.m36682D();
            }
            if (this.f4085d == 65505) {
                c37364f.m119648a(2, false);
                c13117a.m36686H(6);
                c37364f.mo3092c(c13117a.f45381a, 0, 6, false);
                if (c13117a.m36716z() == 1165519206 && c13117a.m36682D() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: h */
    public final void mo3074h(InterfaceC37369k interfaceC37369k) {
        this.f4083b = interfaceC37369k;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: i */
    public final int mo3075i(InterfaceC37368j interfaceC37368j, C33650s c33650s) throws ParserException, EOFException, InterruptedIOException {
        String strM36708r;
        C1052c c1052cM3115a;
        C41060w0 c41060w0;
        int i13;
        C28041b c28041b;
        long j7;
        int i14 = this.f4084c;
        C13117a c13117a = this.f4082a;
        if (i14 == 0) {
            c13117a.m36686H(2);
            ((C37364f) interfaceC37368j).mo3094f(c13117a.f45381a, 0, 2, false);
            int iM36682D = c13117a.m36682D();
            this.f4085d = iM36682D;
            if (iM36682D == 65498) {
                if (this.f4087f != -1) {
                    this.f4084c = 4;
                    return 0;
                }
                m3070a();
                return 0;
            }
            if ((iM36682D < 65488 || iM36682D > 65497) && iM36682D != 65281) {
                this.f4084c = 1;
            }
            return 0;
        }
        if (i14 == 1) {
            c13117a.m36686H(2);
            ((C37364f) interfaceC37368j).mo3094f(c13117a.f45381a, 0, 2, false);
            this.f4086e = c13117a.m36682D() - 2;
            this.f4084c = 2;
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
                if (this.f4090i == null || interfaceC37368j != this.f4089h) {
                    this.f4089h = interfaceC37368j;
                    this.f4090i = new C1053d(interfaceC37368j, this.f4087f);
                }
                C12193m c12193m = this.f4091j;
                c12193m.getClass();
                int iMo3075i = c12193m.mo3075i(this.f4090i, c33650s);
                if (iMo3075i == 1) {
                    c33650s.f140436a += this.f4087f;
                }
                return iMo3075i;
            }
            long j13 = ((C37364f) interfaceC37368j).f159852z;
            long j14 = this.f4087f;
            if (j13 != j14) {
                c33650s.f140436a = j14;
                return 1;
            }
            C37364f c37364f = (C37364f) interfaceC37368j;
            if (!c37364f.mo3092c(c13117a.f45381a, 0, 1, true)) {
                m3070a();
                return 0;
            }
            c37364f.f159847F = 0;
            if (this.f4091j == null) {
                this.f4091j = new C12193m(0);
            }
            C1053d c1053d = new C1053d(interfaceC37368j, this.f4087f);
            this.f4090i = c1053d;
            this.f4091j.getClass();
            if (!AbstractC12191k.m33815i(c1053d, false, false)) {
                m3070a();
                return 0;
            }
            C12193m c12193m2 = this.f4091j;
            long j15 = this.f4087f;
            InterfaceC37369k interfaceC37369k = this.f4083b;
            interfaceC37369k.getClass();
            c12193m2.f40704q = new C1053d(j15, interfaceC37369k, 1);
            C28041b c28041b2 = this.f4088g;
            c28041b2.getClass();
            m3072c(c28041b2);
            this.f4084c = 5;
            return 0;
        }
        if (this.f4085d == 65505) {
            C13117a c13117a2 = new C13117a(this.f4086e);
            ((C37364f) interfaceC37368j).mo3094f(c13117a2.f45381a, 0, this.f4086e, false);
            if (this.f4088g == null && "http://ns.adobe.com/xap/1.0/".equals(c13117a2.m36708r()) && (strM36708r = c13117a2.m36708r()) != null) {
                long j16 = ((C37364f) interfaceC37368j).f159851y;
                if (j16 == -1) {
                    c28041b = null;
                } else {
                    try {
                        c1052cM3115a = AbstractC1055f.m3115a(strM36708r);
                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                        Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        c1052cM3115a = null;
                    }
                    if (c1052cM3115a != null && (i13 = (c41060w0 = c1052cM3115a.f4096b).f177069z) >= 2) {
                        int i15 = i13 - 1;
                        long j17 = -1;
                        long j18 = -1;
                        long j19 = -1;
                        long j24 = -1;
                        boolean z4 = false;
                        while (i15 >= 0) {
                            C1051b c1051b = (C1051b) c41060w0.get(i15);
                            boolean zEquals = MimeType.MIME_TYPE_VIDEO_MP4.equals(c1051b.f4092a) | z4;
                            if (i15 == 0) {
                                j16 -= c1051b.f4094c;
                                j7 = 0;
                            } else {
                                j7 = j16 - c1051b.f4093b;
                            }
                            long j25 = j7;
                            long j26 = j16;
                            j16 = j25;
                            if (zEquals && j16 != j26) {
                                j24 = j26 - j16;
                                j19 = j16;
                                zEquals = false;
                            }
                            if (i15 == 0) {
                                j17 = j16;
                                j18 = j26;
                            }
                            i15--;
                            z4 = zEquals;
                        }
                        if (j19 == -1 || j24 == -1 || j17 == -1 || j18 == -1) {
                            c28041b = null;
                        } else {
                            c28041b = new C28041b(j17, j18, c1052cM3115a.f4095a, j19, j24);
                        }
                    } else {
                        c28041b = null;
                    }
                }
                this.f4088g = c28041b;
                if (c28041b != null) {
                    this.f4087f = c28041b.f113176z;
                }
            }
        } else {
            ((C37364f) interfaceC37368j).mo3100n(this.f4086e);
        }
        this.f4084c = 0;
        return 0;
    }

    @Override // p588wm.InterfaceC37367i
    public final void release() {
        C12193m c12193m = this.f4091j;
        if (c12193m != null) {
            c12193m.getClass();
        }
    }
}
