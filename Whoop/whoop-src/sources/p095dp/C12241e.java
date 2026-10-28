package p095dp;

import dalvik.system.PathClassLoader;

/* JADX INFO: renamed from: dp.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C12241e extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z4) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z4);
    }
}
