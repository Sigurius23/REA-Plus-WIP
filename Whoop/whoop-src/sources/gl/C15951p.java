package gl;

import al.InterfaceC0955b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import java.security.MessageDigest;
import p586wk.InterfaceC37334l;
import p684zk.InterfaceC40801z;

/* JADX INFO: renamed from: gl.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C15951p implements InterfaceC37334l {

    /* JADX INFO: renamed from: b */
    public final InterfaceC37334l f60374b;

    /* JADX INFO: renamed from: c */
    public final boolean f60375c;

    public C15951p(InterfaceC37334l interfaceC37334l, boolean z4) {
        this.f60374b = interfaceC37334l;
        this.f60375c = z4;
    }

    @Override // p586wk.InterfaceC37327e
    /* JADX INFO: renamed from: a */
    public final void mo33605a(MessageDigest messageDigest) {
        this.f60374b.mo33605a(messageDigest);
    }

    @Override // p586wk.InterfaceC37334l
    /* JADX INFO: renamed from: b */
    public final InterfaceC40801z mo41591b(Context context, InterfaceC40801z interfaceC40801z, int i13, int i14) {
        InterfaceC0955b interfaceC0955b = ComponentCallbacks2C4960b.m15527c(context).f20298x;
        Drawable drawable = (Drawable) interfaceC40801z.get();
        C15938c c15938cM45018a = AbstractC15950o.m45018a(interfaceC0955b, drawable, i13, i14);
        if (c15938cM45018a != null) {
            InterfaceC40801z interfaceC40801zMo41591b = this.f60374b.mo41591b(context, c15938cM45018a, i13, i14);
            if (!interfaceC40801zMo41591b.equals(c15938cM45018a)) {
                return C15938c.m44995d(context.getResources(), interfaceC40801zMo41591b);
            }
            interfaceC40801zMo41591b.mo44996a();
            return interfaceC40801z;
        }
        if (!this.f60375c) {
            return interfaceC40801z;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p586wk.InterfaceC37327e
    public final boolean equals(Object obj) {
        if (obj instanceof C15951p) {
            return this.f60374b.equals(((C15951p) obj).f60374b);
        }
        return false;
    }

    @Override // p586wk.InterfaceC37327e
    public final int hashCode() {
        return this.f60374b.hashCode();
    }
}
