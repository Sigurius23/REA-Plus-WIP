package bn;

import ai.C0904j;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.health.platform.client.proto.C1533u;
import com.google.android.exoplayer2.ParserException;
import com.iterable.iterableapi.C5363q;
import ed3.C13117a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.ChatClient;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import mo.C25720a;
import mo.C25721b;
import mo.C25726g;
import org.joda.time.DateTimeConstants;
import p087db.C11856j0;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p309lo.C24553k;
import p309lo.C24561s;
import p465rm.AbstractC31532g;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p499t9.C33641l0;
import p499t9.C33650s;
import p556vm.C36135b;
import p556vm.C36136c;
import p588wm.C37363e;
import p588wm.C37364f;
import p588wm.C37370l;
import p588wm.C37376r;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37374p;
import p588wm.InterfaceC37377s;
import p658yr.AbstractC39717d;
import p690zr.AbstractC41023g0;
import ro.C31624i;
import tm.AbstractC33922a;

/* JADX INFO: renamed from: bn.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C3491d implements InterfaceC37367i {

    /* JADX INFO: renamed from: b0 */
    public static final byte[] f13786b0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: c0 */
    public static final byte[] f13787c0;

    /* JADX INFO: renamed from: d0 */
    public static final byte[] f13788d0;

    /* JADX INFO: renamed from: e0 */
    public static final byte[] f13789e0;

    /* JADX INFO: renamed from: f0 */
    public static final UUID f13790f0;

    /* JADX INFO: renamed from: g0 */
    public static final Map f13791g0;

    /* JADX INFO: renamed from: A */
    public long f13792A;

    /* JADX INFO: renamed from: B */
    public long f13793B;

    /* JADX INFO: renamed from: C */
    public C24553k f13794C;

    /* JADX INFO: renamed from: D */
    public C24553k f13795D;

    /* JADX INFO: renamed from: E */
    public boolean f13796E;

    /* JADX INFO: renamed from: F */
    public boolean f13797F;

    /* JADX INFO: renamed from: G */
    public int f13798G;

    /* JADX INFO: renamed from: H */
    public long f13799H;

    /* JADX INFO: renamed from: I */
    public long f13800I;

    /* JADX INFO: renamed from: J */
    public int f13801J;

    /* JADX INFO: renamed from: K */
    public int f13802K;

    /* JADX INFO: renamed from: L */
    public int[] f13803L;

    /* JADX INFO: renamed from: M */
    public int f13804M;

    /* JADX INFO: renamed from: N */
    public int f13805N;

    /* JADX INFO: renamed from: O */
    public int f13806O;

    /* JADX INFO: renamed from: P */
    public int f13807P;

    /* JADX INFO: renamed from: Q */
    public boolean f13808Q;

    /* JADX INFO: renamed from: R */
    public int f13809R;

    /* JADX INFO: renamed from: S */
    public int f13810S;

    /* JADX INFO: renamed from: T */
    public int f13811T;

    /* JADX INFO: renamed from: U */
    public boolean f13812U;

    /* JADX INFO: renamed from: V */
    public boolean f13813V;

    /* JADX INFO: renamed from: W */
    public boolean f13814W;

    /* JADX INFO: renamed from: X */
    public int f13815X;

    /* JADX INFO: renamed from: Y */
    public byte f13816Y;

    /* JADX INFO: renamed from: Z */
    public boolean f13817Z;

    /* JADX INFO: renamed from: a */
    public final C3489b f13818a;

    /* JADX INFO: renamed from: a0 */
    public InterfaceC37369k f13819a0;

    /* JADX INFO: renamed from: b */
    public final C3492e f13820b;

    /* JADX INFO: renamed from: c */
    public final SparseArray f13821c;

    /* JADX INFO: renamed from: d */
    public final boolean f13822d;

    /* JADX INFO: renamed from: e */
    public final C13117a f13823e;

    /* JADX INFO: renamed from: f */
    public final C13117a f13824f;

    /* JADX INFO: renamed from: g */
    public final C13117a f13825g;

    /* JADX INFO: renamed from: h */
    public final C13117a f13826h;

    /* JADX INFO: renamed from: i */
    public final C13117a f13827i;

    /* JADX INFO: renamed from: j */
    public final C13117a f13828j;

    /* JADX INFO: renamed from: k */
    public final C13117a f13829k;

    /* JADX INFO: renamed from: l */
    public final C13117a f13830l;

    /* JADX INFO: renamed from: m */
    public final C13117a f13831m;

    /* JADX INFO: renamed from: n */
    public final C13117a f13832n;

    /* JADX INFO: renamed from: o */
    public ByteBuffer f13833o;

    /* JADX INFO: renamed from: p */
    public long f13834p;

    /* JADX INFO: renamed from: q */
    public long f13835q;

    /* JADX INFO: renamed from: r */
    public long f13836r;

    /* JADX INFO: renamed from: s */
    public long f13837s;

    /* JADX INFO: renamed from: t */
    public long f13838t;

    /* JADX INFO: renamed from: u */
    public C3490c f13839u;

    /* JADX INFO: renamed from: v */
    public boolean f13840v;

    /* JADX INFO: renamed from: w */
    public int f13841w;

    /* JADX INFO: renamed from: x */
    public long f13842x;

    /* JADX INFO: renamed from: y */
    public boolean f13843y;

    /* JADX INFO: renamed from: z */
    public long f13844z;

    static {
        int i13 = AbstractC24567y.f95875a;
        f13787c0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(AbstractC39717d.f170958c);
        f13788d0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f13789e0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f13790f0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        AbstractC18489d0.m53383x(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC18489d0.m53383x(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f13791g0 = Collections.unmodifiableMap(map);
    }

    public C3491d() {
        C3489b c3489b = new C3489b(0);
        this.f13835q = -1L;
        this.f13836r = -9223372036854775807L;
        this.f13837s = -9223372036854775807L;
        this.f13838t = -9223372036854775807L;
        this.f13844z = -1L;
        this.f13792A = -1L;
        this.f13793B = -9223372036854775807L;
        this.f13818a = c3489b;
        c3489b.f13734g = new C31624i(this, 10);
        this.f13822d = true;
        this.f13820b = new C3492e();
        this.f13821c = new SparseArray();
        this.f13825g = new C13117a(4);
        this.f13826h = new C13117a(ByteBuffer.allocate(4).putInt(-1).array(), 1, (byte) 0);
        this.f13827i = new C13117a(4);
        this.f13823e = new C13117a(AbstractC24543a.f95799c, 1, (byte) 0);
        this.f13824f = new C13117a(4);
        this.f13828j = new C13117a();
        this.f13829k = new C13117a();
        this.f13830l = new C13117a(8);
        this.f13831m = new C13117a();
        this.f13832n = new C13117a();
        this.f13803L = new int[1];
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m10287e(long j7, long j13, String str) {
        AbstractC24543a.m71569e(j7 != -9223372036854775807L);
        int i13 = (int) (j7 / 3600000000L);
        long j14 = j7 - (((long) (i13 * DateTimeConstants.SECONDS_PER_HOUR)) * 1000000);
        int i14 = (int) (j14 / 60000000);
        long j15 = j14 - (((long) (i14 * 60)) * 1000000);
        int i15 = (int) (j15 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf((int) ((j15 - (((long) i15) * 1000000)) / j13)));
        int i16 = AbstractC24567y.f95875a;
        return str2.getBytes(AbstractC39717d.f170958c);
    }

    /* JADX INFO: renamed from: a */
    public final void m10288a(int i13) {
        if (this.f13794C == null || this.f13795D == null) {
            StringBuilder sb4 = new StringBuilder(37);
            sb4.append("Element ");
            sb4.append(i13);
            sb4.append(" must be in a Cues");
            throw ParserException.m15562a(null, sb4.toString());
        }
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: b */
    public final void mo3071b(long j7, long j13) {
        this.f13793B = -9223372036854775807L;
        this.f13798G = 0;
        C3489b c3489b = this.f13818a;
        c3489b.f13730c = 0;
        c3489b.f13729b.clear();
        C3492e c3492e = (C3492e) c3489b.f13733f;
        c3492e.f13847b = 0;
        c3492e.f13848c = 0;
        C3492e c3492e2 = this.f13820b;
        c3492e2.f13847b = 0;
        c3492e2.f13848c = 0;
        m10292j();
        int i13 = 0;
        while (true) {
            SparseArray sparseArray = this.f13821c;
            if (i13 >= sparseArray.size()) {
                return;
            }
            C33641l0 c33641l0 = ((C3490c) sparseArray.valueAt(i13)).f13754T;
            if (c33641l0 != null) {
                c33641l0.f140418b = false;
                c33641l0.f140419c = 0;
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10289c(int i13) {
        if (this.f13839u != null) {
            return;
        }
        StringBuilder sb4 = new StringBuilder(43);
        sb4.append("Element ");
        sb4.append(i13);
        sb4.append(" must be in a TrackEntry");
        throw ParserException.m15562a(null, sb4.toString());
    }

    /* JADX INFO: renamed from: d */
    public final void m10290d(C3490c c3490c, long j7, int i13, int i14, int i15) {
        byte[] bArrM10287e;
        int i16;
        int i17;
        int i18;
        int i19;
        C33641l0 c33641l0 = c3490c.f13754T;
        if (c33641l0 != null) {
            c33641l0.m106262d(c3490c.f13758X, j7, i13, i14, i15, c3490c.f13769j);
        } else {
            if ("S_TEXT/UTF8".equals(c3490c.f13761b) || "S_TEXT/ASS".equals(c3490c.f13761b) || "S_TEXT/WEBVTT".equals(c3490c.f13761b)) {
                if (this.f13802K > 1) {
                    Log.w("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j13 = this.f13800I;
                    if (j13 == -9223372036854775807L) {
                        Log.w("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = c3490c.f13761b;
                        C13117a c13117a = this.f13829k;
                        byte[] bArr = c13117a.f45381a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                bArrM10287e = m10287e(j13, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, "%01d:%02d:%02d:%02d");
                                i16 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrM10287e = m10287e(j13, 1000L, "%02d:%02d:%02d.%03d");
                                i16 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrM10287e = m10287e(j13, 1000L, "%02d:%02d:%02d,%03d");
                                i16 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrM10287e, 0, bArr, i16, bArrM10287e.length);
                        for (int i24 = c13117a.f45382b; i24 < c13117a.f45383c; i24++) {
                            if (c13117a.f45381a[i24] == 0) {
                                c13117a.m36688J(i24);
                                c3490c.f13758X.mo102732c(c13117a.f45383c, c13117a);
                                i17 = i14 + c13117a.f45383c;
                            }
                        }
                        c3490c.f13758X.mo102732c(c13117a.f45383c, c13117a);
                        i17 = i14 + c13117a.f45383c;
                    }
                }
                i17 = i14;
            } else {
                i17 = i14;
            }
            if ((i13 & 268435456) == 0) {
                i18 = i13;
                i19 = i17;
            } else if (this.f13802K > 1) {
                i19 = i17;
                i18 = i13 & (-268435457);
            } else {
                C13117a c13117a2 = this.f13832n;
                int i25 = c13117a2.f45383c;
                c3490c.f13758X.mo102732c(i25, c13117a2);
                i17 += i25;
                i18 = i13;
                i19 = i17;
            }
            c3490c.f13758X.mo102733d(j7, i18, i19, i15, c3490c.f13769j);
        }
        this.f13797F = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m10291f(InterfaceC37368j interfaceC37368j, int i13) {
        C13117a c13117a = this.f13825g;
        if (c13117a.f45383c >= i13) {
            return;
        }
        byte[] bArr = c13117a.f45381a;
        if (bArr.length < i13) {
            c13117a.m36693b(Math.max(bArr.length * 2, i13));
        }
        byte[] bArr2 = c13117a.f45381a;
        int i14 = c13117a.f45383c;
        interfaceC37368j.readFully(bArr2, i14, i13 - i14);
        c13117a.m36688J(i13);
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: g */
    public final boolean mo3073g(InterfaceC37368j interfaceC37368j) throws EOFException, InterruptedIOException {
        C0904j c0904j = new C0904j(1, false);
        C13117a c13117a = (C13117a) c0904j.f3302x;
        C37364f c37364f = (C37364f) interfaceC37368j;
        long j7 = c37364f.f159851y;
        long j13 = 1024;
        if (j7 != -1 && j7 <= 1024) {
            j13 = j7;
        }
        int i13 = (int) j13;
        c37364f.mo3092c(c13117a.f45381a, 0, 4, false);
        c0904j.f3301w = 4;
        for (long jM36716z = c13117a.m36716z(); jM36716z != 440786851; jM36716z = ((jM36716z << 8) & (-256)) | ((long) (c13117a.f45381a[0] & 255))) {
            int i14 = c0904j.f3301w + 1;
            c0904j.f3301w = i14;
            if (i14 == i13) {
                return false;
            }
            c37364f.mo3092c(c13117a.f45381a, 0, 1, false);
        }
        long jM2227n = c0904j.m2227n(c37364f);
        long j14 = c0904j.f3301w;
        if (jM2227n != Long.MIN_VALUE && (j7 == -1 || j14 + jM2227n < j7)) {
            while (true) {
                long j15 = c0904j.f3301w;
                long j16 = j14 + jM2227n;
                if (j15 < j16) {
                    if (c0904j.m2227n(c37364f) == Long.MIN_VALUE) {
                        break;
                    }
                    long jM2227n2 = c0904j.m2227n(c37364f);
                    if (jM2227n2 < 0 || jM2227n2 > 2147483647L) {
                        break;
                    }
                    if (jM2227n2 != 0) {
                        int i15 = (int) jM2227n2;
                        c37364f.m119648a(i15, false);
                        c0904j.f3301w += i15;
                    }
                } else if (j15 == j16) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: h */
    public final void mo3074h(InterfaceC37369k interfaceC37369k) {
        this.f13819a0 = interfaceC37369k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:229:0x039b  */
    /* JADX WARN: Code duplicated, block: B:513:0x091b  */
    /* JADX WARN: Code duplicated, block: B:516:0x092f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:520:0x093b  */
    /* JADX WARN: Code duplicated, block: B:521:0x093d  */
    /* JADX WARN: Code duplicated, block: B:524:0x094e  */
    /* JADX WARN: Code duplicated, block: B:525:0x095b  */
    /* JADX WARN: Code duplicated, block: B:527:0x0961  */
    /* JADX WARN: Code duplicated, block: B:529:0x0965  */
    /* JADX WARN: Code duplicated, block: B:531:0x096a  */
    /* JADX WARN: Code duplicated, block: B:534:0x0972  */
    /* JADX WARN: Code duplicated, block: B:536:0x0977  */
    /* JADX WARN: Code duplicated, block: B:539:0x097c  */
    /* JADX WARN: Code duplicated, block: B:542:0x098a  */
    /* JADX WARN: Code duplicated, block: B:545:0x0990  */
    /* JADX WARN: Code duplicated, block: B:547:0x0996  */
    /* JADX WARN: Code duplicated, block: B:567:0x0a4a  */
    /* JADX WARN: Code duplicated, block: B:569:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:572:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:575:0x0a71  */
    /* JADX WARN: Code duplicated, block: B:578:0x0a77  */
    /* JADX WARN: Code duplicated, block: B:597:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:599:0x0ade  */
    /* JADX WARN: Code duplicated, block: B:601:0x0ae4  */
    /* JADX WARN: Code duplicated, block: B:617:0x0b10  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r6v11, types: [wm.f] */
    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: i */
    public final int mo3075i(InterfaceC37368j interfaceC37368j, C33650s c33650s) throws ParserException, EOFException, InterruptedIOException {
        InterfaceC37368j interfaceC37368j2;
        boolean z4;
        int i13;
        boolean z13;
        boolean z14;
        String str;
        long j7;
        ?? r10;
        int i14;
        int iM10296a;
        boolean z15;
        byte b;
        int i15;
        int i16;
        List list;
        int i17;
        List list2;
        Exception exc;
        Pair pair;
        String str2;
        List list3;
        String str3;
        List listM133256r;
        int i18;
        List list4;
        List listM133257t;
        List list5;
        List list6;
        byte[] bArr;
        String str4;
        String str5;
        int i19;
        C31518b0 c31518b0;
        boolean zM71614h;
        int i24;
        int i25;
        int i26;
        float f13;
        C25721b c25721b;
        String str6;
        int iIntValue;
        int i27;
        byte[] bArr2;
        int i28;
        int i29;
        int i34;
        String str7;
        C11856j0 c11856j0M31815k;
        List list7;
        InterfaceC37374p c37370l;
        int i35;
        C3491d c3491d = this;
        c3491d.f13797F = false;
        boolean z16 = true;
        while (z16 && !c3491d.f13797F) {
            C3489b c3489b = c3491d.f13818a;
            ArrayDeque arrayDeque = c3489b.f13729b;
            C3492e c3492e = (C3492e) c3489b.f13733f;
            AbstractC24543a.m71574j((C31624i) c3489b.f13734g);
            while (true) {
                C3488a c3488a = (C3488a) arrayDeque.peek();
                if (c3488a == null || ((C37364f) interfaceC37368j).f159852z < c3488a.f13727b) {
                    ?? r14 = 0;
                    if (c3489b.f13730c == 0) {
                        interfaceC37368j2 = interfaceC37368j;
                        int i36 = 4;
                        long jM10297b = c3492e.m10297b(interfaceC37368j2, true, false, 4);
                        if (jM10297b == -2) {
                            byte[] bArr3 = c3489b.f13728a;
                            ((C37364f) interfaceC37368j2).f159847F = 0;
                            while (true) {
                                r10 = (C37364f) interfaceC37368j2;
                                r10.mo3092c(bArr3, r14, i36, r14);
                                byte b6 = bArr3[r14];
                                int i37 = 0;
                                while (true) {
                                    if (i37 >= 8) {
                                        i14 = -1;
                                    } else if ((C3492e.f13845d[i37] & ((long) b6)) != 0) {
                                        i14 = i37 + 1;
                                    } else {
                                        i37++;
                                    }
                                }
                                if (i14 != -1 && i14 <= 4) {
                                    iM10296a = (int) C3492e.m10296a(i14, false, bArr3);
                                    Object obj = ((C31624i) c3489b.f13734g).f130665x;
                                    if (iM10296a == 357149030 || iM10296a == 524531317 || iM10296a == 475249515 || iM10296a == 374648427) {
                                    }
                                }
                                r10.mo3100n(1);
                                i36 = 4;
                                r14 = 0;
                            }
                            r10.mo3100n(i14);
                            j7 = iM10296a;
                        } else {
                            j7 = jM10297b;
                        }
                        z4 = true;
                        if (j7 == -1) {
                            z16 = false;
                            z13 = false;
                        } else {
                            c3489b.f13731d = (int) j7;
                            c3489b.f13730c = 1;
                        }
                    } else {
                        interfaceC37368j2 = interfaceC37368j;
                        z4 = true;
                    }
                    if (c3489b.f13730c == z4) {
                        c3489b.f13732e = c3492e.m10297b(interfaceC37368j2, false, z4, 8);
                        c3489b.f13730c = 2;
                    }
                    C31624i c31624i = (C31624i) c3489b.f13734g;
                    int i38 = c3489b.f13731d;
                    Object obj2 = c31624i.f130665x;
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
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
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
                        ((C37364f) interfaceC37368j2).mo3100n((int) c3489b.f13732e);
                        c3489b.f13730c = 0;
                    } else if (i13 != 1) {
                        if (i13 == 2) {
                            long j13 = c3489b.f13732e;
                            if (j13 > 8) {
                                StringBuilder sb4 = new StringBuilder(42);
                                sb4.append("Invalid integer size: ");
                                sb4.append(j13);
                                throw ParserException.m15562a(null, sb4.toString());
                            }
                            c31624i.m97714v(i38, c3489b.m10285b(interfaceC37368j2, (int) j13));
                            z14 = false;
                            c3489b.f13730c = 0;
                        } else if (i13 == 3) {
                            long j14 = c3489b.f13732e;
                            if (j14 > 2147483647L) {
                                StringBuilder sb5 = new StringBuilder(41);
                                sb5.append("String element size: ");
                                sb5.append(j14);
                                throw ParserException.m15562a(null, sb5.toString());
                            }
                            int i39 = (int) j14;
                            if (i39 == 0) {
                                str = "";
                            } else {
                                byte[] bArr4 = new byte[i39];
                                ((C37364f) interfaceC37368j2).mo3094f(bArr4, 0, i39, false);
                                while (i39 > 0 && bArr4[i39 - 1] == 0) {
                                    i39--;
                                }
                                str = new String(bArr4, 0, i39);
                            }
                            C3491d c3491d2 = (C3491d) c31624i.f130665x;
                            if (i38 == 134) {
                                c3491d2.m10289c(i38);
                                c3491d2.f13839u.f13761b = str;
                            } else if (i38 != 17026) {
                                if (i38 == 21358) {
                                    c3491d2.m10289c(i38);
                                    c3491d2.f13839u.f13760a = str;
                                } else if (i38 == 2274716) {
                                    c3491d2.m10289c(i38);
                                    c3491d2.f13839u.f13757W = str;
                                }
                            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                StringBuilder sb6 = new StringBuilder(str.length() + 22);
                                sb6.append("DocType ");
                                sb6.append(str);
                                sb6.append(" not supported");
                                throw ParserException.m15562a(null, sb6.toString());
                            }
                            z14 = false;
                            c3489b.f13730c = 0;
                        } else if (i13 == 4) {
                            c31624i.m97710o(i38, (int) c3489b.f13732e, interfaceC37368j2);
                            z14 = false;
                            c3489b.f13730c = 0;
                        } else {
                            if (i13 != 5) {
                                StringBuilder sb7 = new StringBuilder(32);
                                sb7.append("Invalid element type ");
                                sb7.append(i13);
                                throw ParserException.m15562a(null, sb7.toString());
                            }
                            long j15 = c3489b.f13732e;
                            if (j15 != 4 && j15 != 8) {
                                StringBuilder sb8 = new StringBuilder(40);
                                sb8.append("Invalid float size: ");
                                sb8.append(j15);
                                throw ParserException.m15562a(null, sb8.toString());
                            }
                            int i44 = (int) j15;
                            long jM10285b = c3489b.m10285b(interfaceC37368j2, i44);
                            double dIntBitsToFloat = i44 == 4 ? Float.intBitsToFloat((int) jM10285b) : Double.longBitsToDouble(jM10285b);
                            C3491d c3491d3 = (C3491d) c31624i.f130665x;
                            if (i38 == 181) {
                                c3491d3.m10289c(i38);
                                c3491d3.f13839u.f13751Q = (int) dIntBitsToFloat;
                            } else if (i38 != 17545) {
                                switch (i38) {
                                    case 21969:
                                        c3491d3.m10289c(i38);
                                        c3491d3.f13839u.f13738D = (float) dIntBitsToFloat;
                                        break;
                                    case 21970:
                                        c3491d3.m10289c(i38);
                                        c3491d3.f13839u.f13739E = (float) dIntBitsToFloat;
                                        break;
                                    case 21971:
                                        c3491d3.m10289c(i38);
                                        c3491d3.f13839u.f13740F = (float) dIntBitsToFloat;
                                        break;
                                    case 21972:
                                        c3491d3.m10289c(i38);
                                        c3491d3.f13839u.f13741G = (float) dIntBitsToFloat;
                                        break;
                                    case 21973:
                                        c3491d3.m10289c(i38);
                                        c3491d3.f13839u.f13742H = (float) dIntBitsToFloat;
                                        break;
                                    case 21974:
                                        c3491d3.m10289c(i38);
                                        c3491d3.f13839u.f13743I = (float) dIntBitsToFloat;
                                        break;
                                    case 21975:
                                        c3491d3.m10289c(i38);
                                        c3491d3.f13839u.f13744J = (float) dIntBitsToFloat;
                                        break;
                                    case 21976:
                                        c3491d3.m10289c(i38);
                                        c3491d3.f13839u.f13745K = (float) dIntBitsToFloat;
                                        break;
                                    case 21977:
                                        c3491d3.m10289c(i38);
                                        c3491d3.f13839u.f13746L = (float) dIntBitsToFloat;
                                        break;
                                    case 21978:
                                        c3491d3.m10289c(i38);
                                        c3491d3.f13839u.f13747M = (float) dIntBitsToFloat;
                                        break;
                                    default:
                                        switch (i38) {
                                            case 30323:
                                                c3491d3.m10289c(i38);
                                                c3491d3.f13839u.f13778s = (float) dIntBitsToFloat;
                                                break;
                                            case 30324:
                                                c3491d3.m10289c(i38);
                                                c3491d3.f13839u.f13779t = (float) dIntBitsToFloat;
                                                break;
                                            case 30325:
                                                c3491d3.m10289c(i38);
                                                c3491d3.f13839u.f13780u = (float) dIntBitsToFloat;
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                c3491d3.f13837s = (long) dIntBitsToFloat;
                            }
                            z14 = false;
                            c3489b.f13730c = 0;
                        }
                        z13 = z14;
                    } else {
                        long j16 = ((C37364f) interfaceC37368j2).f159852z;
                        arrayDeque.push(new C3488a(i38, c3489b.f13732e + j16));
                        C31624i c31624i2 = (C31624i) c3489b.f13734g;
                        int i45 = c3489b.f13731d;
                        long j17 = c3489b.f13732e;
                        C3491d c3491d4 = (C3491d) c31624i2.f130665x;
                        AbstractC24543a.m71574j(c3491d4.f13819a0);
                        if (i45 != 160) {
                            if (i45 == 174) {
                                C3490c c3490c = new C3490c();
                                c3490c.f13772m = -1;
                                c3490c.f13773n = -1;
                                c3490c.f13774o = -1;
                                c3490c.f13775p = -1;
                                c3490c.f13776q = 0;
                                c3490c.f13777r = -1;
                                c3490c.f13778s = 0.0f;
                                c3490c.f13779t = 0.0f;
                                c3490c.f13780u = 0.0f;
                                c3490c.f13781v = null;
                                c3490c.f13782w = -1;
                                c3490c.f13783x = false;
                                c3490c.f13784y = -1;
                                c3490c.f13785z = -1;
                                c3490c.f13735A = -1;
                                c3490c.f13736B = 1000;
                                c3490c.f13737C = 200;
                                c3490c.f13738D = -1.0f;
                                c3490c.f13739E = -1.0f;
                                c3490c.f13740F = -1.0f;
                                c3490c.f13741G = -1.0f;
                                c3490c.f13742H = -1.0f;
                                c3490c.f13743I = -1.0f;
                                c3490c.f13744J = -1.0f;
                                c3490c.f13745K = -1.0f;
                                c3490c.f13746L = -1.0f;
                                c3490c.f13747M = -1.0f;
                                c3490c.f13749O = 1;
                                c3490c.f13750P = -1;
                                c3490c.f13751Q = 8000;
                                c3490c.f13752R = 0L;
                                c3490c.f13753S = 0L;
                                c3490c.f13756V = true;
                                c3490c.f13757W = "eng";
                                c3491d4.f13839u = c3490c;
                            } else if (i45 == 187) {
                                z13 = false;
                                c3491d4.f13796E = false;
                            } else if (i45 == 19899) {
                                c3491d4.f13841w = -1;
                                c3491d4.f13842x = -1L;
                            } else if (i45 == 20533) {
                                c3491d4.m10289c(i45);
                                c3491d4.f13839u.f13767h = true;
                            } else if (i45 == 21968) {
                                c3491d4.m10289c(i45);
                                c3491d4.f13839u.f13783x = true;
                            } else if (i45 == 408125543) {
                                long j18 = c3491d4.f13835q;
                                if (j18 != -1 && j18 != j16) {
                                    throw ParserException.m15562a(null, "Multiple Segment elements not supported");
                                }
                                c3491d4.f13835q = j16;
                                c3491d4.f13834p = j17;
                            } else if (i45 == 475249515) {
                                c3491d4.f13794C = new C24553k(0, (byte) 0);
                                c3491d4.f13795D = new C24553k(0, (byte) 0);
                            } else if (i45 == 524531317 && !c3491d4.f13840v) {
                                if (!c3491d4.f13822d || c3491d4.f13844z == -1) {
                                    c3491d4.f13819a0.mo3111x(new C37370l(c3491d4.f13838t));
                                    c3491d4.f13840v = true;
                                } else {
                                    c3491d4.f13843y = true;
                                }
                            }
                            z13 = false;
                        } else {
                            z13 = false;
                            c3491d4.f13808Q = false;
                        }
                        c3489b.f13730c = z13 ? 1 : 0;
                    }
                } else {
                    C31624i c31624i3 = (C31624i) c3489b.f13734g;
                    int i46 = ((C3488a) arrayDeque.pop()).f13726a;
                    C3491d c3491d5 = (C3491d) c31624i3.f130665x;
                    SparseArray sparseArray = c3491d5.f13821c;
                    AbstractC24543a.m71574j(c3491d5.f13819a0);
                    if (i46 == 160) {
                        if (c3491d5.f13798G == 2) {
                            int i47 = 0;
                            for (int i48 = 0; i48 < c3491d5.f13802K; i48++) {
                                i47 += c3491d5.f13803L[i48];
                            }
                            C3490c c3490c2 = (C3490c) sparseArray.get(c3491d5.f13804M);
                            c3490c2.f13758X.getClass();
                            int i49 = 0;
                            while (i49 < c3491d5.f13802K) {
                                long j19 = c3491d5.f13799H + ((long) ((c3490c2.f13764e * i49) / 1000));
                                int i54 = c3491d5.f13806O;
                                if (i49 == 0 && !c3491d5.f13808Q) {
                                    i54 |= 1;
                                }
                                int i55 = c3491d5.f13803L[i49];
                                int i56 = i47 - i55;
                                c3491d5.m10290d(c3490c2, j19, i54, i55, i56);
                                i49++;
                                i47 = i56;
                            }
                            z15 = false;
                            c3491d5.f13798G = 0;
                        }
                        interfaceC37368j2 = interfaceC37368j;
                        z13 = z15;
                    } else if (i46 == 174) {
                        C3490c c3490c3 = c3491d5.f13839u;
                        AbstractC24543a.m71574j(c3490c3);
                        String str8 = c3490c3.f13761b;
                        if (str8 == null) {
                            throw ParserException.m15562a(null, "CodecId is missing in TrackEntry element");
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
                                InterfaceC37369k interfaceC37369k = c3491d5.f13819a0;
                                int i57 = c3490c3.f13762c;
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
                                ?? r15 = ". Setting mimeType to audio/x-unknown";
                                switch (b) {
                                    case 0:
                                    case 1:
                                    case 9:
                                        c3491d5 = c3491d5;
                                        i15 = 90;
                                        byte[] bArr5 = c3490c3.f13770k;
                                        str9 = "video/mp4v-es";
                                        listM133256r = bArr5 == null ? null : Collections.singletonList(bArr5);
                                        i16 = -1;
                                        list = listM133256r;
                                        i17 = -1;
                                        list2 = list;
                                        str3 = null;
                                        list6 = list2;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null || (c11856j0M31815k = C11856j0.m31815k(new C13117a(bArr, 1, (byte) 0))) == null) {
                                            str4 = str9;
                                            str5 = str3;
                                        } else {
                                            str5 = c11856j0M31815k.f38685x;
                                            str4 = "video/dolby-vision";
                                        }
                                        boolean z17 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i58 = (z17 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25 || (i28 = c3490c3.f13775p) == i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = (c3490c3.f13773n * i26) / (c3490c3.f13772m * i28);
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f || c3490c3.f13739E == -1.0f || c3490c3.f13740F == -1.0f || c3490c3.f13741G == -1.0f || c3490c3.f13742H == -1.0f || c3490c3.f13743I == -1.0f || c3490c3.f13744J == -1.0f || c3490c3.f13745K == -1.0f || c3490c3.f13746L == -1.0f || c3490c3.f13747M == -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = new byte[25];
                                                    ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                                    byteBufferOrder.put((byte) 0);
                                                    byteBufferOrder.putShort((short) ((c3490c3.f13738D * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((c3490c3.f13739E * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((c3490c3.f13740F * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((c3490c3.f13741G * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((c3490c3.f13742H * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((c3490c3.f13743I * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((c3490c3.f13744J * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((c3490c3.f13745K * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) (c3490c3.f13746L + 0.5f));
                                                    byteBufferOrder.putShort((short) (c3490c3.f13747M + 0.5f));
                                                    byteBufferOrder.putShort((short) c3490c3.f13736B);
                                                    byteBufferOrder.putShort((short) c3490c3.f13737C);
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null && map.containsKey(str6)) {
                                                iIntValue = ((Integer) map.get(c3490c3.f13760a)).intValue();
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0 || Float.compare(c3490c3.f13778s, 0.0f) != 0 || Float.compare(c3490c3.f13779t, 0.0f) != 0) {
                                                i27 = iIntValue;
                                            } else if (Float.compare(c3490c3.f13780u, 0.0f) == 0) {
                                                i27 = 0;
                                            } else if (Float.compare(c3490c3.f13779t, 90.0f) == 0) {
                                                i27 = i15;
                                            } else if (Float.compare(c3490c3.f13779t, -180.0f) == 0 || Float.compare(c3490c3.f13779t, 180.0f) == 0) {
                                                i27 = 180;
                                            } else if (Float.compare(c3490c3.f13779t, -90.0f) == 0) {
                                                i27 = 270;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4) && !"text/x-ssa".equals(str4) && !"text/vtt".equals(str4) && !"application/vobsub".equals(str4) && !"application/pgs".equals(str4) && !"application/dvbsubs".equals(str4)) {
                                                throw ParserException.m15562a(null, "Unexpected MIME type.");
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null && !map.containsKey(str7)) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i58;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c0 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o;
                                        interfaceC37377sMo3102o.mo102730a(c31521c0);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 2:
                                        c3491d5 = c3491d5;
                                        i15 = 90;
                                        C13117a c13117a = new C13117a(c3490c3.m10286a(str8), 1, (byte) 0);
                                        try {
                                            int iM36705o = c13117a.m36705o();
                                            if (iM36705o != 1) {
                                                if (iM36705o == 65534) {
                                                    c13117a.m36689K(24);
                                                    long jM36706p = c13117a.m36706p();
                                                    UUID uuid = f13790f0;
                                                    if (jM36706p != uuid.getMostSignificantBits() || c13117a.m36706p() != uuid.getLeastSignificantBits()) {
                                                    }
                                                    str9 = "audio/x-unknown";
                                                    listM133256r = null;
                                                    i16 = -1;
                                                    list = listM133256r;
                                                    i17 = -1;
                                                    list2 = list;
                                                    str3 = null;
                                                    list6 = list2;
                                                    bArr = c3490c3.f13748N;
                                                    if (bArr != null) {
                                                        break;
                                                    }
                                                    str4 = str9;
                                                    str5 = str3;
                                                    boolean z18 = c3490c3.f13756V;
                                                    if (c3490c3.f13755U) {
                                                        i19 = 2;
                                                    } else {
                                                        i19 = 0;
                                                    }
                                                    int i59 = (z18 ? 1 : 0) | i19;
                                                    c31518b0 = new C31518b0();
                                                    zM71614h = AbstractC24555m.m71614h(str4);
                                                    Map map2 = f13791g0;
                                                    if (zM71614h) {
                                                        c31518b0.f130060x = c3490c3.f13749O;
                                                        c31518b0.f130061y = c3490c3.f13751Q;
                                                        c31518b0.f130062z = i16;
                                                        i24 = 1;
                                                    } else if (AbstractC24555m.m71616j(str4)) {
                                                        if (c3490c3.f13776q == 0) {
                                                            i29 = c3490c3.f13774o;
                                                            i25 = -1;
                                                            if (i29 == -1) {
                                                                i29 = c3490c3.f13772m;
                                                            }
                                                            c3490c3.f13774o = i29;
                                                            i34 = c3490c3.f13775p;
                                                            if (i34 == -1) {
                                                                i34 = c3490c3.f13773n;
                                                            }
                                                            c3490c3.f13775p = i34;
                                                        } else {
                                                            i25 = -1;
                                                        }
                                                        i26 = c3490c3.f13774o;
                                                        if (i26 != i25) {
                                                            f13 = -1.0f;
                                                        } else {
                                                            f13 = -1.0f;
                                                        }
                                                        if (c3490c3.f13783x) {
                                                            if (c3490c3.f13738D != -1.0f) {
                                                                bArr2 = null;
                                                            } else {
                                                                bArr2 = null;
                                                            }
                                                            c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                                        } else {
                                                            c25721b = null;
                                                        }
                                                        str6 = c3490c3.f13760a;
                                                        if (str6 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c3490c3.f13777r == 0) {
                                                            i27 = iIntValue;
                                                        } else {
                                                            i27 = iIntValue;
                                                        }
                                                        c31518b0.f130052p = c3490c3.f13772m;
                                                        c31518b0.f130053q = c3490c3.f13773n;
                                                        c31518b0.f130056t = f13;
                                                        c31518b0.f130055s = i27;
                                                        c31518b0.f130057u = c3490c3.f13781v;
                                                        c31518b0.f130058v = c3490c3.f13782w;
                                                        c31518b0.f130059w = c25721b;
                                                        i24 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str4)) {
                                                        }
                                                        i24 = 3;
                                                    }
                                                    str7 = c3490c3.f13760a;
                                                    if (str7 != null) {
                                                        c31518b0.f130038b = c3490c3.f13760a;
                                                    }
                                                    c31518b0.f130037a = Integer.toString(i57);
                                                    c31518b0.f130047k = str4;
                                                    c31518b0.f130048l = i17;
                                                    c31518b0.f130039c = c3490c3.f13757W;
                                                    c31518b0.f130040d = i59;
                                                    c31518b0.f130049m = list6;
                                                    c31518b0.f130044h = str5;
                                                    c31518b0.f130050n = c3490c3.f13771l;
                                                    C31521c0 c31521c1 = new C31521c0(c31518b0);
                                                    InterfaceC37377s interfaceC37377sMo3102o2 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                                    c3490c3.f13758X = interfaceC37377sMo3102o2;
                                                    interfaceC37377sMo3102o2.mo102730a(c31521c1);
                                                    sparseArray.put(c3490c3.f13762c, c3490c3);
                                                    c3491d5 = c3491d5;
                                                }
                                                Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat("audio/x-unknown"));
                                                str9 = "audio/x-unknown";
                                                listM133256r = null;
                                                i16 = -1;
                                                list = listM133256r;
                                                i17 = -1;
                                                list2 = list;
                                                str3 = null;
                                                list6 = list2;
                                                bArr = c3490c3.f13748N;
                                                if (bArr != null) {
                                                    break;
                                                }
                                                str4 = str9;
                                                str5 = str3;
                                                boolean z19 = c3490c3.f13756V;
                                                if (c3490c3.f13755U) {
                                                    i19 = 2;
                                                } else {
                                                    i19 = 0;
                                                }
                                                int i510 = (z19 ? 1 : 0) | i19;
                                                c31518b0 = new C31518b0();
                                                zM71614h = AbstractC24555m.m71614h(str4);
                                                Map map3 = f13791g0;
                                                if (zM71614h) {
                                                    c31518b0.f130060x = c3490c3.f13749O;
                                                    c31518b0.f130061y = c3490c3.f13751Q;
                                                    c31518b0.f130062z = i16;
                                                    i24 = 1;
                                                } else if (AbstractC24555m.m71616j(str4)) {
                                                    if (c3490c3.f13776q == 0) {
                                                        i29 = c3490c3.f13774o;
                                                        i25 = -1;
                                                        if (i29 == -1) {
                                                            i29 = c3490c3.f13772m;
                                                        }
                                                        c3490c3.f13774o = i29;
                                                        i34 = c3490c3.f13775p;
                                                        if (i34 == -1) {
                                                            i34 = c3490c3.f13773n;
                                                        }
                                                        c3490c3.f13775p = i34;
                                                    } else {
                                                        i25 = -1;
                                                    }
                                                    i26 = c3490c3.f13774o;
                                                    if (i26 != i25) {
                                                        f13 = -1.0f;
                                                    } else {
                                                        f13 = -1.0f;
                                                    }
                                                    if (c3490c3.f13783x) {
                                                        if (c3490c3.f13738D != -1.0f) {
                                                            bArr2 = null;
                                                        } else {
                                                            bArr2 = null;
                                                        }
                                                        c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                                    } else {
                                                        c25721b = null;
                                                    }
                                                    str6 = c3490c3.f13760a;
                                                    if (str6 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (c3490c3.f13777r == 0) {
                                                        i27 = iIntValue;
                                                    } else {
                                                        i27 = iIntValue;
                                                    }
                                                    c31518b0.f130052p = c3490c3.f13772m;
                                                    c31518b0.f130053q = c3490c3.f13773n;
                                                    c31518b0.f130056t = f13;
                                                    c31518b0.f130055s = i27;
                                                    c31518b0.f130057u = c3490c3.f13781v;
                                                    c31518b0.f130058v = c3490c3.f13782w;
                                                    c31518b0.f130059w = c25721b;
                                                    i24 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str4)) {
                                                    }
                                                    i24 = 3;
                                                }
                                                str7 = c3490c3.f13760a;
                                                if (str7 != null) {
                                                    c31518b0.f130038b = c3490c3.f13760a;
                                                }
                                                c31518b0.f130037a = Integer.toString(i57);
                                                c31518b0.f130047k = str4;
                                                c31518b0.f130048l = i17;
                                                c31518b0.f130039c = c3490c3.f13757W;
                                                c31518b0.f130040d = i510;
                                                c31518b0.f130049m = list6;
                                                c31518b0.f130044h = str5;
                                                c31518b0.f130050n = c3490c3.f13771l;
                                                C31521c0 c31521c2 = new C31521c0(c31518b0);
                                                InterfaceC37377s interfaceC37377sMo3102o3 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                                c3490c3.f13758X = interfaceC37377sMo3102o3;
                                                interfaceC37377sMo3102o3.mo102730a(c31521c2);
                                                sparseArray.put(c3490c3.f13762c, c3490c3);
                                                c3491d5 = c3491d5;
                                                break;
                                            }
                                            int iM71686q = AbstractC24567y.m71686q(c3490c3.f13750P);
                                            if (iM71686q == 0) {
                                                int i64 = c3490c3.f13750P;
                                                StringBuilder sb9 = new StringBuilder(75);
                                                sb9.append("Unsupported PCM bit depth: ");
                                                sb9.append(i64);
                                                sb9.append(". Setting mimeType to audio/x-unknown");
                                                Log.w("MatroskaExtractor", sb9.toString());
                                                str9 = "audio/x-unknown";
                                                listM133256r = null;
                                                i16 = -1;
                                                list = listM133256r;
                                            } else {
                                                i16 = iM71686q;
                                                str9 = "audio/raw";
                                                list = null;
                                            }
                                            i17 = -1;
                                            list2 = list;
                                            str3 = null;
                                            list6 = list2;
                                            bArr = c3490c3.f13748N;
                                            if (bArr != null) {
                                                break;
                                            }
                                            str4 = str9;
                                            str5 = str3;
                                            boolean z110 = c3490c3.f13756V;
                                            if (c3490c3.f13755U) {
                                                i19 = 2;
                                            } else {
                                                i19 = 0;
                                            }
                                            int i511 = (z110 ? 1 : 0) | i19;
                                            c31518b0 = new C31518b0();
                                            zM71614h = AbstractC24555m.m71614h(str4);
                                            Map map4 = f13791g0;
                                            if (zM71614h) {
                                                c31518b0.f130060x = c3490c3.f13749O;
                                                c31518b0.f130061y = c3490c3.f13751Q;
                                                c31518b0.f130062z = i16;
                                                i24 = 1;
                                            } else if (AbstractC24555m.m71616j(str4)) {
                                                if (c3490c3.f13776q == 0) {
                                                    i29 = c3490c3.f13774o;
                                                    i25 = -1;
                                                    if (i29 == -1) {
                                                        i29 = c3490c3.f13772m;
                                                    }
                                                    c3490c3.f13774o = i29;
                                                    i34 = c3490c3.f13775p;
                                                    if (i34 == -1) {
                                                        i34 = c3490c3.f13773n;
                                                    }
                                                    c3490c3.f13775p = i34;
                                                } else {
                                                    i25 = -1;
                                                }
                                                i26 = c3490c3.f13774o;
                                                if (i26 != i25) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (c3490c3.f13783x) {
                                                    if (c3490c3.f13738D != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                                } else {
                                                    c25721b = null;
                                                }
                                                str6 = c3490c3.f13760a;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3490c3.f13777r == 0) {
                                                    i27 = iIntValue;
                                                } else {
                                                    i27 = iIntValue;
                                                }
                                                c31518b0.f130052p = c3490c3.f13772m;
                                                c31518b0.f130053q = c3490c3.f13773n;
                                                c31518b0.f130056t = f13;
                                                c31518b0.f130055s = i27;
                                                c31518b0.f130057u = c3490c3.f13781v;
                                                c31518b0.f130058v = c3490c3.f13782w;
                                                c31518b0.f130059w = c25721b;
                                                i24 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str4)) {
                                                }
                                                i24 = 3;
                                            }
                                            str7 = c3490c3.f13760a;
                                            if (str7 != null) {
                                                c31518b0.f130038b = c3490c3.f13760a;
                                            }
                                            c31518b0.f130037a = Integer.toString(i57);
                                            c31518b0.f130047k = str4;
                                            c31518b0.f130048l = i17;
                                            c31518b0.f130039c = c3490c3.f13757W;
                                            c31518b0.f130040d = i511;
                                            c31518b0.f130049m = list6;
                                            c31518b0.f130044h = str5;
                                            c31518b0.f130050n = c3490c3.f13771l;
                                            C31521c0 c31521c3 = new C31521c0(c31518b0);
                                            InterfaceC37377s interfaceC37377sMo3102o4 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                            c3490c3.f13758X = interfaceC37377sMo3102o4;
                                            interfaceC37377sMo3102o4.mo102730a(c31521c3);
                                            sparseArray.put(c3490c3.f13762c, c3490c3);
                                            c3491d5 = c3491d5;
                                        } catch (ArrayIndexOutOfBoundsException unused) {
                                            throw ParserException.m15562a(null, "Error parsing MS/ACM codec private");
                                        }
                                        break;
                                    case 3:
                                        c3491d5 = c3491d5;
                                        i15 = 90;
                                        c3490c3.f13754T = new C33641l0(1);
                                        str9 = "audio/true-hd";
                                        listM133256r = null;
                                        i16 = -1;
                                        list = listM133256r;
                                        i17 = -1;
                                        list2 = list;
                                        str3 = null;
                                        list6 = list2;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z111 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i512 = (z111 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map5 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i512;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c4 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o5 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o5;
                                        interfaceC37377sMo3102o5.mo102730a(c31521c4);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 4:
                                        c3491d5 = c3491d5;
                                        i15 = 90;
                                        byte[] bArrM10286a = c3490c3.m10286a(str8);
                                        try {
                                            try {
                                                if (bArrM10286a[0] != 2) {
                                                    throw ParserException.m15562a(null, "Error parsing vorbis codec private");
                                                }
                                                int i65 = 0;
                                                int i66 = 1;
                                                while (true) {
                                                    int i67 = bArrM10286a[i66] & 255;
                                                    if (i67 != 255) {
                                                        int i68 = i66 + 1;
                                                        int i69 = i65 + i67;
                                                        int i74 = 0;
                                                        while (true) {
                                                            int i75 = bArrM10286a[i68] & 255;
                                                            if (i75 != 255) {
                                                                int i76 = i68 + 1;
                                                                int i77 = i74 + i75;
                                                                if (bArrM10286a[i76] != 1) {
                                                                    throw ParserException.m15562a(null, "Error parsing vorbis codec private");
                                                                }
                                                                byte[] bArr6 = new byte[i69];
                                                                System.arraycopy(bArrM10286a, i76, bArr6, 0, i69);
                                                                int i78 = i76 + i69;
                                                                if (bArrM10286a[i78] != 3) {
                                                                    throw ParserException.m15562a(null, "Error parsing vorbis codec private");
                                                                }
                                                                int i79 = i78 + i77;
                                                                if (bArrM10286a[i79] != 5) {
                                                                    throw ParserException.m15562a(null, "Error parsing vorbis codec private");
                                                                }
                                                                byte[] bArr7 = new byte[bArrM10286a.length - i79];
                                                                System.arraycopy(bArrM10286a, i79, bArr7, 0, bArrM10286a.length - i79);
                                                                ArrayList arrayList = new ArrayList(2);
                                                                arrayList.add(bArr6);
                                                                arrayList.add(bArr7);
                                                                str9 = "audio/vorbis";
                                                                i17 = 8192;
                                                                i16 = -1;
                                                                list2 = arrayList;
                                                                str3 = null;
                                                                list6 = list2;
                                                                bArr = c3490c3.f13748N;
                                                                if (bArr != null) {
                                                                    break;
                                                                }
                                                                str4 = str9;
                                                                str5 = str3;
                                                                boolean z112 = c3490c3.f13756V;
                                                                if (c3490c3.f13755U) {
                                                                    i19 = 2;
                                                                } else {
                                                                    i19 = 0;
                                                                }
                                                                int i513 = (z112 ? 1 : 0) | i19;
                                                                c31518b0 = new C31518b0();
                                                                zM71614h = AbstractC24555m.m71614h(str4);
                                                                Map map6 = f13791g0;
                                                                if (zM71614h) {
                                                                    c31518b0.f130060x = c3490c3.f13749O;
                                                                    c31518b0.f130061y = c3490c3.f13751Q;
                                                                    c31518b0.f130062z = i16;
                                                                    i24 = 1;
                                                                } else if (AbstractC24555m.m71616j(str4)) {
                                                                    if (c3490c3.f13776q == 0) {
                                                                        i29 = c3490c3.f13774o;
                                                                        i25 = -1;
                                                                        if (i29 == -1) {
                                                                            i29 = c3490c3.f13772m;
                                                                        }
                                                                        c3490c3.f13774o = i29;
                                                                        i34 = c3490c3.f13775p;
                                                                        if (i34 == -1) {
                                                                            i34 = c3490c3.f13773n;
                                                                        }
                                                                        c3490c3.f13775p = i34;
                                                                    } else {
                                                                        i25 = -1;
                                                                    }
                                                                    i26 = c3490c3.f13774o;
                                                                    if (i26 != i25) {
                                                                        f13 = -1.0f;
                                                                    } else {
                                                                        f13 = -1.0f;
                                                                    }
                                                                    if (c3490c3.f13783x) {
                                                                        if (c3490c3.f13738D != -1.0f) {
                                                                            bArr2 = null;
                                                                        } else {
                                                                            bArr2 = null;
                                                                        }
                                                                        c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                                                    } else {
                                                                        c25721b = null;
                                                                    }
                                                                    str6 = c3490c3.f13760a;
                                                                    if (str6 == null) {
                                                                        iIntValue = -1;
                                                                    } else {
                                                                        iIntValue = -1;
                                                                    }
                                                                    if (c3490c3.f13777r == 0) {
                                                                        i27 = iIntValue;
                                                                    } else {
                                                                        i27 = iIntValue;
                                                                    }
                                                                    c31518b0.f130052p = c3490c3.f13772m;
                                                                    c31518b0.f130053q = c3490c3.f13773n;
                                                                    c31518b0.f130056t = f13;
                                                                    c31518b0.f130055s = i27;
                                                                    c31518b0.f130057u = c3490c3.f13781v;
                                                                    c31518b0.f130058v = c3490c3.f13782w;
                                                                    c31518b0.f130059w = c25721b;
                                                                    i24 = 2;
                                                                } else {
                                                                    if ("application/x-subrip".equals(str4)) {
                                                                    }
                                                                    i24 = 3;
                                                                }
                                                                str7 = c3490c3.f13760a;
                                                                if (str7 != null) {
                                                                    c31518b0.f130038b = c3490c3.f13760a;
                                                                }
                                                                c31518b0.f130037a = Integer.toString(i57);
                                                                c31518b0.f130047k = str4;
                                                                c31518b0.f130048l = i17;
                                                                c31518b0.f130039c = c3490c3.f13757W;
                                                                c31518b0.f130040d = i513;
                                                                c31518b0.f130049m = list6;
                                                                c31518b0.f130044h = str5;
                                                                c31518b0.f130050n = c3490c3.f13771l;
                                                                C31521c0 c31521c5 = new C31521c0(c31518b0);
                                                                InterfaceC37377s interfaceC37377sMo3102o6 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                                                c3490c3.f13758X = interfaceC37377sMo3102o6;
                                                                interfaceC37377sMo3102o6.mo102730a(c31521c5);
                                                                sparseArray.put(c3490c3.f13762c, c3490c3);
                                                                c3491d5 = c3491d5;
                                                            } else {
                                                                i74 += 255;
                                                                i68++;
                                                            }
                                                        }
                                                    } else {
                                                        i65 += 255;
                                                        i66++;
                                                    }
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                throw ParserException.m15562a(r15, "Error parsing vorbis codec private");
                                            }
                                        } catch (ArrayIndexOutOfBoundsException unused3) {
                                            r15 = 0;
                                        }
                                        break;
                                    case 5:
                                        i15 = 90;
                                        str9 = "audio/mpeg-L2";
                                        list2 = null;
                                        i16 = -1;
                                        i17 = 4096;
                                        str3 = null;
                                        list6 = list2;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z113 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i514 = (z113 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map7 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i514;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c6 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o7 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o7;
                                        interfaceC37377sMo3102o7.mo102730a(c31521c6);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 6:
                                        i15 = 90;
                                        str9 = "audio/mpeg";
                                        list2 = null;
                                        i16 = -1;
                                        i17 = 4096;
                                        str3 = null;
                                        list6 = list2;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z114 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i515 = (z114 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map8 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i515;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c7 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o8 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o8;
                                        interfaceC37377sMo3102o8.mo102730a(c31521c7);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 7:
                                        i15 = 90;
                                        C13117a c13117a2 = new C13117a(c3490c3.m10286a(str8), 1, (byte) 0);
                                        try {
                                            c13117a2.m36690L(16);
                                            long jM36703m = c13117a2.m36703m();
                                            if (jM36703m != 1482049860) {
                                                if (jM36703m != 859189832) {
                                                    if (jM36703m == 826496599) {
                                                        int i83 = c13117a2.f45382b + 20;
                                                        byte[] bArr8 = c13117a2.f45381a;
                                                        while (true) {
                                                            if (i83 >= bArr8.length - 4) {
                                                                exc = null;
                                                                throw ParserException.m15562a(null, "Failed to find FourCC VC1 initialization data");
                                                            }
                                                            if (bArr8[i83] == 0 && bArr8[i83 + 1] == 0 && bArr8[i83 + 2] == 1) {
                                                                if (bArr8[i83 + 3] == 15) {
                                                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i83, bArr8.length)));
                                                                }
                                                            }
                                                            i83++;
                                                            throw ParserException.m15562a(exc, "Error parsing FourCC private data");
                                                        }
                                                    }
                                                    Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                    str2 = null;
                                                    pair = new Pair("video/x-unknown", null);
                                                    str9 = (String) pair.first;
                                                    list3 = (List) pair.second;
                                                    str3 = str2;
                                                    i16 = -1;
                                                    i17 = -1;
                                                    list6 = list3;
                                                    bArr = c3490c3.f13748N;
                                                    if (bArr != null) {
                                                        break;
                                                    }
                                                    str4 = str9;
                                                    str5 = str3;
                                                    boolean z115 = c3490c3.f13756V;
                                                    if (c3490c3.f13755U) {
                                                        i19 = 2;
                                                    } else {
                                                        i19 = 0;
                                                    }
                                                    int i516 = (z115 ? 1 : 0) | i19;
                                                    c31518b0 = new C31518b0();
                                                    zM71614h = AbstractC24555m.m71614h(str4);
                                                    Map map9 = f13791g0;
                                                    if (zM71614h) {
                                                        c31518b0.f130060x = c3490c3.f13749O;
                                                        c31518b0.f130061y = c3490c3.f13751Q;
                                                        c31518b0.f130062z = i16;
                                                        i24 = 1;
                                                    } else if (AbstractC24555m.m71616j(str4)) {
                                                        if (c3490c3.f13776q == 0) {
                                                            i29 = c3490c3.f13774o;
                                                            i25 = -1;
                                                            if (i29 == -1) {
                                                                i29 = c3490c3.f13772m;
                                                            }
                                                            c3490c3.f13774o = i29;
                                                            i34 = c3490c3.f13775p;
                                                            if (i34 == -1) {
                                                                i34 = c3490c3.f13773n;
                                                            }
                                                            c3490c3.f13775p = i34;
                                                        } else {
                                                            i25 = -1;
                                                        }
                                                        i26 = c3490c3.f13774o;
                                                        if (i26 != i25) {
                                                            f13 = -1.0f;
                                                        } else {
                                                            f13 = -1.0f;
                                                        }
                                                        if (c3490c3.f13783x) {
                                                            if (c3490c3.f13738D != -1.0f) {
                                                                bArr2 = null;
                                                            } else {
                                                                bArr2 = null;
                                                            }
                                                            c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                                        } else {
                                                            c25721b = null;
                                                        }
                                                        str6 = c3490c3.f13760a;
                                                        if (str6 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c3490c3.f13777r == 0) {
                                                            i27 = iIntValue;
                                                        } else {
                                                            i27 = iIntValue;
                                                        }
                                                        c31518b0.f130052p = c3490c3.f13772m;
                                                        c31518b0.f130053q = c3490c3.f13773n;
                                                        c31518b0.f130056t = f13;
                                                        c31518b0.f130055s = i27;
                                                        c31518b0.f130057u = c3490c3.f13781v;
                                                        c31518b0.f130058v = c3490c3.f13782w;
                                                        c31518b0.f130059w = c25721b;
                                                        i24 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str4)) {
                                                        }
                                                        i24 = 3;
                                                    }
                                                    str7 = c3490c3.f13760a;
                                                    if (str7 != null) {
                                                        c31518b0.f130038b = c3490c3.f13760a;
                                                    }
                                                    c31518b0.f130037a = Integer.toString(i57);
                                                    c31518b0.f130047k = str4;
                                                    c31518b0.f130048l = i17;
                                                    c31518b0.f130039c = c3490c3.f13757W;
                                                    c31518b0.f130040d = i516;
                                                    c31518b0.f130049m = list6;
                                                    c31518b0.f130044h = str5;
                                                    c31518b0.f130050n = c3490c3.f13771l;
                                                    C31521c0 c31521c8 = new C31521c0(c31518b0);
                                                    InterfaceC37377s interfaceC37377sMo3102o9 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                                    c3490c3.f13758X = interfaceC37377sMo3102o9;
                                                    interfaceC37377sMo3102o9.mo102730a(c31521c8);
                                                    sparseArray.put(c3490c3.f13762c, c3490c3);
                                                    c3491d5 = c3491d5;
                                                } else {
                                                    pair = new Pair("video/3gpp", null);
                                                }
                                                break;
                                            } else {
                                                exc = null;
                                                try {
                                                    pair = new Pair("video/divx", null);
                                                } catch (ArrayIndexOutOfBoundsException unused4) {
                                                }
                                            }
                                            str2 = null;
                                            str9 = (String) pair.first;
                                            list3 = (List) pair.second;
                                            str3 = str2;
                                            i16 = -1;
                                            i17 = -1;
                                            list6 = list3;
                                            bArr = c3490c3.f13748N;
                                            if (bArr != null) {
                                                break;
                                            }
                                            str4 = str9;
                                            str5 = str3;
                                            boolean z116 = c3490c3.f13756V;
                                            if (c3490c3.f13755U) {
                                                i19 = 2;
                                            } else {
                                                i19 = 0;
                                            }
                                            int i517 = (z116 ? 1 : 0) | i19;
                                            c31518b0 = new C31518b0();
                                            zM71614h = AbstractC24555m.m71614h(str4);
                                            Map map10 = f13791g0;
                                            if (zM71614h) {
                                                c31518b0.f130060x = c3490c3.f13749O;
                                                c31518b0.f130061y = c3490c3.f13751Q;
                                                c31518b0.f130062z = i16;
                                                i24 = 1;
                                            } else if (AbstractC24555m.m71616j(str4)) {
                                                if (c3490c3.f13776q == 0) {
                                                    i29 = c3490c3.f13774o;
                                                    i25 = -1;
                                                    if (i29 == -1) {
                                                        i29 = c3490c3.f13772m;
                                                    }
                                                    c3490c3.f13774o = i29;
                                                    i34 = c3490c3.f13775p;
                                                    if (i34 == -1) {
                                                        i34 = c3490c3.f13773n;
                                                    }
                                                    c3490c3.f13775p = i34;
                                                } else {
                                                    i25 = -1;
                                                }
                                                i26 = c3490c3.f13774o;
                                                if (i26 != i25) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (c3490c3.f13783x) {
                                                    if (c3490c3.f13738D != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                                } else {
                                                    c25721b = null;
                                                }
                                                str6 = c3490c3.f13760a;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3490c3.f13777r == 0) {
                                                    i27 = iIntValue;
                                                } else {
                                                    i27 = iIntValue;
                                                }
                                                c31518b0.f130052p = c3490c3.f13772m;
                                                c31518b0.f130053q = c3490c3.f13773n;
                                                c31518b0.f130056t = f13;
                                                c31518b0.f130055s = i27;
                                                c31518b0.f130057u = c3490c3.f13781v;
                                                c31518b0.f130058v = c3490c3.f13782w;
                                                c31518b0.f130059w = c25721b;
                                                i24 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str4)) {
                                                }
                                                i24 = 3;
                                            }
                                            str7 = c3490c3.f13760a;
                                            if (str7 != null) {
                                                c31518b0.f130038b = c3490c3.f13760a;
                                            }
                                            c31518b0.f130037a = Integer.toString(i57);
                                            c31518b0.f130047k = str4;
                                            c31518b0.f130048l = i17;
                                            c31518b0.f130039c = c3490c3.f13757W;
                                            c31518b0.f130040d = i517;
                                            c31518b0.f130049m = list6;
                                            c31518b0.f130044h = str5;
                                            c31518b0.f130050n = c3490c3.f13771l;
                                            C31521c0 c31521c9 = new C31521c0(c31518b0);
                                            InterfaceC37377s interfaceC37377sMo3102o10 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                            c3490c3.f13758X = interfaceC37377sMo3102o10;
                                            interfaceC37377sMo3102o10.mo102730a(c31521c9);
                                            sparseArray.put(c3490c3.f13762c, c3490c3);
                                            c3491d5 = c3491d5;
                                        } catch (ArrayIndexOutOfBoundsException unused5) {
                                            exc = null;
                                        }
                                        break;
                                    case 8:
                                        c3491d5 = c3491d5;
                                        i15 = 90;
                                        byte[] bArr9 = new byte[4];
                                        System.arraycopy(c3490c3.m10286a(str8), 0, bArr9, 0, 4);
                                        listM133256r = AbstractC41023g0.m133256r(bArr9);
                                        str9 = "application/dvbsubs";
                                        i16 = -1;
                                        list = listM133256r;
                                        i17 = -1;
                                        list2 = list;
                                        str3 = null;
                                        list6 = list2;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z117 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i518 = (z117 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map11 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i518;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c10 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o11 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o11;
                                        interfaceC37377sMo3102o11.mo102730a(c31521c10);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 10:
                                        i15 = 90;
                                        C25720a c25720aM75837a = C25720a.m75837a(new C13117a(c3490c3.m10286a(str8), 1, (byte) 0));
                                        ArrayList arrayList2 = c25720aM75837a.f101319a;
                                        c3490c3.f13759Y = c25720aM75837a.f101320b;
                                        str9 = "video/avc";
                                        str3 = c25720aM75837a.f101324f;
                                        list3 = arrayList2;
                                        i16 = -1;
                                        i17 = -1;
                                        list6 = list3;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z118 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i519 = (z118 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map12 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i519;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c11 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o12 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o12;
                                        interfaceC37377sMo3102o12.mo102730a(c31521c11);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 11:
                                        c3491d5 = c3491d5;
                                        i15 = 90;
                                        listM133256r = AbstractC41023g0.m133256r(c3490c3.m10286a(str8));
                                        str9 = "application/vobsub";
                                        i16 = -1;
                                        list = listM133256r;
                                        i17 = -1;
                                        list2 = list;
                                        str3 = null;
                                        list6 = list2;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z119 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i5110 = (z119 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map13 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i5110;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c12 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o13 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o13;
                                        interfaceC37377sMo3102o13.mo102730a(c31521c12);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 12:
                                        c3491d5 = c3491d5;
                                        i15 = 90;
                                        str9 = "audio/vnd.dts.hd";
                                        listM133256r = null;
                                        i16 = -1;
                                        list = listM133256r;
                                        i17 = -1;
                                        list2 = list;
                                        str3 = null;
                                        list6 = list2;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z1110 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i5111 = (z1110 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map14 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i5111;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c13 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o14 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o14;
                                        interfaceC37377sMo3102o14.mo102730a(c31521c13);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 13:
                                        i15 = 90;
                                        List listSingletonList = Collections.singletonList(c3490c3.m10286a(str8));
                                        byte[] bArr10 = c3490c3.f13770k;
                                        C5363q c5363qM107332f = AbstractC33922a.m107332f(new C24561s(bArr10, bArr10.length, 0, (byte) 0), false);
                                        c3490c3.f13751Q = c5363qM107332f.f21806b;
                                        c3490c3.f13749O = c5363qM107332f.f21807c;
                                        str9 = "audio/mp4a-latm";
                                        str3 = c5363qM107332f.f21805a;
                                        i16 = -1;
                                        i17 = -1;
                                        list7 = listSingletonList;
                                        list6 = list7;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z1111 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i5112 = (z1111 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map15 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i5112;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c14 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o15 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o15;
                                        interfaceC37377sMo3102o15.mo102730a(c31521c14);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 14:
                                        i18 = 90;
                                        str9 = "audio/ac3";
                                        i15 = i18;
                                        listM133256r = null;
                                        i16 = -1;
                                        list = listM133256r;
                                        i17 = -1;
                                        list2 = list;
                                        str3 = null;
                                        list6 = list2;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z1112 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i5113 = (z1112 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map16 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i5113;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c15 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o16 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o16;
                                        interfaceC37377sMo3102o16.mo102730a(c31521c15);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 15:
                                    case 21:
                                        i18 = 90;
                                        str9 = "audio/vnd.dts";
                                        i15 = i18;
                                        listM133256r = null;
                                        i16 = -1;
                                        list = listM133256r;
                                        i17 = -1;
                                        list2 = list;
                                        str3 = null;
                                        list6 = list2;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z1113 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i5114 = (z1113 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map17 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i5114;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c16 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o17 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o17;
                                        interfaceC37377sMo3102o17.mo102730a(c31521c16);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 16:
                                        i18 = 90;
                                        str9 = "video/av01";
                                        i15 = i18;
                                        listM133256r = null;
                                        i16 = -1;
                                        list = listM133256r;
                                        i17 = -1;
                                        list2 = list;
                                        str3 = null;
                                        list6 = list2;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z1114 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i5115 = (z1114 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map18 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i5115;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c17 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o18 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o18;
                                        interfaceC37377sMo3102o18.mo102730a(c31521c17);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                        i18 = 90;
                                        str9 = "video/x-vnd.on2.vp8";
                                        i15 = i18;
                                        listM133256r = null;
                                        i16 = -1;
                                        list = listM133256r;
                                        i17 = -1;
                                        list2 = list;
                                        str3 = null;
                                        list6 = list2;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z1115 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i5116 = (z1115 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map19 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i5116;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c18 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o19 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o19;
                                        interfaceC37377sMo3102o19.mo102730a(c31521c18);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                                        i18 = 90;
                                        str9 = "video/x-vnd.on2.vp9";
                                        i15 = i18;
                                        listM133256r = null;
                                        i16 = -1;
                                        list = listM133256r;
                                        i17 = -1;
                                        list2 = list;
                                        str3 = null;
                                        list6 = list2;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z1116 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i5117 = (z1116 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map110 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i5117;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c19 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o110 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o110;
                                        interfaceC37377sMo3102o110.mo102730a(c31521c19);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                        c3491d5 = c3491d5;
                                        str9 = "application/pgs";
                                        listM133257t = null;
                                        i16 = -1;
                                        list4 = listM133257t;
                                        i17 = -1;
                                        str3 = null;
                                        list5 = list4;
                                        i15 = 90;
                                        list6 = list5;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z1117 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i5118 = (z1117 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map111 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i5118;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c110 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o111 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o111;
                                        interfaceC37377sMo3102o111.mo102730a(c31521c110);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 20:
                                        c3491d5 = c3491d5;
                                        listM133257t = null;
                                        i16 = -1;
                                        list4 = listM133257t;
                                        i17 = -1;
                                        str3 = null;
                                        list5 = list4;
                                        i15 = 90;
                                        list6 = list5;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z1118 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i5119 = (z1118 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map112 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i5119;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c111 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o112 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o112;
                                        interfaceC37377sMo3102o112.mo102730a(c31521c111);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                        c3491d5 = c3491d5;
                                        int i84 = c3490c3.f13750P;
                                        if (i84 == 32) {
                                            str9 = "audio/raw";
                                            list4 = null;
                                            i16 = 4;
                                            i17 = -1;
                                            str3 = null;
                                            list5 = list4;
                                            i15 = 90;
                                            list6 = list5;
                                            bArr = c3490c3.f13748N;
                                            if (bArr != null) {
                                                break;
                                            }
                                            str4 = str9;
                                            str5 = str3;
                                            boolean z1119 = c3490c3.f13756V;
                                            if (c3490c3.f13755U) {
                                                i19 = 2;
                                            } else {
                                                i19 = 0;
                                            }
                                            int i51110 = (z1119 ? 1 : 0) | i19;
                                            c31518b0 = new C31518b0();
                                            zM71614h = AbstractC24555m.m71614h(str4);
                                            Map map113 = f13791g0;
                                            if (zM71614h) {
                                                c31518b0.f130060x = c3490c3.f13749O;
                                                c31518b0.f130061y = c3490c3.f13751Q;
                                                c31518b0.f130062z = i16;
                                                i24 = 1;
                                            } else if (AbstractC24555m.m71616j(str4)) {
                                                if (c3490c3.f13776q == 0) {
                                                    i29 = c3490c3.f13774o;
                                                    i25 = -1;
                                                    if (i29 == -1) {
                                                        i29 = c3490c3.f13772m;
                                                    }
                                                    c3490c3.f13774o = i29;
                                                    i34 = c3490c3.f13775p;
                                                    if (i34 == -1) {
                                                        i34 = c3490c3.f13773n;
                                                    }
                                                    c3490c3.f13775p = i34;
                                                } else {
                                                    i25 = -1;
                                                }
                                                i26 = c3490c3.f13774o;
                                                if (i26 != i25) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (c3490c3.f13783x) {
                                                    if (c3490c3.f13738D != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                                } else {
                                                    c25721b = null;
                                                }
                                                str6 = c3490c3.f13760a;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3490c3.f13777r == 0) {
                                                    i27 = iIntValue;
                                                } else {
                                                    i27 = iIntValue;
                                                }
                                                c31518b0.f130052p = c3490c3.f13772m;
                                                c31518b0.f130053q = c3490c3.f13773n;
                                                c31518b0.f130056t = f13;
                                                c31518b0.f130055s = i27;
                                                c31518b0.f130057u = c3490c3.f13781v;
                                                c31518b0.f130058v = c3490c3.f13782w;
                                                c31518b0.f130059w = c25721b;
                                                i24 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str4)) {
                                                }
                                                i24 = 3;
                                            }
                                            str7 = c3490c3.f13760a;
                                            if (str7 != null) {
                                                c31518b0.f130038b = c3490c3.f13760a;
                                            }
                                            c31518b0.f130037a = Integer.toString(i57);
                                            c31518b0.f130047k = str4;
                                            c31518b0.f130048l = i17;
                                            c31518b0.f130039c = c3490c3.f13757W;
                                            c31518b0.f130040d = i51110;
                                            c31518b0.f130049m = list6;
                                            c31518b0.f130044h = str5;
                                            c31518b0.f130050n = c3490c3.f13771l;
                                            C31521c0 c31521c112 = new C31521c0(c31518b0);
                                            InterfaceC37377s interfaceC37377sMo3102o113 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                            c3490c3.f13758X = interfaceC37377sMo3102o113;
                                            interfaceC37377sMo3102o113.mo102730a(c31521c112);
                                            sparseArray.put(c3490c3.f13762c, c3490c3);
                                            c3491d5 = c3491d5;
                                        } else {
                                            StringBuilder sb10 = new StringBuilder(90);
                                            sb10.append("Unsupported floating point PCM bit depth: ");
                                            sb10.append(i84);
                                            sb10.append(". Setting mimeType to audio/x-unknown");
                                            Log.w("MatroskaExtractor", sb10.toString());
                                            i15 = 90;
                                            str9 = "audio/x-unknown";
                                            listM133256r = null;
                                            i16 = -1;
                                            list = listM133256r;
                                            i17 = -1;
                                            list2 = list;
                                            str3 = null;
                                            list6 = list2;
                                            bArr = c3490c3.f13748N;
                                            if (bArr != null) {
                                                break;
                                            }
                                            str4 = str9;
                                            str5 = str3;
                                            boolean z11110 = c3490c3.f13756V;
                                            if (c3490c3.f13755U) {
                                                i19 = 2;
                                            } else {
                                                i19 = 0;
                                            }
                                            int i51111 = (z11110 ? 1 : 0) | i19;
                                            c31518b0 = new C31518b0();
                                            zM71614h = AbstractC24555m.m71614h(str4);
                                            Map map114 = f13791g0;
                                            if (zM71614h) {
                                                c31518b0.f130060x = c3490c3.f13749O;
                                                c31518b0.f130061y = c3490c3.f13751Q;
                                                c31518b0.f130062z = i16;
                                                i24 = 1;
                                            } else if (AbstractC24555m.m71616j(str4)) {
                                                if (c3490c3.f13776q == 0) {
                                                    i29 = c3490c3.f13774o;
                                                    i25 = -1;
                                                    if (i29 == -1) {
                                                        i29 = c3490c3.f13772m;
                                                    }
                                                    c3490c3.f13774o = i29;
                                                    i34 = c3490c3.f13775p;
                                                    if (i34 == -1) {
                                                        i34 = c3490c3.f13773n;
                                                    }
                                                    c3490c3.f13775p = i34;
                                                } else {
                                                    i25 = -1;
                                                }
                                                i26 = c3490c3.f13774o;
                                                if (i26 != i25) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (c3490c3.f13783x) {
                                                    if (c3490c3.f13738D != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                                } else {
                                                    c25721b = null;
                                                }
                                                str6 = c3490c3.f13760a;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3490c3.f13777r == 0) {
                                                    i27 = iIntValue;
                                                } else {
                                                    i27 = iIntValue;
                                                }
                                                c31518b0.f130052p = c3490c3.f13772m;
                                                c31518b0.f130053q = c3490c3.f13773n;
                                                c31518b0.f130056t = f13;
                                                c31518b0.f130055s = i27;
                                                c31518b0.f130057u = c3490c3.f13781v;
                                                c31518b0.f130058v = c3490c3.f13782w;
                                                c31518b0.f130059w = c25721b;
                                                i24 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str4)) {
                                                }
                                                i24 = 3;
                                            }
                                            str7 = c3490c3.f13760a;
                                            if (str7 != null) {
                                                c31518b0.f130038b = c3490c3.f13760a;
                                            }
                                            c31518b0.f130037a = Integer.toString(i57);
                                            c31518b0.f130047k = str4;
                                            c31518b0.f130048l = i17;
                                            c31518b0.f130039c = c3490c3.f13757W;
                                            c31518b0.f130040d = i51111;
                                            c31518b0.f130049m = list6;
                                            c31518b0.f130044h = str5;
                                            c31518b0.f130050n = c3490c3.f13771l;
                                            C31521c0 c31521c113 = new C31521c0(c31518b0);
                                            InterfaceC37377s interfaceC37377sMo3102o114 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                            c3490c3.f13758X = interfaceC37377sMo3102o114;
                                            interfaceC37377sMo3102o114.mo102730a(c31521c113);
                                            sparseArray.put(c3490c3.f13762c, c3490c3);
                                            c3491d5 = c3491d5;
                                        }
                                        break;
                                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                        c3491d5 = c3491d5;
                                        int i85 = c3490c3.f13750P;
                                        if (i85 == 8) {
                                            str9 = "audio/raw";
                                            list4 = null;
                                            i16 = 3;
                                        } else if (i85 == 16) {
                                            i16 = 268435456;
                                            str9 = "audio/raw";
                                            list4 = null;
                                        } else {
                                            StringBuilder sb11 = new StringBuilder(86);
                                            sb11.append("Unsupported big endian PCM bit depth: ");
                                            sb11.append(i85);
                                            sb11.append(". Setting mimeType to audio/x-unknown");
                                            Log.w("MatroskaExtractor", sb11.toString());
                                            str9 = "audio/x-unknown";
                                            listM133257t = null;
                                            i16 = -1;
                                            list4 = listM133257t;
                                        }
                                        i17 = -1;
                                        str3 = null;
                                        list5 = list4;
                                        i15 = 90;
                                        list6 = list5;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z11111 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i51112 = (z11111 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map115 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i51112;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c114 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o115 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o115;
                                        interfaceC37377sMo3102o115.mo102730a(c31521c114);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 24:
                                        c3491d5 = c3491d5;
                                        int iM71686q2 = AbstractC24567y.m71686q(c3490c3.f13750P);
                                        if (iM71686q2 == 0) {
                                            int i86 = c3490c3.f13750P;
                                            StringBuilder sb12 = new StringBuilder(89);
                                            sb12.append("Unsupported little endian PCM bit depth: ");
                                            sb12.append(i86);
                                            sb12.append(". Setting mimeType to audio/x-unknown");
                                            Log.w("MatroskaExtractor", sb12.toString());
                                            str9 = "audio/x-unknown";
                                            listM133257t = null;
                                            i16 = -1;
                                            list4 = listM133257t;
                                            i17 = -1;
                                            str3 = null;
                                            list5 = list4;
                                            i15 = 90;
                                            list6 = list5;
                                            bArr = c3490c3.f13748N;
                                            if (bArr != null) {
                                                break;
                                            }
                                            str4 = str9;
                                            str5 = str3;
                                            boolean z11112 = c3490c3.f13756V;
                                            if (c3490c3.f13755U) {
                                                i19 = 2;
                                            } else {
                                                i19 = 0;
                                            }
                                            int i51113 = (z11112 ? 1 : 0) | i19;
                                            c31518b0 = new C31518b0();
                                            zM71614h = AbstractC24555m.m71614h(str4);
                                            Map map116 = f13791g0;
                                            if (zM71614h) {
                                                c31518b0.f130060x = c3490c3.f13749O;
                                                c31518b0.f130061y = c3490c3.f13751Q;
                                                c31518b0.f130062z = i16;
                                                i24 = 1;
                                            } else if (AbstractC24555m.m71616j(str4)) {
                                                if (c3490c3.f13776q == 0) {
                                                    i29 = c3490c3.f13774o;
                                                    i25 = -1;
                                                    if (i29 == -1) {
                                                        i29 = c3490c3.f13772m;
                                                    }
                                                    c3490c3.f13774o = i29;
                                                    i34 = c3490c3.f13775p;
                                                    if (i34 == -1) {
                                                        i34 = c3490c3.f13773n;
                                                    }
                                                    c3490c3.f13775p = i34;
                                                } else {
                                                    i25 = -1;
                                                }
                                                i26 = c3490c3.f13774o;
                                                if (i26 != i25) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (c3490c3.f13783x) {
                                                    if (c3490c3.f13738D != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                                } else {
                                                    c25721b = null;
                                                }
                                                str6 = c3490c3.f13760a;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3490c3.f13777r == 0) {
                                                    i27 = iIntValue;
                                                } else {
                                                    i27 = iIntValue;
                                                }
                                                c31518b0.f130052p = c3490c3.f13772m;
                                                c31518b0.f130053q = c3490c3.f13773n;
                                                c31518b0.f130056t = f13;
                                                c31518b0.f130055s = i27;
                                                c31518b0.f130057u = c3490c3.f13781v;
                                                c31518b0.f130058v = c3490c3.f13782w;
                                                c31518b0.f130059w = c25721b;
                                                i24 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str4)) {
                                                }
                                                i24 = 3;
                                            }
                                            str7 = c3490c3.f13760a;
                                            if (str7 != null) {
                                                c31518b0.f130038b = c3490c3.f13760a;
                                            }
                                            c31518b0.f130037a = Integer.toString(i57);
                                            c31518b0.f130047k = str4;
                                            c31518b0.f130048l = i17;
                                            c31518b0.f130039c = c3490c3.f13757W;
                                            c31518b0.f130040d = i51113;
                                            c31518b0.f130049m = list6;
                                            c31518b0.f130044h = str5;
                                            c31518b0.f130050n = c3490c3.f13771l;
                                            C31521c0 c31521c115 = new C31521c0(c31518b0);
                                            InterfaceC37377s interfaceC37377sMo3102o116 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                            c3490c3.f13758X = interfaceC37377sMo3102o116;
                                            interfaceC37377sMo3102o116.mo102730a(c31521c115);
                                            sparseArray.put(c3490c3.f13762c, c3490c3);
                                            c3491d5 = c3491d5;
                                        } else {
                                            i16 = iM71686q2;
                                            str9 = "audio/raw";
                                            list4 = null;
                                            i17 = -1;
                                            str3 = null;
                                            list5 = list4;
                                            i15 = 90;
                                            list6 = list5;
                                            bArr = c3490c3.f13748N;
                                            if (bArr != null) {
                                                break;
                                            }
                                            str4 = str9;
                                            str5 = str3;
                                            boolean z11113 = c3490c3.f13756V;
                                            if (c3490c3.f13755U) {
                                                i19 = 2;
                                            } else {
                                                i19 = 0;
                                            }
                                            int i51114 = (z11113 ? 1 : 0) | i19;
                                            c31518b0 = new C31518b0();
                                            zM71614h = AbstractC24555m.m71614h(str4);
                                            Map map117 = f13791g0;
                                            if (zM71614h) {
                                                c31518b0.f130060x = c3490c3.f13749O;
                                                c31518b0.f130061y = c3490c3.f13751Q;
                                                c31518b0.f130062z = i16;
                                                i24 = 1;
                                            } else if (AbstractC24555m.m71616j(str4)) {
                                                if (c3490c3.f13776q == 0) {
                                                    i29 = c3490c3.f13774o;
                                                    i25 = -1;
                                                    if (i29 == -1) {
                                                        i29 = c3490c3.f13772m;
                                                    }
                                                    c3490c3.f13774o = i29;
                                                    i34 = c3490c3.f13775p;
                                                    if (i34 == -1) {
                                                        i34 = c3490c3.f13773n;
                                                    }
                                                    c3490c3.f13775p = i34;
                                                } else {
                                                    i25 = -1;
                                                }
                                                i26 = c3490c3.f13774o;
                                                if (i26 != i25) {
                                                    f13 = -1.0f;
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                if (c3490c3.f13783x) {
                                                    if (c3490c3.f13738D != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                                } else {
                                                    c25721b = null;
                                                }
                                                str6 = c3490c3.f13760a;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3490c3.f13777r == 0) {
                                                    i27 = iIntValue;
                                                } else {
                                                    i27 = iIntValue;
                                                }
                                                c31518b0.f130052p = c3490c3.f13772m;
                                                c31518b0.f130053q = c3490c3.f13773n;
                                                c31518b0.f130056t = f13;
                                                c31518b0.f130055s = i27;
                                                c31518b0.f130057u = c3490c3.f13781v;
                                                c31518b0.f130058v = c3490c3.f13782w;
                                                c31518b0.f130059w = c25721b;
                                                i24 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str4)) {
                                                }
                                                i24 = 3;
                                            }
                                            str7 = c3490c3.f13760a;
                                            if (str7 != null) {
                                                c31518b0.f130038b = c3490c3.f13760a;
                                            }
                                            c31518b0.f130037a = Integer.toString(i57);
                                            c31518b0.f130047k = str4;
                                            c31518b0.f130048l = i17;
                                            c31518b0.f130039c = c3490c3.f13757W;
                                            c31518b0.f130040d = i51114;
                                            c31518b0.f130049m = list6;
                                            c31518b0.f130044h = str5;
                                            c31518b0.f130050n = c3490c3.f13771l;
                                            C31521c0 c31521c116 = new C31521c0(c31518b0);
                                            InterfaceC37377s interfaceC37377sMo3102o117 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                            c3490c3.f13758X = interfaceC37377sMo3102o117;
                                            interfaceC37377sMo3102o117.mo102730a(c31521c116);
                                            sparseArray.put(c3490c3.f13762c, c3490c3);
                                            c3491d5 = c3491d5;
                                        }
                                        break;
                                    case 25:
                                        c3491d5 = c3491d5;
                                        listM133257t = AbstractC41023g0.m133257t(f13787c0, c3490c3.m10286a(str8));
                                        str9 = "text/x-ssa";
                                        i16 = -1;
                                        list4 = listM133257t;
                                        i17 = -1;
                                        str3 = null;
                                        list5 = list4;
                                        i15 = 90;
                                        list6 = list5;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z11114 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i51115 = (z11114 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map118 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i51115;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c117 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o118 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o118;
                                        interfaceC37377sMo3102o118.mo102730a(c31521c117);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 26:
                                        c3491d5 = c3491d5;
                                        C25726g c25726gM75847a = C25726g.m75847a(new C13117a(c3490c3.m10286a(str8), 1, (byte) 0));
                                        List list8 = c25726gM75847a.f101355a;
                                        c3490c3.f13759Y = c25726gM75847a.f101356b;
                                        str9 = "video/hevc";
                                        str3 = c25726gM75847a.f101358d;
                                        i16 = -1;
                                        i17 = -1;
                                        list5 = list8;
                                        i15 = 90;
                                        list6 = list5;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z11115 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i51116 = (z11115 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map119 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i51116;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c118 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o119 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o119;
                                        interfaceC37377sMo3102o119.mo102730a(c31521c118);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 27:
                                        c3491d5 = c3491d5;
                                        str9 = "text/vtt";
                                        listM133257t = null;
                                        i16 = -1;
                                        list4 = listM133257t;
                                        i17 = -1;
                                        str3 = null;
                                        list5 = list4;
                                        i15 = 90;
                                        list6 = list5;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z11116 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i51117 = (z11116 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map1110 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i51117;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c119 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o1110 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o1110;
                                        interfaceC37377sMo3102o1110.mo102730a(c31521c119);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 28:
                                        c3491d5 = c3491d5;
                                        str9 = "application/x-subrip";
                                        listM133257t = null;
                                        i16 = -1;
                                        list4 = listM133257t;
                                        i17 = -1;
                                        str3 = null;
                                        list5 = list4;
                                        i15 = 90;
                                        list6 = list5;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z11117 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i51118 = (z11117 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map1111 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i51118;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c1110 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o1111 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o1111;
                                        interfaceC37377sMo3102o1111.mo102730a(c31521c1110);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 29:
                                        c3491d5 = c3491d5;
                                        str9 = "video/mpeg2";
                                        listM133257t = null;
                                        i16 = -1;
                                        list4 = listM133257t;
                                        i17 = -1;
                                        str3 = null;
                                        list5 = list4;
                                        i15 = 90;
                                        list6 = list5;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z11118 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i51119 = (z11118 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map1112 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i51119;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c1111 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o1112 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o1112;
                                        interfaceC37377sMo3102o1112.mo102730a(c31521c1111);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 30:
                                        c3491d5 = c3491d5;
                                        str9 = "audio/eac3";
                                        listM133257t = null;
                                        i16 = -1;
                                        list4 = listM133257t;
                                        i17 = -1;
                                        str3 = null;
                                        list5 = list4;
                                        i15 = 90;
                                        list6 = list5;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z11119 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i511110 = (z11119 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map1113 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i511110;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c1112 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o1113 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o1113;
                                        interfaceC37377sMo3102o1113.mo102730a(c31521c1112);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 31:
                                        c3491d5 = c3491d5;
                                        str9 = "audio/flac";
                                        listM133257t = Collections.singletonList(c3490c3.m10286a(str8));
                                        i16 = -1;
                                        list4 = listM133257t;
                                        i17 = -1;
                                        str3 = null;
                                        list5 = list4;
                                        i15 = 90;
                                        list6 = list5;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z111110 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i511111 = (z111110 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map1114 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i511111;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c1113 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o1114 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o1114;
                                        interfaceC37377sMo3102o1114.mo102730a(c31521c1113);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    case 32:
                                        ArrayList arrayList3 = new ArrayList(3);
                                        arrayList3.add(c3490c3.m10286a(c3490c3.f13761b));
                                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                        arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(c3490c3.f13752R).array());
                                        arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(c3490c3.f13753S).array());
                                        str9 = "audio/opus";
                                        i17 = 5760;
                                        i16 = -1;
                                        str3 = null;
                                        i15 = 90;
                                        list7 = arrayList3;
                                        list6 = list7;
                                        bArr = c3490c3.f13748N;
                                        if (bArr != null) {
                                            break;
                                        }
                                        str4 = str9;
                                        str5 = str3;
                                        boolean z111111 = c3490c3.f13756V;
                                        if (c3490c3.f13755U) {
                                            i19 = 2;
                                        } else {
                                            i19 = 0;
                                        }
                                        int i511112 = (z111111 ? 1 : 0) | i19;
                                        c31518b0 = new C31518b0();
                                        zM71614h = AbstractC24555m.m71614h(str4);
                                        Map map1115 = f13791g0;
                                        if (zM71614h) {
                                            c31518b0.f130060x = c3490c3.f13749O;
                                            c31518b0.f130061y = c3490c3.f13751Q;
                                            c31518b0.f130062z = i16;
                                            i24 = 1;
                                        } else if (AbstractC24555m.m71616j(str4)) {
                                            if (c3490c3.f13776q == 0) {
                                                i29 = c3490c3.f13774o;
                                                i25 = -1;
                                                if (i29 == -1) {
                                                    i29 = c3490c3.f13772m;
                                                }
                                                c3490c3.f13774o = i29;
                                                i34 = c3490c3.f13775p;
                                                if (i34 == -1) {
                                                    i34 = c3490c3.f13773n;
                                                }
                                                c3490c3.f13775p = i34;
                                            } else {
                                                i25 = -1;
                                            }
                                            i26 = c3490c3.f13774o;
                                            if (i26 != i25) {
                                                f13 = -1.0f;
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (c3490c3.f13783x) {
                                                if (c3490c3.f13738D != -1.0f) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = null;
                                                }
                                                c25721b = new C25721b(c3490c3.f13784y, c3490c3.f13735A, c3490c3.f13785z, bArr2);
                                            } else {
                                                c25721b = null;
                                            }
                                            str6 = c3490c3.f13760a;
                                            if (str6 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (c3490c3.f13777r == 0) {
                                                i27 = iIntValue;
                                            } else {
                                                i27 = iIntValue;
                                            }
                                            c31518b0.f130052p = c3490c3.f13772m;
                                            c31518b0.f130053q = c3490c3.f13773n;
                                            c31518b0.f130056t = f13;
                                            c31518b0.f130055s = i27;
                                            c31518b0.f130057u = c3490c3.f13781v;
                                            c31518b0.f130058v = c3490c3.f13782w;
                                            c31518b0.f130059w = c25721b;
                                            i24 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                            }
                                            i24 = 3;
                                        }
                                        str7 = c3490c3.f13760a;
                                        if (str7 != null) {
                                            c31518b0.f130038b = c3490c3.f13760a;
                                        }
                                        c31518b0.f130037a = Integer.toString(i57);
                                        c31518b0.f130047k = str4;
                                        c31518b0.f130048l = i17;
                                        c31518b0.f130039c = c3490c3.f13757W;
                                        c31518b0.f130040d = i511112;
                                        c31518b0.f130049m = list6;
                                        c31518b0.f130044h = str5;
                                        c31518b0.f130050n = c3490c3.f13771l;
                                        C31521c0 c31521c1114 = new C31521c0(c31518b0);
                                        InterfaceC37377s interfaceC37377sMo3102o1115 = interfaceC37369k.mo3102o(c3490c3.f13762c, i24);
                                        c3490c3.f13758X = interfaceC37377sMo3102o1115;
                                        interfaceC37377sMo3102o1115.mo102730a(c31521c1114);
                                        sparseArray.put(c3490c3.f13762c, c3490c3);
                                        c3491d5 = c3491d5;
                                        break;
                                    default:
                                        throw ParserException.m15562a(null, "Unrecognized codec identifier.");
                                }
                            default:
                                c3491d5.f13839u = null;
                                break;
                        }
                    } else {
                        if (i46 == 19899) {
                            int i87 = c3491d5.f13841w;
                            if (i87 != -1) {
                                long j24 = c3491d5.f13842x;
                                if (j24 != -1) {
                                    if (i87 == 475249515) {
                                        c3491d5.f13844z = j24;
                                    }
                                }
                            }
                            throw ParserException.m15562a(null, "Mandatory element SeekID or SeekPosition not found");
                        }
                        if (i46 == 25152) {
                            c3491d5.m10289c(i46);
                            C3490c c3490c4 = c3491d5.f13839u;
                            if (c3490c4.f13767h) {
                                C37376r c37376r = c3490c4.f13769j;
                                if (c37376r == null) {
                                    throw ParserException.m15562a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                }
                                c3490c4.f13771l = new C36136c(null, true, new C36135b(AbstractC31532g.f130146a, null, "video/webm", c37376r.f159873b));
                            }
                        } else if (i46 == 28032) {
                            c3491d5.m10289c(i46);
                            C3490c c3490c5 = c3491d5.f13839u;
                            if (c3490c5.f13767h && c3490c5.f13768i != null) {
                                throw ParserException.m15562a(null, "Combining encryption and compression is not supported");
                            }
                        } else if (i46 == 357149030) {
                            if (c3491d5.f13836r == -9223372036854775807L) {
                                c3491d5.f13836r = 1000000L;
                            }
                            long j25 = c3491d5.f13837s;
                            if (j25 != -9223372036854775807L) {
                                c3491d5.f13838t = c3491d5.m10293k(j25);
                            }
                        } else if (i46 == 374648427) {
                            if (sparseArray.size() == 0) {
                                throw ParserException.m15562a(null, "No valid tracks were found");
                            }
                            c3491d5.f13819a0.mo3098l();
                        } else if (i46 == 475249515) {
                            if (!c3491d5.f13840v) {
                                InterfaceC37369k interfaceC37369k2 = c3491d5.f13819a0;
                                C24553k c24553k = c3491d5.f13794C;
                                C24553k c24553k2 = c3491d5.f13795D;
                                if (c3491d5.f13835q == -1 || c3491d5.f13838t == -9223372036854775807L || c24553k == null || (i35 = c24553k.f95825b) == 0 || c24553k2 == null || c24553k2.f95825b != i35) {
                                    c37370l = new C37370l(c3491d5.f13838t);
                                } else {
                                    int[] iArrCopyOf = new int[i35];
                                    long[] jArrCopyOf = new long[i35];
                                    long[] jArrCopyOf2 = new long[i35];
                                    long[] jArrCopyOf3 = new long[i35];
                                    for (int i88 = 0; i88 < i35; i88++) {
                                        jArrCopyOf3[i88] = c24553k.m71601e(i88);
                                        jArrCopyOf[i88] = c24553k2.m71601e(i88) + c3491d5.f13835q;
                                    }
                                    int i89 = 0;
                                    while (true) {
                                        int i94 = i35 - 1;
                                        if (i89 < i94) {
                                            int i95 = i89 + 1;
                                            iArrCopyOf[i89] = (int) (jArrCopyOf[i95] - jArrCopyOf[i89]);
                                            jArrCopyOf2[i89] = jArrCopyOf3[i95] - jArrCopyOf3[i89];
                                            i89 = i95;
                                        } else {
                                            iArrCopyOf[i94] = (int) ((c3491d5.f13835q + c3491d5.f13834p) - jArrCopyOf[i94]);
                                            long j26 = c3491d5.f13838t - jArrCopyOf3[i94];
                                            jArrCopyOf2[i94] = j26;
                                            if (j26 <= 0) {
                                                StringBuilder sb13 = new StringBuilder(72);
                                                sb13.append("Discarding last cue point with unexpected duration: ");
                                                sb13.append(j26);
                                                Log.w("MatroskaExtractor", sb13.toString());
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i94);
                                                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i94);
                                                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i94);
                                                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i94);
                                            }
                                            c37370l = new C37363e(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                                        }
                                    }
                                }
                                interfaceC37369k2.mo3111x(c37370l);
                                c3491d5.f13840v = true;
                            }
                            c3491d5.f13794C = null;
                            c3491d5.f13795D = null;
                        }
                    }
                    z15 = false;
                    interfaceC37368j2 = interfaceC37368j;
                    z13 = z15;
                }
                z16 = true;
            }
            if (z16) {
                long j27 = ((C37364f) interfaceC37368j2).f159852z;
                c3491d = this;
                if (c3491d.f13843y) {
                    c3491d.f13792A = j27;
                    c33650s.f140436a = c3491d.f13844z;
                    c3491d.f13843y = z13;
                    return 1;
                }
                if (c3491d.f13840v) {
                    long j28 = c3491d.f13792A;
                    if (j28 != -1) {
                        c33650s.f140436a = j28;
                        c3491d.f13792A = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                c3491d = this;
            }
        }
        if (z16) {
            return 0;
        }
        int i96 = 0;
        while (true) {
            SparseArray sparseArray2 = c3491d.f13821c;
            if (i96 >= sparseArray2.size()) {
                return -1;
            }
            C3490c c3490c6 = (C3490c) sparseArray2.valueAt(i96);
            c3490c6.f13758X.getClass();
            C33641l0 c33641l0 = c3490c6.f13754T;
            if (c33641l0 != null) {
                c33641l0.m106260b(c3490c6.f13758X, c3490c6.f13769j);
            }
            i96++;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10292j() {
        this.f13809R = 0;
        this.f13810S = 0;
        this.f13811T = 0;
        this.f13812U = false;
        this.f13813V = false;
        this.f13814W = false;
        this.f13815X = 0;
        this.f13816Y = (byte) 0;
        this.f13817Z = false;
        this.f13828j.m36686H(0);
    }

    /* JADX INFO: renamed from: k */
    public final long m10293k(long j7) throws ParserException {
        long j13 = this.f13836r;
        if (j13 != -9223372036854775807L) {
            return AbstractC24567y.m71666D(j7, j13, 1000L);
        }
        throw ParserException.m15562a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    /* JADX INFO: renamed from: l */
    public final int m10294l(InterfaceC37368j interfaceC37368j, C3490c c3490c, int i13) {
        int iMo102731b;
        int iMo102731b2;
        int i14;
        if ("S_TEXT/UTF8".equals(c3490c.f13761b)) {
            m10295m(interfaceC37368j, f13786b0, i13);
            int i15 = this.f13810S;
            m10292j();
            return i15;
        }
        if ("S_TEXT/ASS".equals(c3490c.f13761b)) {
            m10295m(interfaceC37368j, f13788d0, i13);
            int i16 = this.f13810S;
            m10292j();
            return i16;
        }
        if ("S_TEXT/WEBVTT".equals(c3490c.f13761b)) {
            m10295m(interfaceC37368j, f13789e0, i13);
            int i17 = this.f13810S;
            m10292j();
            return i17;
        }
        InterfaceC37377s interfaceC37377s = c3490c.f13758X;
        boolean z4 = this.f13812U;
        C13117a c13117a = this.f13828j;
        if (!z4) {
            boolean z13 = c3490c.f13767h;
            C13117a c13117a2 = this.f13825g;
            if (z13) {
                this.f13806O &= -1073741825;
                if (!this.f13813V) {
                    interfaceC37368j.readFully(c13117a2.f45381a, 0, 1);
                    this.f13809R++;
                    byte b = c13117a2.f45381a[0];
                    if ((b & 128) == 128) {
                        throw ParserException.m15562a(null, "Extension bit is set in signal byte");
                    }
                    this.f13816Y = b;
                    this.f13813V = true;
                }
                byte b6 = this.f13816Y;
                if ((b6 & 1) == 1) {
                    boolean z14 = (b6 & 2) == 2;
                    this.f13806O |= 1073741824;
                    if (!this.f13817Z) {
                        C13117a c13117a3 = this.f13830l;
                        interfaceC37368j.readFully(c13117a3.f45381a, 0, 8);
                        this.f13809R += 8;
                        this.f13817Z = true;
                        c13117a2.f45381a[0] = (byte) ((z14 ? 128 : 0) | 8);
                        c13117a2.m36689K(0);
                        interfaceC37377s.mo102732c(1, c13117a2);
                        this.f13810S++;
                        c13117a3.m36689K(0);
                        interfaceC37377s.mo102732c(8, c13117a3);
                        this.f13810S += 8;
                    }
                    if (z14) {
                        if (!this.f13814W) {
                            interfaceC37368j.readFully(c13117a2.f45381a, 0, 1);
                            this.f13809R++;
                            c13117a2.m36689K(0);
                            this.f13815X = c13117a2.m36715y();
                            this.f13814W = true;
                        }
                        int i18 = this.f13815X * 4;
                        c13117a2.m36686H(i18);
                        interfaceC37368j.readFully(c13117a2.f45381a, 0, i18);
                        this.f13809R += i18;
                        short s13 = (short) ((this.f13815X / 2) + 1);
                        int i19 = (s13 * 6) + 2;
                        ByteBuffer byteBuffer = this.f13833o;
                        if (byteBuffer == null || byteBuffer.capacity() < i19) {
                            this.f13833o = ByteBuffer.allocate(i19);
                        }
                        this.f13833o.position(0);
                        this.f13833o.putShort(s13);
                        int i24 = 0;
                        int i25 = 0;
                        while (true) {
                            i14 = this.f13815X;
                            if (i24 >= i14) {
                                break;
                            }
                            int iM36680B = c13117a2.m36680B();
                            if (i24 % 2 == 0) {
                                this.f13833o.putShort((short) (iM36680B - i25));
                            } else {
                                this.f13833o.putInt(iM36680B - i25);
                            }
                            i24++;
                            i25 = iM36680B;
                        }
                        int i26 = (i13 - this.f13809R) - i25;
                        if (i14 % 2 == 1) {
                            this.f13833o.putInt(i26);
                        } else {
                            this.f13833o.putShort((short) i26);
                            this.f13833o.putInt(0);
                        }
                        byte[] bArrArray = this.f13833o.array();
                        C13117a c13117a4 = this.f13831m;
                        c13117a4.m36687I(i19, bArrArray);
                        interfaceC37377s.mo102732c(i19, c13117a4);
                        this.f13810S += i19;
                    }
                }
            } else {
                byte[] bArr = c3490c.f13768i;
                if (bArr != null) {
                    c13117a.m36687I(bArr.length, bArr);
                }
            }
            if (c3490c.f13765f > 0) {
                this.f13806O |= 268435456;
                this.f13832n.m36686H(0);
                c13117a2.m36686H(4);
                byte[] bArr2 = c13117a2.f45381a;
                bArr2[0] = (byte) ((i13 >> 24) & 255);
                bArr2[1] = (byte) ((i13 >> 16) & 255);
                bArr2[2] = (byte) ((i13 >> 8) & 255);
                bArr2[3] = (byte) (i13 & 255);
                interfaceC37377s.mo102732c(4, c13117a2);
                this.f13810S += 4;
            }
            this.f13812U = true;
        }
        int i27 = i13 + c13117a.f45383c;
        if (!"V_MPEG4/ISO/AVC".equals(c3490c.f13761b) && !"V_MPEGH/ISO/HEVC".equals(c3490c.f13761b)) {
            if (c3490c.f13754T != null) {
                AbstractC24543a.m71573i(c13117a.f45383c == 0);
                c3490c.f13754T.m106264f(interfaceC37368j);
            }
            while (true) {
                int i28 = this.f13809R;
                if (i28 >= i27) {
                    break;
                }
                int i29 = i27 - i28;
                int iM36692a = c13117a.m36692a();
                if (iM36692a > 0) {
                    iMo102731b2 = Math.min(i29, iM36692a);
                    interfaceC37377s.mo102732c(iMo102731b2, c13117a);
                } else {
                    iMo102731b2 = interfaceC37377s.mo102731b(interfaceC37368j, i29, false);
                }
                this.f13809R += iMo102731b2;
                this.f13810S += iMo102731b2;
            }
        } else {
            C13117a c13117a5 = this.f13824f;
            byte[] bArr3 = c13117a5.f45381a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i34 = c3490c.f13759Y;
            int i35 = 4 - i34;
            while (this.f13809R < i27) {
                int i36 = this.f13811T;
                if (i36 == 0) {
                    int iMin = Math.min(i34, c13117a.m36692a());
                    interfaceC37368j.readFully(bArr3, i35 + iMin, i34 - iMin);
                    if (iMin > 0) {
                        c13117a.m36697g(bArr3, i35, iMin);
                    }
                    this.f13809R += i34;
                    c13117a5.m36689K(0);
                    this.f13811T = c13117a5.m36680B();
                    C13117a c13117a6 = this.f13823e;
                    c13117a6.m36689K(0);
                    interfaceC37377s.mo102732c(4, c13117a6);
                    this.f13810S += 4;
                } else {
                    int iM36692a2 = c13117a.m36692a();
                    if (iM36692a2 > 0) {
                        iMo102731b = Math.min(i36, iM36692a2);
                        interfaceC37377s.mo102732c(iMo102731b, c13117a);
                    } else {
                        iMo102731b = interfaceC37377s.mo102731b(interfaceC37368j, i36, false);
                    }
                    this.f13809R += iMo102731b;
                    this.f13810S += iMo102731b;
                    this.f13811T -= iMo102731b;
                }
            }
        }
        if ("A_VORBIS".equals(c3490c.f13761b)) {
            C13117a c13117a7 = this.f13826h;
            c13117a7.m36689K(0);
            interfaceC37377s.mo102732c(4, c13117a7);
            this.f13810S += 4;
        }
        int i37 = this.f13810S;
        m10292j();
        return i37;
    }

    /* JADX INFO: renamed from: m */
    public final void m10295m(InterfaceC37368j interfaceC37368j, byte[] bArr, int i13) {
        int length = bArr.length + i13;
        C13117a c13117a = this.f13829k;
        byte[] bArr2 = c13117a.f45381a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i13);
            c13117a.getClass();
            c13117a.m36687I(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        interfaceC37368j.readFully(c13117a.f45381a, bArr.length, i13);
        c13117a.m36689K(0);
        c13117a.m36688J(length);
    }

    @Override // p588wm.InterfaceC37367i
    public final void release() {
    }
}
