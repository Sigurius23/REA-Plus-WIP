package la;

import ai.C0904j;
import android.util.Pair;
import android.util.SparseArray;
import androidx.health.platform.client.proto.C1533u;
import androidx.media3.common.ParserException;
import bn.C3489b;
import com.iterable.iterableapi.C5363q;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.ChatClient;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import p031b9.C2817b;
import p087db.C11856j0;
import p309lo.C24553k;
import p309lo.C24561s;
import p499t9.AbstractC33618a;
import p499t9.C33620b;
import p499t9.C33634i;
import p499t9.C33637j0;
import p499t9.C33638k;
import p499t9.C33641l0;
import p499t9.C33650s;
import p499t9.C33651t;
import p499t9.C33656y;
import p499t9.InterfaceC33627e0;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.AbstractC34590f;
import p516u8.C34592g;
import p516u8.C34600k;
import p516u8.C34602l;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p641y8.AbstractC39319n;
import p690zr.AbstractC41023g0;
import qa.InterfaceC30105j;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: la.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C23550d implements InterfaceC33644n {

    /* JADX INFO: renamed from: f0 */
    public static final byte[] f93334f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: g0 */
    public static final byte[] f93335g0;

    /* JADX INFO: renamed from: h0 */
    public static final byte[] f93336h0;

    /* JADX INFO: renamed from: i0 */
    public static final byte[] f93337i0;

    /* JADX INFO: renamed from: j0 */
    public static final UUID f93338j0;

    /* JADX INFO: renamed from: k0 */
    public static final Map f93339k0;

    /* JADX INFO: renamed from: A */
    public long f93340A;

    /* JADX INFO: renamed from: B */
    public boolean f93341B;

    /* JADX INFO: renamed from: C */
    public long f93342C;

    /* JADX INFO: renamed from: D */
    public long f93343D;

    /* JADX INFO: renamed from: E */
    public long f93344E;

    /* JADX INFO: renamed from: F */
    public C24553k f93345F;

    /* JADX INFO: renamed from: G */
    public C24553k f93346G;

    /* JADX INFO: renamed from: H */
    public boolean f93347H;

    /* JADX INFO: renamed from: I */
    public boolean f93348I;

    /* JADX INFO: renamed from: J */
    public int f93349J;

    /* JADX INFO: renamed from: K */
    public long f93350K;

    /* JADX INFO: renamed from: L */
    public long f93351L;

    /* JADX INFO: renamed from: M */
    public int f93352M;

    /* JADX INFO: renamed from: N */
    public int f93353N;

    /* JADX INFO: renamed from: O */
    public int[] f93354O;

    /* JADX INFO: renamed from: P */
    public int f93355P;

    /* JADX INFO: renamed from: Q */
    public int f93356Q;

    /* JADX INFO: renamed from: R */
    public int f93357R;

    /* JADX INFO: renamed from: S */
    public int f93358S;

    /* JADX INFO: renamed from: T */
    public boolean f93359T;

    /* JADX INFO: renamed from: U */
    public long f93360U;

    /* JADX INFO: renamed from: V */
    public int f93361V;

    /* JADX INFO: renamed from: W */
    public int f93362W;

    /* JADX INFO: renamed from: X */
    public int f93363X;

    /* JADX INFO: renamed from: Y */
    public boolean f93364Y;

    /* JADX INFO: renamed from: Z */
    public boolean f93365Z;

    /* JADX INFO: renamed from: a */
    public final C3489b f93366a;

    /* JADX INFO: renamed from: a0 */
    public boolean f93367a0;

    /* JADX INFO: renamed from: b */
    public final C23551e f93368b;

    /* JADX INFO: renamed from: b0 */
    public int f93369b0;

    /* JADX INFO: renamed from: c */
    public final SparseArray f93370c;

    /* JADX INFO: renamed from: c0 */
    public byte f93371c0;

    /* JADX INFO: renamed from: d */
    public final boolean f93372d;

    /* JADX INFO: renamed from: d0 */
    public boolean f93373d0;

    /* JADX INFO: renamed from: e */
    public final boolean f93374e;

    /* JADX INFO: renamed from: e0 */
    public InterfaceC33648q f93375e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC30105j f93376f;

    /* JADX INFO: renamed from: g */
    public final C38059n f93377g;

    /* JADX INFO: renamed from: h */
    public final C38059n f93378h;

    /* JADX INFO: renamed from: i */
    public final C38059n f93379i;

    /* JADX INFO: renamed from: j */
    public final C38059n f93380j;

    /* JADX INFO: renamed from: k */
    public final C38059n f93381k;

    /* JADX INFO: renamed from: l */
    public final C38059n f93382l;

    /* JADX INFO: renamed from: m */
    public final C38059n f93383m;

    /* JADX INFO: renamed from: n */
    public final C38059n f93384n;

    /* JADX INFO: renamed from: o */
    public final C38059n f93385o;

    /* JADX INFO: renamed from: p */
    public final C38059n f93386p;

    /* JADX INFO: renamed from: q */
    public ByteBuffer f93387q;

    /* JADX INFO: renamed from: r */
    public long f93388r;

    /* JADX INFO: renamed from: s */
    public long f93389s;

    /* JADX INFO: renamed from: t */
    public long f93390t;

    /* JADX INFO: renamed from: u */
    public long f93391u;

    /* JADX INFO: renamed from: v */
    public long f93392v;

    /* JADX INFO: renamed from: w */
    public boolean f93393w;

    /* JADX INFO: renamed from: x */
    public C23549c f93394x;

    /* JADX INFO: renamed from: y */
    public boolean f93395y;

    /* JADX INFO: renamed from: z */
    public int f93396z;

    static {
        int i13 = AbstractC38065t.f163031a;
        f93335g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f93336h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f93337i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f93338j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        AbstractC18489d0.m53383x(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC18489d0.m53383x(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f93339k0 = Collections.unmodifiableMap(map);
    }

    public C23550d(InterfaceC30105j interfaceC30105j, int i13) {
        C3489b c3489b = new C3489b(1);
        this.f93389s = -1L;
        this.f93390t = -9223372036854775807L;
        this.f93391u = -9223372036854775807L;
        this.f93392v = -9223372036854775807L;
        this.f93342C = -1L;
        this.f93343D = -1L;
        this.f93344E = -9223372036854775807L;
        this.f93366a = c3489b;
        c3489b.f13734g = new C23548b(this, 0);
        this.f93376f = interfaceC30105j;
        this.f93372d = (i13 & 1) == 0;
        this.f93374e = (i13 & 2) == 0;
        this.f93368b = new C23551e();
        this.f93370c = new SparseArray();
        this.f93379i = new C38059n(4);
        this.f93380j = new C38059n(ByteBuffer.allocate(4).putInt(-1).array());
        this.f93381k = new C38059n(4);
        this.f93377g = new C38059n(AbstractC39319n.f169167a);
        this.f93378h = new C38059n(4);
        this.f93382l = new C38059n();
        this.f93383m = new C38059n();
        this.f93384n = new C38059n(8);
        this.f93385o = new C38059n();
        this.f93386p = new C38059n();
        this.f93354O = new int[1];
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m68189e(long j7, long j13, String str) {
        AbstractC35849g.m113802d(j7 != -9223372036854775807L);
        int i13 = (int) (j7 / 3600000000L);
        long j14 = j7 - (((long) i13) * 3600000000L);
        int i14 = (int) (j14 / 60000000);
        long j15 = j14 - (((long) i14) * 60000000);
        int i15 = (int) (j15 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf((int) ((j15 - (((long) i15) * 1000000)) / j13)));
        int i16 = AbstractC38065t.f163031a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: a */
    public final void m68190a(int i13) {
        if (this.f93345F == null || this.f93346G == null) {
            throw ParserException.m5049a(null, "Element " + i13 + " must be in a Cues");
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        this.f93344E = -9223372036854775807L;
        this.f93349J = 0;
        C3489b c3489b = this.f93366a;
        c3489b.f13730c = 0;
        c3489b.f13729b.clear();
        C23551e c23551e = (C23551e) c3489b.f13733f;
        c23551e.f93399b = 0;
        c23551e.f93400c = 0;
        C23551e c23551e2 = this.f93368b;
        c23551e2.f93399b = 0;
        c23551e2.f93400c = 0;
        m68194k();
        int i13 = 0;
        while (true) {
            SparseArray sparseArray = this.f93370c;
            if (i13 >= sparseArray.size()) {
                return;
            }
            C33641l0 c33641l0 = ((C23549c) sparseArray.valueAt(i13)).f93302V;
            if (c33641l0 != null) {
                c33641l0.f140418b = false;
                c33641l0.f140419c = 0;
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m68191c(int i13) {
        if (this.f93394x != null) {
            return;
        }
        throw ParserException.m5049a(null, "Element " + i13 + " must be in a TrackEntry");
    }

    /* JADX INFO: renamed from: d */
    public final void m68192d(C23549c c23549c, long j7, int i13, int i14, int i15) {
        byte[] bArrM68189e;
        int i16;
        int i17;
        C33641l0 c33641l0 = c23549c.f93302V;
        if (c33641l0 != null) {
            c33641l0.m106261c(c23549c.f93306Z, j7, i13, i14, i15, c23549c.f93318k);
        } else {
            if ("S_TEXT/UTF8".equals(c23549c.f93310c) || "S_TEXT/ASS".equals(c23549c.f93310c) || "S_TEXT/WEBVTT".equals(c23549c.f93310c)) {
                if (this.f93353N > 1) {
                    AbstractC38046a.m121826u("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j13 = this.f93351L;
                    if (j13 == -9223372036854775807L) {
                        AbstractC38046a.m121826u("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = c23549c.f93310c;
                        C38059n c38059n = this.f93383m;
                        byte[] bArr = c38059n.f163017a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                bArrM68189e = m68189e(j13, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, "%01d:%02d:%02d:%02d");
                                i16 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrM68189e = m68189e(j13, 1000L, "%02d:%02d:%02d.%03d");
                                i16 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrM68189e = m68189e(j13, 1000L, "%02d:%02d:%02d,%03d");
                                i16 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrM68189e, 0, bArr, i16, bArrM68189e.length);
                        for (int i18 = c38059n.f163018b; i18 < c38059n.f163019c; i18++) {
                            if (c38059n.f163017a[i18] == 0) {
                                c38059n.m121845E(i18);
                                c23549c.f93306Z.mo36176d(c38059n, c38059n.f163019c, 0);
                                i17 = i14 + c38059n.f163019c;
                            }
                        }
                        c23549c.f93306Z.mo36176d(c38059n, c38059n.f163019c, 0);
                        i17 = i14 + c38059n.f163019c;
                    }
                }
                i17 = i14;
            } else {
                i17 = i14;
            }
            if ((i13 & 268435456) != 0) {
                int i19 = this.f93353N;
                C38059n c38059n2 = this.f93386p;
                if (i19 > 1) {
                    c38059n2.m121843C(0);
                } else {
                    int i24 = c38059n2.f163019c;
                    c23549c.f93306Z.mo36176d(c38059n2, i24, 2);
                    i17 += i24;
                }
            }
            c23549c.f93306Z.mo36174b(j7, i13, i17, i15, c23549c.f93318k);
        }
        this.f93348I = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m68193f(InterfaceC33646o interfaceC33646o, int i13) {
        C38059n c38059n = this.f93379i;
        if (c38059n.f163019c >= i13) {
            return;
        }
        byte[] bArr = c38059n.f163017a;
        if (bArr.length < i13) {
            c38059n.m121849b(Math.max(bArr.length * 2, i13));
        }
        byte[] bArr2 = c38059n.f163017a;
        int i14 = c38059n.f163019c;
        interfaceC33646o.readFully(bArr2, i14, i13 - i14);
        c38059n.m121845E(i13);
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        if (this.f93374e) {
            interfaceC33648q = new C2817b(interfaceC33648q, this.f93376f);
        }
        this.f93375e0 = interfaceC33648q;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) throws EOFException, InterruptedIOException {
        C0904j c0904j = new C0904j(9, false);
        C38059n c38059n = (C38059n) c0904j.f3302x;
        C33638k c33638k = (C33638k) interfaceC33646o;
        long j7 = c33638k.f140407y;
        long j13 = 1024;
        if (j7 != -1 && j7 <= 1024) {
            j13 = j7;
        }
        int i13 = (int) j13;
        c33638k.mo3092c(c38059n.f163017a, 0, 4, false);
        c0904j.f3301w = 4;
        for (long jM121869v = c38059n.m121869v(); jM121869v != 440786851; jM121869v = ((jM121869v << 8) & (-256)) | ((long) (c38059n.f163017a[0] & 255))) {
            int i14 = c0904j.f3301w + 1;
            c0904j.f3301w = i14;
            if (i14 == i13) {
                return false;
            }
            c33638k.mo3092c(c38059n.f163017a, 0, 1, false);
        }
        long jM2225l = c0904j.m2225l(c33638k);
        long j14 = c0904j.f3301w;
        if (jM2225l != Long.MIN_VALUE && (j7 == -1 || j14 + jM2225l < j7)) {
            while (true) {
                long j15 = c0904j.f3301w;
                long j16 = j14 + jM2225l;
                if (j15 < j16) {
                    if (c0904j.m2225l(c33638k) == Long.MIN_VALUE) {
                        break;
                    }
                    long jM2225l2 = c0904j.m2225l(c33638k);
                    if (jM2225l2 < 0 || jM2225l2 > 2147483647L) {
                        break;
                    }
                    if (jM2225l2 != 0) {
                        int i15 = (int) jM2225l2;
                        c33638k.mo3078C(i15, false);
                        c0904j.f3301w += i15;
                    }
                } else if (j15 == j16) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:234:0x039b  */
    /* JADX WARN: Code duplicated, block: B:532:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:537:0x0907  */
    /* JADX WARN: Code duplicated, block: B:538:0x0909  */
    /* JADX WARN: Code duplicated, block: B:541:0x091a  */
    /* JADX WARN: Code duplicated, block: B:542:0x0927  */
    /* JADX WARN: Code duplicated, block: B:544:0x092d  */
    /* JADX WARN: Code duplicated, block: B:546:0x0931  */
    /* JADX WARN: Code duplicated, block: B:548:0x0936  */
    /* JADX WARN: Code duplicated, block: B:551:0x093e  */
    /* JADX WARN: Code duplicated, block: B:553:0x0943  */
    /* JADX WARN: Code duplicated, block: B:556:0x0948  */
    /* JADX WARN: Code duplicated, block: B:559:0x0956  */
    /* JADX WARN: Code duplicated, block: B:562:0x095c  */
    /* JADX WARN: Code duplicated, block: B:564:0x0962  */
    /* JADX WARN: Code duplicated, block: B:584:0x0a18  */
    /* JADX WARN: Code duplicated, block: B:586:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:589:0x0a39  */
    /* JADX WARN: Code duplicated, block: B:592:0x0a4e  */
    /* JADX WARN: Code duplicated, block: B:595:0x0a54  */
    /* JADX WARN: Code duplicated, block: B:614:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:616:0x0abb  */
    /* JADX WARN: Code duplicated, block: B:618:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:634:0x0aed  */
    /* JADX WARN: Code duplicated, block: B:639:0x0b01  */
    /* JADX WARN: Code duplicated, block: B:640:0x0b04  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Object, la.c] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.RuntimeException] */
    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) throws ParserException {
        InterfaceC33646o interfaceC33646o2;
        boolean z4;
        int i13;
        boolean z13;
        String str;
        long j7;
        int i14;
        int iM68198a;
        boolean z14;
        byte b;
        List listSingletonList;
        int i15;
        int i16;
        String str2;
        RuntimeException runtimeException;
        Pair pair;
        String str3;
        String str4;
        List listM133256r;
        int i17;
        C34608o c34608o;
        boolean zM109378k;
        int i18;
        int i19;
        int i24;
        float f13;
        C34592g c34592g;
        String str5;
        int iIntValue;
        int i25;
        byte[] bArr;
        int i26;
        int i27;
        int i28;
        String str6;
        String str7;
        C11856j0 c11856j0M31816l;
        InterfaceC33627e0 c33651t;
        int i29;
        long[] jArrCopyOf;
        C23550d c23550d = this;
        c23550d.f93348I = false;
        boolean z15 = true;
        while (true) {
            int i34 = -1;
            if (z15 && !c23550d.f93348I) {
                C3489b c3489b = c23550d.f93366a;
                C23551e c23551e = (C23551e) c3489b.f13733f;
                ArrayDeque arrayDeque = c3489b.f13729b;
                AbstractC35849g.m113808j((C23548b) c3489b.f13734g);
                while (true) {
                    C23547a c23547a = (C23547a) arrayDeque.peek();
                    if (c23547a == null || interfaceC33646o.getPosition() < c23547a.f93278b) {
                        int i35 = 0;
                        if (c3489b.f13730c == 0) {
                            interfaceC33646o2 = interfaceC33646o;
                            int i36 = 4;
                            long jM68199b = c23551e.m68199b(interfaceC33646o2, true, false, 4);
                            if (jM68199b == -2) {
                                byte[] bArr2 = c3489b.f13728a;
                                interfaceC33646o2.mo3093e();
                                while (true) {
                                    interfaceC33646o2.mo3103p(bArr2, i35, i36);
                                    byte b6 = bArr2[i35];
                                    int i37 = 0;
                                    while (true) {
                                        if (i37 >= 8) {
                                            i14 = -1;
                                        } else if ((C23551e.f93397d[i37] & ((long) b6)) != 0) {
                                            i14 = i37 + 1;
                                        } else {
                                            i37++;
                                        }
                                    }
                                    if (i14 != -1 && i14 <= 4) {
                                        iM68198a = (int) C23551e.m68198a(i14, false, bArr2);
                                        Object obj = ((C23548b) c3489b.f13734g).f93280x;
                                        if (iM68198a == 357149030 || iM68198a == 524531317 || iM68198a == 475249515 || iM68198a == 374648427) {
                                        }
                                    }
                                    interfaceC33646o2.mo3100n(1);
                                    i35 = 0;
                                    i36 = 4;
                                }
                                interfaceC33646o2.mo3100n(i14);
                                j7 = iM68198a;
                            } else {
                                j7 = jM68199b;
                            }
                            z4 = true;
                            if (j7 == -1) {
                                z15 = false;
                                z13 = false;
                            } else {
                                c3489b.f13731d = (int) j7;
                                c3489b.f13730c = 1;
                            }
                        } else {
                            interfaceC33646o2 = interfaceC33646o;
                            z4 = true;
                        }
                        if (c3489b.f13730c == z4) {
                            c3489b.f13732e = c23551e.m68199b(interfaceC33646o2, false, z4, 8);
                            c3489b.f13730c = 2;
                        }
                        C23548b c23548b = (C23548b) c3489b.f13734g;
                        int i38 = c3489b.f13731d;
                        Object obj2 = c23548b.f93280x;
                        switch (i38) {
                            case 131:
                            case 136:
                            case 155:
                            case 159:
                            case 176:
                            case 179:
                            case 186:
                            case 215:
                            case 231:
                            case 238:
                            case 241:
                            case 251:
                            case 16871:
                            case 16980:
                            case 17029:
                            case 17143:
                            case 18401:
                            case 18408:
                            case 20529:
                            case 20530:
                            case 21420:
                            case 21432:
                            case 21680:
                            case 21682:
                            case 21690:
                            case 21930:
                            case 21938:
                            case 21945:
                            case 21946:
                            case 21947:
                            case 21948:
                            case 21949:
                            case 21998:
                            case 22186:
                            case 22203:
                            case 25188:
                            case 30114:
                            case 30321:
                            case 2352003:
                            case 2807729:
                                i13 = 2;
                                break;
                            case 134:
                            case 17026:
                            case 21358:
                            case 2274716:
                                i13 = 3;
                                break;
                            case 160:
                            case 166:
                            case 174:
                            case 183:
                            case 187:
                            case 224:
                            case 225:
                            case 16868:
                            case 18407:
                            case 19899:
                            case 20532:
                            case 20533:
                            case 21936:
                            case 21968:
                            case 25152:
                            case 28032:
                            case 30113:
                            case 30320:
                            case 290298740:
                            case 357149030:
                            case 374648427:
                            case 408125543:
                            case 440786851:
                            case 475249515:
                            case 524531317:
                                i13 = 1;
                                break;
                            case 161:
                            case 163:
                            case 165:
                            case 16877:
                            case 16981:
                            case 18402:
                            case 21419:
                            case 25506:
                            case 30322:
                                i13 = 4;
                                break;
                            case 181:
                            case 17545:
                            case 21969:
                            case 21970:
                            case 21971:
                            case 21972:
                            case 21973:
                            case 21974:
                            case 21975:
                            case 21976:
                            case 21977:
                            case 21978:
                            case 30323:
                            case 30324:
                            case 30325:
                                i13 = 5;
                                break;
                            default:
                                i13 = 0;
                                break;
                        }
                        if (i13 == 0) {
                            interfaceC33646o2.mo3100n((int) c3489b.f13732e);
                            c3489b.f13730c = 0;
                            i34 = -1;
                        } else if (i13 == 1) {
                            long position = interfaceC33646o2.getPosition();
                            arrayDeque.push(new C23547a(c3489b.f13731d, c3489b.f13732e + position));
                            C23548b c23548b2 = (C23548b) c3489b.f13734g;
                            int i39 = c3489b.f13731d;
                            long j13 = c3489b.f13732e;
                            C23550d c23550d2 = (C23550d) c23548b2.f93280x;
                            AbstractC35849g.m113808j(c23550d2.f93375e0);
                            if (i39 != 160) {
                                if (i39 == 174) {
                                    C23549c c23549c = new C23549c();
                                    c23549c.f93321n = -1;
                                    c23549c.f93322o = -1;
                                    c23549c.f93323p = -1;
                                    c23549c.f93324q = -1;
                                    c23549c.f93325r = -1;
                                    c23549c.f93326s = 0;
                                    c23549c.f93327t = -1;
                                    c23549c.f93328u = 0.0f;
                                    c23549c.f93329v = 0.0f;
                                    c23549c.f93330w = 0.0f;
                                    c23549c.f93331x = null;
                                    c23549c.f93332y = -1;
                                    c23549c.f93333z = false;
                                    c23549c.f93281A = -1;
                                    c23549c.f93282B = -1;
                                    c23549c.f93283C = -1;
                                    c23549c.f93284D = 1000;
                                    c23549c.f93285E = 200;
                                    c23549c.f93286F = -1.0f;
                                    c23549c.f93287G = -1.0f;
                                    c23549c.f93288H = -1.0f;
                                    c23549c.f93289I = -1.0f;
                                    c23549c.f93290J = -1.0f;
                                    c23549c.f93291K = -1.0f;
                                    c23549c.f93292L = -1.0f;
                                    c23549c.f93293M = -1.0f;
                                    c23549c.f93294N = -1.0f;
                                    c23549c.f93295O = -1.0f;
                                    c23549c.f93297Q = 1;
                                    c23549c.f93298R = -1;
                                    c23549c.f93299S = 8000;
                                    c23549c.f93300T = 0L;
                                    c23549c.f93301U = 0L;
                                    c23549c.f93304X = true;
                                    c23549c.f93305Y = "eng";
                                    c23550d2.f93394x = c23549c;
                                    c23549c.f93307a = c23550d2.f93393w;
                                } else if (i39 == 187) {
                                    z13 = false;
                                    c23550d2.f93347H = false;
                                } else if (i39 == 19899) {
                                    c23550d2.f93396z = -1;
                                    c23550d2.f93340A = -1L;
                                } else if (i39 == 20533) {
                                    c23550d2.m68191c(i39);
                                    c23550d2.f93394x.f93316i = true;
                                } else if (i39 == 21968) {
                                    c23550d2.m68191c(i39);
                                    c23550d2.f93394x.f93333z = true;
                                } else if (i39 == 408125543) {
                                    long j14 = c23550d2.f93389s;
                                    if (j14 != -1 && j14 != position) {
                                        throw ParserException.m5049a(null, "Multiple Segment elements not supported");
                                    }
                                    c23550d2.f93389s = position;
                                    c23550d2.f93388r = j13;
                                } else if (i39 == 475249515) {
                                    c23550d2.f93345F = new C24553k(2, (byte) 0);
                                    c23550d2.f93346G = new C24553k(2, (byte) 0);
                                } else if (i39 == 524531317 && !c23550d2.f93395y) {
                                    if (!c23550d2.f93372d || c23550d2.f93342C == -1) {
                                        c23550d2.f93375e0.mo3109v(new C33651t(c23550d2.f93392v));
                                        c23550d2.f93395y = true;
                                    } else {
                                        c23550d2.f93341B = true;
                                    }
                                }
                                z13 = false;
                            } else {
                                z13 = false;
                                c23550d2.f93359T = false;
                                c23550d2.f93360U = 0L;
                            }
                            c3489b.f13730c = z13 ? 1 : 0;
                        } else if (i13 == 2) {
                            long j15 = c3489b.f13732e;
                            if (j15 > 8) {
                                throw ParserException.m5049a(null, "Invalid integer size: " + c3489b.f13732e);
                            }
                            c23548b.m68161B(i38, c3489b.m10284a(interfaceC33646o2, (int) j15));
                            z13 = false;
                            c3489b.f13730c = 0;
                        } else if (i13 == 3) {
                            long j16 = c3489b.f13732e;
                            if (j16 > 2147483647L) {
                                throw ParserException.m5049a(null, "String element size: " + c3489b.f13732e);
                            }
                            int i44 = (int) j16;
                            if (i44 == 0) {
                                str = "";
                            } else {
                                byte[] bArr3 = new byte[i44];
                                interfaceC33646o2.readFully(bArr3, 0, i44);
                                while (i44 > 0 && bArr3[i44 - 1] == 0) {
                                    i44--;
                                }
                                str = new String(bArr3, 0, i44);
                            }
                            C23550d c23550d3 = (C23550d) c23548b.f93280x;
                            if (i38 == 134) {
                                c23550d3.m68191c(i38);
                                c23550d3.f93394x.f93310c = str;
                            } else if (i38 == 17026) {
                                if (!"webm".equals(str) && !"matroska".equals(str)) {
                                    throw ParserException.m5049a(null, "DocType " + str + " not supported");
                                }
                                c23550d3.f93393w = str.equals("webm");
                            } else if (i38 == 21358) {
                                c23550d3.m68191c(i38);
                                c23550d3.f93394x.f93309b = str;
                            } else if (i38 == 2274716) {
                                c23550d3.m68191c(i38);
                                c23550d3.f93394x.f93305Y = str;
                            }
                            z13 = false;
                            c3489b.f13730c = 0;
                        } else if (i13 == 4) {
                            c23548b.m68160A(i38, (int) c3489b.f13732e, interfaceC33646o2);
                            z13 = false;
                            c3489b.f13730c = 0;
                        } else {
                            if (i13 != 5) {
                                throw ParserException.m5049a(null, "Invalid element type " + i13);
                            }
                            long j17 = c3489b.f13732e;
                            if (j17 != 4 && j17 != 8) {
                                throw ParserException.m5049a(null, "Invalid float size: " + c3489b.f13732e);
                            }
                            int i45 = (int) j17;
                            long jM10284a = c3489b.m10284a(interfaceC33646o2, i45);
                            double dIntBitsToFloat = i45 == 4 ? Float.intBitsToFloat((int) jM10284a) : Double.longBitsToDouble(jM10284a);
                            C23550d c23550d4 = (C23550d) c23548b.f93280x;
                            if (i38 == 181) {
                                c23550d4.m68191c(i38);
                                c23550d4.f93394x.f93299S = (int) dIntBitsToFloat;
                            } else if (i38 != 17545) {
                                switch (i38) {
                                    case 21969:
                                        c23550d4.m68191c(i38);
                                        c23550d4.f93394x.f93286F = (float) dIntBitsToFloat;
                                        break;
                                    case 21970:
                                        c23550d4.m68191c(i38);
                                        c23550d4.f93394x.f93287G = (float) dIntBitsToFloat;
                                        break;
                                    case 21971:
                                        c23550d4.m68191c(i38);
                                        c23550d4.f93394x.f93288H = (float) dIntBitsToFloat;
                                        break;
                                    case 21972:
                                        c23550d4.m68191c(i38);
                                        c23550d4.f93394x.f93289I = (float) dIntBitsToFloat;
                                        break;
                                    case 21973:
                                        c23550d4.m68191c(i38);
                                        c23550d4.f93394x.f93290J = (float) dIntBitsToFloat;
                                        break;
                                    case 21974:
                                        c23550d4.m68191c(i38);
                                        c23550d4.f93394x.f93291K = (float) dIntBitsToFloat;
                                        break;
                                    case 21975:
                                        c23550d4.m68191c(i38);
                                        c23550d4.f93394x.f93292L = (float) dIntBitsToFloat;
                                        break;
                                    case 21976:
                                        c23550d4.m68191c(i38);
                                        c23550d4.f93394x.f93293M = (float) dIntBitsToFloat;
                                        break;
                                    case 21977:
                                        c23550d4.m68191c(i38);
                                        c23550d4.f93394x.f93294N = (float) dIntBitsToFloat;
                                        break;
                                    case 21978:
                                        c23550d4.m68191c(i38);
                                        c23550d4.f93394x.f93295O = (float) dIntBitsToFloat;
                                        break;
                                    default:
                                        switch (i38) {
                                            case 30323:
                                                c23550d4.m68191c(i38);
                                                c23550d4.f93394x.f93328u = (float) dIntBitsToFloat;
                                                break;
                                            case 30324:
                                                c23550d4.m68191c(i38);
                                                c23550d4.f93394x.f93329v = (float) dIntBitsToFloat;
                                                break;
                                            case 30325:
                                                c23550d4.m68191c(i38);
                                                c23550d4.f93394x.f93330w = (float) dIntBitsToFloat;
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                c23550d4.f93391u = (long) dIntBitsToFloat;
                            }
                            c3489b.f13730c = 0;
                            z13 = false;
                        }
                    } else {
                        C23548b c23548b3 = (C23548b) c3489b.f13734g;
                        int i46 = ((C23547a) arrayDeque.pop()).f93277a;
                        C23550d c23550d5 = (C23550d) c23548b3.f93280x;
                        SparseArray sparseArray = c23550d5.f93370c;
                        AbstractC35849g.m113808j(c23550d5.f93375e0);
                        if (i46 == 160) {
                            if (c23550d5.f93349J == 2) {
                                C23549c c23549c2 = (C23549c) sparseArray.get(c23550d5.f93355P);
                                c23549c2.f93306Z.getClass();
                                if (c23550d5.f93360U > 0 && "A_OPUS".equals(c23549c2.f93310c)) {
                                    C38059n c38059n = c23550d5.f93386p;
                                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(c23550d5.f93360U).array();
                                    c38059n.getClass();
                                    c38059n.m121844D(bArrArray.length, bArrArray);
                                }
                                int i47 = 0;
                                for (int i48 = 0; i48 < c23550d5.f93353N; i48++) {
                                    i47 += c23550d5.f93354O[i48];
                                }
                                int i49 = 0;
                                while (i49 < c23550d5.f93353N) {
                                    long j18 = c23550d5.f93350K + ((long) ((c23549c2.f93313f * i49) / 1000));
                                    int i54 = c23550d5.f93357R;
                                    if (i49 == 0 && !c23550d5.f93359T) {
                                        i54 |= 1;
                                    }
                                    int i55 = c23550d5.f93354O[i49];
                                    int i56 = i47 - i55;
                                    c23550d5.m68192d(c23549c2, j18, i54, i55, i56);
                                    i49++;
                                    i47 = i56;
                                }
                                z14 = false;
                                c23550d5.f93349J = 0;
                            }
                            interfaceC33646o2 = interfaceC33646o;
                            z13 = z14;
                        } else if (i46 == 174) {
                            ?? r10 = c23550d5.f93394x;
                            AbstractC35849g.m113808j(r10);
                            String str8 = r10.f93310c;
                            if (str8 == null) {
                                throw ParserException.m5049a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str8) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    InterfaceC33648q interfaceC33648q = c23550d5.f93375e0;
                                    int i57 = r10.f93311d;
                                    switch (str8) {
                                        case "V_MPEG4/ISO/AP":
                                            b = 0;
                                            break;
                                        case "V_MPEG4/ISO/SP":
                                            b = 1;
                                            break;
                                        case "A_MS/ACM":
                                            b = 2;
                                            break;
                                        case "A_TRUEHD":
                                            b = 3;
                                            break;
                                        case "A_VORBIS":
                                            b = 4;
                                            break;
                                        case "A_MPEG/L2":
                                            b = 5;
                                            break;
                                        case "A_MPEG/L3":
                                            b = 6;
                                            break;
                                        case "V_MS/VFW/FOURCC":
                                            b = 7;
                                            break;
                                        case "S_DVBSUB":
                                            b = 8;
                                            break;
                                        case "V_MPEG4/ISO/ASP":
                                            b = 9;
                                            break;
                                        case "V_MPEG4/ISO/AVC":
                                            b = 10;
                                            break;
                                        case "S_VOBSUB":
                                            b = 11;
                                            break;
                                        case "A_DTS/LOSSLESS":
                                            b = 12;
                                            break;
                                        case "A_AAC":
                                            b = 13;
                                            break;
                                        case "A_AC3":
                                            b = 14;
                                            break;
                                        case "A_DTS":
                                            b = 15;
                                            break;
                                        case "V_AV1":
                                            b = 16;
                                            break;
                                        case "V_VP8":
                                            b = 17;
                                            break;
                                        case "V_VP9":
                                            b = 18;
                                            break;
                                        case "S_HDMV/PGS":
                                            b = 19;
                                            break;
                                        case "V_THEORA":
                                            b = 20;
                                            break;
                                        case "A_DTS/EXPRESS":
                                            b = 21;
                                            break;
                                        case "A_PCM/FLOAT/IEEE":
                                            b = 22;
                                            break;
                                        case "A_PCM/INT/BIG":
                                            b = 23;
                                            break;
                                        case "A_PCM/INT/LIT":
                                            b = 24;
                                            break;
                                        case "S_TEXT/ASS":
                                            b = 25;
                                            break;
                                        case "V_MPEGH/ISO/HEVC":
                                            b = 26;
                                            break;
                                        case "S_TEXT/WEBVTT":
                                            b = 27;
                                            break;
                                        case "S_TEXT/UTF8":
                                            b = 28;
                                            break;
                                        case "V_MPEG2":
                                            b = 29;
                                            break;
                                        case "A_EAC3":
                                            b = 30;
                                            break;
                                        case "A_FLAC":
                                            b = 31;
                                            break;
                                        case "A_OPUS":
                                            b = 32;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    String str9 = "video/x-unknown";
                                    switch (b) {
                                        case 0:
                                        case 1:
                                        case 9:
                                            byte[] bArr4 = r10.f93319l;
                                            str9 = "video/mp4v-es";
                                            listSingletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            if (r10.f93296P != null && (c11856j0M31816l = C11856j0.m31816l(new C38059n(r10.f93296P))) != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z16 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i58 = (z16 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19 || (i26 = r10.f93325r) == i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = (r10.f93322o * i24) / (r10.f93321n * i26);
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f || r10.f93287G == -1.0f || r10.f93288H == -1.0f || r10.f93289I == -1.0f || r10.f93290J == -1.0f || r10.f93291K == -1.0f || r10.f93292L == -1.0f || r10.f93293M == -1.0f || r10.f93294N == -1.0f || r10.f93295O == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        byteBufferOrder.put((byte) 0);
                                                        byteBufferOrder.putShort((short) ((r10.f93286F * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r10.f93287G * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r10.f93288H * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r10.f93289I * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r10.f93290J * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r10.f93291K * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r10.f93292L * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r10.f93293M * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) (r10.f93294N + 0.5f));
                                                        byteBufferOrder.putShort((short) (r10.f93295O + 0.5f));
                                                        byteBufferOrder.putShort((short) r10.f93284D);
                                                        byteBufferOrder.putShort((short) r10.f93285E);
                                                        bArr = bArr5;
                                                    }
                                                    int i59 = r10.f93281A;
                                                    int i64 = r10.f93283C;
                                                    int i65 = r10.f93282B;
                                                    int i66 = r10.f93323p;
                                                    c34592g = new C34592g(i59, i64, i65, i66, i66, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null && map.containsKey(str5)) {
                                                    iIntValue = ((Integer) map.get(r10.f93309b)).intValue();
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0 || Float.compare(r10.f93328u, 0.0f) != 0 || Float.compare(r10.f93329v, 0.0f) != 0) {
                                                    i25 = iIntValue;
                                                } else if (Float.compare(r10.f93330w, 0.0f) == 0) {
                                                    i25 = 0;
                                                } else if (Float.compare(r10.f93330w, 90.0f) == 0) {
                                                    i25 = 90;
                                                } else if (Float.compare(r10.f93330w, -180.0f) == 0 || Float.compare(r10.f93330w, 180.0f) == 0) {
                                                    i25 = 180;
                                                } else if (Float.compare(r10.f93330w, -90.0f) == 0) {
                                                    i25 = 270;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9) && !"text/x-ssa".equals(str9) && !"text/vtt".equals(str9) && !"application/vobsub".equals(str9) && !"application/pgs".equals(str9) && !"application/dvbsubs".equals(str9)) {
                                                    throw ParserException.m5049a(null, "Unexpected MIME type.");
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null && !map.containsKey(str6)) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i58;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o;
                                            interfaceC33639k0Mo3101o.mo36173a(c34610p);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 2:
                                            c23550d5 = c23550d5;
                                            C38059n c38059n2 = new C38059n(r10.m68188a(r10.f93310c));
                                            try {
                                                int iM121860m = c38059n2.m121860m();
                                                if (iM121860m != 1) {
                                                    if (iM121860m == 65534) {
                                                        c38059n2.m121846F(24);
                                                        long jM121861n = c38059n2.m121861n();
                                                        UUID uuid = f93338j0;
                                                        if (jM121861n != uuid.getMostSignificantBits() || c38059n2.m121861n() != uuid.getLeastSignificantBits()) {
                                                        }
                                                        str9 = "audio/x-unknown";
                                                        i15 = -1;
                                                        str2 = null;
                                                        i16 = -1;
                                                        listSingletonList = null;
                                                        if (r10.f93296P != null) {
                                                            str2 = c11856j0M31816l.f38685x;
                                                            str9 = "video/dolby-vision";
                                                        }
                                                        boolean z17 = r10.f93304X;
                                                        if (r10.f93303W) {
                                                            i17 = 2;
                                                        } else {
                                                            i17 = 0;
                                                        }
                                                        int i510 = (z17 ? 1 : 0) | i17;
                                                        c34608o = new C34608o();
                                                        zM109378k = AbstractC34587d0.m109378k(str9);
                                                        Map map2 = f93339k0;
                                                        if (zM109378k) {
                                                            c34608o.f145719C = r10.f93297Q;
                                                            c34608o.f145720D = r10.f93299S;
                                                            c34608o.f145721E = i15;
                                                            i18 = 1;
                                                        } else if (AbstractC34587d0.m109381n(str9)) {
                                                            if (r10.f93326s == 0) {
                                                                i27 = r10.f93324q;
                                                                i19 = -1;
                                                                if (i27 == -1) {
                                                                    i27 = r10.f93321n;
                                                                }
                                                                r10.f93324q = i27;
                                                                i28 = r10.f93325r;
                                                                if (i28 == -1) {
                                                                    i28 = r10.f93322o;
                                                                }
                                                                r10.f93325r = i28;
                                                            } else {
                                                                i19 = -1;
                                                            }
                                                            i24 = r10.f93324q;
                                                            if (i24 != i19) {
                                                                f13 = -1.0f;
                                                            } else {
                                                                f13 = -1.0f;
                                                            }
                                                            if (r10.f93333z) {
                                                                if (r10.f93286F != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                int i511 = r10.f93281A;
                                                                int i67 = r10.f93283C;
                                                                int i68 = r10.f93282B;
                                                                int i69 = r10.f93323p;
                                                                c34592g = new C34592g(i511, i67, i68, i69, i69, bArr);
                                                            } else {
                                                                c34592g = null;
                                                            }
                                                            str5 = r10.f93309b;
                                                            if (str5 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (r10.f93327t == 0) {
                                                                i25 = iIntValue;
                                                            } else {
                                                                i25 = iIntValue;
                                                            }
                                                            c34608o.f145748t = r10.f93321n;
                                                            c34608o.f145749u = r10.f93322o;
                                                            c34608o.f145752x = f13;
                                                            c34608o.f145751w = i25;
                                                            c34608o.f145753y = r10.f93331x;
                                                            c34608o.f145754z = r10.f93332y;
                                                            c34608o.f145717A = c34592g;
                                                            i18 = 2;
                                                        } else {
                                                            if ("application/x-subrip".equals(str9)) {
                                                            }
                                                            i18 = 3;
                                                        }
                                                        str6 = r10.f93309b;
                                                        if (str6 != null) {
                                                            c34608o.f145730b = r10.f93309b;
                                                        }
                                                        c34608o.f145729a = Integer.toString(i57);
                                                        if (r10.f93307a) {
                                                            str7 = "video/webm";
                                                        } else {
                                                            str7 = "video/x-matroska";
                                                        }
                                                        c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                                        c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                                        c34608o.f145742n = i16;
                                                        c34608o.f145732d = r10.f93305Y;
                                                        c34608o.f145733e = i510;
                                                        c34608o.f145744p = listSingletonList;
                                                        c34608o.f145738j = str2;
                                                        c34608o.f145745q = r10.f93320m;
                                                        C34610p c34610p2 = new C34610p(c34608o);
                                                        InterfaceC33639k0 interfaceC33639k0Mo3101o2 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                                        r10.f93306Z = interfaceC33639k0Mo3101o2;
                                                        interfaceC33639k0Mo3101o2.mo36173a(c34610p2);
                                                        sparseArray.put(r10.f93311d, r10);
                                                        c23550d5 = c23550d5;
                                                    }
                                                    AbstractC38046a.m121826u("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    i15 = -1;
                                                    str2 = null;
                                                    i16 = -1;
                                                    listSingletonList = null;
                                                    if (r10.f93296P != null) {
                                                        str2 = c11856j0M31816l.f38685x;
                                                        str9 = "video/dolby-vision";
                                                    }
                                                    boolean z18 = r10.f93304X;
                                                    if (r10.f93303W) {
                                                        i17 = 2;
                                                    } else {
                                                        i17 = 0;
                                                    }
                                                    int i512 = (z18 ? 1 : 0) | i17;
                                                    c34608o = new C34608o();
                                                    zM109378k = AbstractC34587d0.m109378k(str9);
                                                    Map map3 = f93339k0;
                                                    if (zM109378k) {
                                                        c34608o.f145719C = r10.f93297Q;
                                                        c34608o.f145720D = r10.f93299S;
                                                        c34608o.f145721E = i15;
                                                        i18 = 1;
                                                    } else if (AbstractC34587d0.m109381n(str9)) {
                                                        if (r10.f93326s == 0) {
                                                            i27 = r10.f93324q;
                                                            i19 = -1;
                                                            if (i27 == -1) {
                                                                i27 = r10.f93321n;
                                                            }
                                                            r10.f93324q = i27;
                                                            i28 = r10.f93325r;
                                                            if (i28 == -1) {
                                                                i28 = r10.f93322o;
                                                            }
                                                            r10.f93325r = i28;
                                                        } else {
                                                            i19 = -1;
                                                        }
                                                        i24 = r10.f93324q;
                                                        if (i24 != i19) {
                                                            f13 = -1.0f;
                                                        } else {
                                                            f13 = -1.0f;
                                                        }
                                                        if (r10.f93333z) {
                                                            if (r10.f93286F != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i513 = r10.f93281A;
                                                            int i610 = r10.f93283C;
                                                            int i611 = r10.f93282B;
                                                            int i612 = r10.f93323p;
                                                            c34592g = new C34592g(i513, i610, i611, i612, i612, bArr);
                                                        } else {
                                                            c34592g = null;
                                                        }
                                                        str5 = r10.f93309b;
                                                        if (str5 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (r10.f93327t == 0) {
                                                            i25 = iIntValue;
                                                        } else {
                                                            i25 = iIntValue;
                                                        }
                                                        c34608o.f145748t = r10.f93321n;
                                                        c34608o.f145749u = r10.f93322o;
                                                        c34608o.f145752x = f13;
                                                        c34608o.f145751w = i25;
                                                        c34608o.f145753y = r10.f93331x;
                                                        c34608o.f145754z = r10.f93332y;
                                                        c34608o.f145717A = c34592g;
                                                        i18 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str9)) {
                                                        }
                                                        i18 = 3;
                                                    }
                                                    str6 = r10.f93309b;
                                                    if (str6 != null) {
                                                        c34608o.f145730b = r10.f93309b;
                                                    }
                                                    c34608o.f145729a = Integer.toString(i57);
                                                    if (r10.f93307a) {
                                                        str7 = "video/webm";
                                                    } else {
                                                        str7 = "video/x-matroska";
                                                    }
                                                    c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                                    c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                                    c34608o.f145742n = i16;
                                                    c34608o.f145732d = r10.f93305Y;
                                                    c34608o.f145733e = i512;
                                                    c34608o.f145744p = listSingletonList;
                                                    c34608o.f145738j = str2;
                                                    c34608o.f145745q = r10.f93320m;
                                                    C34610p c34610p3 = new C34610p(c34608o);
                                                    InterfaceC33639k0 interfaceC33639k0Mo3101o3 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                                    r10.f93306Z = interfaceC33639k0Mo3101o3;
                                                    interfaceC33639k0Mo3101o3.mo36173a(c34610p3);
                                                    sparseArray.put(r10.f93311d, r10);
                                                    c23550d5 = c23550d5;
                                                    break;
                                                }
                                                int iM121930w = AbstractC38065t.m121930w(r10.f93298R);
                                                if (iM121930w == 0) {
                                                    AbstractC38046a.m121826u("MatroskaExtractor", "Unsupported PCM bit depth: " + r10.f93298R + ". Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    i15 = -1;
                                                    str2 = null;
                                                    i16 = -1;
                                                    listSingletonList = null;
                                                    if (r10.f93296P != null) {
                                                        str2 = c11856j0M31816l.f38685x;
                                                        str9 = "video/dolby-vision";
                                                    }
                                                    boolean z19 = r10.f93304X;
                                                    if (r10.f93303W) {
                                                        i17 = 2;
                                                    } else {
                                                        i17 = 0;
                                                    }
                                                    int i514 = (z19 ? 1 : 0) | i17;
                                                    c34608o = new C34608o();
                                                    zM109378k = AbstractC34587d0.m109378k(str9);
                                                    Map map4 = f93339k0;
                                                    if (zM109378k) {
                                                        c34608o.f145719C = r10.f93297Q;
                                                        c34608o.f145720D = r10.f93299S;
                                                        c34608o.f145721E = i15;
                                                        i18 = 1;
                                                    } else if (AbstractC34587d0.m109381n(str9)) {
                                                        if (r10.f93326s == 0) {
                                                            i27 = r10.f93324q;
                                                            i19 = -1;
                                                            if (i27 == -1) {
                                                                i27 = r10.f93321n;
                                                            }
                                                            r10.f93324q = i27;
                                                            i28 = r10.f93325r;
                                                            if (i28 == -1) {
                                                                i28 = r10.f93322o;
                                                            }
                                                            r10.f93325r = i28;
                                                        } else {
                                                            i19 = -1;
                                                        }
                                                        i24 = r10.f93324q;
                                                        if (i24 != i19) {
                                                            f13 = -1.0f;
                                                        } else {
                                                            f13 = -1.0f;
                                                        }
                                                        if (r10.f93333z) {
                                                            if (r10.f93286F != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i515 = r10.f93281A;
                                                            int i613 = r10.f93283C;
                                                            int i614 = r10.f93282B;
                                                            int i615 = r10.f93323p;
                                                            c34592g = new C34592g(i515, i613, i614, i615, i615, bArr);
                                                        } else {
                                                            c34592g = null;
                                                        }
                                                        str5 = r10.f93309b;
                                                        if (str5 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (r10.f93327t == 0) {
                                                            i25 = iIntValue;
                                                        } else {
                                                            i25 = iIntValue;
                                                        }
                                                        c34608o.f145748t = r10.f93321n;
                                                        c34608o.f145749u = r10.f93322o;
                                                        c34608o.f145752x = f13;
                                                        c34608o.f145751w = i25;
                                                        c34608o.f145753y = r10.f93331x;
                                                        c34608o.f145754z = r10.f93332y;
                                                        c34608o.f145717A = c34592g;
                                                        i18 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str9)) {
                                                        }
                                                        i18 = 3;
                                                    }
                                                    str6 = r10.f93309b;
                                                    if (str6 != null) {
                                                        c34608o.f145730b = r10.f93309b;
                                                    }
                                                    c34608o.f145729a = Integer.toString(i57);
                                                    if (r10.f93307a) {
                                                        str7 = "video/webm";
                                                    } else {
                                                        str7 = "video/x-matroska";
                                                    }
                                                    c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                                    c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                                    c34608o.f145742n = i16;
                                                    c34608o.f145732d = r10.f93305Y;
                                                    c34608o.f145733e = i514;
                                                    c34608o.f145744p = listSingletonList;
                                                    c34608o.f145738j = str2;
                                                    c34608o.f145745q = r10.f93320m;
                                                    C34610p c34610p4 = new C34610p(c34608o);
                                                    InterfaceC33639k0 interfaceC33639k0Mo3101o4 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                                    r10.f93306Z = interfaceC33639k0Mo3101o4;
                                                    interfaceC33639k0Mo3101o4.mo36173a(c34610p4);
                                                    sparseArray.put(r10.f93311d, r10);
                                                    c23550d5 = c23550d5;
                                                } else {
                                                    i15 = iM121930w;
                                                    str9 = "audio/raw";
                                                    str2 = null;
                                                    i16 = -1;
                                                    listSingletonList = null;
                                                    if (r10.f93296P != null) {
                                                        str2 = c11856j0M31816l.f38685x;
                                                        str9 = "video/dolby-vision";
                                                    }
                                                    boolean z110 = r10.f93304X;
                                                    if (r10.f93303W) {
                                                        i17 = 2;
                                                    } else {
                                                        i17 = 0;
                                                    }
                                                    int i516 = (z110 ? 1 : 0) | i17;
                                                    c34608o = new C34608o();
                                                    zM109378k = AbstractC34587d0.m109378k(str9);
                                                    Map map5 = f93339k0;
                                                    if (zM109378k) {
                                                        c34608o.f145719C = r10.f93297Q;
                                                        c34608o.f145720D = r10.f93299S;
                                                        c34608o.f145721E = i15;
                                                        i18 = 1;
                                                    } else if (AbstractC34587d0.m109381n(str9)) {
                                                        if (r10.f93326s == 0) {
                                                            i27 = r10.f93324q;
                                                            i19 = -1;
                                                            if (i27 == -1) {
                                                                i27 = r10.f93321n;
                                                            }
                                                            r10.f93324q = i27;
                                                            i28 = r10.f93325r;
                                                            if (i28 == -1) {
                                                                i28 = r10.f93322o;
                                                            }
                                                            r10.f93325r = i28;
                                                        } else {
                                                            i19 = -1;
                                                        }
                                                        i24 = r10.f93324q;
                                                        if (i24 != i19) {
                                                            f13 = -1.0f;
                                                        } else {
                                                            f13 = -1.0f;
                                                        }
                                                        if (r10.f93333z) {
                                                            if (r10.f93286F != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i517 = r10.f93281A;
                                                            int i616 = r10.f93283C;
                                                            int i617 = r10.f93282B;
                                                            int i618 = r10.f93323p;
                                                            c34592g = new C34592g(i517, i616, i617, i618, i618, bArr);
                                                        } else {
                                                            c34592g = null;
                                                        }
                                                        str5 = r10.f93309b;
                                                        if (str5 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (r10.f93327t == 0) {
                                                            i25 = iIntValue;
                                                        } else {
                                                            i25 = iIntValue;
                                                        }
                                                        c34608o.f145748t = r10.f93321n;
                                                        c34608o.f145749u = r10.f93322o;
                                                        c34608o.f145752x = f13;
                                                        c34608o.f145751w = i25;
                                                        c34608o.f145753y = r10.f93331x;
                                                        c34608o.f145754z = r10.f93332y;
                                                        c34608o.f145717A = c34592g;
                                                        i18 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str9)) {
                                                        }
                                                        i18 = 3;
                                                    }
                                                    str6 = r10.f93309b;
                                                    if (str6 != null) {
                                                        c34608o.f145730b = r10.f93309b;
                                                    }
                                                    c34608o.f145729a = Integer.toString(i57);
                                                    if (r10.f93307a) {
                                                        str7 = "video/webm";
                                                    } else {
                                                        str7 = "video/x-matroska";
                                                    }
                                                    c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                                    c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                                    c34608o.f145742n = i16;
                                                    c34608o.f145732d = r10.f93305Y;
                                                    c34608o.f145733e = i516;
                                                    c34608o.f145744p = listSingletonList;
                                                    c34608o.f145738j = str2;
                                                    c34608o.f145745q = r10.f93320m;
                                                    C34610p c34610p5 = new C34610p(c34608o);
                                                    InterfaceC33639k0 interfaceC33639k0Mo3101o5 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                                    r10.f93306Z = interfaceC33639k0Mo3101o5;
                                                    interfaceC33639k0Mo3101o5.mo36173a(c34610p5);
                                                    sparseArray.put(r10.f93311d, r10);
                                                    c23550d5 = c23550d5;
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw ParserException.m5049a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            c23550d5 = c23550d5;
                                            r10.f93302V = new C33641l0(0);
                                            str9 = "audio/true-hd";
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            listSingletonList = null;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z111 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i518 = (z111 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map6 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i519 = r10.f93281A;
                                                    int i619 = r10.f93283C;
                                                    int i6110 = r10.f93282B;
                                                    int i6111 = r10.f93323p;
                                                    c34592g = new C34592g(i519, i619, i6110, i6111, i6111, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i518;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p6 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o6 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o6;
                                            interfaceC33639k0Mo3101o6.mo36173a(c34610p6);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 4:
                                            byte[] bArrM68188a = r10.m68188a(str8);
                                            try {
                                                try {
                                                    if (bArrM68188a[0] != 2) {
                                                        throw ParserException.m5049a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i74 = 0;
                                                    int i75 = 1;
                                                    while (true) {
                                                        int i76 = i75;
                                                        int i77 = bArrM68188a[i75] & 255;
                                                        if (i77 != 255) {
                                                            int i78 = i76 + 1;
                                                            int i79 = i74 + i77;
                                                            int i83 = 0;
                                                            while (true) {
                                                                int i84 = bArrM68188a[i78] & 255;
                                                                if (i84 != 255) {
                                                                    int i85 = i78 + 1;
                                                                    int i86 = i83 + i84;
                                                                    if (bArrM68188a[i85] != 1) {
                                                                        throw ParserException.m5049a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i79];
                                                                    System.arraycopy(bArrM68188a, i85, bArr6, 0, i79);
                                                                    int i87 = i85 + i79;
                                                                    if (bArrM68188a[i87] != 3) {
                                                                        throw ParserException.m5049a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i88 = i87 + i86;
                                                                    if (bArrM68188a[i88] != 5) {
                                                                        throw ParserException.m5049a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[bArrM68188a.length - i88];
                                                                    c23550d5 = c23550d5;
                                                                    System.arraycopy(bArrM68188a, i88, bArr7, 0, bArrM68188a.length - i88);
                                                                    ArrayList arrayList = new ArrayList(2);
                                                                    arrayList.add(bArr6);
                                                                    arrayList.add(bArr7);
                                                                    str9 = "audio/vorbis";
                                                                    listSingletonList = arrayList;
                                                                    i16 = 8192;
                                                                    i15 = -1;
                                                                    str2 = null;
                                                                    if (r10.f93296P != null) {
                                                                        str2 = c11856j0M31816l.f38685x;
                                                                        str9 = "video/dolby-vision";
                                                                    }
                                                                    boolean z112 = r10.f93304X;
                                                                    if (r10.f93303W) {
                                                                        i17 = 2;
                                                                    } else {
                                                                        i17 = 0;
                                                                    }
                                                                    int i5110 = (z112 ? 1 : 0) | i17;
                                                                    c34608o = new C34608o();
                                                                    zM109378k = AbstractC34587d0.m109378k(str9);
                                                                    Map map7 = f93339k0;
                                                                    if (zM109378k) {
                                                                        c34608o.f145719C = r10.f93297Q;
                                                                        c34608o.f145720D = r10.f93299S;
                                                                        c34608o.f145721E = i15;
                                                                        i18 = 1;
                                                                    } else if (AbstractC34587d0.m109381n(str9)) {
                                                                        if (r10.f93326s == 0) {
                                                                            i27 = r10.f93324q;
                                                                            i19 = -1;
                                                                            if (i27 == -1) {
                                                                                i27 = r10.f93321n;
                                                                            }
                                                                            r10.f93324q = i27;
                                                                            i28 = r10.f93325r;
                                                                            if (i28 == -1) {
                                                                                i28 = r10.f93322o;
                                                                            }
                                                                            r10.f93325r = i28;
                                                                        } else {
                                                                            i19 = -1;
                                                                        }
                                                                        i24 = r10.f93324q;
                                                                        if (i24 != i19) {
                                                                            f13 = -1.0f;
                                                                        } else {
                                                                            f13 = -1.0f;
                                                                        }
                                                                        if (r10.f93333z) {
                                                                            if (r10.f93286F != -1.0f) {
                                                                                bArr = null;
                                                                            } else {
                                                                                bArr = null;
                                                                            }
                                                                            int i5111 = r10.f93281A;
                                                                            int i6112 = r10.f93283C;
                                                                            int i6113 = r10.f93282B;
                                                                            int i6114 = r10.f93323p;
                                                                            c34592g = new C34592g(i5111, i6112, i6113, i6114, i6114, bArr);
                                                                        } else {
                                                                            c34592g = null;
                                                                        }
                                                                        str5 = r10.f93309b;
                                                                        if (str5 == null) {
                                                                            iIntValue = -1;
                                                                        } else {
                                                                            iIntValue = -1;
                                                                        }
                                                                        if (r10.f93327t == 0) {
                                                                            i25 = iIntValue;
                                                                        } else {
                                                                            i25 = iIntValue;
                                                                        }
                                                                        c34608o.f145748t = r10.f93321n;
                                                                        c34608o.f145749u = r10.f93322o;
                                                                        c34608o.f145752x = f13;
                                                                        c34608o.f145751w = i25;
                                                                        c34608o.f145753y = r10.f93331x;
                                                                        c34608o.f145754z = r10.f93332y;
                                                                        c34608o.f145717A = c34592g;
                                                                        i18 = 2;
                                                                    } else {
                                                                        if ("application/x-subrip".equals(str9)) {
                                                                        }
                                                                        i18 = 3;
                                                                    }
                                                                    str6 = r10.f93309b;
                                                                    if (str6 != null) {
                                                                        c34608o.f145730b = r10.f93309b;
                                                                    }
                                                                    c34608o.f145729a = Integer.toString(i57);
                                                                    if (r10.f93307a) {
                                                                        str7 = "video/webm";
                                                                    } else {
                                                                        str7 = "video/x-matroska";
                                                                    }
                                                                    c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                                                    c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                                                    c34608o.f145742n = i16;
                                                                    c34608o.f145732d = r10.f93305Y;
                                                                    c34608o.f145733e = i5110;
                                                                    c34608o.f145744p = listSingletonList;
                                                                    c34608o.f145738j = str2;
                                                                    c34608o.f145745q = r10.f93320m;
                                                                    C34610p c34610p7 = new C34610p(c34608o);
                                                                    InterfaceC33639k0 interfaceC33639k0Mo3101o7 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                                                    r10.f93306Z = interfaceC33639k0Mo3101o7;
                                                                    interfaceC33639k0Mo3101o7.mo36173a(c34610p7);
                                                                    sparseArray.put(r10.f93311d, r10);
                                                                    c23550d5 = c23550d5;
                                                                } else {
                                                                    i83 += 255;
                                                                    i78++;
                                                                }
                                                            }
                                                        } else {
                                                            i74 += 255;
                                                            i75 = i76 + 1;
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw ParserException.m5049a(r10, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r10 = 0;
                                            }
                                            break;
                                        case 5:
                                            str9 = "audio/mpeg-L2";
                                            c23550d5 = c23550d5;
                                            i15 = -1;
                                            str2 = null;
                                            i16 = 4096;
                                            listSingletonList = null;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z113 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i5112 = (z113 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map8 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i5113 = r10.f93281A;
                                                    int i6115 = r10.f93283C;
                                                    int i6116 = r10.f93282B;
                                                    int i6117 = r10.f93323p;
                                                    c34592g = new C34592g(i5113, i6115, i6116, i6117, i6117, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i5112;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p8 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o8 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o8;
                                            interfaceC33639k0Mo3101o8.mo36173a(c34610p8);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 6:
                                            str9 = "audio/mpeg";
                                            c23550d5 = c23550d5;
                                            i15 = -1;
                                            str2 = null;
                                            i16 = 4096;
                                            listSingletonList = null;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z114 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i5114 = (z114 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map9 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i5115 = r10.f93281A;
                                                    int i6118 = r10.f93283C;
                                                    int i6119 = r10.f93282B;
                                                    int i61110 = r10.f93323p;
                                                    c34592g = new C34592g(i5115, i6118, i6119, i61110, i61110, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i5114;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p9 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o9 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o9;
                                            interfaceC33639k0Mo3101o9.mo36173a(c34610p9);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 7:
                                            C38059n c38059n3 = new C38059n(r10.m68188a(r10.f93310c));
                                            try {
                                                c38059n3.m121847G(16);
                                                long jM121858k = c38059n3.m121858k();
                                                if (jM121858k == 1482049860) {
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str3 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        runtimeException = null;
                                                    }
                                                } else {
                                                    if (jM121858k == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (jM121858k == 826496599) {
                                                            int i89 = c38059n3.f163018b + 20;
                                                            byte[] bArr8 = c38059n3.f163017a;
                                                            while (true) {
                                                                if (i89 < bArr8.length - 4) {
                                                                    if (bArr8[i89] == 0 && bArr8[i89 + 1] == 0 && bArr8[i89 + 2] == 1) {
                                                                        if (bArr8[i89 + 3] == 15) {
                                                                            pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i89, bArr8.length)));
                                                                        }
                                                                    }
                                                                    i89++;
                                                                } else {
                                                                    try {
                                                                        throw ParserException.m5049a(null, "Failed to find FourCC VC1 initialization data");
                                                                    } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                        runtimeException = null;
                                                                    }
                                                                }
                                                                throw ParserException.m5049a(runtimeException, "Error parsing FourCC private data");
                                                            }
                                                        }
                                                        AbstractC38046a.m121826u("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str3 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                    }
                                                    str3 = null;
                                                }
                                                str9 = (String) pair.first;
                                                str2 = str3;
                                                listSingletonList = (List) pair.second;
                                                i15 = -1;
                                                i16 = -1;
                                                if (r10.f93296P != null) {
                                                    str2 = c11856j0M31816l.f38685x;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z115 = r10.f93304X;
                                                if (r10.f93303W) {
                                                    i17 = 2;
                                                } else {
                                                    i17 = 0;
                                                }
                                                int i5116 = (z115 ? 1 : 0) | i17;
                                                c34608o = new C34608o();
                                                zM109378k = AbstractC34587d0.m109378k(str9);
                                                Map map10 = f93339k0;
                                                if (zM109378k) {
                                                    c34608o.f145719C = r10.f93297Q;
                                                    c34608o.f145720D = r10.f93299S;
                                                    c34608o.f145721E = i15;
                                                    i18 = 1;
                                                } else if (AbstractC34587d0.m109381n(str9)) {
                                                    if (r10.f93326s == 0) {
                                                        i27 = r10.f93324q;
                                                        i19 = -1;
                                                        if (i27 == -1) {
                                                            i27 = r10.f93321n;
                                                        }
                                                        r10.f93324q = i27;
                                                        i28 = r10.f93325r;
                                                        if (i28 == -1) {
                                                            i28 = r10.f93322o;
                                                        }
                                                        r10.f93325r = i28;
                                                    } else {
                                                        i19 = -1;
                                                    }
                                                    i24 = r10.f93324q;
                                                    if (i24 != i19) {
                                                        f13 = -1.0f;
                                                    } else {
                                                        f13 = -1.0f;
                                                    }
                                                    if (r10.f93333z) {
                                                        if (r10.f93286F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i5117 = r10.f93281A;
                                                        int i61111 = r10.f93283C;
                                                        int i61112 = r10.f93282B;
                                                        int i61113 = r10.f93323p;
                                                        c34592g = new C34592g(i5117, i61111, i61112, i61113, i61113, bArr);
                                                    } else {
                                                        c34592g = null;
                                                    }
                                                    str5 = r10.f93309b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r10.f93327t == 0) {
                                                        i25 = iIntValue;
                                                    } else {
                                                        i25 = iIntValue;
                                                    }
                                                    c34608o.f145748t = r10.f93321n;
                                                    c34608o.f145749u = r10.f93322o;
                                                    c34608o.f145752x = f13;
                                                    c34608o.f145751w = i25;
                                                    c34608o.f145753y = r10.f93331x;
                                                    c34608o.f145754z = r10.f93332y;
                                                    c34608o.f145717A = c34592g;
                                                    i18 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i18 = 3;
                                                }
                                                str6 = r10.f93309b;
                                                if (str6 != null) {
                                                    c34608o.f145730b = r10.f93309b;
                                                }
                                                c34608o.f145729a = Integer.toString(i57);
                                                if (r10.f93307a) {
                                                    str7 = "video/webm";
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                                c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                                c34608o.f145742n = i16;
                                                c34608o.f145732d = r10.f93305Y;
                                                c34608o.f145733e = i5116;
                                                c34608o.f145744p = listSingletonList;
                                                c34608o.f145738j = str2;
                                                c34608o.f145745q = r10.f93320m;
                                                C34610p c34610p10 = new C34610p(c34608o);
                                                InterfaceC33639k0 interfaceC33639k0Mo3101o10 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                                r10.f93306Z = interfaceC33639k0Mo3101o10;
                                                interfaceC33639k0Mo3101o10.mo36173a(c34610p10);
                                                sparseArray.put(r10.f93311d, r10);
                                                c23550d5 = c23550d5;
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case 8:
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(r10.m68188a(str8), 0, bArr9, 0, 4);
                                            listSingletonList = AbstractC41023g0.m133256r(bArr9);
                                            str9 = "application/dvbsubs";
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z116 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i5118 = (z116 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map11 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i5119 = r10.f93281A;
                                                    int i61114 = r10.f93283C;
                                                    int i61115 = r10.f93282B;
                                                    int i61116 = r10.f93323p;
                                                    c34592g = new C34592g(i5119, i61114, i61115, i61116, i61116, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i5118;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p11 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o11 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o11;
                                            interfaceC33639k0Mo3101o11.mo36173a(c34610p11);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 10:
                                            C33620b c33620bM106232a = C33620b.m106232a(new C38059n(r10.m68188a(r10.f93310c)));
                                            listSingletonList = c33620bM106232a.f140330a;
                                            r10.f93308a0 = c33620bM106232a.f140331b;
                                            str4 = c33620bM106232a.f140341l;
                                            str9 = "video/avc";
                                            str2 = str4;
                                            i15 = -1;
                                            i16 = -1;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z117 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51110 = (z117 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map12 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i51111 = r10.f93281A;
                                                    int i61117 = r10.f93283C;
                                                    int i61118 = r10.f93282B;
                                                    int i61119 = r10.f93323p;
                                                    c34592g = new C34592g(i51111, i61117, i61118, i61119, i61119, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i51110;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p12 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o12 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o12;
                                            interfaceC33639k0Mo3101o12.mo36173a(c34610p12);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 11:
                                            listSingletonList = AbstractC41023g0.m133256r(r10.m68188a(str8));
                                            str9 = "application/vobsub";
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z118 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51112 = (z118 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map13 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i51113 = r10.f93281A;
                                                    int i611110 = r10.f93283C;
                                                    int i611111 = r10.f93282B;
                                                    int i611112 = r10.f93323p;
                                                    c34592g = new C34592g(i51113, i611110, i611111, i611112, i611112, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i51112;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p13 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o13 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o13;
                                            interfaceC33639k0Mo3101o13.mo36173a(c34610p13);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 12:
                                            str9 = "audio/vnd.dts.hd";
                                            c23550d5 = c23550d5;
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            listSingletonList = null;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z119 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51114 = (z119 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map14 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i51115 = r10.f93281A;
                                                    int i611113 = r10.f93283C;
                                                    int i611114 = r10.f93282B;
                                                    int i611115 = r10.f93323p;
                                                    c34592g = new C34592g(i51115, i611113, i611114, i611115, i611115, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i51114;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p14 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o14 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o14;
                                            interfaceC33639k0Mo3101o14.mo36173a(c34610p14);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 13:
                                            List listSingletonList2 = Collections.singletonList(r10.m68188a(str8));
                                            byte[] bArr10 = r10.f93319l;
                                            C5363q c5363qM106221m = AbstractC33618a.m106221m(new C24561s(bArr10, bArr10.length, 5, (byte) 0), false);
                                            r10.f93299S = c5363qM106221m.f21806b;
                                            r10.f93297Q = c5363qM106221m.f21807c;
                                            str9 = "audio/mp4a-latm";
                                            str2 = c5363qM106221m.f21805a;
                                            listSingletonList = listSingletonList2;
                                            i15 = -1;
                                            i16 = -1;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1110 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51116 = (z1110 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map15 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i51117 = r10.f93281A;
                                                    int i611116 = r10.f93283C;
                                                    int i611117 = r10.f93282B;
                                                    int i611118 = r10.f93323p;
                                                    c34592g = new C34592g(i51117, i611116, i611117, i611118, i611118, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i51116;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p15 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o15 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o15;
                                            interfaceC33639k0Mo3101o15.mo36173a(c34610p15);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 14:
                                            str9 = "audio/ac3";
                                            c23550d5 = c23550d5;
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            listSingletonList = null;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1111 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51118 = (z1111 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map16 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i51119 = r10.f93281A;
                                                    int i611119 = r10.f93283C;
                                                    int i6111110 = r10.f93282B;
                                                    int i6111111 = r10.f93323p;
                                                    c34592g = new C34592g(i51119, i611119, i6111110, i6111111, i6111111, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i51118;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p16 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o16 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o16;
                                            interfaceC33639k0Mo3101o16.mo36173a(c34610p16);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 15:
                                        case 21:
                                            str9 = "audio/vnd.dts";
                                            c23550d5 = c23550d5;
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            listSingletonList = null;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1112 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i511110 = (z1112 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map17 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i511111 = r10.f93281A;
                                                    int i6111112 = r10.f93283C;
                                                    int i6111113 = r10.f93282B;
                                                    int i6111114 = r10.f93323p;
                                                    c34592g = new C34592g(i511111, i6111112, i6111113, i6111114, i6111114, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i511110;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p17 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o17 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o17;
                                            interfaceC33639k0Mo3101o17.mo36173a(c34610p17);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 16:
                                            byte[] bArr11 = r10.f93319l;
                                            listM133256r = bArr11 == null ? null : AbstractC41023g0.m133256r(bArr11);
                                            str9 = "video/av01";
                                            listSingletonList = listM133256r;
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1113 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i511112 = (z1113 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map18 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i511113 = r10.f93281A;
                                                    int i6111115 = r10.f93283C;
                                                    int i6111116 = r10.f93282B;
                                                    int i6111117 = r10.f93323p;
                                                    c34592g = new C34592g(i511113, i6111115, i6111116, i6111117, i6111117, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i511112;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p18 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o18 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o18;
                                            interfaceC33639k0Mo3101o18.mo36173a(c34610p18);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                            str9 = "video/x-vnd.on2.vp8";
                                            c23550d5 = c23550d5;
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            listSingletonList = null;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1114 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i511114 = (z1114 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map19 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i511115 = r10.f93281A;
                                                    int i6111118 = r10.f93283C;
                                                    int i6111119 = r10.f93282B;
                                                    int i61111110 = r10.f93323p;
                                                    c34592g = new C34592g(i511115, i6111118, i6111119, i61111110, i61111110, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i511114;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p19 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o19 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o19;
                                            interfaceC33639k0Mo3101o19.mo36173a(c34610p19);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                                            byte[] bArr12 = r10.f93319l;
                                            listM133256r = bArr12 == null ? null : AbstractC41023g0.m133256r(bArr12);
                                            str9 = "video/x-vnd.on2.vp9";
                                            listSingletonList = listM133256r;
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1115 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i511116 = (z1115 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map110 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i511117 = r10.f93281A;
                                                    int i61111111 = r10.f93283C;
                                                    int i61111112 = r10.f93282B;
                                                    int i61111113 = r10.f93323p;
                                                    c34592g = new C34592g(i511117, i61111111, i61111112, i61111113, i61111113, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i511116;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p110 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o110 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o110;
                                            interfaceC33639k0Mo3101o110.mo36173a(c34610p110);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                            c23550d5 = c23550d5;
                                            str9 = "application/pgs";
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            listSingletonList = null;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1116 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i511118 = (z1116 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map111 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i511119 = r10.f93281A;
                                                    int i61111114 = r10.f93283C;
                                                    int i61111115 = r10.f93282B;
                                                    int i61111116 = r10.f93323p;
                                                    c34592g = new C34592g(i511119, i61111114, i61111115, i61111116, i61111116, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i511118;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p111 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o111 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o111;
                                            interfaceC33639k0Mo3101o111.mo36173a(c34610p111);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 20:
                                            c23550d5 = c23550d5;
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            listSingletonList = null;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1117 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i5111110 = (z1117 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map112 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i5111111 = r10.f93281A;
                                                    int i61111117 = r10.f93283C;
                                                    int i61111118 = r10.f93282B;
                                                    int i61111119 = r10.f93323p;
                                                    c34592g = new C34592g(i5111111, i61111117, i61111118, i61111119, i61111119, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i5111110;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p112 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o112 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o112;
                                            interfaceC33639k0Mo3101o112.mo36173a(c34610p112);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                            if (r10.f93298R == 32) {
                                                c23550d5 = c23550d5;
                                                str9 = "audio/raw";
                                                i15 = 4;
                                            } else {
                                                AbstractC38046a.m121826u("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + r10.f93298R + ". Setting mimeType to audio/x-unknown");
                                                c23550d5 = c23550d5;
                                                str9 = "audio/x-unknown";
                                                i15 = -1;
                                            }
                                            str2 = null;
                                            i16 = -1;
                                            listSingletonList = null;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1118 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i5111112 = (z1118 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map113 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i5111113 = r10.f93281A;
                                                    int i611111110 = r10.f93283C;
                                                    int i611111111 = r10.f93282B;
                                                    int i611111112 = r10.f93323p;
                                                    c34592g = new C34592g(i5111113, i611111110, i611111111, i611111112, i611111112, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i5111112;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p113 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o113 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o113;
                                            interfaceC33639k0Mo3101o113.mo36173a(c34610p113);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                            int i94 = r10.f93298R;
                                            if (i94 == 8) {
                                                c23550d5 = c23550d5;
                                                str9 = "audio/raw";
                                                i15 = 3;
                                            } else {
                                                if (i94 == 16) {
                                                    i15 = 268435456;
                                                } else if (i94 == 24) {
                                                    i15 = 1342177280;
                                                } else if (i94 == 32) {
                                                    i15 = 1610612736;
                                                } else {
                                                    AbstractC38046a.m121826u("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + r10.f93298R + ". Setting mimeType to audio/x-unknown");
                                                    c23550d5 = c23550d5;
                                                    str9 = "audio/x-unknown";
                                                    i15 = -1;
                                                }
                                                c23550d5 = c23550d5;
                                                str9 = "audio/raw";
                                            }
                                            str2 = null;
                                            i16 = -1;
                                            listSingletonList = null;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1119 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i5111114 = (z1119 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map114 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i5111115 = r10.f93281A;
                                                    int i611111113 = r10.f93283C;
                                                    int i611111114 = r10.f93282B;
                                                    int i611111115 = r10.f93323p;
                                                    c34592g = new C34592g(i5111115, i611111113, i611111114, i611111115, i611111115, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i5111114;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p114 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o114 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o114;
                                            interfaceC33639k0Mo3101o114.mo36173a(c34610p114);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 24:
                                            int iM121930w2 = AbstractC38065t.m121930w(r10.f93298R);
                                            if (iM121930w2 == 0) {
                                                AbstractC38046a.m121826u("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + r10.f93298R + ". Setting mimeType to audio/x-unknown");
                                                c23550d5 = c23550d5;
                                                str9 = "audio/x-unknown";
                                                i15 = -1;
                                                str2 = null;
                                                i16 = -1;
                                                listSingletonList = null;
                                                if (r10.f93296P != null) {
                                                    str2 = c11856j0M31816l.f38685x;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z11110 = r10.f93304X;
                                                if (r10.f93303W) {
                                                    i17 = 2;
                                                } else {
                                                    i17 = 0;
                                                }
                                                int i5111116 = (z11110 ? 1 : 0) | i17;
                                                c34608o = new C34608o();
                                                zM109378k = AbstractC34587d0.m109378k(str9);
                                                Map map115 = f93339k0;
                                                if (zM109378k) {
                                                    c34608o.f145719C = r10.f93297Q;
                                                    c34608o.f145720D = r10.f93299S;
                                                    c34608o.f145721E = i15;
                                                    i18 = 1;
                                                } else if (AbstractC34587d0.m109381n(str9)) {
                                                    if (r10.f93326s == 0) {
                                                        i27 = r10.f93324q;
                                                        i19 = -1;
                                                        if (i27 == -1) {
                                                            i27 = r10.f93321n;
                                                        }
                                                        r10.f93324q = i27;
                                                        i28 = r10.f93325r;
                                                        if (i28 == -1) {
                                                            i28 = r10.f93322o;
                                                        }
                                                        r10.f93325r = i28;
                                                    } else {
                                                        i19 = -1;
                                                    }
                                                    i24 = r10.f93324q;
                                                    if (i24 != i19) {
                                                        f13 = -1.0f;
                                                    } else {
                                                        f13 = -1.0f;
                                                    }
                                                    if (r10.f93333z) {
                                                        if (r10.f93286F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i5111117 = r10.f93281A;
                                                        int i611111116 = r10.f93283C;
                                                        int i611111117 = r10.f93282B;
                                                        int i611111118 = r10.f93323p;
                                                        c34592g = new C34592g(i5111117, i611111116, i611111117, i611111118, i611111118, bArr);
                                                    } else {
                                                        c34592g = null;
                                                    }
                                                    str5 = r10.f93309b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r10.f93327t == 0) {
                                                        i25 = iIntValue;
                                                    } else {
                                                        i25 = iIntValue;
                                                    }
                                                    c34608o.f145748t = r10.f93321n;
                                                    c34608o.f145749u = r10.f93322o;
                                                    c34608o.f145752x = f13;
                                                    c34608o.f145751w = i25;
                                                    c34608o.f145753y = r10.f93331x;
                                                    c34608o.f145754z = r10.f93332y;
                                                    c34608o.f145717A = c34592g;
                                                    i18 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i18 = 3;
                                                }
                                                str6 = r10.f93309b;
                                                if (str6 != null) {
                                                    c34608o.f145730b = r10.f93309b;
                                                }
                                                c34608o.f145729a = Integer.toString(i57);
                                                if (r10.f93307a) {
                                                    str7 = "video/webm";
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                                c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                                c34608o.f145742n = i16;
                                                c34608o.f145732d = r10.f93305Y;
                                                c34608o.f145733e = i5111116;
                                                c34608o.f145744p = listSingletonList;
                                                c34608o.f145738j = str2;
                                                c34608o.f145745q = r10.f93320m;
                                                C34610p c34610p115 = new C34610p(c34608o);
                                                InterfaceC33639k0 interfaceC33639k0Mo3101o115 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                                r10.f93306Z = interfaceC33639k0Mo3101o115;
                                                interfaceC33639k0Mo3101o115.mo36173a(c34610p115);
                                                sparseArray.put(r10.f93311d, r10);
                                                c23550d5 = c23550d5;
                                            } else {
                                                c23550d5 = c23550d5;
                                                i15 = iM121930w2;
                                                str9 = "audio/raw";
                                                str2 = null;
                                                i16 = -1;
                                                listSingletonList = null;
                                                if (r10.f93296P != null) {
                                                    str2 = c11856j0M31816l.f38685x;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z11111 = r10.f93304X;
                                                if (r10.f93303W) {
                                                    i17 = 2;
                                                } else {
                                                    i17 = 0;
                                                }
                                                int i5111118 = (z11111 ? 1 : 0) | i17;
                                                c34608o = new C34608o();
                                                zM109378k = AbstractC34587d0.m109378k(str9);
                                                Map map116 = f93339k0;
                                                if (zM109378k) {
                                                    c34608o.f145719C = r10.f93297Q;
                                                    c34608o.f145720D = r10.f93299S;
                                                    c34608o.f145721E = i15;
                                                    i18 = 1;
                                                } else if (AbstractC34587d0.m109381n(str9)) {
                                                    if (r10.f93326s == 0) {
                                                        i27 = r10.f93324q;
                                                        i19 = -1;
                                                        if (i27 == -1) {
                                                            i27 = r10.f93321n;
                                                        }
                                                        r10.f93324q = i27;
                                                        i28 = r10.f93325r;
                                                        if (i28 == -1) {
                                                            i28 = r10.f93322o;
                                                        }
                                                        r10.f93325r = i28;
                                                    } else {
                                                        i19 = -1;
                                                    }
                                                    i24 = r10.f93324q;
                                                    if (i24 != i19) {
                                                        f13 = -1.0f;
                                                    } else {
                                                        f13 = -1.0f;
                                                    }
                                                    if (r10.f93333z) {
                                                        if (r10.f93286F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i5111119 = r10.f93281A;
                                                        int i611111119 = r10.f93283C;
                                                        int i6111111110 = r10.f93282B;
                                                        int i6111111111 = r10.f93323p;
                                                        c34592g = new C34592g(i5111119, i611111119, i6111111110, i6111111111, i6111111111, bArr);
                                                    } else {
                                                        c34592g = null;
                                                    }
                                                    str5 = r10.f93309b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r10.f93327t == 0) {
                                                        i25 = iIntValue;
                                                    } else {
                                                        i25 = iIntValue;
                                                    }
                                                    c34608o.f145748t = r10.f93321n;
                                                    c34608o.f145749u = r10.f93322o;
                                                    c34608o.f145752x = f13;
                                                    c34608o.f145751w = i25;
                                                    c34608o.f145753y = r10.f93331x;
                                                    c34608o.f145754z = r10.f93332y;
                                                    c34608o.f145717A = c34592g;
                                                    i18 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i18 = 3;
                                                }
                                                str6 = r10.f93309b;
                                                if (str6 != null) {
                                                    c34608o.f145730b = r10.f93309b;
                                                }
                                                c34608o.f145729a = Integer.toString(i57);
                                                if (r10.f93307a) {
                                                    str7 = "video/webm";
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                                c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                                c34608o.f145742n = i16;
                                                c34608o.f145732d = r10.f93305Y;
                                                c34608o.f145733e = i5111118;
                                                c34608o.f145744p = listSingletonList;
                                                c34608o.f145738j = str2;
                                                c34608o.f145745q = r10.f93320m;
                                                C34610p c34610p116 = new C34610p(c34608o);
                                                InterfaceC33639k0 interfaceC33639k0Mo3101o116 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                                r10.f93306Z = interfaceC33639k0Mo3101o116;
                                                interfaceC33639k0Mo3101o116.mo36173a(c34610p116);
                                                sparseArray.put(r10.f93311d, r10);
                                                c23550d5 = c23550d5;
                                            }
                                            break;
                                        case 25:
                                            listSingletonList = AbstractC41023g0.m133257t(f93335g0, r10.m68188a(str8));
                                            str9 = "text/x-ssa";
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11112 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51111110 = (z11112 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map117 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i51111111 = r10.f93281A;
                                                    int i6111111112 = r10.f93283C;
                                                    int i6111111113 = r10.f93282B;
                                                    int i6111111114 = r10.f93323p;
                                                    c34592g = new C34592g(i51111111, i6111111112, i6111111113, i6111111114, i6111111114, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i51111110;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p117 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o117 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o117;
                                            interfaceC33639k0Mo3101o117.mo36173a(c34610p117);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 26:
                                            C33656y c33656yM106297a = C33656y.m106297a(new C38059n(r10.m68188a(r10.f93310c)), false, null);
                                            listSingletonList = c33656yM106297a.f140460a;
                                            r10.f93308a0 = c33656yM106297a.f140461b;
                                            str4 = c33656yM106297a.f140471l;
                                            str9 = "video/hevc";
                                            str2 = str4;
                                            i15 = -1;
                                            i16 = -1;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11113 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51111112 = (z11113 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map118 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i51111113 = r10.f93281A;
                                                    int i6111111115 = r10.f93283C;
                                                    int i6111111116 = r10.f93282B;
                                                    int i6111111117 = r10.f93323p;
                                                    c34592g = new C34592g(i51111113, i6111111115, i6111111116, i6111111117, i6111111117, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i51111112;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p118 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o118 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o118;
                                            interfaceC33639k0Mo3101o118.mo36173a(c34610p118);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 27:
                                            c23550d5 = c23550d5;
                                            str9 = "text/vtt";
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            listSingletonList = null;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11114 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51111114 = (z11114 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map119 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i51111115 = r10.f93281A;
                                                    int i6111111118 = r10.f93283C;
                                                    int i6111111119 = r10.f93282B;
                                                    int i61111111110 = r10.f93323p;
                                                    c34592g = new C34592g(i51111115, i6111111118, i6111111119, i61111111110, i61111111110, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i51111114;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p119 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o119 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o119;
                                            interfaceC33639k0Mo3101o119.mo36173a(c34610p119);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 28:
                                            c23550d5 = c23550d5;
                                            str9 = "application/x-subrip";
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            listSingletonList = null;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11115 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51111116 = (z11115 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map1110 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i51111117 = r10.f93281A;
                                                    int i61111111111 = r10.f93283C;
                                                    int i61111111112 = r10.f93282B;
                                                    int i61111111113 = r10.f93323p;
                                                    c34592g = new C34592g(i51111117, i61111111111, i61111111112, i61111111113, i61111111113, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i51111116;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p1110 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o1110 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o1110;
                                            interfaceC33639k0Mo3101o1110.mo36173a(c34610p1110);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 29:
                                            str9 = "video/mpeg2";
                                            c23550d5 = c23550d5;
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            listSingletonList = null;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11116 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i51111118 = (z11116 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map1111 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i51111119 = r10.f93281A;
                                                    int i61111111114 = r10.f93283C;
                                                    int i61111111115 = r10.f93282B;
                                                    int i61111111116 = r10.f93323p;
                                                    c34592g = new C34592g(i51111119, i61111111114, i61111111115, i61111111116, i61111111116, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i51111118;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p1111 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o1111 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o1111;
                                            interfaceC33639k0Mo3101o1111.mo36173a(c34610p1111);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 30:
                                            str9 = "audio/eac3";
                                            c23550d5 = c23550d5;
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            listSingletonList = null;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11117 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i511111110 = (z11117 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map1112 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i511111111 = r10.f93281A;
                                                    int i61111111117 = r10.f93283C;
                                                    int i61111111118 = r10.f93282B;
                                                    int i61111111119 = r10.f93323p;
                                                    c34592g = new C34592g(i511111111, i61111111117, i61111111118, i61111111119, i61111111119, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i511111110;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p1112 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o1112 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o1112;
                                            interfaceC33639k0Mo3101o1112.mo36173a(c34610p1112);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 31:
                                            listM133256r = Collections.singletonList(r10.m68188a(str8));
                                            str9 = "audio/flac";
                                            listSingletonList = listM133256r;
                                            i15 = -1;
                                            str2 = null;
                                            i16 = -1;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11118 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i511111112 = (z11118 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map1113 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i511111113 = r10.f93281A;
                                                    int i611111111110 = r10.f93283C;
                                                    int i611111111111 = r10.f93282B;
                                                    int i611111111112 = r10.f93323p;
                                                    c34592g = new C34592g(i511111113, i611111111110, i611111111111, i611111111112, i611111111112, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i511111112;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p1113 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o1113 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o1113;
                                            interfaceC33639k0Mo3101o1113.mo36173a(c34610p1113);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        case 32:
                                            ArrayList arrayList2 = new ArrayList(3);
                                            arrayList2.add(r10.m68188a(r10.f93310c));
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList2.add(byteBufferAllocate.order(byteOrder).putLong(r10.f93300T).array());
                                            arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r10.f93301U).array());
                                            str9 = "audio/opus";
                                            c23550d5 = c23550d5;
                                            i16 = 5760;
                                            str2 = null;
                                            listSingletonList = arrayList2;
                                            i15 = -1;
                                            if (r10.f93296P != null) {
                                                str2 = c11856j0M31816l.f38685x;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11119 = r10.f93304X;
                                            if (r10.f93303W) {
                                                i17 = 2;
                                            } else {
                                                i17 = 0;
                                            }
                                            int i511111114 = (z11119 ? 1 : 0) | i17;
                                            c34608o = new C34608o();
                                            zM109378k = AbstractC34587d0.m109378k(str9);
                                            Map map1114 = f93339k0;
                                            if (zM109378k) {
                                                c34608o.f145719C = r10.f93297Q;
                                                c34608o.f145720D = r10.f93299S;
                                                c34608o.f145721E = i15;
                                                i18 = 1;
                                            } else if (AbstractC34587d0.m109381n(str9)) {
                                                if (r10.f93326s == 0) {
                                                    i27 = r10.f93324q;
                                                    i19 = -1;
                                                    if (i27 == -1) {
                                                        i27 = r10.f93321n;
                                                    }
                                                    r10.f93324q = i27;
                                                    i28 = r10.f93325r;
                                                    if (i28 == -1) {
                                                        i28 = r10.f93322o;
                                                    }
                                                    r10.f93325r = i28;
                                                } else {
                                                    i19 = -1;
                                                }
                                                i24 = r10.f93324q;
                                                if (i24 != i19) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (r10.f93333z) {
                                                    if (r10.f93286F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i511111115 = r10.f93281A;
                                                    int i611111111113 = r10.f93283C;
                                                    int i611111111114 = r10.f93282B;
                                                    int i611111111115 = r10.f93323p;
                                                    c34592g = new C34592g(i511111115, i611111111113, i611111111114, i611111111115, i611111111115, bArr);
                                                } else {
                                                    c34592g = null;
                                                }
                                                str5 = r10.f93309b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f93327t == 0) {
                                                    i25 = iIntValue;
                                                } else {
                                                    i25 = iIntValue;
                                                }
                                                c34608o.f145748t = r10.f93321n;
                                                c34608o.f145749u = r10.f93322o;
                                                c34608o.f145752x = f13;
                                                c34608o.f145751w = i25;
                                                c34608o.f145753y = r10.f93331x;
                                                c34608o.f145754z = r10.f93332y;
                                                c34608o.f145717A = c34592g;
                                                i18 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str9)) {
                                                }
                                                i18 = 3;
                                            }
                                            str6 = r10.f93309b;
                                            if (str6 != null) {
                                                c34608o.f145730b = r10.f93309b;
                                            }
                                            c34608o.f145729a = Integer.toString(i57);
                                            if (r10.f93307a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c34608o.f145740l = AbstractC34587d0.m109382o(str7);
                                            c34608o.f145741m = AbstractC34587d0.m109382o(str9);
                                            c34608o.f145742n = i16;
                                            c34608o.f145732d = r10.f93305Y;
                                            c34608o.f145733e = i511111114;
                                            c34608o.f145744p = listSingletonList;
                                            c34608o.f145738j = str2;
                                            c34608o.f145745q = r10.f93320m;
                                            C34610p c34610p1114 = new C34610p(c34608o);
                                            InterfaceC33639k0 interfaceC33639k0Mo3101o1114 = interfaceC33648q.mo3101o(r10.f93311d, i18);
                                            r10.f93306Z = interfaceC33639k0Mo3101o1114;
                                            interfaceC33639k0Mo3101o1114.mo36173a(c34610p1114);
                                            sparseArray.put(r10.f93311d, r10);
                                            c23550d5 = c23550d5;
                                            break;
                                        default:
                                            throw ParserException.m5049a(null, "Unrecognized codec identifier.");
                                    }
                                default:
                                    c23550d5.f93394x = null;
                                    break;
                            }
                        } else {
                            if (i46 == 19899) {
                                int i95 = c23550d5.f93396z;
                                if (i95 != i34) {
                                    long j19 = c23550d5.f93340A;
                                    if (j19 != -1) {
                                        if (i95 == 475249515) {
                                            c23550d5.f93342C = j19;
                                        }
                                    }
                                }
                                throw ParserException.m5049a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i46 == 25152) {
                                c23550d5.m68191c(i46);
                                C23549c c23549c3 = c23550d5.f93394x;
                                if (c23549c3.f93316i) {
                                    C33637j0 c33637j0 = c23549c3.f93318k;
                                    if (c33637j0 == null) {
                                        throw ParserException.m5049a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    c23549c3.f93320m = new C34602l(null, true, new C34600k(AbstractC34590f.f145651a, null, "video/webm", c33637j0.f140399b));
                                }
                            } else if (i46 == 28032) {
                                c23550d5.m68191c(i46);
                                C23549c c23549c4 = c23550d5.f93394x;
                                if (c23549c4.f93316i && c23549c4.f93317j != null) {
                                    throw ParserException.m5049a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i46 == 357149030) {
                                if (c23550d5.f93390t == -9223372036854775807L) {
                                    c23550d5.f93390t = 1000000L;
                                }
                                long j24 = c23550d5.f93391u;
                                if (j24 != -9223372036854775807L) {
                                    c23550d5.f93392v = c23550d5.m68195l(j24);
                                }
                            } else if (i46 == 374648427) {
                                if (sparseArray.size() == 0) {
                                    throw ParserException.m5049a(null, "No valid tracks were found");
                                }
                                c23550d5.f93375e0.mo3098l();
                            } else if (i46 == 475249515) {
                                if (!c23550d5.f93395y) {
                                    InterfaceC33648q interfaceC33648q2 = c23550d5.f93375e0;
                                    C24553k c24553k = c23550d5.f93345F;
                                    C24553k c24553k2 = c23550d5.f93346G;
                                    if (c23550d5.f93389s == -1 || c23550d5.f93392v == -9223372036854775807L || c24553k == null || (i29 = c24553k.f95825b) == 0 || c24553k2 == null || c24553k2.f95825b != i29) {
                                        c33651t = new C33651t(c23550d5.f93392v);
                                    } else {
                                        int[] iArrCopyOf = new int[i29];
                                        long[] jArrCopyOf2 = new long[i29];
                                        long[] jArrCopyOf3 = new long[i29];
                                        long[] jArr = new long[i29];
                                        int i96 = 0;
                                        while (i96 < i29) {
                                            jArr[i96] = c24553k.m71601e(i96);
                                            jArrCopyOf2[i96] = c24553k2.m71601e(i96) + c23550d5.f93389s;
                                            i96++;
                                            jArr = jArr;
                                        }
                                        long[] jArr2 = jArr;
                                        int i97 = 0;
                                        while (true) {
                                            int i98 = i29 - 1;
                                            if (i97 < i98) {
                                                int i99 = i97 + 1;
                                                iArrCopyOf[i97] = (int) (jArrCopyOf2[i99] - jArrCopyOf2[i97]);
                                                jArrCopyOf3[i97] = jArr2[i99] - jArr2[i97];
                                                i97 = i99;
                                            } else {
                                                int i100 = i98;
                                                while (i100 > 0 && jArr2[i100] > c23550d5.f93392v) {
                                                    i100--;
                                                }
                                                iArrCopyOf[i100] = (int) ((c23550d5.f93389s + c23550d5.f93388r) - jArrCopyOf2[i100]);
                                                jArrCopyOf3[i100] = c23550d5.f93392v - jArr2[i100];
                                                if (i100 < i98) {
                                                    AbstractC38046a.m121826u("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
                                                    int i101 = i100 + 1;
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i101);
                                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i101);
                                                    jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i101);
                                                    jArrCopyOf = Arrays.copyOf(jArr2, i101);
                                                } else {
                                                    jArrCopyOf = jArr2;
                                                }
                                                c33651t = new C33634i(iArrCopyOf, jArrCopyOf2, jArrCopyOf3, jArrCopyOf);
                                            }
                                        }
                                    }
                                    interfaceC33648q2.mo3109v(c33651t);
                                    c23550d5.f93395y = true;
                                }
                                c23550d5.f93345F = null;
                                c23550d5.f93346G = null;
                            }
                        }
                        z14 = false;
                        interfaceC33646o2 = interfaceC33646o;
                        z13 = z14;
                    }
                    z15 = true;
                }
                if (z15) {
                    long position2 = interfaceC33646o2.getPosition();
                    c23550d = this;
                    if (c23550d.f93341B) {
                        c23550d.f93343D = position2;
                        c33650s.f140436a = c23550d.f93342C;
                        c23550d.f93341B = z13;
                        return 1;
                    }
                    if (c23550d.f93395y) {
                        long j25 = c23550d.f93343D;
                        if (j25 != -1) {
                            c33650s.f140436a = j25;
                            c23550d.f93343D = -1L;
                            return 1;
                        }
                    } else {
                        continue;
                    }
                } else {
                    c23550d = this;
                }
            }
        }
        if (z15) {
            return 0;
        }
        int i102 = 0;
        while (true) {
            SparseArray sparseArray2 = c23550d.f93370c;
            if (i102 >= sparseArray2.size()) {
                return -1;
            }
            C23549c c23549c5 = (C23549c) sparseArray2.valueAt(i102);
            c23549c5.f93306Z.getClass();
            C33641l0 c33641l0 = c23549c5.f93302V;
            if (c33641l0 != null) {
                c33641l0.m106259a(c23549c5.f93306Z, c23549c5.f93318k);
            }
            i102++;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m68194k() {
        this.f93361V = 0;
        this.f93362W = 0;
        this.f93363X = 0;
        this.f93364Y = false;
        this.f93365Z = false;
        this.f93367a0 = false;
        this.f93369b0 = 0;
        this.f93371c0 = (byte) 0;
        this.f93373d0 = false;
        this.f93382l.m121843C(0);
    }

    /* JADX INFO: renamed from: l */
    public final long m68195l(long j7) throws ParserException {
        long j13 = this.f93390t;
        if (j13 == -9223372036854775807L) {
            throw ParserException.m5049a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i13 = AbstractC38065t.f163031a;
        return AbstractC38065t.m121903Q(j7, j13, 1000L, RoundingMode.DOWN);
    }

    /* JADX INFO: renamed from: m */
    public final int m68196m(InterfaceC33646o interfaceC33646o, C23549c c23549c, int i13, boolean z4) {
        int iMo36175c;
        int iMo36175c2;
        boolean z13;
        int i14;
        if ("S_TEXT/UTF8".equals(c23549c.f93310c)) {
            m68197n(interfaceC33646o, f93334f0, i13);
            int i15 = this.f93362W;
            m68194k();
            return i15;
        }
        if ("S_TEXT/ASS".equals(c23549c.f93310c)) {
            m68197n(interfaceC33646o, f93336h0, i13);
            int i16 = this.f93362W;
            m68194k();
            return i16;
        }
        if ("S_TEXT/WEBVTT".equals(c23549c.f93310c)) {
            m68197n(interfaceC33646o, f93337i0, i13);
            int i17 = this.f93362W;
            m68194k();
            return i17;
        }
        InterfaceC33639k0 interfaceC33639k0 = c23549c.f93306Z;
        boolean z14 = this.f93364Y;
        C38059n c38059n = this.f93382l;
        if (!z14) {
            boolean z15 = c23549c.f93316i;
            C38059n c38059n2 = this.f93379i;
            if (z15) {
                this.f93357R &= -1073741825;
                if (!this.f93365Z) {
                    interfaceC33646o.readFully(c38059n2.f163017a, 0, 1);
                    this.f93361V++;
                    byte b = c38059n2.f163017a[0];
                    if ((b & 128) == 128) {
                        throw ParserException.m5049a(null, "Extension bit is set in signal byte");
                    }
                    this.f93371c0 = b;
                    this.f93365Z = true;
                }
                byte b6 = this.f93371c0;
                if ((b6 & 1) == 1) {
                    boolean z16 = (b6 & 2) == 2;
                    this.f93357R |= 1073741824;
                    if (!this.f93373d0) {
                        C38059n c38059n3 = this.f93384n;
                        interfaceC33646o.readFully(c38059n3.f163017a, 0, 8);
                        this.f93361V += 8;
                        this.f93373d0 = true;
                        c38059n2.f163017a[0] = (byte) ((z16 ? 128 : 0) | 8);
                        c38059n2.m121846F(0);
                        interfaceC33639k0.mo36176d(c38059n2, 1, 1);
                        this.f93362W++;
                        c38059n3.m121846F(0);
                        interfaceC33639k0.mo36176d(c38059n3, 8, 1);
                        this.f93362W += 8;
                    }
                    if (z16) {
                        if (!this.f93367a0) {
                            interfaceC33646o.readFully(c38059n2.f163017a, 0, 1);
                            this.f93361V++;
                            c38059n2.m121846F(0);
                            this.f93369b0 = c38059n2.m121867t();
                            this.f93367a0 = true;
                        }
                        int i18 = this.f93369b0 * 4;
                        c38059n2.m121843C(i18);
                        interfaceC33646o.readFully(c38059n2.f163017a, 0, i18);
                        this.f93361V += i18;
                        short s13 = (short) ((this.f93369b0 / 2) + 1);
                        int i19 = (s13 * 6) + 2;
                        ByteBuffer byteBuffer = this.f93387q;
                        if (byteBuffer == null || byteBuffer.capacity() < i19) {
                            this.f93387q = ByteBuffer.allocate(i19);
                        }
                        this.f93387q.position(0);
                        this.f93387q.putShort(s13);
                        int i24 = 0;
                        int i25 = 0;
                        while (true) {
                            i14 = this.f93369b0;
                            if (i24 >= i14) {
                                break;
                            }
                            int iM121871x = c38059n2.m121871x();
                            if (i24 % 2 == 0) {
                                this.f93387q.putShort((short) (iM121871x - i25));
                            } else {
                                this.f93387q.putInt(iM121871x - i25);
                            }
                            i24++;
                            i25 = iM121871x;
                        }
                        int i26 = (i13 - this.f93361V) - i25;
                        if (i14 % 2 == 1) {
                            this.f93387q.putInt(i26);
                        } else {
                            this.f93387q.putShort((short) i26);
                            this.f93387q.putInt(0);
                        }
                        byte[] bArrArray = this.f93387q.array();
                        C38059n c38059n4 = this.f93385o;
                        c38059n4.m121844D(i19, bArrArray);
                        interfaceC33639k0.mo36176d(c38059n4, i19, 1);
                        this.f93362W += i19;
                    }
                }
            } else {
                byte[] bArr = c23549c.f93317j;
                if (bArr != null) {
                    c38059n.m121844D(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(c23549c.f93310c)) {
                z13 = z4;
            } else {
                z13 = c23549c.f93314g > 0;
            }
            if (z13) {
                this.f93357R |= 268435456;
                this.f93386p.m121843C(0);
                int i27 = (c38059n.f163019c + i13) - this.f93361V;
                c38059n2.m121843C(4);
                byte[] bArr2 = c38059n2.f163017a;
                bArr2[0] = (byte) ((i27 >> 24) & 255);
                bArr2[1] = (byte) ((i27 >> 16) & 255);
                bArr2[2] = (byte) ((i27 >> 8) & 255);
                bArr2[3] = (byte) (i27 & 255);
                interfaceC33639k0.mo36176d(c38059n2, 4, 2);
                this.f93362W += 4;
            }
            this.f93364Y = true;
        }
        int i28 = i13 + c38059n.f163019c;
        if (!"V_MPEG4/ISO/AVC".equals(c23549c.f93310c) && !"V_MPEGH/ISO/HEVC".equals(c23549c.f93310c)) {
            if (c23549c.f93302V != null) {
                AbstractC35849g.m113807i(c38059n.f163019c == 0);
                c23549c.f93302V.m106263e(interfaceC33646o);
            }
            while (true) {
                int i29 = this.f93361V;
                if (i29 >= i28) {
                    break;
                }
                int i34 = i28 - i29;
                int iM121848a = c38059n.m121848a();
                if (iM121848a > 0) {
                    iMo36175c2 = Math.min(i34, iM121848a);
                    interfaceC33639k0.mo36176d(c38059n, iMo36175c2, 0);
                } else {
                    iMo36175c2 = interfaceC33639k0.mo36175c(interfaceC33646o, i34, false);
                }
                this.f93361V += iMo36175c2;
                this.f93362W += iMo36175c2;
            }
        } else {
            C38059n c38059n5 = this.f93378h;
            byte[] bArr3 = c38059n5.f163017a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i35 = c23549c.f93308a0;
            int i36 = 4 - i35;
            while (this.f93361V < i28) {
                int i37 = this.f93363X;
                if (i37 == 0) {
                    int iMin = Math.min(i35, c38059n.m121848a());
                    interfaceC33646o.readFully(bArr3, i36 + iMin, i35 - iMin);
                    if (iMin > 0) {
                        c38059n.m121852e(bArr3, i36, iMin);
                    }
                    this.f93361V += i35;
                    c38059n5.m121846F(0);
                    this.f93363X = c38059n5.m121871x();
                    C38059n c38059n6 = this.f93377g;
                    c38059n6.m121846F(0);
                    interfaceC33639k0.mo36176d(c38059n6, 4, 0);
                    this.f93362W += 4;
                } else {
                    int iM121848a2 = c38059n.m121848a();
                    if (iM121848a2 > 0) {
                        iMo36175c = Math.min(i37, iM121848a2);
                        interfaceC33639k0.mo36176d(c38059n, iMo36175c, 0);
                    } else {
                        iMo36175c = interfaceC33639k0.mo36175c(interfaceC33646o, i37, false);
                    }
                    this.f93361V += iMo36175c;
                    this.f93362W += iMo36175c;
                    this.f93363X -= iMo36175c;
                }
            }
        }
        if ("A_VORBIS".equals(c23549c.f93310c)) {
            C38059n c38059n7 = this.f93380j;
            c38059n7.m121846F(0);
            interfaceC33639k0.mo36176d(c38059n7, 4, 0);
            this.f93362W += 4;
        }
        int i38 = this.f93362W;
        m68194k();
        return i38;
    }

    /* JADX INFO: renamed from: n */
    public final void m68197n(InterfaceC33646o interfaceC33646o, byte[] bArr, int i13) {
        int length = bArr.length + i13;
        C38059n c38059n = this.f93383m;
        byte[] bArr2 = c38059n.f163017a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i13);
            c38059n.getClass();
            c38059n.m121844D(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        interfaceC33646o.readFully(c38059n.f163017a, bArr.length, i13);
        c38059n.m121846F(0);
        c38059n.m121845E(length);
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
    }
}
