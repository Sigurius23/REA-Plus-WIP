package p100dw;

import android.os.SystemClock;
import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: dw.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C12396a extends C22672i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public static final C12396a f41986w = new C12396a(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
