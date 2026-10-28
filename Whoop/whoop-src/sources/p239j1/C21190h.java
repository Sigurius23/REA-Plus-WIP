package p239j1;

import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p163g1.C15065l;
import p390p1.C28617g1;
import p602x1.C37816b;
import p715kotlin.jvm.internal.C22656a;

/* JADX INFO: renamed from: j1.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21190h extends C22656a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f80747w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21190h(int i13, Object obj, Class cls, String str, String str2, int i14, int i15) {
        super(i13, i14, cls, obj, str, str2);
        this.f80747w = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f80747w) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                C21194l c21194l = (C21194l) this.receiver;
                boolean zM59427b = c21194l.m59427b();
                C28617g1 c28617g1 = c21194l.f80761f;
                float f13 = 0.0f;
                if (!zM59427b) {
                    if (c21194l.m59426a() > c21194l.f80762g.m87022x()) {
                        ((InterfaceC4339a) c21194l.f80757b.getValue()).invoke();
                    }
                    AbstractC3006f0.m8732z(c21194l.f80756a, null, null, new C15065l(c21194l, f13, null, 3), 3);
                    if (c28617g1.m87022x() == 0.0f || fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    c28617g1.m87023y(0.0f);
                    f13 = fFloatValue;
                }
                return new Float(f13);
            default:
                ((C37816b) this.receiver).m121330a((Composer) obj, ((Number) obj2).intValue());
                return C23454a0.f92919a;
        }
    }
}
