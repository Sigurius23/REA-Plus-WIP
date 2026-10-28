package p121el;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p093dl.C12144i;
import p093dl.C12154s;
import p093dl.InterfaceC12155t;
import p586wk.C37330h;

/* JADX INFO: renamed from: el.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C13309c implements InterfaceC12155t {

    /* JADX INFO: renamed from: b */
    public static final Set f46015b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a */
    public final InterfaceC12155t f46016a;

    public C13309c(InterfaceC12155t interfaceC12155t) {
        this.f46016a = interfaceC12155t;
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: a */
    public final boolean mo33590a(Object obj) {
        return f46015b.contains(((Uri) obj).getScheme());
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: b */
    public final C12154s mo33591b(Object obj, int i13, int i14, C37330h c37330h) {
        return this.f46016a.mo33591b(new C12144i(((Uri) obj).toString()), i13, i14, c37330h);
    }
}
