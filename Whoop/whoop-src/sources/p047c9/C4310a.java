package p047c9;

import java.util.Objects;
import p299l9.C23488c0;
import p516u8.AbstractC34609o0;

/* JADX INFO: renamed from: c9.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C4310a {

    /* JADX INFO: renamed from: a */
    public final long f17495a;

    /* JADX INFO: renamed from: b */
    public final AbstractC34609o0 f17496b;

    /* JADX INFO: renamed from: c */
    public final int f17497c;

    /* JADX INFO: renamed from: d */
    public final C23488c0 f17498d;

    /* JADX INFO: renamed from: e */
    public final long f17499e;

    /* JADX INFO: renamed from: f */
    public final AbstractC34609o0 f17500f;

    /* JADX INFO: renamed from: g */
    public final int f17501g;

    /* JADX INFO: renamed from: h */
    public final C23488c0 f17502h;

    /* JADX INFO: renamed from: i */
    public final long f17503i;

    /* JADX INFO: renamed from: j */
    public final long f17504j;

    public C4310a(long j7, AbstractC34609o0 abstractC34609o0, int i13, C23488c0 c23488c0, long j13, AbstractC34609o0 abstractC34609o1, int i14, C23488c0 c23488c1, long j14, long j15) {
        this.f17495a = j7;
        this.f17496b = abstractC34609o0;
        this.f17497c = i13;
        this.f17498d = c23488c0;
        this.f17499e = j13;
        this.f17500f = abstractC34609o1;
        this.f17501g = i14;
        this.f17502h = c23488c1;
        this.f17503i = j14;
        this.f17504j = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4310a.class == obj.getClass()) {
            C4310a c4310a = (C4310a) obj;
            if (this.f17495a == c4310a.f17495a && this.f17497c == c4310a.f17497c && this.f17499e == c4310a.f17499e && this.f17501g == c4310a.f17501g && this.f17503i == c4310a.f17503i && this.f17504j == c4310a.f17504j && Objects.equals(this.f17496b, c4310a.f17496b) && Objects.equals(this.f17498d, c4310a.f17498d) && Objects.equals(this.f17500f, c4310a.f17500f) && Objects.equals(this.f17502h, c4310a.f17502h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f17495a), this.f17496b, Integer.valueOf(this.f17497c), this.f17498d, Long.valueOf(this.f17499e), this.f17500f, Integer.valueOf(this.f17501g), this.f17502h, Long.valueOf(this.f17503i), Long.valueOf(this.f17504j));
    }
}
