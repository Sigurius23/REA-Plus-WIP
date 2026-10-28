package e10;

import android.content.Context;
import android.os.Parcel;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import android.widget.Magnifier;
import androidx.health.platform.client.proto.C1533u;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import bc3.C3022j0;
import bc3.InterfaceC3018i0;
import bh3.InterfaceC3254a;
import bh3.InterfaceC3260g;
import c93.InterfaceC4339a;
import ch3.C4719y;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.mapbox.maps.C5538l;
import dd3.EnumC11973b;
import e53.C12745d;
import e53.InterfaceC12744c;
import ed3.C13118b;
import ed3.EnumC13128l;
import eh3.C13203g;
import eh3.C13204h;
import eh3.C13205i;
import eu.InterfaceC13606d;
import fi.InterfaceC14497c;
import g40.C15374j2;
import gf.C15760a;
import gf.C15762c;
import gl.InterfaceC15944i;
import gp.C16053r;
import h20.C16663h;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import m83.AbstractC25260n;
import mp.AbstractC25780k;
import mp.C25782k1;
import mp.C25785l1;
import p010a9.InterfaceC0577b;
import p035bp.AbstractC3511b;
import p043c4.InterfaceC3964i0;
import p073cq.C11040i;
import p112e9.InterfaceC12870i;
import p129ex.C13724a;
import p141f9.C14268j;
import p152fp.C14671a;
import p171g9.C15587d;
import p181h2.C16617b;
import p187h9.InterfaceC17019c;
import p412q3.InterfaceC29884r;
import p512u2.C34465k;
import p512u2.C34472r;
import p516u8.AbstractC34590f;
import p530up.C35145a;
import p530up.C35146b;
import p546v7.BinderC35751a;
import p636y3.C39178j;
import p636y3.C39179k;
import p636y3.EnumC39181m;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import s83.AbstractC32269c;
import to.InterfaceC33987n;
import xg3.AbstractC38283j;
import xg3.AbstractC38284k;

/* JADX INFO: renamed from: e10.k0 */
/* JADX INFO: loaded from: classes6.dex */
public class C12554k0 implements InterfaceC12744c, InterfaceC13606d, InterfaceC12870i, InterfaceC14497c, InterfaceC33987n, InterfaceC3964i0, InterfaceC29884r, InterfaceC3260g, InterfaceC15944i, InterfaceC17019c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42880w;

    /* JADX INFO: renamed from: x */
    public Object f42881x;

    public /* synthetic */ C12554k0(C14671a c14671a, C16053r c16053r) {
        this.f42880w = 15;
        this.f42881x = c16053r;
    }

    /* JADX INFO: renamed from: H */
    private final void m35214H() {
    }

    /* JADX INFO: renamed from: I */
    private final void m35215I() {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m35216o(C12554k0 c12554k0, C13118b c13118b, int i13) {
        c12554k0.m35238m(c13118b, i13, EnumC11973b.DEFAULT);
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: A */
    public boolean mo3076A() {
        return true;
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: B */
    public long mo3077B() {
        return 0L;
    }

    /* JADX INFO: renamed from: C */
    public DrmSession$DrmSessionException m35217C() {
        return (DrmSession$DrmSessionException) this.f42881x;
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: D */
    public long mo3079D(long j7, long j13) {
        return 1L;
    }

    /* JADX INFO: renamed from: E */
    public UUID m35218E() {
        return AbstractC34590f.f145651a;
    }

    /* JADX INFO: renamed from: F */
    public long m35219F() {
        Magnifier magnifier = (Magnifier) this.f42881x;
        return (((long) magnifier.getWidth()) << 32) | (((long) magnifier.getHeight()) & 4294967295L);
    }

    /* JADX INFO: renamed from: G */
    public int m35220G() {
        return 1;
    }

    /* JADX INFO: renamed from: J */
    public int m35221J(int i13, byte[] bArr) throws DefaultImageHeaderParser$Reader$EndOfFileException {
        int i14 = 0;
        int i15 = 0;
        while (i14 < i13 && (i15 = ((InputStream) this.f42881x).read(bArr, i14, i13 - i14)) != -1) {
            i14 += i15;
        }
        if (i14 == 0 && i15 == -1) {
            throw new DefaultImageHeaderParser$Reader$EndOfFileException();
        }
        return i14;
    }

    /* JADX INFO: renamed from: K */
    public void m35222K(C15587d c15587d) {
    }

    /* JADX INFO: renamed from: L */
    public boolean m35223L(String str) {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
    
        if (r0 >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0076, code lost:
    
        if (r0 >= 34) goto L45;
     */
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m35224M(p516u8.C34610p r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f145783n
            r1 = 0
            if (r0 == 0) goto L82
            boolean r0 = p516u8.AbstractC34587d0.m109379l(r0)
            if (r0 != 0) goto Ld
            goto L82
        Ld:
            java.lang.String r7 = r7.f145783n
            int r0 = p607x8.AbstractC38065t.f163031a
            r7.getClass()
            int r2 = r7.hashCode()
            r3 = 4
            r4 = 1
            r5 = -1
            switch(r2) {
                case -1487656890: goto L61;
                case -1487464693: goto L56;
                case -1487464690: goto L4b;
                case -1487394660: goto L40;
                case -1487018032: goto L35;
                case -879272239: goto L2a;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L6b
        L1f:
            java.lang.String r2 = "image/png"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L28
            goto L6b
        L28:
            r5 = 6
            goto L6b
        L2a:
            java.lang.String r2 = "image/bmp"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L33
            goto L6b
        L33:
            r5 = 5
            goto L6b
        L35:
            java.lang.String r2 = "image/webp"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L3e
            goto L6b
        L3e:
            r5 = r3
            goto L6b
        L40:
            java.lang.String r2 = "image/jpeg"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L49
            goto L6b
        L49:
            r5 = 3
            goto L6b
        L4b:
            java.lang.String r2 = "image/heif"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L54
            goto L6b
        L54:
            r5 = 2
            goto L6b
        L56:
            java.lang.String r2 = "image/heic"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L5f
            goto L6b
        L5f:
            r5 = r4
            goto L6b
        L61:
            java.lang.String r2 = "image/avif"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L6a
            goto L6b
        L6a:
            r5 = r1
        L6b:
            switch(r5) {
                case 0: goto L74;
                case 1: goto L6f;
                case 2: goto L6f;
                case 3: goto L78;
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                default: goto L6e;
            }
        L6e:
            goto L7d
        L6f:
            r7 = 26
            if (r0 < r7) goto L7d
            goto L78
        L74:
            r7 = 34
            if (r0 < r7) goto L7d
        L78:
            int r7 = p031b9.AbstractC2829f.m8055f(r3, r1, r1, r1)
            return r7
        L7d:
            int r7 = p031b9.AbstractC2829f.m8055f(r4, r1, r1, r1)
            return r7
        L82:
            int r7 = p031b9.AbstractC2829f.m8055f(r1, r1, r1, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e10.C12554k0.m35224M(u8.p):int");
    }

    /* JADX INFO: renamed from: N */
    public void m35225N() {
        ((C15762c) this.f42881x).mo33083c(new C15760a("rpc.system"), "aws-api");
    }

    /* JADX INFO: renamed from: O */
    public void mo35226O(long j7, long j13) {
        ((Magnifier) this.f42881x).show(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
    }

    /* JADX INFO: renamed from: P */
    public void m35227P(byte[] bytes) {
        AbstractC22676k.m65750j(bytes, "bytes");
        C13118b c13118b = (C13118b) this.f42881x;
        m35216o(this, c13118b, bytes.length);
        int length = bytes.length;
        if (length == 0) {
            return;
        }
        c13118b.m36718b(length);
        AbstractC25260n.m74060c0(c13118b.f45386b, 0, length, bytes, c13118b.f45385a);
        c13118b.f45386b += length;
    }

    /* JADX INFO: renamed from: Q */
    public void m35228Q(int i13, int i14, EnumC11973b enumC11973b) {
        C13118b c13118b = (C13118b) this.f42881x;
        m35216o(this, c13118b, (enumC11973b == EnumC11973b.FIXED ? EnumC13128l.i32 : EnumC13128l.VARINT).m36726a(i14));
        m35238m(c13118b, i13, enumC11973b);
    }

    /* JADX INFO: renamed from: R */
    public void m35229R(C13118b output) {
        AbstractC22676k.m65750j(output, "output");
        C13118b c13118b = (C13118b) this.f42881x;
        m35216o(this, c13118b, output.f45386b);
        int i13 = output.f45386b;
        c13118b.m36718b(i13);
        AbstractC25260n.m74060c0(c13118b.f45386b, 0, i13, output.f45385a, c13118b.f45385a);
        c13118b.f45386b += i13;
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: a */
    public long mo3091a(long j7) {
        return 0L;
    }

    @Override // to.InterfaceC33987n
    public void accept(Object obj, Object obj2) {
        BinderC35751a binderC35751a = new BinderC35751a((C11040i) obj2);
        C25785l1 c25785l1 = (C25785l1) ((C25782k1) obj).m111061j();
        C16053r c16053r = (C16053r) this.f42881x;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(c25785l1.f101511g);
        int i13 = AbstractC25780k.f101499a;
        parcelObtain.writeStrongBinder(binderC35751a);
        parcelObtain.writeInt(1);
        c16053r.writeToParcel(parcelObtain, 0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            c25785l1.f101510f.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public Object mo1678b(Object obj) {
        C13204h c13204h;
        switch (this.f42880w) {
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                InterfaceC3254a interfaceC3254a = (InterfaceC3254a) obj;
                C13203g c13203g = (C13203g) ((C13205i) this.f42881x).f45768a.get();
                int i13 = c13203g.f45762a;
                if (i13 == 0) {
                    c13204h = C13205i.f45766c;
                } else {
                    C13204h[] c13204hArr = c13203g.f45763b;
                    long j7 = c13203g.f45764c;
                    c13203g.f45764c = 1 + j7;
                    c13204h = c13204hArr[(int) (j7 % ((long) i13))];
                }
                return c13204h.m37111f(interfaceC3254a, -1L, TimeUnit.NANOSECONDS);
            default:
                AbstractC38283j abstractC38283jMo37108a = ((AbstractC38284k) this.f42881x).mo37108a();
                abstractC38283jMo37108a.mo37106c(new C4719y((InterfaceC3254a) obj, abstractC38283jMo37108a));
                return abstractC38283jMo37108a;
        }
    }

    @Override // gl.InterfaceC15944i
    /* JADX INFO: renamed from: c */
    public int mo35230c() {
        return (mo35234h() << 8) | mo35234h();
    }

    @Override // eu.InterfaceC13606d
    /* JADX INFO: renamed from: d */
    public void mo35231d() {
        int i13 = this.f42880w;
    }

    @Override // fi.InterfaceC14497c
    public void dispose() {
        if (isDisposed()) {
            return;
        }
        ((C3022j0) this.f42881x).cancel((CancellationException) null);
    }

    @Override // e53.InterfaceC12744c
    /* JADX INFO: renamed from: e */
    public Object mo31821e(AbstractC32269c abstractC32269c) {
        return (String) ((C12745d) this.f42881x).f43626a;
    }

    @Override // eu.InterfaceC13606d
    /* JADX INFO: renamed from: f */
    public void mo35232f(C35146b c35146b) {
        switch (this.f42880w) {
            case 5:
                if (c35146b != null) {
                    c35146b.m111148c((C35145a) this.f42881x);
                    return;
                }
                return;
            default:
                if (c35146b != null) {
                    throw new IllegalStateException("New GoogleMap unexpectedly set while an animation was still running");
                }
                ((C35146b) this.f42881x).m111149d();
                return;
        }
    }

    @Override // fi.InterfaceC14497c
    /* JADX INFO: renamed from: g */
    public InterfaceC3018i0 mo35233g() {
        return (C3022j0) this.f42881x;
    }

    @Override // gl.InterfaceC15944i
    /* JADX INFO: renamed from: h */
    public short mo35234h() throws IOException {
        int i13 = ((InputStream) this.f42881x).read();
        if (i13 != -1) {
            return (short) i13;
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // p043c4.InterfaceC3964i0
    /* JADX INFO: renamed from: i */
    public long mo11994i(C39179k c39179k, long j7, EnumC39181m enumC39181m, long j13) {
        long j14 = ((C39178j) ((InterfaceC4339a) this.f42881x).invoke()).f168416a;
        return (((long) AbstractC3511b.m10377f(c39179k.f168418a + ((int) (j14 >> 32)), (int) (j13 >> 32), (int) (j7 >> 32), enumC39181m == EnumC39181m.f168423w)) << 32) | (((long) AbstractC3511b.m10377f(c39179k.f168419b + ((int) (j14 & 4294967295L)), (int) (j13 & 4294967295L), (int) (j7 & 4294967295L), true)) & 4294967295L);
    }

    @Override // fi.InterfaceC14497c
    public boolean isDisposed() {
        return !((C3022j0) this.f42881x).isActive();
    }

    /* JADX INFO: renamed from: j */
    public void m35235j(C15587d c15587d) {
    }

    /* JADX INFO: renamed from: k */
    public void m35236k() {
        C13724a c13724a = (C13724a) this.f42881x;
        synchronized (c13724a) {
            c13724a.f48736y = true;
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: l */
    public long m35237l(C34465k c34465k) {
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f42881x;
        float f13 = -viewConfiguration.getScaledVerticalScrollFactor();
        float f14 = -viewConfiguration.getScaledHorizontalScrollFactor();
        ?? r10 = c34465k.f144800a;
        C16617b c16617b = new C16617b(0L);
        int size = ((Collection) r10).size();
        int i13 = 0;
        while (true) {
            long j7 = c16617b.f63937a;
            if (i13 >= size) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) * f14;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) * f13;
                return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
            }
            c16617b = new C16617b(C16617b.m47192h(j7, ((C34472r) r10.get(i13)).f144824j));
            i13++;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m35238m(C13118b c13118b, int i13, EnumC11973b enumC11973b) {
        int iOrdinal = enumC11973b.ordinal();
        if (iOrdinal == 0) {
            long j7 = i13;
            c13118b.getClass();
            int i14 = C13118b.f45384c[Long.numberOfLeadingZeros(j7)];
            c13118b.m36718b(i14 + 1);
            c13118b.m36717a(i14, j7);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ((C13118b) this.f42881x).m36719c(Integer.reverseBytes(i13));
            return;
        }
        int i15 = (i13 >> 31) ^ (i13 << 1);
        c13118b.m36718b(5);
        if ((i15 & (-128)) != 0) {
            long j13 = i15;
            c13118b.m36717a(C13118b.f45384c[Long.numberOfLeadingZeros(j13)], j13);
        } else {
            byte[] bArr = c13118b.f45385a;
            int i16 = c13118b.f45386b;
            c13118b.f45386b = i16 + 1;
            bArr[i16] = (byte) i15;
        }
    }

    @Override // p412q3.InterfaceC29884r
    /* JADX INFO: renamed from: n */
    public int mo15743n(int i13) throws IOException {
        String str = ((C15374j2) this.f42881x).f57793c.f57731c;
        if (str == null) {
            return i13;
        }
        if (i13 == 0) {
            return 0;
        }
        String strSubstring = str.substring(0, Math.min(i13, str.length()));
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        StringBuilder sb4 = new StringBuilder();
        int length = strSubstring.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = strSubstring.charAt(i14);
            if (cCharAt != '#') {
                sb4.append(cCharAt);
            }
        }
        int length2 = sb4.toString().length();
        if (i13 > str.length()) {
            length2++;
        }
        return i13 - length2;
    }

    /* JADX INFO: renamed from: p */
    public void m35239p(C13118b c13118b, long j7, EnumC11973b enumC11973b) {
        int iOrdinal = enumC11973b.ordinal();
        if (iOrdinal == 0) {
            int i13 = C13118b.f45384c[Long.numberOfLeadingZeros(j7)];
            c13118b.m36718b(i13 + 1);
            c13118b.m36717a(i13, j7);
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ((C13118b) this.f42881x).m36720d(Long.reverseBytes(j7));
        } else {
            long j13 = (j7 >> 63) ^ (j7 << 1);
            int i14 = C13118b.f45384c[Long.numberOfLeadingZeros(j13)];
            c13118b.m36718b(i14 + 1);
            c13118b.m36717a(i14, j13);
        }
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: q */
    public long mo3104q(long j7, long j13) {
        return j13;
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: r */
    public long mo3105r(long j7, long j13) {
        return 0L;
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: s */
    public long mo3106s(long j7, long j13) {
        return -9223372036854775807L;
    }

    @Override // gl.InterfaceC15944i
    public long skip(long j7) throws IOException {
        InputStream inputStream = (InputStream) this.f42881x;
        if (j7 < 0) {
            return 0L;
        }
        long j13 = j7;
        while (j13 > 0) {
            long jSkip = inputStream.skip(j13);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j13 -= jSkip;
        }
        return j7 - j13;
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: t */
    public C14268j mo3107t(long j7) {
        return (C14268j) this.f42881x;
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: u */
    public long mo3108u(long j7, long j13) {
        return 0L;
    }

    /* JADX INFO: renamed from: v */
    public void m35240v() {
        C13724a c13724a = (C13724a) this.f42881x;
        synchronized (c13724a) {
            try {
                if (c13724a.f48736y) {
                    c13724a.f48736y = false;
                    Iterator it = c13724a.f48734w.iterator();
                    while (it.hasNext()) {
                        c13724a.add(it.next());
                    }
                    Iterator it3 = c13724a.f48735x.iterator();
                    while (it3.hasNext()) {
                        c13724a.remove(it3.next());
                    }
                    c13724a.f48734w.clear();
                    c13724a.f48735x.clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: w */
    public long mo3110w(long j7) {
        return 1L;
    }

    @Override // p412q3.InterfaceC29884r
    /* JADX INFO: renamed from: x */
    public int mo15749x(int i13) {
        String str = ((C15374j2) this.f42881x).f57793c.f57731c;
        if (str == null) {
            return i13;
        }
        if (i13 == 0) {
            return 0;
        }
        int i14 = 0;
        int i15 = 0;
        int i16 = -1;
        for (int i17 = 0; i17 < str.length(); i17++) {
            i14++;
            if (str.charAt(i17) == '#' && (i15 = i15 + 1) == i13) {
                i16 = i14;
            }
        }
        return i16 == -1 ? (i13 - i15) + str.length() + 1 : i16;
    }

    /* JADX INFO: renamed from: y */
    public C15762c m35241y() {
        return (C15762c) this.f42881x;
    }

    /* JADX INFO: renamed from: z */
    public InterfaceC0577b m35242z() {
        return null;
    }

    public /* synthetic */ C12554k0(Object obj, int i13) {
        this.f42880w = i13;
        this.f42881x = obj;
    }

    public C12554k0(int i13) {
        this.f42880w = i13;
        switch (i13) {
            case 11:
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                this.f42881x = new C15762c();
                break;
            case 28:
                this.f42881x = new C5538l(28);
                break;
            default:
                this.f42881x = new ConcurrentLinkedQueue();
                break;
        }
    }

    public C12554k0(C16663h prefsRepositoryFactory) {
        this.f42880w = 0;
        AbstractC22676k.m65750j(prefsRepositoryFactory, "prefsRepositoryFactory");
        this.f42881x = prefsRepositoryFactory;
    }

    public C12554k0(C12745d tokenRepository) {
        this.f42880w = 2;
        AbstractC22676k.m65750j(tokenRepository, "tokenRepository");
        this.f42881x = tokenRepository;
    }

    public C12554k0(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f42880w = 27;
        this.f42881x = new GestureDetector(context, onGestureListener, null);
    }
}
