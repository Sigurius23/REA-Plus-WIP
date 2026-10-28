package io.seon.androidsdk.service;

import a00.C0072g;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import m63.C25126d;
import p013ah.AbstractC0869d;
import p013ah.C0873h;
import p013ah.C0874i;
import p013ah.C0879n;
import p076d.AbstractC11290h1;
import p076d.AbstractC11322x0;
import p076d.C11294j0;
import p076d.C11297l;
import p076d.C11317v;
import p127ev.C13668i;
import p582wg.AbstractC37250c;

/* JADX INFO: renamed from: io.seon.androidsdk.service.d1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20657d1 {

    /* JADX INFO: renamed from: a */
    public final AttestationGenerator$RootCertIssuer f77270a;

    /* JADX INFO: renamed from: b */
    public final Integer f77271b;

    /* JADX INFO: renamed from: c */
    public final Integer f77272c;

    /* JADX INFO: renamed from: d */
    public final Integer f77273d;

    /* JADX INFO: renamed from: e */
    public final Integer f77274e;

    /* JADX INFO: renamed from: f */
    public final String f77275f;

    /* JADX INFO: renamed from: g */
    public final C25126d f77276g;

    /* JADX INFO: renamed from: h */
    public final C25126d f77277h;

    /* JADX INFO: renamed from: i */
    public ArrayList f77278i;

    /* JADX INFO: renamed from: j */
    public String f77279j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f77280k;

    /* JADX INFO: renamed from: l */
    public final Boolean f77281l;

    /* JADX INFO: renamed from: m */
    public final C0072g f77282m;

    public C20657d1(AbstractC11290h1 abstractC11290h1, AttestationGenerator$RootCertIssuer attestationGenerator$RootCertIssuer, C11297l c11297l) {
        this.f77279j = null;
        this.f77280k = new ArrayList();
        this.f77282m = new C0072g(16);
        this.f77270a = attestationGenerator$RootCertIssuer;
        for (int i13 = 0; i13 < abstractC11290h1.mo30507o(); i13++) {
            if (i13 == 0) {
                this.f77271b = Integer.valueOf(((C11294j0) abstractC11290h1.mo30505l(0)).m30510m().intValue());
            } else if (i13 == 1) {
                C11317v c11317v = (C11317v) abstractC11290h1.mo30505l(1);
                c11317v.getClass();
                this.f77272c = Integer.valueOf(new BigInteger(c11317v.f36265a).intValue());
            } else if (i13 == 2) {
                this.f77273d = Integer.valueOf(((C11294j0) abstractC11290h1.mo30505l(2)).m30510m().intValue());
            } else if (i13 == 3) {
                C11317v c11317v2 = (C11317v) abstractC11290h1.mo30505l(3);
                c11317v2.getClass();
                this.f77274e = Integer.valueOf(new BigInteger(c11317v2.f36265a).intValue());
            } else if (i13 == 4) {
                this.f77275f = AbstractC37250c.m119390b(AbstractC11322x0.m30532l(abstractC11290h1.mo30505l(4)).f36277a);
            } else if (i13 == 6) {
                this.f77276g = new C25126d((AbstractC11290h1) abstractC11290h1.mo30505l(6));
            } else if (i13 == 7) {
                try {
                    this.f77277h = this.f77272c.intValue() == 0 ? null : new C25126d((AbstractC11290h1) abstractC11290h1.mo30505l(7));
                } catch (Exception unused) {
                }
            }
        }
        if (c11297l != null) {
            try {
                C13668i c13668i = new C13668i(new ByteArrayInputStream(c11297l.f36277a));
                LinkedList linkedList = new LinkedList();
                while (true) {
                    AbstractC0869d abstractC0869dM38532c = c13668i.m38532c();
                    if (abstractC0869dM38532c == null) {
                        break;
                    } else {
                        linkedList.add(abstractC0869dM38532c);
                    }
                }
                C0873h c0873h = (C0873h) linkedList.get(0);
                for (AbstractC0869d abstractC0869d : c0873h.f3166e) {
                    try {
                        int iIntValue = ((C0874i) abstractC0869d).f3167c.intValue();
                        if (iIntValue == 1) {
                            this.f77282m.f223x = Integer.valueOf(((C0874i) ((AbstractC0869d) c0873h.f3165d.get(abstractC0869d))).f3167c.intValue());
                        } else if (iIntValue == 3) {
                            this.f77282m.f224y = ((C0879n) ((AbstractC0869d) c0873h.f3165d.get(abstractC0869d))).f3185d;
                        } else if (iIntValue != 4) {
                            ((HashMap) this.f77282m.f221E).put(String.valueOf(iIntValue), String.valueOf((AbstractC0869d) c0873h.f3165d.get(abstractC0869d)));
                        } else {
                            this.f77282m.f225z = ((C0879n) ((AbstractC0869d) c0873h.f3165d.get(abstractC0869d))).f3185d;
                        }
                    } catch (Exception e5) {
                        AbstractC20684o.m56853f("prov-l", e5);
                    }
                }
            } catch (Throwable th3) {
                AbstractC20684o.m56853f("prov", th3);
            }
        }
        this.f77281l = Boolean.FALSE;
    }

    public C20657d1(String str) {
        this.f77279j = null;
        ArrayList arrayList = new ArrayList();
        this.f77280k = arrayList;
        this.f77282m = new C0072g(16);
        arrayList.add(str);
        this.f77281l = Boolean.TRUE;
    }
}
