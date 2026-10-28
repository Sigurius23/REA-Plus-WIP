package p395p6;

import p000.AbstractC11266d;
import p545v6.C35712a;
import p545v6.C35713b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p6.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C28915s {

    /* JADX INFO: renamed from: a */
    public final EnumC28881g1 f117021a;

    /* JADX INFO: renamed from: b */
    public final int f117022b;

    /* JADX INFO: renamed from: c */
    public final C35712a f117023c;

    /* JADX INFO: renamed from: d */
    public final C35713b f117024d;

    public C28915s(EnumC28881g1 enumC28881g1, int i13, C35712a c35712a, C35713b c35713b) {
        this.f117021a = enumC28881g1;
        this.f117022b = i13;
        this.f117023c = c35712a;
        this.f117024d = c35713b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28915s)) {
            return false;
        }
        C28915s c28915s = (C28915s) obj;
        return this.f117021a == c28915s.f117021a && this.f117022b == c28915s.f117022b && AbstractC22676k.m65745e(this.f117023c, c28915s.f117023c) && AbstractC22676k.m65745e(this.f117024d, c28915s.f117024d);
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.f117022b, this.f117021a.hashCode() * 31, 31);
        C35712a c35712a = this.f117023c;
        int iHashCode = (iM30448b + (c35712a == null ? 0 : Integer.hashCode(c35712a.f151945a))) * 31;
        C35713b c35713b = this.f117024d;
        return iHashCode + (c35713b != null ? Integer.hashCode(c35713b.f151946a) : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.f117021a + ", numChildren=" + this.f117022b + ", horizontalAlignment=" + this.f117023c + ", verticalAlignment=" + this.f117024d + ')';
    }

    public /* synthetic */ C28915s(EnumC28881g1 enumC28881g1, int i13, C35712a c35712a, C35713b c35713b, int i14) {
        this(enumC28881g1, i13, (i14 & 4) != 0 ? null : c35712a, (i14 & 8) != 0 ? null : c35713b);
    }
}
