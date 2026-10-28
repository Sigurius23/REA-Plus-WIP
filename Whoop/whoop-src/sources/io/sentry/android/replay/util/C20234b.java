package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Paint;
import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: io.sentry.android.replay.util.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20234b extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: x */
    public static final C20234b f76016x;

    /* JADX INFO: renamed from: y */
    public static final C20234b f76017y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f76018w;

    static {
        int i13 = 0;
        f76016x = new C20234b(i13, 0);
        f76017y = new C20234b(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20234b(int i13, int i14) {
        super(i13);
        this.f76018w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f76018w) {
            case 0:
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            default:
                return new Paint();
        }
    }
}
