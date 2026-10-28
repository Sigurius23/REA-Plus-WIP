package p209i3;

import i93.C18279e;
import i93.InterfaceC18280f;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C18026h {

    /* JADX INFO: renamed from: d */
    public static final C18026h f69945d = new C18026h(0.0f, new C18279e(0.0f, 0.0f), 0);

    /* JADX INFO: renamed from: a */
    public final float f69946a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC18280f f69947b;

    /* JADX INFO: renamed from: c */
    public final int f69948c;

    public C18026h(float f13, InterfaceC18280f interfaceC18280f, int i13) {
        this.f69946a = f13;
        this.f69947b = interfaceC18280f;
        this.f69948c = i13;
        if (Float.isNaN(f13)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18026h)) {
            return false;
        }
        C18026h c18026h = (C18026h) obj;
        return this.f69946a == c18026h.f69946a && AbstractC22676k.m65745e(this.f69947b, c18026h.f69947b) && this.f69948c == c18026h.f69948c;
    }

    public final int hashCode() {
        return ((this.f69947b.hashCode() + (Float.hashCode(this.f69946a) * 31)) * 31) + this.f69948c;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ProgressBarRangeInfo(current=");
        sb4.append(this.f69946a);
        sb4.append(", range=");
        sb4.append(this.f69947b);
        sb4.append(", steps=");
        return AbstractC11895b.m31999r(sb4, this.f69948c, ')');
    }
}
