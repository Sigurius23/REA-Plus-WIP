package p524ui;

import bc3.C3033m;
import p426qi.InterfaceC30405z;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ui.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C34972b0 implements InterfaceC30405z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147958a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3033m f147959b;

    public /* synthetic */ C34972b0(C3033m c3033m, int i13) {
        this.f147958a = i13;
        this.f147959b = c3033m;
    }

    @Override // p426qi.InterfaceC30405z
    public final void onResult(Object obj) {
        switch (this.f147958a) {
            case 0:
                C3033m c3033m = this.f147959b;
                if (!c3033m.m8778w()) {
                    c3033m.resumeWith(obj);
                }
                break;
            default:
                Throwable e5 = (Throwable) obj;
                C3033m c3033m2 = this.f147959b;
                if (!c3033m2.m8778w()) {
                    AbstractC22676k.m65749i(e5, "e");
                    c3033m2.resumeWith(AbstractC34132o.m107888l(e5));
                }
                break;
        }
    }
}
