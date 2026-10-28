package io.sentry;

import ih0.AbstractC18489d0;
import io.sentry.protocol.C20501v;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.k7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20405k7 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public final String f76470E;

    /* JADX INFO: renamed from: F */
    public final String f76471F;

    /* JADX INFO: renamed from: G */
    public final String f76472G;

    /* JADX INFO: renamed from: H */
    public final String f76473H;

    /* JADX INFO: renamed from: I */
    public final String f76474I;

    /* JADX INFO: renamed from: J */
    public final C20501v f76475J;

    /* JADX INFO: renamed from: K */
    public ConcurrentHashMap f76476K;

    /* JADX INFO: renamed from: w */
    public final C20501v f76477w;

    /* JADX INFO: renamed from: x */
    public final String f76478x;

    /* JADX INFO: renamed from: y */
    public final String f76479y;

    /* JADX INFO: renamed from: z */
    public final String f76480z;

    public C20405k7(C20501v c20501v, String str, String str2, String str3, String str4, String str5, String str6, String str7, C20501v c20501v2, String str8) {
        this.f76477w = c20501v;
        this.f76478x = str;
        this.f76479y = str2;
        this.f76480z = str3;
        this.f76470E = str4;
        this.f76471F = str5;
        this.f76472G = str6;
        this.f76474I = str7;
        this.f76475J = c20501v2;
        this.f76473H = str8;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("trace_id");
        c37199o.m119219Y(interfaceC20602v0, this.f76477w);
        c37199o.m119207K("public_key");
        c37199o.m119222b0(this.f76478x);
        String str = this.f76479y;
        if (str != null) {
            c37199o.m119207K("release");
            c37199o.m119222b0(str);
        }
        String str2 = this.f76480z;
        if (str2 != null) {
            c37199o.m119207K("environment");
            c37199o.m119222b0(str2);
        }
        String str3 = this.f76470E;
        if (str3 != null) {
            c37199o.m119207K("user_id");
            c37199o.m119222b0(str3);
        }
        String str4 = this.f76471F;
        if (str4 != null) {
            c37199o.m119207K("transaction");
            c37199o.m119222b0(str4);
        }
        String str5 = this.f76472G;
        if (str5 != null) {
            c37199o.m119207K("sample_rate");
            c37199o.m119222b0(str5);
        }
        String str6 = this.f76473H;
        if (str6 != null) {
            c37199o.m119207K("sample_rand");
            c37199o.m119222b0(str6);
        }
        String str7 = this.f76474I;
        if (str7 != null) {
            c37199o.m119207K("sampled");
            c37199o.m119222b0(str7);
        }
        C20501v c20501v = this.f76475J;
        if (c20501v != null) {
            c37199o.m119207K("replay_id");
            c37199o.m119219Y(interfaceC20602v0, c20501v);
        }
        ConcurrentHashMap concurrentHashMap = this.f76476K;
        if (concurrentHashMap != null) {
            for (String str8 : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76476K, str8, c37199o, str8, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
