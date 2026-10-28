package kh;

import android.graphics.Bitmap;
import java.util.Map;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kh.b */
/* JADX INFO: loaded from: classes.dex */
public final class C22468b {

    /* JADX INFO: renamed from: a */
    public final Bitmap f88018a;

    /* JADX INFO: renamed from: b */
    public final Map f88019b;

    public C22468b(Bitmap bitmap, Map map) {
        this.f88018a = bitmap;
        this.f88019b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22468b)) {
            return false;
        }
        C22468b c22468b = (C22468b) obj;
        return AbstractC22676k.m65745e(this.f88018a, c22468b.f88018a) && AbstractC22676k.m65745e(this.f88019b, c22468b.f88019b);
    }

    public final int hashCode() {
        return this.f88019b.hashCode() + (this.f88018a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Value(bitmap=");
        sb4.append(this.f88018a);
        sb4.append(", extras=");
        return AbstractC30802r.m94764m(sb4, this.f88019b, ')');
    }
}
