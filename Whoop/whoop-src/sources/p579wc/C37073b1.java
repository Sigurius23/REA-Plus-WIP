package p579wc;

import c93.InterfaceC4339a;
import p520ud.C34785f;
import ug.EnumC34931t;

/* JADX INFO: renamed from: wc.b1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C37073b1 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158603w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34785f f158604x;

    public /* synthetic */ C37073b1(C34785f c34785f, int i13) {
        this.f158603w = i13;
        this.f158604x = c34785f;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158603w) {
            case 0:
                return "obtained assumed credentials; expiration=" + this.f158604x.f146479b.m110113b(EnumC34931t.f147048w);
            default:
                return "obtained assumed credentials via web identity; expiration=" + this.f158604x.f146479b.m110113b(EnumC34931t.f147048w);
        }
    }
}
