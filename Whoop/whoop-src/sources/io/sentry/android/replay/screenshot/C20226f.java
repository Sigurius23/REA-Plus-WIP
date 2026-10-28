package io.sentry.android.replay.screenshot;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: io.sentry.android.replay.screenshot.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20226f extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public static final C20226f f75977w = new C20226f(0);

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        return paint;
    }
}
