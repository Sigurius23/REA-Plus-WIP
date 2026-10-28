package v63;

import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import j93.InterfaceC21461d;
import java.io.EOFException;
import java.nio.ByteBuffer;
import p636y3.AbstractC39177i;
import p636y3.C39183o;
import p636y3.C39184p;
import p669z2.C40005h;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import w63.C36866a;
import xb3.C38175j;

/* JADX INFO: renamed from: v63.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC35745c {
    /* JADX INFO: renamed from: a */
    public static final void m113242a(long j7) {
        C39184p[] c39184pArr = C39183o.f168427b;
        if ((j7 & 1095216660480L) == 0) {
            AbstractC39177i.m124789a("Cannot perform operation for Unspecified type.");
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m113243b(long j7, long j13) {
        C39184p[] c39184pArr = C39183o.f168427b;
        if ((j7 & 1095216660480L) == 0 || (1095216660480L & j13) == 0) {
            AbstractC39177i.m124789a("Cannot perform operation for Unspecified type.");
        }
        if (C39184p.m124808a(C39183o.m124804b(j7), C39183o.m124804b(j13))) {
            return;
        }
        AbstractC39177i.m124789a("Cannot perform operation for " + ((Object) C39184p.m124809b(C39183o.m124804b(j7))) + " and " + ((Object) C39184p.m124809b(C39183o.m124804b(j13))));
    }

    /* JADX INFO: renamed from: f */
    public static final long m113244f(double d3) {
        return m113248j((float) d3, 8589934592L);
    }

    /* JADX INFO: renamed from: g */
    public static final long m113245g(double d3) {
        return m113248j((float) d3, 4294967296L);
    }

    /* JADX INFO: renamed from: h */
    public static final long m113246h(int i13) {
        return m113248j(i13, 4294967296L);
    }

    /* JADX INFO: renamed from: i */
    public static C38175j m113247i(InterfaceC4351m interfaceC4351m) {
        C38175j c38175j = new C38175j();
        c38175j.f163482z = AbstractC15751g.m44463p(interfaceC4351m, c38175j, c38175j);
        return c38175j;
    }

    /* JADX INFO: renamed from: j */
    public static final long m113248j(float f13, long j7) {
        long jFloatToRawIntBits = j7 | (((long) Float.floatToRawIntBits(f13)) & 4294967295L);
        C39184p[] c39184pArr = C39183o.f168427b;
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: l */
    public static final void m113249l(C36866a c36866a, byte[] bArr, int i13, int i14) throws EOFException {
        ByteBuffer copyTo = (ByteBuffer) c36866a.f77291g;
        int i15 = c36866a.f77286b;
        if (c36866a.f77287c - i15 < i14) {
            throw new EOFException(AbstractC31061c.m95639o("Not enough bytes to read a byte array of size ", i14, '.'));
        }
        AbstractC22676k.m65750j(copyTo, "$this$copyTo");
        if (!copyTo.hasArray() || copyTo.isReadOnly()) {
            copyTo.duplicate().get(bArr, i13, i14);
        } else {
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i15, bArr, i13, i14);
        }
        c36866a.m56793d(i14);
    }

    /* JADX INFO: renamed from: m */
    public static String m113250m(int i13) {
        if (i13 == 1) {
            return "Clip";
        }
        if (i13 == 2) {
            return "Ellipsis";
        }
        if (i13 == 5) {
            return "MiddleEllipsis";
        }
        if (i13 == 3) {
            return "Visible";
        }
        return i13 == 4 ? "StartEllipsis" : "Invalid";
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo113251c(C40005h c40005h);

    /* JADX INFO: renamed from: d */
    public abstract Object mo113252d(InterfaceC21461d interfaceC21461d);

    /* JADX INFO: renamed from: e */
    public abstract Object mo113253e(C40005h c40005h);

    /* JADX INFO: renamed from: k */
    public abstract AbstractC35745c mo113254k(InterfaceC21461d interfaceC21461d, Object obj);
}
