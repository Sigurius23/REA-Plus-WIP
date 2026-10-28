package p516u8;

import android.net.Uri;
import java.util.List;
import java.util.Objects;
import p482s7.AbstractC32237a;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: u8.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C34620u {

    /* JADX INFO: renamed from: a */
    public final Uri f145852a;

    /* JADX INFO: renamed from: b */
    public final String f145853b;

    /* JADX INFO: renamed from: c */
    public final List f145854c;

    /* JADX INFO: renamed from: d */
    public final AbstractC41023g0 f145855d;

    /* JADX INFO: renamed from: e */
    public final long f145856e;

    static {
        AbstractC33745d.m106663v(0, 1, 2, 3, 4);
        AbstractC38065t.m121892F(5);
        AbstractC38065t.m121892F(6);
        AbstractC38065t.m121892F(7);
    }

    public C34620u(Uri uri, String str, AbstractC32237a abstractC32237a, List list, AbstractC41023g0 abstractC41023g0, long j7) {
        this.f145852a = uri;
        this.f145853b = AbstractC34587d0.m109382o(str);
        this.f145854c = list;
        this.f145855d = abstractC41023g0;
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        for (int i13 = 0; i13 < abstractC41023g0.size(); i13++) {
            ((C34624w) abstractC41023g0.get(i13)).getClass();
            c41014d0M133251l.m133222a(new C34624w());
        }
        c41014d0M133251l.m133239f();
        this.f145856e = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34620u)) {
            return false;
        }
        C34620u c34620u = (C34620u) obj;
        return this.f145852a.equals(c34620u.f145852a) && Objects.equals(this.f145853b, c34620u.f145853b) && Objects.equals(null, null) && this.f145854c.equals(c34620u.f145854c) && this.f145855d.equals(c34620u.f145855d) && this.f145856e == c34620u.f145856e;
    }

    public final int hashCode() {
        int iHashCode = this.f145852a.hashCode() * 31;
        String str = this.f145853b;
        return (int) ((((long) ((this.f145855d.hashCode() + ((this.f145854c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31)) * 31) + this.f145856e);
    }
}
