package p516u8;

import android.text.TextUtils;
import bs.AbstractC3574c;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.service.network.model.UserState;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import live.hms.video.utils.HMSConstantsKt;
import no.nordicsemi.android.dfu.DfuBaseService;
import p087db.C11856j0;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import sm.C32710c;
import te0.AbstractC33745d;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: u8.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C34610p {

    /* JADX INFO: renamed from: A */
    public final int f145756A;

    /* JADX INFO: renamed from: B */
    public final C34592g f145757B;

    /* JADX INFO: renamed from: C */
    public final int f145758C;

    /* JADX INFO: renamed from: D */
    public final int f145759D;

    /* JADX INFO: renamed from: E */
    public final int f145760E;

    /* JADX INFO: renamed from: F */
    public final int f145761F;

    /* JADX INFO: renamed from: G */
    public final int f145762G;

    /* JADX INFO: renamed from: H */
    public final int f145763H;

    /* JADX INFO: renamed from: I */
    public final int f145764I;

    /* JADX INFO: renamed from: J */
    public final int f145765J;

    /* JADX INFO: renamed from: K */
    public final int f145766K;

    /* JADX INFO: renamed from: L */
    public final int f145767L;

    /* JADX INFO: renamed from: M */
    public final int f145768M;

    /* JADX INFO: renamed from: N */
    public int f145769N;

    /* JADX INFO: renamed from: a */
    public final String f145770a;

    /* JADX INFO: renamed from: b */
    public final String f145771b;

    /* JADX INFO: renamed from: c */
    public final AbstractC41023g0 f145772c;

    /* JADX INFO: renamed from: d */
    public final String f145773d;

    /* JADX INFO: renamed from: e */
    public final int f145774e;

    /* JADX INFO: renamed from: f */
    public final int f145775f;

    /* JADX INFO: renamed from: g */
    public final int f145776g;

    /* JADX INFO: renamed from: h */
    public final int f145777h;

    /* JADX INFO: renamed from: i */
    public final int f145778i;

    /* JADX INFO: renamed from: j */
    public final int f145779j;

    /* JADX INFO: renamed from: k */
    public final String f145780k;

    /* JADX INFO: renamed from: l */
    public final C34585c0 f145781l;

    /* JADX INFO: renamed from: m */
    public final String f145782m;

    /* JADX INFO: renamed from: n */
    public final String f145783n;

    /* JADX INFO: renamed from: o */
    public final int f145784o;

    /* JADX INFO: renamed from: p */
    public final int f145785p;

    /* JADX INFO: renamed from: q */
    public final List f145786q;

    /* JADX INFO: renamed from: r */
    public final C34602l f145787r;

    /* JADX INFO: renamed from: s */
    public final long f145788s;

    /* JADX INFO: renamed from: t */
    public final boolean f145789t;

    /* JADX INFO: renamed from: u */
    public final int f145790u;

    /* JADX INFO: renamed from: v */
    public final int f145791v;

    /* JADX INFO: renamed from: w */
    public final float f145792w;

    /* JADX INFO: renamed from: x */
    public final int f145793x;

    /* JADX INFO: renamed from: y */
    public final float f145794y;

    /* JADX INFO: renamed from: z */
    public final byte[] f145795z;

    static {
        new C34608o().m109403a();
        AbstractC38065t.m121892F(0);
        AbstractC38065t.m121892F(1);
        AbstractC38065t.m121892F(2);
        AbstractC38065t.m121892F(3);
        AbstractC38065t.m121892F(4);
        AbstractC33745d.m106663v(5, 6, 7, 8, 9);
        AbstractC33745d.m106663v(10, 11, 12, 13, 14);
        AbstractC33745d.m106663v(15, 16, 17, 18, 19);
        AbstractC33745d.m106663v(20, 21, 22, 23, 24);
        AbstractC33745d.m106663v(25, 26, 27, 28, 29);
        AbstractC33745d.m106663v(30, 31, 32, 33, 34);
    }

    public C34610p(C34608o c34608o) {
        boolean z4;
        String str;
        this.f145770a = c34608o.f145729a;
        String strM121897K = AbstractC38065t.m121897K(c34608o.f145732d);
        this.f145773d = strM121897K;
        if (c34608o.f145731c.isEmpty() && c34608o.f145730b != null) {
            this.f145772c = AbstractC41023g0.m133256r(new C34612q(strM121897K, c34608o.f145730b));
            this.f145771b = c34608o.f145730b;
        } else if (c34608o.f145731c.isEmpty() || c34608o.f145730b != null) {
            if (!c34608o.f145731c.isEmpty() || c34608o.f145730b != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= c34608o.f145731c.size()) {
                        z4 = false;
                        break;
                    } else {
                        if (((C34612q) c34608o.f145731c.get(i13)).f145802b.equals(c34608o.f145730b)) {
                            z4 = true;
                            break;
                        }
                        i13++;
                    }
                }
            } else {
                z4 = true;
                break;
            }
            AbstractC35849g.m113807i(z4);
            this.f145772c = c34608o.f145731c;
            this.f145771b = c34608o.f145730b;
        } else {
            AbstractC41023g0 abstractC41023g0 = c34608o.f145731c;
            this.f145772c = abstractC41023g0;
            Iterator it = abstractC41023g0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((C34612q) abstractC41023g0.get(0)).f145802b;
                    break;
                }
                C34612q c34612q = (C34612q) it.next();
                if (TextUtils.equals(c34612q.f145801a, strM121897K)) {
                    str = c34612q.f145802b;
                    break;
                }
            }
            this.f145771b = str;
        }
        this.f145774e = c34608o.f145733e;
        AbstractC35849g.m113806h("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", c34608o.f145735g == 0 || (c34608o.f145734f & 32768) != 0);
        this.f145775f = c34608o.f145734f;
        this.f145776g = c34608o.f145735g;
        int i14 = c34608o.f145736h;
        this.f145777h = i14;
        int i15 = c34608o.f145737i;
        this.f145778i = i15;
        this.f145779j = i15 != -1 ? i15 : i14;
        this.f145780k = c34608o.f145738j;
        this.f145781l = c34608o.f145739k;
        this.f145782m = c34608o.f145740l;
        this.f145783n = c34608o.f145741m;
        this.f145784o = c34608o.f145742n;
        this.f145785p = c34608o.f145743o;
        List list = c34608o.f145744p;
        this.f145786q = list == null ? Collections.EMPTY_LIST : list;
        C34602l c34602l = c34608o.f145745q;
        this.f145787r = c34602l;
        this.f145788s = c34608o.f145746r;
        this.f145789t = c34608o.f145747s;
        this.f145790u = c34608o.f145748t;
        this.f145791v = c34608o.f145749u;
        this.f145792w = c34608o.f145750v;
        int i16 = c34608o.f145751w;
        this.f145793x = i16 == -1 ? 0 : i16;
        float f13 = c34608o.f145752x;
        this.f145794y = f13 == -1.0f ? 1.0f : f13;
        this.f145795z = c34608o.f145753y;
        this.f145756A = c34608o.f145754z;
        this.f145757B = c34608o.f145717A;
        this.f145758C = c34608o.f145718B;
        this.f145759D = c34608o.f145719C;
        this.f145760E = c34608o.f145720D;
        this.f145761F = c34608o.f145721E;
        int i17 = c34608o.f145722F;
        this.f145762G = i17 == -1 ? 0 : i17;
        int i18 = c34608o.f145723G;
        this.f145763H = i18 != -1 ? i18 : 0;
        this.f145764I = c34608o.f145724H;
        this.f145765J = c34608o.f145725I;
        this.f145766K = c34608o.f145726J;
        this.f145767L = c34608o.f145727K;
        int i19 = c34608o.f145728L;
        if (i19 != 0 || c34602l == null) {
            this.f145768M = i19;
        } else {
            this.f145768M = 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m109409c(C34610p c34610p) {
        int i13;
        String str;
        String str2;
        String str3;
        if (c34610p == null) {
            return "null";
        }
        int i14 = c34610p.f145774e;
        AbstractC41023g0 abstractC41023g0 = c34610p.f145772c;
        String str4 = c34610p.f145773d;
        int i15 = c34610p.f145760E;
        int i16 = c34610p.f145759D;
        int i17 = c34610p.f145758C;
        float f13 = c34610p.f145792w;
        C34592g c34592g = c34610p.f145757B;
        float f14 = c34610p.f145794y;
        int i18 = c34610p.f145791v;
        int i19 = c34610p.f145790u;
        C34602l c34602l = c34610p.f145787r;
        String str5 = c34610p.f145780k;
        int i24 = c34610p.f145779j;
        String str6 = c34610p.f145782m;
        int i25 = c34610p.f145775f;
        C11856j0 c11856j0 = new C11856j0(String.valueOf(DateTimeRange.lowerUpperDelimiter), 15);
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("id=");
        sbM53374o.append(c34610p.f145770a);
        sbM53374o.append(", mimeType=");
        sbM53374o.append(c34610p.f145783n);
        if (str6 != null) {
            sbM53374o.append(", container=");
            sbM53374o.append(str6);
        }
        int i26 = -1;
        if (i24 != -1) {
            sbM53374o.append(", bitrate=");
            sbM53374o.append(i24);
        }
        if (str5 != null) {
            sbM53374o.append(", codecs=");
            sbM53374o.append(str5);
        }
        if (c34602l != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i27 = 0;
            while (i27 < c34602l.f145690z) {
                UUID uuid = c34602l.f145687w[i27].f145681x;
                if (uuid.equals(AbstractC34590f.f145652b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(AbstractC34590f.f145653c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(AbstractC34590f.f145655e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(AbstractC34590f.f145654d)) {
                    linkedHashSet.add("widevine");
                } else {
                    if (uuid.equals(AbstractC34590f.f145651a)) {
                        linkedHashSet.add("universal");
                    } else {
                        linkedHashSet.add("unknown (" + uuid + ")");
                    }
                    i27++;
                    c34602l = c34602l;
                }
                i27++;
                c34602l = c34602l;
            }
            sbM53374o.append(", drm=[");
            c11856j0.m31819c(sbM53374o, linkedHashSet.iterator());
            sbM53374o.append(']');
            i26 = -1;
        }
        if (i19 != i26 && i18 != i26) {
            sbM53374o.append(", res=");
            sbM53374o.append(i19);
            sbM53374o.append("x");
            sbM53374o.append(i18);
        }
        double d3 = f14;
        int i28 = AbstractC3574c.f14449a;
        if (Math.copySign(d3 - 1.0d, 1.0d) > 0.001d && d3 != 1.0d && (!Double.isNaN(d3) || !Double.isNaN(1.0d))) {
            sbM53374o.append(", par=");
            Object[] objArr = {Float.valueOf(f14)};
            int i29 = AbstractC38065t.f163031a;
            sbM53374o.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (c34592g != null) {
            int i34 = c34592g.f145663f;
            int i35 = c34592g.f145662e;
            if ((i35 != -1 && i34 != -1) || c34592g.m109389d()) {
                sbM53374o.append(", color=");
                if (c34592g.m109389d()) {
                    String strM109384b = C34592g.m109384b(c34592g.f145658a);
                    String strM109383a = C34592g.m109383a(c34592g.f145659b);
                    String strM109385c = C34592g.m109385c(c34592g.f145660c);
                    Locale locale = Locale.US;
                    str2 = strM109384b + "/" + strM109383a + "/" + strM109385c;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i35 == -1 || i34 == -1) {
                    str3 = "NA/NA";
                } else {
                    str3 = i35 + "/" + i34;
                }
                sbM53374o.append(str2 + "/" + str3);
            }
        }
        if (f13 != -1.0f) {
            sbM53374o.append(", fps=");
            sbM53374o.append(f13);
        }
        if (i17 != -1) {
            sbM53374o.append(", maxSubLayers=");
            sbM53374o.append(i17);
        }
        if (i16 != -1) {
            sbM53374o.append(", channels=");
            sbM53374o.append(i16);
        }
        if (i15 != -1) {
            sbM53374o.append(", sample_rate=");
            sbM53374o.append(i15);
        }
        if (str4 != null) {
            sbM53374o.append(", language=");
            sbM53374o.append(str4);
        }
        if (!abstractC41023g0.isEmpty()) {
            sbM53374o.append(", labels=[");
            c11856j0.m31819c(sbM53374o, AbstractC41047q.m133290t(abstractC41023g0, new C32710c(28)).iterator());
            sbM53374o.append("]");
        }
        if (i14 != 0) {
            sbM53374o.append(", selectionFlags=[");
            int i36 = AbstractC38065t.f163031a;
            ArrayList arrayList = new ArrayList();
            if ((i14 & 4) != 0) {
                arrayList.add(UserState.Sources.AUTO);
            }
            if ((i14 & 1) != 0) {
                arrayList.add(HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY);
            }
            if ((i14 & 2) != 0) {
                arrayList.add("forced");
            }
            c11856j0.m31819c(sbM53374o, arrayList.iterator());
            sbM53374o.append("]");
        }
        if (i25 != 0) {
            sbM53374o.append(", roleFlags=[");
            int i37 = AbstractC38065t.f163031a;
            ArrayList arrayList2 = new ArrayList();
            if ((i25 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i25 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i25 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i25 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i25 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i25 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i25 & 64) != 0) {
                arrayList2.add("caption");
            }
            i13 = i25;
            if ((i13 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i13 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i13 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i13 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i13 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            c11856j0.m31819c(sbM53374o, arrayList2.iterator());
            sbM53374o.append("]");
        } else {
            i13 = i25;
        }
        if ((i13 & 32768) != 0) {
            sbM53374o.append(", auxiliaryTrackType=");
            int i38 = c34610p.f145776g;
            int i39 = AbstractC38065t.f163031a;
            if (i38 == 0) {
                str = "undefined";
            } else if (i38 == 1) {
                str = "original";
            } else if (i38 == 2) {
                str = "depth-linear";
            } else if (i38 == 3) {
                str = "depth-inverse";
            } else {
                if (i38 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbM53374o.append(str);
        }
        return sbM53374o.toString();
    }

    /* JADX INFO: renamed from: a */
    public final C34608o m109410a() {
        C34608o c34608o = new C34608o();
        c34608o.f145729a = this.f145770a;
        c34608o.f145730b = this.f145771b;
        c34608o.f145731c = this.f145772c;
        c34608o.f145732d = this.f145773d;
        c34608o.f145733e = this.f145774e;
        c34608o.f145734f = this.f145775f;
        c34608o.f145736h = this.f145777h;
        c34608o.f145737i = this.f145778i;
        c34608o.f145738j = this.f145780k;
        c34608o.f145739k = this.f145781l;
        c34608o.f145740l = this.f145782m;
        c34608o.f145741m = this.f145783n;
        c34608o.f145742n = this.f145784o;
        c34608o.f145743o = this.f145785p;
        c34608o.f145744p = this.f145786q;
        c34608o.f145745q = this.f145787r;
        c34608o.f145746r = this.f145788s;
        c34608o.f145747s = this.f145789t;
        c34608o.f145748t = this.f145790u;
        c34608o.f145749u = this.f145791v;
        c34608o.f145750v = this.f145792w;
        c34608o.f145751w = this.f145793x;
        c34608o.f145752x = this.f145794y;
        c34608o.f145753y = this.f145795z;
        c34608o.f145754z = this.f145756A;
        c34608o.f145717A = this.f145757B;
        c34608o.f145718B = this.f145758C;
        c34608o.f145719C = this.f145759D;
        c34608o.f145720D = this.f145760E;
        c34608o.f145721E = this.f145761F;
        c34608o.f145722F = this.f145762G;
        c34608o.f145723G = this.f145763H;
        c34608o.f145724H = this.f145764I;
        c34608o.f145725I = this.f145765J;
        c34608o.f145726J = this.f145766K;
        c34608o.f145727K = this.f145767L;
        c34608o.f145728L = this.f145768M;
        return c34608o;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m109411b(C34610p c34610p) {
        List list = this.f145786q;
        if (list.size() != c34610p.f145786q.size()) {
            return false;
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (!Arrays.equals((byte[]) list.get(i13), (byte[]) c34610p.f145786q.get(i13))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i13;
        if (this == obj) {
            return true;
        }
        if (obj == null || C34610p.class != obj.getClass()) {
            return false;
        }
        C34610p c34610p = (C34610p) obj;
        int i14 = this.f145769N;
        return (i14 == 0 || (i13 = c34610p.f145769N) == 0 || i14 == i13) && this.f145774e == c34610p.f145774e && this.f145775f == c34610p.f145775f && this.f145776g == c34610p.f145776g && this.f145777h == c34610p.f145777h && this.f145778i == c34610p.f145778i && this.f145784o == c34610p.f145784o && this.f145788s == c34610p.f145788s && this.f145790u == c34610p.f145790u && this.f145791v == c34610p.f145791v && this.f145793x == c34610p.f145793x && this.f145756A == c34610p.f145756A && this.f145758C == c34610p.f145758C && this.f145759D == c34610p.f145759D && this.f145760E == c34610p.f145760E && this.f145761F == c34610p.f145761F && this.f145762G == c34610p.f145762G && this.f145763H == c34610p.f145763H && this.f145764I == c34610p.f145764I && this.f145766K == c34610p.f145766K && this.f145767L == c34610p.f145767L && this.f145768M == c34610p.f145768M && Float.compare(this.f145792w, c34610p.f145792w) == 0 && Float.compare(this.f145794y, c34610p.f145794y) == 0 && Objects.equals(this.f145770a, c34610p.f145770a) && Objects.equals(this.f145771b, c34610p.f145771b) && this.f145772c.equals(c34610p.f145772c) && Objects.equals(this.f145780k, c34610p.f145780k) && Objects.equals(this.f145782m, c34610p.f145782m) && Objects.equals(this.f145783n, c34610p.f145783n) && Objects.equals(this.f145773d, c34610p.f145773d) && Arrays.equals(this.f145795z, c34610p.f145795z) && Objects.equals(this.f145781l, c34610p.f145781l) && Objects.equals(this.f145757B, c34610p.f145757B) && Objects.equals(this.f145787r, c34610p.f145787r) && m109411b(c34610p);
    }

    public final int hashCode() {
        if (this.f145769N == 0) {
            String str = this.f145770a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f145771b;
            int iHashCode2 = (this.f145772c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f145773d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f145774e) * 31) + this.f145775f) * 31) + this.f145776g) * 31) + this.f145777h) * 31) + this.f145778i) * 31;
            String str4 = this.f145780k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C34585c0 c34585c0 = this.f145781l;
            int iHashCode5 = (iHashCode4 + (c34585c0 == null ? 0 : c34585c0.hashCode())) * 961;
            String str5 = this.f145782m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f145783n;
            this.f145769N = ((((((((((((((((((((((Float.floatToIntBits(this.f145794y) + ((((Float.floatToIntBits(this.f145792w) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f145784o) * 31) + ((int) this.f145788s)) * 31) + this.f145790u) * 31) + this.f145791v) * 31)) * 31) + this.f145793x) * 31)) * 31) + this.f145756A) * 31) + this.f145758C) * 31) + this.f145759D) * 31) + this.f145760E) * 31) + this.f145761F) * 31) + this.f145762G) * 31) + this.f145763H) * 31) + this.f145764I) * 31) + this.f145766K) * 31) + this.f145767L) * 31) + this.f145768M;
        }
        return this.f145769N;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Format(");
        sb4.append(this.f145770a);
        sb4.append(", ");
        sb4.append(this.f145771b);
        sb4.append(", ");
        sb4.append(this.f145782m);
        sb4.append(", ");
        sb4.append(this.f145783n);
        sb4.append(", ");
        sb4.append(this.f145780k);
        sb4.append(", ");
        sb4.append(this.f145779j);
        sb4.append(", ");
        sb4.append(this.f145773d);
        sb4.append(", [");
        sb4.append(this.f145790u);
        sb4.append(", ");
        sb4.append(this.f145791v);
        sb4.append(", ");
        sb4.append(this.f145792w);
        sb4.append(", ");
        sb4.append(this.f145757B);
        sb4.append("], [");
        sb4.append(this.f145759D);
        sb4.append(", ");
        return AbstractC18489d0.m53371l(sb4, this.f145760E, "])");
    }
}
