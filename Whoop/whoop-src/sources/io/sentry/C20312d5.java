package io.sentry;

import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.d5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20312d5 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public final EnumC20424m5 f76265E;

    /* JADX INFO: renamed from: F */
    public final int f76266F;

    /* JADX INFO: renamed from: G */
    public final Callable f76267G;

    /* JADX INFO: renamed from: H */
    public final String f76268H;

    /* JADX INFO: renamed from: I */
    public HashMap f76269I;

    /* JADX INFO: renamed from: w */
    public final String f76270w;

    /* JADX INFO: renamed from: x */
    public final Integer f76271x;

    /* JADX INFO: renamed from: y */
    public final String f76272y;

    /* JADX INFO: renamed from: z */
    public final String f76273z;

    public C20312d5(EnumC20424m5 enumC20424m5, int i13, String str, String str2, String str3, String str4, Integer num) {
        this.f76265E = enumC20424m5;
        this.f76270w = str;
        this.f76266F = i13;
        this.f76272y = str2;
        this.f76267G = null;
        this.f76268H = str3;
        this.f76273z = str4;
        this.f76271x = num;
    }

    /* JADX INFO: renamed from: a */
    public final int m56447a() {
        Callable callable = this.f76267G;
        if (callable == null) {
            return this.f76266F;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        String str = this.f76270w;
        if (str != null) {
            c37199o.m119207K("content_type");
            c37199o.m119222b0(str);
        }
        String str2 = this.f76272y;
        if (str2 != null) {
            c37199o.m119207K("filename");
            c37199o.m119222b0(str2);
        }
        c37199o.m119207K("type");
        c37199o.m119219Y(interfaceC20602v0, this.f76265E);
        String str3 = this.f76268H;
        if (str3 != null) {
            c37199o.m119207K("attachment_type");
            c37199o.m119222b0(str3);
        }
        String str4 = this.f76273z;
        if (str4 != null) {
            c37199o.m119207K("platform");
            c37199o.m119222b0(str4);
        }
        Integer num = this.f76271x;
        if (num != null) {
            c37199o.m119207K("item_count");
            c37199o.m119221a0(num);
        }
        c37199o.m119207K("length");
        c37199o.m119218X(m56447a());
        HashMap map = this.f76269I;
        if (map != null) {
            for (String str5 : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76269I, str5, c37199o, str5, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }

    public C20312d5(EnumC20424m5 enumC20424m5, Callable callable, String str, String str2, String str3) {
        this(enumC20424m5, callable, str, str2, str3, (String) null, (Integer) null);
    }

    public C20312d5(EnumC20424m5 enumC20424m5, Callable callable, String str, String str2, String str3, String str4, Integer num) {
        AbstractC29125c.m88510S(enumC20424m5, "type is required");
        this.f76265E = enumC20424m5;
        this.f76270w = str;
        this.f76266F = -1;
        this.f76272y = str2;
        this.f76267G = callable;
        this.f76268H = str3;
        this.f76273z = str4;
        this.f76271x = num;
    }
}
