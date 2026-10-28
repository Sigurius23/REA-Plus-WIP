package p283kl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import p429ql.AbstractC30457c;
import p464rl.InterfaceC31508c;

/* JADX INFO: renamed from: kl.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C22555d extends AbstractC30457c {

    /* JADX INFO: renamed from: E */
    public final int f88731E;

    /* JADX INFO: renamed from: F */
    public final long f88732F;

    /* JADX INFO: renamed from: G */
    public Bitmap f88733G;

    /* JADX INFO: renamed from: z */
    public final Handler f88734z;

    public C22555d(Handler handler, int i13, long j7) {
        super(0);
        this.f88734z = handler;
        this.f88731E = i13;
        this.f88732F = j7;
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: b */
    public final void mo5838b(Object obj, InterfaceC31508c interfaceC31508c) {
        this.f88733G = (Bitmap) obj;
        Handler handler = this.f88734z;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f88732F);
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: e */
    public final void mo5839e(Drawable drawable) {
        this.f88733G = null;
    }
}
