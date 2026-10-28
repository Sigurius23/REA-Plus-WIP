package io.sentry.cache;

import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: io.sentry.cache.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20278a {

    /* JADX INFO: renamed from: a */
    public static final Charset f76152a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static void m56251a(C20513q6 c20513q6, String str, String str2) {
        File fileM56252b = m56252b(c20513q6, str);
        if (fileM56252b == null) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileM56252b, str2);
        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: b */
    public static File m56252b(C20513q6 c20513q6, String str) {
        String cacheDirPath = c20513q6.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    /* JADX INFO: renamed from: c */
    public static Object m56253c(C20513q6 c20513q6, String str, String str2, Class cls) {
        File fileM56252b = m56252b(c20513q6, str);
        if (fileM56252b == null) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileM56252b, str2);
        if (!file.exists()) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "No entry stored for %s", str2);
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f76152a));
            try {
                Object objMo56239e = c20513q6.getSerializer().mo56239e(bufferedReader, cls);
                bufferedReader.close();
                return objMo56239e;
            } catch (Throwable th3) {
                try {
                    bufferedReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th5, "Error reading entity from scope cache: %s", str2);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m56254d(C20513q6 c20513q6, Object obj, String str, String str2) {
        File fileM56252b = m56252b(c20513q6, str);
        if (fileM56252b == null) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileM56252b, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f76152a));
                try {
                    c20513q6.getSerializer().mo56235a(bufferedWriter, obj);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (Throwable th7) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th7, "Error persisting entity: %s", str2);
        }
    }
}
