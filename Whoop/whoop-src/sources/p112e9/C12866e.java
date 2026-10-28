package p112e9;

import java.util.List;
import p141f9.AbstractC14271m;
import p141f9.C14259a;
import p141f9.C14261c;
import p141f9.C14266h;
import p516u8.AbstractC34609o0;
import p516u8.C34582b;
import p516u8.C34605m0;
import p516u8.C34607n0;
import p516u8.C34618t;
import p516u8.C34626x;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: e9.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C12866e extends AbstractC34609o0 {

    /* JADX INFO: renamed from: b */
    public final long f44238b;

    /* JADX INFO: renamed from: c */
    public final long f44239c;

    /* JADX INFO: renamed from: d */
    public final long f44240d;

    /* JADX INFO: renamed from: e */
    public final int f44241e;

    /* JADX INFO: renamed from: f */
    public final long f44242f;

    /* JADX INFO: renamed from: g */
    public final long f44243g;

    /* JADX INFO: renamed from: h */
    public final long f44244h;

    /* JADX INFO: renamed from: i */
    public final C14261c f44245i;

    /* JADX INFO: renamed from: j */
    public final C34626x f44246j;

    /* JADX INFO: renamed from: k */
    public final C34618t f44247k;

    public C12866e(long j7, long j13, long j14, int i13, long j15, long j16, long j17, C14261c c14261c, C34626x c34626x, C34618t c34618t) {
        AbstractC35849g.m113807i(c14261c.f52065d == (c34618t != null));
        this.f44238b = j7;
        this.f44239c = j13;
        this.f44240d = j14;
        this.f44241e = i13;
        this.f44242f = j15;
        this.f44243g = j16;
        this.f44244h = j17;
        this.f44245i = c14261c;
        this.f44246j = c34626x;
        this.f44247k = c34618t;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: b */
    public final int mo8132b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f44241e) >= 0 && iIntValue < mo8136h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: f */
    public final C34605m0 mo8128f(int i13, C34605m0 c34605m0, boolean z4) {
        AbstractC35849g.m113804f(i13, mo8136h());
        C14261c c14261c = this.f44245i;
        String str = z4 ? c14261c.m40728a(i13).f52094a : null;
        Integer numValueOf = z4 ? Integer.valueOf(this.f44241e + i13) : null;
        long jM40730c = c14261c.m40730c(i13);
        long jM121896J = AbstractC38065t.m121896J(c14261c.m40728a(i13).f52095b - c14261c.m40728a(0).f52095b) - this.f44242f;
        c34605m0.getClass();
        c34605m0.m109399h(str, numValueOf, 0, jM40730c, jM121896J, C34582b.f145636c, false);
        return c34605m0;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: h */
    public final int mo8136h() {
        return this.f44245i.f52074m.size();
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: l */
    public final Object mo8138l(int i13) {
        AbstractC35849g.m113804f(i13, mo8136h());
        return Integer.valueOf(this.f44241e + i13);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: m */
    public final C34607n0 mo8129m(int i13, C34607n0 c34607n0, long j7) {
        boolean z4;
        long j13;
        long j14;
        boolean z13;
        long j15;
        InterfaceC12870i interfaceC12870iMo40753c;
        AbstractC35849g.m113804f(i13, 1);
        C14261c c14261c = this.f44245i;
        boolean z14 = c14261c.f52065d;
        long jMo3091a = this.f44244h;
        if (z14 && c14261c.f52066e != -9223372036854775807L && c14261c.f52063b == -9223372036854775807L) {
            long j16 = 0;
            if (j7 > 0) {
                jMo3091a += j7;
                if (jMo3091a > this.f44243g) {
                    z4 = true;
                    j14 = -9223372036854775807L;
                    j13 = -9223372036854775807L;
                }
                Object obj = C34607n0.f145699q;
                if (c14261c.f52065d || c14261c.f52066e == j13 || c14261c.f52063b != j13) {
                    z13 = false;
                } else {
                    z13 = z4;
                }
                c34607n0.m109402b(this.f44246j, c14261c, this.f44238b, this.f44239c, this.f44240d, true, z13, this.f44247k, j14, this.f44243g, mo8136h() - 1, this.f44242f);
                return c34607n0;
            }
            long j17 = this.f44242f + jMo3091a;
            long jM40730c = c14261c.m40730c(0);
            int i14 = 0;
            while (i14 < c14261c.f52074m.size() - 1 && j17 >= jM40730c) {
                j17 -= jM40730c;
                i14++;
                jM40730c = c14261c.m40730c(i14);
            }
            C14266h c14266hM40728a = c14261c.m40728a(i14);
            List list = c14266hM40728a.f52096c;
            z4 = true;
            int size = list.size();
            j13 = -9223372036854775807L;
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    j15 = j16;
                    i15 = -1;
                    break;
                }
                j15 = j16;
                if (((C14259a) list.get(i15)).f52053b == 2) {
                    break;
                }
                i15++;
                j16 = j15;
            }
            if (i15 != -1 && (interfaceC12870iMo40753c = ((AbstractC14271m) ((C14259a) c14266hM40728a.f52096c.get(i15)).f52054c.get(0)).mo40753c()) != null && interfaceC12870iMo40753c.mo3110w(jM40730c) != j15) {
                jMo3091a = (interfaceC12870iMo40753c.mo3091a(interfaceC12870iMo40753c.mo3108u(j17, jM40730c)) + jMo3091a) - j17;
            }
        } else {
            z4 = true;
            j13 = -9223372036854775807L;
        }
        j14 = jMo3091a;
        Object obj2 = C34607n0.f145699q;
        if (c14261c.f52065d) {
            z13 = false;
        } else {
            z13 = false;
        }
        c34607n0.m109402b(this.f44246j, c14261c, this.f44238b, this.f44239c, this.f44240d, true, z13, this.f44247k, j14, this.f44243g, mo8136h() - 1, this.f44242f);
        return c34607n0;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: o */
    public final int mo8139o() {
        return 1;
    }
}
