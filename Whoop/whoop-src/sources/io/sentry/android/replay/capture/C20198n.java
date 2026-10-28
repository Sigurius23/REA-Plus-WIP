package io.sentry.android.replay.capture;

import io.sentry.C20337g0;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C20198n extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75868w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20199o f75869x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20198n(C20199o c20199o, int i13) {
        super(1);
        this.f75868w = i13;
        this.f75869x = c20199o;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f75868w) {
            case 0:
                AbstractC20195k segment = (AbstractC20195k) obj;
                AbstractC22676k.m65750j(segment, "segment");
                if (segment instanceof C20193i) {
                    C20193i c20193i = (C20193i) segment;
                    C20199o c20199o = this.f75869x;
                    c20193i.m56120a(c20199o.f75871s, new C20337g0());
                    c20199o.m56110k(c20199o.m56107h() + 1);
                    c20199o.m56112m(c20193i.f75861a.f76991U);
                }
                break;
            default:
                AbstractC20195k segment2 = (AbstractC20195k) obj;
                AbstractC22676k.m65750j(segment2, "segment");
                if (segment2 instanceof C20193i) {
                    C20199o c20199o2 = this.f75869x;
                    ((C20193i) segment2).m56120a(c20199o2.f75871s, new C20337g0());
                    c20199o2.m56110k(c20199o2.m56107h() + 1);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
