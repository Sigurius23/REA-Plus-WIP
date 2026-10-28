package vn;

import android.net.Uri;
import android.text.TextUtils;
import cn.C4842d;
import ed3.C13117a;
import in.C18715c;
import in.InterfaceC18714b;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import no.nordicsemi.android.dfu.DfuBaseService;
import p094dn.C12190j;
import p097ds.AbstractC12313p;
import p151fn.C14613a;
import p151fn.C14615c;
import p151fn.C14616d;
import p151fn.C14618f;
import p151fn.C14636x;
import p284ko.C22630n;
import p284ko.InterfaceC22628l;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p309lo.C24566x;
import p345nn.C26857h;
import p345nn.C26861l;
import p460rg.AbstractC31375j;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p528un.AbstractC35091b;
import p556vm.C36136c;
import p588wm.C37364f;
import p588wm.InterfaceC37367i;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import sm.C32713f;

/* JADX INFO: renamed from: vn.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C36179j extends AbstractC35091b {

    /* JADX INFO: renamed from: L */
    public static final AtomicInteger f154783L = new AtomicInteger();

    /* JADX INFO: renamed from: A */
    public final boolean f154784A;

    /* JADX INFO: renamed from: B */
    public final boolean f154785B;

    /* JADX INFO: renamed from: C */
    public C36171b f154786C;

    /* JADX INFO: renamed from: D */
    public C36186q f154787D;

    /* JADX INFO: renamed from: E */
    public int f154788E;

    /* JADX INFO: renamed from: F */
    public boolean f154789F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f154790G;

    /* JADX INFO: renamed from: H */
    public boolean f154791H;

    /* JADX INFO: renamed from: I */
    public AbstractC41023g0 f154792I;

    /* JADX INFO: renamed from: J */
    public boolean f154793J;

    /* JADX INFO: renamed from: K */
    public boolean f154794K;

    /* JADX INFO: renamed from: k */
    public final int f154795k;

    /* JADX INFO: renamed from: l */
    public final int f154796l;

    /* JADX INFO: renamed from: m */
    public final Uri f154797m;

    /* JADX INFO: renamed from: n */
    public final boolean f154798n;

    /* JADX INFO: renamed from: o */
    public final int f154799o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC22628l f154800p;

    /* JADX INFO: renamed from: q */
    public final C22630n f154801q;

    /* JADX INFO: renamed from: r */
    public final C36171b f154802r;

    /* JADX INFO: renamed from: s */
    public final boolean f154803s;

    /* JADX INFO: renamed from: t */
    public final boolean f154804t;

    /* JADX INFO: renamed from: u */
    public final C24566x f154805u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC36178i f154806v;

    /* JADX INFO: renamed from: w */
    public final List f154807w;

    /* JADX INFO: renamed from: x */
    public final C36136c f154808x;

    /* JADX INFO: renamed from: y */
    public final C26857h f154809y;

    /* JADX INFO: renamed from: z */
    public final C13117a f154810z;

    public C36179j(InterfaceC36178i interfaceC36178i, InterfaceC22628l interfaceC22628l, C22630n c22630n, C31521c0 c31521c0, boolean z4, InterfaceC22628l interfaceC22628l2, C22630n c22630n2, boolean z13, Uri uri, List list, int i13, Object obj, long j7, long j13, long j14, int i14, boolean z14, int i15, boolean z15, boolean z16, C24566x c24566x, C36136c c36136c, C36171b c36171b, C26857h c26857h, C13117a c13117a, boolean z17, C32713f c32713f) {
        super(interfaceC22628l, c22630n, c31521c0, i13, obj, j7, j13, j14);
        this.f154784A = z4;
        this.f154799o = i14;
        this.f154794K = z14;
        this.f154796l = i15;
        this.f154801q = c22630n2;
        this.f154800p = interfaceC22628l2;
        this.f154789F = c22630n2 != null;
        this.f154785B = z13;
        this.f154797m = uri;
        this.f154803s = z16;
        this.f154805u = c24566x;
        this.f154804t = z15;
        this.f154806v = interfaceC36178i;
        this.f154807w = list;
        this.f154808x = c36136c;
        this.f154802r = c36171b;
        this.f154809y = c26857h;
        this.f154810z = c13117a;
        this.f154798n = z17;
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        this.f154792I = C41060w0.f177067E;
        this.f154795k = f154783L.getAndIncrement();
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m115118d(String str) {
        if (AbstractC31375j.m96499o(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:19:0x0044, B:21:0x004a, B:34:0x0067, B:35:0x0069, B:41:0x007e, B:45:0x0087, B:46:0x008f, B:40:0x007b, B:25:0x0052, B:27:0x0056, B:37:0x006c, B:39:0x0074, B:44:0x0086), top: B:49:0x0044, inners: #1, #2 }] */
    /* JADX INFO: renamed from: a */
    public final void m115119a(InterfaceC22628l interfaceC22628l, C22630n c22630n, boolean z4, boolean z13) {
        C22630n c22630n2;
        C37364f c37364fM115121f;
        long j7;
        boolean z14 = false;
        try {
            if (!z4) {
                long j13 = this.f154788E;
                long j14 = c22630n.f89024f;
                long j15 = j14 != -1 ? j14 - j13 : -1L;
                if (j13 != 0 || j14 != j15) {
                    c22630n2 = new C22630n(c22630n.f89019a, c22630n.f89020b, c22630n.f89021c, c22630n.f89022d, c22630n.f89023e + j13, j15, c22630n.f89025g);
                }
                c37364fM115121f = m115121f(interfaceC22628l, c22630n2, z13);
                if (z14) {
                    c37364fM115121f.mo3100n(this.f154788E);
                }
                while (!this.f154790G && this.f154786C.f154751a.mo3075i(c37364fM115121f, C36171b.f154750d) == 0) {
                    try {
                        try {
                        } catch (Throwable th3) {
                            this.f154788E = (int) (c37364fM115121f.f159852z - c22630n.f89023e);
                            throw th3;
                        }
                    } catch (EOFException e5) {
                        if ((this.f148916d.f130070E & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
                            throw e5;
                        }
                        this.f154786C.f154751a.mo3071b(0L, 0L);
                        j7 = c37364fM115121f.f159852z;
                    }
                }
                j7 = c37364fM115121f.f159852z;
                this.f154788E = (int) (j7 - c22630n.f89023e);
                AbstractC12313p.m34305w(interfaceC22628l);
                return;
            }
            if (this.f154788E != 0) {
                z14 = true;
            }
            c37364fM115121f = m115121f(interfaceC22628l, c22630n2, z13);
            if (z14) {
                c37364fM115121f.mo3100n(this.f154788E);
            }
            while (!this.f154790G) {
            }
            j7 = c37364fM115121f.f159852z;
            this.f154788E = (int) (j7 - c22630n.f89023e);
            AbstractC12313p.m34305w(interfaceC22628l);
            return;
        } catch (Throwable th4) {
            AbstractC12313p.m34305w(interfaceC22628l);
            throw th4;
        }
        c22630n2 = c22630n;
    }

    @Override // p284ko.InterfaceC22607a0
    /* JADX INFO: renamed from: b */
    public final void mo65549b() {
        C36171b c36171b;
        this.f154787D.getClass();
        if (this.f154786C == null && (c36171b = this.f154802r) != null) {
            InterfaceC37367i interfaceC37367i = c36171b.f154751a;
            if ((interfaceC37367i instanceof C14636x) || (interfaceC37367i instanceof C12190j)) {
                this.f154786C = c36171b;
                this.f154789F = false;
            }
        }
        C22630n c22630n = this.f154801q;
        InterfaceC22628l interfaceC22628l = this.f154800p;
        if (this.f154789F) {
            interfaceC22628l.getClass();
            c22630n.getClass();
            m115119a(interfaceC22628l, c22630n, this.f154785B, false);
            this.f154788E = 0;
            this.f154789F = false;
        }
        if (this.f154790G) {
            return;
        }
        if (!this.f154804t) {
            m115119a(this.f148921i, this.f148914b, this.f154784A, true);
        }
        this.f154791H = !this.f154790G;
    }

    @Override // p284ko.InterfaceC22607a0
    /* JADX INFO: renamed from: c */
    public final void mo65550c() {
        this.f154790G = true;
    }

    /* JADX INFO: renamed from: e */
    public final int m115120e(int i13) {
        AbstractC24543a.m71573i(!this.f154798n);
        if (i13 >= this.f154792I.size()) {
            return 0;
        }
        return ((Integer) this.f154792I.get(i13)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final C37364f m115121f(InterfaceC22628l interfaceC22628l, C22630n c22630n, boolean z4) throws InterruptedIOException {
        int i13;
        long jM36706p;
        int i14;
        C36171b c36171b;
        C36171b c36171b2;
        ArrayList arrayList;
        InterfaceC37367i c14613a;
        boolean zMo3073g;
        boolean z13;
        List listSingletonList;
        int i15;
        InterfaceC37367i c4842d;
        long jMo65551z = interfaceC22628l.mo65551z(c22630n);
        int i16 = 1;
        if (z4) {
            try {
                C24566x c24566x = this.f154805u;
                boolean z14 = this.f154803s;
                long j7 = this.f148919g;
                synchronized (c24566x) {
                    try {
                        AbstractC24543a.m71573i(c24566x.f95871a == 9223372036854775806L);
                        if (c24566x.f95872b == -9223372036854775807L) {
                            if (z14) {
                                c24566x.f95874d.set(Long.valueOf(j7));
                            } else {
                                while (c24566x.f95872b == -9223372036854775807L) {
                                    c24566x.wait();
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        C37364f c37364f = new C37364f(interfaceC22628l, c22630n.f89023e, jMo65551z);
        if (this.f154786C == null) {
            C13117a c13117a = this.f154810z;
            c37364f.f159847F = 0;
            try {
                c13117a.m36686H(10);
                c37364f.mo3092c(c13117a.f45381a, 0, 10, false);
                if (c13117a.m36679A() != 4801587) {
                    jM36706p = -9223372036854775807L;
                    break;
                }
                c13117a.m36690L(3);
                int iM36713w = c13117a.m36713w();
                int i17 = iM36713w + 10;
                byte[] bArr = c13117a.f45381a;
                if (i17 > bArr.length) {
                    c13117a.m36686H(i17);
                    System.arraycopy(bArr, 0, c13117a.f45381a, 0, 10);
                }
                c37364f.mo3092c(c13117a.f45381a, 10, iM36713w, false);
                C18715c c18715cM80180f0 = this.f154809y.m80180f0(iM36713w, c13117a.f45381a);
                if (c18715cM80180f0 == null) {
                    jM36706p = -9223372036854775807L;
                    break;
                }
                InterfaceC18714b[] interfaceC18714bArr = c18715cM80180f0.f73525w;
                int length = interfaceC18714bArr.length;
                int i18 = 0;
                while (true) {
                    if (i18 >= length) {
                        jM36706p = -9223372036854775807L;
                        break;
                    }
                    InterfaceC18714b interfaceC18714b = interfaceC18714bArr[i18];
                    if (interfaceC18714b instanceof C26861l) {
                        C26861l c26861l = (C26861l) interfaceC18714b;
                        if ("com.apple.streaming.transportStreamTimestamp".equals(c26861l.f107186x)) {
                            System.arraycopy(c26861l.f107187y, 0, c13117a.f45381a, 0, 8);
                            c13117a.m36689K(0);
                            c13117a.m36688J(8);
                            jM36706p = c13117a.m36706p() & 8589934591L;
                            break;
                        }
                    }
                    i18++;
                }
            } catch (EOFException unused2) {
            }
            c37364f.f159847F = 0;
            C36171b c36171b3 = this.f154802r;
            if (c36171b3 != null) {
                C24566x c24566x2 = c36171b3.f154753c;
                C31521c0 c31521c0 = c36171b3.f154752b;
                InterfaceC37367i interfaceC37367i = c36171b3.f154751a;
                AbstractC24543a.m71573i(!((interfaceC37367i instanceof C14636x) || (interfaceC37367i instanceof C12190j)));
                InterfaceC37367i interfaceC37367i2 = c36171b3.f154751a;
                if (interfaceC37367i2 instanceof C36190u) {
                    c4842d = new C36190u(c31521c0.f130100y, c24566x2);
                } else if (interfaceC37367i2 instanceof C14616d) {
                    c4842d = new C14616d(0);
                } else if (interfaceC37367i2 instanceof C14613a) {
                    c4842d = new C14613a();
                } else if (interfaceC37367i2 instanceof C14615c) {
                    c4842d = new C14615c();
                } else {
                    if (!(interfaceC37367i2 instanceof C4842d)) {
                        String simpleName = interfaceC37367i2.getClass().getSimpleName();
                        throw new IllegalStateException(simpleName.length() != 0 ? "Unexpected extractor type for recreation: ".concat(simpleName) : new String("Unexpected extractor type for recreation: "));
                    }
                    c4842d = new C4842d(0);
                }
                c36171b2 = new C36171b(c4842d, c31521c0, c24566x2);
                jM36706p = jM36706p;
                i14 = 1;
                i13 = 0;
            } else {
                InterfaceC36178i interfaceC36178i = this.f154806v;
                Uri uri = c22630n.f89019a;
                C31521c0 c31521c1 = this.f148916d;
                List list = this.f154807w;
                C24566x c24566x3 = this.f154805u;
                Map responseHeaders = interfaceC22628l.getResponseHeaders();
                ((C36172c) interfaceC36178i).getClass();
                int iM71584t = AbstractC24543a.m71584t(c31521c1.f130077L);
                List list2 = (List) responseHeaders.get("Content-Type");
                int iM71584t2 = AbstractC24543a.m71584t((list2 == null || list2.isEmpty()) ? null : (String) list2.get(0));
                int iM71585u = AbstractC24543a.m71585u(uri);
                int[] iArr = C36172c.f154754b;
                ArrayList arrayList2 = new ArrayList(7);
                C36172c.m115113a(arrayList2, iM71584t);
                C36172c.m115113a(arrayList2, iM71584t2);
                C36172c.m115113a(arrayList2, iM71585u);
                for (int i19 = 0; i19 < 7; i19++) {
                    C36172c.m115113a(arrayList2, iArr[i19]);
                }
                c37364f.f159847F = 0;
                int i24 = 0;
                InterfaceC37367i interfaceC37367i3 = null;
                while (true) {
                    if (i24 >= arrayList2.size()) {
                        jM36706p = jM36706p;
                        i14 = i16;
                        i13 = 0;
                        interfaceC37367i3.getClass();
                        c36171b = new C36171b(interfaceC37367i3, c31521c1, c24566x3);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList2.get(i24)).intValue();
                    if (iIntValue == 0) {
                        i24 = i24;
                        arrayList = arrayList2;
                        i14 = i16;
                        c14613a = new C14613a();
                    } else if (iIntValue != i16) {
                        i14 = i16;
                        if (iIntValue == 2) {
                            i24 = i24;
                            arrayList = arrayList2;
                            c14613a = new C14616d(0);
                        } else if (iIntValue == 7) {
                            i24 = i24;
                            arrayList = arrayList2;
                            c14613a = new C4842d(0L);
                        } else if (iIntValue == 8) {
                            arrayList = arrayList2;
                            C18715c c18715c = c31521c1.f130075J;
                            if (c18715c == null) {
                                z13 = false;
                                break;
                            }
                            int i25 = 0;
                            while (true) {
                                InterfaceC18714b[] interfaceC18714bArr2 = c18715c.f73525w;
                                C18715c c18715c2 = c18715c;
                                if (i25 >= interfaceC18714bArr2.length) {
                                    z13 = false;
                                    break;
                                }
                                InterfaceC18714b interfaceC18714b2 = interfaceC18714bArr2[i25];
                                if (interfaceC18714b2 instanceof C36189t) {
                                    z13 = !((C36189t) interfaceC18714b2).f154920y.isEmpty();
                                    break;
                                }
                                i25++;
                                c18715c = c18715c2;
                            }
                            c14613a = new C12190j(z13 ? 4 : 0, c24566x3, list != null ? list : Collections.EMPTY_LIST);
                        } else if (iIntValue == 11) {
                            if (list != null) {
                                i15 = 48;
                                listSingletonList = list;
                            } else {
                                C31518b0 c31518b0 = new C31518b0();
                                c31518b0.f130047k = "application/cea-608";
                                listSingletonList = Collections.singletonList(new C31521c0(c31518b0));
                                i15 = 16;
                            }
                            String str = c31521c1.f130074I;
                            if (TextUtils.isEmpty(str)) {
                                arrayList = arrayList2;
                            } else {
                                arrayList = arrayList2;
                                if (AbstractC24555m.m71607a(str, "audio/mp4a-latm") == null) {
                                    i15 |= 2;
                                }
                                if (AbstractC24555m.m71607a(str, "video/avc") == null) {
                                    i15 |= 4;
                                }
                            }
                            c14613a = new C14636x(2, c24566x3, new C14618f(i15, listSingletonList));
                        } else if (iIntValue != 13) {
                            i24 = i24;
                            arrayList = arrayList2;
                            c14613a = null;
                        } else {
                            c14613a = new C36190u(c31521c1.f130100y, c24566x3);
                            i24 = i24;
                            arrayList = arrayList2;
                        }
                    } else {
                        i24 = i24;
                        arrayList = arrayList2;
                        i14 = i16;
                        c14613a = new C14615c();
                    }
                    c14613a.getClass();
                    try {
                        zMo3073g = c14613a.mo3073g(c37364f);
                        i13 = 0;
                        c37364f.f159847F = 0;
                    } catch (EOFException unused3) {
                        i13 = 0;
                        c37364f.f159847F = 0;
                        zMo3073g = false;
                    } catch (Throwable th4) {
                        c37364f.f159847F = 0;
                        throw th4;
                    }
                    if (zMo3073g) {
                        c36171b = new C36171b(c14613a, c31521c1, c24566x3);
                        break;
                    }
                    if (interfaceC37367i3 == null && (iIntValue == iM71584t || iIntValue == iM71584t2 || iIntValue == iM71585u || iIntValue == 11)) {
                        interfaceC37367i3 = c14613a;
                    }
                    i24++;
                    i16 = i14;
                    arrayList2 = arrayList;
                    jM36706p = jM36706p;
                }
                c36171b2 = c36171b;
            }
            this.f154786C = c36171b2;
            InterfaceC37367i interfaceC37367i4 = c36171b2.f154751a;
            if ((((interfaceC37367i4 instanceof C14616d) || (interfaceC37367i4 instanceof C14613a) || (interfaceC37367i4 instanceof C14615c) || (interfaceC37367i4 instanceof C4842d)) ? i14 : i13) != 0) {
                C36186q c36186q = this.f154787D;
                long jM71660b = jM36706p != -9223372036854775807 ? this.f154805u.m71660b(jM36706p) : this.f148919g;
                if (c36186q.f154904v0 != jM71660b) {
                    c36186q.f154904v0 = jM71660b;
                    C36185p[] c36185pArr = c36186q.f154878V;
                    int length2 = c36185pArr.length;
                    int i26 = i13;
                    while (i26 < length2) {
                        C36185p c36185p = c36185pArr[i26];
                        if (c36185p.f136210F != jM71660b) {
                            c36185p.f136210F = jM71660b;
                            c36185p.f136237z = i14;
                        }
                        i26++;
                        i14 = 1;
                    }
                }
            } else {
                C36186q c36186q2 = this.f154787D;
                if (c36186q2.f154904v0 != 0) {
                    c36186q2.f154904v0 = 0L;
                    C36185p[] c36185pArr2 = c36186q2.f154878V;
                    int length3 = c36185pArr2.length;
                    for (int i27 = i13; i27 < length3; i27++) {
                        C36185p c36185p2 = c36185pArr2[i27];
                        if (c36185p2.f136210F != 0) {
                            c36185p2.f136210F = 0L;
                            c36185p2.f136237z = true;
                        }
                    }
                }
            }
            this.f154787D.f154880X.clear();
            this.f154786C.f154751a.mo3074h(this.f154787D);
        } else {
            i13 = 0;
        }
        C36186q c36186q3 = this.f154787D;
        C36136c c36136c = this.f154808x;
        if (!AbstractC24567y.m71670a(c36186q3.f154906w0, c36136c)) {
            c36186q3.f154906w0 = c36136c;
            int i28 = i13;
            while (true) {
                C36185p[] c36185pArr3 = c36186q3.f154878V;
                if (i28 >= c36185pArr3.length) {
                    break;
                }
                if (c36186q3.f154897o0[i28]) {
                    C36185p c36185p3 = c36185pArr3[i28];
                    c36185p3.f154859I = c36136c;
                    c36185p3.f136237z = true;
                }
                i28++;
            }
        }
        return c37364f;
    }
}
