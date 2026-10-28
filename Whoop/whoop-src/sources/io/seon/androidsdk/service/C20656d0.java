package io.seon.androidsdk.service;

import com.google.android.gms.common.C4987d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: io.seon.androidsdk.service.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20656d0 {

    /* JADX INFO: renamed from: a */
    public final String f77265a;

    /* JADX INFO: renamed from: b */
    public final String f77266b;

    /* JADX INFO: renamed from: c */
    public final String f77267c;

    /* JADX INFO: renamed from: d */
    public final Boolean f77268d;

    /* JADX INFO: renamed from: e */
    public final List f77269e = Arrays.asList(null, C4987d.GOOGLE_PLAY_STORE_PACKAGE, "com.facebook.system");

    public C20656d0(String str, String str2, Boolean bool, String str3) {
        this.f77265a = str;
        this.f77266b = str2;
        this.f77267c = str3;
        this.f77268d = bool;
    }

    /* JADX INFO: renamed from: a */
    public final HashMap m56786a() {
        List list = this.f77269e;
        String str = this.f77265a;
        String str2 = this.f77267c;
        String str3 = this.f77266b;
        try {
            HashMap map = new HashMap();
            map.put("inst", str);
            map.put("init", str3);
            map.put("orig", str2);
            if (!list.contains(str2)) {
                str = str2;
            } else if (!list.contains(str3)) {
                str = str3;
            }
            map.put("sign", str);
            return map;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String toString() {
        String str = this.f77266b;
        String str2 = this.f77267c;
        List list = this.f77269e;
        try {
            if (list.contains(str2)) {
                return !list.contains(str) ? str : this.f77265a;
            }
            return str2;
        } catch (Throwable unused) {
            return "";
        }
    }
}
