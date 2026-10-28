package io.sentry.android.replay.capture;

import io.sentry.android.replay.C20253w;
import io.sentry.protocol.C20501v;
import java.util.Date;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC20188d implements Runnable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C20253w f75847E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AbstractC22680m f75848F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ AbstractC20187c f75849G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75850w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f75851x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Date f75852y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C20501v f75853z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC20188d(C20190f c20190f, long j7, Date date, C20501v c20501v, C20253w c20253w, Function1 function1) {
        this.f75849G = c20190f;
        this.f75851x = j7;
        this.f75852y = date;
        this.f75853z = c20501v;
        this.f75847E = c20253w;
        this.f75848F = (AbstractC22680m) function1;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75850w) {
            case 0:
                C20190f c20190f = (C20190f) this.f75849G;
                int iM56107h = c20190f.m56107h();
                C20253w c20253w = this.f75847E;
                this.f75848F.invoke(AbstractC20187c.m56104f(c20190f, this.f75851x, this.f75852y, this.f75853z, iM56107h, c20253w.f76070b, c20253w.f76069a, c20253w.f76073e, c20253w.f76074f));
                break;
            default:
                C20199o c20199o = (C20199o) this.f75849G;
                int iM56107h2 = c20199o.m56107h();
                C20253w c20253w2 = this.f75847E;
                this.f75848F.invoke(AbstractC20187c.m56104f(c20199o, this.f75851x, this.f75852y, this.f75853z, iM56107h2, c20253w2.f76070b, c20253w2.f76069a, c20253w2.f76073e, c20253w2.f76074f));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC20188d(C20199o c20199o, long j7, Date date, C20501v c20501v, C20253w c20253w, Function1 function1) {
        this.f75849G = c20199o;
        this.f75851x = j7;
        this.f75852y = date;
        this.f75853z = c20501v;
        this.f75847E = c20253w;
        this.f75848F = (AbstractC22680m) function1;
    }
}
