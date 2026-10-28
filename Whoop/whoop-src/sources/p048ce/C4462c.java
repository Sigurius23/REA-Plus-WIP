package p048ce;

import c93.InterfaceC4339a;
import p035bp.AbstractC3511b;
import p319m4.AbstractC25012a;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: ce.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C4462c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17980w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4472m f17981x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4461b0 f17982y;

    public /* synthetic */ C4462c(C4472m c4472m, InterfaceC4461b0 interfaceC4461b0, int i13) {
        this.f17980w = i13;
        this.f17981x = c4472m;
        this.f17982y = interfaceC4461b0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f17980w) {
            case 0:
                StringBuilder sb4 = new StringBuilder("Ignoring invalid ");
                C4485z c4485z = (C4485z) this.f17982y;
                sb4.append(AbstractC37978j.m121653n(c4485z));
                sb4.append(" '");
                return AbstractC3511b.m10386o(Integer.valueOf(this.f17981x.f18002a), AbstractC25012a.m73377j(sb4, c4485z.f18026a, '\''));
            case 1:
                return AbstractC3511b.m10386o(Integer.valueOf(this.f17981x.f18002a), AbstractC25012a.m73377j(new StringBuilder("Ignoring invalid property '"), ((C4484y) this.f17982y).f18024a, '\''));
            case 2:
                return AbstractC3511b.m10386o(Integer.valueOf(this.f17981x.f18002a), AbstractC25012a.m73377j(new StringBuilder("Overwriting previously-defined property '"), ((C4484y) this.f17982y).f18024a, '\''));
            case 3:
                return AbstractC3511b.m10386o(Integer.valueOf(this.f17981x.f18002a), AbstractC25012a.m73377j(new StringBuilder("Ignoring invalid sub-property '"), ((C4459a0) this.f17982y).f17969a, '\''));
            default:
                return AbstractC3511b.m10386o(Integer.valueOf(this.f17981x.f18002a), AbstractC25012a.m73377j(new StringBuilder("Overwriting previously-defined property '"), ((C4459a0) this.f17982y).f17969a, '\''));
        }
    }
}
