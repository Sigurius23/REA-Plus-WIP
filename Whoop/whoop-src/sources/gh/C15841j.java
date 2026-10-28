package gh;

import android.net.Uri;
import l83.C23470p;
import mh.C25545m;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gh.j */
/* JADX INFO: loaded from: classes.dex */
public final class C15841j implements InterfaceC15838g {

    /* JADX INFO: renamed from: a */
    public final C23470p f59829a;

    /* JADX INFO: renamed from: b */
    public final C23470p f59830b;

    /* JADX INFO: renamed from: c */
    public final boolean f59831c;

    public C15841j(C23470p c23470p, C23470p c23470p2, boolean z4) {
        this.f59829a = c23470p;
        this.f59830b = c23470p2;
        this.f59831c = z4;
    }

    @Override // gh.InterfaceC15838g
    /* JADX INFO: renamed from: a */
    public final InterfaceC15839h mo44669a(Object obj, C25545m c25545m) {
        Uri uri = (Uri) obj;
        if (!AbstractC22676k.m65745e(uri.getScheme(), "http") && !AbstractC22676k.m65745e(uri.getScheme(), "https")) {
            return null;
        }
        return new C15844m(uri.toString(), c25545m, this.f59829a, this.f59830b, this.f59831c);
    }
}
