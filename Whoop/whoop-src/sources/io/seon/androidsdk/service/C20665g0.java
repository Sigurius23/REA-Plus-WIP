package io.seon.androidsdk.service;

import ai.C0904j;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.iterable.iterableapi.C5327g1;
import com.scottyab.rootbeer.RootBeerNative;
import com.whoop.service.network.model.UserSessionDto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTimeConstants;
import p048ce.AbstractC4482w;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p385ox.AbstractC28446a;

/* JADX INFO: renamed from: io.seon.androidsdk.service.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20665g0 implements InterfaceC20695t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77305a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f77306b;

    public /* synthetic */ C20665g0(Object obj, int i13) {
        this.f77305a = i13;
        this.f77306b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:204:0x0494  */
    @Override // io.seon.androidsdk.service.InterfaceC20695t0
    /* JADX INFO: renamed from: a */
    public final Object mo56800a() {
        boolean z4;
        String[] strArrSplit;
        boolean z13;
        String[] strArrSplit2;
        boolean z14;
        String[] strArr;
        Process processExec;
        boolean z15;
        boolean z16;
        Double dValueOf;
        Float fValueOf;
        Float fValueOf2;
        HashMap map;
        Float fValueOf3;
        Float fValueOf4;
        Float fValueOf5;
        Long lValueOf;
        String provider;
        Long lValueOf2;
        switch (this.f77305a) {
            case 0:
                C5327g1 c5327g1 = (C5327g1) this.f77306b;
                if (!c5327g1.m16443e(new ArrayList(Arrays.asList(AbstractC28446a.f114688a)))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(Arrays.asList(AbstractC28446a.f114689b));
                    if (c5327g1.m16443e(arrayList) || C5327g1.m16439a("su")) {
                        z4 = true;
                    } else {
                        HashMap map2 = new HashMap();
                        map2.put("ro.debuggable", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
                        map2.put("ro.secure", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE);
                        try {
                            InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
                            strArrSplit = inputStream != null ? new Scanner(inputStream).useDelimiter("\\A").next().split("\n") : null;
                        } catch (IOException | NoSuchElementException e5) {
                            if (AbstractC4482w.f18018E > 0) {
                                e5.printStackTrace();
                            }
                        }
                        if (strArrSplit == null) {
                            z13 = false;
                        } else {
                            z13 = false;
                            for (String str : strArrSplit) {
                                for (String str2 : map2.keySet()) {
                                    if (str.contains(str2)) {
                                        String strM31996o = AbstractC11895b.m31996o("[", (String) map2.get(str2), "]");
                                        if (str.contains(strM31996o)) {
                                            AbstractC4482w.m14002m0(str2 + " = " + strM31996o + " detected!");
                                            z13 = true;
                                        }
                                    }
                                }
                            }
                        }
                        if (z13) {
                            z4 = true;
                        } else {
                            try {
                                InputStream inputStream2 = Runtime.getRuntime().exec("mount").getInputStream();
                                strArrSplit2 = inputStream2 != null ? new Scanner(inputStream2).useDelimiter("\\A").next().split("\n") : null;
                            } catch (IOException | NoSuchElementException e13) {
                                if (AbstractC4482w.f18018E > 0) {
                                    e13.printStackTrace();
                                }
                            }
                            if (strArrSplit2 == null) {
                                z14 = false;
                            } else {
                                int length = strArrSplit2.length;
                                int i13 = 0;
                                z14 = false;
                                while (i13 < length) {
                                    String str3 = strArrSplit2[i13];
                                    String[] strArrSplit3 = str3.split(" ");
                                    if (strArrSplit3.length < 6) {
                                        AbstractC4482w.m13971G("Error formatting mount line: ".concat(str3));
                                    } else {
                                        String str4 = strArrSplit3[2];
                                        String strReplace = strArrSplit3[5];
                                        int i14 = 0;
                                        while (i14 < 7) {
                                            String str5 = AbstractC28446a.f114691d[i14];
                                            if (!str4.equalsIgnoreCase(str5)) {
                                                strArr = strArrSplit2;
                                            }
                                            strReplace = strReplace.replace("(", "").replace(")", "");
                                            String[] strArrSplit4 = strReplace.split(",");
                                            int length2 = strArrSplit4.length;
                                            int i15 = 0;
                                            while (true) {
                                                if (i15 >= length2) {
                                                    strArr = strArrSplit2;
                                                }
                                                strArr = strArrSplit2;
                                                if (strArrSplit4[i15].equalsIgnoreCase("rw")) {
                                                    AbstractC4482w.m14002m0(str5 + " path is mounted with rw permissions! " + str3);
                                                    z14 = true;
                                                }
                                                i15++;
                                                strArrSplit2 = strArr;
                                                break;
                                                break;
                                            }
                                            break;
                                            i14++;
                                            strArrSplit2 = strArr;
                                        }
                                    }
                                    i13++;
                                    strArrSplit2 = strArrSplit2;
                                }
                            }
                            if (z14) {
                                z4 = true;
                            } else {
                                String str6 = Build.TAGS;
                                if (str6 != null && str6.contains("test-keys")) {
                                    z4 = true;
                                } else {
                                    try {
                                        processExec = Runtime.getRuntime().exec(new String[]{"which", "su"});
                                        try {
                                            z15 = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
                                            processExec.destroy();
                                        } catch (Throwable unused) {
                                            if (processExec != null) {
                                                processExec.destroy();
                                            }
                                            z15 = false;
                                        }
                                    } catch (Throwable unused2) {
                                        processExec = null;
                                    }
                                    if (z15) {
                                        z4 = true;
                                    } else {
                                        if (RootBeerNative.f22074a) {
                                            String[] strArrM86214a = AbstractC28446a.m86214a();
                                            int length3 = strArrM86214a.length;
                                            String[] strArr2 = new String[length3];
                                            for (int i16 = 0; i16 < length3; i16++) {
                                                strArr2[i16] = AbstractC25012a.m73376i(strArrM86214a[i16], "su", new StringBuilder());
                                            }
                                            RootBeerNative rootBeerNative = new RootBeerNative();
                                            try {
                                                rootBeerNative.setLogDebugMessages(c5327g1.f21694w);
                                                z16 = rootBeerNative.checkForRoot(strArr2) > 0;
                                            } catch (UnsatisfiedLinkError unused3) {
                                            }
                                            if (!z16 || C5327g1.m16439a("magisk")) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                        } else {
                                            AbstractC4482w.m13971G("We could not load the native library to test for root");
                                        }
                                        if (z16) {
                                            z4 = true;
                                        } else {
                                            z4 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                } else {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 1:
                C20687p0 c20687p0 = (C20687p0) this.f77306b;
                HashMap map3 = new HashMap();
                List<String> providers = null;
                try {
                    dValueOf = Double.valueOf(c20687p0.m56870l().getAltitude());
                    break;
                } catch (Exception e14) {
                    AbstractC20664g.f77301d.m11163L(3, e14);
                    dValueOf = null;
                } catch (Throwable unused4) {
                    dValueOf = null;
                }
                map3.put("altitude", dValueOf);
                try {
                    fValueOf = Float.valueOf(c20687p0.m56870l().getBearing());
                    break;
                } catch (Exception e15) {
                    AbstractC20664g.f77301d.m11163L(3, e15);
                    fValueOf = null;
                } catch (Throwable unused5) {
                    fValueOf = null;
                }
                map3.put("bearing", fValueOf);
                try {
                    fValueOf2 = Float.valueOf(c20687p0.m56870l().getBearingAccuracyDegrees());
                    break;
                } catch (Exception e16) {
                    AbstractC20664g.f77301d.m11163L(3, e16);
                    fValueOf2 = null;
                } catch (Throwable unused6) {
                    fValueOf2 = null;
                }
                map3.put("bearing_accuracy", fValueOf2);
                try {
                    Bundle extras = c20687p0.m56870l().getExtras();
                    if (extras == null || extras.isEmpty()) {
                        map = null;
                    } else {
                        map = new HashMap();
                        for (String str7 : extras.keySet()) {
                            map.put(str7, extras.get(str7));
                        }
                    }
                } catch (Exception e17) {
                    AbstractC20664g.f77301d.m11163L(3, e17);
                } catch (Throwable unused7) {
                }
                map3.put("extras", map);
                try {
                    fValueOf3 = Float.valueOf(c20687p0.m56870l().getSpeed());
                    break;
                } catch (Exception e18) {
                    AbstractC20664g.f77301d.m11163L(3, e18);
                    fValueOf3 = null;
                } catch (Throwable unused8) {
                    fValueOf3 = null;
                }
                map3.put("speed", fValueOf3);
                try {
                    fValueOf4 = Float.valueOf(c20687p0.m56870l().getSpeedAccuracyMetersPerSecond());
                    break;
                } catch (Exception e19) {
                    AbstractC20664g.f77301d.m11163L(3, e19);
                    fValueOf4 = null;
                } catch (Throwable unused9) {
                    fValueOf4 = null;
                }
                map3.put("speed_accuracy", fValueOf4);
                try {
                    fValueOf5 = Float.valueOf(c20687p0.m56870l().getVerticalAccuracyMeters());
                    break;
                } catch (Exception e22) {
                    AbstractC20664g.f77301d.m11163L(3, e22);
                    fValueOf5 = null;
                } catch (Throwable unused10) {
                    fValueOf5 = null;
                }
                map3.put("vertical_accuracy", fValueOf5);
                try {
                    lValueOf = Long.valueOf(c20687p0.m56870l().getTime());
                    break;
                } catch (Exception e24) {
                    AbstractC20664g.f77301d.m11163L(3, e24);
                    lValueOf = null;
                } catch (Throwable unused11) {
                    lValueOf = null;
                }
                map3.put("timestamp", lValueOf);
                try {
                    provider = c20687p0.m56870l().getProvider();
                    break;
                } catch (Exception e25) {
                    AbstractC20664g.f77301d.m11163L(3, e25);
                    provider = null;
                } catch (Throwable unused12) {
                    provider = null;
                }
                map3.put("provider", provider);
                try {
                    lValueOf2 = Long.valueOf(TimeUnit.NANOSECONDS.toSeconds(SystemClock.elapsedRealtimeNanos() - c20687p0.f77431m.getElapsedRealtimeNanos()));
                    break;
                } catch (Exception e26) {
                    AbstractC20664g.f77301d.m11163L(3, e26);
                    lValueOf2 = null;
                } catch (Throwable unused13) {
                    lValueOf2 = null;
                }
                map3.put("age_sec", lValueOf2);
                try {
                    LocationManager locationManager = c20687p0.f77426h;
                    providers = locationManager == null ? c20687p0.f77423e : locationManager.getProviders(true);
                } catch (Exception e27) {
                    AbstractC20664g.f77301d.m11163L(3, e27);
                } catch (Throwable unused14) {
                }
                map3.put("providers_enabled", providers);
                return map3;
            case 2:
                C20667h c20667h = (C20667h) this.f77306b;
                c20667h.getClass();
                HashMap map4 = new HashMap();
                map4.put("min", Float.valueOf(c20667h.f77314c));
                map4.put("max", Float.valueOf(c20667h.f77313b));
                map4.put("med", Float.valueOf(c20667h.f77312a));
                map4.put("p95", Float.valueOf(c20667h.f77315d));
                map4.put("sample", Integer.valueOf(c20667h.f77316e));
                return map4;
            case 3:
                C0904j c0904j = (C0904j) this.f77306b;
                c0904j.getClass();
                HashMap map5 = new HashMap();
                float[][] fArr = (float[][]) c0904j.f3302x;
                ArrayList arrayList2 = new ArrayList();
                for (float[] fArr2 : fArr) {
                    ArrayList arrayList3 = new ArrayList();
                    for (float f13 : fArr2) {
                        arrayList3.add(Float.valueOf(f13));
                    }
                    arrayList2.add(arrayList3);
                }
                map5.put("elems", arrayList2);
                map5.put("sample", Integer.valueOf(c0904j.f3301w));
                return map5;
            case 4:
                C20667h c20667h2 = (C20667h) this.f77306b;
                c20667h2.getClass();
                HashMap map6 = new HashMap();
                map6.put("med", Float.valueOf(c20667h2.f77312a));
                map6.put("max", Float.valueOf(c20667h2.f77313b));
                map6.put("min", Float.valueOf(c20667h2.f77314c));
                map6.put("p95", Float.valueOf(c20667h2.f77315d));
                map6.put("sample", Integer.valueOf(c20667h2.f77316e));
                return map6;
            default:
                ((C20675j1) this.f77306b).getClass();
                TimeZone timeZone = TimeZone.getDefault();
                int offset = timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis());
                return (offset >= 0 ? "+" : "-").concat(String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(Math.abs(offset / DateTimeConstants.MILLIS_PER_HOUR)), Integer.valueOf(Math.abs((offset / DateTimeConstants.MILLIS_PER_MINUTE) % 60))));
        }
    }
}
