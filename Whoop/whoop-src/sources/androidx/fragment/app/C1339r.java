package androidx.fragment.app;

import p000.AbstractC11266d;

/* JADX INFO: renamed from: androidx.fragment.app.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1339r extends AbstractC1315l {

    /* JADX INFO: renamed from: b */
    public final Object f5779b;

    /* JADX INFO: renamed from: c */
    public final boolean f5780c;

    /* JADX INFO: renamed from: d */
    public final Object f5781d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1339r(C1334p2 c1334p2, boolean z4, boolean z13) {
        super(c1334p2);
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1334p2.f5751c;
        this.f5779b = c1334p2.f5749a == 2 ? z4 ? abstractComponentCallbacksC1320m0.getReenterTransition() : abstractComponentCallbacksC1320m0.getEnterTransition() : z4 ? abstractComponentCallbacksC1320m0.getReturnTransition() : abstractComponentCallbacksC1320m0.getExitTransition();
        this.f5780c = c1334p2.f5749a == 2 ? z4 ? abstractComponentCallbacksC1320m0.getAllowReturnTransitionOverlap() : abstractComponentCallbacksC1320m0.getAllowEnterTransitionOverlap() : true;
        this.f5781d = z13 ? z4 ? abstractComponentCallbacksC1320m0.getSharedElementReturnTransition() : abstractComponentCallbacksC1320m0.getSharedElementEnterTransition() : null;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1314k2 m4209b() {
        Object obj = this.f5779b;
        AbstractC1314k2 abstractC1314k2M4210c = m4210c(obj);
        Object obj2 = this.f5781d;
        AbstractC1314k2 abstractC1314k2M4210c2 = m4210c(obj2);
        if (abstractC1314k2M4210c == null || abstractC1314k2M4210c2 == null || abstractC1314k2M4210c == abstractC1314k2M4210c2) {
            return abstractC1314k2M4210c == null ? abstractC1314k2M4210c2 : abstractC1314k2M4210c;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f5663a.f5751c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC1314k2 m4210c(Object obj) {
        if (obj == null) {
            return null;
        }
        C1306i2 c1306i2 = AbstractC1286d2.f5586a;
        if (c1306i2.mo4093g(obj)) {
            return c1306i2;
        }
        AbstractC1314k2 abstractC1314k2 = AbstractC1286d2.f5587b;
        if (abstractC1314k2 != null && abstractC1314k2.mo4093g(obj)) {
            return abstractC1314k2;
        }
        StringBuilder sb4 = new StringBuilder("Transition ");
        sb4.append(obj);
        sb4.append(" for fragment ");
        throw new IllegalArgumentException(AbstractC11266d.m30463q(sb4, this.f5663a.f5751c, " is not a valid framework Transition or AndroidX Transition"));
    }
}
