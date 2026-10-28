package io.sentry.android.core.anr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC11266d;
import p087db.C11858k0;

/* JADX INFO: renamed from: io.sentry.android.core.anr.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20055c {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f75350a;

    static {
        ArrayList arrayList = new ArrayList(11);
        f75350a = arrayList;
        AbstractC11266d.m30445C(arrayList, "java.lang", "java.util", "android.app", "android.os.Handler");
        AbstractC11266d.m30445C(arrayList, "android.os.Looper", "android.view", "android.widget", "com.android.internal");
        arrayList.add("com.google.android");
        arrayList.add("kotlin");
        arrayList.add("kotlinx.coroutines");
    }

    /* JADX INFO: renamed from: a */
    public static C20053a m55919a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20058f c20058f = (C20058f) it.next();
            StackTraceElement[] stackTraceElementArr = c20058f.f75354w;
            if (stackTraceElementArr.length >= 2) {
                int i13 = 0;
                for (int length = stackTraceElementArr.length - 1; length >= 0; length--) {
                    if (!m55920b(stackTraceElementArr[length].getClassName())) {
                        i13++;
                    }
                    float length2 = i13 / (stackTraceElementArr.length - length);
                    C20054b c20054b = new C20054b(stackTraceElementArr, length, stackTraceElementArr.length - 1);
                    C20053a c20053a = (C20053a) map.get(c20054b);
                    if (c20053a == null) {
                        StackTraceElement[] stackTraceElementArr2 = c20058f.f75354w;
                        map.put(c20054b, new C20053a(stackTraceElementArr2, length, stackTraceElementArr2.length - 1, c20058f.f75355x, length2));
                    } else {
                        long j7 = c20058f.f75355x;
                        c20053a.f75344g = Math.min(c20053a.f75344g, j7);
                        c20053a.f75345h = Math.max(c20053a.f75345h, j7);
                        c20053a.f75343f++;
                    }
                }
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return (C20053a) Collections.max(map.values(), new C11858k0(15));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m55920b(String str) {
        Iterator it = f75350a.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
