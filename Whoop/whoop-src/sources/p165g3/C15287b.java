package p165g3;

import android.content.res.Resources;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C15287b {

    /* JADX INFO: renamed from: a */
    public final Resources.Theme f57431a;

    /* JADX INFO: renamed from: b */
    public final int f57432b;

    public C15287b(Resources.Theme theme, int i13) {
        this.f57431a = theme;
        this.f57432b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15287b)) {
            return false;
        }
        C15287b c15287b = (C15287b) obj;
        return AbstractC22676k.m65745e(this.f57431a, c15287b.f57431a) && this.f57432b == c15287b.f57432b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57432b) + (this.f57431a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Key(theme=");
        sb4.append(this.f57431a);
        sb4.append(", id=");
        return AbstractC11895b.m31999r(sb4, this.f57432b, ')');
    }
}
