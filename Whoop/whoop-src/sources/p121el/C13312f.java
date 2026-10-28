package p121el;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import p093dl.C12154s;
import p093dl.InterfaceC12155t;
import p586wk.C37330h;
import sc3.AbstractC32398l;
import sl.C32578d;

/* JADX INFO: renamed from: el.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C13312f implements InterfaceC12155t {

    /* JADX INFO: renamed from: a */
    public final Context f46030a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC12155t f46031b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12155t f46032c;

    /* JADX INFO: renamed from: d */
    public final Class f46033d;

    public C13312f(Context context, InterfaceC12155t interfaceC12155t, InterfaceC12155t interfaceC12155t2, Class cls) {
        this.f46030a = context.getApplicationContext();
        this.f46031b = interfaceC12155t;
        this.f46032c = interfaceC12155t2;
        this.f46033d = cls;
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: a */
    public final boolean mo33590a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC32398l.m100975h((Uri) obj);
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: b */
    public final C12154s mo33591b(Object obj, int i13, int i14, C37330h c37330h) {
        Uri uri = (Uri) obj;
        return new C12154s(new C32578d(uri), new C13311e(this.f46030a, this.f46031b, this.f46032c, uri, i13, i14, c37330h, this.f46033d));
    }
}
