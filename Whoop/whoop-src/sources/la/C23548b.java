package la;

import ad3.AbstractC0757c;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowManager;
import androidx.health.platform.client.proto.C1533u;
import androidx.media3.common.ParserException;
import c93.InterfaceC4339a;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.nimbusds.jose.JOSEException;
import d00.AbstractC11435n;
import d00.C11433l;
import f20.EnumC14023b;
import i63.C18163d;
import ig3.InterfaceC18475a;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import j63.AbstractC21385b;
import j63.C21388e;
import ja3.C21521q;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.WeakHashMap;
import jp2.C21881l;
import kotlinx.serialization.SerializationException;
import l83.C23465k;
import l83.C23468n;
import lb3.AbstractC23811y;
import m40.C25027d;
import m40.C25032i;
import m63.C25123a;
import m63.C25125c;
import m63.C25126d;
import m83.AbstractC25247g0;
import ml.C25667i;
import ml.FragmentC25664f;
import ml.InterfaceC25666h;
import mm.C25680d;
import mo.InterfaceC25732m;
import mr.C25900f;
import n30.C26212c;
import n83.C26460c;
import nb3.C26546c;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONObject;
import p031b9.C2817b;
import p073cq.InterfaceC11035d;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p211i5.InterfaceC18102o;
import p249jc.C21567b;
import p338n9.InterfaceC26469c;
import p350nw.AbstractC27182c;
import p350nw.C27180a;
import p350nw.C27181b;
import p353o0.C27331o;
import p353o0.C27341y;
import p368og.InterfaceC27908e;
import p389p0.C28523g;
import p389p0.C28535l0;
import p389p0.C28539n0;
import p403pp.AbstractFutureC29420p;
import p403pp.C29406b;
import p403pp.C29411g;
import p442qy.C30765d;
import p499t9.C33637j0;
import p499t9.InterfaceC33646o;
import p505ts.AbstractC34132o;
import p516u8.C34592g;
import p599wz.C37718g0;
import p599wz.C37736m0;
import p599wz.EnumC37763v0;
import p599wz.InterfaceC37739n0;
import p607x8.C38059n;
import p628xw.AbstractC38674d;
import p636y3.C39169a;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import p715kotlin.jvm.internal.C22673i0;
import pe3.InterfaceC29121c;
import pf.AbstractC29125c;
import pg.C29158c;
import pg3.InterfaceC29201n;
import q00.C29709d;
import q00.C29711e;
import q30.C29893a;
import r83.EnumC31071a;
import r93.AbstractC31152r;
import r93.EnumC31106a0;
import r93.InterfaceC31135k;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;
import r93.InterfaceC31160v;
import r93.InterfaceC31162w;
import s63.C32236a;
import s83.AbstractC32269c;
import s93.InterfaceC32307i;
import ud3.AbstractC34799a1;
import va3.C35850h;
import wb3.AbstractC37056f;
import wc3.InterfaceC37138c;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: la.b */
/* JADX INFO: loaded from: classes5.dex */
public class C23548b implements InterfaceC16915u, InterfaceC25666h, InterfaceC25732m, InterfaceC26469c, InterfaceC31160v, InterfaceC18102o, InterfaceC31155s0, InterfaceC29121c, InterfaceC27908e, InterfaceC29201n, InterfaceC11035d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f93279w;

    /* JADX INFO: renamed from: x */
    public Object f93280x;

    public /* synthetic */ C23548b(Object obj, int i13) {
        this.f93279w = i13;
        this.f93280x = obj;
    }

    /* JADX INFO: renamed from: D */
    public static ECPublicKey m68159D(Object obj) throws JOSEException {
        C27181b c27181bM81765h;
        if (obj instanceof Map) {
            c27181bM81765h = C27181b.m81765h((Map) obj);
        } else {
            String string = obj != null ? obj.toString() : null;
            if (string == null) {
                string = "";
            }
            Set set = C27181b.f108794S;
            c27181bM81765h = C27181b.m81765h(AbstractC38674d.m124059i(-1, string));
        }
        C27180a c27180a = c27181bM81765h.f108795O;
        c27180a.getClass();
        ECParameterSpec eCParameterSpecM81769a = AbstractC27182c.m81769a(c27180a);
        if (eCParameterSpecM81769a == null) {
            throw new JOSEException("Couldn't get EC parameter spec for curve " + c27180a);
        }
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(c27181bM81765h.f108796P.m124048b(), c27181bM81765h.f108797Q.m124048b()), eCParameterSpecM81769a));
            AbstractC22676k.m65749i(eCPublicKey, "toECPublicKey(...)");
            return eCPublicKey;
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e5) {
            throw new JOSEException(e5.getMessage(), e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x029c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public void m68160A(int i13, int i14, InterfaceC33646o interfaceC33646o) throws ParserException {
        int i15;
        int i16;
        int i17;
        long j7;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        C23550d c23550d = (C23550d) this.f93280x;
        C23551e c23551e = c23550d.f93368b;
        SparseArray sparseArray = c23550d.f93370c;
        C38059n c38059n = c23550d.f93381k;
        C38059n c38059n2 = c23550d.f93379i;
        int i27 = 1;
        int i28 = 0;
        if (i13 != 161 && i13 != 163) {
            if (i13 == 165) {
                if (c23550d.f93349J != 2) {
                    return;
                }
                C23549c c23549c = (C23549c) sparseArray.get(c23550d.f93355P);
                int i29 = c23550d.f93358S;
                C38059n c38059n3 = c23550d.f93386p;
                if (i29 != 4 || !"V_VP9".equals(c23549c.f93310c)) {
                    interfaceC33646o.mo3100n(i14);
                    return;
                } else {
                    c38059n3.m121843C(i14);
                    interfaceC33646o.readFully(c38059n3.f163017a, 0, i14);
                    return;
                }
            }
            if (i13 == 16877) {
                c23550d.m68191c(i13);
                C23549c c23549c2 = c23550d.f93394x;
                int i34 = c23549c2.f93315h;
                if (i34 != 1685485123 && i34 != 1685480259) {
                    interfaceC33646o.mo3100n(i14);
                    return;
                }
                byte[] bArr = new byte[i14];
                c23549c2.f93296P = bArr;
                interfaceC33646o.readFully(bArr, 0, i14);
                return;
            }
            if (i13 == 16981) {
                c23550d.m68191c(i13);
                byte[] bArr2 = new byte[i14];
                c23550d.f93394x.f93317j = bArr2;
                interfaceC33646o.readFully(bArr2, 0, i14);
                return;
            }
            if (i13 == 18402) {
                byte[] bArr3 = new byte[i14];
                interfaceC33646o.readFully(bArr3, 0, i14);
                c23550d.m68191c(i13);
                c23550d.f93394x.f93318k = new C33637j0(1, 0, 0, bArr3);
                return;
            }
            if (i13 == 21419) {
                Arrays.fill(c38059n.f163017a, (byte) 0);
                interfaceC33646o.readFully(c38059n.f163017a, 4 - i14, i14);
                c38059n.m121846F(0);
                c23550d.f93396z = (int) c38059n.m121869v();
                return;
            }
            if (i13 == 25506) {
                c23550d.m68191c(i13);
                byte[] bArr4 = new byte[i14];
                c23550d.f93394x.f93319l = bArr4;
                interfaceC33646o.readFully(bArr4, 0, i14);
                return;
            }
            if (i13 != 30322) {
                throw ParserException.m5049a(null, "Unexpected id: " + i13);
            }
            c23550d.m68191c(i13);
            byte[] bArr5 = new byte[i14];
            c23550d.f93394x.f93331x = bArr5;
            interfaceC33646o.readFully(bArr5, 0, i14);
            return;
        }
        if (c23550d.f93349J == 0) {
            c23550d.f93355P = (int) c23551e.m68199b(interfaceC33646o, false, true, 8);
            c23550d.f93356Q = c23551e.f93400c;
            c23550d.f93351L = -9223372036854775807L;
            c23550d.f93349J = 1;
            c38059n2.m121843C(0);
        }
        C23549c c23549c3 = (C23549c) sparseArray.get(c23550d.f93355P);
        if (c23549c3 == null) {
            interfaceC33646o.mo3100n(i14 - c23550d.f93356Q);
            c23550d.f93349J = 0;
            return;
        }
        c23549c3.f93306Z.getClass();
        if (c23550d.f93349J == 1) {
            c23550d.m68193f(interfaceC33646o, 3);
            int i35 = (c38059n2.f163017a[2] & 6) >> 1;
            int i36 = 255;
            if (i35 == 0) {
                c23550d.f93353N = 1;
                int[] iArr = c23550d.f93354O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                c23550d.f93354O = iArr;
                iArr[0] = (i14 - c23550d.f93356Q) - 3;
            } else {
                c23550d.m68193f(interfaceC33646o, 4);
                int i37 = (c38059n2.f163017a[3] & 255) + 1;
                c23550d.f93353N = i37;
                int[] iArr2 = c23550d.f93354O;
                if (iArr2 == null) {
                    iArr2 = new int[i37];
                } else if (iArr2.length < i37) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i37)];
                }
                c23550d.f93354O = iArr2;
                if (i35 == 2) {
                    int i38 = (i14 - c23550d.f93356Q) - 4;
                    int i39 = c23550d.f93353N;
                    Arrays.fill(iArr2, 0, i39, i38 / i39);
                } else {
                    if (i35 == 1) {
                        int i44 = 0;
                        int i45 = 0;
                        int i46 = 4;
                        while (true) {
                            i19 = c23550d.f93353N - 1;
                            if (i44 >= i19) {
                                break;
                            }
                            c23550d.f93354O[i44] = 0;
                            while (true) {
                                i24 = i46 + 1;
                                c23550d.m68193f(interfaceC33646o, i24);
                                int i47 = c38059n2.f163017a[i46] & 255;
                                int[] iArr3 = c23550d.f93354O;
                                i25 = iArr3[i44] + i47;
                                iArr3[i44] = i25;
                                if (i47 != 255) {
                                    break;
                                } else {
                                    i46 = i24;
                                }
                            }
                            i45 += i25;
                            i44++;
                            i46 = i24;
                        }
                        c23550d.f93354O[i19] = ((i14 - c23550d.f93356Q) - i46) - i45;
                    } else {
                        if (i35 != 3) {
                            throw ParserException.m5049a(null, "Unexpected lacing value: " + i35);
                        }
                        int i48 = 0;
                        int i49 = 0;
                        int i54 = 4;
                        while (true) {
                            int i55 = c23550d.f93353N - i27;
                            if (i48 >= i55) {
                                i15 = i27;
                                i16 = i28;
                                c23550d.f93354O[i55] = ((i14 - c23550d.f93356Q) - i54) - i49;
                                break;
                            }
                            c23550d.f93354O[i48] = i28;
                            int i56 = i54 + 1;
                            c23550d.m68193f(interfaceC33646o, i56);
                            if (c38059n2.f163017a[i54] == 0) {
                                throw ParserException.m5049a(null, "No valid varint length mask found");
                            }
                            int i57 = i27;
                            int i58 = i28;
                            while (true) {
                                if (i58 >= 8) {
                                    i17 = i28;
                                    j7 = 0;
                                    i18 = i56;
                                    break;
                                }
                                int i59 = i57 << (7 - i58);
                                i17 = i28;
                                if ((c38059n2.f163017a[i54] & i59) != 0) {
                                    i18 = i56 + i58;
                                    c23550d.m68193f(interfaceC33646o, i18);
                                    j7 = c38059n2.f163017a[i54] & i36 & (~i59);
                                    while (i56 < i18) {
                                        j7 = (j7 << 8) | ((long) (c38059n2.f163017a[i56] & i36));
                                        i56++;
                                        i36 = 255;
                                    }
                                    if (i48 <= 0) {
                                        break;
                                    }
                                    j7 -= (1 << ((i58 * 7) + 6)) - 1;
                                    break;
                                }
                                i58++;
                                i28 = i17;
                                i36 = 255;
                            }
                            if (j7 < -2147483648L || j7 > 2147483647L) {
                                throw ParserException.m5049a(null, "EBML lacing sample size out of range.");
                            }
                            int i64 = (int) j7;
                            int[] iArr4 = c23550d.f93354O;
                            if (i48 != 0) {
                                i64 += iArr4[i48 - 1];
                            }
                            iArr4[i48] = i64;
                            i49 += i64;
                            i48++;
                            i54 = i18;
                            i27 = i57;
                            i28 = i17;
                            i36 = 255;
                        }
                    }
                    byte[] bArr6 = c38059n2.f163017a;
                    c23550d.f93350K = c23550d.m68195l((bArr6[i15] & 255) | (bArr6[i16] << 8)) + c23550d.f93344E;
                    if (c23549c3.f93312e != 2 || (i13 == 163 && (c38059n2.f163017a[2] & 128) == 128)) {
                        i26 = i15;
                    } else {
                        i26 = i16;
                    }
                    c23550d.f93357R = i26;
                    c23550d.f93349J = 2;
                    c23550d.f93352M = i16;
                }
            }
            i15 = 1;
            i16 = 0;
            byte[] bArr7 = c38059n2.f163017a;
            c23550d.f93350K = c23550d.m68195l((bArr7[i15] & 255) | (bArr7[i16] << 8)) + c23550d.f93344E;
            if (c23549c3.f93312e != 2) {
                i26 = i15;
            } else {
                i26 = i15;
            }
            c23550d.f93357R = i26;
            c23550d.f93349J = 2;
            c23550d.f93352M = i16;
        } else {
            i15 = 1;
        }
        if (i13 == 163) {
            while (true) {
                int i65 = c23550d.f93352M;
                if (i65 >= c23550d.f93353N) {
                    c23550d.f93349J = 0;
                    return;
                }
                c23550d.m68192d(c23549c3, ((long) ((c23550d.f93352M * c23549c3.f93313f) / 1000)) + c23550d.f93350K, c23550d.f93357R, c23550d.m68196m(interfaceC33646o, c23549c3, c23550d.f93354O[i65], false), 0);
                c23550d.f93352M++;
            }
        } else {
            while (true) {
                int i66 = c23550d.f93352M;
                if (i66 >= c23550d.f93353N) {
                    return;
                }
                int[] iArr5 = c23550d.f93354O;
                boolean z4 = i15;
                iArr5[i66] = c23550d.m68196m(interfaceC33646o, c23549c3, iArr5[i66], z4);
                c23550d.f93352M += z4 ? 1 : 0;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m68161B(int i13, long j7) throws ParserException {
        C23550d c23550d = (C23550d) this.f93280x;
        if (i13 == 20529) {
            if (j7 == 0) {
                return;
            }
            throw ParserException.m5049a(null, "ContentEncodingOrder " + j7 + " not supported");
        }
        if (i13 == 20530) {
            if (j7 == 1) {
                return;
            }
            throw ParserException.m5049a(null, "ContentEncodingScope " + j7 + " not supported");
        }
        switch (i13) {
            case 131:
                c23550d.m68191c(i13);
                c23550d.f93394x.f93312e = (int) j7;
                return;
            case 136:
                c23550d.m68191c(i13);
                c23550d.f93394x.f93304X = j7 == 1;
                return;
            case 155:
                c23550d.f93351L = c23550d.m68195l(j7);
                return;
            case 159:
                c23550d.m68191c(i13);
                c23550d.f93394x.f93297Q = (int) j7;
                return;
            case 176:
                c23550d.m68191c(i13);
                c23550d.f93394x.f93321n = (int) j7;
                return;
            case 179:
                c23550d.m68190a(i13);
                c23550d.f93345F.m71597a(c23550d.m68195l(j7));
                return;
            case 186:
                c23550d.m68191c(i13);
                c23550d.f93394x.f93322o = (int) j7;
                return;
            case 215:
                c23550d.m68191c(i13);
                c23550d.f93394x.f93311d = (int) j7;
                return;
            case 231:
                c23550d.f93344E = c23550d.m68195l(j7);
                return;
            case 238:
                c23550d.f93358S = (int) j7;
                return;
            case 241:
                if (c23550d.f93347H) {
                    return;
                }
                c23550d.m68190a(i13);
                c23550d.f93346G.m71597a(j7);
                c23550d.f93347H = true;
                return;
            case 251:
                c23550d.f93359T = true;
                return;
            case 16871:
                c23550d.m68191c(i13);
                c23550d.f93394x.f93315h = (int) j7;
                return;
            case 16980:
                if (j7 == 3) {
                    return;
                }
                throw ParserException.m5049a(null, "ContentCompAlgo " + j7 + " not supported");
            case 17029:
                if (j7 < 1 || j7 > 2) {
                    throw ParserException.m5049a(null, "DocTypeReadVersion " + j7 + " not supported");
                }
                return;
            case 17143:
                if (j7 == 1) {
                    return;
                }
                throw ParserException.m5049a(null, "EBMLReadVersion " + j7 + " not supported");
            case 18401:
                if (j7 == 5) {
                    return;
                }
                throw ParserException.m5049a(null, "ContentEncAlgo " + j7 + " not supported");
            case 18408:
                if (j7 == 1) {
                    return;
                }
                throw ParserException.m5049a(null, "AESSettingsCipherMode " + j7 + " not supported");
            case 21420:
                c23550d.f93340A = j7 + c23550d.f93389s;
                return;
            case 21432:
                int i14 = (int) j7;
                c23550d.m68191c(i13);
                if (i14 == 0) {
                    c23550d.f93394x.f93332y = 0;
                    return;
                }
                if (i14 == 1) {
                    c23550d.f93394x.f93332y = 2;
                    return;
                } else if (i14 == 3) {
                    c23550d.f93394x.f93332y = 1;
                    return;
                } else {
                    if (i14 != 15) {
                        return;
                    }
                    c23550d.f93394x.f93332y = 3;
                    return;
                }
            case 21680:
                c23550d.m68191c(i13);
                c23550d.f93394x.f93324q = (int) j7;
                return;
            case 21682:
                c23550d.m68191c(i13);
                c23550d.f93394x.f93326s = (int) j7;
                return;
            case 21690:
                c23550d.m68191c(i13);
                c23550d.f93394x.f93325r = (int) j7;
                return;
            case 21930:
                c23550d.m68191c(i13);
                c23550d.f93394x.f93303W = j7 == 1;
                return;
            case 21938:
                c23550d.m68191c(i13);
                C23549c c23549c = c23550d.f93394x;
                c23549c.f93333z = true;
                c23549c.f93323p = (int) j7;
                return;
            case 21998:
                c23550d.m68191c(i13);
                c23550d.f93394x.f93314g = (int) j7;
                return;
            case 22186:
                c23550d.m68191c(i13);
                c23550d.f93394x.f93300T = j7;
                return;
            case 22203:
                c23550d.m68191c(i13);
                c23550d.f93394x.f93301U = j7;
                return;
            case 25188:
                c23550d.m68191c(i13);
                c23550d.f93394x.f93298R = (int) j7;
                return;
            case 30114:
                c23550d.f93360U = j7;
                return;
            case 30321:
                c23550d.m68191c(i13);
                int i15 = (int) j7;
                if (i15 == 0) {
                    c23550d.f93394x.f93327t = 0;
                    return;
                }
                if (i15 == 1) {
                    c23550d.f93394x.f93327t = 1;
                    return;
                } else if (i15 == 2) {
                    c23550d.f93394x.f93327t = 2;
                    return;
                } else {
                    if (i15 != 3) {
                        return;
                    }
                    c23550d.f93394x.f93327t = 3;
                    return;
                }
            case 2352003:
                c23550d.m68191c(i13);
                c23550d.f93394x.f93313f = (int) j7;
                return;
            case 2807729:
                c23550d.f93390t = j7;
                return;
            default:
                switch (i13) {
                    case 21945:
                        c23550d.m68191c(i13);
                        int i16 = (int) j7;
                        if (i16 == 1) {
                            c23550d.f93394x.f93283C = 2;
                            return;
                        } else {
                            if (i16 != 2) {
                                return;
                            }
                            c23550d.f93394x.f93283C = 1;
                            return;
                        }
                    case 21946:
                        c23550d.m68191c(i13);
                        int iM109388g = C34592g.m109388g((int) j7);
                        if (iM109388g != -1) {
                            c23550d.f93394x.f93282B = iM109388g;
                            return;
                        }
                        return;
                    case 21947:
                        c23550d.m68191c(i13);
                        c23550d.f93394x.f93333z = true;
                        int iM109387f = C34592g.m109387f((int) j7);
                        if (iM109387f != -1) {
                            c23550d.f93394x.f93281A = iM109387f;
                            return;
                        }
                        return;
                    case 21948:
                        c23550d.m68191c(i13);
                        c23550d.f93394x.f93284D = (int) j7;
                        return;
                    case 21949:
                        c23550d.m68191c(i13);
                        c23550d.f93394x.f93285E = (int) j7;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX INFO: renamed from: C */
    public C29893a m68162C(JSONObject jSONObject) {
        Object objM107888l;
        try {
            Map mapM124059i = AbstractC38674d.m124059i(-1, jSONObject.toString());
            AbstractC22676k.m65749i(mapM124059i, "parse(...)");
            Map mapM74001j0 = AbstractC25247g0.m74001j0(mapM124059i);
            objM107888l = new C29893a(String.valueOf(mapM74001j0.get("acsURL")), m68159D(mapM74001j0.get("acsEphemPubKey")), m68159D(mapM74001j0.get("sdkEphemPubKey")));
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            ((C26212c) this.f93280x).m77828c(new IllegalArgumentException("Failed to parse ACS data: " + jSONObject, thM68037a));
        }
        AbstractC34132o.m107864I(objM107888l);
        return (C29893a) objM107888l;
    }

    /* JADX INFO: renamed from: E */
    public void m68163E(String key, C25032i c25032i) {
        AbstractC22676k.m65750j(key, "key");
        synchronized (this) {
            if (((C25027d) this.f93280x).get(String.valueOf(key.hashCode())) == null) {
                ((C25027d) this.f93280x).put(String.valueOf(key.hashCode()), c25032i);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public ArrayList m68164F(int i13) {
        ArrayList arrayList = new ArrayList();
        C27341y c27341y = (C27341y) this.f93280x;
        AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
        Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
        AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
        try {
            C27331o c27331o = c27341y.f109498b ? c27341y.f109499c : (C27331o) c27341y.f109501e.getValue();
            if (c27331o != null) {
                C22665e0 c22665e0 = new C22665e0();
                c22665e0.f89334w = 1;
                List list = (List) c27331o.f109437k.invoke(Integer.valueOf(i13));
                int size = list.size();
                for (int i14 = 0; i14 < size; i14++) {
                    C23465k c23465k = (C23465k) list.get(i14);
                    C28535l0 c28535l0 = c27341y.f109511o;
                    int iIntValue = ((Number) c23465k.f92937w).intValue();
                    long j7 = ((C39169a) c23465k.f92938x).f168407a;
                    C28539n0 c28539n0 = C27341y.f109496w;
                    c22665e0 = c22665e0;
                    C21881l c21881l = new C21881l((ArrayList) null, c22665e0, list, i13, c27331o);
                    C2817b c2817b = c28535l0.f115449c;
                    arrayList.add(c2817b != null ? c2817b.m8021y(iIntValue, j7, c28535l0.f115448b, false, c21881l) : C28523g.f115424a);
                }
            }
            return arrayList;
        } finally {
            C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: G */
    public Object m68165G(C25126d c25126d, AbstractC32269c abstractC32269c) {
        C25123a c25123a;
        C23548b c23548b;
        AbstractC21385b abstractC21385bM68166H;
        if (abstractC32269c instanceof C25123a) {
            c25123a = (C25123a) abstractC32269c;
            int i13 = c25123a.f98466E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c25123a.f98466E = i13 - Integer.MIN_VALUE;
            } else {
                c25123a = new C25123a(this, abstractC32269c);
            }
        } else {
            c25123a = new C25123a(this, abstractC32269c);
        }
        Object objM68166H = c25123a.f98469y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c25123a.f98466E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM68166H);
            try {
                c25126d.f98486z = AbstractC20301a.m56326Y((C32236a) c25126d.f98480F, ((AbstractC0757c) this.f93280x).f2764b);
                c25123a.f98467w = this;
                c25123a.f98468x = c25126d;
                c25123a.f98466E = 1;
                objM68166H = m68166H(c25126d);
                if (objM68166H != enumC31071a) {
                    c23548b = this;
                    if (objM68166H != null) {
                        return objM68166H;
                    }
                    c25126d.f98486z = AbstractC20301a.m56308G(c25126d.f98485y, ((AbstractC0757c) c23548b.f93280x).f2764b);
                    c25123a.f98467w = null;
                    c25123a.f98468x = null;
                    c25123a.f98466E = 2;
                    abstractC21385bM68166H = c23548b.m68166H(c25126d);
                    if (abstractC21385bM68166H == enumC31071a) {
                        return abstractC21385bM68166H;
                    }
                }
            } catch (SerializationException unused) {
                c23548b = this;
                objM68166H = null;
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM68166H);
                return objM68166H;
            }
            c25126d = c25123a.f98468x;
            c23548b = c25123a.f98467w;
            try {
                AbstractC34132o.m107864I(objM68166H);
            } catch (SerializationException unused2) {
                objM68166H = null;
            }
            if (objM68166H != null) {
                return objM68166H;
            }
            c25126d.f98486z = AbstractC20301a.m56308G(c25126d.f98485y, ((AbstractC0757c) c23548b.f93280x).f2764b);
            c25123a.f98467w = null;
            c25123a.f98468x = null;
            c25123a.f98466E = 2;
            abstractC21385bM68166H = c23548b.m68166H(c25126d);
            if (abstractC21385bM68166H == enumC31071a) {
                return abstractC21385bM68166H;
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: H */
    public AbstractC21385b m68166H(C25126d c25126d) {
        if (c25126d == null) {
            StringBuilder sb4 = new StringBuilder("parameters type is ");
            Class<?> cls = c25126d.getClass();
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            sb4.append(c22673i0.getOrCreateKotlinClass(cls).getSimpleName());
            sb4.append(", but expected ");
            sb4.append(c22673i0.getOrCreateKotlinClass(C25126d.class).getSimpleName());
            throw new IllegalStateException(sb4.toString().toString());
        }
        InterfaceC37138c interfaceC37138c = (InterfaceC37138c) c25126d.f98486z;
        if (interfaceC37138c == null) {
            AbstractC22676k.m65757q("serializer");
            throw null;
        }
        return new C21388e(((AbstractC0757c) c25126d.f98479E).m1833d(interfaceC37138c, c25126d.f98485y), AbstractC29125c.m88527e0((C18163d) c25126d.f98482H, (Charset) c25126d.f98481G));
    }

    /* JADX INFO: renamed from: I */
    public void m68167I() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f93280x;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + m68169K());
    }

    /* JADX INFO: renamed from: J */
    public void m68168J(long j7) throws IOException {
        long jM68169K = m68169K();
        if (jM68169K != j7) {
            if (jM68169K != -1) {
                if (jM68169K != -2) {
                    return;
                } else {
                    jM68169K = -2;
                }
            }
            StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "expected non-string scope or scope ", " but found ");
            sbM125596b.append(jM68169K);
            throw new IOException(sbM125596b.toString());
        }
    }

    /* JADX INFO: renamed from: K */
    public long m68169K() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f93280x;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // p368og.InterfaceC27908e
    /* JADX INFO: renamed from: a */
    public void mo7486a(Throwable ex3) {
        AbstractC22676k.m65750j(ex3, "ex");
        ((InterfaceC18475a) this.f93280x).mo53317a(ex3);
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: b */
    public InterfaceC31160v mo68170b(List list) {
        return this;
    }

    @Override // r93.InterfaceC31160v
    public InterfaceC31162w build() {
        return (C26546c) this.f93280x;
    }

    @Override // p368og.InterfaceC27908e
    /* JADX INFO: renamed from: c */
    public void mo7487c(String key, Object value) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        ((InterfaceC18475a) this.f93280x).mo53319f(value, key);
    }

    @Override // pg3.InterfaceC29201n
    public Object convert(Object obj) {
        return Optional.ofNullable(((InterfaceC29201n) this.f93280x).convert((AbstractC34799a1) obj));
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: d */
    public InterfaceC31160v mo68171d(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        return this;
    }

    @Override // p368og.InterfaceC27908e
    /* JADX INFO: renamed from: e */
    public void mo7488e() {
        ((InterfaceC18475a) this.f93280x).mo53318b();
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: f */
    public InterfaceC31160v mo68172f(int i13) {
        AbstractC18489d0.m53382w(i13, "kind");
        return this;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: g */
    public InterfaceC31160v mo68173g() {
        return this;
    }

    @Override // pe3.InterfaceC29121c
    public FileChannel getChannel() {
        return new FileInputStream((File) this.f93280x).getChannel();
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: h */
    public InterfaceC31160v mo68174h() {
        return this;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: i */
    public InterfaceC31160v mo68175i() {
        return this;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: k */
    public InterfaceC31160v mo68176k() {
        return this;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: l */
    public InterfaceC31160v mo68177l(InterfaceC31135k owner) {
        AbstractC22676k.m65750j(owner, "owner");
        return this;
    }

    @Override // p211i5.InterfaceC18102o
    /* JADX INFO: renamed from: m */
    public boolean mo2226m(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f93280x;
        if (!swipeDismissBehavior.mo15685I(view)) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        boolean z4 = view.getLayoutDirection() == 1;
        int i13 = swipeDismissBehavior.f20769e;
        view.offsetLeftAndRight((!(i13 == 0 && z4) && (i13 != 1 || z4)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        C25900f c25900f = swipeDismissBehavior.f20766b;
        if (c25900f != null) {
            c25900f.m76607a(view);
        }
        return true;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: n */
    public InterfaceC31160v mo68178n(AbstractC23811y type) {
        AbstractC22676k.m65750j(type, "type");
        return this;
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        C16905q1 c16905q2;
        switch (this.f93279w) {
            case 1:
                AppBarLayout appBarLayout = (AppBarLayout) this.f93280x;
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                c16905q2 = appBarLayout.getFitsSystemWindows() ? c16905q1 : null;
                if (!Objects.equals(appBarLayout.f20681G, c16905q2)) {
                    appBarLayout.f20681G = c16905q2;
                    appBarLayout.setWillNotDraw(!(appBarLayout.f20696V != null && appBarLayout.getTopInset() > 0));
                    appBarLayout.requestLayout();
                }
                return c16905q1;
            default:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.f93280x;
                WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                c16905q2 = collapsingToolbarLayout.getFitsSystemWindows() ? c16905q1 : null;
                if (!Objects.equals(collapsingToolbarLayout.f20731d0, c16905q2)) {
                    collapsingToolbarLayout.f20731d0 = c16905q2;
                    collapsingToolbarLayout.requestLayout();
                }
                return c16905q1.f64864a.mo47543c();
        }
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: p */
    public InterfaceC31160v mo68179p(EnumC31106a0 enumC31106a0) {
        return this;
    }

    @Override // p073cq.InterfaceC11035d
    /* JADX INFO: renamed from: q */
    public void mo944q(Task task) {
        C29406b c29406b = (C29406b) this.f93280x;
        if (task.isCanceled()) {
            c29406b.cancel(false);
            return;
        }
        if (task.isSuccessful()) {
            Object result = task.getResult();
            if (result == null) {
                result = AbstractFutureC29420p.f119453I;
            }
            if (AbstractFutureC29420p.f119456L.mo9532i0(c29406b, null, result)) {
                C29406b.m89687P(c29406b);
                return;
            }
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            throw new IllegalStateException();
        }
        if (AbstractFutureC29420p.f119456L.mo9532i0(c29406b, null, new C29411g(exception))) {
            C29406b.m89687P(c29406b);
        }
    }

    @Override // p368og.InterfaceC27908e
    /* JADX INFO: renamed from: r */
    public void mo7492r(InterfaceC4339a interfaceC4339a) {
        ((InterfaceC18475a) this.f93280x).mo53320g(new C29158c(interfaceC4339a));
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: s */
    public InterfaceC31160v mo68180s() {
        return this;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: t */
    public InterfaceC31160v mo68181t(InterfaceC31151q0 interfaceC31151q0) {
        return this;
    }

    public String toString() {
        switch (this.f93279w) {
            case 6:
                return super.toString() + "{fragment=" + ((FragmentC25664f) this.f93280x) + "}";
            case 7:
                return super.toString() + "{fragment=" + ((C25667i) this.f93280x) + "}";
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                StringBuilder sb4 = new StringBuilder();
                C21521q c21521q = (C21521q) this.f93280x;
                sb4.append(c21521q);
                sb4.append(": ");
                sb4.append(((Map) AbstractC29125c.m88494C(c21521q.f82552J, C21521q.f82549N[0])).keySet());
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: u */
    public InterfaceC31160v mo68182u() {
        return this;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: v */
    public InterfaceC31160v mo68183v(InterfaceC32307i additionalAnnotations) {
        AbstractC22676k.m65750j(additionalAnnotations, "additionalAnnotations");
        return this;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: w */
    public InterfaceC31160v mo68184w(AbstractC31152r visibility) {
        AbstractC22676k.m65750j(visibility, "visibility");
        return this;
    }

    @Override // mo.InterfaceC25732m
    /* JADX INFO: renamed from: x */
    public void mo68185x() {
    }

    @Override // mo.InterfaceC25732m
    /* JADX INFO: renamed from: y */
    public void mo68186y(C25680d c25680d) {
        c25680d.m75617a(((WindowManager) this.f93280x).getDefaultDisplay());
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: z */
    public InterfaceC31160v mo68187z() {
        return this;
    }

    public C23548b(C25125c c25125c, AbstractC0757c abstractC0757c) {
        this.f93279w = 5;
        this.f93280x = abstractC0757c;
    }

    public C23548b(C11433l c11433l, C37718g0 configuration, InterfaceC37739n0 linkLaunchMode) {
        this.f93279w = 27;
        AbstractC22676k.m65750j(configuration, "configuration");
        EnumC14023b enumC14023b = configuration.f161613M;
        AbstractC22676k.m65750j(linkLaunchMode, "linkLaunchMode");
        Set setM30678a = AbstractC11435n.m30678a(configuration.f161636w, c11433l);
        C37736m0 c37736m0 = linkLaunchMode instanceof C37736m0 ? (C37736m0) linkLaunchMode : null;
        EnumC37763v0 enumC37763v0 = c37736m0 != null ? c37736m0.f161691x : null;
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        if (c11433l.f36660x != null && enumC14023b != null && setM30678a.contains("bank_account") && (enumC37763v0 == null || enumC37763v0 == EnumC37763v0.f161744x)) {
            c26460cM119000x.add(new C29709d(enumC14023b));
        }
        if (setM30678a.contains("card") && (enumC37763v0 == null || enumC37763v0 == EnumC37763v0.f161743w)) {
            c26460cM119000x.add(C29711e.f121490c);
        }
        this.f93280x = AbstractC37056f.m118988k(c26460cM119000x);
    }

    public C23548b(int i13, byte b) {
        this.f93279w = i13;
        switch (i13) {
            case 9:
                this.f93280x = new ArrayDeque(16);
                break;
            case 10:
                break;
            case 11:
            case 12:
            default:
                this.f93280x = new C25027d(((int) (Runtime.getRuntime().maxMemory() / ((long) DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED))) / 8, 0);
                break;
            case 13:
                this.f93280x = new C21567b(19);
                break;
        }
    }

    public C23548b(C30765d logger) {
        this.f93279w = 12;
        AbstractC22676k.m65750j(logger, "logger");
        this.f93280x = logger;
    }

    public C23548b(int i13) {
        this.f93279w = 11;
        this.f93280x = null;
    }
}
