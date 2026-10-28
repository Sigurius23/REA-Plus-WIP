package p299l9;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p141f9.C14278t;
import p499t9.C33650s;
import p516u8.AbstractC34609o0;
import p516u8.C34581a0;
import p516u8.C34582b;
import p516u8.C34605m0;
import p516u8.C34607n0;
import p516u8.C34618t;
import p516u8.C34620u;
import p516u8.C34622v;
import p516u8.C34626x;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: l9.d1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23492d1 extends AbstractC34609o0 {

    /* JADX INFO: renamed from: g */
    public static final Object f92988g = new Object();

    /* JADX INFO: renamed from: b */
    public final long f92989b;

    /* JADX INFO: renamed from: c */
    public final long f92990c;

    /* JADX INFO: renamed from: d */
    public final boolean f92991d;

    /* JADX INFO: renamed from: e */
    public final C34626x f92992e;

    /* JADX INFO: renamed from: f */
    public final C34618t f92993f;

    static {
        C33650s c33650s = new C33650s();
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        C41060w0 c41060w0 = C41060w0.f177067E;
        List list = Collections.EMPTY_LIST;
        C41060w0 c41060w1 = C41060w0.f177067E;
        C14278t c14278t = new C14278t();
        C34622v c34622v = C34622v.f145862a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C34620u(uri, null, null, list, c41060w1, -9223372036854775807L);
        }
        c33650s.m106279a();
        c14278t.m40765b();
        C34581a0 c34581a0 = C34581a0.f145608B;
    }

    public C23492d1(long j7, boolean z4, boolean z13, C34626x c34626x) {
        C34618t c34618t = z13 ? c34626x.f145868c : null;
        this.f92989b = j7;
        this.f92990c = j7;
        this.f92991d = z4;
        c34626x.getClass();
        this.f92992e = c34626x;
        this.f92993f = c34618t;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: b */
    public final int mo8132b(Object obj) {
        return f92988g.equals(obj) ? 0 : -1;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: f */
    public final C34605m0 mo8128f(int i13, C34605m0 c34605m0, boolean z4) {
        AbstractC35849g.m113804f(i13, 1);
        Object obj = z4 ? f92988g : null;
        c34605m0.getClass();
        c34605m0.m109399h(null, obj, 0, this.f92989b, 0L, C34582b.f145636c, false);
        return c34605m0;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: h */
    public final int mo8136h() {
        return 1;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: l */
    public final Object mo8138l(int i13) {
        AbstractC35849g.m113804f(i13, 1);
        return f92988g;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: m */
    public final C34607n0 mo8129m(int i13, C34607n0 c34607n0, long j7) {
        AbstractC35849g.m113804f(i13, 1);
        Object obj = C34607n0.f145699q;
        c34607n0.m109402b(this.f92992e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f92991d, false, this.f92993f, 0L, this.f92990c, 0, 0L);
        return c34607n0;
    }

    @Override // p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: o */
    public final int mo8139o() {
        return 1;
    }
}
