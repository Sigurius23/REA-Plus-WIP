package p027b3;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import dc3.C11923h;
import l83.C23454a0;

/* JADX INFO: renamed from: b3.s3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2440s3 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C11923h f9541a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2440s3(C11923h c11923h, Handler handler) {
        super(handler);
        this.f9541a = c11923h;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4, Uri uri) {
        this.f9541a.mo32218s(C23454a0.f92919a);
    }
}
