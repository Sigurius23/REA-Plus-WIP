package p085d9;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import d30.C11535h;
import p516u8.C34586d;
import ro.C31624i;

/* JADX INFO: renamed from: d9.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C11785d extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final ContentResolver f38217a;

    /* JADX INFO: renamed from: b */
    public final Uri f38218b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C11535h f38219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11785d(C11535h c11535h, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f38219c = c11535h;
        this.f38217a = contentResolver;
        this.f38218b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        C11535h c11535h = this.f38219c;
        c11535h.m30992b(C11781b.m31593c((Context) c11535h.f37185b, (C34586d) c11535h.f37193j, (C31624i) c11535h.f37192i));
    }
}
