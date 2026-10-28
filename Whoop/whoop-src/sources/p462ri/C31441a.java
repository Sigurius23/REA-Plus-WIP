package p462ri;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import dj.AbstractC12062g;

/* JADX INFO: renamed from: ri.a */
/* JADX INFO: loaded from: classes.dex */
public final class C31441a extends Paint {
    public C31441a(PorterDuff.Mode mode) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i13) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(AbstractC12062g.m33253c(i13));
        } else {
            setColor((AbstractC12062g.m33253c(i13) << 24) | (getColor() & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
