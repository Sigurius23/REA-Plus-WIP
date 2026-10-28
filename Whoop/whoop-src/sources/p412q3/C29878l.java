package p412q3;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p478s3.C32096b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C29878l {

    /* JADX INFO: renamed from: g */
    public static final C29878l f122098g = new C29878l(false, 0, true, 1, 1, C32096b.f133098y);

    /* JADX INFO: renamed from: a */
    public final boolean f122099a;

    /* JADX INFO: renamed from: b */
    public final int f122100b;

    /* JADX INFO: renamed from: c */
    public final boolean f122101c;

    /* JADX INFO: renamed from: d */
    public final int f122102d;

    /* JADX INFO: renamed from: e */
    public final int f122103e;

    /* JADX INFO: renamed from: f */
    public final C32096b f122104f;

    public C29878l(boolean z4, int i13, boolean z13, int i14, int i15, C32096b c32096b) {
        this.f122099a = z4;
        this.f122100b = i13;
        this.f122101c = z13;
        this.f122102d = i14;
        this.f122103e = i15;
        this.f122104f = c32096b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29878l)) {
            return false;
        }
        C29878l c29878l = (C29878l) obj;
        return this.f122099a == c29878l.f122099a && this.f122100b == c29878l.f122100b && this.f122101c == c29878l.f122101c && this.f122102d == c29878l.f122102d && this.f122103e == c29878l.f122103e && AbstractC22676k.m65745e(this.f122104f, c29878l.f122104f);
    }

    public final int hashCode() {
        return this.f122104f.f133099w.hashCode() + AbstractC11266d.m30448b(this.f122103e, AbstractC11266d.m30448b(this.f122102d, AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.f122100b, Boolean.hashCode(this.f122099a) * 31, 31), 31, this.f122101c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f122099a + ", capitalization=" + ((Object) C29879m.m91502a(this.f122100b)) + ", autoCorrect=" + this.f122101c + ", keyboardType=" + ((Object) C29880n.m91503a(this.f122102d)) + ", imeAction=" + ((Object) C29877k.m91501a(this.f122103e)) + ", platformImeOptions=null, hintLocales=" + this.f122104f + ')';
    }
}
