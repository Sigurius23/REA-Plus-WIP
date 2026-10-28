package p516u8;

import java.util.Objects;
import p607x8.AbstractC38065t;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: u8.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34597i0 {

    /* JADX INFO: renamed from: a */
    public final Object f145669a;

    /* JADX INFO: renamed from: b */
    public final int f145670b;

    /* JADX INFO: renamed from: c */
    public final C34626x f145671c;

    /* JADX INFO: renamed from: d */
    public final Object f145672d;

    /* JADX INFO: renamed from: e */
    public final int f145673e;

    /* JADX INFO: renamed from: f */
    public final long f145674f;

    /* JADX INFO: renamed from: g */
    public final long f145675g;

    /* JADX INFO: renamed from: h */
    public final int f145676h;

    /* JADX INFO: renamed from: i */
    public final int f145677i;

    static {
        AbstractC33745d.m106663v(0, 1, 2, 3, 4);
        AbstractC38065t.m121892F(5);
        AbstractC38065t.m121892F(6);
    }

    public C34597i0(Object obj, int i13, C34626x c34626x, Object obj2, int i14, long j7, long j13, int i15, int i16) {
        this.f145669a = obj;
        this.f145670b = i13;
        this.f145671c = c34626x;
        this.f145672d = obj2;
        this.f145673e = i14;
        this.f145674f = j7;
        this.f145675g = j13;
        this.f145676h = i15;
        this.f145677i = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C34597i0.class == obj.getClass()) {
            C34597i0 c34597i0 = (C34597i0) obj;
            if (this.f145670b == c34597i0.f145670b && this.f145673e == c34597i0.f145673e && this.f145674f == c34597i0.f145674f && this.f145675g == c34597i0.f145675g && this.f145676h == c34597i0.f145676h && this.f145677i == c34597i0.f145677i && Objects.equals(this.f145671c, c34597i0.f145671c) && Objects.equals(this.f145669a, c34597i0.f145669a) && Objects.equals(this.f145672d, c34597i0.f145672d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f145669a, Integer.valueOf(this.f145670b), this.f145671c, this.f145672d, Integer.valueOf(this.f145673e), Long.valueOf(this.f145674f), Long.valueOf(this.f145675g), Integer.valueOf(this.f145676h), Integer.valueOf(this.f145677i));
    }
}
