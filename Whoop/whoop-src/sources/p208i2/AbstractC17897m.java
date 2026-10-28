package p208i2;

import android.graphics.Path;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: i2.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17897m {
    /* JADX INFO: renamed from: a */
    public static final C17891j m51478a() {
        return new C17891j(new Path());
    }

    /* JADX INFO: renamed from: b */
    public static final Path.Direction m51479b(EnumC17908r0 enumC17908r0) {
        int iOrdinal = enumC17908r0.ordinal();
        if (iOrdinal == 0) {
            return Path.Direction.CCW;
        }
        if (iOrdinal == 1) {
            return Path.Direction.CW;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public static final void m51480c(String str) {
        throw new IllegalStateException(str);
    }
}
