package kr;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: kr.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C22782a implements InterfaceC22784c {

    /* JADX INFO: renamed from: a */
    public final float f89705a;

    public C22782a(float f13) {
        this.f89705a = f13;
    }

    @Override // kr.InterfaceC22784c
    /* JADX INFO: renamed from: a */
    public final float mo65993a(RectF rectF) {
        return this.f89705a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22782a) && this.f89705a == ((C22782a) obj).f89705a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f89705a)});
    }
}
