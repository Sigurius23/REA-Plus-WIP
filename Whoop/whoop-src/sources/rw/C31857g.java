package rw;

import androidx.health.platform.client.proto.C1533u;
import com.nimbusds.jose.shaded.gson.JsonIOException;
import com.nimbusds.jose.shaded.gson.JsonSyntaxException;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import live.hms.video.factories.MediaConstraintsFactory;
import p000.AbstractC11266d;
import p108e4.AbstractC12682p;
import p384ow.AbstractC28420p;
import p384ow.AbstractC28430z;
import p384ow.C28419o;
import p384ow.C28421q;
import p384ow.C28422r;
import p384ow.C28423s;
import p440qw.AbstractC30672g;
import p440qw.AbstractC30677l;
import p440qw.C30674i;
import p440qw.C30675j;
import p440qw.C30676k;
import p440qw.C30678m;
import p555vl.AbstractC36095b;
import p596ww.C37653a;
import p596ww.C37654b;

/* JADX INFO: renamed from: rw.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C31857g extends AbstractC28430z {

    /* JADX INFO: renamed from: b */
    public static final C31857g f132120b = new C31857g(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f132121a;

    public /* synthetic */ C31857g(int i13) {
        this.f132121a = i13;
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC28420p m99044d(C37653a c37653a, int i13) {
        int iM35485e = AbstractC12682p.m35485e(i13);
        if (iM35485e == 5) {
            return new C28423s(c37653a.nextString());
        }
        if (iM35485e == 6) {
            return new C28423s(new C30674i(c37653a.nextString()));
        }
        if (iM35485e == 7) {
            return new C28423s(Boolean.valueOf(c37653a.m121065x()));
        }
        if (iM35485e != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC36095b.m114672B(i13)));
        }
        c37653a.m121053T();
        return C28421q.f114642w;
    }

    /* JADX INFO: renamed from: e */
    public static void m99045e(C37654b c37654b, AbstractC28420p abstractC28420p) throws IOException {
        if (abstractC28420p == null || (abstractC28420p instanceof C28421q)) {
            c37654b.m121076m();
            return;
        }
        boolean z4 = abstractC28420p instanceof C28423s;
        if (z4) {
            if (!z4) {
                throw new IllegalStateException("Not a JSON Primitive: " + abstractC28420p);
            }
            C28423s c28423s = (C28423s) abstractC28420p;
            Serializable serializable = c28423s.f114644w;
            if (serializable instanceof Number) {
                c37654b.m121077o0(c28423s.m86141c());
                return;
            } else if (serializable instanceof Boolean) {
                c37654b.m121081x0(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(c28423s.m86142d()));
                return;
            } else {
                c37654b.m121078p0(c28423s.m86142d());
                return;
            }
        }
        boolean z13 = abstractC28420p instanceof C28419o;
        if (z13) {
            c37654b.beginArray();
            if (!z13) {
                throw new IllegalStateException("Not a JSON Array: " + abstractC28420p);
            }
            Iterator it = ((C28419o) abstractC28420p).f114641w.iterator();
            while (it.hasNext()) {
                m99045e(c37654b, (AbstractC28420p) it.next());
            }
            c37654b.endArray();
            return;
        }
        boolean z14 = abstractC28420p instanceof C28422r;
        if (!z14) {
            throw new IllegalArgumentException("Couldn't write " + abstractC28420p.getClass());
        }
        c37654b.beginObject();
        if (!z14) {
            throw new IllegalStateException("Not a JSON Object: " + abstractC28420p);
        }
        Iterator it3 = ((C30676k) ((C28422r) abstractC28420p).f114643w.entrySet()).iterator();
        while (((AbstractC30677l) it3).hasNext()) {
            C30678m c30678mM94277a = ((C30675j) it3).m94277a();
            c37654b.m121074i((String) c30678mM94277a.getKey());
            m99045e(c37654b, (AbstractC28420p) c30678mM94277a.getValue());
        }
        c37654b.endObject();
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: b */
    public final Object mo86132b(C37653a c37653a) {
        AbstractC28420p c28419o;
        AbstractC28420p c28419o2;
        boolean zM121065x;
        switch (this.f132121a) {
            case 0:
                int iM121062o0 = c37653a.m121062o0();
                int iM35485e = AbstractC12682p.m35485e(iM121062o0);
                if (iM35485e == 0) {
                    c37653a.beginArray();
                    c28419o = new C28419o();
                } else if (iM35485e != 2) {
                    c28419o = null;
                } else {
                    c37653a.beginObject();
                    c28419o = new C28422r();
                }
                if (c28419o == null) {
                    return m99044d(c37653a, iM121062o0);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (c37653a.hasNext()) {
                        String strNextName = c28419o instanceof C28422r ? c37653a.nextName() : null;
                        int iM121062o1 = c37653a.m121062o0();
                        int iM35485e2 = AbstractC12682p.m35485e(iM121062o1);
                        if (iM35485e2 == 0) {
                            c37653a.beginArray();
                            c28419o2 = new C28419o();
                        } else if (iM35485e2 != 2) {
                            c28419o2 = null;
                        } else {
                            c37653a.beginObject();
                            c28419o2 = new C28422r();
                        }
                        boolean z4 = c28419o2 != null;
                        if (c28419o2 == null) {
                            c28419o2 = m99044d(c37653a, iM121062o1);
                        }
                        if (c28419o instanceof C28419o) {
                            ((C28419o) c28419o).f114641w.add(c28419o2);
                        } else {
                            ((C28422r) c28419o).f114643w.put(strNextName, c28419o2);
                        }
                        if (z4) {
                            arrayDeque.addLast(c28419o);
                            c28419o = c28419o2;
                        }
                    } else {
                        if (c28419o instanceof C28419o) {
                            c37653a.endArray();
                        } else {
                            c37653a.endObject();
                        }
                        if (arrayDeque.isEmpty()) {
                            return c28419o;
                        }
                        c28419o = (AbstractC28420p) arrayDeque.removeLast();
                    }
                }
                break;
            case 1:
                c37653a.skipValue();
                return null;
            case 2:
                ArrayList arrayList = new ArrayList();
                c37653a.beginArray();
                while (c37653a.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(c37653a.nextInt()));
                    } catch (NumberFormatException e5) {
                        throw new JsonSyntaxException(e5);
                    }
                }
                c37653a.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i13 = 0; i13 < size; i13++) {
                    atomicIntegerArray.set(i13, ((Integer) arrayList.get(i13)).intValue());
                }
                return atomicIntegerArray;
            case 3:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                try {
                    return Long.valueOf(c37653a.nextLong());
                } catch (NumberFormatException e13) {
                    throw new JsonSyntaxException(e13);
                }
            case 4:
                if (c37653a.m121062o0() != 9) {
                    return Float.valueOf((float) c37653a.nextDouble());
                }
                c37653a.m121053T();
                return null;
            case 5:
                if (c37653a.m121062o0() != 9) {
                    return Double.valueOf(c37653a.nextDouble());
                }
                c37653a.m121053T();
                return null;
            case 6:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                String strNextString = c37653a.nextString();
                if (strNextString.length() == 1) {
                    return Character.valueOf(strNextString.charAt(0));
                }
                StringBuilder sbM53375p = AbstractC18489d0.m53375p("Expecting character, got: ", strNextString, "; at ");
                sbM53375p.append(c37653a.m121060k(true));
                throw new JsonSyntaxException(sbM53375p.toString());
            case 7:
                int iM121062o2 = c37653a.m121062o0();
                if (iM121062o2 != 9) {
                    return iM121062o2 == 8 ? Boolean.toString(c37653a.m121065x()) : c37653a.nextString();
                }
                c37653a.m121053T();
                return null;
            case 8:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                String strNextString2 = c37653a.nextString();
                try {
                    return AbstractC30672g.m94273i(strNextString2);
                } catch (NumberFormatException e14) {
                    StringBuilder sbM53375p2 = AbstractC18489d0.m53375p("Failed parsing '", strNextString2, "' as BigDecimal; at path ");
                    sbM53375p2.append(c37653a.m121060k(true));
                    throw new JsonSyntaxException(sbM53375p2.toString(), e14);
                }
            case 9:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                String strNextString3 = c37653a.nextString();
                try {
                    AbstractC30672g.m94268d(strNextString3);
                    return new BigInteger(strNextString3);
                } catch (NumberFormatException e15) {
                    StringBuilder sbM53375p3 = AbstractC18489d0.m53375p("Failed parsing '", strNextString3, "' as BigInteger; at path ");
                    sbM53375p3.append(c37653a.m121060k(true));
                    throw new JsonSyntaxException(sbM53375p3.toString(), e15);
                }
            case 10:
                if (c37653a.m121062o0() != 9) {
                    return new C30674i(c37653a.nextString());
                }
                c37653a.m121053T();
                return null;
            case 11:
                if (c37653a.m121062o0() != 9) {
                    return new StringBuilder(c37653a.nextString());
                }
                c37653a.m121053T();
                return null;
            case 12:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
            case 13:
                if (c37653a.m121062o0() != 9) {
                    return new StringBuffer(c37653a.nextString());
                }
                c37653a.m121053T();
                return null;
            case 14:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                String strNextString4 = c37653a.nextString();
                if (strNextString4.equals("null")) {
                    return null;
                }
                return new URL(strNextString4);
            case 15:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                try {
                    String strNextString5 = c37653a.nextString();
                    if (strNextString5.equals("null")) {
                        return null;
                    }
                    return new URI(strNextString5);
                } catch (URISyntaxException e16) {
                    throw new JsonIOException(e16);
                }
            case 16:
                if (c37653a.m121062o0() != 9) {
                    return InetAddress.getByName(c37653a.nextString());
                }
                c37653a.m121053T();
                return null;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                String strNextString6 = c37653a.nextString();
                try {
                    return UUID.fromString(strNextString6);
                } catch (IllegalArgumentException e17) {
                    StringBuilder sbM53375p4 = AbstractC18489d0.m53375p("Failed parsing '", strNextString6, "' as UUID; at path ");
                    sbM53375p4.append(c37653a.m121060k(true));
                    throw new JsonSyntaxException(sbM53375p4.toString(), e17);
                }
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                String strNextString7 = c37653a.nextString();
                try {
                    return Currency.getInstance(strNextString7);
                } catch (IllegalArgumentException e18) {
                    StringBuilder sbM53375p5 = AbstractC18489d0.m53375p("Failed parsing '", strNextString7, "' as Currency; at path ");
                    sbM53375p5.append(c37653a.m121060k(true));
                    throw new JsonSyntaxException(sbM53375p5.toString(), e18);
                }
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                c37653a.beginObject();
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (c37653a.m121062o0() == 4) {
                        c37653a.endObject();
                        return new GregorianCalendar(i14, i15, i16, i17, i18, i19);
                    }
                    String strNextName2 = c37653a.nextName();
                    int iNextInt = c37653a.nextInt();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "dayOfMonth":
                            i16 = iNextInt;
                            break;
                        case "minute":
                            i18 = iNextInt;
                            break;
                        case "second":
                            i19 = iNextInt;
                            break;
                        case "year":
                            i14 = iNextInt;
                            break;
                        case "month":
                            i15 = iNextInt;
                            break;
                        case "hourOfDay":
                            i17 = iNextInt;
                            break;
                    }
                }
                break;
            case 20:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(c37653a.nextString(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case 21:
                BitSet bitSet = new BitSet();
                c37653a.beginArray();
                int iM121062o3 = c37653a.m121062o0();
                int i24 = 0;
                while (iM121062o3 != 2) {
                    int iM35485e3 = AbstractC12682p.m35485e(iM121062o3);
                    if (iM35485e3 == 5 || iM35485e3 == 6) {
                        int iNextInt2 = c37653a.nextInt();
                        if (iNextInt2 == 0) {
                            zM121065x = false;
                        } else {
                            if (iNextInt2 != 1) {
                                StringBuilder sbM30466t = AbstractC11266d.m30466t(iNextInt2, "Invalid bitset value ", ", expected 0 or 1; at path ");
                                sbM30466t.append(c37653a.m121060k(true));
                                throw new JsonSyntaxException(sbM30466t.toString());
                            }
                            zM121065x = true;
                        }
                    } else {
                        if (iM35485e3 != 7) {
                            throw new JsonSyntaxException("Invalid bitset value type: " + AbstractC36095b.m114672B(iM121062o3) + "; at path " + c37653a.m121060k(false));
                        }
                        zM121065x = c37653a.m121065x();
                    }
                    if (zM121065x) {
                        bitSet.set(i24);
                    }
                    i24++;
                    iM121062o3 = c37653a.m121062o0();
                }
                c37653a.endArray();
                return bitSet;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iM121062o4 = c37653a.m121062o0();
                if (iM121062o4 != 9) {
                    return iM121062o4 == 6 ? Boolean.valueOf(Boolean.parseBoolean(c37653a.nextString())) : Boolean.valueOf(c37653a.m121065x());
                }
                c37653a.m121053T();
                return null;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                if (c37653a.m121062o0() != 9) {
                    return Boolean.valueOf(c37653a.nextString());
                }
                c37653a.m121053T();
                return null;
            case 24:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                try {
                    int iNextInt3 = c37653a.nextInt();
                    if (iNextInt3 <= 255 && iNextInt3 >= -128) {
                        return Byte.valueOf((byte) iNextInt3);
                    }
                    StringBuilder sbM30466t2 = AbstractC11266d.m30466t(iNextInt3, "Lossy conversion from ", " to byte; at path ");
                    sbM30466t2.append(c37653a.m121060k(true));
                    throw new JsonSyntaxException(sbM30466t2.toString());
                } catch (NumberFormatException e19) {
                    throw new JsonSyntaxException(e19);
                }
            case 25:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                try {
                    int iNextInt4 = c37653a.nextInt();
                    if (iNextInt4 <= 65535 && iNextInt4 >= -32768) {
                        return Short.valueOf((short) iNextInt4);
                    }
                    StringBuilder sbM30466t3 = AbstractC11266d.m30466t(iNextInt4, "Lossy conversion from ", " to short; at path ");
                    sbM30466t3.append(c37653a.m121060k(true));
                    throw new JsonSyntaxException(sbM30466t3.toString());
                } catch (NumberFormatException e22) {
                    throw new JsonSyntaxException(e22);
                }
            case 26:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                try {
                    return Integer.valueOf(c37653a.nextInt());
                } catch (NumberFormatException e24) {
                    throw new JsonSyntaxException(e24);
                }
            case 27:
                try {
                    return new AtomicInteger(c37653a.nextInt());
                } catch (NumberFormatException e25) {
                    throw new JsonSyntaxException(e25);
                }
            default:
                return new AtomicBoolean(c37653a.m121065x());
        }
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: c */
    public final void mo86133c(C37654b c37654b, Object obj) throws IOException {
        switch (this.f132121a) {
            case 0:
                m99045e(c37654b, (AbstractC28420p) obj);
                return;
            case 1:
                c37654b.m121076m();
                return;
            case 2:
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                c37654b.beginArray();
                int length = atomicIntegerArray.length();
                for (int i13 = 0; i13 < length; i13++) {
                    c37654b.m121072b0(atomicIntegerArray.get(i13));
                }
                c37654b.endArray();
                return;
            case 3:
                Number number = (Number) obj;
                if (number == null) {
                    c37654b.m121076m();
                    return;
                } else {
                    c37654b.m121072b0(number.longValue());
                    return;
                }
            case 4:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    c37654b.m121076m();
                    return;
                }
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(numberValueOf.floatValue());
                }
                c37654b.m121077o0(numberValueOf);
                return;
            case 5:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    c37654b.m121076m();
                    return;
                } else {
                    c37654b.m121070a0(number2.doubleValue());
                    return;
                }
            case 6:
                Character ch4 = (Character) obj;
                c37654b.m121078p0(ch4 == null ? null : String.valueOf(ch4));
                return;
            case 7:
                c37654b.m121078p0((String) obj);
                return;
            case 8:
                c37654b.m121077o0((BigDecimal) obj);
                return;
            case 9:
                c37654b.m121077o0((BigInteger) obj);
                return;
            case 10:
                c37654b.m121077o0((C30674i) obj);
                return;
            case 11:
                StringBuilder sb4 = (StringBuilder) obj;
                c37654b.m121078p0(sb4 == null ? null : sb4.toString());
                return;
            case 12:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
            case 13:
                StringBuffer stringBuffer = (StringBuffer) obj;
                c37654b.m121078p0(stringBuffer == null ? null : stringBuffer.toString());
                return;
            case 14:
                URL url = (URL) obj;
                c37654b.m121078p0(url == null ? null : url.toExternalForm());
                return;
            case 15:
                URI uri = (URI) obj;
                c37654b.m121078p0(uri == null ? null : uri.toASCIIString());
                return;
            case 16:
                InetAddress inetAddress = (InetAddress) obj;
                c37654b.m121078p0(inetAddress == null ? null : inetAddress.getHostAddress());
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                UUID uuid = (UUID) obj;
                c37654b.m121078p0(uuid == null ? null : uuid.toString());
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                c37654b.m121078p0(((Currency) obj).getCurrencyCode());
                return;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    c37654b.m121076m();
                    return;
                }
                c37654b.beginObject();
                c37654b.m121074i("year");
                c37654b.m121072b0(calendar.get(1));
                c37654b.m121074i("month");
                c37654b.m121072b0(calendar.get(2));
                c37654b.m121074i("dayOfMonth");
                c37654b.m121072b0(calendar.get(5));
                c37654b.m121074i("hourOfDay");
                c37654b.m121072b0(calendar.get(11));
                c37654b.m121074i("minute");
                c37654b.m121072b0(calendar.get(12));
                c37654b.m121074i("second");
                c37654b.m121072b0(calendar.get(13));
                c37654b.endObject();
                return;
            case 20:
                Locale locale = (Locale) obj;
                c37654b.m121078p0(locale == null ? null : locale.toString());
                return;
            case 21:
                BitSet bitSet = (BitSet) obj;
                c37654b.beginArray();
                int length2 = bitSet.length();
                for (int i14 = 0; i14 < length2; i14++) {
                    c37654b.m121072b0(bitSet.get(i14) ? 1L : 0L);
                }
                c37654b.endArray();
                return;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    c37654b.m121076m();
                    return;
                }
                c37654b.m121067F0();
                c37654b.m121071b();
                c37654b.f161387w.write(bool.booleanValue() ? MediaConstraintsFactory.kValueTrue : MediaConstraintsFactory.kValueFalse);
                return;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                Boolean bool2 = (Boolean) obj;
                c37654b.m121078p0(bool2 == null ? "null" : bool2.toString());
                return;
            case 24:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    c37654b.m121076m();
                    return;
                } else {
                    c37654b.m121072b0(number3.byteValue());
                    return;
                }
            case 25:
                Number number4 = (Number) obj;
                if (number4 == null) {
                    c37654b.m121076m();
                    return;
                } else {
                    c37654b.m121072b0(number4.shortValue());
                    return;
                }
            case 26:
                Number number5 = (Number) obj;
                if (number5 == null) {
                    c37654b.m121076m();
                    return;
                } else {
                    c37654b.m121072b0(number5.intValue());
                    return;
                }
            case 27:
                c37654b.m121072b0(((AtomicInteger) obj).get());
                return;
            default:
                c37654b.m121081x0(((AtomicBoolean) obj).get());
                return;
        }
    }

    public String toString() {
        switch (this.f132121a) {
            case 1:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
