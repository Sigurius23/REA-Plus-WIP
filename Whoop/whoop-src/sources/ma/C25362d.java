package ma;

import androidx.profileinstaller.ProfileVerifier;
import java.io.EOFException;
import java.math.RoundingMode;
import p188ha.C17040i;
import p188ha.C17044m;
import p188ha.C17046o;
import p499t9.AbstractC33618a;
import p499t9.C33621b0;
import p499t9.C33636j;
import p499t9.C33642m;
import p499t9.C33650s;
import p499t9.C33655x;
import p499t9.C33657z;
import p499t9.InterfaceC33627e0;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34585c0;
import p516u8.C34608o;
import p516u8.C34610p;
import p516u8.InterfaceC34583b0;
import p522uf.AbstractC34870c0;
import p550vd.AbstractC35903f;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import va3.AbstractC35849g;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: ma.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C25362d implements InterfaceC33644n {

    /* JADX INFO: renamed from: a */
    public final int f99395a;

    /* JADX INFO: renamed from: f */
    public final C33642m f99400f;

    /* JADX INFO: renamed from: g */
    public InterfaceC33648q f99401g;

    /* JADX INFO: renamed from: h */
    public InterfaceC33639k0 f99402h;

    /* JADX INFO: renamed from: i */
    public InterfaceC33639k0 f99403i;

    /* JADX INFO: renamed from: j */
    public int f99404j;

    /* JADX INFO: renamed from: k */
    public C34585c0 f99405k;

    /* JADX INFO: renamed from: m */
    public long f99407m;

    /* JADX INFO: renamed from: n */
    public long f99408n;

    /* JADX INFO: renamed from: o */
    public long f99409o;

    /* JADX INFO: renamed from: p */
    public int f99410p;

    /* JADX INFO: renamed from: q */
    public InterfaceC25364f f99411q;

    /* JADX INFO: renamed from: r */
    public boolean f99412r;

    /* JADX INFO: renamed from: s */
    public boolean f99413s;

    /* JADX INFO: renamed from: t */
    public long f99414t;

    /* JADX INFO: renamed from: b */
    public final C38059n f99396b = new C38059n(10);

    /* JADX INFO: renamed from: c */
    public final C33621b0 f99397c = new C33621b0(0);

    /* JADX INFO: renamed from: d */
    public final C33655x f99398d = new C33655x();

    /* JADX INFO: renamed from: l */
    public long f99406l = -9223372036854775807L;

    /* JADX INFO: renamed from: e */
    public final C33657z f99399e = new C33657z(0);

    public C25362d(int i13) {
        this.f99395a = i13;
        C33642m c33642m = new C33642m();
        this.f99400f = c33642m;
        this.f99403i = c33642m;
        this.f99409o = -1L;
    }

    /* JADX INFO: renamed from: a */
    public final void m74419a() {
        InterfaceC33627e0 interfaceC33627e0 = this.f99411q;
        if ((interfaceC33627e0 instanceof C25359a) && ((C33636j) interfaceC33627e0).mo8509e()) {
            long j7 = this.f99409o;
            if (j7 == -1 || j7 == this.f99411q.mo74416d()) {
                return;
            }
            C25359a c25359a = (C25359a) this.f99411q;
            this.f99411q = new C25359a(this.f99409o, c25359a.f99387h, c25359a.f99388i, c25359a.f99389j, c25359a.f99390k);
            InterfaceC33648q interfaceC33648q = this.f99401g;
            interfaceC33648q.getClass();
            interfaceC33648q.mo3109v(this.f99411q);
            this.f99402h.getClass();
            this.f99411q.mo8510f();
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        this.f99404j = 0;
        this.f99406l = -9223372036854775807L;
        this.f99407m = 0L;
        this.f99410p = 0;
        this.f99414t = j13;
        if (this.f99411q instanceof AbstractC25360b) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m74420c(InterfaceC33646o interfaceC33646o) {
        InterfaceC25364f interfaceC25364f = this.f99411q;
        if (interfaceC25364f != null) {
            long jMo74416d = interfaceC25364f.mo74416d();
            if (jMo74416d == -1 || interfaceC33646o.mo3095g() <= jMo74416d - 4) {
            }
            return true;
        }
        try {
            return !interfaceC33646o.mo3092c(this.f99396b.f163017a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m74421d(InterfaceC33646o interfaceC33646o, boolean z4) throws Throwable {
        int iMo3095g;
        int i13;
        int iM106216h;
        int i14 = z4 ? 32768 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
        interfaceC33646o.mo3093e();
        if (interfaceC33646o.getPosition() == 0) {
            C38059n c38059n = this.f99399e.f140473w;
            int i15 = 0;
            C34585c0 c34585c0M48121a0 = null;
            while (true) {
                try {
                    interfaceC33646o.mo3103p(c38059n.f163017a, 0, 10);
                    c38059n.m121846F(0);
                    if (c38059n.m121870w() != 4801587) {
                        break;
                    }
                    c38059n.m121847G(3);
                    int iM121866s = c38059n.m121866s();
                    int i16 = iM121866s + 10;
                    if (c34585c0M48121a0 == null) {
                        byte[] bArr = new byte[i16];
                        System.arraycopy(c38059n.f163017a, 0, bArr, 0, 10);
                        interfaceC33646o.mo3103p(bArr, 10, iM121866s);
                        c34585c0M48121a0 = new C17040i(null).m48121a0(i16, bArr);
                    } else {
                        interfaceC33646o.mo3096i(iM121866s);
                    }
                    i15 += i16;
                } catch (EOFException unused) {
                }
            }
            interfaceC33646o.mo3093e();
            interfaceC33646o.mo3096i(i15);
            this.f99405k = c34585c0M48121a0;
            if (c34585c0M48121a0 != null) {
                this.f99398d.m106296b(c34585c0M48121a0);
            }
            iMo3095g = (int) interfaceC33646o.mo3095g();
            if (!z4) {
                interfaceC33646o.mo3100n(iMo3095g);
            }
            i13 = 0;
        } else {
            iMo3095g = 0;
            i13 = 0;
        }
        int i17 = i13;
        int i18 = i17;
        while (true) {
            if (m74420c(interfaceC33646o)) {
                if (i17 > 0) {
                    break;
                }
                m74419a();
                throw new EOFException();
            }
            C38059n c38059n2 = this.f99396b;
            c38059n2.m121846F(0);
            int iM121854g = c38059n2.m121854g();
            if ((i13 == 0 || ((-128000) & iM121854g) == (((long) i13) & (-128000))) && (iM106216h = AbstractC33618a.m106216h(iM121854g)) != -1) {
                i17++;
                if (i17 != 1) {
                    if (i17 == 4) {
                        break;
                    }
                } else {
                    this.f99397c.m106233a(iM121854g);
                    i13 = iM121854g;
                }
                interfaceC33646o.mo3096i(iM106216h - 4);
            } else {
                int i19 = i18 + 1;
                if (i18 == i14) {
                    if (z4) {
                        return false;
                    }
                    m74419a();
                    throw new EOFException();
                }
                if (z4) {
                    interfaceC33646o.mo3093e();
                    interfaceC33646o.mo3096i(iMo3095g + i19);
                } else {
                    interfaceC33646o.mo3100n(1);
                }
                i17 = 0;
                i18 = i19;
                i13 = 0;
            }
        }
        if (z4) {
            interfaceC33646o.mo3100n(iMo3095g + i18);
        } else {
            interfaceC33646o.mo3093e();
        }
        this.f99404j = i13;
        return true;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        this.f99401g = interfaceC33648q;
        InterfaceC33639k0 interfaceC33639k0Mo3101o = interfaceC33648q.mo3101o(0, 1);
        this.f99402h = interfaceC33639k0Mo3101o;
        this.f99403i = interfaceC33639k0Mo3101o;
        this.f99401g.mo3098l();
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) {
        return m74421d(interfaceC33646o, true);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0235  */
    /* JADX WARN: Code duplicated, block: B:108:0x0242  */
    /* JADX WARN: Code duplicated, block: B:114:0x0256  */
    /* JADX WARN: Code duplicated, block: B:117:0x025c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0260  */
    /* JADX WARN: Code duplicated, block: B:121:0x0266  */
    /* JADX WARN: Code duplicated, block: B:124:0x0288  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:138:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:214:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:215:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:218:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:67:0x017e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0186  */
    /* JADX WARN: Code duplicated, block: B:70:0x018b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0190  */
    /* JADX WARN: Code duplicated, block: B:74:0x0197  */
    /* JADX WARN: Code duplicated, block: B:77:0x019e  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a5 A[LOOP:4: B:78:0x01a3->B:79:0x01a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d4  */
    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) throws Throwable {
        Throwable th3;
        int i13;
        int i14;
        long j7;
        int iMo36175c;
        int i15;
        int i16;
        int iM121854g;
        int iM121854g2;
        int iM121871x;
        long jM121869v;
        long[] jArr;
        int i17;
        int i18;
        long j13;
        int i19;
        int i24;
        long position;
        int i25;
        long length;
        long jM121901O;
        long j14;
        InterfaceC25364f c25359a;
        long jM121901O2;
        long[] jArr2;
        int i26;
        C25361c c25361c;
        InterfaceC25364f c25359a2;
        long jM121896J;
        int iM121867t;
        AbstractC35849g.m113808j(this.f99402h);
        int i27 = AbstractC38065t.f163031a;
        int i28 = this.f99404j;
        C33621b0 c33621b0 = this.f99397c;
        if (i28 == 0) {
            try {
                m74421d(interfaceC33646o, false);
            } catch (EOFException unused) {
                th3 = null;
                i13 = -1;
                i14 = -1;
                j7 = 1000000;
            }
        }
        InterfaceC25364f interfaceC25364f = this.f99411q;
        C38059n c38059n = this.f99396b;
        if (interfaceC25364f == null) {
            C38059n c38059n2 = new C38059n(c33621b0.f140345d);
            j7 = 1000000;
            interfaceC33646o.mo3103p(c38059n2.f163017a, 0, c33621b0.f140345d);
            if ((c33621b0.f140343b & 1) != 0) {
                if (c33621b0.f140347f != 1) {
                    i16 = 36;
                } else {
                    i16 = 21;
                }
            } else if (c33621b0.f140347f != 1) {
                i16 = 21;
            } else {
                i16 = 13;
            }
            th3 = null;
            if (c38059n2.f163019c >= i16 + 4) {
                c38059n2.m121846F(i16);
                iM121854g = c38059n2.m121854g();
                if (iM121854g != 1483304551 && iM121854g != 1231971951) {
                    if (c38059n2.f163019c >= 40) {
                        c38059n2.m121846F(36);
                        if (c38059n2.m121854g() == 1447187017) {
                            iM121854g = 1447187017;
                        } else {
                            iM121854g = 0;
                        }
                    } else {
                        iM121854g = 0;
                    }
                }
            } else if (c38059n2.f163019c >= 40) {
                c38059n2.m121846F(36);
                if (c38059n2.m121854g() == 1447187017) {
                    iM121854g = 1447187017;
                } else {
                    iM121854g = 0;
                }
            } else {
                iM121854g = 0;
            }
            C33655x c33655x = this.f99398d;
            if (iM121854g == 1231971951) {
                iM121854g2 = c38059n2.m121854g();
                if ((iM121854g2 & 1) != 0) {
                    iM121871x = c38059n2.m121871x();
                } else {
                    iM121871x = -1;
                }
                if ((iM121854g2 & 2) != 0) {
                    jM121869v = c38059n2.m121869v();
                } else {
                    jM121869v = -1;
                }
                if ((iM121854g2 & 4) == 4) {
                    jArr2 = new long[100];
                    for (i26 = 0; i26 < 100; i26++) {
                        jArr2[i26] = c38059n2.m121867t();
                    }
                    jArr = jArr2;
                } else {
                    jArr = null;
                }
                if ((iM121854g2 & 8) != 0) {
                    c38059n2.m121847G(4);
                }
                if (c38059n2.m121848a() >= 24) {
                    c38059n2.m121847G(21);
                    int iM121870w = c38059n2.m121870w();
                    i18 = (16773120 & iM121870w) >> 12;
                    i17 = iM121870w & 4095;
                } else {
                    i17 = -1;
                    i18 = -1;
                }
                j13 = iM121871x;
                i19 = c33621b0.f140345d;
                int i29 = c33621b0.f140346e;
                i24 = c33621b0.f140348g;
                int i34 = c33621b0.f140349h;
                if ((c33655x.f140458a != -1 || c33655x.f140459b == -1) && i18 != -1 && i17 != -1) {
                    c33655x.f140458a = i18;
                    c33655x.f140459b = i17;
                }
                position = interfaceC33646o.getPosition();
                if (interfaceC33646o.getLength() != -1 || jM121869v == -1) {
                    i25 = i24;
                } else {
                    i25 = i24;
                    long j15 = position + jM121869v;
                    if (interfaceC33646o.getLength() != j15) {
                        AbstractC38046a.m121818m("Mp3Extractor", "Data size mismatch between stream (" + interfaceC33646o.getLength() + ") and Xing frame (" + j15 + "), using Xing value.");
                    }
                }
                interfaceC33646o.mo3100n(c33621b0.f140345d);
                if (iM121854g == 1483304551) {
                    if (j13 != -1 || j13 == 0) {
                        jM121901O2 = -9223372036854775807L;
                    } else {
                        jM121901O2 = AbstractC38065t.m121901O(i29, (j13 * ((long) i34)) - 1);
                    }
                    if (jM121901O2 == -9223372036854775807L) {
                        c25359a = null;
                    } else {
                        c25359a = (jM121869v != -1 || jArr == null) ? new C25366h(position, i19, jM121901O2, i25, -1L, null) : new C25366h(position, i19, jM121901O2, i25, jM121869v, jArr);
                    }
                } else {
                    length = interfaceC33646o.getLength();
                    if (j13 != -1 || j13 == 0) {
                        jM121901O = -9223372036854775807L;
                    } else {
                        jM121901O = AbstractC38065t.m121901O(i29, (((long) i34) * j13) - 1);
                    }
                    if (jM121901O != -9223372036854775807L) {
                        if (jM121869v != -1) {
                            length = position + jM121869v;
                            j14 = jM121869v - ((long) i19);
                        } else if (length != -1) {
                            j14 = (length - position) - ((long) i19);
                        } else {
                            c25359a = null;
                        }
                        long j16 = length;
                        long j17 = j14;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        c25359a = new C25359a(j16, position + ((long) i19), AbstractC35903f.m114016k(AbstractC38065t.m121903Q(j17, 8000000L, jM121901O, roundingMode)), AbstractC35903f.m114016k(AbstractC34870c0.m109975J(j17, j13, roundingMode)), false);
                    } else {
                        c25359a = null;
                    }
                }
            } else {
                if (iM121854g == 1447187017) {
                    long length2 = interfaceC33646o.getLength();
                    long position2 = interfaceC33646o.getPosition();
                    c38059n2.m121847G(6);
                    long jM121854g = ((long) c33621b0.f140345d) + position2 + ((long) c38059n2.m121854g());
                    int iM121854g3 = c38059n2.m121854g();
                    if (iM121854g3 <= 0) {
                        c25359a = null;
                        break;
                    }
                    long jM121901O3 = AbstractC38065t.m121901O(c33621b0.f140346e, (((long) c33621b0.f140349h) * ((long) iM121854g3)) - 1);
                    int iM121873z = c38059n2.m121873z();
                    int iM121873z2 = c38059n2.m121873z();
                    int iM121873z3 = c38059n2.m121873z();
                    c38059n2.m121847G(2);
                    long j18 = position2 + ((long) c33621b0.f140345d);
                    long[] jArr3 = new long[iM121873z];
                    long[] jArr4 = new long[iM121873z];
                    int i35 = 0;
                    while (true) {
                        if (i35 >= iM121873z) {
                            long[] jArr5 = jArr3;
                            long[] jArr6 = jArr4;
                            if (length2 != -1 && length2 != jM121854g) {
                                StringBuilder sbM125596b = AbstractC39383f.m125596b(length2, "VBRI data size mismatch: ", ", ");
                                sbM125596b.append(jM121854g);
                                AbstractC38046a.m121826u("VbriSeeker", sbM125596b.toString());
                            }
                            if (jM121854g != j18) {
                                StringBuilder sbM125596b2 = AbstractC39383f.m125596b(jM121854g, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                sbM125596b2.append(j18);
                                sbM125596b2.append("\nSeeking will be inaccurate.");
                                AbstractC38046a.m121826u("VbriSeeker", sbM125596b2.toString());
                                jM121854g = Math.max(jM121854g, j18);
                            }
                            c25359a = new C25365g(jArr5, jArr6, jM121901O3, jM121854g, c33621b0.f140348g);
                            break;
                        }
                        long[] jArr7 = jArr3;
                        long[] jArr8 = jArr4;
                        jArr7[i35] = (((long) i35) * jM121901O3) / ((long) iM121873z);
                        jArr8[i35] = j18;
                        if (iM121873z3 == 1) {
                            iM121867t = c38059n2.m121867t();
                        } else if (iM121873z3 == 2) {
                            iM121867t = c38059n2.m121873z();
                        } else if (iM121873z3 == 3) {
                            iM121867t = c38059n2.m121870w();
                        } else {
                            if (iM121873z3 != 4) {
                                c25359a = null;
                                break;
                            }
                            iM121867t = c38059n2.m121871x();
                        }
                        j18 += ((long) iM121867t) * ((long) iM121873z2);
                        i35++;
                        iM121873z3 = iM121873z3;
                        jArr3 = jArr7;
                        jArr4 = jArr8;
                    }
                    interfaceC33646o.mo3100n(c33621b0.f140345d);
                } else if (iM121854g != 1483304551) {
                    interfaceC33646o.mo3093e();
                    c25359a = null;
                } else {
                    iM121854g2 = c38059n2.m121854g();
                    if ((iM121854g2 & 1) != 0) {
                        iM121871x = c38059n2.m121871x();
                    } else {
                        iM121871x = -1;
                    }
                    if ((iM121854g2 & 2) != 0) {
                        jM121869v = c38059n2.m121869v();
                    } else {
                        jM121869v = -1;
                    }
                    if ((iM121854g2 & 4) == 4) {
                        jArr2 = new long[100];
                        while (i26 < 100) {
                            jArr2[i26] = c38059n2.m121867t();
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM121854g2 & 8) != 0) {
                        c38059n2.m121847G(4);
                    }
                    if (c38059n2.m121848a() >= 24) {
                        c38059n2.m121847G(21);
                        int iM121870w2 = c38059n2.m121870w();
                        i18 = (16773120 & iM121870w2) >> 12;
                        i17 = iM121870w2 & 4095;
                    } else {
                        i17 = -1;
                        i18 = -1;
                    }
                    j13 = iM121871x;
                    i19 = c33621b0.f140345d;
                    int i210 = c33621b0.f140346e;
                    i24 = c33621b0.f140348g;
                    int i36 = c33621b0.f140349h;
                    if (c33655x.f140458a != -1) {
                        c33655x.f140458a = i18;
                        c33655x.f140459b = i17;
                    } else {
                        c33655x.f140458a = i18;
                        c33655x.f140459b = i17;
                    }
                    position = interfaceC33646o.getPosition();
                    if (interfaceC33646o.getLength() != -1) {
                        i25 = i24;
                    } else {
                        i25 = i24;
                    }
                    interfaceC33646o.mo3100n(c33621b0.f140345d);
                    if (iM121854g == 1483304551) {
                        if (j13 != -1) {
                            jM121901O2 = -9223372036854775807L;
                        } else {
                            jM121901O2 = -9223372036854775807L;
                        }
                        if (jM121901O2 == -9223372036854775807L) {
                            c25359a = null;
                        } else if (jM121869v != -1) {
                        }
                    } else {
                        length = interfaceC33646o.getLength();
                        if (j13 != -1) {
                            jM121901O = -9223372036854775807L;
                        } else {
                            jM121901O = -9223372036854775807L;
                        }
                        if (jM121901O != -9223372036854775807L) {
                            if (jM121869v != -1) {
                                length = position + jM121869v;
                                j14 = jM121869v - ((long) i19);
                            } else if (length != -1) {
                                j14 = (length - position) - ((long) i19);
                            } else {
                                c25359a = null;
                            }
                            long j19 = length;
                            long j110 = j14;
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            c25359a = new C25359a(j19, position + ((long) i19), AbstractC35903f.m114016k(AbstractC38065t.m121903Q(j110, 8000000L, jM121901O, roundingMode2)), AbstractC35903f.m114016k(AbstractC34870c0.m109975J(j110, j13, roundingMode2)), false);
                        } else {
                            c25359a = null;
                        }
                    }
                }
                c33655x = c33655x;
            }
            C34585c0 c34585c0 = this.f99405k;
            long position3 = interfaceC33646o.getPosition();
            if (c34585c0 == null) {
                c25361c = null;
                break;
            }
            InterfaceC34583b0[] interfaceC34583b0Arr = c34585c0.f145640a;
            int length3 = interfaceC34583b0Arr.length;
            int i37 = 0;
            while (true) {
                if (i37 >= length3) {
                    c25361c = null;
                    break;
                }
                InterfaceC34583b0 interfaceC34583b0 = interfaceC34583b0Arr[i37];
                if (interfaceC34583b0 instanceof C17044m) {
                    C17044m c17044m = (C17044m) interfaceC34583b0;
                    int[] iArr = c17044m.f65536e;
                    if (c34585c0 == null) {
                        jM121896J = -9223372036854775807L;
                        break;
                    }
                    InterfaceC34583b0[] interfaceC34583b0Arr2 = c34585c0.f145640a;
                    int length4 = interfaceC34583b0Arr2.length;
                    int i38 = 0;
                    while (true) {
                        if (i38 >= length4) {
                            jM121896J = -9223372036854775807L;
                            break;
                        }
                        InterfaceC34583b0 interfaceC34583b1 = interfaceC34583b0Arr2[i38];
                        if (interfaceC34583b1 instanceof C17046o) {
                            C17046o c17046o = (C17046o) interfaceC34583b1;
                            if (c17046o.f65528a.equals("TLEN")) {
                                jM121896J = AbstractC38065t.m121896J(Long.parseLong((String) c17046o.f65541c.get(0)));
                                break;
                            }
                        }
                        i38++;
                    }
                    int length5 = iArr.length;
                    int i39 = length5 + 1;
                    long[] jArr9 = new long[i39];
                    long[] jArr10 = new long[i39];
                    jArr9[0] = position3;
                    jArr10[0] = 0;
                    long j24 = 0;
                    long j25 = position3;
                    int i44 = 1;
                    while (i44 <= length5) {
                        int i45 = i44 - 1;
                        int i46 = i44;
                        j25 += (long) (c17044m.f65534c + iArr[i45]);
                        j24 += (long) (c17044m.f65535d + c17044m.f65537f[i45]);
                        jArr9[i46] = j25;
                        jArr10[i46] = j24;
                        i44 = i46 + 1;
                        length5 = length5;
                    }
                    c25361c = new C25361c(jM121896J, jArr9, jArr10);
                    break;
                }
                i37++;
            }
            if (this.f99412r) {
                c25359a2 = new C25363e(-9223372036854775807L);
            } else {
                if (c25361c != null) {
                    c25359a = c25361c;
                } else if (c25359a == null) {
                    c25359a = null;
                }
                if (c25359a == null || !(c25359a.mo8509e() || (this.f99395a & 1) == 0)) {
                    interfaceC33646o.mo3103p(c38059n.f163017a, 0, 4);
                    c38059n.m121846F(0);
                    c33621b0.m106233a(c38059n.m121854g());
                    c25359a2 = new C25359a(interfaceC33646o.getLength(), interfaceC33646o.getPosition(), c33621b0.f140348g, c33621b0.f140345d, false);
                } else {
                    c25359a2 = c25359a;
                }
                InterfaceC33639k0 interfaceC33639k0 = this.f99402h;
                c25359a2.mo8510f();
                interfaceC33639k0.getClass();
            }
            this.f99411q = c25359a2;
            this.f99401g.mo3109v(c25359a2);
            C34608o c34608o = new C34608o();
            c34608o.f145740l = AbstractC34587d0.m109382o("audio/mpeg");
            c34608o.f145741m = AbstractC34587d0.m109382o(c33621b0.f140344c);
            c34608o.f145742n = 4096;
            c34608o.f145719C = c33621b0.f140347f;
            c34608o.f145720D = c33621b0.f140346e;
            c34608o.f145722F = c33655x.f140458a;
            c34608o.f145723G = c33655x.f140459b;
            c34608o.f145739k = this.f99405k;
            if (this.f99411q.mo74417k() != -2147483647) {
                c34608o.f145736h = this.f99411q.mo74417k();
            }
            this.f99403i.mo36173a(new C34610p(c34608o));
            this.f99408n = interfaceC33646o.getPosition();
        } else {
            th3 = null;
            j7 = 1000000;
            if (this.f99408n != 0) {
                long position4 = interfaceC33646o.getPosition();
                long j26 = this.f99408n;
                if (position4 < j26) {
                    interfaceC33646o.mo3100n((int) (j26 - position4));
                }
            }
        }
        if (this.f99410p == 0) {
            interfaceC33646o.mo3093e();
            if (m74420c(interfaceC33646o)) {
                i13 = -1;
            } else {
                c38059n.m121846F(0);
                int iM121854g4 = c38059n.m121854g();
                if (((-128000) & iM121854g4) != (((long) this.f99404j) & (-128000)) || AbstractC33618a.m106216h(iM121854g4) == -1) {
                    interfaceC33646o.mo3100n(1);
                    this.f99404j = 0;
                } else {
                    c33621b0.m106233a(iM121854g4);
                    if (this.f99406l == -9223372036854775807L) {
                        this.f99406l = this.f99411q.mo74415a(interfaceC33646o.getPosition());
                    }
                    this.f99410p = c33621b0.f140345d;
                    this.f99409o = interfaceC33646o.getPosition() + ((long) c33621b0.f140345d);
                    if (this.f99411q instanceof AbstractC25360b) {
                        long j27 = ((this.f99407m + ((long) c33621b0.f140349h)) * j7) / ((long) c33621b0.f140346e);
                        throw th3;
                    }
                    iMo36175c = this.f99403i.mo36175c(interfaceC33646o, this.f99410p, true);
                    if (iMo36175c == -1) {
                        i13 = -1;
                    } else {
                        i15 = this.f99410p - iMo36175c;
                        this.f99410p = i15;
                        if (i15 <= 0) {
                            this.f99403i.mo36174b(((this.f99407m * j7) / ((long) c33621b0.f140346e)) + this.f99406l, 1, c33621b0.f140345d, 0, null);
                            this.f99407m += (long) c33621b0.f140349h;
                            this.f99410p = 0;
                            i13 = 0;
                        }
                    }
                }
                i13 = 0;
            }
        } else {
            iMo36175c = this.f99403i.mo36175c(interfaceC33646o, this.f99410p, true);
            if (iMo36175c == -1) {
                i13 = -1;
            } else {
                i15 = this.f99410p - iMo36175c;
                this.f99410p = i15;
                if (i15 <= 0) {
                    i13 = 0;
                } else {
                    this.f99403i.mo36174b(((this.f99407m * j7) / ((long) c33621b0.f140346e)) + this.f99406l, 1, c33621b0.f140345d, 0, null);
                    this.f99407m += (long) c33621b0.f140349h;
                    this.f99410p = 0;
                    i13 = 0;
                }
            }
        }
        i14 = -1;
        if (i13 == i14) {
            InterfaceC25364f interfaceC25364f2 = this.f99411q;
            if (interfaceC25364f2 instanceof AbstractC25360b) {
                if (interfaceC25364f2.mo8510f() != ((this.f99407m * j7) / ((long) c33621b0.f140346e)) + this.f99406l) {
                    ((AbstractC25360b) this.f99411q).getClass();
                    throw th3;
                }
            }
        }
        return i13;
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
    }
}
