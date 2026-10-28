package cn;

import android.util.Log;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.ParserException;
import ed3.C13117a;
import in.C18715c;
import in.InterfaceC18714b;
import java.io.EOFException;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p345nn.C26857h;
import p345nn.C26860k;
import p345nn.C26862m;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p499t9.C33621b0;
import p499t9.C33650s;
import p508ty.C34249c;
import p588wm.C37364f;
import p588wm.C37366h;
import p588wm.C37371m;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;
import tm.AbstractC33922a;

/* JADX INFO: renamed from: cn.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C4842d implements InterfaceC37367i {

    /* JADX INFO: renamed from: a */
    public final long f20108a;

    /* JADX INFO: renamed from: b */
    public final C13117a f20109b;

    /* JADX INFO: renamed from: c */
    public final C33621b0 f20110c;

    /* JADX INFO: renamed from: d */
    public final C37371m f20111d;

    /* JADX INFO: renamed from: e */
    public final C34249c f20112e;

    /* JADX INFO: renamed from: f */
    public final C37366h f20113f;

    /* JADX INFO: renamed from: g */
    public InterfaceC37369k f20114g;

    /* JADX INFO: renamed from: h */
    public InterfaceC37377s f20115h;

    /* JADX INFO: renamed from: i */
    public InterfaceC37377s f20116i;

    /* JADX INFO: renamed from: j */
    public int f20117j;

    /* JADX INFO: renamed from: k */
    public C18715c f20118k;

    /* JADX INFO: renamed from: l */
    public long f20119l;

    /* JADX INFO: renamed from: m */
    public long f20120m;

    /* JADX INFO: renamed from: n */
    public long f20121n;

    /* JADX INFO: renamed from: o */
    public int f20122o;

    /* JADX INFO: renamed from: p */
    public InterfaceC4844f f20123p;

    /* JADX INFO: renamed from: q */
    public boolean f20124q;

    /* JADX INFO: renamed from: r */
    public boolean f20125r;

    /* JADX INFO: renamed from: s */
    public long f20126s;

    public C4842d(int i13) {
        this(-9223372036854775807L);
    }

    /* JADX INFO: renamed from: a */
    public final C4839a m15419a(InterfaceC37368j interfaceC37368j, boolean z4) {
        C13117a c13117a = this.f20109b;
        interfaceC37368j.mo3103p(c13117a.f45381a, 0, 4);
        c13117a.m36689K(0);
        int iM36699i = c13117a.m36699i();
        C33621b0 c33621b0 = this.f20110c;
        c33621b0.m106233a(iM36699i);
        return new C4839a(interfaceC37368j.getLength(), interfaceC37368j.getPosition(), c33621b0.f140348g, c33621b0.f140345d, z4);
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: b */
    public final void mo3071b(long j7, long j13) {
        this.f20117j = 0;
        this.f20119l = -9223372036854775807L;
        this.f20120m = 0L;
        this.f20122o = 0;
        this.f20126s = j13;
        InterfaceC4844f interfaceC4844f = this.f20123p;
        if (!(interfaceC4844f instanceof AbstractC4840b) || ((AbstractC4840b) interfaceC4844f).m15417b(j13)) {
            return;
        }
        this.f20125r = true;
        this.f20116i = this.f20113f;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15420c(InterfaceC37368j interfaceC37368j) {
        InterfaceC4844f interfaceC4844f = this.f20123p;
        if (interfaceC4844f != null) {
            long jMo15416d = interfaceC4844f.mo15416d();
            if (jMo15416d == -1 || interfaceC37368j.mo3095g() <= jMo15416d - 4) {
            }
            return true;
        }
        try {
            return !interfaceC37368j.mo3092c(this.f20109b.f45381a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m15421d(InterfaceC37368j interfaceC37368j, boolean z4) throws ParserException, EOFException {
        int iMo3095g;
        int i13;
        int iM107330d;
        int i14 = z4 ? 32768 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
        interfaceC37368j.mo3093e();
        if (interfaceC37368j.getPosition() == 0) {
            C13117a c13117a = (C13117a) this.f20112e.f143660x;
            C18715c c18715cM80180f0 = null;
            int i15 = 0;
            while (true) {
                try {
                    interfaceC37368j.mo3103p(c13117a.f45381a, 0, 10);
                    c13117a.m36689K(0);
                    if (c13117a.m36679A() != 4801587) {
                        break;
                    }
                    c13117a.m36690L(3);
                    int iM36713w = c13117a.m36713w();
                    int i16 = iM36713w + 10;
                    if (c18715cM80180f0 == null) {
                        byte[] bArr = new byte[i16];
                        System.arraycopy(c13117a.f45381a, 0, bArr, 0, 10);
                        interfaceC37368j.mo3103p(bArr, 10, iM36713w);
                        c18715cM80180f0 = new C26857h(null).m80180f0(i16, bArr);
                    } else {
                        interfaceC37368j.mo3096i(iM36713w);
                    }
                    i15 += i16;
                } catch (EOFException unused) {
                }
            }
            interfaceC37368j.mo3093e();
            interfaceC37368j.mo3096i(i15);
            this.f20118k = c18715cM80180f0;
            if (c18715cM80180f0 != null) {
                this.f20111d.m119654b(c18715cM80180f0);
            }
            iMo3095g = (int) interfaceC37368j.mo3095g();
            if (!z4) {
                interfaceC37368j.mo3100n(iMo3095g);
            }
            i13 = 0;
        } else {
            iMo3095g = 0;
            i13 = 0;
        }
        int i17 = i13;
        int i18 = i17;
        while (true) {
            if (m15420c(interfaceC37368j)) {
                if (i17 > 0) {
                    break;
                }
                throw new EOFException();
            }
            C13117a c13117a2 = this.f20109b;
            c13117a2.m36689K(0);
            int iM36699i = c13117a2.m36699i();
            if ((i13 == 0 || ((-128000) & iM36699i) == (((long) i13) & (-128000))) && (iM107330d = AbstractC33922a.m107330d(iM36699i)) != -1) {
                i17++;
                if (i17 != 1) {
                    if (i17 == 4) {
                        break;
                    }
                } else {
                    this.f20110c.m106233a(iM36699i);
                    i13 = iM36699i;
                }
                interfaceC37368j.mo3096i(iM107330d - 4);
            } else {
                int i19 = i18 + 1;
                if (i18 == i14) {
                    if (z4) {
                        return false;
                    }
                    throw ParserException.m15562a(null, "Searched too many bytes.");
                }
                if (z4) {
                    interfaceC37368j.mo3093e();
                    interfaceC37368j.mo3096i(iMo3095g + i19);
                } else {
                    interfaceC37368j.mo3100n(1);
                }
                i17 = 0;
                i18 = i19;
                i13 = 0;
            }
        }
        if (z4) {
            interfaceC37368j.mo3100n(iMo3095g + i18);
        } else {
            interfaceC37368j.mo3093e();
        }
        this.f20117j = i13;
        return true;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: g */
    public final boolean mo3073g(InterfaceC37368j interfaceC37368j) {
        return m15421d(interfaceC37368j, true);
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: h */
    public final void mo3074h(InterfaceC37369k interfaceC37369k) {
        this.f20114g = interfaceC37369k;
        InterfaceC37377s interfaceC37377sMo3102o = interfaceC37369k.mo3102o(0, 1);
        this.f20115h = interfaceC37377sMo3102o;
        this.f20116i = interfaceC37377sMo3102o;
        this.f20114g.mo3098l();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0252  */
    /* JADX WARN: Code duplicated, block: B:108:0x0258  */
    /* JADX WARN: Code duplicated, block: B:112:0x0264  */
    /* JADX WARN: Code duplicated, block: B:114:0x026a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0270  */
    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:120:0x028a A[EDGE_INSN: B:120:0x028a->B:121:0x028f BREAK  A[LOOP:1: B:113:0x0268->B:119:0x0287]] */
    /* JADX WARN: Code duplicated, block: B:123:0x02a3 A[LOOP:2: B:122:0x02a1->B:123:0x02a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x02c7 A[LOOP:0: B:107:0x0256->B:125:0x02c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x02ca A[EDGE_INSN: B:126:0x02ca->B:127:0x02cc BREAK  A[LOOP:0: B:107:0x0256->B:125:0x02c7]] */
    /* JADX WARN: Code duplicated, block: B:129:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:130:0x02db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:139:0x032a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    /* JADX WARN: Code duplicated, block: B:141:0x0338  */
    /* JADX WARN: Code duplicated, block: B:143:0x0341  */
    /* JADX WARN: Code duplicated, block: B:146:0x034d  */
    /* JADX WARN: Code duplicated, block: B:149:0x035b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:168:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:171:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:174:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:178:0x0407  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:188:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x028a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:67:0x015d A[PHI: r11 r34
      0x015d: PHI (r11v8 t9.b0) = (r11v6 t9.b0), (r11v6 t9.b0), (r11v6 t9.b0), (r11v12 t9.b0) binds: [B:98:0x0233, B:100:0x0239, B:102:0x023e, B:66:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r34v10 cn.f) = (r34v1 cn.f), (r34v1 cn.f), (r34v1 cn.f), (r34v15 cn.f) binds: [B:98:0x0233, B:100:0x0239, B:102:0x023e, B:66:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0188  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x0203  */
    /* JADX WARN: Code duplicated, block: B:95:0x0228 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x022a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0235  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: i */
    public final int mo3075i(InterfaceC37368j interfaceC37368j, C33650s c33650s) throws Throwable {
        C33621b0 c33621b0;
        int i13;
        int i14;
        long j7;
        InterfaceC4844f interfaceC4844f;
        C13117a c13117a;
        Throwable th3;
        long j13;
        long j14;
        long j15;
        int iMo102731b;
        int i15;
        int iM36699i;
        C13117a c13117a2;
        int i16;
        int iM36699i2;
        C37371m c37371m;
        C37364f c37364f;
        int iM36699i3;
        InterfaceC4844f interfaceC4844fM15419a;
        int i17;
        int i18;
        int iM36680B;
        C18715c c18715c;
        long j16;
        C4841c c4841c;
        InterfaceC4844f interfaceC4844fM15419a2;
        InterfaceC18714b[] interfaceC18714bArr;
        int length;
        int i19;
        InterfaceC18714b interfaceC18714b;
        C26860k c26860k;
        int[] iArr;
        long jM71695z;
        int length2;
        long[] jArr;
        long[] jArr2;
        long j17;
        long j18;
        int i24;
        InterfaceC18714b[] interfaceC18714bArr2;
        int length3;
        int i25;
        InterfaceC18714b interfaceC18714b2;
        C26862m c26862m;
        int iM36715y;
        C4842d c4842d = this;
        InterfaceC37368j interfaceC37368j2 = interfaceC37368j;
        AbstractC24543a.m71574j(c4842d.f20115h);
        int i26 = AbstractC24567y.f95875a;
        int i27 = c4842d.f20117j;
        C33621b0 c33621b1 = c4842d.f20110c;
        if (i27 == 0) {
            try {
                c4842d.m15421d(interfaceC37368j2, false);
                interfaceC4844f = c4842d.f20123p;
                c13117a = c4842d.f20109b;
                if (interfaceC4844f == null) {
                    c13117a2 = new C13117a(c33621b1.f140345d);
                    j7 = 1000000;
                    ((C37364f) interfaceC37368j2).mo3092c(c13117a2.f45381a, 0, c33621b1.f140345d, false);
                    i16 = 21;
                    if ((c33621b1.f140343b & 1) != 0) {
                        if (c33621b1.f140347f != 1) {
                            i16 = 36;
                        }
                    } else if (c33621b1.f140347f == 1) {
                        i16 = 13;
                    }
                    th3 = null;
                    j13 = 0;
                    if (c13117a2.f45383c >= i16 + 4) {
                        c13117a2.m36689K(i16);
                        iM36699i2 = c13117a2.m36699i();
                        if (iM36699i2 != 1483304551 && iM36699i2 != 1231971951) {
                            if (c13117a2.f45383c >= 40) {
                                c13117a2.m36689K(36);
                                if (c13117a2.m36699i() == 1447187017) {
                                    iM36699i2 = 1447187017;
                                } else {
                                    iM36699i2 = 0;
                                }
                            } else {
                                iM36699i2 = 0;
                            }
                        }
                    } else if (c13117a2.f45383c >= 40) {
                        c13117a2.m36689K(36);
                        if (c13117a2.m36699i() == 1447187017) {
                            iM36699i2 = 1447187017;
                        } else {
                            iM36699i2 = 0;
                        }
                    } else {
                        iM36699i2 = 0;
                    }
                    c37371m = c4842d.f20111d;
                    if (iM36699i2 != 1483304551 || iM36699i2 == 1231971951) {
                        c33621b0 = c33621b1;
                        c37364f = (C37364f) interfaceC37368j;
                        long j19 = c37364f.f159851y;
                        long j24 = c37364f.f159852z;
                        int i28 = c33621b0.f140349h;
                        int i29 = c33621b0.f140346e;
                        iM36699i3 = c13117a2.m36699i();
                        if ((iM36699i3 & 1) == 1 || (iM36680B = c13117a2.m36680B()) == 0) {
                            interfaceC4844fM15419a = null;
                        } else {
                            long jM71666D = AbstractC24567y.m71666D(iM36680B, ((long) i28) * 1000000, i29);
                            if ((iM36699i3 & 6) != 6) {
                                interfaceC4844fM15419a = new C4846h(j24, c33621b0.f140345d, jM71666D, -1L, null);
                            } else {
                                long jM36716z = c13117a2.m36716z();
                                long[] jArr3 = new long[100];
                                for (int i34 = 0; i34 < 100; i34++) {
                                    jArr3[i34] = c13117a2.m36715y();
                                }
                                if (j19 != -1) {
                                    long j25 = j24 + jM36716z;
                                    if (j19 != j25) {
                                        StringBuilder sb4 = new StringBuilder(67);
                                        sb4.append("XING data size mismatch: ");
                                        sb4.append(j19);
                                        sb4.append(", ");
                                        sb4.append(j25);
                                        Log.w("XingSeeker", sb4.toString());
                                    }
                                }
                                interfaceC4844fM15419a = new C4846h(j24, c33621b0.f140345d, jM71666D, jM36716z, jArr3);
                            }
                        }
                        if (interfaceC4844fM15419a != null && (c37371m.f159861a == -1 || c37371m.f159862b == -1)) {
                            c37364f.f159847F = 0;
                            c37364f.m119648a(i16 + 141, false);
                            c37364f.mo3092c(c13117a.f45381a, 0, 3, false);
                            c13117a.m36689K(0);
                            int iM36679A = c13117a.m36679A();
                            i17 = iM36679A >> 12;
                            i18 = iM36679A & 4095;
                            if (i17 <= 0 || i18 > 0) {
                                c37371m.f159861a = i17;
                                c37371m.f159862b = i18;
                            }
                        }
                        c37364f.mo3100n(c33621b0.f140345d);
                        if (interfaceC4844fM15419a == null && !interfaceC4844fM15419a.mo3113e() && iM36699i2 == 1231971951) {
                            c4842d = this;
                            interfaceC37368j2 = interfaceC37368j;
                            interfaceC4844fM15419a = c4842d.m15419a(interfaceC37368j2, false);
                        } else {
                            c4842d = this;
                            interfaceC37368j2 = interfaceC37368j;
                        }
                    } else if (iM36699i2 == 1447187017) {
                        C37364f c37364f2 = (C37364f) interfaceC37368j2;
                        long j26 = c37364f2.f159851y;
                        long j27 = c37364f2.f159852z;
                        c13117a2.m36690L(10);
                        int iM36699i4 = c13117a2.m36699i();
                        if (iM36699i4 <= 0) {
                            interfaceC4844fM15419a = null;
                            c33621b0 = c33621b1;
                        } else {
                            int i35 = c33621b1.f140346e;
                            long jM71666D2 = AbstractC24567y.m71666D(iM36699i4, ((long) (i35 >= 32000 ? 1152 : 576)) * 1000000, i35);
                            int iM36682D = c13117a2.m36682D();
                            int iM36682D2 = c13117a2.m36682D();
                            int iM36682D3 = c13117a2.m36682D();
                            c13117a2.m36690L(2);
                            long j28 = ((long) c33621b1.f140345d) + j27;
                            long[] jArr4 = new long[iM36682D];
                            long[] jArr5 = new long[iM36682D];
                            int i36 = 0;
                            while (true) {
                                if (i36 >= iM36682D) {
                                    if (j26 != -1 && j26 != j27) {
                                        StringBuilder sb5 = new StringBuilder(67);
                                        sb5.append("VBRI data size mismatch: ");
                                        sb5.append(j26);
                                        sb5.append(", ");
                                        sb5.append(j27);
                                        Log.w("VbriSeeker", sb5.toString());
                                    }
                                    interfaceC4844fM15419a = new C4845g(jArr4, jArr5, jM71666D2, j27);
                                    break;
                                }
                                jArr4[i36] = (((long) i36) * jM71666D2) / ((long) iM36682D);
                                jArr5[i36] = Math.max(j27, j28);
                                if (iM36682D3 == 1) {
                                    iM36715y = c13117a2.m36715y();
                                } else if (iM36682D3 == 2) {
                                    iM36715y = c13117a2.m36682D();
                                } else if (iM36682D3 == 3) {
                                    iM36715y = c13117a2.m36679A();
                                } else {
                                    if (iM36682D3 != 4) {
                                        interfaceC4844fM15419a = null;
                                        break;
                                    }
                                    iM36715y = c13117a2.m36680B();
                                }
                                j27 += (long) (iM36715y * iM36682D2);
                                i36++;
                            }
                            c33621b0 = c33621b1;
                        }
                        c37364f2.mo3100n(c33621b0.f140345d);
                        c4842d = this;
                        interfaceC37368j2 = interfaceC37368j;
                    } else {
                        c33621b0 = c33621b1;
                        ((C37364f) interfaceC37368j).f159847F = 0;
                        c4842d = this;
                        interfaceC37368j2 = interfaceC37368j;
                        interfaceC4844fM15419a = null;
                    }
                    c18715c = c4842d.f20118k;
                    C37364f c37364f3 = (C37364f) interfaceC37368j2;
                    j16 = c37364f3.f159852z;
                    if (c18715c != null) {
                        c4841c = null;
                        break;
                    }
                    interfaceC18714bArr = c18715c.f73525w;
                    length = interfaceC18714bArr.length;
                    i19 = 0;
                    while (true) {
                        if (i19 < length) {
                            c4841c = null;
                            break;
                        }
                        interfaceC18714b = interfaceC18714bArr[i19];
                        if (interfaceC18714b instanceof C26860k) {
                            c26860k = (C26860k) interfaceC18714b;
                            iArr = c26860k.f107181E;
                            if (c18715c != null) {
                                jM71695z = -9223372036854775807L;
                                break;
                            }
                            interfaceC18714bArr2 = c18715c.f73525w;
                            length3 = interfaceC18714bArr2.length;
                            i25 = 0;
                            while (true) {
                                if (i25 < length3) {
                                    jM71695z = -9223372036854775807L;
                                    break;
                                }
                                interfaceC18714b2 = interfaceC18714bArr2[i25];
                                if (interfaceC18714b2 instanceof C26862m) {
                                    c26862m = (C26862m) interfaceC18714b2;
                                    if (c26862m.f107177w.equals("TLEN")) {
                                        jM71695z = AbstractC24567y.m71695z(Long.parseLong(c26862m.f107189y));
                                        break;
                                    }
                                }
                                i25++;
                            }
                            length2 = iArr.length;
                            int i37 = length2 + 1;
                            jArr = new long[i37];
                            jArr2 = new long[i37];
                            jArr[0] = j16;
                            jArr2[0] = 0;
                            j17 = j16;
                            j18 = 0;
                            i24 = 1;
                            while (i24 <= length2) {
                                int i38 = i24 - 1;
                                int i39 = i24;
                                j17 += (long) (c26860k.f107184y + iArr[i38]);
                                j18 += (long) (c26860k.f107185z + c26860k.f107182F[i38]);
                                jArr[i39] = j17;
                                jArr2[i39] = j18;
                                i24 = i39 + 1;
                            }
                            c4841c = new C4841c(jM71695z, jArr, jArr2);
                            break;
                        }
                        i19++;
                    }
                    if (c4842d.f20124q) {
                        interfaceC4844fM15419a2 = new C4843e(-9223372036854775807L);
                    } else {
                        if (c4841c != null) {
                            interfaceC4844fM15419a = c4841c;
                        } else if (interfaceC4844fM15419a == null) {
                            interfaceC4844fM15419a = null;
                        }
                        if (interfaceC4844fM15419a != null) {
                            interfaceC4844fM15419a.mo3113e();
                            interfaceC4844fM15419a2 = interfaceC4844fM15419a;
                        } else {
                            interfaceC4844fM15419a2 = c4842d.m15419a(interfaceC37368j2, false);
                        }
                    }
                    c4842d.f20123p = interfaceC4844fM15419a2;
                    c4842d.f20114g.mo3111x(interfaceC4844fM15419a2);
                    InterfaceC37377s interfaceC37377s = c4842d.f20116i;
                    C31518b0 c31518b0 = new C31518b0();
                    c31518b0.f130047k = c33621b0.f140344c;
                    c31518b0.f130048l = 4096;
                    c31518b0.f130060x = c33621b0.f140347f;
                    c31518b0.f130061y = c33621b0.f140346e;
                    c31518b0.f130033A = c37371m.f159861a;
                    c31518b0.f130034B = c37371m.f159862b;
                    c31518b0.f130045i = c4842d.f20118k;
                    interfaceC37377s.mo102730a(new C31521c0(c31518b0));
                    c4842d.f20121n = c37364f3.f159852z;
                } else {
                    c33621b0 = c33621b1;
                    th3 = null;
                    j7 = 1000000;
                    j13 = 0;
                    j14 = c4842d.f20121n;
                    if (j14 != 0) {
                        j15 = ((C37364f) interfaceC37368j2).f159852z;
                        if (j15 < j14) {
                            ((C37364f) interfaceC37368j2).mo3100n((int) (j14 - j15));
                        }
                    }
                }
                if (c4842d.f20122o == 0) {
                    ((C37364f) interfaceC37368j2).f159847F = 0;
                    if (m15420c(interfaceC37368j)) {
                        i13 = -1;
                        i14 = -1;
                    } else {
                        c13117a.m36689K(0);
                        iM36699i = c13117a.m36699i();
                        if (((-128000) & iM36699i) == (((long) c4842d.f20117j) & (-128000)) || AbstractC33922a.m107330d(iM36699i) == -1) {
                            ((C37364f) interfaceC37368j2).mo3100n(1);
                            c4842d.f20117j = 0;
                        } else {
                            c33621b0.m106233a(iM36699i);
                            if (c4842d.f20119l == -9223372036854775807L) {
                                c4842d.f20119l = c4842d.f20123p.mo15415a(((C37364f) interfaceC37368j2).f159852z);
                                long j29 = c4842d.f20108a;
                                if (j29 != -9223372036854775807L) {
                                    c4842d.f20119l = (j29 - c4842d.f20123p.mo15415a(j13)) + c4842d.f20119l;
                                }
                            }
                            c4842d.f20122o = c33621b0.f140345d;
                            InterfaceC4844f interfaceC4844f2 = c4842d.f20123p;
                            if (interfaceC4844f2 instanceof AbstractC4840b) {
                                AbstractC4840b abstractC4840b = (AbstractC4840b) interfaceC4844f2;
                                long j34 = (((c4842d.f20120m + ((long) c33621b0.f140349h)) * j7) / ((long) c33621b0.f140346e)) + c4842d.f20119l;
                                long j35 = ((C37364f) interfaceC37368j2).f159852z;
                                if (!abstractC4840b.m15417b(j34)) {
                                    throw th3;
                                }
                                if (c4842d.f20125r && abstractC4840b.m15417b(c4842d.f20126s)) {
                                    c4842d.f20125r = false;
                                    c4842d.f20116i = c4842d.f20115h;
                                }
                            }
                            iMo102731b = c4842d.f20116i.mo102731b(interfaceC37368j2, c4842d.f20122o, true);
                            if (iMo102731b == -1) {
                                i13 = -1;
                                i14 = -1;
                            } else {
                                i15 = c4842d.f20122o - iMo102731b;
                                c4842d.f20122o = i15;
                                if (i15 <= 0) {
                                    c4842d.f20116i.mo102733d(c4842d.f20119l + ((c4842d.f20120m * j7) / ((long) c33621b0.f140346e)), 1, c33621b0.f140345d, 0, null);
                                    c4842d.f20120m += (long) c33621b0.f140349h;
                                    c4842d.f20122o = 0;
                                    i14 = 0;
                                    i13 = -1;
                                }
                            }
                        }
                        i13 = -1;
                        i14 = 0;
                    }
                } else {
                    iMo102731b = c4842d.f20116i.mo102731b(interfaceC37368j2, c4842d.f20122o, true);
                    if (iMo102731b == -1) {
                        i13 = -1;
                        i14 = -1;
                    } else {
                        i15 = c4842d.f20122o - iMo102731b;
                        c4842d.f20122o = i15;
                        if (i15 <= 0) {
                            i13 = -1;
                            i14 = 0;
                        } else {
                            c4842d.f20116i.mo102733d(c4842d.f20119l + ((c4842d.f20120m * j7) / ((long) c33621b0.f140346e)), 1, c33621b0.f140345d, 0, null);
                            c4842d.f20120m += (long) c33621b0.f140349h;
                            c4842d.f20122o = 0;
                            i14 = 0;
                            i13 = -1;
                        }
                    }
                }
            } catch (EOFException unused) {
                c33621b0 = c33621b1;
                i13 = -1;
                i14 = -1;
                j7 = 1000000;
            }
        } else {
            interfaceC4844f = c4842d.f20123p;
            c13117a = c4842d.f20109b;
            if (interfaceC4844f == null) {
                c13117a2 = new C13117a(c33621b1.f140345d);
                j7 = 1000000;
                ((C37364f) interfaceC37368j2).mo3092c(c13117a2.f45381a, 0, c33621b1.f140345d, false);
                i16 = 21;
                if ((c33621b1.f140343b & 1) != 0) {
                    if (c33621b1.f140347f != 1) {
                        i16 = 36;
                    }
                } else if (c33621b1.f140347f == 1) {
                    i16 = 13;
                }
                th3 = null;
                j13 = 0;
                if (c13117a2.f45383c >= i16 + 4) {
                    c13117a2.m36689K(i16);
                    iM36699i2 = c13117a2.m36699i();
                    if (iM36699i2 != 1483304551) {
                        if (c13117a2.f45383c >= 40) {
                            c13117a2.m36689K(36);
                            if (c13117a2.m36699i() == 1447187017) {
                                iM36699i2 = 1447187017;
                            } else {
                                iM36699i2 = 0;
                            }
                        } else {
                            iM36699i2 = 0;
                        }
                    }
                } else if (c13117a2.f45383c >= 40) {
                    c13117a2.m36689K(36);
                    if (c13117a2.m36699i() == 1447187017) {
                        iM36699i2 = 1447187017;
                    } else {
                        iM36699i2 = 0;
                    }
                } else {
                    iM36699i2 = 0;
                }
                c37371m = c4842d.f20111d;
                if (iM36699i2 != 1483304551) {
                    c33621b0 = c33621b1;
                    c37364f = (C37364f) interfaceC37368j;
                    long j110 = c37364f.f159851y;
                    long j210 = c37364f.f159852z;
                    int i210 = c33621b0.f140349h;
                    int i211 = c33621b0.f140346e;
                    iM36699i3 = c13117a2.m36699i();
                    if ((iM36699i3 & 1) == 1) {
                        interfaceC4844fM15419a = null;
                    } else {
                        interfaceC4844fM15419a = null;
                    }
                    if (interfaceC4844fM15419a != null) {
                        c37364f.f159847F = 0;
                        c37364f.m119648a(i16 + 141, false);
                        c37364f.mo3092c(c13117a.f45381a, 0, 3, false);
                        c13117a.m36689K(0);
                        int iM36679A2 = c13117a.m36679A();
                        i17 = iM36679A2 >> 12;
                        i18 = iM36679A2 & 4095;
                        if (i17 <= 0) {
                            c37371m.f159861a = i17;
                            c37371m.f159862b = i18;
                        } else {
                            c37371m.f159861a = i17;
                            c37371m.f159862b = i18;
                        }
                    }
                    c37364f.mo3100n(c33621b0.f140345d);
                    if (interfaceC4844fM15419a == null) {
                        c4842d = this;
                        interfaceC37368j2 = interfaceC37368j;
                    } else {
                        c4842d = this;
                        interfaceC37368j2 = interfaceC37368j;
                    }
                } else {
                    c33621b0 = c33621b1;
                    c37364f = (C37364f) interfaceC37368j;
                    long j111 = c37364f.f159851y;
                    long j211 = c37364f.f159852z;
                    int i212 = c33621b0.f140349h;
                    int i213 = c33621b0.f140346e;
                    iM36699i3 = c13117a2.m36699i();
                    if ((iM36699i3 & 1) == 1) {
                        interfaceC4844fM15419a = null;
                    } else {
                        interfaceC4844fM15419a = null;
                    }
                    if (interfaceC4844fM15419a != null) {
                        c37364f.f159847F = 0;
                        c37364f.m119648a(i16 + 141, false);
                        c37364f.mo3092c(c13117a.f45381a, 0, 3, false);
                        c13117a.m36689K(0);
                        int iM36679A3 = c13117a.m36679A();
                        i17 = iM36679A3 >> 12;
                        i18 = iM36679A3 & 4095;
                        if (i17 <= 0) {
                            c37371m.f159861a = i17;
                            c37371m.f159862b = i18;
                        } else {
                            c37371m.f159861a = i17;
                            c37371m.f159862b = i18;
                        }
                    }
                    c37364f.mo3100n(c33621b0.f140345d);
                    if (interfaceC4844fM15419a == null) {
                        c4842d = this;
                        interfaceC37368j2 = interfaceC37368j;
                    } else {
                        c4842d = this;
                        interfaceC37368j2 = interfaceC37368j;
                    }
                }
                c18715c = c4842d.f20118k;
                C37364f c37364f4 = (C37364f) interfaceC37368j2;
                j16 = c37364f4.f159852z;
                if (c18715c != null) {
                    c4841c = null;
                    break;
                }
                interfaceC18714bArr = c18715c.f73525w;
                length = interfaceC18714bArr.length;
                i19 = 0;
                while (true) {
                    if (i19 < length) {
                        c4841c = null;
                        break;
                    }
                    interfaceC18714b = interfaceC18714bArr[i19];
                    if (interfaceC18714b instanceof C26860k) {
                        c26860k = (C26860k) interfaceC18714b;
                        iArr = c26860k.f107181E;
                        if (c18715c != null) {
                            jM71695z = -9223372036854775807L;
                            break;
                        }
                        interfaceC18714bArr2 = c18715c.f73525w;
                        length3 = interfaceC18714bArr2.length;
                        i25 = 0;
                        while (true) {
                            if (i25 < length3) {
                                jM71695z = -9223372036854775807L;
                                break;
                            }
                            interfaceC18714b2 = interfaceC18714bArr2[i25];
                            if (interfaceC18714b2 instanceof C26862m) {
                                c26862m = (C26862m) interfaceC18714b2;
                                if (c26862m.f107177w.equals("TLEN")) {
                                    jM71695z = AbstractC24567y.m71695z(Long.parseLong(c26862m.f107189y));
                                    break;
                                }
                            }
                            i25++;
                        }
                        length2 = iArr.length;
                        int i310 = length2 + 1;
                        jArr = new long[i310];
                        jArr2 = new long[i310];
                        jArr[0] = j16;
                        jArr2[0] = 0;
                        j17 = j16;
                        j18 = 0;
                        i24 = 1;
                        while (i24 <= length2) {
                            int i311 = i24 - 1;
                            int i312 = i24;
                            j17 += (long) (c26860k.f107184y + iArr[i311]);
                            j18 += (long) (c26860k.f107185z + c26860k.f107182F[i311]);
                            jArr[i312] = j17;
                            jArr2[i312] = j18;
                            i24 = i312 + 1;
                        }
                        c4841c = new C4841c(jM71695z, jArr, jArr2);
                        break;
                    }
                    i19++;
                }
                if (c4842d.f20124q) {
                    interfaceC4844fM15419a2 = new C4843e(-9223372036854775807L);
                } else {
                    if (c4841c != null) {
                        interfaceC4844fM15419a = c4841c;
                    } else if (interfaceC4844fM15419a == null) {
                        interfaceC4844fM15419a = null;
                    }
                    if (interfaceC4844fM15419a != null) {
                        interfaceC4844fM15419a.mo3113e();
                        interfaceC4844fM15419a2 = interfaceC4844fM15419a;
                    } else {
                        interfaceC4844fM15419a2 = c4842d.m15419a(interfaceC37368j2, false);
                    }
                }
                c4842d.f20123p = interfaceC4844fM15419a2;
                c4842d.f20114g.mo3111x(interfaceC4844fM15419a2);
                InterfaceC37377s interfaceC37377s2 = c4842d.f20116i;
                C31518b0 c31518b1 = new C31518b0();
                c31518b1.f130047k = c33621b0.f140344c;
                c31518b1.f130048l = 4096;
                c31518b1.f130060x = c33621b0.f140347f;
                c31518b1.f130061y = c33621b0.f140346e;
                c31518b1.f130033A = c37371m.f159861a;
                c31518b1.f130034B = c37371m.f159862b;
                c31518b1.f130045i = c4842d.f20118k;
                interfaceC37377s2.mo102730a(new C31521c0(c31518b1));
                c4842d.f20121n = c37364f4.f159852z;
            } else {
                c33621b0 = c33621b1;
                th3 = null;
                j7 = 1000000;
                j13 = 0;
                j14 = c4842d.f20121n;
                if (j14 != 0) {
                    j15 = ((C37364f) interfaceC37368j2).f159852z;
                    if (j15 < j14) {
                        ((C37364f) interfaceC37368j2).mo3100n((int) (j14 - j15));
                    }
                }
            }
            if (c4842d.f20122o == 0) {
                ((C37364f) interfaceC37368j2).f159847F = 0;
                if (m15420c(interfaceC37368j)) {
                    i13 = -1;
                    i14 = -1;
                } else {
                    c13117a.m36689K(0);
                    iM36699i = c13117a.m36699i();
                    if (((-128000) & iM36699i) == (((long) c4842d.f20117j) & (-128000))) {
                    }
                    ((C37364f) interfaceC37368j2).mo3100n(1);
                    c4842d.f20117j = 0;
                    i13 = -1;
                    i14 = 0;
                }
            } else {
                iMo102731b = c4842d.f20116i.mo102731b(interfaceC37368j2, c4842d.f20122o, true);
                if (iMo102731b == -1) {
                    i13 = -1;
                    i14 = -1;
                } else {
                    i15 = c4842d.f20122o - iMo102731b;
                    c4842d.f20122o = i15;
                    if (i15 <= 0) {
                        i13 = -1;
                        i14 = 0;
                    } else {
                        c4842d.f20116i.mo102733d(c4842d.f20119l + ((c4842d.f20120m * j7) / ((long) c33621b0.f140346e)), 1, c33621b0.f140345d, 0, null);
                        c4842d.f20120m += (long) c33621b0.f140349h;
                        c4842d.f20122o = 0;
                        i14 = 0;
                        i13 = -1;
                    }
                }
            }
        }
        if (i14 == i13) {
            InterfaceC4844f interfaceC4844f3 = c4842d.f20123p;
            if (interfaceC4844f3 instanceof AbstractC4840b) {
                if (interfaceC4844f3.mo3114f() != ((c4842d.f20120m * j7) / ((long) c33621b0.f140346e)) + c4842d.f20119l) {
                    InterfaceC4844f interfaceC4844f4 = c4842d.f20123p;
                    ((AbstractC4840b) interfaceC4844f4).getClass();
                    c4842d.f20114g.mo3111x(interfaceC4844f4);
                }
            }
        }
        return i14;
    }

    @Override // p588wm.InterfaceC37367i
    public final void release() {
    }

    public C4842d(long j7) {
        this.f20108a = j7;
        this.f20109b = new C13117a(10);
        this.f20110c = new C33621b0(1);
        this.f20111d = new C37371m();
        this.f20119l = -9223372036854775807L;
        this.f20112e = new C34249c(20);
        C37366h c37366h = new C37366h();
        this.f20113f = c37366h;
        this.f20116i = c37366h;
    }
}
