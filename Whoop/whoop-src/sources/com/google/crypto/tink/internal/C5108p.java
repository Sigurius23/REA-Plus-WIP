package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import java.security.GeneralSecurityException;
import p560vs.C36379k3;
import p560vs.C36391m3;
import p560vs.C36403o3;
import p560vs.C36409p3;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.p */
/* JADX INFO: loaded from: classes.dex */
public class C5108p {

    /* JADX INFO: renamed from: a */
    public final String f21450a;

    /* JADX INFO: renamed from: b */
    public final Class f21451b;

    /* JADX INFO: renamed from: c */
    public final EnumC36385l3 f21452c;

    public C5108p(String str, Class cls, EnumC36385l3 enumC36385l3) {
        this.f21450a = str;
        this.f21451b = cls;
        this.f21452c = enumC36385l3;
    }

    /* JADX INFO: renamed from: a */
    public static C5106o m16073a(Class cls, String str) {
        return new C5106o(str, cls, EnumC36385l3.ASYMMETRIC_PRIVATE);
    }

    /* JADX INFO: renamed from: b */
    public final C36391m3 m16074b(AbstractC5146i abstractC5146i) throws GeneralSecurityException {
        C36403o3 c36403o3M116529G = C36409p3.m116529G();
        c36403o3M116529G.m116484h(this.f21450a);
        c36403o3M116529G.m116485i(abstractC5146i);
        c36403o3M116529G.m116483g(EnumC36362h4.RAW);
        C5101l0 c5101l0M16022F = C5101l0.m16022F((C36409p3) c36403o3M116529G.m16347b());
        C5121z c5121z = C5121z.f21474b;
        C5099k0 c5099k0 = (C5099k0) c5121z.m16097g(C5115t.f21463b.m16082b(c5121z.m16092b(c5101l0M16022F)));
        C36379k3 c36379k3M116432G = C36391m3.m116432G();
        c36379k3M116432G.m116388h((String) c5099k0.f21439x);
        c36379k3M116432G.m116389i((AbstractC5146i) c5099k0.f21441z);
        c36379k3M116432G.m116387g((EnumC36385l3) c5099k0.f21436E);
        return (C36391m3) c36379k3M116432G.m16347b();
    }
}
