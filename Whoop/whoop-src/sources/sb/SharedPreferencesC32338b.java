package sb;

import android.content.Context;
import android.content.SharedPreferences;
import at.AbstractC1964h;
import gs.AbstractC16121a;
import io.sentry.android.replay.video.C20245d;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import ls.AbstractC24708e;
import p002a0.C0025h;
import p031b9.AbstractC2875y;
import p087db.C11856j0;
import p108e4.AbstractC12682p;
import p154fs.AbstractC14724b;
import p154fs.C14730h;
import p154fs.InterfaceC14723a;
import p154fs.InterfaceC14725c;

/* JADX INFO: renamed from: sb.b */
/* JADX INFO: loaded from: classes5.dex */
public final class SharedPreferencesC32338b implements SharedPreferences {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f133843a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f133844b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public final InterfaceC14723a f133845c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC14725c f133846d;

    public SharedPreferencesC32338b(SharedPreferences sharedPreferences, InterfaceC14723a interfaceC14723a, InterfaceC14725c interfaceC14725c) {
        this.f133843a = sharedPreferences;
        this.f133845c = interfaceC14723a;
        this.f133846d = interfaceC14725c;
    }

    /* JADX INFO: renamed from: a */
    public static SharedPreferencesC32338b m100637a(Context context, C11856j0 c11856j0) {
        String str = c11856j0.f38685x;
        AbstractC24708e.m72317a();
        AbstractC16121a.m45676a();
        Context applicationContext = context.getApplicationContext();
        C20245d c20245d = new C20245d(2);
        c20245d.f76050f = AbstractC14724b.m42224a("AES256_SIV");
        c20245d.m56175r(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", "iterable-encrypted-shared-preferences");
        c20245d.m56174q("android-keystore://" + str);
        C14730h c14730hM90130a = c20245d.m56160a().m90130a();
        C20245d c20245d2 = new C20245d(2);
        c20245d2.f76050f = AbstractC14724b.m42224a("AES256_GCM");
        c20245d2.m56175r(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", "iterable-encrypted-shared-preferences");
        c20245d2.m56174q("android-keystore://" + str);
        C14730h c14730hM90130a2 = c20245d2.m56160a().m90130a();
        return new SharedPreferencesC32338b(applicationContext.getSharedPreferences("iterable-encrypted-shared-preferences", 0), (InterfaceC14723a) c14730hM90130a2.m42234b(InterfaceC14723a.class), (InterfaceC14725c) c14730hM90130a.m42234b(InterfaceC14725c.class));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m100638d(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    /* JADX INFO: renamed from: b */
    public final String m100639b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(AbstractC1964h.m5997b(this.f133846d.mo5993a(str.getBytes(StandardCharsets.UTF_8), "iterable-encrypted-shared-preferences".getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e5) {
                throw new AssertionError(e5);
            }
        } catch (GeneralSecurityException e13) {
            throw new SecurityException("Could not encrypt key. " + e13.getMessage(), e13);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m100640c(String str) {
        int i13;
        String str2;
        if (m100638d(str)) {
            throw new SecurityException(AbstractC2875y.m8299l(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strM100639b = m100639b(str);
            String string = this.f133843a.getString(strM100639b, null);
            if (string != null) {
                byte[] bArrM5996a = AbstractC1964h.m5996a(string);
                InterfaceC14723a interfaceC14723a = this.f133845c;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(interfaceC14723a.mo5980b(bArrM5996a, strM100639b.getBytes(charset)));
                byteBufferWrap.position(0);
                int i14 = byteBufferWrap.getInt();
                if (i14 == 0) {
                    i13 = 1;
                } else if (i14 == 1) {
                    i13 = 2;
                } else if (i14 == 2) {
                    i13 = 3;
                } else if (i14 == 3) {
                    i13 = 4;
                } else if (i14 != 4) {
                    i13 = i14 != 5 ? 0 : 6;
                } else {
                    i13 = 5;
                }
                if (i13 == 0) {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i14);
                }
                int iM35485e = AbstractC12682p.m35485e(i13);
                if (iM35485e == 0) {
                    int i15 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i15);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (!string2.equals("__NULL__")) {
                        return string2;
                    }
                } else {
                    if (iM35485e != 1) {
                        if (iM35485e == 2) {
                            return Integer.valueOf(byteBufferWrap.getInt());
                        }
                        if (iM35485e == 3) {
                            return Long.valueOf(byteBufferWrap.getLong());
                        }
                        if (iM35485e == 4) {
                            return Float.valueOf(byteBufferWrap.getFloat());
                        }
                        if (iM35485e == 5) {
                            return Boolean.valueOf(byteBufferWrap.get() != 0);
                        }
                        switch (i13) {
                            case 1:
                                str2 = "STRING";
                                break;
                            case 2:
                                str2 = "STRING_SET";
                                break;
                            case 3:
                                str2 = "INT";
                                break;
                            case 4:
                                str2 = "LONG";
                                break;
                            case 5:
                                str2 = "FLOAT";
                                break;
                            case 6:
                                str2 = "BOOLEAN";
                                break;
                            default:
                                str2 = "null";
                                break;
                        }
                        throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
                    }
                    C0025h c0025h = new C0025h(0);
                    while (byteBufferWrap.hasRemaining()) {
                        int i16 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i16);
                        byteBufferWrap.position(byteBufferWrap.position() + i16);
                        c0025h.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (c0025h.f61y != 1 || !"__NULL__".equals(c0025h.f60x[0])) {
                        return c0025h;
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e5) {
            throw new SecurityException("Could not decrypt value. " + e5.getMessage(), e5);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (m100638d(str)) {
            throw new SecurityException(AbstractC2875y.m8299l(str, " is a reserved key for the encryption keyset."));
        }
        return this.f133843a.contains(m100639b(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC32337a(this, this.f133843a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f133843a.getAll().entrySet()) {
            if (!m100638d(entry.getKey())) {
                try {
                    String str = new String(this.f133846d.mo5994b(AbstractC1964h.m5996a(entry.getKey()), "iterable-encrypted-shared-preferences".getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, m100640c(str));
                } catch (GeneralSecurityException e5) {
                    throw new SecurityException("Could not decrypt key. " + e5.getMessage(), e5);
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z4) {
        Object objM100640c = m100640c(str);
        return objM100640c instanceof Boolean ? ((Boolean) objM100640c).booleanValue() : z4;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f13) {
        Object objM100640c = m100640c(str);
        return objM100640c instanceof Float ? ((Float) objM100640c).floatValue() : f13;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i13) {
        Object objM100640c = m100640c(str);
        return objM100640c instanceof Integer ? ((Integer) objM100640c).intValue() : i13;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j7) {
        Object objM100640c = m100640c(str);
        return objM100640c instanceof Long ? ((Long) objM100640c).longValue() : j7;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objM100640c = m100640c(str);
        return objM100640c instanceof String ? (String) objM100640c : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objM100640c = m100640c(str);
        Set c0025h = objM100640c instanceof Set ? (Set) objM100640c : new C0025h(0);
        return c0025h.size() > 0 ? c0025h : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f133844b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f133844b.remove(onSharedPreferenceChangeListener);
    }
}
