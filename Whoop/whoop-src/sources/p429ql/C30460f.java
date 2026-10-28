package p429ql;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.ComponentCallbacks2C4966h;
import mr.C25898d;
import p464rl.InterfaceC31508c;

/* JADX INFO: renamed from: ql.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C30460f extends AbstractC30457c {

    /* JADX INFO: renamed from: E */
    public static final Handler f125168E = new Handler(Looper.getMainLooper(), new C25898d(1));

    /* JADX INFO: renamed from: z */
    public final ComponentCallbacks2C4966h f125169z;

    public C30460f(ComponentCallbacks2C4966h componentCallbacks2C4966h) {
        super(0);
        this.f125169z = componentCallbacks2C4966h;
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: b */
    public final void mo5838b(Object obj, InterfaceC31508c interfaceC31508c) {
        f125168E.obtainMessage(1, this).sendToTarget();
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: e */
    public final void mo5839e(Drawable drawable) {
    }
}
