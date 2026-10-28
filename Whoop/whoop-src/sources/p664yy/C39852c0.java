package p664yy;

import android.system.Os;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import l83.C23465k;
import live.hms.video.factories.MediaConstraintsFactory;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25272z;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p442qy.C30764c;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: yy.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39852c0 extends AbstractC39856e0 {

    /* JADX INFO: renamed from: b */
    public final C39850b0 f172115b;

    /* JADX INFO: renamed from: c */
    public final C30764c f172116c;

    /* JADX INFO: renamed from: d */
    public final Locale f172117d;

    /* JADX INFO: renamed from: e */
    public final String f172118e;

    /* JADX INFO: renamed from: f */
    public final String f172119f;

    /* JADX INFO: renamed from: g */
    public final C39864i0 f172120g;

    /* JADX INFO: renamed from: h */
    public final Map f172121h;

    public C39852c0(C39857f options, C30764c c30764c, String apiVersion, String str) {
        Locale locale = Locale.getDefault();
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(apiVersion, "apiVersion");
        this.f172115b = new C39850b0(options, 0);
        this.f172116c = c30764c;
        this.f172117d = locale;
        this.f172118e = apiVersion;
        this.f172119f = str;
        this.f172120g = new C39864i0();
        EnumC39870l0 enumC39870l0 = EnumC39870l0.Form;
        this.f172121h = AbstractC31061c.m95645u("Content-Type", AbstractC11266d.m30461o("application/x-www-form-urlencoded; charset=", AbstractC39856e0.f172127a));
    }

    @Override // p664yy.AbstractC39856e0
    /* JADX INFO: renamed from: c */
    public final Map mo127928c() {
        C39857f c39857f = (C39857f) this.f172115b.f172105x;
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k("Accept", "application/json"), new C23465k("Stripe-Version", this.f172118e), new C23465k(TokenAuthInterceptor.AUTH_HEADER, AbstractC11266d.m30461o("Bearer ", c39857f.f172128w))), this.f172120g.m127937a(this.f172116c));
        boolean zM127935h = c39857f.m127935h();
        Map map = C25272z.f99163w;
        LinkedHashMap linkedHashMapM73995d1 = AbstractC25247g0.m73995d0(linkedHashMapM73995d0, zM127935h ? AbstractC31061c.m95645u("Stripe-Livemode", String.valueOf(!AbstractC22676k.m65745e(Os.getenv("Stripe-Livemode"), MediaConstraintsFactory.kValueFalse))) : map);
        String str = c39857f.f172129x;
        Map mapM95645u = str != null ? AbstractC31061c.m95645u("Stripe-Account", str) : null;
        if (mapM95645u == null) {
            mapM95645u = map;
        }
        LinkedHashMap linkedHashMapM73995d2 = AbstractC25247g0.m73995d0(linkedHashMapM73995d1, mapM95645u);
        String str2 = c39857f.f172130y;
        Map mapM95645u2 = str2 != null ? AbstractC31061c.m95645u("Idempotency-Key", str2) : null;
        if (mapM95645u2 == null) {
            mapM95645u2 = map;
        }
        LinkedHashMap linkedHashMapM73995d3 = AbstractC25247g0.m73995d0(linkedHashMapM73995d2, mapM95645u2);
        String languageTag = this.f172117d.toLanguageTag();
        AbstractC22676k.m65747g(languageTag);
        if (AbstractC39414r.m125890i0(languageTag) || languageTag.equals("und")) {
            languageTag = null;
        }
        Map mapM95645u3 = languageTag != null ? AbstractC31061c.m95645u("Accept-Language", languageTag) : null;
        if (mapM95645u3 != null) {
            map = mapM95645u3;
        }
        return AbstractC25247g0.m73995d0(linkedHashMapM73995d3, map);
    }

    @Override // p664yy.AbstractC39856e0
    /* JADX INFO: renamed from: d */
    public final String mo127929d() {
        String sdkVersion = this.f172119f;
        AbstractC22676k.m65750j(sdkVersion, "sdkVersion");
        String strConcat = "Stripe/v1 ".concat(sdkVersion);
        String strM74110N0 = null;
        C30764c c30764c = this.f172116c;
        if (c30764c != null) {
            String str = c30764c.f126691w;
            String str2 = c30764c.f126692x;
            String strConcat2 = str2 != null ? "/".concat(str2) : null;
            String str3 = c30764c.f126693y;
            strM74110N0 = AbstractC25265s.m74110N0(AbstractC25260n.m74077r0(new String[]{str, strConcat2, str3 != null ? AbstractC11895b.m31996o(" (", str3, ")") : null}), "", null, null, null, 62);
        }
        return AbstractC25265s.m74110N0(AbstractC25260n.m74077r0(new String[]{strConcat, strM74110N0}), " ", null, null, null, 62);
    }

    @Override // p664yy.AbstractC39856e0
    /* JADX INFO: renamed from: e */
    public final String mo127930e() {
        LinkedHashMap linkedHashMapM127931b = AbstractC39856e0.m127931b();
        C30764c c30764c = this.f172116c;
        if (c30764c != null) {
            linkedHashMapM127931b.putAll(c30764c.m94510b());
        }
        ArrayList arrayList = new ArrayList(linkedHashMapM127931b.size());
        for (Map.Entry entry : linkedHashMapM127931b.entrySet()) {
            arrayList.add(AbstractC2875y.m8300m("\"", (String) entry.getKey(), "\":\"", (String) entry.getValue(), "\""));
        }
        return AbstractC11895b.m31996o("{", AbstractC25265s.m74110N0(arrayList, ",", null, null, null, 62), "}");
    }
}
