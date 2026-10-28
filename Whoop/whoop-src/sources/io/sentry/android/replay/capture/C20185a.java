package io.sentry.android.replay.capture;

import c93.InterfaceC4339a;
import io.sentry.android.replay.C20212k;
import io.sentry.android.replay.C20253w;
import java.util.Date;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20185a extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75822w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f75823x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f75824y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC20187c f75825z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20185a(Object obj, Object obj2, AbstractC20187c abstractC20187c, int i13) {
        super(0);
        this.f75822w = i13;
        this.f75823x = obj;
        this.f75824y = obj2;
        this.f75825z = abstractC20187c;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f75822w) {
            case 0:
                C20212k c20212k = this.f75825z.f75838h;
                if (c20212k != null) {
                    c20212k.m56138k("replay.id", String.valueOf(this.f75824y));
                }
                break;
            case 1:
                C20212k c20212k2 = this.f75825z.f75838h;
                if (c20212k2 != null) {
                    c20212k2.m56138k("segment.id", String.valueOf(this.f75824y));
                }
                break;
            case 2:
                C20212k c20212k3 = this.f75825z.f75838h;
                if (c20212k3 != null) {
                    c20212k3.m56138k("replay.type", String.valueOf(this.f75824y));
                }
                break;
            case 3:
                C20253w c20253w = (C20253w) this.f75824y;
                if (c20253w != null) {
                    AbstractC20187c abstractC20187c = this.f75825z;
                    C20212k c20212k4 = abstractC20187c.f75838h;
                    if (c20212k4 != null) {
                        c20212k4.m56138k("config.height", String.valueOf(c20253w.f76070b));
                    }
                    C20212k c20212k5 = abstractC20187c.f75838h;
                    if (c20212k5 != null) {
                        c20212k5.m56138k("config.width", String.valueOf(c20253w.f76069a));
                    }
                    C20212k c20212k6 = abstractC20187c.f75838h;
                    if (c20212k6 != null) {
                        c20212k6.m56138k("config.frame-rate", String.valueOf(c20253w.f76073e));
                    }
                    C20212k c20212k7 = abstractC20187c.f75838h;
                    if (c20212k7 != null) {
                        c20212k7.m56138k("config.bit-rate", String.valueOf(c20253w.f76074f));
                    }
                }
                break;
            case 4:
                Date date = (Date) this.f75824y;
                C20212k c20212k8 = this.f75825z.f75838h;
                if (c20212k8 != null) {
                    c20212k8.m56138k("segment.timestamp", date == null ? null : AbstractC21598x.m60667W(date));
                }
                break;
            default:
                C20212k c20212k9 = this.f75825z.f75838h;
                if (c20212k9 != null) {
                    c20212k9.m56138k("replay.screen-at-start", String.valueOf(this.f75824y));
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
