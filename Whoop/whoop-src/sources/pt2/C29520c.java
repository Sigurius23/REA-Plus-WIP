package pt2;

import mt2.AbstractC25946g;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pt2.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C29520c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f120157w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f120158x;

    public /* synthetic */ C29520c(Function1 function1, int i13) {
        this.f120157w = i13;
        this.f120158x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f120157w) {
            case 0:
                return AbstractC29527i.m90242N(this.f120158x, (String) obj);
            case 1:
                return AbstractC29527i.m90244P(this.f120158x, ((Integer) obj).intValue());
            case 2:
                return AbstractC29527i.m90245Q(this.f120158x, (String) obj);
            case 3:
                return AbstractC29540v.m90452w0(this.f120158x, (AbstractC25946g) obj);
            case 4:
                return AbstractC29540v.m90410b0(this.f120158x, obj);
            case 5:
                return AbstractC29543y.m90463E(this.f120158x, obj);
            case 6:
                return AbstractC29519b0.m90224i(this.f120158x, (String) obj);
            case 7:
                return AbstractC29519b0.m90226k(this.f120158x, ((Integer) obj).intValue());
            default:
                return AbstractC29519b0.m90227l(this.f120158x, (String) obj);
        }
    }
}
