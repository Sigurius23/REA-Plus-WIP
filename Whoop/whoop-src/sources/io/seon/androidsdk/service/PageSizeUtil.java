package io.seon.androidsdk.service;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
class PageSizeUtil {

    /* JADX INFO: renamed from: a */
    public static boolean f77221a = false;

    /* JADX INFO: renamed from: b */
    public static Context f77222b;

    public PageSizeUtil(Context context) {
        f77222b = context;
    }

    private native int getPageSizeInBytesNative();

    /* JADX INFO: renamed from: a */
    public final Integer m56768a() {
        try {
            if (!f77221a) {
                RunnableC20646a runnableC20646a = new RunnableC20646a();
                AtomicInteger atomicInteger = AbstractC20684o.f77414a;
                try {
                    runnableC20646a.run();
                } catch (Throwable unused) {
                }
            }
            int pageSizeInBytesNative = getPageSizeInBytesNative();
            if (pageSizeInBytesNative == -1) {
                return null;
            }
            return Integer.valueOf(pageSizeInBytesNative);
        } catch (Throwable unused2) {
            return null;
        }
    }
}
