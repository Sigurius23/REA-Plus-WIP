package p123en;

import ai.C0902h;
import ed3.C13117a;
import in.C18715c;
import io.sentry.internal.debugmeta.C20378c;
import java.util.Arrays;
import p465rm.C31521c0;
import p479s4.AbstractC32128i;
import p479s4.AbstractC32131l;
import p499t9.C33653v;
import so.C32800q;

/* JADX INFO: renamed from: en.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C13356c extends AbstractC13361h {

    /* JADX INFO: renamed from: o */
    public C33653v f46682o;

    /* JADX INFO: renamed from: p */
    public C0902h f46683p;

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: b */
    public final long mo37613b(C13117a c13117a) {
        byte[] bArr = c13117a.f45381a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i13 = (bArr[2] & 255) >> 4;
        if (i13 == 6 || i13 == 7) {
            c13117a.m36690L(4);
            c13117a.m36683E();
        }
        int iM100063r = AbstractC32128i.m100063r(i13, c13117a);
        c13117a.m36689K(0);
        return iM100063r;
    }

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: d */
    public final boolean mo37614d(C13117a c13117a, long j7, C20378c c20378c) {
        byte[] bArr = c13117a.f45381a;
        C33653v c33653v = this.f46682o;
        if (c33653v == null) {
            C33653v c33653v2 = new C33653v(bArr, 17, 1);
            this.f46682o = c33653v2;
            c20378c.f76422x = c33653v2.m106293d(Arrays.copyOfRange(bArr, 9, c13117a.f45383c), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            C0902h c0902h = this.f46683p;
            if (c0902h != null) {
                c0902h.f3295x = j7;
                c20378c.f76423y = c0902h;
            }
            ((C31521c0) c20378c.f76422x).getClass();
            return false;
        }
        C32800q c32800qM100078s = AbstractC32131l.m100078s(c13117a);
        C33653v c33653v3 = new C33653v(c33653v.f140444b, c33653v.f140445c, c33653v.f140446d, c33653v.f140447e, c33653v.f140448f, c33653v.f140450h, c33653v.f140451i, c33653v.f140453k, c32800qM100078s, (C18715c) c33653v.f140455m);
        this.f46682o = c33653v3;
        C0902h c0902h2 = new C0902h(3);
        c0902h2.f3297z = c33653v3;
        c0902h2.f3293E = c32800qM100078s;
        c0902h2.f3295x = -1L;
        c0902h2.f3296y = -1L;
        this.f46683p = c0902h2;
        return true;
    }

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: f */
    public final void mo37615f(boolean z4) {
        super.mo37615f(z4);
        if (z4) {
            this.f46682o = null;
            this.f46683p = null;
        }
    }
}
