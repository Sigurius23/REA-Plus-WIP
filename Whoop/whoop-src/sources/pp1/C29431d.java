package pp1;

import np1.AbstractC27032j;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pp1.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C29431d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f119494w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC27032j.g f119495x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f119496y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f119497z;

    public /* synthetic */ C29431d(Function1 function1, AbstractC27032j.g gVar, Function1 function2) {
        this.f119496y = function1;
        this.f119495x = gVar;
        this.f119497z = function2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f119494w) {
            case 0:
                return AbstractC29436i.m89800v0(this.f119496y, this.f119495x, this.f119497z, (String) obj);
            default:
                return AbstractC29436i.m89804x0(this.f119495x, this.f119496y, this.f119497z, ((Integer) obj).intValue());
        }
    }

    public /* synthetic */ C29431d(AbstractC27032j.g gVar, Function1 function1, Function1 function2) {
        this.f119495x = gVar;
        this.f119496y = function1;
        this.f119497z = function2;
    }
}
