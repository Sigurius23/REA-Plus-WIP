package io.seon.androidsdk.service;

import a00.C0072g;
import android.app.Instrumentation;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.TrafficStats;
import android.util.Base64;
import androidx.health.platform.client.proto.C1533u;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import no.nordicsemi.android.dfu.DfuBaseService;

/* JADX INFO: renamed from: io.seon.androidsdk.service.w0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20701w0 implements InterfaceC20695t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77511a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C20707z0 f77512b;

    public /* synthetic */ C20701w0(C20707z0 c20707z0, int i13) {
        this.f77511a = i13;
        this.f77512b = c20707z0;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20695t0
    /* JADX INFO: renamed from: a */
    public final Object mo56800a() {
        Instrumentation instrumentation;
        int i13 = this.f77511a;
        boolean z4 = true;
        C20707z0 c20707z0 = this.f77512b;
        switch (i13) {
            case 0:
                return c20707z0.m56898l().f77270a;
            case 1:
                c20707z0.getClass();
                try {
                    C20668h0 c20668h0 = ((C20677k0) c20707z0.f77303b.f77300b).f77359f;
                    RootOfTrust$DeviceLockState rootOfTrust$DeviceLockStateM56897k = c20707z0.m56897k();
                    if ((!rootOfTrust$DeviceLockStateM56897k.equals(RootOfTrust$DeviceLockState.UNLOCKED_HW) && !rootOfTrust$DeviceLockStateM56897k.equals(RootOfTrust$DeviceLockState.UNLOCKED_SW)) || !c20668h0.m56808j().equals(OSProbe$OSEnum.BOOTLOADER_STATE_LOCKED)) {
                        z4 = false;
                    }
                    return Boolean.valueOf(z4);
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            case 2:
                return KeyDescription$SecurityLevelEnum.get(c20707z0.m56898l().f77274e);
            case 3:
                c20707z0.getClass();
                ArrayList arrayList = new ArrayList();
                try {
                    PackageManager packageManager = c20707z0.f77523e.getPackageManager();
                    for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent("android.media.action.VIDEO_CAPTURE"), 0)) {
                        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
                        arrayList.add(resolveInfo.activityInfo.name);
                    }
                    for (ResolveInfo resolveInfo2 : packageManager.queryIntentActivities(new Intent("android.media.action.IMAGE_CAPTURE"), 0)) {
                        AtomicInteger atomicInteger2 = AbstractC20684o.f77414a;
                        arrayList.add(resolveInfo2.activityInfo.name);
                        break;
                    }
                } catch (Exception unused2) {
                }
                return arrayList;
            case 4:
                return (BigInteger) c20707z0.m56898l().f77276g.f98480F;
            case 5:
                return (String) ((C0072g) c20707z0.m56898l().f77277h.f98485y).f221E;
            case 6:
                return (String) ((C0072g) c20707z0.m56898l().f77276g.f98485y).f221E;
            case 7:
                return c20707z0.m56898l().f77273d;
            case 8:
                return c20707z0.m56898l().f77280k;
            case 9:
                return (ArrayList) c20707z0.m56898l().f77277h.f98484x;
            case 10:
                return (ArrayList) c20707z0.m56898l().f77276g.f98486z;
            case 11:
                return c20707z0.m56898l().f77271b;
            case 12:
                return (BigInteger) c20707z0.m56898l().f77277h.f98481G;
            case 13:
                return (BigInteger) c20707z0.m56898l().f77276g.f98481G;
            case 14:
                return (String) ((C0072g) c20707z0.m56898l().f77277h.f98485y).f224y;
            case 15:
                return (String) ((C0072g) c20707z0.m56898l().f77276g.f98485y).f224y;
            case 16:
                return (BigInteger) c20707z0.m56898l().f77277h.f98482H;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return (BigInteger) c20707z0.m56898l().f77276g.f98482H;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return c20707z0.m56898l().f77279j;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return c20707z0.m56898l().f77275f;
            case 20:
                return c20707z0.m56898l().f77272c;
            case 21:
                return c20707z0.m56898l().f77278i;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                c20707z0.getClass();
                try {
                    try {
                        Class<?> cls = Class.forName("android.app.ActivityThread");
                        Field declaredField = cls.getDeclaredField("sCurrentActivityThread");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(null);
                        Field declaredField2 = cls.getDeclaredField("mInstrumentation");
                        declaredField2.setAccessible(true);
                        instrumentation = (Instrumentation) declaredField2.get(obj);
                        break;
                    } catch (Exception e5) {
                        AbstractC20684o.m56853f("Instr", e5);
                        instrumentation = null;
                    }
                    if (instrumentation != null) {
                        return instrumentation.getClass().getName();
                    }
                    return null;
                } catch (Exception unused3) {
                    return null;
                }
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return (BigInteger) ((C0072g) c20707z0.m56898l().f77277h.f98485y).f223x;
            case 24:
                return (BigInteger) ((C0072g) c20707z0.m56898l().f77276g.f98485y).f223x;
            case 25:
                String strM56856i = AbstractC20684o.m56856i(c20707z0.f77523e, "ro.product.first_api_level");
                Objects.requireNonNull(strM56856i);
                return Integer.valueOf(strM56856i);
            case 26:
                return c20707z0.f77523e.getPackageName().trim();
            case 27:
                c20707z0.getClass();
                ArrayList arrayList2 = new ArrayList();
                try {
                    for (ActivityInfo activityInfo : c20707z0.f77523e.getPackageManager().getPackageInfo(c20707z0.f77523e.getApplicationContext().getPackageName(), 1).activities) {
                        arrayList2.add(activityInfo.name);
                    }
                } catch (Exception unused4) {
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).contains("applisto.appcloner")) {
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            case 28:
                C0072g c0072g = c20707z0.m56898l().f77282m;
                c0072g.getClass();
                HashMap map = new HashMap();
                map.put("crt_iss", (Integer) c0072g.f223x);
                map.put("mfr", (String) c0072g.f224y);
                map.put("ent", (String) c0072g.f225z);
                map.put("add", (HashMap) c0072g.f221E);
                return map;
            default:
                c20707z0.getClass();
                HashMap map2 = new HashMap();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                try {
                    TrafficStats.setThreadStatsTag(325411);
                    Integer[] numArr = {27042, 65000};
                    byte[] bArrDecode = Base64.decode("bAEBAQQAAAABAAAAVQAAAAEBbwAVAAAAL3JlL2ZyaWRhL0hvc3RTZXNzaW9uAAAAAgFzABYAAAByZS5mcmlkYS5Ib3N0U2Vzc2lvbjE2AAAIAWcAAXUAAAMBcwAEAAAAUGluZwAAAAAeAAAA", 0);
                    byte[] bArrDecode2 = Base64.decode("bAEAAQgAAAACAAAAawAAAAEBbwAVAAAAL3JlL2ZyaWRhL0hvc3RTZXNzaW9uAAAAAgFzABYAAAByZS5mcmlkYS5Ib3N0U2Vzc2lvbjE2AAAIAWcABWF7c3Z9AAAAAAAAAwFzABIAAABFbnVtZXJhdGVQcm9jZXNzZXMAAAAAAAAAAAAAAAAAAA==", 0);
                    for (int i14 = 0; i14 < 2; i14++) {
                        Integer num = numArr[i14];
                        int iIntValue = num.intValue();
                        try {
                            Socket socket = new Socket();
                            try {
                                socket.connect(new InetSocketAddress("127.0.0.1", iIntValue), 100);
                                socket.setSoTimeout(100);
                                OutputStream outputStream = socket.getOutputStream();
                                InputStream inputStream = socket.getInputStream();
                                Locale locale = Locale.ENGLISH;
                                Charset charset = StandardCharsets.US_ASCII;
                                outputStream.write(("GET /ws HTTP/1.1\r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: HdKNfOsC40gRHC1BvpQR0Q==\r\nSec-WebSocket-Version: 13\r\nHost: 127.0.0.1:" + num + "\r\nUser-Agent: Frida/16.6.0\r\n\r\n").getBytes(charset));
                                outputStream.flush();
                                byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                                int i15 = inputStream.read(bArr);
                                if (i15 > 0 && new String(bArr, 0, i15, charset).contains("mChJsQDTW0vQTC9txP6Lk/0lK5s=")) {
                                    arrayList3.add(num);
                                    byte[] bArr2 = new byte[10240];
                                    C20707z0.m56892i(outputStream, bArrDecode);
                                    C20707z0.m56892i(outputStream, bArrDecode2);
                                    int i16 = inputStream.read(bArr2);
                                    if (i16 > 0) {
                                        String str = new String(Arrays.copyOfRange(bArr2, 0, i16), StandardCharsets.UTF_8);
                                        String str2 = new String(Base64.decode("YW5kcm9pZA==", 0));
                                        String str3 = new String(Base64.decode("ZnJpZGE=", 0));
                                        if (AbstractC20684o.m56855h(str, str2) || AbstractC20684o.m56855h(str, str3)) {
                                            arrayList4.add(num);
                                        }
                                    }
                                }
                                socket.close();
                            } catch (Throwable th3) {
                                try {
                                    socket.close();
                                    break;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (Throwable unused5) {
                            continue;
                        }
                    }
                } catch (Exception unused6) {
                }
                map2.put("ws", arrayList3);
                map2.put("f", arrayList4);
                return map2;
        }
    }
}
