package io.sentry.android.core.util;

import ad3.C0783z;
import android.content.Context;
import java.io.File;
import p034bl.C3363c;
import p034bl.C3364d;
import p034bl.InterfaceC3361a;
import p211i5.C18090c;
import u00.C34377e;

/* JADX INFO: renamed from: io.sentry.android.core.util.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C20162a {

    /* JADX INFO: renamed from: a */
    public final Object f75757a;

    /* JADX INFO: renamed from: b */
    public volatile Object f75758b;

    public C20162a(C18090c c18090c) {
        this.f75758b = null;
        this.f75757a = c18090c;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC3361a m56071a() {
        if (((InterfaceC3361a) this.f75758b) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC3361a) this.f75758b) == null) {
                        File cacheDir = ((C3364d) ((C0783z) this.f75757a).f2818x).f13108a.getCacheDir();
                        C3363c c3363c = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.mkdirs() || (file.exists() && file.isDirectory()))) {
                            c3363c = new C3363c(file);
                        }
                        this.f75758b = c3363c;
                    }
                    if (((InterfaceC3361a) this.f75758b) == null) {
                        this.f75758b = new C34377e(16);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return (InterfaceC3361a) this.f75758b;
    }

    /* JADX INFO: renamed from: b */
    public Object m56072b(Context context) {
        if (this.f75758b == null) {
            synchronized (this) {
                try {
                    if (this.f75758b == null) {
                        this.f75758b = ((C18090c) this.f75757a).m51938c(context);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return this.f75758b;
    }

    public C20162a(C0783z c0783z) {
        this.f75757a = c0783z;
    }
}
