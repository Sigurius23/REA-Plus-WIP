package io.seon.androidsdk.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.whoop.service.network.model.UserSessionDto;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p474s.C31983m2;

/* JADX INFO: loaded from: classes5.dex */
class SeonNT {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f77223a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public static boolean f77224b = false;

    /* JADX INFO: renamed from: c */
    public static SharedPreferences f77225c = null;

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    public SeonNT(Context context) {
        String string = "";
        try {
            byte b = 0;
            if (f77223a.compareAndSet(false, true)) {
                AtomicInteger atomicInteger = AbstractC20684o.f77414a;
                try {
                    f77225c = context.getSharedPreferences("seonLocalNtPreferences", 0);
                } catch (Throwable unused) {
                }
                try {
                    string = f77225c.getString("seon2US", "");
                } catch (Exception unused2) {
                }
                int iHashCode = string.hashCode();
                if (iHashCode != 48) {
                    if (iHashCode == 49 && string.equals(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE)) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (!string.equals(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE)) {
                    b = -1;
                }
                if (b == 0) {
                    C31983m2 c31983m2 = new C31983m2(12);
                    if (context == null) {
                        throw new IllegalArgumentException("Given context is null");
                    }
                    C31983m2.m99477o("Beginning load of %s...", "seon2");
                    c31983m2.m99490n(context, "seon2");
                    return;
                }
                if (b == 1) {
                    f77224b = true;
                    return;
                }
                SharedPreferences.Editor editorEdit = f77225c.edit();
                editorEdit.putString("seon2US", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
                editorEdit.commit();
                C31983m2 c31983m3 = new C31983m2(12);
                if (context == null) {
                    throw new IllegalArgumentException("Given context is null");
                }
                C31983m2.m99477o("Beginning load of %s...", "seon2");
                c31983m3.m99490n(context, "seon2");
                editorEdit.putString("seon2US", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE);
                editorEdit.apply();
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: a */
    public native int m56769a();

    /* JADX INFO: renamed from: b */
    public native String m56770b();

    /* JADX INFO: renamed from: d */
    public native int m56771d();
}
