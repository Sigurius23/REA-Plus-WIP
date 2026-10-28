package kr;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: kr.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C22789h implements InterfaceC22784c {

    /* JADX INFO: renamed from: a */
    public final float f89752a;

    public C22789h(float f13) {
        this.f89752a = f13;
    }

    @Override // kr.InterfaceC22784c
    /* JADX INFO: renamed from: a */
    public final float mo65993a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f89752a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22789h) && this.f89752a == ((C22789h) obj).f89752a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f89752a)});
    }
}
