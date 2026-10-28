package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import p080d4.C11655n;
import p097ds.InterfaceFutureC12319v;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileVerifier {
    private static final String CUR_PROFILES_BASE_DIR = "/data/misc/profiles/cur/0/";
    private static final String PROFILE_FILE_NAME = "primary.prof";
    private static final String PROFILE_INSTALLED_CACHE_FILE_NAME = "profileInstalled";
    private static final String REF_PROFILES_BASE_DIR = "/data/misc/profiles/ref/";
    private static final String TAG = "ProfileVerifier";
    private static final C11655n sFuture = new C11655n();
    private static final Object SYNC_OBJ = new Object();
    private static CompilationStatus sCompilationStatus = null;

    public static class Api33Impl {
        private Api33Impl() {
        }

        public static PackageInfo getPackageInfo(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public static class Cache {
        private static final int SCHEMA = 1;
        final long mInstalledCurrentProfileSize;
        final long mPackageLastUpdateTime;
        final int mResultCode;
        final int mSchema;

        public Cache(int i13, int i14, long j7, long j13) {
            this.mSchema = i13;
            this.mResultCode = i14;
            this.mPackageLastUpdateTime = j7;
            this.mInstalledCurrentProfileSize = j13;
        }

        public static Cache readFromFile(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                Cache cache = new Cache(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return cache;
            } catch (Throwable th3) {
                try {
                    dataInputStream.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof Cache)) {
                Cache cache = (Cache) obj;
                if (this.mResultCode == cache.mResultCode && this.mPackageLastUpdateTime == cache.mPackageLastUpdateTime && this.mSchema == cache.mSchema && this.mInstalledCurrentProfileSize == cache.mInstalledCurrentProfileSize) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.mResultCode), Long.valueOf(this.mPackageLastUpdateTime), Integer.valueOf(this.mSchema), Long.valueOf(this.mInstalledCurrentProfileSize));
        }

        public void writeOnFile(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.mSchema);
                dataOutputStream.writeInt(this.mResultCode);
                dataOutputStream.writeLong(this.mPackageLastUpdateTime);
                dataOutputStream.writeLong(this.mInstalledCurrentProfileSize);
                dataOutputStream.close();
            } catch (Throwable th3) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    public static class CompilationStatus {
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE = 1;
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE_NON_MATCHING = 3;
        public static final int RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ = 131072;

        /* JADX INFO: renamed from: RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE */
        public static final int f6515xf2722a21 = 196608;
        private static final int RESULT_CODE_ERROR_CODE_BIT_SHIFT = 16;
        public static final int RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED = 327680;
        public static final int RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST = 65536;
        public static final int RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION = 262144;

        @Deprecated
        public static final int RESULT_CODE_NO_PROFILE = 0;
        public static final int RESULT_CODE_NO_PROFILE_INSTALLED = 0;
        public static final int RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION = 2;
        private final boolean mHasCurrentProfile;
        private final boolean mHasEmbeddedProfile;
        private final boolean mHasReferenceProfile;
        final int mResultCode;

        /* JADX INFO: loaded from: classes5.dex */
        @Retention(RetentionPolicy.SOURCE)
        public @interface ResultCode {
        }

        public CompilationStatus(int i13, boolean z4, boolean z13, boolean z14) {
            this.mResultCode = i13;
            this.mHasCurrentProfile = z13;
            this.mHasReferenceProfile = z4;
            this.mHasEmbeddedProfile = z14;
        }

        public boolean appApkHasEmbeddedProfile() {
            return this.mHasEmbeddedProfile;
        }

        public int getProfileInstallResultCode() {
            return this.mResultCode;
        }

        public boolean hasProfileEnqueuedForCompilation() {
            return this.mHasCurrentProfile;
        }

        public boolean isCompiledWithProfile() {
            return this.mHasReferenceProfile;
        }
    }

    private ProfileVerifier() {
    }

    public static InterfaceFutureC12319v getCompilationStatusAsync() {
        return sFuture;
    }

    private static long getPackageLastUpdateTime(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.getPackageInfo(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static CompilationStatus setCompilationStatus(int i13, boolean z4, boolean z13, boolean z14) {
        CompilationStatus compilationStatus = new CompilationStatus(i13, z4, z13, z14);
        sCompilationStatus = compilationStatus;
        sFuture.m31066j(compilationStatus);
        return sCompilationStatus;
    }

    public static CompilationStatus writeProfileVerification(Context context) {
        return writeProfileVerification(context, false);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0046 A[Catch: all -> 0x0012, TryCatch #1 {, blocks: (B:9:0x000c, B:11:0x0010, B:16:0x0019, B:22:0x002e, B:33:0x0040, B:35:0x0046, B:36:0x004c, B:38:0x004e, B:44:0x0071, B:50:0x0094, B:51:0x0098, B:53:0x00a9, B:62:0x00ba, B:64:0x00c0, B:79:0x00dc, B:82:0x00e2, B:85:0x00e9, B:87:0x00f2, B:92:0x00fe, B:93:0x0102, B:89:0x00f8, B:56:0x00b0, B:57:0x00b4, B:95:0x0104, B:96:0x010a, B:31:0x003e, B:30:0x003b), top: B:102:0x000c, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x004e A[Catch: all -> 0x0012, TryCatch #1 {, blocks: (B:9:0x000c, B:11:0x0010, B:16:0x0019, B:22:0x002e, B:33:0x0040, B:35:0x0046, B:36:0x004c, B:38:0x004e, B:44:0x0071, B:50:0x0094, B:51:0x0098, B:53:0x00a9, B:62:0x00ba, B:64:0x00c0, B:79:0x00dc, B:82:0x00e2, B:85:0x00e9, B:87:0x00f2, B:92:0x00fe, B:93:0x0102, B:89:0x00f8, B:56:0x00b0, B:57:0x00b4, B:95:0x0104, B:96:0x010a, B:31:0x003e, B:30:0x003b), top: B:102:0x000c, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    public static CompilationStatus writeProfileVerification(Context context, boolean z4) {
        int i13;
        boolean z13;
        File file;
        boolean z14;
        File file2;
        long length;
        boolean z15;
        File file3;
        Cache fromFile;
        Cache cache;
        int i14;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        CompilationStatus compilationStatus;
        if (!z4 && (compilationStatus = sCompilationStatus) != null) {
            return compilationStatus;
        }
        synchronized (SYNC_OBJ) {
            if (z4) {
                i13 = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                assetFileDescriptorOpenFd.close();
                if (Build.VERSION.SDK_INT == 30) {
                    return setCompilationStatus(CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION, false, false, z13);
                }
                file = new File(new File(REF_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);
                long length2 = file.length();
                if (file.exists()) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                file2 = new File(new File(CUR_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);
                length = file2.length();
                if (file2.exists()) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                long packageLastUpdateTime = getPackageLastUpdateTime(context);
                file3 = new File(context.getFilesDir(), PROFILE_INSTALLED_CACHE_FILE_NAME);
                if (file3.exists()) {
                    fromFile = Cache.readFromFile(file3);
                } else {
                    fromFile = null;
                }
                if (fromFile == null) {
                    if (!z13) {
                        i13 = CompilationStatus.RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED;
                    } else if (z14) {
                        i13 = 1;
                    } else if (z15) {
                        i13 = 2;
                    }
                } else if (!z13) {
                    i13 = CompilationStatus.RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED;
                } else if (z14) {
                    i13 = 1;
                } else if (z15) {
                    i13 = 2;
                }
                if (z4) {
                    i13 = 2;
                }
                if (fromFile != null) {
                    i13 = 3;
                }
                int i15 = i13;
                cache = new Cache(1, i15, packageLastUpdateTime, length);
                if (fromFile != null) {
                    cache.writeOnFile(file3);
                } else {
                    cache.writeOnFile(file3);
                }
                return setCompilationStatus(i15, z14, z15, z13);
            }
            CompilationStatus compilationStatus2 = sCompilationStatus;
            if (compilationStatus2 != null) {
                return compilationStatus2;
            }
            i13 = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th3) {
                    if (assetFileDescriptorOpenFd == null) {
                        throw th3;
                    }
                    try {
                        assetFileDescriptorOpenFd.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (IOException unused) {
                z13 = false;
            }
            if (Build.VERSION.SDK_INT == 30) {
                return setCompilationStatus(CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION, false, false, z13);
            }
            file = new File(new File(REF_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);
            long length3 = file.length();
            if (file.exists() || length3 <= 0) {
                z14 = false;
            } else {
                z14 = true;
            }
            file2 = new File(new File(CUR_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);
            length = file2.length();
            if (file2.exists() || length <= 0) {
                z15 = false;
            } else {
                z15 = true;
            }
            try {
                long packageLastUpdateTime2 = getPackageLastUpdateTime(context);
                file3 = new File(context.getFilesDir(), PROFILE_INSTALLED_CACHE_FILE_NAME);
                if (file3.exists()) {
                    try {
                        fromFile = Cache.readFromFile(file3);
                    } catch (IOException unused2) {
                        return setCompilationStatus(CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ, z14, z15, z13);
                    }
                } else {
                    fromFile = null;
                }
                if (fromFile == null && fromFile.mPackageLastUpdateTime == packageLastUpdateTime2 && (i14 = fromFile.mResultCode) != 2) {
                    i13 = i14;
                } else if (!z13) {
                    i13 = CompilationStatus.RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED;
                } else if (z14) {
                    i13 = 1;
                } else if (z15) {
                    i13 = 2;
                }
                if (z4 && z15 && i13 != 1) {
                    i13 = 2;
                }
                if (fromFile != null && fromFile.mResultCode == 2 && i13 == 1 && length3 < fromFile.mInstalledCurrentProfileSize) {
                    i13 = 3;
                }
                int i16 = i13;
                cache = new Cache(1, i16, packageLastUpdateTime2, length);
                if (fromFile != null || !fromFile.equals(cache)) {
                    try {
                        cache.writeOnFile(file3);
                    } catch (IOException unused3) {
                        i16 = CompilationStatus.f6515xf2722a21;
                    }
                }
                return setCompilationStatus(i16, z14, z15, z13);
            } catch (PackageManager.NameNotFoundException unused4) {
                return setCompilationStatus(CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST, z14, z15, z13);
            }
            throw th;
        }
    }
}
