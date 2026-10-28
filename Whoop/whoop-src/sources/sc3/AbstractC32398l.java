package sc3;

import android.net.Uri;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b23.C2343i;
import b23.EnumC2341g;
import b30.C2641v3;
import c93.InterfaceC4339a;
import cb3.AbstractC4393e;
import com.ethlo.time.internal.DateTimeFormatException;
import com.whoop.android.R;
import d30.C11518b0;
import d40.AbstractC11673r;
import d40.C11671p;
import h20.C16690l2;
import h20.C16696m2;
import h20.C16732s2;
import h20.C16744u2;
import h20.InterfaceC16702n2;
import io.sentry.config.AbstractC20301a;
import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Iterator;
import jp1.C21859k;
import l83.C23465k;
import lb3.AbstractC23763c0;
import lb3.AbstractC23791o;
import lb3.AbstractC23811y;
import lb3.InterfaceC23796q0;
import m83.AbstractC25247g0;
import m83.C25271y;
import n83.C26460c;
import org.joda.time.DateTimeConstants;
import org.webrtc.MediaStreamTrack;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p108e4.AbstractC12682p;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15081m5;
import p163g1.AbstractC15166v0;
import p163g1.C14970c1;
import p163g1.C15069l3;
import p163g1.C15071l5;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.C22976l1;
import p294l3.C23285v0;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p40.C28826a;
import p460rg.AbstractC31366a;
import p490t0.AbstractC33244a;
import p530up.AbstractC35148d;
import p555vl.C36094a;
import p555vl.C36096c;
import p555vl.C36097d;
import p587wl.AbstractC37351a;
import p602x1.AbstractC37817c;
import p619xl.AbstractC38446b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p715kotlin.reflect.jvm.internal.SystemPropertiesKt;
import q83.AbstractC30060g;
import q93.C30080d;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import sb3.AbstractC32350a;
import uc3.C34768f;
import uc3.C34774l;
import uc3.C34775m;
import uc3.C34779q;
import v20.EnumC35561a;
import va3.C35847e;
import va3.C35848f;
import wb3.AbstractC37051a;
import wb3.AbstractC37056f;
import wb3.C37058h;
import wb3.C37059i;
import wb3.C37067q;
import y00.C39011z1;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: sc3.l */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC32398l {
    /* JADX INFO: renamed from: a */
    public static final void m100968a(Modifier modifier, Composer composer, int i13) {
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1603052936);
        int i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            AbstractC35148d.m111173d(AbstractC30060g.m92103Y(c28655q, R.string.stripe_affirm_buy_now_pay_later), modifier2, AbstractC25247g0.m73989X(new C23465k("affirm", new C28826a(((double) AbstractC17918w0.m51536x(AbstractC11673r.m31082k(c28655q).f37668a)) < 0.5d ? R.drawable.stripe_ic_affirm_logo_night : R.drawable.stripe_ic_affirm_logo_day, R.string.stripe_paymentsheet_payment_method_affirm, null))), AbstractC11673r.m31082k(c28655q).f37672e, C15069l3.m43149c(c28655q).f56279f, false, null, 0, null, c28655q, (i14 << 3) & 112, 480);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2641v3(modifier2, i13, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m100969b(EnumC35561a enumC35561a, String label, InterfaceC4339a onClick, Composer composer, int i13) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1081806703);
        int i14 = i13 | (c28655q.m87153g(label) ? 32 : 16) | (c28655q.m87157i(onClick) ? 256 : 128);
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            int iOrdinal = enumC35561a.ordinal();
            if (iOrdinal == 0) {
                c28655q.m87150e0(69340579);
                AbstractC20301a.m56341i(label, true, onClick, null, false, false, false, null, c28655q, ((i14 >> 3) & 14) | 48 | (i14 & 896), 248);
                c28655q.m87173q(false);
            } else {
                if (iOrdinal != 1) {
                    throw AbstractC11895b.m32003v(69339672, c28655q, false);
                }
                c28655q.m87150e0(-2145230072);
                C23285v0 c23285v0M31078g = AbstractC11673r.m31078g(C11671p.f37684e, c28655q);
                C28674u2 c28674u2 = AbstractC14981d1.f55997a;
                C23285v0 c23285v0M67364b = C23285v0.m67364b(c23285v0M31078g, ((C14970c1) c28655q.m87161k(c28674u2)).m43091f(), 0L, null, null, 0L, 0, 0L, null, null, 16777214);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                AbstractC33244a abstractC33244a = ((C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a)).f56427a;
                C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                AbstractC12350b.m34583d(onClick, modifierM3409f, false, abstractC33244a, null, AbstractC15166v0.m43196a(C17919x.f69636m, ((C14970c1) c28655q.m87161k(c28674u2)).m43091f(), 0L, 0L, c28655q, 6, 12), null, AbstractC37817c.m121344e(-336976269, c28655q, new C11518b0(8, label, c23285v0M67364b)), c28655q, ((i14 >> 6) & 14) | 805306416, 348);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21859k(enumC35561a, label, onClick, i13, 27);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m100970c(C26460c c26460c, InterfaceC32397k interfaceC32397k) {
        if (interfaceC32397k instanceof C32389c) {
            c26460c.add(((C32389c) interfaceC32397k).f134131a);
            return;
        }
        if (interfaceC32397k instanceof C32392f) {
            Iterator it = ((C32392f) interfaceC32397k).f134136a.iterator();
            while (it.hasNext()) {
                m100970c(c26460c, (InterfaceC32400n) it.next());
            }
            return;
        }
        if (interfaceC32397k instanceof C32394h) {
            return;
        }
        if (interfaceC32397k instanceof C32405s) {
            m100970c(c26460c, ((C32405s) interfaceC32397k).f134150a);
            return;
        }
        if (!(interfaceC32397k instanceof C32388b)) {
            if (!(interfaceC32397k instanceof C32402p)) {
                throw new NoWhenBranchMatchedException();
            }
            m100970c(c26460c, ((C32402p) interfaceC32397k).f134146b);
        } else {
            C32388b c32388b = (C32388b) interfaceC32397k;
            m100970c(c26460c, c32388b.f134129a);
            Iterator it3 = c32388b.f134130b.iterator();
            while (it3.hasNext()) {
                m100970c(c26460c, (InterfaceC32397k) it3.next());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC37051a m100971d(InterfaceC21456a0 type) {
        String qualifiedName;
        AbstractC22676k.m65750j(type, "type");
        if (!SystemPropertiesKt.getUseK1Implementation()) {
            C37067q c37067q = (C37067q) type;
            InterfaceC21463e interfaceC21463e = c37067q.f158579x;
            InterfaceC21461d interfaceC21461d = interfaceC21463e instanceof InterfaceC21461d ? (InterfaceC21461d) interfaceC21463e : null;
            if (interfaceC21461d == null || (qualifiedName = interfaceC21461d.getQualifiedName()) == null) {
                throw new KotlinReflectionInternalError("Non-class type cannot be a mutable collection type: " + type);
            }
            String str = C30080d.f122759a;
            C35847e c35847eM92212h = C30080d.m92212h(new C35848f(qualifiedName));
            if (c35847eM92212h != null) {
                return new C37067q(c37067q.f158579x, c37067q.f158580y, c37067q.f158581z, c37067q.f158573E, c37067q.f158574F, c37067q.f158575G, c37067q.f158576H, c37067q.f158577I, AbstractC32350a.m100702i((InterfaceC21461d) interfaceC21463e, c35847eM92212h), null);
            }
            throw new IllegalArgumentException("Not a readonly collection: " + type);
        }
        AbstractC23811y abstractC23811y = ((C37058h) type).f158553x;
        if (!(abstractC23811y instanceof AbstractC23763c0)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a mutable collection type: " + type).toString());
        }
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
        InterfaceC31117e interfaceC31117e = interfaceC31126hMo1784d instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31126hMo1784d : null;
        if (interfaceC31117e == null) {
            throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: " + type);
        }
        AbstractC23763c0 abstractC23763c0 = (AbstractC23763c0) abstractC23811y;
        String str2 = C30080d.f122759a;
        C35847e c35847eM92212h2 = C30080d.m92212h(AbstractC4393e.m13810h(interfaceC31117e));
        if (c35847eM92212h2 != null) {
            InterfaceC23796q0 interfaceC23796q0Mo60496e = AbstractC4393e.m13807e(interfaceC31117e).m83822j(c35847eM92212h2).mo60496e();
            AbstractC22676k.m65749i(interfaceC23796q0Mo60496e, "getTypeConstructor(...)");
            return new C37058h(AbstractC23791o.m69891j(abstractC23763c0, interfaceC23796q0Mo60496e), null);
        }
        throw new IllegalArgumentException("Not a readonly collection: " + interfaceC31117e);
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC37051a m100972e(InterfaceC21456a0 type) {
        AbstractC22676k.m65750j(type, "type");
        if (!SystemPropertiesKt.getUseK1Implementation()) {
            C37067q c37067q = (C37067q) type;
            if (AbstractC22676k.m65745e(c37067q.f158579x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Void.class))) {
                return new C37067q(c37067q.f158579x, c37067q.f158580y, c37067q.f158581z, c37067q.f158573E, c37067q.f158574F, c37067q.f158575G, true, c37067q.f158577I, c37067q.f158578J, null);
            }
            throw new IllegalArgumentException(("Nothing type's classifier must be Void::class: " + type).toString());
        }
        AbstractC23811y abstractC23811y = ((C37058h) type).f158553x;
        if (!(abstractC23811y instanceof AbstractC23763c0)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a Nothing type: " + type).toString());
        }
        AbstractC23763c0 abstractC23763c0 = (AbstractC23763c0) abstractC23811y;
        InterfaceC23796q0 interfaceC23796q0Mo60496e = AbstractC20301a.m56356z(abstractC23811y).m83823k("Nothing").mo60496e();
        AbstractC22676k.m65749i(interfaceC23796q0Mo60496e, "getTypeConstructor(...)");
        return new C37058h(AbstractC23791o.m69891j(abstractC23763c0, interfaceC23796q0Mo60496e), null);
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC37051a m100973f(InterfaceC21456a0 lowerBound, InterfaceC21456a0 upperBound) {
        AbstractC22676k.m65750j(lowerBound, "lowerBound");
        AbstractC22676k.m65750j(upperBound, "upperBound");
        if (!SystemPropertiesKt.getUseK1Implementation()) {
            AbstractC37051a abstractC37051a = (AbstractC37051a) lowerBound;
            AbstractC37051a abstractC37051a2 = (AbstractC37051a) upperBound;
            return abstractC37051a.equals(abstractC37051a2) ? abstractC37051a : new C37059i(abstractC37051a, abstractC37051a2, false, null);
        }
        AbstractC23811y abstractC23811y = ((C37058h) lowerBound).f158553x;
        AbstractC22676k.m65748h(abstractC23811y, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC23811y abstractC23811y2 = ((C37058h) upperBound).f158553x;
        AbstractC22676k.m65748h(abstractC23811y2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C37058h(AbstractC23791o.m69883b((AbstractC23763c0) abstractC23811y, (AbstractC23763c0) abstractC23811y2), null);
    }

    /* JADX INFO: renamed from: g */
    public static String m100974g(OffsetDateTime offsetDateTime) {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        if (!offsetDateTime.getOffset().equals(zoneOffset)) {
            offsetDateTime = offsetDateTime.atZoneSameInstant(zoneOffset).toOffsetDateTime();
        }
        int totalSeconds = zoneOffset.getTotalSeconds();
        C36097d c36097d = new C36097d(totalSeconds / DateTimeConstants.SECONDS_PER_HOUR, (totalSeconds % DateTimeConstants.SECONDS_PER_HOUR) / 60);
        char[] cArr = new char[29];
        AbstractC38446b.m123191c(offsetDateTime.getYear(), 0, 4, cArr);
        cArr[4] = '-';
        AbstractC38446b.m123191c(offsetDateTime.getMonthValue(), 5, 2, cArr);
        cArr[7] = '-';
        AbstractC38446b.m123191c(offsetDateTime.getDayOfMonth(), 8, 2, cArr);
        cArr[10] = 'T';
        AbstractC38446b.m123191c(offsetDateTime.getHour(), 11, 2, cArr);
        cArr[13] = ':';
        AbstractC38446b.m123191c(offsetDateTime.getMinute(), 14, 2, cArr);
        cArr[16] = ':';
        AbstractC38446b.m123191c(offsetDateTime.getSecond(), 17, 2, cArr);
        cArr[19] = '.';
        AbstractC38446b.m123191c((int) (((double) offsetDateTime.getNano()) / ((double) AbstractC37351a.f159762a[2])), 20, 3, cArr);
        return AbstractC37351a.m119606b(cArr, 23, c36097d);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m100975h(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:102:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:104:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:105:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:106:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02db  */
    /* JADX WARN: Code duplicated, block: B:111:0x02de  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:118:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:119:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:120:0x0301  */
    /* JADX WARN: Code duplicated, block: B:121:0x0304  */
    /* JADX WARN: Code duplicated, block: B:122:0x0307  */
    /* JADX WARN: Code duplicated, block: B:87:0x0261  */
    /* JADX WARN: Code duplicated, block: B:89:0x026b  */
    /* JADX WARN: Code duplicated, block: B:91:0x026f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0275  */
    /* JADX WARN: Code duplicated, block: B:95:0x0279  */
    /* JADX WARN: Code duplicated, block: B:98:0x0295  */
    /* JADX INFO: renamed from: i */
    public static OffsetDateTime m100976i(String str) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        C36097d c36097d;
        int i26;
        int i27;
        C36094a c36094a;
        char cCharAt;
        int i28;
        int i29;
        int iM35485e;
        int i34;
        int i35;
        String str2;
        C36097d c36097d2;
        ZoneOffset zoneOffsetOfHoursMinutes;
        C36096c c36096c = C36096c.f154315e;
        if (str == null) {
            throw new NullPointerException("text cannot be null");
        }
        int length = str.length();
        if (length < 0) {
            throw new IndexOutOfBoundsException(String.format("offset is %d which is equal to or larger than the input length of %d", 0, Integer.valueOf(str.length())));
        }
        int i36 = 4;
        int iM123190b = AbstractC38446b.m123190b(0, 4, str);
        C36097d c36097d3 = C36097d.f154318c;
        int i37 = 6;
        if (4 != length) {
            i13 = 17;
            i14 = 19;
            i15 = 5;
            i16 = 16;
            AbstractC31366a.m96468h('-', 2, 4, str);
            int iM123190b2 = AbstractC38446b.m123190b(5, 7, str);
            if (7 == length) {
                i28 = 13;
                i17 = 7;
                i29 = 8;
                c36094a = new C36094a(2, iM123190b, iM123190b2, 0, 0, 0, 0, 0, null, 0);
            } else {
                AbstractC31366a.m96468h('-', 3, 7, str);
                int iM123190b3 = AbstractC38446b.m123190b(8, 10, str);
                if (10 == length) {
                    i17 = 7;
                    i18 = 8;
                    c36094a = new C36094a(3, iM123190b, iM123190b2, iM123190b3, 0, 0, 0, 0, null, 0);
                    i27 = 4;
                    c36097d = c36097d3;
                    i26 = 6;
                    i24 = 19;
                    i25 = 13;
                    i19 = 17;
                } else {
                    i17 = 7;
                    int i38 = 5;
                    int i39 = 16;
                    i18 = 8;
                    int i44 = 13;
                    char cCharAt2 = str.charAt(10);
                    char[] cArr = c36096c.f154316a;
                    char[] cArr2 = c36096c.f154317b;
                    int length2 = cArr.length;
                    int i45 = 0;
                    while (true) {
                        if (i45 >= length2) {
                            char[] cArr3 = c36096c.f154316a;
                            throw new DateTimeParseException(String.format("Expected character %s at position %d, found %s: %s", cArr3.length > 1 ? Arrays.toString(cArr3) : Character.toString(cArr3[0]), 11, Character.valueOf(str.charAt(10)), str), str, 10);
                        }
                        if (cArr[i45] == cCharAt2) {
                            int iM123190b4 = AbstractC38446b.m123190b(11, i44, str);
                            AbstractC31366a.m96468h(':', i38, i44, str);
                            int iM123190b5 = AbstractC38446b.m123190b(14, i39, str);
                            if (length == i39) {
                                i16 = i39;
                                int i46 = i38;
                                i24 = i14;
                                i25 = i44;
                                i19 = 17;
                                c36094a = new C36094a(i46, iM123190b, iM123190b2, iM123190b3, iM123190b4, iM123190b5, 0, 0, null, 0);
                                i15 = i46;
                            } else {
                                i15 = i38;
                                i19 = 17;
                                char c3 = '\n';
                                i24 = i14;
                                i25 = i44;
                                int i47 = i39;
                                char cCharAt3 = str.charAt(i47);
                                if (cCharAt3 == '+' || cCharAt3 == '-') {
                                    c36097d = c36097d3;
                                    i26 = i37;
                                    i27 = 4;
                                    i16 = i47;
                                    c36094a = new C36094a(i15, iM123190b, iM123190b2, iM123190b3, iM123190b4, iM123190b5, 0, 0, AbstractC37351a.m119607c(c36096c, str, i47), 0);
                                } else if (cCharAt3 != ':') {
                                    if (cCharAt3 != 'Z' && cCharAt3 != 'z') {
                                        AbstractC31366a.m96479s(str, i47, ':', 'Z', 'z', '+', '-');
                                        throw null;
                                    }
                                    c36097d = c36097d3;
                                    i26 = i37;
                                    i27 = 4;
                                    i16 = i47;
                                    c36094a = new C36094a(i15, iM123190b, iM123190b2, iM123190b3, iM123190b4, iM123190b5, 0, 0, AbstractC37351a.m119607c(c36096c, str, i47), 0);
                                } else {
                                    int length3 = str.length();
                                    if (length3 > i24) {
                                        char cCharAt4 = str.charAt(i24);
                                        int length4 = cArr2.length;
                                        int i48 = 0;
                                        while (true) {
                                            if (i48 >= length4) {
                                                i16 = 16;
                                                if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                                    C36097d c36097d4 = c36097d3;
                                                    c36094a = new C36094a(6, iM123190b, iM123190b2, iM123190b3, iM123190b4, iM123190b5, AbstractC38446b.m123190b(17, i24, str), 0, c36097d4, 0);
                                                    i16 = 16;
                                                    i27 = 4;
                                                    c36097d = c36097d4;
                                                } else {
                                                    if (cCharAt4 != '+' && cCharAt4 != '-') {
                                                        char[] cArr4 = new char[cArr2.length + 4];
                                                        System.arraycopy(cArr2, 0, cArr4, 0, cArr2.length);
                                                        System.arraycopy(new char[]{'Z', 'z', '+', '-'}, 0, cArr4, cArr2.length, 4);
                                                        AbstractC31366a.m96479s(str, i24, cArr4);
                                                        throw null;
                                                    }
                                                    i36 = 4;
                                                    c36094a = new C36094a(6, iM123190b, iM123190b2, iM123190b3, iM123190b4, iM123190b5, AbstractC38446b.m123190b(17, i24, str), 0, AbstractC37351a.m119607c(c36096c, str, i24), 0);
                                                    i27 = i36;
                                                    c36097d = c36097d3;
                                                }
                                                i26 = i37;
                                            } else if (cArr2[i48] == cCharAt4) {
                                                int i49 = 20;
                                                int i54 = 0;
                                                int i55 = 0;
                                                while (i49 < str.length() && (cCharAt = str.charAt(i49)) >= '0' && cCharAt <= '9') {
                                                    i54++;
                                                    i55 = (cCharAt - '0') + (i55 * 10);
                                                    i49++;
                                                }
                                                int i56 = i49 - 1;
                                                if (i54 == 0) {
                                                    throw new DateTimeParseException("Must have at least 1 fraction digit: ".concat(str), str, i56);
                                                }
                                                if (i54 > 9) {
                                                    throw new DateTimeParseException(String.format("Maximum supported number of fraction digits in second is 9, got %d: %s", Integer.valueOf(i54), str), str, i56);
                                                }
                                                int i57 = i55;
                                                for (int i58 = i54; i58 < 9; i58++) {
                                                    i57 *= 10;
                                                }
                                                i16 = 16;
                                                c36094a = new C36094a(7, iM123190b, iM123190b2, iM123190b3, iM123190b4, iM123190b5, AbstractC38446b.m123190b(17, i24, str), i57, AbstractC37351a.m119607c(c36096c, str, i49), i54);
                                            } else {
                                                i48++;
                                                c3 = c3;
                                            }
                                        }
                                    } else {
                                        C36097d c36097d5 = c36097d3;
                                        i27 = 4;
                                        if (length3 != i24) {
                                            throw new DateTimeParseException("Unexpected end of input: ".concat(str), str, i47);
                                        }
                                        c36097d = c36097d5;
                                        int i59 = i37;
                                        c36094a = new C36094a(i59, iM123190b, iM123190b2, iM123190b3, iM123190b4, iM123190b5, AbstractC38446b.m123190b(17, i24, str), 0, null, 0);
                                        i26 = i59;
                                        i16 = i47;
                                    }
                                }
                            }
                            c36097d = c36097d3;
                            i26 = i37;
                            i27 = 4;
                        } else {
                            i45++;
                            c36097d3 = c36097d3;
                            i44 = i44;
                            i14 = i14;
                            i37 = i37;
                            i38 = i38;
                            i39 = i39;
                        }
                    }
                }
            }
            iM35485e = AbstractC12682p.m35485e(i26);
            i34 = c36094a.f154309w;
            if (iM35485e <= AbstractC12682p.m35485e(i34)) {
                if (AbstractC12682p.m35485e(i15) <= AbstractC12682p.m35485e(i34)) {
                    throw new DateTimeFormatException("No MINUTE field found");
                }
                c36097d2 = c36094a.f154307I;
                if (c36097d2 != null) {
                    String string = c36094a.toString();
                    throw new DateTimeParseException("No timezone information: ".concat(string), string, string.length());
                }
                if (c36097d2.equals(c36097d)) {
                    zoneOffsetOfHoursMinutes = ZoneOffset.UTC;
                } else {
                    zoneOffsetOfHoursMinutes = ZoneOffset.ofHoursMinutes(c36097d2.f154319a, c36097d2.f154320b);
                }
                return OffsetDateTime.of(c36094a.f154310x, c36094a.f154311y, c36094a.f154312z, c36094a.f154303E, c36094a.f154304F, c36094a.f154305G, c36094a.f154306H, zoneOffsetOfHoursMinutes);
            }
            i35 = AbstractC12682p.m35486f(i18)[AbstractC12682p.m35485e(i34) + 1];
            StringBuilder sb4 = new StringBuilder("Unexpected end of input, missing field ");
            switch (i35) {
                case 1:
                    str2 = "YEAR";
                    break;
                case 2:
                    str2 = "MONTH";
                    break;
                case 3:
                    str2 = "DAY";
                    break;
                case 4:
                    str2 = "HOUR";
                    break;
                case 5:
                    str2 = "MINUTE";
                    break;
                case 6:
                    str2 = "SECOND";
                    break;
                case 7:
                    str2 = "NANO";
                    break;
                case 8:
                    str2 = "ZONE_OFFSET";
                    break;
                default:
                    str2 = "null";
                    break;
            }
            sb4.append(str2);
            sb4.append(": ");
            sb4.append(str);
            String string2 = sb4.toString();
            switch (i34) {
                case 1:
                    i19 = i27;
                    break;
                case 2:
                    i19 = i17;
                    break;
                case 3:
                    i19 = 10;
                    break;
                case 4:
                    i19 = i25;
                    break;
                case 5:
                    i19 = i16;
                    break;
                case 6:
                    i19 = i24;
                    break;
                case 7:
                    i19 = 20;
                    break;
                case 8:
                    break;
                default:
                    throw null;
            }
            throw new DateTimeParseException(string2, str, i19);
        }
        i28 = 13;
        i29 = 8;
        i13 = 17;
        i14 = 19;
        i15 = 5;
        i17 = 7;
        i16 = 16;
        c36094a = new C36094a(1, iM123190b, 0, 0, 0, 0, 0, 0, null, 0);
        int i64 = i14;
        i25 = i28;
        i19 = i13;
        i18 = i29;
        i24 = i64;
        i27 = i36;
        c36097d = c36097d3;
        i26 = i37;
        iM35485e = AbstractC12682p.m35485e(i26);
        i34 = c36094a.f154309w;
        if (iM35485e <= AbstractC12682p.m35485e(i34)) {
            if (AbstractC12682p.m35485e(i15) <= AbstractC12682p.m35485e(i34)) {
                throw new DateTimeFormatException("No MINUTE field found");
            }
            c36097d2 = c36094a.f154307I;
            if (c36097d2 != null) {
                String string3 = c36094a.toString();
                throw new DateTimeParseException("No timezone information: ".concat(string3), string3, string3.length());
            }
            if (c36097d2.equals(c36097d)) {
                zoneOffsetOfHoursMinutes = ZoneOffset.UTC;
            } else {
                zoneOffsetOfHoursMinutes = ZoneOffset.ofHoursMinutes(c36097d2.f154319a, c36097d2.f154320b);
            }
            return OffsetDateTime.of(c36094a.f154310x, c36094a.f154311y, c36094a.f154312z, c36094a.f154303E, c36094a.f154304F, c36094a.f154305G, c36094a.f154306H, zoneOffsetOfHoursMinutes);
        }
        i35 = AbstractC12682p.m35486f(i18)[AbstractC12682p.m35485e(i34) + 1];
        StringBuilder sb5 = new StringBuilder("Unexpected end of input, missing field ");
        switch (i35) {
            case 1:
                str2 = "YEAR";
                break;
            case 2:
                str2 = "MONTH";
                break;
            case 3:
                str2 = "DAY";
                break;
            case 4:
                str2 = "HOUR";
                break;
            case 5:
                str2 = "MINUTE";
                break;
            case 6:
                str2 = "SECOND";
                break;
            case 7:
                str2 = "NANO";
                break;
            case 8:
                str2 = "ZONE_OFFSET";
                break;
            default:
                str2 = "null";
                break;
        }
        sb5.append(str2);
        sb5.append(": ");
        sb5.append(str);
        String string4 = sb5.toString();
        switch (i34) {
            case 1:
                i19 = i27;
                break;
            case 2:
                i19 = i17;
                break;
            case 3:
                i19 = 10;
                break;
            case 4:
                i19 = i25;
                break;
            case 5:
                i19 = i16;
                break;
            case 6:
                i19 = i24;
                break;
            case 7:
                i19 = 20;
                break;
            case 8:
                break;
            default:
                throw null;
        }
        throw new DateTimeParseException(string4, str, i19);
    }

    /* JADX INFO: renamed from: j */
    public static final C34774l m100977j(Integer num, Integer num2, Integer num3, C32404r c32404r, String str, boolean z4) {
        int iIntValue;
        C25271y c25271y;
        int iIntValue2 = (num != null ? num.intValue() : 1) + (z4 ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z4) {
                iIntValue++;
            }
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return m100978k(z4, c32404r, str, iIntValue2, iIntValue);
        }
        C34774l c34774lM100978k = m100978k(z4, c32404r, str, iIntValue2, iIntValue2);
        while (true) {
            c25271y = C25271y.f99162w;
            if (iIntValue2 >= iMin) {
                break;
            }
            iIntValue2++;
            c34774lM100978k = new C34774l(c25271y, AbstractC37056f.m118959K(m100978k(z4, c32404r, str, iIntValue2, iIntValue2), AbstractC32350a.m100696c(AbstractC37056f.m118959K(new C34774l(AbstractC37056f.m118958J(new C34775m(" ")), c25271y), c34774lM100978k))));
        }
        if (iIntValue3 > iIntValue) {
            return AbstractC32350a.m100696c(AbstractC37056f.m118959K(new C34774l(AbstractC37056f.m118958J(new C34775m(AbstractC39421y.m125925J(iIntValue3 - iIntValue, " "))), c25271y), c34774lM100978k));
        }
        return iIntValue3 == iIntValue ? c34774lM100978k : new C34774l(c25271y, AbstractC37056f.m118959K(m100978k(z4, c32404r, str, iIntValue3 + 1, iIntValue), c34774lM100978k));
    }

    /* JADX INFO: renamed from: k */
    public static final C34774l m100978k(boolean z4, C32404r c32404r, String str, int i13, int i14) {
        if (i14 < (z4 ? 1 : 0) + 1) {
            throw new IllegalStateException("Check failed.");
        }
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        if (z4) {
            c26460cM119000x.add(new C34775m("-"));
        }
        c26460cM119000x.add(new C34768f(AbstractC37056f.m118958J(new C34779q(Integer.valueOf(i13 - (z4 ? 1 : 0)), Integer.valueOf(i14 - (z4 ? 1 : 0)), c32404r, str, z4))));
        return new C34774l(AbstractC37056f.m118988k(c26460cM119000x), C25271y.f99162w);
    }

    /* JADX INFO: renamed from: l */
    public static final C39011z1 m100979l(C16744u2 c16744u2) {
        InterfaceC16702n2 interfaceC16702n2 = c16744u2.f64307F;
        if (!(interfaceC16702n2 instanceof C16696m2)) {
            if (interfaceC16702n2 instanceof C16690l2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        C16732s2 c16732s2 = ((C16696m2) interfaceC16702n2).f64220w;
        if (c16732s2 == null) {
            return null;
        }
        return new C39011z1(c16732s2.f64283x, c16732s2.f64284y);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00df -> B:41:0x00e7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: m */
    public static final java.lang.Object m100980m(p615xh.C38294a r11, fi.C14503i r12, fi.C14509o r13, p461rh.C31417f r14, s83.AbstractC32269c r15) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc3.AbstractC32398l.m100980m(xh.a, fi.i, fi.o, rh.f, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: n */
    public static final void m100981n(MediaStreamTrack mediaStreamTrack, boolean z4) {
        AbstractC22676k.m65750j(mediaStreamTrack, "<this>");
        try {
            mediaStreamTrack.setEnabled(z4);
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            if (C2343i.f9272d.isLoggable(EnumC2341g.ERROR, "SafeCall")) {
                C2343i c2343i2 = C2343i.f9269a;
                C2343i.f9271c.log(EnumC2341g.ERROR, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            }
        }
    }
}
