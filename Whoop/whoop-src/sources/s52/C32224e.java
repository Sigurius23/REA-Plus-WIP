package s52;

import android.view.View;
import bh3.InterfaceC3255b;
import com.whoop.p069ui.debug.WhoopStrapTestFragment;
import od1.C27848k;
import p177gx.C16270a;
import p233ix.C21011a;
import y82.EnumC39339b;

/* JADX INFO: renamed from: s52.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32224e implements InterfaceC3255b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133418w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f133419x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f133420y;

    public /* synthetic */ C32224e(int i13, Object obj, Object obj2) {
        this.f133418w = i13;
        this.f133419x = obj;
        this.f133420y = obj2;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f133418w) {
            case 0:
                C32225f.m100245c((C21011a) this.f133419x, (C16270a) this.f133420y, (C27848k) obj);
                break;
            case 1:
                C32225f.m100246d((C21011a) this.f133419x, (C16270a) this.f133420y, (Throwable) obj);
                break;
            default:
                ((WhoopStrapTestFragment) this.f133419x).m26835G((EnumC39339b) this.f133420y, (View) obj);
                break;
        }
    }
}
