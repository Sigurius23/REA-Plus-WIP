package com.squareup.wire;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import ne3.AbstractC26604b;
import ne3.C26624l;
import ne3.InterfaceC26620j;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.squareup.wire.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C5571b extends AbstractC5586q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22084a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5571b(EnumC5573d enumC5573d, InterfaceC21461d interfaceC21461d, String str, EnumC5593x enumC5593x, int i13) {
        super(enumC5573d, interfaceC21461d, str, enumC5593x);
        this.f22084a = i13;
    }

    /* JADX INFO: renamed from: a */
    public static int m16737a(Duration duration) {
        return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getNano() : duration.getNano() - 1000000000;
    }

    /* JADX INFO: renamed from: b */
    public static long m16738b(Duration duration) {
        return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getSeconds() : duration.getSeconds() + 1;
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final Object decode(C5587r reader) throws IOException {
        switch (this.f22084a) {
            case 0:
                AbstractC22676k.m65750j(reader, "reader");
                return Double.valueOf(Double.longBitsToDouble(reader.m16812i()));
            case 1:
                AbstractC22676k.m65750j(reader, "reader");
                return Float.valueOf(Float.intBitsToFloat(reader.m16811h()));
            case 2:
                AbstractC22676k.m65750j(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                AbstractC22676k.m65750j(reader, "reader");
                return Boolean.valueOf(reader.m16814k() != 0);
            case 4:
                AbstractC22676k.m65750j(reader, "reader");
                long jM16806c = reader.m16806c();
                InterfaceC26620j interfaceC26620j = reader.f22106a;
                interfaceC26620j.mo79207g0(jM16806c);
                return interfaceC26620j.mo79218m0(jM16806c);
            case 5:
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                long jLongValue = 0;
                int iIntValue = 0;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        reader.m16808e(jM16807d);
                        Duration durationOfSeconds = Duration.ofSeconds(jLongValue, iIntValue);
                        AbstractC22676k.m65749i(durationOfSeconds, "ofSeconds(seconds, nano)");
                        return durationOfSeconds;
                    }
                    if (iM16810g == 1) {
                        jLongValue = ((Number) AbstractC5586q.INT64.decode(reader)).longValue();
                    } else if (iM16810g != 2) {
                        reader.m16813j(iM16810g);
                    } else {
                        iIntValue = ((Number) AbstractC5586q.INT32.decode(reader)).intValue();
                    }
                }
                break;
            case 6:
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d2 = reader.m16807d();
                while (true) {
                    int iM16810g2 = reader.m16810g();
                    if (iM16810g2 == -1) {
                        reader.m16808e(jM16807d2);
                        return C23454a0.f92919a;
                    }
                    reader.m16813j(iM16810g2);
                }
                break;
            case 7:
                AbstractC22676k.m65750j(reader, "reader");
                return Integer.valueOf(reader.m16811h());
            case 8:
                AbstractC22676k.m65750j(reader, "reader");
                return Long.valueOf(reader.m16812i());
            case 9:
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d3 = reader.m16807d();
                long jLongValue2 = 0;
                int iIntValue2 = 0;
                while (true) {
                    int iM16810g3 = reader.m16810g();
                    if (iM16810g3 == -1) {
                        reader.m16808e(jM16807d3);
                        Instant instantOfEpochSecond = Instant.ofEpochSecond(jLongValue2, iIntValue2);
                        AbstractC22676k.m65749i(instantOfEpochSecond, "ofEpochSecond(epochSecond, nano)");
                        return instantOfEpochSecond;
                    }
                    if (iM16810g3 == 1) {
                        jLongValue2 = ((Number) AbstractC5586q.INT64.decode(reader)).longValue();
                    } else if (iM16810g3 != 2) {
                        reader.m16813j(iM16810g3);
                    } else {
                        iIntValue2 = ((Number) AbstractC5586q.INT32.decode(reader)).intValue();
                    }
                }
                break;
            case 10:
                AbstractC22676k.m65750j(reader, "reader");
                return Integer.valueOf(reader.m16814k());
            case 11:
                AbstractC22676k.m65750j(reader, "reader");
                return Long.valueOf(reader.m16815l());
            case 12:
                AbstractC22676k.m65750j(reader, "reader");
                int iM16814k = reader.m16814k();
                return Integer.valueOf((-(iM16814k & 1)) ^ (iM16814k >>> 1));
            case 13:
                AbstractC22676k.m65750j(reader, "reader");
                long jM16815l = reader.m16815l();
                return Long.valueOf((-(jM16815l & 1)) ^ (jM16815l >>> 1));
            case 14:
                AbstractC22676k.m65750j(reader, "reader");
                long jM16806c2 = reader.m16806c();
                InterfaceC26620j interfaceC26620j2 = reader.f22106a;
                interfaceC26620j2.mo79207g0(jM16806c2);
                return interfaceC26620j2.mo79215k0(jM16806c2);
            case 15:
                AbstractC22676k.m65750j(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jM16807d4 = reader.m16807d();
                while (true) {
                    int iM16810g4 = reader.m16810g();
                    if (iM16810g4 == -1) {
                        reader.m16808e(jM16807d4);
                        return arrayList;
                    }
                    if (iM16810g4 != 1) {
                        reader.m16816m();
                    } else {
                        arrayList.add(AbstractC5586q.STRUCT_VALUE.decode(reader));
                    }
                }
                break;
            case 16:
                AbstractC22676k.m65750j(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long jM16807d5 = reader.m16807d();
                while (true) {
                    int iM16810g5 = reader.m16810g();
                    if (iM16810g5 == -1) {
                        reader.m16808e(jM16807d5);
                        return linkedHashMap;
                    }
                    if (iM16810g5 != 1) {
                        reader.m16816m();
                    } else {
                        long jM16807d6 = reader.m16807d();
                        Object objDecode = null;
                        Object objDecode2 = null;
                        while (true) {
                            int iM16810g6 = reader.m16810g();
                            if (iM16810g6 == -1) {
                                reader.m16808e(jM16807d6);
                                if (objDecode != null) {
                                    linkedHashMap.put(objDecode, objDecode2);
                                }
                            } else if (iM16810g6 == 1) {
                                objDecode = AbstractC5586q.STRING.decode(reader);
                            } else if (iM16810g6 != 2) {
                                reader.m16813j(iM16810g6);
                            } else {
                                objDecode2 = AbstractC5586q.STRUCT_VALUE.decode(reader);
                            }
                        }
                    }
                }
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(reader, "reader");
                int iM16814k2 = reader.m16814k();
                if (iM16814k2 == 0) {
                    return null;
                }
                throw new IOException(AbstractC2875y.m8295h(iM16814k2, "expected 0 but was "));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d7 = reader.m16807d();
                Object objDecode3 = null;
                while (true) {
                    int iM16810g7 = reader.m16810g();
                    if (iM16810g7 == -1) {
                        reader.m16808e(jM16807d7);
                        return objDecode3;
                    }
                    switch (iM16810g7) {
                        case 1:
                            objDecode3 = AbstractC5586q.STRUCT_NULL.decode(reader);
                            break;
                        case 2:
                            objDecode3 = AbstractC5586q.DOUBLE.decode(reader);
                            break;
                        case 3:
                            objDecode3 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 4:
                            objDecode3 = AbstractC5586q.BOOL.decode(reader);
                            break;
                        case 5:
                            objDecode3 = AbstractC5586q.STRUCT_MAP.decode(reader);
                            break;
                        case 6:
                            objDecode3 = AbstractC5586q.STRUCT_LIST.decode(reader);
                            break;
                        default:
                            reader.m16816m();
                            break;
                    }
                }
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(reader, "reader");
                return Integer.valueOf(reader.m16814k());
            default:
                AbstractC22676k.m65750j(reader, "reader");
                return Long.valueOf(reader.m16815l());
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encode(C5588s c5588s, Object obj) {
        switch (this.f22084a) {
            case 0:
                c5588s.f22115a.mo79182H(Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            case 1:
                c5588s.f22115a.mo79233v0(Float.floatToIntBits(((Number) obj).floatValue()));
                return;
            case 2:
                AbstractC22676k.m65750j((Void) obj, "value");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                c5588s.m16820c(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 4:
                C26624l value = (C26624l) obj;
                AbstractC22676k.m65750j(value, "value");
                c5588s.m16818a(value);
                return;
            case 5:
                Duration value2 = (Duration) obj;
                AbstractC22676k.m65750j(value2, "value");
                long jM16738b = m16738b(value2);
                if (jM16738b != 0) {
                    AbstractC5586q.INT64.encodeWithTag(c5588s, 1, Long.valueOf(jM16738b));
                }
                int iM16737a = m16737a(value2);
                if (iM16737a != 0) {
                    AbstractC5586q.INT32.encodeWithTag(c5588s, 2, Integer.valueOf(iM16737a));
                    return;
                }
                return;
            case 6:
                AbstractC22676k.m65750j((C23454a0) obj, "value");
                return;
            case 7:
                c5588s.f22115a.mo79233v0(((Number) obj).intValue());
                return;
            case 8:
                c5588s.f22115a.mo79182H(((Number) obj).longValue());
                return;
            case 9:
                Instant value3 = (Instant) obj;
                AbstractC22676k.m65750j(value3, "value");
                long epochSecond = value3.getEpochSecond();
                if (epochSecond != 0) {
                    AbstractC5586q.INT64.encodeWithTag(c5588s, 1, Long.valueOf(epochSecond));
                }
                int nano = value3.getNano();
                if (nano != 0) {
                    AbstractC5586q.INT32.encodeWithTag(c5588s, 2, Integer.valueOf(nano));
                    return;
                }
                return;
            case 10:
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue >= 0) {
                    c5588s.m16820c(iIntValue);
                    return;
                } else {
                    c5588s.m16821d(iIntValue);
                    return;
                }
            case 11:
                c5588s.m16821d(((Number) obj).longValue());
                return;
            case 12:
                int iIntValue2 = ((Number) obj).intValue();
                c5588s.m16820c((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                return;
            case 13:
                long jLongValue = ((Number) obj).longValue();
                c5588s.m16821d((jLongValue >> 63) ^ (jLongValue << 1));
                return;
            case 14:
                String value4 = (String) obj;
                AbstractC22676k.m65750j(value4, "value");
                c5588s.f22115a.mo79193S(value4);
                return;
            case 15:
                List list = (List) obj;
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC5586q.STRUCT_VALUE.encodeWithTag(c5588s, 1, it.next());
                }
                return;
            case 16:
                Map map = (Map) obj;
                if (map == null) {
                    return;
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value5 = entry.getValue();
                    AbstractC5586q abstractC5586q = AbstractC5586q.STRING;
                    int iEncodedSizeWithTag = abstractC5586q.encodedSizeWithTag(1, str);
                    AbstractC5586q abstractC5586q2 = AbstractC5586q.STRUCT_VALUE;
                    int iEncodedSizeWithTag2 = abstractC5586q2.encodedSizeWithTag(2, value5) + iEncodedSizeWithTag;
                    c5588s.m16819b(1, EnumC5573d.LENGTH_DELIMITED);
                    c5588s.m16820c(iEncodedSizeWithTag2);
                    abstractC5586q.encodeWithTag(c5588s, 1, str);
                    abstractC5586q2.encodeWithTag(c5588s, 2, value5);
                }
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                c5588s.m16820c(0);
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                if (obj == null) {
                    AbstractC5586q.STRUCT_NULL.encodeWithTag(c5588s, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    AbstractC5586q.DOUBLE.encodeWithTag(c5588s, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    AbstractC5586q.STRING.encodeWithTag(c5588s, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    AbstractC5586q.BOOL.encodeWithTag(c5588s, 4, obj);
                    return;
                } else if (obj instanceof Map) {
                    AbstractC5586q.STRUCT_MAP.encodeWithTag(c5588s, 5, (Map) obj);
                    return;
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "unexpected struct value: "));
                    }
                    AbstractC5586q.STRUCT_LIST.encodeWithTag(c5588s, 6, obj);
                    return;
                }
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                c5588s.m16820c(((Number) obj).intValue());
                return;
            default:
                c5588s.m16821d(((Number) obj).longValue());
                return;
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public void encodeWithTag(C5588s writer, int i13, Object obj) throws IOException {
        switch (this.f22084a) {
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(writer, "writer");
                writer.m16819b(i13, getFieldEncoding$wire_runtime());
                writer.m16820c(0);
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(writer, "writer");
                if (obj != null) {
                    super.encodeWithTag(writer, i13, obj);
                } else {
                    writer.m16819b(i13, getFieldEncoding$wire_runtime());
                    writer.m16820c(encodedSize(obj));
                    encode(writer, obj);
                }
                break;
            default:
                super.encodeWithTag(writer, i13, obj);
                break;
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final int encodedSize(Object obj) {
        switch (this.f22084a) {
            case 0:
                ((Number) obj).doubleValue();
                return 8;
            case 1:
                ((Number) obj).floatValue();
                return 4;
            case 2:
                AbstractC22676k.m65750j((Void) obj, "value");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                ((Boolean) obj).getClass();
                return 1;
            case 4:
                C26624l value = (C26624l) obj;
                AbstractC22676k.m65750j(value, "value");
                return value.mo79253d();
            case 5:
                Duration value2 = (Duration) obj;
                AbstractC22676k.m65750j(value2, "value");
                long jM16738b = m16738b(value2);
                int iEncodedSizeWithTag = jM16738b != 0 ? AbstractC5586q.INT64.encodedSizeWithTag(1, Long.valueOf(jM16738b)) : 0;
                int iM16737a = m16737a(value2);
                return iM16737a != 0 ? iEncodedSizeWithTag + AbstractC5586q.INT32.encodedSizeWithTag(2, Integer.valueOf(iM16737a)) : iEncodedSizeWithTag;
            case 6:
                AbstractC22676k.m65750j((C23454a0) obj, "value");
                return 0;
            case 7:
                ((Number) obj).intValue();
                return 4;
            case 8:
                ((Number) obj).longValue();
                return 8;
            case 9:
                Instant value3 = (Instant) obj;
                AbstractC22676k.m65750j(value3, "value");
                long epochSecond = value3.getEpochSecond();
                int iEncodedSizeWithTag2 = epochSecond != 0 ? AbstractC5586q.INT64.encodedSizeWithTag(1, Long.valueOf(epochSecond)) : 0;
                int nano = value3.getNano();
                return nano != 0 ? iEncodedSizeWithTag2 + AbstractC5586q.INT32.encodedSizeWithTag(2, Integer.valueOf(nano)) : iEncodedSizeWithTag2;
            case 10:
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue < 0) {
                    return 10;
                }
                if ((iIntValue & (-128)) == 0) {
                    return 1;
                }
                if ((iIntValue & (-16384)) == 0) {
                    return 2;
                }
                if (((-2097152) & iIntValue) == 0) {
                    return 3;
                }
                return (iIntValue & (-268435456)) == 0 ? 4 : 5;
            case 11:
                return AbstractC35902e.m113975n0(((Number) obj).longValue());
            case 12:
                int iIntValue2 = ((Number) obj).intValue();
                int i13 = (iIntValue2 >> 31) ^ (iIntValue2 << 1);
                if ((i13 & (-128)) == 0) {
                    return 1;
                }
                if ((i13 & (-16384)) == 0) {
                    return 2;
                }
                if (((-2097152) & i13) == 0) {
                    return 3;
                }
                return (i13 & (-268435456)) == 0 ? 4 : 5;
            case 13:
                long jLongValue = ((Number) obj).longValue();
                return AbstractC35902e.m113975n0((jLongValue >> 63) ^ (jLongValue << 1));
            case 14:
                String value4 = (String) obj;
                AbstractC22676k.m65750j(value4, "value");
                return (int) AbstractC26604b.m79165j(value4);
            case 15:
                List list = (List) obj;
                int iEncodedSizeWithTag3 = 0;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        iEncodedSizeWithTag3 += AbstractC5586q.STRUCT_VALUE.encodedSizeWithTag(1, it.next());
                    }
                }
                return iEncodedSizeWithTag3;
            case 16:
                Map map = (Map) obj;
                int iM113973m0 = 0;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        int iEncodedSizeWithTag4 = AbstractC5586q.STRUCT_VALUE.encodedSizeWithTag(2, entry.getValue()) + AbstractC5586q.STRING.encodedSizeWithTag(1, str);
                        iM113973m0 += AbstractC35902e.m113973m0(iEncodedSizeWithTag4) + AbstractC35902e.m113973m0(8) + iEncodedSizeWithTag4;
                    }
                }
                return iM113973m0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return 1;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                if (obj == null) {
                    return AbstractC5586q.STRUCT_NULL.encodedSizeWithTag(1, obj);
                }
                if (obj instanceof Number) {
                    return AbstractC5586q.DOUBLE.encodedSizeWithTag(2, Double.valueOf(((Number) obj).doubleValue()));
                }
                if (obj instanceof String) {
                    return AbstractC5586q.STRING.encodedSizeWithTag(3, obj);
                }
                if (obj instanceof Boolean) {
                    return AbstractC5586q.BOOL.encodedSizeWithTag(4, obj);
                }
                if (obj instanceof Map) {
                    return AbstractC5586q.STRUCT_MAP.encodedSizeWithTag(5, (Map) obj);
                }
                if (obj instanceof List) {
                    return AbstractC5586q.STRUCT_LIST.encodedSizeWithTag(6, obj);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "unexpected struct value: "));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iIntValue3 = ((Number) obj).intValue();
                if ((iIntValue3 & (-128)) == 0) {
                    return 1;
                }
                if ((iIntValue3 & (-16384)) == 0) {
                    return 2;
                }
                if (((-2097152) & iIntValue3) == 0) {
                    return 3;
                }
                return (iIntValue3 & (-268435456)) == 0 ? 4 : 5;
            default:
                return AbstractC35902e.m113975n0(((Number) obj).longValue());
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public int encodedSizeWithTag(int i13, Object obj) {
        switch (this.f22084a) {
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC35902e.m113973m0(1) + AbstractC35902e.m113973m0(i13 << 3);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                if (obj != null) {
                    return super.encodedSizeWithTag(i13, obj);
                }
                int iEncodedSize = encodedSize(obj);
                return AbstractC35902e.m113973m0(iEncodedSize) + AbstractC35902e.m113973m0(i13 << 3) + iEncodedSize;
            default:
                return super.encodedSizeWithTag(i13, obj);
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final Object redact(Object obj) {
        switch (this.f22084a) {
            case 0:
                ((Number) obj).doubleValue();
                throw new UnsupportedOperationException();
            case 1:
                ((Number) obj).floatValue();
                throw new UnsupportedOperationException();
            case 2:
                Void value = (Void) obj;
                AbstractC22676k.m65750j(value, "value");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                ((Boolean) obj).booleanValue();
                throw new UnsupportedOperationException();
            case 4:
                C26624l value2 = (C26624l) obj;
                AbstractC22676k.m65750j(value2, "value");
                throw new UnsupportedOperationException();
            case 5:
                Duration value3 = (Duration) obj;
                AbstractC22676k.m65750j(value3, "value");
                return value3;
            case 6:
                C23454a0 value4 = (C23454a0) obj;
                AbstractC22676k.m65750j(value4, "value");
                return C23454a0.f92919a;
            case 7:
                ((Number) obj).intValue();
                throw new UnsupportedOperationException();
            case 8:
                ((Number) obj).longValue();
                throw new UnsupportedOperationException();
            case 9:
                Instant value5 = (Instant) obj;
                AbstractC22676k.m65750j(value5, "value");
                return value5;
            case 10:
                ((Number) obj).intValue();
                throw new UnsupportedOperationException();
            case 11:
                ((Number) obj).longValue();
                throw new UnsupportedOperationException();
            case 12:
                ((Number) obj).intValue();
                throw new UnsupportedOperationException();
            case 13:
                ((Number) obj).longValue();
                throw new UnsupportedOperationException();
            case 14:
                String value6 = (String) obj;
                AbstractC22676k.m65750j(value6, "value");
                throw new UnsupportedOperationException();
            case 15:
                List list = (List) obj;
                if (list == null) {
                    return null;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC5586q.STRUCT_VALUE.redact(it.next()));
                }
                return arrayList;
            case 16:
                Map map = (Map) obj;
                if (map == null) {
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), AbstractC5586q.STRUCT_VALUE.redact(entry));
                }
                return linkedHashMap;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return null;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                if (obj == null) {
                    return AbstractC5586q.STRUCT_NULL.redact(obj);
                }
                if (obj instanceof Number) {
                    return obj;
                }
                if (obj instanceof String) {
                    return null;
                }
                if (obj instanceof Boolean) {
                    return obj;
                }
                if (obj instanceof Map) {
                    return AbstractC5586q.STRUCT_MAP.redact((Map) obj);
                }
                if (obj instanceof List) {
                    return AbstractC5586q.STRUCT_LIST.redact(obj);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "unexpected struct value: "));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((Number) obj).intValue();
                throw new UnsupportedOperationException();
            default:
                ((Number) obj).longValue();
                throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5571b(EnumC5573d enumC5573d, InterfaceC21461d interfaceC21461d, String str, EnumC5593x enumC5593x, Object obj, int i13) {
        super(enumC5573d, interfaceC21461d, str, enumC5593x, obj);
        this.f22084a = i13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5571b() {
        super(EnumC5573d.LENGTH_DELIMITED, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Void.class), null, EnumC5593x.PROTO_2);
        this.f22084a = 2;
    }

    @Override // com.squareup.wire.AbstractC5586q
    public void encodeWithTag(C5591v writer, int i13, Object obj) throws IOException {
        switch (this.f22084a) {
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j(writer, "writer");
                writer.m16829h(0);
                writer.m16828g(i13, getFieldEncoding$wire_runtime());
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(writer, "writer");
                if (obj == null) {
                    int iM16823b = writer.m16823b();
                    encode(writer, obj);
                    writer.m16829h(writer.m16823b() - iM16823b);
                    writer.m16828g(i13, getFieldEncoding$wire_runtime());
                } else {
                    super.encodeWithTag(writer, i13, obj);
                }
                break;
            default:
                super.encodeWithTag(writer, i13, obj);
                break;
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encode(C5591v c5591v, Object obj) throws IOException {
        switch (this.f22084a) {
            case 0:
                c5591v.m16827f(Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            case 1:
                c5591v.m16826e(Float.floatToIntBits(((Number) obj).floatValue()));
                return;
            case 2:
                AbstractC22676k.m65750j((Void) obj, "value");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                c5591v.m16829h(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 4:
                C26624l value = (C26624l) obj;
                AbstractC22676k.m65750j(value, "value");
                c5591v.m16825d(value);
                return;
            case 5:
                Duration value2 = (Duration) obj;
                AbstractC22676k.m65750j(value2, "value");
                int iM16737a = m16737a(value2);
                if (iM16737a != 0) {
                    AbstractC5586q.INT32.encodeWithTag(c5591v, 2, Integer.valueOf(iM16737a));
                }
                long jM16738b = m16738b(value2);
                if (jM16738b != 0) {
                    AbstractC5586q.INT64.encodeWithTag(c5591v, 1, Long.valueOf(jM16738b));
                    return;
                }
                return;
            case 6:
                AbstractC22676k.m65750j((C23454a0) obj, "value");
                return;
            case 7:
                c5591v.m16826e(((Number) obj).intValue());
                return;
            case 8:
                c5591v.m16827f(((Number) obj).longValue());
                return;
            case 9:
                Instant value3 = (Instant) obj;
                AbstractC22676k.m65750j(value3, "value");
                int nano = value3.getNano();
                if (nano != 0) {
                    AbstractC5586q.INT32.encodeWithTag(c5591v, 2, Integer.valueOf(nano));
                }
                long epochSecond = value3.getEpochSecond();
                if (epochSecond != 0) {
                    AbstractC5586q.INT64.encodeWithTag(c5591v, 1, Long.valueOf(epochSecond));
                    return;
                }
                return;
            case 10:
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue >= 0) {
                    c5591v.m16829h(iIntValue);
                    return;
                } else {
                    c5591v.m16830i(iIntValue);
                    return;
                }
            case 11:
                c5591v.m16830i(((Number) obj).longValue());
                return;
            case 12:
                int iIntValue2 = ((Number) obj).intValue();
                c5591v.m16829h((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                return;
            case 13:
                long jLongValue = ((Number) obj).longValue();
                c5591v.m16830i((jLongValue >> 63) ^ (jLongValue << 1));
                return;
            case 14:
                String value4 = (String) obj;
                AbstractC22676k.m65750j(value4, "value");
                int length = value4.length() - 1;
                while (length >= 0) {
                    int i13 = length - 1;
                    char cCharAt = value4.charAt(length);
                    if (cCharAt < 128) {
                        c5591v.m16824c(1);
                        int i14 = c5591v.f22123e;
                        byte[] bArr = c5591v.f22122d;
                        int i15 = i14 - 1;
                        bArr[i15] = (byte) cCharAt;
                        int iMax = Math.max(-1, i13 - i15);
                        int i16 = i15;
                        length = i13;
                        while (length > iMax) {
                            char cCharAt2 = value4.charAt(length);
                            if (cCharAt2 < 128) {
                                length--;
                                i16--;
                                bArr[i16] = (byte) cCharAt2;
                            } else {
                                c5591v.f22123e = i16;
                            }
                        }
                        c5591v.f22123e = i16;
                    } else {
                        if (cCharAt < 2048) {
                            c5591v.m16824c(2);
                            byte[] bArr2 = c5591v.f22122d;
                            int i17 = c5591v.f22123e;
                            int i18 = i17 - 1;
                            c5591v.f22123e = i18;
                            bArr2[i18] = (byte) (128 | (cCharAt & '?'));
                            int i19 = i17 - 2;
                            c5591v.f22123e = i19;
                            bArr2[i19] = (byte) ((cCharAt >> 6) | 192);
                        } else if (cCharAt >= 55296 && cCharAt <= 57343) {
                            char cCharAt3 = i13 >= 0 ? value4.charAt(i13) : (char) 65535;
                            if (cCharAt3 <= 56319 && 56320 <= cCharAt && cCharAt < 57344) {
                                length -= 2;
                                int i24 = (((cCharAt3 & 1023) << 10) | (cCharAt & 1023)) + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                                c5591v.m16824c(4);
                                byte[] bArr3 = c5591v.f22122d;
                                int i25 = c5591v.f22123e;
                                int i26 = i25 - 1;
                                c5591v.f22123e = i26;
                                bArr3[i26] = (byte) ((i24 & 63) | 128);
                                int i27 = i25 - 2;
                                c5591v.f22123e = i27;
                                bArr3[i27] = (byte) (((i24 >> 6) & 63) | 128);
                                int i28 = i25 - 3;
                                c5591v.f22123e = i28;
                                bArr3[i28] = (byte) (128 | (63 & (i24 >> 12)));
                                int i29 = i25 - 4;
                                c5591v.f22123e = i29;
                                bArr3[i29] = (byte) ((i24 >> 18) | 240);
                            } else {
                                c5591v.m16824c(1);
                                byte[] bArr4 = c5591v.f22122d;
                                int i34 = c5591v.f22123e - 1;
                                c5591v.f22123e = i34;
                                bArr4[i34] = 63;
                            }
                        } else {
                            c5591v.m16824c(3);
                            byte[] bArr5 = c5591v.f22122d;
                            int i35 = c5591v.f22123e;
                            int i36 = i35 - 1;
                            c5591v.f22123e = i36;
                            bArr5[i36] = (byte) ((cCharAt & '?') | 128);
                            int i37 = i35 - 2;
                            c5591v.f22123e = i37;
                            bArr5[i37] = (byte) (128 | (63 & (cCharAt >> 6)));
                            int i38 = i35 - 3;
                            c5591v.f22123e = i38;
                            bArr5[i38] = (byte) ((cCharAt >> '\f') | 224);
                        }
                        length = i13;
                    }
                }
                return;
            case 15:
                List list = (List) obj;
                if (list == null) {
                    return;
                }
                for (int size = list.size() - 1; -1 < size; size--) {
                    AbstractC5586q.STRUCT_VALUE.encodeWithTag(c5591v, 1, list.get(size));
                }
                return;
            case 16:
                Map map = (Map) obj;
                if (map == null) {
                    return;
                }
                Map.Entry[] entryArr = (Map.Entry[]) map.entrySet().toArray(new Map.Entry[0]);
                AbstractC25260n.m74034J0(entryArr);
                for (Map.Entry entry : entryArr) {
                    String str = (String) entry.getKey();
                    Object value5 = entry.getValue();
                    int iM16823b = c5591v.m16823b();
                    AbstractC5586q.STRUCT_VALUE.encodeWithTag(c5591v, 2, value5);
                    AbstractC5586q.STRING.encodeWithTag(c5591v, 1, str);
                    c5591v.m16829h(c5591v.m16823b() - iM16823b);
                    c5591v.m16828g(1, EnumC5573d.LENGTH_DELIMITED);
                }
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                c5591v.m16829h(0);
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                if (obj == null) {
                    AbstractC5586q.STRUCT_NULL.encodeWithTag(c5591v, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    AbstractC5586q.DOUBLE.encodeWithTag(c5591v, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    AbstractC5586q.STRING.encodeWithTag(c5591v, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    AbstractC5586q.BOOL.encodeWithTag(c5591v, 4, obj);
                    return;
                } else if (obj instanceof Map) {
                    AbstractC5586q.STRUCT_MAP.encodeWithTag(c5591v, 5, (Map) obj);
                    return;
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalArgumentException(AbstractC25012a.m73375h(obj, "unexpected struct value: "));
                    }
                    AbstractC5586q.STRUCT_LIST.encodeWithTag(c5591v, 6, obj);
                    return;
                }
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                c5591v.m16829h(((Number) obj).intValue());
                return;
            default:
                c5591v.m16830i(((Number) obj).longValue());
                return;
        }
    }
}
