package io.sentry.android.replay.screenshot;

import android.graphics.Canvas;
import android.graphics.Matrix;
import c93.InterfaceC4339a;
import io.sentry.android.replay.C20253w;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: io.sentry.android.replay.screenshot.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C20227g extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75978w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20228h f75979x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20227g(C20228h c20228h, int i13) {
        super(0);
        this.f75978w = i13;
        this.f75979x = c20228h;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f75978w) {
            case 0:
                Matrix matrix = new Matrix();
                C20253w c20253w = this.f75979x.f75982c;
                matrix.preScale(c20253w.f76071c, c20253w.f76072d);
                return matrix;
            default:
                return new Canvas(this.f75979x.f75986g);
        }
    }
}
