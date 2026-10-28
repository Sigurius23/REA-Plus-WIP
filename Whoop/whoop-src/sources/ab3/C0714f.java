package ab3;

import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35845c;

/* JADX INFO: renamed from: ab3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C0714f {

    /* JADX INFO: renamed from: a */
    public final C35845c f2694a;

    /* JADX INFO: renamed from: b */
    public final int f2695b;

    public C0714f(C35845c c35845c, int i13) {
        this.f2694a = c35845c;
        this.f2695b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0714f)) {
            return false;
        }
        C0714f c0714f = (C0714f) obj;
        return AbstractC22676k.m65745e(this.f2694a, c0714f.f2694a) && this.f2695b == c0714f.f2695b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2695b) + (this.f2694a.hashCode() * 31);
    }

    public final String toString() {
        int i13;
        StringBuilder sb4 = new StringBuilder();
        int i14 = 0;
        while (true) {
            i13 = this.f2695b;
            if (i14 >= i13) {
                break;
            }
            sb4.append("kotlin/Array<");
            i14++;
        }
        sb4.append(this.f2694a);
        for (int i15 = 0; i15 < i13; i15++) {
            sb4.append(">");
        }
        return sb4.toString();
    }
}
