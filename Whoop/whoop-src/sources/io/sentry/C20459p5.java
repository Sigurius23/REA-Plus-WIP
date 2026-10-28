package io.sentry;

import io.sentry.clientreport.C20297e;
import io.sentry.protocol.C20501v;
import io.sentry.vendor.gson.stream.EnumC20612b;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: io.sentry.p5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20459p5 implements InterfaceC20603v1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f76583a;

    public /* synthetic */ C20459p5(int i13) {
        this.f76583a = i13;
    }

    /* JADX INFO: renamed from: b */
    public static IllegalStateException m56652b(InterfaceC20602v0 interfaceC20602v0, String str) {
        String strM31996o = AbstractC11895b.m31996o("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM31996o);
        interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, strM31996o, illegalStateException);
        return illegalStateException;
    }

    @Override // io.sentry.InterfaceC20603v1
    /* JADX INFO: renamed from: a */
    public final Object mo56294a(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        String str = "Missing required field \"timestamp\"";
        switch (this.f76583a) {
            case 0:
                interfaceC20392j3.beginObject();
                C20353h7 c20353h7 = null;
                C20501v c20501v = null;
                Double dMo56497R = null;
                String strMo56509w0 = null;
                HashMap map = null;
                EnumC20549t5 enumC20549t5 = null;
                HashMap mapMo56510y0 = null;
                Integer numMo56507q0 = null;
                while (true) {
                    String str2 = str;
                    if (interfaceC20392j3.peek() != EnumC20612b.NAME) {
                        interfaceC20392j3.endObject();
                        if (c20501v == null) {
                            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                            throw illegalStateException;
                        }
                        if (dMo56497R == null) {
                            IllegalStateException illegalStateException2 = new IllegalStateException(str2);
                            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, str2, illegalStateException2);
                            throw illegalStateException2;
                        }
                        if (strMo56509w0 == null) {
                            IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"body\"");
                            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"body\"", illegalStateException3);
                            throw illegalStateException3;
                        }
                        if (enumC20549t5 == null) {
                            IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"level\"");
                            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"level\"", illegalStateException4);
                            throw illegalStateException4;
                        }
                        C20512q5 c20512q5 = new C20512q5();
                        c20512q5.f76858w = c20501v;
                        c20512q5.f76860y = dMo56497R;
                        c20512q5.f76861z = strMo56509w0;
                        c20512q5.f76854E = enumC20549t5;
                        c20512q5.f76856G = mapMo56510y0;
                        c20512q5.f76855F = numMo56507q0;
                        c20512q5.f76859x = c20353h7;
                        c20512q5.f76857H = map;
                        return c20512q5;
                    }
                    String strNextName = interfaceC20392j3.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "span_id":
                            c20353h7 = (C20353h7) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20306d(18));
                            break;
                        case "severity_number":
                            numMo56507q0 = interfaceC20392j3.mo56507q0();
                            break;
                        case "body":
                            strMo56509w0 = interfaceC20392j3.mo56509w0();
                            break;
                        case "timestamp":
                            dMo56497R = interfaceC20392j3.mo56497R();
                            break;
                        case "level":
                            enumC20549t5 = (EnumC20549t5) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20459p5(2));
                            break;
                        case "attributes":
                            mapMo56510y0 = interfaceC20392j3.mo56510y0(interfaceC20602v0, new C20459p5(1));
                            break;
                        case "trace_id":
                            c20501v = (C20501v) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20297e(false));
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, map, strNextName);
                            break;
                    }
                    str = str2;
                }
                break;
            case 1:
                interfaceC20392j3.beginObject();
                String strMo56509w1 = null;
                Object objMo56499U0 = null;
                HashMap map2 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName2 = interfaceC20392j3.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("type")) {
                        strMo56509w1 = interfaceC20392j3.mo56509w0();
                    } else if (strNextName2.equals("value")) {
                        objMo56499U0 = interfaceC20392j3.mo56499U0();
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        interfaceC20392j3.mo56494I(interfaceC20602v0, map2, strNextName2);
                    }
                }
                interfaceC20392j3.endObject();
                if (strMo56509w1 == null) {
                    IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"type\"");
                    interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"type\"", illegalStateException5);
                    throw illegalStateException5;
                }
                C20520r5 c20520r5 = new C20520r5();
                c20520r5.f76887w = strMo56509w1;
                if (objMo56499U0 == null || !strMo56509w1.equals("string")) {
                    c20520r5.f76888x = objMo56499U0;
                } else {
                    c20520r5.f76888x = objMo56499U0.toString();
                }
                c20520r5.f76889y = map2;
                return c20520r5;
            case 2:
                return EnumC20549t5.valueOf(interfaceC20392j3.nextString().toUpperCase(Locale.ROOT));
            case 3:
                interfaceC20392j3.beginObject();
                C20501v c20501v2 = null;
                HashMap map3 = null;
                Double dMo56497R2 = null;
                String strMo56509w2 = null;
                String strMo56509w3 = null;
                Double dMo56497R3 = null;
                HashMap mapMo56510y1 = null;
                C20353h7 c20353h8 = null;
                String strMo56509w4 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName3 = interfaceC20392j3.nextName();
                    strNextName3.getClass();
                    switch (strNextName3) {
                        case "span_id":
                            c20353h8 = (C20353h7) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20306d(18));
                            break;
                        case "name":
                            strMo56509w3 = interfaceC20392j3.mo56509w0();
                            break;
                        case "type":
                            strMo56509w2 = interfaceC20392j3.mo56509w0();
                            break;
                        case "unit":
                            strMo56509w4 = interfaceC20392j3.mo56509w0();
                            break;
                        case "timestamp":
                            dMo56497R2 = interfaceC20392j3.mo56497R();
                            break;
                        case "value":
                            dMo56497R3 = interfaceC20392j3.mo56497R();
                            break;
                        case "attributes":
                            mapMo56510y1 = interfaceC20392j3.mo56510y0(interfaceC20602v0, new C20459p5(1));
                            break;
                        case "trace_id":
                            c20501v2 = (C20501v) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20297e(false));
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, map3, strNextName3);
                            break;
                    }
                }
                interfaceC20392j3.endObject();
                if (c20501v2 == null) {
                    IllegalStateException illegalStateException6 = new IllegalStateException("Missing required field \"trace_id\"");
                    interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"trace_id\"", illegalStateException6);
                    throw illegalStateException6;
                }
                Double d3 = dMo56497R2;
                if (d3 == null) {
                    IllegalStateException illegalStateException7 = new IllegalStateException("Missing required field \"timestamp\"");
                    interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"timestamp\"", illegalStateException7);
                    throw illegalStateException7;
                }
                String str3 = strMo56509w2;
                if (str3 == null) {
                    IllegalStateException illegalStateException8 = new IllegalStateException("Missing required field \"type\"");
                    interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"type\"", illegalStateException8);
                    throw illegalStateException8;
                }
                String str4 = strMo56509w3;
                if (str4 == null) {
                    IllegalStateException illegalStateException9 = new IllegalStateException("Missing required field \"name\"");
                    interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"name\"", illegalStateException9);
                    throw illegalStateException9;
                }
                Double d14 = dMo56497R3;
                if (d14 == null) {
                    IllegalStateException illegalStateException10 = new IllegalStateException("Missing required field \"value\"");
                    interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"value\"", illegalStateException10);
                    throw illegalStateException10;
                }
                C20607v5 c20607v5 = new C20607v5();
                c20607v5.f77120w = c20501v2;
                c20607v5.f77122y = d3;
                c20607v5.f77123z = str4;
                c20607v5.f77116F = str3;
                c20607v5.f77117G = d14;
                c20607v5.f77118H = mapMo56510y1;
                c20607v5.f77121x = c20353h8;
                c20607v5.f77115E = strMo56509w4;
                c20607v5.f77119I = map3;
                return c20607v5;
            case 4:
                return EnumC20521r6.valueOf(interfaceC20392j3.nextString().toUpperCase(Locale.ROOT));
            default:
                interfaceC20392j3.beginObject();
                ConcurrentHashMap concurrentHashMap = null;
                C20501v c20501v3 = null;
                String strNextString = null;
                String strMo56509w5 = null;
                String strMo56509w6 = null;
                String strMo56509w7 = null;
                String strMo56509w8 = null;
                String strMo56509w9 = null;
                String strMo56509w10 = null;
                C20501v c20501v4 = null;
                String strMo56509w11 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName4 = interfaceC20392j3.nextName();
                    strNextName4.getClass();
                    switch (strNextName4) {
                        case "replay_id":
                            c20501v4 = new C20501v(interfaceC20392j3.nextString());
                            break;
                        case "user_id":
                            strMo56509w7 = interfaceC20392j3.mo56509w0();
                            break;
                        case "environment":
                            strMo56509w6 = interfaceC20392j3.mo56509w0();
                            break;
                        case "sample_rand":
                            strMo56509w11 = interfaceC20392j3.mo56509w0();
                            break;
                        case "sample_rate":
                            strMo56509w9 = interfaceC20392j3.mo56509w0();
                            break;
                        case "release":
                            strMo56509w5 = interfaceC20392j3.mo56509w0();
                            break;
                        case "trace_id":
                            c20501v3 = new C20501v(interfaceC20392j3.nextString());
                            break;
                        case "sampled":
                            strMo56509w10 = interfaceC20392j3.mo56509w0();
                            break;
                        case "public_key":
                            strNextString = interfaceC20392j3.nextString();
                            break;
                        case "transaction":
                            strMo56509w8 = interfaceC20392j3.mo56509w0();
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName4);
                            break;
                    }
                }
                if (c20501v3 == null) {
                    throw m56652b(interfaceC20602v0, "trace_id");
                }
                if (strNextString == null) {
                    throw m56652b(interfaceC20602v0, "public_key");
                }
                C20405k7 c20405k7 = new C20405k7(c20501v3, strNextString, strMo56509w5, strMo56509w6, strMo56509w7, strMo56509w8, strMo56509w9, strMo56509w10, c20501v4, strMo56509w11);
                c20405k7.f76476K = concurrentHashMap;
                interfaceC20392j3.endObject();
                return c20405k7;
        }
    }
}
