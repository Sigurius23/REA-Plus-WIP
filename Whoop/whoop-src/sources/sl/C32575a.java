package sl;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p586wk.InterfaceC37327e;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: sl.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C32575a implements InterfaceC37327e {

    /* JADX INFO: renamed from: b */
    public final int f134964b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC37327e f134965c;

    public C32575a(int i13, InterfaceC37327e interfaceC37327e) {
        this.f134964b = i13;
        this.f134965c = interfaceC37327e;
    }

    @Override // p586wk.InterfaceC37327e
    /* JADX INFO: renamed from: a */
    public final void mo33605a(MessageDigest messageDigest) {
        this.f134965c.mo33605a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f134964b).array());
    }

    @Override // p586wk.InterfaceC37327e
    public final boolean equals(Object obj) {
        if (obj instanceof C32575a) {
            C32575a c32575a = (C32575a) obj;
            if (this.f134964b == c32575a.f134964b && this.f134965c.equals(c32575a.f134965c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p586wk.InterfaceC37327e
    public final int hashCode() {
        return AbstractC33913l.m107271f(this.f134964b, this.f134965c);
    }
}
