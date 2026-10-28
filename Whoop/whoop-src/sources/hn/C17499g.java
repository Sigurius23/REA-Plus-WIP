package hn;

import java.nio.ByteBuffer;
import p309lo.AbstractC24543a;
import p527um.C35073c;

/* JADX INFO: renamed from: hn.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C17499g extends C35073c {

    /* JADX INFO: renamed from: I */
    public long f67646I;

    /* JADX INFO: renamed from: J */
    public int f67647J;

    /* JADX INFO: renamed from: K */
    public int f67648K;

    @Override // p527um.C35073c
    /* JADX INFO: renamed from: o */
    public final void mo49690o() {
        super.mo49690o();
        this.f67647J = 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m49691s(C35073c c35073c) {
        ByteBuffer byteBuffer;
        AbstractC24543a.m71569e(!c35073c.m1496f(1073741824));
        AbstractC24543a.m71569e(!c35073c.m1496f(268435456));
        AbstractC24543a.m71569e(!c35073c.m1496f(4));
        int i13 = this.f67647J;
        if (i13 > 0) {
            if (i13 >= this.f67648K || c35073c.m1496f(Integer.MIN_VALUE) != m1496f(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = c35073c.f148801z;
            if (byteBuffer2 != null && (byteBuffer = this.f148801z) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i14 = this.f67647J;
        this.f67647J = i14 + 1;
        if (i14 == 0) {
            this.f148797F = c35073c.f148797F;
            if (c35073c.m1496f(1)) {
                this.f2052x = 1;
            }
        }
        if (c35073c.m1496f(Integer.MIN_VALUE)) {
            this.f2052x = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = c35073c.f148801z;
        if (byteBuffer3 != null) {
            m110918q(byteBuffer3.remaining());
            this.f148801z.put(byteBuffer3);
        }
        this.f67646I = c35073c.f148797F;
        return true;
    }
}
