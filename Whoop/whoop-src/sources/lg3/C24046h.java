package lg3;

import com.squareup.wire.AbstractC5583n;
import g73.C15553a;
import io.getstream.chat.android.client.ChatClient;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import jg3.AbstractC21688o;
import jg3.C21677d;
import jg3.C21678e;
import jg3.C21679f;
import jg3.C21689p;
import ng3.EnumC26688a;
import ng3.InterfaceC26698k;
import og3.C27925d;
import org.threeten.p379bp.DateTimeException;
import p012ab.C0682h0;
import p497t7.InterfaceC33561b;
import p715kotlin.time.DurationKt;

/* JADX INFO: renamed from: lg3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C24046h implements InterfaceC24044f {

    /* JADX INFO: renamed from: x */
    public static volatile AbstractMap.SimpleImmutableEntry f95032x;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95033w;

    public /* synthetic */ C24046h(int i13) {
        this.f95033w = i13;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC21688o m70948c(boolean z4, String str, Set set) {
        if (str == null) {
            return null;
        }
        if (z4) {
            if (set.contains(str)) {
                return AbstractC21688o.m61069l(str);
            }
            return null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.equalsIgnoreCase(str)) {
                return AbstractC21688o.m61069l(str2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static int m70949d(C24055q c24055q, CharSequence charSequence, int i13, int i14) {
        String upperCase = charSequence.subSequence(i13, i14).toString().toUpperCase();
        C24055q c24055q2 = new C24055q(c24055q);
        if (i14 < charSequence.length() && c24055q.m70967a(charSequence.charAt(i14), 'Z')) {
            c24055q.m70973j(AbstractC21688o.m61070m(upperCase, C21689p.f83278F));
            return i14;
        }
        int iMo70946a = C24048j.f95041z.mo70946a(c24055q2, charSequence, i14);
        if (iMo70946a < 0) {
            c24055q.m70973j(AbstractC21688o.m61070m(upperCase, C21689p.f83278F));
            return i14;
        }
        c24055q.m70973j(AbstractC21688o.m61070m(upperCase, C21689p.m61076r((int) c24055q2.m70971h(EnumC26688a.OFFSET_SECONDS).longValue())));
        return iMo70946a;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0135  */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:69:0x014b  */
    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: a */
    public final int mo70946a(C24055q c24055q, CharSequence charSequence, int i13) {
        AbstractC21688o abstractC21688oM70948c;
        int i14;
        int i15 = 1;
        switch (this.f95033w) {
            case 0:
                C24055q c24055q2 = new C24055q(c24055q);
                C24053o c24053o = new C24053o();
                c24053o.m70952a(C24040b.f95016f);
                c24053o.m70954c('T');
                EnumC26688a enumC26688a = EnumC26688a.HOUR_OF_DAY;
                c24053o.m70958g(enumC26688a, 2);
                c24053o.m70954c(':');
                EnumC26688a enumC26688a2 = EnumC26688a.MINUTE_OF_HOUR;
                c24053o.m70958g(enumC26688a2, 2);
                c24053o.m70954c(':');
                EnumC26688a enumC26688a3 = EnumC26688a.SECOND_OF_MINUTE;
                c24053o.m70958g(enumC26688a3, 2);
                EnumC26688a enumC26688a4 = EnumC26688a.NANO_OF_SECOND;
                c24053o.m70953b(new C24045g(enumC26688a4));
                c24053o.m70954c('Z');
                C24043e c24043e = c24053o.m70962k().f95020a;
                if (c24043e.f95028x) {
                    c24043e = new C24043e(c24043e.f95027w, false);
                }
                int iMo70946a = c24043e.mo70946a(c24055q2, charSequence, i13);
                if (iMo70946a < 0) {
                    return iMo70946a;
                }
                long jLongValue = c24055q2.m70971h(EnumC26688a.YEAR).longValue();
                int iIntValue = c24055q2.m70971h(EnumC26688a.MONTH_OF_YEAR).intValue();
                int iIntValue2 = c24055q2.m70971h(EnumC26688a.DAY_OF_MONTH).intValue();
                int iIntValue3 = c24055q2.m70971h(enumC26688a).intValue();
                int iIntValue4 = c24055q2.m70971h(enumC26688a2).intValue();
                Long lM70971h = c24055q2.m70971h(enumC26688a3);
                Long lM70971h2 = c24055q2.m70971h(enumC26688a4);
                int iIntValue5 = lM70971h != null ? lM70971h.intValue() : 0;
                int iIntValue6 = lM70971h2 != null ? lM70971h2.intValue() : 0;
                int i16 = ((int) jLongValue) % InterfaceC33561b.INVALID_OWNERSHIP;
                if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
                    iIntValue3 = 0;
                } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
                    c24055q.m70969c().f95064H = true;
                    i15 = 0;
                    iIntValue5 = 59;
                } else {
                    i15 = 0;
                }
                try {
                    C21678e c21678e = C21678e.f83243H;
                    C21677d c21677dM61003t0 = C21677d.m61003t0(i16, iIntValue, iIntValue2);
                    C21679f c21679fM61032t0 = C21679f.m61032t0(iIntValue3, iIntValue4, iIntValue5, 0);
                    return c24055q.m70974k(enumC26688a4, iIntValue6, i13, c24055q.m70974k(EnumC26688a.INSTANT_SECONDS, new C21678e(c21677dM61003t0, c21679fM61032t0).m61027z0(c21677dM61003t0.m61014x0(i15), c21679fM61032t0).m64905o0(C21689p.f83278F) + AbstractC5583n.m16765Y(jLongValue / ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, 315569520000L), i13, iMo70946a));
                } catch (RuntimeException unused) {
                    return ~i13;
                }
            default:
                int length = charSequence.length();
                if (i13 > length) {
                    throw new IndexOutOfBoundsException();
                }
                if (i13 != length) {
                    char cCharAt = charSequence.charAt(i13);
                    if (cCharAt == '+' || cCharAt == '-') {
                        C24055q c24055q3 = new C24055q(c24055q);
                        int iMo70946a2 = C24048j.f95041z.mo70946a(c24055q3, charSequence, i13);
                        if (iMo70946a2 < 0) {
                            return iMo70946a2;
                        }
                        c24055q.m70973j(C21689p.m61076r((int) c24055q3.m70971h(EnumC26688a.OFFSET_SECONDS).longValue()));
                        return iMo70946a2;
                    }
                    int i17 = i13 + 2;
                    if (length >= i17) {
                        char cCharAt2 = charSequence.charAt(i13 + 1);
                        if (c24055q.m70967a(cCharAt, 'U') && c24055q.m70967a(cCharAt2, 'T')) {
                            int i18 = i13 + 3;
                            return (length < i18 || !c24055q.m70967a(charSequence.charAt(i17), 'C')) ? m70949d(c24055q, charSequence, i13, i17) : m70949d(c24055q, charSequence, i13, i18);
                        }
                        if (c24055q.m70967a(cCharAt, 'G') && length >= (i14 = i13 + 3) && c24055q.m70967a(cCharAt2, 'M') && c24055q.m70967a(charSequence.charAt(i17), 'T')) {
                            return m70949d(c24055q, charSequence, i13, i14);
                        }
                    }
                    Set setUnmodifiableSet = Collections.unmodifiableSet(C27925d.f112631d.keySet());
                    int size = setUnmodifiableSet.size();
                    AbstractMap.SimpleImmutableEntry simpleImmutableEntry = f95032x;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        synchronized (this) {
                            try {
                                simpleImmutableEntry = f95032x;
                                if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                                    Integer numValueOf = Integer.valueOf(size);
                                    ArrayList arrayList = new ArrayList(setUnmodifiableSet);
                                    Collections.sort(arrayList, C24053o.f95056g);
                                    C24052n c24052n = new C24052n(((String) arrayList.get(0)).length());
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        c24052n.m70951a((String) it.next());
                                    }
                                    simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, c24052n);
                                    f95032x = simpleImmutableEntry;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                            break;
                        }
                    }
                    C24052n c24052n2 = (C24052n) simpleImmutableEntry.getValue();
                    String str = null;
                    String str2 = null;
                    while (c24052n2 != null) {
                        int i19 = c24052n2.f95052a + i13;
                        if (i19 > length) {
                            abstractC21688oM70948c = m70948c(c24055q.f95068b, str, setUnmodifiableSet);
                            if (abstractC21688oM70948c == null) {
                                abstractC21688oM70948c = m70948c(c24055q.f95068b, str2, setUnmodifiableSet);
                                if (abstractC21688oM70948c == null) {
                                    str = str2;
                                } else if (c24055q.m70967a(cCharAt, 'Z')) {
                                    c24055q.m70973j(C21689p.f83278F);
                                    return i13 + 1;
                                }
                            }
                            c24055q.m70973j(abstractC21688oM70948c);
                            return str.length() + i13;
                        }
                        String string = charSequence.subSequence(i13, i19).toString();
                        c24052n2 = (C24052n) (c24055q.f95068b ? c24052n2.f95053b.get(string) : c24052n2.f95054c.get(string.toString().toLowerCase(Locale.ENGLISH)));
                        str2 = str;
                        str = string;
                    }
                    abstractC21688oM70948c = m70948c(c24055q.f95068b, str, setUnmodifiableSet);
                    if (abstractC21688oM70948c == null) {
                        abstractC21688oM70948c = m70948c(c24055q.f95068b, str2, setUnmodifiableSet);
                        if (abstractC21688oM70948c == null) {
                            str = str2;
                        } else if (c24055q.m70967a(cCharAt, 'Z')) {
                            c24055q.m70973j(C21689p.f83278F);
                            return i13 + 1;
                        }
                    }
                    c24055q.m70973j(abstractC21688oM70948c);
                    return str.length() + i13;
                }
                return ~i13;
        }
    }

    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: b */
    public final boolean mo70947b(C0682h0 c0682h0, StringBuilder sb4) {
        switch (this.f95033w) {
            case 0:
                Long lM1703r = c0682h0.m1703r(EnumC26688a.INSTANT_SECONDS);
                InterfaceC26698k interfaceC26698k = (InterfaceC26698k) c0682h0.f2433y;
                EnumC26688a enumC26688a = EnumC26688a.NANO_OF_SECOND;
                Long lValueOf = interfaceC26698k.mo60986a(enumC26688a) ? Long.valueOf(interfaceC26698k.mo60987h(enumC26688a)) : 0L;
                if (lM1703r == null) {
                    return false;
                }
                long jLongValue = lM1703r.longValue();
                int iM79420a = enumC26688a.f106174x.m79420a(lValueOf.longValue(), enumC26688a);
                if (jLongValue >= -62167219200L) {
                    long j7 = jLongValue - 253402300800L;
                    long jM16742A = AbstractC5583n.m16742A(j7, 315569520000L) + 1;
                    C21678e c21678eM61019u0 = C21678e.m61019u0((((j7 % 315569520000L) + 315569520000L) % 315569520000L) - 62167219200L, 0, C21689p.f83278F);
                    if (jM16742A > 0) {
                        sb4.append('+');
                        sb4.append(jM16742A);
                    }
                    sb4.append(c21678eM61019u0);
                    if (c21678eM61019u0.f83247G.f83253H == 0) {
                        sb4.append(":00");
                    }
                } else {
                    long j13 = jLongValue + 62167219200L;
                    long j14 = j13 / 315569520000L;
                    long j15 = j13 % 315569520000L;
                    C21678e c21678eM61019u1 = C21678e.m61019u0(j15 - 62167219200L, 0, C21689p.f83278F);
                    int length = sb4.length();
                    sb4.append(c21678eM61019u1);
                    if (c21678eM61019u1.f83247G.f83253H == 0) {
                        sb4.append(":00");
                    }
                    if (j14 < 0) {
                        if (c21678eM61019u1.f83246F.f83240F == -10000) {
                            sb4.replace(length, length + 2, Long.toString(j14 - 1));
                        } else if (j15 == 0) {
                            sb4.insert(length, j14);
                        } else {
                            sb4.insert(length + 1, Math.abs(j14));
                        }
                    }
                }
                if (iM79420a != 0) {
                    sb4.append('.');
                    if (iM79420a % DurationKt.NANOS_IN_MILLIS == 0) {
                        sb4.append(Integer.toString((iM79420a / DurationKt.NANOS_IN_MILLIS) + 1000).substring(1));
                    } else if (iM79420a % 1000 == 0) {
                        sb4.append(Integer.toString((iM79420a / 1000) + DurationKt.NANOS_IN_MILLIS).substring(1));
                    } else {
                        sb4.append(Integer.toString(iM79420a + 1000000000).substring(1));
                    }
                }
                sb4.append('Z');
                return true;
            default:
                C15553a c15553a = C24053o.f95055f;
                InterfaceC26698k interfaceC26698k2 = (InterfaceC26698k) c0682h0.f2433y;
                Object objMo14019g = interfaceC26698k2.mo14019g(c15553a);
                if (objMo14019g == null && c0682h0.f2432x == 0) {
                    throw new DateTimeException("Unable to extract value: " + interfaceC26698k2.getClass());
                }
                AbstractC21688o abstractC21688o = (AbstractC21688o) objMo14019g;
                if (abstractC21688o == null) {
                    return false;
                }
                sb4.append(abstractC21688o.getId());
                return true;
        }
    }

    public final String toString() {
        switch (this.f95033w) {
            case 0:
                return "Instant()";
            default:
                return "ZoneRegionId()";
        }
    }
}
