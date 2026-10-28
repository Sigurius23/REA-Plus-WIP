package hn;

import android.text.TextUtils;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: hn.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C17509q {

    /* JADX INFO: renamed from: a */
    public final String f67739a;

    /* JADX INFO: renamed from: b */
    public final boolean f67740b;

    /* JADX INFO: renamed from: c */
    public final boolean f67741c;

    public C17509q(String str, boolean z4, boolean z13) {
        this.f67739a = str;
        this.f67740b = z4;
        this.f67741c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C17509q.class) {
            return false;
        }
        C17509q c17509q = (C17509q) obj;
        return TextUtils.equals(this.f67739a, c17509q.f67739a) && this.f67740b == c17509q.f67740b && this.f67741c == c17509q.f67741c;
    }

    public final int hashCode() {
        return ((AbstractC11266d.m30450d(31, 31, this.f67739a) + (this.f67740b ? 1231 : 1237)) * 31) + (this.f67741c ? 1231 : 1237);
    }
}
