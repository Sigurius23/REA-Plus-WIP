package zm;

import androidx.recyclerview.widget.AbstractC1707m0;
import com.google.android.exoplayer2.ParserException;
import com.iterable.iterableapi.C5363q;
import ed3.C13117a;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mo.C25720a;
import p309lo.AbstractC24543a;
import p309lo.C24561s;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p499t9.C33650s;
import p588wm.C37364f;
import p588wm.C37366h;
import p588wm.C37370l;
import p588wm.C37372n;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;
import r80.AbstractC31061c;
import tm.AbstractC33922a;

/* JADX INFO: renamed from: zm.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C40882b implements InterfaceC37367i {

    /* JADX INFO: renamed from: a */
    public final C13117a f176183a = new C13117a(4);

    /* JADX INFO: renamed from: b */
    public final C13117a f176184b = new C13117a(9);

    /* JADX INFO: renamed from: c */
    public final C13117a f176185c = new C13117a(11);

    /* JADX INFO: renamed from: d */
    public final C13117a f176186d = new C13117a();

    /* JADX INFO: renamed from: e */
    public final C40883c f176187e;

    /* JADX INFO: renamed from: f */
    public InterfaceC37369k f176188f;

    /* JADX INFO: renamed from: g */
    public int f176189g;

    /* JADX INFO: renamed from: h */
    public boolean f176190h;

    /* JADX INFO: renamed from: i */
    public long f176191i;

    /* JADX INFO: renamed from: j */
    public int f176192j;

    /* JADX INFO: renamed from: k */
    public int f176193k;

    /* JADX INFO: renamed from: l */
    public int f176194l;

    /* JADX INFO: renamed from: m */
    public long f176195m;

    /* JADX INFO: renamed from: n */
    public boolean f176196n;

    /* JADX INFO: renamed from: o */
    public C40881a f176197o;

    /* JADX INFO: renamed from: p */
    public C40884d f176198p;

    public C40882b() {
        C40883c c40883c = new C40883c(new C37366h(), 9);
        c40883c.f176200y = -9223372036854775807L;
        c40883c.f176201z = new long[0];
        c40883c.f176199E = new long[0];
        this.f176187e = c40883c;
        this.f176189g = 1;
    }

    /* JADX INFO: renamed from: a */
    public final C13117a m132499a(InterfaceC37368j interfaceC37368j) {
        int i13 = this.f176194l;
        C13117a c13117a = this.f176186d;
        byte[] bArr = c13117a.f45381a;
        if (i13 > bArr.length) {
            c13117a.m36687I(0, new byte[Math.max(bArr.length * 2, i13)]);
        } else {
            c13117a.m36689K(0);
        }
        c13117a.m36688J(this.f176194l);
        interfaceC37368j.readFully(c13117a.f45381a, 0, this.f176194l);
        return c13117a;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: b */
    public final void mo3071b(long j7, long j13) {
        if (j7 == 0) {
            this.f176189g = 1;
            this.f176190h = false;
        } else {
            this.f176189g = 3;
        }
        this.f176192j = 0;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: g */
    public final boolean mo3073g(InterfaceC37368j interfaceC37368j) throws EOFException, InterruptedIOException {
        C13117a c13117a = this.f176183a;
        C37364f c37364f = (C37364f) interfaceC37368j;
        c37364f.mo3092c(c13117a.f45381a, 0, 3, false);
        c13117a.m36689K(0);
        if (c13117a.m36679A() == 4607062) {
            c37364f.mo3092c(c13117a.f45381a, 0, 2, false);
            c13117a.m36689K(0);
            if ((c13117a.m36682D() & AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION) == 0) {
                c37364f.mo3092c(c13117a.f45381a, 0, 4, false);
                c13117a.m36689K(0);
                int iM36699i = c13117a.m36699i();
                c37364f.f159847F = 0;
                c37364f.m119648a(iM36699i, false);
                c37364f.mo3092c(c13117a.f45381a, 0, 4, false);
                c13117a.m36689K(0);
                if (c13117a.m36699i() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: h */
    public final void mo3074h(InterfaceC37369k interfaceC37369k) {
        this.f176188f = interfaceC37369k;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x028f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0295  */
    /* JADX WARN: Code duplicated, block: B:147:0x038d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0391  */
    /* JADX WARN: Code duplicated, block: B:186:0x039b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0161  */
    /* JADX WARN: Code duplicated, block: B:61:0x0165  */
    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: i */
    public final int mo3075i(InterfaceC37368j interfaceC37368j, C33650s c33650s) throws ParserException, EOFException, InterruptedIOException {
        long j7;
        long j13;
        int i13;
        int i14;
        long j14;
        boolean z4;
        boolean z13;
        boolean z14;
        long j15;
        AbstractC24543a.m71574j(this.f176188f);
        while (true) {
            int i15 = this.f176189g;
            if (i15 == 1) {
                C13117a c13117a = this.f176184b;
                if (!((C37364f) interfaceC37368j).mo3094f(c13117a.f45381a, 0, 9, true)) {
                    return -1;
                }
                c13117a.m36689K(0);
                c13117a.m36690L(4);
                int iM36715y = c13117a.m36715y();
                boolean z15 = (iM36715y & 4) != 0;
                boolean z16 = (iM36715y & 1) != 0;
                if (z15 && this.f176197o == null) {
                    this.f176197o = new C40881a(this.f176188f.mo3102o(8, 1), 9);
                }
                if (z16 && this.f176198p == null) {
                    this.f176198p = new C40884d(this.f176188f.mo3102o(9, 2));
                }
                this.f176188f.mo3098l();
                this.f176192j = c13117a.m36699i() - 5;
                this.f176189g = 2;
            } else if (i15 == 2) {
                ((C37364f) interfaceC37368j).mo3100n(this.f176192j);
                this.f176192j = 0;
                this.f176189g = 3;
            } else if (i15 == 3) {
                C13117a c13117a2 = this.f176185c;
                if (!((C37364f) interfaceC37368j).mo3094f(c13117a2.f45381a, 0, 11, true)) {
                    return -1;
                }
                c13117a2.m36689K(0);
                this.f176193k = c13117a2.m36715y();
                this.f176194l = c13117a2.m36679A();
                this.f176195m = c13117a2.m36679A();
                this.f176195m = (((long) (c13117a2.m36715y() << 24)) | this.f176195m) * 1000;
                c13117a2.m36690L(3);
                this.f176189g = 4;
            } else {
                if (i15 != 4) {
                    throw new IllegalStateException();
                }
                boolean z17 = this.f176190h;
                C40883c c40883c = this.f176187e;
                if (z17) {
                    j7 = this.f176191i + this.f176195m;
                } else {
                    if (c40883c.f176200y == -9223372036854775807L) {
                        j13 = 0;
                    } else {
                        j7 = this.f176195m;
                    }
                    i13 = this.f176193k;
                    if (i13 == 8 || this.f176197o == null) {
                        i14 = 0;
                        if (i13 == 9 || this.f176198p == null) {
                            j14 = -9223372036854775807L;
                            if (i13 == 18 || this.f176196n) {
                                ((C37364f) interfaceC37368j).mo3100n(this.f176194l);
                                z4 = false;
                                z13 = false;
                            } else {
                                C13117a c13117aM132499a = m132499a(interfaceC37368j);
                                c40883c.getClass();
                                c40883c.getClass();
                                if (c13117aM132499a.m36715y() == 2 && "onMetaData".equals(C40883c.m132502S(c13117aM132499a)) && c13117aM132499a.m36692a() != 0 && c13117aM132499a.m36715y() == 8) {
                                    HashMap mapM132501R = C40883c.m132501R(c13117aM132499a);
                                    Object obj = mapM132501R.get(AttachmentExtensionsKt.EXTRA_DURATION);
                                    double d3 = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double dDoubleValue = ((Double) obj).doubleValue();
                                        if (dDoubleValue > 0.0d) {
                                            c40883c.f176200y = (long) (dDoubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = mapM132501R.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            c40883c.f176201z = new long[size];
                                            c40883c.f176199E = new long[size];
                                            int i16 = 0;
                                            while (i16 < size) {
                                                Object obj5 = list.get(i16);
                                                Object obj6 = list2.get(i16);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    c40883c.f176201z = new long[0];
                                                    c40883c.f176199E = new long[0];
                                                    break;
                                                }
                                                double d14 = d3;
                                                c40883c.f176201z[i16] = (long) (((Double) obj6).doubleValue() * d14);
                                                c40883c.f176199E[i16] = ((Double) obj5).longValue();
                                                i16++;
                                                d3 = d14;
                                            }
                                        }
                                    }
                                }
                                long j16 = c40883c.f176200y;
                                if (j16 != -9223372036854775807L) {
                                    this.f176188f.mo3111x(new C37372n(j16, c40883c.f176199E, c40883c.f176201z));
                                    this.f176196n = true;
                                }
                                z13 = false;
                            }
                        } else {
                            if (!this.f176196n) {
                                this.f176188f.mo3111x(new C37370l(-9223372036854775807L));
                                this.f176196n = true;
                            }
                            C40884d c40884d = this.f176198p;
                            C13117a c13117aM132499a2 = m132499a(interfaceC37368j);
                            c40884d.getClass();
                            int iM36715y2 = c13117aM132499a2.m36715y();
                            int i17 = (iM36715y2 >> 4) & 15;
                            int i18 = iM36715y2 & 15;
                            if (i18 != 7) {
                                final String strM95634j = AbstractC31061c.m95634j(39, i18, "Video format not supported: ");
                                throw new ParserException(strM95634j) { // from class: com.google.android.exoplayer2.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            c40884d.f176205H = i17;
                            if (i17 != 5) {
                                C13117a c13117a3 = c40884d.f176206y;
                                InterfaceC37377s interfaceC37377s = (InterfaceC37377s) c40884d.f475x;
                                C13117a c13117a4 = c40884d.f176207z;
                                int iM36715y3 = c13117aM132499a2.m36715y();
                                byte[] bArr = c13117aM132499a2.f45381a;
                                int i19 = c13117aM132499a2.f45382b;
                                int i24 = i19 + 1;
                                c13117aM132499a2.f45382b = i24;
                                j14 = -9223372036854775807L;
                                int i25 = ((bArr[i19] & 255) << 24) >> 8;
                                int i26 = i19 + 2;
                                c13117aM132499a2.f45382b = i26;
                                int i27 = i25 | ((bArr[i24] & 255) << 8);
                                c13117aM132499a2.f45382b = i19 + 3;
                                long j17 = (((long) (i27 | (bArr[i26] & 255))) * 1000) + j13;
                                boolean z18 = false;
                                if (iM36715y3 == 0 && !c40884d.f176203F) {
                                    byte[] bArr2 = new byte[c13117aM132499a2.m36692a()];
                                    C13117a c13117a5 = new C13117a(bArr2, 1, (byte) 0);
                                    c13117aM132499a2.m36697g(bArr2, 0, c13117aM132499a2.m36692a());
                                    C25720a c25720aM75837a = C25720a.m75837a(c13117a5);
                                    c40884d.f176202E = c25720aM75837a.f101320b;
                                    C31518b0 c31518b0 = new C31518b0();
                                    c31518b0.f130047k = "video/avc";
                                    c31518b0.f130044h = c25720aM75837a.f101324f;
                                    c31518b0.f130052p = c25720aM75837a.f101321c;
                                    c31518b0.f130053q = c25720aM75837a.f101322d;
                                    c31518b0.f130056t = c25720aM75837a.f101323e;
                                    c31518b0.f130049m = c25720aM75837a.f101319a;
                                    interfaceC37377s.mo102730a(new C31521c0(c31518b0));
                                    c40884d.f176203F = true;
                                } else if (iM36715y3 == 1 && c40884d.f176203F) {
                                    int i28 = c40884d.f176205H == 1 ? 1 : 0;
                                    if (c40884d.f176204G || i28 != 0) {
                                        byte[] bArr3 = c13117a4.f45381a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i29 = 4 - c40884d.f176202E;
                                        int i34 = 0;
                                        while (c13117aM132499a2.m36692a() > 0) {
                                            c13117aM132499a2.m36697g(c13117a4.f45381a, i29, c40884d.f176202E);
                                            c13117a4.m36689K(0);
                                            int iM36680B = c13117a4.m36680B();
                                            c13117a3.m36689K(0);
                                            interfaceC37377s.mo102732c(4, c13117a3);
                                            interfaceC37377s.mo102732c(iM36680B, c13117aM132499a2);
                                            i34 = i34 + 4 + iM36680B;
                                        }
                                        ((InterfaceC37377s) c40884d.f475x).mo102733d(j17, i28, i34, 0, null);
                                        c40884d.f176204G = true;
                                        z18 = true;
                                    }
                                }
                                if (z18) {
                                    z14 = true;
                                }
                                z13 = z14;
                            } else {
                                j14 = -9223372036854775807L;
                            }
                            z14 = false;
                            z13 = z14;
                        }
                        z4 = true;
                    } else {
                        if (!this.f176196n) {
                            this.f176188f.mo3111x(new C37370l(-9223372036854775807L));
                            this.f176196n = true;
                        }
                        C40881a c40881a = this.f176197o;
                        C13117a c13117aM132499a3 = m132499a(interfaceC37368j);
                        InterfaceC37377s interfaceC37377s2 = (InterfaceC37377s) c40881a.f475x;
                        if (c40881a.f176181y) {
                            c13117aM132499a3.m36690L(1);
                        } else {
                            int iM36715y4 = c13117aM132499a3.m36715y();
                            int i35 = (iM36715y4 >> 4) & 15;
                            c40881a.f176180E = i35;
                            if (i35 == 2) {
                                int i36 = C40881a.f176179F[(iM36715y4 >> 2) & 3];
                                C31518b0 c31518b1 = new C31518b0();
                                c31518b1.f130047k = "audio/mpeg";
                                c31518b1.f130060x = 1;
                                c31518b1.f130061y = i36;
                                interfaceC37377s2.mo102730a(new C31521c0(c31518b1));
                                c40881a.f176182z = true;
                            } else if (i35 == 7 || i35 == 8) {
                                String str = i35 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                C31518b0 c31518b2 = new C31518b0();
                                c31518b2.f130047k = str;
                                c31518b2.f130060x = 1;
                                c31518b2.f130061y = 8000;
                                interfaceC37377s2.mo102730a(new C31521c0(c31518b2));
                                c40881a.f176182z = true;
                            } else if (i35 != 10) {
                                final String strM95634j2 = AbstractC31061c.m95634j(39, c40881a.f176180E, "Audio format not supported: ");
                                throw new ParserException(strM95634j2) { // from class: com.google.android.exoplayer2.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            c40881a.f176181y = true;
                        }
                        InterfaceC37377s interfaceC37377s3 = (InterfaceC37377s) c40881a.f475x;
                        z13 = true;
                        if (c40881a.f176180E == 2) {
                            int iM36692a = c13117aM132499a3.m36692a();
                            interfaceC37377s3.mo102732c(iM36692a, c13117aM132499a3);
                            ((InterfaceC37377s) c40881a.f475x).mo102733d(j13, 1, iM36692a, 0, null);
                            i14 = 0;
                        } else {
                            int iM36715y5 = c13117aM132499a3.m36715y();
                            if (iM36715y5 != 0 || c40881a.f176182z) {
                                i14 = 0;
                                if (c40881a.f176180E != 10 || iM36715y5 == 1) {
                                    int iM36692a2 = c13117aM132499a3.m36692a();
                                    interfaceC37377s3.mo102732c(iM36692a2, c13117aM132499a3);
                                    ((InterfaceC37377s) c40881a.f475x).mo102733d(j13, 1, iM36692a2, 0, null);
                                }
                            } else {
                                int iM36692a3 = c13117aM132499a3.m36692a();
                                byte[] bArr4 = new byte[iM36692a3];
                                c13117aM132499a3.m36697g(bArr4, 0, iM36692a3);
                                i14 = 0;
                                C5363q c5363qM107332f = AbstractC33922a.m107332f(new C24561s(bArr4, iM36692a3, 0, (byte) 0), false);
                                C31518b0 c31518b3 = new C31518b0();
                                c31518b3.f130047k = "audio/mp4a-latm";
                                c31518b3.f130044h = c5363qM107332f.f21805a;
                                c31518b3.f130060x = c5363qM107332f.f21807c;
                                c31518b3.f130061y = c5363qM107332f.f21806b;
                                c31518b3.f130049m = Collections.singletonList(bArr4);
                                interfaceC37377s3.mo102730a(new C31521c0(c31518b3));
                                c40881a.f176182z = true;
                            }
                            z13 = false;
                        }
                        z4 = true;
                        j14 = -9223372036854775807L;
                    }
                    if (!this.f176190h && z13) {
                        this.f176190h = true;
                        if (c40883c.f176200y == j14) {
                            j15 = -this.f176195m;
                        } else {
                            j15 = 0;
                        }
                        this.f176191i = j15;
                    }
                    this.f176192j = 4;
                    this.f176189g = 2;
                    if (z4) {
                        return i14;
                    }
                }
                j13 = j7;
                i13 = this.f176193k;
                if (i13 == 8) {
                    i14 = 0;
                    if (i13 == 9) {
                        j14 = -9223372036854775807L;
                        if (i13 == 18) {
                        }
                        ((C37364f) interfaceC37368j).mo3100n(this.f176194l);
                        z4 = false;
                        z13 = false;
                    } else {
                        j14 = -9223372036854775807L;
                        if (i13 == 18) {
                        }
                        ((C37364f) interfaceC37368j).mo3100n(this.f176194l);
                        z4 = false;
                        z13 = false;
                    }
                } else {
                    i14 = 0;
                    if (i13 == 9) {
                        j14 = -9223372036854775807L;
                        if (i13 == 18) {
                        }
                        ((C37364f) interfaceC37368j).mo3100n(this.f176194l);
                        z4 = false;
                        z13 = false;
                    } else {
                        j14 = -9223372036854775807L;
                        if (i13 == 18) {
                        }
                        ((C37364f) interfaceC37368j).mo3100n(this.f176194l);
                        z4 = false;
                        z13 = false;
                    }
                }
                if (!this.f176190h) {
                    this.f176190h = true;
                    if (c40883c.f176200y == j14) {
                        j15 = -this.f176195m;
                    } else {
                        j15 = 0;
                    }
                    this.f176191i = j15;
                }
                this.f176192j = 4;
                this.f176189g = 2;
                if (z4) {
                    return i14;
                }
            }
        }
    }

    @Override // p588wm.InterfaceC37367i
    public final void release() {
    }
}
