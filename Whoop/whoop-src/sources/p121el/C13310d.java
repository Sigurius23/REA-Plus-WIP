package p121el;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import p093dl.C12161z;
import p093dl.InterfaceC12155t;
import p093dl.InterfaceC12156u;

/* JADX INFO: renamed from: el.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13310d implements InterfaceC12156u {

    /* JADX INFO: renamed from: a */
    public final Context f46017a;

    /* JADX INFO: renamed from: b */
    public final Class f46018b;

    public C13310d(Context context, Class cls) {
        this.f46017a = context;
        this.f46018b = cls;
    }

    @Override // p093dl.InterfaceC12156u
    /* JADX INFO: renamed from: a */
    public final InterfaceC12155t mo33589a(C12161z c12161z) {
        Class cls = this.f46018b;
        return new C13312f(this.f46017a, c12161z.m33621b(File.class, cls), c12161z.m33621b(Uri.class, cls), cls);
    }
}
