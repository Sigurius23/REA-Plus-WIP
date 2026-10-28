package p093dl;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p586wk.C37330h;

/* JADX INFO: renamed from: dl.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12142g0 implements InterfaceC12155t {

    /* JADX INFO: renamed from: b */
    public static final Set f40379b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a */
    public final InterfaceC12155t f40380a;

    public C12142g0(InterfaceC12155t interfaceC12155t) {
        this.f40380a = interfaceC12155t;
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: a */
    public final boolean mo33590a(Object obj) {
        return f40379b.contains(((Uri) obj).getScheme());
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: b */
    public final C12154s mo33591b(Object obj, int i13, int i14, C37330h c37330h) {
        return this.f40380a.mo33591b(new C12144i(((Uri) obj).toString()), i13, i14, c37330h);
    }
}
