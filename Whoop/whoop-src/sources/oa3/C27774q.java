package oa3;

import jb3.C21564x;
import jb3.EnumC21549i;
import jb3.InterfaceC21550j;
import p319m4.AbstractC25012a;
import w93.C36969b;
import x93.AbstractC38109c;

/* JADX INFO: renamed from: oa3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C27774q implements InterfaceC21550j {

    /* JADX INFO: renamed from: w */
    public final C36969b f111971w;

    public C27774q(C36969b c36969b, C21564x c21564x, EnumC21549i enumC21549i) {
        this.f111971w = c36969b;
    }

    @Override // jb3.InterfaceC21550j
    /* JADX INFO: renamed from: j */
    public final String mo60582j() {
        return AbstractC25012a.m73377j(new StringBuilder("Class '"), AbstractC38109c.m122089a(this.f111971w.f158227a).m113773a().f152613a.f152616a, '\'');
    }

    public final String toString() {
        return C27774q.class.getSimpleName() + ": " + this.f111971w;
    }
}
