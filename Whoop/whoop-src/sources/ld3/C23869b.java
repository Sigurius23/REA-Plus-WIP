package ld3;

import android.content.Context;
import android.util.Log;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import net.danlew.android.joda.R$raw;
import org.joda.time.DateTimeZone;
import org.joda.time.p378tz.DateTimeZoneBuilder;
import org.joda.time.p378tz.Provider;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: ld3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C23869b implements Provider {

    /* JADX INFO: renamed from: a */
    public final Context f94387a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f94388b;

    public C23869b(Context context) throws IOException {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.f94387a = context.getApplicationContext();
        InputStream inputStreamM70124b = m70124b("ZoneInfoMap");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStreamM70124b);
        try {
            m70122c(dataInputStream, concurrentHashMap);
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.UTC));
            this.f94388b = concurrentHashMap;
        } catch (Throwable th3) {
            try {
                dataInputStream.close();
            } catch (IOException unused2) {
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m70122c(DataInputStream dataInputStream, ConcurrentHashMap concurrentHashMap) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[unsignedShort];
        for (int i13 = 0; i13 < unsignedShort; i13++) {
            strArr[i13] = dataInputStream.readUTF().intern();
        }
        int unsignedShort2 = dataInputStream.readUnsignedShort();
        for (int i14 = 0; i14 < unsignedShort2; i14++) {
            try {
                concurrentHashMap.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x001a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:9:0x001a */
    /* JADX INFO: renamed from: a */
    public final DateTimeZone m70123a(String str) throws Throwable {
        InputStream inputStreamM70124b;
        InputStream inputStream;
        ConcurrentHashMap concurrentHashMap = this.f94388b;
        InputStream inputStream2 = null;
        try {
            try {
                inputStreamM70124b = m70124b(str);
                try {
                    DateTimeZone from = DateTimeZoneBuilder.readFrom(inputStreamM70124b, str);
                    concurrentHashMap.put(str, new SoftReference(from));
                    if (inputStreamM70124b != null) {
                        try {
                            inputStreamM70124b.close();
                        } catch (IOException unused) {
                        }
                    }
                    return from;
                } catch (IOException e5) {
                    e = e5;
                    e.printStackTrace();
                    concurrentHashMap.remove(str);
                    if (inputStreamM70124b != null) {
                        try {
                            inputStreamM70124b.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException e13) {
            e = e13;
            inputStreamM70124b = null;
        } catch (Throwable th4) {
            th = th4;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final InputStream m70124b(String str) throws IOException {
        Map concurrentHashMap;
        int iIntValue;
        Context context = this.f94387a;
        if (context == null) {
            throw new RuntimeException("Need to call JodaTimeAndroid.init() before using joda-time-android");
        }
        ConcurrentHashMap concurrentHashMap2 = AbstractC23868a.f94386a;
        StringBuilder sb4 = new StringBuilder("joda_");
        File file = new File(str);
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(file.getName());
            file = file.getParentFile();
        } while (file != null);
        StringBuffer stringBuffer = new StringBuffer();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append("_");
            }
            stringBuffer.append((String) arrayList.get(size));
        }
        sb4.append(stringBuffer.toString().replace('-', '_').replace("+", "plus").toLowerCase(Locale.US));
        String string = sb4.toString();
        ConcurrentHashMap concurrentHashMap3 = AbstractC23868a.f94386a;
        if (concurrentHashMap3.containsKey(R$raw.class)) {
            concurrentHashMap = (Map) concurrentHashMap3.get(R$raw.class);
        } else {
            concurrentHashMap = new ConcurrentHashMap();
            concurrentHashMap3.put(R$raw.class, concurrentHashMap);
        }
        if (concurrentHashMap.containsKey(string)) {
            iIntValue = ((Integer) concurrentHashMap.get(string)).intValue();
        } else {
            try {
                iIntValue = R$raw.class.getField(string).getInt(null);
                if (iIntValue != 0) {
                    concurrentHashMap.put(string, Integer.valueOf(iIntValue));
                }
            } catch (Exception e5) {
                Log.e("JodaTimeAndroid", "Failed to retrieve identifier: type=" + R$raw.class + " name=" + string, e5);
                iIntValue = 0;
            }
        }
        if (iIntValue != 0) {
            return context.getResources().openRawResource(iIntValue);
        }
        throw new IOException(AbstractC2875y.m8300m("Resource not found: \"", str, "\" (resName: \"", string, "\")"));
    }

    @Override // org.joda.time.p378tz.Provider
    public final Set getAvailableIDs() {
        return new TreeSet(this.f94388b.keySet());
    }

    @Override // org.joda.time.p378tz.Provider
    public final DateTimeZone getZone(String str) {
        Object obj;
        if (str == null || (obj = this.f94388b.get(str)) == null) {
            return null;
        }
        if (str.equals(obj)) {
            return m70123a(str);
        }
        if (!(obj instanceof SoftReference)) {
            return getZone((String) obj);
        }
        DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
        return dateTimeZone != null ? dateTimeZone : m70123a(str);
    }
}
