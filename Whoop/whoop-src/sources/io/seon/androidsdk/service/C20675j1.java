package io.seon.androidsdk.service;

import android.content.Context;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p037bu.C3632c;

/* JADX INFO: renamed from: io.seon.androidsdk.service.j1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20675j1 extends AbstractC20664g {

    /* JADX INFO: renamed from: f */
    public static final String[] f77350f = {"region_country", "region_language", "region_timezone", "timezone_identifier"};

    /* JADX INFO: renamed from: e */
    public Context f77351e;

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: a */
    public final Map mo56774a() {
        String country;
        String language;
        C3632c c3632c = AbstractC20664g.f77301d;
        HashMap map = new HashMap();
        String id4 = null;
        try {
            country = this.f77351e.getResources().getConfiguration().locale.getCountry();
        } catch (Exception e5) {
            c3632c.m11163L(3, e5);
            country = null;
        } catch (Throwable unused) {
            country = null;
        }
        map.put("region_country", country);
        try {
            language = Locale.getDefault().getLanguage();
        } catch (Exception e13) {
            c3632c.m11163L(3, e13);
            language = null;
        } catch (Throwable unused2) {
            language = null;
        }
        map.put("region_language", language);
        map.put("region_timezone", AbstractC20664g.m56801d(new C20665g0(this, 5)));
        try {
            id4 = TimeZone.getDefault().getID();
        } catch (Throwable unused3) {
        }
        map.put("timezone_identifier", id4);
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: b */
    public final Map mo56775b() {
        return null;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: c */
    public final void mo56776c(C20663f1 c20663f1) {
        this.f77351e = c20663f1.f77299a;
        this.f77303b = c20663f1;
    }
}
