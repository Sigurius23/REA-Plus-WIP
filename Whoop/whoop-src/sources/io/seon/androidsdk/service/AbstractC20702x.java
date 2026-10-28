package io.seon.androidsdk.service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import p037bu.C3632c;

/* JADX INFO: renamed from: io.seon.androidsdk.service.x */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20702x {

    /* JADX INFO: renamed from: a */
    public static final C3632c f77513a = new C3632c(AbstractC20702x.class.getName());

    /* JADX INFO: renamed from: b */
    public static final String[] f77514b = {"build_manufacturer", "build_id", "build_device", "build_number", "kernel_version", "kernel_arch", "cpu_count", "cpu_speed", "total_storage", "sensor_hash", "build_device", "build_model", "device_id", "region_language", "physical_memory"};

    /* JADX INFO: renamed from: c */
    public static final ArrayList f77515c = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:37:0x005d A[Catch: Exception -> 0x001d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x001d, blocks: (B:3:0x0003, B:8:0x0014, B:30:0x004a, B:33:0x0053, B:37:0x005d, B:39:0x0065, B:41:0x006b, B:45:0x0077, B:44:0x0074, B:46:0x007a, B:48:0x007e, B:50:0x0084, B:51:0x0088, B:53:0x008e, B:55:0x009a, B:60:0x00bc, B:32:0x0050, B:27:0x0044, B:19:0x0030, B:14:0x0022, B:16:0x0028, B:22:0x0036, B:24:0x003c), top: B:70:0x0003, inners: #0, #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x006b A[Catch: Exception -> 0x001d, JSONException -> 0x0073, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0073, blocks: (B:39:0x0065, B:41:0x006b), top: B:68:0x0065, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x008e A[Catch: Exception -> 0x001d, LOOP:1: B:51:0x0088->B:53:0x008e, LOOP_END, TRY_LEAVE, TryCatch #3 {Exception -> 0x001d, blocks: (B:3:0x0003, B:8:0x0014, B:30:0x004a, B:33:0x0053, B:37:0x005d, B:39:0x0065, B:41:0x006b, B:45:0x0077, B:44:0x0074, B:46:0x007a, B:48:0x007e, B:50:0x0084, B:51:0x0088, B:53:0x008e, B:55:0x009a, B:60:0x00bc, B:32:0x0050, B:27:0x0044, B:19:0x0030, B:14:0x0022, B:16:0x0028, B:22:0x0036, B:24:0x003c), top: B:70:0x0003, inners: #0, #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x007a A[EDGE_INSN: B:76:0x007a->B:46:0x007a BREAK  A[LOOP:0: B:35:0x0056->B:45:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0077 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static String m56891a(JSONObject jSONObject) {
        String string;
        String str;
        String[] strArr;
        int i13;
        C3632c c3632c;
        ArrayList arrayList;
        Iterator it;
        String str2;
        try {
            StringBuilder sb4 = new StringBuilder();
            AtomicInteger atomicInteger = AbstractC20684o.f77414a;
            try {
                string = jSONObject.getString("media_drm_id");
                while (true) {
                    c3632c = f77513a;
                    if (i13 < 15) {
                        break;
                    }
                    str2 = strArr[i13];
                    if (jSONObject.has(str2)) {
                        try {
                            if (jSONObject.get(str2) != null) {
                                sb4.append(jSONObject.get(str2));
                            }
                        } catch (JSONException e5) {
                            c3632c.m11163L(6, e5);
                        }
                    }
                    i13++;
                    AbstractC20684o.m56853f("DHash", e);
                    return null;
                }
            } catch (Throwable unused) {
                string = null;
            }
            try {
                if (string == null || string.equals("null")) {
                    try {
                        string = jSONObject.has("gsf_id") ? (String) jSONObject.get("gsf_id") : null;
                    } catch (Exception e13) {
                        AbstractC20684o.m56853f("PField", e13);
                    }
                    try {
                        str = jSONObject.has("android_id") ? (String) jSONObject.get("android_id") : null;
                        while (true) {
                            c3632c = f77513a;
                            if (i13 < 15) {
                                break;
                                break;
                            }
                            str2 = strArr[i13];
                            if (jSONObject.has(str2)) {
                                if (jSONObject.get(str2) != null) {
                                    sb4.append(jSONObject.get(str2));
                                }
                            }
                            i13++;
                            AbstractC20684o.m56853f("DHash", e);
                            return null;
                        }
                    } catch (Exception e14) {
                        AbstractC20684o.m56853f("PField", e14);
                    }
                    if (string == null) {
                        if (str != null) {
                            sb4.append(str);
                        }
                    }
                    strArr = f77514b;
                    i13 = 0;
                    arrayList = f77515c;
                    if (arrayList != null && arrayList.size() > 0) {
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            sb4.append(it.next().toString());
                        }
                    }
                    byte[] bytes = sb4.toString().getBytes("UTF-8");
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.reset();
                    messageDigest.update(bytes);
                    return AbstractC20684o.m56849b(messageDigest.digest());
                }
                byte[] bytes2 = sb4.toString().getBytes("UTF-8");
                MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
                messageDigest2.reset();
                messageDigest2.update(bytes2);
                return AbstractC20684o.m56849b(messageDigest2.digest());
            } catch (UnsupportedEncodingException | NoSuchAlgorithmException e15) {
                c3632c.m11163L(6, e15);
            }
            sb4.append(string);
            strArr = f77514b;
            i13 = 0;
            arrayList = f77515c;
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    sb4.append(it.next().toString());
                }
            }
        } catch (Exception e16) {
            AbstractC20684o.m56853f("DHash", e16);
        }
    }
}
