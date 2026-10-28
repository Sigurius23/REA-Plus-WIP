package hf3;

import android.util.Log;
import ih0.AbstractC18489d0;
import p108e4.AbstractC12682p;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: hf3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C17239a extends AbstractC30060g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66265a;

    public C17239a(int i13) {
        this.f66265a = i13;
        AbstractC18489d0.m53382w(4, "level");
    }

    @Override // q83.AbstractC30060g
    /* JADX INFO: renamed from: I */
    public final void mo48820I(int i13, String msg) {
        switch (this.f66265a) {
            case 0:
                AbstractC18489d0.m53382w(i13, "level");
                AbstractC22676k.m65750j(msg, "msg");
                if (AbstractC12682p.m35482b(4, i13) <= 0) {
                    int iM35485e = AbstractC12682p.m35485e(i13);
                    if (iM35485e == 0) {
                        Log.d("[Koin]", msg);
                    } else if (iM35485e == 1) {
                        Log.i("[Koin]", msg);
                    } else if (iM35485e == 2) {
                        Log.e("[Koin]", msg);
                    } else {
                        Log.e("[Koin]", msg);
                    }
                }
                break;
            default:
                AbstractC18489d0.m53382w(i13, "level");
                AbstractC22676k.m65750j(msg, "msg");
                break;
        }
    }
}
