package p208i2;

import android.graphics.Bitmap;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C17885g {

    /* JADX INFO: renamed from: a */
    public final Bitmap f69577a;

    public C17885g(Bitmap bitmap) {
        this.f69577a = bitmap;
    }

    /* JADX INFO: renamed from: a */
    public final int m51442a() {
        Bitmap.Config config = this.f69577a.getConfig();
        AbstractC22676k.m65747g(config);
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }
}
