package io.sentry;

import aa3.C0627i1;
import io.sentry.protocol.C20501v;
import io.sentry.protocol.EnumC20479g0;
import live.hms.video.utils.HMSConstantsKt;
import p005a3.C0237p;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: io.sentry.m7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20426m7 extends C20323e7 {

    /* JADX INFO: renamed from: S */
    public static final EnumC20479g0 f76504S = EnumC20479g0.CUSTOM;

    /* JADX INFO: renamed from: P */
    public String f76505P;

    /* JADX INFO: renamed from: Q */
    public EnumC20479g0 f76506Q;

    /* JADX INFO: renamed from: R */
    public C0627i1 f76507R;

    public C20426m7(String str, EnumC20479g0 enumC20479g0, String str2, C0627i1 c0627i1) {
        super(new C20501v(), new C20353h7(), str2, null);
        AbstractC29125c.m88510S(str, "name is required");
        this.f76505P = str;
        this.f76506Q = enumC20479g0;
        m56484a(c0627i1);
        this.f76318M = AbstractC37056f.m119001y(null, c0627i1 == null ? null : (Boolean) c0627i1.f2195b, c0627i1 == null ? null : (Double) c0627i1.f2196c, c0627i1 == null ? null : (Double) c0627i1.f2197d);
    }

    /* JADX INFO: renamed from: b */
    public static C20426m7 m56631b(C0237p c0237p) {
        c0237p.getClass();
        C20269c c20269c = (C20269c) c0237p.f814z;
        Double d3 = c20269c.f76115c;
        C20426m7 c20426m7 = new C20426m7((C20501v) c0237p.f812x, (C20353h7) c0237p.f813y, HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, (C20353h7) null);
        c20426m7.f76505P = "<unlabeled transaction>";
        c20426m7.f76507R = null;
        c20426m7.f76506Q = f76504S;
        c20426m7.f76318M = AbstractC37056f.m119001y(c20269c, null, null, null);
        return c20426m7;
    }
}
