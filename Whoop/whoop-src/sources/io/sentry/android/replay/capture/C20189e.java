package io.sentry.android.replay.capture;

import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C20189e extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75854w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20190f f75855x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20189e(C20190f c20190f, int i13) {
        super(1);
        this.f75854w = i13;
        this.f75855x = c20190f;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f75854w) {
            case 0:
                AbstractC20195k segment = (AbstractC20195k) obj;
                AbstractC22676k.m65750j(segment, "segment");
                if (segment instanceof C20193i) {
                    C20190f c20190f = this.f75855x;
                    c20190f.f75860v.add(segment);
                    c20190f.m56110k(c20190f.m56107h() + 1);
                }
                break;
            default:
                AbstractC20195k segment2 = (AbstractC20195k) obj;
                AbstractC22676k.m65750j(segment2, "segment");
                if (segment2 instanceof C20193i) {
                    C20190f c20190f2 = this.f75855x;
                    c20190f2.f75860v.add(segment2);
                    c20190f2.m56110k(c20190f2.m56107h() + 1);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
