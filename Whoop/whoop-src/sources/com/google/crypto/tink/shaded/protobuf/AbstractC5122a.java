package com.google.crypto.tink.shaded.protobuf;

import io.sentry.internal.debugmeta.C20378c;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5122a implements InterfaceC5168p0 {
    protected int memoizedHashCode;

    /* JADX INFO: renamed from: b */
    public abstract int mo16105b(InterfaceC5124a1 interfaceC5124a1);

    /* JADX INFO: renamed from: c */
    public final String m16106c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC5180v mo16107d();

    /* JADX INFO: renamed from: e */
    public final byte[] m16108e() {
        try {
            byte[] bArr = new byte[((AbstractC5184x) this).mo16105b(null)];
            C5158m c5158mM16263q0 = C5158m.m16263q0(bArr);
            mo16110g(c5158mM16263q0);
            c5158mM16263q0.m16266g0();
            return bArr;
        } catch (IOException e5) {
            throw new RuntimeException(m16106c("byte array"), e5);
        }
    }

    /* JADX INFO: renamed from: f */
    public final C5143h m16109f() {
        try {
            int iMo16105b = ((AbstractC5184x) this).mo16105b(null);
            C5143h c5143h = AbstractC5146i.f21514x;
            C20378c c20378c = new C20378c(iMo16105b);
            mo16110g(c20378c.m56590s());
            return c20378c.m56584m();
        } catch (IOException e5) {
            throw new RuntimeException(m16106c("ByteString"), e5);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo16110g(C5158m c5158m);
}
