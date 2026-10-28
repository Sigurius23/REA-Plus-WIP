package io.sentry;

import com.whoop.service.network.model.UserSessionDto;
import ih0.AbstractC18489d0;
import io.sentry.vendor.gson.stream.C20613c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: io.sentry.s3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20539s3 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public String f76955E;

    /* JADX INFO: renamed from: F */
    public String f76956F;

    /* JADX INFO: renamed from: G */
    public String f76957G;

    /* JADX INFO: renamed from: H */
    public String f76958H;

    /* JADX INFO: renamed from: I */
    public String f76959I;

    /* JADX INFO: renamed from: J */
    public boolean f76960J;

    /* JADX INFO: renamed from: K */
    public String f76961K;

    /* JADX INFO: renamed from: M */
    public String f76963M;

    /* JADX INFO: renamed from: N */
    public String f76964N;

    /* JADX INFO: renamed from: O */
    public String f76965O;

    /* JADX INFO: renamed from: P */
    public final ArrayList f76966P;

    /* JADX INFO: renamed from: Q */
    public String f76967Q;

    /* JADX INFO: renamed from: R */
    public String f76968R;

    /* JADX INFO: renamed from: S */
    public String f76969S;

    /* JADX INFO: renamed from: T */
    public String f76970T;

    /* JADX INFO: renamed from: U */
    public String f76971U;

    /* JADX INFO: renamed from: V */
    public String f76972V;

    /* JADX INFO: renamed from: W */
    public String f76973W;

    /* JADX INFO: renamed from: X */
    public String f76974X;

    /* JADX INFO: renamed from: Y */
    public String f76975Y;

    /* JADX INFO: renamed from: Z */
    public Date f76976Z;

    /* JADX INFO: renamed from: a0 */
    public final Map f76977a0;

    /* JADX INFO: renamed from: c0 */
    public ConcurrentHashMap f76979c0;

    /* JADX INFO: renamed from: w */
    public final File f76980w;

    /* JADX INFO: renamed from: x */
    public final Callable f76981x;

    /* JADX INFO: renamed from: y */
    public int f76982y;

    /* JADX INFO: renamed from: L */
    public List f76962L = new ArrayList();

    /* JADX INFO: renamed from: b0 */
    public String f76978b0 = null;

    /* JADX INFO: renamed from: z */
    public String f76983z = Locale.getDefault().toString();

    public C20539s3(File file, Date date, ArrayList arrayList, String str, String str2, String str3, String str4, int i13, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map map) {
        this.f76980w = file;
        this.f76976Z = date;
        this.f76961K = str5;
        this.f76981x = callable;
        this.f76982y = i13;
        this.f76955E = str6 == null ? "" : str6;
        this.f76956F = str7 == null ? "" : str7;
        this.f76959I = str8 != null ? str8 : "";
        this.f76960J = bool != null ? bool.booleanValue() : false;
        this.f76963M = str9 != null ? str9 : UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE;
        this.f76957G = "";
        this.f76958H = "android";
        this.f76964N = "android";
        this.f76965O = str10 != null ? str10 : "";
        this.f76966P = arrayList;
        this.f76967Q = str.isEmpty() ? "unknown" : str;
        this.f76968R = str4;
        this.f76969S = "";
        this.f76970T = str11 != null ? str11 : "";
        this.f76971U = str2;
        this.f76972V = str3;
        this.f76973W = AbstractC30060g.m92131v();
        this.f76974X = str12 != null ? str12 : "production";
        this.f76975Y = str13;
        if (!str13.equals("normal") && !this.f76975Y.equals("timeout") && !this.f76975Y.equals("backgrounded")) {
            this.f76975Y = "normal";
        }
        this.f76977a0 = map;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("android_api_level");
        c37199o.m119219Y(interfaceC20602v0, Integer.valueOf(this.f76982y));
        c37199o.m119207K("device_locale");
        c37199o.m119219Y(interfaceC20602v0, this.f76983z);
        c37199o.m119207K("device_manufacturer");
        c37199o.m119222b0(this.f76955E);
        c37199o.m119207K("device_model");
        c37199o.m119222b0(this.f76956F);
        c37199o.m119207K("device_os_build_number");
        c37199o.m119222b0(this.f76957G);
        c37199o.m119207K("device_os_name");
        c37199o.m119222b0(this.f76958H);
        c37199o.m119207K("device_os_version");
        c37199o.m119222b0(this.f76959I);
        c37199o.m119207K("device_is_emulator");
        c37199o.m119223c0(this.f76960J);
        c37199o.m119207K("architecture");
        c37199o.m119219Y(interfaceC20602v0, this.f76961K);
        c37199o.m119207K("device_cpu_frequencies");
        c37199o.m119219Y(interfaceC20602v0, this.f76962L);
        c37199o.m119207K("device_physical_memory_bytes");
        c37199o.m119222b0(this.f76963M);
        c37199o.m119207K("platform");
        c37199o.m119222b0(this.f76964N);
        c37199o.m119207K("build_id");
        c37199o.m119222b0(this.f76965O);
        c37199o.m119207K("transaction_name");
        c37199o.m119222b0(this.f76967Q);
        c37199o.m119207K("duration_ns");
        c37199o.m119222b0(this.f76968R);
        c37199o.m119207K("version_name");
        c37199o.m119222b0(this.f76970T);
        c37199o.m119207K("version_code");
        c37199o.m119222b0(this.f76969S);
        ArrayList arrayList = this.f76966P;
        if (!arrayList.isEmpty()) {
            c37199o.m119207K("transactions");
            c37199o.m119219Y(interfaceC20602v0, arrayList);
        }
        c37199o.m119207K("transaction_id");
        c37199o.m119222b0(this.f76971U);
        c37199o.m119207K("trace_id");
        c37199o.m119222b0(this.f76972V);
        c37199o.m119207K("profile_id");
        c37199o.m119222b0(this.f76973W);
        c37199o.m119207K("environment");
        c37199o.m119222b0(this.f76974X);
        c37199o.m119207K("truncation_reason");
        c37199o.m119222b0(this.f76975Y);
        if (this.f76978b0 != null) {
            c37199o.m119207K("sampled_profile");
            c37199o.m119222b0(this.f76978b0);
        }
        String str = ((C20613c) c37199o.f159040w).f77151z;
        c37199o.m119213S("");
        c37199o.m119207K("measurements");
        c37199o.m119219Y(interfaceC20602v0, this.f76977a0);
        c37199o.m119213S(str);
        c37199o.m119207K("timestamp");
        c37199o.m119219Y(interfaceC20602v0, this.f76976Z);
        ConcurrentHashMap concurrentHashMap = this.f76979c0;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76979c0, str2, c37199o, str2, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
