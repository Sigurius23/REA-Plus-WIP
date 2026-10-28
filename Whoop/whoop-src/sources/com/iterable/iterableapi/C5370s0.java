package com.iterable.iterableapi;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.OrientationEventListener;
import p036bq.RunnableC3543b;

/* JADX INFO: renamed from: com.iterable.iterableapi.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5370s0 extends OrientationEventListener {

    /* JADX INFO: renamed from: a */
    public int f21823a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5379v0 f21824b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5370s0(C5379v0 c5379v0, Context context) {
        super(context, 3);
        this.f21824b = c5379v0;
        this.f21823a = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i13) {
        C5379v0 c5379v0 = this.f21824b;
        if (!c5379v0.f21872x || c5379v0.f21871w == null) {
            return;
        }
        int iFloor = i13 >= 0 ? ((i13 + 45) / 90) * 90 : (int) (Math.floor((((double) i13) + 45.0d) / 90.0d) * 90.0d);
        int i14 = this.f21823a;
        if (iFloor != i14 && i14 != -1) {
            this.f21823a = iFloor;
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3543b(this, 2), 1500L);
        } else if (i14 == -1) {
            this.f21823a = iFloor;
        }
    }
}
