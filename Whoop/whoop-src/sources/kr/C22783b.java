package kr;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: kr.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C22783b implements InterfaceC22784c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC22784c f89706a;

    /* JADX INFO: renamed from: b */
    public final float f89707b;

    public C22783b(float f13, InterfaceC22784c interfaceC22784c) {
        while (interfaceC22784c instanceof C22783b) {
            interfaceC22784c = ((C22783b) interfaceC22784c).f89706a;
            f13 += ((C22783b) interfaceC22784c).f89707b;
        }
        this.f89706a = interfaceC22784c;
        this.f89707b = f13;
    }

    @Override // kr.InterfaceC22784c
    /* JADX INFO: renamed from: a */
    public final float mo65993a(RectF rectF) {
        return Math.max(0.0f, this.f89706a.mo65993a(rectF) + this.f89707b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22783b)) {
            return false;
        }
        C22783b c22783b = (C22783b) obj;
        return this.f89706a.equals(c22783b.f89706a) && this.f89707b == c22783b.f89707b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f89706a, Float.valueOf(this.f89707b)});
    }
}
