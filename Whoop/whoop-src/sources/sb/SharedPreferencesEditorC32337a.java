package sb;

import android.content.SharedPreferences;
import android.util.Pair;
import at.AbstractC1964h;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p002a0.C0025h;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: sb.a */
/* JADX INFO: loaded from: classes5.dex */
public final class SharedPreferencesEditorC32337a implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a */
    public final SharedPreferencesC32338b f133839a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences.Editor f133840b;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f133842d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f133841c = new CopyOnWriteArrayList();

    public SharedPreferencesEditorC32337a(SharedPreferencesC32338b sharedPreferencesC32338b, SharedPreferences.Editor editor) {
        this.f133839a = sharedPreferencesC32338b;
        this.f133840b = editor;
    }

    /* JADX INFO: renamed from: a */
    public final void m100634a() {
        if (this.f133842d.getAndSet(false)) {
            SharedPreferencesC32338b sharedPreferencesC32338b = this.f133839a;
            for (String str : ((HashMap) sharedPreferencesC32338b.getAll()).keySet()) {
                if (!this.f133841c.contains(str) && !SharedPreferencesC32338b.m100638d(str)) {
                    this.f133840b.remove(sharedPreferencesC32338b.m100639b(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        m100634a();
        this.f133840b.apply();
        m100635b();
        this.f133841c.clear();
    }

    /* JADX INFO: renamed from: b */
    public final void m100635b() {
        SharedPreferencesC32338b sharedPreferencesC32338b = this.f133839a;
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : sharedPreferencesC32338b.f133844b) {
            Iterator it = this.f133841c.iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC32338b, (String) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m100636c(String str, byte[] bArr) {
        SharedPreferencesC32338b sharedPreferencesC32338b = this.f133839a;
        sharedPreferencesC32338b.getClass();
        if (SharedPreferencesC32338b.m100638d(str)) {
            throw new SecurityException(AbstractC2875y.m8299l(str, " is a reserved key for the encryption keyset."));
        }
        this.f133841c.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strM100639b = sharedPreferencesC32338b.m100639b(str);
            try {
                Pair pair = new Pair(strM100639b, new String(AbstractC1964h.m5997b(sharedPreferencesC32338b.f133845c.mo5979a(bArr, strM100639b.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                this.f133840b.putString((String) pair.first, (String) pair.second);
            } catch (UnsupportedEncodingException e5) {
                throw new AssertionError(e5);
            }
        } catch (GeneralSecurityException e13) {
            throw new SecurityException("Could not encrypt data: " + e13.getMessage(), e13);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f133842d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f133841c;
        m100634a();
        try {
            return this.f133840b.commit();
        } finally {
            m100635b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z4) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(5);
        byteBufferAllocate.put(z4 ? (byte) 1 : (byte) 0);
        m100636c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f13) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(4);
        byteBufferAllocate.putFloat(f13);
        m100636c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i13) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(2);
        byteBufferAllocate.putInt(i13);
        m100636c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j7) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(3);
        byteBufferAllocate.putLong(j7);
        m100636c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        m100636c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new C0025h(0);
            set.add("__NULL__");
        }
        ArrayList<byte[]> arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(1);
        for (byte[] bArr : arrayList) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        m100636c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        SharedPreferencesC32338b sharedPreferencesC32338b = this.f133839a;
        sharedPreferencesC32338b.getClass();
        if (SharedPreferencesC32338b.m100638d(str)) {
            throw new SecurityException(AbstractC2875y.m8299l(str, " is a reserved key for the encryption keyset."));
        }
        this.f133840b.remove(sharedPreferencesC32338b.m100639b(str));
        this.f133841c.add(str);
        return this;
    }
}
