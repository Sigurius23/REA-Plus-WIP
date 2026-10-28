package sn;

import android.content.Context;
import android.net.Uri;
import b30.C2570m;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import ng3.C26702o;
import p031b9.C2853n;
import p078d1.C11457j;
import p141f9.C14278t;
import p284ko.InterfaceC22626k;
import p299l9.C23515n;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p460rg.AbstractC31375j;
import p465rm.C31527e0;
import p465rm.C31533g0;
import p465rm.C31536h0;
import p465rm.C31539i0;
import p465rm.C31542j0;
import p465rm.C31545k0;
import p465rm.C31551m0;
import p588wm.C37365g;
import p658yr.InterfaceC39722i;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;

/* JADX INFO: renamed from: sn.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C32739j implements InterfaceC32761u {

    /* JADX INFO: renamed from: a */
    public final C11457j f136111a;

    /* JADX INFO: renamed from: b */
    public final C2570m f136112b;

    /* JADX INFO: renamed from: c */
    public final long f136113c;

    /* JADX INFO: renamed from: d */
    public final long f136114d;

    /* JADX INFO: renamed from: e */
    public final long f136115e;

    /* JADX INFO: renamed from: f */
    public final float f136116f;

    /* JADX INFO: renamed from: g */
    public final float f136117g;

    public C32739j(Context context, C37365g c37365g) {
        C11457j c11457j = new C11457j(context, 19);
        this.f136111a = c11457j;
        this.f136112b = new C2570m(c11457j, c37365g);
        this.f136113c = -9223372036854775807L;
        this.f136114d = -9223372036854775807L;
        this.f136115e = -9223372036854775807L;
        this.f136116f = -3.4028235E38f;
        this.f136117g = -3.4028235E38f;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC32761u m102713b(Class cls, C11457j c11457j) {
        try {
            return (InterfaceC32761u) cls.getConstructor(InterfaceC22626k.class).newInstance(c11457j);
        } catch (Exception e5) {
            throw new IllegalStateException(e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0108  */
    @Override // sn.InterfaceC32761u
    /* JADX INFO: renamed from: a */
    public final AbstractC32721a mo15565a(C31545k0 c31545k0) {
        int i13;
        C31545k0 c31545k1;
        InterfaceC39722i c2853n;
        InterfaceC39722i interfaceC39722i;
        InterfaceC39722i c23515n;
        C31539i0 c31539i0 = c31545k0.f130206x;
        C31536h0 c31536h0 = c31545k0.f130207y;
        c31539i0.getClass();
        C31539i0 c31539i1 = c31545k0.f130206x;
        String scheme = c31539i1.f130173a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        Uri uri = c31539i1.f130173a;
        int i14 = AbstractC24567y.f95875a;
        String scheme2 = uri.getScheme();
        final int i15 = 2;
        final int i16 = 0;
        final int i17 = 1;
        if (scheme2 == null || !AbstractC31375j.m96492h("rtsp", scheme2)) {
            String path = uri.getPath();
            if (path == null) {
                i13 = 4;
            } else {
                String strM96499o = AbstractC31375j.m96499o(path);
                if (strM96499o.endsWith(".mpd")) {
                    i13 = 0;
                } else if (strM96499o.endsWith(".m3u8")) {
                    i13 = 2;
                } else {
                    Matcher matcher = AbstractC24567y.f95882h.matcher(strM96499o);
                    if (matcher.matches()) {
                        String strGroup = matcher.group(2);
                        if (strGroup != null) {
                            if (strGroup.contains("format=mpd-time-csf")) {
                                i13 = 0;
                            } else if (strGroup.contains("format=m3u8-aapl")) {
                                i13 = 2;
                            }
                        }
                        i13 = 1;
                    } else {
                        i13 = 4;
                    }
                }
            }
        } else {
            i13 = 3;
        }
        final C2570m c2570m = this.f136112b;
        HashMap map = (HashMap) c2570m.f9985F;
        InterfaceC32761u interfaceC32761u = (InterfaceC32761u) map.get(Integer.valueOf(i13));
        if (interfaceC32761u == null) {
            HashMap map2 = (HashMap) c2570m.f9989z;
            if (map2.containsKey(Integer.valueOf(i13))) {
                interfaceC39722i = (InterfaceC39722i) map2.get(Integer.valueOf(i13));
            } else {
                try {
                    if (i13 == 0) {
                        final Class<? extends U> clsAsSubclass = Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(InterfaceC32761u.class);
                        c23515n = new InterfaceC39722i() { // from class: sn.i
                            @Override // p658yr.InterfaceC39722i
                            public final Object get() {
                                switch (i16) {
                                    case 0:
                                        return C32739j.m102713b(clsAsSubclass, (C11457j) c2570m.f9987x);
                                    case 1:
                                        return C32739j.m102713b(clsAsSubclass, (C11457j) c2570m.f9987x);
                                    default:
                                        return C32739j.m102713b(clsAsSubclass, (C11457j) c2570m.f9987x);
                                }
                            }
                        };
                    } else if (i13 == 1) {
                        final Class<? extends U> clsAsSubclass2 = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(InterfaceC32761u.class);
                        c23515n = new InterfaceC39722i() { // from class: sn.i
                            @Override // p658yr.InterfaceC39722i
                            public final Object get() {
                                switch (i17) {
                                    case 0:
                                        return C32739j.m102713b(clsAsSubclass2, (C11457j) c2570m.f9987x);
                                    case 1:
                                        return C32739j.m102713b(clsAsSubclass2, (C11457j) c2570m.f9987x);
                                    default:
                                        return C32739j.m102713b(clsAsSubclass2, (C11457j) c2570m.f9987x);
                                }
                            }
                        };
                    } else if (i13 != 2) {
                        if (i13 != 3) {
                            c2853n = i13 != 4 ? null : new C2853n(c2570m, 5);
                        } else {
                            c23515n = new C23515n(1, Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(InterfaceC32761u.class));
                        }
                        map2.put(Integer.valueOf(i13), c2853n);
                        if (c2853n != null) {
                            ((HashSet) c2570m.f9984E).add(Integer.valueOf(i13));
                        }
                        interfaceC39722i = c2853n;
                    } else {
                        final Class clsAsSubclass3 = HlsMediaSource$Factory.class.asSubclass(InterfaceC32761u.class);
                        c23515n = new InterfaceC39722i() { // from class: sn.i
                            @Override // p658yr.InterfaceC39722i
                            public final Object get() {
                                switch (i15) {
                                    case 0:
                                        return C32739j.m102713b(clsAsSubclass3, (C11457j) c2570m.f9987x);
                                    case 1:
                                        return C32739j.m102713b(clsAsSubclass3, (C11457j) c2570m.f9987x);
                                    default:
                                        return C32739j.m102713b(clsAsSubclass3, (C11457j) c2570m.f9987x);
                                }
                            }
                        };
                    }
                    c2853n = c23515n;
                } catch (ClassNotFoundException unused) {
                }
                map2.put(Integer.valueOf(i13), c2853n);
                if (c2853n != null) {
                    ((HashSet) c2570m.f9984E).add(Integer.valueOf(i13));
                }
                interfaceC39722i = c2853n;
            }
            if (interfaceC39722i == null) {
                interfaceC32761u = null;
            } else {
                interfaceC32761u = (InterfaceC32761u) interfaceC39722i.get();
                map.put(Integer.valueOf(i13), interfaceC32761u);
            }
        }
        StringBuilder sb4 = new StringBuilder(68);
        sb4.append("No suitable media source factory found for content type: ");
        sb4.append(i13);
        AbstractC24543a.m71575k(interfaceC32761u, sb4.toString());
        C14278t c14278tM97142a = c31536h0.m97142a();
        if (c31536h0.f130163w == -9223372036854775807L) {
            c14278tM97142a.f52132a = this.f136113c;
        }
        if (c31536h0.f130166z == -3.4028235E38f) {
            c14278tM97142a.f52135d = this.f136116f;
        }
        if (c31536h0.f130162E == -3.4028235E38f) {
            c14278tM97142a.f52136e = this.f136117g;
        }
        if (c31536h0.f130164x == -9223372036854775807L) {
            c14278tM97142a.f52133b = this.f136114d;
        }
        if (c31536h0.f130165y == -9223372036854775807L) {
            c14278tM97142a.f52134c = this.f136115e;
        }
        C31536h0 c31536h0M40764a = c14278tM97142a.m40764a();
        if (c31536h0M40764a.equals(c31536h0)) {
            c31545k1 = c31545k0;
        } else {
            new C26702o(22);
            List list = Collections.EMPTY_LIST;
            C41060w0 c41060w0 = C41060w0.f177067E;
            C31533g0 c31533g0 = c31545k0.f130204E;
            C31527e0 c31527e0 = new C31527e0();
            c31527e0.f130125a = c31533g0.f130141w;
            c31527e0.f130126b = c31533g0.f130142x;
            c31527e0.f130127c = c31533g0.f130143y;
            c31527e0.f130128d = c31533g0.f130144z;
            c31527e0.f130129e = c31533g0.f130140E;
            String str = c31545k0.f130205w;
            C31551m0 c31551m0 = c31545k0.f130208z;
            c31536h0.m97142a();
            Uri uri2 = c31539i1.f130173a;
            List list2 = c31539i1.f130174b;
            AbstractC41023g0 abstractC41023g0 = c31539i1.f130175c;
            new C26702o(22);
            C14278t c14278tM97142a2 = c31536h0M40764a.m97142a();
            C31539i0 c31539i2 = uri2 != null ? new C31539i0(uri2, null, list2, abstractC41023g0) : null;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            C31533g0 c31533g1 = new C31533g0(c31527e0);
            C31536h0 c31536h0M40764a2 = c14278tM97142a2.m40764a();
            if (c31551m0 == null) {
                c31551m0 = C31551m0.f130246h0;
            }
            c31545k1 = new C31545k0(str2, c31533g1, c31539i2, c31536h0M40764a2, c31551m0);
        }
        C31539i0 c31539i3 = c31545k1.f130206x;
        AbstractC32721a abstractC32721aMo15565a = interfaceC32761u.mo15565a(c31545k1);
        AbstractC41023g0 abstractC41023g1 = c31539i3.f130175c;
        if (!abstractC41023g1.isEmpty()) {
            AbstractC32721a[] abstractC32721aArr = new AbstractC32721a[abstractC41023g1.size() + 1];
            abstractC32721aArr[0] = abstractC32721aMo15565a;
            if (abstractC41023g1.size() > 0) {
                this.f136111a.getClass();
                C31542j0 c31542j0 = (C31542j0) abstractC41023g1.get(0);
                new ArrayList(1);
                new HashSet(1);
                new C32770z(0);
                new C32770z(1);
                C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                C41060w0 c41060w1 = C41060w0.f177067E;
                List list3 = Collections.EMPTY_LIST;
                C41060w0 c41060w2 = C41060w0.f177067E;
                Uri uri3 = Uri.EMPTY;
                c31542j0.getClass();
                throw null;
            }
            abstractC32721aMo15565a = new C32732f0(abstractC32721aArr);
        }
        AbstractC32721a abstractC32721a = abstractC32721aMo15565a;
        C31533g0 c31533g2 = c31545k1.f130204E;
        long j7 = c31533g2.f130141w;
        long j13 = c31533g2.f130142x;
        return (j7 == 0 && j13 == Long.MIN_VALUE && !c31533g2.f130144z) ? abstractC32721a : new C32729e(abstractC32721a, AbstractC24567y.m71695z(j7), AbstractC24567y.m71695z(j13), !c31533g2.f130140E, c31533g2.f130143y, c31533g2.f130144z);
    }
}
