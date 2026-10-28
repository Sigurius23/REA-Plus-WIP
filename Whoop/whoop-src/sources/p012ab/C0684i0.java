package p012ab;

import a33.C0352d;
import android.opengl.GLES20;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.health.platform.client.proto.C1533u;
import androidx.media3.common.util.GlUtil$GlException;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bf3.InterfaceC3202a;
import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ed3.C13117a;
import g40.C15362h2;
import g40.C15426t3;
import g40.C15431u3;
import g40.C15446x3;
import g40.InterfaceC15386l3;
import g40.InterfaceC15421s3;
import g73.C15553a;
import g73.C15556d;
import gg3.InterfaceC15830c;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p151fn.C14618f;
import p151fn.C14636x;
import p151fn.C14637y;
import p151fn.InterfaceC14633u;
import p151fn.InterfaceC14638z;
import p292l1.C23187v0;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.C24561s;
import p309lo.C24566x;
import p412q3.C29871f0;
import p412q3.InterfaceC29873g0;
import p442qy.C30765d;
import p442qy.C30766e;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p499t9.C33647p;
import p499t9.InterfaceC33648q;
import p588wm.InterfaceC37369k;
import p607x8.AbstractC38046a;
import p607x8.C38059n;
import p607x8.C38064s;
import p619xl.C38445a;
import p636y3.EnumC39181m;
import p658yr.AbstractC39717d;
import p664yy.AbstractC39872m0;
import p664yy.C39863i;
import p664yy.C39875o;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qe3.InterfaceC30316a;
import s83.AbstractC32269c;
import x30.C37889g;
import xe3.C38244g;
import yb3.AbstractC39414r;
import yo1.C39689b;

/* JADX INFO: renamed from: ab.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0684i0 implements InterfaceC0676e0, InterfaceC14633u, InterfaceC15830c, InterfaceC15386l3 {

    /* JADX INFO: renamed from: E */
    public Object f2442E;

    /* JADX INFO: renamed from: F */
    public Object f2443F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f2444w;

    /* JADX INFO: renamed from: x */
    public int f2445x;

    /* JADX INFO: renamed from: y */
    public Object f2446y;

    /* JADX INFO: renamed from: z */
    public Object f2447z;

    public /* synthetic */ C0684i0(int i13, boolean z4) {
        this.f2444w = i13;
    }

    /* JADX INFO: renamed from: q */
    public static void m1714q(int i13, int i14, String str) throws GlUtil$GlException {
        int iGlCreateShader = GLES20.glCreateShader(i14);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        AbstractC38046a.m121809d(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i13, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        AbstractC38046a.m121808c();
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: a */
    public InterfaceC13037f2 mo1715a() {
        switch (this.f2444w) {
            case 8:
                break;
        }
        return (C13045h2) this.f2442E;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: b */
    public String mo1716b(String rawValue) {
        switch (this.f2444w) {
        }
        AbstractC22676k.m65750j(rawValue, "rawValue");
        return rawValue;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0272  */
    /* JADX WARN: Code duplicated, block: B:116:0x0302  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:99:0x0207  */
    @Override // p012ab.InterfaceC0676e0
    /* JADX INFO: renamed from: c */
    public void mo931c(C38059n c38059n) {
        SparseArray sparseArray;
        C24561s c24561s;
        int i13;
        InterfaceC0692m0 c0705z;
        InterfaceC0692m0 c0705z2;
        int i14;
        SparseArray sparseArray2;
        SparseArray sparseArray3 = (SparseArray) this.f2447z;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f2442E;
        C24561s c24561s2 = (C24561s) this.f2446y;
        C0686j0 c0686j0 = (C0686j0) this.f2443F;
        SparseArray sparseArray4 = c0686j0.f2454g;
        SparseBooleanArray sparseBooleanArray = c0686j0.f2455h;
        if (c38059n.m121867t() != 2) {
            return;
        }
        int i15 = 0;
        C38064s c38064s = (C38064s) c0686j0.f2449b.get(0);
        if ((c38059n.m121867t() & 128) == 0) {
            return;
        }
        c38059n.m121847G(1);
        int iM121873z = c38059n.m121873z();
        int i16 = 3;
        c38059n.m121847G(3);
        c38059n.m121852e(c24561s2.f95858b, 0, 2);
        c24561s2.m71640q(0);
        c24561s2.m71643t(3);
        int i17 = 13;
        c0686j0.f2464q = c24561s2.m71632i(13);
        c38059n.m121852e(c24561s2.f95858b, 0, 2);
        c24561s2.m71640q(0);
        c24561s2.m71643t(4);
        c38059n.m121847G(c24561s2.m71632i(12));
        sparseArray3.clear();
        sparseIntArray.clear();
        int iM121848a = c38059n.m121848a();
        while (iM121848a > 0) {
            c38059n.m121852e(c24561s2.f95858b, i15, 5);
            c24561s2.m71640q(i15);
            int iM71632i = c24561s2.m71632i(8);
            c24561s2.m71643t(i16);
            int iM71632i2 = c24561s2.m71632i(i17);
            c24561s2.m71643t(4);
            int iM71632i3 = c24561s2.m71632i(12);
            int i18 = c38059n.f163018b;
            int i19 = i18 + iM71632i3;
            String strTrim = null;
            ArrayList arrayList = null;
            int i24 = -1;
            int iM121867t = 0;
            while (true) {
                c24561s = c24561s2;
                if (c38059n.f163018b < i19) {
                    int iM121867t2 = c38059n.m121867t();
                    int iM121867t3 = c38059n.f163018b + c38059n.m121867t();
                    if (iM121867t3 <= i19) {
                        int i25 = iM121848a;
                        if (iM121867t2 == 5) {
                            long jM121869v = c38059n.m121869v();
                            if (jM121869v == 1094921523) {
                                i24 = 129;
                            } else if (jM121869v == 1161904947) {
                                i24 = 135;
                            } else if (jM121869v == 1094921524) {
                                i24 = 172;
                            } else if (jM121869v == 1212503619) {
                                i24 = 36;
                            }
                            i14 = iM121867t3;
                            sparseArray2 = sparseArray4;
                        } else if (iM121867t2 == 106) {
                            i14 = iM121867t3;
                            sparseArray2 = sparseArray4;
                            i24 = 129;
                        } else if (iM121867t2 == 122) {
                            sparseArray2 = sparseArray4;
                            i24 = 135;
                            i14 = iM121867t3;
                        } else if (iM121867t2 == 127) {
                            int iM121867t4 = c38059n.m121867t();
                            if (iM121867t4 == 21) {
                                i24 = 172;
                            } else if (iM121867t4 == 14) {
                                i24 = 136;
                            } else if (iM121867t4 == 33) {
                                i24 = 139;
                            }
                            i14 = iM121867t3;
                            sparseArray2 = sparseArray4;
                        } else if (iM121867t2 == 123) {
                            i14 = iM121867t3;
                            sparseArray2 = sparseArray4;
                            i24 = 138;
                        } else if (iM121867t2 == 10) {
                            strTrim = c38059n.m121865r(3, StandardCharsets.UTF_8).trim();
                            i14 = iM121867t3;
                            sparseArray2 = sparseArray4;
                            iM121867t = c38059n.m121867t();
                        } else {
                            int i26 = 3;
                            if (iM121867t2 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (c38059n.f163018b < iM121867t3) {
                                    String strTrim2 = c38059n.m121865r(i26, StandardCharsets.UTF_8).trim();
                                    c38059n.m121867t();
                                    int i27 = iM121867t3;
                                    byte[] bArr = new byte[4];
                                    c38059n.m121852e(bArr, 0, 4);
                                    arrayList2.add(new C0688k0(strTrim2, bArr));
                                    iM121867t3 = i27;
                                    sparseArray4 = sparseArray4;
                                    i26 = 3;
                                }
                                i14 = iM121867t3;
                                sparseArray2 = sparseArray4;
                                arrayList = arrayList2;
                                i24 = 89;
                            } else {
                                i14 = iM121867t3;
                                sparseArray2 = sparseArray4;
                                if (iM121867t2 == 111) {
                                    i24 = 257;
                                }
                            }
                        }
                        c38059n.m121847G(i14 - c38059n.f163018b);
                        c24561s2 = c24561s;
                        iM121848a = i25;
                        sparseArray4 = sparseArray2;
                    }
                }
            }
            SparseArray sparseArray5 = sparseArray4;
            int i28 = iM121848a;
            c38059n.m121846F(i19);
            C0682h0 c0682h0 = new C0682h0(i24, strTrim, iM121867t, arrayList, Arrays.copyOfRange(c38059n.f163017a, i18, i19));
            String str = strTrim;
            if (iM71632i == 6 || iM71632i == 5) {
                iM71632i = i24;
            }
            iM121848a = i28 - (iM71632i3 + 5);
            if (sparseBooleanArray.get(iM71632i2)) {
                i13 = 3;
            } else {
                C0679g c0679g = c0686j0.f2452e;
                i13 = 3;
                if (iM71632i == 2) {
                    c0705z = new C0705z(new C0689l(new C38445a(c0679g.m1672a(c0682h0), 2), "video/mp2t"));
                } else {
                    if (iM71632i == 3 || iM71632i == 4) {
                        c0705z2 = new C0705z(new C0701v(str, c0682h0.m1701p(), "video/mp2t"));
                    } else if (iM71632i == 21) {
                        c0705z = new C0705z(new C0683i(1));
                    } else if (iM71632i == 27) {
                        c0705z = new C0705z(new C0697r(new C0352d(c0679g.m1672a(c0682h0)), false, false));
                    } else if (iM71632i == 36) {
                        c0705z = new C0705z(new C0699t(new C0352d(c0679g.m1672a(c0682h0))));
                    } else if (iM71632i == 45) {
                        c0705z = new C0705z(new C0702w());
                    } else if (iM71632i == 89) {
                        c0705z = new C0705z(new C0683i((List) c0682h0.f2433y, 0));
                    } else if (iM71632i == 172) {
                        c0705z2 = new C0705z(new C0671c(str, c0682h0.m1701p(), "video/mp2t", 1));
                    } else if (iM71632i == 257) {
                        c0705z = new C0678f0(new C0352d("application/vnd.dvb.ait", 1));
                    } else if (iM71632i == 138) {
                        c0705z2 = new C0705z(new C0681h(str, c0682h0.m1701p(), 4096));
                    } else if (iM71632i != 139) {
                        switch (iM71632i) {
                            case 15:
                                c0705z2 = new C0705z(new C0677f(false, str, c0682h0.m1701p(), "video/mp2t"));
                                break;
                            case 16:
                                c0705z = new C0705z(new C0694o(new C38445a(c0679g.m1672a(c0682h0), 2)));
                                break;
                            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                c0705z2 = new C0705z(new C0700u(str, c0682h0.m1701p()));
                                break;
                            default:
                                switch (iM71632i) {
                                    case 128:
                                        c0705z = new C0705z(new C0689l(new C38445a(c0679g.m1672a(c0682h0), 2), "video/mp2t"));
                                        break;
                                    case 129:
                                        c0705z2 = new C0705z(new C0671c(str, c0682h0.m1701p(), "video/mp2t", 0));
                                        break;
                                    case 130:
                                        c0705z = null;
                                        break;
                                    default:
                                        switch (iM71632i) {
                                            case 134:
                                                c0705z = new C0678f0(new C0352d("application/x-scte35", 1));
                                                break;
                                            case 135:
                                                c0705z2 = new C0705z(new C0671c(str, c0682h0.m1701p(), "video/mp2t", 0));
                                                break;
                                            case 136:
                                                c0705z2 = new C0705z(new C0681h(str, c0682h0.m1701p(), 4096));
                                                break;
                                            default:
                                                c0705z = null;
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        c0705z2 = new C0705z(new C0681h(str, c0682h0.m1701p(), 5408));
                    }
                    c0705z = c0705z2;
                }
                sparseIntArray.put(iM71632i2, iM71632i2);
                sparseArray3.put(iM71632i2, c0705z);
            }
            i16 = i13;
            c24561s2 = c24561s;
            sparseArray4 = sparseArray5;
            i15 = 0;
            i17 = 13;
        }
        SparseArray sparseArray6 = sparseArray4;
        int size = sparseIntArray.size();
        int i29 = 0;
        while (i29 < size) {
            int iKeyAt = sparseIntArray.keyAt(i29);
            int iValueAt = sparseIntArray.valueAt(i29);
            sparseBooleanArray.put(iKeyAt, true);
            c0686j0.f2456i.put(iValueAt, true);
            InterfaceC0692m0 interfaceC0692m0 = (InterfaceC0692m0) sparseArray3.valueAt(i29);
            if (interfaceC0692m0 != null) {
                interfaceC0692m0.mo1671g(c38064s, c0686j0.f2459l, new C0690l0(iM121873z, iKeyAt, DfuBaseService.ERROR_REMOTE_MASK, 0));
                sparseArray = sparseArray6;
                sparseArray.put(iValueAt, interfaceC0692m0);
            } else {
                sparseArray = sparseArray6;
            }
            i29++;
            sparseArray6 = sparseArray;
        }
        sparseArray6.remove(this.f2445x);
        c0686j0.f2460m = 0;
        c0686j0.f2459l.mo3098l();
        c0686j0.f2461n = true;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: d */
    public InterfaceC29873g0 mo1717d() {
        switch (this.f2444w) {
            case 8:
                return (C15362h2) this.f2447z;
            default:
                return (C37889g) this.f2447z;
        }
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: e */
    public String mo1718e() {
        switch (this.f2444w) {
            case 8:
                return "00012345";
            default:
                return "10-80-00";
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x0138  */
    @Override // p151fn.InterfaceC14633u
    /* JADX INFO: renamed from: f */
    public void mo934f(C13117a c13117a) {
        C24566x c24566x;
        C24566x c24566x2;
        SparseArray sparseArray;
        int i13;
        int i14;
        char c3;
        SparseArray sparseArray2 = (SparseArray) this.f2447z;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f2442E;
        C24561s c24561s = (C24561s) this.f2446y;
        C14636x c14636x = (C14636x) this.f2443F;
        SparseArray sparseArray3 = c14636x.f54032f;
        SparseBooleanArray sparseBooleanArray = c14636x.f54033g;
        C14618f c14618f = c14636x.f54031e;
        List list = c14636x.f54028b;
        int i15 = c14636x.f54027a;
        if (c13117a.m36715y() == 2) {
            if (i15 == 1 || i15 == 2 || c14636x.f54038l == 1) {
                c24566x = (C24566x) list.get(0);
            } else {
                c24566x = new C24566x(((C24566x) list.get(0)).m71661c());
                list.add(c24566x);
            }
            if ((c13117a.m36715y() & 128) != 0) {
                c13117a.m36690L(1);
                int iM36682D = c13117a.m36682D();
                c13117a.m36690L(3);
                c13117a.m36697g(c24561s.f95858b, 0, 2);
                c24561s.m71640q(0);
                c24561s.m71643t(3);
                c14636x.f54044r = c24561s.m71632i(13);
                c13117a.m36697g(c24561s.f95858b, 0, 2);
                c24561s.m71640q(0);
                c24561s.m71643t(4);
                c13117a.m36690L(c24561s.m71632i(12));
                if (i15 == 2 && c14636x.f54042p == null) {
                    InterfaceC14638z interfaceC14638zM41819a = c14618f.m41819a(21, new C0352d(21, (String) null, (ArrayList) null, AbstractC24567y.f95880f));
                    c14636x.f54042p = interfaceC14638zM41819a;
                    if (interfaceC14638zM41819a != null) {
                        interfaceC14638zM41819a.mo41827i(c24566x, c14636x.f54037k, new C0690l0(iM36682D, 21, DfuBaseService.ERROR_REMOTE_MASK, 1));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int iM36692a = c13117a.m36692a();
                while (iM36692a > 0) {
                    c13117a.m36697g(c24561s.f95858b, 0, 5);
                    c24561s.m71640q(0);
                    int iM71632i = c24561s.m71632i(8);
                    c24561s.m71643t(3);
                    int iM71632i2 = c24561s.m71632i(13);
                    c24561s.m71643t(4);
                    int iM71632i3 = c24561s.m71632i(12);
                    int i16 = c13117a.f45382b;
                    int i17 = i16 + iM71632i3;
                    int i18 = -1;
                    String strTrim = null;
                    ArrayList arrayList = null;
                    while (true) {
                        if (c13117a.f45382b >= i17) {
                            i14 = iM36692a;
                            break;
                        }
                        int iM36715y = c13117a.m36715y();
                        i14 = iM36692a;
                        int iM36715y2 = c13117a.f45382b + c13117a.m36715y();
                        if (iM36715y2 > i17) {
                            break;
                        }
                        C24561s c24561s2 = c24561s;
                        if (iM36715y == 5) {
                            long jM36716z = c13117a.m36716z();
                            if (jM36716z == 1094921523) {
                                i18 = 129;
                            } else if (jM36716z == 1161904947) {
                                i18 = 135;
                            } else if (jM36716z == 1094921524) {
                                i18 = 172;
                            } else if (jM36716z == 1212503619) {
                                i18 = 36;
                            }
                        } else if (iM36715y == 106) {
                            iM36715y2 = iM36715y2;
                            c24566x = c24566x;
                            i18 = 129;
                            iM36682D = iM36682D;
                        } else if (iM36715y == 122) {
                            i18 = 135;
                            iM36715y2 = iM36715y2;
                        } else if (iM36715y == 127) {
                            if (c13117a.m36715y() == 21) {
                                i18 = 172;
                            }
                        } else if (iM36715y == 123) {
                            i18 = 138;
                        } else if (iM36715y == 10) {
                            strTrim = c13117a.m36712v(3, AbstractC39717d.f170958c).trim();
                        } else if (iM36715y == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (c13117a.f45382b < iM36715y2) {
                                String strTrim2 = c13117a.m36712v(3, AbstractC39717d.f170958c).trim();
                                c13117a.m36715y();
                                C24566x c24566x3 = c24566x;
                                byte[] bArr = new byte[4];
                                c13117a.m36697g(bArr, 0, 4);
                                arrayList2.add(new C14637y(strTrim2, bArr));
                                c24566x = c24566x3;
                                iM36715y2 = iM36715y2;
                                iM36682D = iM36682D;
                            }
                            iM36715y2 = iM36715y2;
                            iM36682D = iM36682D;
                            c24566x = c24566x;
                            arrayList = arrayList2;
                            i18 = 89;
                        } else {
                            iM36715y2 = iM36715y2;
                            iM36682D = iM36682D;
                            c24566x = c24566x;
                            if (iM36715y == 111) {
                                i18 = 257;
                            }
                        }
                        c13117a.m36690L(iM36715y2 - c13117a.f45382b);
                        c24566x = c24566x;
                        iM36692a = i14;
                        iM36682D = iM36682D;
                        c24561s = c24561s2;
                    }
                    C24561s c24561s3 = c24561s;
                    int i19 = iM36682D;
                    C24566x c24566x4 = c24566x;
                    c13117a.m36689K(i17);
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(c13117a.f45381a, i16, i17);
                    int i24 = i18;
                    C0352d c0352d = new C0352d(i24, strTrim, arrayList, bArrCopyOfRange);
                    if (iM71632i == 6 || iM71632i == 5) {
                        iM71632i = i24;
                    }
                    int i25 = i14 - (iM71632i3 + 5);
                    int i26 = i15 == 2 ? iM71632i : iM71632i2;
                    if (sparseBooleanArray.get(i26)) {
                        c3 = 21;
                    } else {
                        c3 = 21;
                        InterfaceC14638z interfaceC14638zM41819a2 = (i15 == 2 && iM71632i == 21) ? c14636x.f54042p : c14618f.m41819a(iM71632i, c0352d);
                        if (i15 != 2 || iM71632i2 < sparseIntArray.get(i26, DfuBaseService.ERROR_REMOTE_MASK)) {
                            sparseIntArray.put(i26, iM71632i2);
                            sparseArray2.put(i26, interfaceC14638zM41819a2);
                        }
                    }
                    iM36692a = i25;
                    c24566x = c24566x4;
                    iM36682D = i19;
                    c24561s = c24561s3;
                }
                int i27 = iM36682D;
                C24566x c24566x5 = c24566x;
                int size = sparseIntArray.size();
                int i28 = 0;
                while (i28 < size) {
                    int iKeyAt = sparseIntArray.keyAt(i28);
                    int iValueAt = sparseIntArray.valueAt(i28);
                    sparseBooleanArray.put(iKeyAt, true);
                    c14636x.f54034h.put(iValueAt, true);
                    InterfaceC14638z interfaceC14638z = (InterfaceC14638z) sparseArray2.valueAt(i28);
                    if (interfaceC14638z != null) {
                        if (interfaceC14638z != c14636x.f54042p) {
                            InterfaceC37369k interfaceC37369k = c14636x.f54037k;
                            i13 = i27;
                            C0690l0 c0690l0 = new C0690l0(i13, iKeyAt, DfuBaseService.ERROR_REMOTE_MASK, 1);
                            c24566x2 = c24566x5;
                            interfaceC14638z.mo41827i(c24566x2, interfaceC37369k, c0690l0);
                        } else {
                            c24566x2 = c24566x5;
                            i13 = i27;
                        }
                        sparseArray = sparseArray3;
                        sparseArray.put(iValueAt, interfaceC14638z);
                    } else {
                        c24566x2 = c24566x5;
                        sparseArray = sparseArray3;
                        i13 = i27;
                    }
                    i28++;
                    c24566x5 = c24566x2;
                    sparseArray3 = sparseArray;
                    i27 = i13;
                }
                SparseArray sparseArray4 = sparseArray3;
                if (i15 == 2) {
                    if (c14636x.f54039m) {
                        return;
                    }
                    c14636x.f54037k.mo3098l();
                    c14636x.f54038l = 0;
                    c14636x.f54039m = true;
                    return;
                }
                sparseArray4.remove(this.f2445x);
                int i29 = i15 == 1 ? 0 : c14636x.f54038l - 1;
                c14636x.f54038l = i29;
                if (i29 == 0) {
                    c14636x.f54037k.mo3098l();
                    c14636x.f54039m = true;
                }
            }
        }
    }

    @Override // p012ab.InterfaceC0676e0
    /* JADX INFO: renamed from: g */
    public void mo935g(C38064s c38064s, InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
    }

    @Override // g40.InterfaceC15386l3
    public InterfaceC41211c getLabel() {
        switch (this.f2444w) {
            case 8:
                break;
        }
        return (C41210b) this.f2446y;
    }

    @Override // g40.InterfaceC15386l3
    public EnumC39181m getLayoutDirection() {
        switch (this.f2444w) {
        }
        return null;
    }

    @Override // g40.InterfaceC15386l3
    public C13045h2 getLoading() {
        switch (this.f2444w) {
            case 8:
                break;
        }
        return (C13045h2) this.f2443F;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: h */
    public int mo1719h() {
        switch (this.f2444w) {
        }
        return 0;
    }

    @Override // p151fn.InterfaceC14633u
    /* JADX INFO: renamed from: i */
    public void mo937i(C24566x c24566x, InterfaceC37369k interfaceC37369k, C0690l0 c0690l0) {
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: j */
    public String mo1720j(String userTyped) throws IOException {
        switch (this.f2444w) {
            case 8:
                AbstractC22676k.m65750j(userTyped, "userTyped");
                StringBuilder sb4 = new StringBuilder();
                int length = userTyped.length();
                for (int i13 = 0; i13 < length; i13++) {
                    char cCharAt = userTyped.charAt(i13);
                    if (Character.isDigit(cCharAt)) {
                        sb4.append(cCharAt);
                    }
                }
                return AbstractC39414r.m125866L0(8, sb4.toString());
            default:
                AbstractC22676k.m65750j(userTyped, "userTyped");
                StringBuilder sb5 = new StringBuilder();
                int length2 = userTyped.length();
                for (int i14 = 0; i14 < length2; i14++) {
                    char cCharAt2 = userTyped.charAt(i14);
                    if (Character.isDigit(cCharAt2)) {
                        sb5.append(cCharAt2);
                    }
                }
                return AbstractC39414r.m125866L0(6, sb5.toString());
        }
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: k */
    public InterfaceC15421s3 mo1721k(String input) {
        switch (this.f2444w) {
            case 8:
                AbstractC22676k.m65750j(input, "input");
                if (AbstractC39414r.m125890i0(input)) {
                    return C15426t3.f57978b;
                }
                return input.length() < 8 ? new C15431u3(R.string.stripe_bacs_account_number_incomplete) : new C15446x3(null);
            default:
                AbstractC22676k.m65750j(input, "input");
                if (AbstractC39414r.m125890i0(input)) {
                    return C15426t3.f57978b;
                }
                return input.length() < 6 ? new C15431u3(R.string.stripe_bacs_sort_code_incomplete) : new C15446x3(null);
        }
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: l */
    public boolean mo1722l() {
        switch (this.f2444w) {
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: m */
    public String mo1723m(String displayName) {
        switch (this.f2444w) {
        }
        AbstractC22676k.m65750j(displayName, "displayName");
        return displayName;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: n */
    public int mo1724n() {
        switch (this.f2444w) {
            case 8:
                break;
        }
        return this.f2445x;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: o */
    public boolean mo1725o() {
        switch (this.f2444w) {
        }
        return true;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: p */
    public boolean mo1726p() {
        switch (this.f2444w) {
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public Object m1727r(AbstractC39872m0 abstractC39872m0, AbstractC32269c abstractC32269c) {
        int i13 = this.f2445x;
        Iterable retryResponseCodes = abstractC39872m0.getRetryResponseCodes();
        return AbstractC3006f0.m8705K((InterfaceC30063j) this.f2446y, new C23187v0(new C39689b(5, this, abstractC39872m0), retryResponseCodes, i13, this, (InterfaceC30057d) null), abstractC32269c);
    }

    /* JADX INFO: renamed from: s */
    public void m1728s(Iterable iterable) {
        if (iterable == null) {
            throw new NullPointerException("extensions must not be null");
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC30316a interfaceC30316a = (InterfaceC30316a) it.next();
            if (interfaceC30316a instanceof InterfaceC3202a) {
                ((InterfaceC3202a) interfaceC30316a).mo9250a(this);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public int m1729t(String str) throws GlUtil$GlException {
        switch (this.f2444w) {
            case 5:
                int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f2445x, str);
                GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
                AbstractC24543a.m71571g();
                return iGlGetAttribLocation;
            default:
                int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.f2445x, str);
                GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
                AbstractC38046a.m121808c();
                return iGlGetAttribLocation2;
        }
    }

    public /* synthetic */ C0684i0(Object obj, Object obj2, byte[] bArr, Object[] objArr, int i13, int i14) {
        this.f2444w = i14;
        this.f2446y = obj;
        this.f2447z = obj2;
        this.f2442E = bArr;
        this.f2443F = objArr;
        this.f2445x = i13;
    }

    public C0684i0(InterfaceC30063j workContext, C30765d logger, int i13) {
        this.f2444w = 11;
        if ((i13 & 1) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            workContext = ExecutorC22364d.f87316w;
        }
        C39875o c39875o = new C39875o();
        logger = (i13 & 16) != 0 ? C30766e.f126697b : logger;
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(logger, "logger");
        this.f2446y = workContext;
        this.f2447z = C39863i.f172150a;
        this.f2442E = c39875o;
        this.f2445x = 3;
        this.f2443F = logger;
    }

    public C0684i0(String str, String str2, int i13) throws GlUtil$GlException {
        this.f2444w = i13;
        switch (i13) {
            case 10:
                int iGlCreateProgram = GLES20.glCreateProgram();
                this.f2445x = iGlCreateProgram;
                AbstractC38046a.m121808c();
                m1714q(iGlCreateProgram, 35633, str);
                m1714q(iGlCreateProgram, 35632, str2);
                GLES20.glLinkProgram(iGlCreateProgram);
                int[] iArr = {0};
                GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                AbstractC38046a.m121809d("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
                GLES20.glUseProgram(iGlCreateProgram);
                this.f2442E = new HashMap();
                int[] iArr2 = new int[1];
                GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
                this.f2446y = new C33623c0[iArr2[0]];
                for (int i14 = 0; i14 < iArr2[0]; i14++) {
                    int i15 = this.f2445x;
                    int[] iArr3 = new int[1];
                    GLES20.glGetProgramiv(i15, 35722, iArr3, 0);
                    int i16 = iArr3[0];
                    byte[] bArr = new byte[i16];
                    GLES20.glGetActiveAttrib(i15, i14, i16, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
                    for (int i17 = 0; i17 < i16; i17++) {
                        i16 = bArr[i17] == 0 ? i17 : i16;
                        break;
                    }
                    String str3 = new String(bArr, 0, i16);
                    GLES20.glGetAttribLocation(i15, str3);
                    C33623c0 c33623c0 = new C33623c0();
                    ((C33623c0[]) this.f2446y)[i14] = c33623c0;
                    ((HashMap) this.f2442E).put(str3, c33623c0);
                }
                this.f2443F = new HashMap();
                int[] iArr4 = new int[1];
                GLES20.glGetProgramiv(this.f2445x, 35718, iArr4, 0);
                this.f2447z = new C33647p[iArr4[0]];
                for (int i18 = 0; i18 < iArr4[0]; i18++) {
                    int i19 = this.f2445x;
                    int[] iArr5 = new int[1];
                    GLES20.glGetProgramiv(i19, 35719, iArr5, 0);
                    int i24 = iArr5[0];
                    byte[] bArr2 = new byte[i24];
                    GLES20.glGetActiveUniform(i19, i18, i24, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
                    for (int i25 = 0; i25 < i24; i25++) {
                        i24 = bArr2[i25] == 0 ? i25 : i24;
                        break;
                    }
                    String str4 = new String(bArr2, 0, i24);
                    GLES20.glGetUniformLocation(i19, str4);
                    C33647p c33647p = new C33647p(15);
                    ((C33647p[]) this.f2447z)[i18] = c33647p;
                    ((HashMap) this.f2443F).put(str4, c33647p);
                }
                AbstractC38046a.m121808c();
                break;
            default:
                int iGlCreateProgram2 = GLES20.glCreateProgram();
                this.f2445x = iGlCreateProgram2;
                AbstractC24543a.m71571g();
                AbstractC24543a.m71565a(iGlCreateProgram2, 35633, str);
                AbstractC24543a.m71565a(iGlCreateProgram2, 35632, str2);
                GLES20.glLinkProgram(iGlCreateProgram2);
                int[] iArr6 = {0};
                GLES20.glGetProgramiv(iGlCreateProgram2, 35714, iArr6, 0);
                if (iArr6[0] != 1) {
                    String strValueOf = String.valueOf(GLES20.glGetProgramInfoLog(iGlCreateProgram2));
                    Log.e("GlUtil", strValueOf.length() != 0 ? "Unable to link shader program: \n".concat(strValueOf) : new String("Unable to link shader program: \n"));
                }
                GLES20.glUseProgram(iGlCreateProgram2);
                this.f2442E = new HashMap();
                int[] iArr7 = new int[1];
                GLES20.glGetProgramiv(iGlCreateProgram2, 35721, iArr7, 0);
                this.f2446y = new C15553a[iArr7[0]];
                for (int i26 = 0; i26 < iArr7[0]; i26++) {
                    int i27 = this.f2445x;
                    int[] iArr8 = new int[1];
                    GLES20.glGetProgramiv(i27, 35722, iArr8, 0);
                    int i28 = iArr8[0];
                    byte[] bArr3 = new byte[i28];
                    GLES20.glGetActiveAttrib(i27, i26, i28, new int[1], 0, new int[1], 0, new int[1], 0, bArr3, 0);
                    for (int i29 = 0; i29 < i28; i29++) {
                        i28 = bArr3[i29] == 0 ? i29 : i28;
                        break;
                    }
                    String str5 = new String(bArr3, 0, i28);
                    GLES20.glGetAttribLocation(i27, str5);
                    C15553a c15553a = new C15553a(22);
                    ((C15553a[]) this.f2446y)[i26] = c15553a;
                    ((HashMap) this.f2442E).put(str5, c15553a);
                }
                this.f2443F = new HashMap();
                int[] iArr9 = new int[1];
                GLES20.glGetProgramiv(this.f2445x, 35718, iArr9, 0);
                this.f2447z = new C15556d[iArr9[0]];
                for (int i34 = 0; i34 < iArr9[0]; i34++) {
                    int i35 = this.f2445x;
                    int[] iArr10 = new int[1];
                    GLES20.glGetProgramiv(i35, 35719, iArr10, 0);
                    int i36 = iArr10[0];
                    byte[] bArr4 = new byte[i36];
                    GLES20.glGetActiveUniform(i35, i34, i36, new int[1], 0, new int[1], 0, new int[1], 0, bArr4, 0);
                    for (int i37 = 0; i37 < i36; i37++) {
                        i36 = bArr4[i37] == 0 ? i37 : i36;
                        break;
                    }
                    String str6 = new String(bArr4, 0, i36);
                    GLES20.glGetUniformLocation(i35, str6);
                    C15556d c15556d = new C15556d(22);
                    ((C15556d[]) this.f2447z)[i34] = c15556d;
                    ((HashMap) this.f2443F).put(str6, c15556d);
                }
                AbstractC24543a.m71571g();
                break;
        }
    }

    public C0684i0(int i13) {
        this.f2444w = i13;
        switch (i13) {
            case 8:
                this.f2446y = AbstractC32128i.m100064s(R.string.stripe_bacs_account_number, new Object[0], C25271y.f99162w);
                this.f2445x = 8;
                this.f2447z = C29871f0.f122092w;
                this.f2442E = AbstractC13091v.m36593c(null);
                this.f2443F = AbstractC13091v.m36593c(Boolean.FALSE);
                break;
            case 9:
                this.f2446y = AbstractC32128i.m100064s(R.string.stripe_bacs_sort_code, new Object[0], C25271y.f99162w);
                this.f2445x = 8;
                this.f2447z = C37889g.f162240a;
                this.f2442E = AbstractC13091v.m36593c(null);
                this.f2443F = AbstractC13091v.m36593c(Boolean.FALSE);
                break;
            default:
                this.f2446y = new ArrayList();
                this.f2447z = new ArrayList();
                this.f2442E = new ArrayList();
                this.f2443F = C38244g.f163963r;
                this.f2445x = 1;
                break;
        }
    }

    public C0684i0(C14636x c14636x, int i13) {
        this.f2444w = 3;
        this.f2443F = c14636x;
        this.f2446y = new C24561s(new byte[5], 5, 0, (byte) 0);
        this.f2447z = new SparseArray();
        this.f2442E = new SparseIntArray();
        this.f2445x = i13;
    }

    public C0684i0(C0686j0 c0686j0, int i13) {
        this.f2444w = 0;
        this.f2443F = c0686j0;
        this.f2446y = new C24561s(new byte[5], 5, 5, (byte) 0);
        this.f2447z = new SparseArray();
        this.f2442E = new SparseIntArray();
        this.f2445x = i13;
    }
}
