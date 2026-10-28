package p283kl;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import gl.C15938c;
import java.security.MessageDigest;
import p586wk.InterfaceC37334l;
import p684zk.InterfaceC40801z;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: kl.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C22554c implements InterfaceC37334l {

    /* JADX INFO: renamed from: b */
    public final InterfaceC37334l f88730b;

    public C22554c(InterfaceC37334l interfaceC37334l) {
        AbstractC29125c.m88539p(interfaceC37334l, "Argument must not be null");
        this.f88730b = interfaceC37334l;
    }

    @Override // p586wk.InterfaceC37327e
    /* JADX INFO: renamed from: a */
    public final void mo33605a(MessageDigest messageDigest) {
        this.f88730b.mo33605a(messageDigest);
    }

    @Override // p586wk.InterfaceC37334l
    /* JADX INFO: renamed from: b */
    public final InterfaceC40801z mo41591b(Context context, InterfaceC40801z interfaceC40801z, int i13, int i14) {
        C22553b c22553b = (C22553b) interfaceC40801z.get();
        InterfaceC40801z c15938c = new C15938c(ComponentCallbacks2C4960b.m15527c(context).f20298x, ((C22558g) c22553b.f88726w.f7566b).m65287c());
        InterfaceC37334l interfaceC37334l = this.f88730b;
        InterfaceC40801z interfaceC40801zMo41591b = interfaceC37334l.mo41591b(context, c15938c, i13, i14);
        if (!c15938c.equals(interfaceC40801zMo41591b)) {
            c15938c.mo44996a();
        }
        ((C22558g) c22553b.f88726w.f7566b).m65293i(interfaceC37334l, (Bitmap) interfaceC40801zMo41591b.get());
        return interfaceC40801z;
    }

    @Override // p586wk.InterfaceC37327e
    public final boolean equals(Object obj) {
        if (obj instanceof C22554c) {
            return this.f88730b.equals(((C22554c) obj).f88730b);
        }
        return false;
    }

    @Override // p586wk.InterfaceC37327e
    public final int hashCode() {
        return this.f88730b.hashCode();
    }
}
