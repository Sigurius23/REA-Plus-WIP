package p516u8;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p141f9.C14278t;
import p499t9.C33650s;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: u8.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C34626x {

    /* JADX INFO: renamed from: a */
    public final String f145866a;

    /* JADX INFO: renamed from: b */
    public final C34620u f145867b;

    /* JADX INFO: renamed from: c */
    public final C34618t f145868c;

    /* JADX INFO: renamed from: d */
    public final C34581a0 f145869d;

    /* JADX INFO: renamed from: e */
    public final C34616s f145870e;

    /* JADX INFO: renamed from: f */
    public final C34622v f145871f;

    static {
        C33650s c33650s = new C33650s();
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        C41060w0 c41060w0 = C41060w0.f177067E;
        List list = Collections.EMPTY_LIST;
        C41060w0 c41060w1 = C41060w0.f177067E;
        C14278t c14278t = new C14278t();
        C34622v c34622v = C34622v.f145862a;
        c33650s.m106279a();
        c14278t.m40765b();
        C34581a0 c34581a0 = C34581a0.f145608B;
        AbstractC33745d.m106663v(0, 1, 2, 3, 4);
        AbstractC38065t.m121892F(5);
    }

    public C34626x(String str, C34616s c34616s, C34620u c34620u, C34618t c34618t, C34581a0 c34581a0, C34622v c34622v) {
        this.f145866a = str;
        this.f145867b = c34620u;
        this.f145868c = c34618t;
        this.f145869d = c34581a0;
        this.f145870e = c34616s;
        this.f145871f = c34622v;
    }

    /* JADX INFO: renamed from: a */
    public static C34626x m109418a(Uri uri) {
        C33650s c33650s = new C33650s();
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        C41060w0 c41060w0 = C41060w0.f177067E;
        List list = Collections.EMPTY_LIST;
        C41060w0 c41060w1 = C41060w0.f177067E;
        C14278t c14278t = new C14278t();
        return new C34626x("", new C34616s(c33650s), uri != null ? new C34620u(uri, null, null, list, c41060w1, -9223372036854775807L) : null, new C34618t(c14278t), C34581a0.f145608B, C34622v.f145862a);
    }

    /* JADX INFO: renamed from: b */
    public static C34626x m109419b(String str) {
        C33650s c33650s = new C33650s();
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        C41060w0 c41060w0 = C41060w0.f177067E;
        List list = Collections.EMPTY_LIST;
        C41060w0 c41060w1 = C41060w0.f177067E;
        C14278t c14278t = new C14278t();
        C34622v c34622v = C34622v.f145862a;
        Uri uri = str == null ? null : Uri.parse(str);
        return new C34626x("", new C34616s(c33650s), uri != null ? new C34620u(uri, null, null, list, c41060w1, -9223372036854775807L) : null, new C34618t(c14278t), C34581a0.f145608B, c34622v);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34626x)) {
            return false;
        }
        C34626x c34626x = (C34626x) obj;
        return Objects.equals(this.f145866a, c34626x.f145866a) && this.f145870e.equals(c34626x.f145870e) && Objects.equals(this.f145867b, c34626x.f145867b) && this.f145868c.equals(c34626x.f145868c) && Objects.equals(this.f145869d, c34626x.f145869d) && Objects.equals(this.f145871f, c34626x.f145871f);
    }

    public final int hashCode() {
        int iHashCode = this.f145866a.hashCode() * 31;
        C34620u c34620u = this.f145867b;
        int iHashCode2 = (this.f145869d.hashCode() + ((this.f145870e.hashCode() + ((this.f145868c.hashCode() + ((iHashCode + (c34620u != null ? c34620u.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f145871f.getClass();
        return iHashCode2;
    }
}
