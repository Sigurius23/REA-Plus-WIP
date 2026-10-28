package p607x8;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.health.platform.client.proto.C1533u;
import com.mapbox.common.logger.LogPriority;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import live.hms.video.error.ErrorCodes;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import lr.RunnableC24693e;
import org.joda.time.DateTimeConstants;
import p284ko.C22633q;
import p309lo.AbstractC24567y;
import p309lo.C24562t;
import p450r5.RunnableC30928b;
import p460rg.AbstractC31375j;
import p690zr.C41060w0;

/* JADX INFO: renamed from: x8.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C38058m {

    /* JADX INFO: renamed from: f */
    public static C38058m f163008f;

    /* JADX INFO: renamed from: a */
    public int f163009a;

    /* JADX INFO: renamed from: b */
    public boolean f163010b;

    /* JADX INFO: renamed from: c */
    public final Object f163011c;

    /* JADX INFO: renamed from: d */
    public final Object f163012d;

    /* JADX INFO: renamed from: e */
    public final Object f163013e;

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C38058m(Context context, int i13) {
        String strM96500p;
        int[] iArr;
        TelephonyManager telephonyManager;
        int i14 = 19;
        switch (i13) {
            case 1:
                this.f163011c = context == null ? null : context.getApplicationContext();
                int i15 = AbstractC24567y.f95875a;
                if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                    strM96500p = AbstractC31375j.m96500p(Locale.getDefault().getCountry());
                } else {
                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                    if (TextUtils.isEmpty(networkCountryIso)) {
                        strM96500p = AbstractC31375j.m96500p(Locale.getDefault().getCountry());
                    } else {
                        strM96500p = AbstractC31375j.m96500p(networkCountryIso);
                    }
                }
                C41060w0 c41060w0 = C22633q.f89034n;
                strM96500p.getClass();
                switch (strM96500p.hashCode()) {
                    case 2083:
                        i14 = !strM96500p.equals("AD") ? -1 : 0;
                        break;
                    case 2084:
                        i14 = !strM96500p.equals("AE") ? -1 : 1;
                        break;
                    case 2085:
                        i14 = !strM96500p.equals("AF") ? -1 : 2;
                        break;
                    case 2086:
                        i14 = !strM96500p.equals("AG") ? -1 : 3;
                        break;
                    case 2088:
                        i14 = !strM96500p.equals("AI") ? -1 : 4;
                        break;
                    case 2091:
                        i14 = !strM96500p.equals("AL") ? -1 : 5;
                        break;
                    case 2092:
                        i14 = !strM96500p.equals("AM") ? -1 : 6;
                        break;
                    case 2094:
                        i14 = !strM96500p.equals("AO") ? -1 : 7;
                        break;
                    case 2096:
                        i14 = !strM96500p.equals("AQ") ? -1 : 8;
                        break;
                    case 2097:
                        i14 = !strM96500p.equals("AR") ? -1 : 9;
                        break;
                    case 2098:
                        i14 = !strM96500p.equals("AS") ? -1 : 10;
                        break;
                    case 2099:
                        i14 = !strM96500p.equals("AT") ? -1 : 11;
                        break;
                    case 2100:
                        i14 = !strM96500p.equals("AU") ? -1 : 12;
                        break;
                    case 2102:
                        i14 = !strM96500p.equals("AW") ? -1 : 13;
                        break;
                    case 2103:
                        i14 = !strM96500p.equals("AX") ? -1 : 14;
                        break;
                    case 2105:
                        i14 = !strM96500p.equals("AZ") ? -1 : 15;
                        break;
                    case 2111:
                        i14 = !strM96500p.equals("BA") ? -1 : 16;
                        break;
                    case 2112:
                        i14 = !strM96500p.equals("BB") ? -1 : 17;
                        break;
                    case 2114:
                        i14 = !strM96500p.equals("BD") ? -1 : 18;
                        break;
                    case 2115:
                        if (!strM96500p.equals("BE")) {
                            i14 = -1;
                        }
                        break;
                    case 2116:
                        i14 = !strM96500p.equals("BF") ? -1 : 20;
                        break;
                    case 2117:
                        i14 = !strM96500p.equals("BG") ? -1 : 21;
                        break;
                    case 2118:
                        i14 = !strM96500p.equals("BH") ? -1 : 22;
                        break;
                    case 2119:
                        i14 = !strM96500p.equals("BI") ? -1 : 23;
                        break;
                    case 2120:
                        i14 = !strM96500p.equals("BJ") ? -1 : 24;
                        break;
                    case 2122:
                        i14 = !strM96500p.equals("BL") ? -1 : 25;
                        break;
                    case 2123:
                        i14 = !strM96500p.equals("BM") ? -1 : 26;
                        break;
                    case 2124:
                        i14 = !strM96500p.equals("BN") ? -1 : 27;
                        break;
                    case 2125:
                        i14 = !strM96500p.equals("BO") ? -1 : 28;
                        break;
                    case 2127:
                        i14 = !strM96500p.equals("BQ") ? -1 : 29;
                        break;
                    case 2128:
                        i14 = !strM96500p.equals("BR") ? -1 : 30;
                        break;
                    case 2129:
                        i14 = !strM96500p.equals("BS") ? -1 : 31;
                        break;
                    case 2130:
                        i14 = !strM96500p.equals("BT") ? -1 : 32;
                        break;
                    case 2133:
                        i14 = !strM96500p.equals("BW") ? -1 : 33;
                        break;
                    case 2135:
                        i14 = !strM96500p.equals("BY") ? -1 : 34;
                        break;
                    case 2136:
                        i14 = !strM96500p.equals("BZ") ? -1 : 35;
                        break;
                    case 2142:
                        i14 = !strM96500p.equals("CA") ? -1 : 36;
                        break;
                    case 2145:
                        i14 = !strM96500p.equals("CD") ? -1 : 37;
                        break;
                    case 2147:
                        i14 = !strM96500p.equals("CF") ? -1 : 38;
                        break;
                    case 2148:
                        i14 = !strM96500p.equals("CG") ? -1 : 39;
                        break;
                    case 2149:
                        i14 = !strM96500p.equals("CH") ? -1 : 40;
                        break;
                    case 2150:
                        i14 = !strM96500p.equals("CI") ? -1 : 41;
                        break;
                    case 2152:
                        i14 = !strM96500p.equals("CK") ? -1 : 42;
                        break;
                    case 2153:
                        i14 = !strM96500p.equals("CL") ? -1 : 43;
                        break;
                    case 2154:
                        i14 = !strM96500p.equals("CM") ? -1 : 44;
                        break;
                    case 2155:
                        i14 = !strM96500p.equals("CN") ? -1 : 45;
                        break;
                    case 2156:
                        i14 = !strM96500p.equals("CO") ? -1 : 46;
                        break;
                    case 2159:
                        i14 = !strM96500p.equals("CR") ? -1 : 47;
                        break;
                    case 2162:
                        i14 = !strM96500p.equals("CU") ? -1 : 48;
                        break;
                    case 2163:
                        i14 = !strM96500p.equals("CV") ? -1 : 49;
                        break;
                    case 2164:
                        i14 = !strM96500p.equals("CW") ? -1 : 50;
                        break;
                    case 2165:
                        i14 = !strM96500p.equals("CX") ? -1 : 51;
                        break;
                    case 2166:
                        i14 = !strM96500p.equals("CY") ? -1 : 52;
                        break;
                    case 2167:
                        i14 = !strM96500p.equals("CZ") ? -1 : 53;
                        break;
                    case 2177:
                        i14 = !strM96500p.equals("DE") ? -1 : 54;
                        break;
                    case 2182:
                        i14 = !strM96500p.equals("DJ") ? -1 : 55;
                        break;
                    case 2183:
                        i14 = !strM96500p.equals("DK") ? -1 : 56;
                        break;
                    case 2185:
                        i14 = !strM96500p.equals("DM") ? -1 : 57;
                        break;
                    case 2187:
                        i14 = !strM96500p.equals("DO") ? -1 : 58;
                        break;
                    case 2198:
                        i14 = !strM96500p.equals("DZ") ? -1 : 59;
                        break;
                    case 2206:
                        i14 = !strM96500p.equals("EC") ? -1 : 60;
                        break;
                    case 2208:
                        i14 = !strM96500p.equals("EE") ? -1 : 61;
                        break;
                    case 2210:
                        i14 = !strM96500p.equals("EG") ? -1 : 62;
                        break;
                    case 2221:
                        i14 = !strM96500p.equals("ER") ? -1 : 63;
                        break;
                    case 2222:
                        i14 = !strM96500p.equals("ES") ? -1 : 64;
                        break;
                    case 2223:
                        i14 = !strM96500p.equals("ET") ? -1 : 65;
                        break;
                    case 2243:
                        i14 = !strM96500p.equals("FI") ? -1 : 66;
                        break;
                    case 2244:
                        i14 = !strM96500p.equals("FJ") ? -1 : 67;
                        break;
                    case 2245:
                        i14 = !strM96500p.equals("FK") ? -1 : 68;
                        break;
                    case 2247:
                        i14 = !strM96500p.equals("FM") ? -1 : 69;
                        break;
                    case 2249:
                        i14 = !strM96500p.equals("FO") ? -1 : 70;
                        break;
                    case 2252:
                        i14 = !strM96500p.equals("FR") ? -1 : 71;
                        break;
                    case 2266:
                        i14 = !strM96500p.equals("GA") ? -1 : 72;
                        break;
                    case 2267:
                        i14 = !strM96500p.equals("GB") ? -1 : 73;
                        break;
                    case 2269:
                        i14 = !strM96500p.equals("GD") ? -1 : 74;
                        break;
                    case 2270:
                        i14 = !strM96500p.equals("GE") ? -1 : 75;
                        break;
                    case 2271:
                        i14 = !strM96500p.equals("GF") ? -1 : 76;
                        break;
                    case 2272:
                        i14 = !strM96500p.equals("GG") ? -1 : 77;
                        break;
                    case 2273:
                        i14 = !strM96500p.equals("GH") ? -1 : 78;
                        break;
                    case 2274:
                        i14 = !strM96500p.equals("GI") ? -1 : 79;
                        break;
                    case 2277:
                        i14 = !strM96500p.equals("GL") ? -1 : 80;
                        break;
                    case 2278:
                        i14 = !strM96500p.equals("GM") ? -1 : 81;
                        break;
                    case 2279:
                        i14 = !strM96500p.equals("GN") ? -1 : 82;
                        break;
                    case 2281:
                        i14 = !strM96500p.equals("GP") ? -1 : 83;
                        break;
                    case 2282:
                        i14 = !strM96500p.equals("GQ") ? -1 : 84;
                        break;
                    case 2283:
                        i14 = !strM96500p.equals("GR") ? -1 : 85;
                        break;
                    case 2285:
                        i14 = !strM96500p.equals("GT") ? -1 : 86;
                        break;
                    case 2286:
                        i14 = !strM96500p.equals("GU") ? -1 : 87;
                        break;
                    case 2288:
                        i14 = !strM96500p.equals("GW") ? -1 : 88;
                        break;
                    case 2290:
                        i14 = !strM96500p.equals("GY") ? -1 : 89;
                        break;
                    case 2307:
                        i14 = !strM96500p.equals("HK") ? -1 : 90;
                        break;
                    case 2310:
                        i14 = !strM96500p.equals("HN") ? -1 : 91;
                        break;
                    case 2314:
                        i14 = !strM96500p.equals("HR") ? -1 : 92;
                        break;
                    case 2316:
                        i14 = !strM96500p.equals("HT") ? -1 : 93;
                        break;
                    case 2317:
                        i14 = !strM96500p.equals("HU") ? -1 : 94;
                        break;
                    case 2331:
                        i14 = !strM96500p.equals("ID") ? -1 : 95;
                        break;
                    case 2332:
                        i14 = !strM96500p.equals("IE") ? -1 : 96;
                        break;
                    case 2339:
                        i14 = !strM96500p.equals("IL") ? -1 : 97;
                        break;
                    case 2340:
                        i14 = !strM96500p.equals("IM") ? -1 : 98;
                        break;
                    case 2341:
                        i14 = !strM96500p.equals("IN") ? -1 : 99;
                        break;
                    case 2342:
                        i14 = !strM96500p.equals("IO") ? -1 : 100;
                        break;
                    case 2344:
                        i14 = !strM96500p.equals("IQ") ? -1 : 101;
                        break;
                    case 2345:
                        i14 = !strM96500p.equals("IR") ? -1 : 102;
                        break;
                    case 2346:
                        i14 = !strM96500p.equals("IS") ? -1 : 103;
                        break;
                    case 2347:
                        i14 = !strM96500p.equals("IT") ? -1 : 104;
                        break;
                    case 2363:
                        i14 = !strM96500p.equals("JE") ? -1 : 105;
                        break;
                    case 2371:
                        i14 = !strM96500p.equals("JM") ? -1 : 106;
                        break;
                    case 2373:
                        i14 = !strM96500p.equals("JO") ? -1 : 107;
                        break;
                    case 2374:
                        i14 = !strM96500p.equals("JP") ? -1 : 108;
                        break;
                    case 2394:
                        i14 = !strM96500p.equals("KE") ? -1 : 109;
                        break;
                    case 2396:
                        i14 = !strM96500p.equals("KG") ? -1 : 110;
                        break;
                    case 2397:
                        i14 = !strM96500p.equals("KH") ? -1 : 111;
                        break;
                    case 2398:
                        i14 = !strM96500p.equals("KI") ? -1 : 112;
                        break;
                    case 2402:
                        i14 = !strM96500p.equals("KM") ? -1 : 113;
                        break;
                    case 2405:
                        i14 = !strM96500p.equals("KP") ? -1 : 114;
                        break;
                    case 2407:
                        i14 = !strM96500p.equals("KR") ? -1 : 115;
                        break;
                    case 2412:
                        i14 = !strM96500p.equals("KW") ? -1 : 116;
                        break;
                    case 2414:
                        i14 = !strM96500p.equals("KY") ? -1 : 117;
                        break;
                    case 2415:
                        i14 = !strM96500p.equals("KZ") ? -1 : 118;
                        break;
                    case 2421:
                        i14 = !strM96500p.equals("LA") ? -1 : 119;
                        break;
                    case 2422:
                        i14 = !strM96500p.equals("LB") ? -1 : 120;
                        break;
                    case 2423:
                        i14 = !strM96500p.equals("LC") ? -1 : 121;
                        break;
                    case 2429:
                        i14 = !strM96500p.equals("LI") ? -1 : 122;
                        break;
                    case 2431:
                        i14 = !strM96500p.equals("LK") ? -1 : 123;
                        break;
                    case 2438:
                        i14 = !strM96500p.equals("LR") ? -1 : 124;
                        break;
                    case 2439:
                        i14 = !strM96500p.equals("LS") ? -1 : 125;
                        break;
                    case 2440:
                        i14 = !strM96500p.equals("LT") ? -1 : 126;
                        break;
                    case 2441:
                        i14 = !strM96500p.equals("LU") ? -1 : 127;
                        break;
                    case 2442:
                        i14 = !strM96500p.equals("LV") ? -1 : 128;
                        break;
                    case 2445:
                        i14 = !strM96500p.equals("LY") ? -1 : 129;
                        break;
                    case 2452:
                        i14 = !strM96500p.equals("MA") ? -1 : 130;
                        break;
                    case 2454:
                        i14 = !strM96500p.equals("MC") ? -1 : 131;
                        break;
                    case 2455:
                        i14 = !strM96500p.equals("MD") ? -1 : 132;
                        break;
                    case 2456:
                        i14 = !strM96500p.equals("ME") ? -1 : 133;
                        break;
                    case 2457:
                        i14 = !strM96500p.equals("MF") ? -1 : 134;
                        break;
                    case 2458:
                        i14 = !strM96500p.equals("MG") ? -1 : 135;
                        break;
                    case 2459:
                        i14 = !strM96500p.equals("MH") ? -1 : 136;
                        break;
                    case 2462:
                        i14 = !strM96500p.equals("MK") ? -1 : 137;
                        break;
                    case 2463:
                        i14 = !strM96500p.equals("ML") ? -1 : 138;
                        break;
                    case 2464:
                        i14 = !strM96500p.equals("MM") ? -1 : 139;
                        break;
                    case 2465:
                        i14 = !strM96500p.equals("MN") ? -1 : 140;
                        break;
                    case 2466:
                        i14 = !strM96500p.equals("MO") ? -1 : 141;
                        break;
                    case 2467:
                        i14 = !strM96500p.equals("MP") ? -1 : 142;
                        break;
                    case 2468:
                        i14 = !strM96500p.equals("MQ") ? -1 : 143;
                        break;
                    case 2469:
                        i14 = !strM96500p.equals("MR") ? -1 : 144;
                        break;
                    case 2470:
                        i14 = !strM96500p.equals("MS") ? -1 : 145;
                        break;
                    case 2471:
                        i14 = !strM96500p.equals("MT") ? -1 : 146;
                        break;
                    case 2472:
                        i14 = !strM96500p.equals("MU") ? -1 : 147;
                        break;
                    case 2473:
                        i14 = !strM96500p.equals("MV") ? -1 : 148;
                        break;
                    case 2474:
                        i14 = !strM96500p.equals("MW") ? -1 : 149;
                        break;
                    case 2475:
                        i14 = !strM96500p.equals("MX") ? -1 : 150;
                        break;
                    case 2476:
                        i14 = !strM96500p.equals("MY") ? -1 : 151;
                        break;
                    case 2477:
                        i14 = !strM96500p.equals("MZ") ? -1 : 152;
                        break;
                    case 2483:
                        i14 = !strM96500p.equals("NA") ? -1 : 153;
                        break;
                    case 2485:
                        i14 = !strM96500p.equals("NC") ? -1 : 154;
                        break;
                    case 2487:
                        i14 = !strM96500p.equals("NE") ? -1 : 155;
                        break;
                    case 2489:
                        i14 = !strM96500p.equals("NG") ? -1 : 156;
                        break;
                    case 2491:
                        i14 = !strM96500p.equals("NI") ? -1 : 157;
                        break;
                    case 2494:
                        i14 = !strM96500p.equals("NL") ? -1 : 158;
                        break;
                    case 2497:
                        i14 = !strM96500p.equals("NO") ? -1 : 159;
                        break;
                    case 2498:
                        i14 = !strM96500p.equals("NP") ? -1 : 160;
                        break;
                    case 2500:
                        i14 = !strM96500p.equals("NR") ? -1 : 161;
                        break;
                    case 2503:
                        i14 = !strM96500p.equals("NU") ? -1 : 162;
                        break;
                    case 2508:
                        i14 = !strM96500p.equals("NZ") ? -1 : 163;
                        break;
                    case 2526:
                        i14 = !strM96500p.equals("OM") ? -1 : 164;
                        break;
                    case 2545:
                        i14 = !strM96500p.equals("PA") ? -1 : 165;
                        break;
                    case 2549:
                        i14 = !strM96500p.equals("PE") ? -1 : 166;
                        break;
                    case 2550:
                        i14 = !strM96500p.equals("PF") ? -1 : 167;
                        break;
                    case 2551:
                        i14 = !strM96500p.equals("PG") ? -1 : DateTimeConstants.HOURS_PER_WEEK;
                        break;
                    case 2552:
                        i14 = !strM96500p.equals("PH") ? -1 : 169;
                        break;
                    case 2555:
                        i14 = !strM96500p.equals("PK") ? -1 : 170;
                        break;
                    case 2556:
                        i14 = !strM96500p.equals("PL") ? -1 : 171;
                        break;
                    case 2557:
                        i14 = !strM96500p.equals("PM") ? -1 : 172;
                        break;
                    case 2562:
                        i14 = !strM96500p.equals("PR") ? -1 : 173;
                        break;
                    case 2563:
                        i14 = !strM96500p.equals("PS") ? -1 : 174;
                        break;
                    case 2564:
                        i14 = !strM96500p.equals("PT") ? -1 : 175;
                        break;
                    case 2567:
                        i14 = !strM96500p.equals("PW") ? -1 : 176;
                        break;
                    case 2569:
                        i14 = !strM96500p.equals("PY") ? -1 : 177;
                        break;
                    case 2576:
                        i14 = !strM96500p.equals("QA") ? -1 : 178;
                        break;
                    case 2611:
                        i14 = !strM96500p.equals("RE") ? -1 : 179;
                        break;
                    case 2621:
                        i14 = !strM96500p.equals("RO") ? -1 : 180;
                        break;
                    case 2625:
                        i14 = !strM96500p.equals("RS") ? -1 : 181;
                        break;
                    case 2627:
                        i14 = !strM96500p.equals("RU") ? -1 : 182;
                        break;
                    case 2629:
                        i14 = !strM96500p.equals("RW") ? -1 : 183;
                        break;
                    case 2638:
                        i14 = !strM96500p.equals("SA") ? -1 : 184;
                        break;
                    case 2639:
                        i14 = !strM96500p.equals("SB") ? -1 : 185;
                        break;
                    case 2640:
                        i14 = !strM96500p.equals("SC") ? -1 : 186;
                        break;
                    case 2641:
                        i14 = !strM96500p.equals("SD") ? -1 : 187;
                        break;
                    case 2642:
                        i14 = !strM96500p.equals("SE") ? -1 : 188;
                        break;
                    case 2644:
                        i14 = !strM96500p.equals("SG") ? -1 : 189;
                        break;
                    case 2645:
                        i14 = !strM96500p.equals("SH") ? -1 : 190;
                        break;
                    case 2646:
                        i14 = !strM96500p.equals("SI") ? -1 : 191;
                        break;
                    case 2647:
                        i14 = !strM96500p.equals("SJ") ? -1 : 192;
                        break;
                    case 2648:
                        i14 = !strM96500p.equals("SK") ? -1 : 193;
                        break;
                    case 2649:
                        i14 = !strM96500p.equals("SL") ? -1 : 194;
                        break;
                    case 2650:
                        i14 = !strM96500p.equals("SM") ? -1 : 195;
                        break;
                    case 2651:
                        i14 = !strM96500p.equals("SN") ? -1 : 196;
                        break;
                    case 2652:
                        i14 = !strM96500p.equals("SO") ? -1 : 197;
                        break;
                    case 2655:
                        i14 = !strM96500p.equals("SR") ? -1 : 198;
                        break;
                    case 2656:
                        i14 = !strM96500p.equals("SS") ? -1 : 199;
                        break;
                    case 2657:
                        i14 = !strM96500p.equals("ST") ? -1 : 200;
                        break;
                    case 2659:
                        i14 = !strM96500p.equals("SV") ? -1 : 201;
                        break;
                    case 2661:
                        i14 = !strM96500p.equals("SX") ? -1 : 202;
                        break;
                    case 2662:
                        i14 = !strM96500p.equals("SY") ? -1 : 203;
                        break;
                    case 2663:
                        i14 = !strM96500p.equals("SZ") ? -1 : 204;
                        break;
                    case 2671:
                        i14 = !strM96500p.equals("TC") ? -1 : 205;
                        break;
                    case 2672:
                        i14 = !strM96500p.equals("TD") ? -1 : 206;
                        break;
                    case 2675:
                        i14 = !strM96500p.equals("TG") ? -1 : 207;
                        break;
                    case 2676:
                        i14 = !strM96500p.equals("TH") ? -1 : 208;
                        break;
                    case 2678:
                        i14 = !strM96500p.equals("TJ") ? -1 : 209;
                        break;
                    case 2680:
                        i14 = !strM96500p.equals("TL") ? -1 : 210;
                        break;
                    case 2681:
                        i14 = !strM96500p.equals("TM") ? -1 : 211;
                        break;
                    case 2682:
                        i14 = !strM96500p.equals("TN") ? -1 : 212;
                        break;
                    case 2683:
                        i14 = !strM96500p.equals("TO") ? -1 : 213;
                        break;
                    case 2686:
                        i14 = !strM96500p.equals("TR") ? -1 : 214;
                        break;
                    case 2688:
                        i14 = !strM96500p.equals("TT") ? -1 : 215;
                        break;
                    case 2690:
                        i14 = !strM96500p.equals("TV") ? -1 : 216;
                        break;
                    case 2691:
                        i14 = !strM96500p.equals("TW") ? -1 : 217;
                        break;
                    case 2694:
                        i14 = !strM96500p.equals("TZ") ? -1 : 218;
                        break;
                    case 2700:
                        i14 = !strM96500p.equals("UA") ? -1 : 219;
                        break;
                    case 2706:
                        i14 = !strM96500p.equals("UG") ? -1 : 220;
                        break;
                    case 2718:
                        i14 = !strM96500p.equals("US") ? -1 : 221;
                        break;
                    case 2724:
                        i14 = !strM96500p.equals("UY") ? -1 : 222;
                        break;
                    case 2725:
                        i14 = !strM96500p.equals("UZ") ? -1 : 223;
                        break;
                    case 2733:
                        i14 = !strM96500p.equals("VC") ? -1 : 224;
                        break;
                    case 2735:
                        i14 = !strM96500p.equals("VE") ? -1 : 225;
                        break;
                    case 2737:
                        i14 = !strM96500p.equals("VG") ? -1 : 226;
                        break;
                    case 2739:
                        i14 = !strM96500p.equals("VI") ? -1 : 227;
                        break;
                    case 2744:
                        i14 = !strM96500p.equals("VN") ? -1 : 228;
                        break;
                    case 2751:
                        i14 = !strM96500p.equals("VU") ? -1 : 229;
                        break;
                    case 2767:
                        i14 = !strM96500p.equals("WF") ? -1 : 230;
                        break;
                    case 2780:
                        i14 = !strM96500p.equals("WS") ? -1 : 231;
                        break;
                    case 2803:
                        i14 = !strM96500p.equals("XK") ? -1 : 232;
                        break;
                    case 2828:
                        i14 = !strM96500p.equals("YE") ? -1 : 233;
                        break;
                    case 2843:
                        i14 = !strM96500p.equals("YT") ? -1 : 234;
                        break;
                    case 2855:
                        i14 = !strM96500p.equals("ZA") ? -1 : 235;
                        break;
                    case 2867:
                        i14 = !strM96500p.equals("ZM") ? -1 : 236;
                        break;
                    case 2877:
                        i14 = !strM96500p.equals("ZW") ? -1 : 237;
                        break;
                    default:
                        i14 = -1;
                        break;
                }
                switch (i14) {
                    case 0:
                    case 26:
                    case 80:
                    case 121:
                        iArr = new int[]{1, 2, 0, 0, 2, 2};
                        break;
                    case 1:
                        iArr = new int[]{1, 4, 4, 4, 3, 2};
                        break;
                    case 2:
                    case 93:
                    case 155:
                    case 187:
                    case 196:
                    case 206:
                    case 225:
                    case 233:
                        iArr = new int[]{4, 4, 4, 4, 2, 2};
                        break;
                    case 3:
                        iArr = new int[]{2, 3, 1, 2, 2, 2};
                        break;
                    case 4:
                    case 25:
                    case 51:
                    case 57:
                    case 74:
                    case 145:
                    case 224:
                        iArr = new int[]{1, 2, 2, 2, 2, 2};
                        break;
                    case 5:
                    case 16:
                    case 117:
                        iArr = new int[]{1, 2, 0, 1, 2, 2};
                        break;
                    case 6:
                        iArr = new int[]{2, 3, 2, 4, 2, 2};
                        break;
                    case 7:
                    case 44:
                        iArr = new int[]{3, 4, 3, 2, 2, 2};
                        break;
                    case 8:
                    case 63:
                    case AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB /* 100 */:
                    case 162:
                    case 190:
                    case 199:
                    case 216:
                        iArr = new int[]{4, 2, 2, 2, 2, 2};
                        break;
                    case 9:
                        iArr = new int[]{2, 4, 1, 1, 2, 2};
                        break;
                    case 10:
                        iArr = new int[]{2, 2, 2, 3, 2, 2};
                        break;
                    case 11:
                    case 40:
                    case 103:
                    case 188:
                    case 193:
                        iArr = new int[]{0, 0, 0, 0, 0, 2};
                        break;
                    case 12:
                        iArr = new int[]{0, 1, 0, 1, 2, 2};
                        break;
                    case 13:
                    case 87:
                        iArr = new int[]{1, 2, 4, 4, 2, 2};
                        break;
                    case 14:
                    case 79:
                    case 122:
                    case 142:
                    case 172:
                    case 192:
                    case 195:
                        iArr = new int[]{0, 2, 2, 2, 2, 2};
                        break;
                    case 15:
                    case 154:
                        iArr = new int[]{3, 2, 4, 4, 2, 2};
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    case 70:
                    case 77:
                        iArr = new int[]{0, 2, 0, 0, 2, 2};
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    case 151:
                        iArr = new int[]{2, 1, 3, 3, 2, 2};
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        iArr = new int[]{0, 0, 3, 3, 2, 2};
                        break;
                    case 20:
                        iArr = new int[]{4, 3, 4, 3, 2, 2};
                        break;
                    case 21:
                    case 53:
                    case 191:
                        iArr = new int[]{0, 0, 0, 0, 1, 2};
                        break;
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        iArr = new int[]{1, 2, 2, 4, 4, 2};
                        break;
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    case 59:
                    case 203:
                    case 210:
                        iArr = new int[]{4, 3, 4, 4, 2, 2};
                        break;
                    case 24:
                        iArr = new int[]{4, 4, 3, 4, 2, 2};
                        break;
                    case 27:
                        iArr = new int[]{3, 2, 1, 1, 2, 2};
                        break;
                    case 28:
                        iArr = new int[]{1, 3, 3, 2, 2, 2};
                        break;
                    case 29:
                        iArr = new int[]{1, 2, 2, 0, 2, 2};
                        break;
                    case 30:
                    case 198:
                        iArr = new int[]{2, 3, 2, 2, 2, 2};
                        break;
                    case 31:
                        iArr = new int[]{4, 2, 2, 3, 2, 2};
                        break;
                    case 32:
                        iArr = new int[]{3, 1, 3, 2, 2, 2};
                        break;
                    case 33:
                    case 89:
                        iArr = new int[]{3, 4, 1, 0, 2, 2};
                        break;
                    case 34:
                        iArr = new int[]{0, 1, 1, 3, 2, 2};
                        break;
                    case 35:
                        iArr = new int[]{2, 4, 2, 2, 2, 2};
                        break;
                    case 36:
                        iArr = new int[]{0, 2, 1, 2, 4, 1};
                        break;
                    case 37:
                        iArr = new int[]{4, 2, 3, 1, 2, 2};
                        break;
                    case 38:
                        iArr = new int[]{4, 2, 3, 2, 2, 2};
                        break;
                    case 39:
                    case 150:
                        iArr = new int[]{2, 4, 3, 4, 2, 2};
                        break;
                    case 41:
                        iArr = new int[]{3, 3, 3, 4, 2, 2};
                        break;
                    case 42:
                        iArr = new int[]{2, 2, 2, 1, 2, 2};
                        break;
                    case 43:
                    case 171:
                    case 221:
                        iArr = new int[]{1, 1, 2, 2, 3, 2};
                        break;
                    case 45:
                        iArr = new int[]{2, 0, 2, 2, 3, 1};
                        break;
                    case 46:
                        iArr = new int[]{2, 2, 4, 2, 2, 2};
                        break;
                    case 47:
                        iArr = new int[]{2, 2, 4, 4, 2, 2};
                        break;
                    case 48:
                    case DateTimeConstants.HOURS_PER_WEEK /* 168 */:
                        iArr = new int[]{4, 4, 3, 2, 2, 2};
                        break;
                    case 49:
                        iArr = new int[]{2, 3, 1, 0, 2, 2};
                        break;
                    case 50:
                        iArr = new int[]{2, 2, 0, 0, 2, 2};
                        break;
                    case 52:
                        iArr = new int[]{1, 0, 0, 0, 1, 2};
                        break;
                    case 54:
                        iArr = new int[]{0, 0, 2, 2, 1, 2};
                        break;
                    case 55:
                        iArr = new int[]{4, 1, 4, 4, 2, 2};
                        break;
                    case 56:
                        iArr = new int[]{0, 0, 1, 0, 0, 2};
                        break;
                    case 58:
                    case 106:
                        iArr = new int[]{3, 4, 4, 4, 2, 2};
                        break;
                    case 60:
                        iArr = new int[]{2, 4, 2, 1, 2, 2};
                        break;
                    case 61:
                    case 126:
                    case 128:
                    case 146:
                        iArr = new int[]{0, 0, 0, 0, 2, 2};
                        break;
                    case 62:
                        iArr = new int[]{3, 4, 2, 3, 2, 2};
                        break;
                    case 64:
                    case 96:
                        iArr = new int[]{0, 1, 1, 1, 2, 2};
                        break;
                    case 65:
                        iArr = new int[]{4, 4, 3, 1, 2, 2};
                        break;
                    case 66:
                        iArr = new int[]{0, 0, 0, 1, 0, 2};
                        break;
                    case 67:
                        iArr = new int[]{3, 1, 3, 3, 2, 2};
                        break;
                    case 68:
                    case 114:
                    case 130:
                    case 152:
                    case 200:
                        iArr = new int[]{3, 2, 2, 2, 2, 2};
                        break;
                    case 69:
                        iArr = new int[]{3, 2, 4, 2, 2, 2};
                        break;
                    case 71:
                        iArr = new int[]{1, 1, 2, 1, 1, 1};
                        break;
                    case 72:
                        iArr = new int[]{2, 3, 1, 1, 2, 2};
                        break;
                    case 73:
                        iArr = new int[]{0, 0, 1, 1, 2, 3};
                        break;
                    case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
                        iArr = new int[]{1, 1, 1, 3, 2, 2};
                        break;
                    case 76:
                    case 83:
                    case 143:
                        iArr = new int[]{2, 1, 2, 3, 2, 2};
                        break;
                    case 78:
                        iArr = new int[]{3, 2, 3, 2, 2, 2};
                        break;
                    case 81:
                    case 230:
                        iArr = new int[]{4, 2, 2, 4, 2, 2};
                        break;
                    case 82:
                        iArr = new int[]{4, 3, 4, 2, 2, 2};
                        break;
                    case 84:
                        iArr = new int[]{4, 2, 3, 4, 2, 2};
                        break;
                    case 85:
                    case 92:
                    case 132:
                    case 137:
                    case 181:
                        iArr = new int[]{1, 0, 0, 0, 2, 2};
                        break;
                    case 86:
                        iArr = new int[]{2, 3, 2, 1, 2, 2};
                        break;
                    case 88:
                    case 218:
                        iArr = new int[]{3, 4, 3, 3, 2, 2};
                        break;
                    case 90:
                        iArr = new int[]{0, 1, 2, 3, 2, 0};
                        break;
                    case 91:
                    case 170:
                    case 197:
                        iArr = new int[]{3, 2, 3, 3, 2, 2};
                        break;
                    case 94:
                        iArr = new int[]{0, 0, 0, 1, 3, 2};
                        break;
                    case 95:
                        iArr = new int[]{3, 2, 3, 3, 3, 2};
                        break;
                    case 97:
                        iArr = new int[]{1, 1, 2, 3, 4, 2};
                        break;
                    case 98:
                        iArr = new int[]{0, 2, 0, 1, 2, 2};
                        break;
                    case LogPriority.NONE /* 99 */:
                        iArr = new int[]{1, 1, 3, 2, 4, 3};
                        break;
                    case 101:
                    case 220:
                        iArr = new int[]{3, 3, 3, 3, 2, 2};
                        break;
                    case 102:
                        iArr = new int[]{3, 0, 1, 1, 3, 0};
                        break;
                    case 104:
                        iArr = new int[]{0, 1, 0, 1, 1, 2};
                        break;
                    case 105:
                        iArr = new int[]{3, 2, 1, 2, 2, 2};
                        break;
                    case 107:
                    case 133:
                        iArr = new int[]{1, 0, 0, 1, 2, 2};
                        break;
                    case 108:
                        iArr = new int[]{0, 1, 0, 1, 1, 1};
                        break;
                    case 109:
                        iArr = new int[]{3, 3, 2, 2, 2, 2};
                        break;
                    case 110:
                        iArr = new int[]{2, 1, 1, 1, 2, 2};
                        break;
                    case 111:
                        iArr = new int[]{1, 1, 4, 2, 2, 2};
                        break;
                    case 112:
                    case 113:
                    case 129:
                    case 185:
                        iArr = new int[]{4, 2, 4, 3, 2, 2};
                        break;
                    case 115:
                        iArr = new int[]{0, 0, 1, 3, 4, 4};
                        break;
                    case 116:
                        iArr = new int[]{1, 1, 0, 0, 0, 2};
                        break;
                    case 118:
                        iArr = new int[]{1, 1, 2, 2, 2, 2};
                        break;
                    case 119:
                    case 222:
                        iArr = new int[]{2, 2, 1, 2, 2, 2};
                        break;
                    case 120:
                        iArr = new int[]{3, 2, 1, 4, 2, 2};
                        break;
                    case 123:
                        iArr = new int[]{3, 1, 3, 4, 4, 2};
                        break;
                    case 124:
                        iArr = new int[]{3, 4, 4, 3, 2, 2};
                        break;
                    case 125:
                        iArr = new int[]{3, 3, 4, 3, 2, 2};
                        break;
                    case 127:
                        iArr = new int[]{1, 0, 2, 2, 2, 2};
                        break;
                    case 131:
                        iArr = new int[]{0, 2, 2, 0, 2, 2};
                        break;
                    case 134:
                        iArr = new int[]{1, 2, 1, 0, 2, 2};
                        break;
                    case 135:
                        iArr = new int[]{3, 4, 2, 2, 2, 2};
                        break;
                    case 136:
                        iArr = new int[]{3, 2, 2, 4, 2, 2};
                        break;
                    case 138:
                        iArr = new int[]{4, 3, 3, 1, 2, 2};
                        break;
                    case 139:
                        iArr = new int[]{2, 4, 3, 3, 2, 2};
                        break;
                    case 140:
                        iArr = new int[]{2, 0, 1, 2, 2, 2};
                        break;
                    case 141:
                        iArr = new int[]{0, 2, 4, 4, 2, 2};
                        break;
                    case 144:
                        iArr = new int[]{4, 1, 3, 4, 2, 2};
                        break;
                    case 147:
                        iArr = new int[]{3, 1, 1, 2, 2, 2};
                        break;
                    case 148:
                        iArr = new int[]{3, 4, 1, 4, 2, 2};
                        break;
                    case 149:
                        iArr = new int[]{4, 2, 1, 0, 2, 2};
                        break;
                    case 153:
                        iArr = new int[]{4, 3, 2, 2, 2, 2};
                        break;
                    case 156:
                        iArr = new int[]{3, 4, 1, 1, 2, 2};
                        break;
                    case 157:
                        iArr = new int[]{2, 3, 4, 3, 2, 2};
                        break;
                    case 158:
                        iArr = new int[]{0, 0, 3, 2, 0, 4};
                        break;
                    case 159:
                        iArr = new int[]{0, 0, 2, 0, 0, 2};
                        break;
                    case 160:
                        iArr = new int[]{2, 1, 4, 3, 2, 2};
                        break;
                    case 161:
                        iArr = new int[]{3, 2, 2, 0, 2, 2};
                        break;
                    case 163:
                        iArr = new int[]{1, 0, 1, 2, 4, 2};
                        break;
                    case 164:
                        iArr = new int[]{2, 3, 1, 3, 4, 2};
                        break;
                    case 165:
                        iArr = new int[]{1, 3, 3, 3, 2, 2};
                        break;
                    case 166:
                        iArr = new int[]{2, 3, 4, 4, 4, 2};
                        break;
                    case 167:
                        iArr = new int[]{2, 3, 3, 1, 2, 2};
                        break;
                    case 169:
                        iArr = new int[]{2, 2, 3, 3, 3, 2};
                        break;
                    case 173:
                        iArr = new int[]{2, 3, 2, 2, 3, 3};
                        break;
                    case 174:
                        iArr = new int[]{3, 4, 1, 2, 2, 2};
                        break;
                    case 175:
                        iArr = new int[]{0, 1, 0, 0, 2, 2};
                        break;
                    case 176:
                        iArr = new int[]{2, 2, 4, 1, 2, 2};
                        break;
                    case 177:
                        iArr = new int[]{2, 2, 3, 2, 2, 2};
                        break;
                    case 178:
                        iArr = new int[]{2, 4, 2, 4, 4, 2};
                        break;
                    case 179:
                        iArr = new int[]{1, 1, 1, 2, 2, 2};
                        break;
                    case 180:
                        iArr = new int[]{0, 0, 1, 1, 1, 2};
                        break;
                    case 182:
                        iArr = new int[]{0, 0, 0, 1, 2, 2};
                        break;
                    case 183:
                        iArr = new int[]{3, 4, 3, 0, 2, 2};
                        break;
                    case 184:
                    case 212:
                    case 226:
                        iArr = new int[]{2, 2, 1, 1, 2, 2};
                        break;
                    case 186:
                        iArr = new int[]{4, 3, 0, 2, 2, 2};
                        break;
                    case 189:
                        iArr = new int[]{1, 1, 2, 3, 1, 4};
                        break;
                    case 194:
                        iArr = new int[]{4, 3, 4, 1, 2, 2};
                        break;
                    case 201:
                        iArr = new int[]{2, 2, 3, 3, 2, 2};
                        break;
                    case 202:
                    case 205:
                        iArr = new int[]{2, 2, 1, 0, 2, 2};
                        break;
                    case 204:
                        iArr = new int[]{4, 3, 2, 4, 2, 2};
                        break;
                    case 207:
                        iArr = new int[]{3, 3, 2, 0, 2, 2};
                        break;
                    case 208:
                        iArr = new int[]{0, 3, 2, 3, 3, 0};
                        break;
                    case 209:
                        iArr = new int[]{4, 2, 4, 4, 2, 2};
                        break;
                    case 211:
                        iArr = new int[]{4, 2, 4, 2, 2, 2};
                        break;
                    case 213:
                        iArr = new int[]{4, 2, 3, 3, 2, 2};
                        break;
                    case 214:
                        iArr = new int[]{1, 1, 0, 1, 2, 2};
                        break;
                    case 215:
                        iArr = new int[]{1, 4, 1, 1, 2, 2};
                        break;
                    case 217:
                        iArr = new int[]{0, 0, 0, 0, 0, 0};
                        break;
                    case 219:
                        iArr = new int[]{0, 3, 1, 1, 2, 2};
                        break;
                    case 223:
                        iArr = new int[]{2, 2, 3, 4, 2, 2};
                        break;
                    case 227:
                        iArr = new int[]{1, 2, 1, 3, 2, 2};
                        break;
                    case 228:
                        iArr = new int[]{0, 3, 3, 4, 2, 2};
                        break;
                    case 229:
                        iArr = new int[]{4, 2, 2, 1, 2, 2};
                        break;
                    case 231:
                        iArr = new int[]{3, 1, 2, 1, 2, 2};
                        break;
                    case 232:
                        iArr = new int[]{1, 1, 1, 1, 2, 2};
                        break;
                    case 234:
                        iArr = new int[]{4, 1, 1, 1, 2, 2};
                        break;
                    case 235:
                        iArr = new int[]{3, 3, 1, 1, 1, 2};
                        break;
                    case 236:
                        iArr = new int[]{3, 3, 4, 2, 2, 2};
                        break;
                    case 237:
                        iArr = new int[]{3, 2, 4, 3, 2, 2};
                        break;
                    default:
                        iArr = new int[]{2, 2, 2, 2, 2, 2};
                        break;
                }
                HashMap map = new HashMap(8);
                map.put(0, 1000000L);
                C41060w0 c41060w1 = C22633q.f89034n;
                map.put(2, (Long) c41060w1.get(iArr[0]));
                map.put(3, (Long) C22633q.f89035o.get(iArr[1]));
                map.put(4, (Long) C22633q.f89036p.get(iArr[2]));
                map.put(5, (Long) C22633q.f89037q.get(iArr[3]));
                map.put(10, (Long) C22633q.f89038r.get(iArr[4]));
                map.put(9, (Long) C22633q.f89039s.get(iArr[5]));
                map.put(7, (Long) c41060w1.get(iArr[0]));
                this.f163012d = map;
                this.f163009a = ErrorCodes.InitAPIErrors.cServerErrors;
                this.f163013e = C24562t.f95862a;
                this.f163010b = true;
                break;
            default:
                Executor executorM121814i = AbstractC38046a.m121814i();
                this.f163011c = executorM121814i;
                this.f163012d = new CopyOnWriteArrayList();
                this.f163013e = new Object();
                this.f163009a = 0;
                executorM121814i.execute(new RunnableC30928b(i14, this, context));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C38058m m121838a(Context context) {
        try {
            if (f163008f == null) {
                f163008f = new C38058m(context, 0);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f163008f;
    }

    /* JADX INFO: renamed from: b */
    public int m121839b() {
        int i13;
        synchronized (this.f163013e) {
            i13 = this.f163009a;
        }
        return i13;
    }

    /* JADX INFO: renamed from: c */
    public void m121840c(int i13) {
        CopyOnWriteArrayList<C38057l> copyOnWriteArrayList = (CopyOnWriteArrayList) this.f163012d;
        for (C38057l c38057l : copyOnWriteArrayList) {
            if (c38057l.f163005a.get() == null) {
                copyOnWriteArrayList.remove(c38057l);
            }
        }
        synchronized (this.f163013e) {
            try {
                if (this.f163010b && this.f163009a == i13) {
                    return;
                }
                this.f163010b = true;
                this.f163009a = i13;
                for (C38057l c38057l2 : (CopyOnWriteArrayList) this.f163012d) {
                    c38057l2.f163006b.execute(new RunnableC24693e(c38057l2, 25));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
