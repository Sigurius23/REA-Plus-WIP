package p142fa;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p000.AbstractC11266d;
import p516u8.AbstractC34587d0;
import p516u8.C34630z;
import p516u8.InterfaceC34583b0;
import p607x8.C38059n;

/* JADX INFO: renamed from: fa.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C14293a implements InterfaceC34583b0 {

    /* JADX INFO: renamed from: a */
    public final int f52187a;

    /* JADX INFO: renamed from: b */
    public final String f52188b;

    /* JADX INFO: renamed from: c */
    public final String f52189c;

    /* JADX INFO: renamed from: d */
    public final int f52190d;

    /* JADX INFO: renamed from: e */
    public final int f52191e;

    /* JADX INFO: renamed from: f */
    public final int f52192f;

    /* JADX INFO: renamed from: g */
    public final int f52193g;

    /* JADX INFO: renamed from: h */
    public final byte[] f52194h;

    public C14293a(int i13, String str, String str2, int i14, int i15, int i16, int i17, byte[] bArr) {
        this.f52187a = i13;
        this.f52188b = str;
        this.f52189c = str2;
        this.f52190d = i14;
        this.f52191e = i15;
        this.f52192f = i16;
        this.f52193g = i17;
        this.f52194h = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static C14293a m40836b(C38059n c38059n) {
        int iM121854g = c38059n.m121854g();
        String strM109382o = AbstractC34587d0.m109382o(c38059n.m121865r(c38059n.m121854g(), StandardCharsets.US_ASCII));
        String strM121865r = c38059n.m121865r(c38059n.m121854g(), StandardCharsets.UTF_8);
        int iM121854g2 = c38059n.m121854g();
        int iM121854g3 = c38059n.m121854g();
        int iM121854g4 = c38059n.m121854g();
        int iM121854g5 = c38059n.m121854g();
        int iM121854g6 = c38059n.m121854g();
        byte[] bArr = new byte[iM121854g6];
        c38059n.m121852e(bArr, 0, iM121854g6);
        return new C14293a(iM121854g, strM109382o, strM121865r, iM121854g2, iM121854g3, iM121854g4, iM121854g5, bArr);
    }

    @Override // p516u8.InterfaceC34583b0
    /* JADX INFO: renamed from: a */
    public final void mo40837a(C34630z c34630z) {
        c34630z.m109421a(this.f52187a, this.f52194h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14293a.class == obj.getClass()) {
            C14293a c14293a = (C14293a) obj;
            if (this.f52187a == c14293a.f52187a && this.f52188b.equals(c14293a.f52188b) && this.f52189c.equals(c14293a.f52189c) && this.f52190d == c14293a.f52190d && this.f52191e == c14293a.f52191e && this.f52192f == c14293a.f52192f && this.f52193g == c14293a.f52193g && Arrays.equals(this.f52194h, c14293a.f52194h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f52194h) + ((((((((AbstractC11266d.m30450d(AbstractC11266d.m30450d((527 + this.f52187a) * 31, 31, this.f52188b), 31, this.f52189c) + this.f52190d) * 31) + this.f52191e) * 31) + this.f52192f) * 31) + this.f52193g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f52188b + ", description=" + this.f52189c;
    }
}
