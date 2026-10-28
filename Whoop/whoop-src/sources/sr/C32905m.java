package sr;

import android.content.Context;
import gm.C15982j;
import ng3.C26702o;
import p412q3.C29875i;
import p623xr.C38615k;
import p623xr.InterfaceC38616l;
import pg3.C29205p;

/* JADX INFO: renamed from: sr.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C32905m implements InterfaceC38616l {

    /* JADX INFO: renamed from: w */
    public final C38615k f137125w;

    public C32905m(C38615k c38615k) {
        this.f137125w = c38615k;
    }

    @Override // p623xr.InterfaceC38617m
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ Object mo45127a() {
        return new C32904l((C32900h) this.f137125w.mo45127a());
    }

    public C32905m(Context context) {
        C15982j c15982j = new C15982j(context, (byte) 0);
        C38615k c38615kM123813b = C38615k.m123813b(AbstractC32893a.f137094b);
        new C26702o(c15982j);
        C29875i c29875i = new C29875i();
        c29875i.f122095w = c15982j;
        c29875i.f122096x = c38615kM123813b;
        C38615k c38615kM123813b2 = C38615k.m123813b(c29875i);
        this.f137125w = C38615k.m123813b(new C29205p(c38615kM123813b2, C38615k.m123813b(new C32905m(c38615kM123813b2)), false, 5));
    }
}
